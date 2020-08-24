package org.javacream.training.java.overview;

public class Person {

	private String lastname;
	private String firstname;
	private Integer height;
	private Integer id;
	private Address address;
	public String sayHello() {
		return "Hallo";
	}
	@Override
	public String toString() {
		return "Person [lastname=" + lastname + ", firstname=" + firstname + ", height=" + height + ", id=" + id
				+ ", address=" + address + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}
	public Person(String lastname, String firstname, Integer id) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.id = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		if (height < 50 || height > 280) {
			throw new IllegalArgumentException();
		}
		this.height = height;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getFirstname() {
		return firstname;
	}
	public Integer getId() {
		return id;
	}
}
