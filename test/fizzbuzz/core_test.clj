(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(comment use generative testing to replace duplication)

(deftest divisiblity-by-three
  (testing "fizz decider function"
    (let [multiple-of-three    12
          non-multiple-of-three 13]
      (is (= (cond
               (= 0 (mod multiple-of-three 3)) "fizz"
               :else "")
             (is-fizzy multiple-of-three)))
      (is (= (cond
               (= 0 (mod  non-multiple-of-three 3)) "fizz"
               :else "")
             (is-fizzy non-multiple-of-three))))))

(deftest divisiblity-by-five
  (testing "buzz decider function"
    (let [multiple-of-five    10
          non-multiple-of-five 13]
      (is (= (cond
               (= 0 (mod multiple-of-five 5)) "buzz"
               :else "")
             (is-buzzy multiple-of-five)))
      (is (= (cond
               (= 0 (mod  non-multiple-of-five 5)) "buzz"
               :else "")
             (is-buzzy non-multiple-of-five))))))
