Socket Group Chat
Socket Group Chat is a real-time group messaging application built with Java and Sockets. It allows users to join chat rooms, send and receive messages instantly, and interact with others in a multi-user environment.

Features
Real-time messaging using Java Sockets.
Multiple chat rooms for different discussions.
Custom usernames for users to identify themselves.
Multithreading to handle multiple clients concurrently.
Installation
1. Clone the repository
bash
Copy code
git clone https://github.com/abdi-mangashahun/socket_group-chat.git
cd socket_group-chat
2. Compile the Java files
Ensure you have Java installed, then compile the files:

bash
Copy code
javac *.java
3. Start the server
Run the server that listens for incoming connections:

bash
Copy code
java ChatServer
4. Run the client
In another terminal, run the client to connect:

bash
Copy code
java ChatClient
Enter a username and choose a chat room to start chatting.

Usage
Join a room by entering a username and selecting a room.
Send and receive messages in real-time.
Switch between rooms (if implemented).
