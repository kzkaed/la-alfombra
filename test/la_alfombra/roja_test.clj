(ns la-alfombra.roja-test
  (:require [clojure.test :refer :all]
            [la-alfombra.roja :refer :all]))

(deftest test-la-alfombra
  (testing "The rug declares with function snake-case"
    (is (= "You said: i_am_flying!" (la-alfombra "I am flying!")))))
