package br.unigran.Controller;

import br.unigran.entidades.Entrada;
import br.unigran.persistence.EntradaDAO;

public class EntradaController {
        private EntradaDAO entradaDAO;

        public EntradaController() {
            entradaDAO = new EntradaDAO();
        }

        public void salvar(Entrada entrada) {
            entradaDAO.salvar(entrada);
        }

        public Entrada buscarPorId(Long id) {
            return entradaDAO.buscarPorId(id);
        }

        public void atualizar(Entrada entrada) {
            entradaDAO.atualizar(entrada);
        }

        public void excluir(Long id) {
            entradaDAO.excluir(id);
        }

        public void fechar() {
            entradaDAO.fechar();
        }

}
