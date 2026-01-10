package planetlotto.util;

import java.util.ArrayList;
import java.util.List;
import planetlotto.converter.StringToIntConverter;

public class DelimiterParser {

    public List<Integer> parse(String input, String delimiter) {
        StringToIntConverter intConverter = new StringToIntConverter();
        validateBlankAndNull(input);

        String[] parts = input.split(delimiter);

        List<Integer> result = new ArrayList<>();
        for (String part : parts) {
            int number = intConverter.convertPositiveInt(part.trim());
            result.add(number);
        }
        return result;
    }

    private static void validateBlankAndNull(String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException("입력이 비어있습니다.");
        }
    }
}
