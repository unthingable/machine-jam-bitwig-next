package unthingable.maschine.controller

object Surface {
  val TOUCHSTRIP = 1
  val TOUCHSTRIP_TOUCH = 2

  val ENCODER = 7
  val ENCODER_PUSH = 8
  val ENCODER_TOUCH = 9

  /** Mode buttons are from CC 22 to 29. */
  val MODE_BUTTON_1 = 22
  val MODE_BUTTON_2 = 23
  val MODE_BUTTON_3 = 24
  val MODE_BUTTON_4 = 25
  val MODE_BUTTON_5 = 26
  val MODE_BUTTON_6 = 27
  val MODE_BUTTON_7 = 28
  val MODE_BUTTON_8 = 29

  val CURSOR_UP = 30
  val CURSOR_RIGHT = 31
  val CURSOR_DOWN = 32
  val CURSOR_LEFT = 33

  val GROUP = 34
  val AUTO = 35
  val LOCK = 36
  val NOTE_REPEAT = 37

  val PROJECT = 38
  val FAVORITES = 39
  val BROWSER = 40

  val CHANNEL = 41
  val ARRANGER = 42
  val MIXER = 43

  val VOLUME = 44
  val PLUGIN = 45
  val SWING = 46
  val SAMPLING = 47
  val TEMPO = 48

  val PITCH = 49
  val MOD = 50
  val PERFORM = 51
  val NOTES = 52

  val RESTART = 53
  val ERASE = 54
  val TAP_METRO = 55
  val FOLLOW = 56
  val PLAY = 57
  val REC = 58
  val STOP = 59

  /** Mode button touch events are from CC 60 to 67. */
  val MODE_KNOB_TOUCH_1 = 60

  /** Mode buttons are from CC 70 to 77. */
  val MODE_KNOB_1 = 70

  val FIXED_VEL = 80
  val PAD_MODE = 81
  val KEYBOARD = 82
  val CHORDS = 84
  val STEP = 83
  val SCENE = 85
  val PATTERN = 86
  val EVENTS = 87
  val VARIATION = 88
  val DUPLICATE = 89
  val SELECT = 90
  val SOLO = 91
  val MUTE = 92

  /** Banks are from CC 100 to 107. */
  val BANK_1 = 100

  val PAGE_LEFT = 110
  val PAGE_RIGHT = 111

}
