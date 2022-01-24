package Competitions;


import java.io.*;
import java.util.*;

public class PizzaDemo {
    static class Pizza{
        int index= -1;
        int numOfIng = 0;
        HashSet<String> ingredients = new HashSet<>();
        Pizza(int in){
            this.numOfIng = in;
        }
        void addIngredients(String i){
            ingredients.add(i);
        }
        boolean contains(String i){
            return ingredients.contains(i);
        }
    }
    static class Order{
        int numOfMem = 0;
        List<Pizza> pizzas = new ArrayList<>();
        void add(Pizza p){
            pizzas.add(p);
        }
        @Override
        public String toString() {
            pizzas.sort(Comparator.comparingInt(o -> o.index));
            StringBuilder st = new StringBuilder();
            st.append(numOfMem).append(" ");
            for(Pizza p: pizzas){st.append(p.index).append(" ");}
            st.append("\n");
            return st.toString();
        }
    }
    static void writeToFile(List<Order> o) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("src\\Competitions\\d_out"));
//        FileWriter myWriter = new FileWriter("a_example_out");
        writer.write(o.size()+"\n");
        for(Order order:o){
            writer.append(String.valueOf(order));
        }
        writer.close();
    }
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\Competitions\\a_example"));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int twos = Integer.parseInt(st.nextToken());
        int threes = Integer.parseInt(st.nextToken());
        int fours = Integer.parseInt(st.nextToken());
        int numberOfIngredients = 0;
        List<Pizza> pizzaList = new ArrayList<>();
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            numberOfIngredients = Integer.parseInt(st.nextToken());
            pizzaList.add(new Pizza(numberOfIngredients));
            pizzaList.get(i).index = i;
            while(numberOfIngredients>0){
                pizzaList.get(i).addIngredients(st.nextToken());
                numberOfIngredients-=1;
            }
        }
        List<Order> orders = new ArrayList<>();
        int teamDelivered = 0;
        int totalNumOfTeams = twos+threes+fours;
        int i =0;
        boolean got = true;
        while(got && teamDelivered<totalNumOfTeams && i<n){
            System.out.println("IN LOOP");
            got = false;
            if(twos>0 && i<=n-2) {
                Order o = new Order();
                o.numOfMem = 2;
                o.add(pizzaList.get(i));
                i++;
                o.add(pizzaList.get(i));
                i++;
                twos--;
                orders.add(o);
                teamDelivered++;
                System.out.println(2);
                got = true;
            }
            else if(threes>0 && i<=n-3) {
                Order o = new Order();
                o.numOfMem = 3;
                o.add(pizzaList.get(i));
                i++;
                o.add(pizzaList.get(i));
                i++;
                o.add(pizzaList.get(i));
                i++;
                threes--;
                orders.add(o);
                teamDelivered++;
                System.out.println(3);
                got = true;
            }
            else if(fours>0 && i<=n-4) {
                Order o = new Order();
                o.numOfMem = 4;
                o.add(pizzaList.get(i));
                i++;
                o.add(pizzaList.get(i));
                i++;
                o.add(pizzaList.get(i));
                i++;
                o.add(pizzaList.get(i));
                i++;
                fours--;
                orders.add(o);
                teamDelivered++;
                System.out.println(4);
                got = true;
            }
        }

//        for(int i=0;i<n;i++){
//            Order o = new Order();
//            o.numOfMem = pizzaList.get(i).numOfIng;
//            o.add(pizzaList.get(i));
//            o.add(pizzaList.get(i));
//            orders.add(o);
//        }
        System.out.println();
        System.out.println(orders.size());
        for(Order o:orders){
            System.out.println(o);
        }
        writeToFile(orders);
    }
}

/*
a b
a d
a h
a f
 */

/*
2
2 1 4
3 0 2 3
 */