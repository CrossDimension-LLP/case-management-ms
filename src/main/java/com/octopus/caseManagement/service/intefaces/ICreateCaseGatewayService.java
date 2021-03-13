package com.octopus.caseManagement.service.intefaces;

import com.octopus.caseManagement.models.dbModels.Case;
import com.octopus.caseManagement.models.input.CreateCaseInput;

public interface ICreateCaseGatewayService {
    public Case createCase(CreateCaseInput createCaseInput);
}
