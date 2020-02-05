public class Heap {
    static void arrange_tree(int arr[],int len)
    {
        int i=len-1;
        int parent=0;
        while(i>0)
        {
            if(i%2!=0)
            {
                parent=i/2;
            }
            else
            {
                parent=(i-1)/2;
            }
            if(arr[parent]<arr[i])
            {
                int temp=arr[parent];
                arr[parent]=arr[i];
                arr[i]=temp;
            }
            i=parent;
        }
    }
    public static void main(String args[])
    {
        int data[]={10,20,6,5};
        int heap[]=new int[5];
        for(int i=0;i<4;i++)
        {
            heap[i]=data[i];
            arrange_tree(heap,i+1);
        }
        for(int i=0;i<4;i++)
        {
            System.out.print(heap[i]+" ");
        }
    }
}
