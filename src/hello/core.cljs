(ns hello.core
  (:require [reagent.core :as reagent]
            ))

(defn mount-root []
  (reagent/render [:h1 "hello, world"]
                  (.getElementById js/document "app")))

;; can't remember if this works or is even necessary
(defn ^:export init []
(mount-root))
