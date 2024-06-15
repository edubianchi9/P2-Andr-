package br.unigran.Controller;

import br.unigran.entidades.Estoque;
import br.unigran.persistence.EstoqueDAO;

public class EstoqueController {
        private EstoqueDAO estoqueDAO;

        public EstoqueController() {
            estoqueDAO = new EstoqueDAO();
        }

        public void salvar(Estoque estoque) {
            estoqueDAO.salvar(estoque);
        }

        public Estoque buscarPorId(Long id) {
            return estoqueDAO.buscarPorId(id);
        }

        public void atualizar(Estoque estoque) {
            estoqueDAO.atualizar(estoque.getEstoqueAtual());
        }

        public void excluir(Long id) {
            estoqueDAO.excluir(id);
        }

        public void fechar() {
            estoqueDAO.fechar();
        }


}
