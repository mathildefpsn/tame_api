package tame.api.users.repositories.impl;

import tame.api.users.models.User;
import tame.api.users.repositories.UsersRepository;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
public class UsersRepositoryImp implements UsersRepository {

    @PersistenceContext
    private EntityManager entityManager;

//    @Override
//    public User save(String name) {
//        User user = new User();
//        entityManager.persist(user);
//        return user;
//    }
}
