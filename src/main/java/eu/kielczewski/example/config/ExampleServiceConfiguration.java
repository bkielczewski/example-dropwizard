package eu.kielczewski.example.config;

import com.yammer.dropwizard.config.Configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@SuppressWarnings("UnusedDeclaration")
public class ExampleServiceConfiguration extends Configuration {

    @NotNull
    @Valid
    private MessagesConfiguration messages;

    public MessagesConfiguration getMessages() {
        return messages;
    }

    public void setMessages(MessagesConfiguration messages) {
        this.messages = messages;
    }
}
