package cz.brouk.englishproverbs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by brouk on 9/20/16.
 */
public class ProverbFactory {

    private List<Proverb> proverbs;
    private List<Proverb> searchedProverbs;

    public ProverbFactory() {
        generateAllProverbs();
        searchedProverbs = new ArrayList<>();
    }

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

    public List<Proverb> getSearchedProverbs(){ return this.searchedProverbs; }

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
        proverbs.add(new Proverb("A", "All work and no play makes Jack a dull boy.", "Be sure to take breaks from work and do something entertaining."));
        proverbs.add(new Proverb("A", "An army marches on its stomach", "Simpson, John (2009). The Oxford Dictionary of Proverbs"));
        proverbs.add(new Proverb("A", "As you make your bed, so you must lie on it.", "You reap what you sow"));
        proverbs.add(new Proverb("A", "A hedge between keeps friends green.", "It is best to have some sort of wall towards your neighbours."));
        proverbs.add(new Proverb("A", "A verbal contract isn't worth the paper it's written on.", "A verbal contract is completely useless."));
        proverbs.add(new Proverb("A", "Absence makes the heart grow fonder.", "When you're away from something, you miss it more."));
        proverbs.add(new Proverb("A", "Actions speak louder than words.", "Hill Festetits, Kate Neely (2011). McGraw-Hill's Dictionary of American Idioms and Phrasal Verbs."));
        proverbs.add(new Proverb("A", "A friend in need is a friend indeed.", "Prove thy friend ere thou have need; but, in-deed. A friend is never known till a man have need."));
        proverbs.add(new Proverb("A", "All cats love fish but hate to get their paws wet.", "Everyone wants success but many lack the self-discipline to become successful."));
        proverbs.add(new Proverb("A", "All for one and one for all.", "Although people associate it with Alexandre Dumas's The Three Musketeers it is much older. It is a translation of the Latin Unus pro omnibus, omnes pro uno, the motto for Switzerland."));
        proverbs.add(new Proverb("A", "All good things must come to an end.", "Speake, Jennifer; Simpson, John (2009). The Oxford dictionary of proverbs. Oxford University Press."));
        proverbs.add(new Proverb("A", "All's well that ends well.", "Title of a play by William Shakespeare. All is well that ends well. - Divers Proverbs."));
        proverbs.add(new Proverb("A", "All that glisters is not gold.", "William Shakespeare, The Merchant of Venice, act II, scene 7. Often corrupted to: All that glitters is not gold."));
        proverbs.add(new Proverb("A", "A staff is quickly found to beat a dog.", "Meaning: Someone who wants to be mean will find things to be mean about no matter what. Source: Strauss, Emmanuel (1998). Dictionary of European Proverbs."));
        proverbs.add(new Proverb("A", "An apple a day keeps the doctor away.", "Cf. Notes and Queries magazine, Feb. 24, 1866, p. 153: 'Eat an apple on going to bed, // And you'll keep the doctor from earning his bread.'"));
        proverbs.add(new Proverb("A", "As the old cock crows, so crows the young.", "Meaning: Children will become like older generations."));
        proverbs.add(new Proverb("A", "Ask me no questions, I'll tell you no lies.", "Cf. Oliver Goldsmith's She Stoops to Conquer (1773): \"Ask me no questions, and I’ll tell you no fibs\"."));
        proverbs.add(new Proverb("A", "A rotten apple injures its neighbors.", "A MAN IS NOT A PLAN Source: women."));

