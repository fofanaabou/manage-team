
package com.app.innovaserviceapigateway.api.model.project;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "duration"
})
@Generated("jsonschema2pojo")
public class Duration {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("duration")
    private String duration;
}
