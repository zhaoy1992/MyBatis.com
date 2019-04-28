package com.zy.mybaty.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.zy.mybaty.bean.UserBean;
import com.zy.mybaty.mapper.UserMapper;
import com.zy.mybaty.utils.DBUtils;

public class UserService {

	public static void main(String[] args) {
		insertUser();
		selectAllUser();
		// deleteUser();
		// selectUserById();
		// selectAllUser();
	}

	/**
	 * 新增用户
	 */
	private static void insertUser() {
		SqlSession session = DBUtils.getSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		UserBean user = new UserBean("懿", "1314520", "7000.0");
		try {
			mapper.insertUser(user);
			System.out.println(user.toString());
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}
	}

	private static void deleteUser() {
		SqlSession session = DBUtils.getSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		try {
			mapper.deleteUser(1);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}
	}

	private static void selectUserById() {
		SqlSession session = DBUtils.getSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		try {
			UserBean user = mapper.selectUserById(2);
			System.out.println(user.toString());

			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}
	}

	private static void selectAllUser() {
		SqlSession session = DBUtils.getSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		try {
			List<UserBean> user = mapper.selectAllUser();
			System.out.println(user.toString());
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}
	}
}
