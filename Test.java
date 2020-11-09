package disicishiyan;

import java.util.Scanner;

public class Test {
    static String b;//姓名
    static String b1;//性别
    static double b5;//学费
    static double b6;//薪水
    static String d;
    static String d1;
    static double d2;
    static double d3;
    static double s;//第一个税收
    static double z;//第二个税收
    public static void main(String[] arg) {
        Scanner a = new Scanner(System.in);
        a:for(;;) {//异常处理输错 循环
        System.out.println("请依次输入姓名、性别、学费、工资：");
         b = a.next();//姓名
         b1 = a.next();//性别
            try {//判断异常
                Scanner a1 = new Scanner(System.in);
                b5 = a1.nextDouble();//学费
                b6 = a1.nextDouble();//薪水
                break a;//跳出异常处理
            } catch (Exception e) {//输出异常处理
                System.out.println("请输入正确格式！请重新输入");

            }
        }
        s = giveRevenue(b6,b5);//调用方法计算税收
        b:for(;;) {
        System.out.println("请依次输入姓名、性别、学费、工资：");
         d = a.next();
         d1 = a.next();

            try {
                Scanner a2 = new Scanner(System.in);
                 d2 = a2.nextDouble();
                 d3 = a2.nextDouble();
                break b;//跳出异常处理
            } catch (Exception e) {
                System.out.println("请输入正确格式！请重新输入");
            }
        }
        z = giveRevenue(d3,d2);

        System.out.println("请输入姓名："+b);
        System.out.println("性别："+b1);
        System.out.println("每年的学费为："+b5);
        System.out.println("每年的薪水为："+b6);
        Doctoralcandidate studentone = new Doctoralcandidate(b, b1, b5, b6);
        System.out.println("你的信息为:");
        System.out.println(studentone);
        studentone.Fee();
        studentone.foundFee();
        studentone.Pay();
        studentone.foundPay();
        System.out.println("纳税金额为 "+ s);

        System.out.println("    ");
        System.out.println("    ");//换行
        System.out.println("姓名："+d);
        System.out.println("性别："+d1);
        System.out.println("每年的学费为："+d2);
        System.out.println("每年的薪水为："+d3);
        Doctoralcandidate studenttwo = new Doctoralcandidate(d, d1, d2, d3);
        System.out.println("你的信息为:");
        System.out.println(studenttwo);
        studenttwo.Fee();//接口回调
        studenttwo.foundFee();
        studenttwo.Pay();
        studenttwo.foundPay();
        System.out.println("纳税金额为 "+z);
    }
    public final static double giveRevenue(double salary,double tuition) {//计算税收
       double revenue=0;
        tuition=tuition/6;                                                             //平均每月学费
        revenue=salary-tuition; //实际税收金额
        if(revenue<=5000.00) {                           //3%
            return revenue*0.03;
        }
        else if(revenue>5000.00 && revenue<=12000.00) {  //10%
            return (revenue-5000)*0.1+150;
        }
        else if(revenue>12000.00 && revenue<=25000.00) { //20%
            return (revenue-12000)*0.2+850;
        }
        else if(revenue>25000.00 && revenue<=35000.00) { //25%
            return (revenue-25000)*0.25+3450;
        }
        else if(revenue>35000.00 && revenue<=55000.00) { //30%
            return (revenue-35000)*0.3+5950;
        }
        else if(revenue>55000.00 && revenue<=80000.00) { //35%
            return (revenue-55000)*0.35+11950;
        }
        else if(revenue>80000.00) {                      //45%
            return (revenue-80000)*0.45+20700;
        }
        return 0;
    }
}