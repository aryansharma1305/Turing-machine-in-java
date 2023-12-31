package main;

import tm.*;
import tm.MachinesLibrary;
import tm.TuringMachine;

public class Main
{

    public static void main(String[] args)
    {
        TuringMachine TM1 = MachinesLibrary.EqualBinaryWords();

        boolean done = TM1.Run("010000110101#010000110101", false);
        if (done==true)
        {
            System.out.println("The input was accepted.");
        }
        else
        {
            System.out.println("The input was rejected.");
        }
    }

}