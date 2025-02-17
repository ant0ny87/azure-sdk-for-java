// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

/** Samples for WebPubSubSharedPrivateLinkResources CreateOrUpdate. */
public final class WebPubSubSharedPrivateLinkResourcesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/webpubsub/resource-manager/Microsoft.SignalRService/preview/2022-08-01-preview/examples/WebPubSubSharedPrivateLinkResources_CreateOrUpdate.json
     */
    /**
     * Sample code: WebPubSubSharedPrivateLinkResources_CreateOrUpdate.
     *
     * @param manager Entry point to WebPubSubManager.
     */
    public static void webPubSubSharedPrivateLinkResourcesCreateOrUpdate(
        com.azure.resourcemanager.webpubsub.WebPubSubManager manager) {
        manager
            .webPubSubSharedPrivateLinkResources()
            .define("upstream")
            .withExistingWebPubSub("myResourceGroup", "myWebPubSubService")
            .withGroupId("sites")
            .withPrivateLinkResourceId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/myResourceGroup/providers/Microsoft.Web/sites/myWebApp")
            .withRequestMessage("Please approve")
            .create();
    }
}
