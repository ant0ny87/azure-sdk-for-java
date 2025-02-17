// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.containers.containerregistry.models.OciAnnotations;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Returns the requested OCI index file. */
@Fluent
public final class OCIIndex extends Manifest {
    /*
     * List of OCI image layer information
     */
    @JsonProperty(value = "manifests")
    private List<ManifestListAttributes> manifests;

    /*
     * Additional information provided through arbitrary metadata.
     */
    @JsonProperty(value = "annotations")
    private OciAnnotations annotations;

    /** Creates an instance of OCIIndex class. */
    public OCIIndex() {}

    /**
     * Get the manifests property: List of OCI image layer information.
     *
     * @return the manifests value.
     */
    public List<ManifestListAttributes> getManifests() {
        return this.manifests;
    }

    /**
     * Set the manifests property: List of OCI image layer information.
     *
     * @param manifests the manifests value to set.
     * @return the OCIIndex object itself.
     */
    public OCIIndex setManifests(List<ManifestListAttributes> manifests) {
        this.manifests = manifests;
        return this;
    }

    /**
     * Get the annotations property: Additional information provided through arbitrary metadata.
     *
     * @return the annotations value.
     */
    public OciAnnotations getAnnotations() {
        return this.annotations;
    }

    /**
     * Set the annotations property: Additional information provided through arbitrary metadata.
     *
     * @param annotations the annotations value to set.
     * @return the OCIIndex object itself.
     */
    public OCIIndex setAnnotations(OciAnnotations annotations) {
        this.annotations = annotations;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OCIIndex setSchemaVersion(Integer schemaVersion) {
        super.setSchemaVersion(schemaVersion);
        return this;
    }
}
