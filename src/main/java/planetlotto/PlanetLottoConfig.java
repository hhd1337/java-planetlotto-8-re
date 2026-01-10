package planetlotto;

import planetlotto.controller.InputHandler;
import planetlotto.controller.PlanetLottoController;
import planetlotto.converter.LottosToDoubleListConverter;
import planetlotto.domain.LottoGenerator;
import planetlotto.domain.LottoResultCalculator;
import planetlotto.domain.WinningLottoGenerator;

public class PlanetLottoConfig {

    private InputHandler inputHandler;
    private PlanetLottoController planetlottoController;
    private LottoGenerator lottoGenerator;
    private WinningLottoGenerator winningLottoGenerator;
    private LottoResultCalculator lottoResultCalculator;
    private LottosToDoubleListConverter doubleListconverter;


    public InputHandler inputHandler() {
        if (inputHandler == null) {
            inputHandler = new InputHandler();
        }
        return inputHandler;
    }

    public LottoGenerator lottoGenerator() {
        if (lottoGenerator == null) {
            lottoGenerator = new LottoGenerator();
        }
        return lottoGenerator;
    }

    public WinningLottoGenerator winningLottoGenerator() {
        if (winningLottoGenerator == null) {
            winningLottoGenerator = new WinningLottoGenerator();
        }
        return winningLottoGenerator;
    }

    public LottoResultCalculator lottoResultCalculator() {
        if (lottoResultCalculator == null) {
            lottoResultCalculator = new LottoResultCalculator();
        }
        return lottoResultCalculator;
    }

    public LottosToDoubleListConverter doubleListconverter() {
        if (doubleListconverter == null) {
            doubleListconverter = new LottosToDoubleListConverter();
        }
        return doubleListconverter;
    }

    public PlanetLottoController planetLottoController() {
        if (planetlottoController == null) {
            planetlottoController = new PlanetLottoController(inputHandler(), lottoGenerator(), winningLottoGenerator(),
                    lottoResultCalculator(), doubleListconverter());
        }
        return planetlottoController;
    }
}
