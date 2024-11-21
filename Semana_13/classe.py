
class Animal:
    def __init__(self, nome, idade):
        self.__nome = nome
        self.__idade = idade
        self.__vida = 100

    def getNome(self):
        return self.__nome
    
    def setNome(self, nome):
        self.__nome = nome

    def getIdade(self):
        return self.__idade
    
    def setIdade(self, idade):
        self.__idade = idade

    def getVida(self):
        return self.__vida
    
    def setVida(self, vida):
        self.__vida = vida
        if self.__vida <= 0:
            print(self.__nome, " vida 0!")

    def emitirSom():
        print("Som do animal!")

class Mamifero(Animal):
    def __init__(self, nome, idade, forca):
        super().__init__(nome, idade)
        self.__forca = forca

    def setForca(self, forca):
        self.__forca = forca

    def getForca(self):
        return self.__forca
    
    def atacar(self, atacado:Animal):
        atacado.setVida(atacado.getVida() - self.__forca)

    def emitirSom():
        print("Som do mamífero!")

cachorro = Mamifero("Tob", 10, 50)
leopardo = Mamifero("Leozinho", 5, 70)
burro = Mamifero("Burrinho", 10, 5)

print(burro.getVida())
leopardo.atacar(burro)
leopardo.atacar(burro)
print(burro.getVida())