
package com.app.innovaserviceapigateway.api.model.affectation;

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
public class Profile {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("libelle")
    public String libelle;

}
