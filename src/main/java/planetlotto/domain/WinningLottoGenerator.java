package planetlotto.domain;

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
        if (numbers.size() != 5) {
            throw new IllegalArgumentException("당첨번호는 5개여야 합니다.");
        }
        boolean isNumbersInRange = numbers.stream().allMatch(number -> number >= 1 && number <= 30);
        if (!isNumbersInRange) {
            throw new IllegalArgumentException("당첨번호 숫자는 모두 1부터 30 사이의 숫자여야 합니다.");
        }
        long distinctNumCount = numbers.stream().distinct().count();
        if (distinctNumCount < numbers.size()) {
            throw new IllegalArgumentException("당첨번호 숫자중 중복된 숫자가 있습니다.");
        }
    }
}
