# k8ty-haiku

A silly test project that prints a Haiku-like project name.

This project is really for testing as a homebrew formula + generating/distributing
binaries made with graalvm-native-image.

Build a native image with something like:
`sbt -java-home $GRAALVM_HOME graalvm-native-image:packageBin`
