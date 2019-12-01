package edu.cgcc.cs260;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class enforceAlphanum {
    private void enforceAlphanum(){
        List<String> names = new ArrayList<String>();
        String regex;

        names.add("myname");
        names.add("mynam3");
        names.add("myname%%");

        regex = "^[a-zA-Z0-9]+$";

        Pattern pattern = Pattern.compile(regex);

        for (String name : names){
            Matcher matcher = pattern.matcher(name);
            System.out.println(matcher.matches());
        }
    }
}
