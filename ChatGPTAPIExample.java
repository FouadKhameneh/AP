import java.io.*;
import java.net.*;

public class ChatGPTAPIExample {

    public static String APICall(String Description) {
        try {
            // Define the endpoint URL for the ChatGPT API
            URL url = new URL("https://api.openai.com/v1/chat/completions");

            // Create a HttpURLConnection object
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method
            connection.setRequestMethod("POST");

            // Set the Content-Type header
            connection.setRequestProperty("Content-Type", "application/json");

            // Set the Authorization header with your API key
            connection.setRequestProperty("Authorization", "Bearer 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");

            // Enable output and input streams
            connection.setDoOutput(true);
            connection.setDoInput(true);

            // Construct the JSON request body
            String requestBody = "{\"model\": \"text-davinci-003\", \"messages\": [{\"role\": \"user\", \"content\": \"" + Description + "\"}]}";

            // Write the JSON request body to the output stream
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = requestBody.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            String result = null;

            // Get the response from the API
            try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                result = response.toString();
            }

            connection.disconnect();
            return result;

        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception properly
            return null; // Return null or an appropriate error message
        }
    }
}


/*curl https://api.openai.com/v1/chat/completions \
  -H "Content-Type: application/json" \
  -H "Authorization: Bearer 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 \
  -d '{
    "model": "gpt-3.5-turbo",
    "messages": [
      {
        "role": "system",
        "content": "You are a helpful assistant."
      },
      {
        "role": "user",
        "content": "Who won the world series in 2020?"
      },
      {
        "role": "assistant",
        "content": "The Los Angeles Dodgers won the World Series in 2020."
      },
      {
        "role": "user",
        "content": "Where was it played?"
      }
    ]
  }'
 */

/*
 *     "error": {
        "message": "You exceeded your current quota, please check your plan and billing details. For more information on this error, read the docs: https://platform.openai.com/docs/guides/error-codes/api-errors.",
        "type": "insufficient_quota",
        "param": null,
        "code": "insufficient_quota"
    }
}
 */