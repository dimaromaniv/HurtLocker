public  class GroceryItems {
    private String name;
    private double price;
    private String type;
    private String expiration;


    public GroceryItems(String expectedName ,Double expectedPrice,String expectedType ,String expectedData){
        this.name = expectedName;
        this.price = expectedPrice;
        this.type = expectedType;
        this.expiration = expectedData;

    }

    public GroceryItems(){
        this.name = "";
        this.price = 0.0;
        this.type = "";
        this.expiration = "";

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }


    //GroceryItems{name='BreaD', price=1.23, type='Food', expiration='1/02/2016'}

    public String itemToString() {
        return "Current item name: " + name+ "\n" +
                "price: " + price +"\n"+
                "type: " + type + "\n" +
                "expirationDate: " + expiration ;
    }
}
