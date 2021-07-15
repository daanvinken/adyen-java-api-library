/*
 *                       ######
 *                       ######
 * ############    ####( ######  #####. ######  ############   ############
 * #############  #####( ######  #####. ######  #############  #############
 *        ######  #####( ######  #####. ######  #####  ######  #####  ######
 * ###### ######  #####( ######  #####. ######  #####  #####   #####  ######
 * ###### ######  #####( ######  #####. ######  #####          #####  ######
 * #############  #############  #############  #############  #####  ######
 *  ############   ############  #############   ############  #####  ######
 *                                      ######
 *                               #############
 *                               ############
 *
 * Adyen Java API Library
 *
 * Copyright (c) 2021 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */
package com.adyen.model.management;

import com.adyen.model.management.links.Links;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

import static com.adyen.util.Util.toIndentedString;

/**
 * CreateAllowedOriginRequest
 */

public class CreateAllowedOriginRequest {
    @SerializedName("_links")
    @JsonProperty("_links")
    private Links links = null;

    @SerializedName("domain")
    private String domain = null;

    @SerializedName("id")
    private String id = null;

    public CreateAllowedOriginRequest links(Links links) {
        this.links = links;
        return this;
    }

    /**
     * Get links
     *
     * @return links
     **/
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public CreateAllowedOriginRequest domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * The domain for this allowed origin.
     *
     * @return domain
     **/
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public CreateAllowedOriginRequest id(String id) {
        this.id = id;
        return this;
    }

    /**
     * id of the allowedOrigin
     *
     * @return id
     **/
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAllowedOriginRequest createAllowedOriginRequest = (CreateAllowedOriginRequest) o;
        return Objects.equals(this.links, createAllowedOriginRequest.links) &&
                Objects.equals(this.domain, createAllowedOriginRequest.domain) &&
                Objects.equals(this.id, createAllowedOriginRequest.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, domain, id);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAllowedOriginRequest {\n");

        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("}");
        return sb.toString();
    }

}