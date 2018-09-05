#Clojure

##vars

## vars in clojure

```clojure
user=> (def a "foo")
#'user/a
user=> (def b a)
#'user/b
user=> (def a "goo")
#'user/a
user=> b
;; What is b?
```

```clojure
user=> (def a "foo")
#'user/a
user=> (defn b [] a)
#'user/b
user=> (def a "goo")
#'user/a
user=> (b)
;; What does this return?
```

```clojure
user=> (def a "foo")
#'user/a
user=> (def b #'a)
#'user/b
user=> (def a "goo")
#'user/a
user=> b
;; What does this return?
user=> @b
;; What does this return?
user=> (deref b)
;; What does this return?
user=> (type b)
;; What does this return?
user=> (type a)
;; What does this return?
```
