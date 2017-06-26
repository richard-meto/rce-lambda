package uk.gov.metoffice.nswws.dissemination.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import rce.domain.RichTestEvent;

import java.io.InputStream;
import java.io.OutputStream;

public class RichiesEventHandler implements RequestStreamHandler {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) {
        System.out.println("Test lambda invoked OK");
        RichTestEvent richEvent = new RichTestEvent("Ricardo", "Evasion");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            System.out.println("Lambda output");
            System.out.println(objectMapper.writeValueAsString(richEvent));
            System.out.println("Test lambda finished");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
}
