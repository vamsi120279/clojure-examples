;; partial take function
(defn takeN [n] (partial take n))

;; Finding nth element in an array using composition
(defn nth [arr n]
  ((comp last (takeN (inc n))) arr))

(defn nth [arr n]
  (if (= n 0)
    (first arr)
    (nth (rest arr) (- n 1))))

