package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;
import kotlin.SinceKotlin;
import kotlin.collections.ArraysKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.d;
import kotlin.reflect.f;
import kotlin.reflect.g;
import kotlin.reflect.h;
import kotlin.reflect.i;
import kotlin.reflect.j;

public class Reflection {
    private static final KClass[] EMPTY_K_CLASS_ARRAY = new KClass[0];
    private static final x factory;

    public static d function(FunctionReference functionReference) {
        return functionReference;
    }

    public static f mutableProperty0(s sVar) {
        return sVar;
    }

    public static KMutableProperty1 mutableProperty1(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public static g mutableProperty2(t tVar) {
        return tVar;
    }

    public static KProperty0 property0(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public static KProperty1 property1(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public static h property2(w wVar) {
        return wVar;
    }

    static {
        x xVar = null;
        try {
            xVar = (x) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (xVar == null) {
            xVar = new x();
        }
        factory = xVar;
    }

    public static KClass createKotlinClass(Class cls) {
        return new n(cls);
    }

    public static KClass getOrCreateKotlinClass(Class cls) {
        return new n(cls);
    }

    @SinceKotlin
    public static String renderLambdaToString(Lambda lambda) {
        x xVar = factory;
        return x.a(lambda);
    }

    @SinceKotlin
    public static i nullableTypeOf(Class cls) {
        return x.a(getOrCreateKotlinClass(cls), Collections.emptyList(), true);
    }

    @SinceKotlin
    public static String renderLambdaToString(q qVar) {
        return x.a(qVar);
    }

    @SinceKotlin
    public static i typeOf(Class cls) {
        return x.a(getOrCreateKotlinClass(cls), Collections.emptyList(), false);
    }

    public static KClass[] getOrCreateKotlinClasses(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return EMPTY_K_CLASS_ARRAY;
        }
        KClass[] kClassArr = new KClass[length];
        for (int i = 0; i < length; i++) {
            kClassArr[i] = getOrCreateKotlinClass(clsArr[i]);
        }
        return kClassArr;
    }

    public static KDeclarationContainer getOrCreateKotlinPackage(Class cls, String str) {
        return new u(cls, str);
    }

    public static KClass createKotlinClass(Class cls, String str) {
        return new n(cls);
    }

    public static KClass getOrCreateKotlinClass(Class cls, String str) {
        return new n(cls);
    }

    @SinceKotlin
    public static i nullableTypeOf(Class cls, j jVar) {
        return x.a(getOrCreateKotlinClass(cls), Collections.singletonList(jVar), true);
    }

    @SinceKotlin
    public static i typeOf(Class cls, j jVar) {
        return x.a(getOrCreateKotlinClass(cls), Collections.singletonList(jVar), false);
    }

    @SinceKotlin
    public static i nullableTypeOf(Class cls, j... jVarArr) {
        return x.a(getOrCreateKotlinClass(cls), ArraysKt.toList((T[]) jVarArr), true);
    }

    @SinceKotlin
    public static i typeOf(Class cls, j... jVarArr) {
        return x.a(getOrCreateKotlinClass(cls), ArraysKt.toList((T[]) jVarArr), false);
    }

    @SinceKotlin
    public static i nullableTypeOf(Class cls, j jVar, j jVar2) {
        return x.a(getOrCreateKotlinClass(cls), Arrays.asList(new j[]{jVar, jVar2}), true);
    }

    @SinceKotlin
    public static i typeOf(Class cls, j jVar, j jVar2) {
        return x.a(getOrCreateKotlinClass(cls), Arrays.asList(new j[]{jVar, jVar2}), false);
    }
}
