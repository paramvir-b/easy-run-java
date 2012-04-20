#!/usr/bin/env sh

cleanUp() {
  rm Sample.class
}

javac Sample.java

../easyrunjava Sample arg_without_space "arg with space"
cleanUp

