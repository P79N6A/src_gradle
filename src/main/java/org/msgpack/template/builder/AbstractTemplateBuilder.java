package org.msgpack.template.builder;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.msgpack.annotation.Beans;
import org.msgpack.annotation.Ignore;
import org.msgpack.annotation.Index;
import org.msgpack.annotation.Message;
import org.msgpack.annotation.MessagePackBeans;
import org.msgpack.annotation.MessagePackMessage;
import org.msgpack.annotation.MessagePackOrdinalEnum;
import org.msgpack.annotation.NotNullable;
import org.msgpack.annotation.Optional;
import org.msgpack.annotation.OrdinalEnum;
import org.msgpack.template.FieldList;
import org.msgpack.template.FieldOption;
import org.msgpack.template.Template;
import org.msgpack.template.TemplateRegistry;

public abstract class AbstractTemplateBuilder implements TemplateBuilder {
    protected TemplateRegistry registry;

    /* access modifiers changed from: protected */
    public abstract <T> Template<T> buildTemplate(Class<T> cls, FieldEntry[] fieldEntryArr);

    public <T> Template<T> loadTemplate(Type type) {
        return null;
    }

    protected AbstractTemplateBuilder(TemplateRegistry templateRegistry) {
        this.registry = templateRegistry;
    }

    public <T> Template<T> buildTemplate(Type type) throws TemplateBuildException {
        Class cls = (Class) type;
        checkClassValidation(cls);
        return buildTemplate(cls, toFieldEntries(cls, getFieldOption(cls)));
    }

    /* access modifiers changed from: protected */
    public FieldOption getFieldOption(Class<?> cls) {
        Message message = (Message) cls.getAnnotation(Message.class);
        if (message == null) {
            return FieldOption.DEFAULT;
        }
        if (((MessagePackMessage) cls.getAnnotation(MessagePackMessage.class)) == null) {
            return FieldOption.DEFAULT;
        }
        return message.a();
    }

