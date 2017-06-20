package uk.gov.metoffice.nswws.dissemination.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.fasterxml.jackson.databind.ObjectMapper;
import rich.event;

import java.io.InputStream;
import java.io.OutputStream;

public class RichiesEventHandler implements RequestStreamHandler {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) {
        System.out.println("Test lambda invoked OK");
        event.RichEvent richEvent = new event.RichEvent("Richmond", "Everson");
        System.out.println("Test lambda finished");
        //NswwsWarningsRetrievedEvent n = new NswwsWarningsRetrievedEvent();
        // System.out.println("Test lambda");
    }
}
