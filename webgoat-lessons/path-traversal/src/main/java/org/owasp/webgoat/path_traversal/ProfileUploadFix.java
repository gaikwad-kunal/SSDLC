package org.owasp.webgoat.path_traversal;

import org.owasp.webgoat.assignments.AssignmentHints;
import org.owasp.webgoat.assignments.AttackResult;
import org.owasp.webgoat.session.WebSession;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import static org.springframework.http.MediaType.ALL_VALUE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@AssignmentHints({"path-traversal-profile-fix.hint1", "path-traversal-profile-fix.hint2", "path-traversal-profile-fix.hint3"})
public class ProfileUploadFix extends ProfileUploadBase {

    public ProfileUploadFix(@Value("${webgoat.server.directory}") String webGoatHomeDirectory, WebSession webSession) {
        super(webGoatHomeDirectory, webSession);
    }

    @PostMapping(value = "/PathTraversal/profile-upload-fix", consumes = ALL_VALUE, produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public AttackResult uploadFileHandler(
            @RequestParam("uploadedFileFix") MultipartFile file,
            @RequestParam(value = "fullNameFix", required = false) String fullName) {
        return super.execute(file, fullName != null ? fullName.replace("../", "") : "");
    }

    @GetMapping("/PathTraversal/profile-picture-fix")
    @ResponseBody
    public ResponseEntity<?> getProfilePicture() {
        return super.getProfilePicture();
    }
}
