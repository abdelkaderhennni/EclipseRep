package src;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            DatagramSocket socket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("localhost");
            System.out.println("Connected sucsessfullly :) Enter message to the server");
            
            String message = scanner.nextLine();

            byte[] buffer = message.getBytes();
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, serverAddress, 1234);
            socket.send(packet);
            System.out.println("Sent to server: " + message);

          //  socket.close();
            System.out.println("UDP Client closed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
