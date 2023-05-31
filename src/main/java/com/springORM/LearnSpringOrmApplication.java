package com.springORM;

import com.springORM.Entities.*;
import com.springORM.Repositories.CategoryRepo;
import com.springORM.Repositories.ProductRepo;
import com.springORM.Repositories.StudentRepository;
import com.springORM.Repositories.UserRepository;
import com.springORM.Services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class LearnSpringOrmApplication implements CommandLineRunner
{
	Logger logger= LoggerFactory.getLogger(LearnSpringOrmApplication.class);
	@Autowired
	UserService userService;
	@Autowired
	StudentRepository studentRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	CategoryRepo categoryRepo;
	@Autowired
	ProductRepo productRepo;


	public static void main(String[] args) {
		SpringApplication.run(LearnSpringOrmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
//		User user1= new User();
//		user1.setName("piyush");
//		user1.setAge(38);
//		user1.setCity("Ghaziabad");
//		User savedUser = userService.saveUser(user1);
//		logger.info("user is saved {}",savedUser);

		//userService.getSingleUser(1);
	//	userService.getSingleUser(2);
		//userService.getAllUser();

		// update user
	//	User u= new User();
//		u.setName("Chahal");
//		u.setCity("Jaisalmer");
//		u.setAge(40);
//
//	logger.info("User details are updated {}  {}  {}",u.getName(),u.getCity(),u.getAge());

		//userService.updateUser(u,1);
		//userService.updateUser(u,5);   updating with wrong id showing error.



		// deleting error
		//userService.deleteUser(152);





		// ONE TO ONE MAPPING

//		Student student= new Student();
//
//		student.setName("Sanjay");
//		student.setAge(16);
//		student.setRemarks("average");
//
//
//		Laptop laptop= new Laptop();
//
//		laptop.setModel_no("G9494KJ");
//		laptop.setBrand("Dell");
//		laptop.setStudent(student);
//
//		student.setLaptop(laptop);
//
//
//
//		Student save = studentRepository.save(student);
//		logger.info("student saved {}", save.getName());
//
//		Student student1 = studentRepository.findById(1).get();
//		logger.info("details of student  is: {},{}",student1.getName(),student1.getLaptop().getBrand());
//
//		Laptop laptop1=student1.getLaptop();
//		logger.info("laptop details is: {}, {}, {}",laptop1.getBrand(),laptop1.getModel_no(),laptop1.getLap_id());
//



		// ONE TO MANY
//		Student student4= new Student();
//		student4.setName("Ashok");
//		student4.setAge(15);
//		student4.setRemarks("excellent");
//
//		Address a1= new Address();
//		a1.setCity("Unnao");
//		a1.setPincode(208777);
//		a1.setStudent(student4);
//
//
//		Address a2= new Address();
//		a2.setCity("Mathura");
//		a2.setPincode(2983832);
//		a2.setStudent(student4);
//
//		List<Address> addressList= new ArrayList<>();
//		addressList.add(a1);
//		addressList.add(a2);
//
//		student4.setAddress_list(addressList);
//
//		Student save_student4 = studentRepository.save(student4);
//		logger.info("details are saved {}",save_student4);




		// MANY TO MANY

//		Product product1= new Product();
//		product1.setpId("p-005");
//		product1.setProduct_name("Redmi K9 pro");
//
//		Product product2= new Product();
//		product2.setpId("p-025");
//		product2.setProduct_name("Moto g 15 ");
//
//		Product product3= new Product();
//		product3.setpId("p-302");
//		product3.setProduct_name("Poco c25");
//
//		Product product4= new Product();
//		product4.setpId("p-358");
//		product4.setProduct_name("Samsung ms-25V 32 Lcd Tv 32 inch");
//
//		Category category1= new Category();
//		category1.setcId("c-78");
//		category1.setTitle("Electronics");
//
//		Category category2 = new Category();
//		category2.setcId("c-11");
//		category2.setTitle("Mobile phones");
//
//		List<Product> category1ProductList = category1.getProductList();
//		category1ProductList.add(product1);
//		category1ProductList.add(product2);
//		category1ProductList.add(product3);
//
//		List<Product> category2ProductList = category2.getProductList();
//		category2ProductList.add(product4);
//		category2ProductList.add(product1);
//
//
//		categoryRepo.save(category1);
//		categoryRepo.save(category2);


//		Category category1 = categoryRepo.findById("c-78").get();
//		logger.info("no. of products are in this category: {}", category1.getProductList().size());
//		//logger.info("details of each product is: {}", category.getProductList());
//
//		Category category2 = categoryRepo.findById("c-11").get();
//		logger.info("no. of products are in this category: {}", category2.getProductList().size());
//
//
//		Product product1 = productRepo.findById("p-005").get();
//		logger.info("no. of categories are in this category: {}", product1.getCategoryList().size());


//	Optional<Product> pocoC25 = productRepo.findByProduct_Name("Poco c25");
//		System.out.println(pocoC25.isPresent());
//		System.out.println(pocoC25.get().getProduct_name());
//
//		System.out.println("************************");

//		List<Product> pro = productRepo.findByProduct_NameEndingWith("pro");
//		pro.forEach(product -> {
//			System.out.println(product.getProduct_name());
//			System.out.println(product.getpId());
//		});
//
//		System.out.println("*************************");
//
//		List<Product> g = productRepo.findByProduct_NameContaining("inch");
//		g.forEach(product -> {
//			System.out.println(product.getProduct_name());
//			System.out.println(product.getpId());
//
//		});
//
//		System.out.println("*************************");
//
//		List<Product> byProductNameIn = productRepo.findByProduct_NameIn(Arrays.asList("Moto g 15 ", "Samsung ms-25V 32 Lcd Tv 32 inch"));
//		byProductNameIn.forEach(product -> {
//			System.out.println(product.getCategoryList());
//			System.out.println(product.getpId());
//			System.out.println(product.getProduct_name());
//		});
//
//		System.out.println("************************");

	}
}
