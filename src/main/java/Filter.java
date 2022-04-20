import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int element : list) {
            if (element < treshold) {
                result.add(element);
                logger.log("Элемент " + element + " проходит");
            } else {
                logger.log("Элемент " + element + " НЕ проходит!");
            }
        }
        return result;
    }
}