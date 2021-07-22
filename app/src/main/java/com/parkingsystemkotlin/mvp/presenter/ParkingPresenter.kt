package com.parkingsystemkotlin.mvp.presenter

import com.parkingsystemkotlin.listeners.ListenerSetParkingDialogFragment
import com.parkingsystemkotlin.mvp.contracts.ParkingContract

class ParkingPresenter(model: ParkingContract.MainActivityModel, view: ParkingContract.MainActivityView) : ParkingContract.MainActivityPresenter{
    private var model: ParkingContract.MainActivityModel = model
    private var view: ParkingContract.MainActivityView = view

    override fun onSetParkingButtonPressed(listenerSetParkingDialogFragment: ListenerSetParkingDialogFragment) {
        view.showDialogFragment(listenerSetParkingDialogFragment)
    }

    override fun setParkingSpacesAvailable(spacesAvailable: String) {
        model.setParkingLots(spacesAvailable)
        view.showParkingLotsAvailable(model.getParkingLots())
    }
}
