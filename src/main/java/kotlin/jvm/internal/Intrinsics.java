package kotlin.jvm.internal;

import com.taobao.android.dexposed.ClassUtils;
import java.util.Arrays;
import kotlin.SinceKotlin;
import kotlin.f;
import kotlin.y;

public class Intrinsics {
    public static int compare(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int compare(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    private Intrinsics() {
    }

    public static void needClassReification() {
        throwUndefinedForReified();
    }

    public static void throwUndefinedForReified() {
        throwUndefinedForReified("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void throwAssert() {
        throw ((AssertionError) sanitizeStackTrace(new AssertionError()));
    }

    public static void throwIllegalArgument() {
        throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException()));
    }

    public static void throwIllegalState() {
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException()));
    }

    public static void throwNpe() {
        throw ((f) sanitizeStackTrace(new f()));
    }

    public static void checkNotNull(Object obj) {
        if (obj == null) {
            throwNpe();
        }
    }

    public static void needClassReification(String str) {
        throwUndefinedForReified(str);
    }

    private static <T extends Throwable> T sanitizeStackTrace(T t) {
        return sanitizeStackTrace(t, Intrinsics.class.getName());
    }

    public static void throwUndefinedForReified(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void throwUninitializedProperty(String str) {
        throw ((y) sanitizeStackTrace(new y(str)));
    }

    public static void throwAssert(String str) {
        throw ((AssertionError) sanitizeStackTrace(new AssertionError(str)));
    }

    public static void throwIllegalArgument(String str) {
        throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException(str)));
    }

    public static void throwIllegalState(String str) {
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str)));
    }

    public static void throwNpe(String str) {
        throw ((f) sanitizeStackTrace(new f(str)));
    }

    public static void throwUninitializedPropertyAccessException(String str) {
        throwUninitializedProperty("lateinit property " + str + " has not been initialized");
    }

    public static void checkHasClass(String str) throws ClassNotFoundException {
        String replace = str.replace('/', '.');
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e2) {
            throw ((ClassNotFoundException) sanitizeStackTrace(new ClassNotFoundException("Class " + replace + " is not found. Please update the Kotlin runtime to the latest version", e2)));
        }
    }

    private static void throwParameterIsNullException(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException("Parameter specified as non-null is null: method " + className + ClassUtils.PACKAGE_SEPARATOR + methodName + ", parameter " + str)));
    }

    public static void reifiedOperationMarker(int i, String str) {
        throwUndefinedForReified();
    }

    public static void checkParameterIsNotNull(Object obj, String str) {
        if (obj == null) {
            throwParameterIsNullException(str);
        }
    }

    @SinceKotlin
    public static boolean areEqual(double d2, Double d3) {
        if (d3 == null || d2 != d3.doubleValue()) {
            return false;
        }
        return true;
    }

    public static void checkFieldIsNotNull(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str)));
        }
    }

    public static void checkNotNull(Object obj, String str) {
        if (obj == null) {
            throwNpe(str);
        }
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str)));
        }
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException(str)));
        }
    }

    public static void checkReturnedValueIsNotNull(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str)));
        }
    }

    public static String stringPlus(String str, Object obj) {
        return str + obj;
    }

    @SinceKotlin
    public static boolean areEqual(float f2, Float f3) {
        if (f3 == null || f2 != f3.floatValue()) {
            return false;
        }
        return true;
    }

    public static void checkExpressionValueIsNotNull(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str + " must not be null")));
        }
    }

    @SinceKotlin
    public static boolean areEqual(Double d2, double d3) {
        if (d2 == null || d2.doubleValue() != d3) {
            return false;
        }
        return true;
    }

    static <T extends Throwable> T sanitizeStackTrace(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    @SinceKotlin
    public static boolean areEqual(Double d2, Double d3) {
        if (d2 == null) {
            if (d3 == null) {
                return true;
            }
            return false;
        } else if (d3 == null || d2.doubleValue() != d3.doubleValue()) {
            return false;
        } else {
            return true;
        }
    }

    public static void checkHasClass(String str, String str2) throws ClassNotFoundException {
        String replace = str.replace('/', '.');
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e2) {
            throw ((ClassNotFoundException) sanitizeStackTrace(new ClassNotFoundException("Class " + replace + " is not found: this code requires the Kotlin runtime of version at least " + str2, e2)));
        }
    }

    @SinceKotlin
    public static boolean areEqual(Float f2, float f3) {
        if (f2 == null || f2.floatValue() != f3) {
            return false;
        }
        return true;
    }

    @SinceKotlin
    public static boolean areEqual(Float f2, Float f3) {
        if (f2 == null) {
            if (f3 == null) {
                return true;
            }
            return false;
        } else if (f3 == null || f2.floatValue() != f3.floatValue()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean areEqual(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public static void reifiedOperationMarker(int i, String str, String str2) {
        throwUndefinedForReified(str2);
    }

    public static void checkFieldIsNotNull(Object obj, String str, String str2) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException("Field specified as non-null is null: " + str + ClassUtils.PACKAGE_SEPARATOR + str2)));
        }
    }

    public static void checkReturnedValueIsNotNull(Object obj, String str, String str2) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException("Method specified as non-null returned null: " + str + ClassUtils.PACKAGE_SEPARATOR + str2)));
        }
    }
}
