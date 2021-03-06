package voterinformation.handlers;

import java.util.*;
import voterinformation.util.votingInfo;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class VoterInformationIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("VoterInformationIntent").or(intentName("AMAZON.YesIntent")));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Versed Voter";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Versed Voter", speechText)
                .build();
    }
}
