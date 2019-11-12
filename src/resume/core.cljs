(ns resume.core
  [:require [reagent.core :as r]
            [resume.layout :as layout]])

(r/render-component [layout/all]
 (js/document.getElementById "app"))