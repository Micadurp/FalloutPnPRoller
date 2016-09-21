package me.durp.falloutpnproller;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by enicdey on 9/20/16.
 */
public class DiceRoller extends Activity {

    @Override
    protected void onCreate(Bundle pSavedInstanceState) {
        super.onCreate(pSavedInstanceState);
        setContentView(R.layout.activity_dice_roller);

        Button rollButton = (Button) findViewById(R.id.rollButton);

        rollButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calculateEffect();
            }
        });
    }

    private void calculateEffect(){

        TextView effectValue = (TextView) findViewById(R.id.effectValue);
        effectValue.setText("IT WORKS");
    }
}
