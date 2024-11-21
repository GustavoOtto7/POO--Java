class Aluno:
    def __init__(self, nome, idade, nota):
        self.__nome = nome
        self.__idade = idade
        self.__nota = nota

    def setNome(self, nome):
        self.__nome = nome

    def getNome(self):
        return self.__nome
    
    def setIdade(self, idade):
        self.__idade = idade

    def getIdade(self):
        return self.__idade
    
    def setNota(self, nota):
        self.__idade = nota

    def getNota(self):
        return self.__nota

    def status(self):
        print("Nome: ", self.__nome, " Idade: ", self.__idade, " Nota: ", self.__nota)

a1 = Aluno("Gustavo", 19, 10)
a2 = Aluno("Priscila", 18, 10)
a1.status()
a2.status()