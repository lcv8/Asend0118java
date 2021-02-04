package mybatis01.testmybatis.associa_1.entity;

public class Address {
    private Integer aId;
    private String addressh;

    public Address() {
    }

    public Address(Integer aId, String addressh) {
        this.aId = aId;
        this.addressh = addressh;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getAddressh() {
        return addressh;
    }

    public void setAddressh(String addressh) {
        this.addressh = addressh;
    }

    @Override
    public String toString() {
        return "Address{" +
                "aId=" + aId +
                ", addressh='" + addressh + '\'' +
                '}';
    }
}
