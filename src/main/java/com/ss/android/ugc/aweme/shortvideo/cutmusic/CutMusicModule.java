package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import android.arch.lifecycle.LifecycleObserver;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.e;
import com.ss.android.ugc.aweme.shortvideo.f;

public class CutMusicModule implements LifecycleObserver, RepeatMusicPlayer.a, e.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66614a;

    /* renamed from: b  reason: collision with root package name */
    public String f66615b;

    /* renamed from: c  reason: collision with root package name */
    public int f66616c;

    /* renamed from: d  reason: collision with root package name */
    public int f66617d;

    /* renamed from: e  reason: collision with root package name */
    public f f66618e;

    /* renamed from: f  reason: collision with root package name */
    private AmeActivity f66619f;
    private e g;
    private RepeatMusicPlayer h;
    private a i;
    private int j;

    public interface a {
        void a(int i, int i2);
    }

    private boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f66614a, false, 76032, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f66614a, false, 76032, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(this.f66615b)) {
            z = true;
        }
        return z;
    }

    public final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f66614a, false, 76037, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f66614a, false, 76037, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.g != null && this.g.a()) {
            z = true;
        }
        return z;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f66614a, false, 76038, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66614a, false, 76038, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.a();
            this.h = null;
        }
    }

    private void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f66614a, false, 76033, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f66614a, false, 76033, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (c()) {
            if (this.h == null) {
                this.h = new RepeatMusicPlayer(this.f66619f, this.f66615b, this.j);
            }
            this.f66617d = i2;
            this.h.a(this.f66617d);
            this.h.f3932f = this;
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f66614a, false, 76039, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f66614a, false, 76039, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g.a(i2);
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f66614a, false, 76034, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f66614a, false, 76034, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (c()) {
            b(i2);
        }
    }

    public final void b(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f66614a, false, 76035, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f66614a, false, 76035, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f66617d = i2;
        this.i.a(i2, i3);
        b();
    }

    public final void a(int i2, @NonNull FrameLayout frameLayout) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), frameLayout}, this, f66614a, false, 76036, new Class[]{Integer.TYPE, FrameLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), frameLayout}, this, f66614a, false, 76036, new Class[]{Integer.TYPE, FrameLayout.class}, Void.TYPE);
            return;
        }
        this.j = i2;
        this.g = new b(frameLayout, this);
        this.g.a(this.f66618e);
        this.g.a(this.j, this.f66616c, this.f66617d);
        b(this.f66617d);
    }

    public CutMusicModule(@NonNull AmeActivity ameActivity, @Nullable String str, int i2, @NonNull a aVar) {
        this.f66619f = ameActivity;
        this.f66615b = str;
        this.f66616c = i2;
        this.i = aVar;
        this.f66619f.getLifecycle().addObserver(this);
    }
}
