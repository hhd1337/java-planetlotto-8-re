package planetlotto.domain;

import java.util.Map;

public class LottoResult {
    private final Map<LottoRank, Integer> countsByRank; // 랭크, 몇개당첨

    public LottoResult(Map<LottoRank, Integer> countsByRank) {
        this.countsByRank = countsByRank;
    }

    public Map<LottoRank, Integer> getCountsByRank() {
        return countsByRank;
    }
}
