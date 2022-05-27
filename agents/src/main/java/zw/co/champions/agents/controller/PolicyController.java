package zw.co.champions.agents.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.co.champions.agents.model.Policy;
import zw.co.champions.agents.repository.PolicyRepository;
import zw.co.champions.agents.service.PolicyService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class PolicyController {

    @Autowired
    private PolicyService policyService;
    @Autowired
    private PolicyRepository policyRepository;

    @GetMapping("/policies")
    public ResponseEntity<List<Policy>> getPolicies(){
        return ResponseEntity.ok().body(policyService.getAllPolicies());
    }

    @PostMapping("/policy")
    public ResponseEntity<Policy> savePolicy(@RequestBody Policy policy){
        return ResponseEntity.ok().body(policyService.savePolicy(policy));
    }


}
