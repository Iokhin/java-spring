package ru.iokhin.tm.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.iokhin.tm.enumerated.RoleEnum;
import ru.iokhin.tm.model.entity.AbstractEntity;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO extends AbstractEntity {

    @Nullable
    private String login;

    @Nullable
    private String email;

    @Nullable
    private String password;

    @Nullable
    private RoleEnum role;

    public UserDTO(@Nullable String login, @Nullable String password, @Nullable RoleEnum role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public UserDTO(@NotNull String id, @Nullable String login, @Nullable String password, @Nullable RoleEnum role) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.role = role;
    }

}
