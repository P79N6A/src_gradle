package com.ss.android.ugc.aweme.tools.music;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.ao.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.port.in.z;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.aichoosemusic.AIChooseMusicManager;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.music.collect.a;
import com.ss.android.ugc.aweme.tools.music.avoidonresult.a;
import com.ss.android.ugc.aweme.tools.music.b.c;
import com.ss.android.vesdk.p;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016JU\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182#\u0010\u0019\u001a\u001f\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010 H\u0016JU\u0010\u0011\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182#\u0010#\u001a\u001f\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010 H\u0016J\u001e\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\f\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0018\u0010-\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\r2\u0006\u0010.\u001a\u00020/H\u0016J0\u00100\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u00020(2\u0006\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u0002052\u0006\u0010#\u001a\u000206H\u0016J\"\u00107\u001a\u0002082\u0006\u0010\u0013\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;2\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020?H\u0016J\u0014\u0010@\u001a\u0004\u0018\u00010\t2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J=\u0010C\u001a\u00020D2#\u0010\u0019\u001a\u001f\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010 H\u0002J\b\u0010E\u001a\u00020\rH\u0016J\b\u0010F\u001a\u00020(H\u0016J\n\u0010G\u001a\u0004\u0018\u00010HH\u0016J\u0012\u0010I\u001a\u00020\u00162\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0012\u0010J\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016J\u0014\u0010K\u001a\u0004\u0018\u00010L2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\u0012\u0010Q\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010R\u001a\u00020\u000bH\u0016J\b\u0010S\u001a\u00020\u0012H\u0016J\u0012\u0010T\u001a\u00020\u00122\b\u0010U\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010V\u001a\u00020\u000b2\u0006\u0010W\u001a\u00020\u0016H\u0016J\u0018\u0010X\u001a\u00020\u00122\u0006\u00102\u001a\u00020(2\u0006\u0010.\u001a\u00020YH\u0016J\u0010\u0010Z\u001a\u00020\u00122\u0006\u0010[\u001a\u00020\u000bH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\\"}, d2 = {"Lcom/ss/android/ugc/aweme/tools/music/MusicServiceImpl;", "Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService;", "()V", "proxy", "Lcom/ss/android/ugc/aweme/port/in/IMusicService;", "kotlin.jvm.PlatformType", "avMusicWaveToMusicWave", "", "input", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusicWaveBean;", "checkValidMusic", "", "musicModel", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;", "ameActivity", "Landroid/content/Context;", "showToast", "chooseMusic", "", "activity", "Landroid/app/Activity;", "requestCode", "", "requestBean", "Lcom/ss/android/ugc/aweme/toolsport/model/ChooseMusicRequestBean;", "successCallback", "Lkotlin/Function1;", "Lcom/ss/android/ugc/aweme/toolsport/model/ChooseMusicResultBean;", "Lkotlin/ParameterName;", "name", "result", "failCallback", "Lkotlin/Function0;", "fragment", "Landroid/support/v4/app/Fragment;", "callback", "createLocalMusic", "Lcom/ss/android/ugc/aweme/music/model/Music;", "Lcom/ss/android/ugc/aweme/shortvideo/model/MusicModel;", "musicPath", "", "createMusicChoicesPresenter", "Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$IMusicChoicesPresenter;", "view", "Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$IMusicChoicesView;", "downloadMusic", "listener", "Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$OnBundleDownloadListener;", "fetchMusicDetail", "context", "musicId", "clickReason", "progressDialog", "Landroid/app/ProgressDialog;", "Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$IFetchMusicDetailCallback;", "getAIMusicView", "Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$IAIMusicView;", "Landroid/support/v7/app/AppCompatActivity;", "veEditor", "Lcom/ss/android/vesdk/VEEditor;", "AIMusicConfig", "Lcom/ss/android/ugc/aweme/toolsport/model/AIMusicConfig;", "getAiChooseMusicMananger", "Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$IAIChooseMusicManager;", "getAvMusicWaveBean", "musicWWaveBean", "Ljava/io/Serializable;", "getChooseMusicOnResultCallback", "Lcom/ss/android/ugc/aweme/tools/music/avoidonresult/AvoidOnResult$Callback;", "getDefaultAVMusic", "getDefaultPhotoMovieMusicPath", "getLrcExternalCacheDir", "Ljava/io/File;", "getMusicDuration", "getMusicModelAVMusic", "getMusicModelAudioTrack", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getMvMusicManager", "Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$IMvMusicManager;", "data", "Lcom/ss/android/ugc/aweme/toolsport/model/IPublishMusic;", "getRhythmMusicFilePath", "hasShowAIMusicGuide", "initAIMusicCollect", "initAIMusicSettings", "setting", "isMusicTypeLocal", "musicType", "requestMusic", "Lcom/ss/android/ugc/aweme/port/in/IMusicListener;", "saveShowAIMusicGuide", "hasShow", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements com.ss.android.ugc.aweme.ao.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74777a;

    /* renamed from: b  reason: collision with root package name */
    public final aa f74778b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/support/v4/app/Fragment;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.tools.music.a$a  reason: collision with other inner class name */
    static final class C0771a extends Lambda implements Function1<Fragment, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.ao.a.d $requestBean;
        final /* synthetic */ int $requestCode;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0771a(a aVar, int i, com.ss.android.ugc.aweme.ao.a.d dVar) {
            super(1);
            this.this$0 = aVar;
            this.$requestCode = i;
            this.$requestBean = dVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Fragment) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Fragment fragment) {
            Fragment fragment2 = fragment;
            if (PatchProxy.isSupport(new Object[]{fragment2}, this, changeQuickRedirect, false, 87117, new Class[]{Fragment.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fragment2}, this, changeQuickRedirect, false, 87117, new Class[]{Fragment.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fragment2, AdvanceSetting.NETWORK_TYPE);
            this.this$0.f74778b.a(fragment, this.$requestCode, this.$requestBean.f33625b, this.$requestBean.f33626c, null, this.$requestBean.f33627d, this.$requestBean.f33628e, this.$requestBean.f33629f, this.$requestBean.g);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/support/v4/app/Fragment;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<Fragment, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.ao.a.d $requestBean;
        final /* synthetic */ int $requestCode;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, int i, com.ss.android.ugc.aweme.ao.a.d dVar) {
            super(1);
            this.this$0 = aVar;
            this.$requestCode = i;
            this.$requestBean = dVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Fragment) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Fragment fragment) {
            Fragment fragment2 = fragment;
            if (PatchProxy.isSupport(new Object[]{fragment2}, this, changeQuickRedirect, false, 87118, new Class[]{Fragment.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fragment2}, this, changeQuickRedirect, false, 87118, new Class[]{Fragment.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fragment2, AdvanceSetting.NETWORK_TYPE);
            this.this$0.f74778b.a(fragment, this.$requestCode, this.$requestBean.f33625b, this.$requestBean.f33626c, null, this.$requestBean.f33627d, this.$requestBean.f33628e, this.$requestBean.f33629f, this.$requestBean.g);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH\u0016J!\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0016¢\u0006\u0002\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"com/ss/android/ugc/aweme/tools/music/MusicServiceImpl$createMusicChoicesPresenter$1", "Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$IMusicChoicesPresenter;", "iMusicChoicesPresenter", "Lcom/ss/android/ugc/aweme/port/in/IMusicService$IMusicChoicesPresenter;", "getIMusicChoicesPresenter", "()Lcom/ss/android/ugc/aweme/port/in/IMusicService$IMusicChoicesPresenter;", "setIMusicChoicesPresenter", "(Lcom/ss/android/ugc/aweme/port/in/IMusicService$IMusicChoicesPresenter;)V", "onDestroy", "", "sendRequest", "", "params", "", "", "([Ljava/lang/Object;)Z", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements a.e {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74781a;
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public aa.b f74782b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f74783c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a.f f74784d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/ugc/aweme/tools/music/MusicServiceImpl$createMusicChoicesPresenter$1$iMusicChoicesPresenter$1", "Lcom/ss/android/ugc/aweme/port/in/IMusicService$IMusicChoicesView;", "onGetMusicFailed", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "failMsg", "", "onGetMusicSuccess", "musicList", "", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;", "filePath", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.tools.music.a$c$a  reason: collision with other inner class name */
        public static final class C0772a implements aa.c {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74785a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f74786b;

            C0772a(c cVar) {
                this.f74786b = cVar;
            }

            public final void a(@NotNull Exception exc, @NotNull String str) {
                Exception exc2 = exc;
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{exc2, str2}, this, f74785a, false, 87123, new Class[]{Exception.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{exc2, str2}, this, f74785a, false, 87123, new Class[]{Exception.class, String.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(exc2, "e");
                Intrinsics.checkParameterIsNotNull(str2, "failMsg");
                this.f74786b.f74784d.a(exc2, str2);
            }

            public final void a(@NotNull List<com.ss.android.ugc.aweme.shortvideo.e> list, @NotNull String str) {
                List<com.ss.android.ugc.aweme.shortvideo.e> list2 = list;
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{list2, str2}, this, f74785a, false, 87122, new Class[]{List.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{list2, str2}, this, f74785a, false, 87122, new Class[]{List.class, String.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(list2, "musicList");
                Intrinsics.checkParameterIsNotNull(str2, "filePath");
                this.f74786b.f74784d.a(list2, str2);
            }
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f74781a, false, 87121, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f74781a, false, 87121, new Class[0], Void.TYPE);
                return;
            }
            this.f74782b.a();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(@org.jetbrains.annotations.NotNull java.lang.Object... r18) {
            /*
                r17 = this;
                r0 = r18
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r4 = f74781a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
                r7[r9] = r3
                java.lang.Class r8 = java.lang.Boolean.TYPE
                r5 = 0
                r6 = 87120(0x15450, float:1.22081E-40)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x003d
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r12 = f74781a
                r13 = 0
                r14 = 87120(0x15450, float:1.22081E-40)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
                r15[r9] = r0
                java.lang.Class r16 = java.lang.Boolean.TYPE
                r11 = r17
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
            L_0x003d:
                java.lang.String r1 = "params"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
                r1 = r17
                com.ss.android.ugc.aweme.port.in.aa$b r2 = r1.f74782b
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r9)
                boolean r0 = r2.a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.music.a.c.a(java.lang.Object[]):boolean");
        }

        c(a aVar, a.f fVar) {
            this.f74783c = aVar;
            this.f74784d = fVar;
            aa.b a2 = aVar.f74778b.a((aa.c) new C0772a(this));
            Intrinsics.checkExpressionValueIsNotNull(a2, "proxy.createMusicChoices…         }\n            })");
            this.f74782b = a2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u000e\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH\u0016J*\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0016J,\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016¨\u0006\u0012"}, d2 = {"com/ss/android/ugc/aweme/tools/music/MusicServiceImpl$downloadMusic$1", "Lcom/ss/android/ugc/aweme/port/in/IMusicService$OnBundleDownloadListener;", "onDownloadFailed", "", "musicUrl", "", "musicSource", "", "musicEffectsUrl", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onDownloadProgress", "percent", "onDownloadSuccess", "musicFile", "musicEffectsParams", "", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d implements aa.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74787a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.h f74788b;

        d(a.h hVar) {
            this.f74788b = hVar;
        }

        public final void a(@NotNull String str, int i, @Nullable String str2, @Nullable Exception exc) {
            String str3 = str;
            String str4 = str2;
            Exception exc2 = exc;
            if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), str4, exc2}, this, f74787a, false, 87126, new Class[]{String.class, Integer.TYPE, String.class, Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i), str4, exc2}, this, f74787a, false, 87126, new Class[]{String.class, Integer.TYPE, String.class, Exception.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str3, "musicUrl");
            this.f74788b.a(str3, i, str4, exc2);
        }

        public final void a(@NotNull String str, int i, @Nullable String str2, int i2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), str4, Integer.valueOf(i2)}, this, f74787a, false, 87125, new Class[]{String.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i), str4, Integer.valueOf(i2)}, this, f74787a, false, 87125, new Class[]{String.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str3, "musicUrl");
            this.f74788b.a(str3, i, str4, i2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(@org.jetbrains.annotations.NotNull java.lang.String r23, int r24, @org.jetbrains.annotations.Nullable java.lang.String r25, @org.jetbrains.annotations.Nullable float[] r26) {
            /*
                r22 = this;
                r0 = r23
                r1 = r25
                r2 = r26
                r3 = 4
                java.lang.Object[] r4 = new java.lang.Object[r3]
                r11 = 0
                r4[r11] = r0
                java.lang.Integer r5 = java.lang.Integer.valueOf(r24)
                r12 = 1
                r4[r12] = r5
                r13 = 2
                r4[r13] = r1
                r14 = 3
                r4[r14] = r2
                com.meituan.robust.ChangeQuickRedirect r6 = f74787a
                java.lang.Class[] r9 = new java.lang.Class[r3]
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r9[r11] = r5
                java.lang.Class r5 = java.lang.Integer.TYPE
                r9[r12] = r5
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r9[r13] = r5
                java.lang.Class<float[]> r5 = float[].class
                r9[r14] = r5
                java.lang.Class r10 = java.lang.Void.TYPE
                r7 = 0
                r8 = 87124(0x15454, float:1.22087E-40)
                r5 = r22
                boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
                if (r4 == 0) goto L_0x006c
                java.lang.Object[] r15 = new java.lang.Object[r3]
                r15[r11] = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
                r15[r12] = r0
                r15[r13] = r1
                r15[r14] = r2
                com.meituan.robust.ChangeQuickRedirect r17 = f74787a
                r18 = 0
                r19 = 87124(0x15454, float:1.22087E-40)
                java.lang.Class[] r0 = new java.lang.Class[r3]
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r11] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r0[r12] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r13] = r1
                java.lang.Class<float[]> r1 = float[].class
                r0[r14] = r1
                java.lang.Class r21 = java.lang.Void.TYPE
                r16 = r22
                r20 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
                return
            L_0x006c:
                java.lang.String r3 = "musicFile"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r3)
                r3 = r22
                com.ss.android.ugc.aweme.ao.a$h r4 = r3.f74788b
                r5 = r24
                r4.a((java.lang.String) r0, (int) r5, (java.lang.String) r1, (float[]) r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.music.a.d.a(java.lang.String, int, java.lang.String, float[]):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/ugc/aweme/tools/music/MusicServiceImpl$fetchMusicDetail$1", "Lcom/ss/android/ugc/aweme/port/in/IMusicService$IFetchMusicDetailCallback;", "onFailed", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "path", "", "music", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e implements aa.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74789a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.d f74790b;

        e(a.d dVar) {
            this.f74790b = dVar;
        }

        public final void a(@NotNull Exception exc) {
            Exception exc2 = exc;
            if (PatchProxy.isSupport(new Object[]{exc2}, this, f74789a, false, 87128, new Class[]{Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{exc2}, this, f74789a, false, 87128, new Class[]{Exception.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(exc2, "e");
            this.f74790b.a(exc2);
        }

        public final void a(@NotNull String str, @NotNull com.ss.android.ugc.aweme.shortvideo.e eVar) {
            String str2 = str;
            com.ss.android.ugc.aweme.shortvideo.e eVar2 = eVar;
            if (PatchProxy.isSupport(new Object[]{str2, eVar2}, this, f74789a, false, 87127, new Class[]{String.class, com.ss.android.ugc.aweme.shortvideo.e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, eVar2}, this, f74789a, false, 87127, new Class[]{String.class, com.ss.android.ugc.aweme.shortvideo.e.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str2, "path");
            Intrinsics.checkParameterIsNotNull(eVar2, "music");
            this.f74790b.a(str2, eVar2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/tools/music/MusicServiceImpl$getChooseMusicOnResultCallback$1", "Lcom/ss/android/ugc/aweme/tools/music/avoidonresult/AvoidOnResult$Callback;", "onActivityResult", "", "resultCode", "", "data", "Landroid/content/Intent;", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class f implements a.C0774a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74791a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f74792b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function1 f74793c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Function0 f74794d;

        public final void a(int i, @Nullable Intent intent) {
            Boolean bool;
            String str;
            Serializable serializable;
            String str2;
            com.ss.android.ugc.aweme.shortvideo.e eVar;
            Music music;
            Intent intent2 = intent;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), intent2}, this, f74791a, false, 87129, new Class[]{Integer.TYPE, Intent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), intent2}, this, f74791a, false, 87129, new Class[]{Integer.TYPE, Intent.class}, Void.TYPE);
                return;
            }
            if (i == -1) {
                MusicModel musicModel = null;
                if (intent2 != null) {
                    bool = Boolean.valueOf(intent2.getBooleanExtra("is_cancel_current_choose_music", false));
                } else {
                    bool = null;
                }
                if (intent2 != null) {
                    str = intent2.getStringExtra("path");
                } else {
                    str = null;
                }
                if (intent2 != null) {
                    serializable = intent2.getSerializableExtra("music_model");
                } else {
                    serializable = null;
                }
                MusicModel musicModel2 = (MusicModel) serializable;
                if (intent2 != null) {
                    str2 = intent2.getStringExtra("music_origin");
                } else {
                    str2 = null;
                }
                int b2 = this.f74792b.b(str);
                if (musicModel2 != null) {
                    if (musicModel2.getMusicType() == MusicModel.MusicType.LOCAL) {
                        a aVar = this.f74792b;
                        if (PatchProxy.isSupport(new Object[]{musicModel2, str}, aVar, a.f74777a, false, 87091, new Class[]{MusicModel.class, String.class}, Music.class)) {
                            music = (Music) PatchProxy.accessDispatch(new Object[]{musicModel2, str}, aVar, a.f74777a, false, 87091, new Class[]{MusicModel.class, String.class}, Music.class);
                        } else {
                            if (musicModel2 != null) {
                                musicModel2.setPath(str);
                            }
                            if (musicModel2 != null) {
                                music = musicModel2.convertToMusic();
                            } else {
                                music = null;
                            }
                            UrlModel urlModel = new UrlModel();
                            urlModel.setUri(str);
                            ArrayList arrayList = new ArrayList();
                            if (str != null) {
                                arrayList.add(str);
                            }
                            urlModel.setUrlList(arrayList);
                            if (music != null) {
                                music.setPlayUrl(urlModel);
                            }
                        }
                        com.ss.android.ugc.aweme.tools.music.f.b bVar = new com.ss.android.ugc.aweme.tools.music.f.b();
                        if (music != null) {
                            musicModel = music.convertToMusicModel();
                        }
                        eVar = bVar.apply(musicModel);
                    } else {
                        eVar = new com.ss.android.ugc.aweme.tools.music.f.b().apply(musicModel2);
                    }
                    if (eVar != null) {
                        eVar.duration = b2;
                    }
                    Function1 function1 = this.f74793c;
                    if (function1 != null) {
                        function1.invoke(com.ss.android.ugc.aweme.ao.a.e.f33632f.a(bool, str2, eVar, str));
                    }
                } else {
                    Function1 function12 = this.f74793c;
                    if (function12 != null) {
                        function12.invoke(com.ss.android.ugc.aweme.ao.a.e.f33632f.a(bool, str2, null, str));
                    }
                }
            } else {
                Function0 function0 = this.f74794d;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }

        f(a aVar, Function1 function1, Function0 function0) {
            this.f74792b = aVar;
            this.f74793c = function1;
            this.f74794d = function0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/tools/music/MusicServiceImpl$getMvMusicManager$1", "Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$IMvMusicManager;", "getMusicDetail", "musicIds", "", "", "setMusicResponseListener", "listener", "Lcom/ss/android/ugc/aweme/toolsport/model/AVMvMusicResponseListener;", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class g implements a.g {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74795a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ao.a.g f74796b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "model", "Lcom/ss/android/ugc/aweme/shortvideo/model/MusicModel;", "kotlin.jvm.PlatformType", "shouldSetToMvMusic", "", "onFinish"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.tools.music.a$g$a  reason: collision with other inner class name */
        static final class C0773a implements com.ss.android.ugc.aweme.tools.music.d.a {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74797a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.ao.a.c f74798b;

            C0773a(com.ss.android.ugc.aweme.ao.a.c cVar) {
                this.f74798b = cVar;
            }

            public final void a(MusicModel musicModel, boolean z) {
                MusicModel musicModel2 = musicModel;
                if (PatchProxy.isSupport(new Object[]{musicModel2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f74797a, false, 87132, new Class[]{MusicModel.class, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{musicModel2, Byte.valueOf(z)}, this, f74797a, false, 87132, new Class[]{MusicModel.class, Boolean.TYPE}, Void.TYPE);
                    return;
                }
                this.f74798b.a(new com.ss.android.ugc.aweme.tools.music.f.b().apply(musicModel2), z);
            }
        }

        g(com.ss.android.ugc.aweme.ao.a.g gVar) {
            this.f74796b = gVar;
        }

        @NotNull
        public final a.g a(@NotNull com.ss.android.ugc.aweme.ao.a.c cVar) {
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f74795a, false, 87130, new Class[]{com.ss.android.ugc.aweme.ao.a.c.class}, a.g.class)) {
                return (a.g) PatchProxy.accessDispatch(new Object[]{cVar}, this, f74795a, false, 87130, new Class[]{com.ss.android.ugc.aweme.ao.a.c.class}, a.g.class);
            }
            Intrinsics.checkParameterIsNotNull(cVar, "listener");
            c.a.a().a(this.f74796b);
            c.a.a().a((com.ss.android.ugc.aweme.tools.music.d.a) new C0773a(cVar));
            return this;
        }

        @NotNull
        public final a.g a(@Nullable List<String> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f74795a, false, 87131, new Class[]{List.class}, a.g.class)) {
                return (a.g) PatchProxy.accessDispatch(new Object[]{list}, this, f74795a, false, 87131, new Class[]{List.class}, a.g.class);
            }
            c.a.a().a(this.f74796b);
            c.a.a().a(list);
            return this;
        }
    }

    public final void a(@NotNull Fragment fragment, int i, @NotNull com.ss.android.ugc.aweme.ao.a.d dVar, @Nullable Function1<? super com.ss.android.ugc.aweme.ao.a.e, Unit> function1, @Nullable Function0<Unit> function0) {
        Fragment fragment2 = fragment;
        com.ss.android.ugc.aweme.ao.a.d dVar2 = dVar;
        Function1<? super com.ss.android.ugc.aweme.ao.a.e, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{fragment2, 110, dVar2, function12, null}, this, f74777a, false, 87092, new Class[]{Fragment.class, Integer.TYPE, com.ss.android.ugc.aweme.ao.a.d.class, Function1.class, Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2, 110, dVar2, function12, null}, this, f74777a, false, 87092, new Class[]{Fragment.class, Integer.TYPE, com.ss.android.ugc.aweme.ao.a.d.class, Function1.class, Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fragment2, "fragment");
        Intrinsics.checkParameterIsNotNull(dVar2, "requestBean");
        new com.ss.android.ugc.aweme.tools.music.avoidonresult.a(fragment2).a(110, new C0771a(this, 110, dVar2), a(function12, (Function0<Unit>) null));
    }

    public final void a(@NotNull Activity activity, int i, @NotNull com.ss.android.ugc.aweme.ao.a.d dVar, @Nullable Function1<? super com.ss.android.ugc.aweme.ao.a.e, Unit> function1, @Nullable Function0<Unit> function0) {
        Activity activity2 = activity;
        int i2 = i;
        com.ss.android.ugc.aweme.ao.a.d dVar2 = dVar;
        Function1<? super com.ss.android.ugc.aweme.ao.a.e, Unit> function12 = function1;
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(i), dVar2, function12, function02}, this, f74777a, false, 87093, new Class[]{Activity.class, Integer.TYPE, com.ss.android.ugc.aweme.ao.a.d.class, Function1.class, Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, Integer.valueOf(i), dVar2, function12, function02}, this, f74777a, false, 87093, new Class[]{Activity.class, Integer.TYPE, com.ss.android.ugc.aweme.ao.a.d.class, Function1.class, Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(dVar2, "requestBean");
        new com.ss.android.ugc.aweme.tools.music.avoidonresult.a((FragmentActivity) activity2).a(i2, new b(this, i2, dVar2), a(function12, function02));
    }

    public final void a(@NotNull String str, @NotNull z zVar) {
        String str2 = str;
        z zVar2 = zVar;
        if (PatchProxy.isSupport(new Object[]{str2, zVar2}, this, f74777a, false, 87095, new Class[]{String.class, z.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, zVar2}, this, f74777a, false, 87095, new Class[]{String.class, z.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "musicId");
        Intrinsics.checkParameterIsNotNull(zVar2, "listener");
        this.f74778b.a(str2, zVar2);
    }

    public final void a(@NotNull com.ss.android.ugc.aweme.shortvideo.e eVar, @NotNull a.h hVar) {
        com.ss.android.ugc.aweme.shortvideo.e eVar2 = eVar;
        a.h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{eVar2, hVar2}, this, f74777a, false, 87096, new Class[]{com.ss.android.ugc.aweme.shortvideo.e.class, a.h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2, hVar2}, this, f74777a, false, 87096, new Class[]{com.ss.android.ugc.aweme.shortvideo.e.class, a.h.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(eVar2, "musicModel");
        Intrinsics.checkParameterIsNotNull(hVar2, "listener");
        this.f74778b.a(eVar2, (aa.d) new d(hVar2));
    }

    public final boolean a(@NotNull com.ss.android.ugc.aweme.shortvideo.e eVar, @NotNull Context context, boolean z) {
        com.ss.android.ugc.aweme.shortvideo.e eVar2 = eVar;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{eVar2, context2, (byte) 1}, this, f74777a, false, 87097, new Class[]{com.ss.android.ugc.aweme.shortvideo.e.class, Context.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{eVar2, context2, (byte) 1}, this, f74777a, false, 87097, new Class[]{com.ss.android.ugc.aweme.shortvideo.e.class, Context.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(eVar2, "musicModel");
        Intrinsics.checkParameterIsNotNull(context2, "ameActivity");
        return this.f74778b.a(eVar2, context2, true);
    }

    @NotNull
    public final String a(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f74777a, false, 87098, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f74777a, false, 87098, new Class[]{String.class}, String.class);
        }
        String a2 = this.f74778b.a(str2);
        Intrinsics.checkExpressionValueIsNotNull(a2, "proxy.getRhythmMusicFilePath(musicPath)");
        return a2;
    }

    public final boolean a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f74777a, false, 87105, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return this.f74778b.a(i);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f74777a, false, 87105, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void a(@NotNull Context context, @NotNull String str, int i, @NotNull ProgressDialog progressDialog, @NotNull a.d dVar) {
        Context context2 = context;
        String str2 = str;
        ProgressDialog progressDialog2 = progressDialog;
        a.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{context2, str2, 0, progressDialog2, dVar2}, this, f74777a, false, 87106, new Class[]{Context.class, String.class, Integer.TYPE, ProgressDialog.class, a.d.class}, Void.TYPE)) {
            Object[] objArr = {context2, str2, 0, progressDialog2, dVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f74777a, false, 87106, new Class[]{Context.class, String.class, Integer.TYPE, ProgressDialog.class, a.d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(str2, "musicId");
        Intrinsics.checkParameterIsNotNull(progressDialog2, "progressDialog");
        Intrinsics.checkParameterIsNotNull(dVar2, "callback");
        this.f74778b.a(context, str, 0, progressDialog, new e(dVar2));
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f74777a, false, 87113, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f74777a, false, 87113, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.tools.music.a.a.a(true);
    }

    @Nullable
    public final Object a(@Nullable com.ss.android.ugc.aweme.shortvideo.f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f74777a, false, 87115, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{fVar}, this, f74777a, false, 87115, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.class}, Object.class);
        } else if (fVar == null) {
            return null;
        } else {
            MusicWaveBean musicWaveBean = new MusicWaveBean();
            musicWaveBean.setMusicWavePointArray(fVar.getMusicWavePointArray());
            return musicWaveBean;
        }
    }

    @Nullable
    public final com.ss.android.ugc.aweme.shortvideo.f a(@Nullable Serializable serializable) {
        Serializable serializable2 = serializable;
        if (PatchProxy.isSupport(new Object[]{serializable2}, this, f74777a, false, 87116, new Class[]{Serializable.class}, com.ss.android.ugc.aweme.shortvideo.f.class)) {
            return (com.ss.android.ugc.aweme.shortvideo.f) PatchProxy.accessDispatch(new Object[]{serializable2}, this, f74777a, false, 87116, new Class[]{Serializable.class}, com.ss.android.ugc.aweme.shortvideo.f.class);
        } else if (serializable2 == null) {
            return null;
        } else {
            if (serializable2 instanceof MusicWaveBean) {
                com.ss.android.ugc.aweme.shortvideo.f fVar = new com.ss.android.ugc.aweme.shortvideo.f();
                fVar.setMusicWavePointArray(((MusicWaveBean) serializable2).getMusicWavePointArray());
                return fVar;
            } else if (serializable2 instanceof com.ss.android.ugc.aweme.shortvideo.f) {
                return (com.ss.android.ugc.aweme.shortvideo.f) serializable2;
            } else {
                return null;
            }
        }
    }

    public a() {
        Object service = ServiceManager.get().getService(IAVServiceProxy.class);
        Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…ServiceProxy::class.java)");
        this.f74778b = ((IAVServiceProxy) service).getMusicService();
    }

    @NotNull
    public final com.ss.android.ugc.aweme.shortvideo.e a() {
        if (PatchProxy.isSupport(new Object[0], this, f74777a, false, 87103, new Class[0], com.ss.android.ugc.aweme.shortvideo.e.class)) {
            return (com.ss.android.ugc.aweme.shortvideo.e) PatchProxy.accessDispatch(new Object[0], this, f74777a, false, 87103, new Class[0], com.ss.android.ugc.aweme.shortvideo.e.class);
        }
        aa aaVar = this.f74778b;
        Intrinsics.checkExpressionValueIsNotNull(aaVar, "proxy");
        com.ss.android.ugc.aweme.shortvideo.e a2 = aaVar.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "proxy.defaultAVMusic");
        return a2;
    }

    @NotNull
    public final String b() {
        if (PatchProxy.isSupport(new Object[0], this, f74777a, false, 87104, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74777a, false, 87104, new Class[0], String.class);
        }
        aa aaVar = this.f74778b;
        Intrinsics.checkExpressionValueIsNotNull(aaVar, "proxy");
        String b2 = aaVar.b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "proxy.defaultPhotoMovieMusicPath");
        return b2;
    }

    @Nullable
    public final File c() {
        if (!PatchProxy.isSupport(new Object[0], this, f74777a, false, 87108, new Class[0], File.class)) {
            return com.ss.android.ugc.aweme.tools.music.c.a.b();
        }
        return (File) PatchProxy.accessDispatch(new Object[0], this, f74777a, false, 87108, new Class[0], File.class);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f74777a, false, 87111, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74777a, false, 87111, new Class[0], Void.TYPE);
            return;
        }
        a.C0721a.a().a();
    }

    public final boolean e() {
        if (!PatchProxy.isSupport(new Object[0], this, f74777a, false, 87112, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.tools.music.a.a.a();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f74777a, false, 87112, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @NotNull
    public final a.b f() {
        if (!PatchProxy.isSupport(new Object[0], this, f74777a, false, 87114, new Class[0], a.b.class)) {
            return AIChooseMusicManager.b.a();
        }
        return (a.b) PatchProxy.accessDispatch(new Object[0], this, f74777a, false, 87114, new Class[0], a.b.class);
    }

    public final int b(@Nullable String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f74777a, false, 87099, new Class[]{String.class}, Integer.TYPE)) {
            return this.f74778b.b(str2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, f74777a, false, 87099, new Class[]{String.class}, Integer.TYPE)).intValue();
    }

    public final void c(@Nullable String str) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str}, this, f74777a, false, 87107, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f74777a, false, 87107, new Class[]{String.class}, Void.TYPE);
            return;
        }
        CharSequence charSequence = str;
        if (!(charSequence == null || charSequence.length() == 0)) {
            z = false;
        }
        if (z) {
            com.ss.android.ugc.aweme.tools.music.e.a.b();
        } else {
            com.ss.android.ugc.aweme.tools.music.e.a.a(str);
        }
    }

    @NotNull
    public final a.e a(@NotNull a.f fVar) {
        a.f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f74777a, false, 87102, new Class[]{a.f.class}, a.e.class)) {
            return (a.e) PatchProxy.accessDispatch(new Object[]{fVar2}, this, f74777a, false, 87102, new Class[]{a.f.class}, a.e.class);
        }
        Intrinsics.checkParameterIsNotNull(fVar2, "view");
        return new c(this, fVar2);
    }

    @NotNull
    public final a.g a(@Nullable com.ss.android.ugc.aweme.ao.a.g gVar) {
        com.ss.android.ugc.aweme.ao.a.g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, f74777a, false, 87109, new Class[]{com.ss.android.ugc.aweme.ao.a.g.class}, a.g.class)) {
            return (a.g) PatchProxy.accessDispatch(new Object[]{gVar2}, this, f74777a, false, 87109, new Class[]{com.ss.android.ugc.aweme.ao.a.g.class}, a.g.class);
        }
        c.a.a().a(gVar2);
        return new g(gVar2);
    }

    @Nullable
    public final UrlModel a(@Nullable Object obj) {
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{obj2}, this, f74777a, false, 87100, new Class[]{Object.class}, UrlModel.class)) {
            return this.f74778b.a(obj2);
        }
        return (UrlModel) PatchProxy.accessDispatch(new Object[]{obj2}, this, f74777a, false, 87100, new Class[]{Object.class}, UrlModel.class);
    }

    private final a.C0774a a(Function1<? super com.ss.android.ugc.aweme.ao.a.e, Unit> function1, Function0<Unit> function0) {
        Function1<? super com.ss.android.ugc.aweme.ao.a.e, Unit> function12 = function1;
        Function0<Unit> function02 = function0;
        if (!PatchProxy.isSupport(new Object[]{function12, function02}, this, f74777a, false, 87094, new Class[]{Function1.class, Function0.class}, a.C0774a.class)) {
            return new f(this, function12, function02);
        }
        return (a.C0774a) PatchProxy.accessDispatch(new Object[]{function12, function02}, this, f74777a, false, 87094, new Class[]{Function1.class, Function0.class}, a.C0774a.class);
    }

    @NotNull
    public final a.c a(@NotNull AppCompatActivity appCompatActivity, @Nullable p pVar, @NotNull com.ss.android.ugc.aweme.ao.a.a aVar) {
        AppCompatActivity appCompatActivity2 = appCompatActivity;
        p pVar2 = pVar;
        com.ss.android.ugc.aweme.ao.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{appCompatActivity2, pVar2, aVar2}, this, f74777a, false, 87110, new Class[]{AppCompatActivity.class, p.class, com.ss.android.ugc.aweme.ao.a.a.class}, a.c.class)) {
            return (a.c) PatchProxy.accessDispatch(new Object[]{appCompatActivity2, pVar2, aVar2}, this, f74777a, false, 87110, new Class[]{AppCompatActivity.class, p.class, com.ss.android.ugc.aweme.ao.a.a.class}, a.c.class);
        }
        Intrinsics.checkParameterIsNotNull(appCompatActivity2, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(aVar2, "AIMusicConfig");
        return new com.ss.android.ugc.aweme.tools.music.b.a(appCompatActivity2, pVar2, aVar2);
    }
}
