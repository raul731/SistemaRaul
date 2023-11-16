/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.RtaProdutos;
import bean.RtaProdutos;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Usuario
 */
public class RtaProduto_DAO extends DAO_Abstract{
   @Override
    public void insert(Object object) {
      session.beginTransaction();
      session.save(object);
      session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
      session.beginTransaction();
      session.flush();                    //serve pra não atualiza antes da operação em si Clear limpa a memória do hibernate
      session.clear();                  // Flush obriga o hibernate a escrever os dados no disco ouno Banco de dados.
      session.update(object);
      session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
      session.beginTransaction();
       session.clear();
      session.update(object);
      session.delete(object);
      session.getTransaction().commit();
    }

    @Override
    public Object list(int codigo) {
session.beginTransaction();
Criteria criteria = session.createCriteria(RtaProdutos.class);
criteria.add(Restrictions.eq("idRtaProdutos", codigo));                // seria o msm que select * (tudo) from RtaProduto
List lista = criteria.list();
session.getTransaction().commit();
return lista.get(0);
}
@Override
public ArrayList listAll() {
session.beginTransaction();
Criteria criteria = session.createCriteria(RtaProdutos.class);
List lista = criteria.list();                                   //seria o msm que chamar o select where id
session.getTransaction().commit();
return (ArrayList) lista;
}
 public List listNome(String nome){
        
         session.beginTransaction();
    Criteria crit = session.createCriteria(RtaProdutos.class);
crit.add(Restrictions.like("rtaNome", "%"+nome+"%"));
List lista = crit.list();
  session.getTransaction().commit();
return lista;
    
    }
    public List listValor(double valor){

         session.beginTransaction();
    Criteria crit = session.createCriteria(RtaProdutos.class);
crit.add(Restrictions.gt("rtaValor",new Double(valor)));
List lista = crit.list();
  session.getTransaction().commit();
return lista;
    
    }
      public List listNomeValor(double valor, String nome){
        
         session.beginTransaction();
    Criteria crit = session.createCriteria(RtaProdutos.class);
    crit.add(Restrictions.gt("rtaValor",new Double(valor)));
    crit.add(Restrictions.like("rtaNome", "%"+nome+"%"));

List lista = crit.list();
  session.getTransaction().commit();
return lista;
    
    }
}
 

