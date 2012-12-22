(ns sot.core
  (:use [overtone.live])
  (:gen-class))

(defn -main [& args]
  (println "testing overtone.  you should hear a 440 Hz sine wave for a few seconds")
  (demo (sin-osc))
  (Thread/sleep 5000)
  (println "done. The program should stop.")
  (System/exit 0))
