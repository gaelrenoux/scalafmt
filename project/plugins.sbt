resolvers += Classpaths.sbtPluginReleases

addSbtPlugin("com.github.alexarchambault" % "coursier-sbt-plugin" % "1.0.0-M7")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.1")
addSbtPlugin("org.brianmckenna" % "sbt-wartremover" % "0.14")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.0.1")
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.2.6")