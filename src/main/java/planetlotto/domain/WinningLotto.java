package planetlotto.domain;

import java.util.List;

public class WinningLotto {
    private List<Integer> numbers;
    int bonusNumber;

    public WinningLotto(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void addBonusNumber(int bonusNumber) {
        this.bonusNumber = bonusNumber;
    }
}
