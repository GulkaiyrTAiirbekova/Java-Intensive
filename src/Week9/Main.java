//package Week9;
//
//import java.io.*;
//import java.io.IDException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//
//
//public class Main {
//    public static void main(String [] args) throws IOException {
//        Person anuar = new Person (20,"Anuar" ,"Gamden road 20" );
//        try(FileOutputStream  fos =  FileOutputStream ("srs/week9/person.bin"){
//            ObjectOutputStream oos  =  new ObjectOutputStream(fos);
//            oos.writeObject(anuar);
//            oos.flush();
//        }
//        byte [] bytes = Files.readAllBytes (Paths.get("srs/week9/person.bin"));
//        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bytes))) {
//            Object o = ois.readObject();
//        }
//    }
//}
