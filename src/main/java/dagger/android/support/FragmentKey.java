package dagger.android.support;

import dagger.MapKey;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD})
@MapKey
@Deprecated
public @interface FragmentKey {
}