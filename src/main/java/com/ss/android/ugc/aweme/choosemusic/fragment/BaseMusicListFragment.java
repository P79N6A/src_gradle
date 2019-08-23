package com.ss.android.ugc.aweme.choosemusic.fragment;

import a.i;
import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.a;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter;
import com.ss.android.ugc.aweme.choosemusic.b.b;
import com.ss.android.ugc.aweme.choosemusic.f.d;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.a.e;
import com.ss.android.ugc.aweme.music.adapter.f;
import com.ss.android.ugc.aweme.music.ui.c;
import com.ss.android.ugc.aweme.music.ui.p;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.bm;
import com.ss.android.ugc.aweme.utils.ey;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.Subscribe;

public abstract class BaseMusicListFragment<T> extends AmeBaseFragment implements Observer<a>, a.C0022a<T>, b, f<com.ss.android.ugc.aweme.choosemusic.a.b>, c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2825a;

    /* renamed from: b  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.choosemusic.f.a f2826b;

    /* renamed from: c  reason: collision with root package name */
    protected MusicModel f2827c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2828d = true;

    /* renamed from: e  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.choosemusic.d.a f2829e;

    /* renamed from: f  reason: collision with root package name */
    public DataCenter f2830f;
    protected com.ss.android.ugc.aweme.arch.c<T> g;
    protected int h;
    private com.ss.android.ugc.aweme.arch.a i;

    public final void a(MusicModel musicModel, Exception exc) {
        if (PatchProxy.isSupport(new Object[]{musicModel, exc}, this, f2825a, false, 26520, new Class[]{MusicModel.class, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel, exc}, this, f2825a, false, 26520, new Class[]{MusicModel.class, Exception.class}, Void.TYPE);
        }
    }

    public abstract com.ss.android.ugc.aweme.arch.c<T> b(View view);

    public boolean isRegisterEventBus() {
        return true;
    }

    public abstract int k();

    public abstract String l();

    public final MusicModel g() {
        return this.f2827c;
    }

    public final void a(String str, MusicModel musicModel, String str2) {
        final String str3 = str;
        final MusicModel musicModel2 = musicModel;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, musicModel2, str4}, this, f2825a, false, 26516, new Class[]{String.class, MusicModel.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, musicModel2, str4}, this, f2825a, false, 26516, new Class[]{String.class, MusicModel.class, String.class}, Void.TYPE);
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            if (!bm.a(str) || musicModel2 == null) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) activity, (int) C0906R.string.bei).a();
                n.a("aweme_music_download_error_rate", 3, com.ss.android.ugc.aweme.app.d.c.a().a("use_sdk", Integer.valueOf(AbTestManager.a().ap() ? 1 : 0)).a("musicPath", str3).b());
                return;
            }
            final int checkAudioFile = ((IAVService) ServiceManager.get().getService(IAVService.class)).getSDKService().checkAudioFile(str3);
            if (checkAudioFile < 0) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) activity, (int) C0906R.string.bei).a();
                i.a((Callable<TResult>) new Callable<Void>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f35911a;

                    public final /* synthetic */ Object call() throws Exception {
                        if (PatchProxy.isSupport(new Object[0], this, f35911a, false, 26521, new Class[0], Void.class)) {
                            return (Void) PatchProxy.accessDispatch(new Object[0], this, f35911a, false, 26521, new Class[0], Void.class);
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
            a(str3, musicModel2, str4, activity);
        }
    }

    public void a(String str, MusicModel musicModel, String str2, Activity activity) {
        String str3 = str;
        MusicModel musicModel2 = musicModel;
        String str4 = str2;
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{str3, musicModel2, str4, activity2}, this, f2825a, false, 26517, new Class[]{String.class, MusicModel.class, String.class, Activity.class}, Void.TYPE)) {
            Object[] objArr = {str3, musicModel2, str4, activity2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f2825a, false, 26517, new Class[]{String.class, MusicModel.class, String.class, Activity.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("path", str3);
        intent.putExtra("music_model", musicModel2);
        intent.putExtra("music_origin", str4);
        if (this.h == 1) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity(activity2, intent);
            activity.finish();
            return;
        }
        activity2.setResult(-1, intent);
        activity.finish();
    }

    @CallSuper
    public DataCenter e() {
        if (PatchProxy.isSupport(new Object[0], this, f2825a, false, 26502, new Class[0], DataCenter.class)) {
            return (DataCenter) PatchProxy.accessDispatch(new Object[0], this, f2825a, false, 26502, new Class[0], DataCenter.class);
        }
        if (this.f2830f == null) {
            this.f2830f = DataCenter.a(com.ss.android.ugc.aweme.arch.widgets.base.c.a((Fragment) this), (LifecycleOwner) this);
        }
        this.f2830f.a("music_collect_status", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this);
        return this.f2830f;
    }

    public final Activity h() {
        if (!PatchProxy.isSupport(new Object[0], this, f2825a, false, 26510, new Class[0], Activity.class)) {
            return getActivity();
        }
        return (Activity) PatchProxy.accessDispatch(new Object[0], this, f2825a, false, 26510, new Class[0], Activity.class);
    }

    public final boolean i() {
        if (!PatchProxy.isSupport(new Object[0], this, f2825a, false, 26511, new Class[0], Boolean.TYPE)) {
            return isViewValid();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2825a, false, 26511, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public RecyclerView.Adapter j() {
        if (PatchProxy.isSupport(new Object[0], this, f2825a, false, 26512, new Class[0], RecyclerView.Adapter.class)) {
            return (RecyclerView.Adapter) PatchProxy.accessDispatch(new Object[0], this, f2825a, false, 26512, new Class[0], RecyclerView.Adapter.class);
        } else if (this.g != null) {
            return this.g.d();
        } else {
            return null;
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f2825a, false, 26515, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2825a, false, 26515, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.f2826b != null) {
            this.f2826b.a();
            this.f2826b.d();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f2825a, false, 26513, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2825a, false, 26513, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.f2826b != null) {
            this.f2826b.o = false;
        }
    }

    @CallSuper
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f2825a, false, 26500, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2825a, false, 26500, new Class[0], Void.TYPE);
            return;
        }
        this.f2829e = new com.ss.android.ugc.aweme.choosemusic.d.a(getContext(), this.f2830f);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f2825a, false, 26514, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2825a, false, 26514, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.f2826b != null) {
            this.f2826b.a();
            this.f2826b.o = true;
        }
        RecyclerView.Adapter j = j();
        if (j instanceof MusicAdapter) {
            ((MusicAdapter) j).a();
        }
    }

    public final void a(p.a aVar) {
        this.f2826b.k = aVar;
    }

    @CallSuper
    public final com.ss.android.ugc.aweme.arch.c<T> a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f2825a, false, 26501, new Class[]{View.class}, com.ss.android.ugc.aweme.arch.c.class)) {
            return (com.ss.android.ugc.aweme.arch.c) PatchProxy.accessDispatch(new Object[]{view}, this, f2825a, false, 26501, new Class[]{View.class}, com.ss.android.ugc.aweme.arch.c.class);
        }
        this.g = b(view);
        return this.g;
    }

    public final void b(MusicModel musicModel) {
        if (PatchProxy.isSupport(new Object[]{musicModel}, this, f2825a, false, 26508, new Class[]{MusicModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel}, this, f2825a, false, 26508, new Class[]{MusicModel.class}, Void.TYPE);
            return;
        }
        this.f2826b.l = l();
        this.f2826b.b(musicModel, k());
    }

    public void onCreate(Bundle bundle) {
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f2825a, false, 26499, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f2825a, false, 26499, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            i2 = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        }
        this.h = i2;
    }

    @Subscribe(b = true)
    public void onMusicCollectEvent(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f2825a, false, 26519, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f2825a, false, 26519, new Class[]{e.class}, Void.TYPE);
            return;
        }
        if (!(this.f2830f == null || eVar == null || !"music_detail".equals(eVar.f56171c))) {
            DataCenter dataCenter = this.f2830f;
            com.ss.android.ugc.aweme.choosemusic.a.a aVar = new com.ss.android.ugc.aweme.choosemusic.a.a(0, eVar.f56169a, -1, -1, eVar.f56170b);
            dataCenter.a("music_collect_status", (Object) aVar);
        }
    }

    @CallSuper
    /* renamed from: a */
    public void onChanged(@Nullable com.ss.android.ugc.aweme.arch.widgets.base.a aVar) {
        int i2;
        int i3;
        MusicModel.CollectionType collectionType;
        char c2 = 0;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f2825a, false, 26503, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f2825a, false, 26503, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE);
        } else if (aVar != null) {
            String str = aVar.f34376a;
            if (str.hashCode() != -1635157503 || !str.equals("music_collect_status")) {
                c2 = 65535;
            }
            if (c2 == 0) {
                com.ss.android.ugc.aweme.choosemusic.a.a aVar2 = (com.ss.android.ugc.aweme.choosemusic.a.a) aVar.a();
                if (!(this.g == null || this.g.d() == null)) {
                    List data = this.g.d().getData();
                    if (!CollectionUtils.isEmpty(data)) {
                        if (aVar2.f35737a == 1) {
                            if (data.size() > aVar2.f35739c) {
                                this.g.d().notifyItemChanged(aVar2.f35739c);
                            }
                        } else if (aVar2.f35739c == -1) {
                            MusicModel a2 = d.a(data, aVar2.f35741e.getMusicId());
                            if (a2 != null) {
                                if (aVar2.f35740d == 1) {
                                    collectionType = MusicModel.CollectionType.COLLECTED;
                                } else {
                                    collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                                }
                                a2.setCollectionType(collectionType);
                                int indexOf = data.indexOf(a2);
                                if (indexOf >= 0 && indexOf < data.size()) {
                                    this.g.d().notifyItemChanged(indexOf);
                                }
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (getUserVisibleHint()) {
                    if (aVar2.f35737a == 1) {
                        FragmentActivity activity = getActivity();
                        if (aVar2.f35740d == 1) {
                            i3 = C0906R.string.u6;
                        } else {
                            i3 = C0906R.string.pp;
                        }
                        com.bytedance.ies.dmt.ui.d.a.b((Context) activity, i3).a();
                        return;
                    }
                    FragmentActivity activity2 = getActivity();
                    if (aVar2.f35740d == 1) {
                        i2 = C0906R.string.u_;
                    } else {
                        i2 = C0906R.string.pq;
                    }
                    com.bytedance.ies.dmt.ui.d.a.a((Context) activity2, i2).a();
                }
            }
        }
    }

    public final void a(MusicModel musicModel) {
        if (PatchProxy.isSupport(new Object[]{musicModel}, this, f2825a, false, 26507, new Class[]{MusicModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel}, this, f2825a, false, 26507, new Class[]{MusicModel.class}, Void.TYPE);
            return;
        }
        if (this.f2826b != null) {
            this.f2826b.a();
        }
    }

    public final /* synthetic */ void a(Object obj) {
        com.ss.android.ugc.aweme.choosemusic.a.b bVar = (com.ss.android.ugc.aweme.choosemusic.a.b) obj;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f2825a, false, 26518, new Class[]{com.ss.android.ugc.aweme.choosemusic.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f2825a, false, 26518, new Class[]{com.ss.android.ugc.aweme.choosemusic.a.b.class}, Void.TYPE);
            return;
        }
        String str = bVar.f35743b;
        MusicModel musicModel = bVar.f35742a;
        if ("follow_type".equals(str)) {
            this.f2829e.a(musicModel, musicModel.getMusicId(), 1, bVar.f35744c, bVar.f35745d);
            return;
        }
        if ("unfollow_type".equals(str)) {
            this.f2829e.a(musicModel, musicModel.getMusicId(), 0, bVar.f35744c, bVar.f35745d);
        }
    }

    @CallSuper
    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f2825a, false, 26504, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f2825a, false, 26504, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (this.i == null) {
            this.i = new com.ss.android.ugc.aweme.arch.a(this);
        }
        this.i.a(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f2825a, false, 26505, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2825a, false, 26505, new Class[0], Void.TYPE);
            return;
        }
        this.f2826b = new com.ss.android.ugc.aweme.choosemusic.f.a(this);
        this.f2826b.c();
        this.f2826b.b(this.h);
        RecyclerView.Adapter j = j();
        if (j instanceof MusicAdapter) {
            this.f2826b.f35883d = ((MusicAdapter) j).f35768f;
        }
    }

    public final void a(MusicModel musicModel, com.ss.android.ugc.aweme.choosemusic.a aVar) {
        if (PatchProxy.isSupport(new Object[]{musicModel, aVar}, this, f2825a, false, 26506, new Class[]{MusicModel.class, com.ss.android.ugc.aweme.choosemusic.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel, aVar}, this, f2825a, false, 26506, new Class[]{MusicModel.class, com.ss.android.ugc.aweme.choosemusic.a.class}, Void.TYPE);
            return;
        }
        this.f2827c = musicModel;
        if (this.f2828d) {
            this.f2826b.a(musicModel, k());
        } else {
            this.f2826b.b(musicModel, k());
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f2825a, false, 26498, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.ou, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f2825a, false, 26498, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
