(ns resume.data
  (:require [clojure.string :as str]))

(defn header [] {:first-name "Damien"
                 :last-name "Frew"
                 :by-line "Software Engineer - B.Eng."
                 :email "damien.frew@gmail.com"
                 :based "Amsterdam"
                 :github "https://github.com/328d95"
                 :linkedin "https://www.linkedin.com/in/damien-frew/"})

(def applications {
                   :amazon            [:p.cover-letter
                                                    "Hi Ruby, hope you are having a great day. I am looking for an environment where scale and my peers will put my ability to learn quickly to the test. "
                                                    "I aim for technical excellence by promoting good processes but my priority is shipping business value with simple solutions. "
                                                    [:br] [:br]
                                                    "I look forward to having a conversation with you about the opportunities you have to offer at Amazon. "]
                   :flex-port-29-03-21             [:p.cover-letter
                                                    "Hello, my name is Damien, I am applying to Flexport because I want to join an environment where scale and my peers will put my ability to learn quickly to the test. "
                                                    "I aim for technical excellence by promoting good processes but my priority is shipping business value with simple solutions. "
                                                    [:br] [:br]
                                                    "I look forward to having a conversation with you about freight forwarding. "
                                                    [:br]
                                                    "Wishing you a lovely day."]
                   :uber-backend-engineer-28-03-21 [:p.cover-letter
                                                    "Hello, my name is Damien, I am applying to Uber because I want to join an environment where scale and my peers will challenge me to continually improve. "
                                                    "I aim for technical excellence by promoting good processes but my priority is shipping business value. "
                                                    [:br] [:br]
                                                    "I look forward to having a conversation with you about the Compliance Decision Portal team. "
                                                    [:br]
                                                    "Wishing you a lovely day."]
                   :farmer-connect                 [:p.cover-letter
                                                    "Hello, my name is Damien, I am a Software Engineer, and I am delighted to have found Farmer Connect. "
                                                    "Your mission to use technology to create empowering connections between farmers and consumers resonates with me. "
                                                    "Previous to my current position I revamped the technology at Alvéole, back then a start-up, that connects companies to nature by installing bee hives on their rooftops. "
                                                    "Although I love bees, my true fandom lies with " [:a {:href "https://youtu.be/MpKEdZjpqXM?t=29"} "\"weird coffee science\""] " so I appreciate the nuances of growing and processing coffee. "
                                                    "I especially understand the value of the connections you are making as my Nonni (grandparents) were orchardists in Perth, Australia. "
                                                    "Their hard work and perseverance was inspiring and its value showed in my Nonna's seed to bottle tomato sauce recipe. "
                                                    "Your approach to integrating cutting-edge technology, and in particular your pragmatic use of blockchain, makes me believe that your endeavour will continue to make real change. "
                                                    "I would be thrilled to contribute my skills in technology to help Farmer Connect continue to make a difference. "
                                                    "I look forward to speaking with you and I hope that you have a lovely day."]
                   :status-im                      [:p.cover-letter
                                                    "Hello, my name is Damien and I am very keen to join you in decentralising the internet. "
                                                    "I am sending my resume to you at Status because your working principles and technology choices resonate with me. "
                                                    "I would really like to join your efforts on web3 as I am impressed by all of your projects and I love that your focus is to open the web3 doors and to embrace decentralisation. "
                                                    "I would relish the opportunity to have a conversation with you to see how I can contribute to your mission. "
                                                    [:br]
                                                    "I hope you have a lovely day. "]
                   :general-crypto                 (fn [company-name] [:p.cover-letter
                                                                       "Hello, my name is Damien and I am very keen to join you in decentralising the internet. "
                                                                       (str/join ["I am sending my resume to you at " company-name " because your working principles and technology choices resonate with me. "])
                                                                       "I would really like to join your efforts on web3 as I am impressed by all of your projects and I love that your focus is to open the web3 doors and to embrace decentralisation. "
                                                                       "I would relish the opportunity to have a conversation with you to see how I can contribute to your mission. "
                                                                       [:br]
                                                                       "I hope you have a lovely day. "])})

; experience

(defn elsevier [] {:title        "Software Engineer III"
                   :organisation "Elsevier - Scopus"
                   :website      "https://www.scopus.com"
                   :city         "Amsterdam"
                   :country      "The Netherlands"
                   :start        "Feb 2020"
                   :finish       "Present"
                   :stack        '( "Typescript" "Scrum" "Javascript" "Webcomponents" "React" "Jest" "HTML+(S)CSS" "Git"  "Nxdev" "Java" "Storybook"  "Docker" "StencilJS")
                   :dots         '( "Implemented features on Scopus, a website with 4 million users, using webcomponent-wrapped React micro-frontends."
                                    "Collaborated with UX to implement a Storybook design library."
                                    "Implemented and applied a webcomponent mini-framework to 16 components in 3 weeks."
                                    "Mentored on front-end software engineering."
                                    ("Improved the developer experience:"
                                     "Empowered fellow developers by breaking down barriers for technical decision making."
                                     "Setup conventional commits and standard versioning.")
                                    ("Identified that over-granularity was complicating the frontend migration:"
                                      "Built temporary tooling to support granular webcomponents."
                                      "Proposed a monorepo solution which would allow us to develop native React components then share them via webcomponents later."
                                      )
                                    "Led an initiative on \"Development workflows for continuous delivery\"."
                                   )})

