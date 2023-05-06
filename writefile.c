#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<stdlib.h>

int main()

{
        char name[30];
        int FD = 0;
        char data[]= "India is my country";

        printf("Enter file name that you want to create: \n");
        scanf("%s",name);

        FD = open(name,O_RDWR);
        if(FD==-1)
        {
            printf("Unable to open file\n");
            return -1;
        }
        else
        {
            printf("File is successfully opened\n");
        }
        write(FD,data,19);


        return 0;
}
