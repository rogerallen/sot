(defproject sot "0.1.0-SNAPSHOT"
  :description "Simplest overtone test for Issue 108 https://github.com/overtone/overtone/issues/108"
  :url "https://github.com/rogerallen/sot"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [overtone "0.9.1"]]
  :main ^:skip-aot sot.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :jvm-opts ^:replace [])
