package week3.day3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortUsingCollectionClassRoom {

	public static void main(String[] args) {
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		List companies = new ArrayList<String>();
		for (String eachValue : input) {
			companies.add(eachValue);
		}
		System.out.println(companies);
		int length = companies.size();
		System.out.println(length);
			Collections.sort(companies);
			System.out.println(companies);
			Collections.reverse(companies);
			System.out.println(companies);
		}
			
		

	}


