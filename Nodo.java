import javafx.scene.chart.ValueAxis;

public class Nodo {

    private int Value;

    public Nodo Left, Right;

    public Nodo(int Value){
        this.Value = Value;
    }

    public int GetValue() {
        return Value;
    }

    public Nodo Add(Nodo Tree, int NewValue){

        if(Tree.Left == null){
            Tree.Left = new Nodo(NewValue);
        }else
            if(Tree.Right == null) {
                Tree.Right = new Nodo(NewValue);
            } else {
                Tree.Left = Tree.Left.Add(Tree.Left,NewValue);
            }

        return Tree;
    }

    public Nodo Search(Nodo Tree, int Value){

        if (Tree == null){
            return null;
        }

        if(Tree.GetValue() == Value) {
            return Tree;
        }else
            if(Tree.GetValue() < Value){
                return Search(Tree.Right, Value);
            }else {
                return Search(Tree.Left, Value);
            }
    }

   public void Print(Nodo Tree, int Level){

        if (Tree != null){
           System.out.println(Tree.GetValue());

           for (int i = 0; i <= Level; i++){
               System.out.print("| ");
           }

           Print(Tree.Left, Level);
           Level--;
           Print(Tree.Right, Level);

        }

   }

}
