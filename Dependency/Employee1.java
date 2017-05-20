package balu.app;
import java.util.*;
public class Employee1 
{
	private List<String>data;
	private Set<String>details;
	public List<String> getData() {
		return data;
	}
	public void setData(List<String> data) {
		this.data = data;
	}
	public Set<String> getDetails() {
		return details;
	}
	public void setDetails(Set<String> details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "Employee1 [data=" + data + ", details=" + details + "]";
	}
	
}
