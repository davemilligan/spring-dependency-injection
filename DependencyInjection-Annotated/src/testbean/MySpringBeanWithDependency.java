package testbean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import writer.IWriter;
import org.apache.log4j.*;
import org.apache.log4j.spi.LoggerFactory;

@Service
public class MySpringBeanWithDependency {
  private IWriter writer;
  private Logger log4j = Logger.getLogger(MySpringBeanWithDependency.class);
  

  @Autowired
  public void setWriter(IWriter writer) {
    this.writer = writer;
  }

  public void run() {
    String s = "This is my test";
    writer.writer(s);
  }
} 