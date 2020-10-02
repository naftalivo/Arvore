/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

/**
 *
 * @author
 */
public class Arvore {

    private No raiz;

    /**
     * metodo publico atraves do qual introduz-se o novo objecto
     *
     * @param object
     */
    public void adicionar(int object) {
        if (pesquisar(object)) {
            System.out.println("No Ja Existe");
        } else {
            adicionar(raiz, object);
        }
    }

    /**
     * metodo private que adiciona um novo objecto mediante a comparacao da
     * idades
     *
     * @param novo
     * @param object
     */
    private void adicionar(No novo, int object) {

        if (raiz == null) {
            raiz = new No(object);
        } else {
            if (object < novo.getInt()) {
                if (novo.getEsquerda() != null) {
                    adicionar(novo.getEsquerda(), object);
                } else {
                    novo.setEsquerda(new No(object));
                }

            } else {
                if (novo.getDireita() != null) {
                    adicionar(novo.getDireita(), object);
                } else {
                    novo.setDireita(new No(object));
                }

            }
        }
    }

    public void PreOrder() {
        PreOrder(raiz);
    }

    public void InOrder() {
        InOrder(raiz);
    }

    public void PostOrder() {
        PostOrder(raiz);
    }

    private void PreOrder(No no) {
        if (no != null) {
            System.out.println(no.getInt());
            PreOrder(no.getEsquerda());
            PreOrder(no.getDireita());
        }
    }

    private void PostOrder(No no) {
        if (no != null) {
            PostOrder(no.getEsquerda());
            PostOrder(no.getDireita());
            System.out.println(no.getInt());
        }
    }

    public void InOrder(No no) {
        if (no != null) {
            InOrder(no.getEsquerda());
            System.out.println(no.getInt());
            InOrder(no.getDireita());
        }
    }

    /**
     * Metodo para pesquisar idade
     *
     * @param idade
     * @return
     */
    public boolean pesquisar(int idade) {
        if (pesquisarObject(raiz, idade) == null) {
            return false;
        }

        return true;
    }

    /**
     * Metodo chamado para no existe na arvore
     *
     * @param no
     * @param idade
     * @return
     */
    private No pesquisarObject(No no, int idade) {
        if (no != null) {
            if (idade == no.getInt()) {
                return no;
            }

            if (idade > no.getInt()) {
                return pesquisarObject(no.getDireita(), idade);
            }

            if (idade < no.getInt()) {
                return pesquisarObject(no.getEsquerda(), idade);
            }

        }
        return no;
    }

    /**
     * Metodo para remover No
     *
     * @param object
     */
    public void remover(int object) {
        if (!pesquisar(object)) {
            System.out.println("Nao existe");
        } else {
            No no = pesquisarObject(raiz, object);
            removerNo(raiz, no);

        }
    }

    private void removerNo(No no, No noARemover) {
        /**
         * Verifica se elemento encontra-se a esquerda ou direia
         */
        if (noARemover.getInt() > no.getInt()) {
            /**
             * Verifica se o no que esta a direita eh o que deve ser removidp
             */
            if (no.getDireita().equals(noARemover)) {
                No aux = null;
                /**
                 * Verifica se o no a remover tem filho a direita
                 */
                if (noARemover.getDireita() != null) {
                    aux = getMaisAEsquerda(noARemover.getDireita());
                    aux.setEsquerda(noARemover.getEsquerda());
                    no.setDireita(noARemover.getDireita());
                } else {
                    /**
                     * Verifica se tem filho a esquerda
                     */
                    if (noARemover.getEsquerda() != null) {
                        no.setDireita(noARemover.getEsquerda());
                    } else // No eh uma folha
                    {
                        no.setDireita(noARemover.getDireita());
                    }

                }
            } else // chama o metodo novamente continuando a direira
            {
                removerNo(no.getDireita(), noARemover);
            }

        } else { // elemento encontra-se a esquerda
            /**
             * Verifica se o no que esta a esquerda eh o que deve ser removidp
             */
            if (no.getEsquerda().equals(noARemover)) {
                No aux = null;

                /**
                 * Verifica se o no a remover tem filho a direita
                 */
                if (noARemover.getDireita() != null) {
                    aux = getMaisAEsquerda(noARemover.getDireita());
                    aux.setEsquerda(noARemover.getEsquerda());
                    no.setEsquerda(noARemover.getDireita());
                } else {
                    /**
                     * Verifica se o no a remover tem filho a esquerda
                     */
                    if (noARemover.getEsquerda() != null) {
                        no.setDireita(noARemover.getEsquerda());
                    } else // No a remover eh folha
                    {
                        no.setEsquerda(noARemover.getDireita());
                    }

                }
            } else {
                removerNo(no.getEsquerda(), noARemover);
            }

        }

    }

    /**
     * Metodo para retornar o no mais a esquerda da subarvore a direita do no a
     * ser removido
     *
     * @param no
     * @return
     */
    private No getMaisAEsquerda(No no) {
        No aux = no;

        if (aux.getEsquerda() != null) {
            return getMaisAEsquerda(no.getEsquerda());
        }

        return aux;
    }

}
