package io;

import model.Book;
import model.LibraryUser;
import model.Magazine;
import model.Publication;

import java.util.Collection;

public class ConsolePrinter {
    public void printBooks(Collection<Publication> publications) {
        long count = publications.stream()
                .filter(publication -> publication instanceof Book)
                .map(Publication::toString)
                .peek(this::printLine)
                .count();
        if (count == 0) {
            printLine("Brak książek w bibliotece");
        }
    }

    public void printMagazines(Collection<Publication> publications) {
        long count = publications.stream()
                .filter(publication -> publication instanceof Magazine)
                .map(Publication::toString)
                .peek(this::printLine)
                .count();
        if (count == 0)
            printLine("Brak magazynów w bibliotece");
    }

        public void printLine(String text) {
            System.out.println(text);
        }

        public void printUsers(Collection<LibraryUser> users) {
/*            for (LibraryUser user : users) {
*//*                printLine(user.toString());
            }*/
            users.stream()
                    .map(LibraryUser::toString)
                    .forEach(this::printLine);
        }
}