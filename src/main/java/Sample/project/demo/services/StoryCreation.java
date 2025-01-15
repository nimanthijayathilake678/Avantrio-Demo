package Sample.project.demo.services;

import Sample.project.demo.model.EmojiStory;
import Sample.project.demo.repository.EmojiStoryRepository;

import java.util.Date;

public class StoryCreation {
    EmojiStoryRepository emojiStoryRepository;
    public void  createStory(String id, String[] emojiSequence, String translation, String authorNickname, int likes, Date createdAt){
        EmojiStory emojiStory=new EmojiStory(id,emojiSequence,translation,authorNickname,createdAt,likes);
        System.out.println("Story Created");
    }

    public EmojiStory getStoryById(String id){
        EmojiStory getEmo= emojiStoryRepository.getById(id);
        return getEmo;
    }

    public EmojiStory[] getAllStory(){
        return emojiStoryRepository.getAll();
    }
}
