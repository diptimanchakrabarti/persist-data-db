package com.persist.data.transform;


import com.google.gson.Gson;
import io.connectedhealth_idaas.eventbuilder.events.platform.RoutingEvent;
import io.connectedhealth_idaas.eventbuilder.parsers.clinical.FHIRStreamParser;

import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;


public class BuildDBEvent {

    public JSONObject returncouchDBJSon(String body) throws JSONException {
        JSONObject json= new JSONObject(body);
        return json;


    }


}
