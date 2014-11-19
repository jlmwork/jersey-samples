/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.Produces;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import org.eclipse.persistence.jaxb.JAXBContextProperties;

@Provider
@Produces({"application/xml", "application/json"})
public class CustomContextResolver implements ContextResolver<JAXBContext> {

    private JAXBContext jc;

    public CustomContextResolver() {
        try {
            Map<String, Object> props = new HashMap<String, Object>(1);
            props.put(JAXBContextProperties.OXM_METADATA_SOURCE, SimpleBean.class.getPackage().getName().replace(".", "/") + "/oxm.xml");
            jc = JAXBContext.newInstance(new Class[]{SimpleBean.class}, props);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    public JAXBContext getContext(Class<?> clazz) {
        if (SimpleBean.class == clazz) {
            return jc;
        }
        return null;
    }

}
