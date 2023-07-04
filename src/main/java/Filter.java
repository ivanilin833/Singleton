import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold){
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source){
        int count = 0;
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильрацию");
        for (int x : source) {
            if (x < treshold){
                logger.log("Элемент " + x + " не проходит");
            } else {
                logger.log("Элемент " + x + " проходит");
                count++;
                result.add(x);
            }
        }
        logger.log("Прошло фильтр " + count + " элемента из " + source.size());
        return result;
    }
}
