package planetlotto.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class LottoGenerator {

    private static final int PRICE_PER_LOTTO = 500;

    public MyLottos generateLottos(int amount) {
        int lottoCount = amount / PRICE_PER_LOTTO;
        List<MyLotto> myLottoList = new ArrayList<>();

        for (int i = 0; i < lottoCount; i++) {
            myLottoList.add(generateLotto());
        }

        return new MyLottos(myLottoList);

    }

    public MyLotto generateLotto() {
        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 30, 5);

        return new MyLotto(numbers);
    }
}
