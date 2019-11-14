(ns resume.data)

(defn header [] {:first-name "Damien"
                 :last-name "Frew"
                 :by-line "B.Eng. Software Engineering"
                 :email "damien.frew@gmail.com"
                 :github "https://github.com/328d95"})

; experience

(defn alveole [] {:title "Full Stack Developer"
                  :organisation "Alvéole"
                  :website "https://www.alveole.buzz/"
                  :city "Montréal"
                  :country "Canada"
                  :start "2018"
                  :finish "2019"
                  :stack '("Javascript" "Node.js" "Mocha+Chai" "Mongodb" "AWS S3" "React" "JQuery" "HTML+CSS" "Git" "VSCode")
                  :dots '("Maintained and developed a web application that handled scheduling, data collection and client relationship management for a company that installs beehives in urban spaces."
                          ("Transitioned the company to a new CRM experience by integrating the existing code base with HubSpot CRM:"
                           "Liaised with the operations manager and ran scripts over the code bases to determine which database fields were necessary."
                           "Wrote scripts to generate CSVs for one time syncs to HubSpot to expedite the team’s transition."
                           "Retrieved and posted data to and from HubSpot using their rate-limited REST API."
                           "Wrote and scheduled scripts to sync clients, services, available products and purchased products from HubSpot.")
                          "Built a customer-facing workshop scheduling tool with a React front-end which accounted for driving time to already confirmed appointments."
                          "Participated in the organisation, and completion, of tasks using Jira and Scrum.")})

(defn compass [] {:title "Full Stack Developer"
                  :organisation "Compass Education"
                  :website "https://www.compass.education/"
                  :city "Melbourne"
                  :country "Australia"
                  :start "2016"
                  :finish "2016"
                  :stack '("C#" "ASP.NET" "Javascript" "Ext.js" "Mongodb" "MS SQL" "HTML+CSS" "Linq" "SVN" "Visual Studio")
                  :dots '("Worked in a team to develop and maintain a school administration web application. The application handled attendance records, content management, behavioural data and excursion management."
                          "Optimised attendance summary calculations by refactoring a C# process to a Linq-SQL query. Improved load time by ~3000%, from over one minute to two seconds."
                          "Removed 800 lines of JavaScript by recognising a replaceable pattern for instantiating data stores in Ext.js. The new pattern allowed callback data dependencies to be declarative while maintaining parallel data retrieval."
                          "Worked directly with business analysts to solve issues and rationalise requirements.")})

(defn icrar [] {:title "Final Year Project - Scalable Log Analysis"
                :organisation "ICRAR"
                :website "https://www.icrar.org/"
                :city "Perth"
                :country "Australia"
                :start "2015"
                :finish "2015"
                :stack '("Scala" "Apache Spark" "Regex" "AWS EC2" "Elasticsearch" "Kibana" "Git" "Vim")
                :dots '("Implemented a scalable log parsing and analysis system to track accesses to a storage system for astronomical image data. Visualised the accesses using Kibana."
                        "Conducted a literature review of the state-of-the-art in scalable data processing systems."
                        "Wrote an Apache Spark log parsing script in Scala that flattened the relational data in the logs. Used the script to parse 200GB of logs."
                        "Configured an AWS EC2 instance to run both ElasticSearch and Spark by altering page limits and ulimits to resolve memory conflicts."
                        "Memory optimised the Spark script, by altering which data were cached, so that it could run alongside ElasticSearch."
                        "Reported to staff at the centre and to the staff and students of the University of Western Australia.")})

(defn shenton [] {:title "System Administrator / Full Stack Developer"
                  :organisation "Shenton College"
                  :website "https://www.shenton.wa.edu.au"
                  :city "Perth"
                  :country "Australia"
                  :start "2012"
                  :finish "2016"
                  :stack '("PHP" "CakePHP" "PHPUnit" "MySQL" "JQuery" "HTML+SCSS" "Bash" "Puppet" "Git" "Vsphere" "Vim" "Eclipse")
                  :dots '("Developed an internal management system, managed Linux server administration, managed the school website and solved technical issues for staff and students."
                          "Developed an interface for reporting and following-up on damage to school owned laptops."
                          "Automated the propagation of, via email and APIs, incidences of damage to relevant managers and to an external repair partner."
                          "Automated account provisioning, group creation and group assignment on Active Directory via LDAP."
                          "Created Puppet server configurations for Debian virtual servers."
                          "Used a self managed GitLab installation for version control.")})

; Education
(defn machine-learning [] {:title "Machine Learning Foundations: A Case Study Approach"
                           :organisation "University of Washington"
                           :website "https://www.coursera.org/account/accomplishments/certificate/ZNX3XCGN9AQQ"
                           :link-text "Coursera Certificate"
                           :city "Coursera"
                           :country "Online"
                           :start "2017"
                           :finish "2017"
                           :stack '("Python" "Jupyter" "GraphLab")
                           :dots '("Learned about machine learning models by completing Jupyter notebooks."
                                   "Studied clustering, classification, recommenders, regression and deep learning.")})

(defn functional-programming [] {:title "Functional Programming Principles in Scala"
                                 :organisation "École Polytechnique Fédérale de Lausanne"
                                 :website "https://www.coursera.org/account/accomplishments/certificate/DCR46T8RAM9D"
                                 :link-text "Coursera Certificate"
                                 :city "Coursera"
                                 :country "Online"
                                 :start "2016"
                                 :finish "2016"
                                 :stack '("Scala" "IntelliJ")
                                 :dots '("Learned about functional programming principles and the Scala language."
                                         "Dove in depth into recursion and tail optimisation.")})

(defn uwa [] {:title "Bachelor of Engineering, Software Engineering"
              :organisation "University of Western Australia"
              :city "Perth"
              :country "Australia"
              :website "https://www.uwa.edu.au"
              :start "2010"
              :finish "2016"
              :stack '("Java" "Eclipse" "JUnit" "C" "Ruby" "HTML" "CSS" "Git" "MySQL" "Weka" "Vim")
              :dots '("Developed a broad base of education by studying a general engineering degree which included classical engineering units, with a specialisation in Computer Science."
                      "Studied various topics including: databases, calculus, probability, AI, high performance computing, project management (agile, spiral, waterfall, PMBOK, ethics), software engineering management, data warehousing and analysis, networking, object oriented programming with Java, UX design, civil engineering, electrical engineering and mechanical engineering.")})