package org.msgpack.template.builder;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import org.msgpack.c;
import org.msgpack.template.FieldOption;

public class DefaultFieldEntry extends FieldEntry {
    public Field field;

    public DefaultFieldEntry() {
        this(null, FieldOption.IGNORE);
    }

    public Type getGenericType() {
        return this.field.getGenericType();
    }

    public String getName() {
        return this.field.getName();
    }

    public Class<?> getType() {
        return this.field.getType();
    }

    public Object get(Object obj) {
        try {
            return this.field.get(obj);
        } catch (IllegalArgumentException e2) {
            throw new c((Throwable) e2);
        } catch (IllegalAccessException e3) {
            throw new c((Throwable) e3);
        }
    }

    public DefaultFieldEntry(Field field2, FieldOption fieldOption) {
        super(fieldOption);
        this.field = field2;
    }

    public void set(Object obj, Object obj2) {
        try {
            this.field.set(obj, obj2);
        } catch (IllegalArgumentException e2) {
            throw new c((Throwable) e2);
        } catch (IllegalAccessException e3) {
            throw new c((Throwable) e3);
        }
    }
}
