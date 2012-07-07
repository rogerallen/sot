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

## License

Copyright © 2012 Roger Allen

Distributed under the Eclipse Public License, the same as Clojure.
