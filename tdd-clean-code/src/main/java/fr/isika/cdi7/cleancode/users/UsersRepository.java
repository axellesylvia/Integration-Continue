package fr.isika.cdi7.cleancode.users;

import java.util.List;
import java.util.Optional;

public class UsersRepository {

	private List<User> users;

	public UsersRepository(final List<User> users) {
		this.users = users;
	}

	public Optional<User> getUserByType(final UserType typeExpected) {
		if (typeExpected == null || users.isEmpty())
			return Optional.empty();
		
		return users.stream()
				.filter(u -> isTypeEqualToGiven(typeExpected, u))
				.findFirst();
	}

	private boolean isTypeEqualToGiven(final UserType typeExpected, User userToCheck) {
		return userToCheck.getType() != null 
				&& userToCheck.getType().equals(typeExpected);
	}

}
