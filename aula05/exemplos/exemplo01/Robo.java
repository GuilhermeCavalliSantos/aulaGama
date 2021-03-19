package exemplo01;


public class Robo {

    private int x, y;
    private int maxX, maxY;

    public Robo (int x,int y, int maxX, int maxY){
        this.x = x;

       // if (novoY >= -maxY && novoY <= maxY){ pode ser substituido pela função igual setY
        //this.y = y;
        //}

        setY(y);

        this.maxX = maxX;
        this.maxY = maxY;
    }

    public void norte(){
        if(y<maxY){
            y++;
        }
        
    }
    
    public int getY() {
        return y;
    }

    public void setY(int novoY) {
        if( novoY >= -maxY && novoY <= maxY){
            y = novoY;
        }
    }


}