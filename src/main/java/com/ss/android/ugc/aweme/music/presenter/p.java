package com.ss.android.ugc.aweme.music.presenter;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.music.api.MusicAwemeApi;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicList;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public final class p implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56384a;

    /* renamed from: b  reason: collision with root package name */
    protected WeakHandler f56385b;

    /* renamed from: c  reason: collision with root package name */
    public int f56386c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f56387d = true;

    /* renamed from: e  reason: collision with root package name */
    private d f56388e;

    /* renamed from: f  reason: collision with root package name */
    private MusicList f56389f;
    private boolean g;

    public p(d dVar) {
        this.f56388e = dVar;
        this.f56389f = new MusicList();
        this.f56389f.items = new ArrayList();
        this.f56385b = new WeakHandler(this);
    }

    public final void a(final String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f56384a, false, 60073, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f56384a, false, 60073, new Class[]{String.class}, Void.TYPE);
        } else if (!this.g) {
            this.g = true;
            m.a().a(this.f56385b, new Callable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56395a;

                public final Object call() throws Exception {
                    if (!PatchProxy.isSupport(new Object[0], this, f56395a, false, 60076, new Class[0], Object.class)) {
                        return MusicAwemeApi.a(str, p.this.f56386c, 16);
                    }
                    return PatchProxy.accessDispatch(new Object[0], this, f56395a, false, 60076, new Class[0], Object.class);
                }
            }, 1010);
        }
    }

    public final void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f56384a, false, 60074, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f56384a, false, 60074, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        this.g = false;
        if (message.what == 1010) {
            if (message.obj instanceof Exception) {
                this.f56388e.a(null);
                return;
            }
            MusicList musicList = (MusicList) message.obj;
            if (musicList != null) {
                this.f56387d &= musicList.isHasMore();
                if (!this.f56387d) {
                    this.f56388e.b();
                }
                this.f56386c = musicList.getCursor();
                if (musicList.items != null) {
                    for (Music add : musicList.items) {
                        this.f56389f.items.add(add);
                    }
                }
                if (musicList.mcInfo != null) {
                    this.f56389f.mcInfo = musicList.mcInfo;
                }
                this.f56388e.a(this.f56389f);
            }
        }
    }

    public final void a(final String str, int i, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, 0, 30}, this, f56384a, false, 60072, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, 0, 30}, this, f56384a, false, 60072, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (!this.g) {
            this.g = true;
            m.a().a(this.f56385b, new Callable(0, 30) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56390a;

                public final Object call() throws Exception {
                    if (!PatchProxy.isSupport(new Object[0], this, f56390a, false, 60075, new Class[0], Object.class)) {
                        return MusicAwemeApi.a(str, 0, 30);
                    }
                    return PatchProxy.accessDispatch(new Object[0], this, f56390a, false, 60075, new Class[0], Object.class);
                }
            }, 1010);
        }
    }
}
