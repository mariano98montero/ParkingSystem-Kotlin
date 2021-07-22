package com.parkingsystemkotlin.mvp.model

import com.parkingsystemkotlin.mvp.contracts.ParkingContract

class ParkingModel: ParkingContract.MainActivityModel {
    private lateinit var parkingLots: String
    override fun setParkingLots(parkingLots: String) {
        this.parkingLots = parkingLots
    }

    override fun getParkingLots(): String {
        return parkingLots
    }
}
