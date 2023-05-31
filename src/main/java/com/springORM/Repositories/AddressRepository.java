package com.springORM.Repositories;

import com.springORM.Entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer>
{

}
