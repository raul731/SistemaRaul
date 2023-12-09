/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.RtaUsuarios;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u05074221129
 */
public class RtaUsuarios_DAO extends DAO_Abstract{

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
Criteria criteria = session.createCriteria(RtaUsuarios.class);
criteria.add(Restrictions.eq("idrtausuarios", codigo));                // seria o msm que select * (tudo) from usuarios
List lista = criteria.list();
session.getTransaction().commit();
return lista.get(0);
}
@Override
public ArrayList listAll() {
session.beginTransaction();
Criteria criteria = session.createCriteria(RtaUsuarios.class);
List lista = criteria.list();                                   //seria o msm que chamar o select where id
session.getTransaction().commit();
return (ArrayList) lista;
}
 public List listNome(String nome){
        
         session.beginTransaction();
    Criteria crit = session.createCriteria(RtaUsuarios.class);
crit.add(Restrictions.like("rtaNome", "%"+nome+"%"));
List lista = crit.list();
  session.getTransaction().commit();
return lista;
    
    }
     public List listData(Date data) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(RtaUsuarios.class);
        criteria.add(Restrictions.eq("rtaDataNascimento", data));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listNomeData(String nome, Date data) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(RtaUsuarios.class);
        criteria.add(Restrictions.like("rtaNome", "%" + nome + "%"));
        criteria.add(Restrictions.eq("rtaDataNascimento", data));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public RtaUsuarios login(String usuarios, String senha){
    session.beginTransaction();
    Criteria criteria = session.createCriteria(RtaUsuarios.class);
    criteria.add(Restrictions.eq("drfNome", usuarios));
    criteria.add(Restrictions.eq("drfSenha", senha));
    RtaUsuarios usuarioAprovado = (RtaUsuarios) criteria.uniqueResult();
    session.getTransaction().commit();
        return usuarioAprovado;
    }
}
