package zw.co.champions.agents.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zw.co.champions.agents.model.Policy;
import zw.co.champions.agents.repository.PolicyRepository;


import java.util.List;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class PolicyServiceImplementation implements PolicyService {

    private final PolicyRepository policyRepository;

    @Override
    public Policy savePolicy(Policy policy) {
        log.info("Saving policy");
        return policyRepository.save(policy);
    }

    @Override
    public Policy getPolicy(Policy policy) {
        log.info("Loading policy");
        return policyRepository.findByPolicyId(policy);
    }

    @Override
    public List<Policy> getAllPolicies() {
        log.info("Loading all policies");
        return policyRepository.findAll();
    }

    @Override
    public Policy updatePolicy(Policy policy) {
        log.info("Updating policy");
        return policyRepository.save(policy);
    }
}
