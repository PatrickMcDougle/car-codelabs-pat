package com.example.places.carappservice

import android.content.Intent
import androidx.car.app.CarAppService
import androidx.car.app.Screen
import androidx.car.app.Session
import androidx.car.app.SessionInfo
import androidx.car.app.validation.HostValidator
import com.example.places.carappservice.screen.MainScreen

class PlacesCarAppService : CarAppService() {
    override fun createHostValidator(): HostValidator {
        return HostValidator.ALLOW_ALL_HOSTS_VALIDATOR
    }

    override fun onCreateSession(sessionInfo: SessionInfo): Session {
        return PlacesSession()
//        return super.onCreateSession(sessionInfo)
    }
}

class PlacesSession : Session() {
    override fun onCreateScreen(intent: Intent): Screen {
        // MainScreen will be an unresolved reference until the next step
        return MainScreen(carContext)
    }

}