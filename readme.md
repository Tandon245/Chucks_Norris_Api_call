# Chuck Norris Joke API
This is a Java program that fetches a random Chuck Norris joke from the Chuck Norris Joke API using a simple HTTP request.

## Dependencies
No additional dependencies are required for this program.

## How to Run
To run the program, follow these steps:

Clone or download the project to your local machine.
Open the project in your preferred Java IDE.
Compile and run the Main class.
The program will send an HTTP GET request to the Chuck Norris Joke API and print the random joke to the console.
Explanation
This program uses the java.net.HttpURLConnection class to establish a connection with the Chuck Norris Joke API. It sets the appropriate HTTP request method and headers to retrieve the joke in JSON format. If the response code is not 200 (indicating a successful request), a RuntimeException is thrown.

The program then reads the response from the input stream and builds a string containing the JSON response. Finally, it prints the output (the random joke) to the console.

## Note
Make sure you have an active internet connection while running this program, as it requires connecting to the Chuck Norris Joke API.

If you encounter any errors or have any questions, please don't hesitate to reach out.

Enjoy the Chuck Norris jokes!
