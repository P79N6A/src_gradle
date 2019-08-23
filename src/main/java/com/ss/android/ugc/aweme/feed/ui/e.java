package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import org.json.JSONObject;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3209a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f3210b;

    /* renamed from: c  reason: collision with root package name */
    protected String f3211c;

    /* renamed from: d  reason: collision with root package name */
    protected JSONObject f3212d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f3213e;

    /* renamed from: f  reason: collision with root package name */
    protected int f3214f;
    protected DataCenter g;
    public Context h;
    protected View i;
    protected String j = "click";
    protected Fragment k;

    public void a() {
    }

    public abstract void a(View view);

    public abstract void a(DataCenter dataCenter);

    public abstract void b();

    public final boolean e() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3209a, false, 42454, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3209a, false, 42454, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f3210b != null && this.f3210b.isImage()) {
            z = true;
        }
        return z;
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f3209a, false, 42452, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3209a, false, 42452, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!d()) {
            return false;
        } else {
            a.b(this.h, (int) C0906R.string.c_).a();
            return true;
        }
    }

    public boolean d() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f3209a, false, 42453, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3209a, false, 42453, new Class[0], Boolean.TYPE)).booleanValue();
        }
        boolean H = c.H(this.f3210b);
        if (this.f3210b == null || !this.f3210b.isAd()) {
            z = false;
        } else {
            z = true;
        }
        if (z || !H) {
            return false;
        }
        return true;
    }

    public e(View view) {
        this.h = view.getContext();
        this.i = view;
        a(view);
    }

    public void b(VideoItemParams videoItemParams) {
        if (videoItemParams != null) {
            this.f3210b = videoItemParams.mAweme;
            this.f3214f = videoItemParams.mPageType;
            this.f3211c = videoItemParams.mEventType;
            this.f3212d = videoItemParams.mRequestId;
            this.f3213e = videoItemParams.isMyProfile;
            this.j = videoItemParams.mEnterMethodValue;
            this.k = videoItemParams.fragment;
        }
    }

    public void a(VideoItemParams videoItemParams) {
        if (PatchProxy.isSupport(new Object[]{videoItemParams}, this, f3209a, false, 42450, new Class[]{VideoItemParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoItemParams}, this, f3209a, false, 42450, new Class[]{VideoItemParams.class}, Void.TYPE);
            return;
        }
        b(videoItemParams);
    }

    public final void b(DataCenter dataCenter) {
        DataCenter dataCenter2 = dataCenter;
        if (PatchProxy.isSupport(new Object[]{dataCenter2}, this, f3209a, false, 42451, new Class[]{DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataCenter2}, this, f3209a, false, 42451, new Class[]{DataCenter.class}, Void.TYPE);
        } else if (dataCenter2 != null) {
            this.g = dataCenter2;
            a(dataCenter);
        } else if (com.ss.android.ugc.aweme.g.a.a()) {
            throw new RuntimeException("DataCenter can not be null !!!");
        }
    }
}
