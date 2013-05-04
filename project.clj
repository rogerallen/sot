(require 'leiningen.core.eval)

(def LWJGL-CLASSIFIER
  "Per os native code classifier"
  {:macosx  "natives-osx"
   :linux   "natives-linux"
   :windows "natives-windows"})

(defn lwjgl-classifier
  "Return the os-dependent lwjgl native-code classifier"
  []
  (let [os (leiningen.core.eval/get-os)]
    (get LWJGL-CLASSIFIER os)))

(defproject sot "0.1.0-SNAPSHOT"
  :description "Simplest overtone test for Issue 108 https://github.com/overtone/overtone/issues/108"
  :url "https://github.com/rogerallen/sot"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [overtone "0.8.1"]
                 [org.lwjgl.lwjgl/lwjgl "2.8.5"]
                 [org.lwjgl.lwjgl/lwjgl_util "2.8.5"]
                 [org.lwjgl.lwjgl/lwjgl-platform "2.8.5"
                  :classifier    ~(lwjgl-classifier)
                  :native-prefix ""]
                 [shadertone "0.1.0"]]
  :plugins [ [lein-swank "1.4.4"] ]
  :main ^{:skip-aot true} sot.core)
