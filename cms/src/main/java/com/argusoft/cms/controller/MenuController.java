package com.argusoft.cms.controller;
import com.argusoft.cms.entity.Menu;
import com.argusoft.cms.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/")
    public List<Menu> getAllMenus() {
        return menuService.getAllMenus();
    }

    @GetMapping("/{id}")
    public Menu getMenuById(@PathVariable int id) {
        return menuService.getMenuById(id);
    }

    @PostMapping("/add")
    public Menu addMenu(@RequestBody Menu menu) {
        return menuService.addMenu(menu);
    }

    @PutMapping("/update")
    public Menu updateMenu(@RequestBody Menu menu) {
        return menuService.updateMenu(menu);
    }

    @DeleteMapping("/{id}")
    public void deleteMenu(@PathVariable int id) {
        menuService.deleteMenu(id);
    }
}
