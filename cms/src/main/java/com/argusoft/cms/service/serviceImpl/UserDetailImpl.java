package com.argusoft.cms.service.serviceImpl;

import com.argusoft.cms.entity.UserDetail;
import com.argusoft.cms.repo.UserDetailRepo;
import com.argusoft.cms.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserDetailImpl implements UserDetailService {

    private UserDetailRepo userDetailRepo;

    @Autowired
    public UserDetailImpl(UserDetailRepo userDetailRepo){
        this.userDetailRepo=userDetailRepo;
    }

    //    ------------------------method to get all users
    @Override
    public List<UserDetail> findAll(){
        return userDetailRepo.findAll();
    }

    //    -----------------------method to get user by id
    @Override
    public UserDetail findById(Long id){
        Optional<UserDetail> tempUser=userDetailRepo.findById(id);
        UserDetail theUser= new UserDetail();
        if(tempUser.isPresent()){
            theUser=tempUser.get();
            //        -------add code here
        }
        else {
            throw new RuntimeException("Did not find the directory with id - " + id);
        }

        return theUser;
    }

//    -----------------------method to delete id
//    @Override
//    public UserDetail deleteById(Long id){
//    -------------------add code here
//        return null;
//    }

    //    --------------------method to save user
    @Override
    public UserDetail saveUser(UserDetail user){
        UserDetail theUser=userDetailRepo.save(user);
        //  ---------add code for save related data

        return theUser;
    }
}
