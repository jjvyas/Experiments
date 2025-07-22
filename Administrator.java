// Source code is decompiled from a .class file using FernFlower decompiler.
class Administrator extends Person {
   String department;

   Administrator() {
   }

   void setAdministratorDetails(String var1, int var2, String var3) {
      this.setPersonDetails(var1, var2);
      this.department = var3;
   }

   void displayAdministratorDetails() {
      this.displayPersonDetails();
      System.out.println("Department: " + this.department);
   }
}
