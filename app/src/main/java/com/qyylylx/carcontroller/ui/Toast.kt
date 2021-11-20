package com.qyylylx.carcontroller.ui

import android.widget.Toast
import com.qyylylx.carcontroller.CarControllerApplication

class Toast {

    fun String.showToast(duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(CarControllerApplication.context, this, duration).show()
    }

    fun Int.showToast(duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(CarControllerApplication.context, this, duration).show()
    }
}