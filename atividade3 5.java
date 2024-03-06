import java.util.Scanner;
  soma = num1 + num2
    subtracao = num1 - num2
    multiplicacao = num1 * num2

    # Verificando se o segundo número é diferente de zero para evitar divisão por zero
    if num2 != 0:
        divisao = num1 / num2
    else:
        divisao = "Divisão por zero não é permitida."

    return soma, subtracao, multiplicacao, divisao

# Obtendo entrada do usuário
numero1 = float(input("Digite o primeiro número: "))
numero2 = float(input("Digite o segundo número: "))

# Chamando a função e exibindo os resultados
resultados = realizar_operacoes(numero1, numero2)
print(f"Soma: {resultados[0]}")
print(f"Subtração: {resultados[1]}")
print(f"Multiplicação: {resultados[2]}")
print(f"Divisão: {resultados[3]}")
    }
}
