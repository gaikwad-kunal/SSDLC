# DevSecOps 

<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->


DevOps is a combination of cultural philosophies, practices, and tools that combine software development with information technology operations. These combined practices enable companies to deliver new application features and improved services to customers at a higher velocity

Security testing is often treated as an ‘after the process’ necessity. This leaves the ongoing operations defenseless to malicious attacks. 
Application security testing is done after the software delivery. With this approach security defects are found at the last stage, and it's very expensie and time consuming process to eliminate those defects. In that case security as a part of process is the only only way to ensure safety. 

### DevSecOps is the ideology to integrate security practices into the software devlopment life cycle, create security as code culture.

Advantages of DevSecOps:
 * Early identification of vulnerabilities in code during development
 * Greater flexibility in managing sudden changes during the development lifecycle

### Integrate Security checks into jenkins pipeline 

To implement devsecops pipeline we are using java based vulnerable WebGoat application. We are injectiong following security checks into jenkins pipeline.

  * Pre-commit hooks
  * Secret Scanning
  * SCA (Source composition analysis)
  * SAST (Static Application Security Testing)
  * DAST (Dynamic Application Security Testing)
  * Security monitoring and infrastructure misconfigurations
  * Vulnerability assessment
  * Vulnerability management

![start_caQtDM_7id.sh](https://github.com/Suyashk96/webGoat_java/blob/master/scripts/DevSecOps_case_study%20(1).jpg)

## Secure Development Processes

* [DevSecOps Guidlines](https://owasp.org/www-project-devsecops-guideline/)
* [OWASP secure coding practices](https://www.owasp.org/images/0/08/OWASP_SCP_Quick_Reference_Guide_v2.pdf)
* [Java-SE](https://www.oracle.com/java/technologies/javase/seccodeguide.html) - Secure Coding Guidelines for Java SE

## Awareness of Security Risks

* [OWASP Top 10](https://owasp.org/www-project-top-ten/) - Top 10 security risks from OWASP 

# Tools and Resources

## Pre-commit or Pre-push hooks

Prevents developer from commiting senstitive information such as SSH keys, API keys, passwords, AWS keys. It validates the outgoing changeset for things that look suspicious.

* [Tailsman](https://github.com/thoughtworks/talisman)

## Secret Scanning

Searches through git repositories for secrets, digging deep into commit history and branches. This is effective at finding secrets accidentally committed 

* [TruffelHog](https://github.com/trufflesecurity/truffleHog)

## SCA (Source composition analysis)

Software Composition Analysis (SCA) tools find common open source libraries and components used in application, Compare findings to a list of known vulnerabilities (e.g., Common Vulnerabilities and Exposures, or CVEs) and determine whether components have known and documented vulnerabilities, are out of date, and have patches available

* [OWASP Dependancy Check](https://github.com/jeremylong/DependencyCheck)

## SAST (Static Application Security Testing)

SAST tools analyse source code to look for security issues in an application during non-running state, and are supported by a large number of languages. They usually have quite a high false positive rate, due to the fact they cannot track data through an app, instead using a bit of guesswork to determine if flaws exist.

* [SonarQube](https://www.sonarqube.org/) 

## DAST (Dynamic Application Security Testing)

DAST tools run automated penetration testing scans against a running service as a blackbox. It tries to hack into the service using well known vulnerabilities, however scans can take a while due to the vast number, as well as crawling services to find all the endpoints.

* [OWASP ZAP](https://github.com/zaproxy/zaproxy)

## Security monitoring and infrastructure misconfigurations

Continuously scan your AWS accounts for configuration errors using various security standards and roll up security check results at the account and multi-account level to understand your overall security state.

AWS Security Hub collects and consolidates findings from AWS security services enabled in your environment, such as intrusion detection findings from Amazon GuardDuty, vulnerability scans from Amazon Inspector, and S3 bucket policy findings from Amazon Macie.

* [AWS Security Hub](https://aws.amazon.com/security-hub/?aws-security-hub-blogs.sort-by=item.additionalFields.createdDate&aws-security-hub-blogs.sort-order=desc)

## Vulnerability assessment tool

The vulnerability assessment tool scans the underlying infrastructure, it runs tests against client computers using a database of known exploits and weaknesses. It looks for host, os level vulnerabilities. 

* [OpenVas](https://github.com/greenbone/openvas-scanner)


## Vulnerability management tool 

Vulnerability management tool allows you to manage your application security program, maintain product and application information, triage vulnerabilities and push findings into defect trackers. Consolidate your findings

* [DefectDojo](https://github.com/DefectDojo/django-DefectDojo)

