package dagger.android;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import dagger.android.a;
import dagger.internal.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;

public final class b<T> implements a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, javax.inject.a<a.C0872a<?>>> f4352a;

    public static final class a extends RuntimeException {
        a(String str, ClassCastException classCastException) {
            super(str, classCastException);
        }
    }

    public final void a(T t) {
        if (!b(t)) {
            throw new IllegalArgumentException(c(t));
        }
    }

    @CanIgnoreReturnValue
    private boolean b(T t) {
        javax.inject.a aVar = this.f4352a.get(t.getClass().getName());
        if (aVar == null) {
            return false;
        }
        a.C0872a aVar2 = (a.C0872a) aVar.get();
        try {
            ((a) e.a(aVar2.a(t), "%s.create(I) should not return null.", aVar2.getClass())).a(t);
            return true;
        } catch (ClassCastException e2) {
            throw new a(String.format("%s does not implement AndroidInjector.Factory<%s>", new Object[]{aVar2.getClass().getCanonicalName(), t.getClass().getCanonicalName()}), e2);
        }
    }

    private String c(T t) {
        ArrayList arrayList = new ArrayList();
        for (Class cls = t.getClass(); cls != null; cls = cls.getSuperclass()) {
            if (this.f4352a.containsKey(cls.getCanonicalName())) {
                arrayList.add(cls.getCanonicalName());
            }
        }
        if (arrayList.isEmpty()) {
            return String.format("No injector factory bound for Class<%s>", new Object[]{t.getClass().getCanonicalName()});
        }
        return String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", new Object[]{t.getClass().getCanonicalName(), arrayList});
    }

    private static <C, V> Map<String, javax.inject.a<a.C0872a<?>>> a(Map<Class<? extends C>, V> map, Map<String, V> map2) {
        if (map.isEmpty()) {
            return map2;
        }
        LinkedHashMap a2 = dagger.internal.a.a(map.size() + map2.size());
        a2.putAll(map2);
        for (Map.Entry next : map.entrySet()) {
            a2.put(((Class) next.getKey()).getName(), next.getValue());
        }
        return Collections.unmodifiableMap(a2);
    }

    @Inject
    public b(Map<Class<?>, javax.inject.a<a.C0872a<?>>> map, Map<String, javax.inject.a<a.C0872a<?>>> map2, Map<Class<? extends T>, javax.inject.a<a.C0872a<? extends T>>> map3, Map<String, javax.inject.a<a.C0872a<? extends T>>> map4) {
        Map<String, javax.inject.a<a.C0872a<?>>> a2 = a(map, map2);
        Map<String, javax.inject.a<a.C0872a<?>>> a3 = a(map3, map4);
        if (a2.isEmpty()) {
            a2 = a3;
        } else if (!a3.isEmpty()) {
            LinkedHashMap a4 = dagger.internal.a.a(a2.size() + a3.size());
            a4.putAll(a2);
            a4.putAll(a3);
            a2 = a4;
        }
        this.f4352a = a2;
    }
}
