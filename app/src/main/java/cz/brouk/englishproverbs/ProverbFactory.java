package cz.brouk.englishproverbs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by brouk on 9/20/16.
 */
public class ProverbFactory {

    private List<Proverb> proverbs;

    public ProverbFactory() {
        generateAllProverbs();
    }

    // TODO: verify behaviour
    public Proverb getRandomProverb() {
        Random r = new Random();
        int randomID = r.nextInt(this.proverbs.size());
        return proverbs.get(randomID);
    }

    public List<String> getAllProverbsString() {

        final ArrayList<String> proverbsStr = new ArrayList<>();

        if (this.proverbs != null) {

            for (Proverb pr : this.proverbs) {
                proverbsStr.add(pr.getProverb());
            }
        }
        return proverbsStr;
    }

    public List<String> getAllDescriptions() {
        final ArrayList<String> proverbsDescriptionStr = new ArrayList<>();
        if (this.proverbs != null) {

            for (Proverb pr : this.proverbs) {
                proverbsDescriptionStr.add(pr.getProverb());
            }
        }
        return proverbsDescriptionStr;
    }

    public Proverb getProverb(int id) {
        return proverbs.get(id);
    }

    public Proverb getProverb(String proverbString) {
        for (Proverb proverb : proverbs) {
            if (proverb.getProverb().equalsIgnoreCase(proverbString)) {
                return proverb;
            }
        }
        return null;
    }

    public List<Proverb> getAllProverbs() {
        return this.proverbs;
    }

    private void generateAllProverbs() {
        proverbs = new ArrayList<>();
        proverbs.add(new Proverb("A", "A cheerful wife is the spice of life.", "Concise Dictionary of European Proverbs (Abbreviated ed.)."));
        proverbs.add(new Proverb("A", "A good mind possesses a kingdom.", "Note: Translated from Latin: Mens bona regnum possidet.\nMeaning: Material assets are fleeting, but intellectual assets will basically stay with you for the rest of your life. Therefore, intellectual assets are much more worth than material ones. Concise Dictionary of European Proverbs"));
        proverbs.add(new Proverb("A", "A good name is the best of all treasures.", "Concise Dictionary of European Proverbs"));
        proverbs.add(new Proverb("A", "The apple never falls far from the tree", "Meaning: Children are in many regards like their parents. The Oxford Dictionary of Proverbs"));
        proverbs.add(new Proverb("A", "Advice most needed is least heeded.", "A Dictionary of American Proverbs (Reprint ed.)."));
        proverbs.add(new Proverb("A", "Advisers run no risks.", "Meaning: It is easy to give advice, but hard to act. Concise Dictionary of European Proverbs "));
        proverbs.add(new Proverb("A", "All are not thieves that the dogs bark at.", "Concise Dictionary of European Proverbs"));
        proverbs.add(new Proverb("A", "All's fair in love and war.", "A Dictionary of American Proverbs"));
        proverbs.add(new Proverb("A", "All are not friends that speak us fair.", "Concise Dictionary of European Proverbs"));
        proverbs.add(new Proverb("A", "All roads lead to Rome.", "The Oxford Dictionary of Proverbs"));
        proverbs.add(new Proverb("A", "All things come to those who wait.", "The Oxford Dictionary of Proverbs"));
    }
}