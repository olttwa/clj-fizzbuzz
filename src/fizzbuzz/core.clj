(ns fizzbuzz.core
  (:gen-class)
  (require [clojure.string :as str]))

(defn is-fizzy [number]
  (cond
    (= 0 (mod number 3)) "fizz"
    :else nil))

(defn is-buzzy [number]
  (cond
    (= 0 (mod number 5)) "buzz"
    :else nil))

(defn play-fizzbuzz
  ([]
   (play-fizzbuzz 100))
  ([number]
   (if (> number 1)
     (play-fizzbuzz (- number 1)))
   (let [response (str (is-fizzy number) (is-buzzy number))]
     (-> response
         (str/blank?)
         (if number response)
         (println)))))

(defn -main
  [& args]
  (play-fizzbuzz))
