

public class Main {


    public static void main(String[] args){

        Nodo Root = new Nodo(10);

        Root = Root.Add(Root, 5);
        Root = Root.Add(Root, 15);

        Root = Root.Search(Root, 15);

        System.out.println(Root.GetValue()+"|"+Root.Left.GetValue());


    }


}
