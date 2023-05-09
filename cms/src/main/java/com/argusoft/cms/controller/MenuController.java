package com.argusoft.cms.controller;
import com.argusoft.cms.entity.Menu;
import com.argusoft.cms.repo.MenuRepository;
import com.argusoft.cms.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

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

    @PutMapping("/update/{id}")
    public ResponseEntity<Menu> updateMenu(@PathVariable Integer id,@RequestBody Menu menuDetails) {
        Menu menu = menuService.getMenuById(id);
        menu.setItemName(menuDetails.getItemName());
        menu.setItemName(menuDetails.getItemType());
        menu.setPrice(menuDetails.getPrice());
        menu.setAvailable(menuDetails.getAvailable());
        Menu updateMenu = menuService.updateMenu(id,menu);
        return ResponseEntity.ok(updateMenu);

    }

    @DeleteMapping("/{id}")
    public void deleteMenu(@PathVariable int id) {
        Menu menu = menuService.getMenuById(id);


        User user = userRepository.findById(Id)
                .orElseThrow(()->new ResourceNotFoundException("User not exist with Id :"+Id));

        userRepository.delete(user);

        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);


        menuService.deleteMenu(id);
    }
}
