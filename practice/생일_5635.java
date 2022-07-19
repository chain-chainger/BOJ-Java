package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class »ýÀÏ_5635 {

	public static void main(String[] args) throws ParseException, NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
		
		String min_name = "";
		String max_name = "";
		Date min_ymd = null;
		Date max_ymd = null;
		
		int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
        	String str = br.readLine();
        	String[] ndmy = str.split(" ");
        	Date ymd = null;
        	if(i == 0) {
        		min_ymd = dateFormat.parse(ndmy[3]+"-"+ndmy[2]+"-"+ndmy[1]);
        		min_name = ndmy[0];
        		max_ymd = dateFormat.parse(ndmy[3]+"-"+ndmy[2]+"-"+ndmy[1]);
        		max_name = ndmy[0];
        	} else {
        		ymd = dateFormat.parse(ndmy[3]+"-"+ndmy[2]+"-"+ndmy[1]);
        		 if(ymd.before(max_ymd)) {
                     max_ymd = ymd;
                     max_name = ndmy[0];
                 }
                 
                 if(ymd.after(min_ymd)) {
                 	min_ymd = ymd;
                 	min_name = ndmy[0];
                 }
        	}
        }
        
        System.out.printf("%s\n%s\n", min_name, max_name);
        
        br.close();
        
	}

}
