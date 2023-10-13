package projeto.lucas;

public class VerifyWin
{
    public void VerifyWinner(int numP, int numB)
    {
        if(
            numP==1 && numB==3 ||
            numP==2 && numB==1 ||
            numP==3 && numB==2
            ) {System.out.println("Player venceu");}
        if(
            numB==1 && numP==3 ||
            numB==2 && numP==1 ||
            numB==3 && numP==2
            ) {System.out.println("Player Perdeu");}
        if(numP==numB) {System.out.println("Empate");}
    }
}