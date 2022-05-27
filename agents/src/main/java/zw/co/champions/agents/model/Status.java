package zw.co.champions.agents.model;

public enum Status {
    APPROVED("APPROVED"),
    CANCELLED("CANCELLED");

    private final String status;
    Status(String status){
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }
}
