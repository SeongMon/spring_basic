package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public interface MemberRepository {

    void save(Member member);
    Member findById(Long memberId);
}
