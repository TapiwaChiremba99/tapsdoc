package zw.co.champions.agents.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long policyId;
    private String VRN;
    private double insurance;
    private double licence;
    private double radioTV;
    private String agentName;
    @Enumerated(EnumType.STRING)
    private Status status;

    public Policy(String VRN,
                  double insurance,
                  double licence,
                  double radioTV,
                  String agentName,
                  Status status) {
        this.VRN = VRN;
        this.insurance = insurance;
        this.licence = licence;
        this.radioTV = radioTV;
        this.agentName = agentName;
        this.status = status;
    }
}
