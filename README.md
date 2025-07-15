1. Qual a principal vantagem do padrão Observer em sistemas reativos?
2. 
   A principal vantagem é o baixo acoplamento entre os objetos. Isso permite que os observadores sejam 
2. notificados automaticamente sempre que o estado do sujeito muda, sem que o sujeito precise saber quem são os 
3. observadores ou quantos são.

2. Por que o Strategy é melhor que muitos if?
3. 
   Porque o Strategy separa comportamentos diferentes em classes distintas, tornando o código mais limpo, 
3. extensível e fácil de manter. Isso facilita testes individuais de cada estratégia e evita grandes blocos de 
4. decisão (if/else, switch), que tendem a crescer e dificultar a manutenção.

3. Dê um exemplo real em que Command seja melhor que apenas chamar métodos diretamente.
4. 
   Um exemplo seria um sistema de editor de texto com botão "Desfazer". Ao invés de apenas chamar métodos 
4. diretamente (como escreverTexto()), cada ação (escrever, deletar, colar) seria encapsulada como um objeto de 
5. comando. Isso permite armazenar, desfazer, ou reexecutar comandos — coisa que não seria possível com chamadas 
6. diretas de métodos.
