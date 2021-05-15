/*package com.java.bny;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.net.*;
import com.google.gson.*;

class Result {

	
	 * Complete the 'getArticleTitles' function below.
	 *
	 * The function is expected to return a STRING_ARRAY. The function accepts
	 * STRING author as parameter.
	 * 
	 * URL for cut and paste:
	 * https://jsonmock.hackerrank.com/api/articles?author=<authorName>&page=<num>
	 *
	 

	public static List<String> getArticleTitles(String author) {
		 String response;
	        int page = 1;
	        int totalPages = 2;
	        List<String> titles = new ArrayList<>();

	        while (page <= totalPages) {
	            try {
	                URL url = new URL("https://jsonmock.hackerrank.com/api/articles?author=" + author + "&page=" + page);
	                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	                connection.setRequestMethod("GET");
	                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

	                while ((response = reader.readLine()) != null) {
	                    JsonObject jsonResponse = new Gson().fromJson(response, JsonObject.class);
	                    totalPages = jsonResponse.get("total_pages").getAsInt();
	                    JsonArray data = jsonResponse.getAsJsonArray("data");

	                    for (JsonElement datum: data) {
	                        String title = datum.getAsJsonObject().get("Title").getAsString();
	                        titles.add(title);
	                    }
	                }
	                reader.close();
	                page++;
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String author = bufferedReader.readLine();

		List<String> result = Result.getArticleTitles(author);

		for (int i = 0; i < result.size(); i++) {
			bufferedWriter.write(result.get(i));

			if (i != result.size() - 1) {
				bufferedWriter.write("\n");
			}
		}

		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
*/