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

    private void generateAllProverbs() {
        proverbs = new ArrayList<Proverb>();
        proverbs.add(new Proverb("K", "Kdo jinemu jamu kopa, sam do ni pada", "Kdo se snazi nekoho podvest sam skonci podvedeny"));
        proverbs.add(new Proverb("L", "Lepsi vrabec v hrsti, nez holub na strese", "Lepsi se spokojit s jistym malem, nez chtim moc nejisteho"));
        proverbs.add(new Proverb("X", "X prislovi ...", "X description ..."));
        proverbs.add(new Proverb("Y", "Y prislovi ...", "Y description ..."));
        proverbs.add(new Proverb("Z", "Z prislovi ...", "Z description ..."));
    }

    public List<String> getAllProverbs() {

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
}