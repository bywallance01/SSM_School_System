package cn.wallance.dao;

import java.util.List;

import cn.wallance.domain.User;

public interface IUserDao {
	public abstract List<User> selectAll();
}
