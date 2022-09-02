
package com.app.innovaserviceapigateway.api.model.project;

import java.util.List;
import javax.annotation.Generated;

import com.app.innovaserviceapigateway.api.model.project.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
@JsonPropertyOrder({
    "id",
    "titre",
    "description",
    "project",
    "duration",
    "priority",
    "statut",
    "profileEligibles"
})
@Generated("jsonschema2pojo")
public class Subject {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("titre")
    private String titre;
    @JsonProperty("description")
    private String description;
    @JsonProperty("project")
    private Project project;
    @JsonProperty("duration")
    private Duration duration;
    @JsonProperty("priority")
    private Priority priority;
    @JsonProperty("status")
    private Status status;
    @JsonProperty("profileEligibles")
    private List<ProfileEligible> profileEligibles;
}
