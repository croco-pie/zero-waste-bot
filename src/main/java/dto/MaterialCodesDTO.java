package dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import persistence.entities.v1.MaterialCodes;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class MaterialCodesDTO {

//    public MaterialCodes findById(UUID id) {
//        return HibernateSessionFactoryUtil.getSessionFactory().get(MaterialCodes.class, id);
//    }

    public List<MaterialCodes> findAll() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query<MaterialCodes> query = session.createQuery("From MaterialCodes");
        List<MaterialCodes> materialCodes = query.getResultList();
//        List materialCodes = session.createSQLQuery("select * from material_codes").getResultList();
        session.close();
        return materialCodes;
    }

    public void addMaterialCode(String code) {
        SessionFactory sessionFactory = HibernateSessionFactoryUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        MaterialCodes materialCodes = new MaterialCodes();
        session.save(materialCodes);
        session.close();
    }
}
