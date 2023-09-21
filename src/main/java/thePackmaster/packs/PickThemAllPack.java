package thePackmaster.packs;

import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.localization.UIStrings;
import thePackmaster.SpireAnniversary5Mod;
import thePackmaster.cards.pickthemallpack.BigBoots;
import thePackmaster.cards.pickthemallpack.BloodWall;
import thePackmaster.cards.pickthemallpack.DeckCheck;
import thePackmaster.cards.pickthemallpack.GoldenPick;

import java.util.ArrayList;

public class PickThemAllPack extends AbstractCardPack {
    public static final String ID = SpireAnniversary5Mod.makeID("PickThemAllPack");
    private static final UIStrings UI_STRINGS = CardCrawlGame.languagePack.getUIString(ID);
    public static final String NAME = UI_STRINGS.TEXT[0];
    public static final String DESC = UI_STRINGS.TEXT[1];
    public static final String AUTHOR = UI_STRINGS.TEXT[2];
    public static final String CREDITS = UI_STRINGS.TEXT[3];

    public PickThemAllPack() {
        super(ID, NAME, DESC, AUTHOR, CREDITS, new PackSummary(4, 2, 4, 4, 3));
    }

    @Override
    public ArrayList<String> getCards() {
        ArrayList<String> cards = new ArrayList<>();
        cards.add(BloodWall.ID);
        cards.add(GoldenPick.ID);
        cards.add(DeckCheck.ID);
        cards.add(BigBoots.ID);
        return cards;
    }
}
