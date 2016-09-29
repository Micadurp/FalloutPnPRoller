package me.durp.falloutpnproller.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import me.durp.falloutpnproller.R;

/**
 * Created by enicdey on 9/29/16.
 */
public abstract class MainActivity extends Activity {

    protected void initalize() {

        Button SpecialsButton = (Button) findViewById(R.id.menuButton3);
        SpecialsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            }
        });

        Button Roller = (Button) findViewById(R.id.menuButton4);
        Roller.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DiceRoller.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        Button SkillButton = (Button) findViewById(R.id.menuButton5);
        SkillButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SkillsActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}
