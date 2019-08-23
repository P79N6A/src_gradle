package com.ss.android.ugc.aweme.shortvideo;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.i18n.c;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.port.in.am;
import org.json.JSONArray;
import org.json.JSONObject;

public class ek {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67534a;

    /* renamed from: b  reason: collision with root package name */
    public am.a f67535b;

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f67534a, false, 74447, new Class[0], String.class)) {
            return this.f67535b.b();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f67534a, false, 74447, new Class[0], String.class);
    }

    public final int b() {
        if (!PatchProxy.isSupport(new Object[0], this, f67534a, false, 74448, new Class[0], Integer.TYPE)) {
            return this.f67535b.c();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f67534a, false, 74448, new Class[0], Integer.TYPE)).intValue();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f67534a, false, 74451, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67534a, false, 74451, new Class[0], Void.TYPE);
            return;
        }
        this.f67535b.a();
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f67534a, false, 74452, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f67534a, false, 74452, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f67535b.d().getVisibility() == 0 && !c.a() && this.f67535b.d().getVisibility() == 0) {
            r.onEvent(MobClick.obtain().setEventName("fans_power_show").setLabelName("edit_page").setJsonObject(new com.ss.android.ugc.aweme.app.d.c().a("shoot_way", str).b()));
        }
    }

    private ek(Fragment fragment, View view) {
        this.f67535b = a.l.a(fragment.getActivity());
        this.f67535b.a(fragment);
        ((LinearLayout) view.findViewById(C0906R.id.cyk)).addView(this.f67535b.d());
    }

    public static ek a(Fragment fragment, View view) {
        Fragment fragment2 = fragment;
        View view2 = view;
        if (!PatchProxy.isSupport(new Object[]{fragment2, view2}, null, f67534a, true, 74446, new Class[]{Fragment.class, View.class}, ek.class)) {
            return new ek(fragment2, view2);
        }
        return (ek) PatchProxy.accessDispatch(new Object[]{fragment2, view2}, null, f67534a, true, 74446, new Class[]{Fragment.class, View.class}, ek.class);
    }

    public final void a(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f67534a, false, 74453, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f67534a, false, 74453, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
        } else if (!c.a() && !TextUtils.isEmpty(str)) {
            JSONArray jSONArray = new JSONArray();
            String[] split = str2.split(";");
            if (split.length > 0) {
                try {
                    for (String parseInt : split) {
                        int parseInt2 = Integer.parseInt(parseInt);
                        if (parseInt2 == 0) {
                            jSONArray.put("hotsoon");
                        }
                        if (parseInt2 == 1) {
                            jSONArray.put("toutiao");
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (jSONArray.length() > 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("to_app", jSONArray);
                    jSONObject.put("is_photo", String.valueOf(i));
                    r.onEvent(MobClick.obtain().setEventName("sync_content").setLabelName("edit_page").setJsonObject(jSONObject));
                } catch (Exception unused2) {
                }
            }
        }
    }

    public final void a(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f67534a, false, 74450, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f67534a, false, 74450, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        this.f67535b.a(i3, i4, intent2);
        if (i3 == 2 && i4 == -1 && intent2 != null) {
            int intExtra = intent2.getIntExtra("extra.PERMISSION", 0);
            if (c.a()) {
                this.f67535b.a(intExtra);
            }
        }
    }
}
