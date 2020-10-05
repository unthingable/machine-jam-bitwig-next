package unthingable.maschine

import java.util.UUID

import com.bitwig.extension.api.PlatformType
import com.bitwig.extension.controller.{AutoDetectionMidiPortNamesList, ControllerExtensionDefinition}
import com.bitwig.extension.controller.api.ControllerHost

//import scala.jdk.CollectionConverters._

object MachineJAMExtensionDefinition {
  private val DRIVER_ID = UUID.fromString("c4c4db3f-ffef-42d9-add7-bdddd5726806")
}

class MachineJAMExtensionDefinition() extends ControllerExtensionDefinition {
  override def getName: String = "Maschine JAM+"

  override def getAuthor: String = "unthingable"

  override def getVersion: String = "0.1"

  override def getId: UUID = MachineJAMExtensionDefinition.DRIVER_ID

  override def getHardwareVendor = "Native Instruments"

  override def getHardwareModel = "Maschine JAM+"

  override def getRequiredAPIVersion = 12

  def getNumMidiInPorts = 1

  def getNumMidiOutPorts = 1

  def listAutoDetectionMidiPortNames(list: AutoDetectionMidiPortNamesList, platformType: PlatformType): Unit = {
    Seq(1,2,3,4)
      .map(_.toString)
      .foreach(s => {
        list.add(
          Array(s"Maschine Jam - $s"),
          Array(s"Maschine Jam - $s"))
        list.add(
          Array(s"Maschine Jam - $s Input"),
          Array(s"Maschine Jam - $s Output"))
      })
  }
  override def createInstance(host: ControllerHost) = new MachineJAMExtension(this, host)
}
