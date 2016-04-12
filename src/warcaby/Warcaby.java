import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;


public class Warcaby extends JFrame implements MouseListener
{
    public int[][]plansza={{0,2,0,2,0,2,0,2},
                           {2,0,2,0,2,0,2,0},
                           {0,2,0,2,0,2,0,2},
                           {1,0,1,0,1,0,1,0},
                           {0,1,0,1,0,1,0,1},
                           {3,0,3,0,3,0,3,0},
                           {0,3,0,3,0,3,0,3},
                           {3,0,3,0,3,0,3,0}};
    
    public int[][]planszaT={{0,0,0,0,0,0,0,0},
                           {0,0,0,0,0,0,0,0},
                           {0,0,0,0,0,0,0,0},
                           {0,0,0,0,0,0,0,0},
                           {0,0,0,0,0,0,0,0},
                           {0,0,0,0,0,0,0,0},
                           {0,0,0,0,0,0,0,0},
                           {0,0,0,0,0,0,0,0}};
    
    private int kolumna;
    private int wiersz;
    private boolean podswietLewo2=false;
    private boolean podswietlPrawo1=false;
    private boolean podswietLewo1=false;                       
    private boolean podswietPrawo2=false;
    private int bicieW;
    private int bicieK;
    private int zmianaGracza=2;
    
    
    public  Warcaby()
    {
        setSize(500, 500);
       
       
        addMouseListener(this);
       
    }
public static void main(String[] args) 
    {
       Warcaby warcaby= new Warcaby();
       warcaby.setVisible(true);
       warcaby.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    public void paint(Graphics g)
    {
        rysujPlansze(g);
    }
    
public void rysujLinie(Graphics2D g2)
    {
        for(int j=0; j<9; j++)
            {
                g2.setColor(Color.red);
                g2.fillRect(50, 50, 407, 407);
            }
        
    }
public void rysujPlansze(Graphics g)
    {
        Image img= createImage(getSize().width, getSize().height);
        Graphics2D g2= (Graphics2D)img.getGraphics();
        rysujLinie(g2);
        
        for(int i=0;i<8;i++)
        {
            for(int j=0; j<8;j++)
            {
                
                switch(plansza[i][j])
                {
                    
               switch(plansza[i][j])
                {