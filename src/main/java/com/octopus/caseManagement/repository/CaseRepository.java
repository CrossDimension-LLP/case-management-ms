package com.octopus.caseManagement.repository;

import com.octopus.caseManagement.models.dbModels.Case;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CaseRepository extends MongoRepository<Case, String> {
}
