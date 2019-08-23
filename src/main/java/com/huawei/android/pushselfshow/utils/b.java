package com.huawei.android.pushselfshow.utils;

import android.content.Context;
import com.huawei.android.pushagent.utils.a.e;
import java.lang.reflect.InvocationTargetException;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f25368a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f25369b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f25370c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f25371d;

    b(Context context, String str, String str2, String str3) {
        this.f25368a = context;
        this.f25369b = str;
        this.f25370c = str2;
        this.f25371d = str3;
    }

    public final void run() {
        String str;
        String str2;
        try {
            if (!a.m(this.f25368a)) {
                e.a("PushSelfShowLog", "not allowed to sendHiAnalytics!");
                return;
            }
            StringBuffer stringBuffer = new StringBuffer(String.valueOf(a.a()));
            stringBuffer.append("|PS");
            stringBuffer.append("|");
            stringBuffer.append(a.b(this.f25368a));
            stringBuffer.append("|");
            stringBuffer.append(this.f25369b);
            stringBuffer.append("|");
            stringBuffer.append(this.f25370c);
            stringBuffer.append("|");
            stringBuffer.append(a.a(this.f25368a));
            stringBuffer.append("|");
            stringBuffer.append(this.f25371d);
            String stringBuffer2 = stringBuffer.toString();
            if (this.f25368a != null) {
                e.b("PushSelfShowLog", "run normal sendHiAnalytics");
                Class<?> cls = Class.forName("com.hianalytics.android.v1.HiAnalytics");
                cls.getMethod("onEvent", new Class[]{Context.class, String.class, String.class}).invoke(cls, new Object[]{this.f25368a, "PUSH_PS", stringBuffer2});
                cls.getMethod("onReport", new Class[]{Context.class}).invoke(cls, new Object[]{this.f25368a});
                e.a("PushSelfShowLog", "send HiAnalytics msg, report cmd =" + this.f25371d + ", msgid = " + this.f25369b + ", eventId = " + this.f25370c);
                return;
            }
            e.a("PushSelfShowLog", "send HiAnalytics msg, report cmd =" + this.f25371d + ",context = " + this.f25368a);
        } catch (IllegalAccessException e2) {
            e = e2;
            str = "PushSelfShowLog";
            str2 = "sendHiAnalytics IllegalAccessException ";
            e.d(str, str2, e);
        } catch (IllegalArgumentException e3) {
            e = e3;
            str = "PushSelfShowLog";
            str2 = "sendHiAnalytics IllegalArgumentException ";
            e.d(str, str2, e);
        } catch (InvocationTargetException e4) {
            e = e4;
            str = "PushSelfShowLog";
            str2 = "sendHiAnalytics InvocationTargetException";
            e.d(str, str2, e);
        } catch (NoSuchMethodException e5) {
            e = e5;
            str = "PushSelfShowLog";
            str2 = "sendHiAnalytics NoSuchMethodException";
            e.d(str, str2, e);
        } catch (ClassNotFoundException e6) {
            e.d("PushSelfShowLog", "sendHiAnalytics ClassNotFoundException", e6);
        }
    }
}
