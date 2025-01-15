package Sample.project.demo.controller;

import Sample.project.demo.model.EmojiStory;
import Sample.project.demo.services.StoryCreation;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller("/auth")
public class StoryCreationController {
    StoryCreation storyCreation;

    //    I'm sry I could not recall the keyword use here
    //    ("/getAll")
    public  EmojiStory[]  getAllStory(){
        EmojiStory[] emojiStory=storyCreation.getAllStory();
        return emojiStory;
    }

    //    ("/getByID")
    public EmojiStory getStory(String id){
        EmojiStory emojiStory=storyCreation.getStoryById(id);
        return emojiStory;
    }

    //    ("/addStory")
    public void addStory(String id;String[] emojiSequence, String translation,String authorNickname, int likes, Date createdAt){
       EmojiStory emojiStory= storyCreation.createStory(id,emojiSequence,translation,authorNickname,likes,createdAt);
    }

}
