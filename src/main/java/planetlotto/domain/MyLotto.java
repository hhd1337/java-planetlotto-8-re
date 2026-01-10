package planetlotto.domain;

import java.util.List;

public class MyLotto {
    private List<Integer> numbers;

    public MyLotto(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
