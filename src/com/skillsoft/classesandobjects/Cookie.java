package com.skillsoft.classesandobjects;

public class Cookie {

    private static int uniqueIdGenerator=10001;

    private static String cookieType="SESSION COOKIE";

    private String id;
    private String userName;
    private String sessionKey;
    private int itemsInCart;



    public Cookie(String userName, String sessionKey,int itemsInCart){

        this.id="cookieId-"+uniqueIdGenerator++;

        this.userName=userName;
        this.sessionKey=sessionKey;
        this.itemsInCart=itemsInCart;

    }



    public String getId(){
        return id;
    }
    public void setId(String userId){
        this.id=id;
    }

    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }

    public String getSessionKey(){
        return sessionKey;
    }
    public void setSessionKey(String sessionKey){
        this.sessionKey=sessionKey;
    }

    public int getItemsInCart(){
        return itemsInCart;
    }
    public void setItemsInCart(int itemsInCart){
        this.itemsInCart=itemsInCart;
    }

    public static String getCookieType(){
        return cookieType;
    }

    public static void setCookieType(String cookieType){
        Cookie.cookieType=cookieType;
    }

    @Override
    public String toString(){
        return String.format("Cookie id: %s, userName: %s, sessionKey: %s, itemsInCart: %d",
                id, userName, sessionKey, itemsInCart);
    }


    public static void main(String[]args){

        System.out.println("Executing code in the cookies class main() method ");

        Cookie c = new Cookie("Alice2","ali@22",2);
        c.instanceMethodOne();
        c.instanceMethodTwo();
        c.instanceMethodThree();

        System.out.println("\n**** Invoke static methods");

        staticMethodThree();
        staticMethodTwo();
        staticMethodOne();


    }

    private void instanceMethodOne(){
        System.out.println("\nInstance one method");
        staticMethodOne();
    }

    private void instanceMethodTwo(){
        System.out.println("\nInstance method two");
    }

    private void instanceMethodThree(){
        System.out.println("\nInstance method three");
    }

    public static void staticMethodOne(){
        System.out.println("\nStatic one method");

        staticMethodTwo();
    }

    public static void staticMethodTwo(){
        System.out.println("\nStatic method two");

        staticMethodThree();
    }

    public static void staticMethodThree(){
        System.out.println("\nStatic method three");

    }
}
