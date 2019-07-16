package ru.iokhin.tm.endpoint;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import ru.iokhin.tm.api.endpoint.IUserEndpoint;
import ru.iokhin.tm.api.service.IUserService;
import ru.iokhin.tm.exception.AuthException;
import ru.iokhin.tm.model.dto.UserDTO;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "ru.iokhin.tm.api.endpoint.IUserEndpoint")
public class UserEndpoint implements IUserEndpoint {

    @Autowired
    private IUserService userService;

    //THINK ABOUT IT
    @Override
    public UserDTO authUser(@NotNull String login, @NotNull String password) throws AuthException {
        return null;
    }

    @Override
    public UserDTO findByLogin(@NotNull String login) {
        return userService.findByLogin(login);
    }

    @Override
    public void persist(@NotNull UserDTO entity) {
        userService.persist(entity);
    }

    @Override
    public void merge(@NotNull UserDTO entity) {
        userService.merge(entity);
    }

    @Override
    public void removeById(@NotNull String id) {
        userService.removeById(id);
    }

    @Override
    public UserDTO findOne(@NotNull String id) {
        return userService.findOne(id);
    }

    @Override
    public List<UserDTO> findAll() {
        return userService.findAll();
    }
}
