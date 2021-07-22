package com.parkingsystemkotlin.mvp.contracts

import com.parkingsystemkotlin.listeners.ListenerSetParkingDialogFragment

interface ParkingContract {

    interface MainActivityModel{
        fun setParkingLots(parkingLots: String)
        fun getParkingLots(): String
    }

    interface MainActivityPresenter{
        fun onSetParkingButtonPressed(listenerSetParkingDialogFragment: ListenerSetParkingDialogFragment)
        fun setParkingSpacesAvailable(spacesAvailable: String)
    }

    interface MainActivityView{
        fun showDialogFragment(listenerSetParkingDialogFragment: ListenerSetParkingDialogFragment)
        fun showParkingLotsAvailable(parkingLots: String)
    }
}
