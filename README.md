# SSDLC (Secure Software Development Life Cycle) 

<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->


DevOps combines cultural philosophies, practices, and tools that combine software development with information technology operations. These combined practices enable companies to deliver new application features and improved services to customers at a higher velocity

Security testing is often treated as an ‘after the process’ necessity. This leaves the ongoing operations defenseless to malicious attacks. 
Application security testing is done after the software delivery. With this approach security defects are found at the last stage, and it's a very expensive and time consuming process to eliminate those defects. In that case security as a part of the process is the only way to ensure safety. 

### SSDLC is the ideology to integrate security practices into the software development life cycle and create security as a code culture.

Advantages of SSDLC:
 * Early identification of vulnerabilities in code during development
 * Greater flexibility in managing sudden changes during the development lifecycle

### Integrate Security checks into the Jenkins pipeline 

To implement the SSDLC pipeline we are using java based vulnerable WebGoat application. We are injection the following security checks into Jenkins pipeline.

  * Secret Scanning
  * SCA (Source composition analysis)
  * SAST (Static Application Security Testing)
  * DAST (Dynamic Application Security Testing)

![case_study_image](https://raw.githubusercontent.com/gaikwad-kunal/SSDLC/main/SSDLC_Case_study.JPG)

## Secure Development Processes

* [DevSecOps Guidlines](https://owasp.org/www-project-devsecops-guideline/)
* [OWASP secure coding practices](https://www.owasp.org/images/0/08/OWASP_SCP_Quick_Reference_Guide_v2.pdf)
* [Java-SE](https://www.oracle.com/java/technologies/javase/seccodeguide.html) - Secure Coding Guidelines for Java SE

## Awareness of Security Risks

* [OWASP Top 10](https://owasp.org/www-project-top-ten/) - Top 10 security risks from OWASP 

# Tools and Resources

## Secret Scanning

Searches through git repositories for secrets, digging deep into commit history and branches. This is effective at finding secrets accidentally committed 

* [TruffelHog](https://github.com/trufflesecurity/truffleHog)

## SCA (Source composition analysis)

Software Composition Analysis (SCA) tools find common open source libraries and components used in application, Compare findings to a list of known vulnerabilities (e.g., Common Vulnerabilities and Exposures, or CVEs) and determine whether components have known and documented vulnerabilities, are out of date, and have patches available

* [OWASP Dependancy Check](https://github.com/jeremylong/DependencyCheck)

## SAST (Static Application Security Testing)

SAST tools analyze source code to look for security issues in an application during a non-running state and are supported by a large number of languages. They usually have quite a high false positive rate, due to the fact they cannot track data through an app, instead using a bit of guesswork to determine if flaws exist.

* [SonarQube](https://www.sonarqube.org/) 

## DAST (Dynamic Application Security Testing)

DAST tools run automated penetration testing scans against a running service as a blackbox. It tries to hack into the service using well known vulnerabilities, however scans can take a while due to the vast number, as well as crawling services to find all the endpoints.

* [OWASP ZAP](https://github.com/zaproxy/zaproxy)

# WebGoat 8: A deliberately insecure Web Application

[![Build Status](https://travis-ci.org/WebGoat/WebGoat.svg?branch=develop)](https://travis-ci.org/WebGoat/WebGoat)
[![Coverage Status](https://coveralls.io/repos/WebGoat/WebGoat/badge.svg?branch=develop&service=github)](https://coveralls.io/github/WebGoat/WebGoat?branch=master)
[![Codacy Badge](https://api.codacy.com/project/badge/b69ee3a86e3b4afcaf993f210fccfb1d)](https://www.codacy.com/app/dm/WebGoat)
[![OWASP Labs](https://img.shields.io/badge/owasp-lab%20project-f7b73c.svg)](https://www.owasp.org/index.php/OWASP_Project_Inventory#tab=Labs_Projects)
[![GitHub release](https://img.shields.io/github/release/WebGoat/WebGoat.svg)](https://github.com/WebGoat/WebGoat/releases/latest)

# Introduction

WebGoat is a deliberately insecure web application maintained by [OWASP](http://www.owasp.org/) designed to teach web
application security lessons.

This program is a demonstration of common server-side application flaws. The
exercises are intended to be used by people to learn about application security and
penetration testing techniques.

**WARNING 1:** *While running this program your machine will be extremely
vulnerable to attack. You should disconnect from the Internet while using
this program.*  WebGoat's default configuration binds to localhost to minimize
the exposure.

**WARNING 2:** *This program is for educational purposes only. If you attempt
these techniques without authorization, you are very likely to get caught. If
you are caught engaging in unauthorized hacking, most companies will fire you.
Claiming that you were doing security research will not work as that is the
first thing that all hackers claim.*

### Prerequisites:

* Java 11
* Maven > 3.2.1
* Your favorite IDE
* Git, or Git support in your IDE
* Jenkins
* Sonarqube
* Zap proxy
* Dependency check

