package com.argusoft.cms.service;

import com.argusoft.cms.entity.Menu;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MenuService {
    public List<Menu> getAllMenus();

    public Menu getMenuById(int id);

    public Menu addMenu(Menu menu);

    public Menu updateMenu(int id, Menu menu);

    public void deleteMenu(int id);
}

