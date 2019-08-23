package com.ss.android.ugc.aweme.choosemusic.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import java.util.ArrayList;
import java.util.List;

public abstract class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35798a;

    /* renamed from: b  reason: collision with root package name */
    public int f35799b = -1;

    /* renamed from: c  reason: collision with root package name */
    private List<C0454a> f35800c = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.c.a$a  reason: collision with other inner class name */
    public interface C0454a {
        void a(List<MusicSearchHistory> list);
    }

    /* access modifiers changed from: package-private */
    public abstract void a(List<MusicSearchHistory> list);

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f35798a, false, 26722, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35798a, false, 26722, new Class[0], Void.TYPE);
            return;
        }
        b((List<MusicSearchHistory>) new ArrayList<MusicSearchHistory>());
    }

    public final void b(C0454a aVar) {
        C0454a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f35798a, false, 26717, new Class[]{C0454a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f35798a, false, 26717, new Class[]{C0454a.class}, Void.TYPE);
            return;
        }
        this.f35800c.remove(aVar2);
    }

    public final void a(C0454a aVar) {
        C0454a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f35798a, false, 26716, new Class[]{C0454a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f35798a, false, 26716, new Class[]{C0454a.class}, Void.TYPE);
            return;
        }
        this.f35800c.add(aVar2);
    }

    public final void b(MusicSearchHistory musicSearchHistory) {
        if (PatchProxy.isSupport(new Object[]{musicSearchHistory}, this, f35798a, false, 26721, new Class[]{MusicSearchHistory.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicSearchHistory}, this, f35798a, false, 26721, new Class[]{MusicSearchHistory.class}, Void.TYPE);
            return;
        }
        List b2 = b();
        if (b2 == null) {
            b2 = new ArrayList();
        }
        b2.remove(musicSearchHistory);
        b2.add(0, musicSearchHistory);
        if (this.f35799b > 0 && b2.size() > this.f35799b) {
            b2.remove(b2.size() - 1);
        }
        b(b2);
    }

    private void b(List<MusicSearchHistory> list) {
        List<MusicSearchHistory> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f35798a, false, 26719, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f35798a, false, 26719, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{list2}, this, f35798a, false, 26718, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f35798a, false, 26718, new Class[]{List.class}, Void.TYPE);
        } else {
            for (C0454a a2 : this.f35800c) {
                a2.a(list2);
            }
        }
        a(list);
    }

    public final void a(MusicSearchHistory musicSearchHistory) {
        MusicSearchHistory musicSearchHistory2 = musicSearchHistory;
        if (PatchProxy.isSupport(new Object[]{musicSearchHistory2}, this, f35798a, false, 26720, new Class[]{MusicSearchHistory.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicSearchHistory2}, this, f35798a, false, 26720, new Class[]{MusicSearchHistory.class}, Void.TYPE);
            return;
        }
        List b2 = b();
        if (b2 == null) {
            b2 = new ArrayList();
        }
        b2.remove(musicSearchHistory2);
        b(b2);
    }
}
