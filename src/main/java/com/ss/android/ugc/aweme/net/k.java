package com.ss.android.ugc.aweme.net;

import com.facebook.common.logging.b;
import com.google.a.a.a.a.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONObject;

public final class k implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56990a;

    /* renamed from: c  reason: collision with root package name */
    private static final k f56991c = new k();

    /* renamed from: b  reason: collision with root package name */
    public String f56992b = "unknown";

    /* renamed from: d  reason: collision with root package name */
    private int f56993d = 5;

    public static k b() {
        return f56991c;
    }

    public final int a() {
        return this.f56993d;
    }

    public final void a(String str, String str2, Throwable th) {
        String str3 = str;
        String str4 = str2;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{str3, str4, th2}, this, f56990a, false, 60715, new Class[]{String.class, String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, th2}, this, f56990a, false, 60715, new Class[]{String.class, String.class, Throwable.class}, Void.TYPE);
            return;
        }
        a(2, str3, str4, th2);
    }

    private k() {
    }

    public final void a(int i) {
        this.f56993d = i;
    }

    public final boolean b(int i) {
        if (this.f56993d <= i) {
            return true;
        }
        return false;
    }

    private static String b(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, null, f56990a, true, 60733, new Class[]{Throwable.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{th2}, null, f56990a, true, 60733, new Class[]{Throwable.class}, String.class);
        } else if (th2 == null) {
            return "";
        } else {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            try {
                a.a(th2, printWriter);
                return stringWriter.toString();
            } finally {
                printWriter.close();
            }
        }
    }

    private static boolean a(CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{charSequence}, null, f56990a, true, 60729, new Class[]{CharSequence.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{charSequence}, null, f56990a, true, 60729, new Class[]{CharSequence.class}, Boolean.TYPE)).booleanValue();
        } else if (charSequence == null || charSequence.length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, null, f56990a, true, 60730, new Class[]{Throwable.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{th}, null, f56990a, true, 60730, new Class[]{Throwable.class}, Boolean.TYPE)).booleanValue();
        } else if (th == null || th.getMessage() == null || th.getMessage().length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public final void c(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f56990a, false, 60718, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f56990a, false, 60718, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        a(4, str3, str4);
    }

    public final void d(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f56990a, false, 60720, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f56990a, false, 60720, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        a(5, str3, str4);
    }

    public final void e(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f56990a, false, 60722, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f56990a, false, 60722, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        a(6, str3, str4);
    }

    public final void f(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f56990a, false, 60724, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f56990a, false, 60724, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        a(6, str3, str4);
    }

    public final void b(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f56990a, false, 60716, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f56990a, false, 60716, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        a(3, str3, str4);
    }

    public final void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f56990a, false, 60714, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f56990a, false, 60714, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        a(2, str3, str4);
    }

    private void a(int i, String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, str2}, this, f56990a, false, 60727, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, str2}, this, f56990a, false, 60727, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        if (!a((CharSequence) str)) {
            a((CharSequence) str2);
        }
    }

    public final void c(String str, String str2, Throwable th) {
        String str3 = str;
        String str4 = str2;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{str3, str4, th2}, this, f56990a, false, 60719, new Class[]{String.class, String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, th2}, this, f56990a, false, 60719, new Class[]{String.class, String.class, Throwable.class}, Void.TYPE);
            return;
        }
        a(4, str3, str4, th2);
    }

    public final void d(String str, String str2, Throwable th) {
        String str3 = str;
        String str4 = str2;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{str3, str4, th2}, this, f56990a, false, 60721, new Class[]{String.class, String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, th2}, this, f56990a, false, 60721, new Class[]{String.class, String.class, Throwable.class}, Void.TYPE);
            return;
        }
        a(5, str3, str4, th2);
        if (th2 instanceof IllegalStateException) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!a((CharSequence) str2)) {
                    jSONObject.put("errorField", str4);
                }
                jSONObject.put("errorDesc", b(th));
                jSONObject.put("status", 1);
                n.a("aweme_image_error_log", jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    public final void e(String str, String str2, Throwable th) {
        String str3 = str;
        String str4 = str2;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{str3, str4, th2}, this, f56990a, false, 60723, new Class[]{String.class, String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, th2}, this, f56990a, false, 60723, new Class[]{String.class, String.class, Throwable.class}, Void.TYPE);
            return;
        }
        a(6, str3, str4, th2);
    }

    public final void f(String str, String str2, Throwable th) {
        String str3 = str;
        String str4 = str2;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{str3, str4, th2}, this, f56990a, false, 60725, new Class[]{String.class, String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, th2}, this, f56990a, false, 60725, new Class[]{String.class, String.class, Throwable.class}, Void.TYPE);
            return;
        }
        a(6, str3, str4, th2);
    }

    public final void b(String str, String str2, Throwable th) {
        String str3 = str;
        String str4 = str2;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{str3, str4, th2}, this, f56990a, false, 60717, new Class[]{String.class, String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, th2}, this, f56990a, false, 60717, new Class[]{String.class, String.class, Throwable.class}, Void.TYPE);
            return;
        }
        a(3, str3, str4, th2);
    }

    private void a(int i, String str, String str2, Throwable th) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, str2, th}, this, f56990a, false, 60728, new Class[]{Integer.TYPE, String.class, String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, str2, th}, this, f56990a, false, 60728, new Class[]{Integer.TYPE, String.class, String.class, Throwable.class}, Void.TYPE);
            return;
        }
        if (!a((CharSequence) str) && !a((CharSequence) str2)) {
            a(th);
        }
    }
}
