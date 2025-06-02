package entities;

public class OutSourcedEmployee extends  Employees{

    private Double additionalChange;

    public OutSourcedEmployee(){
        super();
    }

    public OutSourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalChange) {
        super(name, hours, valuePerHour);
        this.additionalChange = additionalChange;
    }

    public Double getAdditionalChange() {
        return additionalChange;
    }

    public void setAdditionalChange(Double additionalChange) {
        this.additionalChange = additionalChange;
    }

    @Override
    public Double payment() {
        return super.payment() + additionalChange * 1.1;
    }
}
