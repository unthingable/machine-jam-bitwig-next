package unthingable.maschine

import com.bitwig.`extension`.api.util.midi.ShortMidiMessage
import com.bitwig.extension.controller.ControllerExtension
import com.bitwig.extension.controller.api.{ControllerHost, Transport}

class MachineJAMExtension(val definition: MachineJAMExtensionDefinition, val host: ControllerHost) extends ControllerExtension(definition, host) {

  var mTransport: Transport = null

  override def init(): Unit = {

    val host = getHost
    mTransport = host.createTransport
    host.getMidiInPort(0).setMidiCallback((s: Int, d1: Int, d2: Int) => onMidi0(new ShortMidiMessage(s, d1, d2)))
    host.getMidiInPort(0).setSysexCallback((data: String) => onSysex0(data))

    host.showPopupNotification("Maschine JAM Initialized")
  }

  override def exit(): Unit = { // TODO: Perform any cleanup once the driver exits
    // For now just show a popup notification for verification that it is no longer running.
    getHost.showPopupNotification("Machine JAM Exited")
  }

  override def flush(): Unit = {
    // TODO Send any updates you need here.
  }

  /** Called when we receive short MIDI message on port 0. */
  private def onMidi0(msg: ShortMidiMessage): Unit = {
    // TODO: Implement your MIDI input handling code here.
  }

  /** Called when we receive sysex MIDI message on port 0. */
  private def onSysex0(data: String): Unit = { // MMC Transport Controls:
    if (data == "f07f7f0605f7") mTransport.rewind
    else if (data == "f07f7f0604f7") mTransport.fastForward
    else if (data == "f07f7f0601f7") mTransport.stop
    else if (data == "f07f7f0602f7") mTransport.play
    else if (data == "f07f7f0606f7") mTransport.record
  }

}
