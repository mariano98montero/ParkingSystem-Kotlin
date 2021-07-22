package com.parkingsystemkotlin.mvp.contracts

import com.parkingsystemkotlin.listeners.ListenerSetParkingDialogFragment

interface ParkingSpacesSettingContract {

    interface ParkingSpacesSettingDialogFragmentPresenter{
        fun onButtonDialogFragmentSpacesSettingConfirmationPressed(freeSpaces: String, listenerSetParkingDialogFragment: ListenerSetParkingDialogFragment)
    }

    interface ParkingSpacesSettingDialogFragmentView{
        fun showParkingLotsAvailable(parkingLots: String, listenerSetParkingDialogFragment: ListenerSetParkingDialogFragment)
        fun showInvalidValue()
    }
}
