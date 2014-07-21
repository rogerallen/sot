(ns sot.core
  (:use [overtone.live])
  (:require [shadertone.tone :as t])
  (:gen-class))

(defn -main [& args]
  (println "Testing overtone & shadertone.")
  (println "You should hear a pulsing saw wave and see a grey window\nthat 'throbs' to red with the sound.")
  (println "This should last for about 10 seconds.")

  ;; start up shadertone
  (t/start "src/sot/throb.glsl")
  (Thread/sleep 1000) ;; give it a second...

  ;; start up some noise
  (demo 10 (* (sin-osc 0.5) (saw 440)))

  ;; wait around...
  (Thread/sleep (* 10 1000))

  ;; aaaand we're done.  Stop shadertone
  (t/stop)
  (println "Done. The program should stop.")
  (System/exit 0))
