package planetlotto.controller;

import planetlotto.domain.LottoGenerater;
import planetlotto.domain.MyLottos;
import planetlotto.view.InputView;

public class PlanetLottoController {

    public void process() {
        LottoGenerater lottoGenerater = new LottoGenerater();
        int amount = InputView.askAmount();
        MyLottos myLottos = lottoGenerater.generateLottos(amount);


    }

}
