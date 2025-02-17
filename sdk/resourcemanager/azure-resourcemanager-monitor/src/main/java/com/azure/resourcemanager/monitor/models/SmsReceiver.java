// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An SMS receiver. */
@Fluent
public final class SmsReceiver {
    /*
     * The name of the SMS receiver. Names must be unique across all receivers within an action group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The country code of the SMS receiver.
     */
    @JsonProperty(value = "countryCode", required = true)
    private String countryCode;

    /*
     * The phone number of the SMS receiver.
     */
    @JsonProperty(value = "phoneNumber", required = true)
    private String phoneNumber;

    /*
     * The status of the receiver.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private ReceiverStatus status;

    /**
     * Get the name property: The name of the SMS receiver. Names must be unique across all receivers within an action
     * group.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the SMS receiver. Names must be unique across all receivers within an action
     * group.
     *
     * @param name the name value to set.
     * @return the SmsReceiver object itself.
     */
    public SmsReceiver withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the countryCode property: The country code of the SMS receiver.
     *
     * @return the countryCode value.
     */
    public String countryCode() {
        return this.countryCode;
    }

    /**
     * Set the countryCode property: The country code of the SMS receiver.
     *
     * @param countryCode the countryCode value to set.
     * @return the SmsReceiver object itself.
     */
    public SmsReceiver withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Get the phoneNumber property: The phone number of the SMS receiver.
     *
     * @return the phoneNumber value.
     */
    public String phoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Set the phoneNumber property: The phone number of the SMS receiver.
     *
     * @param phoneNumber the phoneNumber value to set.
     * @return the SmsReceiver object itself.
     */
    public SmsReceiver withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Get the status property: The status of the receiver.
     *
     * @return the status value.
     */
    public ReceiverStatus status() {
        return this.status;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model SmsReceiver"));
        }
        if (countryCode() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property countryCode in model SmsReceiver"));
        }
        if (phoneNumber() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property phoneNumber in model SmsReceiver"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SmsReceiver.class);
}
