class Teacher extends Person {
    String subject;

    void setTeacherDetails(String n, int a, String s) {
        setPersonDetails(n, a);
        subject = s;
    }

    // Display teacher details
    void displayTeacherDetails() {
        System.out.println("=== Teacher Details ===");
        displayPersonDetails();  // inherited from Person
        System.out.println("Subject: " + subject);
    }
}