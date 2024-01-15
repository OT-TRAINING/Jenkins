Assignment 03:
Perform CI checks on three Repositories using Jenkins, store reports, manage artifacts, set up failure notifications, and automate the process using DSL job.

API Repositories:

- Python:- https://github.com/OT-MICROSERVICES/attendance-api
- GoLang:- https://github.com/OT-MICROSERVICES/employee-api
- Java:- https://github.com/OT-MICROSERVICES/salary-api

Jenkins Freestyle Jobs:
Create separate jobs for each check.
Configure to pull repositories from GitHub.
- Implement Generic & Advance CI Checks (eg: Credential Scanning, Unit Testing, Code Coverage, Dependency etc.)
- Store and access reports within Jenkins.
- Choose local or remote storage for artifact.
- Configure email, Slack, or Telegram notifications on CI check failures.
Now,Implement a DSL job to automate the entire process for CI checks on all APIs.