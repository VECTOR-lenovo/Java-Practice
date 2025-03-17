package workshop3;

 class address {
     private String street, city;
     private int zipCode;
     public String getStreetName(){
         return street;
     }
     public String getCityName(){
         return city;
     }
     public int getZipCodeNum(){
         return zipCode;
     }
     public void setStreetName(String street) {
         this.street = street;
     }
     public void setCityName(String city) {
         this.city = city;
     }
     public void setZipCodeNum(int zipCode) {
         this.zipCode = zipCode;
     }
 }

public class Qno11 {
    public static void main(String[] args){
        address address = new address();
        address.setStreetName("Wall Street");
        address.setCityName("New York City");
        address.setZipCodeNum(10005);
        System.out.println("Street: " + address.getStreetName());
        System.out.println("City: " + address.getCityName());
        System.out.println("Zip Code: " + address.getZipCodeNum());
    }
}
