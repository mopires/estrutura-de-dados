using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace trabs_estrutura_isso
{
    class Program
    {
        static void Main(string[] args)
        {
            Nodo Arvore = new Nodo(5);
            for (int i = 0; i < 5; i++)
            {
                Arvore.Add(i);
            }

            Arvore.Mostrar();






        }
    }
}
