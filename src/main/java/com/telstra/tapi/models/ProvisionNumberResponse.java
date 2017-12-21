/*
 * TelstraMessagingAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.telstra.tapi.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ProvisionNumberResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5171896424277736518L;
    private int activeDays;
    private String notifyURL;
    private String destinationAddress;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("activeDays")
    public int getActiveDays ( ) { 
        return this.activeDays;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("activeDays")
    public void setActiveDays (int value) { 
        this.activeDays = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("notifyURL")
    public String getNotifyURL ( ) { 
        return this.notifyURL;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("notifyURL")
    public void setNotifyURL (String value) { 
        this.notifyURL = value;
    }
 
    /** GETTER
     * The mobile phone number that was allocated
     */
    @JsonGetter("destinationAddress")
    public String getDestinationAddress ( ) { 
        return this.destinationAddress;
    }
    
    /** SETTER
     * The mobile phone number that was allocated
     */
    @JsonSetter("destinationAddress")
    public void setDestinationAddress (String value) { 
        this.destinationAddress = value;
    }
 
}
 