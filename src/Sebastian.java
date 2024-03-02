public class Sebastian {
    
    public static void main(String[] args) {
        
        int li_numeroMayor = 10; 
        int li_numeroAnterior = 0;
        int li_numeroSiguiente = 1;
           System.out.print("Serie de Fibonacci para "+li_numeroMayor+" numeros");
           for (int i = 1; i <= li_numeroMayor; ++i)
           {
               System.out.print(li_numeroAnterior+" ");

         
               int li_sum = li_numeroAnterior + li_numeroSiguiente;
               li_numeroAnterior = li_numeroSiguiente;
               li_numeroSiguiente = li_sum;
           }
    }
}
