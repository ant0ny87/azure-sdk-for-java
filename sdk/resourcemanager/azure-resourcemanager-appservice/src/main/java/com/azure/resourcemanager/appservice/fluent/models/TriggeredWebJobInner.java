// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.models.TriggeredJobRun;
import com.azure.resourcemanager.appservice.models.WebJobType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Triggered Web Job Information. */
@Fluent
public final class TriggeredWebJobInner extends ProxyOnlyResource {
    /*
     * TriggeredWebJob resource specific properties
     */
    @JsonProperty(value = "properties")
    private TriggeredWebJobProperties innerProperties;

    /**
     * Get the innerProperties property: TriggeredWebJob resource specific properties.
     *
     * @return the innerProperties value.
     */
    private TriggeredWebJobProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public TriggeredWebJobInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the latestRun property: Latest job run information.
     *
     * @return the latestRun value.
     */
    public TriggeredJobRun latestRun() {
        return this.innerProperties() == null ? null : this.innerProperties().latestRun();
    }

    /**
     * Set the latestRun property: Latest job run information.
     *
     * @param latestRun the latestRun value to set.
     * @return the TriggeredWebJobInner object itself.
     */
    public TriggeredWebJobInner withLatestRun(TriggeredJobRun latestRun) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TriggeredWebJobProperties();
        }
        this.innerProperties().withLatestRun(latestRun);
        return this;
    }

    /**
     * Get the historyUrl property: History URL.
     *
     * @return the historyUrl value.
     */
    public String historyUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().historyUrl();
    }

    /**
     * Set the historyUrl property: History URL.
     *
     * @param historyUrl the historyUrl value to set.
     * @return the TriggeredWebJobInner object itself.
     */
    public TriggeredWebJobInner withHistoryUrl(String historyUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TriggeredWebJobProperties();
        }
        this.innerProperties().withHistoryUrl(historyUrl);
        return this;
    }

    /**
     * Get the schedulerLogsUrl property: Scheduler Logs URL.
     *
     * @return the schedulerLogsUrl value.
     */
    public String schedulerLogsUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().schedulerLogsUrl();
    }

    /**
     * Set the schedulerLogsUrl property: Scheduler Logs URL.
     *
     * @param schedulerLogsUrl the schedulerLogsUrl value to set.
     * @return the TriggeredWebJobInner object itself.
     */
    public TriggeredWebJobInner withSchedulerLogsUrl(String schedulerLogsUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TriggeredWebJobProperties();
        }
        this.innerProperties().withSchedulerLogsUrl(schedulerLogsUrl);
        return this;
    }

    /**
     * Get the runCommand property: Run command.
     *
     * @return the runCommand value.
     */
    public String runCommand() {
        return this.innerProperties() == null ? null : this.innerProperties().runCommand();
    }

    /**
     * Set the runCommand property: Run command.
     *
     * @param runCommand the runCommand value to set.
     * @return the TriggeredWebJobInner object itself.
     */
    public TriggeredWebJobInner withRunCommand(String runCommand) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TriggeredWebJobProperties();
        }
        this.innerProperties().withRunCommand(runCommand);
        return this;
    }

    /**
     * Get the url property: Job URL.
     *
     * @return the url value.
     */
    public String url() {
        return this.innerProperties() == null ? null : this.innerProperties().url();
    }

    /**
     * Set the url property: Job URL.
     *
     * @param url the url value to set.
     * @return the TriggeredWebJobInner object itself.
     */
    public TriggeredWebJobInner withUrl(String url) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TriggeredWebJobProperties();
        }
        this.innerProperties().withUrl(url);
        return this;
    }

    /**
     * Get the extraInfoUrl property: Extra Info URL.
     *
     * @return the extraInfoUrl value.
     */
    public String extraInfoUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().extraInfoUrl();
    }

    /**
     * Set the extraInfoUrl property: Extra Info URL.
     *
     * @param extraInfoUrl the extraInfoUrl value to set.
     * @return the TriggeredWebJobInner object itself.
     */
    public TriggeredWebJobInner withExtraInfoUrl(String extraInfoUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TriggeredWebJobProperties();
        }
        this.innerProperties().withExtraInfoUrl(extraInfoUrl);
        return this;
    }

    /**
     * Get the webJobType property: Job type.
     *
     * @return the webJobType value.
     */
    public WebJobType webJobType() {
        return this.innerProperties() == null ? null : this.innerProperties().webJobType();
    }

    /**
     * Set the webJobType property: Job type.
     *
     * @param webJobType the webJobType value to set.
     * @return the TriggeredWebJobInner object itself.
     */
    public TriggeredWebJobInner withWebJobType(WebJobType webJobType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TriggeredWebJobProperties();
        }
        this.innerProperties().withWebJobType(webJobType);
        return this;
    }

    /**
     * Get the error property: Error information.
     *
     * @return the error value.
     */
    public String error() {
        return this.innerProperties() == null ? null : this.innerProperties().error();
    }

    /**
     * Set the error property: Error information.
     *
     * @param error the error value to set.
     * @return the TriggeredWebJobInner object itself.
     */
    public TriggeredWebJobInner withError(String error) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TriggeredWebJobProperties();
        }
        this.innerProperties().withError(error);
        return this;
    }

    /**
     * Get the usingSdk property: Using SDK?.
     *
     * @return the usingSdk value.
     */
    public Boolean usingSdk() {
        return this.innerProperties() == null ? null : this.innerProperties().usingSdk();
    }

    /**
     * Set the usingSdk property: Using SDK?.
     *
     * @param usingSdk the usingSdk value to set.
     * @return the TriggeredWebJobInner object itself.
     */
    public TriggeredWebJobInner withUsingSdk(Boolean usingSdk) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TriggeredWebJobProperties();
        }
        this.innerProperties().withUsingSdk(usingSdk);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Property to allow or block all public traffic. Allowed Values: 'Enabled',
     * 'Disabled' or an empty string.
     *
     * @return the publicNetworkAccess value.
     */
    public String publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Property to allow or block all public traffic. Allowed Values: 'Enabled',
     * 'Disabled' or an empty string.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the TriggeredWebJobInner object itself.
     */
    public TriggeredWebJobInner withPublicNetworkAccess(String publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TriggeredWebJobProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the storageAccountRequired property: Checks if Customer provided storage account is required.
     *
     * @return the storageAccountRequired value.
     */
    public Boolean storageAccountRequired() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccountRequired();
    }

    /**
     * Set the storageAccountRequired property: Checks if Customer provided storage account is required.
     *
     * @param storageAccountRequired the storageAccountRequired value to set.
     * @return the TriggeredWebJobInner object itself.
     */
    public TriggeredWebJobInner withStorageAccountRequired(Boolean storageAccountRequired) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TriggeredWebJobProperties();
        }
        this.innerProperties().withStorageAccountRequired(storageAccountRequired);
        return this;
    }

    /**
     * Get the settings property: Job settings.
     *
     * @return the settings value.
     */
    public Map<String, Object> settings() {
        return this.innerProperties() == null ? null : this.innerProperties().settings();
    }

    /**
     * Set the settings property: Job settings.
     *
     * @param settings the settings value to set.
     * @return the TriggeredWebJobInner object itself.
     */
    public TriggeredWebJobInner withSettings(Map<String, Object> settings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TriggeredWebJobProperties();
        }
        this.innerProperties().withSettings(settings);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
