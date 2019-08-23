package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle;
import android.support.annotation.Nullable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassesInfoCache {
    static ClassesInfoCache sInstance = new ClassesInfoCache();
    private final Map<Class, CallbackInfo> mCallbackMap = new HashMap();
    private final Map<Class, Boolean> mHasLifecycleMethods = new HashMap();

    static class CallbackInfo {
        final Map<Lifecycle.Event, List<MethodReference>> mEventToHandlers = new HashMap();
        final Map<MethodReference, Lifecycle.Event> mHandlerToEvent;

        CallbackInfo(Map<MethodReference, Lifecycle.Event> map) {
            this.mHandlerToEvent = map;
            for (Map.Entry next : map.entrySet()) {
                Lifecycle.Event event = (Lifecycle.Event) next.getValue();
                List list = this.mEventToHandlers.get(event);
                if (list == null) {
                    list = new ArrayList();
                    this.mEventToHandlers.put(event, list);
                }
                list.add(next.getKey());
            }
        }

        /* access modifiers changed from: package-private */
        public void invokeCallbacks(LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            invokeMethodsForEvent(this.mEventToHandlers.get(event), lifecycleOwner, event, obj);
            invokeMethodsForEvent(this.mEventToHandlers.get(Lifecycle.Event.ON_ANY), lifecycleOwner, event, obj);
        }

        private static void invokeMethodsForEvent(List<MethodReference> list, LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).invokeCallback(lifecycleOwner, event, obj);
                }
            }
        }
    }

    static class MethodReference {
        final int mCallType;
        final Method mMethod;

        public int hashCode() {
            return (this.mCallType * 31) + this.mMethod.getName().hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MethodReference methodReference = (MethodReference) obj;
            if (this.mCallType != methodReference.mCallType || !this.mMethod.getName().equals(methodReference.mMethod.getName())) {
                return false;
            }
            return true;
        }

        MethodReference(int i, Method method) {
            this.mCallType = i;
            this.mMethod = method;
            this.mMethod.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void invokeCallback(android.arch.lifecycle.LifecycleOwner r5, android.arch.lifecycle.Lifecycle.Event r6, java.lang.Object r7) {
            /*
                r4 = this;
                int r0 = r4.mCallType     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                r1 = 1
                r2 = 0
                switch(r0) {
                    case 0: goto L_0x001f;
                    case 1: goto L_0x0015;
                    case 2: goto L_0x0008;
                    default: goto L_0x0007;
                }     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
            L_0x0007:
                goto L_0x0027
            L_0x0008:
                java.lang.reflect.Method r0 = r4.mMethod     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                r3[r2] = r5     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                r3[r1] = r6     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                r0.invoke(r7, r3)     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                goto L_0x0027
            L_0x0015:
                java.lang.reflect.Method r6 = r4.mMethod     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                r0[r2] = r5     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                r6.invoke(r7, r0)     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                goto L_0x0026
            L_0x001f:
                java.lang.reflect.Method r5 = r4.mMethod     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                r5.invoke(r7, r6)     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
            L_0x0026:
                return
            L_0x0027:
                return
            L_0x0028:
                r5 = move-exception
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                r6.<init>(r5)
                throw r6
            L_0x002f:
                r5 = move-exception
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                java.lang.Throwable r5 = r5.getCause()
                java.lang.String r7 = "Failed to call observer method"
                r6.<init>(r7, r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: android.arch.lifecycle.ClassesInfoCache.MethodReference.invokeCallback(android.arch.lifecycle.LifecycleOwner, android.arch.lifecycle.Lifecycle$Event, java.lang.Object):void");
        }
    }

    ClassesInfoCache() {
    }

    private Method[] getDeclaredMethods(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public CallbackInfo getInfo(Class cls) {
        CallbackInfo callbackInfo = this.mCallbackMap.get(cls);
        if (callbackInfo != null) {
            return callbackInfo;
        }
        return createInfo(cls, null);
    }

    /* access modifiers changed from: package-private */
    public boolean hasLifecycleMethods(Class cls) {
        if (this.mHasLifecycleMethods.containsKey(cls)) {
            return this.mHasLifecycleMethods.get(cls).booleanValue();
        }
        Method[] declaredMethods = getDeclaredMethods(cls);
        for (Method annotation : declaredMethods) {
            if (((OnLifecycleEvent) annotation.getAnnotation(OnLifecycleEvent.class)) != null) {
                createInfo(cls, declaredMethods);
                return true;
            }
        }
        this.mHasLifecycleMethods.put(cls, Boolean.FALSE);
        return false;
    }

    private CallbackInfo createInfo(Class cls, @Nullable Method[] methodArr) {
        int i;
        Class<? super T> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            CallbackInfo info = getInfo(superclass);
            if (info != null) {
                hashMap.putAll(info.mHandlerToEvent);
            }
        }
        for (Class info2 : cls.getInterfaces()) {
            for (Map.Entry next : getInfo(info2).mHandlerToEvent.entrySet()) {
                verifyAndPutHandler(hashMap, (MethodReference) next.getKey(), (Lifecycle.Event) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = getDeclaredMethods(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(LifecycleOwner.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                Lifecycle.Event value = onLifecycleEvent.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(Lifecycle.Event.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == Lifecycle.Event.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    verifyAndPutHandler(hashMap, new MethodReference(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        CallbackInfo callbackInfo = new CallbackInfo(hashMap);
        this.mCallbackMap.put(cls, callbackInfo);
        this.mHasLifecycleMethods.put(cls, Boolean.valueOf(z));
        return callbackInfo;
    }

    private void verifyAndPutHandler(Map<MethodReference, Lifecycle.Event> map, MethodReference methodReference, Lifecycle.Event event, Class cls) {
        Lifecycle.Event event2 = map.get(methodReference);
        if (event2 != null && event != event2) {
            Method method = methodReference.mMethod;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
        } else if (event2 == null) {
            map.put(methodReference, event);
        }
    }
}
