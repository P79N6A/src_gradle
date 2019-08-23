package org.msgpack.template.builder;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.msgpack.annotation.Ignore;
import org.msgpack.annotation.Index;
import org.msgpack.annotation.NotNullable;
import org.msgpack.annotation.Optional;
import org.msgpack.packer.Packer;
import org.msgpack.template.FieldOption;
import org.msgpack.template.TemplateRegistry;
import org.msgpack.template.builder.ReflectionTemplateBuilder;
import org.msgpack.template.builder.beans.IntrospectionException;
import org.msgpack.template.builder.beans.Introspector;
import org.msgpack.template.builder.beans.PropertyDescriptor;
import org.msgpack.unpacker.Unpacker;

public class ReflectionBeansTemplateBuilder extends ReflectionTemplateBuilder {
    private static Logger LOG = Logger.getLogger(ReflectionBeansTemplateBuilder.class.getName());

    static class ReflectionBeansFieldTemplate extends ReflectionTemplateBuilder.ReflectionFieldTemplate {
        ReflectionBeansFieldTemplate(FieldEntry fieldEntry) {
            super(fieldEntry);
        }

        public void write(Packer packer, Object obj, boolean z) throws IOException {
            packer.write(obj);
        }

        public Object read(Unpacker unpacker, Object obj, boolean z) throws IOException {
            Object read = unpacker.read(this.entry.getType());
            this.entry.set(obj, read);
            return read;
        }
    }

    public ReflectionBeansTemplateBuilder(TemplateRegistry templateRegistry) {
        super(templateRegistry, null);
    }

    private int getPropertyIndex(PropertyDescriptor propertyDescriptor) {
        int methodIndex = getMethodIndex(propertyDescriptor.getter);
        if (methodIndex >= 0) {
            return methodIndex;
        }
        return getMethodIndex(propertyDescriptor.setter);
    }

    private int getMethodIndex(Method method) {
        Index index = (Index) method.getAnnotation(Index.class);
        if (index == null) {
            return -1;
        }
        return index.a();
    }

    private FieldOption getMethodOption(Method method) {
        if (isAnnotated((AccessibleObject) method, Ignore.class)) {
            return FieldOption.IGNORE;
        }
        if (isAnnotated((AccessibleObject) method, Optional.class)) {
            return FieldOption.OPTIONAL;
        }
        if (isAnnotated((AccessibleObject) method, NotNullable.class)) {
            return FieldOption.NOTNULLABLE;
        }
        return FieldOption.DEFAULT;
    }

    private boolean isIgnoreProperty(PropertyDescriptor propertyDescriptor) {
        if (propertyDescriptor == null) {
            return true;
        }
        Method method = propertyDescriptor.getter;
        Method method2 = propertyDescriptor.setter;
        if (method == null || method2 == null || !Modifier.isPublic(method.getModifiers()) || !Modifier.isPublic(method2.getModifiers()) || isAnnotated((AccessibleObject) method, Ignore.class) || isAnnotated((AccessibleObject) method2, Ignore.class)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public ReflectionTemplateBuilder.ReflectionFieldTemplate[] toTemplates(FieldEntry[] fieldEntryArr) {
        ReflectionTemplateBuilder.ReflectionFieldTemplate[] reflectionFieldTemplateArr = new ReflectionTemplateBuilder.ReflectionFieldTemplate[fieldEntryArr.length];
        for (int i = 0; i < fieldEntryArr.length; i++) {
            FieldEntry fieldEntry = fieldEntryArr[i];
            if (fieldEntry.getType().isPrimitive()) {
                reflectionFieldTemplateArr[i] = new ReflectionBeansFieldTemplate(fieldEntry);
            } else {
                reflectionFieldTemplateArr[i] = new ReflectionTemplateBuilder.FieldTemplateImpl(fieldEntry, this.registry.lookup(fieldEntry.getGenericType()));
            }
        }
        return reflectionFieldTemplateArr;
    }

    private FieldOption getPropertyOption(BeansFieldEntry beansFieldEntry, FieldOption fieldOption) {
        FieldOption methodOption = getMethodOption(beansFieldEntry.desc.getter);
        if (methodOption != FieldOption.DEFAULT) {
            return methodOption;
        }
        FieldOption methodOption2 = getMethodOption(beansFieldEntry.desc.setter);
        if (methodOption2 != FieldOption.DEFAULT) {
            return methodOption2;
        }
        return fieldOption;
    }

    public boolean matchType(Type type, boolean z) {
        Class cls = (Class) type;
        boolean matchAtBeansClassTemplateBuilder = matchAtBeansClassTemplateBuilder(cls, z);
        if (matchAtBeansClassTemplateBuilder && LOG.isLoggable(Level.FINE)) {
            Logger logger = LOG;
            logger.fine("matched type: " + cls.getName());
        }
        return matchAtBeansClassTemplateBuilder;
    }

    public FieldEntry[] toFieldEntries(Class<?> cls, FieldOption fieldOption) {
        try {
            PropertyDescriptor[] propertyDescriptors = Introspector.getBeanInfo(cls).getPropertyDescriptors();
            ArrayList arrayList = new ArrayList();
            for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                if (!isIgnoreProperty(propertyDescriptor)) {
                    arrayList.add(propertyDescriptor);
                }
            }
            PropertyDescriptor[] propertyDescriptorArr = new PropertyDescriptor[arrayList.size()];
            arrayList.toArray(propertyDescriptorArr);
            BeansFieldEntry[] beansFieldEntryArr = new BeansFieldEntry[propertyDescriptorArr.length];
            for (PropertyDescriptor propertyDescriptor2 : propertyDescriptorArr) {
                int propertyIndex = getPropertyIndex(propertyDescriptor2);
                if (propertyIndex >= 0) {
                    if (beansFieldEntryArr[propertyIndex] != null) {
                        throw new TemplateBuildException("duplicated index: " + propertyIndex);
                    } else if (propertyIndex < beansFieldEntryArr.length) {
                        beansFieldEntryArr[propertyIndex] = new BeansFieldEntry(propertyDescriptor2);
                        propertyDescriptorArr[propertyIndex] = null;
                    } else {
                        throw new TemplateBuildException("invalid index: " + propertyIndex);
                    }
                }
            }
            int i = 0;
            for (PropertyDescriptor propertyDescriptor3 : propertyDescriptorArr) {
                if (propertyDescriptor3 != null) {
                    while (beansFieldEntryArr[i] != null) {
                        i++;
                    }
                    beansFieldEntryArr[i] = new BeansFieldEntry(propertyDescriptor3);
                }
            }
            for (BeansFieldEntry beansFieldEntry : beansFieldEntryArr) {
                beansFieldEntry.option = getPropertyOption(beansFieldEntry, fieldOption);
            }
            return beansFieldEntryArr;
        } catch (IntrospectionException unused) {
            throw new TemplateBuildException("Class must be java beans class:" + cls.getName());
        }
    }
}
