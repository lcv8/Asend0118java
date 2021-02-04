package mybatis01.testmybatis.associa_1.entity;


import mybatis01.testmybatis.associa_1.dao.AddressDao;

public class Card {
    private Integer cId;
    private String cNum;
    private Integer aId;
    private Address address;

    public Card() {
    }

    @Override
    public String toString() {
        return "Card{" +
                "cId=" + cId +
                ", cNum='" + cNum + '\'' +
                ", aId=" + aId +
                '}';
    }

    public Card(Integer cId, String cNum, Integer aId, Address address) {
        this.cId = cId;
        this.cNum = cNum;
        this.aId = aId;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcNum() {
        return cNum;
    }

    public void setcNum(String cNum) {
        this.cNum = cNum;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }
}
