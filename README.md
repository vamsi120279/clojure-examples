# Clojure examples

- Find `nth` element in a collection
```clojure

(defn nth [arr n]
  ((comp last (partial take (inc n))) arr))
```
