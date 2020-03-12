package tame.api.users.repositories.impl;

import io.micronaut.context.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import io.micronaut.context.env.*;


import org.mockito.junit.jupiter.MockitoExtension;
import tame.api.users.DTOs.UserDtoIn;
import tame.api.users.models.User;

import javax.inject.Inject;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@ExtendWith(MockitoExtension.class)

public class UsersRepositoryImplTest {

    private static final UsersRepositoryImp usersRepositoryImpl = new UsersRepositoryImp();

    ApplicationContext applicationContext = ApplicationContext.run("test");
    Environment environment = applicationContext.getEnvironment();

    @Test
    public void save_should_be_created_on_db() {

        UserDtoIn userDtoIn = new UserDtoIn();
        userDtoIn.setEmail("test@test.fr");
        userDtoIn.setPseudo("test pseudo");
        userDtoIn.setPassword("super test password");
        userDtoIn.setAgeMax(90);
        userDtoIn.setAgeMin(80);
        userDtoIn.setPhoneNumber("065235648987");
        userDtoIn.setCity("Bordeaux");
        userDtoIn.setBirthDate(new Date());
        userDtoIn.setDistance(15);
        userDtoIn.setBeenDislikedNumber(0);
        userDtoIn.setBeenLikedNumber(0);
        userDtoIn.setDidLikeNumber(0);
        userDtoIn.setDidDislikeNumber(0);

        User user = usersRepositoryImpl.save(userDtoIn);

        assertTrue(user != null);
    }

}
