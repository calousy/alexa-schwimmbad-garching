package de.codeforgarching.alexa.schwimmbad;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.amazon.ask.request.Predicates.intentName;

public class BeckenTemperaturRequestHandler implements RequestHandler {

    private static Logger logger = LoggerFactory.getLogger(CustomLaunchRequestHandler.class);

    @Override
    public boolean canHandle(HandlerInput handlerInput) {
        return handlerInput.matches(intentName("TemperaturIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput handlerInput) {

        logger.info(handlerInput.getRequestEnvelopeJson().asText());
//        var type = handlerInput.getRequestEnvelope().getRequest()..intent.slots.beckenType.value;

        // const myJson = response.json(); //extract JSON from the http response
        // do something with myJson

        String speechText = "Die Wassertemperatur im '" +  handlerInput + "' beträgt aktuell 26°";
        return handlerInput.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(speechText)
                .build();
    }
}
