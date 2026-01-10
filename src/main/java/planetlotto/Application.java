package planetlotto;

import planetlotto.controller.PlanetLottoController;

public class Application {
    public static void main(String[] args) {
        PlanetLottoController planetLottoController = new PlanetLottoController();
        planetLottoController.process();
    }
}
