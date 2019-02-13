# common-util

## this repository contains common things for all services:
- parent common pom
- common utils


## deploy new version process
1. increment version of library. prefer upgrading minor version instead of major
2. execute `mvn clean install deploy`
