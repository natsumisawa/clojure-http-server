(ns simple-http-server.core
  (import (java.net ServerSocket)))

(def port 8000)

(defn -main [& args]
  (println "Hello, World!")
  (let [sever-socket (new ServerSocket port)]
    (while true
      (let [socket (.accept() sever-socket)]))))