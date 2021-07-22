package com.parkingsystemkotlin.mvp.view.base

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager

import java.lang.ref.WeakReference

open class ActivityView(activity: Activity) {
    private var activityRef: WeakReference<Activity> = WeakReference(activity)

    fun getActivity(): Activity? {
        return activityRef.get()
    }

    fun getContext(): Context?{
        return getActivity()
    }

    fun getFragmentManager(): FragmentManager? =
        with(getActivity()) {
           if (this != null) (this as AppCompatActivity).supportFragmentManager else null
        }
}
