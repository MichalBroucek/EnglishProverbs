package cz.brouk.englishproverbs;

/**
 * Created by brouk on 9/20/16.
 */
public class Proverb {

    private String character;
    private String proverb;
    private String description;

    public Proverb(String character, String proverb, String description) {
        this.character = character;
        this.proverb = proverb;
        this.description = description;
    }

    public String getCharacter() {
        return character;
    }

    public String getProverb() {
        return proverb;
    }

    public String getDescription() {
        return description;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public void setProverb(String proverb) {
        this.proverb = proverb;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
