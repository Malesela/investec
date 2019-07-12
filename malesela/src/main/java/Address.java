public class Address {

    private String id;
    private Type type;
    private AddressLine addressLineDetail;
    private Province provinceOrState;
    private String cityOrTown;
    private Country country;
    private String postalCode;
    private String lastUpdated;

    public Address(){
        this.id = "";
        this.type = new Type();
        this.addressLineDetail = new AddressLine();
        this.provinceOrState = new Province();
        this.cityOrTown = "";
        this.country = new Country();
        this.postalCode = "";
        this.lastUpdated = "";
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public AddressLine getAddressLineDetail() {
        return addressLineDetail;
    }

    public void setAddressLineDetail(AddressLine addressLineDetail) {
        this.addressLineDetail = addressLineDetail;
    }

    public Province getProvinceOrState() {
        return provinceOrState;
    }

    public void setProvinceOrState(Province provinceOrState) {
        this.provinceOrState = provinceOrState;
    }

    public String getCityOrTown() {
        return cityOrTown;
    }

    public void setCityOrTown(String cityOrTown) {
        this.cityOrTown = cityOrTown;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }



}
