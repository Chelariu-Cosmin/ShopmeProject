package com.shopme.user;

import com.shopme.common.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository extends CrudRepository <User, Long> {

}
