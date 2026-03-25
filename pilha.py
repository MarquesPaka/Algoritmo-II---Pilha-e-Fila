class Pilha:
    def __init__(self):
        self.elementos = []

    # Inserir no topo da pilha
    def push(self, item):
        self.elementos.append(item)

    # Remover do topo
    def pop(self):
        if not self.is_empty():
            return self.elementos.pop()
        return "Pilha vazia!"

    # Consultar topo
    def peek(self):
        if not self.is_empty():
            return self.elementos[-1]
        return "Pilha vazia!"

    # Verificar se está vazia
    def is_empty(self):
        return len(self.elementos) == 0

    # Mostrar pilha
    def mostrar_pilha(self):
        print("Pilha:", self.elementos)


if __name__ == "__main__":
    pilha = Pilha()

    pilha.push("António")
    pilha.push("Armando")
    pilha.push("Janeta")
    pilha.push("Azaiel")

    pilha.mostrar_pilha()

    print("Topo:", pilha.peek())
    print("Removido:", pilha.pop())
    print("Novo topo:", pilha.peek())
    print("Está vazia?", pilha.is_empty())

    pilha.mostrar_pilha()