package day11_stringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";
        /*Verilen bir String'de herhangibir String veya char'in ilk kullanildigi index'i bize dondurur


    */
        System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf("r"));//7
        System.out.println(str.indexOf("j"));//-1

        System.out.println(str.indexOf("mek"));//10

        //eger istedigimiz indexten sonrasini kontrol etmek istersek
        //o zaman ayni methodu iki parametreli olarak kullanabiliriz

        System.out.println(str.indexOf("g",(6+1)));//yazilan indexten baslar
        //yukaridaki str da 2.ve 3. e nin indexlerini bulun
        //2. e yi bulabilmek icin 1. e nin indexine ihtiyacim var

        int ilke=str.indexOf("e");
        int ikincie=str.indexOf("e",ilke+1);
         //eger 2. e varsa 3. e olup olmadigini
         //ve varsa index ini yazdiralim

    if (ikincie==-1) {
        System.out.println("verilen str'da 2.e yok");
    }else{
        int ucuncue=str.indexOf("e",ikincie+1);
        if (ucuncue==-1) {
            System.out.println("verilen str'da 3.e yok");
        }else{
            System.out.println("verilen str daki 3.e nin index i:"+ucuncue);
        }
    }
    }
}
