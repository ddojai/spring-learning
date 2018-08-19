package io.ddojai.webboard.security;

import io.ddojai.webboard.domain.Member;
import io.ddojai.webboard.domain.MemberRole;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ZerockSecurityUser extends User {

    private static final String ROLE_PREFIX = "ROLE_";

    private Member member;

    public ZerockSecurityUser(Member member) {
        super(member.getUid(), member.getUpw(), makeGrantedAuthority(member.getRoles()));
    }

    private static List<GrantedAuthority> makeGrantedAuthority(List<MemberRole> roles) {
        List<GrantedAuthority> list = new ArrayList<>();

        roles.forEach(role -> list.add(new SimpleGrantedAuthority(ROLE_PREFIX + role.getRoleName())));

        return list;
    }
}
