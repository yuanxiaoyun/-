package disicishiyan;

 public class Doctoralcandidate implements Studentmanage,Teachermanage {
      String name;
      String sex;
      double fee;
     double pay;

      Doctoralcandidate(String name,String sex, double fee, double pay) {
         this.name = name;
         this.sex = sex;
         this.fee = fee;
         this.pay = pay;
     }
     public String toString() {
         return "姓名：" + name + "性别：" + sex  + "学费：" + fee + "薪水：" + pay;
     }

     public void Fee() {
         System.out.println("缴纳的学费为："+fee);
     }

     public void foundFee() {
         System.out.println("学费查询为"+fee);
     }

     public void Pay() {
         System.out.println("薪水为："+pay);
     }

     public void foundPay() {
         System.out.println("薪水查询为"+pay);
     }

 }

