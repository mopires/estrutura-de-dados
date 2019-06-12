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
            }
            else {
                Tree.Left.Left = new Nodo(NewValue);
            }

        return Tree;
    }

    public Nodo Search(Nodo Tree, int Value){

        if (Tree == null){
            return null;
        }
        if(Tree.Value == Value){
            return Tree;
        } else
        if(Tree.Value == Value) {
                return Tree;
            }else
                if(Tree.Value < Value){
                    return Search(Tree.Left, Value);
                }else {
                    return Search(Tree.Right, Value);
                }

    }

}
