package com.ss.android.ugc.aweme.choosemusic.fragment;

import a.i;
import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter;
import com.ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter;
import com.ss.android.ugc.aweme.choosemusic.b.b;
import com.ss.android.ugc.aweme.choosemusic.b.e;
import com.ss.android.ugc.aweme.choosemusic.f.a;
import com.ss.android.ugc.aweme.choosemusic.widgets.MusicBannerWidget;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.b;
import com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.adapter.f;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.c;
import com.ss.android.ugc.aweme.music.ui.p;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.bm;
import com.ss.android.ugc.aweme.utils.ey;
import java.io.File;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;

public class NewMusicTabFragment extends AmeBaseFragment implements Observer<a>, b, e, ScrollableLayout.b, b.a, f<com.ss.android.ugc.aweme.choosemusic.a.b>, c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2843a;

    /* renamed from: c  reason: collision with root package name */
    public static final String f2844c = ("android:switcher:" + C0906R.id.afi + ":");

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.choosemusic.e.a f2845b;

    /* renamed from: d  reason: collision with root package name */
    public DataCenter f2846d;

    /* renamed from: e  reason: collision with root package name */
    int f2847e;

    /* renamed from: f  reason: collision with root package name */
    public int f2848f;
    public MusicModel g;
    public DiscoverMusicFragment h;
    public CollectMusicFragment i;
    public com.ss.android.ugc.aweme.choosemusic.f.a j;
    protected com.ss.android.ugc.aweme.choosemusic.d.a k;
    public boolean l;
    private WidgetManager m;
    @BindView(2131497340)
    DmtStatusView mDmtStatusView;
    @BindView(2131496920)
    ScrollableLayout mScrollableLayout;
    @BindView(2131494311)
    ViewPager mVpFragmentContainer;
    @BindView(2131493987)
    View mVwDivideLine;
    private MusicBannerWidget n;
    private String o;
    private String p;
    private String q;
    private int r;
    private boolean s = true;
    private String t = "popular_song";
    @BindView(2131497445)
    CommonTabLayout tabLayout;
    private Music u;

    public final void a(MusicModel musicModel, Exception exc) {
        if (PatchProxy.isSupport(new Object[]{musicModel, exc}, this, f2843a, false, 26706, new Class[]{MusicModel.class, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel, exc}, this, f2843a, false, 26706, new Class[]{MusicModel.class, Exception.class}, Void.TYPE);
        }
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public final boolean q_() {
        return false;
    }

    private int k() {
        return this.r;
    }

    public final MusicModel g() {
        return this.g;
    }

    public final void a(String str, MusicModel musicModel, String str2) {
        final String str3 = str;
        final MusicModel musicModel2 = musicModel;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, musicModel2, str4}, this, f2843a, false, 26697, new Class[]{String.class, MusicModel.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, musicModel2, str4}, this, f2843a, false, 26697, new Class[]{String.class, MusicModel.class, String.class}, Void.TYPE);
            return;
        }
        FragmentActivity activity = getActivity();
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
                public static ChangeQuickRedirect f35957a;

                public final /* synthetic */ Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f35957a, false, 26714, new Class[0], Void.class)) {
                        return (Void) PatchProxy.accessDispatch(new Object[0], this, f35957a, false, 26714, new Class[0], Void.class);
                    }
                    n.a("aweme_music_download_error_rate", 4, com.ss.android.ugc.aweme.app.d.c.a().a("use_sdk", Integer.valueOf(AbTestManager.a().ap() ? 1 : 0)).a("musicPath", str3).a("fileLength", String.valueOf(new File(str3).length())).a("fileUri", musicModel2.getPath()).a("fileMagic", ey.a(str3)).a("code", String.valueOf(checkAudioFile)).b());
                    return null;
                }
            });
            return;
        }
        Intent intent = new Intent();
        if (musicModel.getMusicType() == MusicModel.MusicType.LOCAL) {
            intent.putExtra("path", str3);
            intent.putExtra("music_model", musicModel2);
            intent.putExtra("music_origin", str4);
        } else {
            intent.putExtra("path", str3);
            intent.putExtra("music_model", musicModel2);
            intent.putExtra("music_origin", str4);
        }
        if (k() == 0 || k() == 2) {
            activity.setResult(-1, intent);
            activity.finish();
            return;
        }
        intent.putExtra("shoot_way", getArguments().getString("shoot_way"));
        intent.putExtra("creation_id", UUID.randomUUID().toString());
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) activity, intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f2843a, false, 26673, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2843a, false, 26673, new Class[0], Void.TYPE);
            return;
        }
        j();
        if (this.o != null) {
            this.k.a(this.o, false, this.p, this.u);
        } else {
            this.k.a(false, this.p, this.u);
        }
    }

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, f2843a, false, 26675, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2843a, false, 26675, new Class[0], Void.TYPE);
            return;
        }
        if (this.mDmtStatusView != null) {
            this.mDmtStatusView.d();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f2843a, false, 26689, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2843a, false, 26689, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.a();
        }
    }

    public final View f() {
        if (PatchProxy.isSupport(new Object[0], this, f2843a, false, 26685, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f2843a, false, 26685, new Class[0], View.class);
        } else if (this.f2847e == 0) {
            return this.h.f();
        } else {
            return this.i.f();
        }
    }

    public final Activity h() {
        if (!PatchProxy.isSupport(new Object[0], this, f2843a, false, 26695, new Class[0], Activity.class)) {
            return getActivity();
        }
        return (Activity) PatchProxy.accessDispatch(new Object[0], this, f2843a, false, 26695, new Class[0], Activity.class);
    }

    public final boolean i() {
        if (!PatchProxy.isSupport(new Object[0], this, f2843a, false, 26696, new Class[0], Boolean.TYPE)) {
            return isViewValid();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2843a, false, 26696, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f2843a, false, 26694, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2843a, false, 26694, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.j != null) {
            this.j.a();
            this.j.d();
        }
        if (this.f2845b != null) {
            this.f2845b.dismiss();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f2843a, false, 26691, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2843a, false, 26691, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.j != null) {
            this.j.o = false;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2843a, false, 26699, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2843a, false, 26699, new Class[0], Void.TYPE);
        } else if (this.mScrollableLayout != null && this.mScrollableLayout.getParent() != null) {
            int measuredHeight = ((View) this.mScrollableLayout.getParent()).getMeasuredHeight();
            this.h.a((measuredHeight + this.mScrollableLayout.getCurScrollY()) - this.mScrollableLayout.getChildAt(0).getMeasuredHeight());
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f2843a, false, 26692, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2843a, false, 26692, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.j != null) {
            this.j.a();
            this.j.o = true;
        }
        this.f2846d.a("music_position", (Object) -1);
        this.f2846d.a("music_index", (Object) -1);
    }

    public final void b(int i2) {
        this.f2848f = i2;
    }

    public final void a(p.a aVar) {
        this.j.k = aVar;
    }

    public final void b(MusicModel musicModel) {
        if (PatchProxy.isSupport(new Object[]{musicModel}, this, f2843a, false, 26688, new Class[]{MusicModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel}, this, f2843a, false, 26688, new Class[]{MusicModel.class}, Void.TYPE);
            return;
        }
        this.j.l = this.t;
        this.j.b(musicModel, this.f2848f);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2843a, false, 26684, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2843a, false, 26684, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 == 1) {
            this.k.b(0, 20);
            this.mVpFragmentContainer.setCurrentItem(1);
            this.mScrollableLayout.getHelper().f40577c = this.i;
        } else {
            this.mVpFragmentContainer.setCurrentItem(0);
            this.mScrollableLayout.getHelper().f40577c = this.h;
        }
        this.f2847e = i2;
        switch (this.f2847e) {
            case 0:
                this.f2848f = 0;
                break;
            case 1:
                this.f2848f = 1;
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.Serializable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f2843a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 26667(0x682b, float:3.7368E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f2843a
            r3 = 0
            r4 = 26667(0x682b, float:3.7368E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            super.onCreate(r10)
            android.os.Bundle r0 = r9.getArguments()
            android.os.Bundle r1 = r9.getArguments()
            if (r1 == 0) goto L_0x004d
            java.lang.String r1 = "challenge"
            boolean r1 = r0.containsKey(r1)
            if (r1 == 0) goto L_0x004d
            java.lang.String r1 = "challenge"
            java.lang.String r1 = r0.getString(r1)
            r9.o = r1
        L_0x004d:
            java.lang.String r1 = "first_sticker_music_ids"
            r2 = 0
            java.lang.String r1 = r0.getString(r1, r2)
            r9.p = r1
            java.lang.String r1 = "first_sticker_id"
            java.lang.String r1 = r0.getString(r1, r2)
            r9.q = r1
            if (r0 == 0) goto L_0x0066
            java.lang.String r1 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE"
            int r8 = r0.getInt(r1)
        L_0x0066:
            r9.r = r8
            if (r0 == 0) goto L_0x0073
            java.lang.String r1 = "sticker_music"
            java.io.Serializable r0 = r0.getSerializable(r1)
            r2 = r0
            com.ss.android.ugc.aweme.music.model.Music r2 = (com.ss.android.ugc.aweme.music.model.Music) r2
        L_0x0073:
            r9.u = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicTabFragment.onCreate(android.os.Bundle):void");
    }

    @Subscribe(b = true)
    public void onMusicCollectEvent(com.ss.android.ugc.aweme.music.a.e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f2843a, false, 26704, new Class[]{com.ss.android.ugc.aweme.music.a.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f2843a, false, 26704, new Class[]{com.ss.android.ugc.aweme.music.a.e.class}, Void.TYPE);
            return;
        }
        if (!(this.f2846d == null || eVar == null || !"music_detail".equals(eVar.f56171c))) {
            DataCenter dataCenter = this.f2846d;
            com.ss.android.ugc.aweme.choosemusic.a.a aVar = new com.ss.android.ugc.aweme.choosemusic.a.a(0, eVar.f56169a, -1, -1, eVar.f56170b);
            dataCenter.a("music_collect_status", (Object) aVar);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f2843a, false, 26703, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f2843a, false, 26703, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle2.putInt("KEY_CURRENT_TAB", this.f2847e);
    }

    public final void a(MusicModel musicModel) {
        if (PatchProxy.isSupport(new Object[]{musicModel}, this, f2843a, false, 26687, new Class[]{MusicModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel}, this, f2843a, false, 26687, new Class[]{MusicModel.class}, Void.TYPE);
            return;
        }
        a();
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        boolean z;
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f2843a, false, 26678, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f2843a, false, 26678, new Class[]{a.class}, Void.TYPE);
            return;
        }
        String str = aVar.f34376a;
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -2080369200) {
            if (hashCode != -1833731743) {
                if (hashCode == -1635157503 && str.equals("music_collect_status")) {
                    c2 = 2;
                }
            } else if (str.equals("data_banner")) {
                c2 = 1;
            }
        } else if (str.equals("pick_status")) {
            c2 = 0;
        }
        switch (c2) {
            case 0:
                if (((Integer) aVar.a()).intValue() == 1) {
                    if (PatchProxy.isSupport(new Object[0], this, f2843a, false, 26683, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f2843a, false, 26683, new Class[0], Void.TYPE);
                        break;
                    } else {
                        if (PatchProxy.isSupport(new Object[0], this, f2843a, false, 26677, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f2843a, false, 26677, new Class[0], Void.TYPE);
                            break;
                        } else {
                            if (this.mDmtStatusView != null) {
                                this.mDmtStatusView.f();
                            }
                            return;
                        }
                    }
                } else {
                    if (PatchProxy.isSupport(new Object[0], this, f2843a, false, 26681, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f2843a, false, 26681, new Class[0], Void.TYPE);
                        break;
                    } else {
                        if (PatchProxy.isSupport(new Object[0], this, f2843a, false, 26676, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f2843a, false, 26676, new Class[0], Void.TYPE);
                        } else if (this.mDmtStatusView != null) {
                            this.mDmtStatusView.b();
                        }
                        if (PatchProxy.isSupport(new Object[0], this, f2843a, false, 26682, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f2843a, false, 26682, new Class[0], Void.TYPE);
                        } else {
                            Fragment parentFragment = getParentFragment();
                            if (parentFragment instanceof ChooseMusicFragment) {
                                ChooseMusicFragment chooseMusicFragment = (ChooseMusicFragment) parentFragment;
                                if (chooseMusicFragment.isViewValid()) {
                                    if (PatchProxy.isSupport(new Object[0], chooseMusicFragment, ChooseMusicFragment.f2831a, false, 26529, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], chooseMusicFragment, ChooseMusicFragment.f2831a, false, 26529, new Class[0], Void.TYPE);
                                    } else if (chooseMusicFragment.getActivity() != null && chooseMusicFragment.h) {
                                        com.ss.android.ugc.aweme.shortvideo.e curMusic = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getCurMusic();
                                        if (curMusic != null) {
                                            chooseMusicFragment.f2835e.setVisibility(0);
                                            chooseMusicFragment.f2836f.setText(chooseMusicFragment.getActivity().getString(C0906R.string.t1, new Object[]{curMusic.getMusicName()}));
                                            chooseMusicFragment.g.setOnClickListener(new View.OnClickListener(curMusic) {

                                                /* renamed from: a */
                                                public static ChangeQuickRedirect f35916a;

                                                /* renamed from: b */
                                                final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.e f35917b;

                                                public final void onClick(
/*
Method generation error in method: com.ss.android.ugc.aweme.choosemusic.fragment.ChooseMusicFragment.1.onClick(android.view.View):void, dex: classes4.dex
                                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.choosemusic.fragment.ChooseMusicFragment.1.onClick(android.view.View):void, class status: UNLOADED
                                                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                                                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                                                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:298)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:64)
                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                                                
*/
                                            });
                                        }
                                    }
                                }
                            }
                        }
                        this.mScrollableLayout.setVisibility(0);
                        return;
                    }
                }
            case 1:
                this.mScrollableLayout.postDelayed(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f35955a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f35955a, false, 26713, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f35955a, false, 26713, new Class[0], Void.TYPE);
                            return;
                        }
                        NewMusicTabFragment.this.b();
                    }
                }, 100);
                return;
            case 2:
                if (com.ss.android.g.a.a()) {
                    if (PatchProxy.isSupport(new Object[0], this, f2843a, false, 26679, new Class[0], Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2843a, false, 26679, new Class[0], Boolean.TYPE)).booleanValue();
                    } else {
                        Fragment parentFragment2 = getParentFragment();
                        if (parentFragment2 instanceof ChooseMusicFragment) {
                            z = ((ChooseMusicFragment) parentFragment2).f2833c;
                        } else {
                            z = false;
                        }
                    }
                    if (!z) {
                        com.ss.android.ugc.aweme.choosemusic.a.a aVar2 = (com.ss.android.ugc.aweme.choosemusic.a.a) aVar.a();
                        int i2 = aVar2.f35740d;
                        MusicModel musicModel = aVar2.f35741e;
                        int i3 = aVar2.f35737a;
                        if (i2 == 1 && i3 == 0) {
                            if (!PatchProxy.isSupport(new Object[]{musicModel}, this, f2843a, false, 26680, new Class[]{MusicModel.class}, Void.TYPE)) {
                                CommonTabLayout.e a2 = this.tabLayout.a(1);
                                com.ss.android.ugc.aweme.choosemusic.e.a aVar3 = this.f2845b;
                                CommonTabLayout.f fVar = a2.i;
                                if (!PatchProxy.isSupport(new Object[]{fVar, musicModel}, aVar3, com.ss.android.ugc.aweme.choosemusic.e.a.f35873a, false, 26755, new Class[]{View.class, MusicModel.class}, Void.TYPE)) {
                                    Intrinsics.checkParameterIsNotNull(fVar, "anchor");
                                    Intrinsics.checkParameterIsNotNull(musicModel, "musicModel");
                                    if (!TextUtils.isEmpty(musicModel.getPicPremium())) {
                                        com.ss.android.ugc.aweme.base.c.a(aVar3.f35875c, musicModel.getPicPremium());
                                    } else if (!TextUtils.isEmpty(musicModel.getPicBig())) {
                                        com.ss.android.ugc.aweme.base.c.a(aVar3.f35875c, musicModel.getPicBig());
                                    }
                                    aVar3.setWidth(fVar.getWidth() + u.a(24.0d));
                                    if (!aVar3.isShowing()) {
                                        aVar3.showAsDropDown(fVar, (fVar.getWidth() - aVar3.getWidth()) / 2, -((fVar.getHeight() + aVar3.f35876d.getMeasuredHeight()) - u.a(16.0d)));
                                    }
                                    if (!PatchProxy.isSupport(new Object[]{2000L}, aVar3, com.ss.android.ugc.aweme.choosemusic.e.a.f35873a, false, 26756, new Class[]{Long.TYPE}, Void.TYPE)) {
                                        aVar3.f35876d.removeCallbacks(aVar3.f35874b);
                                        aVar3.f35876d.postDelayed(aVar3.f35874b, 2000);
                                        break;
                                    } else {
                                        com.ss.android.ugc.aweme.choosemusic.e.a aVar4 = aVar3;
                                        PatchProxy.accessDispatch(new Object[]{2000L}, aVar4, com.ss.android.ugc.aweme.choosemusic.e.a.f35873a, false, 26756, new Class[]{Long.TYPE}, Void.TYPE);
                                        return;
                                    }
                                } else {
                                    com.ss.android.ugc.aweme.choosemusic.e.a aVar5 = aVar3;
                                    PatchProxy.accessDispatch(new Object[]{fVar, musicModel}, aVar5, com.ss.android.ugc.aweme.choosemusic.e.a.f35873a, false, 26755, new Class[]{View.class, MusicModel.class}, Void.TYPE);
                                    return;
                                }
                            } else {
                                PatchProxy.accessDispatch(new Object[]{musicModel}, this, f2843a, false, 26680, new Class[]{MusicModel.class}, Void.TYPE);
                                return;
                            }
                        }
                    }
                }
                break;
        }
    }

    public final /* synthetic */ void a(Object obj) {
        com.ss.android.ugc.aweme.choosemusic.a.b bVar = (com.ss.android.ugc.aweme.choosemusic.a.b) obj;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f2843a, false, 26702, new Class[]{com.ss.android.ugc.aweme.choosemusic.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f2843a, false, 26702, new Class[]{com.ss.android.ugc.aweme.choosemusic.a.b.class}, Void.TYPE);
            return;
        }
        String str = bVar.f35743b;
        MusicModel musicModel = bVar.f35742a;
        if ("follow_type".equals(str)) {
            this.k.a(musicModel, musicModel.getMusicId(), 1, bVar.f35744c, bVar.f35745d);
            return;
        }
        if ("unfollow_type".equals(str)) {
            this.k.a(musicModel, musicModel.getMusicId(), 0, bVar.f35744c, bVar.f35745d);
        }
    }

    public final void a(float f2, float f3) {
        RecyclerView recyclerView;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f2843a, false, 26700, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f2843a, false, 26700, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f2843a, false, 26701, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2843a, false, 26701, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid()) {
            if (this.f2847e == 0) {
                recyclerView = (RecyclerView) this.h.f();
            } else {
                recyclerView = (RecyclerView) this.i.f();
            }
            if (recyclerView != null) {
                int childCount = recyclerView.getChildCount();
                if (childCount == 0) {
                    this.mScrollableLayout.a();
                    this.mScrollableLayout.setMaxScrollHeight(0);
                    return;
                }
                View childAt = recyclerView.getLayoutManager().getChildAt(childCount - 1);
                int childCount2 = this.mScrollableLayout.getChildCount();
                if (childCount2 >= 2 && childAt != null) {
                    int measuredHeight = ((View) this.mScrollableLayout.getParent()).getMeasuredHeight();
                    this.mScrollableLayout.setMaxScrollHeight(((recyclerView.getTop() + childAt.getBottom()) + this.mScrollableLayout.getChildAt(childCount2 - 1).getTop()) - measuredHeight);
                }
            }
        }
    }

    public final void b(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f2843a, false, 26698, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f2843a, false, 26698, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        b();
    }

    public final void a(MusicModel musicModel, com.ss.android.ugc.aweme.choosemusic.a aVar) {
        if (PatchProxy.isSupport(new Object[]{musicModel, aVar}, this, f2843a, false, 26686, new Class[]{MusicModel.class, com.ss.android.ugc.aweme.choosemusic.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel, aVar}, this, f2843a, false, 26686, new Class[]{MusicModel.class, com.ss.android.ugc.aweme.choosemusic.a.class}, Void.TYPE);
            return;
        }
        this.g = musicModel;
        if (this.s) {
            this.j.f35883d = aVar;
            if (aVar != null && aVar.h) {
                this.f2846d.a("last_play_music_id", (Object) musicModel.getMusicId());
            }
            this.j.a(musicModel, this.f2848f, false);
            return;
        }
        this.j.b(musicModel, this.f2848f);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i2;
        CollectMusicFragment collectMusicFragment;
        DiscoverMusicFragment discoverMusicFragment;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle2}, this, f2843a, false, 26668, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle2}, this, f2843a, false, 26668, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.ov, viewGroup2, false);
        ButterKnife.bind((Object) this, inflate);
        this.mScrollableLayout.setVisibility(4);
        this.mScrollableLayout.setOnScrollListener(this);
        if (PatchProxy.isSupport(new Object[0], this, f2843a, false, 26674, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2843a, false, 26674, new Class[0], Void.TYPE);
        } else {
            this.mDmtStatusView.setBuilder(DmtStatusView.a.a(getContext()).a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new p(this)).c(0));
        }
        if (bundle2 == null) {
            i2 = 0;
        } else {
            i2 = bundle2.getInt("KEY_CURRENT_TAB", 0);
        }
        this.f2847e = i2;
        this.f2846d = DataCenter.a(ViewModelProviders.of((Fragment) this), (LifecycleOwner) this);
        this.f2846d.a("pick_status", (Observer<a>) this).a("data_banner", (Observer<a>) this).a("music_collect_status", (Observer<a>) this);
        this.f2846d.a("key_choose_music_type", (Object) Integer.valueOf(this.r));
        this.f2846d.a("sticker_id", (Object) this.q);
        this.f2846d.a("challenge_id", (Object) this.o);
        this.f2846d.a("mvtheme_music_type", (Object) Boolean.valueOf(this.l));
        this.m = WidgetManager.a((Fragment) this, inflate);
        this.m.a(this.f2846d);
        this.n = new MusicBannerWidget();
        this.k = new com.ss.android.ugc.aweme.choosemusic.d.a(getContext(), this.f2846d);
        this.m.b(C0906R.id.bgd, this.n);
        FragmentManager childFragmentManager = getChildFragmentManager();
        this.h = (DiscoverMusicFragment) childFragmentManager.findFragmentByTag(f2844c + 0);
        if (this.h == null) {
            int i3 = this.r;
            String str = this.o;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3), str}, null, DiscoverMusicFragment.f35928a, true, 26575, new Class[]{Integer.TYPE, String.class}, DiscoverMusicFragment.class)) {
                discoverMusicFragment = (DiscoverMusicFragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3), str}, null, DiscoverMusicFragment.f35928a, true, 26575, new Class[]{Integer.TYPE, String.class}, DiscoverMusicFragment.class);
            } else {
                Bundle bundle3 = new Bundle();
                bundle3.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i3);
                if (!TextUtils.isEmpty(str)) {
                    bundle3.putString("challenge", str);
                }
                discoverMusicFragment = new DiscoverMusicFragment();
                discoverMusicFragment.setArguments(bundle3);
            }
            this.h = discoverMusicFragment;
        }
        this.h.f35929b = this.f2846d;
        this.h.f35930c = this.m;
        this.h.h = this.k;
        DiscoverMusicFragment discoverMusicFragment2 = this.h;
        discoverMusicFragment2.f35932e = this;
        if (discoverMusicFragment2.f35931d != null) {
            discoverMusicFragment2.f35931d.f35760f = discoverMusicFragment2.f35932e;
        }
        DiscoverMusicFragment discoverMusicFragment3 = this.h;
        discoverMusicFragment3.f35933f = this;
        if (discoverMusicFragment3.f35931d != null) {
            discoverMusicFragment3.f35931d.g = discoverMusicFragment3.f35933f;
        }
        DiscoverMusicFragment discoverMusicFragment4 = this.h;
        discoverMusicFragment4.g = this;
        if (discoverMusicFragment4.f35931d != null) {
            discoverMusicFragment4.f35931d.k = discoverMusicFragment4.g;
        }
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        this.i = (CollectMusicFragment) childFragmentManager2.findFragmentByTag(f2844c + 1);
        if (this.i == null) {
            int i4 = this.r;
            String str2 = this.o;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i4), str2}, null, CollectMusicFragment.i, true, 26556, new Class[]{Integer.TYPE, String.class}, CollectMusicFragment.class)) {
                collectMusicFragment = (CollectMusicFragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i4), str2}, null, CollectMusicFragment.i, true, 26556, new Class[]{Integer.TYPE, String.class}, CollectMusicFragment.class);
            } else {
                Bundle bundle4 = new Bundle();
                bundle4.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i4);
                if (!TextUtils.isEmpty(str2)) {
                    bundle4.putString("challenge", str2);
                }
                collectMusicFragment = new CollectMusicFragment();
                collectMusicFragment.setArguments(bundle4);
            }
            this.i = collectMusicFragment;
        }
        this.i.f2830f = this.f2846d;
        this.i.j = this;
        this.j = new com.ss.android.ugc.aweme.choosemusic.f.a(this, new a.C0456a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35948a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f35948a, false, 26709, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f35948a, false, 26709, new Class[0], Void.TYPE);
                    return;
                }
                if (NewMusicTabFragment.this.g != null) {
                    NewMusicTabFragment.this.f2846d.a("play_compeleted", (Object) NewMusicTabFragment.this.g.getMusicId());
                }
            }

            public final void a(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f35948a, false, 26710, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f35948a, false, 26710, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (NewMusicTabFragment.this.g != null) {
                    NewMusicTabFragment.this.f2846d.a("play_error", (Object) NewMusicTabFragment.this.g.getMusicId());
                }
            }
        });
        this.j.c();
        this.j.b(this.r);
        this.f2845b = new com.ss.android.ugc.aweme.choosemusic.e.a(getContext());
        this.mVpFragmentContainer.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35950a;

            /* renamed from: c  reason: collision with root package name */
            private final int[] f35952c = {C0906R.string.a62, C0906R.string.bez};

            public int getCount() {
                return 2;
            }

            public Fragment getItem(int i) {
                if (i == 0) {
                    return NewMusicTabFragment.this.h;
                }
                return NewMusicTabFragment.this.i;
            }

            @Nullable
            public CharSequence getPageTitle(int i) {
                if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f35950a, false, 26711, new Class[]{Integer.TYPE}, CharSequence.class)) {
                    return NewMusicTabFragment.this.getResources().getString(this.f35952c[i]);
                }
                return (CharSequence) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f35950a, false, 26711, new Class[]{Integer.TYPE}, CharSequence.class);
            }
        });
        if (PatchProxy.isSupport(new Object[0], this, f2843a, false, 26671, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2843a, false, 26671, new Class[0], Void.TYPE);
        } else {
            this.tabLayout.setCustomTabViewResId(C0906R.layout.xr);
            this.tabLayout.setTabMode(1);
            this.tabLayout.setupWithViewPager(this.mVpFragmentContainer);
            LinearLayout linearLayout = (LinearLayout) this.tabLayout.getChildAt(0);
            linearLayout.setShowDividers(2);
            linearLayout.setDividerDrawable(ContextCompat.getDrawable(getContext(), 2130841700));
            linearLayout.setDividerPadding(u.a(16.0d));
            this.tabLayout.setOnTabClickListener(new o(this));
            if (com.ss.android.g.a.a()) {
                this.tabLayout.setSelectedTabIndicatorHeight(u.a(2.0d));
            } else {
                this.tabLayout.setSelectedTabIndicatorHeight(0);
            }
            this.tabLayout.a((CommonTabLayout.b) new CommonTabLayout.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f35953a;

                public final void b(CommonTabLayout.e eVar) {
                }

                public final void c(CommonTabLayout.e eVar) {
                }

                public final void a(CommonTabLayout.e eVar) {
                    Object obj;
                    CommonTabLayout.e eVar2 = eVar;
                    if (PatchProxy.isSupport(new Object[]{eVar2}, this, f35953a, false, 26712, new Class[]{CommonTabLayout.e.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{eVar2}, this, f35953a, false, 26712, new Class[]{CommonTabLayout.e.class}, Void.TYPE);
                        return;
                    }
                    int i = eVar2.f40629f;
                    if (i == 1 && NewMusicTabFragment.this.f2845b != null) {
                        NewMusicTabFragment.this.f2845b.dismiss();
                    }
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, com.ss.android.ugc.aweme.choosemusic.f.c.f35896a, true, 26778, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, com.ss.android.ugc.aweme.choosemusic.f.c.f35896a, true, 26778, new Class[]{Integer.TYPE}, Void.TYPE);
                    } else {
                        d a2 = d.a();
                        String str = "";
                        switch (i) {
                            case 0:
                                str = "popular_song";
                                break;
                            case 1:
                                str = "favourite_song";
                                break;
                        }
                        r.a("enter_music_tab", (Map) a2.a("tab_name", str).f34114b);
                    }
                    NewMusicTabFragment newMusicTabFragment = NewMusicTabFragment.this;
                    if (PatchProxy.isSupport(new Object[0], newMusicTabFragment, NewMusicTabFragment.f2843a, false, 26693, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], newMusicTabFragment, NewMusicTabFragment.f2843a, false, 26693, new Class[0], Void.TYPE);
                    } else {
                        if (PatchProxy.isSupport(new Object[0], newMusicTabFragment, NewMusicTabFragment.f2843a, false, 26690, new Class[0], RecyclerView.Adapter.class)) {
                            obj = (RecyclerView.Adapter) PatchProxy.accessDispatch(new Object[0], newMusicTabFragment, NewMusicTabFragment.f2843a, false, 26690, new Class[0], RecyclerView.Adapter.class);
                        } else if (newMusicTabFragment.f2847e == 0) {
                            obj = newMusicTabFragment.h.f35931d;
                        } else {
                            obj = newMusicTabFragment.i.j();
                        }
                        if (obj != null) {
                            if (obj instanceof MusicAdapter) {
                                ((MusicAdapter) obj).a();
                            } else if (obj instanceof DiscoverWidgetAdapter) {
                                ((DiscoverWidgetAdapter) obj).a();
                            }
                        }
                    }
                    NewMusicTabFragment.this.a(i);
                }
            });
            this.tabLayout.a(this.f2847e).a();
        }
        if (PatchProxy.isSupport(new Object[0], this, f2843a, false, 26670, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2843a, false, 26670, new Class[0], Void.TYPE);
        } else if (com.ss.android.g.a.a()) {
            this.mScrollableLayout.setTabsMarginTop(u.a(44.0d));
        } else {
            this.mScrollableLayout.setTabsMarginTop(0);
        }
        a(this.f2847e);
        if (PatchProxy.isSupport(new Object[0], this, f2843a, false, 26672, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2843a, false, 26672, new Class[0], Void.TYPE);
        } else {
            d();
        }
        if (PatchProxy.isSupport(new Object[0], this, f2843a, false, 26669, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2843a, false, 26669, new Class[0], Void.TYPE);
        } else {
            Activity h2 = h();
            if (h2 instanceof ChooseMusicActivity) {
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = ((ChooseMusicActivity) h2).f35750d;
                if (viewPagerBottomSheetBehavior != null) {
                    viewPagerBottomSheetBehavior.a(this.mVpFragmentContainer);
                }
            }
        }
        return inflate;
    }
}
