(ns hello-world.core
  (:require))

(enable-console-print!)


(println 1)

(println "string")

(println "a" "\nb")

(println (= 0 0.0))

(println true false)

(println false nil)

(println (= false nil))

(if nil true false)

(println (quote (1 2 3)))

;(println (1 2 3))

(println 'something)

(println [1, 2 "a" false])

(println {1 "one" "two" 3})

(println :keyword?->>>=)

(println {:one 1 :two 2 :three 3})

(println (get {:one 1 :two 2 :three 3} :two))

(println (get {:one 1 :two 2 :three 3} :four "default"))

(println ({:one 1 :two 2 :three 3} :two))

(println (:two {:one 1 :two 2 :three 3}))

(println (get [1 2 3 4 5] 0))

(println (get [1 2 3 4 5] 10 :nothing))

(println ([1 2 3 4 5] 0))

;(println (0 [1 2 3 4 5]))

(println ( #{:one} :one))

(println (conj #{:one} :two))

(println (conj #{:one :two} :two))

(println (vec (set [1 2 2 3 3 4])))

(println (fn f [x] (inc x)))

(println ((fn f [x] (inc x)) 10))

(def f (fn [x] (inc x)))

(println (f 1))

(defn g [x] (inc x))

(println (g 1))

(def x 1)

(def a (atom 1))

(println a)

(reset! a 2)

(println a)

(println (swap! a inc))

(println (reset! a 2))

(println (swap! (atom {:a 1 :b 2 :c 3})
          #(-> %
            (update-in [:c] (fn [x] (+ x 10)))
            (update-in [:b] inc))))

(update-in
 (update-in {:a 1 :b 2 :c 3}
            [:c] (fn [x] (+ x 10)))
 [:b] inc)

(defn on-js-reload [])
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
