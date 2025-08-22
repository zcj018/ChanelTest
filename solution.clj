(ns solution
  (:require [clojure.core.async :as a]))

(defn process-order [order]
  (a/thread
    (Thread/sleep (+ 10 (rand-int 90)))
    (assoc order :status "processed")))


(defn process-orders [orders]
  (let [tasks (map process-order orders)]
    (println  "print tasks:"+ tasks)
    (a/merge tasks)))

(defn process-orders-in-sequence [orders]
  (let [out (a/chan)
        tasks (map process-order orders)]
    (a/go
      (doseq [t tasks]
        (a/>! out (a/<! t)))
      (a/close! out))
    out))

(defn -main []
  (let [orders [{:id 1 :amount 100}
                {:id 2 :amount 200}
                {:id 3 :amount 300}
                {:id 4 :amount 400}
                {:id 5 :amount 400}
                {:id 6 :amount 400}
                ]
        ;order-ch (process-orders orders)
        ;;uncomment to test process-orders-in-sequence
        order-ch (process-orders-in-sequence orders)
        done (a/chan)]
    (a/go
      (loop []
        (if-let [o (a/<! order-ch)]
          (do (println "Processed order:" o)
              (recur))
          (a/>! done :done))))
    (a/<!! done)
    (println "All orders processed.")))
