package com.goit.task2;

import java.io.IOException;

public class MainApp {

    public static void main(String[] args) throws IOException {
        User user = new User();
        user.txtToJson("C:\\workspace\\GOIT_HW-9\\src\\com\\goit\\task2\\file.txt");
        }

}
