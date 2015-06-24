//
//  main.c
//  Question_1
//
//  Created by Phil Borel on 2/11/14.
//  Copyright (c) 2014 Phil Borel. All rights reserved.
//

#include <stdio.h>

int main(void)
{
    // Defining variables
    float USD, Euros;
    char ans;
    
    //While loop
    while (ans != 'n' && ans != 'N')
    {
        // Ask user to enter an amount of USD for converting to Euros
        printf("Enter the amount of USD you would like to convert to Euros> ");
        
        // Take user input
        scanf("%f", &USD);
        
        // Convert USD to Euros
        Euros = USD * 0.73;
        
        // Display relation between USD and Euros
        printf("\n%.2f USD is equal to %.2f Euros.\n\n", USD, Euros);
        
        // Ask if user would like to convert another amount of USD to Euros or end the program
        printf("Do you want to convert another amount of USD to Euros (y/n)?");
        
        // Clear user input
        fflush(stdin);
        
        // Take user input
        scanf("%c", &ans);
    }
    return(0);
}

