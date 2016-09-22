package me.durp.falloutpnproller;

import android.app.Application;

/**
 * Created by enicdey on 9/20/16.
 */
public final class FalloutPnPRoller extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //Set custom theme for monospace, and thus the whole app
        FontsOverride.setDefaultFont(this, "MONOSPACE", "monofont.ttf");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
