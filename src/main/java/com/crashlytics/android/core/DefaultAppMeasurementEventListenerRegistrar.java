package com.crashlytics.android.core;

import android.content.Context;
import android.os.Bundle;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class DefaultAppMeasurementEventListenerRegistrar implements AppMeasurementEventListenerRegistrar {
    private static final List<Class<?>> ONEVENT_EXPECTED_ARGTYPES = Collections.unmodifiableList(Arrays.asList(new Class[]{String.class, String.class, Bundle.class, Long.class}));
    public final CrashlyticsCore crashlyticsCore;
    private Object eventListenerProxy;

    public boolean register() {
        Class<?> cls = getClass("com.google.android.gms.measurement.AppMeasurement");
        if (cls == null) {
            return false;
        }
        Object instance = getInstance(cls);
        if (instance == null) {
            return false;
        }
        Class<?> cls2 = getClass("com.google.android.gms.measurement.AppMeasurement$OnEventListener");
        if (cls2 == null) {
            return false;
        }
        try {
            cls.getDeclaredMethod("registerOnMeasurementEventListener", new Class[]{cls2}).invoke(instance, new Object[]{getOnEventListenerProxy(cls2)});
        } catch (NoSuchMethodException unused) {
            return false;
        } catch (Exception e2) {
            new StringBuilder("Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: ").append(e2.getMessage());
        }
        return true;
    }

    public DefaultAppMeasurementEventListenerRegistrar(CrashlyticsCore crashlyticsCore2) {
        this.crashlyticsCore = crashlyticsCore2;
    }

    private Class<?> getClass(String str) {
        try {
            return this.crashlyticsCore.context.getClassLoader().loadClass(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private Object getInstance(Class<?> cls) {
        try {
            return cls.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(cls, new Object[]{this.crashlyticsCore.context});
        } catch (Exception unused) {
            return null;
        }
    }

    static boolean validateOnEventArgTypes(Object[] objArr) {
        if (objArr.length != ONEVENT_EXPECTED_ARGTYPES.size()) {
            return false;
        }
        Iterator<Class<?>> it2 = ONEVENT_EXPECTED_ARGTYPES.iterator();
        for (Object obj : objArr) {
            if (!obj.getClass().equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public synchronized Object getOnEventListenerProxy(Class cls) {
        if (this.eventListenerProxy == null) {
            this.eventListenerProxy = Proxy.newProxyInstance(this.crashlyticsCore.context.getClassLoader(), new Class[]{cls}, new InvocationHandler() {
                public boolean equalsImpl(Object obj, Object obj2) {
                    if (obj == obj2) {
                        return true;
                    }
                    if (obj2 == null || !Proxy.isProxyClass(obj2.getClass()) || !super.equals(Proxy.getInvocationHandler(obj2))) {
                        return false;
                    }
                    return true;
                }

                public Object invoke(Object obj, Method method, Object[] objArr) {
                    String name = method.getName();
                    if (objArr == null) {
                        objArr = new Object[0];
                    }
                    if (objArr.length == 1 && name.equals("equals")) {
                        return Boolean.valueOf(equalsImpl(obj, objArr[0]));
                    }
                    if (objArr.length == 0 && name.equals("hashCode")) {
                        return Integer.valueOf(super.hashCode());
                    }
                    if (objArr.length == 0 && name.equals("toString")) {
                        return super.toString();
                    }
                    if (objArr.length == 4 && name.equals("onEvent") && DefaultAppMeasurementEventListenerRegistrar.validateOnEventArgTypes(objArr)) {
                        String str = (String) objArr[0];
                        String str2 = (String) objArr[1];
                        Bundle bundle = (Bundle) objArr[2];
                        if (str != null && !str.equals("crash")) {
                            DefaultAppMeasurementEventListenerRegistrar.writeEventToUserLog(DefaultAppMeasurementEventListenerRegistrar.this.crashlyticsCore, str2, bundle);
                            return null;
                        }
                    }
                    StringBuilder sb = new StringBuilder("Unexpected method invoked on AppMeasurement.EventListener: " + name + "(");
                    for (int i = 0; i < objArr.length; i++) {
                        if (i > 0) {
                            sb.append(", ");
                        }
                        sb.append(objArr[i].getClass().getName());
                    }
                    sb.append("); returning null");
                    return null;
                }
            });
        }
        return this.eventListenerProxy;
    }

    private static String serializeEvent(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put(PushConstants.PARAMS, jSONObject2);
        return jSONObject.toString();
    }

    public static void writeEventToUserLog(CrashlyticsCore crashlyticsCore2, String str, Bundle bundle) {
        try {
            crashlyticsCore2.log("$A$:" + serializeEvent(str, bundle));
        } catch (JSONException unused) {
            new StringBuilder("Unable to serialize Firebase Analytics event; ").append(str);
        }
    }
}
