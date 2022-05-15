(ns macro-repro.prod
  (:require [macro-repro.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
