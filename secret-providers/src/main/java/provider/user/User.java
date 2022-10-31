package provider.user;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Data
@EqualsAndHashCode
@ToString
public class User {

    private Long id;

    private String username;

    private String email;

    private String password;

    private List<Role> roles;
}
