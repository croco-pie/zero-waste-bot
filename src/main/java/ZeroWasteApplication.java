import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.databind.ObjectWriter;
import persistence.entities.v1.MaterialCodes;
import services.MaterialCodesService;

import java.util.List;

public class ZeroWasteApplication {

    public static void main(String[] args) throws JsonProcessingException {

        System.out.println("Service is starting...");

        MaterialCodesService materialCodesService = new MaterialCodesService();
        List<MaterialCodes> materialCodes = materialCodesService.findAllMaterialCodes();

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(materialCodes);

        System.out.println(json);

//        Example example =  new Example(17, "example123");
//        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
//
//        try {
//            session.beginTransaction();
//
//            session.save(example);
//            session.getTransaction().commit();
//        } catch (Exception e) {
//            session.getTransaction().rollback();
//            e.printStackTrace();
//        }
//
//        Query<Example> query = session.createQuery("From Example");
//        List<Example> result = query.list();
//        System.out.println(result.get(4).getName());
//
//        session.close();



//        MaterialCodesDAO materialCodesDAO = new MaterialCodesDAO();
//        materialCodesDAO.findAll();
//        System.out.println(materialCodesDAO.findAll());
//        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//
//        UUID uuid = UUID.randomUUID();
//        MaterialCodes materialCodes = new MaterialCodes(uuid, "22");
//
//        session.save(materialCodes);
//        session.getTransaction().commit();
//
//        session.close();

    }

}
