package com.ss.android.ugc.aweme.favorites.ui;

import a.i;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.favorites.adapter.CollectMusicAdapter;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.a.e;
import com.ss.android.ugc.aweme.music.a.f;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.presenter.g;
import com.ss.android.ugc.aweme.music.presenter.k;
import com.ss.android.ugc.aweme.music.ui.c;
import com.ss.android.ugc.aweme.music.ui.p;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.bm;
import com.ss.android.ugc.aweme.utils.ey;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.Subscribe;

public class MusicCollectListFragment extends BaseCollectListFragment implements aa<f>, g, c {
    public static ChangeQuickRedirect g;
    private p h;
    private MusicModel l;

    public final void a(MusicModel musicModel, Exception exc) {
        if (PatchProxy.isSupport(new Object[]{musicModel, exc}, this, g, false, 39580, new Class[]{MusicModel.class, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel, exc}, this, g, false, 39580, new Class[]{MusicModel.class, Exception.class}, Void.TYPE);
        }
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public final MusicModel g() {
        return this.l;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 39566, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 39566, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3120f != null) {
            this.f3120f.a(1);
        }
    }

    public final Activity h() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 39574, new Class[0], Activity.class)) {
            return getActivity();
        }
        return (Activity) PatchProxy.accessDispatch(new Object[0], this, g, false, 39574, new Class[0], Activity.class);
    }

    public final boolean i() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 39575, new Class[0], Boolean.TYPE)) {
            return isViewValid();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, g, false, 39575, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 39567, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 39567, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3120f != null) {
            this.f3120f.a(4);
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 39568, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 39568, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3120f != null) {
            this.f3120f.a(new k());
        }
    }

    public final BaseAdapter o() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 39572, new Class[0], BaseAdapter.class)) {
            return new CollectMusicAdapter(this, null);
        }
        return (BaseAdapter) PatchProxy.accessDispatch(new Object[0], this, g, false, 39572, new Class[0], BaseAdapter.class);
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 39565, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 39565, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.h != null) {
            this.h.a();
            this.h.d();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 39564, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 39564, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.h != null) {
            this.h.o = false;
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 39563, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 39563, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.h != null) {
            this.h.a();
            this.h.o = true;
        }
        if (this.f3116b != null) {
            ((CollectMusicAdapter) this.f3116b).a();
        }
    }

    public final View q() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 39578, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, g, false, 39578, new Class[0], View.class);
        } else if (getActivity() == null) {
            return null;
        } else {
            if (!a.a()) {
                return super.q();
            }
            com.bytedance.ies.dmt.ui.widget.c cVar = new c.a(getActivity()).b((int) C0906R.string.adw).c(C0906R.string.adu).a(2130839715).f20493a;
            MtEmptyView a2 = MtEmptyView.a(getContext());
            a2.setStatus(cVar);
            return a2;
        }
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 39579, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 39579, new Class[0], Void.TYPE);
            return;
        }
        super.y_();
        if (!a.a()) {
            n.a("show_collect_empty", "", com.ss.android.ugc.aweme.app.d.c.a().a("show_collect_empty_page", "profile").b());
        }
    }

    public final void a(MusicModel musicModel) {
        if (PatchProxy.isSupport(new Object[]{musicModel}, this, g, false, 39569, new Class[]{MusicModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel}, this, g, false, 39569, new Class[]{MusicModel.class}, Void.TYPE);
        } else if (musicModel != null) {
            this.l = musicModel;
            this.h.a(musicModel, 1);
        }
    }

    public final void b(MusicModel musicModel) {
        if (PatchProxy.isSupport(new Object[]{null}, this, g, false, 39570, new Class[]{MusicModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, g, false, 39570, new Class[]{MusicModel.class}, Void.TYPE);
            return;
        }
        super.onPause();
        if (this.h != null) {
            this.h.a();
        }
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, g, false, 39562, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, g, false, 39562, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (!z && this.f3116b != null) {
            ((CollectMusicAdapter) this.f3116b).a();
        }
    }

    @Subscribe
    public void onMusicCollectEvent(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, g, false, 39577, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, g, false, 39577, new Class[]{e.class}, Void.TYPE);
        } else if (isViewValid()) {
            List items = ((com.ss.android.ugc.aweme.common.f.a) this.f3120f.i()).getItems();
            MusicModel musicModel = eVar.f56170b;
            if (musicModel != null) {
                int size = items.size();
                Music music = musicModel.getMusic();
                if (music != null && music.getCollectStatus() != 1) {
                    if (!(this.f3120f == null || this.f3120f.i() == null || items == null || items.size() <= 0)) {
                        Iterator it2 = items.iterator();
                        while (it2.hasNext()) {
                            Music music2 = (Music) it2.next();
                            if (music2 != null && !TextUtils.isEmpty(music.getMid()) && music.getMid().equals(music2.getMid())) {
                                it2.remove();
                            }
                        }
                    }
                    if (size != items.size()) {
                        this.f3116b.notifyDataSetChanged();
                    }
                }
            }
        }
    }

    public final void a(MusicModel musicModel, int i) {
        if (PatchProxy.isSupport(new Object[]{musicModel, Integer.valueOf(i)}, this, g, false, 39571, new Class[]{MusicModel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel, Integer.valueOf(i)}, this, g, false, 39571, new Class[]{MusicModel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.l = "music_collection";
            this.h.n = i;
            this.h.m = "favorite_song";
            this.h.b(musicModel, 7);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, g, false, 39561, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, g, false, 39561, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.h.c();
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup, bundle}, this, g, false, 39560, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup, bundle}, this, g, false, 39560, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        this.h = new p(this);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public final void a(String str, MusicModel musicModel, String str2) {
        final String str3 = str;
        final MusicModel musicModel2 = musicModel;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, musicModel2, str4}, this, g, false, 39576, new Class[]{String.class, MusicModel.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, musicModel2, str4}, this, g, false, 39576, new Class[]{String.class, MusicModel.class, String.class}, Void.TYPE);
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
        } else if (!bm.a(str) || musicModel2 == null) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) activity, (int) C0906R.string.bei).a();
            n.a("aweme_music_download_error_rate", 3, com.ss.android.ugc.aweme.app.d.c.a().a("use_sdk", Integer.valueOf(AbTestManager.a().ap() ? 1 : 0)).a("musicPath", str3).b());
        } else {
            final int checkAudioFile = ((IAVService) ServiceManager.get().getService(IAVService.class)).getSDKService().checkAudioFile(str3);
            if (checkAudioFile < 0) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) activity, (int) C0906R.string.bei).a();
                i.a((Callable<TResult>) new Callable<Void>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f44321a;

                    public final /* synthetic */ Object call() throws Exception {
                        if (PatchProxy.isSupport(new Object[0], this, f44321a, false, 39581, new Class[0], Void.class)) {
                            return (Void) PatchProxy.accessDispatch(new Object[0], this, f44321a, false, 39581, new Class[0], Void.class);
                        }
                        n.a("aweme_music_download_error_rate", 4, com.ss.android.ugc.aweme.app.d.c.a().a("use_sdk", Integer.valueOf(AbTestManager.a().ap() ? 1 : 0)).a("musicPath", str3).a("fileLength", String.valueOf(new File(str3).length())).a("fileUri", musicModel2.getPath()).a("fileMagic", ey.a(str3)).a("code", String.valueOf(checkAudioFile)).b());
                        return null;
                    }
                });
                return;
            }
            if (musicModel.getMusic() == null || musicModel.getMusic().getChallenge() == null) {
                ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().removeChallenges();
            } else {
                ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().addChallenge(com.ss.android.ugc.aweme.shortvideo.o.a.b(musicModel.getMusic().getChallenge()));
            }
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(new com.ss.android.ugc.aweme.shortvideo.o.c().apply(musicModel2));
            Intent intent = new Intent();
            intent.putExtra("path", str3);
            intent.putExtra("music_model", musicModel2);
            intent.putExtra("music_origin", str4);
            intent.putExtra("shoot_way", "collection_music");
            intent.putExtra("creation_id", UUID.randomUUID().toString());
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) activity, intent);
        }
    }
}
