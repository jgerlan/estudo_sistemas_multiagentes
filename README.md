# Estudo de Sistemas multiagentes

Repositório para estudo de Sistemas Multiagentes e suas aplicações.

Introdução

É dado como sistemas multiagentes um conjunto de soluções de software definidas numa arquitetura de tarefas distribuídas com autômatos, estabelecidos como agentes, que possuem características determinadas e que percebem seu ambiente através de sensores e age sobre o mesmo utilizando-se dos executores. (RUSSEL E NORVIG, 1995)
Esta definição cabe como sub-área da Inteligência artificial Distribuída que enfatiza um ambiente multiagente povoado por entidades autônomas. (ALVARES E SICHMAN, 1997) Sendo estudado já há algumas décadas gerou mais especializações em usos na tecnologia da informação como em seu âmbito original, inteligências artificial, ou mesmo em sistemas distribuídos e automação além de Sistemas de informação. Também com práticas de desenvolvimento estudadas pela área de Engenharia de software baseada em agentes.
Este rápido compêndio tem como finalidade introduzir e situar um desenvolvedor nas noções elementares do desenvolvimento de Sistemas multiagentes. Sendo JAVA a plataforma utilizada com JADE (Java Agent Development Environment) um de seus Frameworks criados para facilitar o desenvolvimento de aplicativos de agente em conformidade com as especificações FIPA para sistemas multiagentes inteligentes interoperáveis. (BELLIFEMINE, POGGI E RIMASSA, 2000)

O Desenvolvimento

Configuração de ambiente

Os teste e aplicações serão feitos na IDE (Integrated Development Environment) Eclipse com a necessidade da importar o framework JADE, disponível no site dos desenvolvedores anexado nas referências. Lá possuem diversas opções de downloads com tutoriais, documentação ou apenas a biblioteca do JADE.
Após criar um projeto java no Eclipse algumas configurações terão que ser feitas afim de possibilitar o prosseguimento. Para fins práticos cria-se uma pasta, aqui nomeada como “libJADE”, e coloca-se o arquivo nela. Importe por meio do menu  Properties->Java Build Path. E em Properties→ Run/Debug Settings, crie uma nova configuração de execução e na aba “Main” em “Main Class” adicione “jade.Boot”, sem aspas, e na aba “Arguments” em “Program Arguments” a linha “-gui” também sem aspas, como descrito em JADE Programming Tutorial for Beginners encontrado também no site do framework.

(continua...)


Referências:
RUSSEL, S. and NORVIG, P. Artificial Intelligence: A Modern
Approach, Prentice-Hall, 1995.
ALVARES, L. and SICHMAN, J. Introdução aos sistemas multiagentes, XVII Congresso da SBC, Brasília, 1997.
BELLIFEMINE, F., POGGI, A. AND RIMASSA, G. Developing multi-agent systems with JADE, Seventh International Workshop on Agent Theories, Boston, 2000.
JADE ITLAB, http://jade.tilab.com/doc/tutorials/JADEProgramming-Tutorial-for-beginners.pdf , 2017.
JADE ITLAB, http://jade.tilab.com/download/jade/, 2017.
