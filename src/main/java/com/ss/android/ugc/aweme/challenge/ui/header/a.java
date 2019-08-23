package com.ss.android.ugc.aweme.challenge.ui.header;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.ss.android.ugc.aweme.challenge.ui.RelatedMusicChallengeAdapter;
import com.ss.android.ugc.aweme.challenge.ui.header.adapter.HorizontalSlideVideoAdapter;
import com.ss.android.ugc.aweme.challenge.ui.header.adapter.HorizontalSlideVideoViewHolder;
import com.ss.android.ugc.aweme.challenge.ui.i;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.ChallengeTransform;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.model.g;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.dv;
import com.ss.android.ugc.aweme.utils.fe;
import com.ss.android.ugc.aweme.views.DividerItemDecoration;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ë\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0014\b&\u0018\u0000 w2\u00020\u0001:\u0001wB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u000204H\u0004J\u0010\u0010Y\u001a\u00020W2\u0006\u0010Z\u001a\u00020)H\u0016J\b\u0010[\u001a\u0004\u0018\u00010\\J\b\u0010]\u001a\u00020WH\u0016J\b\u0010^\u001a\u00020WH\u0016J\u0006\u0010_\u001a\u00020WJ\b\u0010`\u001a\u00020WH\u0015J\b\u0010a\u001a\u00020WH\u0014J\u0010\u0010b\u001a\u00020W2\u0006\u0010c\u001a\u00020dH\u0007J\u0018\u0010e\u001a\u00020W2\u0006\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020\nH\u0002J\b\u0010i\u001a\u00020WH\u0002J\u000e\u0010j\u001a\u00020W2\u0006\u0010k\u001a\u00020/J\b\u0010l\u001a\u00020WH\u0003J\b\u0010m\u001a\u00020WH\u0002J\b\u0010n\u001a\u00020WH\u0002J\b\u0010o\u001a\u00020WH\u0002J\u0010\u0010p\u001a\u00020W2\u0006\u0010q\u001a\u00020rH\u0002J\b\u0010s\u001a\u00020WH\u0002J\b\u0010t\u001a\u00020WH\u0002J\b\u0010u\u001a\u00020WH\u0002J\b\u0010v\u001a\u00020WH\u0002R\u0012\u0010\t\u001a\u00020\nX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR \u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\nX¤\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0010\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\nX¤\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\fR\u001a\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X.¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020#X.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020)X.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020/8BX\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020403X\u0004¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X.¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u000109X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u000109X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020;X.¢\u0006\u0002\n\u0000R\u0014\u0010@\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0010\u0010C\u001a\u0004\u0018\u00010DX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010E\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u000207X.¢\u0006\u0002\n\u0000R\u0010\u0010G\u001a\u0004\u0018\u00010HX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010I\u001a\u0004\u0018\u000109X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010J\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u000207X.¢\u0006\u0002\n\u0000R\u0010\u0010L\u001a\u0004\u0018\u00010HX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010M\u001a\u0004\u0018\u000109X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020 X.¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u000209X.¢\u0006\u0002\n\u0000R\u001c\u0010P\u001a\u0004\u0018\u00010QX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U¨\u0006x"}, d2 = {"Lcom/ss/android/ugc/aweme/challenge/ui/header/AbsCommonHeaderView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "headerParam", "Lcom/ss/android/ugc/aweme/challenge/ui/header/HeaderParam;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/challenge/ui/header/HeaderParam;Landroid/util/AttributeSet;)V", "attrsResId", "", "getAttrsResId", "()I", "awemeModelObserver", "Landroid/arch/lifecycle/Observer;", "Lkotlin/Pair;", "Lcom/ss/android/ugc/aweme/challenge/presenter/ChallengeAwemeModel;", "buttonResId", "getButtonResId", "horizontalSlideListener", "com/ss/android/ugc/aweme/challenge/ui/header/AbsCommonHeaderView$horizontalSlideListener$1", "Lcom/ss/android/ugc/aweme/challenge/ui/header/AbsCommonHeaderView$horizontalSlideListener$1;", "layoutResId", "getLayoutResId", "mAvatar", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "getMAvatar", "()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "setMAvatar", "(Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;)V", "mBgCover", "mBgCoverMask", "Landroid/view/View;", "mBottomSpace", "mChallenge", "Lcom/ss/android/ugc/aweme/discover/model/Challenge;", "getMChallenge", "()Lcom/ss/android/ugc/aweme/discover/model/Challenge;", "setMChallenge", "(Lcom/ss/android/ugc/aweme/discover/model/Challenge;)V", "mChallengeDetail", "Lcom/ss/android/ugc/aweme/challenge/model/ChallengeDetail;", "getMChallengeDetail", "()Lcom/ss/android/ugc/aweme/challenge/model/ChallengeDetail;", "setMChallengeDetail", "(Lcom/ss/android/ugc/aweme/challenge/model/ChallengeDetail;)V", "mCoverMaskAlpha", "", "getMCoverMaskAlpha", "()F", "mDelegates", "", "Lcom/ss/android/ugc/aweme/challenge/ui/header/IHeaderDelegate;", "mDescContainer", "mDescContainerVs", "Landroid/view/ViewStub;", "mDescTv", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mExpandContainer", "Landroid/widget/LinearLayout;", "mExpandIv", "Landroid/widget/ImageView;", "mExpandTv", "mHeaderContainer", "mHeaderParam", "getMHeaderParam", "()Lcom/ss/android/ugc/aweme/challenge/ui/header/HeaderParam;", "mHorizontalSlideAdapter", "Lcom/ss/android/ugc/aweme/challenge/ui/header/adapter/HorizontalSlideVideoAdapter;", "mHorizontalSlideContainer", "mHorizontalSlideContainerVs", "mHorizontalSlideList", "Landroid/support/v7/widget/RecyclerView;", "mHorizontalSlideTitle", "mRelatedContainer", "mRelatedContainerVs", "mRelatedList", "mRelatedTv", "mStatusBar", "mTitle", "mViewModel", "Lcom/ss/android/ugc/aweme/challenge/viewmodel/ChallengeDetailViewModel;", "getMViewModel", "()Lcom/ss/android/ugc/aweme/challenge/viewmodel/ChallengeDetailViewModel;", "setMViewModel", "(Lcom/ss/android/ugc/aweme/challenge/viewmodel/ChallengeDetailViewModel;)V", "addHeaderDelegate", "", "delegate", "bindData", "data", "getActivity", "Landroid/support/v4/app/FragmentActivity;", "initHeaderElements", "initView", "mayAddExtraBottomSpace", "onAttachedToWindow", "onDetachedFromWindow", "onEvent", "event", "Lcom/ss/android/ugc/aweme/im/service/model/ShareCompleteEvent;", "sendClickVideoCardEvent", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "order", "sendRelatedEventV1", "setHeaderAlpha", "alpha", "setStatusBarForKitKat", "updateAvatar", "updateAwemeModel", "updateBgCover", "updateBgCoverMask", "background", "", "updateDesc", "updateHorizontalSlide", "updateRelated", "updateTitle", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2819a;

    /* renamed from: f  reason: collision with root package name */
    public static final C0453a f2820f = new C0453a((byte) 0);
    private View A;
    @NotNull
    private final j B;
    @Nullable
    private ChallengeDetailViewModel C;
    private final Observer<Pair<Integer, com.ss.android.ugc.aweme.challenge.c.a>> D;
    private final c E;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    protected RemoteImageView f2821b;

    /* renamed from: c  reason: collision with root package name */
    final List<l> f2822c = new ArrayList();
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    protected ChallengeDetail f2823d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    protected Challenge f2824e;
    private RemoteImageView g;
    private View h;
    private LinearLayout i;
    private View j;
    private DmtTextView k;
    private ViewStub l;
    private View m;
    private DmtTextView n;
    private LinearLayout o;
    private DmtTextView p;
    private ImageView q;
    private ViewStub r;
    private View s;
    private DmtTextView t;
    private RecyclerView u;
    private ViewStub v;
    private View w;
    private DmtTextView x;
    private RecyclerView y;
    private HorizontalSlideVideoAdapter z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/challenge/ui/header/AbsCommonHeaderView$Companion;", "", "()V", "hasTransform", "", "data", "Lcom/ss/android/ugc/aweme/challenge/model/ChallengeDetail;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.a$a  reason: collision with other inner class name */
    public static final class C0453a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35609a;

        private C0453a() {
        }

        public /* synthetic */ C0453a(byte b2) {
            this();
        }

        @JvmStatic
        public final boolean a(@NotNull ChallengeDetail challengeDetail) {
            ChallengeDetail challengeDetail2 = challengeDetail;
            if (PatchProxy.isSupport(new Object[]{challengeDetail2}, this, f35609a, false, 26333, new Class[]{ChallengeDetail.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{challengeDetail2}, this, f35609a, false, 26333, new Class[]{ChallengeDetail.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(challengeDetail2, "data");
            Challenge challenge = challengeDetail2.challenge;
            if (challenge != null) {
                ChallengeTransform transfrom = challenge.getTransfrom();
                if (transfrom != null && b.a(transfrom.getText()) && b.a(transfrom.getAction())) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "Lcom/ss/android/ugc/aweme/challenge/presenter/ChallengeAwemeModel;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class b<T> implements Observer<Pair<? extends Integer, ? extends com.ss.android.ugc.aweme.challenge.c.a>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35610a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f35611b;

        b(a aVar) {
            this.f35611b = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Pair pair = (Pair) obj;
            if (PatchProxy.isSupport(new Object[]{pair}, this, f35610a, false, 26334, new Class[]{Pair.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{pair}, this, f35610a, false, 26334, new Class[]{Pair.class}, Void.TYPE);
                return;
            }
            this.f35611b.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/challenge/ui/header/AbsCommonHeaderView$horizontalSlideListener$1", "Lcom/ss/android/ugc/aweme/challenge/ui/header/adapter/HorizontalSlideVideoViewHolder$IHorizontalSlideListener;", "onVideoClick", "", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "order", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements HorizontalSlideVideoViewHolder.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35612a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f35613b;

        c(a aVar) {
            this.f35613b = aVar;
        }

        public final void a(@NotNull Aweme aweme, int i) {
            if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, this, f35612a, false, 26335, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, this, f35612a, false, 26335, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(aweme, "aweme");
            com.ss.android.ugc.aweme.feed.a a2 = com.ss.android.ugc.aweme.feed.a.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AwemeManager.inst()");
            ChallengeDetailViewModel mViewModel = this.f35613b.getMViewModel();
            if (mViewModel != null) {
                com.ss.android.ugc.aweme.arch.widgets.base.b<Pair<Integer, com.ss.android.ugc.aweme.challenge.c.a>> bVar = mViewModel.f35729c;
                if (bVar != null) {
                    Pair pair = (Pair) bVar.getValue();
                    if (pair != null) {
                        com.ss.android.ugc.aweme.challenge.c.a aVar = (com.ss.android.ugc.aweme.challenge.c.a) pair.getSecond();
                        if (aVar != null) {
                            a2.f44610c = aVar;
                            h.a().a((Activity) this.f35613b.getActivity(), j.a("aweme://aweme/detail/" + aweme.getAid()).a("refer", "challenge").a("video_from", "from_challenge").a("challenge_id", this.f35613b.getMChallenge().getCid()).a("video_type", 2).a("profile_enterprise_type", aweme.getEnterpriseType()).a());
                            com.ss.android.ugc.aweme.feed.b.b.a(aweme);
                            this.f35613b.a(aweme, i);
                        }
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35614a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f35615b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f35616c;

        d(a aVar, String str) {
            this.f35615b = aVar;
            this.f35616c = str;
        }

        public final void onClick(View view) {
            String str;
            if (PatchProxy.isSupport(new Object[]{view}, this, f35614a, false, 26336, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f35614a, false, 26336, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Activity activity = this.f35615b.getActivity();
            ad a2 = ad.a().a("extra_zoom_info", (Parcelable) fe.a(this.f35615b.getMAvatar())).a("wh_ratio", 0.1f).a("enable_download_img", false).a("challenge_info", (Serializable) this.f35615b.getMChallenge());
            String[] strArr = new String[1];
            if (TextUtils.isEmpty(this.f35616c)) {
                str = new Uri.Builder().scheme("res").path("2130840131").build().toString();
            } else {
                str = this.f35616c;
            }
            strArr[0] = str;
            HeaderDetailActivity.a(activity, a2.a("uri", strArr).f75487b);
        }
    }

    public void a() {
    }

    public abstract int getAttrsResId();

    public abstract int getButtonResId();

    public abstract int getLayoutResId();

    @NotNull
    public final j getMHeaderParam() {
        return this.B;
    }

    @Nullable
    public final ChallengeDetailViewModel getMViewModel() {
        return this.C;
    }

    private final float getMCoverMaskAlpha() {
        if (PatchProxy.isSupport(new Object[0], this, f2819a, false, 26305, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f2819a, false, 26305, new Class[0], Float.TYPE)).floatValue();
        } else if (com.ss.android.g.a.b()) {
            return 0.9f;
        } else {
            return 0.96f;
        }
    }

    @Nullable
    public final FragmentActivity getActivity() {
        if (PatchProxy.isSupport(new Object[0], this, f2819a, false, 26324, new Class[0], FragmentActivity.class)) {
            return (FragmentActivity) PatchProxy.accessDispatch(new Object[0], this, f2819a, false, 26324, new Class[0], FragmentActivity.class);
        }
        Activity c2 = v.c((View) this);
        if (!(c2 instanceof FragmentActivity)) {
            c2 = null;
        }
        return (FragmentActivity) c2;
    }

    @NotNull
    public final RemoteImageView getMAvatar() {
        if (PatchProxy.isSupport(new Object[0], this, f2819a, false, 26303, new Class[0], RemoteImageView.class)) {
            return (RemoteImageView) PatchProxy.accessDispatch(new Object[0], this, f2819a, false, 26303, new Class[0], RemoteImageView.class);
        }
        RemoteImageView remoteImageView = this.f2821b;
        if (remoteImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAvatar");
        }
        return remoteImageView;
    }

    @NotNull
    public final Challenge getMChallenge() {
        if (PatchProxy.isSupport(new Object[0], this, f2819a, false, 26308, new Class[0], Challenge.class)) {
            return (Challenge) PatchProxy.accessDispatch(new Object[0], this, f2819a, false, 26308, new Class[0], Challenge.class);
        }
        Challenge challenge = this.f2824e;
        if (challenge == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChallenge");
        }
        return challenge;
    }

    @NotNull
    public final ChallengeDetail getMChallengeDetail() {
        if (PatchProxy.isSupport(new Object[0], this, f2819a, false, 26306, new Class[0], ChallengeDetail.class)) {
            return (ChallengeDetail) PatchProxy.accessDispatch(new Object[0], this, f2819a, false, 26306, new Class[0], ChallengeDetail.class);
        }
        ChallengeDetail challengeDetail = this.f2823d;
        if (challengeDetail == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChallengeDetail");
        }
        return challengeDetail;
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f2819a, false, 26329, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2819a, false, 26329, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        bg.d(this);
        ChallengeDetailViewModel challengeDetailViewModel = this.C;
        if (challengeDetailViewModel == null) {
            Intrinsics.throwNpe();
        }
        challengeDetailViewModel.f35729c.removeObserver(this.D);
        this.C = null;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f2819a, false, 26322, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2819a, false, 26322, new Class[0], Void.TYPE);
            return;
        }
        ChallengeDetailViewModel challengeDetailViewModel = this.C;
        if (challengeDetailViewModel != null) {
            com.ss.android.ugc.aweme.arch.widgets.base.b<Pair<Integer, com.ss.android.ugc.aweme.challenge.c.a>> bVar = challengeDetailViewModel.f35729c;
            if (bVar != null) {
                Pair pair = (Pair) bVar.getValue();
                if (pair != null) {
                    com.ss.android.ugc.aweme.challenge.c.a aVar = (com.ss.android.ugc.aweme.challenge.c.a) pair.getSecond();
                    if (aVar != null) {
                        ChallengeDetail challengeDetail = this.f2823d;
                        if (challengeDetail == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mChallengeDetail");
                        }
                        aVar.a(challengeDetail.slideList);
                    }
                }
            }
        }
    }

    public final void d() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f2819a, false, 26323, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2819a, false, 26323, new Class[0], Void.TYPE);
            return;
        }
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderContainer");
        }
        int childCount = linearLayout.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            LinearLayout linearLayout2 = this.i;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeaderContainer");
            }
            View childAt = linearLayout2.getChildAt(childCount);
            if (!(childAt instanceof ViewGroup)) {
                childAt = null;
            }
            ViewGroup viewGroup = (ViewGroup) childAt;
            if (viewGroup == null) {
                childCount--;
            } else {
                int id = viewGroup.getId();
                if (id == C0906R.id.ht || id == C0906R.id.a3p || id == C0906R.id.crw) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            View view = this.A;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBottomSpace");
            }
            view.getLayoutParams().height = u.a(32.0d);
        }
    }

    @SuppressLint({"ViewObserver"})
    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f2819a, false, 26328, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2819a, false, 26328, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        bg.c(this);
        ChallengeDetailViewModel.a aVar = ChallengeDetailViewModel.f35727d;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        this.C = aVar.a(activity);
        ChallengeDetailViewModel challengeDetailViewModel = this.C;
        if (challengeDetailViewModel == null) {
            Intrinsics.throwNpe();
        }
        com.ss.android.ugc.aweme.arch.widgets.base.b<Pair<Integer, com.ss.android.ugc.aweme.challenge.c.a>> bVar = challengeDetailViewModel.f35729c;
        FragmentActivity activity2 = getActivity();
        if (activity2 == null) {
            Intrinsics.throwNpe();
        }
        bVar.observe(activity2, this.D);
        c();
    }

    private final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f2819a, false, 26327, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2819a, false, 26327, new Class[0], Void.TYPE);
            return;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        ChallengeDetail challengeDetail = this.f2823d;
        if (challengeDetail == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChallengeDetail");
        }
        List<RelatedChallengeMusic> list = challengeDetail.relatedChallengeMusicList;
        Intrinsics.checkExpressionValueIsNotNull(list, "mChallengeDetail.relatedChallengeMusicList");
        for (RelatedChallengeMusic relatedChallengeMusic : list) {
            Intrinsics.checkExpressionValueIsNotNull(relatedChallengeMusic, AdvanceSetting.NETWORK_TYPE);
            if (relatedChallengeMusic.categoryType == 1 && relatedChallengeMusic.music != null) {
                Music music = relatedChallengeMusic.music;
                Intrinsics.checkExpressionValueIsNotNull(music, "it.music");
                sb.append(music.getMid());
                sb.append(",");
            } else if (relatedChallengeMusic.categoryType == 2 && relatedChallengeMusic.challenge != null) {
                Challenge challenge = relatedChallengeMusic.challenge;
                Intrinsics.checkExpressionValueIsNotNull(challenge, "it.challenge");
                sb2.append(challenge.getCid());
                sb2.append(",");
            }
        }
        CharSequence charSequence = ",";
        StringsKt.removeSuffix((CharSequence) sb, charSequence);
        StringsKt.removeSuffix((CharSequence) sb2, charSequence);
        String str = "";
        String str2 = PushConstants.PUSH_TYPE_NOTIFY;
        if (TextUtils.equals(this.B.f35673e, "from_related_tag")) {
            Challenge challenge2 = this.f2824e;
            if (challenge2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChallenge");
            }
            str = challenge2.getCid();
            Intrinsics.checkExpressionValueIsNotNull(str, "mChallenge.cid");
            str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("level", str2);
            jSONObject.put("enter_from", str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("music", sb.toString());
            jSONObject2.put("challenge", sb2.toString());
            jSONObject.put("related", jSONObject2);
        } catch (JSONException unused) {
        }
        MobClick labelName = MobClick.obtain().setEventName("extend_challenge").setLabelName("challenge");
        Challenge challenge3 = this.f2824e;
        if (challenge3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChallenge");
        }
        r.onEvent(labelName.setValue(challenge3.getCid()).setJsonObject(jSONObject));
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2819a, false, 26310, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2819a, false, 26310, new Class[0], Void.TYPE);
            return;
        }
        View findViewById = findViewById(C0906R.id.ke);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.bg_cover)");
        this.g = (RemoteImageView) findViewById;
        View findViewById2 = findViewById(C0906R.id.kf);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.bg_cover_mask)");
        this.h = findViewById2;
        View findViewById3 = findViewById(C0906R.id.anj);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.header_container)");
        this.i = (LinearLayout) findViewById3;
        View findViewById4 = findViewById(C0906R.id.cv0);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.status_bar)");
        this.j = findViewById4;
        View findViewById5 = findViewById(C0906R.id.hk);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.avatar)");
        this.f2821b = (RemoteImageView) findViewById5;
        View findViewById6 = findViewById(C0906R.id.title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "findViewById(R.id.title)");
        this.k = (DmtTextView) findViewById6;
        View findViewById7 = findViewById(C0906R.id.dvr);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "findViewById(R.id.vs_desc_container)");
        this.l = (ViewStub) findViewById7;
        View findViewById8 = findViewById(C0906R.id.dvz);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "findViewById(R.id.vs_related_container)");
        this.r = (ViewStub) findViewById8;
        View findViewById9 = findViewById(C0906R.id.dvt);
        Intrinsics.checkExpressionValueIsNotNull(findViewById9, "findViewById(R.id.vs_horizontal_slide)");
        this.v = (ViewStub) findViewById9;
        View findViewById10 = findViewById(C0906R.id.ms);
        Intrinsics.checkExpressionValueIsNotNull(findViewById10, "findViewById(R.id.bottom_space)");
        this.A = findViewById10;
        for (l a2 : this.f2822c) {
            a2.a(this, this.B);
        }
        if (PatchProxy.isSupport(new Object[0], this, f2819a, false, 26314, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2819a, false, 26314, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            View view = this.j;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStatusBar");
            }
            view.getLayoutParams().height = StatusBarUtils.getStatusBarHeight(getContext());
        }
    }

    public final void setMViewModel(@Nullable ChallengeDetailViewModel challengeDetailViewModel) {
        this.C = challengeDetailViewModel;
    }

    public final void setMAvatar(@NotNull RemoteImageView remoteImageView) {
        RemoteImageView remoteImageView2 = remoteImageView;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2}, this, f2819a, false, 26304, new Class[]{RemoteImageView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2}, this, f2819a, false, 26304, new Class[]{RemoteImageView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(remoteImageView2, "<set-?>");
        this.f2821b = remoteImageView2;
    }

    public final void setMChallenge(@NotNull Challenge challenge) {
        Challenge challenge2 = challenge;
        if (PatchProxy.isSupport(new Object[]{challenge2}, this, f2819a, false, 26309, new Class[]{Challenge.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{challenge2}, this, f2819a, false, 26309, new Class[]{Challenge.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(challenge2, "<set-?>");
        this.f2824e = challenge2;
    }

    public final void setMChallengeDetail(@NotNull ChallengeDetail challengeDetail) {
        ChallengeDetail challengeDetail2 = challengeDetail;
        if (PatchProxy.isSupport(new Object[]{challengeDetail2}, this, f2819a, false, 26307, new Class[]{ChallengeDetail.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{challengeDetail2}, this, f2819a, false, 26307, new Class[]{ChallengeDetail.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(challengeDetail2, "<set-?>");
        this.f2823d = challengeDetail2;
    }

    private final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2819a, false, 26316, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f2819a, false, 26316, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        boolean b2 = com.ss.android.g.a.b();
        if (!z2 || b2) {
            if (z2 || !b2) {
                View view = this.h;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBgCoverMask");
                }
                view.setAlpha(getMCoverMaskAlpha());
            }
            return;
        }
        View view2 = this.h;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBgCoverMask");
        }
        view2.setBackgroundResource(2130837891);
    }

    @Subscribe
    public final void onEvent(@NotNull g gVar) {
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, f2819a, false, 26325, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2}, this, f2819a, false, 26325, new Class[]{g.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(gVar2, "event");
        if (TextUtils.equals("challenge", gVar2.itemType)) {
            Context context = getContext();
            RemoteImageView remoteImageView = this.f2821b;
            if (remoteImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAvatar");
            }
            dv.a(context, remoteImageView, gVar2);
        }
    }

    public final void setHeaderAlpha(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f2819a, false, 26312, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f2819a, false, 26312, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderContainer");
        }
        linearLayout.setAlpha(1.0f - f2);
        for (l a2 : this.f2822c) {
            a2.a(f2);
        }
    }

    public void a(@NotNull ChallengeDetail challengeDetail) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ChallengeDetail challengeDetail2 = challengeDetail;
        if (PatchProxy.isSupport(new Object[]{challengeDetail2}, this, f2819a, false, 26311, new Class[]{ChallengeDetail.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{challengeDetail2}, this, f2819a, false, 26311, new Class[]{ChallengeDetail.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(challengeDetail2, "data");
        if (challengeDetail2.challenge != null) {
            this.f2823d = challengeDetail2;
            Challenge challenge = challengeDetail2.challenge;
            Intrinsics.checkExpressionValueIsNotNull(challenge, "data.challenge");
            this.f2824e = challenge;
            if (PatchProxy.isSupport(new Object[0], this, f2819a, false, 26315, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f2819a, false, 26315, new Class[0], Void.TYPE);
            } else {
                Challenge challenge2 = this.f2824e;
                if (challenge2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChallenge");
                }
                String challengeBgUrl = challenge2.getChallengeBgUrl();
                Challenge challenge3 = this.f2824e;
                if (challenge3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChallenge");
                }
                UrlModel backgroundImageUrl = challenge3.getBackgroundImageUrl();
                if (!TextUtils.isEmpty(challengeBgUrl)) {
                    RemoteImageView remoteImageView = this.g;
                    if (remoteImageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBgCover");
                    }
                    com.ss.android.ugc.aweme.base.c.a(remoteImageView, challengeBgUrl);
                    a(true);
                } else if (backgroundImageUrl != null) {
                    RemoteImageView remoteImageView2 = this.g;
                    if (remoteImageView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBgCover");
                    }
                    com.ss.android.ugc.aweme.base.c.b(remoteImageView2, backgroundImageUrl);
                    a(true);
                } else {
                    Challenge challenge4 = this.f2824e;
                    if (challenge4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mChallenge");
                    }
                    User author = challenge4.getAuthor();
                    if (author != null) {
                        Challenge challenge5 = this.f2824e;
                        if (challenge5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mChallenge");
                        }
                        if (challenge5.getSubType() == 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (!z5) {
                            author = null;
                        }
                        if (author != null) {
                            RemoteImageView remoteImageView3 = this.g;
                            if (remoteImageView3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBgCover");
                            }
                            com.ss.android.ugc.aweme.base.c.b(remoteImageView3, author.getAvatarLarger());
                        }
                    }
                    a(false);
                }
            }
            if (PatchProxy.isSupport(new Object[0], this, f2819a, false, 26317, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f2819a, false, 26317, new Class[0], Void.TYPE);
            } else {
                Challenge challenge6 = this.f2824e;
                if (challenge6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChallenge");
                }
                String challengeProfileUrl = challenge6.getChallengeProfileUrl();
                if (!TextUtils.isEmpty(challengeProfileUrl)) {
                    RemoteImageView remoteImageView4 = this.f2821b;
                    if (remoteImageView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAvatar");
                    }
                    com.ss.android.ugc.aweme.base.c.a(remoteImageView4, challengeProfileUrl);
                }
                RemoteImageView remoteImageView5 = this.f2821b;
                if (remoteImageView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAvatar");
                }
                remoteImageView5.setOnClickListener(new d(this, challengeProfileUrl));
            }
            if (PatchProxy.isSupport(new Object[0], this, f2819a, false, 26318, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f2819a, false, 26318, new Class[0], Void.TYPE);
            } else {
                Challenge challenge7 = this.f2824e;
                if (challenge7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChallenge");
                }
                String challengeName = challenge7.getChallengeName();
                DmtTextView dmtTextView = this.k;
                if (dmtTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTitle");
                }
                TextView textView = dmtTextView;
                if (!com.ss.android.g.a.a()) {
                    Challenge challenge8 = this.f2824e;
                    if (challenge8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mChallenge");
                    }
                    z4 = challenge8.isTrending();
                } else {
                    z4 = false;
                }
                i.a(challengeName, textView, z4);
            }
            if (PatchProxy.isSupport(new Object[0], this, f2819a, false, 26319, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f2819a, false, 26319, new Class[0], Void.TYPE);
            } else {
                Challenge challenge9 = this.f2824e;
                if (challenge9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChallenge");
                }
                if (TextUtils.isEmpty(challenge9.getDesc())) {
                    View view = this.m;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                } else {
                    ViewStub viewStub = this.l;
                    if (viewStub == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDescContainerVs");
                    }
                    if (this.m == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        viewStub = null;
                    }
                    if (viewStub != null) {
                        View inflate = viewStub.inflate();
                        this.n = (DmtTextView) inflate.findViewById(C0906R.id.dau);
                        this.o = (LinearLayout) inflate.findViewById(C0906R.id.ab0);
                        this.p = (DmtTextView) inflate.findViewById(C0906R.id.dbi);
                        this.q = (ImageView) inflate.findViewById(C0906R.id.b10);
                        if (com.ss.android.g.a.b()) {
                            ImageView imageView = this.q;
                            if (imageView == null) {
                                Intrinsics.throwNpe();
                            }
                            imageView.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(inflate.getResources(), 2130839554));
                        }
                        this.m = inflate;
                    }
                    Challenge challenge10 = this.f2824e;
                    if (challenge10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mChallenge");
                    }
                    i.a(challenge10, this.n, this.o, this.p, this.q, true);
                    View view2 = this.m;
                    if (view2 == null) {
                        Intrinsics.throwNpe();
                    }
                    view2.setVisibility(0);
                }
            }
            if (PatchProxy.isSupport(new Object[0], this, f2819a, false, 26320, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f2819a, false, 26320, new Class[0], Void.TYPE);
            } else {
                ChallengeDetail challengeDetail3 = this.f2823d;
                if (challengeDetail3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChallengeDetail");
                }
                if (CollectionUtils.isEmpty(challengeDetail3.relatedChallengeMusicList)) {
                    View view3 = this.s;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                } else {
                    ViewStub viewStub2 = this.r;
                    if (viewStub2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mRelatedContainerVs");
                    }
                    if (this.s == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        viewStub2 = null;
                    }
                    if (viewStub2 != null) {
                        View inflate2 = viewStub2.inflate();
                        this.t = (DmtTextView) inflate2.findViewById(C0906R.id.a9b);
                        this.u = (RecyclerView) inflate2.findViewById(C0906R.id.czg);
                        RecyclerView recyclerView = this.u;
                        if (recyclerView == null) {
                            Intrinsics.throwNpe();
                        }
                        Context context = recyclerView.getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context, "context");
                        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(context.getResources().getColor(C0906R.color.yq), (int) UIUtils.dip2Px(recyclerView.getContext(), 24.0f), 0, UIUtils.dip2Px(recyclerView.getContext(), 0.0f), UIUtils.dip2Px(recyclerView.getContext(), 0.0f), false);
                        recyclerView.addItemDecoration(dividerItemDecoration);
                        recyclerView.setHasFixedSize(true);
                        recyclerView.setLayoutManager(new WrapLinearLayoutManager(recyclerView.getContext(), 0, false));
                        this.s = inflate2;
                    }
                    RecyclerView recyclerView2 = this.u;
                    if (recyclerView2 == null) {
                        Intrinsics.throwNpe();
                    }
                    ChallengeDetail challengeDetail4 = this.f2823d;
                    if (challengeDetail4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mChallengeDetail");
                    }
                    RelatedMusicChallengeAdapter relatedMusicChallengeAdapter = new RelatedMusicChallengeAdapter(challengeDetail4.relatedChallengeMusicList, getContext());
                    Challenge challenge11 = this.f2824e;
                    if (challenge11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mChallenge");
                    }
                    relatedMusicChallengeAdapter.f35570c = challenge11.getCid();
                    relatedMusicChallengeAdapter.f35572e = "challenge_page";
                    recyclerView2.setAdapter(relatedMusicChallengeAdapter);
                    View view4 = this.s;
                    if (view4 == null) {
                        Intrinsics.throwNpe();
                    }
                    view4.setVisibility(0);
                    e();
                }
            }
            if (PatchProxy.isSupport(new Object[0], this, f2819a, false, 26321, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f2819a, false, 26321, new Class[0], Void.TYPE);
            } else {
                ChallengeDetail challengeDetail5 = this.f2823d;
                if (challengeDetail5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChallengeDetail");
                }
                if (!TextUtils.isEmpty(challengeDetail5.slideTitle)) {
                    ChallengeDetail challengeDetail6 = this.f2823d;
                    if (challengeDetail6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mChallengeDetail");
                    }
                    if (!CollectionUtils.isEmpty(challengeDetail6.slideList)) {
                        if (this.w == null) {
                            ViewStub viewStub3 = this.v;
                            if (viewStub3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mHorizontalSlideContainerVs");
                            }
                            View inflate3 = viewStub3.inflate();
                            this.x = (DmtTextView) inflate3.findViewById(C0906R.id.cs0);
                            this.y = (RecyclerView) inflate3.findViewById(C0906R.id.crz);
                            RecyclerView recyclerView3 = this.y;
                            if (recyclerView3 == null) {
                                Intrinsics.throwNpe();
                            }
                            recyclerView3.setLayoutManager(new WrapLinearLayoutManager(getContext(), 0, false));
                            RecyclerView recyclerView4 = this.y;
                            if (recyclerView4 == null) {
                                Intrinsics.throwNpe();
                            }
                            recyclerView4.addItemDecoration(new AbsCommonHeaderView$updateHorizontalSlide$1());
                            this.z = new HorizontalSlideVideoAdapter(this.E);
                            RecyclerView recyclerView5 = this.y;
                            if (recyclerView5 == null) {
                                Intrinsics.throwNpe();
                            }
                            recyclerView5.setAdapter(this.z);
                            this.w = inflate3;
                        }
                        DmtTextView dmtTextView2 = this.x;
                        if (dmtTextView2 == null) {
                            Intrinsics.throwNpe();
                        }
                        ChallengeDetail challengeDetail7 = this.f2823d;
                        if (challengeDetail7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mChallengeDetail");
                        }
                        dmtTextView2.setText(challengeDetail7.slideTitle);
                        HorizontalSlideVideoAdapter horizontalSlideVideoAdapter = this.z;
                        if (horizontalSlideVideoAdapter == null) {
                            Intrinsics.throwNpe();
                        }
                        ChallengeDetail challengeDetail8 = this.f2823d;
                        if (challengeDetail8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mChallengeDetail");
                        }
                        List<Aweme> list = challengeDetail8.slideList;
                        if (PatchProxy.isSupport(new Object[]{list}, horizontalSlideVideoAdapter, HorizontalSlideVideoAdapter.f35617a, false, 26421, new Class[]{List.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{list}, horizontalSlideVideoAdapter, HorizontalSlideVideoAdapter.f35617a, false, 26421, new Class[]{List.class}, Void.TYPE);
                        } else {
                            Collection collection = list;
                            if (!CollectionUtils.isEmpty(collection)) {
                                horizontalSlideVideoAdapter.f35618b.clear();
                                List<Aweme> list2 = horizontalSlideVideoAdapter.f35618b;
                                if (list == null) {
                                    Intrinsics.throwNpe();
                                }
                                list2.addAll(collection);
                                horizontalSlideVideoAdapter.notifyDataSetChanged();
                            }
                        }
                        View view5 = this.w;
                        if (view5 == null) {
                            Intrinsics.throwNpe();
                        }
                        view5.setVisibility(0);
                        c();
                    }
                }
                View view6 = this.w;
                if (view6 != null) {
                    view6.setVisibility(8);
                }
            }
            for (l a2 : this.f2822c) {
                a2.a(challengeDetail2);
            }
        }
    }

    public final void a(Aweme aweme, int i2) {
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i2)}, this, f2819a, false, 26326, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i2)}, this, f2819a, false, 26326, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
        Challenge challenge = this.f2824e;
        if (challenge == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChallenge");
        }
        r.a("click_challenge_video_card", (Map) a2.a("challenge_id", challenge.getCid()).a("group_id", aweme.getAid()).a("order", i2).f34114b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public a(@NotNull Context context, @Nullable j jVar, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (jVar == null) {
            Intrinsics.throwNpe();
        }
        this.B = jVar;
        LayoutInflater.from(context).inflate(getLayoutResId(), this, true);
        a();
        b();
        this.D = new b(this);
        this.E = new c(this);
    }
}
