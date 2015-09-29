package com.swipe.susheel.creditcardswipe.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Susheel on 9/25/2015.
 */
public class HeadsetStateReceiver extends BroadcastReceiver{

    AudioMonitorActivity activity;

    public HeadsetStateReceiver(AudioMonitorActivity activity) {
        this.activity = activity;
    }


    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getAction().equalsIgnoreCase(Intent.ACTION_HEADSET_PLUG)) {
            int st = intent.getIntExtra("state", -1);
            activity.setDongleReady(st == 1);
        }

    }



}
