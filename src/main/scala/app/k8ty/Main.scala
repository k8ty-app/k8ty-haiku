package app.k8ty

import me.atrox.haikunator.Haikunator
import zio._
import zio.console._

object Main extends App {

  override def run(args: List[String]): URIO[zio.ZEnv, ExitCode] = {

    val program = for {
      haiku <- Task(new Haikunator().haikunate())
      _ <- putStrLn(haiku)
    } yield ()

    program.provideLayer(ZEnv.live).exitCode

  }
}
