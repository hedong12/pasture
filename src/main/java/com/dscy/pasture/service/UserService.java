package com.dscy.pasture.service;

<<<<<<< HEAD
import com.dscy.pasture.entity.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

=======
import com.github.pagehelper.PageInfo;

>>>>>>> 22668223364caae28f5c9fc0cd08bcf25ed1f183
public interface UserService {


    PageInfo getUserList(Integer currentPage,String username,String userPhone);

    Boolean delUserById(Integer id);
<<<<<<< HEAD

    List<User> queryUserList();

    User selectUserById(Integer userId);
=======
>>>>>>> 22668223364caae28f5c9fc0cd08bcf25ed1f183
}
