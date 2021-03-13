package com.octopus.caseManagement.service.intefaces;

import com.octopus.caseManagement.models.dbModels.Case;

import java.util.List;

public interface IRetrieveCaseGatewayService {
    List<Case> retrieveAllCases();
}
