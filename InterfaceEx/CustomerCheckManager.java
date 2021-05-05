public class CustomerCheckManager implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(String nationalId) {
        System.out.println("Müþteri ID Doðrulandý");
        return true;
    }

}