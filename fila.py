class Fila:
    def __init__(self):
        self.elementos = []

    # Inserir elemento na fila
    def enqueue(self, item):
        self.elementos.append(item)

    # Remover elemento da frente
    def dequeue(self):
        if not self.is_empty():
            return self.elementos.pop(0)
        return "Fila vazia!"

    # Consultar o primeiro elemento
    def front(self):
        if not self.is_empty():
            return self.elementos[0]
        return "Fila vazia!"

    # Verificar se está vazia
    def is_empty(self):
        return len(self.elementos) == 0

    # Mostrar fila
    def mostrar_fila(self):
        print("Fila:", self.elementos)


if __name__ == "__main__":
    fila = Fila()

    fila.enqueue("Luis")
    fila.enqueue("Manuel")
    fila.enqueue("Marques")
    fila.enqueue("Adilson")
    fila.enqueue("Emiliano")

    fila.mostrar_fila()

    print("Removido:", fila.dequeue())
    print("Em frente:", fila.front())
    print("Removido:", fila.dequeue())
    print("Em frente:", fila.front())
    print("Está vazia?", fila.is_empty())

    fila.mostrar_fila()