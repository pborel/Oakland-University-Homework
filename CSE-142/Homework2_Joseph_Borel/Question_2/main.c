//
//  main.c
//  Question_2
//
//  Created by Phil Borel on 2/11/14.
//  Copyright (c) 2014 Phil Borel. All rights reserved.
//

#include <stdio.h>

int main(void)
{
    float side, base, height, area_square, area_triangle;
    char letter;
    
    while (letter != 'n' && letter != 'N')
    {
        printf("Please enter \"S\" if you want to calculate the area of a square or \"T\" if you want to calculate the area of a triangle or \"N\" if you want to end the program: ");
        scanf("%c", &letter);
        
        if(letter == 's' || letter == 'S' || letter == 't' || letter == 'T' || letter == 'n' ||
           letter == 'N')
        {
            switch (letter)
            {
                // Square
                case 'S':
                case 's':
                    printf("Please enter the length of one of the sides of the square: ");
                    scanf("%f", &side);
        
                    // Calculating the area of the square
                    area_square = side * side;
        
                    // Printing the area of the square
                    printf("The area of the square is %f. \n", area_square);
            
                    fflush(stdin);
                    break;
        
                // Triangle
                case 't':
                case 'T':
                    printf("Please enter the height and the base of the triangle: ");
                    scanf("%f%f", &base, &height);
                
                    // Calculating the area of the triangle
                    area_triangle = .5 * base * height;
                
                    // Printing the area of the triangle
                    printf("The area of the triangle is %f. \n", area_triangle);

                    fflush(stdin);
                    break;
                
                // Exit Program
                case 'n':
                case 'N':
                    return(0);
            }
        }
        // User input was not a valid character
        else
            printf("The character you entered is not an \"S\" or a \"T\".\n\n");
    }
    return 0;
}

