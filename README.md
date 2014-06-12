# sot

Simplest Overtone [standalone] Test

Nothing fancy here, just a very simple template to show the simplest
standalone Overtone project.

[Issue 108](https://github.com/overtone/overtone/issues/108) has been
fixed so this project should "just work" now.  The trick was adding the
^{:skip-aot true} setting to the :main clause of the project.clj.

## Usage

You will hear a 440Hz sine wave for a few seconds after doing only this:

    lein deps
    lein run

## Uberjar

This is a hack and may not work for everyone.  But, it does seem to work here.

    ;; uncomment uberjar profile in project.clj
    lein uberjar
    ;; recomment uberjar profile in project.clj
    lein uberjar
    cd target/uberjar
    env LD_LIBRARY_PATH=native/macosx/x86_64 java -jar sot-0.1.0-SNAPSHOT-standalone.jar

Note that you'll want to adjust the path for your architecture.  Look in the .jar file for yours.

## License

Copyright © 2012 Roger Allen

Distributed under the Eclipse Public License, the same as Clojure.
