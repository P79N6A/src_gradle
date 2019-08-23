package com.ss.android.ugc.aweme.commerce.floatvideo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.feed.listener.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.longvideo.b.e;
import com.ss.android.ugc.aweme.newfollow.util.i;
import com.ss.android.ugc.aweme.video.b.b;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import org.json.JSONException;
import org.json.JSONObject;

public class FloatVideoBrowsePresenter implements TextureView.SurfaceTextureListener, c, com.ss.android.ugc.aweme.video.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36898a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f36899b = FloatVideoBrowseActivity.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    KeepSurfaceTextureView f36900c;

    /* renamed from: d  reason: collision with root package name */
    View f36901d;

    /* renamed from: e  reason: collision with root package name */
    float f36902e = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    int f36903f;
    int g;
    e h;
    public a i;
    private i j;
    private d k;
    private String l;
    private Aweme m;
    private boolean n;
    private boolean o;
    private boolean p = true;
    private int q;

    @interface VideoShowFrom {
    }

    public interface a {
        void a();
    }

    public final void a(float f2) {
    }

    public final void a(com.ss.android.ugc.aweme.video.b.a aVar) {
    }

    public final void a(String str) {
    }

    public final void b(com.ss.android.ugc.aweme.video.e eVar) {
    }

    public final void b(boolean z) {
    }

    public final void c(String str) {
    }

    public final void c(boolean z) {
    }

    public final void d(String str) {
    }

    public final void e(String str) {
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f36898a, false, 28176, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36898a, false, 28176, new Class[0], Void.TYPE);
        } else if (!this.n) {
            this.n = true;
            if (this.j != null) {
                this.j.a();
            }
            if (this.k != null) {
                this.k.b();
            }
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f36898a, false, 28178, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36898a, false, 28178, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.e();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f36898a, false, 28177, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36898a, false, 28177, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null && !this.n) {
            if (!this.j.k()) {
                this.f36901d.postDelayed(new c(this), 5);
                return;
            }
            if (this.g == 1) {
                this.f36901d.postDelayed(new d(this), 200);
            }
            if (this.o) {
                o.b().k();
                return;
            }
            o.b().l();
        }
    }

    /* access modifiers changed from: package-private */
    public float d() {
        if (PatchProxy.isSupport(new Object[0], this, f36898a, false, 28180, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f36898a, false, 28180, new Class[0], Float.TYPE)).floatValue();
        } else if (this.m == null || this.m.getVideo() == null) {
            return 1.0f;
        } else {
            return ((float) this.m.getVideo().getHeight()) / ((float) this.m.getVideo().getWidth());
        }
    }

    public final String a(boolean z) {
        return this.l;
    }

    public final void a(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f36898a, false, 28175, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f36898a, false, 28175, new Class[]{b.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sourceId", bVar2.f76013a);
        } catch (JSONException unused) {
        }
        if (this.q == 2) {
            n.a("aweme_commerce_seeding_recommend_error_rate", 0, jSONObject);
        }
    }

    public final void a(com.ss.android.ugc.aweme.video.e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f36898a, false, 28173, new Class[]{com.ss.android.ugc.aweme.video.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f36898a, false, 28173, new Class[]{com.ss.android.ugc.aweme.video.e.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorMsg", eVar.toString());
        } catch (JSONException unused) {
        }
        switch (this.q) {
            case 1:
                n.a("aweme_commerce_feed_display_error_rate", 1, jSONObject);
                return;
            case 2:
                n.a("aweme_commerce_seeding_recommend_error_rate", 1, jSONObject);
                break;
        }
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f36898a, false, 28174, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f36898a, false, 28174, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.p) {
            this.p = false;
            if (this.i != null) {
                this.i.a();
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sourceId", str);
        } catch (JSONException unused) {
        }
        if (this.q == 1) {
            n.a("aweme_commerce_feed_display_error_rate", 0, jSONObject);
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{surfaceTexture, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f36898a, false, 28171, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f36898a, false, 28171, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f36900c.f77738c) {
            int i4 = i2;
            int i5 = i3;
            com.ss.android.ugc.aweme.newfollow.util.n.a(i2, i3, this.f36900c, d());
        }
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{surfaceTexture, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f36898a, false, 28172, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f36898a, false, 28172, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f36900c.f77738c) {
            int i4 = i2;
            int i5 = i3;
            com.ss.android.ugc.aweme.newfollow.util.n.a(i2, i3, this.f36900c, d());
        }
    }

    @SuppressLint({"TooManyMethodParam"})
    public FloatVideoBrowsePresenter(o oVar, Aweme aweme, e eVar, KeepSurfaceTextureView keepSurfaceTextureView, View view, int i2, boolean z, String str, int i3, @VideoShowFrom int i4) {
        this.f36900c = keepSurfaceTextureView;
        this.f36901d = view;
        this.m = aweme;
        this.l = str;
        this.g = i2;
        this.o = z;
        this.h = eVar;
        this.q = i4;
        this.k = new d("", 0, null, this);
        this.k.a((Activity) view.getContext(), null);
        this.j = new i(keepSurfaceTextureView, this, this.k);
        this.f36900c.setSurfaceTextureListener(this);
        this.j.f57422c = oVar;
        this.j.a(this.m);
        if (this.g == 3) {
            this.f36901d.setBackgroundColor(i3);
        } else if (this.g == 2) {
            this.f36901d.setBackgroundResource(2130837965);
        }
        this.f36901d.post(new b(this));
    }
}
