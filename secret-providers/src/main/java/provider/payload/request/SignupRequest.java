package provider.payload.request;

import lombok.Data;
import provider.entity.ERole;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Data
public class SignupRequest {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @Email
    private String email;

    private Set<String> role;
}
