import java.util.Scanner;
def calcular_desconto(preco, percentual_desconto):
    desconto = preco * (percentual_desconto / 100)
    novo_preco = preco - desconto
    return novo_preco


nome_produto = input("Digite o nome do produto: ")
preco_produto = float(input("Digite o preço do produto: "))
percentual_desconto = float(input("Digite o percentual de desconto: "))


novo_preco = calcular_desconto(preco_produto, percentual_desconto)


print(f"Nome do produto: {nome_produto}")
print(f"Novo preço com desconto: {novo_preco:.2f}")
    }
}
