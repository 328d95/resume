(ns resume.layout
  [:require [resume.data :as data]])

(def bullet " • ")

(defn dot-line [dot]
  (cond
    (coll? dot) [:div.dot
                 bullet " " (first dot)
                 (for [d (rest dot)] (dot-line d))]
    :else [:div.dot bullet " " dot]))

(defn experience-section [{title :title
                           website :website
                           dots :dots
                           company :company
                           stack :stack
                           start :start
                           finish :finish
                           city :city
                           country :country}]

  [:div.section
    [:div.position
     [:div
      [:h3 title]
      [:h4 "@ " company [:br] [:a {:href website} website]]]
     [:div
      [:p.location city [:br] country]
      [:h4.dates start " / " finish]]]
   [:div.left
    [:div.dots (for [dot dots] (dot-line dot))]]
   [:div.right
    [:p.stack (for [s (sort-by count stack)] [:p s])]]])

(defn all [] 
  [:div#resume
   (experience-section (data/alveole))
   (experience-section (data/compass))
   (experience-section (data/icrar))
   (experience-section (data/shenton))])