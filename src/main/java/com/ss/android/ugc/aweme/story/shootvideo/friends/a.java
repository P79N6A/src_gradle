package com.ss.android.ugc.aweme.story.shootvideo.friends;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.shootvideo.e;
import com.ss.android.ugc.aweme.story.shootvideo.friends.a.k;
import com.ss.android.ugc.aweme.story.shootvideo.friends.view.PublishKnowFriendsLayout;
import java.util.List;

public final class a extends e implements com.ss.android.ugc.aweme.story.shootvideo.friends.adapter.a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f73515b;

    /* renamed from: c  reason: collision with root package name */
    public PublishKnowFriendsLayout f73516c;

    /* renamed from: d  reason: collision with root package name */
    public View f73517d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.story.shootvideo.friends.adapter.a f73518e;

    /* renamed from: f  reason: collision with root package name */
    public List<k> f73519f;
    public C0763a g;

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.friends.a$a  reason: collision with other inner class name */
    public interface C0763a {
        void a();

        void a(boolean z);

        void b();
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f73515b, false, 85297, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73515b, false, 85297, new Class[0], Void.TYPE);
            return;
        }
        this.f73516c.dismiss(this.f73517d);
        if (this.g != null) {
            this.g.b();
        }
    }

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f73515b, false, 85298, new Class[0], Boolean.TYPE)) {
            return this.f73516c.l();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f73515b, false, 85298, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void a(List<k> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f73515b, false, 85300, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f73515b, false, 85300, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f73519f = list;
        if (this.f73518e != null) {
            this.f73518e.a(list);
        }
    }

    public final void a(k kVar, boolean z) {
        if (PatchProxy.isSupport(new Object[]{kVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f73515b, false, 85301, new Class[]{k.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVar, Byte.valueOf(z)}, this, f73515b, false, 85301, new Class[]{k.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.a(z);
        }
    }
}
