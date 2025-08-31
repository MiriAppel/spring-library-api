package com.example.SpringProject.services;

import com.example.SpringProject.entities.Item;
import com.example.SpringProject.repositories.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public List<Item> getAll() {
        return itemRepository.findAll();
    }

    public void add(Item item) {
        itemRepository.save(item);
    }

    public String delete(int id) {
        if(itemRepository.existsById(id)) {
            Item item = itemRepository.findById(id).get();
            itemRepository.delete(item);
            return item.getName()+" deleted";
        }
        return "item not exist";
    }

    public String update(Item item, int id) {
        if(itemRepository.existsById(id)) {
            Item item1 = itemRepository.findById(id).get();
            item.setId(item1.getId());
            itemRepository.save(item);
            return item.getName()+" updated";
        }
        return "item not exist";
    }
}
