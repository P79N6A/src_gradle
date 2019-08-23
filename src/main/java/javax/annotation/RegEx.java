package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.meta.TypeQualifierNickname;

@Syntax
@Documented
@TypeQualifierNickname
@Retention(RetentionPolicy.RUNTIME)
public @interface RegEx {
}
