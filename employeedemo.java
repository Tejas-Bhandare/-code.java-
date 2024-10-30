public class employeedemo {
    public static void main(String[] args){
        employee empOne=new employee();
        empOne.setEmpId(11);
        empOne.setName("Akash");
        empOne.setDesignation("Backend Developer");
        empOne.setDept("IT");
        empOne.setSalary(20000000);

        System.out.println("Employee Details");
        System.out.println("EmpId = "+empOne.getEmpId());
        System.out.println("EmpName = "+empOne.getName());
        System.out.println("EmpDesignation = "+empOne.getDesignation());
        System.out.println("EmpSalary = "+empOne.getSalary());

        
    }
}
