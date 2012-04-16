(ns web_noir_playground.server
  (:require [noir.server :as server]))

(server/load-views "src/web_noir_playground/views/")

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "4000"))]
    (server/start port {:mode mode
                        :ns 'web_noir_playground})))

