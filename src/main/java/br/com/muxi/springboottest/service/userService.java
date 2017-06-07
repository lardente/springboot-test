package br.com.muxi.springboottest.service;

import br.com.muxi.springboottest.dao.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lardente on 07/06/2017.
 */
@Repository
public interface userService extends CrudRepository<User, Long>{

}
