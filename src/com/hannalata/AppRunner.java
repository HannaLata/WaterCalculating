package com.hannalata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class AppRunner {

    private static final Logger LOGGER = Logger.getLogger(AppRunner.class.getName());

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));

        LOGGER.info("How many minutes do you take shower?");
        int min = 0;
        try {
            min = Integer.parseInt(reader.readLine());
        }
        catch (Exception e) {
            LOGGER.severe("Input positive number");
        }

        LOGGER.info("You have used " + min*12 + " bottles!!!");




    }
}
