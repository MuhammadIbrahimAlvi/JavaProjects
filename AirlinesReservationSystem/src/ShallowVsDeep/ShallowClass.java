package ShallowVsDeep;

class Contact implements Cloneable{
    private long phoneNo;
    private String email;
    private String address;
    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    Contact(long phoneNo, String email, String address ){
        this.phoneNo = phoneNo;
        this.email = email;
        this.address = address;
    }
    public void displayContact() {
        System.out.println("Phone no: "+this.phoneNo);
        System.out.println("Email: "+this.email);
        System.out.println("Address: "+this.address);
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public String toString() {
        return "    phone:{}"+this.phoneNo+ "    email:{}" + this.email;
    }

}
 class StudentData implements Cloneable {
    private String name;
    private int age;
    private Contact contact;

    public StudentData(String name, int age, Contact contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    public void displayData() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        contact.displayContact();
    }

     protected Object clone() throws CloneNotSupportedException{
         StudentData student = (StudentData) super.clone();
         student.contact = (Contact) contact.clone();
         return student;
     }

    public static void main(String[] args) throws CloneNotSupportedException {


        //Creating an object of the class
        StudentData std = new StudentData("Ibrahim", 23, new Contact(54231345, "ibrahim@nisum.com", "test"));
        //Creating a clone of the above object
        StudentData copiedStd = (StudentData) std.clone();
        System.out.println("old copied object::");
        copiedStd.contact.displayContact();
        //Modifying the data of the contact object
        copiedStd.contact.setPhoneNo(000000000);
        copiedStd.contact.setEmail("XXXXXXXXXX");
        copiedStd.contact.setAddress("XXXXXXXXXX");
        System.out.println("Contents of the copied object::");
        //copiedStd.displayData();
        std.displayData();
        System.out.println(std);
    }

     public String toString() {
         return "name:"+ this.name + "   contact{} " + this.contact;

     }


}