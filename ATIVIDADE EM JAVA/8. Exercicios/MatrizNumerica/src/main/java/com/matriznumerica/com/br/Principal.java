/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.matriznumerica.com.br;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Principal 
{
    // Matriz de número;
    
    public static int matInteira[][] = new int[10][10];
    
    public static Matriz matriz = new Matriz();
    
    public static void main (String[] args)
    {
        matriz.inicializarMatriz(matInteira);
        
        matriz.exibirMatriz(matInteira);
        
        matriz.crivo(matInteira);
    }
}
