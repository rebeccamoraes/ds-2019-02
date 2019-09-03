# Descrição do Módulo Conversor XML-JSON
Este módulo tem como objetivo realizar a conversão de documentros entre dois formatos, XML e JSON,
em ambos os sentidos. Adicionalmente, a expectativa é que o documento de entrada, seja XML ou JSON, 
seja verificado antes da conversão. A verificação deve ser feita em relação ao XML Schema ou JSON Schema
correspondente. Uma biblioteca com estas características deve atender a conversão de possivelmente 
"qualquer" documento em um destes formatos para o outro formato. 

## Requisitos

- R1 Verificar a conformidade de um documento XML com um dado XML Schema.
- R2 Verificar a conformidade de um documento JSON com um dado JSON Schema.
- R3 Converter um documento no formato XML para o equivalente no formato JSON. 
- R4 Converter um documento no formato JSON para o equivalente no formato XML. 

# Observações (notas)

- Receber estrutura no formato XML ou JSON

- Verificar se o conteúdo da estrutura corresponde ao esquema do formato JSON Schema, caso o formato inicial seja JSON

- Verificar se o conteúdo da estrutura corresponde ao esquema do formato XML Schema, caso o formato inicial seja XML

- Retornar erro, caso o resultado não tenha passado na verificação

- Realizar a conversão de para JSON, caso o formato inicial seja XML e tenha passado na verificação

- Realizar a conversão de para XML, caso o formato inicial seja JSON e tenha passado na verificação

- Verificar se o resultado da conversão corresponde ao esquema do formato JSON Schema, caso o formato final seja JSON

- Verificar se o conteúdo da estrutura corresponde ao esquema do formato XML Schema, caso o formato final seja XML

- Retornar o resultado da conversão, caso o mesmo tenha passado na verificação

- Retornar erro, caso o resultado não tenha passado na verificação

