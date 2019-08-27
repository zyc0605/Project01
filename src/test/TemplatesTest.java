package test;

/**
 * @author zyc
 * @create 2019/8/25-16:06
 */

import bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *1.  IDEA中代码模板的位置：settings-editor-live templates/postfix completion.
 *         2. 常用的模板S
 *
 */


public class TemplatesTest {

    //模板六： prsf：可生成 private static final
    private static final Customer CUST = new Customer();
    //变形: psf
    public static final int NUM = 1;
    //变形: psfi
    public static final int NUM2 = 2;
    //变形: psfs
    public static final String NATION = "China";



    //模板一：psvm
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("hello world");
        //变形: soutp/soutm/souty/xxx.out
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");

        int num  = 10;
        System.out.println("num = " + num);

        System.out.println(num);  //num.out

        //模板三： fori
        String[] arr = new String[]{"Tom","Jerry"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        //变形： iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形： itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        
        //模板四： list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {
            
        }
        //变形： list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形： list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

    }

    public void method(){
        System.out.println("TemplatesTest.method");

        //模板五： ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        if (list == null) {

        }
        //变形： inn
        if (list != null) {

        }
        //变形： xxx.nn/xxx.null
        if (list != null) {

        }
        if (list == null) {

        }

    }

}