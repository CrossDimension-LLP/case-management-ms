package com.octopus.caseManagement.resolver;

import com.octopus.caseManagement.models.dbModels.Case;
import com.octopus.caseManagement.models.input.CreateCaseInput;
import com.octopus.caseManagement.service.intefaces.ICreateCaseGatewayService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;


public class Mutation implements GraphQLMutationResolver {

    @Autowired
    private ICreateCaseGatewayService createCaseGatewayService;

    public Case createCase(CreateCaseInput createCaseInput){
        return createCaseGatewayService.createCase(createCaseInput);
    }
}
