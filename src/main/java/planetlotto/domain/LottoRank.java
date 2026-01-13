package planetlotto.domain;

import java.util.Arrays;

public enum LottoRank {

    FIRST(5, null, 100_000_000),
    SECOND(4, true, 10_000_000),
    THIRD(4, false, 1_500_000),
    FOURTH(3, true, 500_000),
    FIFTH(2, true, 5_000),
    MISS(0, null, 0);

    private final int matchCount;
    private final Boolean requiredBonusNumMatch;
    private final int prizeMoney;

    LottoRank(int matchCount, Boolean requiredBonusNumMatch, int prizeMoney) {
        this.matchCount = matchCount;
        this.requiredBonusNumMatch = requiredBonusNumMatch;
        this.prizeMoney = prizeMoney;
    }

    public static LottoRank findRankByMatchCountAndBonus(int matchCount, boolean bonusMatched) {
        return Arrays.stream(values())
                .filter(rank -> rank.matches(matchCount, bonusMatched))
                .findFirst()
                .orElse(MISS);
    }

    private boolean matches(int matchCount, boolean bonusMatched) {
        if (this.requiredBonusNumMatch == null) {
            return this.matchCount == matchCount;
        }
        return this.matchCount == matchCount && this.requiredBonusNumMatch == bonusMatched;
    }
}
