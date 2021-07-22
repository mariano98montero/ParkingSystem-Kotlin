package com.parkingsystemkotlin.mvp.presenter

import com.parkingsystemkotlin.listeners.ListenerSetParkingDialogFragment
import com.parkingsystemkotlin.mvp.contracts.ParkingSpacesSettingContract

class ParkingSpacesSettingPresenter(view: ParkingSpacesSettingContract.ParkingSpacesSettingDialogFragmentView) : ParkingSpacesSettingContract.ParkingSpacesSettingDialogFragmentPresenter{
    private var view: ParkingSpacesSettingContract.ParkingSpacesSettingDialogFragmentView = view

    override fun onButtonDialogFragmentSpacesSettingConfirmationPressed(
        freeSpaces: String,
        listenerSetParkingDialogFragment: ListenerSetParkingDialogFragment
    ) {
        if (freeSpaces.isEmpty()){
            view.showInvalidValue()
        }else{
            view.showParkingLotsAvailable(freeSpaces, listenerSetParkingDialogFragment)
        }
    }
}
