package emonets.backend.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class RegisterData {
    @NotEmpty(message = "username harus diisi")
    private String username;
    @NotEmpty(message = "email harus diisi")
    @Email(message = "format email tidak sesuai")
    private String email;
    @NotEmpty(message = "password harus diisi")
    private String password;
}
