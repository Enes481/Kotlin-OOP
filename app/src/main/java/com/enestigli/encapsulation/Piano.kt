package com.enestigli.encapsulation

class Piano:HauseDecor, Instrument {

    override var roomName: String
        get() = "kitchen"
        set(value) {}

    var brand:String? = null
    var digital:Boolean? = null
}