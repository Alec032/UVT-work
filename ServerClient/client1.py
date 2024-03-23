import socket

def handle_client(clientSocket, addr):
    client_ip = addr[0]
    client_port = addr[1]
    server_ip = clientSocket.getsockname()[0]
    server_port = clientSocket.getsockname()[1]
    return client_port, server_port

def main():
    SERVER_ADDRESS = 'localhost'
    SERVER_PORT = 4545

    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

    try:
        client_socket.connect((SERVER_ADDRESS, SERVER_PORT))

        welcome_message = client_socket.recv(2048).decode()
        print(welcome_message)

        message = "Paris."
        client_socket.send(message.encode())

        response = client_socket.recv(2048).decode()


        client_port, server_port = handle_client(client_socket, client_socket.getpeername())
        print("Response from server received. Source port:", client_port, ", Destination Port:", server_port)
        print("Response:", response)

    except Exception as e:
        print("An error occurred:", e)

    finally:
        client_socket.close()
        input("Press Enter to exit...")

if __name__ == "__main__":
    main()
