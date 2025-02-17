// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmos.models.CassandraClusterPublicStatusDataCentersItem;
import com.azure.resourcemanager.cosmos.models.ConnectionError;
import com.azure.resourcemanager.cosmos.models.ManagedCassandraReaperStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of a managed Cassandra cluster public status. */
@Fluent
public final class CassandraClusterPublicStatusInner {
    /*
     * The eTag property.
     */
    @JsonProperty(value = "eTag")
    private String etag;

    /*
     * The reaperStatus property.
     */
    @JsonProperty(value = "reaperStatus")
    private ManagedCassandraReaperStatus reaperStatus;

    /*
     * List relevant information about any connection errors to the Datacenters.
     */
    @JsonProperty(value = "connectionErrors")
    private List<ConnectionError> connectionErrors;

    /*
     * List of the status of each datacenter in this cluster.
     */
    @JsonProperty(value = "dataCenters")
    private List<CassandraClusterPublicStatusDataCentersItem> dataCenters;

    /**
     * Get the etag property: The eTag property.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The eTag property.
     *
     * @param etag the etag value to set.
     * @return the CassandraClusterPublicStatusInner object itself.
     */
    public CassandraClusterPublicStatusInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the reaperStatus property: The reaperStatus property.
     *
     * @return the reaperStatus value.
     */
    public ManagedCassandraReaperStatus reaperStatus() {
        return this.reaperStatus;
    }

    /**
     * Set the reaperStatus property: The reaperStatus property.
     *
     * @param reaperStatus the reaperStatus value to set.
     * @return the CassandraClusterPublicStatusInner object itself.
     */
    public CassandraClusterPublicStatusInner withReaperStatus(ManagedCassandraReaperStatus reaperStatus) {
        this.reaperStatus = reaperStatus;
        return this;
    }

    /**
     * Get the connectionErrors property: List relevant information about any connection errors to the Datacenters.
     *
     * @return the connectionErrors value.
     */
    public List<ConnectionError> connectionErrors() {
        return this.connectionErrors;
    }

    /**
     * Set the connectionErrors property: List relevant information about any connection errors to the Datacenters.
     *
     * @param connectionErrors the connectionErrors value to set.
     * @return the CassandraClusterPublicStatusInner object itself.
     */
    public CassandraClusterPublicStatusInner withConnectionErrors(List<ConnectionError> connectionErrors) {
        this.connectionErrors = connectionErrors;
        return this;
    }

    /**
     * Get the dataCenters property: List of the status of each datacenter in this cluster.
     *
     * @return the dataCenters value.
     */
    public List<CassandraClusterPublicStatusDataCentersItem> dataCenters() {
        return this.dataCenters;
    }

    /**
     * Set the dataCenters property: List of the status of each datacenter in this cluster.
     *
     * @param dataCenters the dataCenters value to set.
     * @return the CassandraClusterPublicStatusInner object itself.
     */
    public CassandraClusterPublicStatusInner withDataCenters(
        List<CassandraClusterPublicStatusDataCentersItem> dataCenters) {
        this.dataCenters = dataCenters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (reaperStatus() != null) {
            reaperStatus().validate();
        }
        if (connectionErrors() != null) {
            connectionErrors().forEach(e -> e.validate());
        }
        if (dataCenters() != null) {
            dataCenters().forEach(e -> e.validate());
        }
    }
}
