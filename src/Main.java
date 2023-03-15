import java.util.ArrayList;
import java.util.LinkedList;

// Java Collections Framework
/* É um conjunto bem definido de interfaces e classes, para
representar e tratar grupos de dados como uma única "unidade."

Collection > Interface principal da hierarquia
    Set -> Interface que define uma coleção que não
    permite elementos duplicados.
    List -> define uma coleção ordenada, podendo conter
    elementos duplicados.
        * ArrayList: é como um array cujo tamanho pode ir crescendo,
         permite uma busca rápida dentro do array, porém as inclusões
         e exclusoes são lineares
        * LinkedList -> implementa uma lista "ligada", ou seja, cada
         nó contém o dado e uma referencia para o proximo nó. A busca
         é mais lenta, porém incluir ou excluir dados é mais rápido
 */
public class Main {
    public static void main(String[] args) {
        // Criação da lsit. Não há necessidade de se definir
        // inicialmente o tamanho total da lista
        /* LinkedList<String> nomesLinked = new LinkedList<String>();

        nomesLinked.add("Igor");
        nomesLinked.add("Thais");
        nomesLinked.add("David");
        nomesLinked.add("Monica");
        nomesLinked.add("Rodrigo");
        nomesLinked.add("Anderson");

        System.out.println(nomesLinked.get(3));

        nomesLinked.add(1, "Helio");
        System.out.println(nomesLinked.get(0));
        System.out.println(nomesLinked.get(6));
        */
        ArrayList<String> nomesArray = new ArrayList<String>();

        nomesArray.add("Luiza");
        nomesArray.add("Marcos");
        nomesArray.add("Andrea");
        nomesArray.add("Pedro");

        //System.out.println(nomesArray.get(1));
        nomesArray.add(1,"Zeca");

        for (String lista : nomesArray){
            System.out.println(lista);
        }




    }
}