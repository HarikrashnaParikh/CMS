package com.argusoft.cms.repo;

import com.argusoft.cms.entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailRepo  extends JpaRepository<UserDetail,Long> {
    //----custom methods
}
