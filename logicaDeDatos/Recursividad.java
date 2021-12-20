package logicaDeDatos;

public class Recursividad {
	
	public static void quicksort(int A[], int izq, int der) {

		  int pivote=A[izq]; 
		  int i=izq;         
		  int j=der;         
		  int aux;
		 
		  while(i < j){                                                           
		     while(A[i] <= pivote && i < j) i++; 
		     while(A[j] > pivote) j--;          
		     if (i < j) {                                              
		         aux= A[i];                      
		         A[i]=A[j];
		         A[j]=aux;
		     }
		   }
		   
		   A[izq]=A[j];                                         
		   A[j]=pivote;     
		   
		   if(izq < j-1)
		      quicksort(A,izq,j-1);         
		   if(j+1 < der)
		      quicksort(A,j+1,der);          
		}
	
	public static void merge(int A[],int izq, int m, int der){
		   int i, j, k;
		   int [] B = new int[A.length]; 
		   for (i=izq; i<=der; i++)                                            
		        B[i]=A[i];

		   i=izq; j=m+1; k=izq;
		     
		   while (i<=m && j<=der)                                      
		          if (B[i]<=B[j])
		              A[k++]=B[i++];
		          else
		              A[k++]=B[j++];
		        
		   while (i<=m)         
		         A[k++]=B[i++]; 
		}

}
