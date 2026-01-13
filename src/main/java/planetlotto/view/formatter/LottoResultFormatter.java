package planetlotto.view.formatter;

import java.util.LinkedHashMap;
import java.util.Map;
import planetlotto.domain.LottoRank;
import planetlotto.domain.LottoResult;

public class LottoResultFormatter {
    /**
     * index 0번은 미당첨 index 1~5번은 1~5등 으로  반환.
     */
    public Map<Integer, Integer> toIntRankMapForOutput(LottoResult lottoResult) {
        Map<LottoRank, Integer> countsByRank = lottoResult.getCountsByRank();
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
