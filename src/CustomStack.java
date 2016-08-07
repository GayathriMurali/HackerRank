class CustomStack
{
     int[] data = new int[10];
     MaxStack[] max = new MaxStack[10];
     int top=-1;
     int index=-1;
     int maximum = Integer.MIN_VALUE;
     public void push(int i)
     {
         if(top==data.length-1 || index==max.length-1)
         {
           System.out.println("Stack overflow");
           return;
          }
         data[++top]=i;
         if(index<0)
         {
            max[++index] = new MaxStack(i,1);
         }
          else
          {
              if(max[index].element < i )
              {
                 max[++index] = new MaxStack(i,1);
               }
               else
               if(max[index].element ==i)
                   max[index].count++;
           }
         
     }
     public int pop()
     {
        if(top < 0)
        {
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }
        max[index].count--;
        if(max[index].count==0)
           index--;
        return data[top--];
     }
     public int getmax()
     {
        if(index<0)
        {
           System.out.println("Stack empty");
           return Integer.MIN_VALUE;
         }
         return max[index].element;
     }
     
}