(ns la-alfombra.roja
  (:require [camel-snake-kebab.core :as csk]))

(defn la-alfombra [input]
  (str "You said: "
       (csk/->snake_case input)))


(defn color [input]
  (cons input '()))

(defn color-nil [input]
  (cons input nil))

(not nil)

(def who-atom (atom :caterpiller))
(reset! la-alfombra.roja/who-atom :chrysalis)

(defn change [state]
  (case state
    :caterpiller :chrysalis
    :chrysalis :butterfly
    :butterfly))

(def counter (atom 0))
(dotimes [_ 5] (swap! counter inc))
  
(let [n 5]
  (future (dotimes [_ n] (swap! counter inc)))
  (future (dotimes [_ n] (swap! counter inc)))
  (future (dotimes [_ n] (swap! counter inc))))

(defn build [x]
 (cons x (cons x nil)))
