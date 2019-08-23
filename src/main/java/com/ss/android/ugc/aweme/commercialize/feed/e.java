package com.ss.android.ugc.aweme.commercialize.feed;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanelAdInterface;

public class e implements f, BaseListFragmentPanelAdInterface {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38827a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f38828b;

    /* renamed from: c  reason: collision with root package name */
    public Context f38829c;

    /* renamed from: d  reason: collision with root package name */
    public am f38830d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f38831e;

    public final boolean a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f38827a, false, 30576, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f38827a, false, 30576, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f38830d == null) {
            return false;
        } else {
            return this.f38830d.clickAdTransform(this.f38829c, this.f38828b, i);
        }
    }

    public final void k() {
        this.f38830d = am.NONE;
    }

    private boolean m() {
        if (!this.f38831e) {
            return false;
        }
        this.f38831e = false;
        return true;
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f38827a, false, 30566, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f38827a, false, 30566, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f38830d == null) {
            return false;
        } else {
            return this.f38830d.hasLandPage();
        }
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f38827a, false, 30567, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f38827a, false, 30567, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f38830d == null) {
            return false;
        } else {
            return this.f38830d.hasOpenUrl();
        }
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f38827a, false, 30568, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f38827a, false, 30568, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f38830d == null) {
            return true;
        } else {
            return this.f38830d.isRealAuthor();
        }
    }

    public final boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f38827a, false, 30570, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f38827a, false, 30570, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f38830d == null) {
            return false;
        } else {
            return this.f38830d.isDownloadMode();
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f38827a, false, 30575, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38827a, false, 30575, new Class[0], Void.TYPE);
        } else if (this.f38830d != null) {
            this.f38830d.clickMusic(this.f38829c, this.f38828b);
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f38827a, false, 30577, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38827a, false, 30577, new Class[0], Void.TYPE);
        } else if (this.f38830d != null) {
            this.f38830d.onVideoPageChange(this.f38829c, this.f38828b);
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f38827a, false, 30578, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38827a, false, 30578, new Class[0], Void.TYPE);
        } else if (this.f38830d != null) {
            this.f38830d.onEnd(this.f38829c, this.f38828b);
        }
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f38827a, false, 30579, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38827a, false, 30579, new Class[0], Void.TYPE);
        } else if (this.f38830d != null) {
            this.f38830d.flingToIndexChange(this.f38829c, this.f38828b);
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f38827a, false, 30584, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38827a, false, 30584, new Class[0], Void.TYPE);
        } else if (this.f38830d != null) {
            this.f38830d.handleVideoEventAvailable(this.f38829c, this.f38828b);
        }
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f38827a, false, 30587, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38827a, false, 30587, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, g.f38832a, true, 30588, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, g.f38832a, true, 30588, new Class[]{f.class}, Void.TYPE);
            return;
        }
        a(null);
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f38827a, false, 30565, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f38827a, false, 30565, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f38830d == null) {
            return false;
        } else {
            return this.f38830d.isAd();
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f38827a, false, 30573, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f38827a, false, 30573, new Class[]{String.class}, Void.TYPE);
        } else if (this.f38830d != null) {
            this.f38830d.clickAvatar(this.f38829c, this.f38828b, str);
        }
    }

    public final void a(Context context, Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{context, aweme}, this, f38827a, false, 30562, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, aweme}, this, f38827a, false, 30562, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        this.f38828b = aweme;
        this.f38829c = context;
        if (this.f38829c != null && this.f38828b != null) {
            this.f38830d = am.valueOf(aweme);
            this.f38831e = false;
        }
    }

    public final void a(@BaseListFragmentPanelAdInterface.PlayType int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f38827a, false, 30583, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f38827a, false, 30583, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (i) {
            case 1:
                if (!m() && this.f38830d != null) {
                    this.f38830d.play(this.f38829c, this.f38828b, i2);
                    return;
                }
            case 2:
                if (!m() && this.f38830d != null) {
                    this.f38830d.rePlay(this.f38829c, this.f38828b, i2);
                    break;
                }
            case 3:
                this.f38831e = true;
                g.o(this.f38829c, this.f38828b);
                return;
        }
    }

    public final void a(Context context, Aweme aweme, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, aweme, str2}, this, f38827a, false, 30563, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, aweme, str2}, this, f38827a, false, 30563, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{aweme, str2}, this, f38827a, false, 30564, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, str2}, this, f38827a, false, 30564, new Class[]{Aweme.class, String.class}, Void.TYPE);
        } else if (aweme != null && aweme.isAd()) {
            aweme.getAwemeRawAd().setPageFrom(str2);
        }
        a(context, aweme);
    }

    public final void a(Aweme aweme, String str, long j, int i) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{aweme, str, new Long(j2), Integer.valueOf(i)}, this, f38827a, false, 30581, new Class[]{Aweme.class, String.class, Long.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, str, new Long(j2), Integer.valueOf(i)}, this, f38827a, false, 30581, new Class[]{Aweme.class, String.class, Long.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.f38830d != null) {
            this.f38830d.changePageBreak(this.f38829c, this.f38828b, aweme, str, j, i);
        }
    }
}
