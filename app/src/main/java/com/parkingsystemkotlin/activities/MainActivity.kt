package com.parkingsystemkotlin.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.parkingsystemkotlin.R
import com.parkingsystemkotlin.databinding.ActivityMainBinding
import com.parkingsystemkotlin.listeners.ListenerSetParkingDialogFragment
import com.parkingsystemkotlin.mvp.contracts.ParkingContract
import com.parkingsystemkotlin.mvp.model.ParkingModel
import com.parkingsystemkotlin.mvp.presenter.ParkingPresenter
import com.parkingsystemkotlin.mvp.view.ParkingView

class MainActivity : AppCompatActivity(), ListenerSetParkingDialogFragment{
    private lateinit var presenter: ParkingContract.MainActivityPresenter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter = ParkingPresenter(ParkingModel(), ParkingView(this))

        setListeners()
    }

    private fun setListeners(){
        binding.buttonMainActivitySelectParkingSpace.setOnClickListener { presenter.onSetParkingButtonPressed(this) }
    }

    override fun listenFreeSpaces(freeSpaces: String) {
        presenter.setParkingSpacesAvailable(freeSpaces)
    }
}
