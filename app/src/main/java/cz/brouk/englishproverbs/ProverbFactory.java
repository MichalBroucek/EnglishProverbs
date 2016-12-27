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
        proverbs.add(new Proverb("A", "A bad penny always turns up", "Unknown"));
        proverbs.add(new Proverb("A", "A barking dog never bites", "Unknown"));
        proverbs.add(new Proverb("A", "A bird in the hand is worth two in the bush", "It's better to have a lesser but certain advantage than the possibility of a greater one that may come to nothing."));
        proverbs.add(new Proverb("A", "A cat may look at a king", "An inferior isn't completely restricted in what they may do in the presence of a superior."));
        proverbs.add(new Proverb("A", "A chain is only as strong as its weakest link", "The proverb has a literal meaning, although the 'weakest link' referred to is figurative and usually applies to a person or technical feature rather than the link of an actual chain."));
        proverbs.add(new Proverb("A", "A change is as good as a rest", "Unknown"));
        proverbs.add(new Proverb("A", "A dog is a man's best friend", "An animal that performs valuable service to humans, often with reference to dogs."));
        proverbs.add(new Proverb("A", "A drowning man will clutch at a straw", "Try any route to get out of a desperate situation, no matter how unlikely it is to succeed."));
        proverbs.add(new Proverb("A", "A fish always rots from the head down", "When an organization or state fails, it is the leadership that is the root cause."));
        proverbs.add(new Proverb("A", "A fool and his money are soon parted", "Literal meaning."));
        proverbs.add(new Proverb("A", "A friend in need is a friend indeed", "This phrase is interesting because there are various interpretations of its meaning. " +
                "Firstly, is it 'a friend in need is a friend indeed' or 'a friend in need is a friend in deed'? Secondly, is it 'a friend (when you are) in need' " +
                "or 'a friend (who is) in need'? If the former, then the phrase means: 'someone who helps you when you are in need is a true friend'. If the latter, " + "" +
                "it is 'someone who needs your help becomes especially friendly in order to obtain it'. So, that gives us four options:\n" +
                "  1. A friend, (when you are) in need, is indeed a true friend. ('indeed')\n" +
                "  2. A friend, (when you are) in need, is someone who is prepared to act to show it ('in deed') \n" +
                "  3. A friend, (who is) in need, is indeed a true friend. ('indeed')\n" +
                "  4. A friend, (who is) in need, is someone who is prepared to act to show it ('in deed')"));
        proverbs.add(new Proverb("A", "A golden key can open any door", "Enough money, or the promise of it, will accomplish anything."));
        proverbs.add(new Proverb("A", "A good beginning makes a good ending", "Unknown"));
        proverbs.add(new Proverb("A", "A good man is hard to find", "A modern-day proverb, bemoaning the difficulty of finding a suitable male partner.\n" +
                "\nA good man is hard to find\n" +
                "You always get the other kind"));
        proverbs.add(new Proverb("A", "A house divided against itself cannot stand", "Literal meaning (house meaning household)."));
        proverbs.add(new Proverb("A", "A person is known by the company he keeps", "Unknown"));
        proverbs.add(new Proverb("A", "A house is not a home", "Unknown"));
        proverbs.add(new Proverb("A", "A journey of a thousand miles begins with a single step", "Unknown"));
        proverbs.add(new Proverb("A", "A leopard cannot change its spots", "The notion that things cannot change their innate nature."));
        proverbs.add(new Proverb("A", "A little knowledge is a dangerous thing", "A small amount of knowledge can mislead people into thinking that they are more expert than they really are."));
        proverbs.add(new Proverb("A", "A little learning is a dangerous thing", "A small amount of knowledge can mislead people into thinking that they are more expert than they really are."));
        proverbs.add(new Proverb("A", "A little of what you fancy does you good", "A euphemistic way of expressing the benefits of sex."));
        proverbs.add(new Proverb("A", "A man is known by his friends", "Unknown"));
        proverbs.add(new Proverb("A", "A man who is his own lawyer has a fool for his client", "Literal meaning. This proverb is based on the opinion, probably first expressed by a lawyer, that self-representation in court is likely to end badly."));
        proverbs.add(new Proverb("A", "A miss is as good as a mile", "A [narrow] miss is as bad as a wide miss - they are both misses."));
        proverbs.add(new Proverb("A", "A new broom sweeps clean", "Unknown"));
        proverbs.add(new Proverb("A", "A nod's as good as a wink to a blind horse", "To a person who is ready to understand or undertake something, any subtle signalling of it is sufficient. The context is usually of some undertaking that is borderline illegal or of sexual innuendo."));
        proverbs.add(new Proverb("A", "A penny saved is a penny earned", "It is as useful to save money that you already have as it is to earn more."));
        proverbs.add(new Proverb("A", "A picture paints a thousand words", "A picture tells a story just as well as, if not better than, a lot of written words."));
        proverbs.add(new Proverb("A", "A place for everything and everything in its place", "The notion that everything should have a place to be stored and that it should be tidily returned there when not in use."));
        proverbs.add(new Proverb("A", "A poor workman always blames his tools", "Unknown"));
        proverbs.add(new Proverb("A", "A person is known by the company he keeps", "Unknown"));
        proverbs.add(new Proverb("A", "A problem shared is a problem halved", "Unknown"));
        proverbs.add(new Proverb("A", "A prophet is not recognized in his own land", "Unknown"));
        proverbs.add(new Proverb("A", "A rising tide lifts all boats", "Unknown"));
        proverbs.add(new Proverb("A", "A rolling stone gathers no moss", "Unknown"));
        proverbs.add(new Proverb("A", "A soft answer turneth away wrath", "Unknown"));
        proverbs.add(new Proverb("A", "A stitch in time saves nine", "A timely effort will prevent more work later."));
        proverbs.add(new Proverb("A", "A thing of beauty is a joy forever", "Literal meaning."));
        proverbs.add(new Proverb("A", "A trouble shared is a trouble halved", "Unknown"));
        proverbs.add(new Proverb("A", "A volunteer is worth twenty pressed men", "Unknown"));
        proverbs.add(new Proverb("A", "A watched pot never boils", "Time feels longer when you're waiting for something to happen."));
        proverbs.add(new Proverb("A", "A woman is only a woman, but a good cigar is a smoke", "Unknown"));
        proverbs.add(new Proverb("A", "A woman's place is in the home", "Literal meaning."));
        proverbs.add(new Proverb("A", "A woman's work is never done", "Unknown"));
        proverbs.add(new Proverb("A", "A word to the wise is enough", "Unknown"));
        proverbs.add(new Proverb("A", "Absence makes the heart grow fonder", "The lack of something increases the desire for it."));
        proverbs.add(new Proverb("A", "Absolute power corrupts absolutely", "Literal meaning."));
        proverbs.add(new Proverb("A", "Accidents will happen", "Things sometimes go wrong, despite our best efforts."));
        proverbs.add(new Proverb("A", "Actions speak louder than words", "Unknown"));
        proverbs.add(new Proverb("A", "Adversity makes strange bedfellows", "Unknown"));
        proverbs.add(new Proverb("A", "After a storm comes a calm", "Unknown"));
        proverbs.add(new Proverb("A", "All good things come to he who waits", "A literal meaning, advocating patience."));
        proverbs.add(new Proverb("A", "All good things must come to an end", "Unknown"));
        proverbs.add(new Proverb("A", "All is grist that comes to the mill", "All things are a potential source of profit or advantage."));
        proverbs.add(new Proverb("A", "All publicity is good publicity", "Literal meaning."));
        proverbs.add(new Proverb("A", "All roads lead to Rome", "Unknown"));
        proverbs.add(new Proverb("A", "All that glisters is not gold", "Not everything that is shiny and superficially attractive is valuable."));
        proverbs.add(new Proverb("A", "All the world loves a lover", "Unknown"));
        proverbs.add(new Proverb("A", "All things come to those who wait", "Unknown"));
        proverbs.add(new Proverb("A", "All things must pass", "Nothing lasts forever."));
        proverbs.add(new Proverb("A", "All work and no play makes Jack a dull boy", "Unknown"));
        proverbs.add(new Proverb("A", "All you need is love", "Unknown"));
        proverbs.add(new Proverb("A", "All's fair in love and war", "Unknown"));
        proverbs.add(new Proverb("A", "All's for the best in the best of all possible worlds", "Unknown"));
        proverbs.add(new Proverb("A", "All's well that ends well", "A risky enterprise is justified so long as it turns out well in the end."));
        proverbs.add(new Proverb("A", "An apple a day keeps the doctor away", "Literal meaning."));
        proverbs.add(new Proverb("A", "An army marches on its stomach", "Unknown"));
        proverbs.add(new Proverb("A", "An Englishman's home is his castle", "The English dictum that a man's home is his refuge."));
        proverbs.add(new Proverb("A", "An eye for an eye, a tooth for a tooth", "The notion that for every wrong done there should be a compensating measure of justice."));
        proverbs.add(new Proverb("A", "An ounce of prevention is worth a pound of cure", "Unknown"));
        proverbs.add(new Proverb("A", "Another day, another dollar", "Unknown"));
        proverbs.add(new Proverb("A", "Any port in a storm", "Unknown"));
        proverbs.add(new Proverb("A", "Appearances can be deceptive", "Unknown"));
        proverbs.add(new Proverb("A", "April is the cruelest month", "Unknown"));
        proverbs.add(new Proverb("A", "April showers bring forth May flowers", "Unknown"));
        proverbs.add(new Proverb("A", "As thick as thieves", "Close friends with; sharing confidences."));
        proverbs.add(new Proverb("A", "As you make your bed, so you must lie upon it", "Unknown"));
        proverbs.add(new Proverb("A", "As you sow so shall you reap", "Your deeds, good or bad, will repay you in kind."));
        proverbs.add(new Proverb("A", "Ashes to ashes dust to dust", "We come from dust; we return to dust."));
        proverbs.add(new Proverb("A", "Ask a silly question and you'll get a silly answer", "Literal meaning."));
        proverbs.add(new Proverb("A", "Ask no questions and hear no lies", "Unknown"));
        proverbs.add(new Proverb("A", "Attack is the best form of defence", "Unknown"));

        proverbs.add(new Proverb("B", "Bad money drives out good", "Unknown"));
//        proverbs.add(new Proverb("B", "", "Unknown"));
//        proverbs.add(new Proverb("B", "", "Unknown"));
//        proverbs.add(new Proverb("B", "", "Unknown"));
//        proverbs.add(new Proverb("B", "", "Unknown"));
//        proverbs.add(new Proverb("B", "", "Unknown"));
//        proverbs.add(new Proverb("B", "", "Unknown"));
//        proverbs.add(new Proverb("B", "", "Unknown"));

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