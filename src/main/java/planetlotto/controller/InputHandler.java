package planetlotto.controller;

import java.util.List;
import planetlotto.view.InputView;
import planetlotto.view.OutputView;

public class InputHandler {

    public int askAmount() {
        while (true) {
            try {
                return InputView.askAmount();
            } catch (IllegalArgumentException e) {
                OutputView.printErrorMessage(e.getMessage());
            }
        }
    }

    public List<Integer> askWinningLotto() {
        while (true) {
            try {
                return InputView.askWinningLotto();
            } catch (IllegalArgumentException e) {
                OutputView.printErrorMessage(e.getMessage());
            }
        }
    }

    public int askBonusNumber() {
        while (true) {
            try {
                return InputView.askBonusNumber();
            } catch (IllegalArgumentException e) {
                OutputView.printErrorMessage(e.getMessage());
            }
        }
    }

}