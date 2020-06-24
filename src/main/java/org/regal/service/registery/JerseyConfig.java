package org.regal.service.registery;

import org.glassfish.jersey.server.ResourceConfig;
import org.regal.service.registery.server.resource.RegisteryServer;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig 
{
    public JerseyConfig() 
    {
        register(RegisteryServer.class);
        packages("org.regal.service.registery.server.resource");
    }
}