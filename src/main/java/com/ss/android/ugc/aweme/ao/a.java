package com.ss.android.ugc.aweme.ao;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ao.a.c;
import com.ss.android.ugc.aweme.ao.a.d;
import com.ss.android.ugc.aweme.ao.a.e;
import com.ss.android.ugc.aweme.ao.a.f;
import com.ss.android.ugc.aweme.ao.a.g;
import com.ss.android.ugc.aweme.ao.a.h;
import com.ss.android.ugc.aweme.ao.a.i;
import com.ss.android.ugc.aweme.ao.a.j;
import com.ss.android.ugc.aweme.ao.a.k;
import com.ss.android.ugc.aweme.ao.a.l;
import com.ss.android.ugc.aweme.ao.a.m;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.port.in.z;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.vesdk.p;
import java.io.File;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u0000 R2\u00020\u0001:\bRSTUVWXYJ\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H&JW\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132#\u0010\u0014\u001a\u001f\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\r\u0018\u00010\u00152\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001bH&JW\u0010\f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132#\u0010\u001e\u001a\u001f\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\r\u0018\u00010\u00152\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001bH&J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H&J\u0018\u0010#\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010$\u001a\u00020%H&J0\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020,2\u0006\u0010\u001e\u001a\u00020-H&J\"\u0010.\u001a\u00020/2\u0006\u0010\u000e\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u000204H&J\b\u00105\u001a\u000206H&J\u0014\u00107\u001a\u0004\u0018\u00010\u00042\b\u00108\u001a\u0004\u0018\u000109H&J\b\u0010:\u001a\u00020\bH&J\b\u0010;\u001a\u00020)H&J\n\u0010<\u001a\u0004\u0018\u00010=H&J\u0012\u0010>\u001a\u00020\u00112\b\u0010?\u001a\u0004\u0018\u00010)H&J\u0014\u0010@\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H&J\u0014\u0010A\u001a\u0004\u0018\u00010B2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H&J\u0012\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010FH&J\u0012\u0010G\u001a\u00020)2\b\u0010?\u001a\u0004\u0018\u00010)H&J\b\u0010H\u001a\u00020\u0006H&J\b\u0010I\u001a\u00020\rH&J\u0012\u0010J\u001a\u00020\r2\b\u0010K\u001a\u0004\u0018\u00010)H&J\u0010\u0010L\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u0011H&J\u0018\u0010N\u001a\u00020\r2\u0006\u0010(\u001a\u00020)2\u0006\u0010$\u001a\u00020OH&J\u0010\u0010P\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\u0006H&¨\u0006Z"}, d2 = {"Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService;", "", "avMusicWaveToMusicWave", "input", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusicWaveBean;", "checkValidMusic", "", "musicModel", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;", "ameActivity", "Landroid/content/Context;", "showToast", "chooseMusic", "", "activity", "Landroid/app/Activity;", "requestCode", "", "requestBean", "Lcom/ss/android/ugc/aweme/toolsport/model/ChooseMusicRequestBean;", "successCallback", "Lkotlin/Function1;", "Lcom/ss/android/ugc/aweme/toolsport/model/ChooseMusicResultBean;", "Lkotlin/ParameterName;", "name", "result", "failCallback", "Lkotlin/Function0;", "fragment", "Landroid/support/v4/app/Fragment;", "callback", "createMusicChoicesPresenter", "Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$IMusicChoicesPresenter;", "view", "Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$IMusicChoicesView;", "downloadMusic", "listener", "Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$OnBundleDownloadListener;", "fetchMusicDetail", "context", "musicId", "", "clickReason", "progressDialog", "Landroid/app/ProgressDialog;", "Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$IFetchMusicDetailCallback;", "getAIMusicView", "Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$IAIMusicView;", "Landroid/support/v7/app/AppCompatActivity;", "veEditor", "Lcom/ss/android/vesdk/VEEditor;", "AIMusicConfig", "Lcom/ss/android/ugc/aweme/toolsport/model/AIMusicConfig;", "getAiChooseMusicMananger", "Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$IAIChooseMusicManager;", "getAvMusicWaveBean", "musicWWaveBean", "Ljava/io/Serializable;", "getDefaultAVMusic", "getDefaultPhotoMovieMusicPath", "getLrcExternalCacheDir", "Ljava/io/File;", "getMusicDuration", "musicPath", "getMusicModelAVMusic", "getMusicModelAudioTrack", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getMvMusicManager", "Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$IMvMusicManager;", "data", "Lcom/ss/android/ugc/aweme/toolsport/model/IPublishMusic;", "getRhythmMusicFilePath", "hasShowAIMusicGuide", "initAIMusicCollect", "initAIMusicSettings", "setting", "isMusicTypeLocal", "musicType", "requestMusic", "Lcom/ss/android/ugc/aweme/port/in/IMusicListener;", "saveShowAIMusicGuide", "hasShow", "Companion", "IAIChooseMusicManager", "IAIMusicView", "IFetchMusicDetailCallback", "IMusicChoicesPresenter", "IMusicChoicesView", "IMvMusicManager", "OnBundleDownloadListener", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public interface a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0430a f33622c = C0430a.f33623a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$Companion;", "", "()V", "MUSIC_EXCHANGE", "", "PHOTO_MOVIE_CHANE_MUSIC", "tools.service_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.ao.a$a  reason: collision with other inner class name */
    public static final class C0430a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C0430a f33623a = new C0430a();

        private C0430a() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J$\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$IAIChooseMusicManager;", "", "bindWithLocalAfterVideoEncode", "", "videoPath", "", "creationId", "bindWithShootVideoAndStart", "extractFramesModel", "Lcom/ss/android/ugc/aweme/shortvideo/model/ExtractFramesModel;", "useAIMusic", "", "getAVAIChooseMusicResult", "Lcom/ss/android/ugc/aweme/toolsport/model/IAIMusicResult;", "reset", "setOnGetAIRecommendMusicListener", "onGetAIRecommendMusicListener", "Lcom/ss/android/ugc/aweme/toolsport/model/OnGetAIRecommendMusicListener;", "tools.service_release"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a(@Nullable j jVar);

        void a(@Nullable ExtractFramesModel extractFramesModel, boolean z, @Nullable String str);

        void a(@NotNull String str, @Nullable String str2);

        @NotNull
        f d();

        void f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\u0018\u0010\u000e\u001a\u00020\t2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H&J\b\u0010\u0012\u001a\u00020\tH&J\b\u0010\u0013\u001a\u00020\tH&J\b\u0010\u0014\u001a\u00020\tH&J\u0012\u0010\u0015\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0012\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH&J\u0012\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010 H&J\u0012\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010#H&J\u0010\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0005H&J\u0010\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020(H&J\b\u0010)\u001a\u00020\tH&J\b\u0010*\u001a\u00020\tH&¨\u0006+"}, d2 = {"Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$IAIMusicView;", "", "getCollectMusic", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;", "position", "", "getCurrentAIMusicTab", "getRecommandMusic", "initView", "", "activity", "Landroid/support/v7/app/AppCompatActivity;", "rootView", "Landroid/widget/FrameLayout;", "mvThemeMusicIds", "musicIds", "", "", "onDestory", "pausePlay", "resumePlay", "setAVOnAIMusicAnimLoadingListener", "mOnAIMusicAnimLoadingListener", "Lcom/ss/android/ugc/aweme/toolsport/model/OnAIMusicAnimLoadingListener;", "setAVOnAiMusicClickListener", "onMusicViewClickListener", "Lcom/ss/android/ugc/aweme/toolsport/model/OnAiMusicClickListener;", "setAVOnItemClickListener", "onItemClickListener", "Lcom/ss/android/ugc/aweme/toolsport/model/OnItemClickListener;", "setAVOnItemShowListener", "onItemShowListener", "Lcom/ss/android/ugc/aweme/toolsport/model/OnItemShowListener;", "setAVOnMusicTabClickListener", "onMusicTabClickListener", "Lcom/ss/android/ugc/aweme/toolsport/model/OnMusicTabClickListener;", "setLrcStartTime", "startTime", "setRvwMusicContainerEnable", "enable", "", "startItemAnim", "stopItemAnim", "tools.service_release"}, k = 1, mv = {1, 1, 15})
    public interface c {
        @Nullable
        com.ss.android.ugc.aweme.shortvideo.e a(int i);

        void a();

        void a(@NotNull AppCompatActivity appCompatActivity, @Nullable FrameLayout frameLayout);

        void a(@Nullable h hVar);

        void a(@NotNull i iVar);

        void a(@Nullable k kVar);

        void a(@Nullable l lVar);

        void a(@Nullable m mVar);

        void a(@Nullable List<String> list);

        void a(boolean z);

        @Nullable
        com.ss.android.ugc.aweme.shortvideo.e b(int i);

        void b();

        int c();

        void c(int i);

        void d();

        void e();

        void f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$IFetchMusicDetailCallback;", "", "onFailed", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "path", "", "music", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;", "tools.service_release"}, k = 1, mv = {1, 1, 15})
    public interface d {
        void a(@Nullable Exception exc);

        void a(@NotNull String str, @NotNull com.ss.android.ugc.aweme.shortvideo.e eVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J!\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$IMusicChoicesPresenter;", "", "onDestroy", "", "sendRequest", "", "params", "", "([Ljava/lang/Object;)Z", "tools.service_release"}, k = 1, mv = {1, 1, 15})
    public interface e {
        void a();

        boolean a(@NotNull Object... objArr);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\"\u0010\t\u001a\u00020\u00032\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\bH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$IMusicChoicesView;", "Lcom/ss/android/ugc/aweme/common/IBaseView;", "onGetMusicFailed", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "failMsg", "", "onGetMusicSuccess", "musicList", "", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;", "filePath", "tools.service_release"}, k = 1, mv = {1, 1, 15})
    public interface f extends o {
        void a(@Nullable Exception exc, @Nullable String str);

        void a(@Nullable List<com.ss.android.ugc.aweme.shortvideo.e> list, @Nullable String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$IMvMusicManager;", "", "getMusicDetail", "musicIds", "", "", "setMusicResponseListener", "listener", "Lcom/ss/android/ugc/aweme/toolsport/model/AVMvMusicResponseListener;", "tools.service_release"}, k = 1, mv = {1, 1, 15})
    public interface g {
        @NotNull
        g a(@NotNull c cVar);

        @NotNull
        g a(@Nullable List<String> list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0000\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u000e\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH&J*\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u0007H&J,\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$OnBundleDownloadListener;", "", "onDownloadFailed", "", "musicUrl", "", "musicSource", "", "musicEffectsUrl", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onDownloadProgress", "percent", "onDownloadSuccess", "musicFile", "musicEffectsParams", "", "tools.service_release"}, k = 1, mv = {1, 1, 15})
    public interface h {
        void a(@NotNull String str, int i, @Nullable String str2, int i2);

        void a(@NotNull String str, int i, @Nullable String str2, @Nullable Exception exc);

        void a(@NotNull String str, int i, @Nullable String str2, @Nullable float[] fArr);
    }

    @NotNull
    c a(@NotNull AppCompatActivity appCompatActivity, @Nullable p pVar, @NotNull com.ss.android.ugc.aweme.ao.a.a aVar);

    @NotNull
    e a(@NotNull f fVar);

    @NotNull
    g a(@Nullable g gVar);

    @Nullable
    UrlModel a(@Nullable Object obj);

    @NotNull
    com.ss.android.ugc.aweme.shortvideo.e a();

    @Nullable
    com.ss.android.ugc.aweme.shortvideo.f a(@Nullable Serializable serializable);

    @Nullable
    Object a(@Nullable com.ss.android.ugc.aweme.shortvideo.f fVar);

    @NotNull
    String a(@Nullable String str);

    void a(@NotNull Activity activity, int i, @NotNull d dVar, @Nullable Function1<? super e, Unit> function1, @Nullable Function0<Unit> function0);

    void a(@NotNull Context context, @NotNull String str, int i, @NotNull ProgressDialog progressDialog, @NotNull d dVar);

    void a(@NotNull Fragment fragment, int i, @NotNull d dVar, @Nullable Function1<? super e, Unit> function1, @Nullable Function0<Unit> function0);

    void a(@NotNull com.ss.android.ugc.aweme.shortvideo.e eVar, @NotNull h hVar);

    void a(@NotNull String str, @NotNull z zVar);

    void a(boolean z);

    boolean a(int i);

    boolean a(@NotNull com.ss.android.ugc.aweme.shortvideo.e eVar, @NotNull Context context, boolean z);

    int b(@Nullable String str);

    @NotNull
    String b();

    @Nullable
    File c();

    void c(@Nullable String str);

    void d();

    boolean e();

    @NotNull
    b f();
}
