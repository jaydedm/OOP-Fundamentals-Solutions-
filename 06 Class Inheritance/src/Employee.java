public class Employee {

    private Integer idNumber;

    public Integer getIdNumber() {
        return idNumber;
    }

    public Employee(Integer idNum){
        this.idNumber = idNum;
    }

    public boolean hasAdministratorRights(){
        return false;
    }

    @Override
    public boolean equals(Object o){

        Employee other = (Employee) o;;
        return idNumber == other.getIdNumber();

    }

}
