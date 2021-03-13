package com.octopus.caseManagement.resolver;

import com.octopus.caseManagement.models.dbModels.Case;
import com.octopus.caseManagement.service.intefaces.IRetrieveCaseGatewayService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;



public class Query implements GraphQLQueryResolver {

    @Autowired
    private IRetrieveCaseGatewayService retrieveCaseGatewayService;

    public List<Case> allCases() {
        return retrieveCaseGatewayService.retrieveAllCases();
    }
}
