package com.octopus.caseManagement.mappers.interfaces;

import com.octopus.caseManagement.models.dbModels.Case;
import com.octopus.caseManagement.models.input.CreateCaseInput;

public interface IMapCaseInputToCaseDbModel {
    public Case mapCaseInputToCaseDb(CreateCaseInput createCaseInput);
}
