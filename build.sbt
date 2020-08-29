
name := "k8ty-haiku"
organization := "app.k8ty"
version := "0.0.2"

scalaVersion := "2.13.3"

libraryDependencies += "dev.zio" %% "zio" % "1.0.0"
libraryDependencies += "me.atrox.haikunator" % "Haikunator" % "2.0.1"


lazy val root = project.in(file("."))
  .enablePlugins(NativeImagePlugin)
  .settings(
    Compile / mainClass := Some("app.k8ty.Main")
  )

nativeImageOptions ++= Seq(
  "--allow-incomplete-classpath",
  "--report-unsupported-elements-at-runtime",
  "--initialize-at-build-time",
  "--no-fallback",
//  "-H:ConfigurationFileDirectories=conf/"
)

def alertWhenDone(): Unit = {
  println("Zug Zug")
}
nativeImageReady := alertWhenDone
