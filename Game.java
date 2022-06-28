package xo;

public class Game {
    char [][] game = new char[3][3];
    
    boolean isFull(){
        int cnt=0;
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                if(game[i][j]!='.')
                    cnt++;
            }
        }
        if(cnt==9)
            return true;
        else
            return false;
    }
    
    void print(){
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                System.out.print(game[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    void set (){
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                game[i][j]='.';
            }
        }
    }
    
    void setElement(int x,int y,char c){
        game[x][y]=c;
    }
    boolean getRow(){
        for(int i=0 ; i<3 ; i++){
            boolean check =false;
            for(int j=1 ; j<3 ; j++){
                if(game[i][j]==game[i][j-1] && game[i][j]!='.'){
                    check=true;
                }
                else{
                    check=false;
                    break;
                }
            }
            if(check){
                return true;
            }
        }
        return false;
    }
    
    boolean getColume(){
        for(int j=0 ; j<3 ; j++){
            boolean check=false;
            for(int i=1 ; i<3 ; i++){
                if(game[i][j]==game[i-1][j] && game[i][j]!='.'){
                    check=true;
                }
                else{
                    check=false;
                    break;
                }
            }
            if(check){
                return true;
            }
        }
        return false;
    }
    
    boolean getDiagonalLeft(){
        int x=0; int o=0;
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                if(i==j){
                    if(game[i][j]=='x')
                        x++;
                    else if(game[i][j]=='o')
                        o++;
                }
            }
        }
        if(x==3){
            return true;
        }
        else if(o==3){
            return true;
        }
        else{
            return false;
        }
    }
    
    boolean getDiagonalRight(){
        int x=0; int o=0;
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                if(i+j==2){
                    if(game[i][j]=='x')
                        x++;
                    else if(game[i][j]=='o')
                        o++;
                }
            }
        }
        if(x==3){
            return true;
        }
        else if(o==3){
            return true;
        }
        else{
            return false;
        }
    }  
}
