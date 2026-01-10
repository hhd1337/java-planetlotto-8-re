package planetlotto.controller;

import planetlotto.converter.LottosToDoubleListConverter;
import planetlotto.domain.LottoGenerator;
import planetlotto.domain.MyLottos;
import planetlotto.view.InputView;
import planetlotto.view.OutputView;

public class PlanetLottoController {

    public void process() {
        LottoGenerator lottoGenerator = new LottoGenerator();
        LottosToDoubleListConverter doubleListconverter = new LottosToDoubleListConverter();

        int amount = InputView.askAmount();
        MyLottos myLottos = lottoGenerator.generateLottos(amount);

        OutputView.printPurchasedLottos(doubleListconverter.convert(myLottos));

        InputView.askWinningLotto();
    }

}
