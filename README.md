# clj-opengrok

Command Line Interface for OpenGrok

## ScreenShot

## Installation

- Download clj-opengrok-0.2.0.jar


## Requirements

* Java 1.8

## Building

- Download OpenGrok latest release [https://github.com/OpenGrok/OpenGrok/releases](https://github.com/OpenGrok/OpenGrok/releases)

- Install lein-localrepo [https://github.com/kumarshantanu/lein-localrepo](https://github.com/kumarshantanu/lein-localrepo)

- Install opengrok.jar

```shell
$ cd opengrok-0.12.1.5/lib
$ lein localrepo install opengrok.jar org.opensolaris/opengrok 0.12.1.5
```

- Install jrcs.jar

```shell
$ cd opengrok-0.12.1.5/lib/lib
$ lein localrepo install jrcs.jar org.apache.commons/jrcs 0.12.1.5
```

-


## License

Copyright (C) 2016 Youngjoo Lee

Author: Youngjoo Lee <youngker@gmail.com>

Distributed under the Eclipse Public License, the same as Clojure.
