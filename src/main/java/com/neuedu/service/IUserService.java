package com.neuedu.service;

import com.neuedu.exception.MyException;
import com.neuedu.pojo.UserInfo;

public interface IUserService {

    public UserInfo login(UserInfo userInfo) throws MyException;

}
