import java.util.ArrayList;
import java.util.List;

public abstract class Packages {

    List<Facilities> facilities = new ArrayList<>();

    Packages(){
        createPackage();
    }

    protected abstract void createPackage();

    public String toString(){
        return "Package "+facilities;
    }
}