(defn alveole [] {:title "Full Stack Developer"
                  :organisation "Alvéole"
                  :website "https://www.alveole.buzz/"
                  :city "Montréal"
                  :country "Canada"
                  :start "Apr 2018"
                  :finish "Jan 2019"
                  :stack '( "Jest" "Scrum" "Javascript" "Node.js" "Mocha+Chai" "Mongodb" "AWS" "React" "JQuery" "HTML+CSS" "Git" "Cloudflare" "Digital Ocean")
                  :dots '("Developed applications that allowed Business Operations to install beehives in urban spaces."
                          ("Identified that the root cause of disconnection between Customer Support and Sales was that they were using different CRMs:"
                           "Gathered requirements for the CRM from the Operations Manager."
                            "Vetted Hubspot, the CRM that Sales were using, to ensure it would integrate with the codebase."
                           "Transitioned the Customer Support team before development was finished by writing scripts to generate importable data."
                           "Integrated the business applications with the HubSpot API.")
                          "Implemented a customer-facing workshop scheduling tool with a React front-end which accounted for driving time to already confirmed appointments."
                          "Interviewed developers to hire two developers as my replacement.")})

(defn compass [] {:title        "Full Stack Developer"
                  :organisation "Compass Education"
                  :website      "https://www.compass.education/"
                  :city         "Melbourne"
                  :country      "Australia"
                  :start        "Apr 2016"
                  :finish       "Sep 2016"
                  :stack        '("Kanban" "C#" "ASP.NET" "Javascript" "Ext.js" "Mongodb" "MS SQL" "HTML+CSS" "Linq" "SVN" )
                  :dots         '("Developed a school administration web application focusing on attendance records and content management."
                                   "Optimised attendance summary calculations by refactoring a C# process to a Linq-SQL query. Improved load time by ~3000%, from over one minute to two seconds."
                                   ("Identified, using Sentry, that the root cause of errors on many pages was a race condition in data store instantiation:"
                                     "Resolved the race conditions by replacing hand-written data retrieval with a new pattern in all pages removing 800 lines of JavaScript."
                                     "The new pattern allowed developers to declare data store dependencies which would then be fetched in parallel.")

                                   "Worked directly with business analysts to solve issues and rationalise requirements.")})

(defn icrar [] {:title "Final Year Project - Scalable Log Analysis"
                :organisation "ICRAR"
                :website "https://www.icrar.org/"
                :city "Perth"
                :country "Australia"
                :start "Mar 2015"
                :finish "Oct 2015"
                :stack '("Scala" "Apache Spark" "Regex" "AWS EC2" "Elasticsearch" "Kibana" "Git" )
                :dots '("Developed a scalable log parsing and analysis system to track accesses to a storage system for astronomy data."
                        "Conducted a literature review of the state-of-the-art in scalable data processing systems."
                        "Parsed and normalised 200GB of logs using Apache Spark script written in Scala."
                        "Optimised the memory footprint of the Spark script, by altering which data were cached."
                         "Configured page limits and ulimits to resolve memory conflicts of the AWS EC2 instance running both ElasticSearch and Spark."
                        "Reported to staff at the centre and to the staff and students of the University of Western Australia.")})

(defn shenton [] {:title "System Administrator / Full Stack Developer"
                  :organisation "Shenton College"
                  :website "https://www.shenton.wa.edu.au"
                  :city "Perth"
                  :country "Australia"
                  :start "May 2012"
                  :finish "Apr 2016"
                  :stack '("PHP" "CakePHP" "PHPUnit" "MySQL" "JQuery" "HTML+SCSS" "Bash" "Puppet" "Git" "VSphere")
                  :dots '("Developed and administered the intranet for the school's network and maintained the school website."
                          "Developed an interface for reporting and following-up on damage to school owned laptops."
                          "Automated the propagation of, via email and APIs, incidences of damage to relevant managers and to an external repair partner."
                          "Automated account provisioning, group creation and group assignment on Active Directory via LDAP."
                          "Administered Debian virtual servers for the school website and the school's intranet."
                          )})

; Education
(defn machine-learning [] {:title "Machine Learning Foundations: A Case Study Approach"
                           :organisation "Coursera"
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
                                 :organisation "Coursera"
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