package services;

import com.microsoft.cognitiveservices.speech.*;
import com.microsoft.cognitiveservices.speech.audio.AudioConfig;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
public class ser {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //Find your key and resource region under the 'Keys and Endpoint' tab in your Speech resource in Azure Portal
        //Remember to delete the brackets <> when pasting your key and region!
        SpeechConfig speechConfig = SpeechConfig.fromSubscription("<paste-your-resource-key>" , "<paste-your-region>");
        synthesizeToSpeaker(speechConfig);
    }

    public static void synthesizeToSpeaker(SpeechConfig speechConfig) throws InterruptedException, ExecutionException {
        AudioConfig audioConfig = AudioConfig.fromDefaultSpeakerOutput();
        SpeechSynthesizer synthesizer = new SpeechSynthesizer(speechConfig, audioConfig);
        synthesizer.SpeakText("Enter some text to synthesize.");
    }
}

