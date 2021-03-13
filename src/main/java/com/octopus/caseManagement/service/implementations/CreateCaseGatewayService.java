package com.octopus.caseManagement.service.implementations;

import com.octopus.caseManagement.mappers.interfaces.IMapCaseInputToCaseDbModel;
import com.octopus.caseManagement.models.dbModels.Case;
import com.octopus.caseManagement.models.input.CreateCaseInput;
import com.octopus.caseManagement.repository.CaseRepository;
import com.octopus.caseManagement.service.intefaces.ICreateCaseGatewayService;
import org.springframework.beans.factory.annotation.Autowired;


public class CreateCaseGatewayService implements ICreateCaseGatewayService {

    @Autowired
    private CaseRepository caseRepository;

    @Autowired
    private IMapCaseInputToCaseDbModel mapCaseInputToCaseDbModel;

    @Override
    public Case createCase(CreateCaseInput createCaseInput) {
        Case dbCaseModel = mapCaseInputToCaseDbModel.mapCaseInputToCaseDb(createCaseInput);
        caseRepository.save(dbCaseModel);
        return dbCaseModel;
    }
}
