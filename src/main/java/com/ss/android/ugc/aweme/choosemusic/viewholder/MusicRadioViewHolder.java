package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.music.a.e;
import com.ss.android.ugc.aweme.music.adapter.f;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.ey;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 ~2\u00020\u0001:\u0002~B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010[\u001a\u00020\\2\u000e\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010^J\u0016\u0010_\u001a\u00020\\2\u000e\u0010`\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010J\u0018\u0010a\u001a\u00020\\2\u0006\u0010b\u001a\u00020\u00062\u0006\u0010c\u001a\u00020\u0006H\u0002J\u0018\u0010d\u001a\u00020\\2\u0006\u0010e\u001a\u00020\f2\u0006\u0010f\u001a\u00020\u0006H\u0002J\b\u0010g\u001a\u00020\\H\u0002J\b\u0010h\u001a\u00020\\H\u0002J\b\u0010i\u001a\u00020\\H\u0002J\b\u0010j\u001a\u00020\\H\u0002J\b\u0010k\u001a\u00020\\H\u0002J\b\u0010l\u001a\u00020\\H\u0002J\u0006\u0010m\u001a\u00020\u0006J\u0006\u0010n\u001a\u00020\fJ\b\u0010o\u001a\u0004\u0018\u00010\u0011J\u0014\u0010p\u001a\u0004\u0018\u00010q2\b\u0010r\u001a\u0004\u0018\u00010\u0011H\u0002J\u0006\u0010s\u001a\u00020\\J\b\u0010t\u001a\u00020\\H\u0002J\b\u0010u\u001a\u00020\\H\u0002J\b\u0010v\u001a\u00020\\H\u0002J\u000e\u0010w\u001a\u00020\\2\u0006\u0010x\u001a\u00020\u000eJ\u0016\u0010y\u001a\u00020\\2\u0006\u0010b\u001a\u00020\u00062\u0006\u0010c\u001a\u00020\u0006J\u001a\u0010z\u001a\u00020\\2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00132\u0006\u0010e\u001a\u00020\fH\u0002J\b\u0010{\u001a\u00020\\H\u0002J\u0006\u0010|\u001a\u00020\\J\b\u0010}\u001a\u00020\\H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\u001c\u00100\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010*\"\u0004\b2\u0010,R\u001c\u00103\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010*\"\u0004\b5\u0010,R\"\u00106\u001a\n\u0012\u0004\u0012\u000208\u0018\u000107X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010=\u001a\u0004\u0018\u00010>X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001c\u0010C\u001a\u0004\u0018\u00010DX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001c\u0010I\u001a\u0004\u0018\u00010JX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0010\u0010O\u001a\u0004\u0018\u00010PX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010Q\u001a\u0004\u0018\u00010PX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001c\u0010V\u001a\u0004\u0018\u00010PX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010S\"\u0004\bX\u0010UR\u0010\u0010Y\u001a\u0004\u0018\u00010ZX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/ss/android/ugc/aweme/choosemusic/viewholder/MusicRadioViewHolder;", "Lcom/ss/android/ugc/aweme/arch/widgets/ItemWidgetViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "hasCollected", "", "mAnimator", "Landroid/animation/ValueAnimator;", "mContext", "Landroid/content/Context;", "mCurrentPosition", "", "mIOnClickListener", "Lcom/ss/android/ugc/aweme/music/adapter/IOnClickListener;", "mItemList", "", "Lcom/ss/android/ugc/aweme/shortvideo/model/MusicModel;", "mIvCoverFirst", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "getMIvCoverFirst$main_douyinCnRelease", "()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "setMIvCoverFirst$main_douyinCnRelease", "(Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;)V", "mIvCoverSecond", "getMIvCoverSecond$main_douyinCnRelease", "setMIvCoverSecond$main_douyinCnRelease", "mIvMusicCollect", "Lcom/ss/android/ugc/aweme/music/ui/CheckableImageView;", "getMIvMusicCollect$main_douyinCnRelease", "()Lcom/ss/android/ugc/aweme/music/ui/CheckableImageView;", "setMIvMusicCollect$main_douyinCnRelease", "(Lcom/ss/android/ugc/aweme/music/ui/CheckableImageView;)V", "mIvStatus", "Landroid/widget/ImageView;", "getMIvStatus$main_douyinCnRelease", "()Landroid/widget/ImageView;", "setMIvStatus$main_douyinCnRelease", "(Landroid/widget/ImageView;)V", "mLlDiscover", "Landroid/widget/LinearLayout;", "getMLlDiscover$main_douyinCnRelease", "()Landroid/widget/LinearLayout;", "setMLlDiscover$main_douyinCnRelease", "(Landroid/widget/LinearLayout;)V", "mLlMusicItem", "getMLlMusicItem$main_douyinCnRelease", "setMLlMusicItem$main_douyinCnRelease", "mLlTryAnother", "getMLlTryAnother$main_douyinCnRelease", "setMLlTryAnother$main_douyinCnRelease", "mLlUseToShoot", "getMLlUseToShoot$main_douyinCnRelease", "setMLlUseToShoot$main_douyinCnRelease", "mOnInternalEventListener", "Lcom/ss/android/ugc/aweme/music/adapter/OnInternalEventListener;", "Lcom/ss/android/ugc/aweme/choosemusic/event/NewMusicInternalEvent;", "getMOnInternalEventListener", "()Lcom/ss/android/ugc/aweme/music/adapter/OnInternalEventListener;", "setMOnInternalEventListener", "(Lcom/ss/android/ugc/aweme/music/adapter/OnInternalEventListener;)V", "mOnLoadMoreLisenter", "Lcom/ss/android/ugc/aweme/choosemusic/viewholder/MusicRadioViewHolder$OnLoadMoreLisenter;", "getMOnLoadMoreLisenter", "()Lcom/ss/android/ugc/aweme/choosemusic/viewholder/MusicRadioViewHolder$OnLoadMoreLisenter;", "setMOnLoadMoreLisenter", "(Lcom/ss/android/ugc/aweme/choosemusic/viewholder/MusicRadioViewHolder$OnLoadMoreLisenter;)V", "mRlCoverContainer", "Landroid/widget/FrameLayout;", "getMRlCoverContainer$main_douyinCnRelease", "()Landroid/widget/FrameLayout;", "setMRlCoverContainer$main_douyinCnRelease", "(Landroid/widget/FrameLayout;)V", "mRlRight", "Landroid/widget/RelativeLayout;", "getMRlRight$main_douyinCnRelease", "()Landroid/widget/RelativeLayout;", "setMRlRight$main_douyinCnRelease", "(Landroid/widget/RelativeLayout;)V", "mTvDuration", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mTvName", "getMTvName$main_douyinCnRelease", "()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "setMTvName$main_douyinCnRelease", "(Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;)V", "mTvSinger", "getMTvSinger$main_douyinCnRelease", "setMTvSinger$main_douyinCnRelease", "rotateAni", "Landroid/view/animation/Animation;", "addMusicData", "", "list", "", "bind", "itemList", "bindPlayView", "isPlaying", "isLoading", "bindPosition", "position", "anim", "changeDiscoverUI", "clickCollect", "clickDiscover", "clickPlayMusic", "clickTryAnother", "clickUseToShoot", "getCollectStatus", "getCurrentIndex", "getCurrentItem", "getMusicCover", "", "music", "handleCollectMusic", "loadMoreData", "playMusic", "playSwitchAnim", "setIOnClickListener", "IOnClickListener", "setPlaying", "showMusicCover", "updateCollectStatus", "updateCollectUI", "updateMusic", "Companion", "OnLoadMoreLisenter", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class MusicRadioViewHolder extends ItemWidgetViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f36129c;
    public static final a w = new a((byte) 0);
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public RemoteImageView f36130d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public RemoteImageView f36131e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public ImageView f36132f;
    @Nullable
    public FrameLayout g;
    @Nullable
    public DmtTextView h;
    @Nullable
    public DmtTextView i;
    @Nullable
    public RelativeLayout j;
    @Nullable
    public CheckableImageView k;
    @Nullable
    public LinearLayout l;
    @Nullable
    public LinearLayout m;
    @Nullable
    public LinearLayout n;
    @Nullable
    public LinearLayout o;
    @Nullable
    public b p;
    public com.ss.android.ugc.aweme.music.adapter.d q;
    @Nullable
    public f<com.ss.android.ugc.aweme.choosemusic.a.b> r;
    public List<MusicModel> s;
    public int t;
    public Context u;
    public boolean v;
    private DmtTextView x;
    private ValueAnimator y;
    private Animation z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/choosemusic/viewholder/MusicRadioViewHolder$Companion;", "", "()V", "ANIM_DURATION", "", "END_ALPHA", "", "createView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "viewGroup", "Landroid/view/ViewGroup;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36145a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/choosemusic/viewholder/MusicRadioViewHolder$OnLoadMoreLisenter;", "", "loadMore", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36146a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MusicRadioViewHolder f36147b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f36148c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f36149d;

        c(MusicRadioViewHolder musicRadioViewHolder, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
            this.f36147b = musicRadioViewHolder;
            this.f36148c = floatRef;
            this.f36149d = floatRef2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f36146a, false, 26961, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f36146a, false, 26961, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                RemoteImageView remoteImageView = this.f36147b.f36130d;
                if (remoteImageView != null) {
                    remoteImageView.setScaleX(floatValue);
                }
                RemoteImageView remoteImageView2 = this.f36147b.f36130d;
                if (remoteImageView2 != null) {
                    remoteImageView2.setScaleY(floatValue);
                }
                RemoteImageView remoteImageView3 = this.f36147b.f36130d;
                if (remoteImageView3 != null) {
                    remoteImageView3.setAlpha((floatValue - this.f36148c.element) / this.f36149d.element);
                }
                RemoteImageView remoteImageView4 = this.f36147b.f36131e;
                if (remoteImageView4 != null) {
                    remoteImageView4.setScaleX((this.f36148c.element + 1.0f) - floatValue);
                }
                RemoteImageView remoteImageView5 = this.f36147b.f36131e;
                if (remoteImageView5 != null) {
                    remoteImageView5.setScaleY((this.f36148c.element + 1.0f) - floatValue);
                }
                RemoteImageView remoteImageView6 = this.f36147b.f36131e;
                if (remoteImageView6 != null) {
                    remoteImageView6.setAlpha((1.0f - floatValue) / this.f36149d.element);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/choosemusic/viewholder/MusicRadioViewHolder$playSwitchAnim$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36150a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MusicRadioViewHolder f36151b;

        d(MusicRadioViewHolder musicRadioViewHolder) {
            this.f36151b = musicRadioViewHolder;
        }

        public final void onAnimationEnd(@NotNull Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f36150a, false, 26962, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f36150a, false, 26962, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            RemoteImageView remoteImageView = this.f36151b.f36131e;
            this.f36151b.f36131e = this.f36151b.f36130d;
            this.f36151b.f36130d = remoteImageView;
            this.f36151b.a(this.f36151b.f36131e, this.f36151b.t + 1);
        }
    }

    public final void a() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f36129c, false, 26936, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36129c, false, 26936, new Class[0], Void.TYPE);
            return;
        }
        CheckableImageView checkableImageView = this.k;
        if (checkableImageView != null) {
            if (this.v) {
                i2 = 2130838804;
            } else {
                i2 = 2130838805;
            }
            checkableImageView.setImageResource(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f36129c, false, 26942, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36129c, false, 26942, new Class[0], Void.TYPE);
            return;
        }
        LinearLayout linearLayout = this.m;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.n;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        LinearLayout linearLayout3 = this.o;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        if (r0 == null) goto L_0x0034;
     */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.shortvideo.model.MusicModel c() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f36129c
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r7 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.class
            r4 = 0
            r5 = 26944(0x6940, float:3.7757E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f36129c
            r5 = 0
            r6 = 26944(0x6940, float:3.7757E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r8 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r0
            return r0
        L_0x0026:
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r0 = r9.s
            if (r0 == 0) goto L_0x0034
            int r1 = r9.t
            java.lang.Object r0 = kotlin.collections.CollectionsKt.getOrNull(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r0
            if (r0 != 0) goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicRadioViewHolder.c():com.ss.android.ugc.aweme.shortvideo.model.MusicModel");
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f36129c, false, 26946, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36129c, false, 26946, new Class[0], Void.TYPE);
            return;
        }
        b bVar = this.p;
        if (bVar != null) {
            bVar.a();
        }
    }

    private final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f36129c, false, 26938, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36129c, false, 26938, new Class[0], Void.TYPE);
            return;
        }
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = 0.2f;
        Ref.FloatRef floatRef2 = new Ref.FloatRef();
        floatRef2.element = 1.0f - floatRef.element;
        this.y = ValueAnimator.ofFloat(new float[]{1.0f, floatRef.element}).setDuration(150);
        RemoteImageView remoteImageView = this.f36131e;
        if (remoteImageView != null) {
            remoteImageView.setAlpha(0.0f);
        }
        RemoteImageView remoteImageView2 = this.f36131e;
        if (remoteImageView2 != null) {
            remoteImageView2.setVisibility(0);
        }
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(new c(this, floatRef, floatRef2));
        }
        ValueAnimator valueAnimator2 = this.y;
        if (valueAnimator2 != null) {
            valueAnimator2.addListener(new d(this));
        }
        ValueAnimator valueAnimator3 = this.y;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    private final String a(MusicModel musicModel) {
        String str;
        boolean z2;
        String str2;
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{musicModel}, this, f36129c, false, 26940, new Class[]{MusicModel.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{musicModel}, this, f36129c, false, 26940, new Class[]{MusicModel.class}, String.class);
        }
        if (musicModel != null) {
            str = musicModel.getPicPremium();
        } else {
            str = null;
        }
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (musicModel != null) {
                str2 = musicModel.getPicBig();
            } else {
                str2 = null;
            }
            CharSequence charSequence2 = str2;
            if (!(charSequence2 == null || charSequence2.length() == 0)) {
                z3 = false;
            }
            if (!z3 && musicModel != null) {
                return musicModel.getPicBig();
            }
        } else if (musicModel != null) {
            return musicModel.getPicPremium();
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicRadioViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.u = view.getContext();
        this.f36130d = (RemoteImageView) view.findViewById(C0906R.id.b0_);
        this.f36131e = (RemoteImageView) view.findViewById(C0906R.id.b0a);
        this.f36132f = (ImageView) view.findViewById(C0906R.id.b5d);
        this.g = (FrameLayout) view.findViewById(C0906R.id.cfo);
        this.i = (DmtTextView) view.findViewById(C0906R.id.dj4);
        this.h = (DmtTextView) view.findViewById(C0906R.id.df7);
        this.j = (RelativeLayout) view.findViewById(C0906R.id.cg_);
        this.x = (DmtTextView) view.findViewById(C0906R.id.df1);
        this.k = (CheckableImageView) view.findViewById(C0906R.id.b3e);
        this.l = (LinearLayout) view.findViewById(C0906R.id.bha);
        this.m = (LinearLayout) view.findViewById(C0906R.id.bgc);
        this.n = (LinearLayout) view.findViewById(C0906R.id.bif);
        this.o = (LinearLayout) view.findViewById(C0906R.id.bie);
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        this.z = AnimationUtils.loadAnimation(view2.getContext(), C0906R.anim.cp);
        Animation animation = this.z;
        if (animation != null) {
            animation.setInterpolator(new LinearInterpolator());
        }
        LinearLayout linearLayout = this.m;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f36133a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ MusicRadioViewHolder f36134b;

                {
                    this.f36134b = r1;
                }

                public final void onClick(View view) {
                    MusicModel musicModel;
                    if (PatchProxy.isSupport(new Object[]{view}, this, f36133a, false, 26953, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f36133a, false, 26953, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    MusicRadioViewHolder musicRadioViewHolder = this.f36134b;
                    if (PatchProxy.isSupport(new Object[0], musicRadioViewHolder, MusicRadioViewHolder.f36129c, false, 26941, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], musicRadioViewHolder, MusicRadioViewHolder.f36129c, false, 26941, new Class[0], Void.TYPE);
                        return;
                    }
                    musicRadioViewHolder.b();
                    com.ss.android.ugc.aweme.music.adapter.d dVar = musicRadioViewHolder.q;
                    if (dVar != null) {
                        RecyclerView.ViewHolder viewHolder = musicRadioViewHolder;
                        View view2 = musicRadioViewHolder.m;
                        List<MusicModel> list = musicRadioViewHolder.s;
                        if (list != null) {
                            musicModel = (MusicModel) CollectionsKt.getOrNull(list, musicRadioViewHolder.t);
                        } else {
                            musicModel = null;
                        }
                        dVar.a(viewHolder, view2, musicModel);
                    }
                }
            });
        }
        LinearLayout linearLayout2 = this.o;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new View.OnClickListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f36135a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ MusicRadioViewHolder f36136b;

                {
                    this.f36136b = r1;
                }

                public final void onClick(View view) {
                    int i;
                    MusicModel musicModel;
                    int i2 = 0;
                    if (PatchProxy.isSupport(new Object[]{view}, this, f36135a, false, 26954, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f36135a, false, 26954, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    MusicRadioViewHolder musicRadioViewHolder = this.f36136b;
                    if (PatchProxy.isSupport(new Object[0], musicRadioViewHolder, MusicRadioViewHolder.f36129c, false, 26943, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], musicRadioViewHolder, MusicRadioViewHolder.f36129c, false, 26943, new Class[0], Void.TYPE);
                        return;
                    }
                    int i3 = musicRadioViewHolder.t + 1;
                    List<MusicModel> list = musicRadioViewHolder.s;
                    if (list != null) {
                        i = list.size();
                    } else {
                        i = 0;
                    }
                    if (i3 >= i) {
                        musicRadioViewHolder.d();
                        return;
                    }
                    List<MusicModel> list2 = musicRadioViewHolder.s;
                    if (list2 != null) {
                        i2 = list2.size();
                    }
                    if (i2 - musicRadioViewHolder.t <= 3) {
                        musicRadioViewHolder.d();
                    }
                    musicRadioViewHolder.t++;
                    musicRadioViewHolder.a(musicRadioViewHolder.t, true);
                    com.ss.android.ugc.aweme.music.adapter.d dVar = musicRadioViewHolder.q;
                    if (dVar != null) {
                        RecyclerView.ViewHolder viewHolder = musicRadioViewHolder;
                        View view2 = musicRadioViewHolder.o;
                        List<MusicModel> list3 = musicRadioViewHolder.s;
                        if (list3 != null) {
                            musicModel = (MusicModel) CollectionsKt.getOrNull(list3, musicRadioViewHolder.t);
                        } else {
                            musicModel = null;
                        }
                        dVar.a(viewHolder, view2, musicModel);
                    }
                }
            });
        }
        LinearLayout linearLayout3 = this.l;
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener(new View.OnClickListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f36137a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ MusicRadioViewHolder f36138b;

                {
                    this.f36138b = r1;
                }

                public final void onClick(View view) {
                    MusicModel musicModel;
                    if (PatchProxy.isSupport(new Object[]{view}, this, f36137a, false, 26955, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f36137a, false, 26955, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    MusicRadioViewHolder musicRadioViewHolder = this.f36138b;
                    if (PatchProxy.isSupport(new Object[0], musicRadioViewHolder, MusicRadioViewHolder.f36129c, false, 26947, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], musicRadioViewHolder, MusicRadioViewHolder.f36129c, false, 26947, new Class[0], Void.TYPE);
                        return;
                    }
                    LinearLayout linearLayout = musicRadioViewHolder.m;
                    if (linearLayout != null && linearLayout.getVisibility() == 0) {
                        musicRadioViewHolder.b();
                    }
                    if (PatchProxy.isSupport(new Object[0], musicRadioViewHolder, MusicRadioViewHolder.f36129c, false, 26948, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], musicRadioViewHolder, MusicRadioViewHolder.f36129c, false, 26948, new Class[0], Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.music.adapter.d dVar = musicRadioViewHolder.q;
                    if (dVar != null) {
                        RecyclerView.ViewHolder viewHolder = musicRadioViewHolder;
                        View view2 = musicRadioViewHolder.l;
                        List<MusicModel> list = musicRadioViewHolder.s;
                        if (list != null) {
                            musicModel = (MusicModel) CollectionsKt.getOrNull(list, musicRadioViewHolder.t);
                        } else {
                            musicModel = null;
                        }
                        dVar.a(viewHolder, view2, musicModel);
                    }
                }
            });
        }
        LinearLayout linearLayout4 = this.n;
        if (linearLayout4 != null) {
            linearLayout4.setOnClickListener(new View.OnClickListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f36139a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ MusicRadioViewHolder f36140b;

                {
                    this.f36140b = r1;
                }

                public final void onClick(View view) {
                    MusicModel musicModel;
                    if (PatchProxy.isSupport(new Object[]{view}, this, f36139a, false, 26956, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f36139a, false, 26956, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    MusicRadioViewHolder musicRadioViewHolder = this.f36140b;
                    if (PatchProxy.isSupport(new Object[0], musicRadioViewHolder, MusicRadioViewHolder.f36129c, false, 26949, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], musicRadioViewHolder, MusicRadioViewHolder.f36129c, false, 26949, new Class[0], Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.music.adapter.d dVar = musicRadioViewHolder.q;
                    if (dVar != null) {
                        RecyclerView.ViewHolder viewHolder = musicRadioViewHolder;
                        View view2 = musicRadioViewHolder.n;
                        List<MusicModel> list = musicRadioViewHolder.s;
                        if (list != null) {
                            musicModel = (MusicModel) CollectionsKt.getOrNull(list, musicRadioViewHolder.t);
                        } else {
                            musicModel = null;
                        }
                        dVar.a(viewHolder, view2, musicModel);
                    }
                }
            });
        }
        CheckableImageView checkableImageView = this.k;
        if (checkableImageView != null) {
            checkableImageView.setOnClickListener(new View.OnClickListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f36141a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ MusicRadioViewHolder f36142b;

                {
                    this.f36142b = r1;
                }

                public final void onClick(View view) {
                    MusicModel musicModel;
                    if (PatchProxy.isSupport(new Object[]{view}, this, f36141a, false, 26957, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f36141a, false, 26957, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    MusicRadioViewHolder musicRadioViewHolder = this.f36142b;
                    if (PatchProxy.isSupport(new Object[0], musicRadioViewHolder, MusicRadioViewHolder.f36129c, false, 26950, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], musicRadioViewHolder, MusicRadioViewHolder.f36129c, false, 26950, new Class[0], Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.music.adapter.d dVar = musicRadioViewHolder.q;
                    if (dVar != null) {
                        RecyclerView.ViewHolder viewHolder = musicRadioViewHolder;
                        View view2 = musicRadioViewHolder.k;
                        List<MusicModel> list = musicRadioViewHolder.s;
                        if (list != null) {
                            musicModel = (MusicModel) CollectionsKt.getOrNull(list, musicRadioViewHolder.t);
                        } else {
                            musicModel = null;
                        }
                        dVar.a(viewHolder, view2, musicModel);
                    }
                }
            });
        }
        CheckableImageView checkableImageView2 = this.k;
        if (checkableImageView2 != null) {
            checkableImageView2.setOnStateChangeListener(new CheckableImageView.a(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f36143a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ MusicRadioViewHolder f36144b;

                public final void a() {
                    MusicModel musicModel;
                    if (PatchProxy.isSupport(new Object[0], this, f36143a, false, 26959, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f36143a, false, 26959, new Class[0], Void.TYPE);
                        return;
                    }
                    MusicRadioViewHolder musicRadioViewHolder = this.f36144b;
                    if (PatchProxy.isSupport(new Object[0], musicRadioViewHolder, MusicRadioViewHolder.f36129c, false, 26934, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], musicRadioViewHolder, MusicRadioViewHolder.f36129c, false, 26934, new Class[0], Void.TYPE);
                        return;
                    }
                    boolean z = musicRadioViewHolder.v;
                    List<MusicModel> list = musicRadioViewHolder.s;
                    if (list != null) {
                        musicModel = (MusicModel) CollectionsKt.getOrNull(list, musicRadioViewHolder.t);
                    } else {
                        musicModel = null;
                    }
                    bg.a(new e(z ? 1 : 0, musicModel));
                }

                {
                    this.f36144b = r1;
                }

                public final void a(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f36143a, false, 26958, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f36143a, false, 26958, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (i == 1) {
                        this.f36144b.a();
                    }
                }
            });
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (r0 == false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f36129c
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 26945(0x6941, float:3.7758E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f36129c
            r3 = 0
            r4 = 26945(0x6941, float:3.7758E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r0 = r9.s
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x003f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r0 = 0
            goto L_0x0040
        L_0x003f:
            r0 = 1
        L_0x0040:
            if (r0 == 0) goto L_0x0054
            r0 = r10
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x0050
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r0 = 0
            goto L_0x0051
        L_0x0050:
            r0 = 1
        L_0x0051:
            if (r0 != 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r7 = 0
        L_0x0055:
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r0 = r9.s
            if (r0 != 0) goto L_0x0062
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r9.s = r0
        L_0x0062:
            if (r10 == 0) goto L_0x006e
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r0 = r9.s
            if (r0 == 0) goto L_0x006e
            r1 = r10
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
        L_0x006e:
            if (r7 == 0) goto L_0x0075
            int r0 = r9.t
            r9.a((int) r0, (boolean) r8)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicRadioViewHolder.a(java.util.List):void");
    }

    public final void a(int i2, boolean z2) {
        int i3;
        MusicModel musicModel;
        int i4;
        String str;
        boolean z3;
        String singer;
        String str2;
        boolean z4 = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f36129c, false, 26937, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2)}, this, f36129c, false, 26937, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        List<MusicModel> list = this.s;
        if (list != null) {
            i3 = list.size();
        } else {
            i3 = 0;
        }
        if (i2 < i3) {
            List<MusicModel> list2 = this.s;
            MusicModel.CollectionType collectionType = null;
            if (list2 != null) {
                musicModel = list2.get(i2);
            } else {
                musicModel = null;
            }
            DmtTextView dmtTextView = this.h;
            if (dmtTextView != null) {
                if (musicModel != null) {
                    str2 = musicModel.getName();
                } else {
                    str2 = null;
                }
                dmtTextView.setText(str2);
            }
            DmtTextView dmtTextView2 = this.i;
            if (dmtTextView2 != null) {
                if (musicModel != null) {
                    str = musicModel.getSinger();
                } else {
                    str = null;
                }
                CharSequence charSequence = str;
                if (charSequence == null || charSequence.length() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    DmtTextView dmtTextView3 = this.i;
                    if (dmtTextView3 != null) {
                        Context context = dmtTextView3.getContext();
                        if (context != null) {
                            singer = context.getString(C0906R.string.do3);
                            dmtTextView2.setText(singer);
                        }
                    }
                } else if (musicModel != null) {
                    singer = musicModel.getSinger();
                    dmtTextView2.setText(singer);
                }
                singer = null;
                dmtTextView2.setText(singer);
            }
            DmtTextView dmtTextView4 = this.x;
            if (dmtTextView4 != null) {
                if (musicModel != null) {
                    i4 = musicModel.getDuration();
                } else {
                    i4 = 0;
                }
                dmtTextView4.setText(ey.a(i4));
            }
            MusicModel.CollectionType collectionType2 = MusicModel.CollectionType.COLLECTED;
            if (musicModel != null) {
                collectionType = musicModel.getCollectionType();
            }
            if (collectionType2 == collectionType) {
                z4 = true;
            }
            this.v = z4;
            a();
            if (!z2) {
                a(this.f36130d, i2);
                a(this.f36131e, i2 + 1);
                return;
            }
            e();
        }
    }

    public final void a(RemoteImageView remoteImageView, int i2) {
        int i3;
        MusicModel musicModel;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{remoteImageView, Integer.valueOf(i2)}, this, f36129c, false, 26939, new Class[]{RemoteImageView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView, Integer.valueOf(i2)}, this, f36129c, false, 26939, new Class[]{RemoteImageView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        List<MusicModel> list = this.s;
        if (list != null) {
            i3 = list.size();
        } else {
            i3 = 0;
        }
        if (i2 < i3) {
            List<MusicModel> list2 = this.s;
            if (list2 != null) {
                musicModel = list2.get(i2);
            } else {
                musicModel = null;
            }
            String a2 = a(musicModel);
            CharSequence charSequence = a2;
            if (charSequence == null || charSequence.length() == 0) {
                z2 = true;
            }
            if (z2) {
                com.ss.android.ugc.aweme.base.c.a(remoteImageView, (int) C0906R.color.h6);
            } else {
                com.ss.android.ugc.aweme.base.c.a(remoteImageView, a2);
            }
        }
    }

    public final void a(boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f36129c, false, 26951, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f36129c, false, 26951, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f36129c, false, 26952, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f36129c, false, 26952, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        ImageView imageView = this.f36132f;
        if (imageView != null) {
            imageView.clearAnimation();
        }
        if (z2 && z3) {
            MusicRadioViewHolder musicRadioViewHolder = this;
            ImageView imageView2 = musicRadioViewHolder.f36132f;
            if (imageView2 != null) {
                imageView2.setImageResource(2130839665);
            }
            ImageView imageView3 = musicRadioViewHolder.f36132f;
            if (imageView3 != null) {
                imageView3.startAnimation(musicRadioViewHolder.z);
            }
        } else if (!z2 || z3) {
            ImageView imageView4 = this.f36132f;
            if (imageView4 != null) {
                imageView4.setImageResource(2130839141);
            }
        } else {
            ImageView imageView5 = this.f36132f;
            if (imageView5 != null) {
                imageView5.setImageResource(2130839170);
            }
        }
    }
}
