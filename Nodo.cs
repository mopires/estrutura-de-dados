using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace trabs_estrutura_isso
{
    class Nodo
    {

        private int Info;
        private Nodo[] nodo;
        

        public Nodo(int Info)
        {
            this.Info = Info;
        }

        // chave é a referencia para o nodo anterior 
        // quando criar um novo nodo precisa ser verificado se a chave é menor que o anterior
        // se igual escolhe um lado. verificar a forma que são inserido os dados

        public void Mostrar()
        {

            for (int i = 0; i < nodo.Length; i++)
            {
                
            }

        }






    }
}
