package com.example.mobileapp.broadcastreceiverpb5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.util.Log;

public class PhoneReceiver extends BroadcastReceiver {
    private static final String TAG = PhoneReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if(extras != null){
            String state = extras.getString(TelephonyManager.EXTRA_STATE);
            Log.e(TAG, "Phone State: "+state);
            if(state.equals(TelephonyManager.EXTRA_STATE_RINGING)){
                String number = extras.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
                Log.e(TAG, "Phone Number: "+number);
            }
        }
    }


}
