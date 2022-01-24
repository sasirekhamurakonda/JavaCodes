package BasicsOfJava;
interface x{
    void fx();
}
interface f{
    void fx();
}

public class SameMethodsOfInterface implements x,f {
    @Override
    public void fx(){
        System.out.println("I am alive");
    }

}
