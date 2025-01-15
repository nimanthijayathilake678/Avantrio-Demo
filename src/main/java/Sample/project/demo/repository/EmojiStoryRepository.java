package Sample.project.demo.repository;

import Sample.project.demo.model.EmojiStory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmojiStoryRepository extends JpaRepository<id,String> {
    public EmojiStory[] getAll();
    public EmojiStory getById(id);
}
