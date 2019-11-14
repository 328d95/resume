(ns resume.layout
  [:require [resume.data :as data]])

(def bullet " • ")

(defn dot-line [dot]
  (cond
    (coll? dot) [:div.dot
                 bullet " " (first dot)
                 (for [d (rest dot)] (dot-line d))]
    :else [:div.dot bullet " " dot]))

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
    [:h3 title]
    [:h4 "@ " organisation [:br] [:a {:href website} (if link-text link-text website)]]]
   [:div.right
    [:p.location city [:br] country]
    [:h4.dates start " / " finish]]
   [:div.left
    [:div.dots (for [dot dots] (dot-line dot))]]
   [:div.right
    [:p.stack (for [s (sort-by count stack)] [:p s])]]])

(defn header [{first-name :first-name
               last-name :last-name
               by-line :by-line
               email :email
               github :github}]
  [:div.header
   [:h1 first-name " " last-name]
   [:h4 by-line]
   [:span 
    [:a {:href (str "mailto:" email)} email] 
    " "
    [:a {:href github} github]]
   [:hr]])

(defn all [] 
  [:div#resume
   (header (data/header))
   [:div.experience
    (section (data/alveole))
    (section (data/compass))
    (section (data/shenton))]
    (section (data/icrar))
    (section (data/machine-learning))
    (section (data/uwa))
    (section (data/functional-programming))])