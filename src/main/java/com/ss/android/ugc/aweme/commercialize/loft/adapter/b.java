package com.ss.android.ugc.aweme.commercialize.loft.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.base.ActivityTransUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.ui.AudioControlView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.comment.a;
import com.ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView;
import com.ss.android.ugc.aweme.commercialize.loft.half.LoftView;
import com.ss.android.ugc.aweme.commercialize.loft.model.k;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.ss.android.ugc.aweme.longvideo.DiggView;
import com.ss.android.ugc.aweme.longvideo.feature.LoadingController;
import com.ss.android.ugc.aweme.longvideo.feature.LongVideoPlayMob;
import com.ss.android.ugc.aweme.longvideo.feature.NoOperateModeController;
import com.ss.android.ugc.aweme.longvideo.i;
import com.ss.android.ugc.aweme.longvideo.j;
import com.ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior;
import com.ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout;
import com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView;
import com.ss.android.ugc.aweme.longvideo.view.VideoPlaySeekBar;
import com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¬\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B-\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010ð\u0001\u001a\u00020\u000eH\u0002J0\u0010ñ\u0001\u001a\u00030ò\u00012\t\u0010ó\u0001\u001a\u0004\u0018\u00010\u00112\u0007\u0010ô\u0001\u001a\u00020x2\u0007\u0010õ\u0001\u001a\u00020Q2\u0007\u0010ö\u0001\u001a\u00020QH\u0016J\n\u0010÷\u0001\u001a\u00030ò\u0001H\u0016J\n\u0010ø\u0001\u001a\u00030ò\u0001H\u0002J\n\u0010ù\u0001\u001a\u00030ò\u0001H\u0016J\u0013\u0010ù\u0001\u001a\u00030ò\u00012\u0007\u0010ú\u0001\u001a\u00020\u000eH\u0002J\n\u0010û\u0001\u001a\u00030ò\u0001H\u0016J\u000b\u0010ü\u0001\u001a\u0004\u0018\u00010.H\u0016J\u0012\u0010ý\u0001\u001a\u00020\u00112\u0007\u0010þ\u0001\u001a\u00020\u000eH\u0002J\t\u0010ÿ\u0001\u001a\u00020QH\u0002J\t\u0010\u0002\u001a\u00020QH\u0016J\u0016\u0010\u0002\u001a\u0005\u0018\u00010\u00022\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J\n\u0010\u0002\u001a\u00030ò\u0001H\u0016J\u0013\u0010\u0002\u001a\u00030ò\u00012\u0007\u0010\u0002\u001a\u00020\u0006H\u0002J\n\u0010\u0002\u001a\u00030ò\u0001H\u0002J\n\u0010\u0002\u001a\u00030é\u0001H\u0002J\b\u0010\u0002\u001a\u00030ò\u0001J\u0015\u0010\u0002\u001a\u00030ò\u00012\t\u0010\u0002\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\u0002\u001a\u00030ò\u0001H\u0016J\n\u0010\u0002\u001a\u00030ò\u0001H\u0016J\n\u0010\u0002\u001a\u00030ò\u0001H\u0016J\n\u0010\u0002\u001a\u00030ò\u0001H\u0016J\u0013\u0010\u0002\u001a\u00030ò\u00012\u0007\u0010\u0002\u001a\u00020\u000eH\u0002J\n\u0010\u0002\u001a\u00030ò\u0001H\u0002J\u0013\u0010\u0002\u001a\u00030ò\u00012\u0007\u0010õ\u0001\u001a\u00020QH\u0002J\n\u0010\u0002\u001a\u00030ò\u0001H\u0016J\n\u0010\u0002\u001a\u00030ò\u0001H\u0016J\u001c\u0010\u0002\u001a\u00030ò\u00012\u0007\u0010õ\u0001\u001a\u00020Q2\u0007\u0010ö\u0001\u001a\u00020QH\u0002J\u0011\u0010\u0002\u001a\u00030ò\u00012\u0007\u0010\u0002\u001a\u00020\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u00106R\u001a\u00107\u001a\u000208X.¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020>X.¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001c\u0010C\u001a\u0004\u0018\u00010DX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001c\u0010I\u001a\u0004\u0018\u00010JX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u000e\u0010O\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010P\u001a\u00020QX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001a\u0010V\u001a\u000208X.¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010:\"\u0004\bX\u0010<R\u001a\u0010Y\u001a\u00020ZX.¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001a\u0010_\u001a\u000208X.¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010:\"\u0004\ba\u0010<R\u001a\u0010b\u001a\u000208X.¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010:\"\u0004\bd\u0010<R\u001a\u0010e\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\u001d\"\u0004\bg\u00106R\u001a\u0010h\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\u001d\"\u0004\bj\u00106R\u001a\u0010k\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\u001d\"\u0004\bm\u00106R\u001a\u0010n\u001a\u00020oX.¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u001a\u0010t\u001a\u00020oX.¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010q\"\u0004\bv\u0010sR\u001a\u0010w\u001a\u00020xX.¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u001d\u0010}\u001a\u00020~X.¢\u0006\u0011\n\u0000\u001a\u0005\b\u0010\u0001\"\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u00030\u0001X.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u00030\u0001X.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u00030\u0001X.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u00030\u0001X.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u00030\u0001X.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010 \u0001R \u0010¡\u0001\u001a\u00030¢\u0001X.¢\u0006\u0012\n\u0000\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R\u001d\u0010§\u0001\u001a\u00020oX.¢\u0006\u0010\n\u0000\u001a\u0005\b¨\u0001\u0010q\"\u0005\b©\u0001\u0010sR\"\u0010ª\u0001\u001a\u0005\u0018\u00010«\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¬\u0001\u0010­\u0001\"\u0006\b®\u0001\u0010¯\u0001R\u001f\u0010°\u0001\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b±\u0001\u0010\u001d\"\u0005\b²\u0001\u00106R\"\u0010³\u0001\u001a\u0005\u0018\u00010´\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R\u001f\u0010¹\u0001\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bº\u0001\u0010\u001d\"\u0005\b»\u0001\u00106R\u000f\u0010¼\u0001\u001a\u00020QX\u000e¢\u0006\u0002\n\u0000R\u001d\u0010½\u0001\u001a\u00020\u001fX.¢\u0006\u0010\n\u0000\u001a\u0005\b¾\u0001\u0010!\"\u0005\b¿\u0001\u0010#R \u0010À\u0001\u001a\u00030Á\u0001X.¢\u0006\u0012\n\u0000\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0006\bÄ\u0001\u0010Å\u0001R\u001d\u0010Æ\u0001\u001a\u000208X.¢\u0006\u0010\n\u0000\u001a\u0005\bÇ\u0001\u0010:\"\u0005\bÈ\u0001\u0010<R \u0010É\u0001\u001a\u00030Ê\u0001X.¢\u0006\u0012\n\u0000\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001R \u0010Ï\u0001\u001a\u00030Ð\u0001X.¢\u0006\u0012\n\u0000\u001a\u0006\bÑ\u0001\u0010Ò\u0001\"\u0006\bÓ\u0001\u0010Ô\u0001R\u001d\u0010Õ\u0001\u001a\u00020\u0006X.¢\u0006\u0010\n\u0000\u001a\u0005\bÖ\u0001\u0010\u001d\"\u0005\b×\u0001\u00106R \u0010Ø\u0001\u001a\u00030Ù\u0001X.¢\u0006\u0012\n\u0000\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R\u0010\u0010Þ\u0001\u001a\u00030ß\u0001X.¢\u0006\u0002\n\u0000R\u001d\u0010à\u0001\u001a\u00020QX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bá\u0001\u0010S\"\u0005\bâ\u0001\u0010UR\u0013\u0010\t\u001a\u00020\n¢\u0006\n\n\u0000\u001a\u0006\bã\u0001\u0010ä\u0001R\u001d\u0010å\u0001\u001a\u00020\u0006X.¢\u0006\u0010\n\u0000\u001a\u0005\bæ\u0001\u0010\u001d\"\u0005\bç\u0001\u00106R\u0010\u0010è\u0001\u001a\u00030é\u0001X\u000e¢\u0006\u0002\n\u0000R\"\u0010ê\u0001\u001a\u0005\u0018\u00010ë\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bì\u0001\u0010í\u0001\"\u0006\bî\u0001\u0010ï\u0001¨\u0006\u0002"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/adapter/LoftVideoViewHolder;", "Lcom/ss/android/ugc/aweme/commercialize/loft/adapter/ILoftViewHolder;", "Landroid/view/View$OnClickListener;", "Lcom/ss/android/ugc/aweme/longvideo/ILongPlayControll;", "Lcom/ss/android/ugc/aweme/longvideo/feature/NoOperateModeController$NoOperationCallback;", "convertView", "Landroid/view/View;", "activity", "Landroid/support/v4/app/FragmentActivity;", "playerManager", "Lcom/ss/android/ugc/aweme/video/PlayerManager;", "dialogController", "Lcom/ss/android/ugc/aweme/feed/DialogController;", "loftAnimationStyle", "", "(Landroid/view/View;Landroid/support/v4/app/FragmentActivity;Lcom/ss/android/ugc/aweme/video/PlayerManager;Lcom/ss/android/ugc/aweme/feed/DialogController;Z)V", "actId", "", "getActivity", "()Landroid/support/v4/app/FragmentActivity;", "audioControlView", "Lcom/ss/android/ugc/aweme/base/ui/AudioControlView;", "getAudioControlView", "()Lcom/ss/android/ugc/aweme/base/ui/AudioControlView;", "setAudioControlView", "(Lcom/ss/android/ugc/aweme/base/ui/AudioControlView;)V", "behavior", "Lcom/ss/android/ugc/aweme/longvideo/view/CustomBottomSheetBehavior;", "getConvertView", "()Landroid/view/View;", "coverContainer", "Landroid/widget/FrameLayout;", "getCoverContainer", "()Landroid/widget/FrameLayout;", "setCoverContainer", "(Landroid/widget/FrameLayout;)V", "getDialogController", "()Lcom/ss/android/ugc/aweme/feed/DialogController;", "eventType", "getEventType", "()Ljava/lang/String;", "setEventType", "(Ljava/lang/String;)V", "getLoftAnimationStyle", "()Z", "mAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getMAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "setMAweme", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "mBgContainer", "getMBgContainer", "setMBgContainer", "(Landroid/view/View;)V", "mCommentView", "Landroid/widget/ImageView;", "getMCommentView", "()Landroid/widget/ImageView;", "setMCommentView", "(Landroid/widget/ImageView;)V", "mCover", "Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "getMCover", "()Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "setMCover", "(Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;)V", "mDiggView", "Lcom/ss/android/ugc/aweme/longvideo/DiggView;", "getMDiggView", "()Lcom/ss/android/ugc/aweme/longvideo/DiggView;", "setMDiggView", "(Lcom/ss/android/ugc/aweme/longvideo/DiggView;)V", "mImmersionBar", "Lcom/gyf/barlibrary/ImmersionBar;", "getMImmersionBar", "()Lcom/gyf/barlibrary/ImmersionBar;", "setMImmersionBar", "(Lcom/gyf/barlibrary/ImmersionBar;)V", "mIsLandscape", "mIsLongItem", "", "getMIsLongItem", "()I", "setMIsLongItem", "(I)V", "mIvClose", "getMIvClose", "setMIvClose", "mIvDigg", "Lcom/ss/android/ugc/aweme/longvideo/view/LongVideoDiggAnimationView;", "getMIvDigg", "()Lcom/ss/android/ugc/aweme/longvideo/view/LongVideoDiggAnimationView;", "setMIvDigg", "(Lcom/ss/android/ugc/aweme/longvideo/view/LongVideoDiggAnimationView;)V", "mIvPlay", "getMIvPlay", "setMIvPlay", "mIvReplay", "getMIvReplay", "setMIvReplay", "mLoftGuideLL", "getMLoftGuideLL", "setMLoftGuideLL", "mLoftMaskBottom", "getMLoftMaskBottom", "setMLoftMaskBottom", "mLoftMaskTop", "getMLoftMaskTop", "setMLoftMaskTop", "mLoftNumTv", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "getMLoftNumTv", "()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "setMLoftNumTv", "(Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;)V", "mLoftTitleTv", "getMLoftTitleTv", "setMLoftTitleTv", "mLoftVideo", "Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftVideo;", "getMLoftVideo", "()Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftVideo;", "setMLoftVideo", "(Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftVideo;)V", "mLoftView", "Lcom/ss/android/ugc/aweme/commercialize/loft/half/LoftView;", "getMLoftView", "()Lcom/ss/android/ugc/aweme/commercialize/loft/half/LoftView;", "setMLoftView", "(Lcom/ss/android/ugc/aweme/commercialize/loft/half/LoftView;)V", "mLongVideoPlayMob", "Lcom/ss/android/ugc/aweme/longvideo/feature/LongVideoPlayMob;", "getMLongVideoPlayMob", "()Lcom/ss/android/ugc/aweme/longvideo/feature/LongVideoPlayMob;", "setMLongVideoPlayMob", "(Lcom/ss/android/ugc/aweme/longvideo/feature/LongVideoPlayMob;)V", "mLongVideoPlayView", "Lcom/ss/android/ugc/aweme/commercialize/loft/LoftVideoPlayView;", "getMLongVideoPlayView", "()Lcom/ss/android/ugc/aweme/commercialize/loft/LoftVideoPlayView;", "setMLongVideoPlayView", "(Lcom/ss/android/ugc/aweme/commercialize/loft/LoftVideoPlayView;)V", "mLongVideoScreenHelper", "Lcom/ss/android/ugc/aweme/longvideo/LongVideoScreenHelper;", "getMLongVideoScreenHelper", "()Lcom/ss/android/ugc/aweme/longvideo/LongVideoScreenHelper;", "setMLongVideoScreenHelper", "(Lcom/ss/android/ugc/aweme/longvideo/LongVideoScreenHelper;)V", "mLongVideoSeekView", "Lcom/ss/android/ugc/aweme/longvideo/LongVideoSeekView;", "getMLongVideoSeekView", "()Lcom/ss/android/ugc/aweme/longvideo/LongVideoSeekView;", "setMLongVideoSeekView", "(Lcom/ss/android/ugc/aweme/longvideo/LongVideoSeekView;)V", "mMaskAuthorAvatar", "Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;", "getMMaskAuthorAvatar", "()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;", "setMMaskAuthorAvatar", "(Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;)V", "mMaskBtnContainer", "Landroid/widget/LinearLayout;", "getMMaskBtnContainer", "()Landroid/widget/LinearLayout;", "setMMaskBtnContainer", "(Landroid/widget/LinearLayout;)V", "mMaskDescTv", "getMMaskDescTv", "setMMaskDescTv", "mMobViewModel", "Lcom/ss/android/ugc/aweme/longvideo/viewmodel/LongVideoMobViewModel;", "getMMobViewModel", "()Lcom/ss/android/ugc/aweme/longvideo/viewmodel/LongVideoMobViewModel;", "setMMobViewModel", "(Lcom/ss/android/ugc/aweme/longvideo/viewmodel/LongVideoMobViewModel;)V", "mOperateContainer", "getMOperateContainer", "setMOperateContainer", "mPlayLoading", "Lcom/ss/android/ugc/aweme/feed/widget/LineProgressBar;", "getMPlayLoading", "()Lcom/ss/android/ugc/aweme/feed/widget/LineProgressBar;", "setMPlayLoading", "(Lcom/ss/android/ugc/aweme/feed/widget/LineProgressBar;)V", "mPlayViewsContainer", "getMPlayViewsContainer", "setMPlayViewsContainer", "mPosition", "mRootContainer", "getMRootContainer", "setMRootContainer", "mRootView", "Lcom/ss/android/ugc/aweme/longvideo/view/DoubleClickDiggFrameLayout;", "getMRootView", "()Lcom/ss/android/ugc/aweme/longvideo/view/DoubleClickDiggFrameLayout;", "setMRootView", "(Lcom/ss/android/ugc/aweme/longvideo/view/DoubleClickDiggFrameLayout;)V", "mShareView", "getMShareView", "setMShareView", "mToolContainer", "Landroid/widget/RelativeLayout;", "getMToolContainer", "()Landroid/widget/RelativeLayout;", "setMToolContainer", "(Landroid/widget/RelativeLayout;)V", "mVideoSeekBar", "Lcom/ss/android/ugc/aweme/longvideo/view/VideoPlaySeekBar;", "getMVideoSeekBar", "()Lcom/ss/android/ugc/aweme/longvideo/view/VideoPlaySeekBar;", "setMVideoSeekBar", "(Lcom/ss/android/ugc/aweme/longvideo/view/VideoPlaySeekBar;)V", "mVideoView", "getMVideoView", "setMVideoView", "mVideoViewComponent", "Lcom/ss/android/ugc/playerkit/videoview/VideoViewComponent;", "getMVideoViewComponent", "()Lcom/ss/android/ugc/playerkit/videoview/VideoViewComponent;", "setMVideoViewComponent", "(Lcom/ss/android/ugc/playerkit/videoview/VideoViewComponent;)V", "noOperationModeController", "Lcom/ss/android/ugc/aweme/longvideo/feature/NoOperateModeController;", "pageType", "getPageType", "setPageType", "getPlayerManager", "()Lcom/ss/android/ugc/aweme/video/PlayerManager;", "rootView", "getRootView", "setRootView", "screenSize", "Lcom/ss/android/ugc/aweme/longvideo/utils/Size;", "videoProvider", "Lcom/ss/android/ugc/aweme/longvideo/VideoProvider;", "getVideoProvider", "()Lcom/ss/android/ugc/aweme/longvideo/VideoProvider;", "setVideoProvider", "(Lcom/ss/android/ugc/aweme/longvideo/VideoProvider;)V", "autoShowMoreMask", "bindData", "", "id", "loftVideo", "position", "totalNum", "bindView", "clearMob", "enterNoOperationMode", "isMore", "exitNoOperationMode", "getAweme", "getEnterFrom", "eventV3", "getNavigationBarHeight", "getPosition", "getVideo", "Lcom/ss/android/ugc/aweme/feed/model/Video;", "hideGuide", "initBootomSheetBehavior", "view", "initMob", "initScreenSize", "onBackPressed", "onClick", "v", "onDestroyView", "onPlayCompleted", "onViewHolderSelected", "onViewHolderUnSelected", "postForbidScrollEvent", "forbidScroll", "postOperateEvent", "showGuide", "tryPause", "tryPlay", "updateLoftViews", "videoAnimation", "isIn", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements View.OnClickListener, a, com.ss.android.ugc.aweme.longvideo.a, NoOperateModeController.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39132a;
    @NotNull
    public DmtTextView A;
    @NotNull
    public DmtTextView B;
    @NotNull
    public View C;
    @NotNull
    public View D;
    @NotNull
    public View E;
    @Nullable
    public View F;
    @Nullable
    public View G;
    @Nullable
    public LineProgressBar H;
    @Nullable
    public AudioControlView I;
    @Nullable
    public DiggView J;
    @NotNull
    public String K = "discovery_second_floor";
    public int L;
    @NotNull
    public LongVideoPlayMob M;
    @Nullable
    public LongVideoMobViewModel N;
    @Nullable
    public j O;
    public NoOperateModeController P;
    public int Q;
    @NotNull
    public final View R;
    @NotNull
    public final FragmentActivity S;
    @NotNull
    public final o T;
    @NotNull
    public final com.ss.android.ugc.aweme.feed.d U;
    public final boolean V;
    private String W = "";
    private int X = -1;
    private boolean Y;
    private com.ss.android.ugc.aweme.longvideo.b.e Z = new com.ss.android.ugc.aweme.longvideo.b.e(0, 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public ImageView f39133b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public ImageView f39134c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commercialize.loft.model.j f39135d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public Aweme f39136e;

    /* renamed from: f  reason: collision with root package name */
    public CustomBottomSheetBehavior<View> f39137f;
    @NotNull
    public VideoViewComponent g;
    @NotNull
    public View h;
    @NotNull
    public VideoPlaySeekBar i;
    @NotNull
    public LoftVideoPlayView j;
    @NotNull
    public i k;
    @NotNull
    public LoftView l;
    @NotNull
    public LongVideoDiggAnimationView m;
    @NotNull
    public ImageView n;
    @NotNull
    public ImageView o;
    @NotNull
    public ImageView p;
    @NotNull
    public DoubleClickDiggFrameLayout q;
    @NotNull
    public AnimatedImageView r;
    @NotNull
    public FrameLayout s;
    @NotNull
    public View t;
    @NotNull
    public RelativeLayout u;
    @NotNull
    public FrameLayout v;
    @NotNull
    public com.ss.android.ugc.aweme.longvideo.h w;
    @NotNull
    public LinearLayout x;
    @NotNull
    public AvatarImageView y;
    @NotNull
    public DmtTextView z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/commercialize/loft/adapter/LoftVideoViewHolder$bindView$2", "Lcom/ss/android/ugc/aweme/commercialize/loft/LoftVideoPlayView$IPausePlayView;", "getView", "Landroid/view/View;", "onPause", "", "onPlay", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements LoftVideoPlayView.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39138a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f39139b;

        @NotNull
        public final View a() {
            if (!PatchProxy.isSupport(new Object[0], this, f39138a, false, 31224, new Class[0], View.class)) {
                return this.f39139b.i();
            }
            return (View) PatchProxy.accessDispatch(new Object[0], this, f39138a, false, 31224, new Class[0], View.class);
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f39138a, false, 31225, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39138a, false, 31225, new Class[0], Void.TYPE);
                return;
            }
            this.f39139b.i().setSelected(false);
        }

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f39138a, false, 31226, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39138a, false, 31226, new Class[0], Void.TYPE);
                return;
            }
            this.f39139b.i().setSelected(true);
        }

        a(b bVar) {
            this.f39139b = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/commercialize/loft/adapter/LoftVideoViewHolder$bindView$3", "Lcom/ss/android/ugc/aweme/longvideo/view/DoubleClickDiggFrameLayout$OnDiggListener;", "onClick", "", "onDoubleClickDigg", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.adapter.b$b  reason: collision with other inner class name */
    public static final class C0510b implements DoubleClickDiggFrameLayout.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39140a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f39141b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f39140a, false, 31227, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39140a, false, 31227, new Class[0], Void.TYPE);
                return;
            }
            DiggView diggView = this.f39141b.J;
            if (diggView != null) {
                diggView.a();
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f39140a, false, 31228, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39140a, false, 31228, new Class[0], Void.TYPE);
            } else if (b.a(this.f39141b).f3470d) {
                this.f39141b.l();
            } else {
                b.a(this.f39141b).a(0);
            }
        }

        C0510b(b bVar) {
            this.f39141b = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31229, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31229, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.n();
            this.this$0.e();
            this.this$0.b(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39142a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f39143b;

        d(b bVar) {
            this.f39143b = bVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f39142a, false, 31230, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39142a, false, 31230, new Class[0], Void.TYPE);
                return;
            }
            View view = this.f39143b.G;
            if (view != null) {
                view.setAlpha(1.0f);
            }
            View view2 = this.f39143b.G;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/commercialize/loft/adapter/LoftVideoViewHolder$initBootomSheetBehavior$1$1", "Landroid/support/design/widget/BottomSheetBehavior$BottomSheetCallback;", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e extends BottomSheetBehavior.BottomSheetCallback {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39144a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f39145b;

        e(b bVar) {
            this.f39145b = bVar;
        }

        public final void onStateChanged(@NotNull View view, int i) {
            View view2 = view;
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i)}, this, f39144a, false, 31231, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i)}, this, f39144a, false, 31231, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "bottomSheet");
            if (i2 == 1 || i2 == 5) {
                CustomBottomSheetBehavior<View> customBottomSheetBehavior = this.f39145b.f39137f;
                if (customBottomSheetBehavior != null) {
                    customBottomSheetBehavior.setState(4);
                }
            }
        }

        public final void onSlide(@NotNull View view, float f2) {
            if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2)}, this, f39144a, false, 31232, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2)}, this, f39144a, false, 31232, new Class[]{View.class, Float.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view, "bottomSheet");
            if (Float.isNaN(f2)) {
                this.f39145b.j().setAlpha(1.0f);
                this.f39145b.k().setAlpha(1.0f);
                return;
            }
            float abs = Math.abs(f2);
            if (abs > 0.0f && abs < 0.15f) {
                this.f39145b.k().setAlpha(1.0f - (abs / 0.15f));
            }
            if (abs > 0.15f) {
                this.f39145b.j().setAlpha(1.0f - ((abs - 0.15f) / 0.85f));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/commercialize/loft/adapter/LoftVideoViewHolder$initBootomSheetBehavior$2", "Lcom/ss/android/ugc/aweme/longvideo/view/CustomBottomSheetBehavior$OnTouchEventCallBack;", "onTouchEvent", "", "parent", "Landroid/support/design/widget/CoordinatorLayout;", "child", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class f implements CustomBottomSheetBehavior.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39146a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f39147b;

        f(b bVar) {
            this.f39147b = bVar;
        }

        public final void a(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, @NotNull MotionEvent motionEvent) {
            DoubleClickDiggFrameLayout doubleClickDiggFrameLayout;
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            View view2 = view;
            MotionEvent motionEvent2 = motionEvent;
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, view2, motionEvent2}, this, f39146a, false, 31233, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, view2, motionEvent2}, this, f39146a, false, 31233, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(coordinatorLayout2, "parent");
            Intrinsics.checkParameterIsNotNull(view2, "child");
            Intrinsics.checkParameterIsNotNull(motionEvent2, "event");
            b bVar = this.f39147b;
            if (PatchProxy.isSupport(new Object[0], bVar, b.f39132a, false, 31166, new Class[0], DoubleClickDiggFrameLayout.class)) {
                doubleClickDiggFrameLayout = (DoubleClickDiggFrameLayout) PatchProxy.accessDispatch(new Object[0], bVar, b.f39132a, false, 31166, new Class[0], DoubleClickDiggFrameLayout.class);
            } else {
                doubleClickDiggFrameLayout = bVar.q;
                if (doubleClickDiggFrameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRootView");
                }
            }
            doubleClickDiggFrameLayout.a(motionEvent2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39148a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f39149b;

        g(b bVar) {
            this.f39149b = bVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f39148a, false, 31234, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39148a, false, 31234, new Class[0], Void.TYPE);
                return;
            }
            this.f39149b.a(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/commercialize/loft/adapter/LoftVideoViewHolder$videoAnimation$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39150a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f39151b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f39152c;

        public final void onAnimationEnd(@NotNull Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f39150a, false, 31235, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f39150a, false, 31235, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            super.onAnimationEnd(animator);
            if (!this.f39152c) {
                FragmentActivity fragmentActivity = this.f39151b.S;
                if (fragmentActivity != null) {
                    fragmentActivity.finish();
                }
            }
        }

        h(b bVar, boolean z) {
            this.f39151b = bVar;
            this.f39152c = z;
        }
    }

    public final int c() {
        return this.X;
    }

    private final int p() {
        if (PatchProxy.isSupport(new Object[0], this, f39132a, false, 31211, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f39132a, false, 31211, new Class[0], Integer.TYPE)).intValue();
        }
        Resources resources = this.S.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    @Nullable
    public final Aweme d() {
        if (PatchProxy.isSupport(new Object[0], this, f39132a, false, 31219, new Class[0], Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[0], this, f39132a, false, 31219, new Class[0], Aweme.class);
        }
        Aweme aweme = this.f39136e;
        if (aweme == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAweme");
        }
        return aweme;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f39132a, false, 31135, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39132a, false, 31135, new Class[0], Void.TYPE);
            return;
        }
        View view = this.E;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoftGuideLL");
        }
        view.setVisibility(8);
    }

    @NotNull
    public final ImageView i() {
        if (PatchProxy.isSupport(new Object[0], this, f39132a, false, 31138, new Class[0], ImageView.class)) {
            return (ImageView) PatchProxy.accessDispatch(new Object[0], this, f39132a, false, 31138, new Class[0], ImageView.class);
        }
        ImageView imageView = this.f39133b;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvPlay");
        }
        return imageView;
    }

    @NotNull
    public final View j() {
        if (PatchProxy.isSupport(new Object[0], this, f39132a, false, 31172, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f39132a, false, 31172, new Class[0], View.class);
        }
        View view = this.t;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBgContainer");
        }
        return view;
    }

    @NotNull
    public final RelativeLayout k() {
        if (PatchProxy.isSupport(new Object[0], this, f39132a, false, 31174, new Class[0], RelativeLayout.class)) {
            return (RelativeLayout) PatchProxy.accessDispatch(new Object[0], this, f39132a, false, 31174, new Class[0], RelativeLayout.class);
        }
        RelativeLayout relativeLayout = this.u;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mToolContainer");
        }
        return relativeLayout;
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f39132a, false, 31206, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39132a, false, 31206, new Class[0], Void.TYPE);
            return;
        }
        bg.a(new com.ss.android.ugc.aweme.longvideo.a.a());
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f39132a, false, 31207, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39132a, false, 31207, new Class[0], Void.TYPE);
            return;
        }
        c(false);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f39132a, false, 31220, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39132a, false, 31220, new Class[0], Void.TYPE);
            return;
        }
        View view = this.E;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoftGuideLL");
        }
        if (view.getVisibility() != 0) {
            com.ss.android.ugc.aweme.commercialize.loft.model.j jVar = this.f39135d;
            if (jVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoftVideo");
            }
            if (jVar.getMore() != null) {
                LoftView loftView = this.l;
                if (loftView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLoftView");
                }
                if (loftView.a()) {
                    return;
                }
            }
            LoftVideoPlayView loftVideoPlayView = this.j;
            if (loftVideoPlayView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLongVideoPlayView");
            }
            loftVideoPlayView.d();
            NoOperateModeController noOperateModeController = this.P;
            if (noOperateModeController == null) {
                Intrinsics.throwUninitializedPropertyAccessException("noOperationModeController");
            }
            noOperateModeController.a(5000);
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f39132a, false, 31134, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39132a, false, 31134, new Class[0], Void.TYPE);
            return;
        }
        LoftVideoPlayView loftVideoPlayView = this.j;
        if (loftVideoPlayView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLongVideoPlayView");
        }
        if (PatchProxy.isSupport(new Object[0], loftVideoPlayView, LoftVideoPlayView.f2908a, false, 31090, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], loftVideoPlayView, LoftVideoPlayView.f2908a, false, 31090, new Class[0], Void.TYPE);
        } else {
            loftVideoPlayView.f();
            loftVideoPlayView.a();
        }
        NoOperateModeController noOperateModeController = this.P;
        if (noOperateModeController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("noOperationModeController");
        }
        noOperateModeController.a();
    }

    public final void h() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f39132a, false, 31223, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39132a, false, 31223, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", this.K);
        Aweme aweme = this.f39136e;
        if (aweme == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAweme");
        }
        String str2 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        com.ss.android.ugc.aweme.app.d.d a3 = a2.a("group_id", str);
        Aweme aweme2 = this.f39136e;
        if (aweme2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAweme");
        }
        if (aweme2 != null) {
            User author = aweme2.getAuthor();
            if (author != null) {
                str2 = author.getUid();
            }
        }
        r.a("close_video", (Map) a3.a("author_id", str2).a("is_long_item", this.Q).f34114b);
    }

    public final void o() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f39132a, false, 31214, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39132a, false, 31214, new Class[0], Void.TYPE);
        } else if (!this.Y) {
            ImageView imageView = this.f39134c;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIvClose");
            }
            imageView.setVisibility(0);
            NoOperateModeController noOperateModeController = this.P;
            if (noOperateModeController == null) {
                Intrinsics.throwUninitializedPropertyAccessException("noOperationModeController");
            }
            noOperateModeController.f3470d = false;
            if (PatchProxy.isSupport(new Object[0], this, f39132a, false, 31216, new Class[0], Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f39132a, false, 31216, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                com.ss.android.ugc.aweme.commercialize.loft.model.j jVar = this.f39135d;
                if (jVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLoftVideo");
                }
                k more = jVar.getMore();
                if (more != null && more.getWithAutoMask()) {
                    LoftView loftView = this.l;
                    if (loftView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mLoftView");
                    }
                    if (!loftView.a() && !n.a(this.S.getSupportFragmentManager()) && !this.U.i()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                LoftView loftView2 = this.l;
                if (loftView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLoftView");
                }
                loftView2.a(true, "auto");
                b(true);
                c(true);
            } else {
                LoftView loftView3 = this.l;
                if (loftView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLoftView");
                }
                if (!loftView3.a()) {
                    n();
                }
            }
            LoftView loftView4 = this.l;
            if (loftView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoftView");
            }
            if (loftView4.a()) {
                ImageView imageView2 = this.p;
                if (imageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mIvReplay");
                }
                imageView2.setVisibility(8);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0072, code lost:
        if (r3 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009a, code lost:
        if (r2 == null) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r16 = this;
            r7 = r16
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f39132a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 31217(0x79f1, float:4.3744E-41)
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0027
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f39132a
            r3 = 0
            r4 = 31217(0x79f1, float:4.3744E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0027:
            com.ss.android.ugc.aweme.commercialize.loft.half.LoftView r0 = r7.l
            if (r0 != 0) goto L_0x0030
            java.lang.String r1 = "mLoftView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0030:
            r0.b()
            com.ss.android.ugc.aweme.commercialize.loft.model.j r0 = r7.f39135d
            if (r0 != 0) goto L_0x003c
            java.lang.String r1 = "mLoftVideo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x003c:
            com.ss.android.ugc.aweme.commercialize.loft.model.k r0 = r0.getMore()
            if (r0 == 0) goto L_0x00f9
            java.lang.String r0 = r0.getSchema()
            if (r0 == 0) goto L_0x00f9
            com.ss.android.ugc.aweme.commercialize.loft.half.LoftView r1 = r7.l
            if (r1 != 0) goto L_0x0051
            java.lang.String r2 = "mLoftView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0051:
            com.ss.android.ugc.aweme.music.util.f$a r0 = com.ss.android.ugc.aweme.music.util.f.a(r0)
            java.lang.String r2 = "activity_id"
            java.lang.String r3 = r7.W
            com.ss.android.ugc.aweme.music.util.f$a r0 = r0.a(r2, r3)
            java.lang.String r2 = "item_id"
            com.ss.android.ugc.aweme.commercialize.loft.model.j r3 = r7.f39135d
            if (r3 != 0) goto L_0x0068
            java.lang.String r4 = "mLoftVideo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x0068:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.getAweme()
            if (r3 == 0) goto L_0x0074
            java.lang.String r3 = r3.getAid()
            if (r3 != 0) goto L_0x0076
        L_0x0074:
            java.lang.String r3 = ""
        L_0x0076:
            com.ss.android.ugc.aweme.music.util.f$a r0 = r0.a(r2, r3)
            android.net.Uri r0 = r0.a()
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "SchemeHelper.parseRnSche…              .toString()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            com.ss.android.ugc.aweme.commercialize.loft.model.j r2 = r7.f39135d
            if (r2 != 0) goto L_0x0090
            java.lang.String r3 = "mLoftVideo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0090:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.getAweme()
            if (r2 == 0) goto L_0x009c
            java.lang.String r2 = r2.getAid()
            if (r2 != 0) goto L_0x009e
        L_0x009c:
            java.lang.String r2 = ""
        L_0x009e:
            r3 = 2
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r8] = r0
            r4 = 1
            r9[r4] = r2
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.commercialize.loft.half.LoftView.f2914a
            r12 = 0
            r13 = 31270(0x7a26, float:4.3819E-41)
            java.lang.Class[] r14 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r14[r8] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r14[r4] = r5
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r1
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r5 == 0) goto L_0x00da
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r8] = r0
            r9[r4] = r2
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.commercialize.loft.half.LoftView.f2914a
            r12 = 0
            r13 = 31270(0x7a26, float:4.3819E-41)
            java.lang.Class[] r14 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r14[r8] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r14[r4] = r0
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x00f9
        L_0x00da:
            java.lang.String r3 = "url"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r3)
            java.lang.String r3 = "itemId"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r3)
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00f9
            r1.f2916c = r2
            com.ss.android.ugc.aweme.commercialize.loft.half.LoftView$d r2 = new com.ss.android.ugc.aweme.commercialize.loft.half.LoftView$d
            r2.<init>(r1, r0)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r1.post(r2)
        L_0x00f9:
            r16.e()
            r16.n()
            r7.b(r8)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f39132a
            r3 = 0
            r4 = 31221(0x79f5, float:4.375E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0126
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f39132a
            r3 = 0
            r4 = 31221(0x79f5, float:4.375E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0126:
            com.ss.android.ugc.aweme.longvideo.b.a$a r8 = com.ss.android.ugc.aweme.longvideo.b.a.f53877b
            android.support.v4.app.FragmentActivity r9 = r7.S
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = r7.f39136e
            if (r10 != 0) goto L_0x0133
            java.lang.String r0 = "mAweme"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L_0x0133:
            java.lang.String r11 = r7.K
            int r12 = r7.L
            int r13 = r7.Q
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r0 = r8.a(r9, r10, r11, r12, r13)
            r7.N = r0
            com.ss.android.ugc.aweme.longvideo.feature.LongVideoPlayMob r0 = new com.ss.android.ugc.aweme.longvideo.feature.LongVideoPlayMob
            android.support.v4.app.FragmentActivity r1 = r7.S
            com.ss.android.ugc.aweme.video.o r2 = r7.T
            r0.<init>(r1, r2)
            r7.M = r0
            com.ss.android.ugc.aweme.longvideo.DiggView r0 = r7.J
            if (r0 == 0) goto L_0x015c
            com.ss.android.ugc.aweme.longvideo.feature.LongVideoPlayMob r1 = r7.M
            if (r1 != 0) goto L_0x0157
            java.lang.String r2 = "mLongVideoPlayMob"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0157:
            com.ss.android.ugc.aweme.longvideo.DiggView$a r1 = (com.ss.android.ugc.aweme.longvideo.DiggView.a) r1
            r0.a((com.ss.android.ugc.aweme.longvideo.DiggView.a) r1)
        L_0x015c:
            com.ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView r0 = r7.j
            if (r0 != 0) goto L_0x0165
            java.lang.String r1 = "mLongVideoPlayView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0165:
            com.ss.android.ugc.aweme.longvideo.feature.LongVideoPlayMob r1 = r7.M
            if (r1 != 0) goto L_0x016e
            java.lang.String r2 = "mLongVideoPlayMob"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x016e:
            com.ss.android.ugc.aweme.video.a.a r1 = (com.ss.android.ugc.aweme.video.a.a) r1
            r0.a((com.ss.android.ugc.aweme.video.a.a) r1)
            com.ss.android.ugc.aweme.longvideo.i r0 = r7.k
            if (r0 != 0) goto L_0x017c
            java.lang.String r1 = "mLongVideoSeekView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x017c:
            com.ss.android.ugc.aweme.longvideo.feature.LongVideoPlayMob r1 = r7.M
            if (r1 != 0) goto L_0x0185
            java.lang.String r2 = "mLongVideoPlayMob"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0185:
            android.widget.SeekBar$OnSeekBarChangeListener r1 = (android.widget.SeekBar.OnSeekBarChangeListener) r1
            r0.a((android.widget.SeekBar.OnSeekBarChangeListener) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.loft.adapter.b.a():void");
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f39132a, false, 31218, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39132a, false, 31218, new Class[0], Void.TYPE);
            return;
        }
        LoftVideoPlayView loftVideoPlayView = this.j;
        if (loftVideoPlayView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLongVideoPlayView");
        }
        if (PatchProxy.isSupport(new Object[0], loftVideoPlayView, LoftVideoPlayView.f2908a, false, 31113, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], loftVideoPlayView, LoftVideoPlayView.f2908a, false, 31113, new Class[0], Void.TYPE);
        } else {
            loftVideoPlayView.k = false;
            int i2 = loftVideoPlayView.f2910c.f45077a;
            if (i2 != 4) {
                switch (i2) {
                    case 1:
                    case 2:
                        break;
                }
            }
            loftVideoPlayView.p.b(loftVideoPlayView.m);
            loftVideoPlayView.p.U();
            loftVideoPlayView.p.a();
            loftVideoPlayView.f2910c.f45077a = 0;
            if (!o.v()) {
                loftVideoPlayView.s.u();
            } else {
                com.ss.android.ugc.aweme.newfollow.util.i iVar = loftVideoPlayView.f2909b;
                if (iVar != null) {
                    iVar.o();
                }
            }
            try {
                loftVideoPlayView.s.g();
                loftVideoPlayView.s.n();
            } catch (Throwable unused) {
            }
            loftVideoPlayView.a();
        }
        NoOperateModeController noOperateModeController = this.P;
        if (noOperateModeController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("noOperationModeController");
        }
        noOperateModeController.a();
        View view = this.E;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoftGuideLL");
        }
        view.setVisibility(8);
        n();
        if (PatchProxy.isSupport(new Object[0], this, f39132a, false, 31222, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39132a, false, 31222, new Class[0], Void.TYPE);
            return;
        }
        DiggView diggView = this.J;
        if (diggView != null) {
            LongVideoPlayMob longVideoPlayMob = this.M;
            if (longVideoPlayMob == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLongVideoPlayMob");
            }
            DiggView.a aVar = longVideoPlayMob;
            if (PatchProxy.isSupport(new Object[]{aVar}, diggView, DiggView.f3446a, false, 56524, new Class[]{DiggView.a.class}, Void.TYPE)) {
                DiggView diggView2 = diggView;
                PatchProxy.accessDispatch(new Object[]{aVar}, diggView2, DiggView.f3446a, false, 56524, new Class[]{DiggView.a.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(aVar, "diggCallback");
                diggView.f3448c.remove(aVar);
            }
        }
        LoftVideoPlayView loftVideoPlayView2 = this.j;
        if (loftVideoPlayView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLongVideoPlayView");
        }
        LongVideoPlayMob longVideoPlayMob2 = this.M;
        if (longVideoPlayMob2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLongVideoPlayMob");
        }
        com.ss.android.ugc.aweme.video.a.a aVar2 = longVideoPlayMob2;
        if (PatchProxy.isSupport(new Object[]{aVar2}, loftVideoPlayView2, LoftVideoPlayView.f2908a, false, 31095, new Class[]{com.ss.android.ugc.aweme.video.a.a.class}, Void.TYPE)) {
            LoftVideoPlayView loftVideoPlayView3 = loftVideoPlayView2;
            PatchProxy.accessDispatch(new Object[]{aVar2}, loftVideoPlayView3, LoftVideoPlayView.f2908a, false, 31095, new Class[]{com.ss.android.ugc.aweme.video.a.a.class}, Void.TYPE);
            return;
        }
        if (aVar2 != null && loftVideoPlayView2.f2913f.contains(aVar2)) {
            loftVideoPlayView2.f2913f.remove(aVar2);
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f39132a, false, 31209, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39132a, false, 31209, new Class[0], Void.TYPE);
            return;
        }
        LoftView loftView = this.l;
        if (loftView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoftView");
        }
        if (!loftView.a()) {
            View view = this.D;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoftMaskBottom");
            }
            view.setVisibility(0);
            View view2 = this.C;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoftMaskTop");
            }
            view2.setVisibility(0);
            ImageView imageView = this.f39134c;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIvClose");
            }
            ViewPropertyAnimator animate = imageView.animate();
            if (animate != null) {
                ViewPropertyAnimator alpha = animate.alpha(1.0f);
                if (alpha != null) {
                    ViewPropertyAnimator duration = alpha.setDuration(200);
                    if (duration != null) {
                        duration.start();
                    }
                }
            }
            DmtTextView dmtTextView = this.A;
            if (dmtTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoftTitleTv");
            }
            ViewPropertyAnimator animate2 = dmtTextView.animate();
            if (animate2 != null) {
                ViewPropertyAnimator alpha2 = animate2.alpha(1.0f);
                if (alpha2 != null) {
                    ViewPropertyAnimator duration2 = alpha2.setDuration(200);
                    if (duration2 != null) {
                        duration2.start();
                    }
                }
            }
            DmtTextView dmtTextView2 = this.B;
            if (dmtTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoftNumTv");
            }
            ViewPropertyAnimator animate3 = dmtTextView2.animate();
            if (animate3 != null) {
                ViewPropertyAnimator alpha3 = animate3.alpha(1.0f);
                if (alpha3 != null) {
                    ViewPropertyAnimator duration3 = alpha3.setDuration(200);
                    if (duration3 != null) {
                        duration3.start();
                    }
                }
            }
            View view3 = this.F;
            if (view3 != null) {
                ViewPropertyAnimator animate4 = view3.animate();
                if (animate4 != null) {
                    ViewPropertyAnimator alpha4 = animate4.alpha(1.0f);
                    if (alpha4 != null) {
                        ViewPropertyAnimator duration4 = alpha4.setDuration(200);
                        if (duration4 != null) {
                            duration4.start();
                        }
                    }
                }
            }
            View view4 = this.G;
            if (view4 != null) {
                view4.setVisibility(0);
            }
            View view5 = this.G;
            if (view5 != null) {
                view5.setAlpha(0.0f);
            }
            View view6 = this.G;
            if (view6 != null) {
                ViewPropertyAnimator animate5 = view6.animate();
                if (animate5 != null) {
                    ViewPropertyAnimator alpha5 = animate5.alpha(1.0f);
                    if (alpha5 != null) {
                        ViewPropertyAnimator duration5 = alpha5.setDuration(200);
                        if (duration5 != null) {
                            duration5.start();
                        }
                    }
                }
            }
            com.ss.android.ugc.aweme.commercialize.loft.model.j jVar = this.f39135d;
            if (jVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoftVideo");
            }
            if (jVar.getMore() != null) {
                LinearLayout linearLayout = this.x;
                if (linearLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMaskBtnContainer");
                }
                ViewPropertyAnimator animate6 = linearLayout.animate();
                if (animate6 != null) {
                    ViewPropertyAnimator alpha6 = animate6.alpha(1.0f);
                    if (alpha6 != null) {
                        ViewPropertyAnimator duration6 = alpha6.setDuration(200);
                        if (duration6 != null) {
                            duration6.start();
                        }
                    }
                }
            }
        }
    }

    public static final /* synthetic */ NoOperateModeController a(b bVar) {
        NoOperateModeController noOperateModeController = bVar.P;
        if (noOperateModeController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("noOperationModeController");
        }
        return noOperateModeController;
    }

    public final void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f39132a, false, 31215, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f39132a, false, 31215, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.commercialize.loft.a.a aVar = new com.ss.android.ugc.aweme.commercialize.loft.a.a();
        aVar.f39125a = z2;
        bg.a(aVar);
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f39132a, false, 31213, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f39132a, false, 31213, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        float f2 = 0.0f;
        if (z2) {
            View view = this.t;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBgContainer");
            }
            view.setAlpha(0.0f);
            FrameLayout frameLayout = this.v;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootContainer");
            }
            frameLayout.setAlpha(0.0f);
            RelativeLayout relativeLayout = this.u;
            if (relativeLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mToolContainer");
            }
            relativeLayout.setAlpha(0.0f);
        }
        float f3 = 1.0f;
        if (!z2) {
            f2 = 1.0f;
            f3 = 0.0f;
        }
        View view2 = this.t;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBgContainer");
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(view2, "alpha", new float[]{f2, f3}).setDuration(250);
        FrameLayout frameLayout2 = this.v;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootContainer");
        }
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(frameLayout2, "alpha", new float[]{f2, f3}).setDuration(250);
        RelativeLayout relativeLayout2 = this.u;
        if (relativeLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mToolContainer");
        }
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(relativeLayout2, "alpha", new float[]{f2, f3}).setDuration(250);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(duration).with(duration2).with(duration3);
        animatorSet.start();
        animatorSet.addListener(new h(this, z2));
    }

    private final void c(boolean z2) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f39132a, false, 31208, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f39132a, false, 31208, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ImageView imageView = this.f39134c;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvClose");
        }
        float f3 = 0.0f;
        imageView.animate().alpha(0.0f).setDuration(200).start();
        DmtTextView dmtTextView = this.A;
        if (dmtTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoftTitleTv");
        }
        dmtTextView.animate().alpha(0.0f).setDuration(200).start();
        DmtTextView dmtTextView2 = this.B;
        if (dmtTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoftNumTv");
        }
        dmtTextView2.animate().alpha(0.0f).setDuration(200).start();
        View view = this.G;
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            if (animate != null) {
                ViewPropertyAnimator alpha = animate.alpha(0.0f);
                if (alpha != null) {
                    ViewPropertyAnimator duration = alpha.setDuration(200);
                    if (duration != null) {
                        ViewPropertyAnimator withEndAction = duration.withEndAction(new d(this));
                        if (withEndAction != null) {
                            withEndAction.start();
                        }
                    }
                }
            }
        }
        View view2 = this.F;
        if (view2 != null) {
            ViewPropertyAnimator animate2 = view2.animate();
            if (animate2 != null) {
                if (z2) {
                    f2 = 0.0f;
                } else {
                    f2 = 0.34f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f2);
                if (alpha2 != null) {
                    ViewPropertyAnimator duration2 = alpha2.setDuration(200);
                    if (duration2 != null) {
                        duration2.start();
                    }
                }
            }
        }
        com.ss.android.ugc.aweme.commercialize.loft.model.j jVar = this.f39135d;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoftVideo");
        }
        if (jVar.getMore() != null) {
            LinearLayout linearLayout = this.x;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMaskBtnContainer");
            }
            ViewPropertyAnimator animate3 = linearLayout.animate();
            if (animate3 != null) {
                if (!z2) {
                    f3 = 0.34f;
                }
                ViewPropertyAnimator alpha3 = animate3.alpha(f3);
                if (alpha3 != null) {
                    ViewPropertyAnimator duration3 = alpha3.setDuration(200);
                    if (duration3 != null) {
                        duration3.start();
                    }
                }
            }
        }
        if (z2) {
            View view3 = this.D;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoftMaskBottom");
            }
            view3.setVisibility(8);
            View view4 = this.C;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoftMaskTop");
            }
            view4.setVisibility(8);
        }
    }

    public final void onClick(@Nullable View view) {
        Integer num;
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f39132a, false, 31205, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f39132a, false, 31205, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        l();
        String str2 = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C0906R.id.azy) {
            if (PatchProxy.isSupport(new Object[0], this, f39132a, false, 31212, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39132a, false, 31212, new Class[0], Void.TYPE);
            } else {
                if (!this.V) {
                    FragmentActivity fragmentActivity = this.S;
                    if (fragmentActivity != null) {
                        fragmentActivity.finish();
                    }
                    FragmentActivity fragmentActivity2 = this.S;
                    if (fragmentActivity2 != null) {
                        fragmentActivity2.overridePendingTransition(ActivityTransUtils.SLIDE_IN_LEFT_NORMAL, ActivityTransUtils.SLIDE_OUT_RIGHT_NORMAL);
                    }
                } else if (!this.Y) {
                    a(false);
                }
            }
        } else if (num != null && num.intValue() == C0906R.id.b02) {
            com.ss.android.ugc.aweme.feed.d dVar = this.U;
            Aweme aweme = this.f39136e;
            if (aweme == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAweme");
            }
            dVar.a(new a.C0457a(aweme).a());
        } else if (num != null && num.intValue() == C0906R.id.b54) {
            com.ss.android.ugc.aweme.feed.d dVar2 = this.U;
            Aweme aweme2 = this.f39136e;
            if (aweme2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAweme");
            }
            dVar2.a((Activity) null, aweme2);
            Aweme aweme3 = this.f39136e;
            if (aweme3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAweme");
            }
            if (aweme3 != null) {
                new com.ss.android.ugc.aweme.u.h().e(this.K).f(this.K).f(aweme3).i(aa.a(aweme3)).a(this.Q).e();
            }
        } else if (num == null || num.intValue() != C0906R.id.b5t) {
            if (num != null && num.intValue() == C0906R.id.blu) {
                c(true);
                LoftView loftView = this.l;
                if (loftView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLoftView");
                }
                loftView.a(false, "click");
                b(true);
                com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", this.K);
                Aweme aweme4 = this.f39136e;
                if (aweme4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAweme");
                }
                if (aweme4 != null) {
                    str = aweme4.getAid();
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.app.d.d a3 = a2.a("group_id", str);
                Aweme aweme5 = this.f39136e;
                if (aweme5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAweme");
                }
                if (aweme5 != null) {
                    User author = aweme5.getAuthor();
                    if (author != null) {
                        str2 = author.getUid();
                    }
                }
                r.a("click_more_trans_entrance", (Map) a3.a("author_id", str2).a("is_long_item", this.Q).f34114b);
            } else if (num != null && num.intValue() == C0906R.id.bkc) {
                View view2 = this.E;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLoftGuideLL");
                }
                view2.setVisibility(8);
                e();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0353, code lost:
        if (r1 != null) goto L_0x0358;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable java.lang.String r28, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.commercialize.loft.model.j r29, int r30, int r31) {
        /*
            r27 = this;
            r7 = r27
            r9 = r29
            r10 = r30
            r11 = 4
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r12 = 0
            r0[r12] = r28
            r13 = 1
            r0[r13] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r30)
            r14 = 2
            r0[r14] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r31)
            r15 = 3
            r0[r15] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f39132a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.loft.model.j> r1 = com.ss.android.ugc.aweme.commercialize.loft.model.j.class
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r15] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 31201(0x79e1, float:4.3722E-41)
            r1 = r27
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x006f
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r28
            r0[r13] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r30)
            r0[r14] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r31)
            r0[r15] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f39132a
            r3 = 0
            r4 = 31201(0x79e1, float:4.3722E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.loft.model.j> r1 = com.ss.android.ugc.aweme.commercialize.loft.model.j.class
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r15] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r27
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x006f:
            java.lang.String r0 = "loftVideo"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
            if (r28 != 0) goto L_0x0079
            java.lang.String r0 = ""
            goto L_0x007b
        L_0x0079:
            r0 = r28
        L_0x007b:
            r7.W = r0
            r7.f39135d = r9
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r29.getAweme()
            if (r0 != 0) goto L_0x0088
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0088:
            r7.f39136e = r0
            r7.X = r10
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f39136e
            if (r0 != 0) goto L_0x0095
            java.lang.String r1 = "mAweme"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0095:
            java.util.List r0 = r0.getLongVideos()
            if (r0 != 0) goto L_0x009d
            r0 = 0
            goto L_0x009e
        L_0x009d:
            r0 = 1
        L_0x009e:
            r7.Q = r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f39136e
            if (r0 != 0) goto L_0x00a9
            java.lang.String r1 = "mAweme"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00a9:
            java.util.List r0 = r0.getLongVideos()
            if (r0 != 0) goto L_0x00b2
            com.ss.android.ugc.aweme.longvideo.j r0 = com.ss.android.ugc.aweme.longvideo.j.f53965a
            goto L_0x00b4
        L_0x00b2:
            com.ss.android.ugc.aweme.longvideo.j r0 = com.ss.android.ugc.aweme.longvideo.j.f53966b
        L_0x00b4:
            r7.O = r0
            android.support.v4.app.FragmentActivity r0 = r7.S
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = com.bytedance.common.utility.NetworkUtils.isNetworkAvailable(r0)
            if (r0 != 0) goto L_0x00ca
            android.support.v4.app.FragmentActivity r0 = r7.S
            android.content.Context r0 = (android.content.Context) r0
            r1 = 2131561431(0x7f0d0bd7, float:1.8748262E38)
            com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r1)
        L_0x00ca:
            com.ss.android.ugc.aweme.longvideo.b.d$a r15 = com.ss.android.ugc.aweme.longvideo.b.d.f53893a
            android.support.v4.app.FragmentActivity r0 = r7.S
            r16 = r0
            android.app.Activity r16 = (android.app.Activity) r16
            android.view.View r0 = r7.h
            if (r0 != 0) goto L_0x00db
            java.lang.String r1 = "mVideoView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00db:
            android.widget.FrameLayout r1 = r7.s
            if (r1 != 0) goto L_0x00e4
            java.lang.String r2 = "coverContainer"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x00e4:
            r18 = r1
            android.view.View r18 = (android.view.View) r18
            com.ss.android.ugc.aweme.longvideo.j r1 = r7.O
            r8 = 0
            if (r1 == 0) goto L_0x00fd
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.f39136e
            if (r2 != 0) goto L_0x00f6
            java.lang.String r3 = "mAweme"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x00f6:
            com.ss.android.ugc.aweme.feed.model.Video r1 = r1.a(r2)
            r19 = r1
            goto L_0x00ff
        L_0x00fd:
            r19 = r8
        L_0x00ff:
            com.ss.android.ugc.aweme.longvideo.b.e r1 = r7.Z
            boolean r2 = r7.Y
            r17 = r0
            r20 = r1
            r21 = r2
            r15.a((android.app.Activity) r16, (android.view.View) r17, (android.view.View) r18, (com.ss.android.ugc.aweme.feed.model.Video) r19, (com.ss.android.ugc.aweme.longvideo.b.e) r20, (boolean) r21)
            com.ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView r0 = r7.j
            if (r0 != 0) goto L_0x0115
            java.lang.String r1 = "mLongVideoPlayView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0115:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f39136e
            if (r1 != 0) goto L_0x011e
            java.lang.String r2 = "mAweme"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x011e:
            com.ss.android.ugc.aweme.longvideo.j r2 = r7.O
            java.lang.Object[] r3 = new java.lang.Object[r14]
            r3[r12] = r1
            r3[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r22 = com.ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView.f2908a
            r23 = 0
            r24 = 31088(0x7970, float:4.3564E-41)
            java.lang.Class[] r4 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r5 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r4[r12] = r5
            java.lang.Class<com.ss.android.ugc.aweme.longvideo.j> r5 = com.ss.android.ugc.aweme.longvideo.j.class
            r4[r13] = r5
            java.lang.Class r26 = java.lang.Void.TYPE
            r20 = r3
            r21 = r0
            r25 = r4
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r20, r21, r22, r23, r24, r25, r26)
            if (r3 == 0) goto L_0x0167
            java.lang.Object[] r3 = new java.lang.Object[r14]
            r3[r12] = r1
            r3[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r22 = com.ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView.f2908a
            r23 = 0
            r24 = 31088(0x7970, float:4.3564E-41)
            java.lang.Class[] r1 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r12] = r2
            java.lang.Class<com.ss.android.ugc.aweme.longvideo.j> r2 = com.ss.android.ugc.aweme.longvideo.j.class
            r1[r13] = r2
            java.lang.Class r26 = java.lang.Void.TYPE
            r20 = r3
            r21 = r0
            r25 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r20, r21, r22, r23, r24, r25, r26)
            goto L_0x01ee
        L_0x0167:
            java.lang.Object[] r3 = new java.lang.Object[r14]
            r3[r12] = r1
            r3[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r22 = com.ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView.f2908a
            r23 = 0
            r24 = 31110(0x7986, float:4.3594E-41)
            java.lang.Class[] r4 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r5 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r4[r12] = r5
            java.lang.Class<com.ss.android.ugc.aweme.longvideo.j> r5 = com.ss.android.ugc.aweme.longvideo.j.class
            r4[r13] = r5
            java.lang.Class r26 = java.lang.Void.TYPE
            r20 = r3
            r21 = r0
            r25 = r4
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r20, r21, r22, r23, r24, r25, r26)
            if (r3 == 0) goto L_0x01ad
            java.lang.Object[] r3 = new java.lang.Object[r14]
            r3[r12] = r1
            r3[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r22 = com.ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView.f2908a
            r23 = 0
            r24 = 31110(0x7986, float:4.3594E-41)
            java.lang.Class[] r4 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r5 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r4[r12] = r5
            java.lang.Class<com.ss.android.ugc.aweme.longvideo.j> r5 = com.ss.android.ugc.aweme.longvideo.j.class
            r4[r13] = r5
            java.lang.Class r26 = java.lang.Void.TYPE
            r20 = r3
            r21 = r0
            r25 = r4
            com.meituan.robust.PatchProxy.accessDispatch(r20, r21, r22, r23, r24, r25, r26)
            goto L_0x01d9
        L_0x01ad:
            r0.h = r1
            com.ss.android.ugc.aweme.newfollow.util.i r3 = new com.ss.android.ugc.aweme.newfollow.util.i
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r4 = r0.p
            r5 = r0
            com.ss.android.ugc.aweme.video.a.a r5 = (com.ss.android.ugc.aweme.video.a.a) r5
            r3.<init>((com.ss.android.ugc.playerkit.videoview.VideoViewComponent) r4, (com.ss.android.ugc.aweme.video.a.a) r5, (com.ss.android.ugc.aweme.feed.d) r8, (com.ss.android.ugc.aweme.longvideo.j) r2)
            r0.f2909b = r3
            boolean r3 = com.ss.android.ugc.aweme.video.o.v()
            if (r3 != 0) goto L_0x01c9
            com.ss.android.ugc.aweme.newfollow.util.i r3 = r0.f2909b
            if (r3 == 0) goto L_0x01c9
            com.ss.android.ugc.aweme.video.o r4 = r0.s
            r3.f57422c = r4
        L_0x01c9:
            com.ss.android.ugc.aweme.newfollow.util.i r3 = r0.f2909b
            if (r3 == 0) goto L_0x01d2
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r0.h
            r3.a((com.ss.android.ugc.aweme.feed.model.Aweme) r4)
        L_0x01d2:
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r3 = r0.p
            com.ss.android.ugc.playerkit.videoview.i r4 = r0.m
            r3.a((com.ss.android.ugc.playerkit.videoview.i) r4)
        L_0x01d9:
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r0 = r0.q
            if (r0 == 0) goto L_0x01ee
            if (r2 == 0) goto L_0x01ea
            com.ss.android.ugc.aweme.feed.model.Video r1 = r2.a(r1)
            if (r1 == 0) goto L_0x01ea
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getOriginCover()
            goto L_0x01eb
        L_0x01ea:
            r1 = r8
        L_0x01eb:
            r0.a(r1)
        L_0x01ee:
            com.ss.android.ugc.aweme.longvideo.i r9 = r7.k
            if (r9 != 0) goto L_0x01f7
            java.lang.String r0 = "mLongVideoSeekView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L_0x01f7:
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r7.f39136e
            if (r11 != 0) goto L_0x0200
            java.lang.String r0 = "mAweme"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L_0x0200:
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r12] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f39132a
            r3 = 0
            r4 = 31204(0x79e4, float:4.3726E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Video> r6 = com.ss.android.ugc.aweme.feed.model.Video.class
            r1 = r27
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0233
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r12] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f39132a
            r3 = 0
            r4 = 31204(0x79e4, float:4.3726E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Video> r6 = com.ss.android.ugc.aweme.feed.model.Video.class
            r1 = r27
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.feed.model.Video r0 = (com.ss.android.ugc.aweme.feed.model.Video) r0
            goto L_0x023d
        L_0x0233:
            com.ss.android.ugc.aweme.longvideo.j r0 = r7.O
            if (r0 == 0) goto L_0x023c
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.a(r11)
            goto L_0x023d
        L_0x023c:
            r0 = r8
        L_0x023d:
            if (r0 == 0) goto L_0x0244
            int r0 = r0.getDuration()
            goto L_0x0245
        L_0x0244:
            r0 = 0
        L_0x0245:
            r9.b(r0)
            com.ss.android.ugc.aweme.longvideo.DiggView r0 = r7.J
            if (r0 == 0) goto L_0x025c
            android.support.v4.app.FragmentActivity r1 = r7.S
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.f39136e
            if (r2 != 0) goto L_0x0257
            java.lang.String r3 = "mAweme"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0257:
            java.lang.String r3 = r7.K
            r0.a(r1, r2, r8, r3)
        L_0x025c:
            java.lang.Object[] r0 = new java.lang.Object[r14]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r30)
            r0[r12] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r31)
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f39132a
            r3 = 0
            r4 = 31202(0x79e2, float:4.3723E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r27
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02a8
            java.lang.Object[] r0 = new java.lang.Object[r14]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r30)
            r0[r12] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r31)
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f39132a
            r3 = 0
            r4 = 31202(0x79e2, float:4.3723E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r27
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x02a8:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.A
            if (r0 != 0) goto L_0x02b1
            java.lang.String r1 = "mLoftTitleTv"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x02b1:
            com.ss.android.ugc.aweme.commercialize.loft.model.j r1 = r7.f39135d
            if (r1 != 0) goto L_0x02ba
            java.lang.String r2 = "mLoftVideo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x02ba:
            java.lang.String r1 = r1.getTitle()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r10 + 1
            r0.append(r1)
            r1 = 47
            r0.append(r1)
            r1 = r31
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.B
            if (r1 != 0) goto L_0x02e4
            java.lang.String r2 = "mLoftNumTv"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x02e4:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            com.ss.android.ugc.aweme.commercialize.loft.model.j r0 = r7.f39135d
            if (r0 != 0) goto L_0x02f2
            java.lang.String r1 = "mLoftVideo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x02f2:
            com.ss.android.ugc.aweme.commercialize.loft.model.k r0 = r0.getMore()
            if (r0 != 0) goto L_0x0308
            android.widget.LinearLayout r0 = r7.x
            if (r0 != 0) goto L_0x0301
            java.lang.String r1 = "mMaskBtnContainer"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0301:
            r1 = 8
            r0.setVisibility(r1)
            goto L_0x03a4
        L_0x0308:
            android.widget.LinearLayout r0 = r7.x
            if (r0 != 0) goto L_0x0311
            java.lang.String r1 = "mMaskBtnContainer"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0311:
            r0.setVisibility(r12)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r7.y
            if (r0 != 0) goto L_0x031d
            java.lang.String r1 = "mMaskAuthorAvatar"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x031d:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0
            com.ss.android.ugc.aweme.commercialize.loft.model.j r1 = r7.f39135d
            if (r1 != 0) goto L_0x0328
            java.lang.String r2 = "mLoftVideo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0328:
            com.ss.android.ugc.aweme.commercialize.loft.model.k r1 = r1.getMore()
            if (r1 == 0) goto L_0x0333
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getImageUrl()
            goto L_0x0334
        L_0x0333:
            r1 = r8
        L_0x0334:
            com.ss.android.ugc.aweme.base.c.b(r0, r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.z
            if (r0 != 0) goto L_0x0340
            java.lang.String r1 = "mMaskDescTv"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0340:
            com.ss.android.ugc.aweme.commercialize.loft.model.j r1 = r7.f39135d
            if (r1 != 0) goto L_0x0349
            java.lang.String r2 = "mLoftVideo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0349:
            com.ss.android.ugc.aweme.commercialize.loft.model.k r1 = r1.getMore()
            if (r1 == 0) goto L_0x0356
            java.lang.String r1 = r1.getDesc()
            if (r1 == 0) goto L_0x0356
            goto L_0x0358
        L_0x0356:
            java.lang.String r1 = ""
        L_0x0358:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            java.lang.String r0 = "show_more_button"
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = r7.K
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.f39136e
            if (r3 != 0) goto L_0x0376
            java.lang.String r4 = "mAweme"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x0376:
            java.lang.String r3 = r3.getAid()
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.f39136e
            if (r3 != 0) goto L_0x0389
            java.lang.String r4 = "mAweme"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x0389:
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getAuthor()
            if (r3 == 0) goto L_0x0393
            java.lang.String r8 = r3.getUid()
        L_0x0393:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r8)
            java.lang.String r2 = "is_long_item"
            int r3 = r7.Q
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (int) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
        L_0x03a4:
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r30)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f39132a
            r3 = 0
            r4 = 31200(0x79e0, float:4.372E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r27
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x03dc
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r30)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f39132a
            r3 = 0
            r4 = 31200(0x79e0, float:4.372E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r27
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x03dc:
            if (r10 != 0) goto L_0x040e
            android.content.Context r0 = com.ss.android.ugc.aweme.base.utils.d.a()
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.loft.e> r1 = com.ss.android.ugc.aweme.commercialize.loft.e.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.base.sharedpref.c.a(r0, r1)
            com.ss.android.ugc.aweme.commercialize.loft.e r0 = (com.ss.android.ugc.aweme.commercialize.loft.e) r0
            boolean r1 = r0.a(r12)
            if (r1 != 0) goto L_0x040e
            android.view.View r1 = r7.E
            if (r1 != 0) goto L_0x03f9
            java.lang.String r2 = "mLoftGuideLL"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x03f9:
            r1.setVisibility(r12)
            android.view.View r1 = r7.E
            if (r1 != 0) goto L_0x0405
            java.lang.String r2 = "mLoftGuideLL"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0405:
            r2 = r7
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            r0.b(r13)
        L_0x040e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.loft.adapter.b.a(java.lang.String, com.ss.android.ugc.aweme.commercialize.loft.model.j, int, int):void");
    }

    public b(@NotNull View view, @NotNull FragmentActivity fragmentActivity, @NotNull o oVar, @NotNull com.ss.android.ugc.aweme.feed.d dVar, boolean z2) {
        com.ss.android.ugc.aweme.longvideo.b.e eVar;
        int i2;
        View view2 = view;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        o oVar2 = oVar;
        com.ss.android.ugc.aweme.feed.d dVar2 = dVar;
        Intrinsics.checkParameterIsNotNull(view2, "convertView");
        Intrinsics.checkParameterIsNotNull(fragmentActivity2, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(oVar2, "playerManager");
        Intrinsics.checkParameterIsNotNull(dVar2, "dialogController");
        this.R = view2;
        this.S = fragmentActivity2;
        this.T = oVar2;
        this.U = dVar2;
        this.V = z2;
        if (PatchProxy.isSupport(new Object[0], this, f39132a, false, 31199, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39132a, false, 31199, new Class[0], Void.TYPE);
            return;
        }
        this.R.setTag(this);
        View view3 = this.R;
        View findViewById = view3.findViewById(C0906R.id.ci4);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.root_view)");
        this.q = (DoubleClickDiggFrameLayout) findViewById;
        View findViewById2 = view3.findViewById(C0906R.id.dse);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.video_loft_view)");
        this.l = (LoftView) findViewById2;
        this.g = new VideoViewComponent();
        VideoViewComponent videoViewComponent = this.g;
        if (videoViewComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVideoViewComponent");
        }
        DoubleClickDiggFrameLayout doubleClickDiggFrameLayout = this.q;
        if (doubleClickDiggFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        videoViewComponent.a((ViewGroup) doubleClickDiggFrameLayout);
        VideoViewComponent videoViewComponent2 = this.g;
        if (videoViewComponent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVideoViewComponent");
        }
        com.ss.android.ugc.playerkit.videoview.h hVar = videoViewComponent2.f4334b;
        Intrinsics.checkExpressionValueIsNotNull(hVar, "mVideoViewComponent.surfaceHolder");
        View a2 = hVar.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "mVideoViewComponent.surfaceHolder.view");
        this.h = a2;
        View findViewById3 = view3.findViewById(C0906R.id.azy);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.iv_close)");
        this.f39134c = (ImageView) findViewById3;
        View findViewById4 = view3.findViewById(C0906R.id.dsu);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.video_seek_bar)");
        this.i = (VideoPlaySeekBar) findViewById4;
        View findViewById5 = view3.findViewById(C0906R.id.b43);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.iv_play)");
        this.f39133b = (ImageView) findViewById5;
        View findViewById6 = view3.findViewById(C0906R.id.b4c);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "findViewById(R.id.iv_replay)");
        this.p = (ImageView) findViewById6;
        View findViewById7 = view3.findViewById(C0906R.id.b0n);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "findViewById(R.id.iv_digg)");
        this.m = (LongVideoDiggAnimationView) findViewById7;
        View findViewById8 = view3.findViewById(C0906R.id.b02);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "findViewById(R.id.iv_comment)");
        this.n = (ImageView) findViewById8;
        View findViewById9 = view3.findViewById(C0906R.id.b54);
        Intrinsics.checkExpressionValueIsNotNull(findViewById9, "findViewById(R.id.iv_share)");
        this.o = (ImageView) findViewById9;
        this.G = view3.findViewById(C0906R.id.bv6);
        this.F = view3.findViewById(C0906R.id.byn);
        this.H = (LineProgressBar) view3.findViewById(C0906R.id.bym);
        this.I = (AudioControlView) view3.findViewById(C0906R.id.gk);
        View findViewById10 = view3.findViewById(C0906R.id.a1a);
        Intrinsics.checkExpressionValueIsNotNull(findViewById10, "findViewById(R.id.cover)");
        this.r = (AnimatedImageView) findViewById10;
        View findViewById11 = view3.findViewById(C0906R.id.a1b);
        Intrinsics.checkExpressionValueIsNotNull(findViewById11, "findViewById(R.id.cover_container)");
        this.s = (FrameLayout) findViewById11;
        View findViewById12 = view3.findViewById(C0906R.id.kc);
        Intrinsics.checkExpressionValueIsNotNull(findViewById12, "findViewById(R.id.bg_container)");
        this.t = findViewById12;
        View findViewById13 = view3.findViewById(C0906R.id.d4b);
        Intrinsics.checkExpressionValueIsNotNull(findViewById13, "findViewById(R.id.tool_container)");
        this.u = (RelativeLayout) findViewById13;
        View findViewById14 = view3.findViewById(C0906R.id.ag1);
        Intrinsics.checkExpressionValueIsNotNull(findViewById14, "findViewById(R.id.fl_root_container)");
        this.v = (FrameLayout) findViewById14;
        View findViewById15 = view3.findViewById(C0906R.id.blu);
        Intrinsics.checkExpressionValueIsNotNull(findViewById15, "findViewById(R.id.mask_btn_container)");
        this.x = (LinearLayout) findViewById15;
        View findViewById16 = view3.findViewById(C0906R.id.blt);
        Intrinsics.checkExpressionValueIsNotNull(findViewById16, "findViewById(R.id.mask_author_avatar)");
        this.y = (AvatarImageView) findViewById16;
        View findViewById17 = view3.findViewById(C0906R.id.blv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById17, "findViewById(R.id.mask_desc_tv)");
        this.z = (DmtTextView) findViewById17;
        View findViewById18 = view3.findViewById(C0906R.id.bkg);
        Intrinsics.checkExpressionValueIsNotNull(findViewById18, "findViewById(R.id.loft_video_title)");
        this.A = (DmtTextView) findViewById18;
        View findViewById19 = view3.findViewById(C0906R.id.bkf);
        Intrinsics.checkExpressionValueIsNotNull(findViewById19, "findViewById(R.id.loft_video_num)");
        this.B = (DmtTextView) findViewById19;
        View findViewById20 = view3.findViewById(C0906R.id.dsg);
        Intrinsics.checkExpressionValueIsNotNull(findViewById20, "findViewById(R.id.video_mask_top_view)");
        this.C = findViewById20;
        View findViewById21 = view3.findViewById(C0906R.id.dsf);
        Intrinsics.checkExpressionValueIsNotNull(findViewById21, "findViewById(R.id.video_mask_bottom_view)");
        this.D = findViewById21;
        View findViewById22 = view3.findViewById(C0906R.id.bkc);
        Intrinsics.checkExpressionValueIsNotNull(findViewById22, "findViewById(R.id.loft_guide_ll)");
        this.E = findViewById22;
        if (PatchProxy.isSupport(new Object[]{view3}, this, f39132a, false, 31210, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view3}, this, f39132a, false, 31210, new Class[]{View.class}, Void.TYPE);
        } else {
            BottomSheetBehavior from = BottomSheetBehavior.from(view3.findViewById(C0906R.id.ci4));
            if (from != null) {
                this.f39137f = (CustomBottomSheetBehavior) from;
                CustomBottomSheetBehavior<View> customBottomSheetBehavior = this.f39137f;
                if (customBottomSheetBehavior != null) {
                    customBottomSheetBehavior.setBottomSheetCallback(new e(this));
                    customBottomSheetBehavior.setHideable(true);
                    if (!com.ss.android.ugc.aweme.app.a.a.a((Activity) this.S)) {
                        customBottomSheetBehavior.setPeekHeight(p.a(this.S) + p() + com.ss.android.ugc.aweme.profile.a.d(this.S));
                    } else {
                        customBottomSheetBehavior.setPeekHeight(p.a(this.S) + p());
                    }
                    customBottomSheetBehavior.setSkipCollapsed(true);
                    customBottomSheetBehavior.setState(3);
                }
                CustomBottomSheetBehavior<View> customBottomSheetBehavior2 = this.f39137f;
                if (customBottomSheetBehavior2 != null) {
                    customBottomSheetBehavior2.a(new f(this));
                }
                FrameLayout frameLayout = this.v;
                if (frameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRootContainer");
                }
                frameLayout.postDelayed(new g(this), 50);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior<android.view.View!>");
            }
        }
        Context context = this.S;
        FrameLayout frameLayout2 = this.v;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootContainer");
        }
        View view4 = frameLayout2;
        View view5 = this.F;
        if (view5 != null) {
            this.w = new com.ss.android.ugc.aweme.longvideo.h(context, view4, (LinearLayout) view5);
            com.ss.android.ugc.aweme.longvideo.h hVar2 = this.w;
            if (hVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLongVideoScreenHelper");
            }
            hVar2.a(this.Y);
            if (PatchProxy.isSupport(new Object[0], this, f39132a, false, 31203, new Class[0], com.ss.android.ugc.aweme.longvideo.b.e.class)) {
                eVar = (com.ss.android.ugc.aweme.longvideo.b.e) PatchProxy.accessDispatch(new Object[0], this, f39132a, false, 31203, new Class[0], com.ss.android.ugc.aweme.longvideo.b.e.class);
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                WindowManager windowManager = this.S.getWindowManager();
                Intrinsics.checkExpressionValueIsNotNull(windowManager, "activity.windowManager");
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                eVar = com.ss.android.ugc.aweme.longvideo.b.d.f53893a.b(displayMetrics.widthPixels, p.e(this.S));
            }
            this.Z = eVar;
            FragmentActivity fragmentActivity3 = this.S;
            VideoViewComponent videoViewComponent3 = this.g;
            if (videoViewComponent3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVideoViewComponent");
            }
            AnimatedImageView animatedImageView = this.r;
            if (animatedImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCover");
            }
            ImageView imageView = this.p;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIvReplay");
            }
            LoftVideoPlayView loftVideoPlayView = new LoftVideoPlayView(fragmentActivity3, videoViewComponent3, animatedImageView, imageView, this.T, this);
            this.j = loftVideoPlayView;
            LoftVideoPlayView loftVideoPlayView2 = this.j;
            if (loftVideoPlayView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLongVideoPlayView");
            }
            LoftVideoPlayView.a aVar = new a(this);
            if (PatchProxy.isSupport(new Object[]{aVar}, loftVideoPlayView2, LoftVideoPlayView.f2908a, false, 31120, new Class[]{LoftVideoPlayView.a.class}, Void.TYPE)) {
                Object[] objArr = {aVar};
                Object[] objArr2 = objArr;
                LoftVideoPlayView loftVideoPlayView3 = loftVideoPlayView2;
                PatchProxy.accessDispatch(objArr2, loftVideoPlayView3, LoftVideoPlayView.f2908a, false, 31120, new Class[]{LoftVideoPlayView.a.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(aVar, "view");
                loftVideoPlayView2.f2911d = aVar;
                LoftVideoPlayView.a aVar2 = loftVideoPlayView2.f2911d;
                if (aVar2 != null) {
                    View a3 = aVar2.a();
                    if (a3 != null) {
                        a3.setOnClickListener(loftVideoPlayView2.n);
                    }
                }
            }
            VideoPlaySeekBar videoPlaySeekBar = this.i;
            if (videoPlaySeekBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVideoSeekBar");
            }
            LoftVideoPlayView loftVideoPlayView4 = this.j;
            if (loftVideoPlayView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLongVideoPlayView");
            }
            this.k = new i(videoPlaySeekBar, loftVideoPlayView4);
            LoftVideoPlayView loftVideoPlayView5 = this.j;
            if (loftVideoPlayView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLongVideoPlayView");
            }
            i iVar = this.k;
            if (iVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLongVideoSeekView");
            }
            loftVideoPlayView5.f2912e = iVar;
            LongVideoDiggAnimationView longVideoDiggAnimationView = this.m;
            if (longVideoDiggAnimationView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIvDigg");
            }
            this.J = new DiggView(longVideoDiggAnimationView, null, this.K);
            FragmentActivity fragmentActivity4 = this.S;
            DoubleClickDiggFrameLayout doubleClickDiggFrameLayout2 = this.q;
            if (doubleClickDiggFrameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            this.P = new NoOperateModeController(fragmentActivity4, doubleClickDiggFrameLayout2);
            NoOperateModeController noOperateModeController = this.P;
            if (noOperateModeController == null) {
                Intrinsics.throwUninitializedPropertyAccessException("noOperationModeController");
            }
            noOperateModeController.a((NoOperateModeController.a) this);
            ImageView imageView2 = this.f39134c;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIvClose");
            }
            View.OnClickListener onClickListener = this;
            imageView2.setOnClickListener(onClickListener);
            ImageView imageView3 = this.f39134c;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIvClose");
            }
            if (this.V) {
                i2 = 2130838313;
            } else {
                i2 = 2130838312;
            }
            imageView3.setImageResource(i2);
            ImageView imageView4 = this.n;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCommentView");
            }
            imageView4.setOnClickListener(onClickListener);
            ImageView imageView5 = this.o;
            if (imageView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mShareView");
            }
            imageView5.setOnClickListener(onClickListener);
            LinearLayout linearLayout = this.x;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMaskBtnContainer");
            }
            linearLayout.setOnClickListener(onClickListener);
            DoubleClickDiggFrameLayout doubleClickDiggFrameLayout3 = this.q;
            if (doubleClickDiggFrameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            doubleClickDiggFrameLayout3.setOnDiggListener(new C0510b(this));
            LoftVideoPlayView loftVideoPlayView6 = this.j;
            if (loftVideoPlayView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLongVideoPlayView");
            }
            com.ss.android.ugc.aweme.feed.d dVar3 = this.U;
            LoftVideoPlayView loftVideoPlayView7 = this.j;
            if (loftVideoPlayView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLongVideoPlayView");
            }
            com.ss.android.ugc.aweme.longvideo.d aVar3 = new com.ss.android.ugc.aweme.longvideo.feature.a(dVar3, loftVideoPlayView7, this.T);
            if (PatchProxy.isSupport(new Object[]{aVar3}, loftVideoPlayView6, LoftVideoPlayView.f2908a, false, 31121, new Class[]{com.ss.android.ugc.aweme.longvideo.d.class}, Void.TYPE)) {
                LoftVideoPlayView loftVideoPlayView8 = loftVideoPlayView6;
                PatchProxy.accessDispatch(new Object[]{aVar3}, loftVideoPlayView8, LoftVideoPlayView.f2908a, false, 31121, new Class[]{com.ss.android.ugc.aweme.longvideo.d.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(aVar3, "interceptor");
                loftVideoPlayView6.g.add(aVar3);
            }
            LoadingController loadingController = new LoadingController(this.S, this.H);
            LoftVideoPlayView loftVideoPlayView9 = this.j;
            if (loftVideoPlayView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLongVideoPlayView");
            }
            loftVideoPlayView9.a((com.ss.android.ugc.aweme.video.a.a) loadingController);
            LoftView loftView = this.l;
            if (loftView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoftView");
            }
            loftView.setDismissListener(new c(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
    }
}
