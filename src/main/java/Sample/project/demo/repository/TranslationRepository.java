package Sample.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TranslationRepository<storyId> extends JpaRepository<storyId,String> {
    public void getAll();
}
