package com.b.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.ServiceManager;
import android.util.Pair;
import android.util.Size;
import android.util.Slog;
import com.b.b.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static a f7430a;

    /* renamed from: d  reason: collision with root package name */
    private static b f7431d;

    /* renamed from: b  reason: collision with root package name */
    public IBinder f7432b;

    /* renamed from: c  reason: collision with root package name */
    public IBinder.DeathRecipient f7433c = new IBinder.DeathRecipient() {
        public final void binderDied() {
            Slog.w("OMediaManager", "omedia server die.");
            if (b.this.f7432b != null) {
                b.this.f7432b.unlinkToDeath(b.this.f7433c, 0);
                b.this.f7432b = null;
            }
            b.f7430a = null;
        }
    };

    private b() {
        c();
    }

    public static b a() {
        if (f7430a == null) {
            synchronized (b.class) {
                if (f7430a == null) {
                    f7431d = new b();
                }
            }
        }
        return f7431d;
    }

    public final String b() {
        if (f7430a == null && !c()) {
            return null;
        }
        try {
            return f7430a.a();
        } catch (RemoteException unused) {
            f7430a = null;
            return null;
        }
    }

    private boolean c() {
        a aVar;
        this.f7432b = ServiceManager.checkService("omedia");
        IBinder iBinder = this.f7432b;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.oppo.omedia.IOMediaService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                aVar = new a.C0051a.C0052a(iBinder);
            } else {
                aVar = (a) queryLocalInterface;
            }
        }
        f7430a = aVar;
        if (aVar == null) {
            return false;
        }
        try {
            this.f7432b.linkToDeath(this.f7433c, 0);
            return true;
        } catch (RemoteException unused) {
            f7430a = null;
            this.f7432b = null;
            return false;
        }
    }

    public final String c(String str) {
        if (f7430a == null && !c()) {
            return null;
        }
        try {
            return f7430a.a(str);
        } catch (RemoteException unused) {
            f7430a = null;
            return null;
        }
    }

    public final boolean a(String str) {
        if (f7430a == null && !c()) {
            return false;
        }
        try {
            return f7430a.b(str);
        } catch (RemoteException unused) {
            f7430a = null;
            return false;
        }
    }

    public final String b(String str) {
        if (f7430a == null && !c()) {
            return null;
        }
        try {
            String a2 = f7430a.a("1.1:2019-03-27", str);
            if (a2 == null) {
                return null;
            }
            return a2 + ":1.1";
        } catch (RemoteException unused) {
            f7430a = null;
            return null;
        }
    }

    private static List<Size> a(String str, String str2) {
        String[] strArr;
        Size size;
        ArrayList arrayList = null;
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
            Slog.w("OMediaManager", "input param is invalid.");
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String str3 = str2 + "StreamSize";
            if (jSONObject.has(str3)) {
                String string = jSONObject.getString(str3);
                if (!string.isEmpty()) {
                    if (string.isEmpty()) {
                        strArr = null;
                    } else {
                        strArr = string.split(",");
                    }
                    if (strArr != null) {
                        if (strArr.length != 0) {
                            for (String str4 : strArr) {
                                if (str4.isEmpty()) {
                                    size = new Size(0, 0);
                                } else {
                                    size = Size.parseSize(str4);
                                }
                                if (size.getHeight() > 0 && size.getWidth() > 0) {
                                    arrayList2.add(size);
                                }
                            }
                        }
                    }
                    Slog.w("OMediaManager", "stream split fail." + string);
                }
            } else {
                Slog.w("OMediaManager", "capabiliyJson:" + jSONObject + "key:" + str3);
            }
            arrayList = arrayList2;
        } catch (JSONException unused) {
            Slog.w("OMediaManager", "got a json exception.");
        } catch (NumberFormatException unused2) {
            Slog.w("OMediaManager", "capablity format is invalid." + str + " " + str2);
        }
        return arrayList;
    }

    private static Pair<Integer, Integer> b(String str, String str2) {
        String[] strArr;
        Pair<Integer, Integer> create = Pair.create(0, 0);
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
            Slog.w("OMediaManager", "input param is invalid.");
            return create;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String str3 = str2 + "StreamCount";
            if (jSONObject.has(str3)) {
                String string = jSONObject.getString(str3);
                if (string.isEmpty()) {
                    strArr = null;
                } else {
                    strArr = string.split(":");
                }
                if (2 == strArr.length) {
                    Integer valueOf = Integer.valueOf(Integer.parseInt(strArr[0]));
                    Integer valueOf2 = Integer.valueOf(Integer.parseInt(strArr[1]));
                    if (valueOf2.intValue() >= valueOf.intValue() && valueOf.intValue() > 0) {
                        create = Pair.create(valueOf, valueOf2);
                    }
                } else {
                    Slog.w("OMediaManager", "capablity format is invalid." + str + " " + str2);
                }
            }
        } catch (JSONException unused) {
            Slog.w("OMediaManager", "capablity format is invalid." + str + " " + str2);
        } catch (NumberFormatException unused2) {
            Slog.w("OMediaManager", "capablity format is invalid." + str + " " + str2);
        }
        return create;
    }

    public static boolean a(String str, String str2, int i) {
        if (str == null || str.isEmpty() || str2.isEmpty()) {
            Slog.w("OMediaManager", "input param is invalid.");
            return false;
        }
        Pair<Integer, Integer> b2 = b(str, str2);
        Integer valueOf = Integer.valueOf(i);
        if (((Integer) b2.first).intValue() <= 0 || ((Integer) b2.second).intValue() <= 0 || valueOf.intValue() < ((Integer) b2.first).intValue() || valueOf.intValue() > ((Integer) b2.second).intValue()) {
            return false;
        }
        return true;
    }

    public static boolean a(String str, String str2, Size size) {
        if (str == null || str.isEmpty() || str2.isEmpty()) {
            Slog.w("OMediaManager", "input param is invalid.");
            return false;
        }
        List<Size> a2 = a(str, str2);
        if (a2 == null || a2.size() == 0) {
            Slog.w("OMediaManager", "feature size is empty.");
            return false;
        }
        for (Size equals : a2) {
            if (size.equals(equals)) {
                return true;
            }
        }
        return false;
    }
}
