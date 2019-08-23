package com.ss.android.ugc.aweme.shortvideo.helper;

import android.view.KeyEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.activity.a;

public final /* synthetic */ class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68125a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicDragHelper f68126b;

    e(MusicDragHelper musicDragHelper) {
        this.f68126b = musicDragHelper;
    }

    public final boolean a(int i, KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent}, this, f68125a, false, 77478, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent}, this, f68125a, false, 77478, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        MusicDragHelper musicDragHelper = this.f68126b;
        if (i != 4) {
            return false;
        }
        musicDragHelper.next();
        return true;
    }
}
