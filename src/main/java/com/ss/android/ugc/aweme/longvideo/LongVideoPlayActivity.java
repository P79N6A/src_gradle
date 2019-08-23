package com.ss.android.ugc.aweme.longvideo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.ui.AudioControlView;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.comment.a;
import com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.ss.android.ugc.aweme.longvideo.DiggView;
import com.ss.android.ugc.aweme.longvideo.LongVideoPlayView;
import com.ss.android.ugc.aweme.longvideo.b.d;
import com.ss.android.ugc.aweme.longvideo.feature.LoadingController;
import com.ss.android.ugc.aweme.longvideo.feature.LongVideoPlayMob;
import com.ss.android.ugc.aweme.longvideo.feature.NoOperateModeController;
import com.ss.android.ugc.aweme.longvideo.feature.Rotate;
import com.ss.android.ugc.aweme.longvideo.feature.VolumeController;
import com.ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior;
import com.ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout;
import com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView;
import com.ss.android.ugc.aweme.longvideo.view.VideoPlaySeekBar;
import com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¼\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 ò\u00012\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0002ò\u0001B\u0005¢\u0006\u0002\u0010\bJ\n\u0010Ë\u0001\u001a\u00030Ì\u0001H\u0016J\n\u0010Í\u0001\u001a\u00030Ì\u0001H\u0016J\n\u0010Î\u0001\u001a\u00030Ì\u0001H\u0016J\u0012\u0010Ï\u0001\u001a\u00020\u00192\u0007\u0010Ð\u0001\u001a\u00020QH\u0016J\n\u0010Ñ\u0001\u001a\u00030»\u0001H\u0002J\n\u0010Ò\u0001\u001a\u00030»\u0001H\u0014J\u0016\u0010Ó\u0001\u001a\u0005\u0018\u00010Ô\u00012\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\n\u0010Õ\u0001\u001a\u00030Ì\u0001H\u0002J\b\u0010Ö\u0001\u001a\u00030Ì\u0001J\n\u0010×\u0001\u001a\u00030Ì\u0001H\u0002J\b\u0010Ø\u0001\u001a\u00030Ä\u0001J\n\u0010Ù\u0001\u001a\u00030Ì\u0001H\u0016J\u0015\u0010Ú\u0001\u001a\u00030Ì\u00012\t\u0010Û\u0001\u001a\u0004\u0018\u00010\u0011H\u0016J\u0016\u0010Ü\u0001\u001a\u00030Ì\u00012\n\u0010Ý\u0001\u001a\u0005\u0018\u00010Þ\u0001H\u0016J\u0016\u0010ß\u0001\u001a\u00030Ì\u00012\n\u0010à\u0001\u001a\u0005\u0018\u00010á\u0001H\u0014J\n\u0010â\u0001\u001a\u00030Ì\u0001H\u0014J\u0015\u0010ã\u0001\u001a\u00030Ì\u00012\t\u0010ä\u0001\u001a\u0004\u0018\u00010\u0003H\u0016J\u001f\u0010å\u0001\u001a\u00020Q2\b\u0010æ\u0001\u001a\u00030»\u00012\n\u0010ä\u0001\u001a\u0005\u0018\u00010ç\u0001H\u0016J\n\u0010è\u0001\u001a\u00030Ì\u0001H\u0016J\n\u0010é\u0001\u001a\u00030Ì\u0001H\u0002J\u0011\u0010ê\u0001\u001a\u00030Ì\u00012\u0007\u0010ë\u0001\u001a\u00020 J\n\u0010ì\u0001\u001a\u00030Ì\u0001H\u0002J\n\u0010í\u0001\u001a\u00030Ì\u0001H\u0014J\n\u0010î\u0001\u001a\u00030Ì\u0001H\u0002J\b\u0010ï\u0001\u001a\u00030Ì\u0001J\u0011\u0010ð\u0001\u001a\u00030Ì\u00012\u0007\u0010ñ\u0001\u001a\u00020QR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u0011X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020-X.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u000203X.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u00108\u001a\u000209X.¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010>\u001a\u0004\u0018\u00010?X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u0010D\u001a\u0004\u0018\u00010EX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001c\u0010J\u001a\u0004\u0018\u00010KX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u000e\u0010P\u001a\u00020QX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010R\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010/\"\u0004\bT\u00101R\u001a\u0010U\u001a\u00020VX.¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001a\u0010[\u001a\u00020-X.¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010/\"\u0004\b]\u00101R\u001a\u0010^\u001a\u00020-X.¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010/\"\u0004\b`\u00101R\u001a\u0010a\u001a\u00020-X.¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010/\"\u0004\bc\u00101R\u001a\u0010d\u001a\u00020eX.¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u001a\u0010j\u001a\u00020kX.¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u001a\u0010p\u001a\u00020qX.¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u001a\u0010v\u001a\u00020wX.¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u001e\u0010|\u001a\u0004\u0018\u00010}X\u000e¢\u0006\u0010\n\u0000\u001a\u0004\b~\u0010\"\u0006\b\u0001\u0010\u0001R\"\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\"\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\"\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0001\u001a\u00020\u0013X.¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\u0015\"\u0005\b\u0001\u0010\u0017R \u0010\u0001\u001a\u00030\u0001X.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\"\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001d\u0010 \u0001\u001a\u00020-X.¢\u0006\u0010\n\u0000\u001a\u0005\b¡\u0001\u0010/\"\u0005\b¢\u0001\u00101R \u0010£\u0001\u001a\u00030¤\u0001X.¢\u0006\u0012\n\u0000\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R \u0010©\u0001\u001a\u00030ª\u0001X.¢\u0006\u0012\n\u0000\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b­\u0001\u0010®\u0001R\u001d\u0010¯\u0001\u001a\u00020\u0011X.¢\u0006\u0010\n\u0000\u001a\u0005\b°\u0001\u0010)\"\u0005\b±\u0001\u0010+R \u0010²\u0001\u001a\u00030³\u0001X.¢\u0006\u0012\n\u0000\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R\u0010\u0010¸\u0001\u001a\u00030¹\u0001X.¢\u0006\u0002\n\u0000R \u0010º\u0001\u001a\u00030»\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R\u001f\u0010À\u0001\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÁ\u0001\u0010)\"\u0005\bÂ\u0001\u0010+R\u0010\u0010Ã\u0001\u001a\u00030Ä\u0001X\u000e¢\u0006\u0002\n\u0000R\"\u0010Å\u0001\u001a\u0005\u0018\u00010Æ\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001¨\u0006ó\u0001"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/LongVideoPlayActivity;", "Lcom/ss/android/ugc/aweme/base/activity/AmeSSActivity;", "Lcom/ss/android/ugc/aweme/feed/event/OnInternalEventListener;", "Lcom/ss/android/ugc/aweme/feed/event/VideoEvent;", "Lcom/ss/android/ugc/aweme/feed/listener/IGetEnterFromListener;", "Lcom/ss/android/ugc/aweme/longvideo/feature/NoOperateModeController$NoOperationCallback;", "Landroid/view/View$OnClickListener;", "Lcom/ss/android/ugc/aweme/longvideo/ILongPlayControll;", "()V", "audioControlView", "Lcom/ss/android/ugc/aweme/base/ui/AudioControlView;", "getAudioControlView", "()Lcom/ss/android/ugc/aweme/base/ui/AudioControlView;", "setAudioControlView", "(Lcom/ss/android/ugc/aweme/base/ui/AudioControlView;)V", "behavior", "Lcom/ss/android/ugc/aweme/longvideo/view/CustomBottomSheetBehavior;", "Landroid/view/View;", "coverContainer", "Landroid/widget/FrameLayout;", "getCoverContainer", "()Landroid/widget/FrameLayout;", "setCoverContainer", "(Landroid/widget/FrameLayout;)V", "eventType", "", "getEventType", "()Ljava/lang/String;", "setEventType", "(Ljava/lang/String;)V", "mActivityOnKeyDownListeners", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/base/activity/ActivityOnKeyDownListener;", "mAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getMAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "setMAweme", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "mBgContainer", "getMBgContainer", "()Landroid/view/View;", "setMBgContainer", "(Landroid/view/View;)V", "mCommentView", "Landroid/widget/ImageView;", "getMCommentView", "()Landroid/widget/ImageView;", "setMCommentView", "(Landroid/widget/ImageView;)V", "mCommerceLikeLayout", "Lcom/ss/android/ugc/aweme/commercialize/views/CommerceLikeLayout;", "getMCommerceLikeLayout", "()Lcom/ss/android/ugc/aweme/commercialize/views/CommerceLikeLayout;", "setMCommerceLikeLayout", "(Lcom/ss/android/ugc/aweme/commercialize/views/CommerceLikeLayout;)V", "mCover", "Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "getMCover", "()Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "setMCover", "(Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;)V", "mDialogController", "Lcom/ss/android/ugc/aweme/feed/DialogController;", "getMDialogController", "()Lcom/ss/android/ugc/aweme/feed/DialogController;", "setMDialogController", "(Lcom/ss/android/ugc/aweme/feed/DialogController;)V", "mDiggView", "Lcom/ss/android/ugc/aweme/longvideo/DiggView;", "getMDiggView", "()Lcom/ss/android/ugc/aweme/longvideo/DiggView;", "setMDiggView", "(Lcom/ss/android/ugc/aweme/longvideo/DiggView;)V", "mImmersionBar", "Lcom/gyf/barlibrary/ImmersionBar;", "getMImmersionBar", "()Lcom/gyf/barlibrary/ImmersionBar;", "setMImmersionBar", "(Lcom/gyf/barlibrary/ImmersionBar;)V", "mIsLandscape", "", "mIvClose", "getMIvClose", "setMIvClose", "mIvDigg", "Lcom/ss/android/ugc/aweme/longvideo/view/LongVideoDiggAnimationView;", "getMIvDigg", "()Lcom/ss/android/ugc/aweme/longvideo/view/LongVideoDiggAnimationView;", "setMIvDigg", "(Lcom/ss/android/ugc/aweme/longvideo/view/LongVideoDiggAnimationView;)V", "mIvPlay", "getMIvPlay", "setMIvPlay", "mIvReplay", "getMIvReplay", "setMIvReplay", "mIvRotate", "getMIvRotate", "setMIvRotate", "mLongVideoPlayMob", "Lcom/ss/android/ugc/aweme/longvideo/feature/LongVideoPlayMob;", "getMLongVideoPlayMob", "()Lcom/ss/android/ugc/aweme/longvideo/feature/LongVideoPlayMob;", "setMLongVideoPlayMob", "(Lcom/ss/android/ugc/aweme/longvideo/feature/LongVideoPlayMob;)V", "mLongVideoPlayView", "Lcom/ss/android/ugc/aweme/longvideo/LongVideoPlayView;", "getMLongVideoPlayView", "()Lcom/ss/android/ugc/aweme/longvideo/LongVideoPlayView;", "setMLongVideoPlayView", "(Lcom/ss/android/ugc/aweme/longvideo/LongVideoPlayView;)V", "mLongVideoScreenHelper", "Lcom/ss/android/ugc/aweme/longvideo/LongVideoScreenHelper;", "getMLongVideoScreenHelper", "()Lcom/ss/android/ugc/aweme/longvideo/LongVideoScreenHelper;", "setMLongVideoScreenHelper", "(Lcom/ss/android/ugc/aweme/longvideo/LongVideoScreenHelper;)V", "mLongVideoSeekView", "Lcom/ss/android/ugc/aweme/longvideo/LongVideoSeekView;", "getMLongVideoSeekView", "()Lcom/ss/android/ugc/aweme/longvideo/LongVideoSeekView;", "setMLongVideoSeekView", "(Lcom/ss/android/ugc/aweme/longvideo/LongVideoSeekView;)V", "mMobViewModel", "Lcom/ss/android/ugc/aweme/longvideo/viewmodel/LongVideoMobViewModel;", "getMMobViewModel", "()Lcom/ss/android/ugc/aweme/longvideo/viewmodel/LongVideoMobViewModel;", "setMMobViewModel", "(Lcom/ss/android/ugc/aweme/longvideo/viewmodel/LongVideoMobViewModel;)V", "mOperateContainer", "Landroid/widget/LinearLayout;", "getMOperateContainer", "()Landroid/widget/LinearLayout;", "setMOperateContainer", "(Landroid/widget/LinearLayout;)V", "mPlayLoading", "Lcom/ss/android/ugc/aweme/feed/widget/LineProgressBar;", "getMPlayLoading", "()Lcom/ss/android/ugc/aweme/feed/widget/LineProgressBar;", "setMPlayLoading", "(Lcom/ss/android/ugc/aweme/feed/widget/LineProgressBar;)V", "mPlayViewsContainer", "getMPlayViewsContainer", "setMPlayViewsContainer", "mRootContainer", "getMRootContainer", "setMRootContainer", "mRootView", "Lcom/ss/android/ugc/aweme/longvideo/view/DoubleClickDiggFrameLayout;", "getMRootView", "()Lcom/ss/android/ugc/aweme/longvideo/view/DoubleClickDiggFrameLayout;", "setMRootView", "(Lcom/ss/android/ugc/aweme/longvideo/view/DoubleClickDiggFrameLayout;)V", "mRotate", "Lcom/ss/android/ugc/aweme/longvideo/feature/Rotate;", "getMRotate", "()Lcom/ss/android/ugc/aweme/longvideo/feature/Rotate;", "setMRotate", "(Lcom/ss/android/ugc/aweme/longvideo/feature/Rotate;)V", "mShareView", "getMShareView", "setMShareView", "mToolContainer", "Landroid/widget/RelativeLayout;", "getMToolContainer", "()Landroid/widget/RelativeLayout;", "setMToolContainer", "(Landroid/widget/RelativeLayout;)V", "mVideoSeekBar", "Lcom/ss/android/ugc/aweme/longvideo/view/VideoPlaySeekBar;", "getMVideoSeekBar", "()Lcom/ss/android/ugc/aweme/longvideo/view/VideoPlaySeekBar;", "setMVideoSeekBar", "(Lcom/ss/android/ugc/aweme/longvideo/view/VideoPlaySeekBar;)V", "mVideoView", "getMVideoView", "setMVideoView", "mVideoViewComponent", "Lcom/ss/android/ugc/playerkit/videoview/VideoViewComponent;", "getMVideoViewComponent", "()Lcom/ss/android/ugc/playerkit/videoview/VideoViewComponent;", "setMVideoViewComponent", "(Lcom/ss/android/ugc/playerkit/videoview/VideoViewComponent;)V", "noOperationModeController", "Lcom/ss/android/ugc/aweme/longvideo/feature/NoOperateModeController;", "pageType", "", "getPageType", "()I", "setPageType", "(I)V", "rootView", "getRootView", "setRootView", "screenSize", "Lcom/ss/android/ugc/aweme/longvideo/utils/Size;", "videoProvider", "Lcom/ss/android/ugc/aweme/longvideo/VideoProvider;", "getVideoProvider", "()Lcom/ss/android/ugc/aweme/longvideo/VideoProvider;", "setVideoProvider", "(Lcom/ss/android/ugc/aweme/longvideo/VideoProvider;)V", "enterNoOperationMode", "", "exitNoOperationMode", "finish", "getEnterFrom", "event_v3", "getNavigationBarHeight", "getStatusBarColor", "getVideo", "Lcom/ss/android/ugc/aweme/feed/model/Video;", "initBottomSheetBehavior", "initData", "initIntent", "initScreenSize", "onBackPressed", "onClick", "v", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onInternalEvent", "event", "onKeyDown", "keyCode", "Landroid/view/KeyEvent;", "onPlayCompleted", "postOperateEvent", "registerActivityOnKeyDownListener", "listener", "setFullScreen", "setStatusBarColor", "setTransparent", "setupStatusBar", "videoAnimation", "isIn", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class LongVideoPlayActivity extends AmeSSActivity implements View.OnClickListener, aa<ar>, com.ss.android.ugc.aweme.feed.listener.c, a, NoOperateModeController.a {
    public static final a N = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53842a;
    @Nullable
    public LinearLayout A;
    @Nullable
    public LineProgressBar B;
    @Nullable
    public AudioControlView C;
    public boolean D;
    @Nullable
    public Rotate E;
    @Nullable
    public DiggView F;
    @NotNull
    public String G = "";
    public int H;
    @NotNull
    public LongVideoPlayMob I;
    @Nullable
    public LongVideoMobViewModel J;
    @Nullable
    public j K;
    public NoOperateModeController L;
    public com.ss.android.ugc.aweme.longvideo.b.e M = new com.ss.android.ugc.aweme.longvideo.b.e(0, 0);
    private final ArrayList<com.ss.android.ugc.aweme.base.activity.a> O = new ArrayList<>();
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public View f53843b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public ImageView f53844c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public ImageView f53845d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public Aweme f53846e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.feed.d f53847f;
    public CustomBottomSheetBehavior<View> g;
    @NotNull
    public VideoViewComponent h;
    @NotNull
    public View i;
    @NotNull
    public CommerceLikeLayout j;
    @NotNull
    public VideoPlaySeekBar k;
    @NotNull
    public LongVideoPlayView l;
    @NotNull
    public i m;
    @NotNull
    public LongVideoDiggAnimationView n;
    @NotNull
    public ImageView o;
    @NotNull
    public ImageView p;
    @NotNull
    public ImageView q;
    @NotNull
    public ImageView r;
    @NotNull
    public DoubleClickDiggFrameLayout s;
    @NotNull
    public AnimatedImageView t;
    @NotNull
    public FrameLayout u;
    @NotNull
    public View v;
    @NotNull
    public RelativeLayout w;
    @NotNull
    public FrameLayout x;
    @NotNull
    public h y;
    @Nullable
    public LinearLayout z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/LongVideoPlayActivity$Companion;", "", "()V", "EXTRA_EVENT_TYPE", "", "EXTRA_PAGE_TYPE", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53848a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LongVideoPlayActivity f53849b;

        b(LongVideoPlayActivity longVideoPlayActivity) {
            this.f53849b = longVideoPlayActivity;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f53848a, false, 56602, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53848a, false, 56602, new Class[0], Void.TYPE);
                return;
            }
            LinearLayout linearLayout = this.f53849b.A;
            if (linearLayout != null) {
                linearLayout.setAlpha(1.0f);
            }
            LinearLayout linearLayout2 = this.f53849b.A;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final c f53850a = new c();

        c() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/longvideo/LongVideoPlayActivity$initBottomSheetBehavior$1$1", "Landroid/support/design/widget/BottomSheetBehavior$BottomSheetCallback;", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d extends BottomSheetBehavior.BottomSheetCallback {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53851a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LongVideoPlayActivity f53852b;

        d(LongVideoPlayActivity longVideoPlayActivity) {
            this.f53852b = longVideoPlayActivity;
        }

        public final void onStateChanged(@NotNull View view, int i) {
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f53851a, false, 56603, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f53851a, false, 56603, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view, "bottomSheet");
            if (i == 1) {
                Rotate rotate = this.f53852b.E;
                if (rotate != null && rotate.f3478f) {
                    CustomBottomSheetBehavior<View> customBottomSheetBehavior = this.f53852b.g;
                    if (customBottomSheetBehavior != null) {
                        customBottomSheetBehavior.setState(4);
                    }
                }
            } else if (i == 5) {
                this.f53852b.finish();
            }
        }

        public final void onSlide(@NotNull View view, float f2) {
            if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2)}, this, f53851a, false, 56604, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2)}, this, f53851a, false, 56604, new Class[]{View.class, Float.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view, "bottomSheet");
            if (Float.isNaN(f2)) {
                this.f53852b.e().setAlpha(1.0f);
                this.f53852b.f().setAlpha(1.0f);
                return;
            }
            float abs = Math.abs(f2);
            if (abs > 0.0f && abs < 0.15f) {
                this.f53852b.f().setAlpha(1.0f - (abs / 0.15f));
            }
            if (abs > 0.15f) {
                this.f53852b.e().setAlpha(1.0f - ((abs - 0.15f) / 0.85f));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/longvideo/LongVideoPlayActivity$initBottomSheetBehavior$2", "Lcom/ss/android/ugc/aweme/longvideo/view/CustomBottomSheetBehavior$OnTouchEventCallBack;", "onTouchEvent", "", "parent", "Landroid/support/design/widget/CoordinatorLayout;", "child", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e implements CustomBottomSheetBehavior.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53853a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LongVideoPlayActivity f53854b;

        e(LongVideoPlayActivity longVideoPlayActivity) {
            this.f53854b = longVideoPlayActivity;
        }

        public final void a(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, @NotNull MotionEvent motionEvent) {
            DoubleClickDiggFrameLayout doubleClickDiggFrameLayout;
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            View view2 = view;
            MotionEvent motionEvent2 = motionEvent;
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, view2, motionEvent2}, this, f53853a, false, 56605, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, view2, motionEvent2}, this, f53853a, false, 56605, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(coordinatorLayout2, "parent");
            Intrinsics.checkParameterIsNotNull(view2, "child");
            Intrinsics.checkParameterIsNotNull(motionEvent2, "event");
            LongVideoPlayActivity longVideoPlayActivity = this.f53854b;
            if (PatchProxy.isSupport(new Object[0], longVideoPlayActivity, LongVideoPlayActivity.f53842a, false, 56557, new Class[0], DoubleClickDiggFrameLayout.class)) {
                doubleClickDiggFrameLayout = (DoubleClickDiggFrameLayout) PatchProxy.accessDispatch(new Object[0], longVideoPlayActivity, LongVideoPlayActivity.f53842a, false, 56557, new Class[0], DoubleClickDiggFrameLayout.class);
            } else {
                doubleClickDiggFrameLayout = longVideoPlayActivity.s;
                if (doubleClickDiggFrameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRootView");
                }
            }
            doubleClickDiggFrameLayout.a(motionEvent2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53855a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LongVideoPlayActivity f53856b;

        f(LongVideoPlayActivity longVideoPlayActivity) {
            this.f53856b = longVideoPlayActivity;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f53855a, false, 56606, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53855a, false, 56606, new Class[0], Void.TYPE);
                return;
            }
            this.f53856b.b(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/longvideo/LongVideoPlayActivity$initData$1", "Lcom/ss/android/ugc/aweme/longvideo/LongVideoPlayView$IPausePlayView;", "getView", "Landroid/view/View;", "onPause", "", "onPlay", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class g implements LongVideoPlayView.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53857a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LongVideoPlayActivity f53858b;

        @NotNull
        public final View a() {
            if (!PatchProxy.isSupport(new Object[0], this, f53857a, false, 56607, new Class[0], View.class)) {
                return this.f53858b.a();
            }
            return (View) PatchProxy.accessDispatch(new Object[0], this, f53857a, false, 56607, new Class[0], View.class);
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f53857a, false, 56608, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53857a, false, 56608, new Class[0], Void.TYPE);
                return;
            }
            this.f53858b.a().setSelected(false);
        }

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f53857a, false, 56609, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53857a, false, 56609, new Class[0], Void.TYPE);
                return;
            }
            this.f53858b.a().setSelected(true);
        }

        g(LongVideoPlayActivity longVideoPlayActivity) {
            this.f53858b = longVideoPlayActivity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/longvideo/LongVideoPlayActivity$initData$2", "Lcom/ss/android/ugc/aweme/longvideo/feature/Rotate$Observer;", "rotateChange", "", "isLandscape", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class h implements Rotate.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53859a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LongVideoPlayActivity f53860b;

        h(LongVideoPlayActivity longVideoPlayActivity) {
            this.f53860b = longVideoPlayActivity;
        }

        public final void a(boolean z) {
            h hVar;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f53859a, false, 56610, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f53859a, false, 56610, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            this.f53860b.g();
            if (z) {
                this.f53860b.D = true;
                com.ss.android.ugc.aweme.longvideo.b.d.f53893a.a((Activity) this.f53860b, this.f53860b.b(), (View) this.f53860b.d(), this.f53860b.a(this.f53860b.f53846e), this.f53860b.M, z);
                ImageView imageView = this.f53860b.f53845d;
                if (imageView != null) {
                    imageView.setImageResource(2130838771);
                }
                LinearLayout linearLayout = this.f53860b.A;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                this.f53860b.c().setImageResource(2130839111);
            } else {
                this.f53860b.D = false;
                com.ss.android.ugc.aweme.longvideo.b.d.f53893a.a((Activity) this.f53860b, this.f53860b.b(), (View) this.f53860b.d(), this.f53860b.a(this.f53860b.f53846e), this.f53860b.M, z);
                ImageView imageView2 = this.f53860b.f53845d;
                if (imageView2 != null) {
                    imageView2.setImageResource(2130838313);
                }
                LinearLayout linearLayout2 = this.f53860b.A;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                this.f53860b.c().setImageResource(2130839108);
            }
            LongVideoPlayActivity longVideoPlayActivity = this.f53860b;
            if (PatchProxy.isSupport(new Object[0], longVideoPlayActivity, LongVideoPlayActivity.f53842a, false, 56569, new Class[0], h.class)) {
                hVar = (h) PatchProxy.accessDispatch(new Object[0], longVideoPlayActivity, LongVideoPlayActivity.f53842a, false, 56569, new Class[0], h.class);
            } else {
                hVar = longVideoPlayActivity.y;
                if (hVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLongVideoScreenHelper");
                }
            }
            hVar.a(this.f53860b.D);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/longvideo/LongVideoPlayActivity$initData$3", "Lcom/ss/android/ugc/aweme/longvideo/view/DoubleClickDiggFrameLayout$OnDiggListener;", "onClick", "", "onDoubleClickDigg", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class i implements DoubleClickDiggFrameLayout.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53861a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LongVideoPlayActivity f53862b;

        public final void a() {
            CommerceLikeLayout commerceLikeLayout;
            if (PatchProxy.isSupport(new Object[0], this, f53861a, false, 56611, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53861a, false, 56611, new Class[0], Void.TYPE);
                return;
            }
            DiggView diggView = this.f53862b.F;
            if (diggView != null) {
                diggView.a();
            }
            LongVideoPlayActivity longVideoPlayActivity = this.f53862b;
            if (PatchProxy.isSupport(new Object[0], longVideoPlayActivity, LongVideoPlayActivity.f53842a, false, 56539, new Class[0], CommerceLikeLayout.class)) {
                commerceLikeLayout = (CommerceLikeLayout) PatchProxy.accessDispatch(new Object[0], longVideoPlayActivity, LongVideoPlayActivity.f53842a, false, 56539, new Class[0], CommerceLikeLayout.class);
            } else {
                commerceLikeLayout = longVideoPlayActivity.j;
                if (commerceLikeLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCommerceLikeLayout");
                }
            }
            commerceLikeLayout.a(this.f53862b.a(true));
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f53861a, false, 56612, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53861a, false, 56612, new Class[0], Void.TYPE);
            } else if (LongVideoPlayActivity.a(this.f53862b).f3470d) {
                this.f53862b.g();
            } else {
                LongVideoPlayActivity.a(this.f53862b).a(0);
            }
        }

        i(LongVideoPlayActivity longVideoPlayActivity) {
            this.f53862b = longVideoPlayActivity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/longvideo/LongVideoPlayActivity$videoAnimation$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class j extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53863a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LongVideoPlayActivity f53864b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f53865c;

        public final void onAnimationEnd(@NotNull Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f53863a, false, 56613, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f53863a, false, 56613, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            super.onAnimationEnd(animator);
            if (!this.f53865c) {
                this.f53864b.finish();
            }
        }

        j(LongVideoPlayActivity longVideoPlayActivity, boolean z) {
            this.f53864b = longVideoPlayActivity;
            this.f53865c = z;
        }
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f53842a, false, 56600, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53842a, false, 56600, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f53842a, false, 56601, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f53842a, false, 56601, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    private final int h() {
        if (PatchProxy.isSupport(new Object[0], this, f53842a, false, 56582, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f53842a, false, 56582, new Class[0], Integer.TYPE)).intValue();
        }
        Resources resources = getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    @NotNull
    public final ImageView a() {
        if (PatchProxy.isSupport(new Object[0], this, f53842a, false, 56533, new Class[0], ImageView.class)) {
            return (ImageView) PatchProxy.accessDispatch(new Object[0], this, f53842a, false, 56533, new Class[0], ImageView.class);
        }
        ImageView imageView = this.f53844c;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvPlay");
        }
        return imageView;
    }

    @NotNull
    public final View b() {
        if (PatchProxy.isSupport(new Object[0], this, f53842a, false, 56537, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f53842a, false, 56537, new Class[0], View.class);
        }
        View view = this.i;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVideoView");
        }
        return view;
    }

    @NotNull
    public final ImageView c() {
        if (PatchProxy.isSupport(new Object[0], this, f53842a, false, 56553, new Class[0], ImageView.class)) {
            return (ImageView) PatchProxy.accessDispatch(new Object[0], this, f53842a, false, 56553, new Class[0], ImageView.class);
        }
        ImageView imageView = this.q;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvRotate");
        }
        return imageView;
    }

    @NotNull
    public final FrameLayout d() {
        if (PatchProxy.isSupport(new Object[0], this, f53842a, false, 56561, new Class[0], FrameLayout.class)) {
            return (FrameLayout) PatchProxy.accessDispatch(new Object[0], this, f53842a, false, 56561, new Class[0], FrameLayout.class);
        }
        FrameLayout frameLayout = this.u;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverContainer");
        }
        return frameLayout;
    }

    @NotNull
    public final View e() {
        if (PatchProxy.isSupport(new Object[0], this, f53842a, false, 56563, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f53842a, false, 56563, new Class[0], View.class);
        }
        View view = this.v;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBgContainer");
        }
        return view;
    }

    @NotNull
    public final RelativeLayout f() {
        if (PatchProxy.isSupport(new Object[0], this, f53842a, false, 56565, new Class[0], RelativeLayout.class)) {
            return (RelativeLayout) PatchProxy.accessDispatch(new Object[0], this, f53842a, false, 56565, new Class[0], RelativeLayout.class);
        }
        RelativeLayout relativeLayout = this.w;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mToolContainer");
        }
        return relativeLayout;
    }

    public final void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f53842a, false, 56593, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53842a, false, 56593, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(0, C0906R.anim.cj);
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f53842a, false, 56587, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53842a, false, 56587, new Class[0], Void.TYPE);
            return;
        }
        bg.a(new com.ss.android.ugc.aweme.longvideo.a.a());
    }

    public final int getStatusBarColor() {
        if (!PatchProxy.isSupport(new Object[0], this, f53842a, false, 56575, new Class[0], Integer.TYPE)) {
            return getResources().getColor(C0906R.color.a7l);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f53842a, false, 56575, new Class[0], Integer.TYPE)).intValue();
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, f53842a, false, 56597, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53842a, false, 56597, new Class[0], Void.TYPE);
        } else if (!this.D) {
            ImageView imageView = this.f53845d;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            n();
            NoOperateModeController noOperateModeController = this.L;
            if (noOperateModeController == null) {
                Intrinsics.throwUninitializedPropertyAccessException("noOperationModeController");
            }
            noOperateModeController.f3470d = false;
        }
    }

    public final void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f53842a, false, 56591, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53842a, false, 56591, new Class[0], Void.TYPE);
            return;
        }
        if (this.D) {
            Rotate rotate = this.E;
            if (rotate != null) {
                rotate.b();
            }
        } else {
            b(false);
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f53842a, false, 56588, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53842a, false, 56588, new Class[0], Void.TYPE);
            return;
        }
        if (!this.D) {
            ImageView imageView = this.f53845d;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
        LinearLayout linearLayout = this.A;
        if (linearLayout != null) {
            ViewPropertyAnimator animate = linearLayout.animate();
            if (animate != null) {
                ViewPropertyAnimator alpha = animate.alpha(0.0f);
                if (alpha != null) {
                    ViewPropertyAnimator duration = alpha.setDuration(200);
                    if (duration != null) {
                        ViewPropertyAnimator withEndAction = duration.withEndAction(new b(this));
                        if (withEndAction != null) {
                            withEndAction.start();
                        }
                    }
                }
            }
        }
        LinearLayout linearLayout2 = this.z;
        if (linearLayout2 != null) {
            ViewPropertyAnimator animate2 = linearLayout2.animate();
            if (animate2 != null) {
                ViewPropertyAnimator alpha2 = animate2.alpha(0.34f);
                if (alpha2 != null) {
                    ViewPropertyAnimator duration2 = alpha2.setDuration(200);
                    if (duration2 != null) {
                        duration2.start();
                    }
                }
            }
        }
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f53842a, false, 56590, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53842a, false, 56590, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        com.ss.android.ugc.aweme.feed.d dVar = this.f53847f;
        if (dVar != null) {
            dVar.b();
        }
        this.O.clear();
        CommerceLikeLayout commerceLikeLayout = this.j;
        if (commerceLikeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCommerceLikeLayout");
        }
        commerceLikeLayout.a();
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f53842a, false, 56589, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53842a, false, 56589, new Class[0], Void.TYPE);
            return;
        }
        ImageView imageView = this.f53845d;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        LinearLayout linearLayout = this.z;
        if (linearLayout != null) {
            ViewPropertyAnimator animate = linearLayout.animate();
            if (animate != null) {
                ViewPropertyAnimator alpha = animate.alpha(1.0f);
                if (alpha != null) {
                    ViewPropertyAnimator duration = alpha.setDuration(200);
                    if (duration != null) {
                        duration.start();
                    }
                }
            }
        }
        if (!this.D) {
            LinearLayout linearLayout2 = this.A;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            LinearLayout linearLayout3 = this.A;
            if (linearLayout3 != null) {
                linearLayout3.setAlpha(0.0f);
            }
            LinearLayout linearLayout4 = this.A;
            if (linearLayout4 != null) {
                ViewPropertyAnimator animate2 = linearLayout4.animate();
                if (animate2 != null) {
                    ViewPropertyAnimator alpha2 = animate2.alpha(1.0f);
                    if (alpha2 != null) {
                        ViewPropertyAnimator duration2 = alpha2.setDuration(200);
                        if (duration2 != null) {
                            ViewPropertyAnimator withEndAction = duration2.withEndAction(c.f53850a);
                            if (withEndAction != null) {
                                withEndAction.start();
                            }
                        }
                    }
                }
            }
        }
    }

    public final void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f53842a, false, 56574, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53842a, false, 56574, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f53842a, false, 56576, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53842a, false, 56576, new Class[0], Void.TYPE);
            return;
        }
        Activity activity = this;
        if (com.ss.android.ugc.aweme.app.a.a.a(activity)) {
            if (PatchProxy.isSupport(new Object[0], this, f53842a, false, 56578, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53842a, false, 56578, new Class[0], Void.TYPE);
            } else {
                if (Build.VERSION.SDK_INT >= 21) {
                    Window window = getWindow();
                    Intrinsics.checkExpressionValueIsNotNull(window, "window");
                    window.setStatusBarColor(getStatusBarColor());
                } else if (Build.VERSION.SDK_INT >= 19) {
                    StatusBarUtils.setColor(activity, getStatusBarColor());
                }
                v.b(activity);
            }
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f53842a, false, 56577, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53842a, false, 56577, new Class[0], Void.TYPE);
            } else if (Build.VERSION.SDK_INT >= 21) {
                getWindow().setFlags(1024, 1024);
            } else {
                Window window2 = getWindow();
                Intrinsics.checkExpressionValueIsNotNull(window2, "window");
                View decorView = window2.getDecorView();
                Intrinsics.checkExpressionValueIsNotNull(decorView, "decorView");
                decorView.setSystemUiVisibility(1284);
            }
        }
    }

    @NotNull
    public final String a(boolean z2) {
        return this.G;
    }

    public final void setRootView(@Nullable View view) {
        this.f53843b = view;
    }

    public static final /* synthetic */ NoOperateModeController a(LongVideoPlayActivity longVideoPlayActivity) {
        NoOperateModeController noOperateModeController = longVideoPlayActivity.L;
        if (noOperateModeController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("noOperationModeController");
        }
        return noOperateModeController;
    }

    public final void setMBgContainer(@NotNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f53842a, false, 56564, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f53842a, false, 56564, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "<set-?>");
        this.v = view2;
    }

    public final void setMVideoView(@NotNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f53842a, false, 56538, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f53842a, false, 56538, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "<set-?>");
        this.i = view2;
    }

    public final Video a(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, f53842a, false, 56585, new Class[]{Aweme.class}, Video.class)) {
            return (Video) PatchProxy.accessDispatch(new Object[]{aweme2}, this, f53842a, false, 56585, new Class[]{Aweme.class}, Video.class);
        }
        j jVar = this.K;
        if (jVar != null) {
            return jVar.a(aweme2);
        }
        return null;
    }

    public final /* synthetic */ void a(Object obj) {
        Integer num;
        ar arVar = (ar) obj;
        if (PatchProxy.isSupport(new Object[]{arVar}, this, f53842a, false, 56532, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar}, this, f53842a, false, 56532, new Class[]{ar.class}, Void.TYPE);
            return;
        }
        User user = null;
        if (arVar != null) {
            num = Integer.valueOf(arVar.f45292b);
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            m a2 = m.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "NetworkStateManager.getInstance()");
            if (!a2.c()) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bgf).a();
                return;
            }
            Object obj2 = arVar.f45293c;
            if (obj2 != null) {
                Aweme aweme = (Aweme) obj2;
                if (aweme != null) {
                    user = aweme.getAuthor();
                }
                if (user != null) {
                    com.ss.android.ugc.aweme.feed.d dVar = this.f53847f;
                    if (dVar != null) {
                        dVar.h(aweme);
                    }
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            }
        }
    }

    public final void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f53842a, false, 56592, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f53842a, false, 56592, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        float f2 = 0.0f;
        if (z2) {
            View view = this.v;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBgContainer");
            }
            view.setAlpha(0.0f);
            FrameLayout frameLayout = this.x;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootContainer");
            }
            frameLayout.setAlpha(0.0f);
            RelativeLayout relativeLayout = this.w;
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
        View view2 = this.v;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBgContainer");
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(view2, "alpha", new float[]{f2, f3}).setDuration(250);
        FrameLayout frameLayout2 = this.x;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootContainer");
        }
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(frameLayout2, "alpha", new float[]{f2, f3}).setDuration(250);
        RelativeLayout relativeLayout2 = this.w;
        if (relativeLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mToolContainer");
        }
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(relativeLayout2, "alpha", new float[]{f2, f3}).setDuration(250);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(duration).with(duration2).with(duration3);
        animatorSet.start();
        animatorSet.addListener(new j(this, z2));
    }

    public final void onClick(@Nullable View view) {
        Integer num;
        if (PatchProxy.isSupport(new Object[]{view}, this, f53842a, false, 56586, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f53842a, false, 56586, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        g();
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C0906R.id.azy) {
            onBackPressed();
            return;
        }
        if (num != null && num.intValue() == C0906R.id.b02) {
            com.ss.android.ugc.aweme.feed.d dVar = this.f53847f;
            if (dVar != null) {
                dVar.a(new a.C0457a(this.f53846e).a());
            }
        } else if (num != null && num.intValue() == C0906R.id.b54) {
            com.ss.android.ugc.aweme.feed.d dVar2 = this.f53847f;
            if (dVar2 != null) {
                dVar2.a((Activity) this, this.f53846e);
            }
            Aweme aweme = this.f53846e;
            if (aweme != null) {
                new com.ss.android.ugc.aweme.u.h().e(this.G).f(this.G).f(aweme).i(com.ss.android.ugc.aweme.u.aa.a(aweme)).a(1).e();
            }
        } else if (num != null && num.intValue() == C0906R.id.b5t) {
            Rotate rotate = this.E;
            if (rotate != null) {
                rotate.b();
            }
        }
    }

    public final void onConfigurationChanged(@Nullable Configuration configuration) {
        Configuration configuration2 = configuration;
        if (PatchProxy.isSupport(new Object[]{configuration2}, this, f53842a, false, 56594, new Class[]{Configuration.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{configuration2}, this, f53842a, false, 56594, new Class[]{Configuration.class}, Void.TYPE);
            return;
        }
        Rotate rotate = this.E;
        if (rotate != null) {
            if (PatchProxy.isSupport(new Object[]{configuration2}, rotate, Rotate.f3473a, false, 56712, new Class[]{Configuration.class}, Void.TYPE)) {
                Rotate rotate2 = rotate;
                PatchProxy.accessDispatch(new Object[]{configuration2}, rotate2, Rotate.f3473a, false, 56712, new Class[]{Configuration.class}, Void.TYPE);
            } else if (configuration2 != null && configuration2.orientation == 1) {
                rotate.f3478f = false;
                rotate.a(false);
            } else if (configuration2 != null && configuration2.orientation == 2) {
                rotate.f3478f = true;
                rotate.a(true);
            }
        }
        super.onConfigurationChanged(configuration);
    }

    public final void onCreate(@Nullable Bundle bundle) {
        com.ss.android.ugc.aweme.longvideo.b.e eVar;
        Video video;
        int i2;
        int i3;
        int i4;
        UrlModel urlModel;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f53842a, false, 56579, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f53842a, false, 56579, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity", "onCreate", true);
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            if (window != null) {
                window.setNavigationBarColor(-16777216);
            }
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(SearchJediMixFeedAdapter.f42517f);
        }
        superOverridePendingTransition(C0906R.anim.ci, 0);
        setContentView((int) C0906R.layout.jl);
        if (PatchProxy.isSupport(new Object[0], this, f53842a, false, 56580, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53842a, false, 56580, new Class[0], Void.TYPE);
        } else {
            String stringExtra = getIntent().getStringExtra("extra_event_type");
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.G = stringExtra;
            this.H = getIntent().getIntExtra("extra_page_type", 0);
        }
        View findViewById = findViewById(C0906R.id.ci4);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.root_view)");
        this.s = (DoubleClickDiggFrameLayout) findViewById;
        this.h = new VideoViewComponent();
        VideoViewComponent videoViewComponent = this.h;
        if (videoViewComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVideoViewComponent");
        }
        DoubleClickDiggFrameLayout doubleClickDiggFrameLayout = this.s;
        if (doubleClickDiggFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        videoViewComponent.a((ViewGroup) doubleClickDiggFrameLayout);
        VideoViewComponent videoViewComponent2 = this.h;
        if (videoViewComponent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVideoViewComponent");
        }
        com.ss.android.ugc.playerkit.videoview.h hVar = videoViewComponent2.f4334b;
        Intrinsics.checkExpressionValueIsNotNull(hVar, "mVideoViewComponent.surfaceHolder");
        View a2 = hVar.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "mVideoViewComponent.surfaceHolder.view");
        this.i = a2;
        View findViewById2 = findViewById(C0906R.id.ww);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.commerce_like_layout)");
        this.j = (CommerceLikeLayout) findViewById2;
        this.f53845d = (ImageView) findViewById(C0906R.id.azy);
        View findViewById3 = findViewById(C0906R.id.dsu);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.video_seek_bar)");
        this.k = (VideoPlaySeekBar) findViewById3;
        View findViewById4 = findViewById(C0906R.id.b43);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.iv_play)");
        this.f53844c = (ImageView) findViewById4;
        View findViewById5 = findViewById(C0906R.id.b4c);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.iv_replay)");
        this.r = (ImageView) findViewById5;
        View findViewById6 = findViewById(C0906R.id.b0n);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "findViewById(R.id.iv_digg)");
        this.n = (LongVideoDiggAnimationView) findViewById6;
        View findViewById7 = findViewById(C0906R.id.b02);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "findViewById(R.id.iv_comment)");
        this.o = (ImageView) findViewById7;
        View findViewById8 = findViewById(C0906R.id.b54);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "findViewById(R.id.iv_share)");
        this.p = (ImageView) findViewById8;
        View findViewById9 = findViewById(C0906R.id.b5t);
        Intrinsics.checkExpressionValueIsNotNull(findViewById9, "findViewById(R.id.iv_switch_mode)");
        this.q = (ImageView) findViewById9;
        this.A = (LinearLayout) findViewById(C0906R.id.bv6);
        this.z = (LinearLayout) findViewById(C0906R.id.byn);
        this.B = (LineProgressBar) findViewById(C0906R.id.bym);
        this.C = (AudioControlView) findViewById(C0906R.id.gk);
        View findViewById10 = findViewById(C0906R.id.a1a);
        Intrinsics.checkExpressionValueIsNotNull(findViewById10, "findViewById(R.id.cover)");
        this.t = (AnimatedImageView) findViewById10;
        View findViewById11 = findViewById(C0906R.id.a1b);
        Intrinsics.checkExpressionValueIsNotNull(findViewById11, "findViewById(R.id.cover_container)");
        this.u = (FrameLayout) findViewById11;
        View findViewById12 = findViewById(C0906R.id.kc);
        Intrinsics.checkExpressionValueIsNotNull(findViewById12, "findViewById(R.id.bg_container)");
        this.v = findViewById12;
        View findViewById13 = findViewById(C0906R.id.d4b);
        Intrinsics.checkExpressionValueIsNotNull(findViewById13, "findViewById(R.id.tool_container)");
        this.w = (RelativeLayout) findViewById13;
        View findViewById14 = findViewById(C0906R.id.ag1);
        Intrinsics.checkExpressionValueIsNotNull(findViewById14, "findViewById(R.id.fl_root_container)");
        this.x = (FrameLayout) findViewById14;
        Context context = this;
        FrameLayout frameLayout = this.x;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootContainer");
        }
        View view = frameLayout;
        LinearLayout linearLayout = this.z;
        if (linearLayout != null) {
            this.y = new h(context, view, linearLayout);
            this.f53846e = e.a();
            if (PatchProxy.isSupport(new Object[0], this, f53842a, false, 56581, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53842a, false, 56581, new Class[0], Void.TYPE);
            } else {
                BottomSheetBehavior from = BottomSheetBehavior.from(findViewById(C0906R.id.ci4));
                if (from != null) {
                    this.g = (CustomBottomSheetBehavior) from;
                    CustomBottomSheetBehavior<View> customBottomSheetBehavior = this.g;
                    if (customBottomSheetBehavior != null) {
                        customBottomSheetBehavior.setBottomSheetCallback(new d(this));
                        customBottomSheetBehavior.setHideable(true);
                        if (!com.ss.android.ugc.aweme.app.a.a.a((Activity) this)) {
                            customBottomSheetBehavior.setPeekHeight(p.a(context) + h() + com.ss.android.ugc.aweme.profile.a.d(context));
                        } else {
                            customBottomSheetBehavior.setPeekHeight(p.a(context) + h());
                        }
                        customBottomSheetBehavior.setSkipCollapsed(true);
                        customBottomSheetBehavior.setState(3);
                    }
                    CustomBottomSheetBehavior<View> customBottomSheetBehavior2 = this.g;
                    if (customBottomSheetBehavior2 != null) {
                        customBottomSheetBehavior2.a(new e(this));
                    }
                    FrameLayout frameLayout2 = this.x;
                    if (frameLayout2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mRootContainer");
                    }
                    frameLayout2.postDelayed(new f(this), 50);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior<android.view.View!>");
                }
            }
            if (PatchProxy.isSupport(new Object[0], this, f53842a, false, 56583, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53842a, false, 56583, new Class[0], Void.TYPE);
            } else {
                o oVar = new o(true);
                this.K = j.f53966b;
                if (!NetworkUtils.isNetworkAvailable(context)) {
                    com.bytedance.ies.dmt.ui.d.a.b(context, (int) C0906R.string.bgg);
                }
                FragmentActivity fragmentActivity = this;
                this.J = com.ss.android.ugc.aweme.longvideo.b.a.f53877b.a(fragmentActivity, this.f53846e, this.G, this.H, 1);
                if (PatchProxy.isSupport(new Object[0], this, f53842a, false, 56584, new Class[0], com.ss.android.ugc.aweme.longvideo.b.e.class)) {
                    eVar = (com.ss.android.ugc.aweme.longvideo.b.e) PatchProxy.accessDispatch(new Object[0], this, f53842a, false, 56584, new Class[0], com.ss.android.ugc.aweme.longvideo.b.e.class);
                } else {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    WindowManager windowManager = getWindowManager();
                    Intrinsics.checkExpressionValueIsNotNull(windowManager, "windowManager");
                    windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                    eVar = com.ss.android.ugc.aweme.longvideo.b.d.f53893a.b(displayMetrics.widthPixels, p.e(context));
                }
                this.M = eVar;
                d.a aVar = com.ss.android.ugc.aweme.longvideo.b.d.f53893a;
                Activity activity = this;
                View view2 = this.i;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVideoView");
                }
                FrameLayout frameLayout3 = this.u;
                if (frameLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("coverContainer");
                }
                View view3 = frameLayout3;
                j jVar = this.K;
                if (jVar != null) {
                    video = jVar.a(this.f53846e);
                } else {
                    video = null;
                }
                aVar.a(activity, view2, view3, video, this.M, this.D);
                j jVar2 = this.K;
                VideoViewComponent videoViewComponent3 = this.h;
                if (videoViewComponent3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVideoViewComponent");
                }
                AnimatedImageView animatedImageView = this.t;
                if (animatedImageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCover");
                }
                ImageView imageView = this.r;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mIvReplay");
                }
                LongVideoPlayView longVideoPlayView = new LongVideoPlayView(this, jVar2, videoViewComponent3, animatedImageView, imageView, oVar);
                this.l = longVideoPlayView;
                LongVideoPlayView longVideoPlayView2 = this.l;
                if (longVideoPlayView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLongVideoPlayView");
                }
                Aweme aweme = this.f53846e;
                if (PatchProxy.isSupport(new Object[]{aweme}, longVideoPlayView2, LongVideoPlayView.f3452a, false, 56615, new Class[]{Aweme.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aweme}, longVideoPlayView2, LongVideoPlayView.f3452a, false, 56615, new Class[]{Aweme.class}, Void.TYPE);
                } else {
                    if (PatchProxy.isSupport(new Object[]{aweme}, longVideoPlayView2, LongVideoPlayView.f3452a, false, 56637, new Class[]{Aweme.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aweme}, longVideoPlayView2, LongVideoPlayView.f3452a, false, 56637, new Class[]{Aweme.class}, Void.TYPE);
                    } else {
                        longVideoPlayView2.g = aweme;
                        longVideoPlayView2.f3453b = new com.ss.android.ugc.aweme.newfollow.util.i(longVideoPlayView2.n, (com.ss.android.ugc.aweme.video.a.a) longVideoPlayView2, (com.ss.android.ugc.aweme.feed.d) null, longVideoPlayView2.m);
                        if (!o.v()) {
                            com.ss.android.ugc.aweme.newfollow.util.i iVar = longVideoPlayView2.f3453b;
                            if (iVar != null) {
                                iVar.f57422c = longVideoPlayView2.q;
                            }
                        }
                        com.ss.android.ugc.aweme.newfollow.util.i iVar2 = longVideoPlayView2.f3453b;
                        if (iVar2 != null) {
                            iVar2.a(longVideoPlayView2.g);
                        }
                        longVideoPlayView2.n.a(longVideoPlayView2.j);
                    }
                    AnimatedImageView animatedImageView2 = longVideoPlayView2.o;
                    if (animatedImageView2 != null) {
                        j jVar3 = longVideoPlayView2.m;
                        if (jVar3 != null) {
                            Video a3 = jVar3.a(aweme);
                            if (a3 != null) {
                                urlModel = a3.getOriginCover();
                                animatedImageView2.a(urlModel);
                            }
                        }
                        urlModel = null;
                        animatedImageView2.a(urlModel);
                    }
                }
                LongVideoPlayView longVideoPlayView3 = this.l;
                if (longVideoPlayView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLongVideoPlayView");
                }
                LongVideoPlayView.a gVar = new g(this);
                if (PatchProxy.isSupport(new Object[]{gVar}, longVideoPlayView3, LongVideoPlayView.f3452a, false, 56645, new Class[]{LongVideoPlayView.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{gVar}, longVideoPlayView3, LongVideoPlayView.f3452a, false, 56645, new Class[]{LongVideoPlayView.a.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(gVar, "view");
                    longVideoPlayView3.f3455d = gVar;
                    LongVideoPlayView.a aVar2 = longVideoPlayView3.f3455d;
                    if (aVar2 != null) {
                        View a4 = aVar2.a();
                        if (a4 != null) {
                            a4.setOnClickListener(longVideoPlayView3.k);
                        }
                    }
                }
                VideoPlaySeekBar videoPlaySeekBar = this.k;
                if (videoPlaySeekBar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVideoSeekBar");
                }
                LongVideoPlayView longVideoPlayView4 = this.l;
                if (longVideoPlayView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLongVideoPlayView");
                }
                this.m = new i(videoPlaySeekBar, longVideoPlayView4);
                i iVar3 = this.m;
                if (iVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLongVideoSeekView");
                }
                Video a5 = a(this.f53846e);
                if (a5 != null) {
                    i2 = a5.getDuration();
                } else {
                    i2 = 0;
                }
                iVar3.b(i2);
                LongVideoPlayView longVideoPlayView5 = this.l;
                if (longVideoPlayView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLongVideoPlayView");
                }
                i iVar4 = this.m;
                if (iVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLongVideoSeekView");
                }
                longVideoPlayView5.f3456e = iVar4;
                this.f53847f = new com.ss.android.ugc.aweme.feed.d(this.G, this.H, this, this);
                com.ss.android.ugc.aweme.feed.d dVar = this.f53847f;
                if (dVar != null) {
                    dVar.a(activity, null);
                }
                com.ss.android.ugc.aweme.feed.d dVar2 = this.f53847f;
                if (dVar2 != null) {
                    dVar2.a();
                }
                DoubleClickDiggFrameLayout doubleClickDiggFrameLayout2 = this.s;
                if (doubleClickDiggFrameLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRootView");
                }
                View view4 = doubleClickDiggFrameLayout2;
                View view5 = this.i;
                if (view5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVideoView");
                }
                this.E = new Rotate(fragmentActivity, view4, view5, a(this.f53846e));
                Rotate rotate = this.E;
                if (rotate != null) {
                    Rotate.a hVar2 = new h(this);
                    if (PatchProxy.isSupport(new Object[]{hVar2}, rotate, Rotate.f3473a, false, 56709, new Class[]{Rotate.a.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{hVar2}, rotate, Rotate.f3473a, false, 56709, new Class[]{Rotate.a.class}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(hVar2, "observer");
                        rotate.f3475c.add(hVar2);
                    }
                }
                Video a6 = a(this.f53846e);
                if (a6 != null) {
                    i3 = a6.getWidth();
                } else {
                    i3 = 0;
                }
                Video a7 = a(this.f53846e);
                if (a7 != null) {
                    i4 = a7.getHeight();
                } else {
                    i4 = 0;
                }
                if (!d.a.a(i3, i4)) {
                    ImageView imageView2 = this.q;
                    if (imageView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mIvRotate");
                    }
                    imageView2.setVisibility(8);
                }
                this.I = new LongVideoPlayMob(fragmentActivity, oVar);
                LongVideoPlayView longVideoPlayView6 = this.l;
                if (longVideoPlayView6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLongVideoPlayView");
                }
                LongVideoPlayMob longVideoPlayMob = this.I;
                if (longVideoPlayMob == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLongVideoPlayMob");
                }
                longVideoPlayView6.a((com.ss.android.ugc.aweme.video.a.a) longVideoPlayMob);
                i iVar5 = this.m;
                if (iVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLongVideoSeekView");
                }
                LongVideoPlayMob longVideoPlayMob2 = this.I;
                if (longVideoPlayMob2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLongVideoPlayMob");
                }
                iVar5.a((SeekBar.OnSeekBarChangeListener) longVideoPlayMob2);
                LongVideoDiggAnimationView longVideoDiggAnimationView = this.n;
                if (longVideoDiggAnimationView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mIvDigg");
                }
                this.F = new DiggView(longVideoDiggAnimationView, null, this.G);
                DiggView diggView = this.F;
                if (diggView != null) {
                    Aweme aweme2 = this.f53846e;
                    CommerceLikeLayout commerceLikeLayout = this.j;
                    if (commerceLikeLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCommerceLikeLayout");
                    }
                    diggView.a(fragmentActivity, aweme2, commerceLikeLayout, a(true));
                }
                DiggView diggView2 = this.F;
                if (diggView2 != null) {
                    LongVideoPlayMob longVideoPlayMob3 = this.I;
                    if (longVideoPlayMob3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mLongVideoPlayMob");
                    }
                    diggView2.a((DiggView.a) longVideoPlayMob3);
                }
                DoubleClickDiggFrameLayout doubleClickDiggFrameLayout3 = this.s;
                if (doubleClickDiggFrameLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRootView");
                }
                this.L = new NoOperateModeController(fragmentActivity, doubleClickDiggFrameLayout3);
                NoOperateModeController noOperateModeController = this.L;
                if (noOperateModeController == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("noOperationModeController");
                }
                noOperateModeController.a((NoOperateModeController.a) this);
                ImageView imageView3 = this.f53845d;
                if (imageView3 != null) {
                    imageView3.setOnClickListener(this);
                }
                ImageView imageView4 = this.o;
                if (imageView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCommentView");
                }
                View.OnClickListener onClickListener = this;
                imageView4.setOnClickListener(onClickListener);
                ImageView imageView5 = this.p;
                if (imageView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mShareView");
                }
                imageView5.setOnClickListener(onClickListener);
                ImageView imageView6 = this.q;
                if (imageView6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mIvRotate");
                }
                imageView6.setOnClickListener(onClickListener);
                DoubleClickDiggFrameLayout doubleClickDiggFrameLayout4 = this.s;
                if (doubleClickDiggFrameLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRootView");
                }
                doubleClickDiggFrameLayout4.setOnDiggListener(new i(this));
                LongVideoPlayView longVideoPlayView7 = this.l;
                if (longVideoPlayView7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLongVideoPlayView");
                }
                com.ss.android.ugc.aweme.feed.d dVar3 = this.f53847f;
                LongVideoPlayView longVideoPlayView8 = this.l;
                if (longVideoPlayView8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLongVideoPlayView");
                }
                d aVar3 = new com.ss.android.ugc.aweme.longvideo.feature.a(dVar3, longVideoPlayView8, oVar);
                if (PatchProxy.isSupport(new Object[]{aVar3}, longVideoPlayView7, LongVideoPlayView.f3452a, false, 56646, new Class[]{d.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aVar3}, longVideoPlayView7, LongVideoPlayView.f3452a, false, 56646, new Class[]{d.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(aVar3, "interceptor");
                    longVideoPlayView7.f3457f.add(aVar3);
                }
                LoadingController loadingController = new LoadingController(fragmentActivity, this.B);
                LongVideoPlayView longVideoPlayView9 = this.l;
                if (longVideoPlayView9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLongVideoPlayView");
                }
                longVideoPlayView9.a((com.ss.android.ugc.aweme.video.a.a) loadingController);
                VolumeController volumeController = new VolumeController(fragmentActivity, this.C);
                CommerceLikeLayout commerceLikeLayout2 = this.j;
                if (commerceLikeLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCommerceLikeLayout");
                }
                commerceLikeLayout2.setCommerceDigg(this.f53846e);
                com.ss.android.ugc.aweme.base.activity.a aVar4 = volumeController;
                if (PatchProxy.isSupport(new Object[]{aVar4}, this, f53842a, false, 56595, new Class[]{com.ss.android.ugc.aweme.base.activity.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aVar4}, this, f53842a, false, 56595, new Class[]{com.ss.android.ugc.aweme.base.activity.a.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(aVar4, "listener");
                    this.O.add(aVar4);
                }
            }
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity", "onCreate", false);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
    }

    public final boolean onKeyDown(int i2, @Nullable KeyEvent keyEvent) {
        KeyEvent keyEvent2 = keyEvent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), keyEvent2}, this, f53842a, false, 56596, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), keyEvent2}, this, f53842a, false, 56596, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!isViewValid()) {
            return false;
        } else {
            Iterator<com.ss.android.ugc.aweme.base.activity.a> it2 = this.O.iterator();
            while (it2.hasNext()) {
                if (it2.next().a(i2, keyEvent2)) {
                    return true;
                }
            }
            int i3 = i2;
            return super.onKeyDown(i2, keyEvent);
        }
    }
}
