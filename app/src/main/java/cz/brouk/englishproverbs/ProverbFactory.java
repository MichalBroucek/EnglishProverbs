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
        proverbs.add(new Proverb("B", "Bad news travels fast", "Unknown"));
        proverbs.add(new Proverb("B", "Barking dogs seldom bite", "Unknown"));
        proverbs.add(new Proverb("B", "Be careful what you wish for", "Unknown"));
        proverbs.add(new Proverb("B", "Beat swords into ploughshares", "Turn to peaceful pursuits and away from war."));
        proverbs.add(new Proverb("B", "Beauty is in the eye of the beholder", "Literal meaning - the perception of beauty is subjective."));
        proverbs.add(new Proverb("B", "Beauty is only skin deep", "Physical beauty is superficial."));
        proverbs.add(new Proverb("B", "Beggars should not be choosers", "If you request something to be given you should not question what you are given."));
        proverbs.add(new Proverb("B", "Behind every great man there's a great woman", "Literal meaning."));
        proverbs.add(new Proverb("B", "Better late than never", "To arrive or do something later than expected isn't good, but it is better than not at all."));
        proverbs.add(new Proverb("B", "Better safe than sorry", "Unknown"));
        proverbs.add(new Proverb("B", "Better the Devil you know than the Devil you don't", "Unknown"));
        proverbs.add(new Proverb("B", "Better to have loved and lost than never to have loved at all", "Literal meaning"));
        proverbs.add(new Proverb("B", "Better to light a candle than to curse the darkness", "Unknown"));
        proverbs.add(new Proverb("B", "Better to remain silent and be thought a fool that to speak and remove all doubt", "Unknown"));
        proverbs.add(new Proverb("B", "Beware of Greeks bearing gifts", "Don't trust your enemies."));
        proverbs.add(new Proverb("B", "Beware the Ides of March", "From Shakespeare's Julius Caesar, 1601. 'Beware the Ides of March' is the soothsayer's message to Julius Caesar, warning of his death."));
        proverbs.add(new Proverb("B", "Big fish eat little fish", "Unknown"));
        proverbs.add(new Proverb("B", "Birds of a feather flock together", "Those of similar taste congregate in groups."));
        proverbs.add(new Proverb("B", "Blessed are the peacemakers", "Matthew 5:9 Blessed are the peacemakers: for they shall be called the children of God."));
        proverbs.add(new Proverb("B", "Blood is thicker than water", "So it is, but this proverb hasn't to do with measures of viscosity. The expression, meaning that family bonds are closer than those of outsiders."));
        proverbs.add(new Proverb("B", "Blue are the hills that are far away", "Unknown"));
        proverbs.add(new Proverb("B", "Boys will be boys", "Unknown"));
        proverbs.add(new Proverb("B", "Brevity is the soul of wit", "There's no briefer way of expressing this thought than Shakespeare's; making further explanation redundant."));
        proverbs.add(new Proverb("B", "Business before pleasure", "Unknown"));

        proverbs.add(new Proverb("C", "Caesar's wife must be above suspicion", "Unknown"));
        proverbs.add(new Proverb("C", "Carpe diem", "The meaning is similar to that of many proverbs that we continue to use in English and is a warning to make the most of the time we have, with the implication that our time on Earth is short."));
        proverbs.add(new Proverb("C", "Charity begins at home", "A proverb that expresses the overriding demands of taking care of one's family, before caring for others."));
        proverbs.add(new Proverb("C", "Charity covers a multitude of sins", "Unknown"));
        proverbs.add(new Proverb("C", "Cheaters never win and winners never cheat", "Unknown"));
        proverbs.add(new Proverb("C", "Cheats never prosper", "Unknown"));
        proverbs.add(new Proverb("C", "Children and fools tell the truth", "Unknown"));
        proverbs.add(new Proverb("C", "Children should be seen and not heard", "Literal meaning."));
        proverbs.add(new Proverb("C", "Christmas comes but once a year", "Unknown"));
        proverbs.add(new Proverb("C", "Cleanliness is next to godliness", "Unknown"));
        proverbs.add(new Proverb("C", "Clothes maketh the man", "Unknown"));
        proverbs.add(new Proverb("C", "Cold hands, warm heart", "Unknown"));
        proverbs.add(new Proverb("C", "Comparisons are odious", "Literal meaning."));
        proverbs.add(new Proverb("C", "Count your blessings", "Unknown"));
        proverbs.add(new Proverb("C", "Cowards may die many times before their death", "Unknown"));
        proverbs.add(new Proverb("C", "Crime doesn't pay", "Unknown"));
        proverbs.add(new Proverb("C", "Cut your coat to suit your cloth", "Unknown"));

        proverbs.add(new Proverb("D", "Dead men tell no tales", "Unknown"));
        proverbs.add(new Proverb("D", "Devil take the hindmost", "A proverbial phrase indicating that those who lag behind will receive no aid."));
        proverbs.add(new Proverb("D", "Discretion is the better part of valour", "Literal meaning."));
        proverbs.add(new Proverb("D", "Distance lends enchantment to the view", "Unknown"));
        proverbs.add(new Proverb("D", "Do as I say, not as I do", "Unknown"));
        proverbs.add(new Proverb("D", "Do as you would be done by", "Literal meaning."));
        proverbs.add(new Proverb("D", "Do unto others as you would have them do to you", "Literal meaning."));
        proverbs.add(new Proverb("D", "Don't bite the hand that feeds you", "Unknown"));
        proverbs.add(new Proverb("D", "Don't burn your bridges behind you", "Unknown"));
        proverbs.add(new Proverb("D", "Don't cast your pearls before swine", "Items of quality offered to those who aren't cultured enough to appreciate them."));
        proverbs.add(new Proverb("D", "Don't change horses in midstream", "Don't change your leader or your basic position when part-way through a campaign or a project."));
        proverbs.add(new Proverb("D", "Don't count your chickens before they are hatched", "Don't be hasty in evaluating one's assets."));
        proverbs.add(new Proverb("D", "Don't cross the bridge till you come to it", "Unknown"));
        proverbs.add(new Proverb("D", "Don't cut off your nose to spite your face", "Unknown"));
        proverbs.add(new Proverb("D", "Don't get mad, get even", "Unknown"));
        proverbs.add(new Proverb("D", "Don't keep a dog and bark yourself", "Don't pay someone to do a task and then do it yourself."));
        proverbs.add(new Proverb("D", "Don't leave your manners on the doorstep", "Unknown"));
        proverbs.add(new Proverb("D", "Don't let the bastards grind you down", "The meaning of this proverbial saying is self evident."));
        proverbs.add(new Proverb("D", "Don't let the grass grow under your feet", "Unknown"));
        proverbs.add(new Proverb("D", "Don't meet troubles half-way", "Unknown"));
        proverbs.add(new Proverb("D", "Don't mix business with pleasure", "Unknown"));
        proverbs.add(new Proverb("D", "Don't put all your eggs in one basket", "Unknown"));
        proverbs.add(new Proverb("D", "Don't put the cart before the horse", "Reverse the accepted or logical order of things."));
        proverbs.add(new Proverb("D", "Don't put new wine into old bottles", "Unknown"));
        proverbs.add(new Proverb("D", "Don't rock the boat", "Unknown"));
        proverbs.add(new Proverb("D", "Don't shoot the messenger", "Unknown"));
        proverbs.add(new Proverb("D", "Don't spoil the ship for a ha'porth of tar", "Unknown"));
        proverbs.add(new Proverb("D", "Don't sweat the small stuff", "Unknown"));
        proverbs.add(new Proverb("D", "Don't throw pearls to swine", "Unknown"));
        proverbs.add(new Proverb("D", "Don't teach your Grandma to suck eggs", "Don't offer advice to someone who has more experience than oneself."));
        proverbs.add(new Proverb("D", "Don't throw the baby out with the bathwater", "Don't discard something valuable along with something undesirable."));
        proverbs.add(new Proverb("D", "Don't trust anyone over thirty", "Unknown"));
        proverbs.add(new Proverb("D", "Don't try to run before you can walk", "Unknown"));
        proverbs.add(new Proverb("D", "Don't try to walk before you can crawl", "Unknown"));
        proverbs.add(new Proverb("D", "Don't upset the apple-cart", "Unknown"));
        proverbs.add(new Proverb("D", "Don't wash your dirty linen in public", "Unknown"));
        proverbs.add(new Proverb("D", "Doubt is the beginning not the end of wisdom", "Unknown"));

        proverbs.add(new Proverb("E", "Early to bed and early to rise, makes a man healthy, wealthy and wise", "Literal meaning."));
        proverbs.add(new Proverb("E", "", "Unknown"));

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