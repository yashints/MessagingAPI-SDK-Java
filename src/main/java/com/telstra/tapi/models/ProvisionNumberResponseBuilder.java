/*
 * TelstraMessagingAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.telstra.tapi.models;

import java.util.*;

public class ProvisionNumberResponseBuilder {
    //the instance to build
    private ProvisionNumberResponse provisionNumberResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ProvisionNumberResponseBuilder() {
        provisionNumberResponse = new ProvisionNumberResponse();
    }

    public ProvisionNumberResponseBuilder activeDays(int activeDays) {
        provisionNumberResponse.setActiveDays(activeDays);
        return this;
    }

    public ProvisionNumberResponseBuilder notifyURL(String notifyURL) {
        provisionNumberResponse.setNotifyURL(notifyURL);
        return this;
    }

    /**
     * The mobile phone number that was allocated
     */
    public ProvisionNumberResponseBuilder destinationAddress(String destinationAddress) {
        provisionNumberResponse.setDestinationAddress(destinationAddress);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ProvisionNumberResponse build() {
        return provisionNumberResponse;
    }
}