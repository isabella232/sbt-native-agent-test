package com.samebug.dev

import com.rollbar.notifier.Rollbar
import com.rollbar.notifier.config.ConfigBuilder

import scala.collection.JavaConverters._

object Test extends App {
  val config = ConfigBuilder.withAccessToken(System.getenv("RB"))
    .environment("agent-test")
    .appPackages(List("com.samebug.dev").asJava)
    .build

  val rollbar = Rollbar.init(config)
  try
    throw new Error("x")
  catch {
    case e: Throwable =>
      rollbar.error(e)
  }
  rollbar.close(true)
}
