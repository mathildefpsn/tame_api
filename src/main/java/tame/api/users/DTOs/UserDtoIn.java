package tame.api.users.DTOs;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
public class UserDtoIn {

    private String email;
    private String pseudo;
    private String password;
    private String phoneNumber;
    private Date birthDate;
    private Integer ageMax;
    private Integer ageMin;
    private Integer distance;
    private Integer matchesNumber;
    private Integer beenLikedNumber;
    private Integer beenDislikedNumber;
    private Integer didLikeNumber;
    private Integer didDislikeNumber;
    private String description;
    private String city;

}
