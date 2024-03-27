package org.example.server.Annotations;
import java.lang.annotation.*;

/**
 * Notation to indicate that the method will map directly to an HTTP response
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RestController {

}
