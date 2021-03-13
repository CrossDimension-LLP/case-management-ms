package com.octopus.caseManagement.config;

import com.octopus.caseManagement.businessLogic.implementations.UtilityLogic;
import com.octopus.caseManagement.businessLogic.interfaces.IUtilityLogic;
import com.octopus.caseManagement.mappers.implementations.MapCaseInputToCaseDbModel;
import com.octopus.caseManagement.mappers.interfaces.IMapCaseInputToCaseDbModel;
import com.octopus.caseManagement.resolver.Mutation;
import com.octopus.caseManagement.resolver.Query;
import com.octopus.caseManagement.service.implementations.CreateCaseGatewayService;
import com.octopus.caseManagement.service.implementations.RetrieveCaseGatewayService;
import com.octopus.caseManagement.service.intefaces.ICreateCaseGatewayService;
import com.octopus.caseManagement.service.intefaces.IRetrieveCaseGatewayService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfiguration {

  @Bean
  public IMapCaseInputToCaseDbModel mapCaseInputToCaseDbModel() {
      return new MapCaseInputToCaseDbModel();
  }

  @Bean
  public IRetrieveCaseGatewayService retrieveCaseGatewayService() {
      return new RetrieveCaseGatewayService();
  }

  @Bean
  public ICreateCaseGatewayService createCaseGatewayService() {
      return new CreateCaseGatewayService();
  }

  @Bean
  public Query query() {
      return new Query();
  }

  @Bean
  public Mutation mutation() {
      return new Mutation();
  }


  @Bean
  public IUtilityLogic utilityLogic() {
      return new UtilityLogic();
  }
}
