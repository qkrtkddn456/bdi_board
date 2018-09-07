package com.board.bdi.service;

import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.board.bdi.vo.UserInfoVO;

public interface UserService {
	public void joinUser(HttpServletRequest req) throws SQLException, ServletException;
	public void loginUser(HttpServletRequest req)throws SQLException;
	public void logoutUser(HttpServletRequest req)throws SQLException;
	public void deleteUser(HttpServletRequest req)throws SQLException;
	public void userList(HttpServletRequest req)throws SQLException;
}
