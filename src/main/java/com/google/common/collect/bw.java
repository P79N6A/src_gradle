package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

@GwtIncompatible
public final class bw {

    static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Field f24714a;

        private a(Field field) {
            this.f24714a = field;
            field.setAccessible(true);
        }

        /* synthetic */ a(Field field, byte b2) {
            this(field);
        }

        /* access modifiers changed from: package-private */
        public final void a(T t, Object obj) {
            try {
                this.f24714a.set(t, obj);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(T t, int i) {
            try {
                this.f24714a.set(t, Integer.valueOf(i));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    static <T> a<T> a(Class<T> cls, String str) {
        try {
            return new a<>(cls.getDeclaredField(str), (byte) 0);
        } catch (NoSuchFieldException e2) {
            throw new AssertionError(e2);
        }
    }

    static <K, V> void a(bd<K, V> bdVar, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(bdVar.asMap().size());
        for (Map.Entry entry : bdVar.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            for (Object writeObject : (Collection) entry.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }
}
