package lib01.ex01;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Board{
    private String subject;
    private String content;
    private String writer;

    public Board(String subject, String content, String writer) {
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }
}
