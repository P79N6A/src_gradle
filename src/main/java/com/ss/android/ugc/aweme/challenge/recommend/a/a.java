package com.ss.android.ugc.aweme.challenge.recommend.a;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.video.hashtag.b;
import java.util.HashMap;

public class a {
    @SerializedName("mark")

    /* renamed from: a  reason: collision with root package name */
    public int f35407a;
    @SerializedName("pos")

    /* renamed from: b  reason: collision with root package name */
    public int f35408b;
    @SerializedName("ch_info")

    /* renamed from: c  reason: collision with root package name */
    public Challenge f35409c;
    @SerializedName("ad_data")

    /* renamed from: d  reason: collision with root package name */
    public C0452a f35410d;

    /* renamed from: com.ss.android.ugc.aweme.challenge.recommend.a.a$a  reason: collision with other inner class name */
    public static class C0452a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35411a;
        @SerializedName("creative_id")

        /* renamed from: b  reason: collision with root package name */
        public long f35412b;
        @SerializedName("log_extra")

        /* renamed from: c  reason: collision with root package name */
        public String f35413c;

        public final void a(Context context, int i) {
            if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, this, f35411a, false, 25892, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, this, f35411a, false, 25892, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("topic_order", Integer.valueOf(i + 1));
            d.a().a("launch_ad").b("show").d("topic").g(this.f35413c).a(Long.valueOf(this.f35412b)).a((Object) hashMap).a(context);
        }

        public final void b(Context context, int i) {
            if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, this, f35411a, false, 25893, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, this, f35411a, false, 25893, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("topic_order", Integer.valueOf(i + 1));
            d.a().a("launch_ad").b("click").d("topic").g(this.f35413c).a(Long.valueOf(this.f35412b)).a((Object) hashMap).a(context);
        }
    }
}
