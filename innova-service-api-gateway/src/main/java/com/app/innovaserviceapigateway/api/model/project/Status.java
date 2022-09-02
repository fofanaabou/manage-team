
package com.app.innovaserviceapigateway.api.model.project;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "libelle"
})
@Generated("jsonschema2pojo")
public class Status {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("libelle")
    private String libelle;
}
