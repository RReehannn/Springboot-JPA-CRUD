package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

		/*
		 * for Single user
		 * 
		 * User user2 = new User();
		 * 
		 * user2.setName("Nitish Kumar"); user2.setCity("Nalanda");
		 * user2.setStatus("I am cheif minister");
		 * 
		 * User resultuser = userRepository.save(user2);
		 * System.out.println("saved user "+resultuser);
		 */

		
		/*
		 * User user3 = new User();
		 * 
		 * user3.setName("Sushil Modi"); user3.setCity("Muzzafarpur");
		 * user3.setStatus("I am ex dupty-cheif minister");
		 * 
		 * User user4 = new User();
		 * 
		 * user4.setName("Prem Chander Mishra"); user4.setCity("Darbhanga");
		 * user4.setStatus("I am congress leader");
		 * 
		 * User user5 = new User();
		 * 
		 * user5.setName("Pappu Yadav"); user5.setCity("Purnai");
		 * user5.setStatus("I am Independ");
		 * 
		 * 
		 * 
		 * 
		 * // Saving Multiple user at a time
		 * 
		 * List<User> users = List.of(user3, user4, user5); Iterable<User> result =
		 * userRepository.saveAll(users);
		 * 
		 * result.forEach(user -> { System.out.println(user);
		 * 
		 * });
		 */
		
		
		
		/*
		 * //update the Data Optional<User> optional = userRepository.findById(2); User
		 * user = optional.get();
		 * 
		 * user.setName("Nitish Kumar CM"); User result = userRepository.save(user);
		 * 
		 * System.out.println(result);
		 * 
		 * System.out.println(user);
		 */

		
		/*
		 * //How to get the Data
		 * 
		 * //findById(id) - return Optional Containing your data
		 * 
		 * Iterable<User> itr = userRepository.findAll(); Iterator<User> iterator =
		 * itr.iterator(); while(iterator.hasNext()) { User user = iterator.next();
		 * System.out.println(user); }
		 */
		
		
		
		
		/*// Fetch Data by new Method
		 * 
		 * 
		 * Iterable<User> itr = userRepository.findAll(); itr.forEach(new
		 * Consumer<User>() {
		 * 
		 * @Override public void accept(User t) { // TODO Auto-generated method stub
		 * System.out.println(t);
		 * 
		 * }
		 * 
		 * });
		 */
		
		/*
		 * // Fetch Data by Lambda Expression
		 * 
		 * Iterable<User> itr = userRepository.findAll();
		 * 
		 * itr.forEach(user-> {System.out.println(user);});
		 */
		
		
		/*
		 * //Deleting the Elements
		 * 
		 * userRepository.deleteById(2); System.out.println("Deleted");
		 */
		
		
		/*
		 * //Delete all
		 * 
		 * Iterable<User> allusers = userRepository.findAll(); allusers.forEach(user->
		 * System.out.println(user));
		 * 
		 * userRepository.deleteAll(allusers);
		 */
		
		
	}

}
