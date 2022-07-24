package com.shopme.admin;

import com.shopme.common.entity.Role;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.test.annotation.Rollback;
import com.shopme.user.RoleRepository;


import static org.assertj.core.api.Assertions.assertThat;



@SuppressWarnings(value = "SpringJavaAutowiringInspection")
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
@ComponentScan("roleRepository")
@Qualifier(value = "roleRepository")

public class RoleRepositoryTests {
    @Autowired
    @Qualifier("roleRepository")
    private RoleRepository roleRepository;

    @Test
    public void testCreateFirstRole() {
        Role roleAdmin = new Role("Admin", "manage everything");
        Role saveRole = roleRepository.save(roleAdmin);
        assertThat(saveRole.getId()).isGreaterThan(0);
    }
/*
 @Test
 public void testCreateSecondRole(){
     Role roleSalesPerson = new Role("SalesPerson", "manage product price," + " customers, shipping, orders and sales report");
     Role roleEditor = new Role("Editor", "manage categories, brands" + " products, articles and menus");
     Role roleShipper = new Role("Shipper", "view products, orders" + " and update order status");
     Role roleAssistant = new Role("SalesPerson", "manage product price," + " customers, shipping, orders and sales report");
 roleRepository.saveAll(List.of(roleSalesPerson, roleEditor, roleShipper, roleAssistant));
Nu merge importul pentru ""of""
Nu merg testele, incep cu primul.
*/

}


