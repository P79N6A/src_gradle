package com.ss.android.ugc.aweme.music.presenter;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.ui.LocalMusicActivity;
import com.ss.android.ugc.aweme.music.util.d;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;

@Keep
public class LocalMusicFetchPresenter extends com.ss.android.ugc.bogut.library.a.a<LocalMusicActivity> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public a localMusicLoadListener = new a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f56334a;

        public final void a(List<MusicModel> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f56334a, false, 60028, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f56334a, false, 60028, new Class[]{List.class}, Void.TYPE);
                return;
            }
            if (LocalMusicFetchPresenter.this.view != null) {
                ((LocalMusicActivity) LocalMusicFetchPresenter.this.view).a(list);
            }
        }
    };

    interface a {
        void a(List<MusicModel> list);
    }

    private void loadLocalMusicData() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 60027, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 60027, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56336a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f56336a, false, 60029, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f56336a, false, 60029, new Class[0], Void.TYPE);
                    return;
                }
                LocalMusicActivity localMusicActivity = (LocalMusicActivity) LocalMusicFetchPresenter.this.view;
                if (localMusicActivity != null) {
                    final ArrayList arrayList = new ArrayList();
                    d.a((Context) localMusicActivity, (List<MusicModel>) arrayList);
                    com.ss.android.b.a.a.a.b(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f56338a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f56338a, false, 60030, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f56338a, false, 60030, new Class[0], Void.TYPE);
                                return;
                            }
                            if (LocalMusicFetchPresenter.this.localMusicLoadListener != null) {
                                LocalMusicFetchPresenter.this.localMusicLoadListener.a(arrayList);
                            }
                        }
                    });
                }
            }
        });
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 60026, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 60026, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.localMusicLoadListener = null;
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, changeQuickRedirect, false, 60025, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, changeQuickRedirect, false, 60025, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        loadLocalMusicData();
    }
}
