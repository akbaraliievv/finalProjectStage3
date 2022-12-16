import enums.Gender;
import enums.Genre;
import enums.Language;
import model.Book;
import model.User;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Бардык Id лер уникальный болуш керек. Эгер уникальный болбосо озубуз тузгон UniqueConstraintException класс ыргытсын.
        // User дин email адресси уникальный болуш керек жана @ болуусу керек. Эгер уникальный болбосо UniqueConstraintException класс,
        // @ болбосо озубуз тузгон BadRequestException класс ыргытсын.
        // User дин телефон номери +996 дан башталып 13 символдон турсун. Болбосо BadRequestException класс ыргытсын.
        // Китептин баасы терс сан болбошу керек. Болбосо NegativeNumberException ыргытсын.
        // Китептин чыккан жылы келечек убакыт болбошу керек.Болбосо DateTimeException ыргытсын.
        // Китептин автору бош болбошу керек. Болбосо EmptyStackException ыргытсын.

        


        Book book = new Book(10L,"Атадан калган туяк", Genre.DETECTIVE,new BigDecimal(1500),"Чынгыз Айтматов", Language.KYRGYZ, LocalDate.of(2010,5,5));
        Book book2 = new Book(11L,"Мстители", Genre.FANTASY,new BigDecimal(2000),"Genry", Language.ENGLISH, LocalDate.of(2012,7,15));
        Book book3 = new Book(12L,"Война и Мир", Genre.ROMANCE,new BigDecimal(1000),"Лев Толстой", Language.RUSSIAN, LocalDate.of(1997,3,19));
        Book book4 = new Book(13L,"", Genre.DETECTIVE,new BigDecimal(1500),"Чынгыз Айтматов", Language.KYRGYZ, LocalDate.of(2010,05,05));
        Book book5 = new Book(14L,"Атадан калган туяк", Genre.DETECTIVE,new BigDecimal(1500),"Чынгыз Айтматов", Language.KYRGYZ, LocalDate.of(2010,05,05));
        User user = new User(1L,"Dastan","Akbaraliev","dastangmail.com","+996708222500", Gender.MALE,new BigDecimal(5000),);

        

    }
}