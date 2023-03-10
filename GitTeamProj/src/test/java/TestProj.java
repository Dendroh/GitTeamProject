import org.example.calcurator.Addfunc;
import org.example.calcurator.Mulfunc;
import org.example.calcurator.Meanfunc;

public class TestProj {
  public static void main(String[] args) {
    int left = 10;
    int right = 4;

    Addfunc addfunc = new Addfunc(10, 4);
    System.out.println(addfunc.result());
    System.out.println("commit test");

    System.out.println("develop");


    Mulfunc mulfunc = new Mulfunc(left, right);
    System.out.println(mulfunc.result());

    Meanfunc meanfunc = new Meanfunc(left, right);
    System.out.println(meanfunc.result());
  }
}
