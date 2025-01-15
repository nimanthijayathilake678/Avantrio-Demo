package Sample.project.demo.repository;

import Sample.project.demo.model.EmojiStory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmojiStoryRepository<id> extends JpaRepository<id,String> {
    public void getAll();
    public EmojiStory getById(id);
}
