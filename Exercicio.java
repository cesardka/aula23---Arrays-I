public class Exercicio{
    // EXERCÍCIO 2
    public void exibeDoubleArray(double[] array){
        for(int i=0; i<array.length; i++)
            System.out.println("Linha "+(i+1)+": "+array[i]+", ");
    }
    
    // EXECÍCIO 3
    public double[] armazenaDoubleArray(double[] array){
        for(int i=0; i<array.length; i++){
            array[i] = Teclado.leDouble("Informe o double "+(i+1)+": ");
        }
        return array;
    }
    
    // EXERCÍCIO 4
    public int retornaNegativo(int[] array){
        int neg = 0;
        for(int i=0; i<array.length; i++){
            if(array[i]<0)
                neg++;
        }
        return neg;
    }
    
    // EXERCÍCIO 5;
    public int apareceuOuNao(int[] array, int x){
        int apareceu = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] == x)
                apareceu++;
        }
        return apareceu;
    }
    
    // EXERCÍCIO 6
    public boolean[] maquinaDaVerdade(int[] array){
        boolean[] correnteDeVerdades = new boolean[array.length];
        for(int i=0; i<array.length; i++){
            if(array[i]<0)
                correnteDeVerdades[i] = false;
            else
                correnteDeVerdades[i] = true;
        }
        return correnteDeVerdades;
    }
    
    // EXERCÍCIO 7
    public int maiorValor(int[] array){
        int maior = 0;
        for(int i=0; i<array.length; i++){
            if(i==0)
                maior = i;
            else{
                if(array[i]>array[i-1])
                    maior = i;
            }
        }
        return maior;
    }
    
    // EXERCÍCIO 8
    public int[] lerArray(){
        int[] num = new int[Teclado.leInt("Qual o tamanho do array?")];
        for(int i=0; i<num.length; i++)
            num[i] = Teclado.leInt("Informe o número "+(i+1)+": ");
        return num;
    }
    
    // EXERCÍCIO 9
    public int[] listaInteiros(int[] array){
        int[] b = new int[array.length];
        for(int i=0; i<array.length; i++){
            if(array[i]%2==0)
                b[i] = 1;
            else
                b[i] = -1;
        }
        return b;
    }
}