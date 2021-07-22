package com.parkingsystemkotlin.listeners

import java.io.Serializable

interface ListenerSetParkingDialogFragment: Serializable {
    fun listenFreeSpaces(freeSpaces: String)
}
