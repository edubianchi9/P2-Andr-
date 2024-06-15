package br.unigran.Controller;

import br.unigran.entidades.Funcionario;
import br.unigran.persistence.FuncionarioDAO;

public class FuncionarioController {
        private FuncionarioDAO funcionarioDAO;

        public FuncionarioController() {
            funcionarioDAO = new FuncionarioDAO();
        }

        public Funcionario buscarPorLoginESenha(String login, String senha) {
            return funcionarioDAO.buscarPorLoginESenha(login, senha);
        }

        public void salvar(Funcionario funcionario) {
            funcionarioDAO.salvar(funcionario);
        }

        public Funcionario buscarPorId(String id) {
            return funcionarioDAO.buscarPorId(Long.valueOf(id));
        }

        public void atualizar(Funcionario funcionario) {
            funcionarioDAO.atualizar(funcionario);
        }

        public void excluir(Long id) {
            funcionarioDAO.excluir(id);
        }

        public void fechar() {
            funcionarioDAO.fechar();
        }

    public Funcionario[] buscarTodos() {
        return new Funcionario[0];
    }
}
