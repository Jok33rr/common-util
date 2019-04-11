package com.smarthouse.commonutil.service;

import java.util.List;
import java.util.Optional;

public interface CRUDService<Item, Key> {
    List<Item> getAll();

    Optional<Item> getById(Key id);

    void delete(Item item);

    void deleteById(Key id);

    Item save(Item item);
}
