package cn.wallance.service;

import java.util.List;

import cn.wallance.domain.User;

public interface IUserService {
	public abstract List<User> selectAll();

}
