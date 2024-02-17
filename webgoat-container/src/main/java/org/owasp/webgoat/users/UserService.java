package org.owasp.webgoat.users;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author nbaars
 * @since 3/19/17.
 */
@Service
@AllArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;
    private final UserTrackerRepository userTrackerRepository;

    @Override
    public WebGoatUser loadUserByUsername(String username) throws UsernameNotFoundException {
        WebGoatUser webGoatUser = userRepository.findByUsername(username);
        if (webGoatUser == null) {
            throw new UsernameNotFoundException("User not found");
        } else {
            webGoatUser.createUser();
        }
        return webGoatUser;
    }

    public void addUser(String username, String password) {
        //get user if there exists one by the name
        WebGoatUser webGoatUser = userRepository.findByUsername(username);
        //if user exists it will be updated, otherwise created
        userRepository.save(new WebGoatUser(username, password));
        //if user previously existed it will not get another tracker
        if (webGoatUser == null) {
            userTrackerRepository.save(new UserTracker(username));
        }
    }

    public void addUser(String username, String password, String role) {
        //get user if there exists one by the name
        WebGoatUser webGoatUser = userRepository.findByUsername(username);
        //if user exists it will be updated, otherwise created
        userRepository.save(new WebGoatUser(username, password, role));
        //if user previously existed it will not get another tracker
        if (webGoatUser == null) {
            userTrackerRepository.save(new UserTracker(username));
        }
    }

    public List<WebGoatUser> getAllUsers() {
        return userRepository.findAll();
    }

}
