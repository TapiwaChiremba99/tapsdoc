package zw.co.champions.agents.service;

import zw.co.champions.agents.model.Policy;

import java.util.List;

public interface PolicyService {

    Policy savePolicy(Policy policy);
    Policy getPolicy(Policy policy);
    List<Policy> getAllPolicies();
    Policy updatePolicy(Policy policy);

}
