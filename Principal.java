public class Principal{
    public static void main(String[] args){
        //EXERCÍCIO 1
        //  a)
        int[] a = new int[10];
        for(int i=0; i<a.length; i++){
            a[i] = a.length-i;
            System.out.println("posição a"+i+" = "+a[i]);
        }
        System.out.println(" ");
        //  b)
        int[] b = new int[11];
        for(int i=0; i<b.length; i++){
            b[i] = i*i;
            System.out.println("posição b"+i+" = "+b[i]);
        }
        System.out.println(" ");
        //  c)
        int[] c = new int[10];
        for(int i=0; i<c.length; i++){
            if(i<5)
                c[i] = i+1;
            else if(i==5)
                c[i] = 10;
            else
                c[i] = c[i-1]+10;
            System.out.println("posição c"+i+" = "+c[i]);
        }
        System.out.println(" ");
        //  d)
        int[] d = new int[10];
        int x = 1;
        for(int i=0; i<d.length; i++){
            if(i==0)
                d[i] = 3;
            else{
                d[i] = d[i-1] + x;
                x += 2;
            }
            System.out.println("posição d"+i+" = "+d[i]);
        }
        System.out.println(" ");
        
        // EXERCÍCIOS 2-9
        Exercicio e = new Exercicio();
        
        // EXERCÍCIO 2 - PRÁTICA
        double[] a2 = {3.2, 54.2, 6.43, 693.2, 44.444, 7.2};
        e.exibeDoubleArray(a2);
        
        // EXERCÍCIO 3 - PRÁTICA
        double[] a3 = new double[Teclado.leInt("Qual o tamanho do array?")];
        a3 = e.armazenaDoubleArray(a3);
        e.exibeDoubleArray(a3);
        
        // EXERCÍCIO 4 & 8 - PRÁTICA
        int[] a4 = e.lerArray();
        System.out.println("O array possui "+e.retornaNegativo(a4)+" números negativos");
        
        // EXERCÍCIO 5 - PRÁTICA
        x = Teclado.leInt("Informe o número que deseja procurar no array:");
        System.out.println("O número "+x+" apareceu "+e.apareceuOuNao(a4, x)+" vezes no array.");
                
        // EXERCÍCIO 6 - PRÁTICA
        boolean[] v = e.maquinaDaVerdade(a4);
        for(int i=0; i<v.length; i++){
            if(v[i])
                System.out.println("Positivo");
            else
                System.out.println("Negativo");
        }
        
        // EXERCÍCIO 7 - PRÁTICA
        System.out.println("A posição onde está o número maior do array é a "+e.maiorValor(a4));
        
        // EXERCÍCIO 9 - PRÁTICA
        int[] a9 = e.listaInteiros(a4);
        for(int i=0; i<a9.length; i++){
            if(a9[i]==1)
                System.out.print("par ");
            else
                System.out.print("ímpar ");
        }
        
    }
}