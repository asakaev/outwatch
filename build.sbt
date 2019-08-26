scalaVersion := "2.12.9"

lazy val jsdocs = project
  .enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)
  .settings(
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.6"
  )

lazy val docs = project
  .in(file("outwatch-docs")) // important: it must not be docs/
  .enablePlugins(MdocPlugin, DocusaurusPlugin)
  .settings(
    mdocJS := Some(jsdocs),
    mdocJSLibraries := webpack.in(jsdocs, Compile, fullOptJS).value,
    moduleName := "outwatch-docs",
  )
