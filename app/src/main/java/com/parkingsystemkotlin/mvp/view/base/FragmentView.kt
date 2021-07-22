package com.parkingsystemkotlin.mvp.view.base

import android.content.Context
import androidx.fragment.app.Fragment
import java.lang.ref.WeakReference

open class FragmentView(fragment: Fragment) {
    private var fragmentRef: WeakReference<Fragment> = WeakReference(fragment)

    fun getFragment(): Fragment?{
        return fragmentRef.get()
    }

    fun getContext(): Context?{
        return getFragment()?.context
    }
}
