package fr.isika.cdi7.cleancode.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import fr.isika.cdi7.cleancode.users.User;
import fr.isika.cdi7.cleancode.users.UserType;
import fr.isika.cdi7.cleancode.users.UsersRepository;

public class UsersRepositoryTest {

	@Test
	public void shouldNotFindUserByNullType() {
		List<User> users = Collections.emptyList();
		UsersRepository repository = new UsersRepository(users);
		assertFalse(repository.getUserByType(null).isPresent());
	}
	
	@Test
	public void shouldNotFindUser() {
		List<User> users = Collections.emptyList();
		UsersRepository repository = new UsersRepository(users);
		assertFalse(repository.getUserByType(UserType.ADMIN).isPresent());
	}
	
	@Test
	public void shouldNotFindUserWithoutType() {
		User expectedUser = new User();
		List<User> users = new ArrayList<>();
		users.add(expectedUser);
		
		UsersRepository repository = new UsersRepository(users);
		assertFalse(repository.getUserByType(UserType.ADMIN).isPresent());
	}
	
	@Test
	public void shouldFindOneAdminUser() {
		UsersRepository repository = new UsersRepository(Arrays.asList(new User(UserType.ADMIN)));
		assertEquals(new User(UserType.ADMIN), repository.getUserByType(UserType.ADMIN).get());
	}

	@Test
	public void shouldFindNoAdminUser() {
		List<User> users = new ArrayList<>();
		users.add(new User(UserType.ADMIN));
		
		UsersRepository repository = new UsersRepository(users);
		assertFalse(repository.getUserByType(UserType.DONOR).isPresent());
	}
	
	@Test
	public void shouldFilterUsers() {
		List<User> users = new ArrayList<>();
		users.add(new User(UserType.ADMIN));
		users.add(new User(UserType.DONOR));
		
		UsersRepository repository = new UsersRepository(users);
		assertEquals(users.get(0), repository.getUserByType(UserType.ADMIN).get());
		assertEquals(users.get(1), repository.getUserByType(UserType.DONOR).get());
	}
}
