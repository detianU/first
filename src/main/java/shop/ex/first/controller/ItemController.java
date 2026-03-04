package shop.ex.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import shop.ex.first.entity.Item;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemController {

    @GetMapping("/")
    public String showItems(Model model) {
        List<Item> items = new ArrayList<>();

        items.add(new Item(1L, "MacBook Pro", "8 GB RAM 256 GB SSD Intel Core i7", 1199.99));
        items.add(new Item(2L, "MacBook Pro", "16 GB RAM 500 GB SSD Apple M1", 1499.99));
        items.add(new Item(3L, "MacBook Pro", "16 GB RAM 1 TB SSD Apple M1", 1799.99));
        items.add(new Item(4L, "ASUS TUF Gaming", "16 GB RAM 500 GB SSD Intel Core i7", 1299.99));
        items.add(new Item(5L, "HP ProBook", "8 GB RAM 500 GB SSD Intel Core i5", 999.99));
        items.add(new Item(6L, "Lenovo Legion", "32 GB RAM 512 GB SSD Intel Core i7", 1399.99));

        model.addAttribute("items", items);
        return "index";
    }
}