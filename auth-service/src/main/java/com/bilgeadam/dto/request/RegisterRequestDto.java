package com.bilgeadam.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterRequestDto {

    @NotBlank(message = "Kullanıcı adını boş bırakamazsınız")
    @Size(min = 3, max = 20, message = "Kullanıcı adı en az 3 en fazla 20 karakter olabilir.")
    private String username;
    @Email(message = "Geçerli bir email adresi giriniz.")
    @NotBlank(message = "Email adresini boş bırakamazsınız")
    private String email;
    @NotBlank(message = "Şifre boş bırakılamaz")
    @Size(min = 8,max = 32,message = "Şifre en az 8 en çok 32 karekter olmalıdır.")
    private String password;
    private String repassword;

}
