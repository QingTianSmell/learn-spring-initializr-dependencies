package root.lombok;

import lombok.AllArgsConstructor;

/**
 * @author orionpax
 * @since 2021/11/24
 */
@AllArgsConstructor
public class AllArgsConstructorLombokDemo {

    private String foo;
    private String bar;

    @Override
    public String toString() {
        return "AllArgsConstructorLombokDemo{" +
                "foo='" + foo + '\'' +
                ", bar='" + bar + '\'' +
                '}';
    }

}
