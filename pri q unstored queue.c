#include<stdio.h>
#include<stdlib.h>
#define max 10
int size=0,pq[max],mi;
void insert(int x)
{
	if(size==max)
	{
	printf("overflow\n");
	}
	else
	{
		pq[size++]=x;
	}
}
int deletionmin()
{
	if(size==0)
	{
		printf("pq is empty\n");
	}
	else
	{    int mi=0;
		for(int i=1;i<size;i++)
		{
			if(pq[i]<pq[i])
			{
				mi=1;
			}
			
		}
		for(int i=mi+1;i<size;i++)
		{
			pq[i-1]=pq[i];
			size--;
			return pq[mi];
		}
	}
}
int display()
{
	for(int i=0;i<pq[max];i++)
	{
	    	printf("%d",pq[i]);
	}
}
int main()
{
	int ch,a;
	
	do
	{   printf(" enter 1.insert 2.deletionmin 3.display 4.exit\n");
	    scanf("%d",&ch);
	   switch(ch)
	   {
	   	case 1: printf("enter the number");
	   	        scanf("%d",&a);
	   	        insert(a);
	   	        break;
	   	case 2: deletionmin();
	   	        break;
	   	case 3: display();
	   	        break;
	   	case 4: exit(0);
	   }
	} 
	while(ch!=4);
	return 0;
}