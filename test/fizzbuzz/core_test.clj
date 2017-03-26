(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest divisiblity-by-three
  (testing "fizz decider function"
    (let [multiple-of-three    12
          non-mutiple-of-three 13]
      (is (= (cond
               (= 0 (mod multiple-of-three 3)) "fizz"
               :else "")
             (is-fizzy multiple-of-three)))
      (is (= (cond
               (= 0 (mod  non-mutiple-of-three 3)) "fizz"
               :else "")
             (is-fizzy  non-mutiple-of-three))))))
