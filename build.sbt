enablePlugins(ScalaJSPlugin)

name := "FirstApp"
scalaVersion := "2.12.6"

scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.6"
libraryDependencies += "org.querki" %%% "jquery-facade" % "1.2"
jsDependencies += "org.webjars" % "jquery" % "2.2.1" / "jquery.js" minified "jquery.min.js"
jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.6.3" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")