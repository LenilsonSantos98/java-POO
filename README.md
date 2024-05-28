Getters e Setters
Seguindo a convenção Java Beans:

Os métodos "Getters" e "Setters" são utilizados para buscar valores de atributos ou definir novos valores de atributos, de instâncias de classes.

O método Getter, retorna o valor do atributo especificado.

O método Setter, define outro novo valor para o atributo especificado.

Seguindo a convenção Java Beans, uma classe que contém esta estrutura de estados deverá seguir as regras abaixo:

Os atributos precisam ter o modificador de acesso private. Ex.: private String nome;

Como agora os atributos estarão somente a nível de classe, precisaremos dos métodos getX e setX, Ex.: getNome() e setNome(String novoNome);

O método get, é responsável por obter o valor atual do atributo, logo ele precisa ser public, retornar um tipo correspondente ao valor, Ex.: public String getNome() {};

O método set, é responsável por definir ou modificar o valor de um atributo em um objeto, logo, ele também precisa ser public, receber um parâmetro do mesmo tipo da variável, mas não retorna nenhum valor void. Ex.: public void setNome(String newNome)

## Pacote escola

<h2>Aluno.java</h2>
Dentro da classe aluno eu crio o objeto aluno. 
 Como convenção crios os atributos de forma privada: nome e ideda.
 Com os atributos em nivel de classe crio os metódos getter's e setter's, para serem acessados em outra classe, nesse caso será a classe Escola.



<h2>Escola.java</h2>

Na classe Escola dentro do metódo principal (main). Estou criando um novo objeto aluno para ela, chamando a classe aluno e definindo o nome da varável do objeto, nesse caso 'felipe' e determinando que sera um novo objeto de 'Aluno'. Em seguida chama-se o metódo Setter que irá definir os valores de cada atributo desse obeto.

Agora para imprimir os valores de atributos  desse objeto utilizo o metodo getter .
