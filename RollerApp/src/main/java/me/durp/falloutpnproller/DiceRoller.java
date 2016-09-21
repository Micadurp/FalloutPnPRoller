package me.durp.falloutpnproller;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.WindowManager;

/**
 * Created by enicdey on 9/20/16.
 */
public class DiceRoller extends Activity {

    @Override
    protected void onCreate(Bundle pSavedInstanceState) {
        super.onCreate(pSavedInstanceState);
        setContentView(R.layout.activity_dice_roller);
    }
}
