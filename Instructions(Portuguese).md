Sistema de biblioteca que:

- possibilite o armazenamento de livros, revistas e mídias
- possibilite a busca de livros, revistas e mídias
- liste todos os livros, revistas e mídias
- Empresta um livro, revista ou mídia (para simplificar, pode-se considerar um
livro, revista ou mídia como emprestado se ele tem o atributo "emprestado" = "S")

#### Sugestões:
Pacotes:

br.unesp.rc.lcp.view

- TelaBiblioteca (responsável por exibir tela de opções do usuário e recuperar
as informações. Instancia Biblioteca e chama seus métodos dependendo da
operação desejada).

br.unesp.rc.lcp.beans

- ItemAcervo (classe genérica)

- Livro
- Mídia
- Revista

br.unesp.rc.lcp.controlador

- Biblioteca (contém os métodos para criação das classes beans e chamar os métodos das classes de persistência)

br.unesp.rc.lcp.persistencia (responsável por armazenar/buscar dados em arquivo)

- IItem (interface que tem os métodos inserir(), buscar(), emprestar() e listar()
- LivroArquivo (implementa IItem)
- RevistaArquivo (implementa IItem)
- MidiaArquivo (implementa IItem)

(Alternativamente pode-se criar apenas a classe ItemItem que implementa IItem)

Para implementar o armazenamento em arquivo utilizar a interface Serializable e
as classes FileInputStream, FileOutputStream, ObjectInputStream,
 ObjectOutputStream, File (verificar a API do Java)

Para descobrir se um objeto é instância de uma classe, utilizar instanceof

Métodos das classes de manipulação de arquivos exigem utilizar os comandos
try/catch() . Apenas utilize a geração automática do Netbeans. O tema será
abordado em aulas futuras.
