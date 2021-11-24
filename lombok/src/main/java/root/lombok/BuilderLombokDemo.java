package root.lombok;

import lombok.Builder;

/**
 * @author orionpax
 * @since 2021/11/24
 */
@Builder
public class BuilderLombokDemo {

    private String foo;
    private String bar;

    @Override
    public String toString() {
        return "BuilderLombokDemo{" +
                "foo='" + foo + '\'' +
                ", bar='" + bar + '\'' +
                '}';
    }
}
