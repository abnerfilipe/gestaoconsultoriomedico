package Models;

public class Medico {

  private String nome;
  private String especialidade;
  private String CRM;

  public Medico() {
    super();
  }
  public Medico(String nome, String especialidade, String CRM) {
    super();
    this.nome = nome;
    this.especialidade = especialidade;
    this.CRM = CRM;
  }
  /**
   * @return String return the nome
   */
  public String getNome() {
      return nome;
  }
  /**
   * @param nome the nome to set
   */
  public void setNome(String nome) {
      this.nome = nome;
  }

  /**
   * @return String return the especialidade
   */
  public String getEspecialidade() {
      return especialidade;
  }

  /**
   * @param especialidade the especialidade to set
   */
  public void setEspecialidade(String especialidade) {
      this.especialidade = especialidade;
  }

  /**
   * @return String return the CRM
   */
  public String getCRM() {
      return CRM;
  }

  /**
   * @param CRM the CRM to set
   */
  public void setCRM(String CRM) {
      this.CRM = CRM;
  }
}
