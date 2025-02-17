// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.FlowAccessControlConfiguration;
import com.azure.resourcemanager.appservice.models.FlowEndpointsConfiguration;
import com.azure.resourcemanager.appservice.models.ResourceReference;
import com.azure.resourcemanager.appservice.models.WorkflowParameter;
import com.azure.resourcemanager.appservice.models.WorkflowProvisioningState;
import com.azure.resourcemanager.appservice.models.WorkflowSku;
import com.azure.resourcemanager.appservice.models.WorkflowState;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** The workflow version properties. */
@Fluent
public final class WorkflowVersionProperties {
    /*
     * The provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private WorkflowProvisioningState provisioningState;

    /*
     * Gets the created time.
     */
    @JsonProperty(value = "createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdTime;

    /*
     * Gets the changed time.
     */
    @JsonProperty(value = "changedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime changedTime;

    /*
     * The state.
     */
    @JsonProperty(value = "state")
    private WorkflowState state;

    /*
     * Gets the version.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * Gets the access endpoint.
     */
    @JsonProperty(value = "accessEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String accessEndpoint;

    /*
     * The endpoints configuration.
     */
    @JsonProperty(value = "endpointsConfiguration")
    private FlowEndpointsConfiguration endpointsConfiguration;

    /*
     * The access control configuration.
     */
    @JsonProperty(value = "accessControl")
    private FlowAccessControlConfiguration accessControl;

    /*
     * The sku.
     */
    @JsonProperty(value = "sku", access = JsonProperty.Access.WRITE_ONLY)
    private WorkflowSku sku;

    /*
     * The integration account.
     */
    @JsonProperty(value = "integrationAccount")
    private ResourceReference integrationAccount;

    /*
     * The definition.
     */
    @JsonProperty(value = "definition")
    private Object definition;

    /*
     * The parameters.
     */
    @JsonProperty(value = "parameters")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, WorkflowParameter> parameters;

    /**
     * Get the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    public WorkflowProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the createdTime property: Gets the created time.
     *
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get the changedTime property: Gets the changed time.
     *
     * @return the changedTime value.
     */
    public OffsetDateTime changedTime() {
        return this.changedTime;
    }

    /**
     * Get the state property: The state.
     *
     * @return the state value.
     */
    public WorkflowState state() {
        return this.state;
    }

    /**
     * Set the state property: The state.
     *
     * @param state the state value to set.
     * @return the WorkflowVersionProperties object itself.
     */
    public WorkflowVersionProperties withState(WorkflowState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the version property: Gets the version.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the accessEndpoint property: Gets the access endpoint.
     *
     * @return the accessEndpoint value.
     */
    public String accessEndpoint() {
        return this.accessEndpoint;
    }

    /**
     * Get the endpointsConfiguration property: The endpoints configuration.
     *
     * @return the endpointsConfiguration value.
     */
    public FlowEndpointsConfiguration endpointsConfiguration() {
        return this.endpointsConfiguration;
    }

    /**
     * Set the endpointsConfiguration property: The endpoints configuration.
     *
     * @param endpointsConfiguration the endpointsConfiguration value to set.
     * @return the WorkflowVersionProperties object itself.
     */
    public WorkflowVersionProperties withEndpointsConfiguration(FlowEndpointsConfiguration endpointsConfiguration) {
        this.endpointsConfiguration = endpointsConfiguration;
        return this;
    }

    /**
     * Get the accessControl property: The access control configuration.
     *
     * @return the accessControl value.
     */
    public FlowAccessControlConfiguration accessControl() {
        return this.accessControl;
    }

    /**
     * Set the accessControl property: The access control configuration.
     *
     * @param accessControl the accessControl value to set.
     * @return the WorkflowVersionProperties object itself.
     */
    public WorkflowVersionProperties withAccessControl(FlowAccessControlConfiguration accessControl) {
        this.accessControl = accessControl;
        return this;
    }

    /**
     * Get the sku property: The sku.
     *
     * @return the sku value.
     */
    public WorkflowSku sku() {
        return this.sku;
    }

    /**
     * Get the integrationAccount property: The integration account.
     *
     * @return the integrationAccount value.
     */
    public ResourceReference integrationAccount() {
        return this.integrationAccount;
    }

    /**
     * Set the integrationAccount property: The integration account.
     *
     * @param integrationAccount the integrationAccount value to set.
     * @return the WorkflowVersionProperties object itself.
     */
    public WorkflowVersionProperties withIntegrationAccount(ResourceReference integrationAccount) {
        this.integrationAccount = integrationAccount;
        return this;
    }

    /**
     * Get the definition property: The definition.
     *
     * @return the definition value.
     */
    public Object definition() {
        return this.definition;
    }

    /**
     * Set the definition property: The definition.
     *
     * @param definition the definition value to set.
     * @return the WorkflowVersionProperties object itself.
     */
    public WorkflowVersionProperties withDefinition(Object definition) {
        this.definition = definition;
        return this;
    }

    /**
     * Get the parameters property: The parameters.
     *
     * @return the parameters value.
     */
    public Map<String, WorkflowParameter> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameters.
     *
     * @param parameters the parameters value to set.
     * @return the WorkflowVersionProperties object itself.
     */
    public WorkflowVersionProperties withParameters(Map<String, WorkflowParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endpointsConfiguration() != null) {
            endpointsConfiguration().validate();
        }
        if (accessControl() != null) {
            accessControl().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
        if (integrationAccount() != null) {
            integrationAccount().validate();
        }
        if (parameters() != null) {
            parameters()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
