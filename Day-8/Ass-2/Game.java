class Game{
    Piece [][] board;
    Game(){
        board = new Piece [8][8];
    }

    public static void main(String args[]){
        // Piece queen = new Piece();
        Position testPosition = new Position(3,5);
        Queen queen = new Queen(testPosition);
        Position tPosition = new Position(5,7);
        if(queen.isValidMove(tPosition)){
            System.out.println("yes, i can move there");
        }else{
            System.out.println("nope, can't do!");
        }
    }
}