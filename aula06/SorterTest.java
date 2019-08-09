package br.com.fernando.aula06;

import org.junit.Test;

import static org.junit.Assert.*;

public class SorterTest {

    Sorter sorter;

    @org.junit.Before
    public void setUp() throws Exception {
        sorter = new Sorter();
    }

    @Test
    public void sortOrdenaArray(){
        //arrange
        int[] numeros = new int[100];
        for (int i=0; i<numeros.length; ++i)
        {
            numeros[i] = numeros.length - 1 - i;
        }
        //act
        sorter.sort(numeros);

        //assert

        for(int i=0;i<numeros.length;++i)
        {
            assertEquals(i, numeros[i]);
        }
    }
}