(defproject sot "0.1.0-SNAPSHOT"
  :description "Simplest overtone test for Issue 108 https://github.com/overtone/overtone/issues/108"
  :url "https://github.com/rogerallen/sot"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [overtone "0.8.1"]
                 [shadertone "0.2.0"]]
  :main ^{:skip-aot true} sot.core)
