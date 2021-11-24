package root.lombok;

import lombok.NoArgsConstructor;

/**
 * @author orionpax
 * @since 2021/11/24
 */
@NoArgsConstructor
public class NoArgsConstructorLombokDemo {

    private String foo;
    private String bar;

    @Override
    public String toString() {
        return "NoArgsConstructorLombokDemo{" +
                "foo='" + foo + '\'' +
                ", bar='" + bar + '\'' +
                '}';
    }

}
