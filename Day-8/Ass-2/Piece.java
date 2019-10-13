 class Piece{
    Position position;
    Piece(Position position){
        this.position = position;
    }
    boolean isValidMove(Position newPosition){
        if(newPosition.row> 0 && newPosition.row < 8 && newPosition.column>0 && newPosition.column<8){
            System.out.println("piece");
            return true;
        }else{
            return false;
        }
    }
}
class Queen extends Piece{
    Queen(Position position){
        super(position);
    }
    final boolean isValidMove(Position newPosition){
        System.out.println(position.row);
        System.out.println(newPosition.row);
        if(super.isValidMove(newPosition)){
            if(newPosition.row == position.row || newPosition.column == position.column || ((newPosition.column - newPosition.row) == (position.column - position.row))){
                // System.out.println("yes, i can move there");
                System.out.println("queen");
                return true;
            }else{
                // System.out.println("nope,can't do!");
                return false;
            }
        }else{
            return false;
        }
    }
}
