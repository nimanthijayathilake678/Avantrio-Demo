package Sample.project.demo.model;

import java.util.Date;

public class EmojiStory {
    String id;
    String[] emojiSequence;
    String translation;
    String authorNickname;
    int likes;
    Date createdAt;

    public EmojiStory(String id, String[] emojiSequence, String translation, String authorNickname, Date createdAt, int likes) {
        this.id = id;
        this.emojiSequence = emojiSequence;
        this.translation = translation;
        this.authorNickname = authorNickname;
        this.createdAt = createdAt;
        this.likes = likes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getEmojiSequence() {
        return emojiSequence;
    }

    public void setEmojiSequence(String[] emojiSequence) {
        this.emojiSequence = emojiSequence;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getAuthorNickname() {
        return authorNickname;
    }

    public void setAuthorNickname(String authorNickname) {
        this.authorNickname = authorNickname;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
