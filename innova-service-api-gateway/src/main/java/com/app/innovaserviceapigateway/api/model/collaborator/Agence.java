
package com.app.innovaserviceapigateway.api.model.collaborator;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "ville",
    "telephoneAgence"
})
@Generated("jsonschema2pojo")
public class Agence {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("ville")
    public String ville;
    @JsonProperty("telephoneAgence")
    public Object telephoneAgence;

}
