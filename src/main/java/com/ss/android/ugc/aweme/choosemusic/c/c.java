package com.ss.android.ugc.aweme.choosemusic.c;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.music.util.a;
import java.util.List;

public class c extends a {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f35801c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile c f35802d;

    private c() {
        this.f35799b = 10;
    }

    public static c c() {
        if (PatchProxy.isSupport(new Object[0], null, f35801c, true, 26723, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, f35801c, true, 26723, new Class[0], c.class);
        }
        if (f35802d == null) {
            synchronized (c.class) {
                if (f35802d == null) {
                    f35802d = new c();
                }
            }
        }
        return f35802d;
    }

    @NonNull
    public final List<MusicSearchHistory> b() {
        if (!PatchProxy.isSupport(new Object[0], this, f35801c, false, 26724, new Class[0], List.class)) {
            return a.a("music_search_history", MusicSearchHistory.class, "music_sp");
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, f35801c, false, 26724, new Class[0], List.class);
    }

    public final void a(List<MusicSearchHistory> list) {
        List<MusicSearchHistory> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f35801c, false, 26725, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f35801c, false, 26725, new Class[]{List.class}, Void.TYPE);
            return;
        }
        a.a("music_search_history", list2, "music_sp");
    }
}
