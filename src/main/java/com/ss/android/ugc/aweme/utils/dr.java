package com.ss.android.ugc.aweme.utils;

import a.i;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.net.a.j;
import com.ss.android.ugc.aweme.net.a.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class dr {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75762a;

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f75763b = {"uid", "user_id", "author_id", "target_user_ud", "push_user_id", "share_user_id", "star_uid"};
    private static volatile dr g;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference<Activity> f75764c;

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f75765d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public int f75766e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f75767f;
    private final ConcurrentHashMap<String, String> h = new ConcurrentHashMap<>();
    private int i = 1024;
    private int j = 1;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f75762a, false, 88537, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75762a, false, 88537, new Class[0], Void.TYPE);
            return;
        }
        if (this.f75767f) {
            a(true, "你正在企图打开UserProfile页，但并没有传递secUid，这是不被允许的。\n如何传递请参考：https://bytedance.feishu.cn/space/doc/doccnl8ioZLuwJM6Xhm4uBJ78og");
        }
    }

    private dr() {
        if (PatchProxy.isSupport(new Object[0], this, f75762a, false, 88542, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75762a, false, 88542, new Class[0], Void.TYPE);
        } else if (a.a()) {
            q.a().f56880b.f56867b.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f75773a;

                public final void onActivityPaused(Activity activity) {
                }

                public final void onActivityResumed(Activity activity) {
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                public final void onActivityStarted(Activity activity) {
                }

                public final void onActivityStopped(Activity activity) {
                }

                public final void onActivityDestroyed(Activity activity) {
                    if (PatchProxy.isSupport(new Object[]{activity}, this, f75773a, false, 88547, new Class[]{Activity.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{activity}, this, f75773a, false, 88547, new Class[]{Activity.class}, Void.TYPE);
                        return;
                    }
                    dr.this.f75765d.remove(activity.getLocalClassName());
                }

                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    if (PatchProxy.isSupport(new Object[]{activity, bundle}, this, f75773a, false, 88546, new Class[]{Activity.class, Bundle.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{activity, bundle}, this, f75773a, false, 88546, new Class[]{Activity.class, Bundle.class}, Void.TYPE);
                        return;
                    }
                    dr.this.f75765d.add(activity.getLocalClassName());
                    dr.this.f75764c = new WeakReference<>(activity);
                }
            });
        }
        this.f75767f = a.a();
    }

    public static dr a() {
        if (PatchProxy.isSupport(new Object[0], null, f75762a, true, 88532, new Class[0], dr.class)) {
            return (dr) PatchProxy.accessDispatch(new Object[0], null, f75762a, true, 88532, new Class[0], dr.class);
        }
        if (g == null) {
            synchronized (dr.class) {
                if (g == null) {
                    g = new dr();
                }
            }
        }
        return g;
    }

    public final String c() {
        if (PatchProxy.isSupport(new Object[0], this, f75762a, false, 88541, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f75762a, false, 88541, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        for (int size = this.f75765d.size() - 1; size >= 0; size--) {
            sb.append("\n");
            sb.append(this.f75765d.get(size));
        }
        return sb.toString();
    }

    private void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f75762a, false, 88538, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f75762a, false, 88538, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f75767f) {
            a(false, "你正在企图添加一个uid(" + str + ")到secUid的映射，但secUid是空，这是不被允许的。\n这可能是你主动调用的，也可能是网络数据返回的，请检查你的代码。");
        }
    }

    private void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f75762a, false, 88539, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f75762a, false, 88539, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f75767f) {
            a(false, "你正在企图取出一个uid(" + str + ")到secUid的映射，但并没有取到或取到一个空串，这是不被允许的。\n这可能是你主动调用的，也可能是网络数据返回的，请检查你的代码。");
        }
    }

    public final String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f75762a, false, 88534, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f75762a, false, 88534, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str) || TextUtils.equals(PushConstants.PUSH_TYPE_NOTIFY, str2) || TextUtils.equals("-1", str2)) {
            return null;
        } else {
            String str3 = this.h.get(str2);
            if (TextUtils.isEmpty(str3)) {
                c(str);
            }
            StringBuilder sb = new StringBuilder("SecUidManager----->get: key:");
            sb.append(str2);
            sb.append(", value:");
            sb.append(str3);
            return str3;
        }
    }

    private void a(boolean z, final String str) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str}, this, f75762a, false, 88540, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str}, this, f75762a, false, 88540, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.framework.core.a.b().f3306d && z) {
            throw new IllegalArgumentException(str + "\n如有疑问请飞书联系黄凌毓" + c());
        } else if (a.a() && z && this.f75764c != null && this.f75764c.get() != null) {
            i.a((Callable<TResult>) new Callable<Object>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f75768a;

                public final Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f75768a, false, 88543, new Class[0], Object.class)) {
                        return PatchProxy.accessDispatch(new Object[0], this, f75768a, false, 88543, new Class[0], Object.class);
                    }
                    if (!(dr.this.f75764c == null || dr.this.f75764c.get() == null)) {
                        AlertDialog.Builder message = new AlertDialog.Builder(com.ss.android.ugc.aweme.framework.core.a.b().a()).setMessage(str + "\n如有疑问请飞书联系黄凌毓" + dr.this.c());
                        if (dr.this.f75766e < 7) {
                            message.setTitle("非法错误").setCancelable(true).setPositiveButton("好的，知道了，一会儿去联系", null);
                        } else if (dr.this.f75766e < 20) {
                            message.setTitle("我已经提示你好多次了呢～").setCancelable(false).setPositiveButton("好的，现在立即就去联系 黄凌毓", new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f75771a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f75771a, false, 88544, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f75771a, false, 88544, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    dialogInterface.dismiss();
                                }
                            });
                        } else {
                            message.setTitle("-->>律师函警告<<--").setCancelable(false);
                            Toast makeText = Toast.makeText(GlobalContext.getContext(), "杀进程冷启动才能恢复", 1);
                            if (PatchProxy.isSupport(new Object[]{makeText}, null, ds.f75775a, true, 88545, new Class[]{Toast.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{makeText}, null, ds.f75775a, true, 88545, new Class[]{Toast.class}, Void.TYPE);
                            } else {
                                if (Build.VERSION.SDK_INT == 25) {
                                    eq.a(makeText);
                                }
                                makeText.show();
                            }
                        }
                        message.show();
                        dr.this.f75766e++;
                    }
                    return null;
                }
            }, i.f1052b);
        }
    }

    public final void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f75762a, false, 88533, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f75762a, false, 88533, new Class[]{String.class, String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str) && !TextUtils.equals(PushConstants.PUSH_TYPE_NOTIFY, str) && !TextUtils.equals("-1", str)) {
            if (TextUtils.isEmpty(str2)) {
                b(str);
                return;
            }
            StringBuilder sb = new StringBuilder("SecUidManager----->put: key:");
            sb.append(str);
            sb.append(", value:");
            sb.append(str2);
            this.h.put(str, str2);
            int size = this.h.size();
            if (j.a() != null && size >= this.i && size >= j.a().r) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("map_size", size);
                    int i2 = this.j;
                    this.j = i2 + 1;
                    jSONObject.put("report_count", i2);
                } catch (JSONException unused) {
                }
                n.b("aweme_secuid_map_size", "aweme_secuid_map_size", jSONObject);
                this.i *= 2;
            }
        }
    }
}
