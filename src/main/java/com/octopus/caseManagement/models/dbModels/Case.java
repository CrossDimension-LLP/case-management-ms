package com.octopus.caseManagement.models.dbModels;

import com.octopus.caseManagement.models.schemaModels.ClientIndividual;
import com.octopus.caseManagement.models.schemaModels.Employee;
import com.octopus.caseManagement.models.schemaModels.FunctionalUnit;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "com.octopus.ticket")
public class Case {
    @Id
    private String id;
    private String name;
    private String title;
    private String description;
    private String priority;
    private String severity;
    private String caseType;
    private String caseSubType;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private FunctionalUnit functionalUnit;
    private Employee assignee;
    private ClientIndividual owner;

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getCaseType() {
        return caseType;
    }

    public String getCaseSubType() {
        return caseSubType;
    }

    public void setCaseSubType(String caseSubType) {
        this.caseSubType = caseSubType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public FunctionalUnit getFunctionalUnit() {
        return functionalUnit;
    }

    public void setFunctionalUnit(FunctionalUnit functionalUnit) {
        this.functionalUnit = functionalUnit;
    }

    public Employee getAssignee() {
        return assignee;
    }

    public void setAssignee(Employee assignee) {
        this.assignee = assignee;
    }

    public ClientIndividual getOwner() {
        return owner;
    }

    public void setOwner(ClientIndividual owner) {
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Case() {
    }
}
