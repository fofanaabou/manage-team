
package com.app.innovaserviceapigateway.api.model.collaborator;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "numberYear",
    "profileId"
})
@Generated("jsonschema2pojo")
public class CollaboratorProfile {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("numberYear")
    public Integer numberYear;
    @JsonProperty("profileId")
    public Integer profileId;

}
