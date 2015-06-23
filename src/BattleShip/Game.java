package BattleShip;
import java.util.Scanner;
import java.util.Random;
public class Game {
//********************************ATRIBUTOS*************************************

    public int dificultad=4;
    Boats player1[][] = new Boats[8][8];
    Boats player2[][] = new Boats[8][8];
    String map[][] = new String[8][8];
    
    Scanner lea = new Scanner(System.in);
//********************************FUNCIONES*************************************
    
    public void setDificultad(int dificultad){
        this.dificultad = dificultad;
    }
    //               FUNCION PARA INGRESAR POSICIONES DEL BARCO
    public void startPosPlayer1(){
        int cont=0, cont1=0, cont2=0, cont3=0, x, y;
        String tipodebote;
        System.out.println("Turno Player 1");
        for (int i = 0; i < dificultad; i++) {
            System.out.println("Ingrese el codigo del barco: ");
            tipodebote = lea.next().toUpperCase();
             switch(tipodebote){
                case "PA":
                    if(cont==0){
                    System.out.println("Ingrese posicion.");
                    x = lea.nextInt();
                    y = lea.nextInt();
                    x=x-1;
                    y=y-1;
                    if(x>=0&&x<=7&&y>=0&&y<=7){
                    if(player1[x][y]==null){
                        player1[x][y] = new Boats("pa");
                        cont++;
                    }else{
                        System.out.println("La posicion que ingreso no esta disponible.");
                        i--;
                    }
                    }else{
                        System.out.println("La posicion esta fuera de rango");
                        i--;
                    }
                    }else{
                        System.out.println("Ya ingreso la cantidad maxima.");
                        i--;
                    }
                break;
                case "AZ":
                    if(cont1==0){
                    System.out.println("Ingrese posicion.");
                    x = lea.nextInt();
                    y = lea.nextInt();
                    x=x-1;
                    y=y-1;
                    if(x>=0&&x<=7&&y>=0&&y<=7){
                    if(player1[x][y]==null){
                        player1[x][y] = new Boats("az");
                        cont1++;
                    }else{
                        System.out.println("La posicion que ingreso no esta disponible.");
                        i--;
                    }
                    }else{
                        System.out.println("La posicion esta fuera de rango");
                        i--;
                    }
                    }else{
                        System.out.println("Ya ingreso la cantidad maxima.");
                        i--;
                    }
                break;
                case "SM":
                    if(cont2==0){
                    System.out.println("Ingrese posicion.");
                    x = lea.nextInt();
                    y = lea.nextInt();
                    x=x-1;
                    y=y-1;
                    if(x>=0&&x<=7&&y>=0&&y<=7){
                    if(player1[x][y]==null){
                        player1[x][y] = new Boats("sm");
                        cont2++;
                    }else{
                        System.out.println("La posicion que ingreso no esta disponible.");
                        i--;
                    }
                    }else{
                        System.out.println("La posicion esta fuera de rango");
                        i--;
                    }
                    }else{
                        System.out.println("Ya ingreso la cantidad maxima.");
                        i--;
                    }
                break;
                case "DT":
                    if(cont3==0||cont==1&&dificultad==5){
                    System.out.println("Ingrese posicion.");
                    x = lea.nextInt();
                    y = lea.nextInt();
                    x=x-1;
                    y=y-1;
                    if(x>=0&&x<=7&&y>=0&&y<=7){
                    if(player1[x][y]==null){
                        player1[x][y]  = new Boats("dt");
                        cont++;
                    }else{
                        System.out.println("La posicion que ingreso no esta disponible.");
                        i--;
                    }
                    }else{
                        System.out.println("La posicion esta fuera de rango");
                        i--;
                    }
                    }else if(cont3==0){
                    System.out.println("Ingrese posicion.");
                    x = lea.nextInt();
                    y = lea.nextInt();
                    x=x-1;
                    y=y-1;
                    if(player1[x][y]==null)
                    player1[x][y]  = new Boats("dt");
                    cont3++;
                    }else{
                        System.out.println("Ya ingreso la cantidad maxima.");
                        i--;
                    }
                break;
                default:
                    System.out.println("El codigo no existe.");
                    i--;
            }
        }
    }   
    public void startPosPlayer2(){
        int cont=0, cont1=0, cont2=0, cont3=0, x, y;
        String tipo;
        System.out.println("Turno Player 2");

        for (int i = 0; i < dificultad; i++) {
            System.out.println("Ingrese el codigo del barco: ");
            tipo = lea.next().toUpperCase();
             switch(tipo){
                case "PA":
                    if(cont==0){
                    System.out.println("Ingrese posicion.");
                    x = lea.nextInt();
                    y = lea.nextInt();
                    x=x-1;
                    y=y-1;
                    if(x>=0&&x<=7&&y>=0&&y<=7){
                    if(player2[x][y]==null){
                        player2[x][y]  = new Boats("pa");
                        cont++;
                    }else{
                        System.out.println("La posicion que ingreso no esta disponible.");
                        i--;
                    }
                    }else{
                        System.out.println("La posicion esta fuera de rango");
                        i--;
                    }
                    }else{
                        System.out.println("Ya ingreso la cantidad maxima.");
                        i--;
                    }
                break;
                case "AZ":
                    if(cont1==0){
                    System.out.println("Ingrese posicion.");
                    x = lea.nextInt();
                    y = lea.nextInt();
                    x=x-1;
                    y=y-1;
                    if(x>=0&&x<=7&&y>=0&&y<=7){
                    if(player2[x][y]==null){
                        player2[x][y]  = new Boats("az");
                        cont1++;
                    }else{
                        System.out.println("La posicion que ingreso no esta disponible.");
                        i--;
                    }
                    }else{
                        System.out.println("La posicion esta fuera de rango");
                        i--;
                    }
                    }else{
                        System.out.println("Ya ingreso la cantidad maxima.");
                        i--;
                    }
                break;
                case "SM":
                    if(cont2==0){
                    System.out.println("Ingrese posicion.");
                    x = lea.nextInt();
                    y = lea.nextInt();
                    x=x-1;
                    y=y-1;
                    if(x>=0&&x<=7&&y>=0&&y<=7){
                    if(player2[x][y]==null){
                        player2[x][y]  = new Boats("sm");
                        cont2++;
                    }else{
                        System.out.println("La posicion que ingreso no esta disponible.");
                        i--;
                    }
                    }else{
                        System.out.println("La posicion esta fuera de rango");
                        i--;
                    }
                    }else{
                        System.out.println("Ya ingreso la cantidad maxima.");
                        i--;
                    }
                break;
                case "DT":
                    if(cont3==0||cont==1&&dificultad==5){
                    System.out.println("Ingrese posicion.");
                    x = lea.nextInt();
                    y = lea.nextInt();
                    x=x-1;
                    y=y-1;
                    if(x>=0&&x<=7&&y>=0&&y<=7){
                    if(player2[x][y]==null){
                        player2[x][y]  = new Boats("dt");
                        cont3++;
                    }else{
                        System.out.println("La posicion que ingreso no esta disponible.");
                        i--;
                    }
                    }else{
                        System.out.println("La posicion esta fuera de rango");
                        i--;
                    }
                    }else if(cont3==0){
                    System.out.println("Ingrese posicion.");
                    x = lea.nextInt();
                    y = lea.nextInt();
                    x=x-1;
                    y=y-1;
                    if(player2[x][y]==null)
                    player2[x][y]  = new Boats("dt");
                    cont3++;
                    }else{
                        System.out.println("Ya ingreso la cantidad maxima.");
                        i--;
                    }
                break;
                default:
                    System.out.println("El codigo no existe.");
                    i--;
            }
        }
    
    }
        public void printMapPlayer1(){
        Scanner lea = new Scanner(System.in);
        System.out.println("Empieza el juego.\n Turno Player 1");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                map[i][j] = "~";
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(" "+map[i][j]);
            }
            System.out.println("");
        }

    }
    public void printMapPlayer2(){
        Scanner lea = new Scanner(System.in);
        System.out.println("Empieza el juego.\n Turno Player 2");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                map[i][j] = "~";
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(" "+map[i][j]);
            }
            System.out.println("");
        }

    }
    public boolean attackPlayer1(){
        boolean o =false;
        int x, y;
        do{
        o=false;
        System.out.println("Fila: ");
        x = lea.nextInt();
        x=x-1;
        System.out.println("Columna: ");
        y = lea.nextInt();
        y=y-1;
        if(x+1==-1&&y+1==-1){
            System.out.println("Seguro que desea retirar?");
            String u = lea.next().toUpperCase();
            if(u.equals("SI")){
                 System.exit(0);
            }else{
                o=true;
            }
        }
        }while(o==true);
        if(x>=0&&x<=8&&y>=0&&y<=8){
            if(player1[x][y]!=null){
                player2[x][y].getHit();
                map[x][y] = "X ";
                return true;
            }
            else{
                map[x][y] = "F";
            }
        }else{
            System.out.println("La posicion no es valida.");
        }
        return false;
    }
        
        public boolean attackPlayer2(){
        boolean o =false;
        int x, y;
        do{
        o=false;
        System.out.println("Fila: ");
        x = lea.nextInt();
        x=x-1;
        System.out.println("Columna: ");
        y = lea.nextInt();
        y=y-1;
        if(x+1==-1&&y+1==-1){
            System.out.println("Seguro que desea retirar?");
            String u = lea.next().toUpperCase();
            if(u.equals("SI")){
                 System.exit(0);
            }else{
                o=true;
            }
        }
        }while(o==true);
        if(x>=0&&x<=8&&y>=0&&y<=8){
            if(player2[x][y]!=null){
                player1[x][y].getHit();
                map[x][y] = "X";
                printDamage();
                return true;
            }
            else{
                map[x][y] = "F";
                printDamage();
            }
        }else{
            System.out.println("La posicion no es valida.");
        }
        return false;
    }
    
    public void printDamage(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(" "+map[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static void moverMapaDePlayer1(){
        Random ran = new Random();
        int x = ran.nextInt(8), y = ran.nextInt(8);
        
    }
//    public void printMapPlayer(){
//        Scanner lea = new Scanner(System.in);
//        String map[][] = new String[8][8];
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                map[i][j] = "~";
//            }
//        }
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.println(map[i][j]);
//            }
//        }
//        System.out.println("Fila: ");
//        int x = lea.nextInt();
//        System.out.println("Columna: ");
//        int y = lea.nextInt();
//        if(x>=0&&x<=8&&y>=0&&y<=8){
//            player1[x][y] = 
//        }else{
//            System.out.println("");
//        }
//    }
}
