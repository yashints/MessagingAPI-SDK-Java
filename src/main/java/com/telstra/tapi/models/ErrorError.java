/*
 * TelstraMessagingAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.telstra.tapi.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ErrorError 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5125877307474791625L;
    private String status;
    private String message;
    /** GETTER
     * A short error code
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * A short error code
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * Message describing the error.
     */
    @JsonGetter("message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * Message describing the error.
     */
    @JsonSetter("message")
    public void setMessage (String value) { 
        this.message = value;
    }
 
}
 