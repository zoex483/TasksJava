package seminar05.Task01;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String source = Read("seminar05/Task01/source.txt");
        source = source.toLowerCase().replaceAll("\\p{Punct}", "").replaceAll( "[\\\t|\\\n|\\\r]"," ");
        Map<String, Integer> dictionary = CreateMap(source);
        String request = GetRequest();
        System.out.println(request + " -> " + Find(dictionary, request));
    }

    private static Integer Find(Map<String, Integer> dictionary, String request) {
        if(dictionary.containsKey(request)) {
            return dictionary.get(request);
        }        
        return null;
    }


    private static Map<String, Integer> CreateMap(String source) {
        String[] words = source.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if(!map.containsKey(word)){
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }
        return map;
    }

    private static String GetRequest() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word for search: ");
        String request = scanner.next();
        scanner.close();
        return request.trim().toLowerCase();
    }

    private static String Read(String path) {
        try {
            return Files.readString(Paths.get(path), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

