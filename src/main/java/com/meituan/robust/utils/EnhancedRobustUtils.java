package com.meituan.robust.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class EnhancedRobustUtils {
    public static boolean isThrowable = true;

    public static void setFieldValue(String str, Object obj, boolean z, Class cls) {
        try {
            getReflectField(str, obj, cls).setBoolean(obj, z);
        } catch (Exception unused) {
            if (isThrowable) {
                throw new RuntimeException("setFieldValue boolean error " + str + "   target   " + obj + "  value  " + z);
            }
        }
    }

    public static void setFieldValue(String str, Object obj, Object obj2, Class cls) {
        try {
            getReflectField(str, obj, cls).set(obj, obj2);
        } catch (Exception unused) {
            if (isThrowable) {
                throw new RuntimeException("setFieldValue Object error " + str + "   target   " + obj + "  value  " + obj2);
            }
        }
    }

    public static void setFieldValue(String str, Object obj, short s, Class cls) {
        try {
            getReflectField(str, obj, cls).setShort(obj, s);
        } catch (Exception unused) {
            if (isThrowable) {
                throw new RuntimeException("setFieldValue short error " + str + "   target   " + obj + "  value  " + s);
            }
        }
    }

    private static Field getReflectStaticField(String str, Class cls) throws NoSuchFieldException {
        try {
            Field declaredField = cls.getDeclaredField(str);
            if (!declaredField.isAccessible()) {
                declaredField.setAccessible(true);
            }
            return declaredField;
        } catch (NoSuchFieldException unused) {
            throw new NoSuchFieldException("Field " + str + " not found in " + cls);
        }
    }

    public static Object getStaticFieldValue(String str, Class cls) {
        try {
            return getReflectStaticField(str, cls).get(null);
        } catch (Exception unused) {
            if (!isThrowable) {
                return null;
            }
            throw new RuntimeException("getStaticFieldValue  error " + str + "   clazz   " + cls);
        }
    }

    public static Object getFieldValue(String str, Object obj, Class cls) {
        try {
            return getReflectField(str, obj, cls).get(obj);
        } catch (Exception unused) {
            if (!isThrowable) {
                return null;
            }
            throw new RuntimeException("getFieldValue  error " + str + "   instance   " + obj);
        }
    }

    public static Object invokeReflectConstruct(String str, Object[] objArr, Class[] clsArr) {
        try {
            Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(clsArr);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(objArr);
        } catch (Exception unused) {
            if (!isThrowable) {
                return null;
            }
            throw new RuntimeException("invokeReflectConstruct error " + str + "   parameter   " + objArr);
        }
    }

    public static void setStaticFieldValue(String str, Class cls, double d2) {
        try {
            getReflectStaticField(str, cls).setDouble(null, d2);
        } catch (Exception unused) {
            if (isThrowable) {
                throw new RuntimeException("setStaticFieldValue Object error " + str + "   Class   " + cls + "  value  " + d2);
            }
        }
    }

    private static Field getReflectField(String str, Object obj, Class cls) throws NoSuchFieldException {
        if (cls == null) {
            if (!isThrowable) {
                return null;
            }
            throw new RuntimeException("Field " + str + " declaring class is null ");
        } else if (cls.isInterface()) {
            return cls.getDeclaredField(str);
        } else {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
            }
        }
    }

    public static void setStaticFieldValue(String str, Class cls, float f2) {
        try {
            getReflectStaticField(str, cls).setFloat(null, f2);
        } catch (Exception unused) {
            if (isThrowable) {
                throw new RuntimeException("setStaticFieldValue float error " + str + "   Class   " + cls + "  value  " + f2);
            }
        }
    }

    public static void setStaticFieldValue(String str, Class cls, int i) {
        try {
            getReflectStaticField(str, cls).setInt(null, i);
        } catch (Exception unused) {
            if (isThrowable) {
                throw new RuntimeException("setStaticFieldValue int error " + str + "   Class   " + cls + "  value  " + i);
            }
        }
    }

    public static void setStaticFieldValue(String str, Class cls, long j) {
        try {
            getReflectStaticField(str, cls).setLong(null, j);
        } catch (Exception unused) {
            if (isThrowable) {
                throw new RuntimeException("setStaticFieldValue long error " + str + "   Class   " + cls + "  value  " + j);
            }
        }
    }

    public static void setStaticFieldValue(String str, Class cls, Object obj) {
        try {
            getReflectStaticField(str, cls).set(null, obj);
        } catch (Exception unused) {
            if (isThrowable) {
                throw new RuntimeException("setStaticFieldValue Object error " + str + "   Class   " + cls + "  value  " + obj);
            }
        }
    }

    public static void setStaticFieldValue(String str, Class cls, boolean z) {
        try {
            getReflectStaticField(str, cls).setBoolean(null, z);
        } catch (Exception unused) {
            if (isThrowable) {
                throw new RuntimeException("setStaticFieldValue boolean error " + str + "   Class   " + cls + "  value  " + z);
            }
        }
    }

    public static Object invokeReflectStaticMethod(String str, Class cls, Object[] objArr, Class[] clsArr) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, objArr);
        } catch (Exception unused) {
            if (!isThrowable) {
                return null;
            }
            throw new RuntimeException("invokeReflectStaticMethod error " + str + "   class   " + cls + "  args  " + clsArr);
        }
    }

    public static void setFieldValue(String str, Object obj, byte b2, Class cls) {
        try {
            getReflectField(str, obj, cls).setByte(obj, b2);
        } catch (Exception unused) {
            if (isThrowable) {
                throw new RuntimeException("setFieldValue byte error " + str + "   target   " + obj + "  value  " + b2);
            }
        }
    }

    public static Method getDeclaredMethod(Object obj, String str, Class[] clsArr, Class cls) {
        if (cls == null || !cls.isInterface()) {
            Class cls2 = obj.getClass();
            while (cls2 != null) {
                try {
                    Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                    if (declaredMethod != null) {
                        if (!declaredMethod.isAccessible()) {
                            declaredMethod.setAccessible(true);
                        }
                        return declaredMethod;
                    }
                    cls2 = cls2.getSuperclass();
                } catch (Exception unused) {
                }
            }
        } else {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (Exception unused2) {
            }
        }
        if (!isThrowable) {
            return null;
        }
        throw new RuntimeException("getDeclaredMethod error " + str + "   parameterTypes   " + clsArr + " targetObject " + obj.toString());
    }

    public static void setFieldValue(String str, Object obj, char c2, Class cls) {
        try {
            getReflectField(str, obj, cls).setChar(obj, c2);
        } catch (Exception unused) {
            if (isThrowable) {
                throw new RuntimeException("setFieldValue char error " + str + "   target   " + obj + "  value  " + c2);
            }
        }
    }

    public static void setFieldValue(String str, Object obj, double d2, Class cls) {
        try {
            getReflectField(str, obj, cls).setDouble(obj, d2);
        } catch (Exception unused) {
            if (isThrowable) {
                throw new RuntimeException("setFieldValue double error " + str + "   target   " + obj + "  value  " + d2);
            }
        }
    }

    public static void setFieldValue(String str, Object obj, float f2, Class cls) {
        try {
            getReflectField(str, obj, cls).setFloat(obj, f2);
        } catch (Exception unused) {
            if (isThrowable) {
                throw new RuntimeException("setFieldValue float error " + str + "   target   " + obj + "  value  " + f2);
            }
        }
    }

    public static void setFieldValue(String str, Object obj, int i, Class cls) {
        try {
            getReflectField(str, obj, cls).setInt(obj, i);
        } catch (Exception unused) {
            if (isThrowable) {
                throw new RuntimeException("setFieldValue int error " + str + "   target   " + obj + "  value  " + i);
            }
        }
    }

    public static void setFieldValue(String str, Object obj, long j, Class cls) {
        try {
            getReflectField(str, obj, cls).setLong(obj, j);
        } catch (Exception unused) {
            if (isThrowable) {
                throw new RuntimeException("setFieldValue long error " + str + "   target   " + obj + "  value  " + j);
            }
        }
    }

    public static Object invokeReflectMethod(String str, Object obj, Object[] objArr, Class[] clsArr, Class cls) {
        try {
            return getDeclaredMethod(obj, str, clsArr, cls).invoke(obj, objArr);
        } catch (Exception unused) {
            if (!isThrowable) {
                return null;
            }
            throw new RuntimeException("invokeReflectMethod error " + str + "   parameter   " + objArr + " targetObject " + obj.toString() + "  args  " + clsArr);
        }
    }
}
