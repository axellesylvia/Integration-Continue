package fr.isika.cdi7.cleancode.users;

public class User {

	private UserType type;

	public User(UserType type) {
		this.type = type;
	}

	public User() {
	}

	public UserType getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return "User [type=" + type + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (type != other.type)
			return false;
		return true;
	}

}
