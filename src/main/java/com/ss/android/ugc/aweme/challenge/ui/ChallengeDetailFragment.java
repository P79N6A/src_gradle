package com.ss.android.ugc.aweme.challenge.ui;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.e;
import com.bytedance.jedi.arch.h;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.ss.android.ugc.aweme.challenge.ui.header.e;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel;
import com.ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.detail.AbstractDetailFragment;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.share.command.ShareCommandFactory;
import com.ss.android.ugc.aweme.fragment.AbstractBaseDetailFragment;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.ui.ProfileFragmentAdapter;
import com.ss.android.ugc.aweme.qrcode.d;
import com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.share.ShareOrderService;
import com.ss.android.ugc.aweme.share.SimpleShareDialog;
import com.ss.android.ugc.aweme.share.bt;
import com.ss.android.ugc.aweme.share.cg;
import com.ss.android.ugc.aweme.share.ch;
import com.ss.android.ugc.aweme.share.ck;
import com.ss.android.ugc.aweme.share.z;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.u.aj;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;
import com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator;
import io.reactivex.disposables.Disposable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty1;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 ¯\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0002¯\u0001B\u0005¢\u0006\u0002\u0010\u0007J\b\u0010Y\u001a\u00020ZH\u0002J\u0010\u0010[\u001a\u00020\\2\u0006\u0010=\u001a\u00020>H\u0002J\u0012\u0010]\u001a\u00020\\2\b\u0010^\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010_\u001a\u00020#H\u0002J\b\u0010`\u001a\u00020\u0012H\u0014J\b\u0010a\u001a\u00020bH\u0014J\b\u0010c\u001a\u00020\u0012H\u0014J\u0010\u0010d\u001a\u00020\u00122\u0006\u0010e\u001a\u00020+H\u0014J\b\u0010f\u001a\u00020+H\u0014J\b\u0010g\u001a\u00020\u0012H\u0014J\f\u0010h\u001a\u0006\u0012\u0002\b\u00030iH\u0014J\u0012\u0010j\u001a\u00020Z2\b\u0010k\u001a\u0004\u0018\u00010lH\u0014J\b\u0010m\u001a\u00020ZH\u0014J\b\u0010n\u001a\u00020ZH\u0002J\b\u0010o\u001a\u00020ZH\u0002J\b\u0010p\u001a\u00020ZH\u0002J\b\u0010q\u001a\u00020ZH\u0002J\b\u0010r\u001a\u00020\\H\u0014J\b\u0010s\u001a\u00020\\H\u0016J\u001c\u0010t\u001a\u00020\\2\b\u0010u\u001a\u0004\u0018\u00010v2\b\u0010^\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010w\u001a\u00020Z2\b\u0010x\u001a\u0004\u0018\u00010yH\u0002J\u0012\u0010z\u001a\u00020Z2\b\u0010{\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010|\u001a\u00020\\2\b\u0010u\u001a\u0004\u0018\u00010vH\u0002J\u0012\u0010}\u001a\u00020\\2\b\u0010u\u001a\u0004\u0018\u00010vH\u0002J\u0011\u0010~\u001a\u00020Z2\u0007\u0010\u001a\u00030\u0001H\u0007J\u001b\u0010\u0001\u001a\u00020Z2\u0007\u0010\u0001\u001a\u00020+2\u0007\u0010\u0001\u001a\u00020+H\u0016J\u0013\u0010\u0001\u001a\u00020Z2\b\u0010\u0001\u001a\u00030\u0001H\u0014J\t\u0010\u0001\u001a\u00020\\H\u0002J\u001b\u0010\u0001\u001a\u00020Z2\u0007\u0010\u0001\u001a\u00020+2\u0007\u0010\u0001\u001a\u00020+H\u0016J\u001b\u0010\u0001\u001a\u00020Z2\u0007\u0010\u0001\u001a\u00020-2\u0007\u0010\u0001\u001a\u00020-H\u0016J\u0015\u0010\u0001\u001a\u00020Z2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J\u0013\u0010\u0001\u001a\u00020\\2\b\u0010^\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010\u0001\u001a\u00020Z2\u0007\u0010\u001a\u00030\u0001H\u0007J\u001d\u0010\u0001\u001a\u00020Z2\u0007\u0010\u0001\u001a\u00020/2\t\u0010\u0001\u001a\u0004\u0018\u00010lH\u0016J\u0012\u0010\u0001\u001a\u00020Z2\u0007\u0010\u0001\u001a\u00020\\H\u0002J\t\u0010\u0001\u001a\u00020ZH\u0002J\t\u0010\u0001\u001a\u00020ZH\u0002J)\u0010\u0001\u001a\u00020Z2\b\u0010^\u001a\u0004\u0018\u00010\u00122\u0007\u0010\u0001\u001a\u00020\u00122\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0012H\u0002J\u0014\u0010\u0001\u001a\u00020Z2\t\u0010\u0001\u001a\u0004\u0018\u00010\u0012H\u0002J\t\u0010 \u0001\u001a\u00020ZH\u0002J\t\u0010¡\u0001\u001a\u00020ZH\u0003J\u001c\u0010¢\u0001\u001a\u00020Z2\b\u0010£\u0001\u001a\u00030¤\u00012\u0007\u0010¥\u0001\u001a\u00020+H\u0002J\u0014\u0010¦\u0001\u001a\u00020Z2\t\u0010§\u0001\u001a\u0004\u0018\u00010\u0012H\u0002J\t\u0010¨\u0001\u001a\u00020ZH\u0002J\t\u0010©\u0001\u001a\u00020ZH\u0002J5\u0010ª\u0001\u001a\u00020Z*\u00020/2&\u0010«\u0001\u001a!\u0012\u0016\u0012\u00140/¢\u0006\u000f\b­\u0001\u0012\n\b®\u0001\u0012\u0005\b\b(\u0001\u0012\u0004\u0012\u00020Z0¬\u0001H\u0002R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X.¢\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u000e\u0010*\u001a\u00020+X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010.\u001a\u00020/8BX\u0002¢\u0006\f\n\u0004\b2\u0010\u001d\u001a\u0004\b0\u00101R\u001b\u00103\u001a\u0002048BX\u0002¢\u0006\f\n\u0004\b7\u0010\u001d\u001a\u0004\b5\u00106R\u001b\u00108\u001a\u0002098BX\u0002¢\u0006\f\n\u0004\b<\u0010\u001d\u001a\u0004\b:\u0010;R\u000e\u0010=\u001a\u00020>X.¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020+X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010@\u001a\u00020/8BX\u0002¢\u0006\f\n\u0004\bB\u0010\u001d\u001a\u0004\bA\u00101R\u001b\u0010C\u001a\u00020D8BX\u0002¢\u0006\f\n\u0004\bG\u0010\u001d\u001a\u0004\bE\u0010FR7\u0010H\u001a\u001e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020/0Ij\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020/`J8BX\u0002¢\u0006\f\n\u0004\bM\u0010\u001d\u001a\u0004\bK\u0010LR\u000e\u0010N\u001a\u00020-X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010O\u001a\u00020P8BX\u0002¢\u0006\f\n\u0004\bS\u0010\u001d\u001a\u0004\bQ\u0010RR\u001a\u0010T\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010X¨\u0006°\u0001"}, d2 = {"Lcom/ss/android/ugc/aweme/challenge/ui/ChallengeDetailFragment;", "Lcom/ss/android/ugc/aweme/challenge/ui/BaseDetailFragment;", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$IActionHandler;", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$OnShareCallback;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/ss/android/ugc/aweme/base/arch/ReflectViewModelFactory;", "()V", "containerList", "", "Lcom/ss/android/ugc/aweme/fragment/AbstractBaseDetailFragment$DetailFragmentScrollableContainer;", "getContainerList", "()Ljava/util/List;", "mChallenge", "Lcom/ss/android/ugc/aweme/discover/model/Challenge;", "mChallengeDetail", "Lcom/ss/android/ugc/aweme/challenge/model/ChallengeDetail;", "mChallengeId", "", "mCommerceDelegate", "Lcom/ss/android/ugc/aweme/challenge/ui/CommerceDelegate;", "mCreationId", "mDetailParam", "Lcom/ss/android/ugc/aweme/challenge/model/ChallengeDetailParam;", "mHeaderContainer", "Landroid/widget/LinearLayout;", "getMHeaderContainer", "()Landroid/widget/LinearLayout;", "mHeaderContainer$delegate", "Lkotlin/Lazy;", "mHeaderFactory", "Lcom/ss/android/ugc/aweme/challenge/ui/header/ChallengeHeaderFactory;", "mHeaderView", "Lcom/ss/android/ugc/aweme/challenge/ui/header/AbsCommonHeaderView;", "mHotFragment", "Lcom/ss/android/ugc/aweme/challenge/ui/DetailAwemeListFragment;", "mJediViewModel", "Lcom/ss/android/ugc/aweme/challenge/viewmodel/ChallengeDetailJediViewModel;", "getMJediViewModel", "()Lcom/ss/android/ugc/aweme/challenge/viewmodel/ChallengeDetailJediViewModel;", "mJediViewModel$delegate", "Lcom/bytedance/jedi/arch/lifecycleAwareLazy;", "mLastHeadBottom", "", "mMaxScrollHeight", "", "mRecordView", "Landroid/view/View;", "getMRecordView", "()Landroid/view/View;", "mRecordView$delegate", "mRefreshLayout", "Lcom/ss/android/ugc/aweme/challenge/ui/ChallengeSwipeRefreshLayout;", "getMRefreshLayout", "()Lcom/ss/android/ugc/aweme/challenge/ui/ChallengeSwipeRefreshLayout;", "mRefreshLayout$delegate", "mShareButton", "Landroid/widget/ImageView;", "getMShareButton", "()Landroid/widget/ImageView;", "mShareButton$delegate", "mShareDialog", "Lcom/ss/android/ugc/aweme/share/SimpleShareDialog;", "mShowTabIndex", "mStatusBar", "getMStatusBar", "mStatusBar$delegate", "mStatusView", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "getMStatusView", "()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "mStatusView$delegate", "mTabViews", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getMTabViews", "()Ljava/util/HashMap;", "mTabViews$delegate", "mTitleMaxScrollHeight", "mViewModel", "Lcom/ss/android/ugc/aweme/challenge/viewmodel/ChallengeDetailViewModel;", "getMViewModel", "()Lcom/ss/android/ugc/aweme/challenge/viewmodel/ChallengeDetailViewModel;", "mViewModel$delegate", "viewModelFactory", "getViewModelFactory", "()Lcom/ss/android/ugc/aweme/base/arch/ReflectViewModelFactory;", "setViewModelFactory", "(Lcom/ss/android/ugc/aweme/base/arch/ReflectViewModelFactory;)V", "addExtraSpaceForAwemeList", "", "checkShareThumbAvailable", "", "checkStatus", "shareType", "createHotFragment", "getCurId", "getFragmentPagerAdapter", "Landroid/support/v4/app/FragmentPagerAdapter;", "getLabel", "getLabelName", "currentItem", "getResId", "getShootWayLabel", "getTabFactory", "Lcom/ss/android/ugc/aweme/views/ITabFactory;", "initArguments", "arguments", "Landroid/os/Bundle;", "initData", "initRefreshLayout", "initShareView", "initStartRecordView", "initStatusView", "isHaveLatestTab", "isRegisterEventBus", "onAction", "shareStruct", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;", "onChallengeDetailFailed", "e", "", "onChallengeDetailSuccess", "data", "onCopyShare", "onDouYinIMShare", "onMusicCollectEvent", "event", "Lcom/ss/android/ugc/aweme/music/event/MusicCollectEvent;", "onPageChange", "position", "hashCode", "onPreVideoRecord", "intent", "Landroid/content/Intent;", "onQRCodeShare", "onScroll", "translationY", "maxY", "onScrolled", "dx", "dy", "onShareComplete", "result", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareResult;", "onUseQRCodeShare", "onVideoEvent", "Lcom/ss/android/ugc/aweme/feed/event/VideoEvent;", "onViewCreated", "view", "savedInstanceState", "refresh", "refreshFragment", "sendClickQRCodeEvent", "sendClickShareButtonEventV1", "sendShareTagEvent", "shareMode", "enterMethod", "sendShareTagEventV1", "labelName", "sendStartRecordEvent", "setStatusBarForKitKat", "syncChallengeMusic", "originMusic", "Lcom/ss/android/ugc/aweme/music/model/Music;", "followType", "updateDialogShareStruct", "thumbUrl", "updateHeader", "updateView", "hookSetOnClickListener", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class ChallengeDetailFragment extends BaseDetailFragment implements ae<com.ss.android.ugc.aweme.base.arch.c>, com.bytedance.jedi.arch.h, IShareService.IActionHandler, IShareService.OnShareCallback {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f2812f;
    static final /* synthetic */ KProperty[] g = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ChallengeDetailFragment.class), "mStatusBar", "getMStatusBar()Landroid/view/View;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ChallengeDetailFragment.class), "mRecordView", "getMRecordView()Landroid/view/View;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ChallengeDetailFragment.class), "mRefreshLayout", "getMRefreshLayout()Lcom/ss/android/ugc/aweme/challenge/ui/ChallengeSwipeRefreshLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ChallengeDetailFragment.class), "mStatusView", "getMStatusView()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ChallengeDetailFragment.class), "mShareButton", "getMShareButton()Landroid/widget/ImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ChallengeDetailFragment.class), "mHeaderContainer", "getMHeaderContainer()Landroid/widget/LinearLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ChallengeDetailFragment.class), "mJediViewModel", "getMJediViewModel()Lcom/ss/android/ugc/aweme/challenge/viewmodel/ChallengeDetailJediViewModel;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ChallengeDetailFragment.class), "mViewModel", "getMViewModel()Lcom/ss/android/ugc/aweme/challenge/viewmodel/ChallengeDetailViewModel;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ChallengeDetailFragment.class), "mTabViews", "getMTabViews()Ljava/util/HashMap;"))};
    public static final c p = new c((byte) 0);
    private final Lazy J = h.a(new p(this));
    private final Lazy K = h.a(new m(this));
    private final Lazy L = h.a(new n(this));
    private final Lazy M = h.a(new q(this));
    private final Lazy N = h.a(new o(this));
    private final Lazy O = h.a(new l(this));
    private com.ss.android.ugc.aweme.challenge.ui.header.a P;
    private com.ss.android.ugc.aweme.challenge.ui.header.e Q;
    private ChallengeDetail R;
    private int S = -1;
    private final lifecycleAwareLazy T;
    private final Lazy U;
    private final Lazy V;
    private float W;
    private float X;
    private int Y;
    private HashMap Z;
    public SimpleShareDialog h;
    public n i;
    public DetailAwemeListFragment j;
    public ChallengeDetailParam k;
    public String l;
    public Challenge m;
    public String n;
    @NotNull
    public com.ss.android.ugc.aweme.base.arch.c o = new com.ss.android.ugc.aweme.base.arch.c();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0006\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0007\"\b\b\u0002\u0010\u0001*\u00020\b*\u0002H\u00012\b\u0010\t\u001a\u0004\u0018\u00010\nH\n¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"<anonymous>", "S", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "VM", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/bytedance/jedi/arch/State;", "it", "Landroid/os/Bundle;", "invoke", "(Lcom/bytedance/jedi/arch/State;Landroid/os/Bundle;)Lcom/bytedance/jedi/arch/State;", "com/bytedance/jedi/arch/ExtensionsKt$viewModel$5"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function2<ChallengeDetailState, Bundle, ChallengeDetailState> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        public a() {
            super(2);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState, com.bytedance.jedi.arch.x] */
        @NotNull
        public final ChallengeDetailState invoke(@NotNull ChallengeDetailState challengeDetailState, @Nullable Bundle bundle) {
            ChallengeDetailState challengeDetailState2 = challengeDetailState;
            if (PatchProxy.isSupport(new Object[]{challengeDetailState2, bundle}, this, changeQuickRedirect, false, 26125, new Class[]{com.bytedance.jedi.arch.x.class, Bundle.class}, com.bytedance.jedi.arch.x.class)) {
                return (com.bytedance.jedi.arch.x) PatchProxy.accessDispatch(new Object[]{challengeDetailState2, bundle}, this, changeQuickRedirect, false, 26125, new Class[]{com.bytedance.jedi.arch.x.class, Bundle.class}, com.bytedance.jedi.arch.x.class);
            }
            Intrinsics.checkParameterIsNotNull(challengeDetailState2, "$receiver");
            return challengeDetailState2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0002\u0010\u0007*\u00020\bH\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"<anonymous>", "VM", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/arch/ExtensionsKt$viewModel$6"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function0<ChallengeDetailJediViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function2 $argumentsAcceptor;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ KClass $viewModelClass;
        final /* synthetic */ KClass $viewModelClass$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment, KClass kClass, Function2 function2, KClass kClass2) {
            super(0);
            this.$this_viewModel = fragment;
            this.$viewModelClass = kClass;
            this.$argumentsAcceptor = function2;
            this.$viewModelClass$inlined = kClass2;
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel] */
        /* JADX WARNING: type inference failed for: r0v6, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel] */
        @NotNull
        public final ChallengeDetailJediViewModel invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 26126, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 26126, new Class[0], JediViewModel.class);
            }
            ViewModelProvider of = ViewModelProviders.of(this.$this_viewModel, ((ae) this.$this_viewModel).r_());
            String name = kotlin.jvm.a.a(this.$viewModelClass$inlined).getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
            ? r0 = (JediViewModel) of.get(name, kotlin.jvm.a.a(this.$viewModelClass));
            com.bytedance.jedi.arch.n a2 = r0.f2282c.a(ChallengeDetailJediViewModel.class);
            if (a2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(r0, "this");
                a2.binding(r0);
            }
            r0.a(new Function1<ChallengeDetailState, ChallengeDetailState>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ b this$0;

                {
                    this.this$0 = r1;
                }

                /* JADX WARNING: type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState, com.bytedance.jedi.arch.x] */
                /* JADX WARNING: type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState, com.bytedance.jedi.arch.x] */
                @NotNull
                public final ChallengeDetailState invoke(@NotNull ChallengeDetailState challengeDetailState) {
                    if (PatchProxy.isSupport(new Object[]{challengeDetailState}, this, changeQuickRedirect, false, 26127, new Class[]{com.bytedance.jedi.arch.x.class}, com.bytedance.jedi.arch.x.class)) {
                        return (com.bytedance.jedi.arch.x) PatchProxy.accessDispatch(new Object[]{challengeDetailState}, this, changeQuickRedirect, false, 26127, new Class[]{com.bytedance.jedi.arch.x.class}, com.bytedance.jedi.arch.x.class);
                    }
                    Intrinsics.checkParameterIsNotNull(challengeDetailState, "$this$initialize");
                    return (com.bytedance.jedi.arch.x) this.this$0.$argumentsAcceptor.invoke(challengeDetailState, this.this$0.$this_viewModel.getArguments());
                }
            });
            return r0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/challenge/ui/ChallengeDetailFragment$Companion;", "", "()V", "PARAM_CHALLENGE_DETAIL", "", "newInstance", "Lcom/ss/android/ugc/aweme/challenge/ui/ChallengeDetailFragment;", "param", "Lcom/ss/android/ugc/aweme/challenge/model/ChallengeDetailParam;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35490a;

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "firstLoad", "", "<anonymous parameter 1>", "onLoadResult"}, k = 3, mv = {1, 1, 15})
    static final class d implements com.ss.android.ugc.aweme.fragment.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35491a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ChallengeDetailFragment f35492b;

        d(ChallengeDetailFragment challengeDetailFragment) {
            this.f35492b = challengeDetailFragment;
        }

        public final void a(boolean z, boolean z2) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f35491a, false, 26129, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f35491a, false, 26129, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (z && !TextUtils.isEmpty(ChallengeDetailFragment.a(this.f35492b).getFromToken())) {
                com.ss.android.ugc.aweme.u.r rVar = new com.ss.android.ugc.aweme.u.r();
                String str = this.f35492b.l;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChallengeId");
                }
                com.ss.android.ugc.aweme.u.r f2 = rVar.e(str).f(ChallengeDetailFragment.c(this.f35492b).j());
                String fromToken = ChallengeDetailFragment.a(this.f35492b).getFromToken();
                if (fromToken == null) {
                    Intrinsics.throwNpe();
                }
                f2.b(fromToken).e();
            }
            if (!z && this.f35492b.j().f34835c) {
                this.f35492b.j().setRefreshing(false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    static final class e<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35493a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ChallengeDetailFragment f35494b;

        e(ChallengeDetailFragment challengeDetailFragment) {
            this.f35494b = challengeDetailFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (PatchProxy.isSupport(new Object[]{num}, this, f35493a, false, 26130, new Class[]{Integer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{num}, this, f35493a, false, 26130, new Class[]{Integer.class}, Void.TYPE);
                return;
            }
            if (num != null) {
                this.f35494b.f2808b.set(0, num);
                FragmentPagerAdapter fragmentPagerAdapter = this.f35494b.A;
                if (fragmentPagerAdapter != null) {
                    fragmentPagerAdapter.notifyDataSetChanged();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J@\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u0011"}, d2 = {"com/ss/android/ugc/aweme/challenge/ui/ChallengeDetailFragment$getTabFactory$1", "Lcom/ss/android/ugc/aweme/views/DetailPagerTabFactory;", "getDecorView", "Landroid/view/View;", "context", "Landroid/content/Context;", "getIndicatorView", "tabWidth", "", "getTabView", "tabContainer", "Landroid/view/ViewGroup;", "adapter", "Landroid/support/v4/view/PagerAdapter;", "position", "onClickListener", "Landroid/view/View$OnClickListener;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class f extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35495a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ChallengeDetailFragment f35496b;

        f(ChallengeDetailFragment challengeDetailFragment) {
            this.f35496b = challengeDetailFragment;
        }

        @Nullable
        public final View a(@Nullable Context context) {
            if (PatchProxy.isSupport(new Object[]{context}, this, f35495a, false, 26133, new Class[]{Context.class}, View.class)) {
                return (View) PatchProxy.accessDispatch(new Object[]{context}, this, f35495a, false, 26133, new Class[]{Context.class}, View.class);
            } else if (com.ss.android.g.a.c()) {
                return null;
            } else {
                return super.a(context);
            }
        }

        @NotNull
        public final View a(@Nullable Context context, int i) {
            if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, this, f35495a, false, 26131, new Class[]{Context.class, Integer.TYPE}, View.class)) {
                return (View) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, this, f35495a, false, 26131, new Class[]{Context.class, Integer.TYPE}, View.class);
            }
            View a2 = super.a(context, i);
            if (com.ss.android.g.a.c()) {
                a2.setBackgroundResource(C0906R.color.e8);
            } else if (com.ss.android.g.a.b()) {
                a2.setBackgroundResource(C0906R.color.hd);
            }
            Intrinsics.checkExpressionValueIsNotNull(a2, "indicator");
            return a2;
        }

        @NotNull
        public final View a(@Nullable Context context, @Nullable ViewGroup viewGroup, @Nullable PagerAdapter pagerAdapter, int i, int i2, @Nullable View.OnClickListener onClickListener) {
            if (PatchProxy.isSupport(new Object[]{context, viewGroup, pagerAdapter, Integer.valueOf(i), Integer.valueOf(i2), onClickListener}, this, f35495a, false, 26132, new Class[]{Context.class, ViewGroup.class, PagerAdapter.class, Integer.TYPE, Integer.TYPE, View.OnClickListener.class}, View.class)) {
                Object[] objArr = {context, viewGroup, pagerAdapter, Integer.valueOf(i), Integer.valueOf(i2), onClickListener};
                return (View) PatchProxy.accessDispatch(objArr, this, f35495a, false, 26132, new Class[]{Context.class, ViewGroup.class, PagerAdapter.class, Integer.TYPE, Integer.TYPE, View.OnClickListener.class}, View.class);
            }
            View a2 = super.a(context, viewGroup, pagerAdapter, i, i2, onClickListener);
            if (a2 instanceof TextView) {
                ((TextView) a2).setTextSize(1, 15.0f);
            }
            Integer valueOf = Integer.valueOf(i);
            Intrinsics.checkExpressionValueIsNotNull(a2, "tab");
            this.f35496b.l().put(valueOf, a2);
            return a2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35497a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ChallengeDetailFragment f35498b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function1 f35499c;

        g(ChallengeDetailFragment challengeDetailFragment, Function1 function1) {
            this.f35498b = challengeDetailFragment;
            this.f35499c = function1;
        }

        public final void onClick(View view) {
            View view2 = view;
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f35497a, false, 26134, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f35497a, false, 26134, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            n nVar = this.f35498b.i;
            if (nVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCommerceDelegate");
            }
            Intrinsics.checkExpressionValueIsNotNull(view2, AdvanceSetting.NETWORK_TYPE);
            int id = view.getId();
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(id)}, nVar, n.f35704a, false, 26181, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
                n nVar2 = nVar;
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(id)}, nVar2, n.f35704a, false, 26181, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
            } else {
                if (id == C0906R.id.cup) {
                    if (PatchProxy.isSupport(new Object[0], nVar, n.f35704a, false, 26182, new Class[0], Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[0], nVar, n.f35704a, false, 26182, new Class[0], Boolean.TYPE)).booleanValue();
                    } else {
                        Object service = ServiceManager.get().getService(IAVService.class);
                        Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…e(IAVService::class.java)");
                        IStickerUtilsService stickerUtilsService = ((IAVService) service).getStickerUtilsService();
                        if (!(nVar.f35709f == null || stickerUtilsService == null)) {
                            com.ss.android.ugc.aweme.sticker.model.d dVar = nVar.f35709f;
                            if (dVar == null) {
                                Intrinsics.throwNpe();
                            }
                            if (stickerUtilsService.isLockCommerceFaceSticker(dVar)) {
                                Context context = nVar.f35706c;
                                com.ss.android.ugc.aweme.sticker.model.d dVar2 = nVar.f35709f;
                                if (dVar2 == null) {
                                    Intrinsics.throwNpe();
                                }
                                stickerUtilsService.showCommerceStickerDialog(context, dVar2, "challenge");
                            }
                        }
                    }
                }
                z = false;
            }
            if (!z) {
                this.f35499c.invoke(view2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onRefresh"}, k = 3, mv = {1, 1, 15})
    static final class h implements SwipeRefreshLayout.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35500a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ChallengeDetailFragment f35501b;

        h(ChallengeDetailFragment challengeDetailFragment) {
            this.f35501b = challengeDetailFragment;
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f35500a, false, 26135, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f35500a, false, 26135, new Class[0], Void.TYPE);
                return;
            }
            this.f35501b.a(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function1<View, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ChallengeDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(ChallengeDetailFragment challengeDetailFragment) {
            super(1);
            this.this$0 = challengeDetailFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0162, code lost:
            if (com.bytedance.common.utility.collection.CollectionUtils.isEmpty(((com.ss.android.ugc.aweme.common.adapter.AnimatedAdapter) r0).mItems) == false) goto L_0x016e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void invoke(@org.jetbrains.annotations.NotNull android.view.View r25) {
            /*
                r24 = this;
                r7 = r24
                r8 = r25
                r9 = 1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 26136(0x6618, float:3.6624E-41)
                r1 = r24
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0036
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
                r3 = 0
                r4 = 26136(0x6618, float:3.6624E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r24
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0036:
                java.lang.String r0 = "it"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r0 = r7.this$0
                com.ss.android.ugc.aweme.discover.model.Challenge r0 = r0.m
                if (r0 != 0) goto L_0x0042
                return
            L_0x0042:
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r0 = r7.this$0
                java.lang.Object[] r11 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment.f2812f
                r14 = 0
                r15 = 26099(0x65f3, float:3.6572E-41)
                java.lang.Class[] r1 = new java.lang.Class[r10]
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r1
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r1 == 0) goto L_0x006a
                java.lang.Object[] r11 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment.f2812f
                r14 = 0
                r15 = 26099(0x65f3, float:3.6572E-41)
                java.lang.Class[] r1 = new java.lang.Class[r10]
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x0082
            L_0x006a:
                android.content.Context r18 = r0.getContext()
                java.lang.String r19 = "click_share_button"
                java.lang.String r20 = "challenge_hot"
                com.ss.android.ugc.aweme.discover.model.Challenge r0 = r0.m
                if (r0 != 0) goto L_0x0079
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x0079:
                java.lang.String r21 = r0.getCid()
                r22 = 0
                com.ss.android.ugc.aweme.common.r.a((android.content.Context) r18, (java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21, (long) r22)
            L_0x0082:
                boolean r0 = com.ss.android.g.a.a()
                if (r0 == 0) goto L_0x00a8
                com.ss.android.ugc.aweme.u.h r0 = new com.ss.android.ugc.aweme.u.h
                r0.<init>()
                java.lang.String r1 = "challenge_hot"
                com.ss.android.ugc.aweme.u.h r0 = r0.e((java.lang.String) r1)
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r1 = r7.this$0
                com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r1 = com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment.a((com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment) r1)
                java.lang.String r1 = r1.getAwemeId()
                if (r1 != 0) goto L_0x00a1
                java.lang.String r1 = ""
            L_0x00a1:
                com.ss.android.ugc.aweme.u.h r0 = r0.h(r1)
                r0.e()
            L_0x00a8:
                boolean r0 = com.ss.android.g.a.a()
                if (r0 != 0) goto L_0x00b3
                java.lang.String r0 = "share"
                com.ss.android.ugc.aweme.sec.a.a(r0)
            L_0x00b3:
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r0 = r7.this$0
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r1 = r7.this$0
                com.ss.android.ugc.aweme.share.SimpleShareDialog r1 = com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment.b((com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment) r1)
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment.f2812f
                r14 = 0
                r15 = 26066(0x65d2, float:3.6526E-41)
                java.lang.Class[] r2 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.share.SimpleShareDialog> r3 = com.ss.android.ugc.aweme.share.SimpleShareDialog.class
                r2[r10] = r3
                java.lang.Class r17 = java.lang.Boolean.TYPE
                r12 = r0
                r16 = r2
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r2 == 0) goto L_0x00f5
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment.f2812f
                r14 = 0
                r15 = 26066(0x65d2, float:3.6526E-41)
                java.lang.Class[] r1 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.share.SimpleShareDialog> r2 = com.ss.android.ugc.aweme.share.SimpleShareDialog.class
                r1[r10] = r2
                java.lang.Class r17 = java.lang.Boolean.TYPE
                r12 = r0
                r16 = r1
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r9 = r0.booleanValue()
                goto L_0x016e
            L_0x00f5:
                boolean r1 = r1.isThumbNull()
                if (r1 == 0) goto L_0x016d
                com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment r1 = r0.j
                if (r1 != 0) goto L_0x0104
                java.lang.String r2 = "mHotFragment"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            L_0x0104:
                android.support.v7.widget.RecyclerView r1 = r1.mListView
                if (r1 == 0) goto L_0x016d
                com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment r1 = r0.j
                if (r1 != 0) goto L_0x0111
                java.lang.String r2 = "mHotFragment"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            L_0x0111:
                android.support.v7.widget.RecyclerView r1 = r1.mListView
                java.lang.String r2 = "mHotFragment.listView"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                android.support.v7.widget.RecyclerView$Adapter r1 = r1.getAdapter()
                if (r1 == 0) goto L_0x016d
                com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment r1 = r0.j
                if (r1 != 0) goto L_0x0127
                java.lang.String r2 = "mHotFragment"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            L_0x0127:
                android.support.v7.widget.RecyclerView r1 = r1.mListView
                java.lang.String r2 = "mHotFragment.listView"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                android.support.v7.widget.RecyclerView$Adapter r1 = r1.getAdapter()
                if (r1 != 0) goto L_0x0137
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x0137:
                java.lang.String r2 = "mHotFragment.listView.adapter!!"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                int r1 = r1.getItemCount()
                if (r1 <= 0) goto L_0x016d
                com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment r0 = r0.j
                if (r0 != 0) goto L_0x014b
                java.lang.String r1 = "mHotFragment"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            L_0x014b:
                android.support.v7.widget.RecyclerView r0 = r0.mListView
                java.lang.String r1 = "mHotFragment.listView"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                android.support.v7.widget.RecyclerView$Adapter r0 = r0.getAdapter()
                if (r0 == 0) goto L_0x0165
                com.ss.android.ugc.aweme.common.adapter.AnimatedAdapter r0 = (com.ss.android.ugc.aweme.common.adapter.AnimatedAdapter) r0
                java.util.List r0 = r0.mItems
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x016d
                goto L_0x016e
            L_0x0165:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.common.adapter.AnimatedAdapter"
                r0.<init>(r1)
                throw r0
            L_0x016d:
                r9 = 0
            L_0x016e:
                r0 = 0
                if (r9 == 0) goto L_0x01bb
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r1 = r7.this$0
                com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment r1 = com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment.c(r1)
                android.support.v7.widget.RecyclerView r1 = r1.mListView
                java.lang.String r2 = "mHotFragment.listView"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                android.support.v7.widget.RecyclerView$Adapter r1 = r1.getAdapter()
                if (r1 == 0) goto L_0x01b3
                com.ss.android.ugc.aweme.challenge.adapter.DetailAwemeAdapter r1 = (com.ss.android.ugc.aweme.challenge.adapter.DetailAwemeAdapter) r1
                java.util.List r1 = r1.mItems
                java.lang.Object r1 = r1.get(r10)
                java.lang.String r2 = "(mHotFragment.listView.a…ailAwemeAdapter).items[0]"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
                com.ss.android.ugc.aweme.feed.model.Video r1 = r1.getVideo()
                java.lang.String r2 = "(mHotFragment.listView.a…meAdapter).items[0].video"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getCover()
                java.lang.String r2 = "(mHotFragment.listView.a…ter).items[0].video.cover"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                java.util.List r1 = r1.getUrlList()
                java.lang.Object r1 = r1.get(r10)
                java.lang.String r1 = (java.lang.String) r1
                com.ss.android.ugc.aweme.base.c.b(r1)
                goto L_0x01bc
            L_0x01b3:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.challenge.adapter.DetailAwemeAdapter"
                r0.<init>(r1)
                throw r0
            L_0x01bb:
                r1 = r0
            L_0x01bc:
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r2 = r7.this$0
                com.ss.android.ugc.aweme.discover.model.Challenge r2 = r2.m
                if (r2 != 0) goto L_0x01c5
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x01c5:
                com.ss.android.ugc.aweme.base.share.ShareInfo r2 = r2.getShareInfo()
                if (r2 == 0) goto L_0x01d8
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r2 = r7.this$0
                boolean r3 = com.ss.android.g.a.a()
                if (r3 == 0) goto L_0x01d4
                r0 = r1
            L_0x01d4:
                r2.a((java.lang.String) r0)
                goto L_0x01e1
            L_0x01d8:
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r1 = r7.this$0
                com.ss.android.ugc.aweme.share.SimpleShareDialog r1 = com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment.b((com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment) r1)
                r1.updateShareStruct(r0)
            L_0x01e1:
                com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r0 = r7.this$0
                com.ss.android.ugc.aweme.share.SimpleShareDialog r0 = com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment.b((com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment) r0)
                r0.show()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment.i.invoke(android.view.View):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function1<View, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ChallengeDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(ChallengeDetailFragment challengeDetailFragment) {
            super(1);
            this.this$0 = challengeDetailFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            String str;
            String str2;
            String str3;
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, changeQuickRedirect, false, 26137, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, changeQuickRedirect, false, 26137, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, AdvanceSetting.NETWORK_TYPE);
            if (TimeLockRuler.isTeenModeON()) {
                com.bytedance.ies.dmt.ui.d.a.c((Context) this.this$0.getActivity(), this.this$0.getString(C0906R.string.chy)).a();
                return;
            }
            this.this$0.n = UUID.randomUUID().toString();
            ChallengeDetailFragment challengeDetailFragment = this.this$0;
            if (PatchProxy.isSupport(new Object[0], challengeDetailFragment, ChallengeDetailFragment.f2812f, false, 26095, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], challengeDetailFragment, ChallengeDetailFragment.f2812f, false, 26095, new Class[0], Void.TYPE);
            } else {
                ChallengeDetailParam challengeDetailParam = challengeDetailFragment.k;
                if (challengeDetailParam == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
                }
                if (TextUtils.equals(challengeDetailParam.getEnterFrom(), "from_message")) {
                    str = "click_join_button";
                } else {
                    str = "click_tag_publish";
                }
                aj.b(str);
                aj.a(challengeDetailFragment.i());
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("route", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                    ChallengeDetailParam challengeDetailParam2 = challengeDetailFragment.k;
                    if (challengeDetailParam2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
                    }
                    jSONObject.put("group_id", challengeDetailParam2.getAwemeId());
                    com.ss.android.ugc.aweme.feed.a a2 = com.ss.android.ugc.aweme.feed.a.a();
                    ChallengeDetailParam challengeDetailParam3 = challengeDetailFragment.k;
                    if (challengeDetailParam3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
                    }
                    jSONObject.put("impr_type", aa.s(a2.b(challengeDetailParam3.getAwemeId())));
                    ChallengeDetailParam challengeDetailParam4 = challengeDetailFragment.k;
                    if (challengeDetailParam4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
                    }
                    if (!TextUtils.isEmpty(challengeDetailParam4.getEnterFrom())) {
                        ChallengeDetailParam challengeDetailParam5 = challengeDetailFragment.k;
                        if (challengeDetailParam5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
                        }
                        jSONObject.put("challenge_from", challengeDetailParam5.getEnterFrom());
                    }
                    ChallengeDetailParam challengeDetailParam6 = challengeDetailFragment.k;
                    if (challengeDetailParam6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
                    }
                    if (!TextUtils.isEmpty(challengeDetailParam6.getEnterpriseUid())) {
                        ChallengeDetailParam challengeDetailParam7 = challengeDetailFragment.k;
                        if (challengeDetailParam7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
                        }
                        jSONObject.put("page_uid", challengeDetailParam7.getEnterpriseUid());
                    }
                    com.ss.android.ugc.aweme.feed.a a3 = com.ss.android.ugc.aweme.feed.a.a();
                    ChallengeDetailParam challengeDetailParam8 = challengeDetailFragment.k;
                    if (challengeDetailParam8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
                    }
                    jSONObject.put("impr_type", aa.s(a3.b(challengeDetailParam8.getAwemeId())));
                    MobClick labelName = new MobClick().setEventName("shoot").setLabelName("challenge");
                    String str4 = challengeDetailFragment.l;
                    if (str4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mChallengeId");
                    }
                    com.ss.android.ugc.aweme.common.r.onEvent(labelName.setValue(str4).setJsonObject(jSONObject));
                    com.ss.android.ugc.aweme.app.d.d a4 = com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", challengeDetailFragment.n).a("shoot_way", "challenge").a("_staging_flag", com.ss.android.g.a.b() ^ true ? 1 : 0);
                    String str5 = challengeDetailFragment.l;
                    if (str5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mChallengeId");
                    }
                    com.ss.android.ugc.aweme.app.d.d a5 = a4.a("tag_id", str5);
                    com.ss.android.ugc.aweme.feed.a a6 = com.ss.android.ugc.aweme.feed.a.a();
                    ChallengeDetailParam challengeDetailParam9 = challengeDetailFragment.k;
                    if (challengeDetailParam9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
                    }
                    com.ss.android.ugc.aweme.app.d.d a7 = a5.a("impr_type", aa.s(a6.b(challengeDetailParam9.getAwemeId())));
                    ChallengeDetailParam challengeDetailParam10 = challengeDetailFragment.k;
                    if (challengeDetailParam10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
                    }
                    com.ss.android.ugc.aweme.app.d.d a8 = a7.a("group_id", challengeDetailParam10.getAwemeId());
                    ChallengeDetailParam challengeDetailParam11 = challengeDetailFragment.k;
                    if (challengeDetailParam11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
                    }
                    if (aa.e(challengeDetailParam11.getEnterFrom())) {
                        ai a9 = ai.a();
                        ChallengeDetailParam challengeDetailParam12 = challengeDetailFragment.k;
                        if (challengeDetailParam12 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
                        }
                        a8.a("log_pb", a9.a(aa.f(challengeDetailParam12.getAwemeId())));
                    }
                    com.ss.android.ugc.aweme.common.r.a("shoot", (Map) a8.f34114b);
                    CharSequence charSequence = "general_search";
                    ChallengeDetailParam challengeDetailParam13 = challengeDetailFragment.k;
                    if (challengeDetailParam13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
                    }
                    boolean equals = TextUtils.equals(charSequence, challengeDetailParam13.getEnterFrom());
                    CharSequence charSequence2 = "search_result";
                    ChallengeDetailParam challengeDetailParam14 = challengeDetailFragment.k;
                    if (challengeDetailParam14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
                    }
                    boolean equals2 = TextUtils.equals(charSequence2, challengeDetailParam14.getEnterFrom());
                    CharSequence charSequence3 = "search_for_you_list";
                    ChallengeDetailParam challengeDetailParam15 = challengeDetailFragment.k;
                    if (challengeDetailParam15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
                    }
                    boolean equals3 = TextUtils.equals(charSequence3, challengeDetailParam15.getEnterFrom());
                    if (equals || equals2 || equals3) {
                        com.ss.android.ugc.aweme.app.d.d a10 = com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", challengeDetailFragment.n).a("shoot_way", "challenge");
                        String str6 = challengeDetailFragment.l;
                        if (str6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mChallengeId");
                        }
                        com.ss.android.ugc.aweme.app.d.d a11 = a10.a("tag_id", str6);
                        if (equals) {
                            str2 = "general";
                        } else {
                            str2 = "tag";
                        }
                        com.ss.android.ugc.aweme.app.d.d a12 = a11.a("search_type", str2);
                        if (equals) {
                            str3 = "search_result";
                        } else {
                            ChallengeDetailParam challengeDetailParam16 = challengeDetailFragment.k;
                            if (challengeDetailParam16 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
                            }
                            str3 = challengeDetailParam16.getEnterFrom();
                        }
                        com.ss.android.ugc.aweme.common.r.a("search_shoot", (Map) a12.a("previous_page", str3).f34114b);
                    }
                    FragmentActivity activity = challengeDetailFragment.getActivity();
                    if (activity != null) {
                        Intent intent = activity.getIntent();
                        if (intent != null && intent.getBooleanExtra("from_notification", false)) {
                            String stringExtra = intent.getStringExtra("rule_id");
                            if (!TextUtils.isEmpty(stringExtra)) {
                                com.ss.android.ugc.aweme.app.d.d a13 = com.ss.android.ugc.aweme.app.d.d.a();
                                String str7 = challengeDetailFragment.l;
                                if (str7 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mChallengeId");
                                }
                                com.ss.android.ugc.aweme.app.d.d a14 = a13.a("tag_id", str7).a("route", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                                ChallengeDetailParam challengeDetailParam17 = challengeDetailFragment.k;
                                if (challengeDetailParam17 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
                                }
                                com.ss.android.ugc.aweme.common.r.a("shoot_from_push", (Map) a14.a("group_id", challengeDetailParam17.getAwemeId()).a("rule_id", stringExtra).f34114b);
                            }
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
            if (iAVService == null || !iAVService.needLoginBeforeRecord() || com.ss.android.g.a.a()) {
                Intrinsics.checkExpressionValueIsNotNull(iAVService, "avService");
                if (iAVService.getPublishService().checkIsAlreadyPublished(this.this$0.getContext())) {
                    Challenge challenge = this.this$0.m;
                    if (challenge != null) {
                        FragmentActivity activity2 = this.this$0.getActivity();
                        com.ss.android.ugc.aweme.shortvideo.c cVar = null;
                        if (!(activity2 instanceof AmeActivity)) {
                            activity2 = null;
                        }
                        AmeActivity ameActivity = (AmeActivity) activity2;
                        if (ameActivity != null) {
                            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().addChallenge(com.ss.android.ugc.aweme.shortvideo.o.a.b(challenge));
                            IAVPublishService publishService = iAVService.publishService();
                            Intrinsics.checkExpressionValueIsNotNull(publishService, "avService.publishService()");
                            publishService.setCurMusic(null);
                            Intent intent2 = new Intent();
                            intent2.putExtra("shoot_way", "challenge");
                            intent2.putExtra("creation_id", this.this$0.n);
                            intent2.putExtra("translation_type", 3);
                            intent2.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
                            if (this.this$0.m != null) {
                                cVar = new com.ss.android.ugc.aweme.shortvideo.o.a().apply(this.this$0.m);
                            }
                            intent2.putExtra("challenge", cVar);
                            if (com.ss.android.g.a.a()) {
                                intent2.putExtra("reverse_video_record_show_planD", true);
                            }
                            iAVService.startToolPermissionActivity(ameActivity, intent2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            String string = this.this$0.getString(C0906R.string.c7i);
            Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.shoot_after_login)");
            com.ss.android.ugc.aweme.login.e.a((Fragment) this.this$0, "challenge", "click_challenge_shoot", ad.a().a("login_title", string).f75487b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35502a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ChallengeDetailFragment f35503b;

        k(ChallengeDetailFragment challengeDetailFragment) {
            this.f35503b = challengeDetailFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f35502a, false, 26138, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f35502a, false, 26138, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f35503b.a(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function0<LinearLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ChallengeDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(ChallengeDetailFragment challengeDetailFragment) {
            super(0);
            this.this$0 = challengeDetailFragment;
        }

        public final LinearLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 26139, new Class[0], LinearLayout.class)) {
                return (LinearLayout) this.this$0.b((int) C0906R.id.anj);
            }
            return (LinearLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 26139, new Class[0], LinearLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/FrameLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class m extends Lambda implements Function0<FrameLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ChallengeDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(ChallengeDetailFragment challengeDetailFragment) {
            super(0);
            this.this$0 = challengeDetailFragment;
        }

        public final FrameLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 26140, new Class[0], FrameLayout.class)) {
                return (FrameLayout) this.this$0.b((int) C0906R.id.cup);
            }
            return (FrameLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 26140, new Class[0], FrameLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/challenge/ui/ChallengeSwipeRefreshLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class n extends Lambda implements Function0<ChallengeSwipeRefreshLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ChallengeDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(ChallengeDetailFragment challengeDetailFragment) {
            super(0);
            this.this$0 = challengeDetailFragment;
        }

        public final ChallengeSwipeRefreshLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 26141, new Class[0], ChallengeSwipeRefreshLayout.class)) {
                return (ChallengeSwipeRefreshLayout) this.this$0.b((int) C0906R.id.b_4);
            }
            return (ChallengeSwipeRefreshLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 26141, new Class[0], ChallengeSwipeRefreshLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class o extends Lambda implements Function0<ImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ChallengeDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(ChallengeDetailFragment challengeDetailFragment) {
            super(0);
            this.this$0 = challengeDetailFragment;
        }

        public final ImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 26142, new Class[0], ImageView.class)) {
                return (ImageView) this.this$0.b((int) C0906R.id.cp9);
            }
            return (ImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 26142, new Class[0], ImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class p extends Lambda implements Function0<View> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ChallengeDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(ChallengeDetailFragment challengeDetailFragment) {
            super(0);
            this.this$0 = challengeDetailFragment;
        }

        public final View invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 26143, new Class[0], View.class)) {
                return this.this$0.b((int) C0906R.id.cv0);
            }
            return (View) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 26143, new Class[0], View.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class q extends Lambda implements Function0<DmtStatusView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ChallengeDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(ChallengeDetailFragment challengeDetailFragment) {
            super(0);
            this.this$0 = challengeDetailFragment;
        }

        public final DmtStatusView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 26144, new Class[0], DmtStatusView.class)) {
                return (DmtStatusView) this.this$0.b((int) C0906R.id.cvd);
            }
            return (DmtStatusView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 26144, new Class[0], DmtStatusView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/util/HashMap;", "", "Landroid/view/View;", "Lkotlin/collections/HashMap;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class r extends Lambda implements Function0<HashMap<Integer, View>> {
        public static final r INSTANCE = new r();
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
            super(0);
        }

        @NotNull
        public final HashMap<Integer, View> invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 26145, new Class[0], HashMap.class)) {
                return new HashMap<>();
            }
            return (HashMap) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 26145, new Class[0], HashMap.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/challenge/viewmodel/ChallengeDetailViewModel;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class s extends Lambda implements Function0<ChallengeDetailViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ChallengeDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(ChallengeDetailFragment challengeDetailFragment) {
            super(0);
            this.this$0 = challengeDetailFragment;
        }

        @NotNull
        public final ChallengeDetailViewModel invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 26146, new Class[0], ChallengeDetailViewModel.class)) {
                return (ChallengeDetailViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 26146, new Class[0], ChallengeDetailViewModel.class);
            }
            ChallengeDetailViewModel.a aVar = ChallengeDetailViewModel.f35727d;
            FragmentActivity activity = this.this$0.getActivity();
            if (activity == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
            return aVar.a(activity);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class t extends Lambda implements Function1<View, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ChallengeDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(ChallengeDetailFragment challengeDetailFragment) {
            super(1);
            this.this$0 = challengeDetailFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, changeQuickRedirect, false, 26147, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, changeQuickRedirect, false, 26147, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, AdvanceSetting.NETWORK_TYPE);
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "Lcom/ss/android/ugc/aweme/challenge/model/ChallengeDetail;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class u extends Lambda implements Function2<com.bytedance.jedi.arch.f, ChallengeDetail, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ChallengeDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(ChallengeDetailFragment challengeDetailFragment) {
            super(2);
            this.this$0 = challengeDetailFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (ChallengeDetail) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull ChallengeDetail challengeDetail) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            ChallengeDetail challengeDetail2 = challengeDetail;
            if (PatchProxy.isSupport(new Object[]{fVar2, challengeDetail2}, this, changeQuickRedirect, false, 26150, new Class[]{com.bytedance.jedi.arch.f.class, ChallengeDetail.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, challengeDetail2}, this, changeQuickRedirect, false, 26150, new Class[]{com.bytedance.jedi.arch.f.class, ChallengeDetail.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            Intrinsics.checkParameterIsNotNull(challengeDetail2, AdvanceSetting.NETWORK_TYPE);
            this.this$0.a(challengeDetail2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class v extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ChallengeDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(ChallengeDetailFragment challengeDetailFragment) {
            super(1);
            this.this$0 = challengeDetailFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.jedi.arch.f) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            if (PatchProxy.isSupport(new Object[]{fVar2}, this, changeQuickRedirect, false, 26151, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2}, this, changeQuickRedirect, false, 26151, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            this.this$0.k().c(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class w extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ChallengeDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(ChallengeDetailFragment challengeDetailFragment) {
            super(2);
            this.this$0 = challengeDetailFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 26152, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 26152, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            Intrinsics.checkParameterIsNotNull(th2, AdvanceSetting.NETWORK_TYPE);
            ChallengeDetailFragment challengeDetailFragment = this.this$0;
            if (PatchProxy.isSupport(new Object[]{th2}, challengeDetailFragment, ChallengeDetailFragment.f2812f, false, 26078, new Class[]{Throwable.class}, Void.TYPE)) {
                Object[] objArr = {th2};
                ChallengeDetailFragment challengeDetailFragment2 = challengeDetailFragment;
                PatchProxy.accessDispatch(objArr, challengeDetailFragment2, ChallengeDetailFragment.f2812f, false, 26078, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            if (challengeDetailFragment.isViewValid()) {
                challengeDetailFragment.j().setRefreshing(false);
                challengeDetailFragment.k().a(true);
                FragmentActivity activity = challengeDetailFragment.getActivity();
                if (activity == null) {
                    Intrinsics.throwNpe();
                }
                com.ss.android.ugc.aweme.app.api.a.a.a((Context) activity, th2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class x implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35504a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ChallengeDetailFragment f35505b;

        x(ChallengeDetailFragment challengeDetailFragment) {
            this.f35505b = challengeDetailFragment;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f35504a, false, 26153, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f35504a, false, 26153, new Class[0], Void.TYPE);
                return;
            }
            this.f35505b.t.setMaxScrollHeight(Integer.MAX_VALUE);
        }
    }

    private final View t() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26047, new Class[0], View.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26047, new Class[0], View.class);
        } else {
            value = this.J.getValue();
        }
        return (View) value;
    }

    private final View u() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26048, new Class[0], View.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26048, new Class[0], View.class);
        } else {
            value = this.K.getValue();
        }
        return (View) value;
    }

    private final ImageView v() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26051, new Class[0], ImageView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26051, new Class[0], ImageView.class);
        } else {
            value = this.N.getValue();
        }
        return (ImageView) value;
    }

    private final LinearLayout w() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26052, new Class[0], LinearLayout.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26052, new Class[0], LinearLayout.class);
        } else {
            value = this.O.getValue();
        }
        return (LinearLayout) value;
    }

    private final ChallengeDetailJediViewModel x() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26054, new Class[0], ChallengeDetailJediViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26054, new Class[0], ChallengeDetailJediViewModel.class);
        } else {
            value = this.T.getValue();
        }
        return (ChallengeDetailJediViewModel) value;
    }

    @NotNull
    public final String a(int i2) {
        switch (i2) {
            case 0:
                return "challenge";
            case 1:
                return "challenge_fresh";
            default:
                return "";
        }
    }

    public final View b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2812f, false, 26122, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2812f, false, 26122, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.Z == null) {
            this.Z = new HashMap();
        }
        View view = (View) this.Z.get(Integer.valueOf(i2));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i2);
            this.Z.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    @NotNull
    public final String i() {
        return "challenge";
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public final ChallengeSwipeRefreshLayout j() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26049, new Class[0], ChallengeSwipeRefreshLayout.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26049, new Class[0], ChallengeSwipeRefreshLayout.class);
        } else {
            value = this.L.getValue();
        }
        return (ChallengeSwipeRefreshLayout) value;
    }

    public final DmtStatusView k() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26050, new Class[0], DmtStatusView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26050, new Class[0], DmtStatusView.class);
        } else {
            value = this.M.getValue();
        }
        return (DmtStatusView) value;
    }

    public final HashMap<Integer, View> l() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26056, new Class[0], HashMap.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26056, new Class[0], HashMap.class);
        } else {
            value = this.V.getValue();
        }
        return (HashMap) value;
    }

    public final int n() {
        return C0906R.layout.n6;
    }

    public final void a(@Nullable Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f2812f, false, 26059, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f2812f, false, 26059, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        Serializable serializable = bundle2 != null ? bundle2.getSerializable("challenge_detail_param") : null;
        this.k = serializable instanceof ChallengeDetailParam ? (ChallengeDetailParam) serializable : new ChallengeDetailParam(null, null, null, null, false, 0, 0, null, 0, 511, null);
        ChallengeDetailParam challengeDetailParam = this.k;
        if (challengeDetailParam == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
        }
        String cid = challengeDetailParam.getCid();
        if (cid == null) {
            cid = "";
        }
        this.l = cid;
        ChallengeDetailParam challengeDetailParam2 = this.k;
        if (challengeDetailParam2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
        }
        this.S = challengeDetailParam2.getShowTabIndex();
    }

    public final void a(String str) {
        IShareService.ShareStruct shareStruct;
        if (PatchProxy.isSupport(new Object[]{str}, this, f2812f, false, 26067, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f2812f, false, 26067, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.D == null || !(this.D.get(this.B) instanceof DetailAwemeListFragment)) {
            shareStruct = com.ss.android.ugc.aweme.feed.share.i.a((Context) getActivity(), this.m, str);
        } else {
            Object obj = this.D.get(this.B);
            if (obj != null) {
                shareStruct = com.ss.android.ugc.aweme.feed.share.i.a(getActivity(), this.m, str, ((DetailAwemeListFragment) obj).l());
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment");
            }
        }
        SimpleShareDialog simpleShareDialog = this.h;
        if (simpleShareDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mShareDialog");
        }
        simpleShareDialog.updateShareStruct(shareStruct);
    }

    public final void a(@NotNull Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f2812f, false, 26069, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, f2812f, false, 26069, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        if (TextUtils.isEmpty(this.n)) {
            this.n = UUID.randomUUID().toString();
        }
        intent.putExtra("creation_id", this.n);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2812f, false, 26076, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2812f, false, 26076, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (k().c(true)) {
            ChallengeDetailJediViewModel x2 = x();
            ChallengeDetailParam challengeDetailParam = this.k;
            if (challengeDetailParam == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
            }
            String cid = challengeDetailParam.getCid();
            ChallengeDetailParam challengeDetailParam2 = this.k;
            if (challengeDetailParam2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
            }
            int clickReason = challengeDetailParam2.getClickReason();
            ChallengeDetailParam challengeDetailParam3 = this.k;
            if (challengeDetailParam3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
            }
            x2.a(cid, clickReason, challengeDetailParam3.isHashTag());
            List<AbstractBaseDetailFragment.a> list = this.D;
            if (!z) {
                list = null;
            }
            if (list != null) {
                for (AbstractBaseDetailFragment.a e2 : list) {
                    e2.e();
                }
            }
        } else {
            j().setRefreshing(false);
        }
    }

    public final void a(ChallengeDetail challengeDetail) {
        com.ss.android.ugc.aweme.challenge.ui.header.a aVar;
        com.ss.android.ugc.aweme.challenge.ui.header.a aVar2;
        com.ss.android.ugc.aweme.challenge.ui.header.k kVar;
        com.ss.android.ugc.aweme.challenge.ui.header.c cVar;
        com.ss.android.ugc.aweme.challenge.ui.header.d dVar;
        ChallengeDetail challengeDetail2 = challengeDetail;
        if (PatchProxy.isSupport(new Object[]{challengeDetail2}, this, f2812f, false, 26077, new Class[]{ChallengeDetail.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{challengeDetail2}, this, f2812f, false, 26077, new Class[]{ChallengeDetail.class}, Void.TYPE);
        } else if (isViewValid()) {
            j().setRefreshing(false);
            if (challengeDetail2 == null || challengeDetail2.challenge == null) {
                k().b(false);
                return;
            }
            Challenge challenge = challengeDetail2.challenge;
            this.R = challengeDetail2;
            this.m = challenge;
            if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26079, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26079, new Class[0], Void.TYPE);
            } else {
                k().b(true);
                t().setAlpha(0.0f);
                View view = this.v;
                Intrinsics.checkExpressionValueIsNotNull(view, "mTitleColorCtrl");
                view.setAlpha(0.0f);
                TextView textView = this.u;
                textView.setVisibility(0);
                if (com.ss.android.g.a.a()) {
                    StringBuilder sb = new StringBuilder("#");
                    Challenge challenge2 = this.m;
                    if (challenge2 == null) {
                        Intrinsics.throwNpe();
                    }
                    sb.append(challenge2.getChallengeName());
                    textView.setText(sb.toString());
                    textView.setTextColor(textView.getResources().getColor(C0906R.color.a08));
                    if (textView != null) {
                        ((DmtTextView) textView).setFontType(com.bytedance.ies.dmt.ui.widget.util.c.f20595b);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtTextView");
                    }
                } else {
                    Challenge challenge3 = this.m;
                    if (challenge3 == null) {
                        Intrinsics.throwNpe();
                    }
                    textView.setText(challenge3.getChallengeName());
                }
                u().setEnabled(true);
                j().setEnabled(true);
                if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26080, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26080, new Class[0], Void.TYPE);
                } else {
                    ChallengeDetailParam challengeDetailParam = this.k;
                    if (challengeDetailParam == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
                    }
                    com.ss.android.ugc.aweme.challenge.ui.header.j jVar = new com.ss.android.ugc.aweme.challenge.ui.header.j(null, null, null, challengeDetailParam.getEnterFrom(), 7);
                    com.ss.android.ugc.aweme.challenge.ui.header.e eVar = this.Q;
                    if (eVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mHeaderFactory");
                    }
                    ChallengeDetail challengeDetail3 = this.R;
                    if (challengeDetail3 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (PatchProxy.isSupport(new Object[]{challengeDetail3, jVar}, eVar, com.ss.android.ugc.aweme.challenge.ui.header.e.f35629a, false, 26343, new Class[]{ChallengeDetail.class, com.ss.android.ugc.aweme.challenge.ui.header.j.class}, com.ss.android.ugc.aweme.challenge.ui.header.a.class)) {
                        Object[] objArr = {challengeDetail3, jVar};
                        com.ss.android.ugc.aweme.challenge.ui.header.e eVar2 = eVar;
                        aVar = (com.ss.android.ugc.aweme.challenge.ui.header.a) PatchProxy.accessDispatch(objArr, eVar2, com.ss.android.ugc.aweme.challenge.ui.header.e.f35629a, false, 26343, new Class[]{ChallengeDetail.class, com.ss.android.ugc.aweme.challenge.ui.header.j.class}, com.ss.android.ugc.aweme.challenge.ui.header.a.class);
                    } else {
                        Intrinsics.checkParameterIsNotNull(challengeDetail3, "data");
                        Intrinsics.checkParameterIsNotNull(jVar, "headerParam");
                        if (PatchProxy.isSupport(new Object[]{challengeDetail3, jVar}, eVar, com.ss.android.ugc.aweme.challenge.ui.header.e.f35629a, false, 26344, new Class[]{ChallengeDetail.class, com.ss.android.ugc.aweme.challenge.ui.header.j.class}, Void.TYPE)) {
                            Object[] objArr2 = {challengeDetail3, jVar};
                            com.ss.android.ugc.aweme.challenge.ui.header.e eVar3 = eVar;
                            PatchProxy.accessDispatch(objArr2, eVar3, com.ss.android.ugc.aweme.challenge.ui.header.e.f35629a, false, 26344, new Class[]{ChallengeDetail.class, com.ss.android.ugc.aweme.challenge.ui.header.j.class}, Void.TYPE);
                        } else {
                            Challenge challenge4 = challengeDetail3.challenge;
                            if (challenge4 == null || challenge4.getModuleType() != 1) {
                                kVar = com.ss.android.ugc.aweme.challenge.ui.header.k.TYPE_NORMAL;
                            } else {
                                kVar = com.ss.android.ugc.aweme.challenge.ui.header.k.TYPE_LARGE;
                            }
                            if (PatchProxy.isSupport(new Object[]{kVar}, jVar, com.ss.android.ugc.aweme.challenge.ui.header.j.f35669a, false, 26381, new Class[]{com.ss.android.ugc.aweme.challenge.ui.header.k.class}, Void.TYPE)) {
                                com.ss.android.ugc.aweme.challenge.ui.header.j jVar2 = jVar;
                                PatchProxy.accessDispatch(new Object[]{kVar}, jVar2, com.ss.android.ugc.aweme.challenge.ui.header.j.f35669a, false, 26381, new Class[]{com.ss.android.ugc.aweme.challenge.ui.header.k.class}, Void.TYPE);
                            } else {
                                Intrinsics.checkParameterIsNotNull(kVar, "<set-?>");
                                jVar.f35670b = kVar;
                            }
                            Intrinsics.checkExpressionValueIsNotNull(challenge4, "challenge");
                            if (challenge4.getModuleType() == 1) {
                                cVar = com.ss.android.ugc.aweme.challenge.ui.header.c.TYPE_NO_LINK;
                            } else {
                                cVar = com.ss.android.ugc.aweme.challenge.ui.header.c.TYPE_LINK;
                            }
                            if (PatchProxy.isSupport(new Object[]{cVar}, jVar, com.ss.android.ugc.aweme.challenge.ui.header.j.f35669a, false, 26382, new Class[]{com.ss.android.ugc.aweme.challenge.ui.header.c.class}, Void.TYPE)) {
                                com.ss.android.ugc.aweme.challenge.ui.header.j jVar3 = jVar;
                                PatchProxy.accessDispatch(new Object[]{cVar}, jVar3, com.ss.android.ugc.aweme.challenge.ui.header.j.f35669a, false, 26382, new Class[]{com.ss.android.ugc.aweme.challenge.ui.header.c.class}, Void.TYPE);
                            } else {
                                Intrinsics.checkParameterIsNotNull(cVar, "<set-?>");
                                jVar.f35671c = cVar;
                            }
                            if (com.ss.android.ugc.aweme.challenge.ui.header.a.f2820f.a(challengeDetail3)) {
                                dVar = com.ss.android.ugc.aweme.challenge.ui.header.d.TYPE_TRANSFORM;
                            } else if (com.ss.android.ugc.aweme.challenge.ui.header.i.f35649c.a(challengeDetail3)) {
                                dVar = com.ss.android.ugc.aweme.challenge.ui.header.d.TYPE_TRANSFORM;
                            } else {
                                dVar = com.ss.android.ugc.aweme.challenge.ui.header.d.TYPE_NORMAL;
                            }
                            if (PatchProxy.isSupport(new Object[]{dVar}, jVar, com.ss.android.ugc.aweme.challenge.ui.header.j.f35669a, false, 26383, new Class[]{com.ss.android.ugc.aweme.challenge.ui.header.d.class}, Void.TYPE)) {
                                com.ss.android.ugc.aweme.challenge.ui.header.j jVar4 = jVar;
                                PatchProxy.accessDispatch(new Object[]{dVar}, jVar4, com.ss.android.ugc.aweme.challenge.ui.header.j.f35669a, false, 26383, new Class[]{com.ss.android.ugc.aweme.challenge.ui.header.d.class}, Void.TYPE);
                            } else {
                                Intrinsics.checkParameterIsNotNull(dVar, "<set-?>");
                                jVar.f35672d = dVar;
                            }
                        }
                        if (eVar.f35631b != null) {
                            Pair<com.ss.android.ugc.aweme.challenge.ui.header.j, ? extends com.ss.android.ugc.aweme.challenge.ui.header.a> pair = eVar.f35631b;
                            if (pair == null) {
                                Intrinsics.throwNpe();
                            }
                            if (Intrinsics.areEqual((Object) (com.ss.android.ugc.aweme.challenge.ui.header.j) pair.getFirst(), (Object) jVar)) {
                                Pair<com.ss.android.ugc.aweme.challenge.ui.header.j, ? extends com.ss.android.ugc.aweme.challenge.ui.header.a> pair2 = eVar.f35631b;
                                if (pair2 == null) {
                                    Intrinsics.throwNpe();
                                }
                                aVar = (com.ss.android.ugc.aweme.challenge.ui.header.a) pair2.getSecond();
                                aVar.a(challengeDetail3);
                            }
                        }
                        if (PatchProxy.isSupport(new Object[]{jVar}, eVar, com.ss.android.ugc.aweme.challenge.ui.header.e.f35629a, false, 26345, new Class[]{com.ss.android.ugc.aweme.challenge.ui.header.j.class}, com.ss.android.ugc.aweme.challenge.ui.header.a.class)) {
                            Object[] objArr3 = {jVar};
                            com.ss.android.ugc.aweme.challenge.ui.header.e eVar4 = eVar;
                            aVar2 = (com.ss.android.ugc.aweme.challenge.ui.header.a) PatchProxy.accessDispatch(objArr3, eVar4, com.ss.android.ugc.aweme.challenge.ui.header.e.f35629a, false, 26345, new Class[]{com.ss.android.ugc.aweme.challenge.ui.header.j.class}, com.ss.android.ugc.aweme.challenge.ui.header.a.class);
                        } else {
                            switch (com.ss.android.ugc.aweme.challenge.ui.header.f.f35634a[jVar.f35670b.ordinal()]) {
                                case 1:
                                    aVar2 = new com.ss.android.ugc.aweme.challenge.ui.header.o(eVar.f35632c, jVar, null, 4);
                                    break;
                                case 2:
                                    aVar2 = new com.ss.android.ugc.aweme.challenge.ui.header.m(eVar.f35632c, jVar, null, 4);
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                        }
                        eVar.f35631b = new Pair<>(jVar, aVar2);
                        aVar = aVar2;
                        aVar.a(challengeDetail3);
                    }
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    if (this.P != null && (!Intrinsics.areEqual((Object) this.P, (Object) aVar))) {
                        w().removeView(this.P);
                        w().addView(aVar, layoutParams);
                    } else if (this.P == null) {
                        w().addView(aVar, layoutParams);
                        aVar.post(new x(this));
                    }
                    this.P = aVar;
                }
                if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26081, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26081, new Class[0], Void.TYPE);
                } else if (this.P != null) {
                    AwemeViewPagerNavigator awemeViewPagerNavigator = this.x;
                    if (awemeViewPagerNavigator == null || awemeViewPagerNavigator.getVisibility() != 0) {
                        com.ss.android.ugc.aweme.challenge.ui.header.a aVar3 = this.P;
                        if (aVar3 == null) {
                            Intrinsics.throwNpe();
                        }
                        aVar3.d();
                    }
                }
            }
            String str = this.l;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChallengeId");
            }
            Intrinsics.checkExpressionValueIsNotNull(challenge, "challenge");
            if (!TextUtils.equals(str, challenge.getCid())) {
                String cid = challenge.getCid();
                Intrinsics.checkExpressionValueIsNotNull(cid, "challenge.cid");
                this.l = cid;
                List<AbstractBaseDetailFragment.a> list = this.D;
                Intrinsics.checkExpressionValueIsNotNull(list, "mFragments");
                for (AbstractBaseDetailFragment.a aVar4 : list) {
                    String str2 = this.l;
                    if (str2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mChallengeId");
                    }
                    aVar4.a(str2);
                }
            }
            n nVar = this.i;
            if (nVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCommerceDelegate");
            }
            int i2 = this.S;
            if (PatchProxy.isSupport(new Object[]{challengeDetail2, Integer.valueOf(i2)}, nVar, n.f35704a, false, 26175, new Class[]{ChallengeDetail.class, Integer.TYPE}, Void.TYPE)) {
                n nVar2 = nVar;
                PatchProxy.accessDispatch(new Object[]{challengeDetail2, Integer.valueOf(i2)}, nVar2, n.f35704a, false, 26175, new Class[]{ChallengeDetail.class, Integer.TYPE}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(challengeDetail2, "data");
                nVar.f35707d = challengeDetail2;
                Challenge challenge5 = challengeDetail2.challenge;
                Intrinsics.checkExpressionValueIsNotNull(challenge5, "data.challenge");
                nVar.f35708e = challenge5;
                nVar.b();
                nVar.a(i2);
            }
            this.S = -1;
        }
    }

    public final void a(int i2, int i3) {
        int i4 = 2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f2812f, false, 26092, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f2812f, false, 26092, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(i2, i3);
        if (i2 != 0) {
            i4 = 3;
        }
        bg.a(new com.ss.android.ugc.aweme.profile.a.e(i4, 1, i3));
        Set<Map.Entry<Integer, View>> entrySet = l().entrySet();
        if (!com.ss.android.g.a.a()) {
            entrySet = null;
        }
        if (entrySet != null) {
            for (Map.Entry entry : entrySet) {
                Object value = entry.getValue();
                Intrinsics.checkExpressionValueIsNotNull(value, "it.value");
                View view = (View) value;
                Integer num = (Integer) entry.getKey();
                view.setSelected(num != null && num.intValue() == i2);
            }
        }
        if (this.D != null) {
            Object obj = this.D.get(i2);
            AbstractBaseDetailFragment.a aVar = (AbstractBaseDetailFragment.a) obj;
            Intrinsics.checkExpressionValueIsNotNull(aVar, AdvanceSetting.NETWORK_TYPE);
            if (!aVar.c()) {
                obj = null;
            }
            AbstractBaseDetailFragment.a aVar2 = (AbstractBaseDetailFragment.a) obj;
            if (aVar2 != null) {
                aVar2.e();
            }
        }
    }

    public final void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f2812f, false, 26093, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f2812f, false, 26093, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        super.a(f2, f3);
        n nVar = this.i;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCommerceDelegate");
        }
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, nVar, n.f35704a, false, 26180, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            n nVar2 = nVar;
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, nVar2, n.f35704a, false, 26180, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        Fragment item = nVar.a().getItem(nVar.f35705b.getCurrentItem());
        if ((item instanceof CommerceChallengeFragment) && f3 != 0.0f) {
            ((CommerceChallengeFragment) item).d();
        }
    }

    public final /* bridge */ /* synthetic */ ViewModelProvider.Factory r_() {
        return this.o;
    }

    @NotNull
    public final com.bytedance.jedi.arch.k a() {
        if (!PatchProxy.isSupport(new Object[0], this, f2812f, false, 26100, new Class[0], com.bytedance.jedi.arch.k.class)) {
            return h.a.a(this);
        }
        return (com.bytedance.jedi.arch.k) PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26100, new Class[0], com.bytedance.jedi.arch.k.class);
    }

    @NotNull
    public final com.bytedance.jedi.arch.r<com.bytedance.jedi.arch.f> b() {
        if (!PatchProxy.isSupport(new Object[0], this, f2812f, false, 26103, new Class[0], com.bytedance.jedi.arch.r.class)) {
            return h.a.b(this);
        }
        return (com.bytedance.jedi.arch.r) PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26103, new Class[0], com.bytedance.jedi.arch.r.class);
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, f2812f, false, 26104, new Class[0], Boolean.TYPE)) {
            return h.a.e(this);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26104, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @NotNull
    public final LifecycleOwner d() {
        if (!PatchProxy.isSupport(new Object[0], this, f2812f, false, 26101, new Class[0], LifecycleOwner.class)) {
            return h.a.c(this);
        }
        return (LifecycleOwner) PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26101, new Class[0], LifecycleOwner.class);
    }

    public final /* synthetic */ com.bytedance.jedi.arch.d e() {
        com.bytedance.jedi.arch.f fVar;
        if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26102, new Class[0], com.bytedance.jedi.arch.f.class)) {
            fVar = (com.bytedance.jedi.arch.f) PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26102, new Class[0], com.bytedance.jedi.arch.f.class);
        } else {
            fVar = h.a.d(this);
        }
        return fVar;
    }

    public final boolean g() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26061, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26061, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (com.ss.android.g.a.a()) {
            z = super.g();
        }
        return z;
    }

    @NotNull
    public final List<AbstractBaseDetailFragment.a> m() {
        if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26057, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26057, new Class[0], List.class);
        }
        List<AbstractBaseDetailFragment.a> list = this.D;
        Intrinsics.checkExpressionValueIsNotNull(list, "mFragments");
        return list;
    }

    @NotNull
    public final String o() {
        if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26060, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26060, new Class[0], String.class);
        }
        String str = this.l;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChallengeId");
        }
        return str;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26123, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26123, new Class[0], Void.TYPE);
            return;
        }
        if (this.Z != null) {
            this.Z.clear();
        }
    }

    @NotNull
    public final String p() {
        if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26062, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26062, new Class[0], String.class);
        } else if (com.ss.android.g.a.a()) {
            return "click_challenge_shoot";
        } else {
            return "challenge";
        }
    }

    @NotNull
    public final com.ss.android.ugc.aweme.views.l<?> r() {
        if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26073, new Class[0], com.ss.android.ugc.aweme.views.l.class)) {
            return (com.ss.android.ugc.aweme.views.l) PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26073, new Class[0], com.ss.android.ugc.aweme.views.l.class);
        } else if (com.ss.android.g.a.a()) {
            return new f<>(this);
        } else {
            com.ss.android.ugc.aweme.views.l<?> r2 = super.r();
            Intrinsics.checkExpressionValueIsNotNull(r2, "super.getTabFactory()");
            return r2;
        }
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26072, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26072, new Class[0], Void.TYPE);
            return;
        }
        super.q();
        if (com.ss.android.g.a.b()) {
            AwemeViewPagerNavigator awemeViewPagerNavigator = this.x;
            if (awemeViewPagerNavigator != null) {
                awemeViewPagerNavigator.setBackgroundResource(C0906R.color.h5);
            }
        } else if (com.ss.android.g.a.c()) {
            AwemeViewPagerNavigator awemeViewPagerNavigator2 = this.x;
            if (awemeViewPagerNavigator2 != null) {
                awemeViewPagerNavigator2.setBackgroundResource(C0906R.color.a7l);
            }
        }
    }

    public ChallengeDetailFragment() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChallengeDetailJediViewModel.class);
        this.T = new lifecycleAwareLazy(this, new b(this, orCreateKotlinClass, a.INSTANCE, orCreateKotlinClass));
        this.U = h.a(new s(this));
        this.V = h.a(r.INSTANCE);
        this.Y = -1;
    }

    @NotNull
    public final FragmentPagerAdapter s() {
        Object obj;
        Object value;
        String str;
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26074, new Class[0], FragmentPagerAdapter.class)) {
            return (FragmentPagerAdapter) PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26074, new Class[0], FragmentPagerAdapter.class);
        }
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.f2808b = new ArrayList();
        if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26075, new Class[0], DetailAwemeListFragment.class)) {
            obj = PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26075, new Class[0], DetailAwemeListFragment.class);
        } else {
            FragmentManager childFragmentManager = getChildFragmentManager();
            obj = childFragmentManager.findFragmentByTag(AbstractDetailFragment.r + 0);
            if (!(obj instanceof DetailAwemeListFragment)) {
                String str2 = this.l;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChallengeId");
                }
                ChallengeDetailParam challengeDetailParam = this.k;
                if (challengeDetailParam == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
                }
                boolean isHashTag = challengeDetailParam.isHashTag();
                ChallengeDetailParam challengeDetailParam2 = this.k;
                if (challengeDetailParam2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
                }
                if (challengeDetailParam2.isHashTag()) {
                    str = this.l;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mChallengeId");
                    }
                } else {
                    str = "";
                }
                String str3 = str;
                ChallengeDetailParam challengeDetailParam3 = this.k;
                if (challengeDetailParam3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
                }
                obj = DetailAwemeListFragment.a(2, "challenge", str2, isHashTag, str3, challengeDetailParam3.getEnterFrom());
                DetailAwemeListFragment detailAwemeListFragment = (DetailAwemeListFragment) obj;
                detailAwemeListFragment.a((com.ss.android.ugc.aweme.fragment.a) new d(this));
                if (this.B == 0) {
                    z = true;
                } else {
                    z = false;
                }
                detailAwemeListFragment.m = z;
                detailAwemeListFragment.n = true;
            }
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment");
            }
        }
        this.j = (DetailAwemeListFragment) obj;
        List list = this.D;
        DetailAwemeListFragment detailAwemeListFragment2 = this.j;
        if (detailAwemeListFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHotFragment");
        }
        list.add(detailAwemeListFragment2);
        List list2 = this.E;
        DetailAwemeListFragment detailAwemeListFragment3 = this.j;
        if (detailAwemeListFragment3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHotFragment");
        }
        list2.add(detailAwemeListFragment3);
        this.f2808b.add(2);
        if (com.ss.android.g.a.a() && g()) {
            if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26055, new Class[0], ChallengeDetailViewModel.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26055, new Class[0], ChallengeDetailViewModel.class);
            } else {
                value = this.U.getValue();
            }
            ((ChallengeDetailViewModel) value).f35728b.observe(this, new e(this));
        }
        return new ProfileFragmentAdapter(getChildFragmentManager(), this.E, this.f2808b);
    }

    public static final /* synthetic */ ChallengeDetailParam a(ChallengeDetailFragment challengeDetailFragment) {
        ChallengeDetailParam challengeDetailParam = challengeDetailFragment.k;
        if (challengeDetailParam == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
        }
        return challengeDetailParam;
    }

    public static final /* synthetic */ SimpleShareDialog b(ChallengeDetailFragment challengeDetailFragment) {
        SimpleShareDialog simpleShareDialog = challengeDetailFragment.h;
        if (simpleShareDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mShareDialog");
        }
        return simpleShareDialog;
    }

    public static final /* synthetic */ DetailAwemeListFragment c(ChallengeDetailFragment challengeDetailFragment) {
        DetailAwemeListFragment detailAwemeListFragment = challengeDetailFragment.j;
        if (detailAwemeListFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHotFragment");
        }
        return detailAwemeListFragment;
    }

    public boolean checkStatus(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f2812f, false, 26082, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f2812f, false, 26082, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.a() || !cg.a(str, 5)) {
            return true;
        } else {
            if (!(getActivity() == null || this.m == null)) {
                Challenge challenge = this.m;
                if (challenge == null) {
                    Intrinsics.throwNpe();
                }
                if (challenge.getShareInfo() != null) {
                    StringBuilder sb = new StringBuilder("sslocal://challenge/detail/");
                    String str2 = this.l;
                    if (str2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mChallengeId");
                    }
                    sb.append(str2);
                    String sb2 = sb.toString();
                    Context activity = getActivity();
                    Challenge challenge2 = this.m;
                    if (challenge2 == null) {
                        Intrinsics.throwNpe();
                    }
                    ShareCommandFactory shareCommandFactory = new ShareCommandFactory(activity, str, challenge2.getShareInfo());
                    String str3 = this.l;
                    if (str3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mChallengeId");
                    }
                    shareCommandFactory.a(sb2, 2, str3);
                    SimpleShareDialog simpleShareDialog = this.h;
                    if (simpleShareDialog == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mShareDialog");
                    }
                    simpleShareDialog.dismiss();
                    a(str, "token", null);
                }
            }
            return false;
        }
    }

    @Subscribe
    public final void onMusicCollectEvent(@NotNull com.ss.android.ugc.aweme.music.a.e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f2812f, false, 26090, new Class[]{com.ss.android.ugc.aweme.music.a.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f2812f, false, 26090, new Class[]{com.ss.android.ugc.aweme.music.a.e.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(eVar, "event");
        if (isViewValid()) {
            MusicModel musicModel = eVar.f56170b;
            if (musicModel != null) {
                Music music = musicModel.getMusic();
                if (music != null) {
                    int i2 = eVar.f56169a;
                    music.setCollectStatus(i2);
                    if (PatchProxy.isSupport(new Object[]{music, Integer.valueOf(i2)}, this, f2812f, false, 26091, new Class[]{Music.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{music, Integer.valueOf(i2)}, this, f2812f, false, 26091, new Class[]{Music.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (this.m != null) {
                        Challenge challenge = this.m;
                        if (challenge == null) {
                            Intrinsics.throwNpe();
                        }
                        if (challenge.getConnectMusics() != null) {
                            Challenge challenge2 = this.m;
                            if (challenge2 == null) {
                                Intrinsics.throwNpe();
                            }
                            Music a2 = com.ss.android.ugc.aweme.music.util.d.a(challenge2.getConnectMusics(), music.getMid());
                            if (a2 != null) {
                                a2.setCollectStatus(i2);
                            }
                        }
                    }
                }
            }
        }
    }

    public void onShareComplete(@Nullable IShareService.ShareResult shareResult) {
        if (PatchProxy.isSupport(new Object[]{shareResult}, this, f2812f, false, 26088, new Class[]{IShareService.ShareResult.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareResult}, this, f2812f, false, 26088, new Class[]{IShareService.ShareResult.class}, Void.TYPE);
        } else if (this.m != null && shareResult != null) {
            String str = shareResult.type;
            if (PatchProxy.isSupport(new Object[]{str}, this, f2812f, false, 26098, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f2812f, false, 26098, new Class[]{String.class}, Void.TYPE);
            } else {
                MobClick labelName = new MobClick().setEventName("share_challenge").setLabelName(str);
                Challenge challenge = this.m;
                if (challenge == null) {
                    Intrinsics.throwNpe();
                }
                MobClick extValueString = labelName.setExtValueString(challenge.getCid());
                com.ss.android.ugc.aweme.common.t tVar = new com.ss.android.ugc.aweme.common.t();
                DetailAwemeListFragment detailAwemeListFragment = this.j;
                if (detailAwemeListFragment == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHotFragment");
                }
                com.ss.android.ugc.aweme.common.r.onEvent(extValueString.setJsonObject(tVar.a("request_id", detailAwemeListFragment.i().toString()).a()));
            }
            if (!TextUtils.equals(shareResult.type, "qr_code")) {
                a(shareResult.type, "normal_share", null);
            }
            ((ShareOrderService) ServiceManager.get().getService(ShareOrderService.class)).addShareRecord(shareResult.type);
        }
    }

    @Subscribe
    public final void onVideoEvent(@NotNull ar arVar) {
        if (PatchProxy.isSupport(new Object[]{arVar}, this, f2812f, false, 26089, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar}, this, f2812f, false, 26089, new Class[]{ar.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(arVar, "event");
        if (arVar.f45292b == 2 && isViewValid() && this.m != null) {
            Object obj = arVar.f45293c;
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                Aweme b2 = com.ss.android.ugc.aweme.feed.a.a().b(str);
                if (b2 != null) {
                    List<Challenge> challengeList = b2.getChallengeList();
                    if (challengeList != null) {
                        for (Challenge challenge : challengeList) {
                            Intrinsics.checkExpressionValueIsNotNull(challenge, AdvanceSetting.NETWORK_TYPE);
                            String cid = challenge.getCid();
                            Challenge challenge2 = this.m;
                            if (challenge2 == null) {
                                Intrinsics.throwNpe();
                            }
                            if (StringUtils.equal(cid, challenge2.getCid())) {
                                Challenge challenge3 = this.m;
                                if (challenge3 == null) {
                                    Intrinsics.throwNpe();
                                }
                                if (challenge3.getUserCount() > 0) {
                                    Challenge challenge4 = this.m;
                                    if (challenge4 == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    Challenge challenge5 = this.m;
                                    if (challenge5 == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    challenge4.setUserCount(challenge5.getUserCount() - 1);
                                    a(this.R);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private final void a(@NotNull View view, Function1<? super View, Unit> function1) {
        View view2 = view;
        Function1<? super View, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{view2, function12}, this, f2812f, false, 26058, new Class[]{View.class, Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, function12}, this, f2812f, false, 26058, new Class[]{View.class, Function1.class}, Void.TYPE);
            return;
        }
        view2.setOnClickListener(new g(this, function12));
    }

    public final void b(int i2, int i3) {
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f2812f, false, 26094, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f2812f, false, 26094, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.b(i2, i3);
        n nVar = this.i;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCommerceDelegate");
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, nVar, n.f35704a, false, 26179, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = n.f35704a;
            Object[] objArr2 = objArr;
            n nVar2 = nVar;
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            PatchProxy.accessDispatch(objArr2, nVar2, changeQuickRedirect2, false, 26179, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else {
            Fragment item = nVar.a().getItem(nVar.f35705b.getCurrentItem());
            if ((item instanceof CommerceChallengeFragment) && i4 != 0) {
                ((CommerceChallengeFragment) item).d();
            }
        }
        j().setChildScrollY(i4);
        com.ss.android.ugc.aweme.challenge.ui.header.a aVar = this.P;
        if (aVar != null) {
            if (this.Y != w().getBottom()) {
                int bottom = w().getBottom();
                View view = this.v;
                Intrinsics.checkExpressionValueIsNotNull(view, "mTitleColorCtrl");
                this.W = (float) ((bottom - view.getBottom()) - t().getHeight());
                this.X = this.W - UIUtils.dip2Px(getContext(), 20.0f);
                if (this.X < 0.0f) {
                    this.X = 0.0f;
                }
                this.Y = w().getBottom();
            }
            float f2 = (((float) i4) - this.X) / (this.W - this.X);
            if (f2 < 0.0f) {
                f2 = 0.0f;
            } else if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            TextView textView = this.u;
            Intrinsics.checkExpressionValueIsNotNull(textView, "mTitle");
            textView.setAlpha(f2);
            aVar.setHeaderAlpha(f2);
        }
    }

    public boolean onAction(@Nullable IShareService.ShareStruct shareStruct, @Nullable String str) {
        long j2;
        String str2;
        String str3;
        IShareService.ShareStruct shareStruct2 = shareStruct;
        String str4 = str;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{shareStruct2, str4}, this, f2812f, false, 26083, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct2, str4}, this, f2812f, false, 26083, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        CharSequence charSequence = str4;
        String str5 = null;
        if (TextUtils.equals(charSequence, "copy")) {
            if (PatchProxy.isSupport(new Object[]{shareStruct2}, this, f2812f, false, 26084, new Class[]{IShareService.ShareStruct.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct2}, this, f2812f, false, 26084, new Class[]{IShareService.ShareStruct.class}, Boolean.TYPE)).booleanValue();
            } else {
                Context context = getContext();
                if (context == null) {
                    Intrinsics.throwNpe();
                }
                Object systemService = context.getSystemService("clipboard");
                if (systemService != null) {
                    ClipboardManager clipboardManager = (ClipboardManager) systemService;
                    if (!com.ss.android.g.a.a()) {
                        StringBuilder sb = new StringBuilder();
                        Challenge challenge = this.m;
                        if (challenge == null) {
                            Intrinsics.throwNpe();
                        }
                        ShareInfo shareInfo = challenge.getShareInfo();
                        Intrinsics.checkExpressionValueIsNotNull(shareInfo, "mChallenge!!.shareInfo");
                        sb.append(shareInfo.getShareWeiboDesc());
                        sb.append(" ");
                        sb.append(cg.a(shareStruct2, "copy"));
                        str2 = sb.toString();
                    } else {
                        com.ss.android.ugc.aweme.n a2 = com.ss.android.ugc.aweme.u.a();
                        if (shareStruct2 != null) {
                            str5 = shareStruct2.url;
                        }
                        if (TextUtils.isEmpty(str5)) {
                            Challenge challenge2 = this.m;
                            if (challenge2 == null) {
                                Intrinsics.throwNpe();
                            }
                            ShareInfo shareInfo2 = challenge2.getShareInfo();
                            Intrinsics.checkExpressionValueIsNotNull(shareInfo2, "mChallenge!!.shareInfo");
                            str3 = shareInfo2.getShareUrl();
                        } else {
                            if (shareStruct2 == null) {
                                Intrinsics.throwNpe();
                            }
                            str3 = shareStruct2.url;
                        }
                        Challenge challenge3 = this.m;
                        if (challenge3 == null) {
                            Intrinsics.throwNpe();
                        }
                        ShareInfo shareInfo3 = challenge3.getShareInfo();
                        Intrinsics.checkExpressionValueIsNotNull(shareInfo3, "mChallenge!!.shareInfo");
                        if (shareInfo3.getBoolPersist() == 1) {
                            z = true;
                        }
                        str2 = a2.a(str3, z);
                    }
                    CharSequence charSequence2 = str2;
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(charSequence2, charSequence2));
                    com.bytedance.ies.dmt.ui.d.a.a(getContext(), (int) C0906R.string.a2a).a();
                    Context activity = getActivity();
                    Challenge challenge4 = this.m;
                    if (challenge4 == null) {
                        Intrinsics.throwNpe();
                    }
                    com.ss.android.ugc.aweme.common.r.a(activity, "share_challenge", "copy", challenge4.getCid(), 0);
                    return true;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ClipboardManager");
            }
        } else {
            int i2 = 23;
            if (TextUtils.equals(charSequence, "qr_code")) {
                if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26085, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26085, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    Challenge challenge5 = this.m;
                    if (challenge5 != null) {
                        if (!com.ss.android.ugc.aweme.commercialize.utils.r.b(challenge5)) {
                            i2 = 2;
                        }
                        if (!cg.c() || com.ss.android.g.a.a()) {
                            if (com.ss.android.g.a.a()) {
                                j2 = (long) challenge5.getUserCount();
                            } else {
                                j2 = challenge5.getDisplayCount();
                            }
                            d.a aVar = new d.a();
                            String cid = challenge5.getCid();
                            ChallengeDetailParam challengeDetailParam = this.k;
                            if (challengeDetailParam == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
                            }
                            QRCodeActivityV2.a(getContext(), aVar.a(i2, cid, challengeDetailParam.isHashTag(), challenge5.getChallengeName(), "challenge").a(challenge5.getChallengeName(), j2).f63387b);
                        } else {
                            new z(getActivity(), new bt.a().a(i2, challenge5.getCid(), "challenge").c(challenge5.getChallengeName(), challenge5.getDisplayCount()).f64830b).show();
                        }
                        if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26096, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26096, new Class[0], Void.TYPE);
                        } else {
                            com.ss.android.ugc.aweme.app.d.d a3 = com.ss.android.ugc.aweme.app.d.d.a();
                            String str6 = this.l;
                            if (str6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mChallengeId");
                            }
                            com.ss.android.ugc.aweme.common.r.a("click_qr_code", (Map) a3.a("tag_id", str6).a("platform", "scan").a("qr_code_type", "shaped").a("enter_from", "challenge").f34114b);
                        }
                        return true;
                    }
                }
            } else if (TextUtils.equals(charSequence, "chat_merge")) {
                if (PatchProxy.isSupport(new Object[]{shareStruct2}, this, f2812f, false, 26087, new Class[]{IShareService.ShareStruct.class}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct2}, this, f2812f, false, 26087, new Class[]{IShareService.ShareStruct.class}, Boolean.TYPE)).booleanValue();
                } else {
                    if (!com.ss.android.g.a.a()) {
                        IAccountUserService a4 = com.ss.android.ugc.aweme.account.d.a();
                        Intrinsics.checkExpressionValueIsNotNull(a4, "AccountUserProxyService.get()");
                        if (!a4.isLogin()) {
                            com.ss.android.ugc.aweme.login.e.a((Fragment) this, "", "click_shareim_button");
                        }
                    }
                    if (this.D == null) {
                        com.ss.android.ugc.aweme.im.b.a(getContext(), shareStruct2, (List<Aweme>) null);
                    } else {
                        AbstractBaseDetailFragment.a aVar2 = (AbstractBaseDetailFragment.a) this.D.get(this.B);
                        if (aVar2 instanceof DetailAwemeListFragment) {
                            com.ss.android.ugc.aweme.im.b.a(getContext(), shareStruct2, ((DetailAwemeListFragment) aVar2).l());
                        }
                    }
                    return true;
                }
            } else if (cg.b(str)) {
                if (PatchProxy.isSupport(new Object[]{str4}, this, f2812f, false, 26086, new Class[]{String.class}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{str4}, this, f2812f, false, 26086, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
                } else {
                    Challenge challenge6 = this.m;
                    if (challenge6 != null) {
                        if (!com.ss.android.ugc.aweme.commercialize.utils.r.b(challenge6)) {
                            i2 = 2;
                        }
                        bt btVar = new bt.a().a(i2, challenge6.getCid(), "challenge").c(challenge6.getChallengeName(), challenge6.getDisplayCount()).f64830b;
                        FragmentActivity activity2 = getActivity();
                        if (activity2 == null) {
                            Intrinsics.throwNpe();
                        }
                        new z(activity2, btVar, 7, str4).show();
                        a(str4, "shaped_qr_code", "normal_share");
                        return true;
                    }
                }
            }
        }
        return z;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        com.ss.android.ugc.aweme.challenge.ui.header.e eVar;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f2812f, false, 26063, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f2812f, false, 26063, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        super.onViewCreated(view, bundle);
        ChallengeDetailParam challengeDetailParam = this.k;
        if (challengeDetailParam == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetailParam");
        }
        if (TextUtils.isEmpty(challengeDetailParam.getCid())) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        AwemeViewPagerNavigator awemeViewPagerNavigator = this.x;
        Intrinsics.checkExpressionValueIsNotNull(awemeViewPagerNavigator, "navigator");
        awemeViewPagerNavigator.setVisibility(8);
        TextView textView = this.u;
        Intrinsics.checkExpressionValueIsNotNull(textView, "mTitle");
        textView.setVisibility(0);
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) b((int) C0906R.id.ix);
        Intrinsics.checkExpressionValueIsNotNull(autoRTLImageView, "back_btn");
        a((View) autoRTLImageView, (Function1<? super View, Unit>) new t<Object,Unit>(this));
        if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26064, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26064, new Class[0], Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 19) {
            int statusBarHeight = StatusBarUtils.getStatusBarHeight(getActivity());
            float dimension = getResources().getDimension(C0906R.dimen.r7);
            t().getLayoutParams().height = statusBarHeight;
            t().setAlpha(1.0f);
            ScrollableLayout scrollableLayout = this.t;
            Intrinsics.checkExpressionValueIsNotNull(scrollableLayout, "mScrollableLayout");
            int i2 = (int) (((float) statusBarHeight) + dimension);
            scrollableLayout.setTabsMarginTop(i2);
            ViewGroup.LayoutParams layoutParams = k().getLayoutParams();
            if (layoutParams != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i2;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26065, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26065, new Class[0], Void.TYPE);
        } else {
            ck ckVar = new ck();
            ckVar.f64976e = ((ShareOrderService) ServiceManager.get().getService(ShareOrderService.class)).getUrlShareList(true);
            ckVar.f64975d = false;
            ckVar.i = true;
            this.h = new SimpleShareDialog(getActivity(), ckVar);
            SimpleShareDialog simpleShareDialog = this.h;
            if (simpleShareDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mShareDialog");
            }
            simpleShareDialog.setActionHandler(this);
            SimpleShareDialog simpleShareDialog2 = this.h;
            if (simpleShareDialog2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mShareDialog");
            }
            simpleShareDialog2.setShareCallback(this);
            a((View) v(), (Function1<? super View, Unit>) new i<Object,Unit>(this));
            if (com.ss.android.g.a.a()) {
                ch.a(v());
            } else {
                v().setImageResource(2130839380);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26070, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26070, new Class[0], Void.TYPE);
        } else {
            k().setBuilder(DmtStatusView.a.a(getContext()).b(com.ss.android.ugc.aweme.views.e.a(getContext(), new k(this))));
        }
        if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26068, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26068, new Class[0], Void.TYPE);
        } else {
            u().setEnabled(false);
            a(u(), (Function1<? super View, Unit>) new j<Object,Unit>(this));
        }
        if (PatchProxy.isSupport(new Object[0], this, f2812f, false, 26071, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2812f, false, 26071, new Class[0], Void.TYPE);
        } else {
            int dimensionPixelSize = getResources().getDimensionPixelSize(C0906R.dimen.ck);
            j().setEnabled(false);
            j().a(true, dimensionPixelSize * 2, dimensionPixelSize * 4);
            j().setOnRefreshListener(new h(this));
        }
        e.a aVar = com.ss.android.ugc.aweme.challenge.ui.header.e.f35630d;
        Context context = getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
        if (PatchProxy.isSupport(new Object[]{context}, aVar, e.a.f35633a, false, 26346, new Class[]{Context.class}, com.ss.android.ugc.aweme.challenge.ui.header.e.class)) {
            e.a aVar2 = aVar;
            eVar = (com.ss.android.ugc.aweme.challenge.ui.header.e) PatchProxy.accessDispatch(new Object[]{context}, aVar2, e.a.f35633a, false, 26346, new Class[]{Context.class}, com.ss.android.ugc.aweme.challenge.ui.header.e.class);
        } else {
            Intrinsics.checkParameterIsNotNull(context, "context");
            eVar = new com.ss.android.ugc.aweme.challenge.ui.header.e(context);
        }
        this.Q = eVar;
        this.i = new n(view2, this);
        Function1 vVar = new v(this);
        Function2 wVar = new w(this);
        e.a.a(this, x(), g.INSTANCE, false, false, wVar, vVar, new u(this), 6, null);
        a(false);
    }

    public final <VM1 extends JediViewModel<S1>, S1 extends com.bytedance.jedi.arch.x, R> R a(@NotNull VM1 vm1, @NotNull Function1<? super S1, ? extends R> function1) {
        VM1 vm12 = vm1;
        Function1<? super S1, ? extends R> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{vm12, function12}, this, f2812f, false, 26105, new Class[]{JediViewModel.class, Function1.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{vm12, function12}, this, f2812f, false, 26105, new Class[]{JediViewModel.class, Function1.class}, Object.class);
        }
        Intrinsics.checkParameterIsNotNull(vm12, "viewModel1");
        Intrinsics.checkParameterIsNotNull(function12, "block");
        return h.a.a(this, vm1, function1);
    }

    /* access modifiers changed from: private */
    public final void a(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, f2812f, false, 26097, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, f2812f, false, 26097, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
        String str7 = this.l;
        if (str7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChallengeId");
        }
        com.ss.android.ugc.aweme.app.d.d a3 = a2.a("tag_id", str7).a("platform", str4).a("share_mode", str5);
        if (TextUtils.isEmpty(str6)) {
            a3.a("enter_method", str6);
        }
        com.ss.android.ugc.aweme.common.r.a("share_tag", (Map) a3.f34114b);
    }

    @NotNull
    public final <S extends com.bytedance.jedi.arch.x> Disposable a(@NotNull JediViewModel<S> jediViewModel, boolean z, boolean z2, @NotNull Function2<? super com.bytedance.jedi.arch.f, ? super S, Unit> function2) {
        JediViewModel<S> jediViewModel2 = jediViewModel;
        Function2<? super com.bytedance.jedi.arch.f, ? super S, Unit> function22 = function2;
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function22}, this, f2812f, false, 26121, new Class[]{JediViewModel.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class)) {
            return (Disposable) PatchProxy.accessDispatch(new Object[]{jediViewModel2, Byte.valueOf(z), Byte.valueOf(z2), function22}, this, f2812f, false, 26121, new Class[]{JediViewModel.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class);
        }
        Intrinsics.checkParameterIsNotNull(jediViewModel2, "$this$subscribe");
        Intrinsics.checkParameterIsNotNull(function22, "subscriber");
        return h.a.a(this, jediViewModel, z, z2, function2);
    }

    @NotNull
    public final <S extends com.bytedance.jedi.arch.x, A> Disposable a(@NotNull JediViewModel<S> jediViewModel, @NotNull KProperty1<S, ? extends A> kProperty1, boolean z, boolean z2, @NotNull Function2<? super com.bytedance.jedi.arch.f, ? super A, Unit> function2) {
        JediViewModel<S> jediViewModel2 = jediViewModel;
        KProperty1<S, ? extends A> kProperty12 = kProperty1;
        Function2<? super com.bytedance.jedi.arch.f, ? super A, Unit> function22 = function2;
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function22}, this, f2812f, false, 26116, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class)) {
            Object[] objArr = {jediViewModel2, kProperty12, Byte.valueOf(z), Byte.valueOf(z2), function22};
            return (Disposable) PatchProxy.accessDispatch(objArr, this, f2812f, false, 26116, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class);
        }
        Intrinsics.checkParameterIsNotNull(jediViewModel2, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty12, "prop1");
        Intrinsics.checkParameterIsNotNull(function22, "subscriber");
        return h.a.a(this, jediViewModel, kProperty1, z, z2, function2);
    }

    @NotNull
    public final <S extends com.bytedance.jedi.arch.x, T> Disposable a(@NotNull JediViewModel<S> jediViewModel, @NotNull KProperty1<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kProperty1, boolean z, boolean z2, @Nullable Function2<? super com.bytedance.jedi.arch.f, ? super Throwable, Unit> function2, @Nullable Function1<? super com.bytedance.jedi.arch.f, Unit> function1, @Nullable Function2<? super com.bytedance.jedi.arch.f, ? super T, Unit> function22) {
        JediViewModel<S> jediViewModel2 = jediViewModel;
        KProperty1<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kProperty12 = kProperty1;
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function2, function1, function22}, this, f2812f, false, 26115, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class, Function1.class, Function2.class}, Disposable.class)) {
            return (Disposable) PatchProxy.accessDispatch(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z), Byte.valueOf(z2), function2, function1, function22}, this, f2812f, false, 26115, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class, Function1.class, Function2.class}, Disposable.class);
        }
        Intrinsics.checkParameterIsNotNull(jediViewModel2, "$this$asyncSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty12, "prop");
        return h.a.a(this, jediViewModel, kProperty1, z, z2, function2, function1, function22);
    }
}
