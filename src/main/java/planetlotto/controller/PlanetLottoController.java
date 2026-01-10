package planetlotto.controller;

import planetlotto.converter.LottosToDoubleListConverter;
import planetlotto.domain.LottoGenerater;
import planetlotto.domain.MyLottos;
import planetlotto.view.InputView;
import planetlotto.view.OutputView;

public class PlanetLottoController {

    public void process() {
        LottoGenerater lottoGenerater = new LottoGenerater();
        LottosToDoubleListConverter doubleListconverter = new LottosToDoubleListConverter();

        int amount = InputView.askAmount();
        MyLottos myLottos = lottoGenerater.generateLottos(amount);

        OutputView.printPurchasedLottos(doubleListconverter.convert(myLottos));
    }

}
