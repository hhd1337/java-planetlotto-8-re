package planetlotto.controller;

import planetlotto.converter.LottosToDoubleListConverter;
import planetlotto.domain.LottoGenerator;
import planetlotto.domain.LottoResult;
import planetlotto.domain.LottoResultCalculator;
import planetlotto.domain.MyLottos;
import planetlotto.domain.WinningLotto;
import planetlotto.domain.WinningLottoGenerator;
import planetlotto.view.OutputView;

public class PlanetLottoController {
    private final InputHandler inputHandler;
    private final LottoGenerator lottoGenerator;
    private final WinningLottoGenerator winningLottoGenerator;
    private final LottoResultCalculator lottoResultCalculator;
    private final LottosToDoubleListConverter doubleListconverter;

    public PlanetLottoController(InputHandler inputHandler,
                                 LottoGenerator lottoGenerator,
                                 WinningLottoGenerator winningLottoGenerator,
                                 LottoResultCalculator lottoResultCalculator,
                                 LottosToDoubleListConverter doubleListconverter) {
        this.inputHandler = inputHandler;
        this.lottoGenerator = lottoGenerator;
        this.winningLottoGenerator = winningLottoGenerator;
        this.lottoResultCalculator = lottoResultCalculator;
        this.doubleListconverter = doubleListconverter;
    }

    public void process() {
        int amount = inputHandler.askAmount();
        MyLottos myLottos = lottoGenerator.generateLottos(amount);

        OutputView.printPurchasedLottos(doubleListconverter.convert(myLottos));

        WinningLotto winningLotto = winningLottoGenerator.generateWiningLottos(inputHandler.askWinningLotto());
        winningLotto.addBonusNumber(inputHandler.askBonusNumber());

        LottoResult lottoResult = lottoResultCalculator.calculateLottoResult(myLottos, winningLotto);
        OutputView.printResult(lottoResult.getCountsByRankInt());
    }

}
