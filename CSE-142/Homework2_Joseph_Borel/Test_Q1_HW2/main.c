//
//  main.c
//  Test_Q1_HW2
//
//  Created by Phil Borel on 2/11/14.
//  Copyright (c) 2014 Phil Borel. All rights reserved.
//

#include <stdio.h>
#include <math.h>

int main(void)
{

    float num, root;
    char ans;
    
    while (ans != 'n' && ans != 'N')
    {
        printf("Give me a postitive number>");
        scanf("%f", &num);
        root = sqrt(num);
        printf("The root of %.1f is %.1f\n", num, root);
        printf("Do you want to compute another root y/n?");
        fflush(stdin);
        scanf("%c", &ans);
    }
    return 0;
}

