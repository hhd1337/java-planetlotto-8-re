package planetlotto.converter;

import java.util.List;
import java.util.stream.Collectors;
import planetlotto.domain.MyLotto;
import planetlotto.domain.MyLottos;

public class LottosToDoubleListConverter implements Converter<MyLottos, List<List<Integer>>> {
    @Override
    public List<List<Integer>> convert(MyLottos myLottos) {
        List<MyLotto> myLottoList = myLottos.getMyLottoList();

        return myLottoList.stream()
                .map(MyLotto::getNumbers)
                .collect(Collectors.toList());
    }
}