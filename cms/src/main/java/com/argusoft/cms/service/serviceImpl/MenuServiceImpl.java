package com.argusoft.cms.service.serviceImpl;

import com.argusoft.cms.entity.Menu;
import com.argusoft.cms.repo.MenuRepository;
import com.argusoft.cms.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Override
    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }

    @Override
    public Menu getMenuById(int id) {
        return menuRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Menu not found"));
    }

    @Override
    public Menu addMenu(Menu menu) {
//        menu.setAvailable(true);
        return menuRepository.save(menu);
    }

    @Override
    public Menu updateMenu(int id, Menu menu) {
        return menuRepository.save(menu);
    }

    @Override
    public void deleteMenu(int id) {
        menuRepository.deleteById(id);
    }
}
