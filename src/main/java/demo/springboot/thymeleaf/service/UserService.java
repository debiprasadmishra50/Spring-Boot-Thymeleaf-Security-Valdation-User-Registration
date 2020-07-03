package demo.springboot.thymeleaf.service;

import demo.springboot.thymeleaf.entity.User;
import demo.springboot.thymeleaf.user.CrmUser;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	public void save(CrmUser crmUser);
}
