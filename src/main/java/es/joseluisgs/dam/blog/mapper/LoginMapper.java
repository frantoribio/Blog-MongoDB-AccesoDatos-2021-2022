package es.joseluisgs.dam.blog.mapper;

import es.joseluisgs.dam.blog.model.Login;
import es.joseluisgs.dam.blog.dto.LoginDTO;

public class LoginMapper extends BaseMapper<Login, LoginDTO> {
    @Override
    public Login fromDTO(LoginDTO item) {
        Login login = new Login();
        login.setId(item.getId());
        login.setUltimoAcceso(item.getUltimoAcceso());
        login.setToken(item.getToken());
        return login;
    }

    @Override
    public LoginDTO toDTO(Login item) {
        return LoginDTO.builder()
                .id(item.getId())
                .ultimoAcceso(item.getUltimoAcceso())
                .token(item.getToken())
                .build();
    }
}
