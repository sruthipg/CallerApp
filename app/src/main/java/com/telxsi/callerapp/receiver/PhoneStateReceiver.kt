package com.telxsi.callerapp.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.TelephonyManager




class PhoneStateReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        val state = intent?.getStringExtra(TelephonyManager.EXTRA_STATE)
        when(state){
            TelephonyManager.EXTRA_STATE_RINGING->{

            }
            TelephonyManager.EXTRA_STATE_OFFHOOK->{

            }
        }

    }
}