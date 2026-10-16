package Day8;

class singleton {
    private static singleton obj;

//    rule1 : make constructor private
    private singleton(){

    }
    public static singleton getInstance(){
        if(obj == null){
            obj = new singleton();
        }
        return obj;
    }
}
