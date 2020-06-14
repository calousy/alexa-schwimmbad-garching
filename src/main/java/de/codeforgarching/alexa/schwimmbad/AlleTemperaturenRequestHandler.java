package de.codeforgarching.alexa.schwimmbad;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class AlleTemperaturenRequestHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput handlerInput) {
        return handlerInput.matches(intentName("AlleTemperaturenIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput handlerInput) {

//        var type = handlerInput.getRequestEnvelope().getRequest()..intent.slots.beckenType.value;

        // const myJson = response.json(); //extract JSON from the http response
        // do something with myJson

        String speechText = "Die Wassertemperatur im 'Kinderbecken' beträgt aktuell 26°. ";
        speechText += "Die Wassertemperatur im 'Schimmerbecken' beträgt aktuell 26°.";
        return handlerInput.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(speechText)
                .build();
    }
}
