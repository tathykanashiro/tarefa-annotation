import java.lang.annotation.*;

/**
 * @author tathiany kanashiro
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.CONSTRUCTOR})
public @interface Tabela {
    String marca();

    String carro();

}