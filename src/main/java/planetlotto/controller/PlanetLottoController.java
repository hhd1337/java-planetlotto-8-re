package planetlotto.controller;

import planetlotto.converter.LottosToDoubleListConverter;
import planetlotto.domain.LottoGenerator;
import planetlotto.domain.LottoResult;
import planetlotto.domain.LottoResultCalculator;
import planetlotto.domain.MyLottos;
import planetlotto.domain.WinningLotto;
import planetlotto.domain.WinningLottoGenerator;
import planetlotto.view.InputView;
import planetlotto.view.OutputView;

public class PlanetLottoController {

    public void process() {
        LottoGenerator lottoGenerator = new LottoGenerator();
        WinningLottoGenerator winningLottoGenerator = new WinningLottoGenerator();
        LottosToDoubleListConverter doubleListconverter = new LottosToDoubleListConverter();
        LottoResultCalculator lottoResultCalculator = new LottoResultCalculator();

        int amount = InputView.askAmount();
        MyLottos myLottos = lottoGenerator.generateLottos(amount);

        OutputView.printPurchasedLottos(doubleListconverter.convert(myLottos));

        WinningLotto winningLotto = winningLottoGenerator.generateWiningLottos(InputView.askWinningLotto());
        winningLotto.addBonusNumber(InputView.askBonusNumber());

        LottoResult lottoResult = lottoResultCalculator.calculateLottoResult(myLottos, winningLotto);
        OutputView.printResult(lottoResult.getCountsByRankInt());

    }

}
