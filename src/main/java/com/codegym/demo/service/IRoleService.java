package com.codegym.demo.service;

import com.codegym.demo.model.Role;

public interface IRoleService extends IGeneralService<Role>{
    Role findByName(String name);
}