        proverbs.add(new Proverb("B", "Bad news travels fast.", "Simpson, John (2009). The Oxford Dictionary of Proverbs."));
        proverbs.add(new Proverb("B", "A bad penny always turns up.", "Meaning: An unpopular person will always return to the place he came from."));
        proverbs.add(new Proverb("B", "A bad settlement is better than a good lawsuit.", "Filipp, M. R. (2005). Covenants Not to Compete, Aspen."));
        proverbs.add(new Proverb("B", "Be careful what you wish for, you just might get it.", "Potter, A. (2009). Be Careful What You Wish For, Hodder & Stoughton."));
        proverbs.add(new Proverb("B", "Well begun is half done.", "Mieder, Wolfgang (1991). A Dictionary of American Proverbs (Reprint ed.)."));
        proverbs.add(new Proverb("B", "A bellyful is one of meat, drink, or sorrow.", "H. Manser, Martin (2006). The Wordsworth Dictionary of Proverbs."));
        proverbs.add(new Proverb("B", "Bend the willow while it is young.", "Definition= influence young people while they are young and impressionable."));
        proverbs.add(new Proverb("B", "The best things come in small packages.", "Simpson, John (2009). The Oxford Dictionary of Proverbs."));
        proverbs.add(new Proverb("B", "The best things in life are free.", "Simpson, John (2009). The Oxford Dictionary of Proverbs."));
        proverbs.add(new Proverb("B", "Better an egg today than a hen tomorrow.", "Strauss, Emanuel (1998). Concise Dictionary of European Proverbs."));
        proverbs.add(new Proverb("B", "Better is the enemy of good.", "Meaning: The aim for perfection or mastery might be in the way of progress."));
        proverbs.add(new Proverb("B", "Big thunder, little rain.", "..."));
        proverbs.add(new Proverb("B", "Better late than never.", "Mieder, Wolfgang (1991). A Dictionary of American Proverbs"));
        proverbs.add(new Proverb("B", "Better safe than sorry.", "Simpson, John (2009). The Oxford Dictionary of Proverbs."));
        proverbs.add(new Proverb("B", "Beware of false prophets, who come to you in sheep's clothing, but inwardly they are ravening wolves.", "Meaning: The seemingly most respectable people are quiet often scoundrels; Evil people often act innocently."));
        proverbs.add(new Proverb("B", "Birds of a feather flock together.", "Meaning: People with important similarities seek out one another's company, often to the exclusion of others."));
        proverbs.add(new Proverb("B", "Bitter pills may have blessed effects.", "Meaning: The remedy might be bitter, but the cure might be wonderful."));
        proverbs.add(new Proverb("B", "Blood is thicker than water.", "Simpson, John (2009). The Oxford Dictionary of Proverbs."));
        proverbs.add(new Proverb("B", "Beauty is in the eyes of the beholder.", "Simpson, John (2009). The Oxford Dictionary of Proverbs."));
        proverbs.add(new Proverb("B", "A bad workman blames his tools.", "Never hand an ill workman good tools."));
        proverbs.add(new Proverb("B", "Barking dogs seldom bite.", "Meaning: A person who often threatens rarely carries out his threats."));
        proverbs.add(new Proverb("B", "Before criticizing a man, walk a mile in his shoes.", "Variant: Don't criticize someone before you walk a mile in their moccasins."));
        proverbs.add(new Proverb("B", "Beggars can't be choosers.", "Meaning: If you are in a bad situation or do not have much to offer you must be content with whatever help you can get."));
        proverbs.add(new Proverb("B", "The belly has no ears.", "This Proverb intimates, that there is no arguing the Matter with Hunger,\n the Mother of Impatience and Anger. - Divers Proverbs, Nathan Bailey, 1721"));
        proverbs.add(new Proverb("B", "Better to be alone than in bad company.", "Source: Strauss, Emmanuel (1998). Dictionary of European Proverbs."));
        proverbs.add(new Proverb("B", "Better the devil you know (than the devil you don't).", "Speake, Jennifer; Simpson, John (2009). The Oxford dictionary of proverbs."));
        proverbs.add(new Proverb("B", "Better to remain silent and be thought a fool, than to open your mouth and remove all doubt.", "Variant: Better to remain silent and thought a fool, than to speak out and remove all doubt."));
        proverbs.add(new Proverb("B", "Beware of Greeks bearing gifts.", "From Virgil's Aeneid Book II, line 48: Timeo Danaos et dona ferentes. Translation: I fear the Grecians even when they offer gifts."));
        proverbs.add(new Proverb("B", "A bird in the hand is worth two in the bush.", "John Bunyan cites this traditional proverb in The Pilgrim's Progress."));
        proverbs.add(new Proverb("B", "A blow with a word strikes deeper than a blow with a sword.", "It is an old saying, \"A blow with a word strikes deeper than a blow with a sword:\" and many men are as much galled with a calumny, a scurrilous and bitter jest, a libel, a pasquil, satire, apologue, epigram, stage-play or the like, as with any misfortune whatsoever."));
        proverbs.add(new Proverb("B", "Bloom where you are planted.", "Meaning: It is often better to escalate your commitment rather than starting over with something new.\nOther meaning: Make use of your geographical advantages."));
        proverbs.add(new Proverb("B", "Boys will be boys.", "Miedzian, Myriam (2002). Boys will be boys: breaking the link between masculinity and violence."));
        proverbs.add(new Proverb("B", "Brag is a good Dog, but Holdfast is a better.", "Meaning: A variation of \"Talk is cheap\"."));
        proverbs.add(new Proverb("B", "A broken watch is right two times a day.", "Meaning: A person who is wrong will eventually be right about something."));
        proverbs.add(new Proverb("B", "A burnt child dreads the fire.", "Meaning: You will avoid an activity which has given you a bad experience for the rest of your life."));
        proverbs.add(new Proverb("B", "By hook or by crook.", "Meaning: A thing to be achieved will be done in a straightforward way, but if it cannot, then it will be achieved by any means necessary."));

        //proverbs.add(new Proverb("A", "March winds and April showers bring forth May flowers.", "Sometimes unpleasant things are required to bring good things."));
    }

    public void generateSearchedProverbs(String searchString) {

        clearSearchedProverbs();

        for (Proverb actualProverb : this.proverbs) {
            if (actualProverb.getProverb().contains(searchString)) {
                searchedProverbs.add(actualProverb);
            }
        }
    }

    public void clearSearchedProverbs() {
        this.searchedProverbs = new ArrayList<>();
    }

}