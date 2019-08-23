package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.WireField;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.LinkedHashMap;

public class WireFiledWorkaround {
    private static WireField toWireFiled(final WireFieldNoEnum wireFieldNoEnum) {
        if (wireFieldNoEnum == null) {
            return null;
        }
        return new WireField() {
            public final Class<? extends Annotation> annotationType() {
                return WireField.class;
            }

            public final String adapter() {
                return wireFieldNoEnum.adapter();
            }

            public final String keyAdapter() {
                return wireFieldNoEnum.keyAdapter();
            }

            public final boolean redacted() {
                return wireFieldNoEnum.redacted();
            }

            public final int tag() {
                return wireFieldNoEnum.tag();
            }

            public final WireField.Label label() {
                int label = wireFieldNoEnum.label();
                if (label == 0) {
                    return WireField.Label.REQUIRED;
                }
                switch (label) {
                    case 2:
                        return WireField.Label.REPEATED;
                    case 3:
                        return WireField.Label.ONE_OF;
                    case 4:
                        return WireField.Label.PACKED;
                    default:
                        return WireField.Label.OPTIONAL;
                }
            }
        };
    }

    private static <M extends Message<M, B>, B extends Message.Builder<M, B>> Class<B> getBuilderType(Class<M> cls) {
        try {
            return Class.forName(cls.getName() + "$Builder");
        } catch (ClassNotFoundException unused) {
            throw new IllegalArgumentException("No builder class found for message type " + cls.getName());
        }
    }

    static <M extends Message<M, B>, B extends Message.Builder<M, B>> RuntimeMessageAdapter<M, B> create(Class<M> cls) {
        Class<B> builderType = getBuilderType(cls);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Field field : cls.getDeclaredFields()) {
            WireField wireField = null;
            try {
                wireField = (WireField) field.getAnnotation(WireField.class);
            } catch (Throwable unused) {
            }
            if (wireField == null) {
                wireField = toWireFiled((WireFieldNoEnum) field.getAnnotation(WireFieldNoEnum.class));
            }
            if (wireField != null) {
                linkedHashMap.put(Integer.valueOf(wireField.tag()), new FieldBinding(wireField, field, builderType));
            }
        }
        return new RuntimeMessageAdapter<>(cls, builderType, Collections.unmodifiableMap(linkedHashMap));
    }
}
