package edu.eci.cvds.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.cvds.model.Users;
import edu.eci.cvds.repositories.UsersRepository;



@Service
public class UsersService {
	
	private final UsersRepository usersRepository;
	
	@Autowired
	public UsersService(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}
	
	public Users addUsers(Users users) {
		return usersRepository.save(users);
	}
	
	public Users getUsers(String UsersId) {
		return usersRepository.findById(UsersId).get();
	}
	
	public java.util.List<Users> getAllUserss() {
		return usersRepository.findAll();
	}
	
	public Users updateUsers(Users Users) {
		if(usersRepository.existsById(Users.getUsuario())) {
			return usersRepository.save(Users);
		}
		
		return null;
	}
	
	public void deleteUsers(String UsersId) {
		usersRepository.deleteById(UsersId);
	}	
}