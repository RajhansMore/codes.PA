#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<stdlib.h>

int main()

{
        char name[30];
        int FD = 0;
        char data[30] = {'\0'};

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

        lseek(FD,9,SEEK_SET);

        read(FD,data,5);

        write(1,data,5);

        close(FD);

        return 0;
}
