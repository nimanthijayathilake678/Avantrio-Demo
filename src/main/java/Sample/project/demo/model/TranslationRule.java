package Sample.project.demo.model;

import jakarta.persistence.Entity;

@Entity
public class TranslationRule {
    String[] pattern;
    String[] templates;

    public String[] getPattern() {
        return pattern;
    }

    public void setPattern(String[] pattern) {
        this.pattern = pattern;
    }

    public String[] getTemplates() {
        return templates;
    }

    public void setTemplates(String[] templates) {
        this.templates = templates;
    }
}
