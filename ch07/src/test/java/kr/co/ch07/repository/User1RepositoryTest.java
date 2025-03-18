package kr.co.ch07.repository;

import kr.co.ch07.entity.Child;
import kr.co.ch07.entity.Parent;
import kr.co.ch07.entity.User1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class User1RepositoryTest {

    @Autowired
    private User1Repository user1Repository;


    @Test
    void findUser1ByUid() {

        //given
        String uid = "a101";

        //when
        User1 user1 = user1Repository.findUser1ByUid(uid);

        //then
        System.out.println(user1);
    }

    @Test
    void findUser1ByName() {

        List<User1> user1List = user1Repository.findUser1ByName("홍길동");
        System.out.println(user1List);
    }

    @Test
    void findUser1ByNameNot() {
        List<User1> user1List = user1Repository.findUser1ByNameNot("홍길동");
        System.out.println(user1List);
    }

    @Test
    void findUser1ByUidAndName() {
        // given
        String uid = "a101";
        String name = "홍길동";

        // when
        User1 user1 = user1Repository.findUser1ByUidAndName(uid, name);

        // then
        System.out.println(user1);
    }

    @Test
    void findUser1ByUidOrName() {
        // given
        String uid = "a101";
        String name = "이순신";

        // when
        List<User1> user1List = user1Repository.findUser1ByUidOrName(uid, name);

        // then
        System.out.println(user1List);
    }

    @Test
    void findUser1ByAgeGreaterThan() {
        // given
        int age = 25;

        // when
        List<User1> user1List = user1Repository.findUser1ByAgeGreaterThan(age);

        // then
        System.out.println(user1List);
    }

    @Test
    void findUser1ByAgeGreaterThanEqual() {
        // given
        int age = 30;

        // when
        List<User1> user1List = user1Repository.findUser1ByAgeGreaterThanEqual(age);

        // then
        System.out.println(user1List);
    }

    @Test
    void findUser1ByAgeLessThan() {
        // given
        int age = 30;

        // when
        List<User1> user1List = user1Repository.findUser1ByAgeLessThan(age);

        // then
        System.out.println(user1List);
    }

    @Test
    void findUser1ByAgeLessThanEqual() {
        // given
        int age = 30;

        // when
        List<User1> user1List = user1Repository.findUser1ByAgeLessThanEqual(age);

        // then
        System.out.println(user1List);
    }

    @Test
    void findUser1ByAgeBetween() {
        // given
        int startAge = 20;
        int endAge = 40;

        // when
        List<User1> user1List = user1Repository.findUser1ByAgeBetween(startAge, endAge);

        // then
        System.out.println(user1List);
    }

    @Test
    void findUser1ByNameLike() {
        // given
        String name = "%길동%";

        // when
        List<User1> user1List = user1Repository.findUser1ByNameLike(name);

        // then
        System.out.println(user1List);
    }

    @Test
    void findUser1ByNameContains() {
        // given
        String name = "길동";

        // when
        List<User1> user1List = user1Repository.findUser1ByNameContains(name);

        // then
        System.out.println(user1List);
    }

    @Test
    void findUser1ByNameStartsWith() {
        // given
        String name = "홍";

        // when
        List<User1> user1List = user1Repository.findUser1ByNameStartsWith(name);

        // then
        System.out.println(user1List);
    }

    @Test
    void findUser1ByNameEndsWith() {
        // given
        String name = "동";

        // when
        List<User1> user1List = user1Repository.findUser1ByNameEndsWith(name);

        // then
        System.out.println(user1List);
    }

    @Test
    void findUser1ByOrderByName() {
        // when
        List<User1> user1List = user1Repository.findUser1ByOrderByName();

        // then
        System.out.println(user1List);
    }

    @Test
    void findUser1ByOrderByAgeAsc() {
        // when
        List<User1> user1List = user1Repository.findUser1ByOrderByAgeAsc();

        // then
        System.out.println(user1List);
    }

    @Test
    void findUser1ByOrderByAgeDesc() {
        // when
        List<User1> user1List = user1Repository.findUser1ByOrderByAgeDesc();

        // then
        System.out.println(user1List);
    }

    @Test
    void findUser1ByAgeGreaterThanOrderByAgeDesc() {
        // given
        int age = 30;

        // when
        List<User1> user1List = user1Repository.findUser1ByAgeGreaterThanOrderByAgeDesc(age);

        // then
        System.out.println(user1List);
    }

    @Test
    void countUser1ByName() {
        // given
        String name = "홍길동";

        // when
        long count = user1Repository.countUser1ByName(name);

        // then
        System.out.println("User count: " + count);
    }

    @Test
    void selectUser1UnderAge30() {
    }

    @Test
    void selectUser1ByName() {
    }

    @Test
    void selectUser1ByNameParam() {
    }

    @Test
    void selectUser1ByUid() {
    }

    @Test
    void selectAllParentWithChild() {

        // given
        String pid = "p101";

        // when
        List<Object[]> list = user1Repository.selectAllParentWithChild(pid);

        // then
        for(Object[] arr : list){

            Parent parent = (Parent) arr[0];
            Child child = (Child) arr[1];

            System.out.println(parent);
            System.out.println(child);
        }
    }
}