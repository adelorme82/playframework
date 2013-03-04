import sbt._

object Dependencies {

  // Some common dependencies here so they don't need to be declared over and over
  val specsBuild = "org.specs2" %% "specs2" % "1.14"
  val scalaIoFileBuild = "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.2"

  val jdbcDeps = Seq(
    ("com.jolbox" % "bonecp" % "0.7.1.RELEASE" notTransitive ())
      .exclude("com.google.guava", "guava")
      .exclude("org.slf4j", "slf4j-api"),

    "com.h2database" % "h2" % "1.3.168",

    "tyrex" % "tyrex" % "1.0.1",

    specsBuild % "test")

  val ebeanDeps = Seq(
    "org.avaje.ebeanorm" % "avaje-ebeanorm" % "3.1.2" exclude ("javax.persistence", "persistence-api"))

  val jpaDeps = Seq(
    "org.hibernate.javax.persistence" % "hibernate-jpa-2.0-api" % "1.0.1.Final")

  val javaDeps = Seq(

    "org.yaml" % "snakeyaml" % "1.10",
    "org.hibernate" % "hibernate-validator" % "4.3.0.Final",

    ("org.springframework" % "spring-context" % "3.1.2.RELEASE" notTransitive ())
      .exclude("org.springframework", "spring-aop")
      .exclude("org.springframework", "spring-beans")
      .exclude("org.springframework", "spring-core")
      .exclude("org.springframework", "spring-expression")
      .exclude("org.springframework", "spring-asm"),

    ("org.springframework" % "spring-core" % "3.1.2.RELEASE" notTransitive ())
      .exclude("org.springframework", "spring-asm")
      .exclude("commons-logging", "commons-logging"),

    ("org.springframework" % "spring-beans" % "3.1.2.RELEASE" notTransitive ())
      .exclude("org.springframework", "spring-core"),

    "org.javassist" % "javassist" % "3.16.1-GA",

    ("org.reflections" % "reflections" % "0.9.8" notTransitive ())
      .exclude("com.google.guava", "guava")
      .exclude("javassist", "javassist"),

    "com.google.guava" % "guava" % "13.0.1",

    "com.google.code.findbugs" % "jsr305" % "2.0.1",

    "javax.servlet" % "javax.servlet-api" % "3.0.1",

    specsBuild % "test")

  val runtime = Seq(
    "io.netty" % "netty" % "3.5.9.Final",

    "org.slf4j" % "slf4j-api" % "1.6.6",
    "org.slf4j" % "jul-to-slf4j" % "1.6.6",
    "org.slf4j" % "jcl-over-slf4j" % "1.6.6",

    "ch.qos.logback" % "logback-core" % "1.0.7",
    "ch.qos.logback" % "logback-classic" % "1.0.7",

    scalaIoFileBuild,

    "com.typesafe.akka" %% "akka-actor" % "2.1.0",
    "com.typesafe.akka" %% "akka-slf4j" % "2.1.0",

    "org.scala-stm" % "scala-stm_2.10.0" % "0.6",

    "joda-time" % "joda-time" % "2.1",
    "org.joda" % "joda-convert" % "1.2",

    "org.apache.commons" % "commons-lang3" % "3.1",

    ("com.ning" % "async-http-client" % "1.7.6" notTransitive ())
      .exclude("org.jboss.netty", "netty"),

    "oauth.signpost" % "signpost-core" % "1.2.1.2",
    "oauth.signpost" % "signpost-commonshttp4" % "1.2.1.2",

    "org.codehaus.jackson" % "jackson-core-asl" % "1.9.10",
    "org.codehaus.jackson" % "jackson-mapper-asl" % "1.9.10",

    "net.sf.ehcache" % "ehcache-core" % "2.6.0",

    "javax.transaction" % "jta" % "1.1",

    specsBuild % "test",

    "org.mockito" % "mockito-all" % "1.9.0" % "test",
    "com.novocode" % "junit-interface" % "0.10-M2" % "test",

    "org.fluentlenium" % "fluentlenium-festassert" % "0.7.3" % "test" exclude ("org.jboss.netty", "netty"),
    "org.scala-lang" % "scala-reflect" % "2.10.0")

  val link = Seq(
    "org.javassist" % "javassist" % "3.16.1-GA")

  val routersCompilerDependencies = Seq(
    "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.1" exclude ("javax.transaction", "jta"),
    "org.specs2" %% "specs2" % "1.12.3" % "test" exclude ("javax.transaction", "jta"))

  val templatesCompilerDependencies = Seq(
    "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.1" exclude ("javax.transaction", "jta"),
    "org.specs2" %% "specs2" % "1.12.3" % "test"
      exclude ("javax.transaction", "jta"))

  val sbtDependencies = Seq(
    "com.typesafe" % "config" % "1.0.0",
    "org.mozilla" % "rhino" % "1.7R4",

    ("com.google.javascript" % "closure-compiler" % "rr2079.1" notTransitive ())
      .exclude("args4j", "args4j")
      .exclude("com.google.guava", "guava")
      .exclude("org.json", "json")
      .exclude("com.google.protobuf", "protobuf-java")
      .exclude("org.apache.ant", "ant")
      .exclude("com.google.code.findbugs", "jsr305")
      .exclude("com.googlecode.jarjar", "jarjar")
      .exclude("junit", "junit"),

    ("com.google.guava" % "guava" % "10.0.1" notTransitive ())
      .exclude("com.google.code.findbugs", "jsr305"),

    "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.1" exclude ("javax.transaction", "jta"),

    "org.avaje.ebeanorm" % "avaje-ebeanorm" % "3.1.2" exclude ("javax.persistence", "persistence-api"),

    "com.h2database" % "h2" % "1.3.168",
    "org.javassist" % "javassist" % "3.16.1-GA",
    "org.pegdown" % "pegdown" % "1.1.0",

    "net.contentobjects.jnotify" % "jnotify" % "0.94")

  val consoleDependencies = Seq(
    "net.databinder.giter8" % "giter8_2.9.1" % "0.5.0")

  val templatesDependencies = Seq(
    scalaIoFileBuild,
    specsBuild % "test")

  val iterateesDependencies = Seq(
    "org.scala-stm" % "scala-stm_2.10.0" % "0.6",
    "com.typesafe" % "config" % "1.0.0",
    specsBuild % "test")

  val jsonDependencies = Seq(
    "joda-time" % "joda-time" % "2.1",
    "org.joda" % "joda-convert" % "1.2",
    "org.codehaus.jackson" % "jackson-core-asl" % "1.9.10",
    "org.codehaus.jackson" % "jackson-mapper-asl" % "1.9.10",
    "org.scala-lang" % "scala-reflect" % "2.10.0",
    specsBuild % "test")

  val testDependencies = Seq(
    "junit" % "junit-dep" % "4.10",
    specsBuild,
    "com.novocode" % "junit-interface" % "0.10-M2",

    "org.fluentlenium" % "fluentlenium-festassert" % "0.7.3" exclude ("org.jboss.netty", "netty"))

}
