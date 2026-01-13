package planetlotto.domain;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LottoResultCalculator {
    public LottoResult calculateLottoResult(MyLottos myLottos, WinningLotto winningLotto) {
        Map<LottoRank, Integer> winCounts = calculateWinCounts(myLottos, winningLotto);

        return new LottoResult(winCounts);
    }

    public Map<LottoRank, Integer> calculateWinCounts(MyLottos myLottos, WinningLotto winningLotto) {
        List<MyLotto> lottos = myLottos.getMyLottoList();
        Map<LottoRank, Integer> winCounts = initWinCounts();

        for (MyLotto lotto : lottos) {
            LottoRank rank = calculateLottoRank(lotto, winningLotto);
            winCounts.put(rank, winCounts.get(rank) + 1);
        }

        return winCounts;
    }

    private LottoRank calculateLottoRank(MyLotto myLotto, WinningLotto winningLotto) {
        int matchCount = countMatchingNumbers(myLotto, winningLotto);
        boolean bonusMatch = myLotto.containsBonus(winningLotto.getBonusNumber());

        return LottoRank.findRankByMatchCountAndBonus(matchCount, bonusMatch);
    }

    private int countMatchingNumbers(MyLotto myLotto, WinningLotto winningLotto) {
        List<Integer> myLottoNumbers = myLotto.getNumbers();
        List<Integer> winningLottoNumbers = winningLotto.getNumbers();

        Set<Integer> set = new HashSet<>(winningLottoNumbers);
        int count = 0;
        for (int number : myLottoNumbers) {
            if (set.contains(number)) {
                count++;
            }
        }
        return count;
    }

    private Map<LottoRank, Integer> initWinCounts() {
        Map<LottoRank, Integer> countByRankMap = new EnumMap<>(LottoRank.class);
        for (LottoRank rank : LottoRank.values()) {
            countByRankMap.put(rank, 0);
        }
        return countByRankMap;
    }
}
