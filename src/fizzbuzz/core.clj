(ns fizzbuzz.core
  (:gen-class))

(defn -main
  [& args]
  )

(defn is-fizzy [number]
  (cond
    (= 0 (mod number 3)) "fizz"
    :else ""))

(defn is-buzzy [number]
  (cond
    (= 0 (mod number 5)) "buzz"
    :else ""))
