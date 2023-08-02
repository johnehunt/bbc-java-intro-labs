package uk.co.bbc.bookshop.data;

public class Publisher extends Contact implements PrettyPrinter {

	private String organisation;

	public Publisher(String name, Address address, String organisation) {
		super(name, address);
		this.organisation = organisation;
	}


	public String getOrganisation() {
		return organisation;
	}

	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}

	@Override
	public String toString() {
		return String.format("Publisher %s, organisation=%s", organisation, super.toString());
	}

	public void prettyPrint() {
		System.out.printf("Publisher [name=%s, address=%s]", getName(), getAddress());
	}

}
