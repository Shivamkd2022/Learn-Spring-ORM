package com.springORM.Repositories;

import com.springORM.Entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop,Integer>
{

}
