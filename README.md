# 🌳 Árvore AVL – Implementação em Java  
**Disciplina:** Estruturas de Dados II  
**Aluno:** Lucas Leite  e Eliandro José
**Data:** Novembro/2025  

Este repositório contém a implementação completa de uma **Árvore AVL** com inserção de inteiros e exibição in-order após cada operação.  
O projeto foi desenvolvido para o trabalho em vídeo da disciplina, demonstrando conceitos teóricos, rotações, balanceamento e a execução prática do código.

---

## 🎥 Vídeo Explicativo (YouTube)

📌 **Assista aqui:** https://youtu.be/GLNWpbYLO-k

No vídeo, apresento:
- Conceitos fundamentais de Árvore AVL  
- Fator de balanceamento  
- Tipos de rotações  
- Demonstração visual  
- Explicação do código  
- Execução prática das inserções  

---

## 📘 Sobre as Árvores AVL

As Árvores AVL são árvores binárias de busca **auto-balanceadas**, garantindo que:
- A diferença de altura entre subárvores seja no máximo 1  
- Operações permaneçam eficientes: **O(log n)**  
- Rotações sejam aplicadas automaticamente sempre que necessário  

Elas evitam que a BST se torne uma árvore degenerada (uma lista), preservando desempenho mesmo com muitos elementos.

---

## 🧩 Funcionalidades do Código

- Inserção de valores inteiros  
- Cálculo automático da altura  
- Cálculo do fator de balanceamento  
- Rotações:
  - Direita
  - Esquerda
  - Dupla esquerda-direita
  - Dupla direita-esquerda  
- Impressão **in-order** após cada inserção  
- Teste com os valores exigidos no trabalho:
  
10, 5, 15, 3, 8, 12, 18

yaml
Copiar código

---

## 🛠️ Como Executar

### ✔ 1. Compilar

```bash
javac AVLTree.java
✔ 2. Executar
bash
Copiar código
java AVLTree
A saída mostrará o percurso in-order após cada inserção.

📂 Arquivo Principal
AVLTree.java — Código completo da árvore AVL, incluindo:

Classe AVLNode

Cálculo de alturas

Rotações

Inserção balanceada

Impressão in-order

Função main para testes

📚 Estrutura do Repositório
objectivec
Copiar código
/
├── AVLTree.java
└── README.md
🧑‍🏫 Créditos
Aluno: Lucas Leite Finizola Costa
Disciplina: Estruturas de Dados II
Professor: (Adicionar nome do professor aqui)

✔ Licença
Este projeto é exclusivamente acadêmico e pode ser utilizado para fins educativos.
