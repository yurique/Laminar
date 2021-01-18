
logLevel := Level.Warn

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.2.0")

addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.20.0")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.0.2")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.10")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.5")

addSbtPlugin("org.scalameta" % "sbt-mdoc" % "2.2.9" )

addSbtPlugin("ch.epfl.lamp" % "sbt-dotty" % "0.5.1")

addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.1.16")
