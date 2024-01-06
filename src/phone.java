public class phone {
    private String number;
    private String model;
    private double weight;

    public phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public phone() {
        // Default constructor without parameters
    }

    // Getter for number
    public String getNumber() {
        return number;
    }

    // Methods
    public void receiveCall(String callerName) {
        System.out.println(callerName + " is ringing");
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println(callerName + " is ringing from " + callerNumber);
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.println("Sending message to:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public static void main(String[] args) {

        phone phone1 = new phone("123456789", "Model1", 150.0);
        phone phone2 = new phone("987654321", "Model 9");
        phone phone3 = new phone();


        System.out.println("Phone 1: " + phone1.getNumber() + ", " + phone1.getModel() + ", " + phone1.getWeight());
        System.out.println("Phone 2: " + phone2.getNumber() + ", " + phone2.getModel() + ", " + phone2.getWeight());
        System.out.println("Phone 3: " + phone3.getNumber() + ", " + phone3.getModel() + ", " + phone3.getWeight());

        phone1.receiveCall("Daniel");
        phone2.receiveCall("kamila", "87059549403");
        phone1.sendMessage("119550940", "22222553442");
    }

}
