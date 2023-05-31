package com.springORM.Repositories;

import com.springORM.Entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;
import java.util.Optional;


public interface ProductRepo extends JpaRepository<Product,String>
{
    // 1. using custom finder methods.

    //Rule

   //Optional <Product> findByProduct_Name(String name);
   // Product findByPId(int pId);
   // Product findByProduct_NameIs(String product_name);
   // Product findByProduct_NameEquals(String product_name);

//    List<Product> findByProduct_NameIsNot(String product_name);
//    List<Product> findByProduct_NameIsNull();
//    List<Product> findByProduct_NameIsNotNull();
//    List<Product> findByActiveTrue();
//    List<Product> findByActiveFalse();

   // List<Product> findByProduct_NameStartingWith(String prefix);
   // List<Product> findByProduct_NameEndingWith(String suffix);
   // List<Product> findByProduct_NameContaining(String infix);
//    String pattern= "sams%";
//    List<Product> findByProduct_NameLike(String pattern);
//    List<Product> findByPriceLessThan(double price);
//    List<Product> findByPriceLessThanEqual(double price);
//    List<Product> findByPriceGreaterThan(double price);
//    List<Product> findByPriceGreaterThanEqual(double price);
    //List<Product> findByProduct_NameIn(Collection<String> names);
//    List<Product> findByProduct_NameAndPrice(String product_name, double price);
//    List<Product> findByProduct_NameOrPrice(String product_name, double price);
//    List<Product> findByProduct_NameOrderByProduct_NameDesc(String product_name);
//    List<Product> findByProduct_NameOrderByProduct_NameAsc(String product_name);


    // 2. Custom Query Methods
    // JPQL Queries(no focus on database table , just focus on entity class details)

//    @Query(value = "select p from Product p")
//    List<Product> getAllProductWhileLearningJPA();
//
//    @Query(value = "select p from Product p where p.product_name like Sam% ")
//    List<Product> getAllActiveProduct();
//
//    // dynamic query
//    //method 1
//    @Query(value = "select p from product p where p.pId =?1 AND p.product_name= ?2")
//    Product getSingleProductByIdAndName1(int pid, String product_name);
//
//    //method2
//
//    @Query(value = "select p from product p where p.pId = :productID AND p.product_name= :productname")
//    Product getSingleProductByIdAndName2(@Param("productID") int productID, @Param("productname") String productname);
//
//    @Modifying
//    @Query(value = "update product p set p.product_name= ?1 where p.pId =?2")
//    Product updateSingleProduct(String product_name, int pId);
//
//
//    // native queries (we have to write the query similarly with the sql )
//
//    @Query(value = "select * from jpa_product where product_name= :productName AND pId = :productID ", nativeQuery = true)
//    Product getProductByIdAndName(@Param("productName") String productName, @Param("productID") int productID);


}
