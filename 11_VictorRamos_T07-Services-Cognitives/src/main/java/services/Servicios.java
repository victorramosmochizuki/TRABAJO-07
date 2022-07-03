package services;

import com.microsoft.cognitiveservices.speech.*;
import com.microsoft.cognitiveservices.speech.audio.AudioConfig;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import model.Message;


public class Servicios {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        
        
        Message message = new Message();

        message.setValue("PROBANDO");
        escucha(message);

    }



    public static void escucha(Message message) throws InterruptedException, ExecutionException {       
        SpeechConfig speechConfig = SpeechConfig.fromSubscription("bd4aafda63d24f7db7d73d3830ad1477", "eastus");
        speechConfig.setSpeechRecognitionLanguage("ES-ES");
        AudioConfig audioConfig = AudioConfig.fromDefaultSpeakerOutput();
        SpeechSynthesizer synthesizer = new SpeechSynthesizer(speechConfig, audioConfig);
        synthesizer.SpeakText(message.getValue());

    }
}
