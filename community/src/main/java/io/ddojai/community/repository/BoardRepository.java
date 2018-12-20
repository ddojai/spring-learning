package io.ddojai.community.repository;

import io.ddojai.community.domain.Board;
import io.ddojai.community.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByUser(User user);
}
