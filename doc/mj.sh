#!/bin/bash

echo 'BitWormhole make.js v0.1'

jar_path='/home/xukun/git/make.js/source/target/make.js-jar-with-dependencies.jar'

java    -jar ${jar_path}   -Dpwd.path=${PWD}

