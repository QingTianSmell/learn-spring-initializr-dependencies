package root.lombok;

import lombok.RequiredArgsConstructor;

/**
 * @author orionpax
 * @since 2021/11/24
 */
@RequiredArgsConstructor
public class RequiredArgsConstructorLombokDemo {

    private final String foo;
    private String bar;

    @Override
    public String toString() {
        return "RequiredArgsConstructorLombokDemo{" +
                "foo='" + foo + '\'' +
                ", bar='" + bar + '\'' +
                '}';
    }

}
