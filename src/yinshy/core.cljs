(ns yinshy.core
  (:require [reagent.core :as r]
            [yinshy.components.header :refer [header]]
            [yinshy.components.body :refer [body]]
            [yinshy.components.footer :refer [footer]]))

(defn app
  []
  [:div.container
   [header]
   [body]
   [footer]])

(defn ^:export main
  []
  (r/render
    [app]
    (.getElementById js/document "app")))
