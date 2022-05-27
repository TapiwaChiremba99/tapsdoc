package zw.co.champions.agents.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.champions.agents.model.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Long> {
    Policy findByPolicyId(Policy policy);
    Policy findByVRN(String policyId);


}
