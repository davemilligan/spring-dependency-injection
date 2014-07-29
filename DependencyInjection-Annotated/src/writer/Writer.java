package writer;

import org.springframework.stereotype.Service;

@Service
public class Writer implements IWriter {
  public void writer (String s){
    System.out.println(s);
  }
} 