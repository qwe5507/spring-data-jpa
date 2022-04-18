package study.datajpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Member {
    @Id @GeneratedValue
    private Long id;
    private String username;

    protected Member() {
    }

    public Member(String username) {
        this.username = username;
    }

    //setter보다 더 좋은 방법
//    public void changeUsername(String username) {
//        this.username = username
//    }
}
