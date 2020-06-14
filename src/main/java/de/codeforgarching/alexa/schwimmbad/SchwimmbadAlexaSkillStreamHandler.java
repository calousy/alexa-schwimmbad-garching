package de.codeforgarching.alexa.schwimmbad;

import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;

public class SchwimmbadAlexaSkillStreamHandler
     extends SkillStreamHandler {

    public SchwimmbadAlexaSkillStreamHandler() {
            super(Skills.standard()
                    .addRequestHandler(new CustomLaunchRequestHandler())
                    .addRequestHandler(new WelcomeRequestHandler())
                    .addRequestHandler(new AlleTemperaturenRequestHandler())
                    .addRequestHandler(new BeckenTemperaturRequestHandler())
                    .addRequestHandler(new BesucherRequestHandler())
                    .build());
        }
}
