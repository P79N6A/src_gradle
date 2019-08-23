package com.ss.android.ugc.aweme.challenge.ui;

import a.i;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.medialib.g;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.detail.AbstractDetailFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.music.ui.MusicDetailFragment;
import com.ss.android.ugc.aweme.music.ui.p;
import com.ss.android.ugc.aweme.music.ui.t;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.share.bv;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import com.ss.android.ugc.aweme.u.aj;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.ey;
import com.ss.android.ugc.b.b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public abstract class BaseDetailFragment extends AbstractDetailFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2807a;

    /* renamed from: b  reason: collision with root package name */
    protected List<Integer> f2808b;

    /* renamed from: c  reason: collision with root package name */
    public long f2809c;

    /* renamed from: d  reason: collision with root package name */
    protected b f2810d;

    /* renamed from: e  reason: collision with root package name */
    protected d f2811e;

    public void a(@NonNull Intent intent) {
    }

    public void a(MusicModel musicModel) {
    }

    public String i() {
        return "";
    }

    /* access modifiers changed from: private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f2807a, false, 25981, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2807a, false, 25981, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2811e != null && this.f2811e.isShowing()) {
            this.f2811e.dismiss();
        }
        this.f2811e = null;
    }

    public boolean g() {
        if (!PatchProxy.isSupport(new Object[0], this, f2807a, false, 25975, new Class[0], Boolean.TYPE)) {
            return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).isHaveLatestTab();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2807a, false, 25975, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f2807a, false, 25976, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2807a, false, 25976, new Class[0], Void.TYPE);
            return;
        }
        if (this.H != null) {
            this.H.a(false);
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f2807a, false, 25982, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2807a, false, 25982, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        a();
    }

    public final String a(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f2807a, false, 25983, new Class[]{Long.TYPE}, String.class)) {
            return com.ss.android.ugc.aweme.i18n.b.a(j);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f2807a, false, 25983, new Class[]{Long.TYPE}, String.class);
    }

    public final void b(final MusicModel musicModel) {
        if (PatchProxy.isSupport(new Object[]{musicModel}, this, f2807a, false, 25978, new Class[]{MusicModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel}, this, f2807a, false, 25978, new Class[]{MusicModel.class}, Void.TYPE);
            return;
        }
        if (((AmeActivity) getActivity()) != null) {
            IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
            if (iAVService != null && iAVService.needLoginBeforeRecord()) {
                e.a((Fragment) this, a(this.B), "click_music_shoot", ad.a().a("login_title", getString(C0906R.string.c7i)).f75487b);
            } else if (musicModel != null) {
                if (PatchProxy.isSupport(new Object[]{musicModel}, this, f2807a, false, 25979, new Class[]{MusicModel.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{musicModel}, this, f2807a, false, 25979, new Class[]{MusicModel.class}, Void.TYPE);
                } else {
                    t tVar = new t(com.ss.android.ugc.aweme.music.util.e.a(musicModel), p.q);
                    final int musicWaveBeanRemainProgress = ((IAVService) ServiceManager.get().getService(IAVService.class)).getMusicWaveBeanRemainProgress(2);
                    tVar.a((com.ss.android.ugc.aweme.music.e) new com.ss.android.ugc.aweme.music.e() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f35452a;

                        public final void a(String str, int i, String str2, int i2) {
                            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), str2, Integer.valueOf(i2)}, this, f35452a, false, 25987, new Class[]{String.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), str2, Integer.valueOf(i2)}, this, f35452a, false, 25987, new Class[]{String.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            FragmentActivity activity = BaseDetailFragment.this.getActivity();
                            if (activity != null) {
                                final int i3 = i2;
                                activity.runOnUiThread(new Runnable() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f35464a;

                                    public final void run() {
                                        if (PatchProxy.isSupport(new Object[0], this, f35464a, false, 25992, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f35464a, false, 25992, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        if (BaseDetailFragment.this.f2811e != null) {
                                            if (i3 > musicWaveBeanRemainProgress) {
                                                BaseDetailFragment.this.f2811e.setProgress(musicWaveBeanRemainProgress);
                                            } else {
                                                BaseDetailFragment.this.f2811e.setProgress(i3);
                                            }
                                            if (i3 >= 98 && BaseDetailFragment.this.f2811e != null) {
                                                BaseDetailFragment.this.f2811e.setCancelable(true);
                                            }
                                        }
                                    }
                                });
                            }
                        }

                        public final void a(String str, int i, String str2, Exception exc) {
                            final String str3 = str;
                            final Exception exc2 = exc;
                            if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), str2, exc2}, this, f35452a, false, 25988, new Class[]{String.class, Integer.TYPE, String.class, Exception.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i), str2, exc2}, this, f35452a, false, 25988, new Class[]{String.class, Integer.TYPE, String.class, Exception.class}, Void.TYPE);
                                return;
                            }
                            a.b(new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f35467a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f35467a, false, 25993, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f35467a, false, 25993, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    BaseDetailFragment.this.a();
                                    BaseDetailFragment.this.f2810d.b();
                                    FragmentActivity activity = BaseDetailFragment.this.getActivity();
                                    int i = 2;
                                    if (activity != null) {
                                        if (exc2 != null && exc2.getMessage() != null && exc2.getMessage().startsWith("android storage memory size is too low")) {
                                            i = 5;
                                            com.bytedance.ies.dmt.ui.d.a.b((Context) activity, (int) C0906R.string.a63).a();
                                        } else if (exc2 == null || exc2.getMessage().startsWith("cancel by user")) {
                                            com.bytedance.ies.dmt.ui.d.a.b((Context) activity, (int) C0906R.string.bei).a();
                                        } else {
                                            i = 1;
                                        }
                                    }
                                    if (NetworkUtils.isNetworkAvailable(k.a())) {
                                        n.a("aweme_music_download_error_rate", i, c.a().a("fileUri", str3).a("trace", "BaseDetailFragment").a("use_sdk", Integer.valueOf(AbTestManager.a().ap() ? 1 : 0)).b());
                                    }
                                }
                            });
                            com.ss.android.ugc.aweme.app.d.a.a("aweme_music_download_log", "aweme_music", exc.getMessage(), str3);
                        }

                        public final void a(String str, int i, @Nullable String str2, @Nullable float[] fArr) {
                            String str3;
                            int i2;
                            int i3;
                            String str4;
                            double d2;
                            String str5 = str;
                            int i4 = i;
                            String str6 = str2;
                            if (PatchProxy.isSupport(new Object[]{str5, Integer.valueOf(i), str6, null}, this, f35452a, false, 25986, new Class[]{String.class, Integer.TYPE, String.class, float[].class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{str5, Integer.valueOf(i), str6, null}, this, f35452a, false, 25986, new Class[]{String.class, Integer.TYPE, String.class, float[].class}, Void.TYPE);
                                return;
                            }
                            com.ss.android.ugc.aweme.framework.a.a.a("BaseDetailFragment,onDownloadSuccess  musicFileName=" + str5 + "  musicSource=" + i4 + " musicEffectsUrl" + str6);
                            if (BaseDetailFragment.this.isAdded()) {
                                if (musicModel != null) {
                                    i3 = 3;
                                    i2 = i4;
                                    str3 = str6;
                                    str4 = str5;
                                    Object musicWaveBean = ((IAVService) ServiceManager.get().getService(IAVService.class)).getMusicWaveBean(str, 2, true, false, -1, null);
                                    if (musicWaveBean != null && (musicWaveBean instanceof MusicWaveBean)) {
                                        musicModel.setMusicWaveBean((MusicWaveBean) musicWaveBean);
                                    }
                                } else {
                                    i2 = i4;
                                    str3 = str6;
                                    str4 = str5;
                                    i3 = 3;
                                }
                                a.b(new Runnable() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f35456a;

                                    public final void run() {
                                        if (PatchProxy.isSupport(new Object[0], this, f35456a, false, 25990, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f35456a, false, 25990, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        if (BaseDetailFragment.this.f2811e != null && BaseDetailFragment.this.f2811e.isShowing()) {
                                            BaseDetailFragment.this.f2811e.setProgress(100);
                                        }
                                        BaseDetailFragment.this.a();
                                    }
                                });
                                if (!g.a(str)) {
                                    com.ss.android.ugc.aweme.framework.a.a.a("BaseDetailFragment,onDownloadError  musicFileName=" + str4 + " musicSource=" + i2 + "  musicEffectsUrl=" + str3 + " fileUri=" + musicModel.getPath() + " musicId=" + musicModel.getMusicId());
                                    com.bytedance.ies.dmt.ui.d.a.b(BaseDetailFragment.this.getContext(), (int) C0906R.string.bei).a();
                                    n.a("aweme_music_download_error_rate", i3, c.a().a("musicPath", str4).a("use_sdk", Integer.valueOf(AbTestManager.a().ap() ? 1 : 0)).b());
                                    return;
                                }
                                int checkAudioFile = ((IAVService) ServiceManager.get().getService(IAVService.class)).getSDKService().checkAudioFile(str4);
                                if (checkAudioFile < 0) {
                                    com.bytedance.ies.dmt.ui.d.a.b(BaseDetailFragment.this.getContext(), (int) C0906R.string.bei).a();
                                    final String str7 = str;
                                    final int i5 = i;
                                    final String str8 = str2;
                                    final int i6 = checkAudioFile;
                                    AnonymousClass2 r0 = new Callable<Void>() {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f35458a;

                                        public final /* synthetic */ Object call() throws Exception {
                                            if (PatchProxy.isSupport(new Object[0], this, f35458a, false, 25991, new Class[0], Void.class)) {
                                                return (Void) PatchProxy.accessDispatch(new Object[0], this, f35458a, false, 25991, new Class[0], Void.class);
                                            }
                                            com.ss.android.ugc.aweme.framework.a.a.a("BaseDetailFragment,checkAudioFile  musicFileName=" + str7 + "  musicSource=" + i5 + "   musicEffectsUrl=" + str8 + "  fileUri=" + musicModel.getPath() + "  code=", String.valueOf(i6) + "  musicPath=" + str7 + "  fileLength=" + String.valueOf(new File(str7).length()) + " musicId=" + musicModel.getMusicId());
                                            n.a("aweme_music_download_error_rate", 4, c.a().a("musicPath", str7).a("use_sdk", Integer.valueOf(AbTestManager.a().ap() ? 1 : 0)).a("fileLength", String.valueOf(new File(str7).length())).a("fileUri", musicModel.getPath()).a("fileMagic", ey.a(str7)).a("code", String.valueOf(i6)).b());
                                            return null;
                                        }
                                    };
                                    i.a((Callable<TResult>) r0);
                                    return;
                                }
                                long length = new File(str4).length();
                                com.ss.android.ugc.aweme.framework.a.a.a("BaseDetailFragment,checkAudioFile  musicFileName=" + str4 + "  musicSource=" + i2 + "   musicEffectsUrl=" + str3 + "  fileUri=" + musicModel.getPath() + "  code=", String.valueOf(checkAudioFile) + "  musicPath=" + str4 + "  fileLength=" + String.valueOf(length) + " musicId=" + musicModel.getMusicId());
                                if (NetworkUtils.isNetworkAvailable(k.a())) {
                                    com.ss.android.ugc.aweme.music.ui.a.a.a(str4, System.currentTimeMillis() - BaseDetailFragment.this.f2809c);
                                }
                                if (BaseDetailFragment.this instanceof MusicDetailFragment) {
                                    long currentTimeMillis = System.currentTimeMillis() - BaseDetailFragment.this.f2809c;
                                    Object[] objArr = new Object[i3];
                                    objArr[0] = str4;
                                    objArr[1] = str3;
                                    objArr[2] = new Long(currentTimeMillis);
                                    ChangeQuickRedirect changeQuickRedirect = com.ss.android.ugc.aweme.music.ui.a.a.f56655a;
                                    Class[] clsArr = new Class[i3];
                                    clsArr[0] = String.class;
                                    clsArr[1] = String.class;
                                    clsArr[2] = Long.TYPE;
                                    if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, 60558, clsArr, Void.TYPE)) {
                                        Object[] objArr2 = new Object[i3];
                                        objArr2[0] = str4;
                                        objArr2[1] = str3;
                                        objArr2[2] = new Long(currentTimeMillis);
                                        ChangeQuickRedirect changeQuickRedirect2 = com.ss.android.ugc.aweme.music.ui.a.a.f56655a;
                                        Class[] clsArr2 = new Class[i3];
                                        clsArr2[0] = String.class;
                                        clsArr2[1] = String.class;
                                        clsArr2[2] = Long.TYPE;
                                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, 60558, clsArr2, Void.TYPE);
                                    } else {
                                        long length2 = new File(str4).length();
                                        if (currentTimeMillis == 0) {
                                            d2 = 0.0d;
                                        } else {
                                            d2 = (double) (length2 / currentTimeMillis);
                                        }
                                        MonitorUtils.monitorCommonLog("aweme_music_detail_download_success_rate", c.a().a("duration", Long.valueOf(currentTimeMillis)).a("speed", Double.valueOf(d2)).a("size", Long.valueOf(length2)).a("fileName", str4).a("musicEffectsUrl", str3).b());
                                    }
                                }
                                i.a((Callable<TResult>) new a<TResult>(this, str4, musicModel), i.f1052b);
                            }
                        }
                    });
                    this.f2810d.a((com.ss.android.ugc.b.a.a) tVar);
                    this.f2810d.a((com.ss.android.ugc.a.b.d) new com.ss.android.ugc.a.b.d() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f35471a;

                        public final void onCancel() {
                        }

                        public final void onDownloadPause() {
                        }

                        public final void onDownloadProgress(int i, long j, long j2) {
                        }

                        public final void onDownloadSuccess(String str) {
                        }

                        public final void onError(com.ss.android.ugc.a.c cVar) {
                        }

                        public final void onDownloadStart(int i) {
                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f35471a, false, 25994, new Class[]{Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f35471a, false, 25994, new Class[]{Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            BaseDetailFragment.this.a(musicModel);
                        }
                    });
                    if (com.ss.android.g.a.c()) {
                        this.f2810d.f77129a = AbTestManager.a().ap();
                    }
                }
                if (PatchProxy.isSupport(new Object[]{musicModel}, this, f2807a, false, 25980, new Class[]{MusicModel.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{musicModel}, this, f2807a, false, 25980, new Class[]{MusicModel.class}, Void.TYPE);
                } else if (!NetworkUtils.isNetworkAvailable(getActivity())) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
                } else {
                    this.f2811e = d.b(getActivity(), getString(C0906R.string.beh));
                    this.f2811e.setIndeterminate(false);
                    com.ss.android.ugc.b.b.a aVar = new com.ss.android.ugc.b.b.a();
                    aVar.a(com.ss.android.ugc.aweme.music.util.d.a(false));
                    if (musicModel.getMusicType().equals(MusicModel.MusicType.ONLINE)) {
                        aVar.f77131a = musicModel.getPath();
                        aVar.f77132b = 4;
                    } else {
                        aVar.f77132b = 3;
                        aVar.f77131a = musicModel.getPath();
                    }
                    this.f2809c = System.currentTimeMillis();
                    this.f2810d.b(aVar);
                }
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f2807a, false, 25977, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f2807a, false, 25977, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f2810d = new b();
    }

    public final void a(@NonNull String str, @NonNull MusicModel musicModel) {
        boolean z;
        String str2 = str;
        MusicModel musicModel2 = musicModel;
        if (PatchProxy.isSupport(new Object[]{str2, musicModel2}, this, f2807a, false, 25984, new Class[]{String.class, MusicModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, musicModel2}, this, f2807a, false, 25984, new Class[]{String.class, MusicModel.class}, Void.TYPE);
            return;
        }
        if (musicModel.getMusic().getChallenge() != null) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().addChallenge(com.ss.android.ugc.aweme.shortvideo.o.a.b(musicModel.getMusic().getChallenge()));
        } else {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().removeChallenges();
        }
        Intent intent = new Intent();
        intent.putExtra("path", str);
        intent.putExtra("music_origin", "single_song");
        if (!(musicModel2 == null || musicModel.getMusicWaveBean() == null)) {
            intent.putExtra("music_wave_data", musicModel.getMusicWaveBean());
        }
        if ("direct_shoot".equals(((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getShootWay()) && 2 == ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getMusicChooseType()) {
            if (((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getCurMusic() != null) {
                z = true;
            } else {
                z = false;
            }
            intent.putExtra("extra_clear_dialog_show_needed", z);
        }
        intent.putExtra("reverse_video_record_show_planD", true);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(new com.ss.android.ugc.aweme.shortvideo.o.c().apply(musicModel2));
        intent.putExtra("shoot_way", p());
        a(intent);
        if (!TextUtils.isEmpty(this.G)) {
            intent.putStringArrayListExtra("reuse_sticker_ids", bv.a(this.G));
            if (PatchProxy.isSupport(new Object[]{intent}, this, f2807a, false, 25985, new Class[]{Intent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{intent}, this, f2807a, false, 25985, new Class[]{Intent.class}, Void.TYPE);
            } else if (((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().isOpenMusicRecordWithSticker()) {
                ArrayList a2 = bv.a(this.G);
                if (!a2.isEmpty()) {
                    intent.putExtra("music_reuse_sticker_id", (String) a2.get(0));
                }
            }
        }
        aj.a(i());
        intent.putExtra("translation_type", 3);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity(getActivity(), intent, true, true, ((IAVService) ServiceManager.get().getService(IAVService.class)).isRecording());
    }
}
