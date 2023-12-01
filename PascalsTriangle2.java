package DSA;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {

    public static List<Integer> getRow(int rowIndex){

        List<Integer> out = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        if (rowIndex==0){
            out.add(1);
        } else if (rowIndex==1) {
            out.add(1);
            out.add(1);
        }else {
            temp.add(1);
            temp.add(1);
            for (int i=2; i<=rowIndex; i++){
                out = new ArrayList<>();
                out.add(1);
                for (int j=0; j<temp.size()-1; j++){
                    out.add(temp.get(j) + temp.get(j+1));
                }
                out.add(1);
                temp = out;
            }
        }

        return out;
    }

    public static void main(String[] args) {
        List<Integer> out = getRow(4);
        System.out.println(out);
    }
}
