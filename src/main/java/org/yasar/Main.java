package org.yasar;

import org.yasar.entidad.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("usuarioPU");
        EntityManager em = emf.createEntityManager();

        //Crear Usuario
//        Usuario usuario = new Usuario();
//        usuario.setNombre("Diego");
//        usuario.setApellido("Gonzalez");
//        usuario.setDocumento(123456789);
//        usuario.setDireccion("Calle falsa 123");

//        em.getTransaction().begin();
//        em.persist(usuario);
//        em.getTransaction().commit();


        //Mostrar Usuario
//        Usuario usuario = em.find(Usuario.class, 7);
//        System.out.println(usuario);

//        try {
//        Usuario usuario = em.find(Usuario.class, 12);
//        System.out.println(usuario);
//        }catch (Exception e){
//            throw e;
//        }

        //Mostrar Lista
//        List usuarios = em.createQuery("SELECT u FROM Usuario u").getResultList();
//        for (Object usuario : usuarios) {
//            System.out.println(usuario);
//        }


        //Eliminar Usuario
////Usamos el método find para buscar el alumno a borrar
//        Alumno alumno = em.find(Alumno.class,1234);
//        em.getTransaction().begin();
////Borramos el alumno
//        em.remove(alumno);
//        em.getTransaction().commit();

//        Usuario usuario = em.find(Usuario.class,12);
//        em.getTransaction().begin();
//        em.remove(usuario);
//        em.getTransaction().commit();


        //Actualizar Usuario
//        Usuario usuario = em.find(Usuario.class,12);
//        em.getTransaction().begin();
//        usuario.setApellido("Veras");
//        em.merge(usuario);
//        em.getTransaction().commit();
//        List<Usuario> usuarios = em.createQuery("SELECT u FROM Usuario u where u.nombre LIKE '%Diego%'").getResultList();
        List<Usuario> usuarios = em.createQuery("SELECT u FROM Usuario u where u.id LIKE '1%'").getResultList();
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }

        em.close();

    }
}
