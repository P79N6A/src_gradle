package com.ss.android.ugc.aweme.story.shootvideo.record;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.filter.CircleViewPager;
import com.ss.android.ugc.aweme.filter.ac;
import com.ss.android.ugc.aweme.lego.lazy.LazyFragmentPagerAdapter;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.services.story.IStoryRecordService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.ej;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.fi;
import com.ss.android.ugc.aweme.shortvideo.gesture.defult.DefaultGesturePresenter;
import com.ss.android.ugc.aweme.shortvideo.local.UploadButton;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout;
import com.ss.android.ugc.aweme.shortvideo.widget.StoryRecordLayout;
import com.ss.android.ugc.aweme.story.shootvideo.record.base.AVRecordSurfaceFragment;
import com.ss.android.ugc.aweme.story.shootvideo.setting.StorySettingActivity;
import com.ss.android.ugc.aweme.story.shootvideo.textrecord.StoryTextRecordLayout;
import com.ss.android.ugc.aweme.story.widget.TabHost;
import com.ss.android.ugc.aweme.tools.am;
import com.ss.android.ugc.aweme.tools.au;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.be;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.utils.ax;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import java.util.HashMap;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 ¨\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002¨\u0001B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010H\u001a\u00020IH\u0016J\b\u0010J\u001a\u00020\u0017H\u0002J\b\u0010K\u001a\u00020IH\u0016J\u0010\u0010L\u001a\u00020\u00172\u0006\u0010M\u001a\u00020\u0019H\u0014J\b\u0010N\u001a\u00020\u0017H\u0002J\b\u0010O\u001a\u00020\u0017H\u0002J\b\u0010P\u001a\u00020\u0017H\u0016J\u0010\u0010Q\u001a\u00020\u00172\u0006\u0010R\u001a\u00020\u0019H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010S\u001a\u00020TH\u0016J\b\u0010U\u001a\u00020VH\u0016J\n\u0010W\u001a\u0004\u0018\u000105H\u0016J\b\u0010X\u001a\u00020\u0017H\u0002J\b\u0010Y\u001a\u00020\u0017H\u0002J\b\u0010Z\u001a\u00020\u0017H\u0002J\u0006\u0010[\u001a\u00020\u0017J\u0010\u0010\\\u001a\u00020\u00172\u0006\u0010]\u001a\u00020\nH\u0002J\b\u0010^\u001a\u00020\u0019H\u0002J\u0018\u0010_\u001a\u00020\u00192\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020cH\u0016J\b\u0010d\u001a\u00020aH\u0014J\b\u0010e\u001a\u00020\u0017H\u0002J\b\u0010f\u001a\u00020\u0017H\u0016J\b\u0010g\u001a\u00020\u0017H\u0002J\u0012\u0010h\u001a\u00020\u00172\b\u0010i\u001a\u0004\u0018\u00010jH\u0017J\"\u0010k\u001a\u00020\u00172\u0006\u0010l\u001a\u00020a2\u0006\u0010m\u001a\u00020a2\b\u0010n\u001a\u0004\u0018\u00010oH\u0016J\u0012\u0010p\u001a\u00020\u00172\b\u0010q\u001a\u0004\u0018\u00010rH\u0017J\u0018\u0010s\u001a\u00020\u00172\u0006\u0010t\u001a\u00020a2\u0006\u0010u\u001a\u00020aH\u0016J\u0012\u0010v\u001a\u00020\u00172\b\u0010i\u001a\u0004\u0018\u00010jH\u0017J\b\u0010w\u001a\u00020\u0017H\u0016J\u0018\u0010x\u001a\u00020\u00192\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020cH\u0016J\b\u0010y\u001a\u00020\u0017H\u0014J\b\u0010z\u001a\u00020\u0017H\u0014J\b\u0010{\u001a\u00020\u0017H\u0016J\u0010\u0010|\u001a\u00020\u00172\u0006\u0010}\u001a\u00020\u0019H\u0002J\b\u0010~\u001a\u00020\u0017H\u0014J\b\u0010\u001a\u00020\u0017H\u0016J\u0012\u0010\u0001\u001a\u00020\u00172\u0007\u0010\u0001\u001a\u00020jH\u0016J\t\u0010\u0001\u001a\u00020\u0017H\u0016J \u0010\u0001\u001a\u00020\u00172\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\t\u0010b\u001a\u0005\u0018\u00010\u0001H\u0016J\t\u0010\u0001\u001a\u00020\u0017H\u0016J\u001b\u0010\u0001\u001a\u00020\u00172\u0006\u0010]\u001a\u00020\n2\b\u0010i\u001a\u0004\u0018\u00010jH\u0017J\b\u0010 \u001a\u00020!H\u0014J\n\u0010\u0001\u001a\u00030\u0001H\u0014J\b\u0010(\u001a\u00020)H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0014J\b\u0010,\u001a\u00020-H\u0016J\u0012\u0010\u0001\u001a\u00020\u00172\u0007\u0010\u0001\u001a\u00020\u0019H\u0002J\t\u0010\u0001\u001a\u00020\u0017H\u0014J\u0011\u0010\u0001\u001a\u00020\u00172\u0006\u0010R\u001a\u00020\u0019H\u0016J\u0012\u0010\u0001\u001a\u00020\u00172\u0007\u0010\u0001\u001a\u00020\u0019H\u0002J\u0011\u0010\u0001\u001a\u00020\u00172\u0006\u0010R\u001a\u00020\u0019H\u0016J\u0012\u0010\u0001\u001a\u00020\u00172\u0007\u0010\u0001\u001a\u00020\u0019H\u0002J\u0012\u0010\u0001\u001a\u00020\u00172\u0007\u0010\u0001\u001a\u00020\u0019H\u0016J%\u0010\u0001\u001a\u00020\u00172\u0007\u0010\u0001\u001a\u00020\u00192\u0007\u0010\u0001\u001a\u00020\u00192\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0012\u0010\u0001\u001a\u00020\u00172\u0007\u0010\u0001\u001a\u00020\u0019H\u0016J\u0007\u0010\u0001\u001a\u00020\u0017J\t\u0010\u0001\u001a\u00020\u0017H\u0002J\u0010\u0010\u0001\u001a\u00020\u00172\u0007\u0010 \u0001\u001a\u00020\u0019J\u0013\u0010¡\u0001\u001a\u00020\u00172\b\u0010¢\u0001\u001a\u00030£\u0001H\u0002J\u001b\u0010¤\u0001\u001a\u00020\u00172\u0007\u0010¥\u0001\u001a\u00020a2\u0007\u0010¦\u0001\u001a\u00020aH\u0014J\t\u0010§\u0001\u001a\u00020GH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X.¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020#X.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020)X.¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X.¢\u0006\u0002\n\u0000R\u001b\u0010,\u001a\u00020-8BX\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b.\u0010/R\u000e\u00102\u001a\u000203X.¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X.¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X.¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020;X.¢\u0006\u0002\n\u0000R\u001c\u0010<\u001a\u0004\u0018\u00010=X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u000e\u0010B\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020GX.¢\u0006\u0002\n\u0000¨\u0006©\u0001"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordFragment;", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/AVRecordSurfaceFragment;", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordViewProvider;", "Landroid/arch/lifecycle/GenericLifecycleObserver;", "Lcom/ss/android/ugc/aweme/lego/lazy/LazyFragmentPagerAdapter$Laziable;", "Lcom/ss/android/ugc/aweme/services/story/IStoryRecordService$IStoryRecordFragment;", "()V", "boomBlinkAnimator", "Landroid/animation/ObjectAnimator;", "boomCover", "Landroid/view/View;", "bottomOperationView", "closeView", "cornersBottom", "Landroid/widget/RelativeLayout;", "cornersTop", "effectLayout", "extraLayout", "Landroid/widget/FrameLayout;", "gestureLayout", "Lcom/ss/android/ugc/aweme/shortvideo/ui/VideoRecordGestureLayout;", "hideRecordHintCallback", "Lkotlin/Function0;", "", "isImageLoaded", "", "ivEffectEntrance", "ivFlipCamera", "Landroid/widget/ImageView;", "ivSettings", "ivStoryBoom", "mSceneIndicator", "permissionChecker", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/PermissionChecker;", "presenter", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordPresenter;", "getPresenter$tools_story_impl_douyinCnRelease", "()Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordPresenter;", "setPresenter$tools_story_impl_douyinCnRelease", "(Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordPresenter;)V", "recordLayout", "Lcom/ss/android/ugc/aweme/shortvideo/widget/StoryRecordLayout;", "recordModeTabHost", "Lcom/ss/android/ugc/aweme/story/widget/TabHost;", "recordSurfaceProvider", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/RecordSurfaceProvider;", "getRecordSurfaceProvider", "()Lcom/ss/android/ugc/aweme/story/shootvideo/record/RecordSurfaceProvider;", "recordSurfaceProvider$delegate", "Lkotlin/Lazy;", "sceneRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "selfUiEventContext", "Lcom/ss/android/ugc/aweme/tools/UiEventContext;", "storyBottomTabHostPresenter", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryBottomTabHostPresenter;", "storyDefaultView", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryDefaultViewImpl;", "storyRecordTextLayout", "Lcom/ss/android/ugc/aweme/story/shootvideo/textrecord/StoryTextRecordLayout;", "storyScenePresenter", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/scene/StoryScenePresenter;", "getStoryScenePresenter$tools_story_impl_douyinCnRelease", "()Lcom/ss/android/ugc/aweme/story/shootvideo/record/scene/StoryScenePresenter;", "setStoryScenePresenter$tools_story_impl_douyinCnRelease", "(Lcom/ss/android/ugc/aweme/story/shootvideo/record/scene/StoryScenePresenter;)V", "surfaceCover", "titleLayout", "toolParentLayout", "tvRecordHint", "uploadButton", "Lcom/ss/android/ugc/aweme/shortvideo/local/UploadButton;", "asFragment", "Landroid/support/v4/app/Fragment;", "attachGesturePresenter", "attachPage", "beforeCameraOpen", "isReopen", "clearCloseViewA11yFocusStatus", "closeRecordPage", "dispatchStartRecording", "enableRecord", "isEnable", "filterViewPagerSupplier", "Lcom/ss/android/ugc/aweme/filter/FilterModule$ViewPagerSupplier;", "gesturePresenter", "Lcom/ss/android/ugc/aweme/shortvideo/gesture/defult/DefaultGesturePresenter;", "getUiEventContext", "hideRecordHint", "initData", "initRecordETParam", "initStoryConfigure", "initView", "view", "isLaunchAsActivity", "keyDown", "keyCode", "", "event", "Landroid/view/KeyEvent;", "layoutRes", "loadImage", "notifyFrontRearChanged", "observerLiveData", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onAttach", "context", "Landroid/content/Context;", "onBottomTabChange", "preIndex", "currentIndex", "onCreate", "onDestroy", "onKeyDown", "onPageClosed", "onPageOpen", "onPause", "onRecordStop", "isGoingNext", "onRequestPermissionFailed", "onResume", "onSaveInstanceState", "outState", "onStart", "onStateChanged", "source", "Landroid/arch/lifecycle/LifecycleOwner;", "Landroid/arch/lifecycle/Lifecycle$Event;", "onStop", "onViewCreated", "recordController", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/IRecorderController;", "recordModulesPresenter", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/AVRecordModulesPresenter;", "relayoutBottomLayout", "set", "requestPageInfoBeforeCameraOpen", "setPanelEnable", "setRecordLayoutVisibility", "isVisible", "setStoryBoomAnimateEnable", "setTopMargin", "setUserVisibleHint", "isVisibleToUser", "showOperationPanelWithAlphaAnimate", "hasAnimate", "duration", "", "showOrHideCommonButtons", "show", "showRecordHint", "try2FixAlphaWhenCameraOpen", "updateCorners", "hide", "updateFlipCameraA11yDescription", "cameraModule", "Lcom/ss/android/ugc/aweme/shortvideo/record/CameraModule;", "updateLayout", "videoWidth", "videoHeight", "uploadBtn", "Companion", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class StoryRecordFragment extends AVRecordSurfaceFragment implements GenericLifecycleObserver, LazyFragmentPagerAdapter.a, IStoryRecordService.IStoryRecordFragment, n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73788a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f73789b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(StoryRecordFragment.class), "recordSurfaceProvider", "getRecordSurfaceProvider()Lcom/ss/android/ugc/aweme/story/shootvideo/record/RecordSurfaceProvider;"))};
    public static boolean l;
    public static final a m = new a((byte) 0);
    private View A;
    private View B;
    private View C;
    private ImageView D;
    private View E;
    private StoryTextRecordLayout F;
    private View G;
    private f H;
    private RelativeLayout I;
    private RelativeLayout J;
    private FrameLayout K;
    private boolean L;
    private ObjectAnimator M;
    private final Lazy aa = LazyKt.lazy(new ab(this));
    private final Function0<Unit> ab = new d(this);
    private HashMap ac;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public l f73790c;

    /* renamed from: d  reason: collision with root package name */
    public StoryRecordLayout f73791d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f73792e;

    /* renamed from: f  reason: collision with root package name */
    public View f73793f;
    View g;
    public TabHost h;
    public RecyclerView i;
    @Nullable
    public com.ss.android.ugc.aweme.story.shootvideo.record.scene.b j;
    public e k;
    private c s;
    private bd t;
    private UploadButton u;
    private View v;
    private View w;
    private FrameLayout x;
    private VideoRecordGestureLayout y;
    private View z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordFragment$Companion;", "", "()V", "isStoryRecording", "", "()Z", "setStoryRecording", "(Z)V", "newInstance", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordFragment;", "arguments", "Landroid/os/Bundle;", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73794a;

        private a() {
        }

        public static void a(boolean z) {
            StoryRecordFragment.l = z;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @NotNull
        public final StoryRecordFragment a(@NotNull Bundle bundle) {
            Bundle bundle2 = bundle;
            if (PatchProxy.isSupport(new Object[]{bundle2}, this, f73794a, false, 85638, new Class[]{Bundle.class}, StoryRecordFragment.class)) {
                return (StoryRecordFragment) PatchProxy.accessDispatch(new Object[]{bundle2}, this, f73794a, false, 85638, new Class[]{Bundle.class}, StoryRecordFragment.class);
            }
            Intrinsics.checkParameterIsNotNull(bundle2, "arguments");
            StoryRecordFragment storyRecordFragment = new StoryRecordFragment();
            if (!bundle2.containsKey("shoot_way")) {
                bundle2.putString("shoot_way", "story");
            }
            if (!bundle2.containsKey("creation_id") || TextUtils.isEmpty(bundle2.getString("creation_id"))) {
                bundle2.putString("creation_id", UUID.randomUUID().toString());
            }
            if (!bundle2.containsKey("extra_launch_type")) {
                bundle2.putInt("extra_launch_type", 2);
            }
            storyRecordFragment.setArguments(bundle2);
            return storyRecordFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class aa extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ StoryRecordFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(StoryRecordFragment storyRecordFragment) {
            super(0);
            this.this$0 = storyRecordFragment;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85667, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85667, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.C();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/RecordSurfaceProvider;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ab extends Lambda implements Function0<d> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ StoryRecordFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ab(StoryRecordFragment storyRecordFragment) {
            super(0);
            this.this$0 = storyRecordFragment;
        }

        @NotNull
        public final d invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85668, new Class[0], d.class)) {
                return (d) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85668, new Class[0], d.class);
            } else if (this.this$0.E()) {
                Context context = this.this$0.getContext();
                if (context == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
                return new q(context, this.this$0);
            } else {
                Context context2 = this.this$0.getContext();
                if (context2 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(context2, "context!!");
                return new r(context2, this.this$0);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class ac implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73795a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryRecordFragment f73796b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f73797c;

        ac(StoryRecordFragment storyRecordFragment, boolean z) {
            this.f73796b = storyRecordFragment;
            this.f73797c = z;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f73795a, false, 85669, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f73795a, false, 85669, new Class[0], Void.TYPE);
                return;
            }
            if (this.f73797c) {
                StoryRecordFragment.a(this.f73796b).setAlpha(0.0f);
                View view = this.f73796b.O;
                Intrinsics.checkExpressionValueIsNotNull(view, "buttonsContainer");
                view.setVisibility(0);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class ad implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73798a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryRecordFragment f73799b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f73800c;

        ad(StoryRecordFragment storyRecordFragment, boolean z) {
            this.f73799b = storyRecordFragment;
            this.f73800c = z;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f73798a, false, 85670, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f73798a, false, 85670, new Class[0], Void.TYPE);
                return;
            }
            View view = this.f73799b.O;
            Intrinsics.checkExpressionValueIsNotNull(view, "buttonsContainer");
            view.setAlpha(1.0f);
            if (!this.f73800c) {
                View view2 = this.f73799b.O;
                Intrinsics.checkExpressionValueIsNotNull(view2, "buttonsContainer");
                view2.setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class ae implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73801a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryRecordFragment f73802b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f73803c;

        ae(StoryRecordFragment storyRecordFragment, boolean z) {
            this.f73802b = storyRecordFragment;
            this.f73803c = z;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f73801a, false, 85671, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f73801a, false, 85671, new Class[0], Void.TYPE);
                return;
            }
            if (this.f73803c) {
                TabHost tabHost = this.f73802b.h;
                if (tabHost == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recordModeTabHost");
                }
                if (tabHost.getCurrentIndex() == 3) {
                    StoryRecordFragment.a(this.f73802b).setAlpha(0.0f);
                    StoryRecordFragment.a(this.f73802b).setVisibility(0);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class af implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73804a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryRecordFragment f73805b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f73806c;

        af(StoryRecordFragment storyRecordFragment, boolean z) {
            this.f73805b = storyRecordFragment;
            this.f73806c = z;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f73804a, false, 85672, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f73804a, false, 85672, new Class[0], Void.TYPE);
                return;
            }
            StoryRecordFragment.a(this.f73805b).setAlpha(1.0f);
            if (!this.f73806c) {
                StoryRecordFragment.a(this.f73805b).setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class ag implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73807a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryRecordFragment f73808b;

        ag(StoryRecordFragment storyRecordFragment) {
            this.f73808b = storyRecordFragment;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f73807a, false, 85673, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f73807a, false, 85673, new Class[0], Void.TYPE);
                return;
            }
            StoryRecordFragment.d(this.f73808b).setVisibility(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "get"}, k = 3, mv = {1, 1, 15})
    static final class b implements ac.d {

        /* renamed from: a  reason: collision with root package name */
        public static final b f73809a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ CircleViewPager a() {
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73810a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryRecordFragment f73811b;

        c(StoryRecordFragment storyRecordFragment) {
            this.f73811b = storyRecordFragment;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f73810a, false, 85639, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f73810a, false, 85639, new Class[0], Void.TYPE);
                return;
            }
            StoryRecordFragment.d(this.f73811b).setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ StoryRecordFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(StoryRecordFragment storyRecordFragment) {
            super(0);
            this.this$0 = storyRecordFragment;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85640, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85640, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.B();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordFragment$initStoryConfigure$2$1"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73812a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryRecordFragment f73813b;

        e(StoryRecordFragment storyRecordFragment) {
            this.f73813b = storyRecordFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f73812a, false, 85641, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f73812a, false, 85641, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f73813b.y();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordFragment$initView$3", "Lcom/ss/android/ugc/aweme/utils/DebounceOnClickListener;", "doClick", "", "v", "Landroid/view/View;", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class f extends ax {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73814a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryRecordFragment f73815b;

        f(StoryRecordFragment storyRecordFragment) {
            this.f73815b = storyRecordFragment;
        }

        public final void a(@NotNull View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f73814a, false, 85642, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f73814a, false, 85642, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, NotifyType.VIBRATE);
            this.f73815b.C();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordFragment$initView$4", "Lcom/ss/android/ugc/aweme/utils/DebounceOnClickListener;", "doClick", "", "v", "Landroid/view/View;", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class g extends ax {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73816a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryRecordFragment f73817b;

        g(StoryRecordFragment storyRecordFragment) {
            this.f73817b = storyRecordFragment;
        }

        public final void a(@Nullable View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f73816a, false, 85643, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f73816a, false, 85643, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ShortVideoContextViewModel r = this.f73817b.r();
            Intrinsics.checkExpressionValueIsNotNull(r, "shortVideoContextViewModel");
            fh fhVar = r.f65401b;
            this.f73817b.a().r().a();
            Intrinsics.checkExpressionValueIsNotNull(fhVar, "shortVideoContext");
            if (PatchProxy.isSupport(new Object[]{fhVar}, null, g.f73933a, true, 85543, new Class[]{fh.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fhVar}, null, g.f73933a, true, 85543, new Class[]{fh.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fhVar, "shortVideoContext");
            com.ss.android.ugc.aweme.utils.a.f75468b.a("click_upload_entrance", g.a(fhVar).a("enter_from", "video_shoot_page").f34114b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordFragment$initView$5", "Lcom/ss/android/ugc/aweme/utils/DebounceOnClickListener;", "doClick", "", "view", "Landroid/view/View;", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class h extends ax {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73818a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryRecordFragment f73819b;

        h(StoryRecordFragment storyRecordFragment) {
            this.f73819b = storyRecordFragment;
        }

        public final void a(@Nullable View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f73818a, false, 85644, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f73818a, false, 85644, new Class[]{View.class}, Void.TYPE);
                return;
            }
            this.f73819b.y();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordFragment$initView$6", "Lcom/ss/android/ugc/aweme/utils/DebounceOnClickListener;", "doClick", "", "v", "Landroid/view/View;", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class i extends ax {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73820a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryRecordFragment f73821b;

        i(StoryRecordFragment storyRecordFragment) {
            this.f73821b = storyRecordFragment;
        }

        public final void a(@Nullable View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f73820a, false, 85645, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f73820a, false, 85645, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ShortVideoContextViewModel r = this.f73821b.r();
            Intrinsics.checkExpressionValueIsNotNull(r, "shortVideoContextViewModel");
            fh fhVar = r.f65401b;
            Intrinsics.checkExpressionValueIsNotNull(fhVar, "shortVideoContextViewModel.shortVideoContext");
            if (PatchProxy.isSupport(new Object[]{fhVar}, null, g.f73933a, true, 85547, new Class[]{fh.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fhVar}, null, g.f73933a, true, 85547, new Class[]{fh.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(fhVar, "shortVideoContext");
                com.ss.android.ugc.aweme.utils.a.f75468b.a("click_setting_entrance", g.a(fhVar).a("enter_from", "video_shoot_page").f34114b);
            }
            StorySettingActivity.a((Activity) this.f73821b.getActivity(), 2, 1, false, false, true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "event", "Landroid/view/MotionEvent;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function1<MotionEvent, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ StoryRecordFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(StoryRecordFragment storyRecordFragment) {
            super(1);
            this.this$0 = storyRecordFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((MotionEvent) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull MotionEvent motionEvent) {
            MotionEvent motionEvent2 = motionEvent;
            if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, changeQuickRedirect, false, 85646, new Class[]{MotionEvent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, changeQuickRedirect, false, 85646, new Class[]{MotionEvent.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(motionEvent2, "event");
            com.ss.android.ugc.aweme.story.shootvideo.record.scene.b bVar = this.this$0.j;
            if (bVar != null) {
                if (PatchProxy.isSupport(new Object[]{motionEvent2}, bVar, com.ss.android.ugc.aweme.story.shootvideo.record.scene.b.f74052a, false, 85935, new Class[]{MotionEvent.class}, Void.TYPE)) {
                    com.ss.android.ugc.aweme.story.shootvideo.record.scene.b bVar2 = bVar;
                    PatchProxy.accessDispatch(new Object[]{motionEvent2}, bVar2, com.ss.android.ugc.aweme.story.shootvideo.record.scene.b.f74052a, false, 85935, new Class[]{MotionEvent.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(motionEvent2, "event");
                    if (motionEvent.getAction() != 0 || bVar.s.getScrollState() == 0) {
                        bVar.s.dispatchTouchEvent(motionEvent2);
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73824a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryRecordFragment f73825b;

        k(StoryRecordFragment storyRecordFragment) {
            this.f73825b = storyRecordFragment;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f73824a, false, 85648, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f73824a, false, 85648, new Class[0], Void.TYPE);
                return;
            }
            StoryRecordFragment.b(this.f73825b).setEnabled(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73826a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryRecordFragment f73827b;

        l(StoryRecordFragment storyRecordFragment) {
            this.f73827b = storyRecordFragment;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f73826a, false, 85649, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f73826a, false, 85649, new Class[0], Void.TYPE);
                return;
            }
            StoryRecordFragment.b(this.f73827b).setRotation(0.0f);
            StoryRecordFragment.b(this.f73827b).setEnabled(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Boolean;)V", "com/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordFragment$observerLiveData$1$1"}, k = 3, mv = {1, 1, 15})
    static final class m<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73828a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryRecordFragment f73829b;

        m(StoryRecordFragment storyRecordFragment) {
            this.f73829b = storyRecordFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (PatchProxy.isSupport(new Object[]{bool}, this, f73828a, false, 85650, new Class[]{Boolean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bool}, this, f73828a, false, 85650, new Class[]{Boolean.class}, Void.TYPE);
                return;
            }
            this.f73829b.d(Intrinsics.areEqual((Object) bool, (Object) Boolean.FALSE));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Integer;)V", "com/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordFragment$observerLiveData$1$2"}, k = 3, mv = {1, 1, 15})
    static final class n<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73830a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryRecordFragment f73831b;

        n(StoryRecordFragment storyRecordFragment) {
            this.f73831b = storyRecordFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (PatchProxy.isSupport(new Object[]{num}, this, f73830a, false, 85651, new Class[]{Integer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{num}, this, f73830a, false, 85651, new Class[]{Integer.class}, Void.TYPE);
                return;
            }
            this.f73831b.y();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/CameraState;", "onChanged", "com/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordFragment$observerLiveData$1$3"}, k = 3, mv = {1, 1, 15})
    static final class o<T> implements Observer<com.ss.android.ugc.aweme.story.shootvideo.record.base.b> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73832a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryRecordFragment f73833b;

        o(StoryRecordFragment storyRecordFragment) {
            this.f73833b = storyRecordFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.story.shootvideo.record.base.b bVar = (com.ss.android.ugc.aweme.story.shootvideo.record.base.b) obj;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f73832a, false, 85652, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.record.base.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f73832a, false, 85652, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.record.base.b.class}, Void.TYPE);
            } else if (bVar != null) {
                switch (h.f73934a[bVar.ordinal()]) {
                    case 1:
                        this.f73833b.g(true);
                        com.ss.android.ugc.aweme.story.shootvideo.record.scene.b bVar2 = this.f73833b.j;
                        if (bVar2 != null) {
                            bVar2.b();
                        }
                        StoryRecordFragment storyRecordFragment = this.f73833b;
                        if (PatchProxy.isSupport(new Object[0], storyRecordFragment, StoryRecordFragment.f73788a, false, 85631, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], storyRecordFragment, StoryRecordFragment.f73788a, false, 85631, new Class[0], Void.TYPE);
                            break;
                        } else if (storyRecordFragment.q) {
                            StoryRecordLayout storyRecordLayout = storyRecordFragment.f73791d;
                            if (storyRecordLayout == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("recordLayout");
                            }
                            if (storyRecordLayout.getAlpha() != 1.0f) {
                                StoryRecordLayout storyRecordLayout2 = storyRecordFragment.f73791d;
                                if (storyRecordLayout2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("recordLayout");
                                }
                                storyRecordLayout2.setAlpha(1.0f);
                                View view = storyRecordFragment.O;
                                Intrinsics.checkExpressionValueIsNotNull(view, "buttonsContainer");
                                view.setAlpha(1.0f);
                                View view2 = storyRecordFragment.g;
                                if (view2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("surfaceCover");
                                }
                                view2.setAlpha(0.0f);
                                return;
                            }
                        }
                        break;
                    case 2:
                        Context context = this.f73833b.getContext();
                        if (context != null) {
                            com.ss.android.ugc.aweme.shortvideo.util.af afVar = com.ss.android.ugc.aweme.shortvideo.util.af.f71095c;
                            Intrinsics.checkExpressionValueIsNotNull(context, "context");
                            afVar.a(context, new Function0<Unit>(this.f73833b) {
                                public static ChangeQuickRedirect changeQuickRedirect;

                                public final String getName() {
                                    return "closeRecordPage";
                                }

                                public final KDeclarationContainer getOwner() {
                                    if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85654, new Class[0], KDeclarationContainer.class)) {
                                        return Reflection.getOrCreateKotlinClass(StoryRecordFragment.class);
                                    }
                                    return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85654, new Class[0], KDeclarationContainer.class);
                                }

                                public final String getSignature() {
                                    return "closeRecordPage()V";
                                }

                                public final void invoke() {
                                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85653, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85653, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    ((StoryRecordFragment) this.receiver).C();
                                }
                            }, new Function0<Unit>(this.f73833b) {
                                public static ChangeQuickRedirect changeQuickRedirect;

                                public final String getName() {
                                    return "closeRecordPage";
                                }

                                public final KDeclarationContainer getOwner() {
                                    if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85656, new Class[0], KDeclarationContainer.class)) {
                                        return Reflection.getOrCreateKotlinClass(StoryRecordFragment.class);
                                    }
                                    return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85656, new Class[0], KDeclarationContainer.class);
                                }

                                public final String getSignature() {
                                    return "closeRecordPage()V";
                                }

                                public final void invoke() {
                                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85655, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85655, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    ((StoryRecordFragment) this.receiver).C();
                                }
                            });
                            return;
                        }
                        break;
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Boolean;)V", "com/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordFragment$observerLiveData$1$4"}, k = 3, mv = {1, 1, 15})
    static final class p<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73834a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryRecordFragment f73835b;

        p(StoryRecordFragment storyRecordFragment) {
            this.f73835b = storyRecordFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (PatchProxy.isSupport(new Object[]{bool}, this, f73834a, false, 85657, new Class[]{Boolean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bool}, this, f73834a, false, 85657, new Class[]{Boolean.class}, Void.TYPE);
                return;
            }
            this.f73835b.g(Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "stateWrapper", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/RecordStateWrapper;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class q<T> implements Observer<com.ss.android.ugc.aweme.story.shootvideo.record.base.g> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73836a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryRecordFragment f73837b;

        q(StoryRecordFragment storyRecordFragment) {
            this.f73837b = storyRecordFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.story.shootvideo.record.base.f fVar;
            com.ss.android.ugc.aweme.story.shootvideo.record.base.g gVar = (com.ss.android.ugc.aweme.story.shootvideo.record.base.g) obj;
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{gVar}, this, f73836a, false, 85658, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.record.base.g.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{gVar}, this, f73836a, false, 85658, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.record.base.g.class}, Void.TYPE);
                return;
            }
            if (gVar != null) {
                fVar = gVar.f73900b;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                switch (h.f73935b[fVar.ordinal()]) {
                    case 1:
                        l a2 = this.f73837b.a();
                        if (PatchProxy.isSupport(new Object[0], a2, l.f73981a, false, 85735, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], a2, l.f73981a, false, 85735, new Class[0], Void.TYPE);
                            break;
                        } else {
                            a2.C.removeCallbacks(a2.h);
                            a2.C.post(a2.h);
                            return;
                        }
                    case 2:
                        ShortVideoContextViewModel r = this.f73837b.r();
                        Intrinsics.checkExpressionValueIsNotNull(r, "shortVideoContextViewModel");
                        long j = r.f65401b.n;
                        l a3 = this.f73837b.a();
                        boolean z2 = !gVar.f73901c;
                        if (PatchProxy.isSupport(new Object[]{new Long(j), Byte.valueOf(z2 ? (byte) 1 : 0)}, a3, l.f73981a, false, 85727, new Class[]{Long.TYPE, Boolean.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{new Long(j), Byte.valueOf(z2)}, a3, l.f73981a, false, 85727, new Class[]{Long.TYPE, Boolean.TYPE}, Void.TYPE);
                        } else {
                            a3.f73985e.a(true);
                            if (com.ss.android.medialib.camera.g.b().h()) {
                                a3.n().g();
                            } else {
                                com.ss.android.ugc.aweme.util.c.a("StoryRecord\nstopRecord,camera is not init yet,with recordLength:" + j);
                            }
                            if (!a3.a(j)) {
                                a3.f73983c.d();
                                if (!z2) {
                                    if (a3.f73984d.m()) {
                                        com.bytedance.ies.dmt.ui.d.a.b((Context) com.ss.android.ugc.aweme.port.in.a.f61119b, (int) C0906R.string.cfi).a();
                                    } else {
                                        a3.e();
                                    }
                                }
                                a3.f73983c.b();
                            } else if (!z2) {
                                a3.f73983c.a();
                            }
                        }
                        StoryRecordFragment storyRecordFragment = this.f73837b;
                        if (!this.f73837b.a().a(j) || !gVar.f73901c) {
                            z = false;
                        }
                        storyRecordFragment.k(z);
                        return;
                    case 3:
                        if (!gVar.f73901c) {
                            this.f73837b.d(true);
                            break;
                        }
                        break;
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "cameraPosition", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    static final class r<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73838a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryRecordFragment f73839b;

        r(StoryRecordFragment storyRecordFragment) {
            this.f73839b = storyRecordFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (PatchProxy.isSupport(new Object[]{num}, this, f73838a, false, 85659, new Class[]{Integer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{num}, this, f73838a, false, 85659, new Class[]{Integer.class}, Void.TYPE);
                return;
            }
            if (!(num == null || this.f73839b.a().n().h() == num.intValue())) {
                this.f73839b.y();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "duration", "", "onChanged", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 1, 15})
    static final class s<T> implements Observer<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73840a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryRecordFragment f73841b;

        s(StoryRecordFragment storyRecordFragment) {
            this.f73841b = storyRecordFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Long l = (Long) obj;
            if (PatchProxy.isSupport(new Object[]{l}, this, f73840a, false, 85660, new Class[]{Long.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{l}, this, f73840a, false, 85660, new Class[]{Long.class}, Void.TYPE);
                return;
            }
            if (l != null) {
                ShortVideoContextViewModel r = this.f73841b.r();
                Intrinsics.checkExpressionValueIsNotNull(r, "shortVideoContextViewModel");
                r.f65401b.f67720c = l.longValue();
                StoryRecordFragment.c(this.f73841b).setTotalRecordTime(l.longValue());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "isEnable", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class t<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73842a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryRecordFragment f73843b;

        t(StoryRecordFragment storyRecordFragment) {
            this.f73843b = storyRecordFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (PatchProxy.isSupport(new Object[]{bool}, this, f73842a, false, 85661, new Class[]{Boolean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bool}, this, f73842a, false, 85661, new Class[]{Boolean.class}, Void.TYPE);
                return;
            }
            StoryRecordFragment.c(this.f73843b).setEnabled(Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class u extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ StoryRecordFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(StoryRecordFragment storyRecordFragment) {
            super(0);
            this.this$0 = storyRecordFragment;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85662, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85662, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.a(this.this$0.a().n());
            this.this$0.z();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class v implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73844a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryRecordFragment f73845b;

        v(StoryRecordFragment storyRecordFragment) {
            this.f73845b = storyRecordFragment;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f73844a, false, 85663, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f73844a, false, 85663, new Class[0], Void.TYPE);
                return;
            }
            e eVar = this.f73845b.k;
            if (eVar != null) {
                e eVar2 = this.f73845b.k;
                e.a(eVar, 1, false, 2);
            }
            if (fc.a()) {
                this.f73845b.e(false);
                if (this.f73845b.getActivity() != null) {
                    StoryRecordFragment storyRecordFragment = this.f73845b;
                    ShortVideoContextViewModel r = this.f73845b.r();
                    Intrinsics.checkExpressionValueIsNotNull(r, "shortVideoContextViewModel");
                    int i = r.f65401b.j;
                    ShortVideoContextViewModel r2 = this.f73845b.r();
                    Intrinsics.checkExpressionValueIsNotNull(r2, "shortVideoContextViewModel");
                    storyRecordFragment.a(i, r2.f65401b.k);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class w extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ StoryRecordFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(StoryRecordFragment storyRecordFragment) {
            super(0);
            this.this$0 = storyRecordFragment;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85664, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85664, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.m(false);
            com.ss.android.ugc.aweme.story.shootvideo.record.scene.b bVar = this.this$0.j;
            if (bVar != null) {
                bVar.a(true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class x implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73846a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f73847b;

        x(View view) {
            this.f73847b = view;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f73846a, false, 85665, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f73846a, false, 85665, new Class[0], Void.TYPE);
                return;
            }
            this.f73847b.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class y extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ StoryRecordFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(StoryRecordFragment storyRecordFragment) {
            super(0);
            this.this$0 = storyRecordFragment;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85666, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85666, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.a(this.this$0.a().n());
            this.this$0.z();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class z extends Lambda implements Function0<Unit> {
        public static final z INSTANCE = new z();
        public static ChangeQuickRedirect changeQuickRedirect;

        z() {
            super(0);
        }

        public final void invoke() {
        }
    }

    public final void D() {
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85637, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85637, new Class[0], Void.TYPE);
            return;
        }
        if (this.ac != null) {
            this.ac.clear();
        }
    }

    @NotNull
    public Fragment asFragment() {
        return this;
    }

    @NotNull
    public final Fragment e() {
        return this;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        D();
    }

    @NotNull
    public final ac.d m() {
        return b.f73809a;
    }

    private final void K() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85630, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85630, new Class[0], Void.TYPE);
            return;
        }
        View view = this.v;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closeView");
        }
        if (Build.VERSION.SDK_INT >= 21) {
            i2 = 4194304;
        } else {
            i2 = 65536;
        }
        view.sendAccessibilityEvent(i2);
    }

    public final void C() {
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85629, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85629, new Class[0], Void.TYPE);
            return;
        }
        K();
        if (L()) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        } else {
            com.ss.android.ugc.aweme.y.b.a();
        }
        l = false;
    }

    @NotNull
    public final l a() {
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85576, new Class[0], l.class)) {
            return (l) PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85576, new Class[0], l.class);
        }
        l lVar = this.f73790c;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return lVar;
    }

    @NotNull
    public final FrameLayout b() {
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85579, new Class[0], FrameLayout.class)) {
            return (FrameLayout) PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85579, new Class[0], FrameLayout.class);
        }
        FrameLayout frameLayout = this.x;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("extraLayout");
        }
        return frameLayout;
    }

    @NotNull
    public final UploadButton c() {
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85580, new Class[0], UploadButton.class)) {
            return (UploadButton) PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85580, new Class[0], UploadButton.class);
        }
        UploadButton uploadButton = this.u;
        if (uploadButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uploadButton");
        }
        return uploadButton;
    }

    @NotNull
    public final DefaultGesturePresenter d() {
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85581, new Class[0], DefaultGesturePresenter.class)) {
            return (DefaultGesturePresenter) PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85581, new Class[0], DefaultGesturePresenter.class);
        }
        DefaultGesturePresenter defaultGesturePresenter = this.P;
        Intrinsics.checkExpressionValueIsNotNull(defaultGesturePresenter, "gesturePresenter");
        return defaultGesturePresenter;
    }

    @NotNull
    public final com.ss.android.ugc.aweme.story.shootvideo.record.base.a i() {
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85582, new Class[0], com.ss.android.ugc.aweme.story.shootvideo.record.base.a.class)) {
            return (com.ss.android.ugc.aweme.story.shootvideo.record.base.a) PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85582, new Class[0], com.ss.android.ugc.aweme.story.shootvideo.record.base.a.class);
        }
        l lVar = this.f73790c;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return lVar;
    }

    @NotNull
    public final c j() {
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85583, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85583, new Class[0], c.class);
        }
        c cVar = this.s;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permissionChecker");
        }
        return cVar;
    }

    @Nullable
    public final bd k() {
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85598, new Class[0], bd.class)) {
            return (bd) PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85598, new Class[0], bd.class);
        }
        bd bdVar = this.t;
        if (bdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selfUiEventContext");
        }
        return bdVar;
    }

    @NotNull
    public final com.ss.android.ugc.aweme.story.shootvideo.record.base.d l() {
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85584, new Class[0], com.ss.android.ugc.aweme.story.shootvideo.record.base.d.class)) {
            return (com.ss.android.ugc.aweme.story.shootvideo.record.base.d) PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85584, new Class[0], com.ss.android.ugc.aweme.story.shootvideo.record.base.d.class);
        }
        l lVar = this.f73790c;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return lVar.f73983c;
    }

    @NotNull
    public final StoryRecordLayout n() {
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85585, new Class[0], StoryRecordLayout.class)) {
            return (StoryRecordLayout) PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85585, new Class[0], StoryRecordLayout.class);
        }
        StoryRecordLayout storyRecordLayout = this.f73791d;
        if (storyRecordLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recordLayout");
        }
        return storyRecordLayout;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85599, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85599, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        com.ss.android.ugc.aweme.story.shootvideo.record.scene.b bVar = this.j;
        if (bVar != null) {
            bVar.b(false);
        }
        l = false;
        bd bdVar = this.t;
        if (bdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selfUiEventContext");
        }
        bdVar.a(false);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85596, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85596, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        l lVar = this.f73790c;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        lVar.i.b();
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85594, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85594, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        UploadButton uploadButton = this.u;
        if (uploadButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uploadButton");
        }
        uploadButton.b();
    }

    public final void x() {
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85614, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85614, new Class[0], Void.TYPE);
            return;
        }
        super.x();
        com.ss.android.ugc.aweme.story.shootvideo.record.scene.b bVar = this.j;
        if (bVar != null) {
            bVar.a(false);
        }
    }

    private final boolean L() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85632, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85632, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            obj = arguments.get("extra_launch_type");
        } else {
            obj = null;
        }
        return Intrinsics.areEqual(obj, (Object) 1);
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85607, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85607, new Class[0], Void.TYPE);
            return;
        }
        au auVar = new au(am.NORMAL);
        bd q2 = q();
        StoryRecordLayout storyRecordLayout = this.f73791d;
        if (storyRecordLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recordLayout");
        }
        bc bcVar = auVar;
        q2.a((Object) storyRecordLayout, bcVar);
        bd bdVar = this.t;
        if (bdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selfUiEventContext");
        }
        StoryRecordLayout storyRecordLayout2 = this.f73791d;
        if (storyRecordLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recordLayout");
        }
        bdVar.a((Object) storyRecordLayout2, bcVar);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85595, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85595, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.q) {
            l lVar = this.f73790c;
            if (lVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            if (!lVar.p().f()) {
                d(true);
            }
        }
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85593, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85593, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        if (this.q) {
            UploadButton uploadButton = this.u;
            if (uploadButton == null) {
                Intrinsics.throwUninitializedPropertyAccessException("uploadButton");
            }
            uploadButton.c();
            ShortVideoContextViewModel r2 = r();
            Intrinsics.checkExpressionValueIsNotNull(r2, "shortVideoContextViewModel");
            fh fhVar = r2.f65401b;
            Intrinsics.checkExpressionValueIsNotNull(fhVar, "shortVideoContextViewModel.shortVideoContext");
            l lVar = this.f73790c;
            if (lVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            com.ss.android.ugc.aweme.shortvideo.e.b bVar = lVar.u;
            l lVar2 = this.f73790c;
            if (lVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            g.a(fhVar, bVar.a(lVar2.n().h()));
        }
    }

    @NotNull
    public final d p() {
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85586, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85586, new Class[0], d.class);
        }
        if (!PatchProxy.isSupport(new Object[0], this, f73788a, false, 85578, new Class[0], d.class)) {
            return (d) this.aa.getValue();
        }
        return (d) PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85578, new Class[0], d.class);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.story.shootvideo.record.i] */
    /* JADX WARNING: type inference failed for: r2v3, types: [com.ss.android.ugc.aweme.story.shootvideo.record.i] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f73788a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 85627(0x14e7b, float:1.19989E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f73788a
            r5 = 0
            r6 = 85627(0x14e7b, float:1.19989E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            android.view.View r0 = r9.f73793f
            if (r0 != 0) goto L_0x002e
            java.lang.String r1 = "tvRecordHint"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x002e:
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
            android.view.View r0 = r9.f73793f
            if (r0 != 0) goto L_0x003e
            java.lang.String r1 = "tvRecordHint"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x003e:
            kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r9.ab
            if (r1 == 0) goto L_0x0048
            com.ss.android.ugc.aweme.story.shootvideo.record.i r2 = new com.ss.android.ugc.aweme.story.shootvideo.record.i
            r2.<init>(r1)
            r1 = r2
        L_0x0048:
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.removeCallbacks(r1)
            android.view.View r0 = r9.f73793f
            if (r0 != 0) goto L_0x0056
            java.lang.String r1 = "tvRecordHint"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0056:
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            r1 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment$ag r1 = new com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment$ag
            r1.<init>(r9)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            android.view.ViewPropertyAnimator r0 = r0.withStartAction(r1)
            r0.start()
            android.view.View r0 = r9.f73793f
            if (r0 != 0) goto L_0x007d
            java.lang.String r1 = "tvRecordHint"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x007d:
            kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r9.ab
            if (r1 == 0) goto L_0x0087
            com.ss.android.ugc.aweme.story.shootvideo.record.i r2 = new com.ss.android.ugc.aweme.story.shootvideo.record.i
            r2.<init>(r1)
            r1 = r2
        L_0x0087:
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r2 = 3000(0xbb8, double:1.482E-320)
            r0.postDelayed(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment.A():void");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.ss.android.ugc.aweme.story.shootvideo.record.i] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f73788a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 85628(0x14e7c, float:1.1999E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f73788a
            r5 = 0
            r6 = 85628(0x14e7c, float:1.1999E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            android.view.View r0 = r9.f73793f
            if (r0 != 0) goto L_0x002e
            java.lang.String r1 = "tvRecordHint"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x002e:
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0082
            android.view.View r0 = r9.f73793f
            if (r0 != 0) goto L_0x003d
            java.lang.String r1 = "tvRecordHint"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x003d:
            kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r9.ab
            if (r1 == 0) goto L_0x0047
            com.ss.android.ugc.aweme.story.shootvideo.record.i r2 = new com.ss.android.ugc.aweme.story.shootvideo.record.i
            r2.<init>(r1)
            r1 = r2
        L_0x0047:
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.removeCallbacks(r1)
            android.view.View r0 = r9.f73793f
            if (r0 != 0) goto L_0x0055
            java.lang.String r1 = "tvRecordHint"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0055:
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
            android.view.View r0 = r9.f73793f
            if (r0 != 0) goto L_0x0065
            java.lang.String r1 = "tvRecordHint"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0065:
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 0
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            r1 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment$c r1 = new com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment$c
            r1.<init>(r9)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            android.view.ViewPropertyAnimator r0 = r0.withEndAction(r1)
            r0.start()
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment.B():void");
    }

    public final void w() {
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85592, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85592, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.story.shootvideo.record.scene.b bVar = this.j;
        if (bVar != null) {
            bVar.b(false);
        }
        l = false;
        l lVar = this.f73790c;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        if (PatchProxy.isSupport(new Object[0], lVar, l.f73981a, false, 85728, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], lVar, l.f73981a, false, 85728, new Class[0], Void.TYPE);
        } else if (!lVar.f73984d.f()) {
            lVar.f73983c.a(true);
        }
        l lVar2 = this.f73790c;
        if (lVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        lVar2.j();
        l lVar3 = this.f73790c;
        if (lVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        lVar3.k();
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putString("enter_method", "");
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.putString("enter_from", "");
        }
        c cVar = this.s;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permissionChecker");
        }
        cVar.dismiss();
        g(false);
        String str = Build.BRAND;
        Intrinsics.checkExpressionValueIsNotNull(str, "Build.BRAND");
        if (str != null) {
            String lowerCase = str.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (Intrinsics.areEqual((Object) lowerCase, (Object) "nokia") || !com.ss.android.ugc.aweme.port.in.a.L.a(e.a.ShowLastStoryFrame)) {
                p().a().setVisibility(8);
            }
            e eVar = this.k;
            if (eVar != null) {
                e eVar2 = this.k;
                e.a(eVar, 1, false, 2);
            }
            UploadButton uploadButton = this.u;
            if (uploadButton == null) {
                Intrinsics.throwUninitializedPropertyAccessException("uploadButton");
            }
            uploadButton.b();
            super.w();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final void z() {
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85621, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85621, new Class[0], Void.TYPE);
            return;
        }
        ShortVideoContextViewModel r2 = r();
        Intrinsics.checkExpressionValueIsNotNull(r2, "shortVideoContextViewModel");
        r2.a(4);
        ShortVideoContextViewModel r3 = r();
        Intrinsics.checkExpressionValueIsNotNull(r3, "shortVideoContextViewModel");
        r3.f65401b.f67720c = 10000;
        ShortVideoContextViewModel r4 = r();
        Intrinsics.checkExpressionValueIsNotNull(r4, "shortVideoContextViewModel");
        r4.f65401b.f67721d = 1000;
        l lVar = this.f73790c;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        com.ss.android.ugc.aweme.shortvideo.local.a r5 = lVar.r();
        r5.f68332c = 5;
        r5.f68333d = false;
        r5.f68334e = 1000;
        r5.h = 1;
        l lVar2 = this.f73790c;
        if (lVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        StickerModule p2 = lVar2.p();
        p2.c(false);
        l lVar3 = this.f73790c;
        if (lVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        p2.a((com.ss.android.ugc.aweme.shortvideo.sticker.r) lVar3);
        p2.a((View.OnClickListener) new e(this));
        p2.a(StatusBarUtils.getStatusBarHeight(getContext()));
        l lVar4 = this.f73790c;
        if (lVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        lVar4.n().s = false;
    }

    public final void y() {
        boolean z2;
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85615, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85615, new Class[0], Void.TYPE);
            return;
        }
        ImageView imageView = this.f73792e;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivFlipCamera");
        }
        if (imageView.isEnabled()) {
            ImageView imageView2 = this.f73792e;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivFlipCamera");
            }
            imageView2.animate().rotationBy(-180.0f).setDuration(200).withStartAction(new k(this)).withEndAction(new l(this)).start();
            l lVar = this.f73790c;
            if (lVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            CameraModule n2 = lVar.n();
            n2.i();
            l lVar2 = this.f73790c;
            if (lVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            if (n2.h() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            lVar2.b(z2);
            ShortVideoContextViewModel r2 = r();
            Intrinsics.checkExpressionValueIsNotNull(r2, "shortVideoContextViewModel");
            fh fhVar = r2.f65401b;
            Intrinsics.checkExpressionValueIsNotNull(fhVar, "shortVideoContextViewModel.shortVideoContext");
            int h2 = n2.h();
            if (PatchProxy.isSupport(new Object[]{fhVar, Integer.valueOf(h2)}, null, g.f73933a, true, 85541, new Class[]{fh.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fhVar, Integer.valueOf(h2)}, null, g.f73933a, true, 85541, new Class[]{fh.class, Integer.TYPE}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(fhVar, "shortVideoContext");
                com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
                com.ss.android.ugc.aweme.app.d.d a2 = g.a(fhVar);
                if (h2 == 0) {
                    str = "back";
                } else {
                    str = "front";
                }
                aVar.a("flip_camera", a2.a("to_status", str).a("enter_from", "video_shoot_page").f34114b);
            }
            a(n2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x01df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v() {
        /*
            r15 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f73788a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 85591(0x14e57, float:1.19939E-40)
            r2 = r15
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f73788a
            r5 = 0
            r6 = 85591(0x14e57, float:1.19939E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.story.shootvideo.record.l r9 = r15.f73790c
            if (r9 != 0) goto L_0x002e
            java.lang.String r1 = "presenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x002e:
            android.content.Context r1 = r15.getContext()
            if (r1 == 0) goto L_0x0248
            r10 = r1
            com.bytedance.ies.uikit.base.AbsActivity r10 = (com.bytedance.ies.uikit.base.AbsActivity) r10
            r11 = 0
            com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment$y r1 = new com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment$y
            r1.<init>(r15)
            r12 = r1
            kotlin.jvm.functions.Function0 r12 = (kotlin.jvm.functions.Function0) r12
            r13 = 2
            r14 = 0
            r9.a(r10, "story", r12)
            com.ss.android.ugc.aweme.story.shootvideo.record.scene.b r1 = r15.j
            r2 = 1
            if (r1 == 0) goto L_0x004d
            r1.b(r2)
        L_0x004d:
            com.ss.android.ugc.aweme.story.shootvideo.record.j r1 = com.ss.android.ugc.aweme.story.shootvideo.record.j.f73940c
            android.content.Context r3 = r15.getContext()
            if (r3 != 0) goto L_0x0058
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0058:
            java.lang.String r4 = "context!!"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            boolean r1 = r1.a(r3)
            if (r1 != 0) goto L_0x0067
            r15.C()
            return
        L_0x0067:
            boolean r1 = com.ss.android.ugc.aweme.port.in.a.a()
            if (r1 == 0) goto L_0x0087
            android.content.Context r0 = r15.getContext()
            if (r0 == 0) goto L_0x0078
            android.content.Context r0 = r0.getApplicationContext()
            goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            r1 = 2131560091(0x7f0d069b, float:1.8745544E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r1)
            r0.a()
            r15.C()
            return
        L_0x0087:
            l = r2
            com.ss.android.ugc.aweme.story.shootvideo.record.d r1 = r15.p()
            android.view.View r1 = r1.a()
            r1.setVisibility(r0)
            com.ss.android.ugc.aweme.story.shootvideo.record.j r1 = com.ss.android.ugc.aweme.story.shootvideo.record.j.f73940c
            android.content.Context r3 = r15.getContext()
            if (r3 != 0) goto L_0x009f
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x009f:
            java.lang.String r4 = "context!!"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment$z r4 = com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment.z.INSTANCE
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment$aa r5 = new com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment$aa
            r5.<init>(r15)
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r1.a(r3, r4, r5)
            java.lang.Object[] r6 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r8 = f73788a
            r9 = 0
            r10 = 85620(0x14e74, float:1.19979E-40)
            java.lang.Class[] r11 = new java.lang.Class[r0]
            java.lang.Class r12 = java.lang.Void.TYPE
            r7 = r15
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)
            if (r1 == 0) goto L_0x00d7
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = f73788a
            r6 = 0
            r7 = 85620(0x14e74, float:1.19979E-40)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x01e8
        L_0x00d7:
            android.os.Bundle r0 = r15.getArguments()
            if (r0 == 0) goto L_0x01e8
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r1 = r15.r()
            java.lang.String r3 = "shortVideoContextViewModel"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            com.ss.android.ugc.aweme.shortvideo.fh r1 = r1.f65401b
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
            r1.q = r3
            java.lang.String r3 = "enter_from"
            java.lang.String r3 = r0.getString(r3)
            r1.s = r3
            java.lang.String r3 = "enter_method"
            java.lang.String r3 = r0.getString(r3)
            r1.t = r3
            java.lang.String r3 = "com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE"
            java.lang.String r0 = r0.getString(r3)
            r1.u = r0
            com.ss.android.ugc.aweme.shortvideo.a.d r0 = com.ss.android.ugc.aweme.shortvideo.a.d.a()
            r1.l = r0
            java.lang.String r0 = r1.s
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0137
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IMainService> r3 = com.ss.android.ugc.aweme.services.IMainService.class
            java.lang.Object r0 = r0.getService(r3)
            if (r0 != 0) goto L_0x0129
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0129:
            com.ss.android.ugc.aweme.services.IMainService r0 = (com.ss.android.ugc.aweme.services.IMainService) r0
            android.support.v4.app.FragmentActivity r3 = r15.getActivity()
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.String r0 = r0.getStoryEnterFromForMain(r3)
            r1.s = r0
        L_0x0137:
            java.lang.String r0 = "shortVideoContext"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r0)
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r0 = r1.d()
            java.lang.String r3 = r1.s
            if (r3 != 0) goto L_0x0146
            goto L_0x01d0
        L_0x0146:
            int r4 = r3.hashCode()
            r5 = -1271119582(0xffffffffb43c4122, float:-1.753256E-7)
            if (r4 == r5) goto L_0x01b8
            r5 = -667094460(0xffffffffd83cf244, float:-8.3099484E14)
            if (r4 == r5) goto L_0x0183
            r5 = -562830579(0xffffffffde73e30d, float:-4.39347612E18)
            if (r4 == r5) goto L_0x0178
            r5 = 1691937916(0x64d8ec7c, float:3.2012298E22)
            if (r4 == r5) goto L_0x0160
            goto L_0x01d0
        L_0x0160:
            java.lang.String r4 = "homepage_hot"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01d0
            java.lang.String r3 = "click_camera"
            java.lang.String r4 = r1.t
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 == 0) goto L_0x0175
            java.lang.String r3 = "homepage_hot_camera"
            goto L_0x01d2
        L_0x0175:
            java.lang.String r3 = "homepage_hot_slide"
            goto L_0x01d2
        L_0x0178:
            java.lang.String r4 = "personal_homepage"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01d0
            java.lang.String r3 = "personal_homepage_camera"
            goto L_0x01d2
        L_0x0183:
            java.lang.String r4 = "homepage_friends"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01d0
            java.lang.String r3 = r1.t
            if (r3 != 0) goto L_0x0190
            goto L_0x01b5
        L_0x0190:
            int r4 = r3.hashCode()
            r5 = -777013775(0xffffffffd1afb5f1, float:-9.4333968E10)
            if (r4 == r5) goto L_0x01aa
            r5 = 231485884(0xdcc31bc, float:1.2584444E-30)
            if (r4 == r5) goto L_0x019f
            goto L_0x01b5
        L_0x019f:
            java.lang.String r4 = "click_camera"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01b5
            java.lang.String r3 = "homepage_friends_camera"
            goto L_0x01d2
        L_0x01aa:
            java.lang.String r4 = "click_plus"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01b5
            java.lang.String r3 = "homepage_friends_plus"
            goto L_0x01d2
        L_0x01b5:
            java.lang.String r3 = "homepage_friends_slide"
            goto L_0x01d2
        L_0x01b8:
            java.lang.String r4 = "homepage_follow"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01d0
            java.lang.String r3 = "click_camera"
            java.lang.String r4 = r1.t
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 == 0) goto L_0x01cd
            java.lang.String r3 = "homepage_follow_camera"
            goto L_0x01d2
        L_0x01cd:
            java.lang.String r3 = "homepage_follow_plus"
            goto L_0x01d2
        L_0x01d0:
            java.lang.String r3 = ""
        L_0x01d2:
            r0.setStoryShootEntrance(r3)
            java.lang.String r0 = "shake"
            java.lang.String r3 = r1.t
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r3)
            if (r0 == 0) goto L_0x01e8
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r0 = r1.d()
            java.lang.String r1 = "shake"
            r0.setStoryShootEntrance(r1)
        L_0x01e8:
            android.content.Context r0 = r15.getContext()
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r1 = r15.r()
            java.lang.String r3 = "shortVideoContextViewModel"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            com.ss.android.ugc.aweme.shortvideo.fh r1 = r1.f65401b
            java.lang.String r3 = "shortVideoContextViewModel.shortVideoContext"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            com.ss.android.ugc.aweme.story.shootvideo.record.g.a((android.content.Context) r0, (com.ss.android.ugc.aweme.shortvideo.fh) r1)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r0 = r15.r()
            java.lang.String r1 = "shortVideoContextViewModel"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.fh r0 = r0.f65401b
            java.lang.String r1 = "shortVideoContextViewModel.shortVideoContext"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.story.shootvideo.record.l r1 = r15.f73790c
            if (r1 != 0) goto L_0x0218
            java.lang.String r3 = "presenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0218:
            com.ss.android.ugc.aweme.shortvideo.e.b r1 = r1.u
            com.ss.android.ugc.aweme.story.shootvideo.record.l r3 = r15.f73790c
            if (r3 != 0) goto L_0x0223
            java.lang.String r4 = "presenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x0223:
            com.ss.android.ugc.aweme.shortvideo.record.CameraModule r3 = r3.n()
            int r3 = r3.h()
            int r1 = r1.a(r3)
            com.ss.android.ugc.aweme.story.shootvideo.record.g.a((com.ss.android.ugc.aweme.shortvideo.fh) r0, (int) r1)
            r15.A()
            r15.d((boolean) r2)
            com.ss.android.ugc.aweme.shortvideo.local.UploadButton r0 = r15.u
            if (r0 != 0) goto L_0x0241
            java.lang.String r1 = "uploadButton"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0241:
            r0.c()
            super.v()
            return
        L_0x0248:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.bytedance.ies.uikit.base.AbsActivity"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment.v():void");
    }

    public static final /* synthetic */ RecyclerView a(StoryRecordFragment storyRecordFragment) {
        RecyclerView recyclerView = storyRecordFragment.i;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sceneRecyclerView");
        }
        return recyclerView;
    }

    public static final /* synthetic */ ImageView b(StoryRecordFragment storyRecordFragment) {
        ImageView imageView = storyRecordFragment.f73792e;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivFlipCamera");
        }
        return imageView;
    }

    public static final /* synthetic */ StoryRecordLayout c(StoryRecordFragment storyRecordFragment) {
        StoryRecordLayout storyRecordLayout = storyRecordFragment.f73791d;
        if (storyRecordLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recordLayout");
        }
        return storyRecordLayout;
    }

    public static final /* synthetic */ View d(StoryRecordFragment storyRecordFragment) {
        View view = storyRecordFragment.f73793f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvRecordHint");
        }
        return view;
    }

    public final void f(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f73788a, false, 85611, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f73788a, false, 85611, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        g(z2);
    }

    private final void n(boolean z2) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f73788a, false, 85605, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f73788a, false, 85605, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        RelativeLayout relativeLayout = this.I;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cornersTop");
        }
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (z2) {
                i2 = fc.c(getActivity());
            }
            layoutParams2.topMargin = i2;
            RelativeLayout relativeLayout2 = this.I;
            if (relativeLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cornersTop");
            }
            relativeLayout2.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    public final void d(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f73788a, false, 85602, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f73788a, false, 85602, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.d(z2);
        p(z2);
    }

    public final void e(boolean z2) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f73788a, false, 85603, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f73788a, false, 85603, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (fc.a()) {
            RelativeLayout relativeLayout = this.I;
            if (relativeLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cornersTop");
            }
            if (relativeLayout != null) {
                RelativeLayout relativeLayout2 = this.J;
                if (relativeLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cornersBottom");
                }
                if (relativeLayout2 != null) {
                    RelativeLayout relativeLayout3 = this.I;
                    if (relativeLayout3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cornersTop");
                    }
                    int i3 = 4;
                    if (z2) {
                        i2 = 4;
                    } else {
                        i2 = 0;
                    }
                    relativeLayout3.setVisibility(i2);
                    RelativeLayout relativeLayout4 = this.J;
                    if (relativeLayout4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cornersBottom");
                    }
                    if (!z2) {
                        i3 = 0;
                    }
                    relativeLayout4.setVisibility(i3);
                }
            }
        }
    }

    @MeasureFunction
    public void onAttach(@Nullable Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f73788a, false, 85587, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f73788a, false, 85587, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        super.onAttach(context);
        this.s = new k();
        n nVar = this;
        this.f73790c = new l(nVar, this);
        l lVar = this.f73790c;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        this.H = new f(nVar, lVar);
        bd a2 = new be().a((bh) new com.ss.android.ugc.aweme.shortvideo.bh(this)).a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "UiEventContextBuilder().…erFactory(this)).create()");
        this.t = a2;
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f73788a, false, 85597, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f73788a, false, 85597, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bundle, "outState");
        if (this.q) {
            l().e();
            StoryRecordLayout storyRecordLayout = this.f73791d;
            if (storyRecordLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recordLayout");
            }
            storyRecordLayout.b();
            l lVar = this.f73790c;
            if (lVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            lVar.a(false);
        }
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void p(boolean r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f73788a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 85626(0x14e7a, float:1.19988E-40)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f73788a
            r3 = 0
            r4 = 85626(0x14e7a, float:1.19988E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003a:
            com.ss.android.ugc.aweme.shortvideo.widget.StoryRecordLayout r0 = r9.f73791d
            if (r0 != 0) goto L_0x0043
            java.lang.String r1 = "recordLayout"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0043:
            r1 = 8
            if (r10 == 0) goto L_0x0049
            r2 = 0
            goto L_0x004b
        L_0x0049:
            r2 = 8
        L_0x004b:
            r0.setVisibility(r2)
            android.view.View r0 = r9.B
            if (r0 != 0) goto L_0x0057
            java.lang.String r2 = "ivStoryBoom"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0057:
            if (r10 == 0) goto L_0x0065
            com.ss.android.ugc.aweme.story.shootvideo.record.e r2 = r9.k
            if (r2 == 0) goto L_0x0065
            boolean r2 = r2.a()
            if (r2 != r7) goto L_0x0065
            r2 = 0
            goto L_0x0067
        L_0x0065:
            r2 = 8
        L_0x0067:
            r0.setVisibility(r2)
            android.support.v7.widget.RecyclerView r0 = r9.i
            if (r0 != 0) goto L_0x0073
            java.lang.String r2 = "sceneRecyclerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0073:
            if (r10 == 0) goto L_0x0080
            com.ss.android.ugc.aweme.story.shootvideo.record.e r2 = r9.k
            if (r2 == 0) goto L_0x0080
            boolean r2 = r2.b()
            if (r2 != r7) goto L_0x0080
            r1 = 0
        L_0x0080:
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment.p(boolean):void");
    }

    public final void g(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f73788a, false, 85612, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f73788a, false, 85612, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.g(z2);
        StoryRecordLayout storyRecordLayout = this.f73791d;
        if (storyRecordLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recordLayout");
        }
        storyRecordLayout.setEnabled(z2);
        UploadButton uploadButton = this.u;
        if (uploadButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uploadButton");
        }
        uploadButton.setEnabled(z2);
        View view = this.C;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivEffectEntrance");
        }
        view.setEnabled(z2);
        View view2 = this.z;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("effectLayout");
        }
        view2.setEnabled(z2);
        TabHost tabHost = this.h;
        if (tabHost == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recordModeTabHost");
        }
        tabHost.setEnabled(z2);
        View view3 = this.O;
        Intrinsics.checkExpressionValueIsNotNull(view3, "buttonsContainer");
        view3.setEnabled(z2);
        ImageView imageView = this.D;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivSettings");
        }
        imageView.setEnabled(z2);
        ImageView imageView2 = this.f73792e;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivFlipCamera");
        }
        imageView2.setEnabled(z2);
    }

    public final void i(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f73788a, false, 85613, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f73788a, false, 85613, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.i(z2);
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85633, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85633, new Class[0], Void.TYPE);
        } else if (!this.L) {
            UploadButton uploadButton = this.u;
            if (uploadButton == null) {
                Intrinsics.throwUninitializedPropertyAccessException("uploadButton");
            }
            this.L = uploadButton.a();
        }
        if (z2) {
            l lVar = this.f73790c;
            if (lVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            lVar.n().a(0);
            l lVar2 = this.f73790c;
            if (lVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            lVar2.b(false);
        }
    }

    public final void j(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f73788a, false, 85617, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f73788a, false, 85617, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.M == null) {
            View view = this.A;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("boomCover");
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 0.4f});
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(2);
            ofFloat.setDuration(10);
            this.M = ofFloat;
        }
        if (z2) {
            View view2 = this.A;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("boomCover");
            }
            view2.setVisibility(0);
            View view3 = this.A;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("boomCover");
            }
            view3.setAlpha(0.0f);
            ObjectAnimator objectAnimator = this.M;
            if (objectAnimator != null) {
                objectAnimator.start();
            }
        } else {
            ObjectAnimator objectAnimator2 = this.M;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            View view4 = this.A;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("boomCover");
            }
            view4.setVisibility(8);
        }
    }

    public final void k(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f73788a, false, 85625, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f73788a, false, 85625, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        f(true);
        StoryRecordLayout storyRecordLayout = this.f73791d;
        if (storyRecordLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recordLayout");
        }
        storyRecordLayout.b();
        StoryRecordLayout storyRecordLayout2 = this.f73791d;
        if (storyRecordLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recordLayout");
        }
        storyRecordLayout2.setEnabled(!z2);
        ShortVideoContextViewModel r2 = r();
        Intrinsics.checkExpressionValueIsNotNull(r2, "shortVideoContextViewModel");
        if (r2.l()) {
            j(false);
        }
        if (z2) {
            p(false);
            return;
        }
        a(true, true, 300);
        com.ss.android.ugc.aweme.story.shootvideo.record.scene.b bVar = this.j;
        if (bVar != null) {
            bVar.b();
        }
    }

    @MeasureFunction
    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f73788a, false, 85590, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f73788a, false, 85590, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        if (fc.a()) {
            RelativeLayout relativeLayout = this.I;
            if (relativeLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cornersTop");
            }
            relativeLayout.setVisibility(0);
            RelativeLayout relativeLayout2 = this.J;
            if (relativeLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cornersBottom");
            }
            relativeLayout2.setVisibility(0);
        }
        if (bundle != null) {
            l lVar = this.f73790c;
            if (lVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            Context context = getContext();
            if (context != null) {
                lVar.a((AbsActivity) context, "story", new u(this));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.uikit.base.AbsActivity");
            }
        }
        TabHost tabHost = this.h;
        if (tabHost == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recordModeTabHost");
        }
        tabHost.post(new v(this));
        if (L() || !com.ss.android.ugc.aweme.story.shootvideo.record.a.a.b.f73856c.a(new w(this))) {
            this.p = true;
        }
    }

    @MeasureFunction
    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f73788a, false, 85588, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f73788a, false, 85588, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        getLifecycle().addObserver(this);
        if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85619, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85619, new Class[0], Void.TYPE);
            return;
        }
        fh a2 = fi.a(getArguments());
        Intrinsics.checkExpressionValueIsNotNull(a2, "ShortVideoContextFactory…eateFromBundle(arguments)");
        a2.N = 4;
        a2.d().setShootMode(4);
        AVETParameter d2 = a2.d();
        String str = a2.r;
        Intrinsics.checkExpressionValueIsNotNull(str, "shortVideoContext.shootWay");
        d2.setShootWay(str);
        ej a3 = ej.a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "PublishManager.inst()");
        a3.f67531d = a2.r;
        com.ss.android.ugc.aweme.shortvideo.d.a.a(a2.q);
        ShortVideoContextViewModel r2 = r();
        Intrinsics.checkExpressionValueIsNotNull(r2, "shortVideoContextViewModel");
        r2.f65401b = a2;
        ShortVideoContextViewModel r3 = r();
        Intrinsics.checkExpressionValueIsNotNull(r3, "shortVideoContextViewModel");
        r3.a(a2.N);
        a2.r = a2.r;
        if (L()) {
            this.q = true;
        }
    }

    public void setUserVisibleHint(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f73788a, false, 85622, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f73788a, false, 85622, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z2);
        if (this.r) {
            if (z2) {
                View view = this.O;
                Intrinsics.checkExpressionValueIsNotNull(view, "buttonsContainer");
                view.setAlpha(1.0f);
                StoryRecordLayout storyRecordLayout = this.f73791d;
                if (storyRecordLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recordLayout");
                }
                storyRecordLayout.setAlpha(1.0f);
                StoryTextRecordLayout storyTextRecordLayout = this.F;
                if (storyTextRecordLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("storyRecordTextLayout");
                }
                storyTextRecordLayout.setAlpha(1.0f);
                F().setAlpha(1.0f);
                com.ss.android.ugc.aweme.story.shootvideo.textfont.d.a().a((Context) getActivity());
                return;
            }
            l lVar = this.f73790c;
            if (lVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            lVar.i.f74236f = false;
            l lVar2 = this.f73790c;
            if (lVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            lVar2.i.a(false);
        }
    }

    public final void a(CameraModule cameraModule) {
        CharSequence charSequence;
        ImageView imageView;
        int i2;
        if (PatchProxy.isSupport(new Object[]{cameraModule}, this, f73788a, false, 85616, new Class[]{CameraModule.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cameraModule}, this, f73788a, false, 85616, new Class[]{CameraModule.class}, Void.TYPE);
            return;
        }
        ImageView imageView2 = this.f73792e;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivFlipCamera");
        }
        if (!imageView2.isEnabled()) {
            imageView = this.f73792e;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivFlipCamera");
            }
            charSequence = null;
        } else {
            imageView = this.f73792e;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivFlipCamera");
            }
            Context context = getContext();
            if (context != null) {
                if (cameraModule.h() == 0) {
                    i2 = C0906R.string.w;
                } else if (cameraModule.h() == 1) {
                    i2 = C0906R.string.u;
                } else {
                    i2 = C0906R.string.v;
                }
                String string = context.getString(i2);
                if (string != null) {
                    charSequence = string;
                }
            }
            charSequence = "";
        }
        imageView.setContentDescription(charSequence);
    }

    private final void o(boolean z2) {
        int i2;
        Context context;
        Context context2;
        float f2;
        Context context3;
        float f3;
        Context context4;
        float f4;
        Context context5;
        float f5;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f73788a, false, 85606, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f73788a, false, 85606, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0906R.dimen.cf);
        RelativeLayout relativeLayout = this.J;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cornersBottom");
        }
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (z2) {
                i2 = dimensionPixelSize;
            } else {
                i2 = 0;
            }
            layoutParams2.bottomMargin = i2;
            RelativeLayout relativeLayout2 = this.J;
            if (relativeLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cornersBottom");
            }
            relativeLayout2.setLayoutParams(layoutParams2);
            TabHost tabHost = this.h;
            if (tabHost == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recordModeTabHost");
            }
            ViewGroup.LayoutParams layoutParams3 = tabHost.getLayoutParams();
            if (layoutParams3 != null) {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                float f6 = 40.0f;
                if (!z2) {
                    FragmentActivity activity = getActivity();
                    if (activity == null) {
                        Intrinsics.throwNpe();
                    }
                    dimensionPixelSize = (int) UIUtils.dip2Px(activity, 40.0f);
                }
                layoutParams4.height = dimensionPixelSize;
                TabHost tabHost2 = this.h;
                if (tabHost2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recordModeTabHost");
                }
                tabHost2.setLayoutParams(layoutParams4);
                View view = this.w;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bottomOperationView");
                }
                ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
                if (layoutParams5 != null) {
                    RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
                    if (z2) {
                        FragmentActivity activity2 = getActivity();
                        if (activity2 == null) {
                            Intrinsics.throwNpe();
                        }
                        context = activity2;
                        f6 = 73.0f;
                    } else {
                        FragmentActivity activity3 = getActivity();
                        if (activity3 == null) {
                            Intrinsics.throwNpe();
                        }
                        context = activity3;
                    }
                    layoutParams6.bottomMargin = (int) UIUtils.dip2Px(context, f6);
                    View view2 = this.w;
                    if (view2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("bottomOperationView");
                    }
                    view2.setLayoutParams(layoutParams6);
                    StoryRecordLayout storyRecordLayout = this.f73791d;
                    if (storyRecordLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recordLayout");
                    }
                    ViewGroup.LayoutParams layoutParams7 = storyRecordLayout.getLayoutParams();
                    if (layoutParams7 != null) {
                        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
                        if (z2) {
                            FragmentActivity activity4 = getActivity();
                            if (activity4 == null) {
                                Intrinsics.throwNpe();
                            }
                            context2 = activity4;
                            f2 = 68.0f;
                        } else {
                            FragmentActivity activity5 = getActivity();
                            if (activity5 == null) {
                                Intrinsics.throwNpe();
                            }
                            context2 = activity5;
                            f2 = 35.0f;
                        }
                        layoutParams8.bottomMargin = (int) UIUtils.dip2Px(context2, f2);
                        StoryRecordLayout storyRecordLayout2 = this.f73791d;
                        if (storyRecordLayout2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("recordLayout");
                        }
                        storyRecordLayout2.setLayoutParams(layoutParams8);
                        View view3 = this.f73793f;
                        if (view3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("tvRecordHint");
                        }
                        ViewGroup.LayoutParams layoutParams9 = view3.getLayoutParams();
                        if (layoutParams9 != null) {
                            RelativeLayout.LayoutParams layoutParams10 = (RelativeLayout.LayoutParams) layoutParams9;
                            if (z2) {
                                FragmentActivity activity6 = getActivity();
                                if (activity6 == null) {
                                    Intrinsics.throwNpe();
                                }
                                context3 = activity6;
                                f3 = 193.0f;
                            } else {
                                FragmentActivity activity7 = getActivity();
                                if (activity7 == null) {
                                    Intrinsics.throwNpe();
                                }
                                context3 = activity7;
                                f3 = 160.0f;
                            }
                            layoutParams10.bottomMargin = (int) UIUtils.dip2Px(context3, f3);
                            View view4 = this.f73793f;
                            if (view4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("tvRecordHint");
                            }
                            view4.setLayoutParams(layoutParams10);
                            View view5 = this.B;
                            if (view5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("ivStoryBoom");
                            }
                            ViewGroup.LayoutParams layoutParams11 = view5.getLayoutParams();
                            if (layoutParams11 != null) {
                                FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) layoutParams11;
                                if (z2) {
                                    FragmentActivity activity8 = getActivity();
                                    if (activity8 == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    context4 = activity8;
                                    f4 = 115.5f;
                                } else {
                                    FragmentActivity activity9 = getActivity();
                                    if (activity9 == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    context4 = activity9;
                                    f4 = 82.5f;
                                }
                                layoutParams12.bottomMargin = (int) UIUtils.dip2Px(context4, f4);
                                View view6 = this.B;
                                if (view6 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("ivStoryBoom");
                                }
                                view6.setLayoutParams(layoutParams12);
                                RecyclerView recyclerView = this.i;
                                if (recyclerView == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("sceneRecyclerView");
                                }
                                ViewGroup.LayoutParams layoutParams13 = recyclerView.getLayoutParams();
                                if (layoutParams13 != null) {
                                    FrameLayout.LayoutParams layoutParams14 = (FrameLayout.LayoutParams) layoutParams13;
                                    if (z2) {
                                        FragmentActivity activity10 = getActivity();
                                        if (activity10 == null) {
                                            Intrinsics.throwNpe();
                                        }
                                        i3 = (int) UIUtils.dip2Px(activity10, 33.0f);
                                    }
                                    layoutParams14.bottomMargin = i3;
                                    RecyclerView recyclerView2 = this.i;
                                    if (recyclerView2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("sceneRecyclerView");
                                    }
                                    recyclerView2.setLayoutParams(layoutParams14);
                                    FrameLayout frameLayout = this.K;
                                    if (frameLayout == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mSceneIndicator");
                                    }
                                    ViewGroup.LayoutParams layoutParams15 = frameLayout.getLayoutParams();
                                    if (layoutParams15 != null) {
                                        RelativeLayout.LayoutParams layoutParams16 = (RelativeLayout.LayoutParams) layoutParams15;
                                        if (z2) {
                                            FragmentActivity activity11 = getActivity();
                                            if (activity11 == null) {
                                                Intrinsics.throwNpe();
                                            }
                                            context5 = activity11;
                                            f5 = 189.0f;
                                        } else {
                                            FragmentActivity activity12 = getActivity();
                                            if (activity12 == null) {
                                                Intrinsics.throwNpe();
                                            }
                                            context5 = activity12;
                                            f5 = 156.0f;
                                        }
                                        layoutParams16.bottomMargin = (int) UIUtils.dip2Px(context5, f5);
                                        FrameLayout frameLayout2 = this.K;
                                        if (frameLayout2 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mSceneIndicator");
                                        }
                                        frameLayout2.setLayoutParams(layoutParams16);
                                        return;
                                    }
                                    throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                }
                                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    public boolean keyDown(int i2, @NotNull KeyEvent keyEvent) {
        KeyEvent keyEvent2 = keyEvent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), keyEvent2}, this, f73788a, false, 85635, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), keyEvent2}, this, f73788a, false, 85635, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(keyEvent2, "event");
        return a(i2, keyEvent);
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f73788a, false, 85604, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f73788a, false, 85604, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (fc.a()) {
            View view = this.A;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("boomCover");
            }
            fb.a(view, (Context) getActivity(), i2, i3);
            StoryTextRecordLayout storyTextRecordLayout = this.F;
            if (storyTextRecordLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("storyRecordTextLayout");
            }
            storyTextRecordLayout.a();
            switch (fb.f67663b) {
                case 1:
                    n(true);
                    o(true);
                    return;
                case 2:
                    n(false);
                    o(true);
                    return;
                case 3:
                    n(true);
                    o(false);
                    return;
                case 4:
                    n(true);
                    o(true);
                    return;
                case 5:
                    n(false);
                    o(true);
                    return;
                case 6:
                    n(true);
                    o(false);
                    return;
                case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                    n(false);
                    o(false);
                    return;
                default:
                    n(false);
                    o(false);
                    return;
            }
        }
    }

    public void onStateChanged(@Nullable LifecycleOwner lifecycleOwner, @Nullable Lifecycle.Event event) {
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner, event}, this, f73788a, false, 85634, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner, event}, this, f73788a, false, 85634, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE);
        } else if (event != null) {
            switch (h.f73936c[event.ordinal()]) {
                case 1:
                    if (PatchProxy.isSupport(new Object[0], this, f73788a, false, 85624, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85624, new Class[0], Void.TYPE);
                        break;
                    } else {
                        l lVar = this.f73790c;
                        if (lVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("presenter");
                        }
                        if (lVar != null) {
                            com.ss.android.ugc.aweme.story.shootvideo.record.base.h hVar = lVar;
                            LifecycleOwner lifecycleOwner2 = this;
                            hVar.I.observe(lifecycleOwner2, new m(this));
                            hVar.J.observe(lifecycleOwner2, new n(this));
                            hVar.r.observe(lifecycleOwner2, new o(this));
                            hVar.E.observe(lifecycleOwner2, new p(this));
                            l().c().observe(lifecycleOwner2, new q(this));
                            l lVar2 = this.f73790c;
                            if (lVar2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("presenter");
                            }
                            lVar2.f73986f.f74043c.observe(lifecycleOwner2, new r(this));
                            l lVar3 = this.f73790c;
                            if (lVar3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("presenter");
                            }
                            lVar3.f73985e.f73850c.observe(lifecycleOwner2, new s(this));
                            l lVar4 = this.f73790c;
                            if (lVar4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("presenter");
                            }
                            lVar4.f73986f.f74044d.observe(lifecycleOwner2, new t(this));
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.story.shootvideo.record.base.SimpleRecordModulesPresenter");
                    }
                case 2:
                    l lVar5 = this.f73790c;
                    if (lVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("presenter");
                    }
                    if (lVar5.D) {
                        if (!PatchProxy.isSupport(new Object[0], this, f73788a, false, 85623, new Class[0], Void.TYPE)) {
                            if (this.P != null) {
                                DefaultGesturePresenter defaultGesturePresenter = this.P;
                                VideoRecordGestureLayout videoRecordGestureLayout = this.y;
                                if (videoRecordGestureLayout == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("gestureLayout");
                                }
                                defaultGesturePresenter.a((View) videoRecordGestureLayout);
                                break;
                            } else {
                                LifecycleOwner lifecycleOwner3 = this;
                                f fVar = this.H;
                                if (fVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("storyDefaultView");
                                }
                                com.ss.android.ugc.aweme.shortvideo.gesture.defult.c cVar = fVar;
                                VideoRecordGestureLayout videoRecordGestureLayout2 = this.y;
                                if (videoRecordGestureLayout2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("gestureLayout");
                                }
                                this.P = new DefaultGesturePresenter(lifecycleOwner3, cVar, videoRecordGestureLayout2);
                                DefaultGesturePresenter defaultGesturePresenter2 = this.P;
                                View view = this.C;
                                if (view == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("ivEffectEntrance");
                                }
                                defaultGesturePresenter2.b(view);
                                return;
                            }
                        } else {
                            PatchProxy.accessDispatch(new Object[0], this, f73788a, false, 85623, new Class[0], Void.TYPE);
                            return;
                        }
                    }
                    break;
            }
        }
    }

    public final void b(int i2, int i3) {
        float f2;
        int i4;
        String str;
        int i5 = i2;
        int i6 = i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f73788a, false, 85609, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f73788a, false, 85609, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        e eVar = this.k;
        if (eVar != null && eVar.f73924b) {
            ShortVideoContextViewModel r2 = r();
            Intrinsics.checkExpressionValueIsNotNull(r2, "shortVideoContextViewModel");
            fh fhVar = r2.f65401b;
            Intrinsics.checkExpressionValueIsNotNull(fhVar, "shortVideoContextViewModel.shortVideoContext");
            if (PatchProxy.isSupport(new Object[]{fhVar, Integer.valueOf(i3)}, null, g.f73933a, true, 85546, new Class[]{fh.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fhVar, Integer.valueOf(i3)}, null, g.f73933a, true, 85546, new Class[]{fh.class, Integer.TYPE}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(fhVar, "shortVideoContext");
                switch (i6) {
                    case 0:
                        str = "text";
                        break;
                    case 1:
                        str = "normal";
                        break;
                    case 2:
                        str = "fanfu";
                        break;
                    case 3:
                        str = "jujiao";
                        break;
                    default:
                        str = "";
                        break;
                }
                com.ss.android.ugc.aweme.utils.a.f75468b.a("change_record_mode", g.a(fhVar).a("enter_from", "video_shoot_page").a("to_status", str).f34114b);
            }
        }
        View view = this.B;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivStoryBoom");
        }
        if (i6 - i5 < 0) {
            f2 = UIUtils.dip2Px(view.getContext(), 12.5f);
        } else {
            f2 = -UIUtils.dip2Px(view.getContext(), 12.5f);
        }
        if (i6 == 2) {
            view.setAlpha(0.0f);
            view.setTranslationX(-f2);
            view.setVisibility(0);
            view.animate().alpha(1.0f).translationX(0.0f).setDuration(150).start();
        } else {
            view.animate().alpha(0.0f).translationX(f2).setDuration(150).withEndAction(new x(view)).start();
        }
        View view2 = this.z;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("effectLayout");
        }
        int i7 = 8;
        if (i6 != 3) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        view2.setVisibility(i4);
        UploadButton uploadButton = this.u;
        if (uploadButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uploadButton");
        }
        if (i6 == 1) {
            i7 = 0;
        }
        uploadButton.setVisibility(i7);
        if (i6 == 0) {
            StoryRecordLayout storyRecordLayout = this.f73791d;
            if (storyRecordLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recordLayout");
            }
            storyRecordLayout.setEnableHorizontalScroll(false);
            com.ss.android.ugc.aweme.story.shootvideo.record.scene.b bVar = this.j;
            if (bVar != null) {
                bVar.a(false, true);
            }
            B();
        } else if (i6 != 3) {
            if (i5 == 3) {
                StoryRecordLayout storyRecordLayout2 = this.f73791d;
                if (storyRecordLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recordLayout");
                }
                storyRecordLayout2.setEnabled(true);
                com.ss.android.ugc.aweme.story.shootvideo.record.scene.b bVar2 = this.j;
                if (bVar2 != null) {
                    bVar2.a(false, true);
                }
            }
            StoryRecordLayout storyRecordLayout3 = this.f73791d;
            if (storyRecordLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recordLayout");
            }
            storyRecordLayout3.setEnableHorizontalScroll(true);
        } else {
            StoryRecordLayout storyRecordLayout4 = this.f73791d;
            if (storyRecordLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recordLayout");
            }
            storyRecordLayout4.setEnableHorizontalScroll(false);
            com.ss.android.ugc.aweme.story.shootvideo.record.scene.b bVar3 = this.j;
            if (bVar3 != null) {
                bVar3.a(true, true);
            }
            B();
        }
        if (i6 == 0) {
            F().setTag(F().getId(), Boolean.TRUE);
            StoryTextRecordLayout storyTextRecordLayout = this.F;
            if (storyTextRecordLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("storyRecordTextLayout");
            }
            storyTextRecordLayout.setAlpha(1.0f);
            F().setAlpha(1.0f);
            return;
        }
        F().setTag(F().getId(), Boolean.FALSE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x03df  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x035b  */
    @com.ss.android.ugc.thermometer.annotation.MeasureFunction
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r20, @org.jetbrains.annotations.Nullable android.os.Bundle r21) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            r11 = 1
            r0[r11] = r21
            com.meituan.robust.ChangeQuickRedirect r2 = f73788a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r10] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 85589(0x14e55, float:1.19936E-40)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0045
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            r0[r11] = r21
            com.meituan.robust.ChangeQuickRedirect r2 = f73788a
            r3 = 0
            r4 = 85589(0x14e55, float:1.19936E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r10] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0045:
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            super.onViewCreated(r20, r21)
            com.ss.android.ugc.aweme.story.shootvideo.record.c r0 = r7.s
            if (r0 != 0) goto L_0x0056
            java.lang.String r1 = "permissionChecker"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0056:
            r0.a((android.view.View) r8)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f73788a
            r3 = 0
            r4 = 85618(0x14e72, float:1.19976E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x008b
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f73788a
            r3 = 0
            r4 = 85618(0x14e72, float:1.19976E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x008b:
            r0 = 2131167770(0x7f070a1a, float:1.7949823E38)
            android.view.View r0 = r8.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.iv_tool)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r7.C = r0
            r0 = 2131167754(0x7f070a0a, float:1.794979E38)
            android.view.View r0 = r8.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.iv_story_boom)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r7.B = r0
            r0 = 2131165660(0x7f0701dc, float:1.7945543E38)
            android.view.View r0 = r8.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.boom_cover)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r7.A = r0
            r0 = 2131170187(0x7f07138b, float:1.7954725E38)
            android.view.View r0 = r8.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.surface_cover)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r7.g = r0
            r0 = 2131166931(0x7f0706d3, float:1.7948121E38)
            android.view.View r0 = r8.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.gesturelayout)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout r0 = (com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout) r0
            r7.y = r0
            r0 = 2131165786(0x7f07025a, float:1.7945799E38)
            android.view.View r0 = r8.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.btn_upload)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.local.UploadButton r0 = (com.ss.android.ugc.aweme.shortvideo.local.UploadButton) r0
            r7.u = r0
            r0 = 2131167261(0x7f07081d, float:1.794879E38)
            android.view.View r1 = r8.findViewById(r0)
            java.lang.String r2 = "findViewById(R.id.img_close_record)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r7.v = r1
            r1 = 2131167595(0x7f07096b, float:1.7949468E38)
            android.view.View r1 = r8.findViewById(r1)
            java.lang.String r2 = "findViewById(R.id.iv_flip_camera)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r7.f73792e = r1
            r1 = 2131169552(0x7f071110, float:1.7953437E38)
            android.view.View r1 = r8.findViewById(r1)
            java.lang.String r2 = "findViewById(R.id.rl_record_tool_bottom)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r7.w = r1
            r1 = 2131169331(0x7f071033, float:1.795299E38)
            android.view.View r1 = r8.findViewById(r1)
            java.lang.String r2 = "findViewById(R.id.rdl_record)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.shortvideo.widget.StoryRecordLayout r1 = (com.ss.android.ugc.aweme.shortvideo.widget.StoryRecordLayout) r1
            r7.f73791d = r1
            r1 = 2131170959(0x7f07168f, float:1.7956291E38)
            android.view.View r1 = r8.findViewById(r1)
            java.lang.String r2 = "findViewById(R.id.tv_record_hint)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r7.f73793f = r1
            r1 = 2131167916(0x7f070aac, float:1.795012E38)
            android.view.View r1 = r8.findViewById(r1)
            java.lang.String r2 = "findViewById(R.id.layout_record_extra)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r7.x = r1
            r1 = 2131165809(0x7f070271, float:1.7945846E38)
            android.view.View r1 = r8.findViewById(r1)
            r7.O = r1
            r1 = 2131166518(0x7f070536, float:1.7947284E38)
            android.view.View r1 = r8.findViewById(r1)
            java.lang.String r2 = "findViewById(R.id.effect_container)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r7.z = r1
            r1 = 2131165695(0x7f0701ff, float:1.7945614E38)
            android.view.View r1 = r8.findViewById(r1)
            java.lang.String r2 = "findViewById(R.id.bottom_tab_host)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.story.widget.TabHost r1 = (com.ss.android.ugc.aweme.story.widget.TabHost) r1
            r7.h = r1
            r1 = 2131167527(0x7f070927, float:1.794933E38)
            android.view.View r1 = r8.findViewById(r1)
            java.lang.String r2 = "findViewById(R.id.iv_camera_settings)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r7.D = r1
            r1 = 2131169682(0x7f071192, float:1.79537E38)
            android.view.View r1 = r8.findViewById(r1)
            java.lang.String r2 = "findViewById(R.id.scene_recycler_view)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.support.v7.widget.RecyclerView r1 = (android.support.v7.widget.RecyclerView) r1
            r7.i = r1
            r1 = 2131169395(0x7f071073, float:1.7953119E38)
            android.view.View r1 = r8.findViewById(r1)
            java.lang.String r2 = "findViewById(R.id.record_title_layout)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r7.E = r1
            r1 = 2131171187(0x7f071773, float:1.7956753E38)
            android.view.View r1 = r8.findViewById(r1)
            java.lang.String r2 = "findViewById(R.id.txt_record_layout)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.StoryTextRecordLayout r1 = (com.ss.android.ugc.aweme.story.shootvideo.textrecord.StoryTextRecordLayout) r1
            r7.F = r1
            r1 = 2131170447(0x7f07148f, float:1.7955253E38)
            android.view.View r1 = r8.findViewById(r1)
            java.lang.String r2 = "findViewById(R.id.tool_parent_layout)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r7.G = r1
            r1 = 2131166186(0x7f0703ea, float:1.794661E38)
            android.view.View r1 = r8.findViewById(r1)
            java.lang.String r2 = "findViewById(R.id.corners_top)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r7.I = r1
            r1 = 2131166185(0x7f0703e9, float:1.7946608E38)
            android.view.View r1 = r8.findViewById(r1)
            java.lang.String r2 = "findViewById(R.id.corners_bottom)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r7.J = r1
            r1 = 2131166814(0x7f07065e, float:1.7947884E38)
            android.view.View r1 = r8.findViewById(r1)
            java.lang.String r2 = "findViewById(R.id.fl_scene_indicator)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r7.K = r1
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r1 = r19.r()
            java.lang.String r2 = "shortVideoContextViewModel"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.shortvideo.fh r1 = r1.f65401b
            if (r1 == 0) goto L_0x0262
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r1 = r19.r()
            java.lang.String r2 = "shortVideoContextViewModel"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.shortvideo.fh r1 = r1.f65401b
            java.lang.String r1 = r1.s
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r2 = "from_chat"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L_0x0262
            com.ss.android.ugc.aweme.story.shootvideo.record.l r1 = r7.f73790c
            if (r1 != 0) goto L_0x020f
            java.lang.String r2 = "presenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x020f:
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.c r12 = r1.i
            android.view.View r13 = r7.G
            if (r13 != 0) goto L_0x021a
            java.lang.String r1 = "toolParentLayout"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x021a:
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.StoryTextRecordLayout r14 = r7.F
            if (r14 != 0) goto L_0x0223
            java.lang.String r1 = "storyRecordTextLayout"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0223:
            android.widget.ImageView r1 = r7.f73792e
            if (r1 != 0) goto L_0x022c
            java.lang.String r2 = "ivFlipCamera"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x022c:
            r15 = r1
            android.view.View r15 = (android.view.View) r15
            r16 = 0
            android.view.View r1 = r7.v
            if (r1 != 0) goto L_0x023a
            java.lang.String r2 = "closeView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x023a:
            r18 = r7
            android.support.v4.app.Fragment r18 = (android.support.v4.app.Fragment) r18
            r17 = r1
            r12.a(r13, r14, r15, r16, r17, r18)
            com.ss.android.ugc.aweme.port.in.ah r1 = com.ss.android.ugc.aweme.port.in.a.o
            java.lang.String r2 = "AVEnv.SP_SERIVCE"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.port.in.ah$a r1 = r1.g()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.a(r2)
            android.widget.ImageView r1 = r7.D
            if (r1 != 0) goto L_0x025c
            java.lang.String r2 = "ivSettings"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x025c:
            r2 = 8
            r1.setVisibility(r2)
            goto L_0x02aa
        L_0x0262:
            com.ss.android.ugc.aweme.story.shootvideo.record.l r1 = r7.f73790c
            if (r1 != 0) goto L_0x026b
            java.lang.String r2 = "presenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x026b:
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.c r12 = r1.i
            android.view.View r13 = r7.G
            if (r13 != 0) goto L_0x0276
            java.lang.String r1 = "toolParentLayout"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0276:
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.StoryTextRecordLayout r14 = r7.F
            if (r14 != 0) goto L_0x027f
            java.lang.String r1 = "storyRecordTextLayout"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x027f:
            android.widget.ImageView r1 = r7.f73792e
            if (r1 != 0) goto L_0x0288
            java.lang.String r2 = "ivFlipCamera"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0288:
            r15 = r1
            android.view.View r15 = (android.view.View) r15
            android.widget.ImageView r1 = r7.D
            if (r1 != 0) goto L_0x0294
            java.lang.String r2 = "ivSettings"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0294:
            r16 = r1
            android.view.View r16 = (android.view.View) r16
            android.view.View r1 = r7.v
            if (r1 != 0) goto L_0x02a1
            java.lang.String r2 = "closeView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x02a1:
            r18 = r7
            android.support.v4.app.Fragment r18 = (android.support.v4.app.Fragment) r18
            r17 = r1
            r12.a(r13, r14, r15, r16, r17, r18)
        L_0x02aa:
            com.ss.android.ugc.aweme.story.shootvideo.record.e r1 = new com.ss.android.ugc.aweme.story.shootvideo.record.e
            com.ss.android.ugc.aweme.story.widget.TabHost r2 = r7.h
            if (r2 != 0) goto L_0x02b5
            java.lang.String r3 = "recordModeTabHost"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x02b5:
            com.ss.android.ugc.aweme.story.shootvideo.record.l r3 = r7.f73790c
            if (r3 != 0) goto L_0x02be
            java.lang.String r4 = "presenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x02be:
            com.ss.android.ugc.aweme.story.widget.TabHost$a r3 = (com.ss.android.ugc.aweme.story.widget.TabHost.a) r3
            r1.<init>(r7, r2, r3)
            r7.k = r1
            boolean r1 = r7.q
            if (r1 != 0) goto L_0x02cc
            r7.g(r10)
        L_0x02cc:
            android.view.View r1 = r7.E
            if (r1 != 0) goto L_0x02d5
            java.lang.String r2 = "titleLayout"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x02d5:
            android.content.Context r2 = r19.getContext()
            int r2 = com.ss.android.ugc.aweme.shortvideo.fc.c(r2)
            r1.setPadding(r10, r2, r10, r10)
            com.ss.android.ugc.aweme.shortvideo.widget.StoryRecordLayout r1 = r7.f73791d
            if (r1 != 0) goto L_0x02e9
            java.lang.String r2 = "recordLayout"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x02e9:
            r2 = 241(0xf1, float:3.38E-43)
            r1.a((int) r2, (boolean) r11)
            com.ss.android.ugc.aweme.story.shootvideo.record.l r2 = r7.f73790c
            if (r2 != 0) goto L_0x02f7
            java.lang.String r3 = "presenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x02f7:
            com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout$a r2 = (com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout.a) r2
            r1.setRecordListener(r2)
            com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout r2 = r7.y
            if (r2 != 0) goto L_0x0305
            java.lang.String r3 = "gestureLayout"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0305:
            android.view.ScaleGestureDetector r2 = r2.getScaleGestureDetector()
            r1.setScaleGestureDetector(r2)
            android.view.View r0 = r8.findViewById(r0)
            com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment$f r1 = new com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment$f
            r1.<init>(r7)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            com.ss.android.ugc.aweme.shortvideo.local.UploadButton r0 = r7.u
            if (r0 != 0) goto L_0x0323
            java.lang.String r1 = "uploadButton"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0323:
            com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment$g r1 = new com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment$g
            r1.<init>(r7)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r7.f73792e
            if (r0 != 0) goto L_0x0336
            java.lang.String r1 = "ivFlipCamera"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0336:
            com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment$h r1 = new com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment$h
            r1.<init>(r7)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r7.D
            if (r0 != 0) goto L_0x0349
            java.lang.String r1 = "ivSettings"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0349:
            com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment$i r1 = new com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment$i
            r1.<init>(r7)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            com.ss.android.ugc.aweme.story.shootvideo.record.scene.b r0 = new com.ss.android.ugc.aweme.story.shootvideo.record.scene.b
            android.support.v4.app.FragmentActivity r1 = r19.getActivity()
            if (r1 == 0) goto L_0x03df
            android.support.v7.app.AppCompatActivity r1 = (android.support.v7.app.AppCompatActivity) r1
            com.ss.android.ugc.aweme.story.shootvideo.record.l r2 = r7.f73790c
            if (r2 != 0) goto L_0x0366
            java.lang.String r3 = "presenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0366:
            com.ss.android.ugc.aweme.story.shootvideo.record.b r2 = (com.ss.android.ugc.aweme.story.shootvideo.record.b) r2
            android.support.v7.widget.RecyclerView r3 = r7.i
            if (r3 != 0) goto L_0x0371
            java.lang.String r4 = "sceneRecyclerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x0371:
            android.widget.FrameLayout r4 = r7.K
            if (r4 != 0) goto L_0x037a
            java.lang.String r5 = "mSceneIndicator"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x037a:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r0.<init>(r1, r2, r3, r4)
            r7.j = r0
            com.ss.android.ugc.aweme.shortvideo.widget.StoryRecordLayout r0 = r7.f73791d
            if (r0 != 0) goto L_0x038a
            java.lang.String r1 = "recordLayout"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x038a:
            com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment$j r1 = new com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment$j
            r1.<init>(r7)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r0.setEventDispatcher(r1)
            com.ss.android.ugc.aweme.story.shootvideo.record.scene.b r0 = r7.j
            if (r0 == 0) goto L_0x03de
            com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment$initView$8 r1 = new com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment$initView$8
            r1.<init>(r7)
            android.support.v7.widget.RecyclerView$OnScrollListener r1 = (android.support.v7.widget.RecyclerView.OnScrollListener) r1
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.story.shootvideo.record.scene.b.f74052a
            r15 = 0
            r16 = 85934(0x14fae, float:1.20419E-40)
            java.lang.Class[] r2 = new java.lang.Class[r11]
            java.lang.Class<android.support.v7.widget.RecyclerView$OnScrollListener> r3 = android.support.v7.widget.RecyclerView.OnScrollListener.class
            r2[r10] = r3
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x03d3
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.story.shootvideo.record.scene.b.f74052a
            r15 = 0
            r16 = 85934(0x14fae, float:1.20419E-40)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class<android.support.v7.widget.RecyclerView$OnScrollListener> r2 = android.support.v7.widget.RecyclerView.OnScrollListener.class
            r1[r10] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x03de
        L_0x03d3:
            java.lang.String r2 = "listener"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
            android.support.v7.widget.RecyclerView r0 = r0.s
            r0.addOnScrollListener(r1)
            return
        L_0x03de:
            return
        L_0x03df:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.support.v7.app.AppCompatActivity"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final boolean a(int i2, @NotNull KeyEvent keyEvent) {
        KeyEvent keyEvent2 = keyEvent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), keyEvent2}, this, f73788a, false, 85601, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), keyEvent2}, this, f73788a, false, 85601, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(keyEvent2, "event");
        boolean a2 = super.a(i2, keyEvent);
        if (!a2 && i2 == 4 && getActivity() != null) {
            FragmentActivity activity = getActivity();
            if (activity == null || !activity.isFinishing()) {
                ShortVideoContextViewModel r2 = r();
                Intrinsics.checkExpressionValueIsNotNull(r2, "shortVideoContextViewModel");
                if (r2.f()) {
                    ShortVideoContextViewModel r3 = r();
                    Intrinsics.checkExpressionValueIsNotNull(r3, "shortVideoContextViewModel");
                    if (r3.h()) {
                        return true;
                    }
                    return a2;
                }
                return true;
            }
        }
        return a2;
    }

    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        int i4 = i2;
        int i5 = i3;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f73788a, false, 85600, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f73788a, false, 85600, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        if (i4 == 4 && i5 == 5) {
            l lVar = this.f73790c;
            if (lVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            lVar.a(true);
            l lVar2 = this.f73790c;
            if (lVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            if (PatchProxy.isSupport(new Object[0], lVar2, l.f73981a, false, 85731, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], lVar2, l.f73981a, false, 85731, new Class[0], Void.TYPE);
            } else {
                fh fhVar = lVar2.j.I().f65401b;
                if (!(lVar2.h().e() == null || fhVar.f67719b == 1)) {
                    com.ss.android.ugc.aweme.video.b.e(lVar2.h().e().extractFramesDir);
                    com.ss.android.ugc.aweme.video.b.c(lVar2.h().e().extractFramesDir);
                    lVar2.h().a();
                }
            }
            StoryRecordLayout storyRecordLayout = this.f73791d;
            if (storyRecordLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recordLayout");
            }
            storyRecordLayout.b();
            com.ss.android.ugc.aweme.story.shootvideo.record.scene.b bVar = this.j;
            if (bVar != null) {
                bVar.c();
            }
        } else if (i4 == 4 && i5 == 7) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.setResult(7, intent2);
            }
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }
        l lVar3 = this.f73790c;
        if (lVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        lVar3.i.a(i4, i5, intent2);
    }

    public final void a(boolean z2, boolean z3, long j2) {
        float f2;
        long j3;
        boolean z4 = z2;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0), new Long(j4)}, this, f73788a, false, 85608, new Class[]{Boolean.TYPE, Boolean.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3), new Long(j4)}, this, f73788a, false, 85608, new Class[]{Boolean.TYPE, Boolean.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        TabHost tabHost = this.h;
        if (tabHost == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recordModeTabHost");
        }
        tabHost.setEnabled(z4);
        if (z4) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        this.O.animate().alpha(f2).withStartAction(new ac(this, z4)).withEndAction(new ad(this, z4)).setDuration(j4).start();
        RecyclerView recyclerView = this.i;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sceneRecyclerView");
        }
        ViewPropertyAnimator withEndAction = recyclerView.animate().alpha(f2).withStartAction(new ae(this, z4)).withEndAction(new af(this, z4));
        if (z4) {
            j3 = j4;
        } else {
            j3 = j4 / 2;
        }
        withEndAction.setDuration(j3).start();
        B();
    }
}
