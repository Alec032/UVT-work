import socket
import threading

def handle_client(clientSocket, addr):
    client_ip = addr[0]
    client_port = addr[1]
    server_ip = clientSocket.getsockname()[0]
    server_port = clientSocket.getsockname()[1]

    print(f'Connection established from address {client_ip}:{client_port}')
    print(f'Server IP address: {server_ip}, Server Port: {server_port}')

    message = f'Welcome to the Server. Server IP: {server_ip}, Port: {server_port}'
    clientSocket.send(message.encode())

    while True:
        try:
            message = clientSocket.recv(2048).decode()
            if not message:
                break
            print(f'Message received from client {client_ip}:{client_port}: {message}')

            response = f'Message received successfully by server {server_ip}:{server_port}'
            clientSocket.send(response.encode())
        except Exception as e:
            print(f"An error occurred with client {client_ip}:{client_port}: {e}")
            break

    clientSocket.close()

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.bind(('localhost', 4545))
s.listen(5)

while True:
    clientSocket, addr = s.accept()

    client_thread = threading.Thread(target=handle_client, args=(clientSocket, addr))
    client_thread.start()
