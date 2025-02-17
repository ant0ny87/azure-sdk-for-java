// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;

/** Samples for CloudServiceRoleInstances List. */
public final class CloudServiceRoleInstancesListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/CloudserviceRP/stable/2022-04-04/examples/CloudServiceRolesInstance_List.json
     */
    /**
     * Sample code: List Role Instances in a Cloud Service.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listRoleInstancesInACloudService(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getCloudServiceRoleInstances()
            .list("ConstosoRG", "{cs-name}", null, Context.NONE);
    }
}
