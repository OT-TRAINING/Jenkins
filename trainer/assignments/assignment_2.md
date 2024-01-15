Assignment 2:
Topics Covered:  (User Authentication, User Authorization)
     Assignment on Authentication and Authorization
        Their is an organization which has 3 teams
            - Developer
            - Devops
            - Testing
        First you need to create 9 dummy jenkins jobs.Each job will print their jobname, build number.
            For Developer create 3 dummy jobs.In developer view
                job1:- dev-1
                job2:- dev-2
                job3:- dev-3
            For Testing create 3 dummy jobs. In testing view
                job1:- test-1
                job2:- test-2
                job3:- test-3
            For Devops create 3 dummy jobs. In devops view
                job1:- devops-1
                job2:- devops-2
                job3:- devops-3
        Users in each team: 
            developer: [ They can see only dev jobs, can build it, see workspace and configure it ]
                - developer-1 
                - developer-2 
            testing: [ They can see all test jobs ,can build it, see workspace and can configure it, | They can also view dev jobs ]
                - testing-1 
                - testing-2 
            devops:  [ They can see all devops jobs ,can build it, see workspace and can configure it, | They can also view dev and test jobs  ]
                - devops-1 
                - devops-2
            admin
                -  admin-1 [ It will have full access ]
        See what Authorization strategy suits it and implement it.
        Also go through all authorization strategy
        Legacy mode
        Project Based
        Matrix Based
        Role-Based
        Point 2:-
        Enable SSO with Goggle