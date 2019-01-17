public class Manager extends Employee{

    public Manager(Integer idNum) {
        super(idNum);
    }

    @Override
    public boolean hasAdministratorRights(){
        return true;
    }




}
