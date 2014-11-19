package com.example;

import org.glassfish.jersey.message.filtering.SelectableEntityFilteringFeature;
import org.glassfish.jersey.server.ResourceConfig;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jlamande
 */
//@ApplicationPath("/")
public class App extends ResourceConfig {

    public App() {
        //Resources.
        //packages(SoapExchange.class.getPackage().getName());
        //register(createMoxyJsonResolver());
        packages("com.example");
        register(org.glassfish.jersey.message.filtering.EntityFilteringFeature.class);
        property(SelectableEntityFilteringFeature.QUERY_PARAM_NAME, "fields");
        //property(ServerProperties.METAINF_SERVICES_LOOKUP_DISABLE, true);

    }
}
