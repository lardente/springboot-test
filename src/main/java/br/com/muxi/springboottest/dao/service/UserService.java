package br.com.muxi.springboottest.dao.service;

import br.com.muxi.springboottest.dao.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lardente on 07/06/2017.
 */
@Repository
public interface UserService extends CrudRepository<User, Long>{

}
