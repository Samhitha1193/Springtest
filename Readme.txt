Steps you have to follow for the Feature you choose:
    Oracle: 
        1.	Ojdbc jar file has been provided to you under Library folder in your project structure. 
        2.	Please follow the following steps to add the jar file to your classpath:
                a.	Right click on your Springboot project. 
                b.	Select “Build Path” 
                c.	Select “Configure Build Path” 
                d.	Select “Java Build Path”  
                e.	Select “Libraries” 
                f.	Click on “Add Jars” 
                g.	Select your Project, Go to “lib” folder 
                h.	Select Ojdbc jar file 
                i.	click “Ok”  
                j.	Click on “Apply and Close”. 
        3.	After implementing Step-2, Ojdbc jar file will be successfully add to your project under Referenced Libraries folder in your project structure.

    Jenkins: 
        1.	Open “Jenkins” File which is under the “shared” folder in your project structure. 
        2.	Please find the following command in your Jenkins file and add your PCF credentials i. e., username and password instead of <username> and <password> respectively.
                 “sh 'cf login -a http://api.run.pivotal.io -u <username> -p <password>'”
        3.	Enter your organization name and space name in which you would like to host your application in PCF instead of <org-name> and <space-name> in the following command in “Jenkins File”. 
                 “sh 'cf target -o <org-name> -s <space-name>'”
        4.	Please follow the following steps after logging into your Jenkins to build pipeline.
                a.	Login into Your Jenkins 
                b.	Select “New Item” 
                c.	Enter an Item Name 
                d.	Select “Pipeline” 
                e.	Click “Ok”.  
                f.	Select “Advanced Project Options” and go to Pipeline section  
                g.	In Pipeline Section, Select: 
                        i.	 “Pipeline script from SCM” in Definition 
                        ii.	“Git” in SCM 
                        iii. Under Repositories: Give your application Git repository link in  Repository_URL.  
                        iv.	Under Branches to Build: Give “*/master” as Branch Specifier 
                        v.	Click on “APPLY”.
                 
        h.	Select “Build now” in order to build your pipeline.
        
    Docker: 
        1.	Make sure Docker is up and Running in your Local machine.  

 
