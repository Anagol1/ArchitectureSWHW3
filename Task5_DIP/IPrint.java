package ArchitectureSWHW3.Task5_DIP;

public interface IPrint {
    default void print(Text text) {
        System.out.println(text.getText());
    }

}

