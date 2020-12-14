package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args){

        Boolean userContinue;
        do {
            Input input = new Input();

            String category = input.getString("Which movie category would you like to view?");
            System.out.println();

            if (category.equalsIgnoreCase("all")) {
                printAll();
            } else if (category.equalsIgnoreCase("drama")) {
                printDrama();
            } else if (category.equalsIgnoreCase("animated")) {
                printAnimated();
            } else if (category.equalsIgnoreCase("comedy")) {
                printComedy();
            } else if (category.equalsIgnoreCase("horror")) {
                printHorror();
            } else if (category.equalsIgnoreCase("scifi")) {
                printScifi();
            } else if (category.equalsIgnoreCase("musical")) {
                printMusical();
            }

            userContinue = input.yesNo("Would you like to continue?");
            System.out.println();
        }   while(userContinue);

    }

    public static void printAll(){
        for(Movie movie : MoviesArray.findAll()){
            System.out.println(movie.getName());
        }
    }

    public static void printDrama(){
        for(Movie movie : MoviesArray.findAll()){
            if(movie.getCategory().equalsIgnoreCase("drama")){
                System.out.println(movie.getName());
            }
        }
    }

    public static void printAnimated(){
        for(Movie movie : MoviesArray.findAll()){
            if(movie.getCategory().equalsIgnoreCase("animated")){
                System.out.println(movie.getName());
            }
        }
    }

    public static void printHorror(){
        for(Movie movie : MoviesArray.findAll()){
            if(movie.getCategory().equalsIgnoreCase("horror")){
                System.out.println(movie.getName());
            }
        }
    }

    public static void printScifi(){
        for(Movie movie : MoviesArray.findAll()){
            if(movie.getCategory().equalsIgnoreCase("scifi")){
                System.out.println(movie.getName());
            }
        }
    }

    public static void printComedy(){
        for(Movie movie : MoviesArray.findAll()){
            if(movie.getCategory().equalsIgnoreCase("comedy")){
                System.out.println(movie.getName());
            }
        }
    }

    public static void printMusical(){
        for(Movie movie : MoviesArray.findAll()){
            if(movie.getCategory().equalsIgnoreCase("musical")){
                System.out.println(movie.getName());
            }
        }
    }


}
