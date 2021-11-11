package com.kaanbayindir.project.business.abstracts;

import com.kaanbayindir.project.core.entities.User;
import com.kaanbayindir.project.core.utilities.results.DataResult;
import com.kaanbayindir.project.core.utilities.results.Result;

public interface UserService {
    Result add(User user);
    DataResult<User> findByEmail(String email);
}
