package com.phoenixnap.oss.ramlapisync.raml.jrp.raml08v1;

import com.phoenixnap.oss.ramlapisync.raml.RamlSecurityReference;
import org.raml.model.SecurityReference;

/**
 * @author armin.weisser
 */
public class Jrp08V1RamlSecurityReference implements RamlSecurityReference {

    private final SecurityReference securityReference;

    public Jrp08V1RamlSecurityReference(SecurityReference securityReference) {
        this.securityReference = securityReference;
    }

    @Override
    public String getName() {
        return securityReference.getName();
    }
}
