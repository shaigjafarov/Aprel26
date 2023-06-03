package az.coders.chapter1.lesson11;

import java.util.List;

public enum RoleEnum {
    ADMIN(List.of("main", "login", "userControl")) , USER (List.of("login")), DEVELOPER(List.of( "all_page"));

    List<String> accessPages;
    RoleEnum(List<String> accessPages) {
        this.accessPages=accessPages;
    }
}
