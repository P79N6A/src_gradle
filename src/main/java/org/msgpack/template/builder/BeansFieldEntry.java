package org.msgpack.template.builder;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import org.msgpack.c;
import org.msgpack.template.FieldOption;
import org.msgpack.template.builder.beans.PropertyDescriptor;

public class BeansFieldEntry extends FieldEntry {
    public PropertyDescriptor desc;

    public BeansFieldEntry() {
    }

    public String getName() {
        return this.desc.getDisplayName();
    }

    public Class<?> getType() {
        return this.desc.getPropertyType();
    }

    public Type getGenericType() {
        return this.desc.getter.getGenericReturnType();
    }

    public BeansFieldEntry(PropertyDescriptor propertyDescriptor) {
        this(propertyDescriptor, FieldOption.DEFAULT);
    }

    public Object get(Object obj) {
        try {
            return this.desc.getter.invoke(obj, new Object[0]);
        } catch (IllegalArgumentException e2) {
            throw new c((Throwable) e2);
        } catch (IllegalAccessException e3) {
            throw new c((Throwable) e3);
        } catch (InvocationTargetException e4) {
            throw new c((Throwable) e4);
        }
    }

    public BeansFieldEntry(PropertyDescriptor propertyDescriptor, FieldOption fieldOption) {
        super(fieldOption);
        this.desc = propertyDescriptor;
    }

    public void set(Object obj, Object obj2) {
        try {
            this.desc.setter.invoke(obj, new Object[]{obj2});
        } catch (IllegalArgumentException e2) {
            throw new c((Throwable) e2);
        } catch (IllegalAccessException e3) {
            throw new c((Throwable) e3);
        } catch (InvocationTargetException e4) {
            throw new c((Throwable) e4);
        }
    }
}
