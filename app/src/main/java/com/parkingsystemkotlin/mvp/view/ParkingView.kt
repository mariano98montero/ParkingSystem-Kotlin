package com.parkingsystemkotlin.mvp.view

import android.app.Activity
import android.content.Context
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import com.parkingsystemkotlin.R
import com.parkingsystemkotlin.fragments.SpacesSettingDialogFragment
import com.parkingsystemkotlin.listeners.ListenerSetParkingDialogFragment
import com.parkingsystemkotlin.mvp.contracts.ParkingContract
import com.parkingsystemkotlin.mvp.view.base.ActivityView
import com.parkingsystemkotlin.utils.Constants

class ParkingView(activity: Activity) : ActivityView(activity), ParkingContract.MainActivityView{
    override fun showDialogFragment(listenerSetParkingDialogFragment: ListenerSetParkingDialogFragment) {
        getFragmentManager()?.let {
            val dialogFragment: SpacesSettingDialogFragment = SpacesSettingDialogFragment.newInstance(listenerSetParkingDialogFragment)
            dialogFragment.show(it, Constants.DIALOG_SPACES_SPACES_SETTING)
        }
    }

    override fun showParkingLotsAvailable(parkingLots: String) {
        val context: Context? = getContext()
        if (context!=null){
            Toast.makeText(context, context.getString(R.string.main_activity_toast_set_parking_lots, parkingLots), Toast.LENGTH_LONG).show()
        }
    }

}
