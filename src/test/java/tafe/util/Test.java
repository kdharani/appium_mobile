package tafe.util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	 public static void main(String args[]) {
		    Date date = new Date();
		    String DATE_FORMAT = "M/d/yyyy";
		    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		    System.out.println("Today is " + sdf.format(date));
		   System.out.println(System.getProperty("user.dir")+File.separator+"app"+File.separator+"tafe_android.apk");
		  }

}
