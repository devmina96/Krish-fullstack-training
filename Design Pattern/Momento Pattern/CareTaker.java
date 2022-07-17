import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Momento> mementoList = new ArrayList<>();

    public void add(Momento state)
    {
        mementoList.add(state);
    }

    public Momento get(int index)
    {
        return mementoList.get(index);
    }
}
