package com.springORM.Repositories;

import com.springORM.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>
{
//    <entity class name, primary key data type corresponding wrapper class>

}
