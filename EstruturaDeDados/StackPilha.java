package com.estruturaDeDados.pilha.teste;

import java.util.Stack;

import com.estruturaDeDados.pilha.Pilha;

public class StackPilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println(stack.isEmpty()); //Vazio
		
		stack.push(1); //Empilhar
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack);
		
		System.out.println();
		System.out.println(stack.peek()); //topo da pilha
		
		System.out.println(stack.pop());
		
		System.out.println(stack);
		

	}

}
