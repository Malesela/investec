import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class AddressParser {
    public static void main(String[] args) throws IOException {

        try (Reader reader = new InputStreamReader(AddressParser.class.getResourceAsStream("addresses.json"), "UTF-8")) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            List<Address> addressList = gson.fromJson(reader, new TypeToken<ArrayList<Address>>() {
            }.getType());

            //print 1 address
            printAddress(addressList.get(1));

            //print all addresses
            printAllAdresses(addressList);

            //print address of a certain type
            printTypeOfAddress(addressList);

            //validate an address
            printValidate(addressList);

        }
    }

    public static void printAddress(Address address) {


        System.out.println("Line details: " + address.getAddressLineDetail().getLine1() + " - " + " City : " + address.getCityOrTown() + " - " + "Province/State : " + address.getProvinceOrState().getName() + " - " +
                "Postal Code :" + address.getPostalCode() + " - " + " Country : " + address.getCountry().getName());
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
    }


    public static void printAllAdresses(List<Address> addressList) {
        for (Address address : addressList) {
            System.out.println("Line details: " + address.getAddressLineDetail().getLine1() + " - " + " City : " + address.getCityOrTown() + " - " + "Province/State : " + address.getProvinceOrState().getName() + " - " +
                    "Postal Code :" + address.getPostalCode() + " - " + " Country : " + address.getCountry().getName());
        }
    }

    public static void printTypeOfAddress(List<Address> addressList) {
        for (Address address : addressList) {
            String type = address.getType().getName();
            if (type.equalsIgnoreCase("Business Address")) {

                System.out.println("Postal Code :" + address.getPostalCode()  + " - "  + "Address :" + " - "+ address.getType().getName());
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------");

    }

    public static boolean printValidate(List<Address> addressList) {
        for (Address address : addressList) {
            String postalCode = address.getPostalCode();
            boolean postalValidate = postalCode.matches("[0-9]+") && postalCode.length() > 2;
            boolean addressValidate =  address.getCountry()!= null && address.getAddressLineDetail() != null;
            if(postalValidate && addressValidate && address.getCountry().getCode() != "ZA"){
                return true;
            }else if(postalValidate && addressValidate && address.getCountry().getCode() == "ZA" && address.getProvinceOrState() != null){
                return true;
            }
        }

        return false;
    }



}
