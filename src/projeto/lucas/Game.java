package projeto.lucas;

import java.util.Random;
import java.util.Scanner;

import projeto.lucas.Choices;
import projeto.lucas.Paper;
import projeto.lucas.Scissor;
import projeto.lucas.Rock;
import projeto.lucas.VerifyWin;

public class Game
{
	public static Scanner input=new Scanner(System.in);
	static Random botNum=new Random();
	static VerifyWin verifyW=new VerifyWin();
	
    public static void main(String[] args) {
        Choices scissor= new Scissor();
        Choices paper= new Paper();
        Choices rock= new Rock();
        
        int playaNum=0;
        
        System.out.println("Pick your option: \n 1- Rock \n 2-Paper \n 3-Scissor");
       playaNum= input.nextInt();   
       
       int botNumb=0;
       botNumb=botNum.nextInt();
       if(botNumb>3)  {botNumb=3;}
       if(botNumb<1) {botNumb=1;}
       
       System.out.println(".......................................................\n.......................................................\n.......................................................\n.......................................................\n.......................................................\n");
       
       

       
       switch (playaNum)
       {
        	case(1):
        		rock.chooseP();
        	 	break;
        	case(2):
        		paper.chooseP();
        	 	break;
        	case(3):
        		scissor.chooseP();
        	 	break;
        	default:
        		System.out.println("Escolhido incorretamente.");
        		System.exit(0);
        		break;        	
       }
       
       switch (botNumb)
       {
        	case(1):
        		rock.chooseB();
        	 	break;
        	case(2):
        		paper.chooseB();
        	 	break;
        	case(3):
        		scissor.chooseB();
        	 	break;
        	default:
        		System.exit(0);
        		break;        	
       }

      verifyW.VerifyWinner(playaNum,botNumb);
       
       
       


        



    }
}