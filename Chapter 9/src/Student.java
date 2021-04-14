public class Student {
    private int id;
    private String name;
    private java.util.Date dateCreated;

    public Student(int ssn, String newName){
        id = ssn;
        name = newName;
        dateCreated = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public java.util.Date getDateCreated() {//IMPORTANT
        return dateCreated;
    }
}
/*
As shown in the following code, the data field dateCreated is returned using the getDateCreated() method.
This is a reference to a Date object.
Through this reference, the content for dateCreated can be changed.
 */
