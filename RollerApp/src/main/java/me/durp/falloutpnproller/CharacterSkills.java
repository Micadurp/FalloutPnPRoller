package me.durp.falloutpnproller;

import android.speech.SpeechRecognizer;

/**
 * Created by enicdey on 9/29/16.
 */
public enum CharacterSkills {

    //Fighting
    PRIMITIVE(0),
    GUNS(1),
    ENERGY(2),
    BIG_GUNS(3),
    EXPLOSIVES(4),

    //Tinkering
    REPAIR(5),
    SCIENCE(6),
    PILOT(7),
    MEDIC(8),
    SCAVENGER(9),

    //Communication
    SPEECH(10),
    BARTER(11),
    GAMBLE(12),

    //Misc
    SNEAK(13),
    SLEIGHT(14),
    SECURITY(15),
    DISGUISE(16),
    SURVIVAL(17),
    ATHLETICS(18),
    TRACKING(19);

    private static final CharacterSkills[] VALUES = CharacterSkills.values();
    private final Integer mValue;

    public Integer getValue() {
        return mValue;
    }

    public static CharacterSkills getValue(Integer pValue) {

        for(Integer i = 0; i < VALUES.length; ++i) {
            if(VALUES[i].getValue() == pValue) {
                return VALUES[i];
            }
        }
        throw new AssertionError("Value is not within the bounds of the enum.");
    }

    CharacterSkills(Integer pValue) {
        mValue = pValue;
    }

    @Override
    public String toString() {
        return Integer.toString(mValue);
    }
}
