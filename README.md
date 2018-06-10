# Clojure examples

- Find `nth` element in a collection

```clojure
(defn nth [arr n]
  ((comp last (partial take (inc n))) arr))
```

Using recursion approach

```clojure
(defn nth [arr n]
  (if (= n 0)
    (first arr)
    (nth (rest arr) (- n 1))))
```
