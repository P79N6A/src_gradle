package com.ss.android.ugc.aweme.story.detail;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.b.a;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.api.model.f;
import com.ss.android.ugc.aweme.story.base.utils.i;
import com.ss.android.ugc.aweme.story.friends.a.d;
import com.ss.android.ugc.aweme.story.friends.a.e;
import org.jetbrains.annotations.NotNull;

public final class c implements a, com.ss.android.ugc.aweme.story.feed.b.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72384a;

    /* renamed from: b  reason: collision with root package name */
    private Context f72385b;

    /* renamed from: c  reason: collision with root package name */
    private f f72386c;

    /* renamed from: d  reason: collision with root package name */
    private a.c f72387d;

    /* renamed from: e  reason: collision with root package name */
    private View f72388e;

    /* renamed from: f  reason: collision with root package name */
    private com.ss.android.ugc.aweme.story.feed.b.f f72389f = new com.ss.android.ugc.aweme.story.feed.b.f(this);
    private volatile a.d g = a.d.READY;
    private Boolean h;
    private a.C0747a i;

    public final void b(Throwable th) {
    }

    public final void c(UserStory userStory) {
    }

    public final void d(UserStory userStory) {
    }

    @NotNull
    public final a.d a() {
        return this.g;
    }

    public final void c() {
        this.g = a.d.CANCELED;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f72384a, false, 83099, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72384a, false, 83099, new Class[0], Void.TYPE);
        } else if (this.g != a.d.READY) {
            a(a.b.OTHER_ERROR);
        } else {
            if (this.h == null) {
                this.f72389f.a(this.f72386c.uid);
            } else {
                this.f72389f.a(this.f72386c.uid, this.h.booleanValue() ^ true ? 1 : 0);
            }
            this.g = a.d.IN_PROGRESS;
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f72384a, false, 83106, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72384a, false, 83106, new Class[0], Void.TYPE);
        } else if (this.g == a.d.IN_PROGRESS) {
            UserStory userStory = null;
            if (this.i != null) {
                userStory = this.i.a(null);
            }
            if (userStory != null) {
                e(userStory);
                this.f72387d.a();
            } else {
                this.f72387d.a(a.b.EMPTY);
            }
            this.g = a.d.FINISHED;
        }
    }

    public final void a(a.C0747a aVar) {
        this.i = aVar;
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f72384a, false, 83101, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f72384a, false, 83101, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        a(a.b.NET_ERROR);
    }

    private void e(UserStory userStory) {
        if (PatchProxy.isSupport(new Object[]{userStory}, this, f72384a, false, 83100, new Class[]{UserStory.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{userStory}, this, f72384a, false, 83100, new Class[]{UserStory.class}, Void.TYPE);
            return;
        }
        Activity a2 = i.a(this.f72385b);
        if (a2 != null && !a2.isFinishing()) {
            f.a(i.a(this.f72385b), this.f72386c, userStory, -1, this.f72388e, (View) null);
        }
    }

    public final void a(a.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f72384a, false, 83105, new Class[]{a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f72384a, false, 83105, new Class[]{a.b.class}, Void.TYPE);
        } else if (this.g == a.d.IN_PROGRESS) {
            this.f72387d.a(bVar);
            this.g = a.d.FINISHED;
        }
    }

    public final void a(UserStory userStory) {
        if (PatchProxy.isSupport(new Object[]{userStory}, this, f72384a, false, 83102, new Class[]{UserStory.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{userStory}, this, f72384a, false, 83102, new Class[]{UserStory.class}, Void.TYPE);
            return;
        }
        if (userStory == null) {
            a(a.b.EMPTY);
        }
        if (e.f73056c.a(userStory)) {
            b(userStory);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{userStory}, this, f72384a, false, 83103, new Class[]{UserStory.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{userStory}, this, f72384a, false, 83103, new Class[]{UserStory.class}, Void.TYPE);
            return;
        }
        e.f73056c.a(userStory, (d) new d() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72390a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f72390a, false, 83108, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f72390a, false, 83108, new Class[0], Void.TYPE);
                    return;
                }
                c.this.a(a.b.OTHER_ERROR);
            }

            public final void a(@NotNull UserStory userStory) {
                UserStory userStory2 = userStory;
                if (PatchProxy.isSupport(new Object[]{userStory2}, this, f72390a, false, 83107, new Class[]{UserStory.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{userStory2}, this, f72390a, false, 83107, new Class[]{UserStory.class}, Void.TYPE);
                    return;
                }
                c.this.b(userStory2);
            }
        });
    }

    public final void b(UserStory userStory) {
        UserStory userStory2;
        if (PatchProxy.isSupport(new Object[]{userStory}, this, f72384a, false, 83104, new Class[]{UserStory.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{userStory}, this, f72384a, false, 83104, new Class[]{UserStory.class}, Void.TYPE);
        } else if (this.g == a.d.IN_PROGRESS) {
            if (this.i != null) {
                userStory2 = this.i.a(userStory);
            } else {
                userStory2 = userStory;
            }
            e(userStory2);
            this.f72387d.a();
            this.g = a.d.FINISHED;
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72384a, false, 83098, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72384a, false, 83098, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.h = Boolean.valueOf(z);
    }

    public c(Context context, f fVar, View view, a.c cVar) {
        this.f72385b = context;
        this.f72386c = fVar;
        this.f72388e = view;
        this.f72387d = cVar;
    }
}
