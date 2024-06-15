package br.unigran.Controller;

import br.unigran.entidades.Validade;
import br.unigran.persistence.ValidadeDAO;

public class ValidadeController {
        private ValidadeDAO validadeDAO;

        public ValidadeController() {
            validadeDAO = new ValidadeDAO();
        }

        public void salvar(Validade validade) {
            validadeDAO.salvar(validade);
        }

        public Validade buscarPorId(Long id) {
            return validadeDAO.buscarPorId(id);
        }

        public void atualizar(Validade validade) {
            validadeDAO.atualizar(validade);
        }

        public void excluir(Long id) {
            validadeDAO.excluir(id);
        }

        public void fechar() {
            validadeDAO.fechar();
        }

}
