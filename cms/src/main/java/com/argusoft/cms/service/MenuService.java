package com.argusoft.cms.service;

import com.argusoft.cms.entity.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> getAllMenus();

    Menu getMenuById(int id);

    Menu addMenu(Menu menu);

    Menu updateMenu(Menu menu);

    void deleteMenu(int id);
}

