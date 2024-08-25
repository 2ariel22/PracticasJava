# Escribe un programa que reciba una cadena de texto y cuente cuántas vocales (a, e, i, o, u) contiene.


# pedir al usuario texto *

# recorrer cadena de texto y verificar si es una vocal

#mostrar conteo de vocales

cadenaText = input("ingrese la cadena de texto: ")#hola

contVocales = 0
for x in cadenaText:
    if( x =="a" or x=="e" or x=="i" or x=="o" or x=="u" ):
        contVocales+=1;

print(contVocales)
        
