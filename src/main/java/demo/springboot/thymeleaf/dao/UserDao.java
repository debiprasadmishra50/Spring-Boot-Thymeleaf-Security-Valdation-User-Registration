package demo.springboot.thymeleaf.dao;

import demo.springboot.thymeleaf.entity.User;

public interface UserDao {

    public User findByUserName(String userName);
    
    public void save(User user);
    
}
