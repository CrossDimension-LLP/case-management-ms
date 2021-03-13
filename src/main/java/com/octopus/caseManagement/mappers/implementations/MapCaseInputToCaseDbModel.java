package com.octopus.caseManagement.mappers.implementations;

import com.octopus.caseManagement.businessLogic.interfaces.IUtilityLogic;
import com.octopus.caseManagement.mappers.interfaces.IMapCaseInputToCaseDbModel;
import com.octopus.caseManagement.models.dbModels.Case;
import com.octopus.caseManagement.models.input.CreateCaseInput;
import com.octopus.caseManagement.models.schemaModels.ClientIndividual;
import com.octopus.caseManagement.models.schemaModels.Employee;
import com.octopus.caseManagement.models.schemaModels.FunctionalUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;


public class MapCaseInputToCaseDbModel implements IMapCaseInputToCaseDbModel {

    @Value("${octopus.configuration.apigw.url}")
    private String hostName;
    @Value("${octopus.configuration.foreignClient.functionalUnit_MS.endpoint}")
    private String endpoint;

    @Autowired
    private IUtilityLogic utilityLogic;


    @Override
    public Case mapCaseInputToCaseDb(CreateCaseInput createCaseInput) {

        /***
            *Hard coded URL for Using REST Template for Inter MicroServices communication
             @URL - value annotation
         ***/
        String queryParams = "?subType={caseSubType}";
        Map<String, String> queryVariables = new HashMap<>();
        queryVariables.put("caseSubType", createCaseInput.getCaseSubType());
        String URL = hostName + endpoint + queryParams;
        RestTemplate restTemplate = new RestTemplate();
        FunctionalUnit[] functionalUnit = restTemplate.getForObject(URL, FunctionalUnit[].class, queryVariables);

        Case caseToSave = new Case();
        caseToSave.setId("Ticket_"+utilityLogic.IdGenerator());
        caseToSave.setTitle(createCaseInput.getTitle());
        caseToSave.setName(createCaseInput.getName());
        caseToSave.setDescription(createCaseInput.getDescription());
        caseToSave.setCaseType(createCaseInput.getCaseType());
        caseToSave.setSeverity(createCaseInput.getSeverity());
        caseToSave.setPriority(createCaseInput.getPriority());
        caseToSave.setStatus("New");
        caseToSave.setFunctionalUnit(functionalUnit[0]);
        caseToSave.setCaseSubType(createCaseInput.getCaseSubType());

        /* Creating Singleton Object class in the DB for future assignment */
        ClientIndividual clientIndividual = new ClientIndividual();
        Employee employee = new Employee();

        caseToSave.setAssignee(employee);
        caseToSave.setOwner(clientIndividual);

        return caseToSave;

    }
}
