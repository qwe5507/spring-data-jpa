package study.datajpa.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import study.datajpa.entity.Item;

@SpringBootTest
class ItemRepositoryTest {
    @Autowired ItemRepository itemRepository;


    @Test
    public void save1() {
        Item item = new Item("123");
        itemRepository.save(item);

        System.out.println("item = " + itemRepository.findAll().get(0).getId());
    }

}