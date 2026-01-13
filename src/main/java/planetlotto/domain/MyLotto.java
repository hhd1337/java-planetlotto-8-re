package planetlotto.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyLotto {
    private List<Integer> numbers;

    public MyLotto(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public boolean containsBonus(int bonusNumber) {
        return numbers.contains(bonusNumber);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public int countMatchesWith(WinningLotto winningLotto) {
        Set<Integer> winningNumbers = new HashSet<>(winningLotto.getNumbers());
        int count = 0;
        for (int number : numbers) {
            if (winningNumbers.contains(number)) {
                count++;
            }
        }
        return count;
    }

}
