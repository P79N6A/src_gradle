package com.ss.android.ugc.aweme.hotsearch.d;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.HotSearchMusicItem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.b.a.d;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49725a;

    /* renamed from: b  reason: collision with root package name */
    a f49726b;

    /* renamed from: c  reason: collision with root package name */
    com.ss.android.ugc.b.b f49727c = new com.ss.android.ugc.b.b();

    /* renamed from: d  reason: collision with root package name */
    private HotSearchMusicItem f49728d;

    public interface a {
        void a();

        void b();

        void c();
    }

    public interface b {
        void N_();

        void a(HotSearchMusicItem hotSearchMusicItem, a aVar, int i);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f49725a, false, 49816, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49725a, false, 49816, new Class[0], Void.TYPE);
            return;
        }
        if (this.f49727c != null) {
            com.ss.android.ugc.aweme.music.c.a().f56320b = null;
            this.f49727c.a();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f49725a, false, 49815, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49725a, false, 49815, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f49727c == null || this.f49726b == null || this.f49728d == null)) {
            this.f49726b.b();
            this.f49728d.playing = false;
            this.f49727c.b();
            this.f49728d = null;
            this.f49726b = null;
        }
    }

    public final void a(Context context, HotSearchMusicItem hotSearchMusicItem, a aVar) {
        Context context2 = context;
        HotSearchMusicItem hotSearchMusicItem2 = hotSearchMusicItem;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, hotSearchMusicItem2, aVar2}, this, f49725a, false, 49814, new Class[]{Context.class, HotSearchMusicItem.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, hotSearchMusicItem2, aVar2}, this, f49725a, false, 49814, new Class[]{Context.class, HotSearchMusicItem.class, a.class}, Void.TYPE);
            return;
        }
        a();
        this.f49727c.a((d) new d(this));
        this.f49726b = aVar2;
        this.f49728d = hotSearchMusicItem2;
        this.f49728d.playing = true;
        this.f49726b.c();
        MusicModel a2 = com.ss.android.ugc.aweme.music.util.c.f56796b.a(this.f49728d.mMusic);
        if (com.ss.android.ugc.aweme.music.util.d.a(a2, context2, true)) {
            com.ss.android.ugc.b.b.a aVar3 = new com.ss.android.ugc.b.b.a();
            aVar3.a(com.ss.android.ugc.aweme.music.util.d.a(true));
            if (a2.getMusicType() == MusicModel.MusicType.ONLINE) {
                aVar3.f77132b = 4;
            }
            aVar3.f77133c = a2.getDuration();
            com.ss.android.ugc.aweme.music.c.a().f56320b = new e(this, aVar3);
            com.ss.android.ugc.aweme.music.c.a().a(a2, aVar3.f77134d);
        }
    }
}
