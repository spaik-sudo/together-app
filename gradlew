#!/usr/bin/env sh

##############################################################################
##
##  Gradle start up script for UN*X
##
##############################################################################

DIR="$( cd "$( dirname "$0" )" && pwd )"

# Add default JVM options here if needed
DEFAULT_JVM_OPTS=""

exec "$DIR/gradle/wrapper/gradle-wrapper.jar" "$@"
