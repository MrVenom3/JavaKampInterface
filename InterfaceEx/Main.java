import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Customer senpai=new Customer();
        senpai.setId(1);
        senpai.setFirstName("Batuhan");
        senpai.setLastName("Yalçınkaya");
        senpai.setDateOfBirth(LocalDate.parse("2001-03-03"));
        senpai.setNationalIdentity("1904040");
        BaseCustomerManager base=new StarbucksCustomerManager(new CustomerCheckManager());
        BaseCustomerManager nero=new NeroCustomerManager();
        nero.delete(senpai);
        base.add(senpai);
        base.getall(senpai);

    }

}
