(ns yinshy.state
  (:require [reagent.core :as r]))

(def games (r/atom {
                     :players []
                     :counter 0}))
