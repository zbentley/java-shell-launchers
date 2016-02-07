#!/bin/bash

set -euo pipefail

# http://stackoverflow.com/questions/59895/can-a-bash-script-tell-what-directory-its-stored-in
pushd "$( dirname "${BASH_SOURCE[0]}" )" > /dev/null
scriptdir=$(pwd)
popd > /dev/null
launcher=$scriptdir/launcher.jar

if [[ ! -f $launcher ]]; then
	echo "Launcher not found at $launcher"
	exit 1;
fi

exec java -jar $scriptdir/launcher.jar $*