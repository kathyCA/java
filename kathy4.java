class kathy4 {
    private int x;
    private kathy4(){
        System.out.println("Constructor Called");
        x = 5;
    }

    public static void main(String[] args){
        kathy4 obj = new kathy4();
        System.out.println("Value of x = " + obj.x);
    }
}
