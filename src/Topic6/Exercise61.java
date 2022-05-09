package Topic6;


import java.util.Scanner;

public class Exercise61 {

        //1.     Cree una nueva clase Tester.
        public static class Tester{

            //3.La nueva clase debe tener los siguientes atributos: Name, mindset , isTesterByChance?, long toenails.
            String name;
            String mindset;
            String isTesterByChance;
            String longToenails;
            Double calculateLongToenail;
            //4.Crear los getter y setters para cada atributo.
            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getMindset() {
                return mindset;
            }

            public void setMindset(String mindset) {
                this.mindset = mindset;
            }

            public String getIsTesterByChance() {
                return isTesterByChance;
            }

            public void setIsTesterByChance(String isTesterByChance) {
                this.isTesterByChance = isTesterByChance;
            }

            public String  getLongToenails() {
                return longToenails;
            }

            public void setLongToenails(String longToenails) {
                this.longToenails = longToenails;
            }
            /*6.A partir de la clase Tester, crea un método que tenga un parámetro: el objeto tester
        y devuelva el largo de las uñas de los pies.  Averigua cómo calcularlo . Luego llama al método desde
        la clase principal e imprímelo.*/


            public Double getCalculateLongToenail() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("How long are your nails?");
                double longTail = scanner.nextDouble();
                System.out.println("How wide are your nails?");
                double nailwidth = scanner.nextDouble();
                double calculatelongToenails = (longTail * nailwidth) / 2;
                return calculateLongToenail;
            }

            public void setCalculateLongToenail(Double calculateLongToenail) {
                this.calculateLongToenail = calculateLongToenail;
            }
            //2.Cree un constructor sin argumentos, y un constructor que inicialice todos los atributos de la clase.
            public Tester(String name, String mindset, String isTesterByChance, String longToenails, double calculateLongToenail){
                this.name = name;
                this.mindset = mindset;
                this.isTesterByChance = isTesterByChance;
                this.longToenails = longToenails;
                this.calculateLongToenail = calculateLongToenail;
                }

            }
    public static void main(String[] args){
        //5.Desde la clase principal crea dos objetos con diferentes atributos y realiza las siguientes acciones:
        Tester tester1 =
                new Tester("Juan", "So good", "Yes", "Yes", (30*1.25)/2);
        Tester tester2 =
                new Tester("Julian", "Sometimes bad", "No", "No", (15*1.45)/2);

        //a. Cambiar el atributo isTeserByChance del Probador 1 e imprimirlo
        tester1.isTesterByChance = "No";
        System.out.println(tester1.isTesterByChance);
        //b.    Modificar el atributo mindset del Probador2 e imprimirlo.
        tester2.mindset = "Now its so good";
        System.out.println(tester2.mindset);
        tester1.calculateLongToenail = tester1.calculateLongToenail;
        System.out.println(tester1.calculateLongToenail);



        }







        /*a.    Nota: se puede llamar a los métodos de una clase desde dos formas diferentes:
        i.     Instanciando una nueva clase: New Tester().calculateLongToenail()
        ii.     Utilizando el objeto: Tester1.calculateLongToenail()*/
        /*Prueba ambas opciones.
            Ahora inventa un nuevo método y llámalo desde la clase principal.
         */





    }


