// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.Compute;
import com.azure.resourcemanager.machinelearning.models.ComputeResourceSchema;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComputeResourceSchemaTests {
    @Test
    public void testDeserialize() {
        ComputeResourceSchema model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"computeType\":\"Compute\",\"computeLocation\":\"lqidyby\",\"provisioningState\":\"Updating\",\"description\":\"clha\",\"createdOn\":\"2021-03-19T01:34:05Z\",\"modifiedOn\":\"2021-01-19T10:24:33Z\",\"resourceId\":\"p\",\"provisioningErrors\":[],\"isAttachedCompute\":true,\"disableLocalAuth\":false}}")
                .toObject(ComputeResourceSchema.class);
        Assertions.assertEquals("lqidyby", model.properties().computeLocation());
        Assertions.assertEquals("clha", model.properties().description());
        Assertions.assertEquals("p", model.properties().resourceId());
        Assertions.assertEquals(false, model.properties().disableLocalAuth());
    }

    @Test
    public void testSerialize() {
        ComputeResourceSchema model =
            new ComputeResourceSchema()
                .withProperties(
                    new Compute()
                        .withComputeLocation("lqidyby")
                        .withDescription("clha")
                        .withResourceId("p")
                        .withDisableLocalAuth(false));
        model = BinaryData.fromObject(model).toObject(ComputeResourceSchema.class);
        Assertions.assertEquals("lqidyby", model.properties().computeLocation());
        Assertions.assertEquals("clha", model.properties().description());
        Assertions.assertEquals("p", model.properties().resourceId());
        Assertions.assertEquals(false, model.properties().disableLocalAuth());
    }
}
