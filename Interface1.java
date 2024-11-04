public class Interface1 {
    public static void main(String[] args) {
        Queen Q1 = new Queen();
        Q1.moves();
    }
}

interface ChessPlayer 
{
    void moves ();
}


class Queen implements ChessPlayer
{
    public void moves()
    {
        System.out.println("Queen moves in all 4 direction and with any steps at a time");
    }
}
class Rook implements ChessPlayer
{
    public void moves()
    {
        System.out.println("Rook moves Left, Right, Up, Down direction and with any steps at a time");
    }
}
class King implements ChessPlayer
{
    public void moves()
    {
        System.out.println("King moves in all 4 direction and with single steps at a time");
    }
}
