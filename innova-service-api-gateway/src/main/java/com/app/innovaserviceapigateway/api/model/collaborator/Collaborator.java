
package com.app.innovaserviceapigateway.api.model.collaborator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
public class Collaborator {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("agence")
    public Agence agence;
    @JsonProperty("category")
    public Category category;
    @JsonProperty("nom")
    public String nom;
    @JsonProperty("prenom")
    public String prenom;
    @JsonProperty("email")
    public String email;
    @JsonProperty("telephone")
    public String telephone;
    @JsonProperty("date_debut_carriere")
    public String dateDebutCarriere;
    @JsonProperty("urlCv")
    public Object urlCv;
    @JsonProperty("manager")
    public Collaborator manager;
    @JsonProperty("collaboratorProfiles")
    public List<CollaboratorProfile> collaboratorProfiles;

}
