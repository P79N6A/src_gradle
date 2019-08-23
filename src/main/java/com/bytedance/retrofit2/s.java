package com.bytedance.retrofit2;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    static final Type[] f21963a = new Type[0];

    static final class a implements GenericArrayType {

        /* renamed from: a  reason: collision with root package name */
        private final Type f21964a;

        public final Type getGenericComponentType() {
            return this.f21964a;
        }

        public final int hashCode() {
            return this.f21964a.hashCode();
        }

        public final String toString() {
            return s.b(this.f21964a) + "[]";
        }

        public a(Type type) {
            this.f21964a = type;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType) || !s.a((Type) this, (Type) (GenericArrayType) obj)) {
                return false;
            }
            return true;
        }
    }

    static final class b implements ParameterizedType {

        /* renamed from: a  reason: collision with root package name */
        private final Type f21965a;

        /* renamed from: b  reason: collision with root package name */
        private final Type f21966b;

        /* renamed from: c  reason: collision with root package name */
        private final Type[] f21967c;

        public final Type getOwnerType() {
            return this.f21965a;
        }

        public final Type getRawType() {
            return this.f21966b;
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f21967c.clone();
        }

        public final int hashCode() {
            int i;
            int hashCode = Arrays.hashCode(this.f21967c) ^ this.f21966b.hashCode();
            Type type = this.f21965a;
            if (type != null) {
                i = type.hashCode();
            } else {
                i = 0;
            }
            return hashCode ^ i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder((this.f21967c.length + 1) * 30);
            sb.append(s.b(this.f21966b));
            if (this.f21967c.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(s.b(this.f21967c[0]));
            for (int i = 1; i < this.f21967c.length; i++) {
                sb.append(", ");
                sb.append(s.b(this.f21967c[i]));
            }
            sb.append(">");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType) || !s.a((Type) this, (Type) (ParameterizedType) obj)) {
                return false;
            }
            return true;
        }

        public b(Type type, Type type2, Type... typeArr) {
            boolean z;
            int i = 0;
            if (type2 instanceof Class) {
                boolean z2 = true;
                if (type == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != (((Class) type2).getEnclosingClass() != null ? false : z2)) {
                    throw new IllegalArgumentException();
                }
            }
            this.f21965a = type;
            this.f21966b = type2;
            this.f21967c = (Type[]) typeArr.clone();
            Type[] typeArr2 = this.f21967c;
            int length = typeArr2.length;
            while (i < length) {
                Type type3 = typeArr2[i];
                if (type3 != null) {
                    s.c(type3);
                    i++;
                } else {
                    throw new NullPointerException();
                }
            }
        }
    }

    static final class c implements WildcardType {

        /* renamed from: a  reason: collision with root package name */
        private final Type f21968a;

        /* renamed from: b  reason: collision with root package name */
        private final Type f21969b;

        public final Type[] getLowerBounds() {
            if (this.f21969b == null) {
                return s.f21963a;
            }
            return new Type[]{this.f21969b};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.f21968a};
        }

        public final int hashCode() {
            int i;
            if (this.f21969b != null) {
                i = this.f21969b.hashCode() + 31;
            } else {
                i = 1;
            }
            return i ^ (this.f21968a.hashCode() + 31);
        }

        public final String toString() {
            if (this.f21969b != null) {
                return "? super " + s.b(this.f21969b);
            } else if (this.f21968a == Object.class) {
                return "?";
            } else {
                return "? extends " + s.b(this.f21968a);
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof WildcardType) || !s.a((Type) this, (Type) (WildcardType) obj)) {
                return false;
            }
            return true;
        }

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                if (typeArr2[0] != null) {
                    s.c(typeArr2[0]);
                    if (typeArr[0] == Object.class) {
                        this.f21969b = typeArr2[0];
                        this.f21968a = Object.class;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                throw new NullPointerException();
            } else if (typeArr[0] != null) {
                s.c(typeArr[0]);
                this.f21969b = null;
                this.f21968a = typeArr[0];
            } else {
                throw new NullPointerException();
            }
        }
    }

    static String b(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    static void c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    static Type e(Type type) {
        if (type instanceof ParameterizedType) {
            return a(0, (ParameterizedType) type);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }

    static Class<?> a(Type type) {
        while (type != null) {
            if (type instanceof Class) {
                return (Class) type;
            }
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                if (rawType instanceof Class) {
                    return (Class) rawType;
                }
                throw new IllegalArgumentException();
            } else if (type instanceof GenericArrayType) {
                return Array.newInstance(a(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            } else {
                if (type instanceof TypeVariable) {
                    return Object.class;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                } else {
                    throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
                }
            }
        }
        throw new NullPointerException("type == null");
    }

    static boolean d(Type type) {
        String str;
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                for (Type d2 : ((ParameterizedType) type).getActualTypeArguments()) {
                    if (d(d2)) {
                        return true;
                    }
                }
                return false;
            } else if (type instanceof GenericArrayType) {
                type = ((GenericArrayType) type).getGenericComponentType();
            } else if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            } else {
                if (type == null) {
                    str = "null";
                } else {
                    str = type.getClass().getName();
                }
                throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + str);
            }
        }
        return false;
    }

    public static boolean a(String str) {
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
            return true;
        }
        return false;
    }

    static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    static Type a(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < 0 || i >= actualTypeArguments.length) {
            throw new IllegalArgumentException("Index " + i + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
        }
        Type type = actualTypeArguments[i];
        if (type instanceof WildcardType) {
            return ((WildcardType) type).getUpperBounds()[0];
        }
        return type;
    }

    static boolean a(Type type, Type type2) {
        boolean z;
        while (type != type2) {
            if (type instanceof Class) {
                return type.equals(type2);
            }
            if (type instanceof ParameterizedType) {
                if (!(type2 instanceof ParameterizedType)) {
                    return false;
                }
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                Type ownerType = parameterizedType.getOwnerType();
                Type ownerType2 = parameterizedType2.getOwnerType();
                if (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                    return false;
                }
                return true;
            } else if (type instanceof GenericArrayType) {
                if (!(type2 instanceof GenericArrayType)) {
                    return false;
                }
                type = ((GenericArrayType) type).getGenericComponentType();
                type2 = ((GenericArrayType) type2).getGenericComponentType();
            } else if (type instanceof WildcardType) {
                if (!(type2 instanceof WildcardType)) {
                    return false;
                }
                WildcardType wildcardType = (WildcardType) type;
                WildcardType wildcardType2 = (WildcardType) type2;
                if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                    return false;
                }
                return true;
            } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
                return false;
            } else {
                TypeVariable typeVariable = (TypeVariable) type;
                TypeVariable typeVariable2 = (TypeVariable) type2;
                if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    static Type a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return a(type, cls, b(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    private static Type b(Type type, Class<?> cls, Class<?> cls2) {
        Class<? super T> superclass;
        Type genericSuperclass;
        while (cls2 != cls) {
            if (cls2.isInterface()) {
                Class<? super T>[] interfaces = cls.getInterfaces();
                int i = 0;
                int length = interfaces.length;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (interfaces[i] == cls2) {
                        return cls.getGenericInterfaces()[i];
                    } else {
                        if (cls2.isAssignableFrom(interfaces[i])) {
                            genericSuperclass = cls.getGenericInterfaces()[i];
                            superclass = interfaces[i];
                            break;
                        }
                        i++;
                    }
                }
            }
            if (!cls.isInterface()) {
                while (cls != Object.class) {
                    superclass = cls.getSuperclass();
                    if (superclass == cls2) {
                        return cls.getGenericSuperclass();
                    }
                    if (cls2.isAssignableFrom(superclass)) {
                        genericSuperclass = cls.getGenericSuperclass();
                        Type type2 = genericSuperclass;
                        cls = superclass;
                        type = type2;
                    } else {
                        cls = superclass;
                    }
                }
            }
            return cls2;
        }
        return type;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: java.lang.reflect.TypeVariable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042 A[LOOP:0: B:0:0x0000->B:21:0x0042, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0041 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type a(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            r1 = 0
            if (r0 == 0) goto L_0x0044
            java.lang.reflect.TypeVariable r10 = (java.lang.reflect.TypeVariable) r10
            java.lang.reflect.GenericDeclaration r0 = r10.getGenericDeclaration()
            boolean r2 = r0 instanceof java.lang.Class
            if (r2 == 0) goto L_0x0012
            java.lang.Class r0 = (java.lang.Class) r0
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 == 0) goto L_0x003e
            java.lang.reflect.Type r2 = b(r8, r9, r0)
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x003e
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
        L_0x0021:
            int r3 = r0.length
            if (r1 >= r3) goto L_0x0038
            r3 = r0[r1]
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0035
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r0 = r2.getActualTypeArguments()
            r0 = r0[r1]
            goto L_0x003f
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x0021
        L_0x0038:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>()
            throw r8
        L_0x003e:
            r0 = r10
        L_0x003f:
            if (r0 != r10) goto L_0x0042
            return r0
        L_0x0042:
            r10 = r0
            goto L_0x0000
        L_0x0044:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0062
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L_0x0062
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = a((java.lang.reflect.Type) r8, (java.lang.Class) r9, (java.lang.reflect.Type) r10)
            if (r10 != r8) goto L_0x005c
            return r0
        L_0x005c:
            com.bytedance.retrofit2.s$a r9 = new com.bytedance.retrofit2.s$a
            r9.<init>(r8)
            return r9
        L_0x0062:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0079
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = a((java.lang.reflect.Type) r8, (java.lang.Class) r9, (java.lang.reflect.Type) r0)
            if (r0 != r8) goto L_0x0073
            return r10
        L_0x0073:
            com.bytedance.retrofit2.s$a r9 = new com.bytedance.retrofit2.s$a
            r9.<init>(r8)
            return r9
        L_0x0079:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L_0x00ba
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = a((java.lang.reflect.Type) r8, (java.lang.Class) r9, (java.lang.reflect.Type) r0)
            if (r3 == r0) goto L_0x008c
            r0 = 1
            goto L_0x008d
        L_0x008c:
            r0 = 0
        L_0x008d:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x0092:
            if (r1 >= r5) goto L_0x00ad
            r6 = r4[r1]
            java.lang.reflect.Type r6 = a((java.lang.reflect.Type) r8, (java.lang.Class) r9, (java.lang.reflect.Type) r6)
            r7 = r4[r1]
            if (r6 == r7) goto L_0x00aa
            if (r0 != 0) goto L_0x00a8
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L_0x00a8:
            r4[r1] = r6
        L_0x00aa:
            int r1 = r1 + 1
            goto L_0x0092
        L_0x00ad:
            if (r0 == 0) goto L_0x00b9
            com.bytedance.retrofit2.s$b r8 = new com.bytedance.retrofit2.s$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            return r8
        L_0x00b9:
            return r10
        L_0x00ba:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00ff
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r2) goto L_0x00e5
            r3 = r0[r1]
            java.lang.reflect.Type r8 = a((java.lang.reflect.Type) r8, (java.lang.Class) r9, (java.lang.reflect.Type) r3)
            r9 = r0[r1]
            if (r8 == r9) goto L_0x00fe
            com.bytedance.retrofit2.s$c r9 = new com.bytedance.retrofit2.s$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r10[r1] = r0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
            r0[r1] = r8
            r9.<init>(r10, r0)
            return r9
        L_0x00e5:
            int r0 = r3.length
            if (r0 != r2) goto L_0x00fe
            r0 = r3[r1]
            java.lang.reflect.Type r8 = a((java.lang.reflect.Type) r8, (java.lang.Class) r9, (java.lang.reflect.Type) r0)     // Catch:{ Throwable -> 0x0100 }
            r9 = r3[r1]
            if (r8 == r9) goto L_0x00fe
            com.bytedance.retrofit2.s$c r9 = new com.bytedance.retrofit2.s$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            r10[r1] = r8
            java.lang.reflect.Type[] r8 = f21963a
            r9.<init>(r10, r8)
            return r9
        L_0x00fe:
            return r10
        L_0x00ff:
            return r10
        L_0x0100:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.retrofit2.s.a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }
}
