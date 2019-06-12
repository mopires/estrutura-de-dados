

public class Main {


    public static void main(String[] args){

        Nodo Root = new Nodo(10);

        Root = Root.Add(Root, 2);
        Root = Root.Add(Root, 5);
        Root = Root.Add(Root, 15);
        //Root = Root.Add(Root, 20);

        //Root = Root.Search(Root, 15);

        /*if(Root != null){

            System.out.println(Root.GetValue());
        }
        else
        {
            System.out.println("Arvore vazia");
        }*/

        Root.Print(Root,0);

    }


}
