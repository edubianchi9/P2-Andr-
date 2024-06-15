package br.unigran.Controller;

import br.unigran.entidades.Produto;
import br.unigran.persistence.ProdutoDAO;

public class ProdutoController {
        private ProdutoDAO produtoDAO;

        public ProdutoController() {
            produtoDAO = new ProdutoDAO();
        }

        public void salvar(Produto produto) {
            produtoDAO.salvar(produto);
        }

        public Produto buscarPorId(Long id) {
            return produtoDAO.buscarPorId(id);
        }

        public void atualizar(Produto produto) {
            produtoDAO.atualizar(produto);
        }

        public void excluir(Long id) {
            produtoDAO.excluir(id);
        }

        public void fechar() {
            produtoDAO.fechar();
        }

    public Produto[] buscarTodos() {
        return new Produto[0];
    }
}
