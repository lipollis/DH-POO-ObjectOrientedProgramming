<div align="center"><img src="https://github.com/lipollis/Imagens-Git/blob/main/banner_assinatura.svg" /></div>

<h1 align="center"> Aula 11 - Abstract - Exercicio bancoNacional </h1>
<h2 align="center"> Programação Orientada a Objeto - CTD:Digital House </h2>

<div align="center">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" width="70px"/>
  <br>
  <br>
  

<br>
<h2>:beginner: Objetivo</h2>

<p align="justify">Identifique, modele as classes envolvidas na instrução especificando seus atributos,
responsabilidades e relacionamentos entre elas.
</p>

<br>
<h2>:heavy_check_mark: Requisitos </h2>

<ol>
  <li>O Banco Nacional nos pede que façamos a modelagem de um novo sistema. Este sistema
manterá um registro das contas e clientes do banco.</li>
    <ul>
      <li>Clientes: os clientes serão identificados com um número de cliente, nome, RG e CPF.
Contas: nossas contas bancárias permitem depositar, sacar dinheiro e relatar saldo. Uma
conta possui um cliente associado.</li>
      <li>Extensão:
Conta poupança: as contas poupanças têm saldo e também taxa de juros. Nesse
tipo de conta, você pode realizar três operações:
          <ul>
            <li>Depositar dinheiro: o cliente pode depositar a quantia que desejar.</li>
            <li>Sacar dinheiro: o cliente pode sacar dinheiro sem ultrapassar seu saldo.</li>
            <li>Cobrar juros: o cliente pode cobrar mensalmente os juros que sua poupança lhe concede.</li>
          </ul>
      </li>
      <li>Conta Corrente: as contas correntes possuem saldo e também valor autorizado
para saque. Nesse tipo de conta, você pode realizar três operações:
          <ul>
            <li>Depositar dinheiro: o cliente pode depositar a quantia que desejar.</li>
            <li>Depositar cheques: o cliente pode depositar um cheque. Um cheque tem um
valor, um banco emissor e uma data de pagamento.</li>
            <li>Sacar dinheiro: o cliente pode sacar dinheiro e usar o cheque especial se não tiver
saldo suficiente.</li>
          </ul>
      </li>
      <br>
      <li>Esclarecimento: Para este exercício é possível modelar a Conta como uma classe abstrata
e, embora uma conta tenha várias responsabilidades, como mostra a declaração, algumas
podem ter que se comportar de forma diferente nas subclasses e um método abstrato
pode ser possível.</li>

  </ul>
</ol>
