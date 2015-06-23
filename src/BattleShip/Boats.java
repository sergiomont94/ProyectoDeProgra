/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BattleShip;

/**
 *
 * @author Jorge
 */
public class Boats {
    private int boatHp;

    public String tipodebote;

    public boolean isBoat = false;
    public boolean isDead = false;
    public boolean gotHit = false;
    public boolean gotMoved = false;

    //constructors
    public Boats(String tipodebote)
    {
        switch (tipodebote)
        {
            case "pa":
                this.tipodebote = "Portaaviones";
                boatHp = 5;
                isBoat = true;
                break;
            case "az":
                this.tipodebote = "Acorazado";
                boatHp = 4;
                isBoat = true;
                break;
            case "sm":
                this.tipodebote = "Submarino";
                boatHp = 3;
                isBoat = true;
                break;
            case "dt":
                this.tipodebote = "Destructor";
                boatHp = 2;
                isBoat = true;
                break;
            case "~":
                this.tipodebote = "Mar";
                isDead = true;
                break;

        }

    }
    
    public Boats(Boats another)
    {
        this.tipodebote = another.tipodebote;
        this.boatHp = another.boatHp;
        this.isBoat = another.isBoat;
        this.gotHit = another.gotHit;
    }

//    Boats(String pa) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    //methods
    public void getHit()
    {
//        if (!tipodebote.equals("Miss") && !tipodebote.equals("Mar"))
//        {

            if (boatHp > 0)
            {   
                boatHp -= 1;
                if (boatHp < 1)
                    isDead = true;
                else
                    gotHit = true;
            }

            else if (boatHp < 1)
            {
                gotHit = false;
                isDead = true;
                System.out.println("Barco muerto");
            }
    } 
//        else if (tipodebote.equals("Mar"))
//        {
//           //wasHit = true;
//           tipodebote= "Miss";
//           isDead = true;
//        }

    
}
