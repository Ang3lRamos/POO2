import os
def Limpiar():
    os.system("cls")
def PCapicua(palabra):
        if str(palabra) == str(palabra)[::-1] :
            print("Palindromo")
        else:
            print("No es Palindromo")


def menu():
    while True:
        opc = int(input("Digite 1: "))
        if opc == 1:
            plb = str(input("Digite la palabra o frase sin espacios: "))
            print(PCapicua(plb))
        terminar=input("\nDesea terminar? si/no: ")
        if terminar == "si": 
            Limpiar()
            break
        else:
            Limpiar()
menu()  