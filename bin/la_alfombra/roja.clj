(ns la-alfombra.roja
  (:require [camel-snake-kebab.core :as csk]))

(defn la-alfombra [input]
  (str "You said: "
       (csk/->snake_case input)))


(defn color [input]
  (println input))

