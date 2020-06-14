package de.codeforgarching.alexa.schwimmbad;

import static com.amazon.ask.request.Predicates.requestType;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.impl.LaunchRequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;

import java.util.Optional;

/**
 * Handles cases when a user made a request to an Alexa skill, but did not provide a specific intent
 */
public class CustomLaunchRequestHandler implements LaunchRequestHandler {


    @Override
    public boolean canHandle(HandlerInput handlerInput, LaunchRequest launchRequest) {
        return handlerInput.matches(requestType(LaunchRequest.class));
    }

    @Override
    public Optional<Response> handle(HandlerInput handlerInput, LaunchRequest launchRequest) {

        String speechText = "This is a simple Alexa Skill example";
        return handlerInput.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(speechText)
                .build();
    }
}
