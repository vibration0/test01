package command;
import javax.servlet.http.*;
public interface CommandAction {
	//안녕하세요
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable;
	

}
