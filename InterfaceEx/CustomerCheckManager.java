public class CustomerCheckManager implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(String nationalId) {
        System.out.println("M��teri ID Do�ruland�");
        return true;
    }

}