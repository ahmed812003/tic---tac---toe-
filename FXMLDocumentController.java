
package xo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLDocumentController implements Initializable {
    public static int turn =0;
    public static Game play;
    public static int idx=0;
    public static boolean ok=true;
    public static int plx=0;
    public static int plo=0;
    
    
    @FXML
    private Label labelx;

    @FXML
    private Label labelo;
    
    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Label label;

    @FXML
    private Button load;
    
    @FXML
    private Button sss;
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        play=new Game();
        play.set();         
    }

    
    @FXML
    void set1(ActionEvent event) {
        idx=1;
        if(ok){
            if(turn%2==0){
                button1.setText("X");
            }
            else{
                button1.setText("O");
            }
            if(turn%2==0){
                play.setElement(0, 0 , 'x');
            }
            else
                play.setElement(0, 0, 'o');
            if(turn %2==0){
                boolean first=play.getColume();
                boolean second=play.getDiagonalLeft();
                boolean third=play.getDiagonalRight();
                boolean fourth=play.getRow();
                if(first || second || third || fourth){
                    label.setText("     Game over "+"\n"+"player x is winner");
                    plx++;
                    String s=String.valueOf(plx); 
                    labelx.setText(s);
                    ok=false;
                }
            }
            else{
                boolean first=play.getColume();
                boolean second=play.getDiagonalLeft();
                boolean third=play.getDiagonalRight();
                boolean fourth=play.getRow();
                if(first || second || third || fourth){
                    label.setText("     Game over "+"\n"+"player o is winner");
                    plo++;
                    String s=String.valueOf(plo); 
                    labelo.setText(s);
                    ok=false;
                }
            }
            if(play.isFull() && ok){
                label.setText("   Game over "+"\n"+"      it's a tie  ");
                ok=false;
            }
            turn++;
        }
        play.print();
        //System.out.println(idx);
    }

    @FXML
    void set2(ActionEvent event) {
        idx=2;
        if(ok){
            if(turn%2==0){
                button2.setText("X");
            }
            else{
                button2.setText("O");
            }
            if(turn%2==0)
                play.setElement(0, 1 , 'x');
            else
                play.setElement(0, 1, 'o');
            if(turn %2==0){
                boolean first=play.getColume();
                boolean second=play.getDiagonalLeft();
                boolean third=play.getDiagonalRight();
                boolean fourth=play.getRow();
                if(first || second || third || fourth){
                    label.setText("     Game over "+"\n"+"player x is winner");
                    ok=false;
                    plx++;
                    String s=String.valueOf(plx); 
                    labelx.setText(s);
                }
            }
            else{
                boolean first=play.getColume();
                boolean second=play.getDiagonalLeft();
                boolean third=play.getDiagonalRight();
                boolean fourth=play.getRow();
                if(first || second || third || fourth){
                    label.setText("     Game over "+"\n"+"player o is winner");
                    ok=false;
                    plo++;
                    String s=String.valueOf(plo); 
                    labelo.setText(s);
                }
            }
            if(play.isFull()&&ok){
                label.setText("   Game over "+"\n"+"      it's a tie  ");
                ok=false;
            }
            turn++;
        }
        play.print();
        //System.out.println(idx);
    }

    @FXML
    void set3(ActionEvent event) {
        idx=3;
        if(ok){
            if(turn%2==0){
                button3.setText("X");
            }
            else{
                button3.setText("O");
            }
            if(turn%2==0)
                play.setElement(0, 2 , 'x');
            else
                play.setElement(0, 2, 'o');
            if(turn %2==0){
                boolean first=play.getColume();
                boolean second=play.getDiagonalLeft();
                boolean third=play.getDiagonalRight();
                boolean fourth=play.getRow();
                if(first || second || third || fourth){
                    label.setText("     Game over "+"\n"+"player x is winner");
                    ok=false;
                    plx++;
                    String s=String.valueOf(plx); 
                    labelx.setText(s);
                }
            }
            else{
                boolean first=play.getColume();
                boolean second=play.getDiagonalLeft();
                boolean third=play.getDiagonalRight();
                boolean fourth=play.getRow();
                if(first || second || third || fourth){
                    label.setText("     Game over "+"\n"+"player o is winner");
                    ok=false;
                    plo++;
                    String s=String.valueOf(plo); 
                    labelo.setText(s);
                }
            }
            if(play.isFull() && ok){
                label.setText("   Game over "+"\n"+"      it's a tie  ");
                ok=false;
            }
            turn++;
        }
        play.print();
        //System.out.println(idx);
    }

    @FXML
    void set4(ActionEvent event) {
        idx=4;
        if(ok){
            if(turn%2==0){
                button4.setText("X");
            }
            else{
                button4.setText("O");
            }
            if(turn%2==0)
                play.setElement(1, 0 , 'x');
            else
                play.setElement(1, 0, 'o');
            if(turn %2==0){
                boolean first=play.getColume();
                boolean second=play.getDiagonalLeft();
                boolean third=play.getDiagonalRight();
                boolean fourth=play.getRow();
                if(first || second || third || fourth){
                    label.setText("     Game over "+"\n"+"player x is winner");
                    ok=false;
                    plx++;
                    String s=String.valueOf(plx); 
                    labelx.setText(s);
                }
            }
            else{
                boolean first=play.getColume();
                boolean second=play.getDiagonalLeft();
                boolean third=play.getDiagonalRight();
                boolean fourth=play.getRow();
                if(first || second || third || fourth){
                    label.setText("     Game over "+"\n"+"player o is winner");
                    ok=false;
                    plo++;
                    String s=String.valueOf(plo); 
                    labelo.setText(s);
                }
            }
            if(play.isFull() && ok){
                label.setText("   Game over "+"\n"+"      it's a tie  ");
                ok=false;
            }
            turn++;
        }
        
        play.print();
        //System.out.println(idx);
    }

    @FXML
    void set5(ActionEvent event) {
        idx=5;
        if(ok){
            if(turn%2==0){
                button5.setText("X");
            }
            else{
                button5.setText("O");
            }
            if(turn%2==0)
                play.setElement(1, 1 , 'x');
            else
                play.setElement(1, 1, 'o');
            if(turn %2==0){
                boolean first=play.getColume();
                boolean second=play.getDiagonalLeft();
                boolean third=play.getDiagonalRight();
                boolean fourth=play.getRow();
                if(first || second || third || fourth){
                    label.setText("     Game over "+"\n"+"player x is winner");
                    ok=false;
                    plx++;
                    String s=String.valueOf(plx); 
                    labelx.setText(s);
                }
            }
            else{
                boolean first=play.getColume();
                boolean second=play.getDiagonalLeft();
                boolean third=play.getDiagonalRight();
                boolean fourth=play.getRow();
                if(first || second || third || fourth){
                    label.setText("     Game over "+"\n"+"player o is winner");
                    ok=false;
                    plo++;
                    String s=String.valueOf(plo); 
                    labelo.setText(s);
                }
            }
            if(play.isFull() && ok){
                label.setText("   Game over "+"\n"+"      it's a tie  ");
                ok=false;
            }
            turn++;
        }
        play.print();
        //System.out.println(idx);
    }

    @FXML
    void set6(ActionEvent event) {
        idx=6;
        if(ok){
            if(turn%2==0){
                button6.setText("X");
            }
            else{
                button6.setText("O");
            }
            if(turn%2==0)
                play.setElement(1, 2 , 'x');
            else
                play.setElement(1, 2, 'o');
            if(turn %2==0){
                boolean first=play.getColume();
                boolean second=play.getDiagonalLeft();
                boolean third=play.getDiagonalRight();
                boolean fourth=play.getRow();
                if(first || second || third || fourth){
                    label.setText("     Game over "+"\n"+"player x is winner");
                    ok=false;
                    plx++;
                    String s=String.valueOf(plx); 
                    labelx.setText(s);
                }
            }
            else{
                boolean first=play.getColume();
                boolean second=play.getDiagonalLeft();
                boolean third=play.getDiagonalRight();
                boolean fourth=play.getRow();
                if(first || second || third || fourth){
                    label.setText("     Game over "+"\n"+"player o is winner");
                    ok=false;
                    plo++;
                    String s=String.valueOf(plo); 
                    labelo.setText(s);
                }
            }
            if(play.isFull() && ok){
                label.setText("   Game over "+"\n"+"      it's a tie  ");
                ok=false;
            }
            turn++;
        }
        play.print();
        //System.out.println(idx);
    }

    @FXML
    void set7(ActionEvent event) {
        idx=7;
        if(ok){
            if(turn%2==0){
                button7.setText("X");
            }
            else{
                button7.setText("O");
            }
            if(turn%2==0)
                play.setElement(2, 0 , 'x');
            else
                play.setElement(2, 0, 'o');
            if(turn %2==0){
                boolean first=play.getColume();
                boolean second=play.getDiagonalLeft();
                boolean third=play.getDiagonalRight();
                boolean fourth=play.getRow();
                if(first || second || third || fourth){
                    label.setText("     Game over "+"\n"+"player x is winner");
                    ok=false;
                    plx++;
                    String s=String.valueOf(plx); 
                    labelx.setText(s);
                }
            }
            else{
                boolean first=play.getColume();
                boolean second=play.getDiagonalLeft();
                boolean third=play.getDiagonalRight();
                boolean fourth=play.getRow();
                if(first || second || third || fourth){
                    label.setText("     Game over "+"\n"+"player o is winner");
                    ok=false;
                    plo++;
                    String s=String.valueOf(plo); 
                    labelo.setText(s);
                }
            }
            if(play.isFull() && ok){
                label.setText("   Game over "+"\n"+"      it's a tie  ");
                ok=false;
            }
            turn++;
        }
        play.print();
        //System.out.println(idx);
    }

    @FXML
    void set8(ActionEvent event) {
        idx=8;
        if(ok){
            if(turn%2==0){
                button8.setText("X");
            }
            else{
                button8.setText("O");
            }
            if(turn%2==0)
                play.setElement(2, 1 , 'x');
            else
                play.setElement(2, 1, 'o');
            if(turn %2==0){
                boolean first=play.getColume();
                boolean second=play.getDiagonalLeft();
                boolean third=play.getDiagonalRight();
                boolean fourth=play.getRow();
                if(first || second || third || fourth){
                    label.setText("     Game over "+"\n"+"player x is winner");
                    ok=false;
                    plx++;
                    String s=String.valueOf(plx); 
                    labelx.setText(s);
                }
            }
            else{
                boolean first=play.getColume();
                boolean second=play.getDiagonalLeft();
                boolean third=play.getDiagonalRight();
                boolean fourth=play.getRow();
                if(first || second || third || fourth){
                    label.setText("     Game over "+"\n"+"player o is winner");
                    ok=false;
                    plo++;
                    String s=String.valueOf(plo); 
                    labelo.setText(s);
                }
            }
            if(play.isFull() && ok){
                label.setText("   Game over "+"\n"+"      it's a tie  ");
                ok=false;
            }
            turn++;
        }
        play.print();
        //System.out.println(idx);
    }

    @FXML
    void set9(ActionEvent event) {
        idx=9;
        if(ok){
            if(turn%2==0){
                button9.setText("X");
            }
            else{
                button9.setText("O");
            }
            if(turn%2==0)
                play.setElement(2, 2 , 'x');
            else
                play.setElement(2, 2, 'o');
            if(turn %2==0){
                boolean first=play.getColume();
                boolean second=play.getDiagonalLeft();
                boolean third=play.getDiagonalRight();
                boolean fourth=play.getRow();
                if(first || second || third || fourth){
                    label.setText("     Game over "+"\n"+"player x is winner");
                    ok=false;
                    plx++;
                    String s=String.valueOf(plx); 
                    labelx.setText(s);
                }
            }
            else{
                boolean first=play.getColume();
                boolean second=play.getDiagonalLeft();
                boolean third=play.getDiagonalRight();
                boolean fourth=play.getRow();
                if(first || second || third || fourth){
                    label.setText("     Game over "+"\n"+"player o is winner");
                    ok=false;
                    plo++;
                    String s=String.valueOf(plo); 
                    labelo.setText(s);
                }
            }
            if(play.isFull() && ok){
                label.setText("   Game over "+"\n"+"      it's a tie  ");
                ok=false;
            }
            turn++;
        }
        
        play.print();
        //System.out.println(idx);
    }
    
    @FXML
    void res(ActionEvent event) {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        play.set();
        ok=true;
        turn=0;
        label.setText("   tic - tac - toc");
    }
    
    @FXML
    void newScore(ActionEvent event){
        labelx.setText("0");
        labelo.setText("0");
        plx=0;
        plo=0;
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        play.set();
        ok=true;
        turn=0;
        label.setText("   tic - tac - toc");
    } 
}
