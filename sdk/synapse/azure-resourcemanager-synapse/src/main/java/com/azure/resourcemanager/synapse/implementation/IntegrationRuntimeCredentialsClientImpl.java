// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.synapse.fluent.IntegrationRuntimeCredentialsClient;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in IntegrationRuntimeCredentialsClient. */
public final class IntegrationRuntimeCredentialsClientImpl implements IntegrationRuntimeCredentialsClient {
    /** The proxy service used to perform REST calls. */
    private final IntegrationRuntimeCredentialsService service;

    /** The service client containing this operation class. */
    private final SynapseManagementClientImpl client;

    /**
     * Initializes an instance of IntegrationRuntimeCredentialsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    IntegrationRuntimeCredentialsClientImpl(SynapseManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    IntegrationRuntimeCredentialsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SynapseManagementClientIntegrationRuntimeCredentials to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SynapseManagementCli")
    private interface IntegrationRuntimeCredentialsService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces"
                + "/{workspaceName}/integrationRuntimes/{integrationRuntimeName}/syncCredentials")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> sync(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("integrationRuntimeName") String integrationRuntimeName,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Force the integration runtime to synchronize credentials across integration runtime nodes, and this will override
     * the credentials across all worker nodes with those available on the dispatcher node. If you already have the
     * latest credential backup file, you should manually import it (preferred) on any self-hosted integration runtime
     * node than using this API directly.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> syncWithResponseAsync(
        String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (integrationRuntimeName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null."));
        }
        final String apiVersion = "2021-06-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .sync(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            integrationRuntimeName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Force the integration runtime to synchronize credentials across integration runtime nodes, and this will override
     * the credentials across all worker nodes with those available on the dispatcher node. If you already have the
     * latest credential backup file, you should manually import it (preferred) on any self-hosted integration runtime
     * node than using this API directly.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> syncWithResponseAsync(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (integrationRuntimeName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null."));
        }
        final String apiVersion = "2021-06-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .sync(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                integrationRuntimeName,
                accept,
                context);
    }

    /**
     * Force the integration runtime to synchronize credentials across integration runtime nodes, and this will override
     * the credentials across all worker nodes with those available on the dispatcher node. If you already have the
     * latest credential backup file, you should manually import it (preferred) on any self-hosted integration runtime
     * node than using this API directly.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> syncAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        return syncWithResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Force the integration runtime to synchronize credentials across integration runtime nodes, and this will override
     * the credentials across all worker nodes with those available on the dispatcher node. If you already have the
     * latest credential backup file, you should manually import it (preferred) on any self-hosted integration runtime
     * node than using this API directly.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void sync(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        syncAsync(resourceGroupName, workspaceName, integrationRuntimeName).block();
    }

    /**
     * Force the integration runtime to synchronize credentials across integration runtime nodes, and this will override
     * the credentials across all worker nodes with those available on the dispatcher node. If you already have the
     * latest credential backup file, you should manually import it (preferred) on any self-hosted integration runtime
     * node than using this API directly.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> syncWithResponse(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context) {
        return syncWithResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName, context).block();
    }
}
