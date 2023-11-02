package Practice.Lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoMachine {

    public Set<Integer> generateLottoNumbers() {
        Random random = new Random();
        Set<Integer> lottoNumbers = new HashSet<>();

        while (lottoNumbers.size() < 6) {
            int number = random.nextInt(45) + 1;
            lottoNumbers.add(number);

        }
        return lottoNumbers;
    }

}

