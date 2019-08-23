package butterknife;

import android.app.Activity;
import android.app.Dialog;
import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.annotation.VisibleForTesting;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ButterKnife {
    @VisibleForTesting
    static final Map<Class<?>, Constructor<? extends Unbinder>> BINDINGS = new LinkedHashMap();
    private static boolean debug;

    @Deprecated
    public interface Action<T extends View> extends Action<T> {
    }

    @Deprecated
    public interface Setter<T extends View, V> extends Setter<T, V> {
    }

    @UiThread
    @SafeVarargs
    @Deprecated
    public static <T extends View> void apply(@NonNull T[] tArr, @NonNull Action<? super T>... actionArr) {
        ViewCollections.run(tArr, (Action<? super T>[]) actionArr);
    }

    private ButterKnife() {
        throw new AssertionError("No instances.");
    }

    public static void setDebug(boolean z) {
        debug = z;
    }

    @UiThread
    @NonNull
    public static Unbinder bind(@NonNull View view) {
        return bind((Object) view, view);
    }

    @UiThread
    @NonNull
    public static Unbinder bind(@NonNull Activity activity) {
        return bind((Object) activity, activity.getWindow().getDecorView());
    }

    @UiThread
    @NonNull
    public static Unbinder bind(@NonNull Dialog dialog) {
        return bind((Object) dialog, dialog.getWindow().getDecorView());
    }

    @UiThread
    @CheckResult
    @Nullable
    private static Constructor<? extends Unbinder> findBindingConstructorForClass(Class<?> cls) {
        Constructor<? extends Unbinder> constructor;
        Constructor<? extends Unbinder> constructor2 = BINDINGS.get(cls);
        if (constructor2 != null || BINDINGS.containsKey(cls)) {
            return constructor2;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.") || name.startsWith("androidx.")) {
            return null;
        }
        try {
            ClassLoader classLoader = cls.getClassLoader();
            constructor = classLoader.loadClass(name + "_ViewBinding").getConstructor(new Class[]{cls, View.class});
        } catch (ClassNotFoundException unused) {
            constructor = findBindingConstructorForClass(cls.getSuperclass());
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Unable to find binding constructor for " + name, e2);
        }
        BINDINGS.put(cls, constructor);
        return constructor;
    }

    @UiThread
    @Deprecated
    public static <T extends View> void apply(@NonNull T t, @NonNull Action<? super T> action) {
        ViewCollections.run(t, (Action<? super T>) action);
    }

    @UiThread
    @SafeVarargs
    @Deprecated
    public static <T extends View> void apply(@NonNull T t, @NonNull Action<? super T>... actionArr) {
        ViewCollections.run(t, (Action<? super T>[]) actionArr);
    }

    @UiThread
    @NonNull
    public static Unbinder bind(@NonNull Object obj, @NonNull Activity activity) {
        return bind(obj, activity.getWindow().getDecorView());
    }

    @UiThread
    @Deprecated
    public static <T extends View> void apply(@NonNull List<T> list, @NonNull Action<? super T> action) {
        ViewCollections.run(list, (Action<? super T>) action);
    }

    @UiThread
    @NonNull
    public static Unbinder bind(@NonNull Object obj, @NonNull Dialog dialog) {
        return bind(obj, dialog.getWindow().getDecorView());
    }

    @UiThread
    @NonNull
    public static Unbinder bind(@NonNull Object obj, @NonNull View view) {
        Constructor<? extends Unbinder> findBindingConstructorForClass = findBindingConstructorForClass(obj.getClass());
        if (findBindingConstructorForClass == null) {
            return Unbinder.EMPTY;
        }
        try {
            return (Unbinder) findBindingConstructorForClass.newInstance(new Object[]{obj, view});
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Unable to invoke " + findBindingConstructorForClass, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Unable to invoke " + findBindingConstructorForClass, e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unable to create binding instance.", cause);
            }
        }
    }

    @UiThread
    @SafeVarargs
    @Deprecated
    public static <T extends View> void apply(@NonNull List<T> list, @NonNull Action<? super T>... actionArr) {
        ViewCollections.run(list, (Action<? super T>[]) actionArr);
    }

    @UiThread
    @Deprecated
    public static <T extends View> void apply(@NonNull T[] tArr, @NonNull Action<? super T> action) {
        ViewCollections.run(tArr, (Action<? super T>) action);
    }

    @UiThread
    @Deprecated
    public static <T extends View, V> void apply(@NonNull T t, @NonNull Property<? super T, V> property, V v) {
        ViewCollections.set(t, property, v);
    }

    @UiThread
    @Deprecated
    public static <T extends View, V> void apply(@NonNull T t, @NonNull Setter<? super T, V> setter, V v) {
        ViewCollections.set(t, (Setter<? super T, V>) setter, v);
    }

    @UiThread
    @Deprecated
    public static <T extends View, V> void apply(@NonNull List<T> list, @NonNull Property<? super T, V> property, V v) {
        ViewCollections.set(list, property, v);
    }

    @UiThread
    @Deprecated
    public static <T extends View, V> void apply(@NonNull List<T> list, @NonNull Setter<? super T, V> setter, V v) {
        ViewCollections.set(list, (Setter<? super T, V>) setter, v);
    }

    @UiThread
    @Deprecated
    public static <T extends View, V> void apply(@NonNull T[] tArr, @NonNull Property<? super T, V> property, V v) {
        ViewCollections.set(tArr, property, v);
    }

    @UiThread
    @Deprecated
    public static <T extends View, V> void apply(@NonNull T[] tArr, @NonNull Setter<? super T, V> setter, V v) {
        ViewCollections.set(tArr, (Setter<? super T, V>) setter, v);
    }
}
