public class Main
{
    public static void main(String[] args)
    {
        SearchTree list = new SearchTree(null);

        String stringData = "9 8 7 6 5 4 3 2 3 4 5 10";
        String [] data = stringData.split(" ");
        for (String s : data)
        {
            // create new item with with value set to the string s
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());
        list.removeItem(new Node("7"));
        list.traverse(list.getRoot());
    }
}
