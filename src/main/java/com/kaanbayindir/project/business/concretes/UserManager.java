package com.kaanbayindir.project.business.concretes;

import com.kaanbayindir.project.business.abstracts.UserService;
import com.kaanbayindir.project.core.dataAccess.UserDao;
import com.kaanbayindir.project.core.entities.User;
import com.kaanbayindir.project.core.utilities.results.DataResult;
import com.kaanbayindir.project.core.utilities.results.Result;
import com.kaanbayindir.project.core.utilities.results.SuccessDataResult;
import com.kaanbayindir.project.core.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Kullanıcı eklendi");
    }

    @Override
    public DataResult<User> findByEmail(String email) {
        return new SuccessDataResult<User>(this.userDao.findByEmail(email),"Kullanıcı bulundu");
    }
}
