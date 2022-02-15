addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.13")
addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.3.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.8.0")
addSbtPlugin("com.gu" % "sbt-riffraff-artifact" % "1.1.18")
libraryDependencies += "org.vafer" % "jdeb" % "1.3" artifacts Artifact("jdeb", "jar", "jar")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.7.0")
