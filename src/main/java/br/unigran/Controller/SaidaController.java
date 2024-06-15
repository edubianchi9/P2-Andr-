package br.unigran.Controller;

import br.unigran.entidades.Saida;
import br.unigran.persistence.SaidaDAO;

public class SaidaController {
        private SaidaDAO saidaDAO;

        public SaidaController() {
            saidaDAO = new SaidaDAO();
        }

        public void salvar(Saida saida) {
            saidaDAO.salvar(saida);
        }

        public Saida buscarPorId(Long id) {
            return saidaDAO.buscarPorId(id);
        }

        public void atualizar(Saida saida) {
            saidaDAO.atualizar(saida);
        }

        public void excluir(Long id) {
            saidaDAO.excluir(id);
        }

        public void fechar() {
            saidaDAO.fechar();
        }


}
