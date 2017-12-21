/*
 * TelstraMessagingAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.telstra.tapi.models;

import java.util.*;

public class SendMMSRequestBuilder {
    //the instance to build
    private SendMMSRequest sendMMSRequest;

    /**
     * Default constructor to initialize the instance
     */
    public SendMMSRequestBuilder() {
        sendMMSRequest = new SendMMSRequest();
    }

    /**
     * This will be the source address that will be displayed on the
     * receiving device. If it is not present then it will default to the MSISDN
     * assigned to the app. If replyRequest is set to true, then this field will
     * be ignored.
     */
    public SendMMSRequestBuilder from(String from) {
        sendMMSRequest.setFrom(from);
        return this;
    }

    /**
     * This is the destination address.
     */
    public SendMMSRequestBuilder to(String to) {
        sendMMSRequest.setTo(to);
        return this;
    }

    /**
     * The subject that will be used in an MMS message.
     */
    public SendMMSRequestBuilder subject(String subject) {
        sendMMSRequest.setSubject(subject);
        return this;
    }

    /**
     * If set to true, the reply message functionality will be implemented
     * and the to address will be ignored if present.
     */
    public SendMMSRequestBuilder replyRequest(boolean replyRequest) {
        sendMMSRequest.setReplyRequest(replyRequest);
        return this;
    }

    /**
     * An Array of content that will be sent in an MMS message. If this
     * array is present it will cause the “body” element to be ignored, and the
     * message will be sent as an MMS.
     */
    public SendMMSRequestBuilder mMSContent(List<MMSContent> mMSContent) {
        sendMMSRequest.setMMSContent(mMSContent);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SendMMSRequest build() {
        return sendMMSRequest;
    }
}