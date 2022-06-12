
package Projetos_pessoais;

import java.util.Scanner;

public class Calcular_Notas {

   
    public static void main(String[] args) {
       
   Scanner input= new Scanner (System.in);
int notaminima= 6;
//INTRO
        System.out.println("---BEM VINDO---");

//Alunos

        System.out.println("Digite a quantidade de alunos:");
        int  alunos =input.nextInt();
        System.out.println("A quantidade de alunos é: "+alunos);
        System.out.println("--------------------------------------------------------------------------------------------\n");

//Notas
        System.out.println("Digite a quantidade de bimestre :");
      int bimestre= input.nextInt();
        System.out.println("A quantidade de bimestre é: "+ bimestre+"\n\n");
    
//Vetores 
String [] NomeAluno= new String [alunos];
int [] [] notaAluno= new int [alunos] [bimestre];
int [] MediaAluno= new int [alunos];


//Obter nome dos Alunos
    for(int i=0; i<alunos;++i){
    System.out.println("Informe o nome do " + (i+1)+ "° aluno:");
    NomeAluno[i]=input.next();
}

        System.out.println("-------------------------------------------------------------------------------------\n");

//Obter notas dos alunos todos os bimestres
for(int i=0;i<alunos;++i){
for(int j=0;j<bimestre;++j){
    System.out.println("Informe a nota do aluno "+ NomeAluno[i]+ " para o "+ (j+1)+ "° bimestre");
    notaAluno[i] [j]= input.nextInt();
}
}
//Calcular media alunos
for(int i=0;i<alunos;++i){
for(int j=0;j<bimestre;++j){
    MediaAluno[i] +=notaAluno[i] [j];
}
MediaAluno[i]/=bimestre;
}

//Resultado final
System.out.println("----------RESULTADO----------\n");

for(int i=0;i<alunos;++i){

//Aprovado
if(MediaAluno[i]>=notaminima){
    System.out.println("Nome: "+ NomeAluno[i]+ "          Média: "+ MediaAluno[i]+ "          Situação: Aprovado");
}else
System.out.println("Nome: "+ NomeAluno[i]+ "          Média: "+ MediaAluno[i]+ "          Situação: Reprovado");
}
        System.out.println("\n---Fim---\n\n");

    }
    
}
