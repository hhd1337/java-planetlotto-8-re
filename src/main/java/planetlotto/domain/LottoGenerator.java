package planetlotto.domain;

import static planetlotto.domain.LottoRule.LOTTO_MAX_NUMBER;
import static planetlotto.domain.LottoRule.LOTTO_MIN_NUMBER;
import static planetlotto.domain.LottoRule.LOTTO_SIZE;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class LottoGenerator {

    public MyLottos generateLottos(int amount) {
        int lottoCount = amount / LottoRule.PRICE_PER_LOTTO;
        List<MyLotto> myLottoList = new ArrayList<>();

        for (int i = 0; i < lottoCount; i++) {
            myLottoList.add(generateLotto());
        }

        return new MyLottos(myLottoList);

    }

    public MyLotto generateLotto() {
        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(LOTTO_MIN_NUMBER, LOTTO_MAX_NUMBER, LOTTO_SIZE);

        return new MyLotto(numbers);
    }
}
