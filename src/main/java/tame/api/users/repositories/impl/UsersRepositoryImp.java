package tame.api.users.repositories.impl;

import tame.api.users.DTOs.UserDtoIn;
import tame.api.users.models.User;
import tame.api.users.repositories.UsersRepository;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@Singleton
public class UsersRepositoryImp implements UsersRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<User> findById(@NotNull Long id) {
        return Optional.empty();
    }

    @Override
    public User save(@NotBlank UserDtoIn user) {
        return null;
    }

    @Override
    public void deleteById(@NotNull Long id) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public int update(@NotNull Long id, @NotBlank UserDtoIn user) {
        return 0;
    }

}
