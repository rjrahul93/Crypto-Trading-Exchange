class AdminArea{
    String User;

    AdminArea(String un){
        this.User=un;
    }

    public void adminHome(){
       
        System.out.println("Welcome " +User);
        System.out.println("Admin Menu will be Here");
    }
}
