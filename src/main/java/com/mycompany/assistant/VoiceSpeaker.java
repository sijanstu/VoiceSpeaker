package com.mycompany.assistant;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Sijan Bhandari
 */
public class VoiceSpeaker {

    static void speak(String vv, VoiceGender gender) throws IOException {
        new File("voice.txt").delete();
        new File("voice.vbs").delete();
        new FileWriter("voice.txt").append("Set Sapi = Wscript.CreateObject(\"SAPI.SpVoice\")\nSet sapi.Voice = sapi.GetVoices.Item(" + gender.value + ")\nSapi.speak \"" + vv + "\"").close();
        new File("voice.txt").renameTo(new File("voice.vbs"));
        Runtime.getRuntime().exec("wscript voice.vbs");
    }

    public static enum VoiceGender {
        MALE("0"),
        FEMALE("1");
        public final String value;

        private VoiceGender(String value) {
            this.value = value;
        }
    }
}
