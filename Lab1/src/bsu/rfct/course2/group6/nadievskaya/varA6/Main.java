package bsu.rfct.course2.group6.nadievskaya.varA6;

import java.util.Scanner;

public class Main {
    // Конструктор класса отсутствует!!!
    // Главный метод главного класса
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        // Определение ссылок на продукты завтрака
        Food[] breakfast = new Food[20];
        // Анализ аргументов командной строки и создание для них
        // экземпляров соответствующих классов для завтрака
        int itemsSoFar = 0;
        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
// У сыра дополнительных параметров нет
                breakfast[itemsSoFar] = new Cheese();
            } else
            if (parts[0].equals("Apple")) {
// У яблока – 1 параметр, который находится в parts[1]
                breakfast[itemsSoFar] = new Apple(parts[1]);
            }else
            if (parts[0].equals("Coffee")) {
                breakfast[itemsSoFar] = new Coffee(parts[1]);
            }
// ... Продолжается анализ других продуктов для завтрака
            itemsSoFar++;
        }
        for (String arg: args) {
        for(int i=0;i< args.length;i++)
        {
            int number=0;
            String[] parts = arg.split("/");
            Scanner scanner=new Scanner(System.in);
            String name=scanner.nextLine();
            if(parts[i].equals(name)){number++;}
            System.out.println("numbers of "+name+"="+number);
        }}
// Перебор всех элементов массива
        for (Food item: breakfast)
            if (item!=null)
// Если элемент не null – употребить продукт
                item.consume();
            else
// Если дошли до элемента null – значит достигли конца
// списка продуктов, ведь 20 элементов в массиве было
// выделено с запасом, и они могут быть не
// использованы все
                break;
        System.out.println("Всего хорошего!");
    }}
