(ns la-alfombra.roja-test
  (:require [clojure.test :refer :all]
            [la-alfombra.roja :refer :all]))

(deftest test-la-alfombra
  (testing "The rug declares with function snake-case"
    (is (= "You said: i_am_flying!" (la-alfombra "I am flying!")))))


(deftest test-color
  (testing "add a color to list"
           (is (= '("red") (color "red")))))

(deftest test-color-nil
  (testing "add a color to list"
           (is (= '("blue") (color-nil "blue")))))

(deftest test-color-nil
  (testing "add a color to list"
           (is (not= '("blue") (color-nil "dog")))))

