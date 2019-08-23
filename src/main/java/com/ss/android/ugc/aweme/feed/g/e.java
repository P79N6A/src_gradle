package com.ss.android.ugc.aweme.feed.g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.adapter.p;
import com.ss.android.ugc.aweme.festival.christmas.a;
import com.ss.android.ugc.aweme.setting.model.ActivityStruct;
import java.util.Map;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45352a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final int f45353b = 2131169954;
    @SuppressLint({"CI_StaticFieldLeak"})

    /* renamed from: c  reason: collision with root package name */
    private static volatile e f45354c;

    /* renamed from: d  reason: collision with root package name */
    private ActivityStruct f45355d;

    /* renamed from: e  reason: collision with root package name */
    private Context f45356e = d.a();

    private static String a(int i) {
        switch (i) {
            case 0:
                return "like_highlight_click";
            case 1:
                return "comment_highlight_click";
            case 2:
                return "share_highlight_click";
            default:
                return "";
        }
    }

    private e() {
    }

    private String b() {
        if (this.f45355d == null) {
            return "";
        }
        return this.f45355d.name;
    }

    public static e a() {
        if (PatchProxy.isSupport(new Object[0], null, f45352a, true, 41311, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], null, f45352a, true, 41311, new Class[0], e.class);
        }
        if (f45354c == null) {
            synchronized (e.class) {
                if (f45354c == null) {
                    f45354c = new e();
                }
            }
        }
        return f45354c;
    }

    private static boolean a(ImageView imageView) {
        ImageView imageView2 = imageView;
        if (PatchProxy.isSupport(new Object[]{imageView2}, null, f45352a, true, 41326, new Class[]{ImageView.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{imageView2}, null, f45352a, true, 41326, new Class[]{ImageView.class}, Boolean.TYPE)).booleanValue();
        }
        Boolean bool = (Boolean) imageView2.getTag(f45353b);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static void a(String str, String str2, p pVar) {
        if (PatchProxy.isSupport(new Object[]{str, str2, pVar}, null, f45352a, true, 41335, new Class[]{String.class, String.class, p.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, pVar}, null, f45352a, true, 41335, new Class[]{String.class, String.class, p.class}, Void.TYPE);
            return;
        }
        if (a.b() && !TextUtils.equals(str, str2) && pVar != null) {
            pVar.H();
        }
    }

    public final void a(ImageView imageView, String str, String str2, String str3) {
        if (PatchProxy.isSupport(new Object[]{imageView, str, str2, str3}, this, f45352a, false, 41328, new Class[]{ImageView.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {imageView, str, str2, str3};
            PatchProxy.accessDispatch(objArr, this, f45352a, false, 41328, new Class[]{ImageView.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        a(imageView, 1, str, str2, str3, null);
    }

    public void a(ImageView imageView, int i, String str, String str2, String str3, Boolean bool) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{imageView, Integer.valueOf(i), str4, str5, str6, bool}, this, f45352a, false, 41330, new Class[]{ImageView.class, Integer.TYPE, String.class, String.class, String.class, Boolean.class}, Void.TYPE)) {
            Object[] objArr = {imageView, Integer.valueOf(i), str4, str5, str6, bool};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f45352a, false, 41330, new Class[]{ImageView.class, Integer.TYPE, String.class, String.class, String.class, Boolean.class}, Void.TYPE);
        } else if (a(imageView)) {
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", str4).a("group_id", str5).a("author_id", str6).a("show_content", b());
            if (i == 2) {
                a2.a("is_pop_up", bool.booleanValue() ? 1 : 0);
            }
            r.a(a(i), (Map) a2.f34114b);
        }
    }
}
