package com.shopme.user;

import com.shopme.common.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import javax.persistence.Id;

@Service
public interface RoleRepository extends CrudRepository<Role, Integer> {

}
