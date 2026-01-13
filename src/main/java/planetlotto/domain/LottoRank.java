package planetlotto.domain;

import java.util.Arrays;

public enum LottoRank {

    FIRST(5, false, 100_000_000),
    SECOND(4, true, 10_000_000),
    THIRD(4, false, 1_500_000),
    FOURTH(3, true, 500_000),
    FIFTH(2, true, 5_000),
    MISS(0, false, 0);

    private final int matchCount;
    private final boolean isBonusNumMatches;
    private final int prizeMoney;

    LottoRank(int matchCount, boolean isBonusNumMatches, int prizeMoney) {
        this.matchCount = matchCount;
        this.isBonusNumMatches = isBonusNumMatches;
        this.prizeMoney = prizeMoney;
    }

    public static LottoRank findRankByMatchCountAndBonus(int matchCount, boolean isBonusNumMatches) {
        return Arrays.stream(LottoRank.values())
                .filter(rank -> rank.matchCount == matchCount)
                .filter(rank -> rank.isBonusNumMatches == isBonusNumMatches)
                .findFirst()
                .orElse(MISS);
    }
}
