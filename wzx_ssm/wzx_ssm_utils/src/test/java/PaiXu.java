import org.junit.Test;

import java.util.Arrays;

/**
 * @author wangzhixian
 * @date 2019-09-21 11:31
 */
public class PaiXu {
    @Test
    public void px(){
        int [] arr = {5,9,8,1,7,3};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
