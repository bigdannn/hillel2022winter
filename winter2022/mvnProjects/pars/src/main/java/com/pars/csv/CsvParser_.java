package com.pars.csv;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class CsvParser_ {

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "/Users/stepurkoolksandr/hillel2022winter/winter2022/mvnProjects/pars/src/main/resources/username_1.csv";

        List<UEmail_> beans = new CsvToBeanBuilder(new FileReader(fileName))
                .withType(UEmail_.class)
                .withSeparator(';')
                .build()
                .parse();

        beans.forEach(System.out::println);
    }
}
