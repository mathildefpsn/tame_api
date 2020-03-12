package tame.api.users.repositories;

import tame.api.users.DTOs.UserDtoIn;
import tame.api.users.models.User;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

public interface UsersRepository {


    Optional<User> findById(@NotNull Long id);

    User save(@NotBlank UserDtoIn user);

    void deleteById(@NotNull Long id);

    List<User> findAll();

    int update(@NotNull Long id, @NotBlank UserDtoIn user);
}
