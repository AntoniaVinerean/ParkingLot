package com.parkinglot.parkinglot.ejb;
import com.parkinglot.parkinglot.common.UserDto;
import com.parkinglot.parkinglot.entities.User;
import jakarta.ejb.EJBException;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Stateless

public class UserBean {
    private static final Logger LOG = Logger.getLogger(UserBean.class.getName());

    @PersistenceContext
    EntityManager entityManager;

    public List<UserDto> findAllUsers(){
        LOG.info("findAllUsers");
        try{
            TypedQuery<User> typedQuery= entityManager.createQuery("SELECT u FROM User u", User.class );
            List<User> users = typedQuery.getResultList();
            List<UserDto> userDtos = new ArrayList<>();
            for(User user:users){
                userDtos.add(new UserDto(
                        user.getId(),
                        user.getUsername(),
                        user.getEmail()
                ));
            }
            return userDtos;
        } catch (Exception ex) {
            throw new EJBException(ex);
        }
    }
}
