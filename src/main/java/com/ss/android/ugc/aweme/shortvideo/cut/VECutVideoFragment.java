package com.ss.android.ugc.aweme.shortvideo.cut;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.LayoutRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.w;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.cf;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VEVideoEditView;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.ej;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.aweme.shortvideo.record.n;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.themechange.base.AVDmtAutoRTLImageView;
import com.ss.android.ugc.aweme.tools.am;
import com.ss.android.ugc.aweme.utils.ax;
import com.ss.android.ugc.aweme.utils.bc;
import com.ss.android.vesdk.p;
import com.tt.appbrandimpl.PublishExtra;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000 \u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0001B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010d\u001a\u00020eH\u0016J\b\u0010f\u001a\u00020gH\u0014J\b\u0010h\u001a\u00020gH\u0015J\u0006\u0010i\u001a\u00020gJ\u0006\u0010j\u001a\u00020gJ\u0016\u0010k\u001a\u00020g2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020g0mH\u0014J\b\u0010\u0019\u001a\u00020\u000bH\u0016J\b\u0010n\u001a\u00020\u000bH'J\u0006\u0010o\u001a\u00020gJ\b\u0010p\u001a\u00020gH\u0002J\b\u0010q\u001a\u00020gH\u0002J\b\u0010r\u001a\u00020gH\u0002J\b\u0010s\u001a\u00020tH\u0016J\b\u0010u\u001a\u00020\tH\u0016J\u0012\u0010v\u001a\u00020g2\b\u0010w\u001a\u0004\u0018\u00010eH\u0016J\u0012\u0010x\u001a\u00020g2\b\u0010y\u001a\u0004\u0018\u00010zH\u0016J\u0012\u0010{\u001a\u00020g2\b\u0010|\u001a\u0004\u0018\u00010}H\u0016J'\u0010~\u001a\u00020z2\u0007\u0010\u001a\u00030\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\b\u0010|\u001a\u0004\u0018\u00010}H\u0016J\t\u0010\u0001\u001a\u00020gH\u0016J\t\u0010\u0001\u001a\u00020gH\u0016J\t\u0010\u0001\u001a\u00020gH\u0016J\u0012\u0010\u0001\u001a\u00020g2\u0007\u0010\u0001\u001a\u00020!H\u0002J\u0012\u0010\u0001\u001a\u00020g2\u0007\u0010\u0001\u001a\u00020}H\u0016J\u001c\u0010\u0001\u001a\u00020g2\u0007\u0010\u0001\u001a\u00020z2\b\u0010|\u001a\u0004\u0018\u00010}H\u0016J\u0016\u0010\u0001\u001a\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0001H\u0016J\u0012\u0010\u0001\u001a\u00020g2\u0007\u0010\u0001\u001a\u00020!H\u0014J\u0010\u0010\u0001\u001a\u00020g2\u0007\u0010\u0001\u001a\u00020zJ\u0012\u0010\u0001\u001a\u00020g2\u0007\u0010\u0001\u001a\u00020!H\u0014J\t\u0010\u0001\u001a\u00020gH\u0004J\u001f\u0010\u0001\u001a\u00020g2\t\b\u0001\u0010\u0001\u001a\u00020\u000b2\t\b\u0001\u0010\u0001\u001a\u00020\u000bH&J\t\u0010\u0001\u001a\u00020gH\u0004J\t\u0010\u0001\u001a\u00020gH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u0014\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\"\"\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020!8BX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\"R\u000e\u0010&\u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u00020)X.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020/X.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0012\u00104\u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0004\n\u0002\u00105R\u001e\u00106\u001a\u0012\u0012\u0004\u0012\u00020807j\b\u0012\u0004\u0012\u000208`9X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u000bXD¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u0004\u0018\u00010@X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010B\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\r\"\u0004\bD\u0010\u000fR\u001b\u0010E\u001a\u00020F8DX\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bG\u0010HR\u001b\u0010K\u001a\u00020L8DX\u0002¢\u0006\f\n\u0004\bO\u0010J\u001a\u0004\bM\u0010NR\u0010\u0010P\u001a\u0004\u0018\u00010QX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010R\u001a\u00020SX\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u001a\u0010V\u001a\u00020WX.¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001a\u0010\\\u001a\u00020]X.¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0010\u0010b\u001a\u0004\u0018\u00010cX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/VECutVideoFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/ss/android/ugc/aweme/shortvideo/cut/VECutVideoViewProvider;", "Lcom/ss/android/ugc/aweme/shortvideo/cut/IVECutVideoCommonView;", "Landroid/view/View$OnClickListener;", "()V", "challenge", "Lcom/ss/android/ugc/aweme/shortvideo/AVChallenge;", "clickNextTime", "", "currentEditIndex", "", "getCurrentEditIndex", "()I", "setCurrentEditIndex", "(I)V", "currentEditOriginIndex", "getCurrentEditOriginIndex", "setCurrentEditOriginIndex", "cutMultiVideoViewModel", "Lcom/ss/android/ugc/aweme/shortvideo/cut/CutMultiVideoViewModel;", "getCutMultiVideoViewModel", "()Lcom/ss/android/ugc/aweme/shortvideo/cut/CutMultiVideoViewModel;", "setCutMultiVideoViewModel", "(Lcom/ss/android/ugc/aweme/shortvideo/cut/CutMultiVideoViewModel;)V", "editState", "getEditState", "setEditState", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "isChangeSpeedEnable", "", "()Z", "setChangeSpeedEnable", "(Z)V", "isFromMusicDetail", "isFromOtherPlatform", "isFromStory", "layoutBottom", "Landroid/widget/LinearLayout;", "getLayoutBottom", "()Landroid/widget/LinearLayout;", "setLayoutBottom", "(Landroid/widget/LinearLayout;)V", "layoutTop", "Landroid/widget/RelativeLayout;", "getLayoutTop", "()Landroid/widget/RelativeLayout;", "setLayoutTop", "(Landroid/widget/RelativeLayout;)V", "mBackToMain", "Ljava/lang/Boolean;", "mVideoInfo", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/shortvideo/ImportVideoInfo;", "Lkotlin/collections/ArrayList;", "maxEncodeDuration", "microActivityClass", "Ljava/io/Serializable;", "microAppId", "", "microAppModel", "Lcom/ss/android/ugc/aweme/shortvideo/edit/MicroAppModel;", "minEncodeDuration", "naviBarHeight", "getNaviBarHeight", "setNaviBarHeight", "presenter", "Lcom/ss/android/ugc/aweme/shortvideo/cut/VECutVideoPresenter;", "getPresenter", "()Lcom/ss/android/ugc/aweme/shortvideo/cut/VECutVideoPresenter;", "presenter$delegate", "Lkotlin/Lazy;", "speedModule", "Lcom/ss/android/ugc/aweme/shortvideo/record/RecordSpeedModule;", "getSpeedModule", "()Lcom/ss/android/ugc/aweme/shortvideo/record/RecordSpeedModule;", "speedModule$delegate", "startIntent", "Landroid/content/Intent;", "updateProgressTask", "Ljava/lang/Runnable;", "getUpdateProgressTask", "()Ljava/lang/Runnable;", "veVideoCutterViewModel", "Lcom/ss/android/ugc/aweme/shortvideo/cut/viewmodel/VEVideoCutterViewModel;", "getVeVideoCutterViewModel", "()Lcom/ss/android/ugc/aweme/shortvideo/cut/viewmodel/VEVideoCutterViewModel;", "setVeVideoCutterViewModel", "(Lcom/ss/android/ugc/aweme/shortvideo/cut/viewmodel/VEVideoCutterViewModel;)V", "videoEditViewModel", "Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditViewModel;", "getVideoEditViewModel", "()Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditViewModel;", "setVideoEditViewModel", "(Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditViewModel;)V", "workspace", "Lcom/ss/android/ugc/aweme/shortvideo/WorkSpace/Workspace;", "activityContext", "Landroid/content/Context;", "addClickListener", "", "addObservers", "checkEditAndQuit", "compile", "doRealQuit", "quitInvoker", "Lkotlin/Function0;", "getLayoutRes", "goMicroApp", "initData", "initVideoEditView", "initVideoInfo", "lifeCycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "maxDuration", "onAttach", "context", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onFirstFrameRender", "onInitVEEditorFailed", "onResultFinish", "isFastImport", "onSaveInstanceState", "outState", "onViewCreated", "view", "playBoundary", "Landroid/support/v4/util/Pair;", "relayoutBottomLayout", "b", "rotate", "setTopMargin", "updateLayout", "updateNextBtnStyle", "backgroundDrawable", "textColor", "updateTimeText", "updateVideoEditViewArgument", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class VECutVideoFragment extends Fragment implements View.OnClickListener, ag, am {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66193a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f66194b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(VECutVideoFragment.class), "presenter", "getPresenter()Lcom/ss/android/ugc/aweme/shortvideo/cut/VECutVideoPresenter;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(VECutVideoFragment.class), "speedModule", "getSpeedModule()Lcom/ss/android/ugc/aweme/shortvideo/record/RecordSpeedModule;"))};
    public static final a q = new a((byte) 0);
    private com.ss.android.ugc.aweme.shortvideo.a.d A;
    @NotNull
    private final Lazy B = LazyKt.lazy(new r(this));
    @NotNull
    private final Lazy C = LazyKt.lazy(new u(this));
    private HashMap D;

    /* renamed from: c  reason: collision with root package name */
    public int f66195c;

    /* renamed from: d  reason: collision with root package name */
    public int f66196d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f66197e = true;

    /* renamed from: f  reason: collision with root package name */
    Serializable f66198f;
    public int g;
    @NotNull
    protected CutMultiVideoViewModel h;
    @NotNull
    protected VideoEditViewModel i;
    @NotNull
    protected VEVideoCutterViewModel j;
    public final ArrayList<cf> k = new ArrayList<>();
    @NotNull
    public final Handler l = new Handler();
    @NotNull
    public final Runnable m = new v(this);
    @NotNull
    protected RelativeLayout n;
    @NotNull
    protected LinearLayout o;
    public long p;
    private Intent r;
    private boolean s;
    private long t = ff.a();
    private final int u = 3600000;
    private com.ss.android.ugc.aweme.shortvideo.c v;
    private boolean w;
    private com.ss.android.ugc.aweme.shortvideo.edit.q x;
    private String y;
    private Boolean z = Boolean.FALSE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/VECutVideoFragment$Companion;", "", "()V", "EXTRA_INTENT_DATA", "", "EXTRA_IS_MULTI_MODE", "EXTRA_MULTI_VIDEO_PATH_LIST", "EXTRA_SINGLE_VIDEO_PATH", "newInstance", "Lcom/ss/android/ugc/aweme/shortvideo/cut/VECutVideoFragment;", "args", "Landroid/os/Bundle;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66199a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "operation", "Lcom/ss/android/ugc/aweme/shortvideo/cut/viewmodel/VEPreviewAction;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class b<T> implements Observer<com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66200a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VECutVideoFragment f66201b;

        b(VECutVideoFragment vECutVideoFragment) {
            this.f66201b = vECutVideoFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num;
            com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a aVar = (com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a) obj;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f66200a, false, 75595, new Class[]{com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f66200a, false, 75595, new Class[]{com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a.class}, Void.TYPE);
                return;
            }
            if (aVar != null) {
                num = Integer.valueOf(aVar.f66604c);
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 1) {
                if (this.f66201b.j().b()) {
                    this.f66201b.b().setVisibility(8);
                    this.f66201b.l.post(this.f66201b.m);
                }
            } else if (num != null && num.intValue() == 2) {
                if (aVar.f66605d) {
                    this.f66201b.b().setVisibility(0);
                }
                this.f66201b.l.removeCallbacks(this.f66201b.m);
            } else if (num != null && num.intValue() == 3) {
                this.f66201b.l.removeCallbacks(this.f66201b.m);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements Observer<Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66202a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VECutVideoFragment f66203b;

        c(VECutVideoFragment vECutVideoFragment) {
            this.f66203b = vECutVideoFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            if (PatchProxy.isSupport(new Object[]{voidR}, this, f66202a, false, 75596, new Class[]{Void.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{voidR}, this, f66202a, false, 75596, new Class[]{Void.class}, Void.TYPE);
                return;
            }
            this.f66203b.i().a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(3, this.f66203b.a().getPlayingPosition(), p.d.EDITOR_SEEK_FLAG_OnGoing));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class d<T> implements Observer<Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66204a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VECutVideoFragment f66205b;

        d(VECutVideoFragment vECutVideoFragment) {
            this.f66205b = vECutVideoFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            long j;
            Void voidR = (Void) obj;
            if (PatchProxy.isSupport(new Object[]{voidR}, this, f66204a, false, 75597, new Class[]{Void.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{voidR}, this, f66204a, false, 75597, new Class[]{Void.class}, Void.TYPE);
                return;
            }
            if (this.f66205b.g == 1) {
                j = this.f66205b.a().getMultiPlayingPosition();
            } else {
                j = this.f66205b.a().getSinglePlayingPosition();
            }
            VECutVideoPresenter j2 = this.f66205b.j();
            Pair<Long, Long> playBoundary = this.f66205b.a().getPlayBoundary();
            Intrinsics.checkExpressionValueIsNotNull(playBoundary, "videoEditView().playBoundary");
            j2.a(playBoundary);
            this.f66205b.i().a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(3, j, p.d.EDITOR_SEEK_FLAG_LastSeek));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "speed", "", "onChanged", "(Ljava/lang/Float;)V"}, k = 3, mv = {1, 1, 15})
    static final class e<T> implements Observer<Float> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66206a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VECutVideoFragment f66207b;

        e(VECutVideoFragment vECutVideoFragment) {
            this.f66207b = vECutVideoFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            long j;
            Float f2 = (Float) obj;
            if (PatchProxy.isSupport(new Object[]{f2}, this, f66206a, false, 75598, new Class[]{Float.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{f2}, this, f66206a, false, 75598, new Class[]{Float.class}, Void.TYPE);
            } else if (f2 != null) {
                VECutVideoPresenter j2 = this.f66207b.j();
                int i = this.f66207b.f66196d;
                Intrinsics.checkExpressionValueIsNotNull(f2, AdvanceSetting.NETWORK_TYPE);
                float floatValue = f2.floatValue();
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(floatValue)}, j2, VECutVideoPresenter.f3915a, false, 75631, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE)) {
                    VECutVideoPresenter vECutVideoPresenter = j2;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(floatValue)}, vECutVideoPresenter, VECutVideoPresenter.f3915a, false, 75631, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE);
                } else {
                    ah ahVar = j2.g;
                    if (ahVar != null) {
                        ahVar.b(i, floatValue);
                    }
                }
                Pair<Long, Long> playBoundary = this.f66207b.a().getPlayBoundary();
                if (!(playBoundary.first == null || playBoundary.second == null)) {
                    if (this.f66207b.g == 1) {
                        j = this.f66207b.a().getMultiSeekTime();
                    } else {
                        j = this.f66207b.a().getSingleSeekTime();
                    }
                    VECutVideoPresenter j3 = this.f66207b.j();
                    Pair<Long, Long> playBoundary2 = this.f66207b.a().getPlayBoundary();
                    Intrinsics.checkExpressionValueIsNotNull(playBoundary2, "videoEditView().playBoundary");
                    j3.a(playBoundary2);
                    this.f66207b.i().a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(3, j, p.d.EDITOR_SEEK_FLAG_LastSeek));
                }
                this.f66207b.A();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "cutState", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    static final class f<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66208a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VECutVideoFragment f66209b;

        f(VECutVideoFragment vECutVideoFragment) {
            this.f66209b = vECutVideoFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            int i = 1;
            if (PatchProxy.isSupport(new Object[]{num}, this, f66208a, false, 75599, new Class[]{Integer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{num}, this, f66208a, false, 75599, new Class[]{Integer.class}, Void.TYPE);
                return;
            }
            VECutVideoFragment vECutVideoFragment = this.f66209b;
            if (num != null) {
                i = num.intValue();
            }
            vECutVideoFragment.g = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "isOnTouch", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class g<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66210a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VECutVideoFragment f66211b;

        g(VECutVideoFragment vECutVideoFragment) {
            this.f66211b = vECutVideoFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (PatchProxy.isSupport(new Object[]{bool}, this, f66210a, false, 75600, new Class[]{Boolean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bool}, this, f66210a, false, 75600, new Class[]{Boolean.class}, Void.TYPE);
                return;
            }
            if (bool != null) {
                if (!(!bool.booleanValue())) {
                    bool = null;
                }
                if (bool != null) {
                    this.f66211b.i().a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(3, this.f66211b.a().getPlayingPosition(), p.d.EDITOR_SEEK_FLAG_LastSeek));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "seekTo", "", "onChanged", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 1, 15})
    static final class h<T> implements Observer<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66212a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VECutVideoFragment f66213b;

        h(VECutVideoFragment vECutVideoFragment) {
            this.f66213b = vECutVideoFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Long l = (Long) obj;
            if (PatchProxy.isSupport(new Object[]{l}, this, f66212a, false, 75601, new Class[]{Long.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{l}, this, f66212a, false, 75601, new Class[]{Long.class}, Void.TYPE);
                return;
            }
            if (l != null) {
                this.f66213b.i().a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(3, l.longValue(), p.d.EDITOR_SEEK_FLAG_OnGoing));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Float;)V"}, k = 3, mv = {1, 1, 15})
    static final class i<T> implements Observer<Float> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66214a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VECutVideoFragment f66215b;

        i(VECutVideoFragment vECutVideoFragment) {
            this.f66215b = vECutVideoFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Float f2 = (Float) obj;
            if (PatchProxy.isSupport(new Object[]{f2}, this, f66214a, false, 75602, new Class[]{Float.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{f2}, this, f66214a, false, 75602, new Class[]{Float.class}, Void.TYPE);
                return;
            }
            this.f66215b.A();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class j<T> implements Observer<Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66216a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VECutVideoFragment f66217b;

        j(VECutVideoFragment vECutVideoFragment) {
            this.f66217b = vECutVideoFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            if (PatchProxy.isSupport(new Object[]{voidR}, this, f66216a, false, 75603, new Class[]{Void.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{voidR}, this, f66216a, false, 75603, new Class[]{Void.class}, Void.TYPE);
                return;
            }
            this.f66217b.i().a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(3, this.f66217b.a().getLeftSeekingValue(), p.d.EDITOR_SEEK_FLAG_OnGoing));
            this.f66217b.A();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class k<T> implements Observer<Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66218a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VECutVideoFragment f66219b;

        k(VECutVideoFragment vECutVideoFragment) {
            this.f66219b = vECutVideoFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            if (PatchProxy.isSupport(new Object[]{voidR}, this, f66218a, false, 75604, new Class[]{Void.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{voidR}, this, f66218a, false, 75604, new Class[]{Void.class}, Void.TYPE);
                return;
            }
            this.f66219b.i().a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(3, this.f66219b.a().getRightSeekingValue(), p.d.EDITOR_SEEK_FLAG_OnGoing));
            this.f66219b.A();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class l<T> implements Observer<Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66220a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VECutVideoFragment f66221b;

        l(VECutVideoFragment vECutVideoFragment) {
            this.f66221b = vECutVideoFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            if (PatchProxy.isSupport(new Object[]{voidR}, this, f66220a, false, 75605, new Class[]{Void.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{voidR}, this, f66220a, false, 75605, new Class[]{Void.class}, Void.TYPE);
                return;
            }
            this.f66221b.i().a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(3, this.f66221b.a().getLeftSeekingValue(), p.d.EDITOR_SEEK_FLAG_LAST_UpdateIn));
            this.f66221b.A();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class m<T> implements Observer<Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66222a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VECutVideoFragment f66223b;

        m(VECutVideoFragment vECutVideoFragment) {
            this.f66223b = vECutVideoFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            if (PatchProxy.isSupport(new Object[]{voidR}, this, f66222a, false, 75606, new Class[]{Void.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{voidR}, this, f66222a, false, 75606, new Class[]{Void.class}, Void.TYPE);
                return;
            }
            this.f66223b.i().a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(3, this.f66223b.a().getRightSeekingValue(), p.d.EDITOR_SEEK_FLAG_LAST_UpdateOut));
            this.f66223b.A();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class n extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ VECutVideoFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(VECutVideoFragment vECutVideoFragment) {
            super(0);
            this.this$0 = vECutVideoFragment;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 75607, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 75607, new Class[0], Void.TYPE);
                return;
            }
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\r\u001a\u00020\u000eH\u0016J*\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/cut/VECutVideoFragment$compile$2", "Lcom/ss/android/ugc/aweme/shortvideo/cut/CutVEEditorCompileListener;", "isFastImport", "", "()Z", "setFastImport", "(Z)V", "progressDialog", "Lcom/ss/android/ugc/aweme/shortvideo/view/AwemeProgressDialog;", "getProgressDialog", "()Lcom/ss/android/ugc/aweme/shortvideo/view/AwemeProgressDialog;", "setProgressDialog", "(Lcom/ss/android/ugc/aweme/shortvideo/view/AwemeProgressDialog;)V", "onCompileDone", "", "onCompileError", "error", "", "ext", "f", "", "msg", "", "onCompileProgress", "progress", "onStart", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class o implements ae {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66224a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public com.ss.android.ugc.aweme.shortvideo.view.d f66225b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f66226c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ VECutVideoFragment f66227d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.google.common.a.q f66228e;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f66224a, false, 75610, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66224a, false, 75610, new Class[0], Void.TYPE);
                return;
            }
            TextView textView = (TextView) this.f66227d.a((int) C0906R.id.d8h);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvNext");
            textView.setEnabled(true);
            bc.b(this.f66225b);
            this.f66227d.c(this.f66226c);
            com.google.common.a.q qVar = this.f66228e;
            Intrinsics.checkExpressionValueIsNotNull(qVar, "stopwatch");
            if (qVar.f2357a) {
                this.f66228e.d();
                Locale locale = Locale.US;
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
                String format = String.format(locale, "%d", Arrays.copyOf(new Object[]{Long.valueOf(this.f66228e.a(TimeUnit.MILLISECONDS))}, 1));
                Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(locale, format, *args)");
                com.ss.android.ugc.aweme.common.r.a("import_transcoding_end", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("status", 1).a("duration", format).f34114b);
            }
        }

        public final void a(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f66224a, false, 75611, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f66224a, false, 75611, new Class[]{Float.TYPE}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.shortvideo.view.d dVar = this.f66225b;
            if (dVar != null) {
                if (!dVar.isShowing()) {
                    dVar = null;
                }
                if (dVar != null) {
                    dVar.setProgress((int) (100.0f * f2));
                }
            }
        }

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f66224a, false, 75608, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f66224a, false, 75608, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            this.f66226c = z;
            if (!z) {
                this.f66225b = com.ss.android.ugc.aweme.shortvideo.view.d.b(this.f66227d.getActivity(), this.f66227d.getResources().getString(C0906R.string.c83));
                com.ss.android.ugc.aweme.shortvideo.view.d dVar = this.f66225b;
                if (dVar != null) {
                    dVar.setIndeterminate(false);
                }
            }
        }

        o(VECutVideoFragment vECutVideoFragment, com.google.common.a.q qVar) {
            this.f66227d = vECutVideoFragment;
            this.f66228e = qVar;
        }

        public final void a(int i, int i2, float f2, @Nullable String str) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str}, this, f66224a, false, 75609, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str}, this, f66224a, false, 75609, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE);
                return;
            }
            TextView textView = (TextView) this.f66227d.a((int) C0906R.id.d8h);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvNext");
            textView.setEnabled(true);
            bc.b(this.f66225b);
            Context context = this.f66227d.getContext();
            StringBuilder sb = new StringBuilder("合成失败 ");
            int i3 = i;
            sb.append(i);
            com.bytedance.ies.dmt.ui.d.a.b(context, sb.toString()).a();
            com.ss.android.ugc.aweme.common.r.a("import_transcoding_end", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("status", 0).f34114b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "call", "()Lkotlin/Unit;"}, k = 3, mv = {1, 1, 15})
    static final class p<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66229a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VECutVideoFragment f66230b;

        p(VECutVideoFragment vECutVideoFragment) {
            this.f66230b = vECutVideoFragment;
        }

        public final /* synthetic */ Object call() {
            if (PatchProxy.isSupport(new Object[0], this, f66229a, false, 75612, new Class[0], Unit.class)) {
                return (Unit) PatchProxy.accessDispatch(new Object[0], this, f66229a, false, 75612, new Class[0], Unit.class);
            }
            List<com.ss.android.ugc.aweme.shortvideo.cut.model.h> c2 = this.f66230b.h().c();
            if (c2 == null) {
                return null;
            }
            for (com.ss.android.ugc.aweme.shortvideo.cut.model.h hVar : c2) {
                ArrayList<cf> arrayList = this.f66230b.k;
                int i = hVar.g;
                int i2 = hVar.h;
                Intrinsics.checkExpressionValueIsNotNull(hVar, "segment");
                arrayList.add(new cf(i, i2, hVar.d(), String.valueOf(hVar.c())));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/cut/VECutVideoFragment$onViewCreated$1", "Lcom/ss/android/ugc/aweme/utils/DebounceOnClickListener;", "doClick", "", "v", "Landroid/view/View;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class q extends ax {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66231a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VECutVideoFragment f66232b;

        q(VECutVideoFragment vECutVideoFragment) {
            this.f66232b = vECutVideoFragment;
        }

        public final void a(@Nullable View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f66231a, false, 75613, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f66231a, false, 75613, new Class[]{View.class}, Void.TYPE);
                return;
            }
            this.f66232b.c().setEnabled(false);
            this.f66232b.p = System.currentTimeMillis();
            this.f66232b.z();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/shortvideo/cut/VECutVideoPresenter;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class r extends Lambda implements Function0<VECutVideoPresenter> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ VECutVideoFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(VECutVideoFragment vECutVideoFragment) {
            super(0);
            this.this$0 = vECutVideoFragment;
        }

        @NotNull
        public final VECutVideoPresenter invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 75614, new Class[0], VECutVideoPresenter.class)) {
                return (VECutVideoPresenter) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 75614, new Class[0], VECutVideoPresenter.class);
            }
            String b2 = com.ss.android.ugc.aweme.shortvideo.a.d.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "Workspace.getImportDir()");
            return new VECutVideoPresenter(b2, this.this$0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/ugc/aweme/shortvideo/cut/VECutVideoFragment$rotate$1$1"}, k = 3, mv = {1, 1, 15})
    static final class s implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66233a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VECutVideoFragment f66234b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f66235c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f66236d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f66237e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f66238f;

        s(VECutVideoFragment vECutVideoFragment, int i, Ref.FloatRef floatRef, float f2, View view) {
            this.f66234b = vECutVideoFragment;
            this.f66235c = i;
            this.f66236d = floatRef;
            this.f66237e = f2;
            this.f66238f = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f66233a, false, 75615, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f66233a, false, 75615, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, "animation");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            VECutVideoPresenter.a(this.f66234b.j(), this.f66234b.f66196d, ((float) this.f66235c) + (90.0f * animatedFraction), false, this.f66236d.element + (this.f66237e * animatedFraction), this.f66236d.element + (this.f66237e * animatedFraction), 4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/cut/VECutVideoFragment$rotate$1$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationStart", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class t extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66239a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VECutVideoFragment f66240b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f66241c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f66242d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f66243e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f66244f;

        public final void onAnimationCancel(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f66239a, false, 75617, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f66239a, false, 75617, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            super.onAnimationCancel(animator);
            this.f66244f.setEnabled(true);
        }

        public final void onAnimationStart(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f66239a, false, 75616, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f66239a, false, 75616, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            super.onAnimationStart(animator);
            this.f66244f.setEnabled(false);
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f66239a, false, 75618, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f66239a, false, 75618, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            super.onAnimationEnd(animator);
            this.f66244f.setEnabled(true);
            this.f66240b.g().b();
        }

        t(VECutVideoFragment vECutVideoFragment, int i, Ref.FloatRef floatRef, float f2, View view) {
            this.f66240b = vECutVideoFragment;
            this.f66241c = i;
            this.f66242d = floatRef;
            this.f66243e = f2;
            this.f66244f = view;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/shortvideo/record/RecordSpeedModule;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class u extends Lambda implements Function0<com.ss.android.ugc.aweme.shortvideo.record.n> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ VECutVideoFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(VECutVideoFragment vECutVideoFragment) {
            super(0);
            this.this$0 = vECutVideoFragment;
        }

        @NotNull
        public final com.ss.android.ugc.aweme.shortvideo.record.n invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 75619, new Class[0], com.ss.android.ugc.aweme.shortvideo.record.n.class)) {
                return (com.ss.android.ugc.aweme.shortvideo.record.n) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 75619, new Class[0], com.ss.android.ugc.aweme.shortvideo.record.n.class);
            }
            View inflate = this.this$0.e().inflate();
            if (inflate != null) {
                return new com.ss.android.ugc.aweme.shortvideo.record.n((RadioGroup) inflate, new n.a(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f66245a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ u f66246b;

                    {
                        this.f66246b = r1;
                    }

                    public final void a(am amVar) {
                        if (PatchProxy.isSupport(new Object[]{amVar}, this, f66245a, false, 75620, new Class[]{am.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{amVar}, this, f66245a, false, 75620, new Class[]{am.class}, Void.TYPE);
                            return;
                        }
                        this.f66246b.this$0.g().a(amVar.value());
                    }
                });
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RadioGroup");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/cut/VECutVideoFragment$updateProgressTask$1", "Ljava/lang/Runnable;", "run", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class v implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66247a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VECutVideoFragment f66248b;

        public final void run() {
            long j;
            if (PatchProxy.isSupport(new Object[0], this, f66247a, false, 75621, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66247a, false, 75621, new Class[0], Void.TYPE);
                return;
            }
            VECutVideoPresenter j2 = this.f66248b.j();
            if (PatchProxy.isSupport(new Object[0], j2, VECutVideoPresenter.f3915a, false, 75623, new Class[0], Long.TYPE)) {
                j = ((Long) PatchProxy.accessDispatch(new Object[0], j2, VECutVideoPresenter.f3915a, false, 75623, new Class[0], Long.TYPE)).longValue();
            } else {
                ai aiVar = j2.h;
                if (aiVar != null) {
                    j = aiVar.a();
                } else {
                    j = 0;
                }
            }
            if (j > 0) {
                this.f66248b.g().a(j, this.f66248b.h().b(), this.f66248b.h().d());
            }
            this.f66248b.l.postDelayed(this, 30);
        }

        v(VECutVideoFragment vECutVideoFragment) {
            this.f66248b = vECutVideoFragment;
        }
    }

    public void B() {
        if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75589, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75589, new Class[0], Void.TYPE);
            return;
        }
        if (this.D != null) {
            this.D.clear();
        }
    }

    public View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f66193a, false, 75588, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f66193a, false, 75588, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.D == null) {
            this.D = new HashMap();
        }
        View view = (View) this.D.get(Integer.valueOf(i2));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i2);
            this.D.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public abstract void a(@DrawableRes int i2, @ColorInt int i3);

    public void a(boolean z2) {
    }

    public void b(boolean z2) {
    }

    @LayoutRes
    public abstract int f();

    @NotNull
    public final VECutVideoPresenter j() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75556, new Class[0], VECutVideoPresenter.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75556, new Class[0], VECutVideoPresenter.class);
        } else {
            value = this.B.getValue();
        }
        return (VECutVideoPresenter) value;
    }

    @NotNull
    public final com.ss.android.ugc.aweme.shortvideo.record.n k() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75557, new Class[0], com.ss.android.ugc.aweme.shortvideo.record.n.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75557, new Class[0], com.ss.android.ugc.aweme.shortvideo.record.n.class);
        } else {
            value = this.C.getValue();
        }
        return (com.ss.android.ugc.aweme.shortvideo.record.n) value;
    }

    @NotNull
    public final LifecycleOwner o() {
        return this;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        B();
    }

    public void onHiddenChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f66193a, false, 75590, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f66193a, false, 75590, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z2);
        FragmentInstrumentation.onHiddenChanged(this, z2);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75592, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75592, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75591, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75591, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f66193a, false, 75593, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f66193a, false, 75593, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z2);
        FragmentInstrumentation.setUserVisibleHint(this, z2);
    }

    public final int r() {
        return this.g;
    }

    @NotNull
    public final CutMultiVideoViewModel g() {
        if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75550, new Class[0], CutMultiVideoViewModel.class)) {
            return (CutMultiVideoViewModel) PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75550, new Class[0], CutMultiVideoViewModel.class);
        }
        CutMultiVideoViewModel cutMultiVideoViewModel = this.h;
        if (cutMultiVideoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cutMultiVideoViewModel");
        }
        return cutMultiVideoViewModel;
    }

    @NotNull
    public final VideoEditViewModel h() {
        if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75552, new Class[0], VideoEditViewModel.class)) {
            return (VideoEditViewModel) PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75552, new Class[0], VideoEditViewModel.class);
        }
        VideoEditViewModel videoEditViewModel = this.i;
        if (videoEditViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    @NotNull
    public final VEVideoCutterViewModel i() {
        if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75554, new Class[0], VEVideoCutterViewModel.class)) {
            return (VEVideoCutterViewModel) PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75554, new Class[0], VEVideoCutterViewModel.class);
        }
        VEVideoCutterViewModel vEVideoCutterViewModel = this.j;
        if (vEVideoCutterViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    @NotNull
    public final RelativeLayout l() {
        if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75558, new Class[0], RelativeLayout.class)) {
            return (RelativeLayout) PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75558, new Class[0], RelativeLayout.class);
        }
        RelativeLayout relativeLayout = this.n;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutTop");
        }
        return relativeLayout;
    }

    @NotNull
    public final LinearLayout m() {
        if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75560, new Class[0], LinearLayout.class)) {
            return (LinearLayout) PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75560, new Class[0], LinearLayout.class);
        }
        LinearLayout linearLayout = this.o;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutBottom");
        }
        return linearLayout;
    }

    @NotNull
    public final Context n() {
        if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75562, new Class[0], Context.class)) {
            return (Context) PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75562, new Class[0], Context.class);
        }
        Context context = getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        return context;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75587, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75587, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.l.removeCallbacks(this.m);
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75563, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75563, new Class[0], Void.TYPE);
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75564, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75564, new Class[0], Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VEExtractFramesAfterRender)) {
            a().setLoadThumbnailDirectly(true);
            a().h();
        }
    }

    public final long s() {
        if (!PatchProxy.isSupport(new Object[0], this, f66193a, false, 75565, new Class[0], Long.TYPE)) {
            return a().getMaxCutDuration();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75565, new Class[0], Long.TYPE)).longValue();
    }

    @NotNull
    public final Pair<Long, Long> t() {
        if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75566, new Class[0], Pair.class)) {
            return (Pair) PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75566, new Class[0], Pair.class);
        }
        Pair<Long, Long> playBoundary = a().getPlayBoundary();
        Intrinsics.checkExpressionValueIsNotNull(playBoundary, "videoEditView().playBoundary");
        return playBoundary;
    }

    public final void u() {
        if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75567, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75567, new Class[0], Void.TYPE);
            return;
        }
        a().d();
    }

    public void x() {
        if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75577, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75577, new Class[0], Void.TYPE);
            return;
        }
        View.OnClickListener onClickListener = this;
        ((AVDmtAutoRTLImageView) a((int) C0906R.id.ay9)).setOnClickListener(onClickListener);
        C().setOnClickListener(onClickListener);
    }

    public final void A() {
        if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75584, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75584, new Class[0], Void.TYPE);
            return;
        }
        Locale locale = Locale.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
        String format = String.format(locale, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(a().getSelectedTime())}, 1));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(locale, format, *args)");
        d().setText(getResources().getString(C0906R.string.bd9, new Object[]{format}));
    }

    public final void v() {
        if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75573, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75573, new Class[0], Void.TYPE);
        } else if (fc.a()) {
            switch (fb.f67663b) {
                case 1:
                    a(true);
                    b(true);
                    return;
                case 2:
                    a(false);
                    b(true);
                    return;
                case 3:
                    a(true);
                    b(false);
                    return;
                case 4:
                    a(true);
                    b(true);
                    return;
                case 5:
                    a(false);
                    b(true);
                    return;
                case 6:
                    a(true);
                    b(false);
                    return;
                case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                    a(false);
                    b(false);
                    return;
                default:
                    a(false);
                    b(false);
                    return;
            }
        }
    }

    public final void y() {
        Serializable serializable;
        if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75581, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75581, new Class[0], Void.TYPE);
            return;
        }
        Intent intent = this.r;
        if (intent != null) {
            serializable = intent.getSerializableExtra("extra_share_context");
        } else {
            serializable = null;
        }
        w wVar = (w) serializable;
        if (com.ss.android.ugc.aweme.port.in.a.v.a(wVar)) {
            com.ss.android.ugc.aweme.port.in.a.v.a(getActivity(), wVar, "", 20013);
        }
        a((Function0<Unit>) new n<Unit>(this));
    }

    @SuppressLint({"Fragment_LifecycleOwner"})
    public void w() {
        if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75576, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75576, new Class[0], Void.TYPE);
            return;
        }
        VEVideoCutterViewModel vEVideoCutterViewModel = this.j;
        if (vEVideoCutterViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("veVideoCutterViewModel");
        }
        LifecycleOwner lifecycleOwner = this;
        vEVideoCutterViewModel.a().observe(lifecycleOwner, new b(this));
        VideoEditViewModel videoEditViewModel = this.i;
        if (videoEditViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
        }
        videoEditViewModel.f66561b.observe(lifecycleOwner, new f(this));
        VideoEditViewModel videoEditViewModel2 = this.i;
        if (videoEditViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
        }
        videoEditViewModel2.f66562c.observe(lifecycleOwner, new g(this));
        VideoEditViewModel videoEditViewModel3 = this.i;
        if (videoEditViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
        }
        videoEditViewModel3.f66564e.observe(lifecycleOwner, new h(this));
        VideoEditViewModel videoEditViewModel4 = this.i;
        if (videoEditViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
        }
        videoEditViewModel4.f66563d.observe(lifecycleOwner, new i(this));
        VideoEditViewModel videoEditViewModel5 = this.i;
        if (videoEditViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
        }
        videoEditViewModel5.g.observe(lifecycleOwner, new j(this));
        VideoEditViewModel videoEditViewModel6 = this.i;
        if (videoEditViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
        }
        videoEditViewModel6.f66565f.observe(lifecycleOwner, new k(this));
        VideoEditViewModel videoEditViewModel7 = this.i;
        if (videoEditViewModel7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
        }
        videoEditViewModel7.h.observe(lifecycleOwner, new l(this));
        VideoEditViewModel videoEditViewModel8 = this.i;
        if (videoEditViewModel8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
        }
        videoEditViewModel8.j.observe(lifecycleOwner, new m(this));
        VideoEditViewModel videoEditViewModel9 = this.i;
        if (videoEditViewModel9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
        }
        videoEditViewModel9.k.observe(lifecycleOwner, new c(this));
        VideoEditViewModel videoEditViewModel10 = this.i;
        if (videoEditViewModel10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
        }
        videoEditViewModel10.l.observe(lifecycleOwner, new d(this));
        VideoEditViewModel videoEditViewModel11 = this.i;
        if (videoEditViewModel11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
        }
        videoEditViewModel11.m.observe(lifecycleOwner, new e(this));
    }

    public final void z() {
        boolean z2;
        long j2;
        a.i iVar;
        if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75582, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75582, new Class[0], Void.TYPE);
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null && activity.isFinishing()) {
            return;
        }
        if (j().a() + 5 < this.t) {
            com.bytedance.ies.dmt.ui.d.a.b(getContext(), getString(C0906R.string.dr8, Long.valueOf(this.t / 1000))).a();
            c().setEnabled(true);
        } else if (j().a() > ((long) this.u)) {
            com.bytedance.ies.dmt.ui.d.a.b(getContext(), (int) C0906R.string.bcy).a();
            c().setEnabled(true);
        } else {
            com.ss.android.ugc.aweme.common.r.a("import_transcoding_start", (Map) null);
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("duration_ms", (Object) Float.valueOf(a().getSelectedTime()));
            VideoEditViewModel videoEditViewModel = this.i;
            if (videoEditViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
            }
            List<com.ss.android.ugc.aweme.shortvideo.cut.model.h> c2 = videoEditViewModel.c();
            Intrinsics.checkExpressionValueIsNotNull(c2, "videoEditViewModel.originVideoList");
            Collection arrayList = new ArrayList();
            for (Object next : c2) {
                if (!((com.ss.android.ugc.aweme.shortvideo.cut.model.h) next).j) {
                    arrayList.add(next);
                }
            }
            com.ss.android.ugc.aweme.common.r.a("edit_upload_next", (Map) a2.a("video_cnt", ((List) arrayList).size()).f34114b);
            com.google.common.a.q b2 = com.google.common.a.q.b();
            if (this.g != 1) {
                VECutVideoPresenter j3 = j();
                int i2 = this.f66196d;
                VideoEditViewModel videoEditViewModel2 = this.i;
                if (videoEditViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
                }
                VECutVideoPresenter.a(j3, i2, (float) videoEditViewModel2.b().get(this.f66196d).k, false, 0.0f, 0.0f, 24);
            }
            VECutVideoPresenter j4 = j();
            com.ss.android.ugc.aweme.shortvideo.a.d dVar = this.A;
            if (dVar == null) {
                Intrinsics.throwNpe();
            }
            ae oVar = new o(this, b2);
            if (PatchProxy.isSupport(new Object[]{dVar, oVar}, j4, VECutVideoPresenter.f3915a, false, 75638, new Class[]{com.ss.android.ugc.aweme.shortvideo.a.d.class, ae.class}, Void.TYPE)) {
                Object[] objArr = {dVar, oVar};
                Object[] objArr2 = objArr;
                VECutVideoPresenter vECutVideoPresenter = j4;
                PatchProxy.accessDispatch(objArr2, vECutVideoPresenter, VECutVideoPresenter.f3915a, false, 75638, new Class[]{com.ss.android.ugc.aweme.shortvideo.a.d.class, ae.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(dVar, "workspace");
            Intrinsics.checkParameterIsNotNull(oVar, "listener");
            if (!j4.f3920f) {
                ai.a("VECutVideo,return compile because of editor not init");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            ai aiVar = j4.h;
            if (aiVar != null) {
                z2 = aiVar.d();
            } else {
                z2 = false;
            }
            j4.f3918d = z2;
            VEVideoCutterViewModel vEVideoCutterViewModel = j4.k;
            if (vEVideoCutterViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("veVideoCutterViewModel");
            }
            vEVideoCutterViewModel.a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(2, true));
            ai aiVar2 = j4.h;
            if (aiVar2 != null) {
                j2 = aiVar2.a();
            } else {
                j2 = 0;
            }
            j4.f3917c = j2;
            if (j4.d()) {
                oVar.a(true);
                ai.a("VECutVideo,using fastImport strategy");
                oVar.a();
                if (j4.c()) {
                    if (PatchProxy.isSupport(new Object[0], j4, VECutVideoPresenter.f3915a, false, 75629, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], j4, VECutVideoPresenter.f3915a, false, 75629, new Class[0], Void.TYPE);
                    } else {
                        com.ss.android.ugc.aweme.shortvideo.b.b bVar = j4.i;
                        if (bVar != null) {
                            bVar.i();
                        }
                        com.ss.android.ugc.aweme.shortvideo.b.b bVar2 = j4.i;
                        if (bVar2 != null) {
                            bVar2.j();
                        }
                        j4.f3920f = false;
                    }
                } else {
                    j4.destroy();
                }
            } else {
                oVar.a(false);
                ai.a("VECutVideo,using normalImport strategy");
                if (PatchProxy.isSupport(new Object[0], j4, VECutVideoPresenter.f3915a, false, 75646, new Class[0], a.i.class)) {
                    iVar = (a.i) PatchProxy.accessDispatch(new Object[0], j4, VECutVideoPresenter.f3915a, false, 75646, new Class[0], a.i.class);
                } else {
                    iVar = a.i.a((Callable<TResult>) new VECutVideoPresenter.d<TResult>(j4));
                    Intrinsics.checkExpressionValueIsNotNull(iVar, "Task.callInBackground {\n…s\n            }\n        }");
                }
                VECutVideoPresenter.c cVar = new VECutVideoPresenter.c(j4, currentTimeMillis, dVar, oVar);
                iVar.a((a.g<TResult, TContinuationResult>) cVar);
            }
        }
    }

    public final void a(@NotNull RelativeLayout relativeLayout) {
        RelativeLayout relativeLayout2 = relativeLayout;
        if (PatchProxy.isSupport(new Object[]{relativeLayout2}, this, f66193a, false, 75559, new Class[]{RelativeLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{relativeLayout2}, this, f66193a, false, 75559, new Class[]{RelativeLayout.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(relativeLayout2, "<set-?>");
        this.n = relativeLayout2;
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f66193a, false, 75574, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f66193a, false, 75574, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bundle2, "outState");
        super.onSaveInstanceState(bundle);
        bundle2.putParcelable("workspace", this.A);
    }

    public void a(@NotNull Function0<Unit> function0) {
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{function02}, this, f66193a, false, 75578, new Class[]{Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function02}, this, f66193a, false, 75578, new Class[]{Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function02, "quitInvoker");
        function0.invoke();
    }

    public void onAttach(@Nullable Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f66193a, false, 75568, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f66193a, false, 75568, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        super.onAttach(context);
        if (context != null) {
            VECutVideoPresenter j2 = j();
            FragmentActivity fragmentActivity = (AppCompatActivity) context;
            if (PatchProxy.isSupport(new Object[]{fragmentActivity}, j2, VECutVideoPresenter.f3915a, false, 75626, new Class[]{FragmentActivity.class}, Void.TYPE)) {
                VECutVideoPresenter vECutVideoPresenter = j2;
                PatchProxy.accessDispatch(new Object[]{fragmentActivity}, vECutVideoPresenter, VECutVideoPresenter.f3915a, false, 75626, new Class[]{FragmentActivity.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(fragmentActivity, PushConstants.INTENT_ACTIVITY_NAME);
                ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(CutMultiVideoViewModel.class);
                Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…deoViewModel::class.java]");
                j2.j = (CutMultiVideoViewModel) viewModel;
                ViewModel viewModel2 = ViewModelProviders.of(fragmentActivity).get(VEVideoCutterViewModel.class);
                Intrinsics.checkExpressionValueIsNotNull(viewModel2, "ViewModelProviders.of(ac…terViewModel::class.java]");
                j2.k = (VEVideoCutterViewModel) viewModel2;
                ViewModel viewModel3 = ViewModelProviders.of(fragmentActivity).get(VideoEditViewModel.class);
                Intrinsics.checkExpressionValueIsNotNull(viewModel3, "ViewModelProviders.of(ac…ditViewModel::class.java]");
                j2.l = (VideoEditViewModel) viewModel3;
                if (PatchProxy.isSupport(new Object[0], j2, VECutVideoPresenter.f3915a, false, 75643, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], j2, VECutVideoPresenter.f3915a, false, 75643, new Class[0], Void.TYPE);
                } else {
                    j2.m.o().getLifecycle().addObserver(j2);
                    VEVideoCutterViewModel vEVideoCutterViewModel = j2.k;
                    if (vEVideoCutterViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("veVideoCutterViewModel");
                    }
                    vEVideoCutterViewModel.a().observe(j2.m.o(), new VECutVideoPresenter.a(j2));
                }
            }
            ViewModel viewModel4 = ViewModelProviders.of(fragmentActivity).get(CutMultiVideoViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel4, "ViewModelProviders.of(ac…deoViewModel::class.java]");
            this.h = (CutMultiVideoViewModel) viewModel4;
            ViewModel viewModel5 = ViewModelProviders.of(fragmentActivity).get(VideoEditViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel5, "ViewModelProviders.of(ac…ditViewModel::class.java]");
            this.i = (VideoEditViewModel) viewModel5;
            ViewModel viewModel6 = ViewModelProviders.of(fragmentActivity).get(VEVideoCutterViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel6, "ViewModelProviders.of(ac…terViewModel::class.java]");
            this.j = (VEVideoCutterViewModel) viewModel6;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
    }

    public void onClick(@Nullable View view) {
        Integer num;
        int i2;
        int i3;
        com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a aVar;
        if (PatchProxy.isSupport(new Object[]{view}, this, f66193a, false, 75575, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f66193a, false, 75575, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C0906R.id.ay9) {
            y();
        } else if (num != null && num.intValue() == C0906R.id.drp) {
            VEVideoCutterViewModel vEVideoCutterViewModel = this.j;
            if (vEVideoCutterViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("veVideoCutterViewModel");
            }
            if (j().b()) {
                aVar = new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(2, false, 2);
            } else {
                aVar = new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(1, false, 2);
            }
            vEVideoCutterViewModel.a(aVar);
        } else {
            if (num != null && num.intValue() == C0906R.id.ayd) {
                ak.b();
                if (PatchProxy.isSupport(new Object[]{view}, this, f66193a, false, 75583, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f66193a, false, 75583, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(view, "view");
                int currentRotate = a().getCurrentRotate();
                Ref.FloatRef floatRef = new Ref.FloatRef();
                floatRef.element = 0.0f;
                if (this.g == 0) {
                    VideoEditViewModel videoEditViewModel = this.i;
                    if (videoEditViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
                    }
                    i3 = videoEditViewModel.c().get(this.f66196d).g;
                    VideoEditViewModel videoEditViewModel2 = this.i;
                    if (videoEditViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
                    }
                    i2 = videoEditViewModel2.c().get(this.f66196d).h;
                } else {
                    i3 = C().getMeasuredWidth();
                    i2 = C().getMeasuredHeight();
                }
                float f2 = 1.0f;
                if (a().getCurrentRotate() % 180 == 0) {
                    floatRef.element = 1.0f;
                    f2 = (((float) i3) * 1.0f) / ((float) i2);
                } else {
                    floatRef.element = (((float) i3) * 1.0f) / ((float) i2);
                }
                VideoEditViewModel videoEditViewModel3 = this.i;
                if (videoEditViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
                }
                videoEditViewModel3.c().get(this.f66196d).l = f2;
                VideoEditViewModel videoEditViewModel4 = this.i;
                if (videoEditViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
                }
                videoEditViewModel4.c().get(this.f66196d).m = f2;
                float f3 = f2 - floatRef.element;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.setDuration(300);
                int i4 = currentRotate % 360;
                Ref.FloatRef floatRef2 = floatRef;
                float f4 = f3;
                View view2 = view;
                s sVar = new s(this, i4, floatRef2, f4, view2);
                ofFloat.addUpdateListener(sVar);
                t tVar = new t(this, i4, floatRef2, f4, view2);
                ofFloat.addListener(tVar);
                ofFloat.start();
            }
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        com.ss.android.ugc.aweme.shortvideo.a.d dVar;
        Intent intent;
        com.ss.android.ugc.aweme.shortvideo.c cVar;
        boolean z2;
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f66193a, false, 75569, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f66193a, false, 75569, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (bundle == null) {
            dVar = com.ss.android.ugc.aweme.shortvideo.a.d.a();
        } else {
            dVar = (com.ss.android.ugc.aweme.shortvideo.a.d) bundle.getParcelable("workspace");
        }
        this.A = dVar;
        if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75579, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75579, new Class[0], Void.TYPE);
        } else {
            Bundle arguments = getArguments();
            com.ss.android.ugc.aweme.shortvideo.edit.q qVar = null;
            if (arguments != null) {
                intent = (Intent) arguments.getParcelable("page_intent_data");
            } else {
                intent = null;
            }
            this.r = intent;
            Intent intent2 = this.r;
            if (intent2 != null) {
                this.s = com.ss.android.ugc.aweme.story.shootvideo.d.a(intent2.getIntExtra("shoot_mode", -1));
                this.f66197e = !this.s;
                this.t = intent2.getLongExtra("min_duration", ff.a());
                String stringExtra = intent2.getStringExtra("path");
                if (!TextUtils.isEmpty(stringExtra)) {
                    com.ss.android.ugc.aweme.shortvideo.a.d dVar2 = this.A;
                    if (dVar2 != null) {
                        dVar2.a(new File(stringExtra));
                    }
                }
                if (intent2.getSerializableExtra("av_challenge") == null) {
                    cVar = null;
                } else {
                    Serializable serializableExtra = intent2.getSerializableExtra("av_challenge");
                    if (serializableExtra != null) {
                        cVar = (com.ss.android.ugc.aweme.shortvideo.c) serializableExtra;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.AVChallenge");
                    }
                }
                this.v = cVar;
                this.y = intent2.getStringExtra("micro_app_id");
                if (intent2.getSerializableExtra("micro_app_info") != null) {
                    Serializable serializableExtra2 = intent2.getSerializableExtra("micro_app_info");
                    if (serializableExtra2 != null) {
                        qVar = (com.ss.android.ugc.aweme.shortvideo.edit.q) serializableExtra2;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel");
                    }
                }
                this.x = qVar;
                this.f66198f = intent2.getSerializableExtra("micro_app_class");
                if (this.x != null || !TextUtils.isEmpty(this.y)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.z = Boolean.valueOf(z2);
                if (!intent2.getBooleanExtra("enter_record_from_other_platform", false) && this.x == null && TextUtils.isEmpty(this.y)) {
                    z3 = false;
                }
                this.w = z3;
            }
        }
        w();
    }

    public final void c(boolean z2) {
        String str;
        String str2;
        Serializable serializable;
        String str3;
        String str4;
        Serializable serializable2;
        Integer num;
        Serializable serializable3;
        String str5;
        String str6;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f66193a, false, 75585, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f66193a, false, 75585, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = this.r;
        String str7 = null;
        if (intent != null) {
            str = intent.getStringExtra("shoot_way");
        } else {
            str = null;
        }
        Intent intent2 = this.r;
        if (intent2 != null) {
            str2 = intent2.getStringExtra("creation_id");
        } else {
            str2 = null;
        }
        Intent a2 = j().a(this.A, z2);
        a2.putExtra("extra_start_enter_edit_page", this.p);
        a2.putExtra("extra_import_compile_cost_time", System.currentTimeMillis() - this.p);
        Intent intent3 = this.r;
        if (intent3 != null) {
            serializable = intent3.getSerializableExtra("send_to_user_head");
        } else {
            serializable = null;
        }
        a2.putExtra("send_to_user_head", serializable);
        VideoEditViewModel videoEditViewModel = this.i;
        if (videoEditViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
        }
        a2.putExtra("extra_is_change_speed", videoEditViewModel.e());
        Intent intent4 = this.r;
        if (intent4 != null) {
            str3 = intent4.getStringExtra("enter_from");
        } else {
            str3 = null;
        }
        a2.putExtra("enter_from", str3);
        a2.putExtra("dir", ff.f67717f);
        a2.putExtra("shoot_way", str);
        a2.putExtra("content_source", "upload");
        a2.putExtra("enable_music_path_check", false);
        boolean z4 = this instanceof VEMultiCutVideoFragment;
        a2.putExtra("fromMultiCut", z4);
        a2.putExtra("fromCut", true);
        a2.putExtra("origin", 0);
        a2.putExtra("creation_id", str2);
        Intent intent5 = this.r;
        if (intent5 != null) {
            str4 = intent5.getStringExtra("poi_struct_in_tools_line");
        } else {
            str4 = null;
        }
        a2.putExtra("poi_struct_in_tools_line", str4);
        a2.putExtra("back_to_main_after_publish", this.z);
        com.ss.android.ugc.aweme.shortvideo.c cVar = this.v;
        if (cVar != null) {
            List listOf = CollectionsKt.listOf(cVar);
            if (listOf != null) {
                a2.putExtra("challenge", (Serializable) listOf);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.io.Serializable");
            }
        }
        a2.putExtra("enter_record_from_other_platform", this.w);
        a2.putExtra("upload_video_type", z4);
        a2.putExtra("micro_app_id", this.y);
        a2.putExtra("micro_app_info", this.x);
        Intent intent6 = this.r;
        if (intent6 != null) {
            serializable2 = intent6.getSerializableExtra("av_et_parameter");
        } else {
            serializable2 = null;
        }
        a2.putExtra("av_et_parameter", serializable2);
        Intent intent7 = this.r;
        if (intent7 != null) {
            num = Integer.valueOf(intent7.getIntExtra("shoot_mode", -1));
        } else {
            num = null;
        }
        a2.putExtra("shoot_mode", num);
        a2.putExtra("story_mediaType", 1);
        Intent intent8 = this.r;
        if (intent8 != null) {
            serializable3 = intent8.getSerializableExtra("extra_share_context");
        } else {
            serializable3 = null;
        }
        a2.putExtra("extra_share_context", serializable3);
        Intent intent9 = this.r;
        if (intent9 != null) {
            str5 = intent9.getStringExtra("extra_share_app_name");
        } else {
            str5 = null;
        }
        a2.putExtra("extra_share_app_name", str5);
        if (!this.k.isEmpty()) {
            a2.putParcelableArrayListExtra("extra_import_video_info_list", this.k);
        }
        com.ss.android.ugc.aweme.shortvideo.edit.q qVar = this.x;
        if (qVar != null) {
            if (!(!TextUtils.isEmpty(qVar.getExtra()))) {
                qVar = null;
            }
            if (qVar != null) {
                PublishExtra publishExtra = (PublishExtra) com.ss.android.ugc.aweme.port.in.a.f61120c.fromJson(qVar.getExtra(), PublishExtra.class);
                if (publishExtra != null && !CollectionUtils.isEmpty(publishExtra.getVideoTopics())) {
                    StringBuilder sb = new StringBuilder();
                    for (String append : publishExtra.getVideoTopics()) {
                        sb.append("#");
                        sb.append(append);
                        sb.append(" ");
                    }
                    a2.putExtra("video_title", sb.toString());
                }
            }
        }
        VideoEditViewModel videoEditViewModel2 = this.i;
        if (videoEditViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
        }
        List<com.ss.android.ugc.aweme.shortvideo.cut.model.h> b2 = videoEditViewModel2.b();
        if (b2 != null) {
            StringBuilder sb2 = new StringBuilder();
            for (com.ss.android.ugc.aweme.shortvideo.cut.model.h next : b2) {
                if (!TextUtils.isEmpty(next.o)) {
                    sb2.append(next.o);
                    sb2.append(",");
                }
            }
            String sb3 = sb2.toString();
            Intrinsics.checkExpressionValueIsNotNull(sb3, "sb.toString()");
            if (!TextUtils.isEmpty(sb3)) {
                int length = sb3.length() - 1;
                if (sb3 != null) {
                    String substring = sb3.substring(0, length);
                    Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    a2.putExtra("md5", substring);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
        com.ss.android.ugc.aweme.tools.a.g.a(this.r, a2, com.ss.android.ugc.aweme.tools.a.e.CUT, com.ss.android.ugc.aweme.tools.a.e.EDIT);
        VideoEditViewModel videoEditViewModel3 = this.i;
        if (videoEditViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoEditViewModel");
        }
        List<com.ss.android.ugc.aweme.shortvideo.cut.model.h> b3 = videoEditViewModel3.b();
        if (b3 != null) {
            StringBuilder sb4 = new StringBuilder();
            for (com.ss.android.ugc.aweme.shortvideo.cut.model.h next2 : b3) {
                if (!TextUtils.isEmpty(next2.n)) {
                    sb4.append(next2.n);
                    sb4.append(";");
                }
            }
            String sb5 = sb4.toString();
            Intrinsics.checkExpressionValueIsNotNull(sb5, "sb.toString()");
            if (!TextUtils.isEmpty(sb5)) {
                int length2 = sb5.length() - 1;
                if (sb5 != null) {
                    String substring2 = sb5.substring(0, length2);
                    Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    a2.putExtra("poi_data_in_tools_line", substring2);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75549, new Class[0], Boolean.TYPE)) {
            z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75549, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            Intent intent10 = this.r;
            if (intent10 != null) {
                z3 = intent10.getBooleanExtra("from_music_detail", false);
            }
        }
        if (!z3) {
            com.ss.android.ugc.aweme.shortvideo.a.d dVar = this.A;
            if (dVar != null) {
                dVar.f();
            }
            ej.a().a((com.ss.android.ugc.aweme.shortvideo.e) null);
        }
        String stringExtra = a2.getStringExtra("mp4");
        if (stringExtra != null) {
            com.ss.android.ugc.aweme.port.in.a.i.f().a(stringExtra, str2);
        }
        if (!this.w) {
            Intent intent11 = this.r;
            if (intent11 != null) {
                str6 = intent11.getStringExtra("enter_from");
            } else {
                str6 = null;
            }
            if (!TextUtils.equals(str6, "from_chat")) {
                if (com.ss.android.ugc.aweme.story.shootvideo.d.a(a2.getIntExtra("shoot_mode", -1))) {
                    ((IAVService) ServiceManager.get().getService(IAVService.class)).startStoryEditActivity(requireActivity(), a2);
                    return;
                } else {
                    VEVideoPublishEditActivity.a((Context) requireActivity(), a2, 1);
                    return;
                }
            }
        }
        Intent intent12 = this.r;
        if (intent12 != null) {
            str7 = intent12.getStringExtra("enter_from");
        }
        if (TextUtils.equals(str7, "from_chat")) {
            a2.putExtra("extra_request_code", 4);
        }
        if (com.ss.android.ugc.aweme.story.shootvideo.d.a(a2.getIntExtra("shoot_mode", -1))) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).startStoryEditActivity(requireActivity(), a2);
        } else {
            VEVideoPublishEditActivity.a((Activity) requireActivity(), a2, 1);
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        String str;
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f66193a, false, 75571, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f66193a, false, 75571, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        c().setOnClickListener(new q(this));
        x();
        View findViewById = view.findViewById(C0906R.id.d3x);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.title_menu)");
        this.n = (RelativeLayout) findViewById;
        View findViewById2 = view.findViewById(C0906R.id.ml);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.bottom_menu)");
        this.o = (LinearLayout) findViewById2;
        if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75580, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75580, new Class[0], Void.TYPE);
            return;
        }
        Bundle arguments = getArguments();
        ArrayList arrayList = null;
        if (arguments != null) {
            str = arguments.getString("single_video_path");
        } else {
            str = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arrayList = arguments2.getParcelableArrayList("multi_video_path_list");
        }
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence) || arrayList == null || !arrayList.isEmpty()) {
            if (com.ss.android.g.a.b()) {
                a().setMaxVideoLength(60000);
            }
            if (this.s) {
                a().setMinVideoLength(1000);
                a().setMaxVideoLength(10000);
                Context context = getContext();
                if (context == null) {
                    Intrinsics.throwNpe();
                }
                a(2130838236, ContextCompat.getColor(context, C0906R.color.a6j));
            }
            a().a(true);
            if (!TextUtils.isEmpty(charSequence)) {
                VEVideoEditView a2 = a();
                FragmentActivity activity = getActivity();
                CutMultiVideoViewModel cutMultiVideoViewModel = this.h;
                if (cutMultiVideoViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cutMultiVideoViewModel");
                }
                z2 = a2.a(activity, cutMultiVideoViewModel, str);
            } else {
                VEVideoEditView a3 = a();
                FragmentActivity activity2 = getActivity();
                CutMultiVideoViewModel cutMultiVideoViewModel2 = this.h;
                if (cutMultiVideoViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cutMultiVideoViewModel");
                }
                z2 = a3.a(activity2, cutMultiVideoViewModel2, (List<com.ss.android.ugc.aweme.music.b.a.a>) arrayList);
            }
            if (!z2) {
                y();
                return;
            }
            this.g = a().getEditState();
            if (PatchProxy.isSupport(new Object[0], this, f66193a, false, 75572, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66193a, false, 75572, new Class[0], Void.TYPE);
                return;
            }
            a.i.a((Callable<TResult>) new p<TResult>(this));
            return;
        }
        y();
    }

    @NotNull
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f66193a, false, 75570, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f66193a, false, 75570, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        View inflate = layoutInflater2.inflate(f(), viewGroup2, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(getLayoutRes(), container, false)");
        return inflate;
    }
}
