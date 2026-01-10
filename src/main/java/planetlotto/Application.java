package planetlotto;

import planetlotto.controller.PlanetLottoController;

public class Application {
    public static void main(String[] args) {
        PlanetLottoConfig planetLottoConfig = new PlanetLottoConfig();
        PlanetLottoController planetLottoController = planetLottoConfig.planetLottoController();
        planetLottoController.process();
    }
}
