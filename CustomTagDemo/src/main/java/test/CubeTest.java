package test;

import java.io.IOException;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class CubeTest extends SimpleTagSupport {
	private int num;


	public void setNum(int num) {
		this.num = num;
	}
	public void doTag() throws IOException , JspException{
		    int cube = num * num * num;
	        JspWriter out = getJspContext().getOut();
	        out.print("Cube: " + cube);
	}

}
