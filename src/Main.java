import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         Создать класс "Населенный пункт"
        •Создать 3 Города
        •Города состоят из районов (массив? Населенный пункт?)
        •Создать 2 села
        •У каждого населенного пункта есть Руководитель
        •Сделать поиск по руководителям
         */
        Scanner scanner=new Scanner(System.in);


        Bishkek bishkek=new Bishkek();
        bishkek.setDirector("Тулеев");

        String[]rayonsBishkek=new String[]{"Аламединский","Октябрский","Первомайский","Ленинский","Аламединский"};
        bishkek.setRayon(rayonsBishkek);

        String[]villageBishkek=new String[]{"Байтик","Сосновка"};
        bishkek.setVillage(villageBishkek);

        Talas talas=new Talas();
        talas.setDirector("Жусупбеков");

        String[]rayonsTalas=new String[]{"Манасский","Бакай-Атинский", "Кара-Буринский","Таласский"};
        talas.setRayon(rayonsTalas);

        String[]villageTalas=new String[2];
        villageTalas[0]="Покровка";
        villageTalas[1]="Арал";
        talas.setVillage(villageTalas);

        Osh osh=new Osh();
        osh.setDirector("Жетигенов");

        String[]rayonsOsh=new String[]{"Алайский","Араванский","Кара-Кулджинский","Кара-Сууский","Ноокатский","Узгенский"};

        osh.setRayon(rayonsOsh);

        String[]villageOsh=new String[]{"Ноокат","Араван"};
        osh.setVillage(villageOsh);

        System.out.println("Введите руководителя");
        String directorName=scanner.nextLine();

        if(directorName.equals(bishkek.findByDirector())){
            System.out.println(bishkek);
        }else if (directorName.equals(osh.findByDirector())){
            System.out.println(osh);
        }else if (directorName.equals(talas.findByDirector())){
            System.out.println(talas);
        }else System.out.println("Неверно указан руководитель ! ");

    }
}
