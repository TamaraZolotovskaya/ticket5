public class Main {
    public static void main(String[] args) {
/* Дан массив пар названий книг и авторов,
       необходимо привести каждую пару в строку вида: «Название книги» И.О.Автора.
       */
        String[][] book = new String[4][2];
        book[0][0] = "Война и мир";
        book[0][1] = "Лев Николаевич Толстой";
        book[1][0] = "Евгений Онегин";
        book[1][1] = "Александр Сергеевич Пушкин";
        book[2][0] = "Мцыри";
        book[2][1] = "Михаил Юрьевич Лермонтов";

        for (int i = 0; i < book.length; i++) {
            if (book[i][0] != null) {
                String[] name = book[i][1].split(" ");
                System.out.println("«" + book[i][0] + "» " + name[0] + " " + name[1]);
            }
        }

    }
}