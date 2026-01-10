package planetlotto.domain;

import java.util.LinkedHashMap;
import java.util.Map;

public class LottoResult {
    private final Map<LottoRank, Integer> countsByRank; // 랭크, 몇개당첨

    public LottoResult(Map<LottoRank, Integer> countsByRank) {
        this.countsByRank = countsByRank;
    }

    /**
     * index 0번은 미당첨 index 1~5번은 1~5등 으로  반환.
     */
    public Map<Integer, Integer> getCountsByRankInt() {
        Map<Integer, Integer> intMap = new LinkedHashMap<>();

        intMap.put(0, countsByRank.get(LottoRank.MISS));
        intMap.put(1, countsByRank.get(LottoRank.FIRST));
        intMap.put(2, countsByRank.get(LottoRank.SECOND));
        intMap.put(3, countsByRank.get(LottoRank.THIRD));
        intMap.put(4, countsByRank.get(LottoRank.FOURTH));
        intMap.put(5, countsByRank.get(LottoRank.FIFTH));

        return intMap;
    }
}
