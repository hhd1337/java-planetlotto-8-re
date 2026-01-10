package planetlotto.domain;

public enum LottoRank {

    FIRST(5, false, 100_000_000),
    SECOND(4, true, 10_000_000),
    THIRD(4, false, 1_500_000),
    FOURTH(3, false, 500_000),
    FIFTH(2, false, 5_000),
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
        if (matchCount == 5) {
            return FIRST;
        }
        if (matchCount == 4 && isBonusNumMatches) {
            return SECOND;
        }
        if (matchCount == 4) {
            return THIRD;
        }
        if (matchCount == 3) {
            return FOURTH;
        }
        if (matchCount == 2) {
            return FIFTH;
        }
        return MISS;
    }
}
