package inflearn.repository;

import inflearn.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MemoryMemberRepositoryTest {

    private MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    void setUp() {
        repository.clearStore();
    }


    @Test
    @DisplayName("저장_로직_테스트")
    void saveTest() {
        //given
        Member member = new Member();
        String name = "aksrua";
        member.setName(name);

        //when
        Member result = repository.save(member);

        //then
        assertThat(result).isEqualTo(member);
    }

    @Test
    @DisplayName("이름으로_찾기_로직_테스트")
    void findByName() {
        //given
        Member member1 = new Member();
        member1.setName("member1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("member1");
        repository.save(member2);

        //when
        Member result = repository.findByName("member1").get();

        //then
        assertThat(result).isEqualTo(member1);
    }

    @Test
    @DisplayName("전체_조회_로직_테스트")
    void findAll() {
        //given
        Member member1 = new Member();
        member1.setName("aksrua1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("aksrua2");
        repository.save(member2);

        //when
        List<Member> result = repository.findAll();

        //then
        assertThat(result.size()).isEqualTo(2);
    }
}