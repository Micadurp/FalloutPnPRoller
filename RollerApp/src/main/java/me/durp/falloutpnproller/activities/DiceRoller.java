package me.durp.falloutpnproller.activities;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import me.durp.falloutpnproller.R;

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

        TextView skillValue = (TextView) findViewById(R.id.skillValue);
        TextView plusValue = (TextView) findViewById(R.id.plusValue);
        TextView minusValue = (TextView) findViewById(R.id.minusValue);
        TextView diceValue = (TextView) findViewById(R.id.diceValue);

        Integer skill = 0;
        Integer plus = 0;
        Integer minus = 0;
        Integer dice = 0;

        if (!skillValue.getText().toString().equals("")) {
            skill = Integer.parseInt(skillValue.getText().toString());
        }

        if (!plusValue.getText().toString().equals("")) {
            plus = Integer.parseInt(plusValue.getText().toString());
        }

        if (!minusValue.getText().toString().equals("")) {
            minus = Integer.parseInt(minusValue.getText().toString());
        }

        if (!diceValue.getText().toString().equals("")) {
            dice = Integer.parseInt(diceValue.getText().toString());
        }

        TextView effectValue = (TextView) findViewById(R.id.effectValue);

        Integer effect = skill + plus - minus - dice;

        effectValue.setText(effect.toString());
    }
}
