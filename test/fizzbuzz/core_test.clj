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
               :else nil)
             (is-fizzy multiple-of-three)))
      (is (= (cond
               (= 0 (mod  non-multiple-of-three 3)) "fizz"
               :else nil)
             (is-fizzy non-multiple-of-three))))))

(deftest divisiblity-by-five
  (testing "buzz decider function"
    (let [multiple-of-five    10
          non-multiple-of-five 13]
      (is (= (cond
               (= 0 (mod multiple-of-five 5)) "buzz"
               :else nil)
             (is-buzzy multiple-of-five)))
      (is (= (cond
               (= 0 (mod  non-multiple-of-five 5)) "buzz"
               :else nil)
             (is-buzzy non-multiple-of-five))))))

(deftest fizzbuzz-game-implementation
  (with-redefs [println (fn ([to-print] to-print))]
    (is (= 1 (play-fizzbuzz 1)))
    (is (= "fizz" (play-fizzbuzz 3)))
    (is (= "buzz" (play-fizzbuzz 5)))
    (is (= "fizzbuzz" (play-fizzbuzz 15)))))
