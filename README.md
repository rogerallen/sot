# sot

Simplest Standalone Overtone & Shadertone Test

Nothing fancy here, just a very simple template to show the simplest
standalone Overtone project.  Now, with added Shadertone wonderfulness!

As a historical note, this depended on fixing [Issue
108](https://github.com/overtone/overtone/issues/108) in the Overtone
project to get this to "just work".  The trick was adding the
^{:skip-aot true} setting to the :main clause of the project.clj.

## Usage

You will hear and see a demonstration for a few seconds after doing
only this:

    lein deps
    lein run

## Uberjar

This is not working on the master branch, yet.  Currently, after lein
2.4.3 and clj-native 0.9.5 was released, this results in:
`java.lang.IncompatibleClassChangeError: Found class clojure.asm.ClassVisitor, but interface was expected`

But the 'overtone' branch works fine.

    lein uberjar
    cd target/uberjar
    env LD_LIBRARY_PATH=native/macosx/x86_64 java -jar sot-0.1.0-SNAPSHOT-standalone.jar

You'll want to adjust the LD_LIBRARY_PATH for your architecture.  Look in the .jar file for yours.

## License

Copyright © 2012-2014 Roger Allen

Distributed under the Eclipse Public License, the same as Clojure.
