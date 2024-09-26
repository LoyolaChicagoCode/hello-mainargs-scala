# hello-scalatest-scala

Small project to get started with Scala and mainargs.


## Running the main program

```
$ sbt "run -c 5 -s 10"
```

```
$ sbt "run --help"
```


## Running outside of sbt

This lets you use your application on the command-line.

First, create the startup script:

```
sbt stage
```

Then run outside of sbt like this:

```
./target/universal/stage/bin/hello-mainargs-scala -c 5 -s 10
```

```
./target/universal/stage/bin/hello-mainargs-scala--help
```

On Windows, you might need backslashes. WSL (Windows Subsystem for Linux) recommended instead.
