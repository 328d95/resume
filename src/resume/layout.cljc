(ns resume.layout
  [:require [resume.data :as data]])

(defn dot-line
  ([dot]
   (cond
     (coll? dot) [:div.dot {:key (hash dot)}
                  (first dot)
                  (for [d (rest dot)] (dot-line d))]
     :else [:div.dot {:key (hash dot)} dot])))

(defn section [{title :title
                website :website
                link-text :link-text
                dots :dots
                organisation :organisation
                stack :stack :or {stack '()}
                start :start
                finish :finish
                city :city
                country :country}]

  [:div.section
   [:div.left
    [:h3.position title]
    [:h4.organisation "@ " organisation [:br] [:a {:href website} (if link-text link-text website)]]]
   [:div.right
    [:p.location city [:br] country]
    [:h4.dates start  [:br] "- " finish]]
   [:div.left
    [:div.dots (for [dot dots] (dot-line dot))]]
   [:div.right
    [:div.stack.tech (for [s (sort-by count stack)] [:p {:key (hash s)} s])]]])

(defn header [{first-name :first-name
               last-name :last-name
               by-line :by-line
               email :email
               github :github
               linkedin :linkedin
               based :based}]
  [:div.header
   [:h1.name-title first-name " " last-name " / " [:span.smaller by-line] " / " [:span.smaller based] ]
   [:span
    [:a {:href github} "github" ] " " [:a {:href (str "mailto:" email)} email]
    " "
    [:a {:href linkedin} "linkedin"]]
   (:amazon data/applications)
   [:hr]
])

(defn all [] 
  [:div#resume
   (header (data/header))
   [:div.experience
    (section (data/elsevier))
    (section (data/alveole))
    (section (data/compass))
    (section (data/shenton))]
    (section (data/icrar))
    ])