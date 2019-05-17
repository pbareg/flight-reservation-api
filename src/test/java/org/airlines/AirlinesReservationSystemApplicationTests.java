package org.airlines;

import org.airlines.bean.UserBean;
import org.airlines.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AirlinesReservationSystemApplicationTests {

    @Autowired
    UserRepository userRepo;


	@Test
	public void saveUserBean() {
        UserBean user= new UserBean();
        user.setUsername("praveen");
        user.setMobileNo(7702990005l);
        user.setPassword("12345");
        user.setRole("admin");
        userRepo.save(user);
        userRepo.findOne("praveen").getMobileNo().equals(7702990005l);
	}

}
