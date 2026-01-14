package StudentRecordManagement;

public class Record {

    private String name;
    private int idNumber;
    private int contractNumber;

    public Record(String name,int idNumber,int contractNumber){
        this.name = name;
        this.idNumber = idNumber;
        this.contractNumber = contractNumber;
    }

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    @Override
    public String toString(){
        return "Records{}" + "name=" + name + ", idNumber=" + idNumber + ", contactNumber=" + contractNumber + '}';
    }
}
