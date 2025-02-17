// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The EdgeUsageDataCollectionPolicy model. */
@Fluent
public final class EdgeUsageDataCollectionPolicy {
    /*
     * Usage data collection frequency in ISO 8601 duration format e.g. PT10M , PT5H.
     */
    @JsonProperty(value = "dataCollectionFrequency")
    private String dataCollectionFrequency;

    /*
     * Usage data reporting frequency in ISO 8601 duration format e.g. PT10M , PT5H.
     */
    @JsonProperty(value = "dataReportingFrequency")
    private String dataReportingFrequency;

    /*
     * Maximum time for which the functionality of the device will not be hampered for not reporting the usage data.
     */
    @JsonProperty(value = "maxAllowedUnreportedUsageDuration")
    private String maxAllowedUnreportedUsageDuration;

    /*
     * Details of Event Hub where the usage will be reported.
     */
    @JsonProperty(value = "eventHubDetails")
    private EdgeUsageDataEventHub eventHubDetails;

    /**
     * Get the dataCollectionFrequency property: Usage data collection frequency in ISO 8601 duration format e.g. PT10M
     * , PT5H.
     *
     * @return the dataCollectionFrequency value.
     */
    public String dataCollectionFrequency() {
        return this.dataCollectionFrequency;
    }

    /**
     * Set the dataCollectionFrequency property: Usage data collection frequency in ISO 8601 duration format e.g. PT10M
     * , PT5H.
     *
     * @param dataCollectionFrequency the dataCollectionFrequency value to set.
     * @return the EdgeUsageDataCollectionPolicy object itself.
     */
    public EdgeUsageDataCollectionPolicy withDataCollectionFrequency(String dataCollectionFrequency) {
        this.dataCollectionFrequency = dataCollectionFrequency;
        return this;
    }

    /**
     * Get the dataReportingFrequency property: Usage data reporting frequency in ISO 8601 duration format e.g. PT10M ,
     * PT5H.
     *
     * @return the dataReportingFrequency value.
     */
    public String dataReportingFrequency() {
        return this.dataReportingFrequency;
    }

    /**
     * Set the dataReportingFrequency property: Usage data reporting frequency in ISO 8601 duration format e.g. PT10M ,
     * PT5H.
     *
     * @param dataReportingFrequency the dataReportingFrequency value to set.
     * @return the EdgeUsageDataCollectionPolicy object itself.
     */
    public EdgeUsageDataCollectionPolicy withDataReportingFrequency(String dataReportingFrequency) {
        this.dataReportingFrequency = dataReportingFrequency;
        return this;
    }

    /**
     * Get the maxAllowedUnreportedUsageDuration property: Maximum time for which the functionality of the device will
     * not be hampered for not reporting the usage data.
     *
     * @return the maxAllowedUnreportedUsageDuration value.
     */
    public String maxAllowedUnreportedUsageDuration() {
        return this.maxAllowedUnreportedUsageDuration;
    }

    /**
     * Set the maxAllowedUnreportedUsageDuration property: Maximum time for which the functionality of the device will
     * not be hampered for not reporting the usage data.
     *
     * @param maxAllowedUnreportedUsageDuration the maxAllowedUnreportedUsageDuration value to set.
     * @return the EdgeUsageDataCollectionPolicy object itself.
     */
    public EdgeUsageDataCollectionPolicy withMaxAllowedUnreportedUsageDuration(
        String maxAllowedUnreportedUsageDuration) {
        this.maxAllowedUnreportedUsageDuration = maxAllowedUnreportedUsageDuration;
        return this;
    }

    /**
     * Get the eventHubDetails property: Details of Event Hub where the usage will be reported.
     *
     * @return the eventHubDetails value.
     */
    public EdgeUsageDataEventHub eventHubDetails() {
        return this.eventHubDetails;
    }

    /**
     * Set the eventHubDetails property: Details of Event Hub where the usage will be reported.
     *
     * @param eventHubDetails the eventHubDetails value to set.
     * @return the EdgeUsageDataCollectionPolicy object itself.
     */
    public EdgeUsageDataCollectionPolicy withEventHubDetails(EdgeUsageDataEventHub eventHubDetails) {
        this.eventHubDetails = eventHubDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (eventHubDetails() != null) {
            eventHubDetails().validate();
        }
    }
}
