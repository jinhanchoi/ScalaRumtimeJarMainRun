import java.io.File
import java.net.URLClassLoader

object TestRun {
  def main(args : Array[String]) : Unit = {
    var loader = new URLClassLoader(
      Array(new File("C:\\Users\\PC\\java\\kafka-trunk\\ClassLoadingSample\\target\\scala-2.11\\my-sample.jar").toURI.toURL),
      this.getClass.getClassLoader
    )
    var mainMethod = loader.loadClass("JinhanMainApp").getMethod("main",classOf[Array[String]])
    mainMethod.invoke(null,Array(""))
  }
}
