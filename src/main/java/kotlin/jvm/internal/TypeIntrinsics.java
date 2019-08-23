package kotlin.jvm.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.i;
import kotlin.jvm.functions.j;
import kotlin.jvm.functions.k;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.m;
import kotlin.jvm.functions.n;
import kotlin.jvm.functions.o;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.a.a;
import kotlin.jvm.internal.a.b;
import kotlin.jvm.internal.a.c;
import kotlin.jvm.internal.a.d;
import kotlin.jvm.internal.a.e;
import kotlin.jvm.internal.a.f;
import kotlin.jvm.internal.a.g;
import kotlin.jvm.internal.a.h;

public class TypeIntrinsics {
    public static ClassCastException throwCce(ClassCastException classCastException) {
        throw ((ClassCastException) sanitizeStackTrace(classCastException));
    }

    public static Collection castToCollection(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e2) {
            throw throwCce(e2);
        }
    }

    public static Iterable castToIterable(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e2) {
            throw throwCce(e2);
        }
    }

    public static Iterator castToIterator(Object obj) {
        try {
            return (Iterator) obj;
        } catch (ClassCastException e2) {
            throw throwCce(e2);
        }
    }

    public static List castToList(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e2) {
            throw throwCce(e2);
        }
    }

    public static ListIterator castToListIterator(Object obj) {
        try {
            return (ListIterator) obj;
        } catch (ClassCastException e2) {
            throw throwCce(e2);
        }
    }

    public static Map castToMap(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            throw throwCce(e2);
        }
    }

    public static Map.Entry castToMapEntry(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e2) {
            throw throwCce(e2);
        }
    }

    public static Set castToSet(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e2) {
            throw throwCce(e2);
        }
    }

    public static boolean isMutableCollection(Object obj) {
        if (!(obj instanceof Collection) || ((obj instanceof a) && !(obj instanceof b))) {
            return false;
        }
        return true;
    }

    public static boolean isMutableIterable(Object obj) {
        if (!(obj instanceof Iterable) || ((obj instanceof a) && !(obj instanceof c))) {
            return false;
        }
        return true;
    }

    public static boolean isMutableIterator(Object obj) {
        if (!(obj instanceof Iterator) || ((obj instanceof a) && !(obj instanceof d))) {
            return false;
        }
        return true;
    }

    public static boolean isMutableList(Object obj) {
        if (!(obj instanceof List) || ((obj instanceof a) && !(obj instanceof e))) {
            return false;
        }
        return true;
    }

    public static boolean isMutableListIterator(Object obj) {
        if (!(obj instanceof ListIterator) || ((obj instanceof a) && !(obj instanceof f))) {
            return false;
        }
        return true;
    }

    public static boolean isMutableMap(Object obj) {
        if (!(obj instanceof Map) || ((obj instanceof a) && !(obj instanceof g))) {
            return false;
        }
        return true;
    }

    public static boolean isMutableMapEntry(Object obj) {
        if (!(obj instanceof Map.Entry) || ((obj instanceof a) && !(obj instanceof g.a))) {
            return false;
        }
        return true;
    }

    public static boolean isMutableSet(Object obj) {
        if (!(obj instanceof Set) || ((obj instanceof a) && !(obj instanceof h))) {
            return false;
        }
        return true;
    }

    private static <T extends Throwable> T sanitizeStackTrace(T t) {
        return Intrinsics.sanitizeStackTrace(t, TypeIntrinsics.class.getName());
    }

    public static void throwCce(String str) {
        throw throwCce(new ClassCastException(str));
    }

    public static Collection asMutableCollection(Object obj) {
        if ((obj instanceof a) && !(obj instanceof b)) {
            throwCce(obj, "kotlin.collections.MutableCollection");
        }
        return castToCollection(obj);
    }

    public static Iterable asMutableIterable(Object obj) {
        if ((obj instanceof a) && !(obj instanceof c)) {
            throwCce(obj, "kotlin.collections.MutableIterable");
        }
        return castToIterable(obj);
    }

    public static Iterator asMutableIterator(Object obj) {
        if ((obj instanceof a) && !(obj instanceof d)) {
            throwCce(obj, "kotlin.collections.MutableIterator");
        }
        return castToIterator(obj);
    }

    public static List asMutableList(Object obj) {
        if ((obj instanceof a) && !(obj instanceof e)) {
            throwCce(obj, "kotlin.collections.MutableList");
        }
        return castToList(obj);
    }

    public static ListIterator asMutableListIterator(Object obj) {
        if ((obj instanceof a) && !(obj instanceof f)) {
            throwCce(obj, "kotlin.collections.MutableListIterator");
        }
        return castToListIterator(obj);
    }

    public static Map asMutableMap(Object obj) {
        if ((obj instanceof a) && !(obj instanceof g)) {
            throwCce(obj, "kotlin.collections.MutableMap");
        }
        return castToMap(obj);
    }

    public static Map.Entry asMutableMapEntry(Object obj) {
        if ((obj instanceof a) && !(obj instanceof g.a)) {
            throwCce(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return castToMapEntry(obj);
    }

    public static Set asMutableSet(Object obj) {
        if ((obj instanceof a) && !(obj instanceof h)) {
            throwCce(obj, "kotlin.collections.MutableSet");
        }
        return castToSet(obj);
    }

    public static int getFunctionArity(Object obj) {
        if (obj instanceof q) {
            return ((q) obj).getArity();
        }
        if (obj instanceof Function0) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof Function2) {
            return 2;
        }
        if (obj instanceof Function3) {
            return 3;
        }
        if (obj instanceof Function4) {
            return 4;
        }
        if (obj instanceof n) {
            return 5;
        }
        if (obj instanceof Function6) {
            return 6;
        }
        if (obj instanceof Function7) {
            return 7;
        }
        if (obj instanceof o) {
            return 8;
        }
        if (obj instanceof p) {
            return 9;
        }
        if (obj instanceof kotlin.jvm.functions.a) {
            return 10;
        }
        if (obj instanceof kotlin.jvm.functions.b) {
            return 11;
        }
        if (obj instanceof kotlin.jvm.functions.c) {
            return 12;
        }
        if (obj instanceof kotlin.jvm.functions.d) {
            return 13;
        }
        if (obj instanceof kotlin.jvm.functions.e) {
            return 14;
        }
        if (obj instanceof kotlin.jvm.functions.f) {
            return 15;
        }
        if (obj instanceof kotlin.jvm.functions.g) {
            return 16;
        }
        if (obj instanceof kotlin.jvm.functions.h) {
            return 17;
        }
        if (obj instanceof i) {
            return 18;
        }
        if (obj instanceof j) {
            return 19;
        }
        if (obj instanceof k) {
            return 20;
        }
        if (obj instanceof l) {
            return 21;
        }
        if (obj instanceof m) {
            return 22;
        }
        return -1;
    }

    public static Collection asMutableCollection(Object obj, String str) {
        if ((obj instanceof a) && !(obj instanceof b)) {
            throwCce(str);
        }
        return castToCollection(obj);
    }

    public static Iterable asMutableIterable(Object obj, String str) {
        if ((obj instanceof a) && !(obj instanceof c)) {
            throwCce(str);
        }
        return castToIterable(obj);
    }

    public static Iterator asMutableIterator(Object obj, String str) {
        if ((obj instanceof a) && !(obj instanceof d)) {
            throwCce(str);
        }
        return castToIterator(obj);
    }

    public static List asMutableList(Object obj, String str) {
        if ((obj instanceof a) && !(obj instanceof e)) {
            throwCce(str);
        }
        return castToList(obj);
    }

    public static ListIterator asMutableListIterator(Object obj, String str) {
        if ((obj instanceof a) && !(obj instanceof f)) {
            throwCce(str);
        }
        return castToListIterator(obj);
    }

    public static Map asMutableMap(Object obj, String str) {
        if ((obj instanceof a) && !(obj instanceof g)) {
            throwCce(str);
        }
        return castToMap(obj);
    }

    public static Map.Entry asMutableMapEntry(Object obj, String str) {
        if ((obj instanceof a) && !(obj instanceof g.a)) {
            throwCce(str);
        }
        return castToMapEntry(obj);
    }

    public static Set asMutableSet(Object obj, String str) {
        if ((obj instanceof a) && !(obj instanceof h)) {
            throwCce(str);
        }
        return castToSet(obj);
    }

    public static boolean isFunctionOfArity(Object obj, int i) {
        if (!(obj instanceof kotlin.d) || getFunctionArity(obj) != i) {
            return false;
        }
        return true;
    }

    public static Object beforeCheckcastToFunctionOfArity(Object obj, int i) {
        if (obj != null && !isFunctionOfArity(obj, i)) {
            throwCce(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    public static void throwCce(Object obj, String str) {
        String str2;
        if (obj == null) {
            str2 = "null";
        } else {
            str2 = obj.getClass().getName();
        }
        throwCce(str2 + " cannot be cast to " + str);
    }

    public static Object beforeCheckcastToFunctionOfArity(Object obj, int i, String str) {
        if (obj != null && !isFunctionOfArity(obj, i)) {
            throwCce(str);
        }
        return obj;
    }
}
