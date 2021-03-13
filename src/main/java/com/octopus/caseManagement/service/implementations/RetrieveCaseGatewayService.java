package com.octopus.caseManagement.service.implementations;

import com.octopus.caseManagement.models.dbModels.Case;
import com.octopus.caseManagement.repository.CaseRepository;
import com.octopus.caseManagement.service.intefaces.IRetrieveCaseGatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


public class RetrieveCaseGatewayService implements IRetrieveCaseGatewayService {

    @Autowired
    private CaseRepository caseRepository;


    @Override
    public List<Case> retrieveAllCases() {
         return caseRepository.findAll();
    }
}
