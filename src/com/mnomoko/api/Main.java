package com.mnomoko.api;

import com.mnomoko.api.ws.Exemple;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mnomoko on 24/07/2017.
 */
public class Main extends Application {

    //The method returns a non-empty collection with classes, that must be included in the published JAX-RS application
    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add( Exemple.class );
        return h;
    }
}
