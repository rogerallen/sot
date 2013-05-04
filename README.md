# sot

Simplest Standalone Shadertone Test

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

## License

Copyright © 2012-2013 Roger Allen

Distributed under the Eclipse Public License, the same as Clojure.
