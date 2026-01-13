package planetlotto.domain;

import static planetlotto.domain.LottoRule.LOTTO_MAX_NUMBER;
import static planetlotto.domain.LottoRule.LOTTO_MIN_NUMBER;
import static planetlotto.domain.LottoRule.LOTTO_SIZE;

import java.util.ArrayList;
import java.util.List;

public class WinningLottoGenerator {

    public WinningLotto generateWiningLottos(List<Integer> numbers) {

        List<Integer> winningLottoList = new ArrayList<>();

        for (Integer number : numbers) {
            validateNumbers(numbers);
            winningLottoList.add(number);
        }

        return new WinningLotto(winningLottoList);

    }

    private void validateNumbers(List<Integer> numbers) {
        if (numbers.size() != LOTTO_SIZE) {
            throw new IllegalArgumentException("당첨번호는 " + LOTTO_SIZE + "개여야 합니다.");
        }
        boolean isNumbersInRange = numbers.stream()
                .allMatch(number -> number >= LOTTO_MIN_NUMBER && number <= LOTTO_MAX_NUMBER);

        if (!isNumbersInRange) {
            throw new IllegalArgumentException(
                    "당첨번호 숫자는 모두 " + LOTTO_MIN_NUMBER + "부터 " + LOTTO_MAX_NUMBER + "사이의 숫자여야 합니다.");
        }
        long distinctNumCount = numbers.stream().distinct().count();
        if (distinctNumCount < numbers.size()) {
            throw new IllegalArgumentException("당첨번호 숫자중 중복된 숫자가 있습니다.");
        }
    }
}
