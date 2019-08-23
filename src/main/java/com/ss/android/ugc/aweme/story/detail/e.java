package com.ss.android.ugc.aweme.story.detail;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.b.a;
import com.ss.android.ugc.aweme.story.api.b.b;
import com.ss.android.ugc.aweme.story.api.b.d;
import com.ss.android.ugc.aweme.story.api.i;
import com.ss.android.ugc.aweme.story.api.model.f;
import com.ss.android.ugc.aweme.story.base.utils.g;
import com.ss.android.ugc.aweme.story.detail.a;
import com.ss.android.ugc.aweme.story.friends.a.c;

public final class e implements Observer<d>, b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72420a;

    /* renamed from: b  reason: collision with root package name */
    public View f72421b;

    /* renamed from: c  reason: collision with root package name */
    public User f72422c;

    /* renamed from: d  reason: collision with root package name */
    i f72423d;

    /* renamed from: e  reason: collision with root package name */
    public String f72424e;

    /* renamed from: f  reason: collision with root package name */
    private View f72425f;
    private AnimationImageView g;
    private boolean h;
    private b.a i;
    private Observer<a> j = new Observer<a>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72426a;

        public final /* synthetic */ void onChanged(@Nullable Object obj) {
            a aVar = (a) obj;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f72426a, false, 83117, new Class[]{a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f72426a, false, 83117, new Class[]{a.class}, Void.TYPE);
                return;
            }
            if (!(!TextUtils.equals(aVar.f72348a, e.this.f72424e) || e.this.f72422c == null || e.this.f72421b == null)) {
                a.C0754a aVar2 = aVar.f72349b;
                if (aVar2 == a.C0754a.STATE_SUCCESS) {
                    e.this.c();
                    if (h.a(e.this.f72422c)) {
                        e.this.f72421b.setVisibility(0);
                    }
                } else if (aVar2 == a.C0754a.STATE_FAIL) {
                    e.this.c();
                    e eVar = e.this;
                    a.b bVar = aVar.f72350c;
                    if (PatchProxy.isSupport(new Object[]{bVar}, eVar, e.f72420a, false, 83110, new Class[]{a.b.class}, Void.TYPE)) {
                        e eVar2 = eVar;
                        PatchProxy.accessDispatch(new Object[]{bVar}, eVar2, e.f72420a, false, 83110, new Class[]{a.b.class}, Void.TYPE);
                        return;
                    }
                    if (AnonymousClass2.f72428a[bVar.ordinal()] == 1) {
                        eVar.f72422c.setHasUnreadStory(false);
                        eVar.f72421b.setVisibility(8);
                        eVar.a(false);
                        if (eVar.f72423d != null) {
                            d dVar = new d();
                            dVar.f71831a = eVar.f72422c.getUid();
                            dVar.f71832b = true;
                            eVar.f72423d.b().postValue(dVar);
                        }
                    }
                    if (h.a(eVar.f72422c)) {
                        eVar.f72421b.setVisibility(0);
                    }
                }
            }
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.story.detail.e$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f72428a = new int[a.b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.ss.android.ugc.aweme.story.api.b.a$b[] r0 = com.ss.android.ugc.aweme.story.api.b.a.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f72428a = r0
                int[] r0 = f72428a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.android.ugc.aweme.story.api.b.a$b r1 = com.ss.android.ugc.aweme.story.api.b.a.b.EMPTY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f72428a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.android.ugc.aweme.story.api.b.a$b r1 = com.ss.android.ugc.aweme.story.api.b.a.b.NET_ERROR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f72428a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.ss.android.ugc.aweme.story.api.b.a$b r1 = com.ss.android.ugc.aweme.story.api.b.a.b.TIME_OUT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f72428a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.ss.android.ugc.aweme.story.api.b.a$b r1 = com.ss.android.ugc.aweme.story.api.b.a.b.OTHER_ERROR     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.detail.e.AnonymousClass2.<clinit>():void");
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f72420a, false, 83111, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72420a, false, 83111, new Class[0], Void.TYPE);
            return;
        }
        if (this.f72423d != null) {
            this.f72423d.b().removeObserver(this);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f72420a, false, 83114, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72420a, false, 83114, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.cancelAnimation();
            this.g.setVisibility(8);
        }
    }

    private boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f72420a, false, 83113, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72420a, false, 83113, new Class[0], Boolean.TYPE)).booleanValue();
        }
        User a2 = g.a();
        if (a2 == null || this.f72422c == null) {
            return false;
        }
        return TextUtils.equals(this.f72422c.getUid(), a2.getUid());
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f72420a, false, 83112, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72420a, false, 83112, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f72422c == null || this.h || !h.a(this.f72422c)) {
            return false;
        } else {
            if (!NetworkUtils.isNetworkAvailable(GlobalContext.getContext())) {
                com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), (int) C0906R.string.bgf).a();
                return true;
            }
            f fVar = new f();
            fVar.detailType = 3;
            fVar.uid = this.f72422c.getUid();
            fVar.isSelf = d();
            fVar.eventType = "homepage_hot";
            c.f73052a.a(this.g, this.f72421b, false);
            b.a().a(this.f72424e, true);
            b.a().a(this.f72421b.getContext(), this.f72424e, this.f72425f, fVar);
            return true;
        }
    }

    public final void a(b.a aVar) {
        this.i = aVar;
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72420a, false, 83116, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72420a, false, 83116, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.i.a(z);
        }
    }

    public final /* synthetic */ void onChanged(@Nullable Object obj) {
        d dVar = (d) obj;
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f72420a, false, 83115, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f72420a, false, 83115, new Class[]{d.class}, Void.TYPE);
            return;
        }
        if (!(dVar == null || this.f72422c == null || this.f72421b == null || this.h || !TextUtils.equals(dVar.f71831a, this.f72422c.getUid()))) {
            this.f72422c.setHasUnreadStory(!dVar.f71832b);
            new StringBuilder("story circle: hasStory->").append(!dVar.f71832b);
            if (this.g.getVisibility() != 0 && !this.g.isAnimating()) {
                if (dVar.f71832b) {
                    this.f72421b.setVisibility(8);
                    this.g.cancelAnimation();
                    this.g.setVisibility(8);
                } else {
                    this.f72421b.setVisibility(0);
                    this.g.cancelAnimation();
                    this.g.setVisibility(8);
                }
            }
            a(!dVar.f71832b);
        }
    }

    public e(View view, View view2, AnimationImageView animationImageView) {
        this.f72425f = view;
        this.f72421b = view2;
        this.g = animationImageView;
        if (view != null && this.f72421b != null && this.g != null) {
            this.f72423d = (i) ServiceManager.get().getService(i.class);
        }
    }

    public final void a(User user, boolean z, String str) {
        User user2 = user;
        boolean z2 = z;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{user2, Byte.valueOf(z ? (byte) 1 : 0), str2}, this, f72420a, false, 83109, new Class[]{User.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2, Byte.valueOf(z), str2}, this, f72420a, false, 83109, new Class[]{User.class, Boolean.TYPE, String.class}, Void.TYPE);
        } else if (this.f72421b != null) {
            this.f72422c = user2;
            this.h = z2;
            this.f72424e = str2;
            if (this.g != null && this.g.isAnimating()) {
                this.g.cancelAnimation();
            }
            this.g.setVisibility(8);
            if (this.f72422c == null || !h.a(this.f72422c) || z2) {
                this.f72421b.setVisibility(8);
                a(false);
            } else {
                this.f72421b.setVisibility(0);
                a(true);
                if (b.a().a(this.f72424e)) {
                    c.f73052a.a(this.g, this.f72421b, false);
                }
            }
            if (!(this.f72423d == null || this.f72421b == null)) {
                this.f72423d.b().removeObserver(this);
                this.f72423d.b().a((LifecycleOwner) com.ss.android.ugc.aweme.story.base.utils.i.a(this.f72421b.getContext()), this, false);
            }
            b.a().f72369d.removeObserver(this.j);
            b.a().f72369d.a((LifecycleOwner) com.ss.android.ugc.aweme.story.base.utils.i.a(this.f72421b.getContext()), this.j, false);
        }
    }
}
