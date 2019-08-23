package com.ss.android.ugc.aweme.feed.guide;

import android.content.SharedPreferences;
import com.alibaba.fastjson.JSON;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.q.c;
import java.util.ArrayList;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45431a;

    /* renamed from: b  reason: collision with root package name */
    private List<String> f45432b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f45433c;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final h f45434a = new h((byte) 0);
    }

    public static h a() {
        return a.f45434a;
    }

    private h() {
        this.f45433c = c.a(k.a(), "sp_show_share_guide_cache", 0);
        try {
            this.f45432b = JSON.parseArray(this.f45433c.getString("cached_video_id", ""), String.class);
        } catch (Exception unused) {
        }
        if (this.f45432b == null) {
            this.f45432b = new ArrayList();
        }
    }

    /* synthetic */ h(byte b2) {
        this();
    }

    public final void a(List<Aweme> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f45431a, false, 41259, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f45431a, false, 41259, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (!CollectionUtils.isEmpty(list) && list.size() >= 3 && !this.f45433c.getBoolean("sp_cached_first_three_video", false)) {
            for (Aweme aid : list.subList(0, 3)) {
                b(aid.getAid());
            }
            this.f45433c.edit().putBoolean("sp_cached_first_three_video", true).apply();
        }
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f45431a, false, 41258, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f45431a, false, 41258, new Class[]{String.class}, Void.TYPE);
        } else if (!this.f45432b.contains(str)) {
            if (this.f45432b.size() >= 20) {
                this.f45432b.remove(0);
            }
            this.f45432b.add(str);
            this.f45433c.edit().putString("cached_video_id", JSON.toJSONString(this.f45432b)).apply();
        }
    }

    public final boolean a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f45431a, false, 41257, new Class[]{String.class}, Boolean.TYPE)) {
            return this.f45432b.contains(str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f45431a, false, 41257, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }
}
