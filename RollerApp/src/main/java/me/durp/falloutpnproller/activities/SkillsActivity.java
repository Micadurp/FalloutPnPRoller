package me.durp.falloutpnproller.activities;

import android.os.Bundle;

import me.durp.falloutpnproller.R;

/**
 * Created by enicdey on 9/29/16.
 */
public class SkillsActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle pSavedInstanceState) {
        super.onCreate(pSavedInstanceState);
        setContentView(R.layout.activity_skills);
        super.menuInitialize();


    }
}