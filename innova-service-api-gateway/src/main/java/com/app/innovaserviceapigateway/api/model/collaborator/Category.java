
package com.app.innovaserviceapigateway.api.model.collaborator;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "libelle",
    "id"
})
@Generated("jsonschema2pojo")
public class Category {

    @JsonProperty("libelle")
    public String libelle;
    @JsonProperty("id")
    public Integer id;

}
