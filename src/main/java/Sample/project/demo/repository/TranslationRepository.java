package Sample.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranslationRepository<storyId> extends JpaRepository<storyId,String> {
    public void getAll();
}
