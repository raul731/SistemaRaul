/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.RtaUsuarios;
import bean.RtaVendas;
import bean.RtaVendasproduto;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author rafae
 */
public class RtaVendasProduto_DAO extends DAO_Abstract{

     public Object listProdutos(RtaVendas vendas) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(RtaVendasproduto.class);
        criteria.add(Restrictions.eq("rtaVendas", vendas));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
     
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
Criteria criteria = session.createCriteria(RtaVendasproduto.class);
criteria.add(Restrictions.eq("idrtaVendasProduto", codigo));                // seria o msm que select * (tudo) from usuarios
List lista = criteria.list();
session.getTransaction().commit();
return lista.get(0);
}
@Override
public ArrayList listAll() {
session.beginTransaction();
Criteria criteria = session.createCriteria(RtaVendasproduto.class);
List lista = criteria.list();                                   //seria o msm que chamar o select where id
session.getTransaction().commit();
return (ArrayList) lista;
}

    
}
