package planetlotto.domain;

import java.util.List;

public class MyLottos {
    private List<MyLotto> myLottoList;

    public MyLottos(List<MyLotto> myLottoList) {
        this.myLottoList = myLottoList;
    }

    public List<MyLotto> getMyLottoList() {
        return myLottoList;
    }
}
