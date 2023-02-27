import json

with open('Questao3/faturamento.json', 'r') as file:
    faturamento_diario = json.load(file)

# Encontra o menor e o maior valor de faturamento diário
minimo = min(faturamento_diario, key=lambda x: x['valor'])['valor']
maximo = max(faturamento_diario, key=lambda x: x['valor'])['valor']

# Calcula a média mensal de faturamento diário, desconsiderando os dias sem faturamento
faturamento_total = sum(dia['valor'] for dia in faturamento_diario if dia['valor'] > 0)
dias_com_faturamento = sum(1 for dia in faturamento_diario if dia['valor'] > 0)
media = faturamento_total / dias_com_faturamento

# Calcula o número de dias no mês em que o valor de faturamento diário foi superior à média mensal
dias_acima_da_media = sum(1 for dia in faturamento_diario if dia['valor'] > media)

# Imprime os resultados
print(f"Menor valor de faturamento diário: R$ {minimo:.2f}")
print(f"Maior valor de faturamento diário: R$ {maximo:.2f}")
print(f"Média mensal de faturamento diário: R$ {media:.2f}")
print(f"Número de dias com faturamento acima da média: {dias_acima_da_media}")