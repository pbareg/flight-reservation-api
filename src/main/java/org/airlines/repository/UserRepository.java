package org.airlines.repository;

import org.airlines.bean.UserBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pbaregal on 5/14/2019.
 */
@Repository
public interface UserRepository extends CrudRepository<UserBean,String>{
}
