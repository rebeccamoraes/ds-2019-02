# Requisitos - Conversor XML <> JSON

R1 - Receber estrutura no formato XML ou JSON

R2 - Verificar se o conteúdo da estrutura corresponde ao esquema do formato JSON Schema, caso o formato inicial seja JSON

R3 - Verificar se o conteúdo da estrutura corresponde ao esquema do formato XML Schema, caso o formato inicial seja XML

R4 - Retornar erro, caso o resultado não tenha passado na verificação

R5 - Realizar a conversão de para JSON, caso o formato inicial seja XML e tenha passado na verificação

R6 - Realizar a conversão de para XML, caso o formato inicial seja JSON e tenha passado na verificação

R7 - Verificar se o resultado da conversão corresponde ao esquema do formato JSON Schema, caso o formato final seja JSON

R8 - Verificar se o conteúdo da estrutura corresponde ao esquema do formato XML Schema, caso o formato final seja XML

R9 - Retornar o resultado da conversão, caso o mesmo tenha passado na verificação

R10 - Retornar erro, caso o resultado não tenha passado na verificação

