package com.argusoft.cms.service;

import com.argusoft.cms.entity.UserDetail;

import java.util.List;

public interface UserDetailService {

    public List<UserDetail> findAll();
    public UserDetail findById(Long id);
    //    public UserDetail deleteById(Long id);
    public UserDetail saveUser(UserDetail user);
}
