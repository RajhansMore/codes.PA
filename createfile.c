#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<stdlib.h>

int main()

{
        char name[30];
        int FD = 0;

        printf("Enter file name that you want to create: \n");
        scanf("%s",name);

        FD = creat(name,0777);
        if(FD==-1)
        {
            printf("unable to create fil \n");

        }
        else
        {
            printf("File is successfully creted\n");
        }
        return 0;
}
