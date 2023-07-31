package br.com.melhorescompras.tests;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import br.com.melhorescompras.model.Celulares;
import br.com.melhorescompras.model.Cliente;
import br.com.melhorescompras.model.Comentario;
import br.com.melhorescompras.model.Detalhe;
import br.com.melhorescompras.model.Informatica;
import br.com.melhorescompras.model.PerguntaResposta;
import br.com.melhorescompras.model.Produto;
import br.com.melhorescompras.model.Profissional;
import br.com.melhorescompras.model.ProfissionalEnum;
import br.com.melhorescompras.model.TvHomeTheater;
import br.com.melhorescompras.model.Usuario;
import br.com.melhorescompras.model.Video;

public class Principal {
	public static void limpar() {
		System.out.print("\033[H\033[2J");
	}

	public static void main(String[] args) throws InterruptedException {
			Usuario usuario = new Usuario();
			Cliente cliente = new Cliente();
			
			Profissional profissional = new Profissional();
			ArrayList<Comentario> comentarios = new ArrayList<Comentario>();
			Produto produto = new Produto();
			Video video = new Video();
			PerguntaResposta pr = new PerguntaResposta();
			Detalhe detalhe = new Detalhe();
			TvHomeTheater tv = new TvHomeTheater();
			Informatica informatica = new Informatica();
			Celulares celulares = new Celulares();
			

			Scanner scanner = new Scanner(System.in);

			String aux;
			int op;
			ProfissionalEnum tipoProfissional1 = ProfissionalEnum.CELEBRIDADE;
			ProfissionalEnum tipoProfissional2 = ProfissionalEnum.ESPECIALISTA;
			
			
				do {
					limpar();
					System.out.println("|------------Menu---------------|");
					System.out.println("|[1] - Cadastro de cliente      |");
					System.out.println("|[2] - Cadastro de profissional |");
					System.out.println("|[3] - Cadastrar v�deo          |");
					System.out.println("|[4] - Visualizar v�deo         |");
					System.out.println("|[5] - Gostei do v�deo          |");
					System.out.println("|[6] - Sair                     |");
					System.out.println("|-------------------------------|");
					System.out.println("Por favor digite o n�mero da op��o desejada: ");
					op = scanner.nextInt();
				} while (!(op == 1 || op == 2 || op == 3|| op == 4 || op == 5|| op == 6)); 

				if (op == 1) {
					limpar();
					System.out.println("Cadastro de cliente");
					System.out.println("Nome: ");
					String nome = scanner.next();
					System.out.print("Login: ");
					String login = scanner.next();
					System.out.print("Senha: ");
					String senha = scanner.next();
					System.out.println("CPF: ");
					String cpf = scanner.next();
					System.out.println("Endere�o: ");
					String endereco = scanner.next();
					
					if (login.equals(cliente.getLogin())) {
						if (senha.equals(cliente.getSenha())) {
							System.out.println("Cadastro feito com sucesso! Voltando pro menu...");
							TimeUnit.SECONDS.sleep(1);}}
									
					if (op == 2) {
					limpar();
					System.out.println("Cadastro de profissional");
					System.out.println("Nome: ");
					String nomString = scanner.next();
					System.out.print("Login: ");
					String logString = scanner.next();
					System.out.print("Senha: ");
					String senString = scanner.next();
					System.out.print("[1] - Celebridade ou [2] - Especialista");
					System.out.print("Qual tipo de profissional voc� se enquadra: ");
					op = scanner.nextInt();
					} while (!(op == 1 || op == 2)); 
						
					
					if (op == 1) {
					}
                    	if (op == 2) {
					}
                    	else {
    						System.out.println("Saindo do sistema...");
    						TimeUnit.SECONDS.sleep(1);}
                    	
					if (login.equals(profissional.getLogin())) {
						if (senha.equals(profissional.getSenha())) {
							System.out.println("Cadastro feito com sucesso! Voltando pro menu...");
							TimeUnit.SECONDS.sleep(1);}}
							
					if (op == 3) {
					limpar();
					System.out.println("Cadastro de v�deo");
					
					if (login.equals(profissional.getLogin())) {
						if (senha.equals(profissional.getSenha())) {
							System.out.println("V�deo cadastrado com sucesso! Voltando pro menu...");
							TimeUnit.SECONDS.sleep(1);	}}}	
							
					if (op == 4) {
					limpar();
					System.out.println("Visualizar v�deo");}
					
					if (op == 5) {
					limpar();
					System.out.println("Gostei do v�deo");
						
				
					if (login.equals(cliente.getLogin())) {
						if (senha.equals(cliente.getSenha())) {
							System.out.println("Like cadastrado com sucesso! Voltando pro menu...");
							TimeUnit.SECONDS.sleep(1);		
						}		
				} }
					else {
					System.out.println("Saindo do sistema...");
					TimeUnit.SECONDS.sleep(1);
				}
			 
					while (!(op == 6)); 
				
			
				
			}
			
		}
	}

	
