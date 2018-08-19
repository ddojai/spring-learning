package io.ddojai.webboard.persistence;

import io.ddojai.webboard.domain.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, String> {

}
