package com.ss.android.ugc.aweme.ag;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33222a;

    /* renamed from: b  reason: collision with root package name */
    public String f33223b;

    /* renamed from: c  reason: collision with root package name */
    public b f33224c;

    /* renamed from: d  reason: collision with root package name */
    private Context f33225d;

    /* renamed from: e  reason: collision with root package name */
    private Class<? extends Activity> f33226e;

    public final boolean a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f33222a, false, 70913, new Class[]{String.class}, Boolean.TYPE)) {
            return b((Activity) null, str2, (View) null);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f33222a, false, 70913, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    private void a(Intent intent, String str) {
        Map map;
        Intent intent2 = intent;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{intent2, str2}, this, f33222a, false, 70919, new Class[]{Intent.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2, str2}, this, f33222a, false, 70919, new Class[]{Intent.class, String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{str2}, null, k.f33252a, true, 70977, new Class[]{String.class}, Map.class)) {
            map = (Map) PatchProxy.accessDispatch(new Object[]{str2}, null, k.f33252a, true, 70977, new Class[]{String.class}, Map.class);
        } else if (TextUtils.isEmpty(str)) {
            map = new HashMap();
        } else {
            Uri parse = Uri.parse(str);
            HashMap hashMap = new HashMap();
            for (String next : parse.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(parse.getQueryParameter(next))) {
                    hashMap.put(next, next);
                }
            }
            map = hashMap;
        }
        for (String str3 : map.keySet()) {
            b(intent2, str3, k.b(str2, (String) map.get(str3)));
        }
    }

    public final boolean a(Activity activity, String str) {
        Activity activity2 = activity;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{activity2, str2}, this, f33222a, false, 70914, new Class[]{Activity.class, String.class}, Boolean.TYPE)) {
            return b(activity2, str2, (View) null);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str2}, this, f33222a, false, 70914, new Class[]{Activity.class, String.class}, Boolean.TYPE)).booleanValue();
    }

    public a(Context context, String str, Class<? extends Activity> cls) {
        this.f33225d = context;
        this.f33223b = str;
        this.f33226e = cls;
    }

    private void a(Intent intent, String str, String str2) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2, str, str2}, this, f33222a, false, 70917, new Class[]{Intent.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2, str, str2}, this, f33222a, false, 70917, new Class[]{Intent.class, String.class, String.class}, Void.TYPE);
            return;
        }
        List a2 = k.a(str);
        List a3 = k.a(str2);
        int size = a2.size();
        for (int i = 1; i < size; i++) {
            if (i < size) {
                intent2.putExtra(((String) a2.get(i)).substring(1), (String) a3.get(i));
            }
        }
    }

    private boolean b(Activity activity, String str, View view) {
        Context context;
        Activity activity2 = activity;
        String str2 = str;
        View view2 = view;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{activity2, str2, view2}, this, f33222a, false, 70916, new Class[]{Activity.class, String.class, View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str2, view2}, this, f33222a, false, 70916, new Class[]{Activity.class, String.class, View.class}, Boolean.TYPE)).booleanValue();
        }
        if (activity2 != null) {
            context = activity2;
        } else {
            context = this.f33225d;
        }
        if (context == null) {
            return false;
        }
        Intent intent = new Intent(context, this.f33226e);
        a(intent, this.f33223b, str2);
        a(intent, str2);
        h.a().f2591d.a();
        if (activity2 == null) {
            intent.addFlags(268435456);
        }
        if (this.f33224c == null) {
            if (view2 == null) {
                context.startActivity(intent);
            } else {
                ActivityCompat.startActivity(activity2, intent, ActivityOptionsCompat.makeScaleUpAnimation(view2, view.getWidth() / 2, view.getHeight() / 2, 0, 0).toBundle());
            }
            return true;
        }
        int i = this.f33224c.f33231e;
        intent.addFlags(this.f33224c.f33230d);
        if (i == 0) {
            context.startActivity(intent);
        } else if (1 != i || activity2 == null) {
            z = false;
        } else {
            activity2.startActivityForResult(intent, this.f33224c.f33229c);
        }
        if (!(activity2 == null || this.f33224c.f33227a == -1 || this.f33224c.f33228b == -1)) {
            activity2.overridePendingTransition(this.f33224c.f33227a, this.f33224c.f33228b);
        }
        return z;
    }

    private void b(Intent intent, String str, String str2) {
        Intent intent2 = intent;
        String str3 = str;
        String str4 = str2;
        int i = 3;
        if (PatchProxy.isSupport(new Object[]{intent2, str3, str4}, this, f33222a, false, 70918, new Class[]{Intent.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2, str3, str4}, this, f33222a, false, 70918, new Class[]{Intent.class, String.class, String.class}, Void.TYPE);
            return;
        }
        f fVar = h.a().f2591d;
        if (fVar != null) {
            if (PatchProxy.isSupport(new Object[]{str3}, fVar, f.f33242a, false, 70937, new Class[]{String.class}, Integer.TYPE)) {
                f fVar2 = fVar;
                i = ((Integer) PatchProxy.accessDispatch(new Object[]{str3}, fVar2, f.f33242a, false, 70937, new Class[]{String.class}, Integer.TYPE)).intValue();
            } else if (f.a(fVar.f33243b, str3)) {
                i = 1;
            } else if (f.a(fVar.f33244c, str3)) {
                i = 2;
            } else if (!f.a(fVar.f33245d, str3)) {
                if (f.a(fVar.f33246e, str3)) {
                    i = 4;
                } else if (f.a(fVar.f33247f, str3)) {
                    i = 5;
                } else if (f.a(fVar.g, str3)) {
                    i = 6;
                } else if (f.a(fVar.h, str3)) {
                    i = 7;
                } else if (f.a(fVar.i, str3)) {
                    i = 8;
                } else if (f.a(fVar.j, str3)) {
                    i = 0;
                } else {
                    i = -1;
                }
            }
            switch (i) {
                case 1:
                    intent2.putExtra(str3, Integer.parseInt(str2));
                    return;
                case 2:
                    intent2.putExtra(str3, Long.parseLong(str2));
                    return;
                case 3:
                    intent2.putExtra(str3, Boolean.parseBoolean(str2));
                    return;
                case 4:
                    intent2.putExtra(str3, Short.parseShort(str2));
                    return;
                case 5:
                    intent2.putExtra(str3, Float.parseFloat(str2));
                    return;
                case 6:
                    intent2.putExtra(str3, Double.parseDouble(str2));
                    return;
                case e.l /*?: ONE_ARG  (7 int)*/:
                    intent2.putExtra(str3, Byte.parseByte(str2));
                    return;
                case 8:
                    intent2.putExtra(str3, str4.charAt(0));
                    return;
                default:
                    intent.putExtra(str, str2);
                    return;
            }
        }
    }

    public final boolean a(Activity activity, String str, View view) {
        if (!PatchProxy.isSupport(new Object[]{activity, str, view}, this, f33222a, false, 70915, new Class[]{Activity.class, String.class, View.class}, Boolean.TYPE)) {
            return b(activity, str, view);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity, str, view}, this, f33222a, false, 70915, new Class[]{Activity.class, String.class, View.class}, Boolean.TYPE)).booleanValue();
    }
}
