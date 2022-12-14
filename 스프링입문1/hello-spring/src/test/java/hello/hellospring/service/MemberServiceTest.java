package hello.hellospring.service;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

  @Test
  void join() {
    // given
    Member member = new Member();
    member.setName("hello");
    // when

    Long saveId = memberService.join(member);

    // then
    Member findeMember = memberService.findeOnd(saveId).get();
    Assertions.assertThat(member.getName()).isEqualTo(findMember.getName());

  }

  @Test
  void findMembers() {
  }

  @Test
  void findOne() {
  }
}