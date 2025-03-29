package src.estudos.lists.operacoes_basicas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
    private List<Tarefa> tarefaList;

    public ListaDeTarefas(){
        this.tarefaList = new ArrayList<>();
    }

      public void adicionarTarefa(String descricao){
          tarefaList.add(new Tarefa(descricao));
      }

      public void removerTarefa(String descricao){
          List<Tarefa>  tarefasParaRemover = new ArrayList<>();
          for (Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
          }
          tarefaList.removeAll(tarefasParaRemover);
      }

      public int obterNumeroTotalTarefas(){
          return  tarefaList.size();
      }

      public void obterDescricoesTarefas(){
          System.out.println(tarefaList);
      }

    public static void main(String[] args) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();

        System.out.println("O número total de elementos na lista é: "+listaDeTarefas.obterNumeroTotalTarefas());

        listaDeTarefas.adicionarTarefa("Tarefa 1");
        listaDeTarefas.adicionarTarefa("Tarefa 1");
        listaDeTarefas.adicionarTarefa("Tarefa 2");

        System.out.println("O número total de elementos na lista é: "+listaDeTarefas.obterNumeroTotalTarefas());

        listaDeTarefas.removerTarefa("Tarefa 1");

        System.out.println("O número total de elementos na lista é: "+listaDeTarefas.obterNumeroTotalTarefas());

        listaDeTarefas.obterDescricoesTarefas();
    }

}
