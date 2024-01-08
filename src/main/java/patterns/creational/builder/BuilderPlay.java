package patterns.creational.builder;

//import java.util.ArrayList; // INITIAL
//import java.util.List; // INITIAL

public class BuilderPlay {

	public static void main(String[] args) {
//		Customer customer = new Customer();
//		customer.setName("John Wick");
//		Address address = new Address();
//		address.setStreetName("Viorele");
//		address.setCity("Bucuresti");
//		customer.setAddress(address);

		Customer customer = new CustomerBuilder()
                .withName("John Wick")
			.withAddress(new AddressBuilder()
				.withStreetName("Splaiul Independentei")
				.withCity("Bucuresti, Regie")
				.build())
			.build();

		System.out.println("Customer name: " + customer.getName());
		System.out.println("Customer address: " + customer.getAddress().getStreetName());
	}
}
