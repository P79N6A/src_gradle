package com.ss.android.ugc.aweme.poi.preview;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.poi.preview.b.b;
import com.ss.android.ugc.aweme.poi.preview.b.c;
import com.ss.android.ugc.aweme.poi.preview.transfer.g;
import com.ss.android.ugc.aweme.poi.preview.transfer.j;
import com.ss.android.ugc.aweme.u.aa;
import java.util.HashMap;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60117a;

    /* renamed from: b  reason: collision with root package name */
    protected g f60118b;

    /* renamed from: c  reason: collision with root package name */
    protected j f60119c;

    public final void a(Context context, List<String> list, List<String> list2, List<String> list3, RecyclerView recyclerView, int i, String str, String str2, HashMap<String, String> hashMap) {
        List<String> list4 = list;
        List<String> list5 = list2;
        List<String> list6 = list3;
        RecyclerView recyclerView2 = recyclerView;
        String str3 = str;
        String str4 = str2;
        HashMap<String, String> hashMap2 = hashMap;
        if (PatchProxy.isSupport(new Object[]{context, list4, list5, list6, recyclerView2, Integer.valueOf(i), str3, str4, hashMap2}, this, f60117a, false, 65384, new Class[]{Context.class, List.class, List.class, List.class, RecyclerView.class, Integer.TYPE, String.class, String.class, HashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, list4, list5, list6, recyclerView2, Integer.valueOf(i), str3, str4, hashMap2}, this, f60117a, false, 65384, new Class[]{Context.class, List.class, List.class, List.class, RecyclerView.class, Integer.TYPE, String.class, String.class, HashMap.class}, Void.TYPE);
            return;
        }
        g.a a2 = g.a().b(list4).a(list5);
        a2.f60187c = list6;
        g.a a3 = a2.a((c) new com.ss.android.ugc.aweme.poi.preview.b.b.a()).a((b) new com.ss.android.ugc.aweme.poi.preview.b.a.a()).a(true);
        a3.f60188d = recyclerView2;
        this.f60118b = a3.c(i).a(str3).a(hashMap2).b(-16777216).a((int) C0906R.color.xv).b(true).b(str4).a();
        this.f60119c = j.a(context);
    }

    public final void a(Context context, List<String> list, List<String> list2, String str, String str2, HashMap<String, String> hashMap) {
        List<String> list3 = list;
        List<String> list4 = list2;
        String str3 = str;
        String str4 = str2;
        HashMap<String, String> hashMap2 = hashMap;
        if (PatchProxy.isSupport(new Object[]{context, list3, list4, str3, str4, hashMap2}, this, f60117a, false, 65386, new Class[]{Context.class, List.class, List.class, String.class, String.class, HashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, list3, list4, str3, str4, hashMap2}, this, f60117a, false, 65386, new Class[]{Context.class, List.class, List.class, String.class, String.class, HashMap.class}, Void.TYPE);
            return;
        }
        this.f60118b = g.a().b(list3).a(list4).a((c) new com.ss.android.ugc.aweme.poi.preview.b.b.a()).a((b) new com.ss.android.ugc.aweme.poi.preview.b.a.a()).a(true).a(str3).a(hashMap2).b(-16777216).a((int) C0906R.color.xv).b(true).b(str4).a();
        this.f60119c = j.a(context);
    }

    public final void a(String str, int i, int i2) {
        String str2 = str;
        int i3 = i;
        int i4 = i2;
        int i5 = 0;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f60117a, false, 65388, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f60117a, false, 65388, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i3 >= i4) {
            n.a("poi_log", "", com.ss.android.ugc.aweme.app.d.c.a().a("service", "preview").a("status", "{\"tag\":" + str2 + ",\"position\":" + i3 + ",\"size\":" + i4 + "}").b());
            i5 = i4 + -1;
        } else if (i3 < 0) {
            n.a("poi_log", "", com.ss.android.ugc.aweme.app.d.c.a().a("service", "preview").a("status", "{\"tag\":" + str2 + ",\"position\":" + i3 + ",\"size\":" + i4 + "}").b());
        } else {
            i5 = i3;
        }
        this.f60118b.f60180b = i5;
        this.f60118b.i = i4;
        this.f60119c.a(this.f60118b).b();
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f60117a, true, 65382, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f60117a, true, 65382, new Class[0], a.class);
        }
        return new a();
    }

    public static void a(String str, com.ss.android.ugc.aweme.poi.c cVar) {
        String str2 = str;
        com.ss.android.ugc.aweme.poi.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{str2, cVar2}, null, f60117a, true, 65391, new Class[]{String.class, com.ss.android.ugc.aweme.poi.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, cVar2}, null, f60117a, true, 65391, new Class[]{String.class, com.ss.android.ugc.aweme.poi.c.class}, Void.TYPE);
            return;
        }
        a(str2, 0, cVar2);
    }

    public static void a(com.ss.android.ugc.aweme.poi.c cVar, String str) {
        com.ss.android.ugc.aweme.poi.c cVar2 = cVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{cVar2, str2}, null, f60117a, true, 65389, new Class[]{com.ss.android.ugc.aweme.poi.c.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2, str2}, null, f60117a, true, 65389, new Class[]{com.ss.android.ugc.aweme.poi.c.class, String.class}, Void.TYPE);
            return;
        }
        h.a(cVar2, "poi_pic_operation", d.a().a("enter_from", "poi_page").a("enter_method", "slide_outer").a("poi_channel", aa.b()).a("poi_id", cVar.getPoiId()).a("poi_type", cVar.getPoiType()).a("group_id", cVar.getAwemeId()).a("previous_page", cVar.getPreviousPage()).a("content_type", str2));
    }

    public static void a(String str, int i, com.ss.android.ugc.aweme.poi.c cVar) {
        String str2 = str;
        int i2 = i;
        com.ss.android.ugc.aweme.poi.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), cVar2}, null, f60117a, true, 65392, new Class[]{String.class, Integer.TYPE, com.ss.android.ugc.aweme.poi.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), cVar2}, null, f60117a, true, 65392, new Class[]{String.class, Integer.TYPE, com.ss.android.ugc.aweme.poi.c.class}, Void.TYPE);
            return;
        }
        d a2 = d.a().a("enter_from", "poi_page").a("enter_method", "click_top_pic").a("poi_id", cVar.getPoiId()).a("poi_type", cVar.getPoiType()).a("group_id", cVar.getAwemeId()).a("previous_page", cVar.getPreviousPage()).a("poi_channel", aa.b()).a("content_type", str2);
        if (i2 > 0) {
            a2.a("pic_tag", i2);
        }
        h.a(cVar2, "poi_pic_operation", a2);
    }

    public final void a(Context context, List<String> list, List<String> list2) {
        List<String> list3 = list;
        List<String> list4 = list2;
        if (PatchProxy.isSupport(new Object[]{context, list3, list4}, this, f60117a, false, 65387, new Class[]{Context.class, List.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, list3, list4}, this, f60117a, false, 65387, new Class[]{Context.class, List.class, List.class}, Void.TYPE);
            return;
        }
        this.f60118b = g.a().b(list3).a(list4).a((c) new com.ss.android.ugc.aweme.poi.preview.b.b.a()).a((b) new com.ss.android.ugc.aweme.poi.preview.b.a.a()).a(true).b(-16777216).a((int) C0906R.color.xv).b(true).a();
        this.f60119c = j.a(context);
    }

    public final void a(Context context, List<String> list, List<String> list2, ViewPager viewPager, int i, int i2, String str, HashMap<String, String> hashMap) {
        List<String> list3 = list;
        List<String> list4 = list2;
        ViewPager viewPager2 = viewPager;
        String str2 = str;
        HashMap<String, String> hashMap2 = hashMap;
        if (PatchProxy.isSupport(new Object[]{context, list3, list4, viewPager2, Integer.valueOf(i), Integer.valueOf(C0906R.id.ckd), str2, hashMap2}, this, f60117a, false, 65383, new Class[]{Context.class, List.class, List.class, ViewPager.class, Integer.TYPE, Integer.TYPE, String.class, HashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, list3, list4, viewPager2, Integer.valueOf(i), Integer.valueOf(C0906R.id.ckd), str2, hashMap2}, this, f60117a, false, 65383, new Class[]{Context.class, List.class, List.class, ViewPager.class, Integer.TYPE, Integer.TYPE, String.class, HashMap.class}, Void.TYPE);
            return;
        }
        g.a a2 = g.a().b(list3).a(list4).a((c) new com.ss.android.ugc.aweme.poi.preview.b.b.a()).a((b) new com.ss.android.ugc.aweme.poi.preview.b.a.a()).a(true);
        a2.f60189e = viewPager2;
        a2.f60190f = i;
        this.f60118b = a2.c(C0906R.id.ckd).a(str2).a(hashMap2).b(-16777216).a((int) C0906R.color.xv).b(true).b("top_pic").a();
        this.f60119c = j.a(context);
    }
}