    private Field[] getFields(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Class<?> cls2 = cls; cls2 != Object.class; cls2 = cls2.getSuperclass()) {
            Field[] declaredFields = cls2.getDeclaredFields();
            i += declaredFields.length;
            arrayList.add(declaredFields);
        }
        Field[] fieldArr = new Field[i];
        int i2 = 0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Field[] fieldArr2 = (Field[]) arrayList.get(size);
            System.arraycopy(fieldArr2, 0, fieldArr, i2, fieldArr2.length);
            i2 += fieldArr2.length;
        }
        return fieldArr;
    }

    /* access modifiers changed from: protected */
    public void checkClassValidation(Class<?> cls) {
        if (Modifier.isAbstract(cls.getModifiers())) {
            throw new TemplateBuildException("Cannot build template for abstract class: " + cls.getName());
        } else if (cls.isInterface()) {
            throw new TemplateBuildException("Cannot build template for interface: " + cls.getName());
        } else if (cls.isArray()) {
            throw new TemplateBuildException("Cannot build template for array class: " + cls.getName());
        } else if (cls.isPrimitive()) {
            throw new TemplateBuildException("Cannot build template of primitive type: " + cls.getName());
        }
    }

    public static boolean matchAtArrayTemplateBuilder(Class<?> cls, boolean z) {
        return cls.isArray();
    }

    public static boolean isAnnotated(Class<?> cls, Class<? extends Annotation> cls2) {
        if (cls.getAnnotation(cls2) != null) {
            return true;
        }
        return false;
    }

    public <T> Template<T> buildTemplate(Class<T> cls, FieldList fieldList) throws TemplateBuildException {
        checkClassValidation(cls);
        return buildTemplate(cls, toFieldEntries(cls, fieldList));
    }

    private int getFieldIndex(Field field, int i) {
        Index index = (Index) field.getAnnotation(Index.class);
        if (index == null) {
            return i + 1;
        }
        return index.a();
    }

    public static boolean isAnnotated(AccessibleObject accessibleObject, Class<? extends Annotation> cls) {
        if (accessibleObject.getAnnotation(cls) != null) {
            return true;
        }
        return false;
    }

    public static boolean matchAtOrdinalEnumTemplateBuilder(Class<?> cls, boolean z) {
        if (!z) {
            return cls.isEnum();
        }
        if (isAnnotated(cls, OrdinalEnum.class) || isAnnotated(cls, MessagePackOrdinalEnum.class)) {
            return true;
        }
        return false;
    }

    public static boolean matchAtBeansClassTemplateBuilder(Type type, boolean z) {
        Class cls = (Class) type;
        if (z) {
            if (isAnnotated(cls, Beans.class) || isAnnotated(cls, MessagePackBeans.class)) {
                return true;
            }
            return false;
        } else if (!cls.isEnum() || !cls.isInterface()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean matchAtClassTemplateBuilder(Class<?> cls, boolean z) {
        if (z) {
            if (isAnnotated(cls, Message.class) || isAnnotated(cls, MessagePackMessage.class)) {
                return true;
            }
            return false;
        } else if (cls.isEnum() || cls.isInterface()) {
            return false;
        } else {
            return true;
        }
    }

    private FieldOption getFieldOption(Field field, FieldOption fieldOption) {
        int modifiers = field.getModifiers();
        if (Modifier.isStatic(modifiers) || Modifier.isFinal(modifiers) || Modifier.isTransient(modifiers)) {
            return FieldOption.IGNORE;
        }
        if (isAnnotated((AccessibleObject) field, Ignore.class)) {
            return FieldOption.IGNORE;
        }
        if (isAnnotated((AccessibleObject) field, Optional.class)) {
            return FieldOption.OPTIONAL;
        }
        if (isAnnotated((AccessibleObject) field, NotNullable.class)) {
            return FieldOption.NOTNULLABLE;
        }
        if (fieldOption != FieldOption.DEFAULT) {
            return fieldOption;
        }
        if (field.getType().isPrimitive()) {
            return FieldOption.NOTNULLABLE;
        }
        return FieldOption.OPTIONAL;
    }

    private FieldEntry[] toFieldEntries(Class<?> cls, FieldList fieldList) {
        ArrayList<FieldList.Entry> arrayList = fieldList.list;
        FieldEntry[] fieldEntryArr = new FieldEntry[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            FieldList.Entry entry = arrayList.get(i);
            if (entry.isAvailable()) {
                try {
                    fieldEntryArr[i] = new DefaultFieldEntry(cls.getDeclaredField(entry.name), entry.option);
                } catch (SecurityException e2) {
                    throw new TemplateBuildException((Throwable) e2);
                } catch (NoSuchFieldException e3) {
                    throw new TemplateBuildException((Throwable) e3);
                }
            } else {
                fieldEntryArr[i] = new DefaultFieldEntry();
            }
        }
        return fieldEntryArr;
    }

    /* access modifiers changed from: protected */
    public FieldEntry[] toFieldEntries(Class<?> cls, FieldOption fieldOption) {
        Field[] fields = getFields(cls);
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Field field : fields) {
            FieldOption fieldOption2 = getFieldOption(field, fieldOption);
            if (fieldOption2 != FieldOption.IGNORE) {
                int fieldIndex = getFieldIndex(field, i);
                if (arrayList.size() > fieldIndex && arrayList.get(fieldIndex) != null) {
                    throw new TemplateBuildException("duplicated index: " + fieldIndex);
                } else if (fieldIndex >= 0) {
                    while (arrayList.size() <= fieldIndex) {
                        arrayList.add(null);
                    }
                    arrayList.set(fieldIndex, new DefaultFieldEntry(field, fieldOption2));
                    if (i < fieldIndex) {
                        i = fieldIndex;
                    }
                } else {
                    throw new TemplateBuildException("invalid index: " + fieldIndex);
                }
            }
        }
        FieldEntry[] fieldEntryArr = new FieldEntry[(i + 1)];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            FieldEntry fieldEntry = (FieldEntry) arrayList.get(i2);
            if (fieldEntry == null) {
                fieldEntryArr[i2] = new DefaultFieldEntry();
            } else {
                fieldEntryArr[i2] = fieldEntry;
            }
        }
        return fieldEntryArr;
    }
}
