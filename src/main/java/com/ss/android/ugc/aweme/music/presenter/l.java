package com.ss.android.ugc.aweme.music.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.music.api.MusicAwemeApi;
import com.ss.android.ugc.aweme.music.model.MusicCollection;
import java.util.List;
import java.util.concurrent.Callable;

public class l extends b<a<MusicCollection>, c> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56366a;

    public l() {
        a(new a<MusicCollection>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56367a;

            public final boolean checkParams(Object... objArr) {
                return true;
            }

            public final boolean sendRequest(Object... objArr) {
                if (PatchProxy.isSupport(new Object[]{objArr}, this, f56367a, false, 60047, new Class[]{Object[].class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f56367a, false, 60047, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
                }
                if (PatchProxy.isSupport(new Object[]{0, 1024}, this, f56367a, false, 60048, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{0, 1024}, this, f56367a, false, 60048, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else {
                    m.a().a(this.mHandler, new Callable(0, 1024) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f56369a;

                        public final Object call() throws Exception {
                            if (PatchProxy.isSupport(new Object[0], this, f56369a, false, 60049, new Class[0], Object.class)) {
                                return PatchProxy.accessDispatch(new Object[0], this, f56369a, false, 60049, new Class[0], Object.class);
                            }
                            int i = 0;
                            int i2 = 1024;
                            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, MusicAwemeApi.f56296a, true, 59991, new Class[]{Integer.TYPE, Integer.TYPE}, MusicCollection.class)) {
                                return (MusicCollection) MusicAwemeApi.f56297b.fetchMusicCollection((long) i, i2).get();
                            }
                            return (MusicCollection) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, MusicAwemeApi.f56296a, true, 59991, new Class[]{Integer.TYPE, Integer.TYPE}, MusicCollection.class);
                        }
                    }, 0);
                }
                return true;
            }
        });
    }

    public final void b() {
        List list;
        if (PatchProxy.isSupport(new Object[0], this, f56366a, false, 60046, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56366a, false, 60046, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f2979f == null || this.f2978e == null)) {
            c cVar = (c) this.f2979f;
            if (this.f2978e.getData() == null) {
                list = null;
            } else {
                list = ((MusicCollection) this.f2978e.getData()).getItems();
            }
            cVar.a(list);
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f56366a, false, 60045, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f56366a, false, 60045, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((c) this.f2979f).c_(exc);
        }
    }
}
