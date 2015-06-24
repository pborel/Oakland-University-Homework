//
//  main.c
//  CSE-142_Assignment_1_PI_Calculator
//
//  Created by Phil Borel on 2/10/14.
//  Copyright (c) 2014 Phil Borel. All rights reserved.
//

#include <stdio.h>

#define PI 3.14159

float square(float radius);

int main(void)
{
    float radius, circumference, area;
    
    
  

    printf("Enter the radius as a real number of the circle you wish to calculate the circumference and area of:\n");
    scanf("%f", &radius);
 
// circumference
    circumference = 2 * radius;
    printf("The circumference of a circle with radius %.0f ft is equal to %.2f ft.\n", radius, circumference);
    
// area
    float a;
    a = radius*radius;
    area = PI * a;
    printf("The area of a circle with radius %.0f ft is equal to %.2f ft.\n", radius, area);
    
    return 0;
}

