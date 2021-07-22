package com.parkingsystemkotlin.mvp.view

import android.content.Context
import android.widget.Toast
import com.parkingsystemkotlin.R
import com.parkingsystemkotlin.fragments.SpacesSettingDialogFragment
import com.parkingsystemkotlin.listeners.ListenerSetParkingDialogFragment
import com.parkingsystemkotlin.mvp.contracts.ParkingSpacesSettingContract
import com.parkingsystemkotlin.mvp.view.base.FragmentView

class ParkingSpacesSettingView(fragment: SpacesSettingDialogFragment) : FragmentView(fragment), ParkingSpacesSettingContract.ParkingSpacesSettingDialogFragmentView{

    override fun showParkingLotsAvailable(parkingLots: String, listenerSetParkingDialogFragment: ListenerSetParkingDialogFragment) {
        val fragment: SpacesSettingDialogFragment = getFragment() as SpacesSettingDialogFragment
        if (fragment!=null){
            fragment.dismiss()
        }
        listenerSetParkingDialogFragment.listenFreeSpaces(parkingLots)
    }

    override fun showInvalidValue() {
        val context: Context? = getContext()
        if (context != null){
            Toast.makeText(context, context.getString(R.string.dialog_fragment_toast_invalid_value), Toast.LENGTH_LONG).show()
        }
    }
}
