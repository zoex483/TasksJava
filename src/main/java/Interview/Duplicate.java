package Interview;

import java.util.List;

public class Duplicate {
    public int findDuplicateNumber(List<Integer> numbers) {

        int highestNumber = numbers.size() - 1;
        int total = getSum(numbers);
        int duplicate1 = total - (highestNumber * (highestNumber + 1) / 2);
        return duplicate1;
    }

    public int getSum(List<Integer> numbers) {

        int sum = 0;


        return sum;
    }
}
