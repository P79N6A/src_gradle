package com.ss.android.ugc.aweme.tools.music.b;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ao.a;
import com.ss.android.ugc.aweme.ao.a.m;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.aichoosemusic.AIChooseMusicManager;
import com.ss.android.ugc.aweme.shortvideo.aichoosemusic.c;
import com.ss.android.ugc.aweme.shortvideo.lrc.LrcView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.music.MusicItemAdapter;
import com.ss.android.ugc.aweme.shortvideo.music.MusicItemViewHolder;
import com.ss.android.ugc.aweme.shortvideo.music.collect.CollectMusicItemAdapter;
import com.ss.android.ugc.aweme.shortvideo.music.collect.a;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.ss.android.ugc.aweme.tools.music.b.c;
import com.ss.android.ugc.aweme.tools.music.c.a;
import com.ss.android.vesdk.p;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.bd;
import kotlinx.coroutines.bk;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010l\u001a\u00020mH\u0002J\b\u0010n\u001a\u00020mH\u0002J\u000e\u0010o\u001a\u00020)2\u0006\u0010p\u001a\u00020qJ\u0012\u0010r\u001a\u0004\u0018\u00010q2\u0006\u0010s\u001a\u00020 H\u0016J\b\u0010t\u001a\u00020uH\u0016J\b\u0010v\u001a\u00020 H\u0016J\b\u0010w\u001a\u0004\u0018\u00010)J\n\u0010x\u001a\u0004\u0018\u00010)H\u0016J\u000e\u0010y\u001a\b\u0012\u0002\b\u0003\u0018\u00010zH\u0016J\b\u0010{\u001a\u00020 H\u0016J\u0014\u0010|\u001a\u0004\u0018\u00010O2\b\u0010}\u001a\u0004\u0018\u00010)H\u0002J\u0012\u0010~\u001a\u0004\u0018\u00010q2\u0006\u0010s\u001a\u00020 H\u0016J\b\u0010\u001a\u00020mH\u0002J\t\u0010\u0001\u001a\u00020mH\u0002J\t\u0010\u0001\u001a\u00020mH\u0002J\u001d\u0010\u0001\u001a\u00020m2\u0007\u0010\u0001\u001a\u00020\u00052\t\u0010\u0001\u001a\u0004\u0018\u00010kH\u0016J\t\u0010\u0001\u001a\u00020mH\u0002J\t\u0010\u0001\u001a\u00020\u0014H\u0016J\u0019\u0010N\u001a\u00020m2\u000f\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020O\u0018\u00010(H\u0016J \u0010\u0001\u001a\u00020m2\b\u0010}\u001a\u0004\u0018\u00010)2\r\u0010\u0001\u001a\b0\u0001j\u0003`\u0001J'\u0010\u0001\u001a\u00020m2\t\u0010\u0001\u001a\u0004\u0018\u00010O2\b\u0010}\u001a\u0004\u0018\u00010)2\t\u0010\u0001\u001a\u0004\u0018\u00010OJ \u0010\u0001\u001a\u00020m2\b\u0010}\u001a\u0004\u0018\u00010)2\r\u0010\u0001\u001a\b0\u0001j\u0003`\u0001J'\u0010\u0001\u001a\u00020m2\t\u0010\u0001\u001a\u0004\u0018\u00010O2\b\u0010}\u001a\u0004\u0018\u00010)2\t\u0010\u0001\u001a\u0004\u0018\u00010OJ\u0014\u0010\u0001\u001a\u00020m2\t\u0010\u0001\u001a\u0004\u0018\u00010&H\u0016J\t\u0010\u0001\u001a\u00020mH\u0016J\"\u0010\u0001\u001a\u00020m2\b\u0010}\u001a\u0004\u0018\u00010)2\r\u0010\u0001\u001a\b0\u0001j\u0003`\u0001H\u0016J)\u0010\u0001\u001a\u00020m2\t\u0010\u0001\u001a\u0004\u0018\u00010O2\b\u0010}\u001a\u0004\u0018\u00010)2\t\u0010\u0001\u001a\u0004\u0018\u00010OH\u0016J\t\u0010\u0001\u001a\u00020mH\u0016J\t\u0010\u0001\u001a\u00020mH\u0002J\t\u0010\u0001\u001a\u00020mH\u0016J\u0014\u0010\u0001\u001a\u00020m2\t\u0010\u0001\u001a\u0004\u0018\u000101H\u0016J\u0012\u0010\u0001\u001a\u00020m2\u0007\u0010\u0001\u001a\u00020UH\u0016J\u0013\u0010\u0001\u001a\u00020m2\b\u0010Z\u001a\u0004\u0018\u00010[H\u0016J\u0013\u0010\u0001\u001a\u00020m2\b\u0010`\u001a\u0004\u0018\u00010aH\u0016J\u0014\u0010\u0001\u001a\u00020m2\t\u0010 \u0001\u001a\u0004\u0018\u000107H\u0016J\u0012\u0010¡\u0001\u001a\u00020m2\u0007\u0010¢\u0001\u001a\u00020 H\u0016J\u0012\u0010£\u0001\u001a\u00020m2\u0007\u0010¤\u0001\u001a\u00020\u0014H\u0016J\t\u0010¥\u0001\u001a\u00020mH\u0002J\u0012\u0010¦\u0001\u001a\u00020m2\u0007\u0010§\u0001\u001a\u00020\u0014H\u0002J\u0010\u0010¨\u0001\u001a\u00020m2\u0007\u0010©\u0001\u001a\u00020\u0014J\t\u0010ª\u0001\u001a\u00020mH\u0016J\t\u0010«\u0001\u001a\u00020mH\u0016J\u001a\u0010¬\u0001\u001a\u00020m2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0007\u0010­\u0001\u001a\u00020)R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010'\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020)0/X\u000e¢\u0006\u0002\n\u0000R\u001c\u00100\u001a\u0004\u0018\u000101X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u00106\u001a\u0004\u0018\u000107X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u000e\u0010<\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010>\u001a\u0004\u0018\u00010?X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0010\u0010D\u001a\u0004\u0018\u00010EX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010G\u001a\u0004\u0018\u00010HX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010I\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010N\u001a\n\u0012\u0004\u0012\u00020O\u0018\u00010(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001c\u0010T\u001a\u0004\u0018\u00010UX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001c\u0010Z\u001a\u0004\u0018\u00010[X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001c\u0010`\u001a\u0004\u0018\u00010aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0010\u0010f\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010g\u001a\u0004\u0018\u00010hX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010i\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010j\u001a\u0004\u0018\u00010kX\u000e¢\u0006\u0002\n\u0000¨\u0006®\u0001"}, d2 = {"Lcom/ss/android/ugc/aweme/tools/music/aimusic/AIMusicView;", "Landroid/view/View$OnClickListener;", "Lcom/ss/android/ugc/aweme/music/ui/IDownloadPlayView;", "Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$IAIMusicView;", "mActivity", "Landroid/support/v7/app/AppCompatActivity;", "mVEEditor", "Lcom/ss/android/vesdk/VEEditor;", "aiMusicConfig", "Lcom/ss/android/ugc/aweme/toolsport/model/AIMusicConfig;", "(Landroid/support/v7/app/AppCompatActivity;Lcom/ss/android/vesdk/VEEditor;Lcom/ss/android/ugc/aweme/toolsport/model/AIMusicConfig;)V", "aiMusicResult", "Lcom/ss/android/ugc/aweme/shortvideo/aichoosemusic/AIMusicResult;", "getAiMusicResult", "()Lcom/ss/android/ugc/aweme/shortvideo/aichoosemusic/AIMusicResult;", "setAiMusicResult", "(Lcom/ss/android/ugc/aweme/shortvideo/aichoosemusic/AIMusicResult;)V", "collectContainer", "Landroid/view/ViewGroup;", "isSecondEnter", "", "mAiMusicPositionPlayer", "Lcom/ss/android/ugc/aweme/shortvideo/aichoosemusic/AiMusicPositionHelper;", "mCollectMusicAdapter", "Lcom/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicItemAdapter;", "getMCollectMusicAdapter", "()Lcom/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicItemAdapter;", "setMCollectMusicAdapter", "(Lcom/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicItemAdapter;)V", "mCollectMusicContainer", "Landroid/support/v7/widget/RecyclerView;", "mCurrentMusicTab", "", "getMCurrentMusicTab", "()I", "setMCurrentMusicTab", "(I)V", "mIvwCutMusic", "Landroid/view/View;", "mLastMusicList", "", "Lcom/ss/android/ugc/aweme/shortvideo/model/MusicModel;", "mLvwLrc", "Lcom/ss/android/ugc/aweme/shortvideo/lrc/LrcView;", "mMusicItemAdapter", "Lcom/ss/android/ugc/aweme/shortvideo/music/MusicItemAdapter;", "mMusicList", "", "mOnAIMusicAnimLoadingListener", "Lcom/ss/android/ugc/aweme/toolsport/model/OnAIMusicAnimLoadingListener;", "getMOnAIMusicAnimLoadingListener", "()Lcom/ss/android/ugc/aweme/toolsport/model/OnAIMusicAnimLoadingListener;", "setMOnAIMusicAnimLoadingListener", "(Lcom/ss/android/ugc/aweme/toolsport/model/OnAIMusicAnimLoadingListener;)V", "mOnMusicTabClickListener", "Lcom/ss/android/ugc/aweme/toolsport/model/OnMusicTabClickListener;", "getMOnMusicTabClickListener", "()Lcom/ss/android/ugc/aweme/toolsport/model/OnMusicTabClickListener;", "setMOnMusicTabClickListener", "(Lcom/ss/android/ugc/aweme/toolsport/model/OnMusicTabClickListener;)V", "mPageType", "mRvwMusicContainer", "mTvCollectEmpty", "Landroid/widget/TextView;", "getMTvCollectEmpty", "()Landroid/widget/TextView;", "setMTvCollectEmpty", "(Landroid/widget/TextView;)V", "mTvwTitle", "Lcom/ss/android/ugc/aweme/themechange/base/AVDmtTextView;", "mView", "musicDownloadPlayHelper", "Lcom/ss/android/ugc/aweme/music/IMusicDownloadPlayHelper;", "mvMusicModel", "getMvMusicModel", "()Lcom/ss/android/ugc/aweme/shortvideo/model/MusicModel;", "setMvMusicModel", "(Lcom/ss/android/ugc/aweme/shortvideo/model/MusicModel;)V", "mvThemeMusicIds", "", "getMvThemeMusicIds", "()Ljava/util/List;", "setMvThemeMusicIds", "(Ljava/util/List;)V", "onAiMusicClickListener", "Lcom/ss/android/ugc/aweme/toolsport/model/OnAiMusicClickListener;", "getOnAiMusicClickListener", "()Lcom/ss/android/ugc/aweme/toolsport/model/OnAiMusicClickListener;", "setOnAiMusicClickListener", "(Lcom/ss/android/ugc/aweme/toolsport/model/OnAiMusicClickListener;)V", "onItemClickListener", "Lcom/ss/android/ugc/aweme/toolsport/model/OnItemClickListener;", "getOnItemClickListener", "()Lcom/ss/android/ugc/aweme/toolsport/model/OnItemClickListener;", "setOnItemClickListener", "(Lcom/ss/android/ugc/aweme/toolsport/model/OnItemClickListener;)V", "onItemShowListener", "Lcom/ss/android/ugc/aweme/toolsport/model/OnItemShowListener;", "getOnItemShowListener", "()Lcom/ss/android/ugc/aweme/toolsport/model/OnItemShowListener;", "setOnItemShowListener", "(Lcom/ss/android/ugc/aweme/toolsport/model/OnItemShowListener;)V", "recommendContainer", "tabLayout", "Lcom/ss/android/ugc/aweme/themechange/base/AVDmtTabLayout;", "titleContainer", "titleContent", "Landroid/widget/FrameLayout;", "buildAIMusicList", "", "buildCollectView", "fromAVMusic", "avMusic", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;", "getCollectMusic", "position", "getCurActivity", "Landroid/app/Activity;", "getCurrentAIMusicTab", "getCurrentMusic", "getModel", "getMusicAdapter", "Landroid/support/v7/widget/RecyclerView$Adapter;", "getMusicChooseType", "getMusicLocalFilePath", "musicModel", "getRecommandMusic", "initData", "initMusicContainer", "initTabs", "initView", "activity", "root", "initViews", "isAllViewValid", "musicIds", "notifyCollectDownloadFail", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "notifyCollectDownloadSuccess", "musicPath", "musicOrigin", "notifyRecommendDownloadFail", "notifyRecommendDownloadSuccess", "onClick", "v", "onDestory", "onMusicDownloadFailed", "onMusicDownloadSuccess", "pausePlay", "renderOriginData", "resumePlay", "setAVOnAIMusicAnimLoadingListener", "onAIMusicAnimLoadingListener", "setAVOnAiMusicClickListener", "onMusicViewClickListener", "setAVOnItemClickListener", "setAVOnItemShowListener", "setAVOnMusicTabClickListener", "onMusicTabClickListener", "setLrcStartTime", "startTime", "setRvwMusicContainerEnable", "enable", "showData", "showMusicContainer", "showRecommend", "showOrHideCutMusicView", "isShow", "startItemAnim", "stopItemAnim", "updateMvMusicData", "it", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements View.OnClickListener, a.c, com.ss.android.ugc.aweme.music.ui.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74806a;
    private ViewGroup A;
    private FrameLayout B;
    private View C;
    private View D;
    private boolean E;
    private List<MusicModel> F = new ArrayList();
    private final p G;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public m f74807b;

    /* renamed from: c  reason: collision with root package name */
    public AVDmtTabLayout f74808c;

    /* renamed from: d  reason: collision with root package name */
    public int f74809d = 3;

    /* renamed from: e  reason: collision with root package name */
    public MusicItemAdapter f74810e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.aichoosemusic.c f74811f;
    public com.ss.android.ugc.aweme.music.a g;
    public RecyclerView h;
    public RecyclerView i;
    public View j;
    public LrcView k;
    public AVDmtTextView l;
    public int m;
    @Nullable
    public com.ss.android.ugc.aweme.shortvideo.aichoosemusic.b n;
    @Nullable
    public MusicModel o;
    @Nullable
    public TextView p;
    @Nullable
    public CollectMusicItemAdapter q;
    @Nullable
    public com.ss.android.ugc.aweme.ao.a.k r;
    @Nullable
    public com.ss.android.ugc.aweme.ao.a.l s;
    @Nullable
    public com.ss.android.ugc.aweme.ao.a.h t;
    @Nullable
    public List<String> u;
    @Nullable
    public com.ss.android.ugc.aweme.ao.a.i v;
    public final AppCompatActivity w;
    public final com.ss.android.ugc.aweme.ao.a.a x;
    private List<? extends MusicModel> y;
    private ViewGroup z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/tools/music/aimusic/AIMusicView$buildAIMusicList$1", "Lcom/ss/android/ugc/aweme/shortvideo/aichoosemusic/AIChooseMusicManager$OnAIMusicListLoadListener;", "onAIMusicLoaded", "", "aiMusicResult", "Lcom/ss/android/ugc/aweme/shortvideo/aichoosemusic/AIMusicResult;", "onAIMusicLoading", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.tools.music.b.a$a  reason: collision with other inner class name */
    public static final class C0775a implements AIChooseMusicManager.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74812a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f74813b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "musicModel", "Lcom/ss/android/ugc/aweme/shortvideo/model/MusicModel;", "<anonymous parameter 1>", "", "onFinish"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.tools.music.b.a$a$a  reason: collision with other inner class name */
        static final class C0776a implements com.ss.android.ugc.aweme.tools.music.d.a {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74814a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C0775a f74815b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.aichoosemusic.b f74816c;

            C0776a(C0775a aVar, com.ss.android.ugc.aweme.shortvideo.aichoosemusic.b bVar) {
                this.f74815b = aVar;
                this.f74816c = bVar;
            }

            public final void a(@NotNull MusicModel musicModel, boolean z) {
                if (PatchProxy.isSupport(new Object[]{musicModel, Byte.valueOf(z ? (byte) 1 : 0)}, this, f74814a, false, 87178, new Class[]{MusicModel.class, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{musicModel, Byte.valueOf(z)}, this, f74814a, false, 87178, new Class[]{MusicModel.class, Boolean.TYPE}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(musicModel, "musicModel");
                this.f74815b.f74813b.a(this.f74816c, musicModel);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.tools.music.b.a$a$b */
        static final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74817a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C0775a f74818b;

            b(C0775a aVar) {
                this.f74818b = aVar;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f74817a, false, 87179, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f74817a, false, 87179, new Class[0], Void.TYPE);
                    return;
                }
                MusicItemAdapter musicItemAdapter = this.f74818b.f74813b.f74810e;
                if (musicItemAdapter != null) {
                    musicItemAdapter.e();
                }
                this.f74818b.f74813b.j();
            }
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f74812a, false, 87177, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f74812a, false, 87177, new Class[0], Void.TYPE);
                return;
            }
            MusicItemAdapter musicItemAdapter = this.f74813b.f74810e;
            if (musicItemAdapter != null) {
                if (PatchProxy.isSupport(new Object[0], musicItemAdapter, MusicItemAdapter.f68379a, false, 77722, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], musicItemAdapter, MusicItemAdapter.f68379a, false, 77722, new Class[0], Void.TYPE);
                } else {
                    musicItemAdapter.h = true;
                    musicItemAdapter.g = 1;
                    musicItemAdapter.f68384f.clear();
                    musicItemAdapter.f68383e.cancel();
                    musicItemAdapter.f68383e.removeAllListeners();
                    RecyclerView recyclerView = musicItemAdapter.f68381c;
                    if (recyclerView != null) {
                        recyclerView.post(new MusicItemAdapter.c(musicItemAdapter));
                    }
                }
            }
            com.ss.android.ugc.aweme.ao.a.h hVar = this.f74813b.t;
            if (hVar != null) {
                hVar.a();
            }
        }

        C0775a(a aVar) {
            this.f74813b = aVar;
        }

        public final void a(@Nullable com.ss.android.ugc.aweme.shortvideo.aichoosemusic.b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f74812a, false, 87176, new Class[]{com.ss.android.ugc.aweme.shortvideo.aichoosemusic.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f74812a, false, 87176, new Class[]{com.ss.android.ugc.aweme.shortvideo.aichoosemusic.b.class}, Void.TYPE);
                return;
            }
            this.f74813b.n = bVar;
            if (com.bytedance.framwork.core.c.a.a(this.f74813b.u)) {
                RecyclerView recyclerView = this.f74813b.i;
                if (recyclerView != null) {
                    recyclerView.post(new b(this));
                }
            } else if (this.f74813b.o != null) {
                a aVar = this.f74813b;
                MusicModel musicModel = this.f74813b.o;
                if (musicModel == null) {
                    Intrinsics.throwNpe();
                }
                aVar.a(bVar, musicModel);
            } else {
                c.a.a().a((com.ss.android.ugc.aweme.tools.music.d.a) new C0776a(this, bVar)).a(this.f74813b.u);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/tools/music/aimusic/AIMusicView$buildCollectView$1", "Lcom/ss/android/ugc/aweme/toolsport/model/OnItemClickListener;", "onItemClick", "", "view", "Landroid/view/View;", "position", "", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements com.ss.android.ugc.aweme.ao.a.k {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74819a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f74820b;

        b(a aVar) {
            this.f74820b = aVar;
        }

        public final void a(@NotNull View view, int i) {
            MusicModel musicModel;
            Integer num;
            Integer num2;
            boolean z;
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f74819a, false, 87180, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f74819a, false, 87180, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view, "view");
            CollectMusicItemAdapter collectMusicItemAdapter = this.f74820b.q;
            MusicModel musicModel2 = null;
            if (collectMusicItemAdapter != null) {
                musicModel = collectMusicItemAdapter.a(i);
            } else {
                musicModel = null;
            }
            if (musicModel != null) {
                CollectMusicItemAdapter collectMusicItemAdapter2 = this.f74820b.q;
                if (collectMusicItemAdapter2 != null) {
                    num = Integer.valueOf(collectMusicItemAdapter2.f68433e);
                } else {
                    num = null;
                }
                CollectMusicItemAdapter collectMusicItemAdapter3 = this.f74820b.q;
                if (collectMusicItemAdapter3 != null) {
                    num2 = Integer.valueOf(collectMusicItemAdapter3.f68434f);
                } else {
                    num2 = null;
                }
                if (Intrinsics.areEqual((Object) num, (Object) num2)) {
                    CollectMusicItemAdapter collectMusicItemAdapter4 = this.f74820b.q;
                    if (collectMusicItemAdapter4 != null && collectMusicItemAdapter4.f68433e == i) {
                        if (com.bytedance.framwork.core.c.a.a(this.f74820b.u)) {
                            View view2 = this.f74820b.j;
                            if (view2 != null) {
                                view2.setEnabled(false);
                            }
                            this.f74820b.c(false);
                            View view3 = this.f74820b.j;
                            if (view3 != null) {
                                view3.setVisibility(8);
                            }
                            CollectMusicItemAdapter collectMusicItemAdapter5 = this.f74820b.q;
                            if (collectMusicItemAdapter5 != null) {
                                collectMusicItemAdapter5.b(-1, false);
                            }
                            CollectMusicItemAdapter collectMusicItemAdapter6 = this.f74820b.q;
                            if (collectMusicItemAdapter6 != null) {
                                collectMusicItemAdapter6.f68433e = -1;
                            }
                            com.ss.android.ugc.aweme.shortvideo.aichoosemusic.c cVar = this.f74820b.f74811f;
                            if (cVar != null) {
                                cVar.b();
                            }
                            com.ss.android.ugc.aweme.ao.a.i iVar = this.f74820b.v;
                            if (iVar != null) {
                                iVar.a(null, null, false);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                com.ss.android.ugc.aweme.ao.a.k kVar = this.f74820b.r;
                if (kVar != null) {
                    kVar.a(view, i);
                }
                CollectMusicItemAdapter collectMusicItemAdapter7 = this.f74820b.q;
                if (collectMusicItemAdapter7 != null) {
                    musicModel2 = collectMusicItemAdapter7.a(i);
                }
                String a2 = this.f74820b.a(musicModel2);
                CharSequence charSequence = a2;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    CollectMusicItemAdapter collectMusicItemAdapter8 = this.f74820b.q;
                    if (collectMusicItemAdapter8 != null) {
                        collectMusicItemAdapter8.a(i, false);
                    }
                    this.f74820b.a(a2, musicModel2, "");
                    return;
                }
                CollectMusicItemAdapter collectMusicItemAdapter9 = this.f74820b.q;
                if (collectMusicItemAdapter9 != null) {
                    collectMusicItemAdapter9.a(i, true);
                }
                com.ss.android.ugc.aweme.music.a aVar = this.f74820b.g;
                if (aVar != null) {
                    aVar.b(musicModel2, this.f74820b.f74809d, false);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "loadMore"}, k = 3, mv = {1, 1, 15})
    static final class c implements LoadMoreRecyclerViewAdapter.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74821a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f74822b;

        c(a aVar) {
            this.f74822b = aVar;
        }

        public final void loadMore() {
            if (PatchProxy.isSupport(new Object[0], this, f74821a, false, 87181, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f74821a, false, 87181, new Class[0], Void.TYPE);
                return;
            }
            CollectMusicItemAdapter collectMusicItemAdapter = this.f74822b.q;
            if (collectMusicItemAdapter != null) {
                collectMusicItemAdapter.showLoadMoreLoading();
            }
            com.ss.android.ugc.aweme.shortvideo.music.collect.a a2 = a.C0721a.a();
            if (PatchProxy.isSupport(new Object[0], a2, com.ss.android.ugc.aweme.shortvideo.music.collect.a.f68439a, false, 77811, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], a2, com.ss.android.ugc.aweme.shortvideo.music.collect.a.f68439a, false, 77811, new Class[0], Void.TYPE);
                return;
            }
            a2.f68443e = true;
            bk unused = kotlinx.coroutines.g.a(bd.f83876a, null, null, new a.f(a2, null), 3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u001e\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u001e\u0010\f\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/tools/music/aimusic/AIMusicView$buildCollectView$3", "Lcom/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicManager$OnGetCollectMusicCallback;", "onInitialLoadFail", "", "onInitialLoading", "onMoreResult", "musicList", "", "Lcom/ss/android/ugc/aweme/shortvideo/model/MusicModel;", "hasMore", "", "onRefreshEmpty", "onRefreshResult", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74823a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f74824b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.tools.music.b.a$d$a  reason: collision with other inner class name */
        static final class C0777a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74825a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f74826b;

            C0777a(d dVar) {
                this.f74826b = dVar;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f74825a, false, 87187, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f74825a, false, 87187, new Class[0], Void.TYPE);
                    return;
                }
                CollectMusicItemAdapter collectMusicItemAdapter = this.f74826b.f74824b.q;
                if (collectMusicItemAdapter != null) {
                    collectMusicItemAdapter.b();
                }
                RecyclerView recyclerView = this.f74826b.f74824b.h;
                if (recyclerView != null) {
                    recyclerView.setVisibility(4);
                }
                TextView textView = this.f74826b.f74824b.p;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = this.f74826b.f74824b.p;
                if (textView2 != null) {
                    textView2.setText(this.f74826b.f74824b.w.getResources().getString(C0906R.string.abg));
                }
                TextView textView3 = this.f74826b.f74824b.p;
                if (textView3 != null) {
                    textView3.setOnClickListener(AnonymousClass1.f74828b);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        static final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74829a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f74830b;

            b(d dVar) {
                this.f74830b = dVar;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f74829a, false, 87189, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f74829a, false, 87189, new Class[0], Void.TYPE);
                    return;
                }
                RecyclerView recyclerView = this.f74830b.f74824b.h;
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                CollectMusicItemAdapter collectMusicItemAdapter = this.f74830b.f74824b.q;
                if (collectMusicItemAdapter != null) {
                    if (PatchProxy.isSupport(new Object[0], collectMusicItemAdapter, CollectMusicItemAdapter.f68429a, false, 77786, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], collectMusicItemAdapter, CollectMusicItemAdapter.f68429a, false, 77786, new Class[0], Void.TYPE);
                    } else {
                        collectMusicItemAdapter.f68432d = true;
                        collectMusicItemAdapter.k = 1;
                        collectMusicItemAdapter.j.clear();
                        collectMusicItemAdapter.i.cancel();
                        collectMusicItemAdapter.i.removeAllListeners();
                        RecyclerView recyclerView2 = collectMusicItemAdapter.g;
                        if (recyclerView2 != null) {
                            recyclerView2.post(new CollectMusicItemAdapter.b(collectMusicItemAdapter));
                        }
                    }
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        static final class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74831a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f74832b;

            c(d dVar) {
                this.f74832b = dVar;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f74831a, false, 87191, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f74831a, false, 87191, new Class[0], Void.TYPE);
                    return;
                }
                CollectMusicItemAdapter collectMusicItemAdapter = this.f74832b.f74824b.q;
                if (collectMusicItemAdapter != null) {
                    collectMusicItemAdapter.b();
                }
                RecyclerView recyclerView = this.f74832b.f74824b.h;
                if (recyclerView != null) {
                    recyclerView.setVisibility(4);
                }
                TextView textView = this.f74832b.f74824b.p;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = this.f74832b.f74824b.p;
                if (textView2 != null) {
                    textView2.setText(this.f74832b.f74824b.w.getResources().getString(C0906R.string.u8));
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.tools.music.b.a$d$d  reason: collision with other inner class name */
        static final class C0778d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74833a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f74834b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List f74835c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ boolean f74836d;

            C0778d(d dVar, List list, boolean z) {
                this.f74834b = dVar;
                this.f74835c = list;
                this.f74836d = z;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f74833a, false, 87192, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f74833a, false, 87192, new Class[0], Void.TYPE);
                    return;
                }
                RecyclerView recyclerView = this.f74834b.f74824b.h;
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                TextView textView = this.f74834b.f74824b.p;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                CollectMusicItemAdapter collectMusicItemAdapter = this.f74834b.f74824b.q;
                if (collectMusicItemAdapter != null) {
                    collectMusicItemAdapter.b();
                }
                CollectMusicItemAdapter collectMusicItemAdapter2 = this.f74834b.f74824b.q;
                if (collectMusicItemAdapter2 != null) {
                    collectMusicItemAdapter2.setData(this.f74835c);
                }
                CollectMusicItemAdapter collectMusicItemAdapter3 = this.f74834b.f74824b.q;
                if (collectMusicItemAdapter3 != null) {
                    collectMusicItemAdapter3.setShowFooter(true);
                }
                if (!this.f74836d) {
                    CollectMusicItemAdapter collectMusicItemAdapter4 = this.f74834b.f74824b.q;
                    if (collectMusicItemAdapter4 != null) {
                        collectMusicItemAdapter4.showLoadMoreEmpty();
                    }
                    CollectMusicItemAdapter collectMusicItemAdapter5 = this.f74834b.f74824b.q;
                    if (collectMusicItemAdapter5 != null) {
                        collectMusicItemAdapter5.setShowFooter(false);
                    }
                    return;
                }
                CollectMusicItemAdapter collectMusicItemAdapter6 = this.f74834b.f74824b.q;
                if (collectMusicItemAdapter6 != null) {
                    collectMusicItemAdapter6.resetLoadMoreState();
                }
            }
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f74823a, false, 87182, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f74823a, false, 87182, new Class[0], Void.TYPE);
                return;
            }
            RecyclerView recyclerView = this.f74824b.h;
            if (recyclerView != null) {
                recyclerView.post(new c(this));
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f74823a, false, 87185, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f74823a, false, 87185, new Class[0], Void.TYPE);
                return;
            }
            RecyclerView recyclerView = this.f74824b.h;
            if (recyclerView != null) {
                recyclerView.post(new b(this));
            }
        }

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f74823a, false, 87186, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f74823a, false, 87186, new Class[0], Void.TYPE);
                return;
            }
            RecyclerView recyclerView = this.f74824b.h;
            if (recyclerView != null) {
                recyclerView.post(new C0777a(this));
            }
        }

        d(a aVar) {
            this.f74824b = aVar;
        }

        public final void a(@NotNull List<? extends MusicModel> list, boolean z) {
            if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f74823a, false, 87183, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f74823a, false, 87183, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(list, "musicList");
            RecyclerView recyclerView = this.f74824b.h;
            if (recyclerView != null) {
                recyclerView.post(new C0778d(this, list, z));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/tools/music/aimusic/AIMusicView$initData$1", "Lcom/ss/android/ugc/aweme/toolsport/model/OnItemClickListener;", "onItemClick", "", "view", "Landroid/view/View;", "position", "", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e implements com.ss.android.ugc.aweme.ao.a.k {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74837a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f74838b;

        e(a aVar) {
            this.f74838b = aVar;
        }

        public final void a(@NotNull View view, int i) {
            MusicModel musicModel;
            Integer num;
            Integer num2;
            boolean z;
            String str;
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f74837a, false, 87193, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f74837a, false, 87193, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view, "view");
            if (i == -1) {
                this.f74838b.x.a();
                com.ss.android.ugc.aweme.ao.a.i iVar = this.f74838b.v;
                if (iVar != null) {
                    iVar.a();
                    return;
                }
                return;
            }
            MusicItemAdapter musicItemAdapter = this.f74838b.f74810e;
            MusicModel musicModel2 = null;
            if (musicItemAdapter != null) {
                musicModel = musicItemAdapter.c(i);
            } else {
                musicModel = null;
            }
            if (musicModel != null) {
                MusicItemAdapter musicItemAdapter2 = this.f74838b.f74810e;
                if (musicItemAdapter2 != null) {
                    num = Integer.valueOf(musicItemAdapter2.a());
                } else {
                    num = null;
                }
                MusicItemAdapter musicItemAdapter3 = this.f74838b.f74810e;
                if (musicItemAdapter3 != null) {
                    num2 = Integer.valueOf(musicItemAdapter3.b());
                } else {
                    num2 = null;
                }
                if (Intrinsics.areEqual((Object) num, (Object) num2)) {
                    MusicItemAdapter musicItemAdapter4 = this.f74838b.f74810e;
                    if (musicItemAdapter4 != null && musicItemAdapter4.a() == i) {
                        if (com.bytedance.framwork.core.c.a.a(this.f74838b.u)) {
                            View view2 = this.f74838b.j;
                            if (view2 != null) {
                                view2.setEnabled(false);
                            }
                            this.f74838b.c(false);
                            View view3 = this.f74838b.j;
                            if (view3 != null) {
                                view3.setVisibility(8);
                            }
                            MusicItemAdapter musicItemAdapter5 = this.f74838b.f74810e;
                            if (musicItemAdapter5 != null) {
                                musicItemAdapter5.b(-1, false);
                            }
                            MusicItemAdapter musicItemAdapter6 = this.f74838b.f74810e;
                            if (musicItemAdapter6 != null) {
                                musicItemAdapter6.a(-1);
                            }
                            AVDmtTextView aVDmtTextView = this.f74838b.l;
                            if (aVDmtTextView != null) {
                                aVDmtTextView.setSelected(false);
                            }
                            AVDmtTextView aVDmtTextView2 = this.f74838b.l;
                            if (aVDmtTextView2 != null) {
                                AVDmtTextView aVDmtTextView3 = this.f74838b.l;
                                if (aVDmtTextView3 != null) {
                                    Context context = aVDmtTextView3.getContext();
                                    if (context != null) {
                                        Resources resources = context.getResources();
                                        if (resources != null) {
                                            str = resources.getString(C0906R.string.is);
                                            aVDmtTextView2.setText(str);
                                        }
                                    }
                                }
                                str = null;
                                aVDmtTextView2.setText(str);
                            }
                            LrcView lrcView = this.f74838b.k;
                            if (lrcView != null) {
                                lrcView.setVisibility(8);
                            }
                            com.ss.android.ugc.aweme.shortvideo.aichoosemusic.c cVar = this.f74838b.f74811f;
                            if (cVar != null) {
                                cVar.b();
                            }
                            com.ss.android.ugc.aweme.ao.a.i iVar2 = this.f74838b.v;
                            if (iVar2 != null) {
                                iVar2.a(null, null, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                com.ss.android.ugc.aweme.ao.a.k kVar = this.f74838b.r;
                if (kVar != null) {
                    kVar.a(view, i);
                }
                MusicItemAdapter musicItemAdapter7 = this.f74838b.f74810e;
                if (musicItemAdapter7 != null) {
                    musicModel2 = musicItemAdapter7.c(i);
                }
                String a2 = this.f74838b.a(musicModel2);
                CharSequence charSequence = a2;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z || (musicModel2 != null && musicModel2.isMvThemeMusic())) {
                    MusicItemAdapter musicItemAdapter8 = this.f74838b.f74810e;
                    if (musicItemAdapter8 != null) {
                        musicItemAdapter8.a(i, false);
                    }
                    this.f74838b.a(a2, musicModel2, "");
                } else {
                    View view4 = this.f74838b.j;
                    if (view4 != null) {
                        view4.setEnabled(false);
                    }
                    MusicItemAdapter musicItemAdapter9 = this.f74838b.f74810e;
                    if (musicItemAdapter9 != null) {
                        musicItemAdapter9.a(i, true);
                    }
                    com.ss.android.ugc.aweme.music.a aVar = this.f74838b.g;
                    if (aVar != null) {
                        aVar.b(musicModel2, this.f74838b.f74809d, false);
                    }
                }
                if (musicModel2 == null || !musicModel2.isMvThemeMusic()) {
                    View view5 = this.f74838b.j;
                    if (view5 == null) {
                        Intrinsics.throwNpe();
                    }
                    view5.setAlpha(1.0f);
                    View view6 = this.f74838b.j;
                    if (view6 == null) {
                        Intrinsics.throwNpe();
                    }
                    view6.setClickable(true);
                    return;
                }
                View view7 = this.f74838b.j;
                if (view7 == null) {
                    Intrinsics.throwNpe();
                }
                view7.setAlpha(0.5f);
                View view8 = this.f74838b.j;
                if (view8 == null) {
                    Intrinsics.throwNpe();
                }
                view8.setClickable(false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/tools/music/aimusic/AIMusicView$initTabs$1$1", "Landroid/view/View$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74839a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f74840b;

        f(a aVar) {
            this.f74840b = aVar;
        }

        public final void onClick(@Nullable View view) {
            TabLayout.e eVar;
            if (PatchProxy.isSupport(new Object[]{view}, this, f74839a, false, 87194, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f74839a, false, 87194, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            m mVar = this.f74840b.f74807b;
            if (mVar != null) {
                mVar.a(true);
            }
            this.f74840b.b(true);
            AVDmtTabLayout aVDmtTabLayout = this.f74840b.f74808c;
            if (aVDmtTabLayout != null) {
                AVDmtTabLayout aVDmtTabLayout2 = this.f74840b.f74808c;
                if (aVDmtTabLayout2 != null) {
                    eVar = aVDmtTabLayout2.a(0);
                } else {
                    eVar = null;
                }
                aVDmtTabLayout.b(eVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/tools/music/aimusic/AIMusicView$initTabs$1$2", "Landroid/view/View$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74841a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f74842b;

        g(a aVar) {
            this.f74842b = aVar;
        }

        public final void onClick(@Nullable View view) {
            TabLayout.e eVar;
            if (PatchProxy.isSupport(new Object[]{view}, this, f74841a, false, 87195, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f74841a, false, 87195, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            m mVar = this.f74842b.f74807b;
            if (mVar != null) {
                mVar.a(true);
            }
            this.f74842b.b(true);
            AVDmtTabLayout aVDmtTabLayout = this.f74842b.f74808c;
            if (aVDmtTabLayout != null) {
                AVDmtTabLayout aVDmtTabLayout2 = this.f74842b.f74808c;
                if (aVDmtTabLayout2 != null) {
                    eVar = aVDmtTabLayout2.a(1);
                } else {
                    eVar = null;
                }
                aVDmtTabLayout.b(eVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/tools/music/aimusic/AIMusicView$initTabs$1$3", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/widget/tablayout/TabLayout$OnTabSelectedListener;", "onTabReselected", "", "tab", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/widget/tablayout/TabLayout$Tab;", "onTabSelected", "onTabUnselected", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class h implements TabLayout.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74843a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f74844b;

        public final void b(@Nullable TabLayout.e eVar) {
        }

        public final void c(@Nullable TabLayout.e eVar) {
        }

        h(a aVar) {
            this.f74844b = aVar;
        }

        public final void a(@Nullable TabLayout.e eVar) {
            boolean z;
            boolean z2 = true;
            if (PatchProxy.isSupport(new Object[]{eVar}, this, f74843a, false, 87196, new Class[]{TabLayout.e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, f74843a, false, 87196, new Class[]{TabLayout.e.class}, Void.TYPE);
                return;
            }
            m mVar = this.f74844b.f74807b;
            if (mVar != null) {
                if (eVar == null || eVar.f70400f != 0) {
                    z = false;
                } else {
                    z = true;
                }
                mVar.a(z);
            }
            a aVar = this.f74844b;
            if (eVar == null || eVar.f70400f != 0) {
                z2 = false;
            }
            aVar.b(z2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/tools/music/aimusic/AIMusicView$notifyRecommendDownloadSuccess$1", "Lcom/ss/android/ugc/aweme/tools/music/lrc/LrcManager$OnLrcFetchListener;", "onLrcLoadDone", "", "lrcUrl", "", "lrcInfoList", "", "Lcom/ss/android/ugc/aweme/shortvideo/lrc/LrcInfo;", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class i implements a.C0780a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74845a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f74846b;

        i(a aVar) {
            this.f74846b = aVar;
        }

        public final void a(@Nullable String str, @Nullable List<com.ss.android.ugc.aweme.shortvideo.lrc.a> list) {
            String str2;
            if (PatchProxy.isSupport(new Object[]{str, list}, this, f74845a, false, 87197, new Class[]{String.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, list}, this, f74845a, false, 87197, new Class[]{String.class, List.class}, Void.TYPE);
                return;
            }
            MusicModel k = this.f74846b.k();
            if (k != null) {
                str2 = k.getLrcUrl();
            } else {
                str2 = null;
            }
            if (!(!Intrinsics.areEqual((Object) str, (Object) str2)) && !CollectionUtils.isEmpty(list)) {
                LrcView lrcView = this.f74846b.k;
                if (lrcView != null) {
                    lrcView.setVisibility(0);
                }
                LrcView lrcView2 = this.f74846b.k;
                if (lrcView2 != null) {
                    if (list == null) {
                        Intrinsics.throwNpe();
                    }
                    lrcView2.setLrcInfos(list);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/tools/music/aimusic/AIMusicView$notifyRecommendDownloadSuccess$2", "Lcom/ss/android/ugc/aweme/shortvideo/aichoosemusic/AiMusicPositionHelper$PositionListener;", "updatePosition", "", "durationTime", "", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class j implements c.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74847a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f74848b;

        j(a aVar) {
            this.f74848b = aVar;
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f74847a, false, 87198, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f74847a, false, 87198, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            LrcView lrcView = this.f74848b.k;
            if (lrcView != null) {
                lrcView.setCurrentTime(i);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/tools/music/aimusic/AIMusicView$showData$1", "Lcom/ss/android/ugc/aweme/tools/music/lrc/LrcManager$OnLrcFetchListener;", "onLrcLoadDone", "", "lrcUrl", "", "lrcInfoList", "", "Lcom/ss/android/ugc/aweme/shortvideo/lrc/LrcInfo;", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class k implements a.C0780a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74849a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f74850b;

        k(a aVar) {
            this.f74850b = aVar;
        }

        public final void a(@Nullable String str, @Nullable List<com.ss.android.ugc.aweme.shortvideo.lrc.a> list) {
            String str2;
            if (PatchProxy.isSupport(new Object[]{str, list}, this, f74849a, false, 87199, new Class[]{String.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, list}, this, f74849a, false, 87199, new Class[]{String.class, List.class}, Void.TYPE);
                return;
            }
            MusicModel k = this.f74850b.k();
            if (k != null) {
                str2 = k.getLrcUrl();
            } else {
                str2 = null;
            }
            if (!(!Intrinsics.areEqual((Object) str, (Object) str2)) && !CollectionUtils.isEmpty(list)) {
                LrcView lrcView = this.f74850b.k;
                if (lrcView != null) {
                    lrcView.setVisibility(0);
                }
                LrcView lrcView2 = this.f74850b.k;
                if (lrcView2 != null) {
                    if (list == null) {
                        Intrinsics.throwNpe();
                    }
                    lrcView2.setLrcInfos(list);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74851a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f74852b;

        l(a aVar) {
            this.f74852b = aVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f74851a, false, 87200, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f74851a, false, 87200, new Class[0], Void.TYPE);
                return;
            }
            MusicItemAdapter musicItemAdapter = this.f74852b.f74810e;
            if (musicItemAdapter != null) {
                musicItemAdapter.e();
            }
            this.f74852b.j();
        }
    }

    public final int c() {
        return this.m;
    }

    public final void a(@Nullable List<String> list) {
        this.u = list;
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f74806a, false, 87148, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f74806a, false, 87148, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        RecyclerView recyclerView = this.i;
        if (recyclerView != null) {
            recyclerView.setEnabled(true);
        }
    }

    public final void a(@Nullable String str, @Nullable MusicModel musicModel, @Nullable String str2) {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, musicModel, str2}, this, f74806a, false, 87165, new Class[]{String.class, MusicModel.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, musicModel, str2}, this, f74806a, false, 87165, new Class[]{String.class, MusicModel.class, String.class}, Void.TYPE);
            return;
        }
        String str4 = null;
        if (this.m == 0) {
            if (PatchProxy.isSupport(new Object[]{str3, musicModel, str2}, this, f74806a, false, 87166, new Class[]{String.class, MusicModel.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str3, musicModel, str2}, this, f74806a, false, 87166, new Class[]{String.class, MusicModel.class, String.class}, Void.TYPE);
            } else {
                MusicItemAdapter musicItemAdapter = this.f74810e;
                MusicModel d2 = musicItemAdapter != null ? musicItemAdapter.d() : null;
                if (!(!Intrinsics.areEqual((Object) d2 != null ? d2.getMusicId() : null, (Object) musicModel != null ? musicModel.getMusicId() : null))) {
                    AVDmtTextView aVDmtTextView = this.l;
                    if (aVDmtTextView != null) {
                        aVDmtTextView.setSelected(true);
                    }
                    AVDmtTextView aVDmtTextView2 = this.l;
                    if (aVDmtTextView2 != null) {
                        AVDmtTextView aVDmtTextView3 = this.l;
                        if (aVDmtTextView3 != null) {
                            Context context = aVDmtTextView3.getContext();
                            if (context != null) {
                                Resources resources = context.getResources();
                                if (resources != null) {
                                    Object[] objArr = new Object[1];
                                    if (d2 != null) {
                                        str4 = d2.getName();
                                    }
                                    objArr[0] = str4;
                                    str4 = resources.getString(C0906R.string.iv, objArr);
                                }
                            }
                        }
                        aVDmtTextView2.setText(str4);
                    }
                    LrcView lrcView = this.k;
                    if (lrcView != null) {
                        lrcView.setVisibility(8);
                    }
                    LrcView lrcView2 = this.k;
                    if (lrcView2 != null) {
                        lrcView2.setStartTime(0);
                    }
                    Object service = ServiceManager.get().getService(IAVServiceProxy.class);
                    Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…ServiceProxy::class.java)");
                    int b2 = ((IAVServiceProxy) service).getMusicService().b(str3);
                    LrcView lrcView3 = this.k;
                    if (lrcView3 != null) {
                        lrcView3.setDuration(((float) b2) / 1000.0f);
                    }
                    LrcView lrcView4 = this.k;
                    if (lrcView4 != null) {
                        lrcView4.setPreviewStartTime(d2 != null ? d2.getPreviewStartTime() : 0.0f);
                    }
                    com.ss.android.ugc.aweme.ao.a.i iVar = this.v;
                    if (iVar != null) {
                        iVar.a(str3, new com.ss.android.ugc.aweme.tools.music.f.b().apply(d2), true);
                    }
                    MusicItemAdapter musicItemAdapter2 = this.f74810e;
                    if (musicItemAdapter2 != null) {
                        musicItemAdapter2.f();
                    }
                    MusicItemAdapter musicItemAdapter3 = this.f74810e;
                    if (musicItemAdapter3 != null) {
                        MusicItemAdapter musicItemAdapter4 = this.f74810e;
                        musicItemAdapter3.b(musicItemAdapter4 != null ? musicItemAdapter4.b() : -1, true);
                    }
                    CollectMusicItemAdapter collectMusicItemAdapter = this.q;
                    if (collectMusicItemAdapter != null) {
                        if (PatchProxy.isSupport(new Object[0], collectMusicItemAdapter, CollectMusicItemAdapter.f68429a, false, 77801, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], collectMusicItemAdapter, CollectMusicItemAdapter.f68429a, false, 77801, new Class[0], Void.TYPE);
                        } else {
                            collectMusicItemAdapter.b(-1, false);
                            collectMusicItemAdapter.f68433e = -1;
                            collectMusicItemAdapter.f68434f = -1;
                        }
                    }
                    com.ss.android.ugc.aweme.tools.music.c.a a2 = com.ss.android.ugc.aweme.tools.music.c.a.a();
                    if (d2 == null) {
                        Intrinsics.throwNpe();
                    }
                    a2.a(d2.getLrcUrl(), d2.getLrcType(), (a.C0780a) new i(this));
                    com.ss.android.ugc.aweme.shortvideo.aichoosemusic.c cVar = this.f74811f;
                    if (cVar != null) {
                        c.b jVar = new j(this);
                        if (PatchProxy.isSupport(new Object[]{jVar}, cVar, com.ss.android.ugc.aweme.shortvideo.aichoosemusic.c.f65571a, false, 75077, new Class[]{c.b.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{jVar}, cVar, com.ss.android.ugc.aweme.shortvideo.aichoosemusic.c.f65571a, false, 75077, new Class[]{c.b.class}, Void.TYPE);
                        } else {
                            Intrinsics.checkParameterIsNotNull(jVar, "positionListener");
                            cVar.f65573c = jVar;
                        }
                    }
                    com.ss.android.ugc.aweme.shortvideo.aichoosemusic.c cVar2 = this.f74811f;
                    if (cVar2 != null) {
                        cVar2.a();
                    }
                    View view = this.j;
                    if (view != null) {
                        view.setEnabled(true);
                    }
                    c(this.x.b());
                    if (musicModel != null && musicModel.isMvThemeMusic()) {
                        View view2 = this.j;
                        if (view2 != null) {
                            view2.setVisibility(0);
                        }
                    }
                }
            }
        } else {
            if (PatchProxy.isSupport(new Object[]{str3, musicModel, str2}, this, f74806a, false, 87168, new Class[]{String.class, MusicModel.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str3, musicModel, str2}, this, f74806a, false, 87168, new Class[]{String.class, MusicModel.class, String.class}, Void.TYPE);
                return;
            }
            CollectMusicItemAdapter collectMusicItemAdapter2 = this.q;
            MusicModel a3 = collectMusicItemAdapter2 != null ? collectMusicItemAdapter2.a() : null;
            String musicId = a3 != null ? a3.getMusicId() : null;
            if (musicModel != null) {
                str4 = musicModel.getMusicId();
            }
            if (!(!Intrinsics.areEqual((Object) musicId, (Object) str4))) {
                com.ss.android.ugc.aweme.ao.a.i iVar2 = this.v;
                if (iVar2 != null) {
                    iVar2.a(str3, new com.ss.android.ugc.aweme.tools.music.f.b().apply(a3), false);
                }
                CollectMusicItemAdapter collectMusicItemAdapter3 = this.q;
                if (collectMusicItemAdapter3 != null) {
                    collectMusicItemAdapter3.c();
                }
                CollectMusicItemAdapter collectMusicItemAdapter4 = this.q;
                if (collectMusicItemAdapter4 != null) {
                    CollectMusicItemAdapter collectMusicItemAdapter5 = this.q;
                    collectMusicItemAdapter4.b(collectMusicItemAdapter5 != null ? collectMusicItemAdapter5.f68434f : -1, true);
                }
                MusicItemAdapter musicItemAdapter5 = this.f74810e;
                if (musicItemAdapter5 != null) {
                    if (PatchProxy.isSupport(new Object[0], musicItemAdapter5, MusicItemAdapter.f68379a, false, 77732, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], musicItemAdapter5, MusicItemAdapter.f68379a, false, 77732, new Class[0], Void.TYPE);
                    } else {
                        musicItemAdapter5.b(-1, false);
                        musicItemAdapter5.a(-1);
                        musicItemAdapter5.b(-1);
                    }
                }
                com.ss.android.ugc.aweme.shortvideo.aichoosemusic.c cVar3 = this.f74811f;
                if (cVar3 != null) {
                    cVar3.a();
                }
                View view3 = this.j;
                if (view3 != null) {
                    view3.setEnabled(true);
                }
                c(this.x.b());
                if (musicModel != null && musicModel.isMvThemeMusic()) {
                    View view4 = this.j;
                    if (view4 != null) {
                        view4.setVisibility(0);
                    }
                }
            }
        }
    }

    public final void a(@Nullable MusicModel musicModel, @NotNull Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{musicModel, exc2}, this, f74806a, false, 87170, new Class[]{MusicModel.class, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel, exc2}, this, f74806a, false, 87170, new Class[]{MusicModel.class, Exception.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(exc2, "e");
        int i2 = -1;
        String str = null;
        if (this.m == 0) {
            if (PatchProxy.isSupport(new Object[]{musicModel, exc2}, this, f74806a, false, 87167, new Class[]{MusicModel.class, Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{musicModel, exc2}, this, f74806a, false, 87167, new Class[]{MusicModel.class, Exception.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(exc2, "e");
                MusicItemAdapter musicItemAdapter = this.f74810e;
                MusicModel d2 = musicItemAdapter != null ? musicItemAdapter.d() : null;
                String musicId = d2 != null ? d2.getMusicId() : null;
                if (musicModel != null) {
                    str = musicModel.getMusicId();
                }
                if (!(!Intrinsics.areEqual((Object) musicId, (Object) str))) {
                    MusicItemAdapter musicItemAdapter2 = this.f74810e;
                    if (musicItemAdapter2 != null) {
                        musicItemAdapter2.f();
                    }
                    MusicItemAdapter musicItemAdapter3 = this.f74810e;
                    if (musicItemAdapter3 != null) {
                        MusicItemAdapter musicItemAdapter4 = this.f74810e;
                        if (musicItemAdapter4 != null) {
                            i2 = musicItemAdapter4.a();
                        }
                        musicItemAdapter3.b(i2);
                    }
                    View view = this.j;
                    if (view != null) {
                        view.setEnabled(true);
                    }
                }
            }
        } else {
            if (PatchProxy.isSupport(new Object[]{musicModel, exc2}, this, f74806a, false, 87171, new Class[]{MusicModel.class, Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{musicModel, exc2}, this, f74806a, false, 87171, new Class[]{MusicModel.class, Exception.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(exc2, "e");
            CollectMusicItemAdapter collectMusicItemAdapter = this.q;
            MusicModel a2 = collectMusicItemAdapter != null ? collectMusicItemAdapter.a() : null;
            String musicId2 = a2 != null ? a2.getMusicId() : null;
            if (musicModel != null) {
                str = musicModel.getMusicId();
            }
            if (!(!Intrinsics.areEqual((Object) musicId2, (Object) str))) {
                CollectMusicItemAdapter collectMusicItemAdapter2 = this.q;
                if (collectMusicItemAdapter2 != null) {
                    collectMusicItemAdapter2.c();
                }
                CollectMusicItemAdapter collectMusicItemAdapter3 = this.q;
                if (collectMusicItemAdapter3 != null) {
                    CollectMusicItemAdapter collectMusicItemAdapter4 = this.q;
                    if (collectMusicItemAdapter4 != null) {
                        i2 = collectMusicItemAdapter4.f68433e;
                    }
                    collectMusicItemAdapter3.f68434f = i2;
                }
                View view2 = this.j;
                if (view2 != null) {
                    view2.setEnabled(true);
                }
            }
        }
    }

    @NotNull
    public final Activity h() {
        return this.w;
    }

    public final boolean i() {
        if (this.D != null) {
            return true;
        }
        return false;
    }

    private final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f74806a, false, 87159, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74806a, false, 87159, new Class[0], Void.TYPE);
            return;
        }
        AIChooseMusicManager.b.a().g = false;
        AIChooseMusicManager.b.a().a((AIChooseMusicManager.c) new C0775a(this), this.E);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f74806a, false, 87145, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74806a, false, 87145, new Class[0], Void.TYPE);
            return;
        }
        MusicItemAdapter musicItemAdapter = this.f74810e;
        if (musicItemAdapter != null) {
            musicItemAdapter.g();
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f74806a, false, 87152, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74806a, false, 87152, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.shortvideo.aichoosemusic.c cVar = this.f74811f;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Nullable
    public final MusicModel g() {
        if (PatchProxy.isSupport(new Object[0], this, f74806a, false, 87175, new Class[0], MusicModel.class)) {
            return (MusicModel) PatchProxy.accessDispatch(new Object[0], this, f74806a, false, 87175, new Class[0], MusicModel.class);
        }
        MusicItemAdapter musicItemAdapter = this.f74810e;
        if (musicItemAdapter != null) {
            return musicItemAdapter.c();
        }
        return null;
    }

    @Nullable
    public final MusicModel k() {
        if (PatchProxy.isSupport(new Object[0], this, f74806a, false, 87164, new Class[0], MusicModel.class)) {
            return (MusicModel) PatchProxy.accessDispatch(new Object[0], this, f74806a, false, 87164, new Class[0], MusicModel.class);
        }
        MusicItemAdapter musicItemAdapter = this.f74810e;
        if (musicItemAdapter != null) {
            return musicItemAdapter.c();
        }
        return null;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f74806a, false, 87150, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74806a, false, 87150, new Class[0], Void.TYPE);
            return;
        }
        a.C0721a.a().f68440b = null;
        c.a.a().a((com.ss.android.ugc.aweme.tools.music.d.a) null);
        com.ss.android.ugc.aweme.shortvideo.aichoosemusic.c cVar = this.f74811f;
        if (cVar != null) {
            if (PatchProxy.isSupport(new Object[0], cVar, com.ss.android.ugc.aweme.shortvideo.aichoosemusic.c.f65571a, false, 75081, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cVar, com.ss.android.ugc.aweme.shortvideo.aichoosemusic.c.f65571a, false, 75081, new Class[0], Void.TYPE);
            } else {
                cVar.f65574d.removeCallbacksAndMessages(null);
            }
        }
        com.ss.android.ugc.aweme.music.a aVar = this.g;
        if (aVar != null) {
            aVar.d();
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f74806a, false, 87151, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74806a, false, 87151, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.shortvideo.aichoosemusic.c cVar = this.f74811f;
        if (cVar != null) {
            if (PatchProxy.isSupport(new Object[0], cVar, com.ss.android.ugc.aweme.shortvideo.aichoosemusic.c.f65571a, false, 75080, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cVar, com.ss.android.ugc.aweme.shortvideo.aichoosemusic.c.f65571a, false, 75080, new Class[0], Void.TYPE);
            } else {
                cVar.f65574d.removeCallbacksAndMessages(null);
                cVar.f65574d.postDelayed(null, cVar.f65575e);
            }
        }
    }

    public final void a() {
        RecyclerView.ViewHolder viewHolder;
        if (PatchProxy.isSupport(new Object[0], this, f74806a, false, 87144, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74806a, false, 87144, new Class[0], Void.TYPE);
            return;
        }
        MusicItemAdapter musicItemAdapter = this.f74810e;
        if (musicItemAdapter != null) {
            if (PatchProxy.isSupport(new Object[0], musicItemAdapter, MusicItemAdapter.f68379a, false, 77728, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], musicItemAdapter, MusicItemAdapter.f68379a, false, 77728, new Class[0], Void.TYPE);
            } else {
                RecyclerView recyclerView = musicItemAdapter.f68381c;
                if (recyclerView != null) {
                    viewHolder = recyclerView.findViewHolderForAdapterPosition(musicItemAdapter.f68380b);
                } else {
                    viewHolder = null;
                }
                if (viewHolder instanceof MusicItemViewHolder) {
                    ((MusicItemViewHolder) viewHolder).b();
                }
            }
        }
    }

    public final void j() {
        List<? extends MusicModel> list;
        boolean z2;
        RecyclerView.LayoutManager layoutManager;
        MusicModel musicModel;
        MusicModel musicModel2;
        String str;
        List<? extends MusicModel> list2;
        List<? extends MusicModel> list3;
        String str2;
        List<? extends MusicModel> list4;
        if (PatchProxy.isSupport(new Object[0], this, f74806a, false, 87162, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74806a, false, 87162, new Class[0], Void.TYPE);
            return;
        }
        IAVPublishService publishService = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
        Intrinsics.checkExpressionValueIsNotNull(publishService, "ServiceManager.get().get…ss.java).publishService()");
        com.ss.android.ugc.aweme.shortvideo.e curMusic = publishService.getCurMusic();
        String str3 = null;
        if (curMusic == null) {
            if (PatchProxy.isSupport(new Object[0], this, f74806a, false, 87161, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f74806a, false, 87161, new Class[0], Void.TYPE);
                return;
            }
            this.F.clear();
            List<MusicModel> list5 = this.F;
            com.ss.android.ugc.aweme.shortvideo.aichoosemusic.b bVar = this.n;
            if (bVar == null) {
                Intrinsics.throwNpe();
            }
            List<? extends MusicModel> list6 = bVar.f65568a;
            if (list6 == null) {
                Intrinsics.throwNpe();
            }
            list5.addAll(list6);
            List<? extends MusicModel> list7 = this.y;
            com.ss.android.ugc.aweme.shortvideo.aichoosemusic.b bVar2 = this.n;
            if (bVar2 != null) {
                list3 = bVar2.f65568a;
            } else {
                list3 = null;
            }
            if (!Intrinsics.areEqual((Object) list7, (Object) list3)) {
                MusicItemAdapter musicItemAdapter = this.f74810e;
                if (musicItemAdapter != null) {
                    Map<String, Boolean> map = musicItemAdapter.j;
                    if (map != null) {
                        map.clear();
                    }
                }
                MusicItemAdapter musicItemAdapter2 = this.f74810e;
                if (musicItemAdapter2 != null) {
                    Set<String> set = musicItemAdapter2.k;
                    if (set != null) {
                        set.clear();
                    }
                }
                com.ss.android.ugc.aweme.shortvideo.aichoosemusic.b bVar3 = this.n;
                if (bVar3 != null) {
                    list4 = bVar3.f65568a;
                } else {
                    list4 = null;
                }
                this.y = list4;
            }
            View view = this.j;
            if (view != null) {
                view.setEnabled(false);
            }
            c(false);
            View view2 = this.j;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            MusicItemAdapter musicItemAdapter3 = this.f74810e;
            if (musicItemAdapter3 != null) {
                musicItemAdapter3.b(-1, false);
            }
            MusicItemAdapter musicItemAdapter4 = this.f74810e;
            if (musicItemAdapter4 != null) {
                musicItemAdapter4.a(-1);
            }
            MusicItemAdapter musicItemAdapter5 = this.f74810e;
            if (musicItemAdapter5 != null) {
                musicItemAdapter5.b(-1);
            }
            MusicItemAdapter musicItemAdapter6 = this.f74810e;
            if (musicItemAdapter6 != null) {
                musicItemAdapter6.notifyDataSetChanged();
            }
            AVDmtTextView aVDmtTextView = this.l;
            if (aVDmtTextView != null) {
                aVDmtTextView.setSelected(false);
            }
            AVDmtTextView aVDmtTextView2 = this.l;
            if (aVDmtTextView2 != null) {
                AVDmtTextView aVDmtTextView3 = this.l;
                if (aVDmtTextView3 != null) {
                    Context context = aVDmtTextView3.getContext();
                    if (context != null) {
                        Resources resources = context.getResources();
                        if (resources != null) {
                            str2 = resources.getString(C0906R.string.is);
                            aVDmtTextView2.setText(str2);
                        }
                    }
                }
                str2 = null;
                aVDmtTextView2.setText(str2);
            }
            LrcView lrcView = this.k;
            if (lrcView != null) {
                lrcView.setDuration(0.0f);
            }
            LrcView lrcView2 = this.k;
            if (lrcView2 != null) {
                lrcView2.setStartTime(0);
            }
            LrcView lrcView3 = this.k;
            if (lrcView3 != null) {
                lrcView3.setPreviewStartTime(0.0f);
            }
            LrcView lrcView4 = this.k;
            if (lrcView4 != null) {
                lrcView4.setVisibility(8);
            }
            com.ss.android.ugc.aweme.shortvideo.aichoosemusic.c cVar = this.f74811f;
            if (cVar != null) {
                cVar.b();
            }
            com.ss.android.ugc.aweme.ao.a.i iVar = this.v;
            if (iVar != null) {
                iVar.a(null, null, false);
                return;
            }
            return;
        }
        this.F.clear();
        List<MusicModel> list8 = this.F;
        com.ss.android.ugc.aweme.shortvideo.aichoosemusic.b bVar4 = this.n;
        if (bVar4 == null) {
            Intrinsics.throwNpe();
        }
        List<? extends MusicModel> list9 = bVar4.f65568a;
        if (list9 == null) {
            Intrinsics.throwNpe();
        }
        list8.addAll(list9);
        List<? extends MusicModel> list10 = this.y;
        com.ss.android.ugc.aweme.shortvideo.aichoosemusic.b bVar5 = this.n;
        if (bVar5 != null) {
            list = bVar5.f65568a;
        } else {
            list = null;
        }
        if (!Intrinsics.areEqual((Object) list10, (Object) list)) {
            MusicItemAdapter musicItemAdapter7 = this.f74810e;
            if (musicItemAdapter7 != null) {
                Map<String, Boolean> map2 = musicItemAdapter7.j;
                if (map2 != null) {
                    map2.clear();
                }
            }
            MusicItemAdapter musicItemAdapter8 = this.f74810e;
            if (musicItemAdapter8 != null) {
                Set<String> set2 = musicItemAdapter8.k;
                if (set2 != null) {
                    set2.clear();
                }
            }
            com.ss.android.ugc.aweme.shortvideo.aichoosemusic.b bVar6 = this.n;
            if (bVar6 != null) {
                list2 = bVar6.f65568a;
            } else {
                list2 = null;
            }
            this.y = list2;
        }
        View view3 = this.j;
        if (view3 != null) {
            view3.setEnabled(true);
        }
        int size = this.F.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                String musicId = curMusic.getMusicId();
                MusicModel musicModel3 = this.F.get(i2);
                if (musicModel3 != null) {
                    str = musicModel3.getMusicId();
                } else {
                    str = null;
                }
                if (!Intrinsics.areEqual((Object) musicId, (Object) str)) {
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                } else {
                    if (i2 != 0) {
                        this.F.add(0, this.F.remove(i2));
                    }
                    z2 = true;
                }
            }
        }
        z2 = false;
        if (!z2) {
            if (PatchProxy.isSupport(new Object[]{curMusic}, this, f74806a, false, 87163, new Class[]{com.ss.android.ugc.aweme.shortvideo.e.class}, MusicModel.class)) {
                musicModel2 = (MusicModel) PatchProxy.accessDispatch(new Object[]{curMusic}, this, f74806a, false, 87163, new Class[]{com.ss.android.ugc.aweme.shortvideo.e.class}, MusicModel.class);
            } else {
                Intrinsics.checkParameterIsNotNull(curMusic, "avMusic");
                MusicModel musicModel4 = new MusicModel();
                musicModel4.setMusicId(curMusic.getMusicId());
                musicModel4.setId(curMusic.getId());
                musicModel4.setAlbum(curMusic.getAlbum());
                musicModel4.setName(curMusic.getMusicName());
                musicModel4.setAlbum(curMusic.getAlbum());
                if (curMusic.getCoverMedium() != null) {
                    UrlModel coverMedium = curMusic.getCoverMedium();
                    Intrinsics.checkExpressionValueIsNotNull(coverMedium, "avMusic.getCoverMedium()");
                    if (!CollectionUtils.isEmpty(coverMedium.getUrlList())) {
                        UrlModel coverMedium2 = curMusic.getCoverMedium();
                        Intrinsics.checkExpressionValueIsNotNull(coverMedium2, "avMusic.getCoverMedium()");
                        musicModel4.setPicPremium(coverMedium2.getUrlList().get(0));
                    }
                }
                if (curMusic.getCoverThumb() != null) {
                    UrlModel coverThumb = curMusic.getCoverThumb();
                    Intrinsics.checkExpressionValueIsNotNull(coverThumb, "avMusic.getCoverThumb()");
                    if (!CollectionUtils.isEmpty(coverThumb.getUrlList())) {
                        UrlModel coverMedium3 = curMusic.getCoverMedium();
                        Intrinsics.checkExpressionValueIsNotNull(coverMedium3, "avMusic.getCoverMedium()");
                        musicModel4.setPicSmall(coverMedium3.getUrlList().get(0));
                    }
                }
                musicModel4.setPath(curMusic.getPath());
                musicModel4.setSinger(curMusic.getSinger());
                if (curMusic.getMusicType() == MusicModel.MusicType.ONLINE.ordinal()) {
                    UrlModel playUrl = curMusic.getPlayUrl();
                    Intrinsics.checkExpressionValueIsNotNull(playUrl, "avMusic.getPlayUrl()");
                    musicModel4.setPath(playUrl.getUrlList().get(0));
                }
                musicModel4.setDuration(musicModel4.getDuration());
                if (curMusic.getMusicType() == MusicModel.MusicType.BAIDU.ordinal()) {
                    musicModel4.setMusicType(MusicModel.MusicType.BAIDU);
                }
                if (curMusic.getMusicType() == MusicModel.MusicType.LOCAL.ordinal()) {
                    musicModel4.setMusicType(MusicModel.MusicType.LOCAL);
                }
                if (curMusic.getMusicType() == MusicModel.MusicType.ONLINE.ordinal()) {
                    musicModel4.setMusicType(MusicModel.MusicType.ONLINE);
                }
                musicModel4.setOfflineDesc(curMusic.getOfflineDesc());
                musicModel4.setMusicStatus(curMusic.getMusicStatus());
                musicModel4.setStrongBeatUrl(curMusic.getStrongBeatUrl());
                musicModel4.setLrcUrl(curMusic.getLrcUrl());
                musicModel4.setLrcType(curMusic.getLrcType());
                musicModel4.setPreviewStartTime(curMusic.getPreviewStartTime());
                musicModel2 = musicModel4;
            }
            this.F.add(0, musicModel2);
            MusicItemAdapter musicItemAdapter9 = this.f74810e;
            if (musicItemAdapter9 != null) {
                if (PatchProxy.isSupport(new Object[]{musicModel2}, musicItemAdapter9, MusicItemAdapter.f68379a, false, 77731, new Class[]{MusicModel.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{musicModel2}, musicItemAdapter9, MusicItemAdapter.f68379a, false, 77731, new Class[]{MusicModel.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(musicModel2, "mMusicModel");
                    String musicId2 = musicModel2.getMusicId();
                    if (musicId2 != null) {
                        if (musicItemAdapter9.j.get(musicId2) == null || Intrinsics.areEqual((Object) musicItemAdapter9.j.get(musicId2), (Object) Boolean.FALSE)) {
                            musicItemAdapter9.j.put(musicId2, Boolean.TRUE);
                        }
                        musicItemAdapter9.k.add(musicId2);
                    }
                }
            }
            c(this.x.b());
            View view4 = this.j;
            if (view4 != null) {
                view4.setEnabled(true);
            }
        }
        MusicItemAdapter musicItemAdapter10 = this.f74810e;
        if (musicItemAdapter10 != null) {
            musicItemAdapter10.b(0);
        }
        MusicItemAdapter musicItemAdapter11 = this.f74810e;
        if (musicItemAdapter11 != null) {
            musicItemAdapter11.a(0);
        }
        MusicItemAdapter musicItemAdapter12 = this.f74810e;
        if (musicItemAdapter12 != null) {
            musicItemAdapter12.notifyDataSetChanged();
        }
        RecyclerView recyclerView = this.i;
        if (recyclerView != null) {
            layoutManager = recyclerView.getLayoutManager();
        } else {
            layoutManager = null;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(0, 0);
        }
        MusicItemAdapter musicItemAdapter13 = this.f74810e;
        if (musicItemAdapter13 != null) {
            musicModel = musicItemAdapter13.c();
        } else {
            musicModel = null;
        }
        if (!z2) {
            LrcView lrcView5 = this.k;
            if (lrcView5 != null) {
                lrcView5.setVisibility(8);
            }
            LrcView lrcView6 = this.k;
            if (lrcView6 != null) {
                lrcView6.setPreviewStartTime(0.0f);
            }
        }
        if (musicModel != null) {
            com.ss.android.ugc.aweme.tools.music.c.a.a().a(musicModel.getLrcUrl(), musicModel.getLrcType(), (a.C0780a) new k(this));
        }
        MusicItemAdapter musicItemAdapter14 = this.f74810e;
        if (musicItemAdapter14 != null) {
            musicItemAdapter14.g();
        }
        MusicModel musicModel5 = this.F.get(0);
        if (musicModel5 != null) {
            if (musicModel5.isMvThemeMusic()) {
                View view5 = this.j;
                if (view5 == null) {
                    Intrinsics.throwNpe();
                }
                view5.setAlpha(0.5f);
                View view6 = this.j;
                if (view6 == null) {
                    Intrinsics.throwNpe();
                }
                view6.setClickable(false);
                c(true);
            } else {
                View view7 = this.j;
                if (view7 == null) {
                    Intrinsics.throwNpe();
                }
                view7.setAlpha(1.0f);
                View view8 = this.j;
                if (view8 == null) {
                    Intrinsics.throwNpe();
                }
                view8.setClickable(true);
                c(this.x.b());
            }
        }
        if (musicModel != null) {
            AVDmtTextView aVDmtTextView4 = this.l;
            if (aVDmtTextView4 != null) {
                aVDmtTextView4.setSelected(true);
            }
            AVDmtTextView aVDmtTextView5 = this.l;
            if (aVDmtTextView5 != null) {
                AVDmtTextView aVDmtTextView6 = this.l;
                if (aVDmtTextView6 != null) {
                    Context context2 = aVDmtTextView6.getContext();
                    if (context2 != null) {
                        Resources resources2 = context2.getResources();
                        if (resources2 != null) {
                            str3 = resources2.getString(C0906R.string.iv, new Object[]{musicModel.getName()});
                        }
                    }
                }
                aVDmtTextView5.setText(str3);
            }
            com.ss.android.ugc.aweme.shortvideo.aichoosemusic.c cVar2 = this.f74811f;
            if (cVar2 != null) {
                cVar2.a();
            }
        }
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.ao.a.h hVar) {
        this.t = hVar;
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.ao.a.k kVar) {
        this.r = kVar;
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.ao.a.l lVar) {
        this.s = lVar;
    }

    public final void a(@Nullable m mVar) {
        this.f74807b = mVar;
    }

    public final void a(@NotNull com.ss.android.ugc.aweme.ao.a.i iVar) {
        com.ss.android.ugc.aweme.ao.a.i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{iVar2}, this, f74806a, false, 87143, new Class[]{com.ss.android.ugc.aweme.ao.a.i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar2}, this, f74806a, false, 87143, new Class[]{com.ss.android.ugc.aweme.ao.a.i.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(iVar2, "onMusicViewClickListener");
        this.v = iVar2;
    }

    @Nullable
    public final com.ss.android.ugc.aweme.shortvideo.e a(int i2) {
        MusicModel musicModel;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74806a, false, 87146, new Class[]{Integer.TYPE}, com.ss.android.ugc.aweme.shortvideo.e.class)) {
            return (com.ss.android.ugc.aweme.shortvideo.e) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74806a, false, 87146, new Class[]{Integer.TYPE}, com.ss.android.ugc.aweme.shortvideo.e.class);
        }
        com.ss.android.ugc.aweme.tools.music.f.b bVar = new com.ss.android.ugc.aweme.tools.music.f.b();
        CollectMusicItemAdapter collectMusicItemAdapter = this.q;
        if (collectMusicItemAdapter != null) {
            musicModel = collectMusicItemAdapter.a(i2);
        } else {
            musicModel = null;
        }
        return bVar.apply(musicModel);
    }

    @Nullable
    public final com.ss.android.ugc.aweme.shortvideo.e b(int i2) {
        MusicModel musicModel;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74806a, false, 87147, new Class[]{Integer.TYPE}, com.ss.android.ugc.aweme.shortvideo.e.class)) {
            return (com.ss.android.ugc.aweme.shortvideo.e) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74806a, false, 87147, new Class[]{Integer.TYPE}, com.ss.android.ugc.aweme.shortvideo.e.class);
        }
        com.ss.android.ugc.aweme.tools.music.f.b bVar = new com.ss.android.ugc.aweme.tools.music.f.b();
        com.ss.android.ugc.aweme.shortvideo.aichoosemusic.b bVar2 = this.n;
        if (bVar2 != null) {
            List<? extends MusicModel> list = bVar2.f65568a;
            if (list != null) {
                musicModel = (MusicModel) CollectionsKt.getOrNull(list, i2);
                return bVar.apply(musicModel);
            }
        }
        musicModel = null;
        return bVar.apply(musicModel);
    }

    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74806a, false, 87149, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74806a, false, 87149, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        LrcView lrcView = this.k;
        if (lrcView != null) {
            lrcView.setStartTime(i2);
        }
    }

    public final void onClick(@Nullable View view) {
        Integer num;
        if (PatchProxy.isSupport(new Object[]{view}, this, f74806a, false, 87174, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f74806a, false, 87174, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C0906R.id.b6l) {
            RecyclerView recyclerView = this.i;
            if (recyclerView != null) {
                recyclerView.setEnabled(false);
            }
            com.ss.android.ugc.aweme.ao.a.i iVar = this.v;
            if (iVar != null) {
                iVar.b();
            }
        }
    }

    public final String a(MusicModel musicModel) {
        String str;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{musicModel}, this, f74806a, false, 87172, new Class[]{MusicModel.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{musicModel}, this, f74806a, false, 87172, new Class[]{MusicModel.class}, String.class);
        }
        if (musicModel != null) {
            str = musicModel.getPath();
        } else {
            str = null;
        }
        CharSequence charSequence = str;
        if (!(charSequence == null || charSequence.length() == 0)) {
            z2 = false;
        }
        if (z2) {
            return null;
        }
        String a2 = com.ss.android.ugc.b.c.a().a(str);
        if (TextUtils.isEmpty(a2) || !com.ss.android.ugc.aweme.video.b.b(a2) || new File(a2).length() <= 0) {
            return null;
        }
        return a2;
    }

    public final void b(boolean z2) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74806a, false, 87169, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f74806a, false, 87169, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ViewGroup viewGroup = this.A;
        int i3 = 4;
        if (viewGroup != null) {
            if (z2) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            viewGroup.setVisibility(i2);
        }
        ViewGroup viewGroup2 = this.z;
        if (viewGroup2 != null) {
            if (!z2) {
                i3 = 0;
            }
            viewGroup2.setVisibility(i3);
        }
        if (!z2) {
            a.C0721a.a().b();
            this.m = 1;
            return;
        }
        this.m = 0;
    }

    public final void c(boolean z2) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74806a, false, 87173, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f74806a, false, 87173, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        View view = this.j;
        if (view != null) {
            if (!z2) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.shortvideo.aichoosemusic.b bVar, @NotNull MusicModel musicModel) {
        if (PatchProxy.isSupport(new Object[]{bVar, musicModel}, this, f74806a, false, 87160, new Class[]{com.ss.android.ugc.aweme.shortvideo.aichoosemusic.b.class, MusicModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, musicModel}, this, f74806a, false, 87160, new Class[]{com.ss.android.ugc.aweme.shortvideo.aichoosemusic.b.class, MusicModel.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(musicModel, AdvanceSetting.NETWORK_TYPE);
        List<? extends MusicModel> mutableListOf = CollectionsKt.mutableListOf(musicModel);
        if (!(bVar == null || this.n == null)) {
            if (!com.bytedance.framwork.core.c.a.a(bVar.f65568a)) {
                List<? extends MusicModel> list = bVar.f65568a;
                if (list == null) {
                    Intrinsics.throwNpe();
                }
                mutableListOf.addAll(list);
            }
            com.ss.android.ugc.aweme.shortvideo.aichoosemusic.b bVar2 = this.n;
            if (bVar2 == null) {
                Intrinsics.throwNpe();
            }
            bVar2.f65568a = mutableListOf;
        }
        RecyclerView recyclerView = this.i;
        if (recyclerView != null) {
            recyclerView.post(new l(this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.NotNull android.support.v7.app.AppCompatActivity r12, @org.jetbrains.annotations.Nullable android.widget.FrameLayout r13) {
        /*
            r11 = this;
            r8 = 2
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r12
            r10 = 1
            r0[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f74806a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.support.v7.app.AppCompatActivity> r1 = android.support.v7.app.AppCompatActivity.class
            r5[r9] = r1
            java.lang.Class<android.widget.FrameLayout> r1 = android.widget.FrameLayout.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 87153(0x15471, float:1.22127E-40)
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003f
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r12
            r0[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f74806a
            r3 = 0
            r4 = 87153(0x15471, float:1.22127E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.support.v7.app.AppCompatActivity> r1 = android.support.v7.app.AppCompatActivity.class
            r5[r9] = r1
            java.lang.Class<android.widget.FrameLayout> r1 = android.widget.FrameLayout.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003f:
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r12, r0)
            android.view.View r0 = r11.D
            if (r0 != 0) goto L_0x0438
            r0 = r12
            android.content.Context r0 = (android.content.Context) r0
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = com.ss.android.ugc.aweme.tools.music.b.b.a()
            if (r1 != 0) goto L_0x0059
            r1 = 2131689714(0x7f0f00f2, float:1.9008451E38)
            goto L_0x005c
        L_0x0059:
            r1 = 2131689715(0x7f0f00f3, float:1.9008453E38)
        L_0x005c:
            r2 = r13
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r0 = r0.inflate(r1, r2, r10)
            r11.D = r0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f74806a
            r3 = 0
            r4 = 87154(0x15472, float:1.22129E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r7 = 0
            if (r0 == 0) goto L_0x008b
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f74806a
            r3 = 0
            r4 = 87154(0x15472, float:1.22129E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x03b9
        L_0x008b:
            int r0 = com.ss.android.ugc.aweme.tools.music.b.b.a()
            if (r0 != 0) goto L_0x00c5
            android.view.View r0 = r11.D
            if (r0 != 0) goto L_0x0098
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0098:
            r1 = 2131168278(0x7f070c16, float:1.7950853E38)
            android.view.View r0 = r0.findViewById(r1)
            r11.C = r0
            android.view.View r0 = r11.D
            if (r0 != 0) goto L_0x00a8
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00a8:
            r1 = 2131171136(0x7f071740, float:1.795665E38)
            android.view.View r0 = r0.findViewById(r1)
            com.ss.android.ugc.aweme.themechange.base.AVDmtTextView r0 = (com.ss.android.ugc.aweme.themechange.base.AVDmtTextView) r0
            r11.l = r0
            android.view.View r0 = r11.D
            if (r0 != 0) goto L_0x00ba
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00ba:
            r1 = 2131171131(0x7f07173b, float:1.795664E38)
            android.view.View r0 = r0.findViewById(r1)
            com.ss.android.ugc.aweme.shortvideo.lrc.LrcView r0 = (com.ss.android.ugc.aweme.shortvideo.lrc.LrcView) r0
            r11.k = r0
        L_0x00c5:
            android.view.View r0 = r11.D
            if (r0 != 0) goto L_0x00cc
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00cc:
            r1 = 2131170252(0x7f0713cc, float:1.7954857E38)
            android.view.View r0 = r0.findViewById(r1)
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r0 = (com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout) r0
            r11.f74808c = r0
            android.view.View r0 = r11.D
            if (r0 != 0) goto L_0x00de
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00de:
            r1 = 2131167789(0x7f070a2d, float:1.7949862E38)
            android.view.View r0 = r0.findViewById(r1)
            r11.j = r0
            android.view.View r0 = r11.D
            if (r0 != 0) goto L_0x00ee
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00ee:
            r1 = 2131169652(0x7f071174, float:1.795364E38)
            android.view.View r0 = r0.findViewById(r1)
            android.support.v7.widget.RecyclerView r0 = (android.support.v7.widget.RecyclerView) r0
            r11.i = r0
            android.view.View r0 = r11.D
            if (r0 != 0) goto L_0x0100
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0100:
            r1 = 2131170424(0x7f071478, float:1.7955206E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r11.B = r0
            android.view.View r0 = r11.D
            if (r0 != 0) goto L_0x0112
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0112:
            r1 = 2131169363(0x7f071053, float:1.7953054E38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r11.A = r0
            android.view.View r0 = r11.D
            if (r0 != 0) goto L_0x0124
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0124:
            r1 = 2131165965(0x7f07030d, float:1.7946162E38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r11.z = r0
            android.view.View r0 = r11.D
            if (r0 != 0) goto L_0x0136
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0136:
            r1 = 2131169650(0x7f071172, float:1.7953636E38)
            android.view.View r0 = r0.findViewById(r1)
            android.support.v7.widget.RecyclerView r0 = (android.support.v7.widget.RecyclerView) r0
            r11.h = r0
            android.view.View r0 = r11.j
            if (r0 != 0) goto L_0x0148
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0148:
            r1 = r11
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f74806a
            r3 = 0
            r4 = 87155(0x15473, float:1.2213E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0173
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f74806a
            r3 = 0
            r4 = 87155(0x15473, float:1.2213E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x02f3
        L_0x0173:
            int r0 = com.ss.android.ugc.aweme.tools.music.b.b.a()
            r1 = 8
            if (r0 != 0) goto L_0x0192
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r0 = r11.f74808c
            if (r0 == 0) goto L_0x0182
            r0.setVisibility(r1)
        L_0x0182:
            android.view.View r0 = r11.C
            if (r0 == 0) goto L_0x0189
            r0.setVisibility(r9)
        L_0x0189:
            android.widget.FrameLayout r0 = r11.B
            if (r0 == 0) goto L_0x02f3
            r0.setVisibility(r1)
            goto L_0x02f3
        L_0x0192:
            int r0 = com.ss.android.ugc.aweme.tools.music.b.b.a()
            if (r0 != r8) goto L_0x01b5
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVServiceProxy> r2 = com.ss.android.ugc.aweme.services.IAVServiceProxy.class
            java.lang.Object r0 = r0.getService(r2)
            java.lang.String r2 = "ServiceManager.get().get…ServiceProxy::class.java)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            com.ss.android.ugc.aweme.services.IAVServiceProxy r0 = (com.ss.android.ugc.aweme.services.IAVServiceProxy) r0
            com.ss.android.ugc.aweme.account.f r0 = r0.getAccountService()
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x01b5
            r0 = 1
            goto L_0x01b6
        L_0x01b5:
            r0 = 0
        L_0x01b6:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r2 = r11.f74808c
            if (r2 == 0) goto L_0x01bd
            r2.setVisibility(r1)
        L_0x01bd:
            android.view.View r2 = r11.C
            if (r2 == 0) goto L_0x01c4
            r2.setVisibility(r1)
        L_0x01c4:
            android.widget.FrameLayout r2 = r11.B
            if (r2 == 0) goto L_0x01cb
            r2.setVisibility(r9)
        L_0x01cb:
            r2 = 2131559650(0x7f0d04e2, float:1.874465E38)
            if (r0 != 0) goto L_0x0222
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r0 = r11.f74808c
            if (r0 == 0) goto L_0x01d7
            r0.setVisibility(r1)
        L_0x01d7:
            android.widget.FrameLayout r0 = r11.B
            if (r0 == 0) goto L_0x01de
            r0.setVisibility(r9)
        L_0x01de:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout$a r0 = com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.w
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r1 = r11.f74808c
            if (r1 == 0) goto L_0x01e9
            android.content.Context r1 = r1.getContext()
            goto L_0x01ea
        L_0x01e9:
            r1 = r7
        L_0x01ea:
            int r3 = com.ss.android.ugc.aweme.tools.music.b.b.a()
            if (r3 != 0) goto L_0x01f2
            r3 = 1
            goto L_0x01f3
        L_0x01f2:
            r3 = 0
        L_0x01f3:
            com.ss.android.ugc.aweme.themechange.base.a r0 = r0.a(r1, r3)
            if (r0 == 0) goto L_0x0212
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r1 = r11.f74808c
            if (r1 == 0) goto L_0x020e
            android.content.Context r1 = r1.getContext()
            if (r1 == 0) goto L_0x020e
            android.content.res.Resources r1 = r1.getResources()
            if (r1 == 0) goto L_0x020e
            java.lang.String r1 = r1.getString(r2)
            goto L_0x020f
        L_0x020e:
            r1 = r7
        L_0x020f:
            r0.setText((java.lang.String) r1)
        L_0x0212:
            if (r0 == 0) goto L_0x0217
            r0.a(r10)
        L_0x0217:
            android.widget.FrameLayout r1 = r11.B
            if (r1 == 0) goto L_0x02f3
            android.view.View r0 = (android.view.View) r0
            r1.addView(r0)
            goto L_0x02f3
        L_0x0222:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r0 = r11.f74808c
            if (r0 == 0) goto L_0x0229
            r0.setVisibility(r9)
        L_0x0229:
            android.widget.FrameLayout r0 = r11.B
            if (r0 == 0) goto L_0x0230
            r0.setVisibility(r1)
        L_0x0230:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r0 = r11.f74808c
            if (r0 == 0) goto L_0x02f3
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r1 = r11.f74808c
            if (r1 == 0) goto L_0x023b
            r1.setMaxTabModeForCount(r8)
        L_0x023b:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout$a r1 = com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.w
            android.content.Context r3 = r0.getContext()
            int r4 = com.ss.android.ugc.aweme.tools.music.b.b.a()
            if (r4 != 0) goto L_0x0249
            r4 = 1
            goto L_0x024a
        L_0x0249:
            r4 = 0
        L_0x024a:
            com.ss.android.ugc.aweme.themechange.base.a r1 = r1.a(r3, r4)
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$e r3 = r0.a()
            r4 = r1
            android.view.View r4 = (android.view.View) r4
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$e r3 = r3.a((android.view.View) r4)
            r0.a((com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.e) r3)
            com.ss.android.ugc.aweme.tools.music.b.a$f r3 = new com.ss.android.ugc.aweme.tools.music.b.a$f
            r3.<init>(r11)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r1.setOnClickListener(r3)
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$e r1 = r0.a((int) r9)
            if (r1 == 0) goto L_0x026f
            android.view.View r1 = r1.g
            goto L_0x0270
        L_0x026f:
            r1 = r7
        L_0x0270:
            com.ss.android.ugc.aweme.themechange.base.a r1 = (com.ss.android.ugc.aweme.themechange.base.a) r1
            if (r1 == 0) goto L_0x0288
            android.content.Context r3 = r0.getContext()
            java.lang.String r4 = "context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r2 = r3.getString(r2)
            r1.setText((java.lang.String) r2)
        L_0x0288:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout$a r1 = com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.w
            android.content.Context r2 = r0.getContext()
            int r3 = com.ss.android.ugc.aweme.tools.music.b.b.a()
            if (r3 != 0) goto L_0x0296
            r3 = 1
            goto L_0x0297
        L_0x0296:
            r3 = 0
        L_0x0297:
            com.ss.android.ugc.aweme.themechange.base.a r1 = r1.a(r2, r3)
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$e r2 = r0.a()
            r3 = r1
            android.view.View r3 = (android.view.View) r3
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$e r2 = r2.a((android.view.View) r3)
            r0.a((com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.e) r2)
            com.ss.android.ugc.aweme.tools.music.b.a$g r2 = new com.ss.android.ugc.aweme.tools.music.b.a$g
            r2.<init>(r11)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$e r1 = r0.a((int) r10)
            if (r1 == 0) goto L_0x02bc
            android.view.View r1 = r1.g
            goto L_0x02bd
        L_0x02bc:
            r1 = r7
        L_0x02bd:
            com.ss.android.ugc.aweme.themechange.base.a r1 = (com.ss.android.ugc.aweme.themechange.base.a) r1
            if (r1 == 0) goto L_0x02d8
            android.content.Context r2 = r0.getContext()
            java.lang.String r3 = "context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131559649(0x7f0d04e1, float:1.8744648E38)
            java.lang.String r2 = r2.getString(r3)
            r1.setText((java.lang.String) r2)
        L_0x02d8:
            com.ss.android.ugc.aweme.tools.music.b.a$h r1 = new com.ss.android.ugc.aweme.tools.music.b.a$h
            r1.<init>(r11)
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$b r1 = (com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.b) r1
            r0.a(r1)
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r0 = r11.f74808c
            if (r0 == 0) goto L_0x02f3
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r1 = r11.f74808c
            if (r1 == 0) goto L_0x02ef
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$e r1 = r1.a((int) r9)
            goto L_0x02f0
        L_0x02ef:
            r1 = r7
        L_0x02f0:
            r0.b((com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.e) r1)
        L_0x02f3:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f74806a
            r3 = 0
            r4 = 87157(0x15475, float:1.22133E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0317
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f74806a
            r3 = 0
            r4 = 87157(0x15475, float:1.22133E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x032f
        L_0x0317:
            android.support.v7.widget.RecyclerView r0 = r11.i
            if (r0 == 0) goto L_0x032f
            android.support.v7.widget.LinearLayoutManager r1 = new android.support.v7.widget.LinearLayoutManager
            android.support.v7.widget.RecyclerView r2 = r11.i
            if (r2 == 0) goto L_0x0326
            android.content.Context r2 = r2.getContext()
            goto L_0x0327
        L_0x0326:
            r2 = r7
        L_0x0327:
            r1.<init>(r2, r9, r9)
            android.support.v7.widget.RecyclerView$LayoutManager r1 = (android.support.v7.widget.RecyclerView.LayoutManager) r1
            r0.setLayoutManager(r1)
        L_0x032f:
            int r0 = com.ss.android.ugc.aweme.tools.music.b.b.a()
            if (r0 != r8) goto L_0x03b9
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f74806a
            r3 = 0
            r4 = 87156(0x15474, float:1.22132E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0359
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f74806a
            r3 = 0
            r4 = 87156(0x15474, float:1.22132E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x03b9
        L_0x0359:
            android.view.View r0 = r11.D
            if (r0 != 0) goto L_0x0360
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0360:
            r1 = 2131166479(0x7f07050f, float:1.7947205E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r11.p = r0
            com.ss.android.ugc.aweme.views.WrapLinearLayoutManager r0 = new com.ss.android.ugc.aweme.views.WrapLinearLayoutManager
            android.support.v7.app.AppCompatActivity r1 = r11.w
            android.content.Context r1 = (android.content.Context) r1
            r0.<init>(r1, r9, r9)
            android.support.v7.widget.RecyclerView r1 = r11.h
            if (r1 == 0) goto L_0x037d
            android.support.v7.widget.RecyclerView$LayoutManager r0 = (android.support.v7.widget.RecyclerView.LayoutManager) r0
            r1.setLayoutManager(r0)
        L_0x037d:
            com.ss.android.ugc.aweme.shortvideo.music.collect.CollectMusicItemAdapter r0 = new com.ss.android.ugc.aweme.shortvideo.music.collect.CollectMusicItemAdapter
            com.ss.android.ugc.aweme.tools.music.b.a$b r1 = new com.ss.android.ugc.aweme.tools.music.b.a$b
            r1.<init>(r11)
            com.ss.android.ugc.aweme.ao.a.k r1 = (com.ss.android.ugc.aweme.ao.a.k) r1
            r0.<init>(r1)
            r11.q = r0
            com.ss.android.ugc.aweme.shortvideo.music.collect.CollectMusicItemAdapter r0 = r11.q
            if (r0 == 0) goto L_0x0393
            com.ss.android.ugc.aweme.ao.a.l r1 = r11.s
            r0.m = r1
        L_0x0393:
            com.ss.android.ugc.aweme.shortvideo.music.collect.CollectMusicItemAdapter r0 = r11.q
            if (r0 == 0) goto L_0x03a1
            com.ss.android.ugc.aweme.tools.music.b.a$c r1 = new com.ss.android.ugc.aweme.tools.music.b.a$c
            r1.<init>(r11)
            com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter$a r1 = (com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.a) r1
            r0.setLoadMoreListener(r1)
        L_0x03a1:
            android.support.v7.widget.RecyclerView r0 = r11.h
            if (r0 == 0) goto L_0x03ac
            com.ss.android.ugc.aweme.shortvideo.music.collect.CollectMusicItemAdapter r1 = r11.q
            android.support.v7.widget.RecyclerView$Adapter r1 = (android.support.v7.widget.RecyclerView.Adapter) r1
            r0.setAdapter(r1)
        L_0x03ac:
            com.ss.android.ugc.aweme.shortvideo.music.collect.a r0 = com.ss.android.ugc.aweme.shortvideo.music.collect.a.C0721a.a()
            com.ss.android.ugc.aweme.tools.music.b.a$d r1 = new com.ss.android.ugc.aweme.tools.music.b.a$d
            r1.<init>(r11)
            com.ss.android.ugc.aweme.shortvideo.music.collect.a$b r1 = (com.ss.android.ugc.aweme.shortvideo.music.collect.a.b) r1
            r0.f68440b = r1
        L_0x03b9:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f74806a
            r3 = 0
            r4 = 87158(0x15476, float:1.22134E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x03dd
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f74806a
            r3 = 0
            r4 = 87158(0x15476, float:1.22134E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x043d
        L_0x03dd:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IMainService> r1 = com.ss.android.ugc.aweme.services.IMainService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.services.IMainService r0 = (com.ss.android.ugc.aweme.services.IMainService) r0
            if (r0 == 0) goto L_0x03f8
            com.ss.android.ugc.aweme.services.music.IMusicService r0 = r0.musicService()
            if (r0 == 0) goto L_0x03f8
            r1 = r11
            com.ss.android.ugc.aweme.music.ui.c r1 = (com.ss.android.ugc.aweme.music.ui.c) r1
            com.ss.android.ugc.aweme.music.a r7 = r0.provideMusicDownloadPlayHelper(r1)
        L_0x03f8:
            r11.g = r7
            com.ss.android.ugc.aweme.shortvideo.aichoosemusic.c r0 = new com.ss.android.ugc.aweme.shortvideo.aichoosemusic.c
            r0.<init>()
            r11.f74811f = r0
            com.ss.android.ugc.aweme.shortvideo.aichoosemusic.c r0 = r11.f74811f
            if (r0 == 0) goto L_0x0409
            com.ss.android.vesdk.p r1 = r11.G
            r0.f65572b = r1
        L_0x0409:
            com.ss.android.ugc.aweme.shortvideo.aichoosemusic.c r0 = r11.f74811f
            if (r0 == 0) goto L_0x0411
            r1 = 10
            r0.f65575e = r1
        L_0x0411:
            com.ss.android.ugc.aweme.shortvideo.music.MusicItemAdapter r0 = new com.ss.android.ugc.aweme.shortvideo.music.MusicItemAdapter
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r1 = r11.F
            com.ss.android.ugc.aweme.tools.music.b.a$e r2 = new com.ss.android.ugc.aweme.tools.music.b.a$e
            r2.<init>(r11)
            com.ss.android.ugc.aweme.ao.a.k r2 = (com.ss.android.ugc.aweme.ao.a.k) r2
            r0.<init>(r1, r2)
            r11.f74810e = r0
            com.ss.android.ugc.aweme.shortvideo.music.MusicItemAdapter r0 = r11.f74810e
            if (r0 == 0) goto L_0x0429
            com.ss.android.ugc.aweme.ao.a.l r1 = r11.s
            r0.f68382d = r1
        L_0x0429:
            android.support.v7.widget.RecyclerView r0 = r11.i
            if (r0 == 0) goto L_0x0434
            com.ss.android.ugc.aweme.shortvideo.music.MusicItemAdapter r1 = r11.f74810e
            android.support.v7.widget.RecyclerView$Adapter r1 = (android.support.v7.widget.RecyclerView.Adapter) r1
            r0.setAdapter(r1)
        L_0x0434:
            r11.l()
            return
        L_0x0438:
            r11.E = r10
            r11.l()
        L_0x043d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.music.b.a.a(android.support.v7.app.AppCompatActivity, android.widget.FrameLayout):void");
    }

    public a(@NotNull AppCompatActivity appCompatActivity, @Nullable p pVar, @NotNull com.ss.android.ugc.aweme.ao.a.a aVar) {
        Intrinsics.checkParameterIsNotNull(appCompatActivity, "mActivity");
        Intrinsics.checkParameterIsNotNull(aVar, "aiMusicConfig");
        this.w = appCompatActivity;
        this.G = pVar;
        this.x = aVar;
    }
}
