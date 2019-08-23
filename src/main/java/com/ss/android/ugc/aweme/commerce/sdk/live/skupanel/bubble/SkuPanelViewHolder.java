package com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ali.auth.third.core.context.KernelContext;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelAdapter;
import com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.a;
import com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c;
import com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.view.SkuCouponItemLayout;
import com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.view.SkuPanelCouponFoldButton;
import com.ss.android.ugc.aweme.commerce.sdk.widget.ReductionTextView;
import com.ss.android.ugc.aweme.commerce.service.l.g;
import com.ss.android.ugc.aweme.commerce.service.l.h;
import com.ss.android.ugc.aweme.commerce.service.models.PromotionAppointment;
import com.ss.android.ugc.aweme.commerce.service.models.PromotionPreSale;
import com.ss.android.ugc.aweme.commerce.service.models.ai;
import com.ss.android.ugc.aweme.commerce.service.widgets.InterceptTouchLinearLayout;
import com.ss.android.ugc.aweme.commerce.service.widgets.PriceView;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 ä\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002ä\u0001B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\u0001\u001a\u00030\u00012\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u001d0NH\u0002J<\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030 \u00012\u0007\u0010¡\u0001\u001a\u00020\u00102\u0007\u0010¢\u0001\u001a\u00020W2\n\u0010£\u0001\u001a\u0005\u0018\u00010¤\u00012\b\u0010¥\u0001\u001a\u00030¦\u0001H\u0002JA\u0010§\u0001\u001a\u00030\u00012\u0007\u0010¨\u0001\u001a\u00020B2\u0007\u0010©\u0001\u001a\u00020\u001d2\u0007\u0010ª\u0001\u001a\u00020G2\t\u0010«\u0001\u001a\u0004\u0018\u00010<2\t\u0010¬\u0001\u001a\u0004\u0018\u00010dH\u0002¢\u0006\u0003\u0010­\u0001J&\u0010®\u0001\u001a\b\u0012\u0004\u0012\u00020\u001d0A2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020B0N2\u0007\u0010¯\u0001\u001a\u00020\u001dH\u0002J \u0010°\u0001\u001a\u00020\u001d2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020<0N2\u0007\u0010¯\u0001\u001a\u00020\u001dH\u0002J\u0015\u0010±\u0001\u001a\u00030\u00012\t\u0010²\u0001\u001a\u0004\u0018\u00010\u001dH\u0016J\u001c\u0010³\u0001\u001a\u00030\u00012\u0007\u0010¯\u0001\u001a\u00020\u001d2\u0007\u0010´\u0001\u001a\u00020dH\u0016J'\u0010µ\u0001\u001a\u00030\u00012\u0007\u0010¯\u0001\u001a\u00020\u001d2\u0007\u0010¶\u0001\u001a\u00020d2\t\u0010·\u0001\u001a\u0004\u0018\u00010<H\u0016J8\u0010¸\u0001\u001a\u00030\u00012\b\u0010²\u0001\u001a\u00030¹\u00012\u0007\u0010º\u0001\u001a\u00020G2\u0007\u0010»\u0001\u001a\u00020G2\u0007\u0010¼\u0001\u001a\u00020G2\u0007\u0010½\u0001\u001a\u00020GH\u0016J\u0007\u0010c\u001a\u00030\u0001J\b\u0010¾\u0001\u001a\u00030\u0001J\b\u0010¿\u0001\u001a\u00030\u0001J(\u0010À\u0001\u001a\u00030\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\u0007\u0010¯\u0001\u001a\u00020\u001d2\u0007\u0010¢\u0001\u001a\u00020WH\u0002J*\u0010Á\u0001\u001a\u00030\u00012\f\u0010@\u001a\b\u0012\u0004\u0012\u00020B0N2\u0007\u0010Â\u0001\u001a\u00020d2\u0007\u0010Ã\u0001\u001a\u00020GH\u0002J\u0013\u0010Ä\u0001\u001a\u00030\u00012\u0007\u0010Å\u0001\u001a\u00020dH\u0002J\u0013\u0010Æ\u0001\u001a\u00030\u00012\u0007\u0010Ç\u0001\u001a\u00020dH\u0002J\u001d\u0010È\u0001\u001a\u00030\u00012\b\u0010É\u0001\u001a\u00030¹\u00012\u0007\u0010Ê\u0001\u001a\u00020GH\u0002J\u0013\u0010Ë\u0001\u001a\u00030\u00012\t\u0010Ì\u0001\u001a\u0004\u0018\u00010ZJ\u001e\u0010Í\u0001\u001a\u00030\u00012\b\u0010Î\u0001\u001a\u00030Ï\u00012\b\u0010Ð\u0001\u001a\u00030Ï\u0001H\u0002J\u001e\u0010Ñ\u0001\u001a\u00030\u00012\b\u0010Î\u0001\u001a\u00030Ï\u00012\b\u0010Ò\u0001\u001a\u00030Ï\u0001H\u0002J<\u0010Ó\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030 \u00012\u0007\u0010¡\u0001\u001a\u00020\u00102\u0007\u0010¢\u0001\u001a\u00020W2\n\u0010£\u0001\u001a\u0005\u0018\u00010¤\u00012\b\u0010¥\u0001\u001a\u00030¦\u0001H\u0002J(\u0010Ô\u0001\u001a\u00030\u00012\b\u0010Õ\u0001\u001a\u00030Ö\u00012\u0007\u0010×\u0001\u001a\u00020G2\t\u0010«\u0001\u001a\u0004\u0018\u00010<H\u0002JI\u0010Ø\u0001\u001a\u00030\u00012\t\u0010Ù\u0001\u001a\u0004\u0018\u00010<2\t\u0010Ú\u0001\u001a\u0004\u0018\u00010<2\u0007\u0010Û\u0001\u001a\u00020W2\b\u0010\u0001\u001a\u00030 \u00012\n\u0010£\u0001\u001a\u0005\u0018\u00010¤\u00012\b\u0010¥\u0001\u001a\u00030¦\u0001H\u0002JG\u0010Ü\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030 \u00012\t\u0010Û\u0001\u001a\u0004\u0018\u00010W2\u0007\u0010Ý\u0001\u001a\u00020G2\u0007\u0010Þ\u0001\u001a\u00020G2\n\u0010£\u0001\u001a\u0005\u0018\u00010¤\u00012\b\u0010¥\u0001\u001a\u00030¦\u0001H\u0007J\u0011\u0010ß\u0001\u001a\u00030\u00012\u0007\u0010¢\u0001\u001a\u00020WJ7\u0010à\u0001\u001a\u00030\u00012\u0007\u0010¨\u0001\u001a\u00020B2\u0007\u0010©\u0001\u001a\u00020\u001d2\u0007\u0010á\u0001\u001a\u00020G2\u0007\u0010â\u0001\u001a\u00020G2\u0007\u0010ã\u0001\u001a\u00020dH\u0002R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0015\u0010\fR\u001b\u0010\u0017\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b \u0010\u000e\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010!\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b#\u0010\u000e\u001a\u0004\b\"\u0010\fR\u001b\u0010$\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b&\u0010\u000e\u001a\u0004\b%\u0010\fR\u0010\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010)\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b+\u0010\u000e\u001a\u0004\b*\u0010\u001fR\u001b\u0010,\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b.\u0010\u000e\u001a\u0004\b-\u0010\u001fR\u001b\u0010/\u001a\u0002008BX\u0002¢\u0006\f\n\u0004\b3\u0010\u000e\u001a\u0004\b1\u00102R\u001b\u00104\u001a\u0002008BX\u0002¢\u0006\f\n\u0004\b6\u0010\u000e\u001a\u0004\b5\u00102R\u001b\u00107\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b9\u0010\u000e\u001a\u0004\b8\u0010\u0012R\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010=\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b?\u0010\u000e\u001a\u0004\b>\u0010\u0012R\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020B0AX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010C\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\bE\u0010\u000e\u001a\u0004\bD\u0010\u001fR\u000e\u0010F\u001a\u00020GX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010H\u001a\u00020I8BX\u0002¢\u0006\f\n\u0004\bL\u0010\u000e\u001a\u0004\bJ\u0010KR\u0016\u0010M\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010NX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010O\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\bQ\u0010\u000e\u001a\u0004\bP\u0010\u001fR\u0010\u0010R\u001a\u0004\u0018\u00010<X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010S\u001a\u0002008BX\u0002¢\u0006\f\n\u0004\bU\u0010\u000e\u001a\u0004\bT\u00102R\u0010\u0010V\u001a\u0004\u0018\u00010WX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020GX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010Y\u001a\u0004\u0018\u00010ZX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020GXD¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010]\u001a\u0002008BX\u0002¢\u0006\f\n\u0004\b_\u0010\u000e\u001a\u0004\b^\u00102R\u001b\u0010`\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\bb\u0010\u000e\u001a\u0004\ba\u0010\u001fR\u000e\u0010c\u001a\u00020dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010f\u001a\u00020g8BX\u0002¢\u0006\f\n\u0004\bj\u0010\u000e\u001a\u0004\bh\u0010iR\u001b\u0010k\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\bm\u0010\u000e\u001a\u0004\bl\u0010\u0012R\u001b\u0010n\u001a\u00020g8BX\u0002¢\u0006\f\n\u0004\bp\u0010\u000e\u001a\u0004\bo\u0010iR\u001b\u0010q\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\bs\u0010\u000e\u001a\u0004\br\u0010\u0012R\u001b\u0010t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\bv\u0010\u000e\u001a\u0004\bu\u0010\fR\u001b\u0010w\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\by\u0010\u000e\u001a\u0004\bx\u0010\fR\u001b\u0010z\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b|\u0010\u000e\u001a\u0004\b{\u0010\u001fR\u001b\u0010}\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u0010\u000e\u001a\u0004\b~\u0010\fR\u001e\u0010\u0001\u001a\u00020\n8BX\u0002¢\u0006\u000e\n\u0005\b\u0001\u0010\u000e\u001a\u0005\b\u0001\u0010\fR\u001e\u0010\u0001\u001a\u00020\n8BX\u0002¢\u0006\u000e\n\u0005\b\u0001\u0010\u000e\u001a\u0005\b\u0001\u0010\fR\u001e\u0010\u0001\u001a\u00020\u00108BX\u0002¢\u0006\u000e\n\u0005\b\u0001\u0010\u000e\u001a\u0005\b\u0001\u0010\u0012R\u000f\u0010\u0001\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0001\u001a\u00020\n8BX\u0002¢\u0006\u000e\n\u0005\b\u0001\u0010\u000e\u001a\u0005\b\u0001\u0010\fR\u000f\u0010\u0001\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0001\u001a\u00020\u00108BX\u0002¢\u0006\u000e\n\u0005\b\u0001\u0010\u000e\u001a\u0005\b\u0001\u0010\u0012R\u001e\u0010\u0001\u001a\u00020\u001d8BX\u0002¢\u0006\u000e\n\u0005\b\u0001\u0010\u000e\u001a\u0005\b\u0001\u0010\u001fR\u0012\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0001\u001a\u00020\u00108BX\u0002¢\u0006\u000e\n\u0005\b\u0001\u0010\u000e\u001a\u0005\b\u0001\u0010\u0012R\u000f\u0010\u0001\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0001\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006å\u0001"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/bubble/SkuPanelViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/view/SkuPanelCouponFoldButton$OnButtonClickListener;", "Landroid/view/View$OnClickListener;", "Landroid/support/v4/widget/NestedScrollView$OnScrollChangeListener;", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/view/SkuCouponItemLayout$IOnVisibleStateChangeListener;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "addCart", "Landroid/widget/TextView;", "getAddCart", "()Landroid/widget/TextView;", "addCart$delegate", "Lkotlin/Lazy;", "addSecKillButton", "Landroid/widget/LinearLayout;", "getAddSecKillButton", "()Landroid/widget/LinearLayout;", "addSecKillButton$delegate", "appointItNow", "getAppointItNow", "appointItNow$delegate", "avatar", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "getAvatar", "()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "avatar$delegate", "avatarArea", "Landroid/view/View;", "getAvatarArea", "()Landroid/view/View;", "avatarArea$delegate", "buyItNow", "getBuyItNow", "buyItNow$delegate", "buyOriginalButton", "getBuyOriginalButton", "buyOriginalButton$delegate", "clockListener", "Lcom/ss/android/ugc/aweme/commerce/service/utils/SecKillClock$ClockListener;", "consultView", "getConsultView", "consultView$delegate", "consultViewEmpty", "getConsultViewEmpty", "consultViewEmpty$delegate", "coupon1TextView", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "getCoupon1TextView", "()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "coupon1TextView$delegate", "coupon2TextView", "getCoupon2TextView", "coupon2TextView$delegate", "couponEntranceLayout", "getCouponEntranceLayout", "couponEntranceLayout$delegate", "couponHasShowIdSet", "", "", "couponLinearLayout", "getCouponLinearLayout", "couponLinearLayout$delegate", "couponList", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/UICouponModel;", "couponParentLayout", "getCouponParentLayout", "couponParentLayout$delegate", "currentStatus", "", "foldCouponFloorButton", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/view/SkuPanelCouponFoldButton;", "getFoldCouponFloorButton", "()Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/view/SkuPanelCouponFoldButton;", "foldCouponFloorButton$delegate", "fullReductionList", "", "lineBelowCouponView", "getLineBelowCouponView", "lineBelowCouponView$delegate", "listenerKey", "mPostFreeLabelTextView", "getMPostFreeLabelTextView", "mPostFreeLabelTextView$delegate", "mProduct", "Lcom/ss/android/ugc/aweme/commerce/service/models/UISkuInfo;", "mScreenWidth", "mSkuPanelItemHandler", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/bubble/SkuPanelAdapter$ISkuPanelItemHandler;", "maxAnimCouponCount", "minusBtn", "noProductHintTextView", "getNoProductHintTextView", "noProductHintTextView$delegate", "noStockHintLayout", "getNoStockHintLayout", "noStockHintLayout$delegate", "onViewAttachedToWindow", "", "plusBtn", "popMarketPriceView", "Lcom/ss/android/ugc/aweme/commerce/service/widgets/PriceView;", "getPopMarketPriceView", "()Lcom/ss/android/ugc/aweme/commerce/service/widgets/PriceView;", "popMarketPriceView$delegate", "popPriceContainer", "getPopPriceContainer", "popPriceContainer$delegate", "popPriceView", "getPopPriceView", "popPriceView$delegate", "preSaleButton", "getPreSaleButton", "preSaleButton$delegate", "preSaleDeliveryInfo", "getPreSaleDeliveryInfo", "preSaleDeliveryInfo$delegate", "preSaleView", "getPreSaleView", "preSaleView$delegate", "productSummaryLayout", "getProductSummaryLayout", "productSummaryLayout$delegate", "secKillCardTitleTv", "getSecKillCardTitleTv", "secKillCardTitleTv$delegate", "secKillEndTime", "getSecKillEndTime", "secKillEndTime$delegate", "secKillStartTimeTv", "getSecKillStartTimeTv", "secKillStartTimeTv$delegate", "secKillTitleContainer", "getSecKillTitleContainer", "secKillTitleContainer$delegate", "selectCount", "selectPopTitle", "getSelectPopTitle", "selectPopTitle$delegate", "skuBoxLayout", "skuPanelBottomLayout", "getSkuPanelBottomLayout", "skuPanelBottomLayout$delegate", "skuParentLayout", "getSkuParentLayout", "skuParentLayout$delegate", "skuTracer", "Lcom/ss/android/ugc/aweme/commerce/service/sku/SkuLogic;", "specAndCouponLinearLayout", "getSpecAndCouponLinearLayout", "specAndCouponLinearLayout$delegate", "specItemLayout", "userLimitTxt", "addCouponViewListToLayout", "", "viewList", "checkVirtualProduct", "fragment", "Landroid/support/v4/app/Fragment;", "skuBox", "good", "anchorInfo", "Lcom/ss/android/ugc/aweme/profile/model/User;", "adapter", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/bubble/SkuPanelAdapter;", "couponProcess", "couponModel", "itemView", "statusCode", "statusMsg", "continueApply", "(Lcom/ss/android/ugc/aweme/commerce/service/models/UICouponModel;Landroid/view/View;ILjava/lang/String;Ljava/lang/Boolean;)V", "createCouponViewList", "view", "createReductionView", "onClick", "v", "onClickCouponButton", "buttonUnfold", "onCouponVisibleChanged", "visible", "couponId", "onScrollChange", "Landroid/support/v4/widget/NestedScrollView;", "scrollX", "scrollY", "oldScrollX", "oldScrollY", "onViewDetachedFromWindow", "onViewRecycled", "purseProduct", "refreshCouponList", "isShow", "targetDistance", "refreshProductSummaryLayoutMarginBottom", "hasCoupon", "refreshSkuPanelLayoutMargin", "preSecKill", "restoreSpecAndCouponPosition", "scrollView", "targetPos", "setSkuPanelItemHandler", "skuPanelItemHandler", "showPreSecKill", "currentMill", "", "beginMill", "showSecKillView", "endMill", "showSkuArea", "showToast", "context", "Landroid/content/Context;", "msgId", "skuCheck", "promotionId", "productId", "product", "update", "position", "itemCount", "updateAppointmentStatus", "updateCoupon", "colorId", "stringId", "isEnable", "Companion", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class SkuPanelViewHolder extends RecyclerView.ViewHolder implements NestedScrollView.OnScrollChangeListener, View.OnClickListener, SkuCouponItemLayout.a, SkuPanelCouponFoldButton.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37767a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f37768b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "specAndCouponLinearLayout", "getSpecAndCouponLinearLayout()Landroid/widget/LinearLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "couponEntranceLayout", "getCouponEntranceLayout()Landroid/widget/LinearLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "lineBelowCouponView", "getLineBelowCouponView()Landroid/view/View;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "foldCouponFloorButton", "getFoldCouponFloorButton()Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/view/SkuPanelCouponFoldButton;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "couponParentLayout", "getCouponParentLayout()Landroid/view/View;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "couponLinearLayout", "getCouponLinearLayout()Landroid/widget/LinearLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "coupon1TextView", "getCoupon1TextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "coupon2TextView", "getCoupon2TextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "avatarArea", "getAvatarArea()Landroid/view/View;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "productSummaryLayout", "getProductSummaryLayout()Landroid/view/View;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "avatar", "getAvatar()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "selectPopTitle", "getSelectPopTitle()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "preSaleView", "getPreSaleView()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "popPriceView", "getPopPriceView()Lcom/ss/android/ugc/aweme/commerce/service/widgets/PriceView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "popPriceContainer", "getPopPriceContainer()Landroid/widget/LinearLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "buyItNow", "getBuyItNow()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "appointItNow", "getAppointItNow()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "preSaleButton", "getPreSaleButton()Landroid/widget/LinearLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "preSaleDeliveryInfo", "getPreSaleDeliveryInfo()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "addCart", "getAddCart()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "popMarketPriceView", "getPopMarketPriceView()Lcom/ss/android/ugc/aweme/commerce/service/widgets/PriceView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "secKillTitleContainer", "getSecKillTitleContainer()Landroid/widget/LinearLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "secKillEndTime", "getSecKillEndTime()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "addSecKillButton", "getAddSecKillButton()Landroid/widget/LinearLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "skuPanelBottomLayout", "getSkuPanelBottomLayout()Landroid/widget/LinearLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "buyOriginalButton", "getBuyOriginalButton()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "secKillCardTitleTv", "getSecKillCardTitleTv()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "secKillStartTimeTv", "getSecKillStartTimeTv()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "consultView", "getConsultView()Landroid/view/View;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "consultViewEmpty", "getConsultViewEmpty()Landroid/view/View;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "skuParentLayout", "getSkuParentLayout()Landroid/view/View;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "noProductHintTextView", "getNoProductHintTextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "mPostFreeLabelTextView", "getMPostFreeLabelTextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkuPanelViewHolder.class), "noStockHintLayout", "getNoStockHintLayout()Landroid/view/View;"))};
    public static final a q = new a((byte) 0);
    private View A;
    private final Lazy B;
    private final Lazy C;
    private final Lazy D;
    private final Lazy E;
    private final Lazy F;
    private final Lazy G;
    private final Lazy H;
    private final Lazy I;
    private final Lazy J;
    private final Lazy K;
    private final Lazy L;
    private final Lazy M;
    private final Lazy N;
    private final Lazy O;
    private final Lazy P;
    private final Lazy Q;
    private final Lazy R;
    private final Lazy S;
    private final Lazy T;
    private final Lazy U;
    private final Lazy V;
    private final Lazy W;
    private final Lazy X;
    private final Lazy Y;
    private final Lazy Z;
    private final Lazy aa;
    private final Lazy ab;
    private final Set<String> ac;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f37769c;

    /* renamed from: d  reason: collision with root package name */
    final Lazy f37770d;

    /* renamed from: e  reason: collision with root package name */
    final Lazy f37771e;

    /* renamed from: f  reason: collision with root package name */
    final Lazy f37772f;
    final Lazy g;
    public com.ss.android.ugc.aweme.commerce.service.k.a h;
    public SkuPanelAdapter.b i;
    public List<com.ss.android.ugc.aweme.commerce.service.models.aj> j;
    public List<String> k;
    public com.ss.android.ugc.aweme.commerce.service.models.ak l;
    public String m;
    public h.a n;
    public int o;
    boolean p;
    private final int r = 4;
    private final int s;
    private final Lazy t;
    private final Lazy u;
    private final Lazy v;
    private View w;
    private View x;
    private final TextView y;
    private final TextView z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/bubble/SkuPanelViewHolder$Companion;", "", "()V", "PRE_SEC_KILL", "", "SEC_KILL", "SEC_KILL_END", "UNDEFINED", "VALUE_11", "", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class aa extends Lambda implements Function0<LinearLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final LinearLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29432, new Class[0], LinearLayout.class)) {
                return (LinearLayout) this.this$0.itemView.findViewById(C0906R.id.c4w);
            }
            return (LinearLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29432, new Class[0], LinearLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ab extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ab(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29433, new Class[0], TextView.class)) {
                return (TextView) this.this$0.itemView.findViewById(C0906R.id.c50);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29433, new Class[0], TextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ac extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ac(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29434, new Class[0], TextView.class)) {
                return (TextView) this.this$0.itemView.findViewById(C0906R.id.dgj);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29434, new Class[0], TextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ad extends Lambda implements Function0<View> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ad(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final View invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29435, new Class[0], View.class)) {
                return this.this$0.itemView.findViewById(C0906R.id.b9x);
            }
            return (View) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29435, new Class[0], View.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "count", "", "newSku", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ae extends Lambda implements Function2<Integer, String, Unit> {
        public static final ae INSTANCE = new ae();
        public static ChangeQuickRedirect changeQuickRedirect;

        ae() {
            super(2);
        }

        public final void invoke(int i, @Nullable String str) {
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Number) obj).intValue(), (String) obj2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class af implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37773a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SkuPanelViewHolder f37774b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewParent f37775c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f37776d;

        af(SkuPanelViewHolder skuPanelViewHolder, ViewParent viewParent, int i) {
            this.f37774b = skuPanelViewHolder;
            this.f37775c = viewParent;
            this.f37776d = i;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f37773a, false, 29436, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37773a, false, 29436, new Class[0], Void.TYPE);
                return;
            }
            this.f37774b.a((NestedScrollView) this.f37775c, this.f37776d);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class ag implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37777a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NestedScrollView f37778b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f37779c;

        ag(NestedScrollView nestedScrollView, int i) {
            this.f37778b = nestedScrollView;
            this.f37779c = i;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f37777a, false, 29437, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37777a, false, 29437, new Class[0], Void.TYPE);
                return;
            }
            this.f37778b.scrollTo(0, this.f37779c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ah extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ah(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29438, new Class[0], TextView.class)) {
                return (TextView) this.this$0.itemView.findViewById(C0906R.id.cm5);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29438, new Class[0], TextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ai extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ai(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29439, new Class[0], TextView.class)) {
                return (TextView) this.this$0.itemView.findViewById(C0906R.id.cm6);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29439, new Class[0], TextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class aj extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aj(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29440, new Class[0], TextView.class)) {
                return (TextView) this.this$0.itemView.findViewById(C0906R.id.cm7);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29440, new Class[0], TextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ak extends Lambda implements Function0<LinearLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ak(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final LinearLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29441, new Class[0], LinearLayout.class)) {
                return (LinearLayout) this.this$0.itemView.findViewById(C0906R.id.cm9);
            }
            return (LinearLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29441, new Class[0], LinearLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class al extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        al(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29442, new Class[0], TextView.class)) {
                return (TextView) this.this$0.itemView.findViewById(C0906R.id.cnc);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29442, new Class[0], TextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class am implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37780a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SkuPanelViewHolder f37781b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commerce.service.models.ak f37782c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Fragment f37783d;

        am(SkuPanelViewHolder skuPanelViewHolder, com.ss.android.ugc.aweme.commerce.service.models.ak akVar, Fragment fragment) {
            this.f37781b = skuPanelViewHolder;
            this.f37782c = akVar;
            this.f37783d = fragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37780a, false, 29443, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37780a, false, 29443, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            SkuPanelAdapter.b bVar = this.f37781b.i;
            if (bVar != null) {
                com.ss.android.ugc.aweme.commerce.service.models.ak akVar = this.f37782c;
                View view2 = this.f37781b.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                Context context = view2.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
                bVar.a(akVar, context, this.f37783d, 2, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class an extends Lambda implements Function1<Boolean, Unit> {
        public static final an INSTANCE = new an();
        public static ChangeQuickRedirect changeQuickRedirect;

        an() {
            super(1);
        }

        public final void invoke(boolean z) {
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class ao implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37784a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SkuPanelViewHolder f37785b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f37786c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commerce.service.models.ak f37787d;

        ao(SkuPanelViewHolder skuPanelViewHolder, boolean z, com.ss.android.ugc.aweme.commerce.service.models.ak akVar) {
            this.f37785b = skuPanelViewHolder;
            this.f37786c = z;
            this.f37787d = akVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37784a, false, 29444, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37784a, false, 29444, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (this.f37786c) {
                Intrinsics.checkExpressionValueIsNotNull(view, AdvanceSetting.NETWORK_TYPE);
                UIUtils.displayToast(view.getContext(), (int) C0906R.string.ys);
                return;
            }
            com.ss.android.ugc.aweme.commerce.service.k.a aVar = this.f37785b.h;
            if (aVar != null) {
                aVar.a((Function4<? super Integer, ? super String, ? super Rect, ? super Bitmap, Unit>) new Function4<Integer, String, Rect, Bitmap, Unit>(this) {
                    public static ChangeQuickRedirect changeQuickRedirect;
                    final /* synthetic */ ao this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        invoke(((Number) obj).intValue(), (String) obj2, (Rect) obj3, (Bitmap) obj4);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int i, @Nullable String str, @Nullable Rect rect, @Nullable Bitmap bitmap) {
                        Bitmap bitmap2 = bitmap;
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, rect, bitmap2}, this, changeQuickRedirect, false, 29445, new Class[]{Integer.TYPE, String.class, Rect.class, Bitmap.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, rect, bitmap2}, this, changeQuickRedirect, false, 29445, new Class[]{Integer.TYPE, String.class, Rect.class, Bitmap.class}, Void.TYPE);
                            return;
                        }
                        int[] iArr = new int[2];
                        this.this$0.f37785b.g().getLocationOnScreen(iArr);
                        Rect rect2 = new Rect(iArr[0], iArr[1], iArr[0] + this.this$0.f37785b.g().getWidth(), iArr[1] + this.this$0.f37785b.g().getHeight());
                        SkuPanelAdapter.b bVar = this.this$0.f37785b.i;
                        if (bVar != null) {
                            int i2 = i;
                            bVar.a(i, rect2, bitmap2);
                        }
                    }
                });
            }
            SkuPanelAdapter.b bVar = this.f37785b.i;
            if (bVar != null) {
                bVar.b(this.f37787d);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class ap implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37788a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SkuPanelViewHolder f37789b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commerce.service.models.ak f37790c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ User f37791d;

        ap(SkuPanelViewHolder skuPanelViewHolder, com.ss.android.ugc.aweme.commerce.service.models.ak akVar, User user) {
            this.f37789b = skuPanelViewHolder;
            this.f37790c = akVar;
            this.f37791d = user;
        }

        public final void onClick(View view) {
            boolean z;
            String str;
            String str2;
            int i;
            if (PatchProxy.isSupport(new Object[]{view}, this, f37788a, false, 29446, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37788a, false, 29446, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            PromotionAppointment promotionAppointment = this.f37790c.v;
            if (promotionAppointment != null) {
                z = promotionAppointment.isAppointment();
            } else {
                z = false;
            }
            booleanRef.element = z;
            com.ss.android.ugc.aweme.commerce.service.logs.o oVar = new com.ss.android.ugc.aweme.commerce.service.logs.o();
            oVar.f38146f = "pop_up_card";
            if (booleanRef.element) {
                str = "cancel_presale";
            } else {
                str = "presale";
            }
            oVar.g = str;
            oVar.h = String.valueOf(this.f37790c.j);
            oVar.i = this.f37790c.f38190d;
            User user = this.f37791d;
            if (user != null) {
                str2 = user.getUid();
            } else {
                str2 = null;
            }
            oVar.j = str2;
            oVar.b();
            com.ss.android.ugc.aweme.commerce.sdk.b.a aVar = com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e;
            Context context = KernelContext.context;
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            String str3 = this.f37790c.f38190d;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = this.f37790c.G;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = this.f37790c.F;
            if (str5 == null) {
                str5 = "";
            }
            if (booleanRef.element) {
                i = 2;
            } else {
                i = 1;
            }
            Function1 r0 = new Function1<Boolean, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ ap this$0;

                {
                    this.this$0 = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z) {
                    int i;
                    int i2 = 0;
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 29447, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 29447, new Class[]{Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    if (z) {
                        booleanRef.element = !booleanRef.element;
                        PromotionAppointment promotionAppointment = this.this$0.f37790c.v;
                        if (promotionAppointment != null) {
                            promotionAppointment.setAppointment(booleanRef.element);
                        }
                        if (booleanRef.element) {
                            TextView i3 = this.this$0.f37789b.i();
                            View view = this.this$0.f37789b.itemView;
                            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                            i3.setText(view.getContext().getString(C0906R.string.fu));
                        } else {
                            TextView i4 = this.this$0.f37789b.i();
                            View view2 = this.this$0.f37789b.itemView;
                            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                            i4.setText(view2.getContext().getString(C0906R.string.fw));
                        }
                        PromotionAppointment promotionAppointment2 = this.this$0.f37790c.v;
                        if (promotionAppointment2 != null) {
                            i2 = promotionAppointment2.getAppointmentNum();
                        }
                        if (booleanRef.element) {
                            i = i2 + 1;
                        } else {
                            i = i2 - 1;
                        }
                        PromotionAppointment promotionAppointment3 = this.this$0.f37790c.v;
                        if (promotionAppointment3 != null) {
                            promotionAppointment3.setAppointmentNum(i);
                        }
                    }
                }
            };
            Object[] objArr = {context, str3, str4, str5, Integer.valueOf(i), r0};
            ChangeQuickRedirect changeQuickRedirect = com.ss.android.ugc.aweme.commerce.sdk.b.a.f37701a;
            Class[] clsArr = {Context.class, String.class, String.class, String.class, Integer.TYPE, Function1.class};
            if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, 29500, clsArr, Void.TYPE)) {
                com.ss.android.ugc.aweme.commerce.sdk.b.a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{context, str3, str4, str5, Integer.valueOf(i), r0}, aVar2, com.ss.android.ugc.aweme.commerce.sdk.b.a.f37701a, false, 29500, new Class[]{Context.class, String.class, String.class, String.class, Integer.TYPE, Function1.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str3, "promotionId");
            Intrinsics.checkParameterIsNotNull(str4, "awemeId");
            Intrinsics.checkParameterIsNotNull(str5, "authorId");
            Intrinsics.checkParameterIsNotNull(r0, "onResult");
            aVar.b().a(context, str3, str4, str5, i, r0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class aq implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37792a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SkuPanelViewHolder f37793b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commerce.service.models.ak f37794c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Fragment f37795d;

        aq(SkuPanelViewHolder skuPanelViewHolder, com.ss.android.ugc.aweme.commerce.service.models.ak akVar, Fragment fragment) {
            this.f37793b = skuPanelViewHolder;
            this.f37794c = akVar;
            this.f37795d = fragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37792a, false, 29448, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37792a, false, 29448, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            SkuPanelAdapter.b bVar = this.f37793b.i;
            if (bVar != null) {
                com.ss.android.ugc.aweme.commerce.service.models.ak akVar = this.f37794c;
                View view2 = this.f37793b.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                Context context = view2.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
                bVar.a(akVar, context, this.f37795d, 2, "open_add_cart_dialog");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class ar implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37796a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SkuPanelViewHolder f37797b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f37798c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commerce.service.models.ak f37799d;

        ar(SkuPanelViewHolder skuPanelViewHolder, boolean z, com.ss.android.ugc.aweme.commerce.service.models.ak akVar) {
            this.f37797b = skuPanelViewHolder;
            this.f37798c = z;
            this.f37799d = akVar;
        }

        public final void onClick(final View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37796a, false, 29449, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37796a, false, 29449, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (!this.f37798c) {
                SkuPanelViewHolder skuPanelViewHolder = this.f37797b;
                com.ss.android.ugc.aweme.commerce.service.k.a aVar = this.f37797b.h;
                Intrinsics.checkExpressionValueIsNotNull(view, AdvanceSetting.NETWORK_TYPE);
                skuPanelViewHolder.a(aVar, view, this.f37799d);
            } else if (Intrinsics.areEqual((Object) this.f37799d.L, (Object) Boolean.FALSE)) {
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c cVar = com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c.k;
                String str = this.f37799d.f38190d;
                if (str == null) {
                    str = "";
                }
                String str2 = this.f37799d.f38191e;
                if (str2 == null) {
                    str2 = "";
                }
                cVar.a(str, str2, new c.b(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f37800a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ ar f37801b;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f37800a, false, 29451, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f37800a, false, 29451, new Class[0], Void.TYPE);
                            return;
                        }
                        SkuPanelViewHolder skuPanelViewHolder = this.f37801b.f37797b;
                        com.ss.android.ugc.aweme.commerce.service.k.a aVar = this.f37801b.f37797b.h;
                        View view = view;
                        Intrinsics.checkExpressionValueIsNotNull(view, AdvanceSetting.NETWORK_TYPE);
                        skuPanelViewHolder.a(aVar, view, this.f37801b.f37799d);
                    }

                    {
                        this.f37801b = r1;
                    }

                    public final void a(@Nullable Boolean bool, @Nullable Boolean bool2) {
                        if (PatchProxy.isSupport(new Object[]{bool, bool2}, this, f37800a, false, 29450, new Class[]{Boolean.class, Boolean.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bool, bool2}, this, f37800a, false, 29450, new Class[]{Boolean.class, Boolean.class}, Void.TYPE);
                            return;
                        }
                        this.f37801b.f37799d.L = bool2;
                        if (Intrinsics.areEqual((Object) this.f37801b.f37799d.L, (Object) Boolean.TRUE)) {
                            this.f37801b.f37797b.h().setBackgroundResource(2130838427);
                            View view = this.f37801b.f37797b.itemView;
                            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                            UIUtils.displayToast(view.getContext(), (int) C0906R.string.ye);
                            return;
                        }
                        SkuPanelViewHolder skuPanelViewHolder = this.f37801b.f37797b;
                        com.ss.android.ugc.aweme.commerce.service.k.a aVar = this.f37801b.f37797b.h;
                        View view2 = view;
                        Intrinsics.checkExpressionValueIsNotNull(view2, AdvanceSetting.NETWORK_TYPE);
                        skuPanelViewHolder.a(aVar, view2, this.f37801b.f37799d);
                    }
                });
            } else {
                View view2 = this.f37797b.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                UIUtils.displayToast(view2.getContext(), (int) C0906R.string.ye);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/service/goods/api/SkuCheckResponse;", "then"}, k = 3, mv = {1, 1, 15})
    static final class as<TTaskResult, TContinuationResult> implements a.g<com.ss.android.ugc.aweme.commerce.service.g.a.c, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37803a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SkuPanelViewHolder f37804b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f37805c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commerce.service.models.ak f37806d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Fragment f37807e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ User f37808f;
        final /* synthetic */ SkuPanelAdapter g;

        as(SkuPanelViewHolder skuPanelViewHolder, String str, com.ss.android.ugc.aweme.commerce.service.models.ak akVar, Fragment fragment, User user, SkuPanelAdapter skuPanelAdapter) {
            this.f37804b = skuPanelViewHolder;
            this.f37805c = str;
            this.f37806d = akVar;
            this.f37807e = fragment;
            this.f37808f = user;
            this.g = skuPanelAdapter;
        }

        public final /* synthetic */ Object then(a.i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f37803a, false, 29452, new Class[]{a.i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f37803a, false, 29452, new Class[]{a.i.class}, Void.class);
            }
            Intrinsics.checkParameterIsNotNull(iVar, "task");
            if (TextUtils.equals(this.f37805c, this.f37806d.f38190d)) {
                if (!iVar.d() && ((com.ss.android.ugc.aweme.commerce.service.g.a.c) iVar.e()).statusCode == 0) {
                    String str = ((com.ss.android.ugc.aweme.commerce.service.g.a.c) iVar.e()).f37968a;
                    if (!TextUtils.isEmpty(str)) {
                        this.f37806d.f38189c = null;
                        this.f37806d.y = str;
                    }
                }
                this.f37804b.a(this.f37807e, this.f37804b.f37769c, this.f37806d, this.f37808f, this.g);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class at extends Lambda implements Function0<LinearLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        at(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final LinearLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29453, new Class[0], LinearLayout.class)) {
                return (LinearLayout) this.this$0.itemView.findViewById(C0906R.id.cru);
            }
            return (LinearLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29453, new Class[0], LinearLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class au extends Lambda implements Function0<View> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        au(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final View invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29454, new Class[0], View.class)) {
                return this.this$0.itemView.findViewById(C0906R.id.b_n);
            }
            return (View) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29454, new Class[0], View.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class av extends Lambda implements Function0<LinearLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        av(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final LinearLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29455, new Class[0], LinearLayout.class)) {
                return (LinearLayout) this.this$0.itemView.findViewById(C0906R.id.b_r);
            }
            return (LinearLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29455, new Class[0], LinearLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "currentMill", "", "onTick"}, k = 3, mv = {1, 1, 15})
    static final class aw implements h.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37809a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SkuPanelViewHolder f37810b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f37811c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f37812d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f37813e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f37814f;
        final /* synthetic */ com.ss.android.ugc.aweme.commerce.service.models.ak g;
        final /* synthetic */ Fragment h;
        final /* synthetic */ User i;
        final /* synthetic */ SkuPanelAdapter j;

        aw(SkuPanelViewHolder skuPanelViewHolder, long j2, long j3, String str, String str2, com.ss.android.ugc.aweme.commerce.service.models.ak akVar, Fragment fragment, User user, SkuPanelAdapter skuPanelAdapter) {
            this.f37810b = skuPanelViewHolder;
            this.f37811c = j2;
            this.f37812d = j3;
            this.f37813e = str;
            this.f37814f = str2;
            this.g = akVar;
            this.h = fragment;
            this.i = user;
            this.j = skuPanelAdapter;
        }

        public final void a(long j2) {
            Object value;
            Object value2;
            Object value3;
            long j3 = j2;
            if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f37809a, false, 29456, new Class[]{Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f37809a, false, 29456, new Class[]{Long.TYPE}, Void.TYPE);
                return;
            }
            if (j3 < this.f37811c) {
                this.f37810b.o = 1;
                SkuPanelViewHolder skuPanelViewHolder = this.f37810b;
                long j4 = this.f37811c;
                if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, skuPanelViewHolder, SkuPanelViewHolder.f37767a, false, 29385, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
                    SkuPanelViewHolder skuPanelViewHolder2 = skuPanelViewHolder;
                    PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, skuPanelViewHolder2, SkuPanelViewHolder.f37767a, false, 29385, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
                } else {
                    if (skuPanelViewHolder.p) {
                        com.ss.android.ugc.aweme.commerce.service.models.ak akVar = skuPanelViewHolder.l;
                        if (akVar != null) {
                            com.ss.android.ugc.aweme.commerce.service.models.s sVar = akVar.w;
                            if (sVar != null) {
                                ai.a aVar = com.ss.android.ugc.aweme.commerce.service.models.ai.j;
                                Context context = KernelContext.context;
                                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                                com.ss.android.ugc.aweme.commerce.service.models.ai a2 = aVar.a(context, j4 - j3);
                                if (PatchProxy.isSupport(new Object[0], skuPanelViewHolder, SkuPanelViewHolder.f37767a, false, 29373, new Class[0], TextView.class)) {
                                    value2 = PatchProxy.accessDispatch(new Object[0], skuPanelViewHolder, SkuPanelViewHolder.f37767a, false, 29373, new Class[0], TextView.class);
                                } else {
                                    value2 = skuPanelViewHolder.f37772f.getValue();
                                }
                                ((TextView) value2).setText(sVar.getCardTitle());
                                if (PatchProxy.isSupport(new Object[0], skuPanelViewHolder, SkuPanelViewHolder.f37767a, false, 29374, new Class[0], TextView.class)) {
                                    value3 = PatchProxy.accessDispatch(new Object[0], skuPanelViewHolder, SkuPanelViewHolder.f37767a, false, 29374, new Class[0], TextView.class);
                                } else {
                                    value3 = skuPanelViewHolder.g.getValue();
                                }
                                TextView textView = (TextView) value3;
                                textView.setText(KernelContext.context.getString(C0906R.string.c30, new Object[]{a2.i}));
                            }
                        }
                    }
                }
            } else {
                long j5 = this.f37812d;
                if (this.f37811c <= j3 && j5 > j3) {
                    SkuPanelViewHolder skuPanelViewHolder3 = this.f37810b;
                    long j6 = this.f37812d;
                    if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j6)}, skuPanelViewHolder3, SkuPanelViewHolder.f37767a, false, 29386, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
                        SkuPanelViewHolder skuPanelViewHolder4 = skuPanelViewHolder3;
                        PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j6)}, skuPanelViewHolder4, SkuPanelViewHolder.f37767a, false, 29386, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
                    } else if (skuPanelViewHolder3.p) {
                        com.ss.android.ugc.aweme.commerce.service.models.ak akVar2 = skuPanelViewHolder3.l;
                        if (!(akVar2 == null || akVar2.w == null)) {
                            ai.a aVar2 = com.ss.android.ugc.aweme.commerce.service.models.ai.j;
                            Context context2 = KernelContext.context;
                            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                            com.ss.android.ugc.aweme.commerce.service.models.ai a3 = aVar2.a(context2, j6 - j3);
                            if (PatchProxy.isSupport(new Object[0], skuPanelViewHolder3, SkuPanelViewHolder.f37767a, false, 29369, new Class[0], TextView.class)) {
                                value = PatchProxy.accessDispatch(new Object[0], skuPanelViewHolder3, SkuPanelViewHolder.f37767a, false, 29369, new Class[0], TextView.class);
                            } else {
                                value = skuPanelViewHolder3.f37771e.getValue();
                            }
                            TextView textView2 = (TextView) value;
                            textView2.setText(KernelContext.context.getString(C0906R.string.c2v, new Object[]{a3.i}));
                        }
                    }
                    if (this.f37810b.o != 2) {
                        if (this.f37810b.o != 0) {
                            this.f37810b.a(this.f37813e, this.f37814f, this.g, this.h, this.i, this.j);
                        }
                        this.f37810b.o = 2;
                    }
                } else if (this.f37810b.o != 3) {
                    this.f37810b.o = 3;
                    this.f37810b.a(this.f37813e, this.f37814f, this.g, this.h, this.i, this.j);
                    com.ss.android.ugc.aweme.commerce.service.l.h d2 = com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c.d();
                    if (d2 != null) {
                        d2.a(this.f37810b.m);
                    }
                    this.f37810b.n = null;
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/commerce/sdk/live/skupanel/bubble/SkuPanelViewHolder$update$2", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/RequestListener;", "Lcom/ss/android/ugc/aweme/commerce/service/goods/api/ShopCouponResponse;", "onFailed", "", "error", "onSuccess", "result", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    public static final class ax implements com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.d<com.ss.android.ugc.aweme.commerce.service.g.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37815a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SkuPanelViewHolder f37816b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f37817c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commerce.service.models.ak f37818d;

        public final /* synthetic */ void b(Object obj) {
            com.ss.android.ugc.aweme.commerce.service.g.a.b bVar = (com.ss.android.ugc.aweme.commerce.service.g.a.b) obj;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f37815a, false, 29458, new Class[]{com.ss.android.ugc.aweme.commerce.service.g.a.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f37815a, false, 29458, new Class[]{com.ss.android.ugc.aweme.commerce.service.g.a.b.class}, Void.TYPE);
                return;
            }
            if (TextUtils.equals(this.f37817c, this.f37818d.f38190d)) {
                this.f37816b.d().setVisibility(8);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0230, code lost:
            if (r3 != null) goto L_0x0235;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0261, code lost:
            if (r1 != null) goto L_0x0266;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void a(java.lang.Object r20) {
            /*
                r19 = this;
                r7 = r19
                r8 = r20
                com.ss.android.ugc.aweme.commerce.service.g.a.b r8 = (com.ss.android.ugc.aweme.commerce.service.g.a.b) r8
                r9 = 1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f37815a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.g.a.b> r1 = com.ss.android.ugc.aweme.commerce.service.g.a.b.class
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 29457(0x7311, float:4.1278E-41)
                r1 = r19
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0038
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f37815a
                r3 = 0
                r4 = 29457(0x7311, float:4.1278E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.g.a.b> r1 = com.ss.android.ugc.aweme.commerce.service.g.a.b.class
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r19
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0038:
                java.lang.String r0 = "result"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
                java.lang.String r0 = r7.f37817c
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                com.ss.android.ugc.aweme.commerce.service.models.ak r1 = r7.f37818d
                java.lang.String r1 = r1.f38190d
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r0 = android.text.TextUtils.equals(r0, r1)
                if (r0 == 0) goto L_0x0276
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder r0 = r7.f37816b
                com.ss.android.ugc.aweme.commerce.service.models.ak r1 = r7.f37818d
                java.util.List<java.lang.String> r1 = r1.B
                r0.k = r1
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder r0 = r7.f37816b
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.List r1 = (java.util.List) r1
                r0.j = r1
                java.util.List<com.ss.android.ugc.aweme.commerce.service.models.f> r0 = r8.f37966a
                if (r0 == 0) goto L_0x0094
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
            L_0x006a:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0094
                java.lang.Object r1 = r0.next()
                com.ss.android.ugc.aweme.commerce.service.models.f r1 = (com.ss.android.ugc.aweme.commerce.service.models.f) r1
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder r2 = r7.f37816b
                java.util.List<com.ss.android.ugc.aweme.commerce.service.models.aj> r2 = r2.j
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder r3 = r7.f37816b
                android.view.View r3 = r3.itemView
                java.lang.String r4 = "itemView"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                android.content.Context r3 = r3.getContext()
                com.ss.android.ugc.aweme.commerce.service.models.aj r1 = com.ss.android.ugc.aweme.commerce.service.l.d.a(r3, r1, r9, r10)
                java.lang.String r3 = "CommerceUtils.translateC…context, it, true, false)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                r2.add(r1)
                goto L_0x006a
            L_0x0094:
                java.util.List<com.ss.android.ugc.aweme.commerce.service.models.f> r0 = r8.f37967b
                if (r0 == 0) goto L_0x00c8
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
            L_0x009e:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x00c8
                java.lang.Object r1 = r0.next()
                com.ss.android.ugc.aweme.commerce.service.models.f r1 = (com.ss.android.ugc.aweme.commerce.service.models.f) r1
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder r2 = r7.f37816b
                java.util.List<com.ss.android.ugc.aweme.commerce.service.models.aj> r2 = r2.j
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder r3 = r7.f37816b
                android.view.View r3 = r3.itemView
                java.lang.String r4 = "itemView"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                android.content.Context r3 = r3.getContext()
                com.ss.android.ugc.aweme.commerce.service.models.aj r1 = com.ss.android.ugc.aweme.commerce.service.l.d.a(r3, r1, r10, r10)
                java.lang.String r3 = "CommerceUtils.translateC…ontext, it, false, false)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                r2.add(r1)
                goto L_0x009e
            L_0x00c8:
                com.ss.android.ugc.aweme.commerce.service.models.ak r0 = r7.f37818d
                java.util.List<java.lang.String> r0 = r0.A
                java.util.Collection r0 = (java.util.Collection) r0
                if (r0 == 0) goto L_0x00d9
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x00d7
                goto L_0x00d9
            L_0x00d7:
                r0 = 0
                goto L_0x00da
            L_0x00d9:
                r0 = 1
            L_0x00da:
                r0 = r0 ^ r9
                com.ss.android.ugc.aweme.commerce.service.models.ak r1 = r7.f37818d
                java.util.List<java.lang.String> r1 = r1.B
                java.util.Collection r1 = (java.util.Collection) r1
                if (r1 == 0) goto L_0x00ec
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x00ea
                goto L_0x00ec
            L_0x00ea:
                r1 = 0
                goto L_0x00ed
            L_0x00ec:
                r1 = 1
            L_0x00ed:
                r1 = r1 ^ r9
                r2 = 8
                if (r0 != 0) goto L_0x0105
                if (r1 == 0) goto L_0x00f5
                goto L_0x0105
            L_0x00f5:
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder r0 = r7.f37816b
                android.view.View r0 = r0.d()
                r0.setVisibility(r2)
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder r0 = r7.f37816b
                r0.a((boolean) r10)
                goto L_0x0276
            L_0x0105:
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder r3 = r7.f37816b
                android.view.View r3 = r3.d()
                r3.setVisibility(r10)
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder r3 = r7.f37816b
                r3.a((boolean) r9)
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder r3 = r7.f37816b
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder r4 = r7.f37816b
                java.util.List<com.ss.android.ugc.aweme.commerce.service.models.aj> r4 = r4.j
                com.ss.android.ugc.aweme.commerce.service.models.ak r5 = r7.f37818d
                boolean r5 = r5.M
                com.ss.android.ugc.aweme.commerce.service.models.ak r6 = r7.f37818d
                int r6 = r6.N
                r8 = 3
                java.lang.Object[] r11 = new java.lang.Object[r8]
                r11[r10] = r4
                java.lang.Byte r12 = java.lang.Byte.valueOf(r5)
                r11[r9] = r12
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
                r18 = 2
                r11[r18] = r12
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder.f37767a
                r14 = 0
                r15 = 29393(0x72d1, float:4.1188E-41)
                java.lang.Class[] r12 = new java.lang.Class[r8]
                java.lang.Class<java.util.List> r16 = java.util.List.class
                r12[r10] = r16
                java.lang.Class r16 = java.lang.Boolean.TYPE
                r12[r9] = r16
                java.lang.Class r16 = java.lang.Integer.TYPE
                r12[r18] = r16
                java.lang.Class r17 = java.lang.Void.TYPE
                r16 = r12
                r12 = r3
                boolean r11 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r11 == 0) goto L_0x017e
                java.lang.Object[] r11 = new java.lang.Object[r8]
                r11[r10] = r4
                java.lang.Byte r4 = java.lang.Byte.valueOf(r5)
                r11[r9] = r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
                r11[r18] = r4
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder.f37767a
                r14 = 0
                r15 = 29393(0x72d1, float:4.1188E-41)
                java.lang.Class[] r4 = new java.lang.Class[r8]
                java.lang.Class<java.util.List> r5 = java.util.List.class
                r4[r10] = r5
                java.lang.Class r5 = java.lang.Boolean.TYPE
                r4[r9] = r5
                java.lang.Class r5 = java.lang.Integer.TYPE
                r4[r18] = r5
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r3
                r16 = r4
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x01e7
            L_0x017e:
                r8 = r4
                java.util.Collection r8 = (java.util.Collection) r8
                boolean r8 = r8.isEmpty()
                r8 = r8 ^ r9
                if (r8 == 0) goto L_0x01e7
                if (r5 == 0) goto L_0x01e7
                android.widget.LinearLayout r5 = r3.a()
                android.view.View r5 = (android.view.View) r5
                java.util.List r4 = r3.b(r4, r5)
                java.util.List<java.lang.String> r5 = r3.k
                if (r5 == 0) goto L_0x01af
                r8 = r5
                java.util.Collection r8 = (java.util.Collection) r8
                boolean r8 = r8.isEmpty()
                r8 = r8 ^ r9
                if (r8 == 0) goto L_0x01af
                android.widget.LinearLayout r8 = r3.a()
                android.view.View r8 = (android.view.View) r8
                android.view.View r5 = r3.a((java.util.List<java.lang.String>) r5, (android.view.View) r8)
                r4.add(r10, r5)
            L_0x01af:
                r3.a((java.util.List<? extends android.view.View>) r4)
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.view.SkuPanelCouponFoldButton r5 = r3.c()
                r5.setViewState(r9)
                android.view.View r5 = r3.b()
                r8 = 0
                r5.setAlpha(r8)
                android.widget.LinearLayout r5 = r3.a()
                android.view.ViewParent r5 = r5.getParent()
                boolean r8 = r5 instanceof android.support.v4.widget.NestedScrollView
                if (r8 == 0) goto L_0x01e7
                r8 = r4
                java.util.Collection r8 = (java.util.Collection) r8
                boolean r8 = r8.isEmpty()
                r8 = r8 ^ r9
                if (r8 == 0) goto L_0x01e7
                java.lang.Object r4 = r4.get(r10)
                android.view.View r4 = (android.view.View) r4
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder$af r8 = new com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder$af
                r8.<init>(r3, r5, r6)
                java.lang.Runnable r8 = (java.lang.Runnable) r8
                r4.post(r8)
            L_0x01e7:
                if (r0 == 0) goto L_0x023b
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder r0 = r7.f37816b
                android.widget.LinearLayout r0 = r0.e()
                r0.setVisibility(r10)
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder r0 = r7.f37816b
                java.lang.Object[] r11 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder.f37767a
                r14 = 0
                r15 = 29353(0x72a9, float:4.1132E-41)
                java.lang.Class[] r3 = new java.lang.Class[r10]
                java.lang.Class<com.bytedance.ies.dmt.ui.widget.DmtTextView> r17 = com.bytedance.ies.dmt.ui.widget.DmtTextView.class
                r12 = r0
                r16 = r3
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r3 == 0) goto L_0x021d
                java.lang.Object[] r11 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder.f37767a
                r14 = 0
                r15 = 29353(0x72a9, float:4.1132E-41)
                java.lang.Class[] r3 = new java.lang.Class[r10]
                java.lang.Class<com.bytedance.ies.dmt.ui.widget.DmtTextView> r17 = com.bytedance.ies.dmt.ui.widget.DmtTextView.class
                r12 = r0
                r16 = r3
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            L_0x021a:
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
                goto L_0x0224
            L_0x021d:
                kotlin.Lazy r0 = r0.f37770d
                java.lang.Object r0 = r0.getValue()
                goto L_0x021a
            L_0x0224:
                com.ss.android.ugc.aweme.commerce.service.models.ak r3 = r7.f37818d
                java.util.List<java.lang.String> r3 = r3.A
                if (r3 == 0) goto L_0x0233
                java.lang.Object r3 = r3.get(r10)
                java.lang.String r3 = (java.lang.String) r3
                if (r3 == 0) goto L_0x0233
                goto L_0x0235
            L_0x0233:
                java.lang.String r3 = ""
            L_0x0235:
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r0.setText(r3)
                goto L_0x0244
            L_0x023b:
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder r0 = r7.f37816b
                android.widget.LinearLayout r0 = r0.e()
                r0.setVisibility(r2)
            L_0x0244:
                if (r1 == 0) goto L_0x026c
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder r0 = r7.f37816b
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r0.f()
                r0.setVisibility(r10)
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder r0 = r7.f37816b
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r0.f()
                com.ss.android.ugc.aweme.commerce.service.models.ak r1 = r7.f37818d
                java.util.List<java.lang.String> r1 = r1.B
                if (r1 == 0) goto L_0x0264
                java.lang.Object r1 = r1.get(r10)
                java.lang.String r1 = (java.lang.String) r1
                if (r1 == 0) goto L_0x0264
                goto L_0x0266
            L_0x0264:
                java.lang.String r1 = ""
            L_0x0266:
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
                return
            L_0x026c:
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder r0 = r7.f37816b
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r0.f()
                r0.setVisibility(r2)
                return
            L_0x0276:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder.ax.a(java.lang.Object):void");
        }

        ax(SkuPanelViewHolder skuPanelViewHolder, String str, com.ss.android.ugc.aweme.commerce.service.models.ak akVar) {
            this.f37816b = skuPanelViewHolder;
            this.f37817c = str;
            this.f37818d = akVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29404, new Class[0], TextView.class)) {
                return (TextView) this.this$0.itemView.findViewById(C0906R.id.dl);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29404, new Class[0], TextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<LinearLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final LinearLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29405, new Class[0], LinearLayout.class)) {
                return (LinearLayout) this.this$0.itemView.findViewById(C0906R.id.dm);
            }
            return (LinearLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29405, new Class[0], LinearLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29406, new Class[0], TextView.class)) {
                return (TextView) this.this$0.itemView.findViewById(C0906R.id.fk);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29406, new Class[0], TextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function0<RemoteImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final RemoteImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29407, new Class[0], RemoteImageView.class)) {
                return (RemoteImageView) this.this$0.itemView.findViewById(C0906R.id.cn_);
            }
            return (RemoteImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29407, new Class[0], RemoteImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<View> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final View invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29408, new Class[0], View.class)) {
                return this.this$0.itemView.findViewById(C0906R.id.cna);
            }
            return (View) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29408, new Class[0], View.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29409, new Class[0], TextView.class)) {
                return (TextView) this.this$0.itemView.findViewById(C0906R.id.pz);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29409, new Class[0], TextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29410, new Class[0], TextView.class)) {
                return (TextView) this.this$0.itemView.findViewById(C0906R.id.q0);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29410, new Class[0], TextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J!\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/commerce/sdk/live/skupanel/bubble/SkuPanelViewHolder$checkVirtualProduct$1", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/LiveSkuPanelManager$ISkuUpdateCallback;", "onFailure", "", "onSuccess", "isVirtual", "", "isOverLimit", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    public static final class i implements c.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37819a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SkuPanelViewHolder f37820b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f37821c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commerce.service.models.ak f37822d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Fragment f37823e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ LinearLayout f37824f;
        final /* synthetic */ User g;
        final /* synthetic */ SkuPanelAdapter h;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f37819a, false, 29412, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37819a, false, 29412, new Class[0], Void.TYPE);
                return;
            }
            if (TextUtils.equals(this.f37821c, this.f37822d.f38190d)) {
                this.f37820b.b(this.f37823e, this.f37824f, this.f37822d, this.g, this.h);
            }
        }

        public final void a(@Nullable Boolean bool, @Nullable Boolean bool2) {
            if (PatchProxy.isSupport(new Object[]{bool, bool2}, this, f37819a, false, 29411, new Class[]{Boolean.class, Boolean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bool, bool2}, this, f37819a, false, 29411, new Class[]{Boolean.class, Boolean.class}, Void.TYPE);
                return;
            }
            if (TextUtils.equals(this.f37821c, this.f37822d.f38190d)) {
                this.f37822d.K = bool;
                this.f37822d.L = bool2;
                this.f37822d.O = true;
                this.f37820b.b(this.f37823e, this.f37824f, this.f37822d, this.g, this.h);
            }
        }

        i(SkuPanelViewHolder skuPanelViewHolder, String str, com.ss.android.ugc.aweme.commerce.service.models.ak akVar, Fragment fragment, LinearLayout linearLayout, User user, SkuPanelAdapter skuPanelAdapter) {
            this.f37820b = skuPanelViewHolder;
            this.f37821c = str;
            this.f37822d = akVar;
            this.f37823e = fragment;
            this.f37824f = linearLayout;
            this.g = user;
            this.h = skuPanelAdapter;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function0<View> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final View invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29413, new Class[0], View.class)) {
                return this.this$0.itemView.findViewById(C0906R.id.b87);
            }
            return (View) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29413, new Class[0], View.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function0<View> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final View invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29414, new Class[0], View.class)) {
                return this.this$0.itemView.findViewById(C0906R.id.a9q);
            }
            return (View) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29414, new Class[0], View.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function0<DmtTextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final DmtTextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29415, new Class[0], DmtTextView.class)) {
                return (DmtTextView) this.this$0.itemView.findViewById(C0906R.id.d0k);
            }
            return (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29415, new Class[0], DmtTextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class m extends Lambda implements Function0<DmtTextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final DmtTextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29416, new Class[0], DmtTextView.class)) {
                return (DmtTextView) this.this$0.itemView.findViewById(C0906R.id.d0l);
            }
            return (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29416, new Class[0], DmtTextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class n extends Lambda implements Function0<LinearLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final LinearLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29417, new Class[0], LinearLayout.class)) {
                return (LinearLayout) this.this$0.itemView.findViewById(C0906R.id.b8_);
            }
            return (LinearLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29417, new Class[0], LinearLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class o extends Lambda implements Function0<LinearLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final LinearLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29418, new Class[0], LinearLayout.class)) {
                return (LinearLayout) this.this$0.itemView.findViewById(C0906R.id.a12);
            }
            return (LinearLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29418, new Class[0], LinearLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class p extends Lambda implements Function0<View> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final View invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29419, new Class[0], View.class)) {
                return this.this$0.itemView.findViewById(C0906R.id.b8a);
            }
            return (View) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29419, new Class[0], View.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class q implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37825a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SkuPanelViewHolder f37826b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commerce.service.models.aj f37827c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ View f37828d;

        q(SkuPanelViewHolder skuPanelViewHolder, com.ss.android.ugc.aweme.commerce.service.models.aj ajVar, View view) {
            this.f37826b = skuPanelViewHolder;
            this.f37827c = ajVar;
            this.f37828d = view;
        }

        public final void onClick(View view) {
            a.i<com.ss.android.ugc.aweme.commerce.service.g.a.a> iVar;
            final View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f37825a, false, 29420, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f37825a, false, 29420, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            SkuPanelAdapter.b bVar = this.f37826b.i;
            if (bVar != null) {
                com.ss.android.ugc.aweme.commerce.service.models.ak akVar = this.f37826b.l;
                String str = this.f37827c.f38181a;
                if (str == null) {
                    Intrinsics.throwNpe();
                }
                bVar.a(akVar, str);
            }
            if (!TextUtils.isEmpty(this.f37827c.f38181a) && this.f37827c.j) {
                a aVar = a.f37837c;
                String str2 = this.f37827c.f38181a;
                if (str2 == null) {
                    Intrinsics.throwNpe();
                }
                com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.d r2 = new com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.d<com.ss.android.ugc.aweme.commerce.service.g.a.a>(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f37829a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ q f37830b;

                    public final /* synthetic */ void b(Object obj) {
                        com.ss.android.ugc.aweme.commerce.service.g.a.a aVar = (com.ss.android.ugc.aweme.commerce.service.g.a.a) obj;
                        if (PatchProxy.isSupport(new Object[]{aVar}, this, f37829a, false, 29422, new Class[]{com.ss.android.ugc.aweme.commerce.service.g.a.a.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{aVar}, this, f37829a, false, 29422, new Class[]{com.ss.android.ugc.aweme.commerce.service.g.a.a.class}, Void.TYPE);
                            return;
                        }
                        View view = view2;
                        Intrinsics.checkExpressionValueIsNotNull(view, AdvanceSetting.NETWORK_TYPE);
                        UIUtils.displayToast(view.getContext(), (int) C0906R.string.dml);
                    }

                    public final /* synthetic */ void a(Object obj) {
                        com.ss.android.ugc.aweme.commerce.service.g.a.a aVar = (com.ss.android.ugc.aweme.commerce.service.g.a.a) obj;
                        if (PatchProxy.isSupport(new Object[]{aVar}, this, f37829a, false, 29421, new Class[]{com.ss.android.ugc.aweme.commerce.service.g.a.a.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{aVar}, this, f37829a, false, 29421, new Class[]{com.ss.android.ugc.aweme.commerce.service.g.a.a.class}, Void.TYPE);
                            return;
                        }
                        Intrinsics.checkParameterIsNotNull(aVar, "result");
                        SkuPanelViewHolder skuPanelViewHolder = this.f37830b.f37826b;
                        com.ss.android.ugc.aweme.commerce.service.models.aj ajVar = this.f37830b.f37827c;
                        View view = this.f37830b.f37828d;
                        Intrinsics.checkExpressionValueIsNotNull(view, "viewItem");
                        int i = aVar.statusCode;
                        String str = aVar.statusMsg;
                        Boolean bool = aVar.f37965a;
                        Object[] objArr = {ajVar, view, Integer.valueOf(i), str, bool};
                        ChangeQuickRedirect changeQuickRedirect = SkuPanelViewHolder.f37767a;
                        Class[] clsArr = {com.ss.android.ugc.aweme.commerce.service.models.aj.class, View.class, Integer.TYPE, String.class, Boolean.class};
                        if (PatchProxy.isSupport(objArr, skuPanelViewHolder, changeQuickRedirect, false, 29400, clsArr, Void.TYPE)) {
                            SkuPanelViewHolder skuPanelViewHolder2 = skuPanelViewHolder;
                            PatchProxy.accessDispatch(new Object[]{ajVar, view, Integer.valueOf(i), str, bool}, skuPanelViewHolder2, SkuPanelViewHolder.f37767a, false, 29400, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.aj.class, View.class, Integer.TYPE, String.class, Boolean.class}, Void.TYPE);
                            return;
                        }
                        Context context = view.getContext();
                        if (i != 0) {
                            if (i != 4) {
                                switch (i) {
                                    case 2402:
                                        ajVar.l = true;
                                        Intrinsics.checkExpressionValueIsNotNull(context, "context");
                                        skuPanelViewHolder.a(context, (int) C0906R.string.x5, str);
                                        skuPanelViewHolder.a(ajVar, view, (int) C0906R.color.ky, (int) C0906R.string.xo, false);
                                        return;
                                    case 2403:
                                        Intrinsics.checkExpressionValueIsNotNull(context, "context");
                                        skuPanelViewHolder.a(context, (int) C0906R.string.x7, str);
                                        skuPanelViewHolder.a(ajVar, view, (int) C0906R.color.ky, (int) C0906R.string.xk, false);
                                        return;
                                    case 2404:
                                        return;
                                }
                            } else {
                                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                                skuPanelViewHolder.a(context, (int) C0906R.string.x4, str);
                            }
                            return;
                        }
                        Intrinsics.checkExpressionValueIsNotNull(context, "context");
                        skuPanelViewHolder.a(context, (int) C0906R.string.x6, str);
                        if (bool == null || !Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
                            skuPanelViewHolder.a(ajVar, view, (int) C0906R.color.ky, (int) C0906R.string.xk, false);
                        } else {
                            skuPanelViewHolder.a(ajVar, view, (int) C0906R.color.g_, (int) C0906R.string.xl, true);
                        }
                    }

                    {
                        this.f37830b = r1;
                    }
                };
                if (PatchProxy.isSupport(new Object[]{str2, r2}, aVar, a.f37835a, false, 29301, new Class[]{String.class, com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.d.class}, Void.TYPE)) {
                    a aVar2 = aVar;
                    PatchProxy.accessDispatch(new Object[]{str2, r2}, aVar2, a.f37835a, false, 29301, new Class[]{String.class, com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.d.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(str2, "couponMetaId");
                Intrinsics.checkParameterIsNotNull(r2, "observer");
                if (PatchProxy.isSupport(new Object[]{str2}, null, com.ss.android.ugc.aweme.commerce.sdk.goods.api.b.f37736a, true, 29263, new Class[]{String.class}, a.i.class)) {
                    iVar = (a.i) PatchProxy.accessDispatch(new Object[]{str2}, null, com.ss.android.ugc.aweme.commerce.sdk.goods.api.b.f37736a, true, 29263, new Class[]{String.class}, a.i.class);
                } else {
                    Intrinsics.checkParameterIsNotNull(str2, "couponMetaId");
                    iVar = com.ss.android.ugc.aweme.commerce.sdk.goods.api.b.f37737b.applyCoupon(str2);
                }
                iVar.a((a.g<TResult, TContinuationResult>) new a.C0490a<TResult,TContinuationResult>(r2), a.i.f1052b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/view/SkuPanelCouponFoldButton;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class r extends Lambda implements Function0<SkuPanelCouponFoldButton> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final SkuPanelCouponFoldButton invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29423, new Class[0], SkuPanelCouponFoldButton.class)) {
                return (SkuPanelCouponFoldButton) this.this$0.itemView.findViewById(C0906R.id.pv);
            }
            return (SkuPanelCouponFoldButton) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29423, new Class[0], SkuPanelCouponFoldButton.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class s extends Lambda implements Function0<View> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final View invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29424, new Class[0], View.class)) {
                return this.this$0.itemView.findViewById(C0906R.id.bbq);
            }
            return (View) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29424, new Class[0], View.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class t extends Lambda implements Function0<DmtTextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final DmtTextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29425, new Class[0], DmtTextView.class)) {
                return (DmtTextView) this.this$0.itemView.findViewById(C0906R.id.d1e);
            }
            return (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29425, new Class[0], DmtTextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class u extends Lambda implements Function0<DmtTextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final DmtTextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29426, new Class[0], DmtTextView.class)) {
                return (DmtTextView) this.this$0.itemView.findViewById(C0906R.id.d16);
            }
            return (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29426, new Class[0], DmtTextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class v extends Lambda implements Function0<View> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final View invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29427, new Class[0], View.class)) {
                return this.this$0.itemView.findViewById(C0906R.id.b_o);
            }
            return (View) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29427, new Class[0], View.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/commerce/sdk/live/skupanel/bubble/SkuPanelViewHolder$onClickCouponButton$2", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "p0", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    public static final class w implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37832a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SkuPanelViewHolder f37833b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f37834c;

        public final void onAnimationRepeat(@Nullable Animation animation) {
        }

        public final void onAnimationStart(@Nullable Animation animation) {
        }

        public final void onAnimationEnd(@Nullable Animation animation) {
            if (PatchProxy.isSupport(new Object[]{animation}, this, f37832a, false, 29428, new Class[]{Animation.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animation}, this, f37832a, false, 29428, new Class[]{Animation.class}, Void.TYPE);
                return;
            }
            this.f37833b.a(this.f37834c);
        }

        w(SkuPanelViewHolder skuPanelViewHolder, List list) {
            this.f37833b = skuPanelViewHolder;
            this.f37834c = list;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/commerce/service/widgets/PriceView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class x extends Lambda implements Function0<PriceView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final PriceView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29429, new Class[0], PriceView.class)) {
                return (PriceView) this.this$0.itemView.findViewById(C0906R.id.d12);
            }
            return (PriceView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29429, new Class[0], PriceView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class y extends Lambda implements Function0<LinearLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final LinearLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29430, new Class[0], LinearLayout.class)) {
                return (LinearLayout) this.this$0.itemView.findViewById(C0906R.id.cnb);
            }
            return (LinearLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29430, new Class[0], LinearLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/commerce/service/widgets/PriceView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class z extends Lambda implements Function0<PriceView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SkuPanelViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(SkuPanelViewHolder skuPanelViewHolder) {
            super(0);
            this.this$0 = skuPanelViewHolder;
        }

        public final PriceView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29431, new Class[0], PriceView.class)) {
                return (PriceView) this.this$0.itemView.findViewById(C0906R.id.d1f);
            }
            return (PriceView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29431, new Class[0], PriceView.class);
        }
    }

    private final DmtTextView A() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29378, new Class[0], DmtTextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29378, new Class[0], DmtTextView.class);
        } else {
            value = this.Z.getValue();
        }
        return (DmtTextView) value;
    }

    private final DmtTextView B() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29379, new Class[0], DmtTextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29379, new Class[0], DmtTextView.class);
        } else {
            value = this.aa.getValue();
        }
        return (DmtTextView) value;
    }

    private final View C() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29380, new Class[0], View.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29380, new Class[0], View.class);
        } else {
            value = this.ab.getValue();
        }
        return (View) value;
    }

    private final LinearLayout j() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29348, new Class[0], LinearLayout.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29348, new Class[0], LinearLayout.class);
        } else {
            value = this.u.getValue();
        }
        return (LinearLayout) value;
    }

    private final View k() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29355, new Class[0], View.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29355, new Class[0], View.class);
        } else {
            value = this.F.getValue();
        }
        return (View) value;
    }

    private final View l() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29356, new Class[0], View.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29356, new Class[0], View.class);
        } else {
            value = this.G.getValue();
        }
        return (View) value;
    }

    private final TextView m() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29358, new Class[0], TextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29358, new Class[0], TextView.class);
        } else {
            value = this.I.getValue();
        }
        return (TextView) value;
    }

    private final TextView n() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29359, new Class[0], TextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29359, new Class[0], TextView.class);
        } else {
            value = this.J.getValue();
        }
        return (TextView) value;
    }

    private final PriceView o() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29360, new Class[0], PriceView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29360, new Class[0], PriceView.class);
        } else {
            value = this.K.getValue();
        }
        return (PriceView) value;
    }

    private final LinearLayout p() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29364, new Class[0], LinearLayout.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29364, new Class[0], LinearLayout.class);
        } else {
            value = this.O.getValue();
        }
        return (LinearLayout) value;
    }

    private final TextView q() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29365, new Class[0], TextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29365, new Class[0], TextView.class);
        } else {
            value = this.P.getValue();
        }
        return (TextView) value;
    }

    private final TextView r() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29366, new Class[0], TextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29366, new Class[0], TextView.class);
        } else {
            value = this.Q.getValue();
        }
        return (TextView) value;
    }

    private final PriceView s() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29367, new Class[0], PriceView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29367, new Class[0], PriceView.class);
        } else {
            value = this.R.getValue();
        }
        return (PriceView) value;
    }

    private final LinearLayout t() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29368, new Class[0], LinearLayout.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29368, new Class[0], LinearLayout.class);
        } else {
            value = this.S.getValue();
        }
        return (LinearLayout) value;
    }

    private final LinearLayout u() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29370, new Class[0], LinearLayout.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29370, new Class[0], LinearLayout.class);
        } else {
            value = this.T.getValue();
        }
        return (LinearLayout) value;
    }

    private final LinearLayout v() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29371, new Class[0], LinearLayout.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29371, new Class[0], LinearLayout.class);
        } else {
            value = this.U.getValue();
        }
        return (LinearLayout) value;
    }

    private final TextView w() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29372, new Class[0], TextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29372, new Class[0], TextView.class);
        } else {
            value = this.V.getValue();
        }
        return (TextView) value;
    }

    private final View x() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29375, new Class[0], View.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29375, new Class[0], View.class);
        } else {
            value = this.W.getValue();
        }
        return (View) value;
    }

    private final View y() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29376, new Class[0], View.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29376, new Class[0], View.class);
        } else {
            value = this.X.getValue();
        }
        return (View) value;
    }

    private final View z() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29377, new Class[0], View.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29377, new Class[0], View.class);
        } else {
            value = this.Y.getValue();
        }
        return (View) value;
    }

    /* access modifiers changed from: package-private */
    public final LinearLayout a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29347, new Class[0], LinearLayout.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29347, new Class[0], LinearLayout.class);
        } else {
            value = this.t.getValue();
        }
        return (LinearLayout) value;
    }

    /* access modifiers changed from: package-private */
    public final View b() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29349, new Class[0], View.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29349, new Class[0], View.class);
        } else {
            value = this.v.getValue();
        }
        return (View) value;
    }

    /* access modifiers changed from: package-private */
    public final SkuPanelCouponFoldButton c() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29350, new Class[0], SkuPanelCouponFoldButton.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29350, new Class[0], SkuPanelCouponFoldButton.class);
        } else {
            value = this.B.getValue();
        }
        return (SkuPanelCouponFoldButton) value;
    }

    public final View d() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29351, new Class[0], View.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29351, new Class[0], View.class);
        } else {
            value = this.C.getValue();
        }
        return (View) value;
    }

    public final LinearLayout e() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29352, new Class[0], LinearLayout.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29352, new Class[0], LinearLayout.class);
        } else {
            value = this.D.getValue();
        }
        return (LinearLayout) value;
    }

    public final DmtTextView f() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29354, new Class[0], DmtTextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29354, new Class[0], DmtTextView.class);
        } else {
            value = this.E.getValue();
        }
        return (DmtTextView) value;
    }

    public final RemoteImageView g() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29357, new Class[0], RemoteImageView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29357, new Class[0], RemoteImageView.class);
        } else {
            value = this.H.getValue();
        }
        return (RemoteImageView) value;
    }

    public final TextView h() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29362, new Class[0], TextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29362, new Class[0], TextView.class);
        } else {
            value = this.M.getValue();
        }
        return (TextView) value;
    }

    public final TextView i() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37767a, false, 29363, new Class[0], TextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37767a, false, 29363, new Class[0], TextView.class);
        } else {
            value = this.N.getValue();
        }
        return (TextView) value;
    }

    public final void a(boolean z2) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f37767a, false, 29382, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f37767a, false, 29382, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        Context context = view.getContext();
        ViewGroup.LayoutParams layoutParams = l().getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (z2) {
                f2 = 6.0f;
            } else {
                f2 = 16.0f;
            }
            marginLayoutParams.bottomMargin = (int) UIUtils.dip2Px(context, f2);
            l().setLayoutParams(marginLayoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void a(String str, String str2, com.ss.android.ugc.aweme.commerce.service.models.ak akVar, Fragment fragment, User user, SkuPanelAdapter skuPanelAdapter) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, akVar, fragment, user, skuPanelAdapter}, this, f37767a, false, 29384, new Class[]{String.class, String.class, com.ss.android.ugc.aweme.commerce.service.models.ak.class, Fragment.class, User.class, SkuPanelAdapter.class}, Void.TYPE)) {
            Object[] objArr = {str3, str4, akVar, fragment, user, skuPanelAdapter};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f37767a, false, 29384, new Class[]{String.class, String.class, com.ss.android.ugc.aweme.commerce.service.models.ak.class, Fragment.class, User.class, SkuPanelAdapter.class}, Void.TYPE);
        } else if (str3 == null || str4 == null) {
            C().setVisibility(0);
        } else {
            a.i<com.ss.android.ugc.aweme.commerce.service.g.a.c> a2 = com.ss.android.ugc.aweme.commerce.sdk.goods.api.b.a(str3, str4, 1);
            as asVar = new as(this, str, akVar, fragment, user, skuPanelAdapter);
            a2.a((a.g<TResult, TContinuationResult>) asVar, a.i.f1052b);
        }
    }

    public final void a(com.ss.android.ugc.aweme.commerce.service.k.a aVar, View view, com.ss.android.ugc.aweme.commerce.service.models.ak akVar) {
        com.ss.android.ugc.aweme.commerce.service.k.a aVar2 = aVar;
        View view2 = view;
        com.ss.android.ugc.aweme.commerce.service.models.ak akVar2 = akVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, view2, akVar2}, this, f37767a, false, 29391, new Class[]{com.ss.android.ugc.aweme.commerce.service.k.a.class, View.class, com.ss.android.ugc.aweme.commerce.service.models.ak.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, view2, akVar2}, this, f37767a, false, 29391, new Class[]{com.ss.android.ugc.aweme.commerce.service.k.a.class, View.class, com.ss.android.ugc.aweme.commerce.service.models.ak.class}, Void.TYPE);
            return;
        }
        if (!com.ss.android.ugc.aweme.commerce.sdk.e.a.a(view2, 500)) {
            if (aVar2 != null) {
                aVar2.a((Function2<? super Integer, ? super String, Unit>) ae.INSTANCE);
            }
            SkuPanelAdapter.b bVar = this.i;
            if (bVar != null) {
                bVar.c(akVar2);
            }
        }
    }

    public final void a(List<? extends View> list) {
        List<? extends View> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f37767a, false, 29396, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f37767a, false, 29396, new Class[]{List.class}, Void.TYPE);
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) list2.get(i2);
            if (i2 == list.size() - 1) {
                View findViewById = view.findViewById(C0906R.id.dtl);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "bottomDivideLine");
                findViewById.setVisibility(8);
            }
            a().addView(view, i2);
        }
    }

    public final void a(@NotNull View view, boolean z2, @Nullable String str) {
        View view2 = view;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{view2, Byte.valueOf(z2 ? (byte) 1 : 0), str2}, this, f37767a, false, 29398, new Class[]{View.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Byte.valueOf(z2), str2}, this, f37767a, false, 29398, new Class[]{View.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        if (z2 && str2 != null && !this.ac.contains(str2)) {
            com.ss.android.ugc.aweme.commerce.service.logs.as e2 = new com.ss.android.ugc.aweme.commerce.service.logs.as().e(str2);
            com.ss.android.ugc.aweme.commerce.service.models.ak akVar = this.l;
            com.ss.android.ugc.aweme.commerce.service.logs.as a2 = e2.a(akVar != null ? akVar.j : 0);
            com.ss.android.ugc.aweme.commerce.service.models.ak akVar2 = this.l;
            String str3 = null;
            com.ss.android.ugc.aweme.commerce.service.logs.as a3 = a2.a(akVar2 != null ? akVar2.F : null);
            com.ss.android.ugc.aweme.commerce.service.models.ak akVar3 = this.l;
            com.ss.android.ugc.aweme.commerce.service.logs.as b2 = a3.b(akVar3 != null ? akVar3.f38190d : null);
            com.ss.android.ugc.aweme.commerce.service.models.ak akVar4 = this.l;
            if (akVar4 != null) {
                str3 = akVar4.F;
            }
            b2.c(str3).d("pop_up_card").b();
            this.ac.add(str2);
        }
    }

    public final void a(@NotNull View view, boolean z2) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{view, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f37767a, false, 29399, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Byte.valueOf(z2)}, this, f37767a, false, 29399, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        SkuPanelAdapter.b bVar = this.i;
        if (bVar != null) {
            bVar.a(this.l, z2);
        }
        com.ss.android.ugc.aweme.commerce.service.models.ak akVar = this.l;
        if (akVar != null) {
            akVar.M = z2;
        }
        if (z2) {
            List<View> b2 = b(this.j, view);
            if (!b2.isEmpty()) {
                View view2 = b2.get(0);
                view2.measure(0, 0);
                int size = b2.size();
                if (size > this.r) {
                    size = this.r;
                }
                i2 = view2.getMeasuredHeight() * size;
            } else {
                i2 = 0;
            }
            List<String> list = this.k;
            if (list != null && (!list.isEmpty())) {
                View a2 = a(list, (View) a());
                a2.measure(0, 0);
                i2 += a2.getMeasuredHeight();
                b2.add(0, a2);
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, ((float) i2) * 1.0f);
            translateAnimation.setDuration(200);
            translateAnimation.setFillEnabled(true);
            translateAnimation.setAnimationListener(new w(this, b2));
            this.A.startAnimation(translateAnimation);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b(), "alpha", new float[]{1.0f, 0.0f});
            Intrinsics.checkExpressionValueIsNotNull(ofFloat, "alphaAnimator");
            ofFloat.setDuration(60);
            ofFloat.start();
            return;
        }
        int childCount = a().getChildCount();
        if (childCount > 1) {
            a().removeViews(0, childCount - 1);
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(b(), "alpha", new float[]{0.0f, 1.0f});
        Intrinsics.checkExpressionValueIsNotNull(ofFloat2, "alphaAnimator");
        ofFloat2.setDuration(60);
        ofFloat2.start();
    }

    /* access modifiers changed from: package-private */
    public final void a(com.ss.android.ugc.aweme.commerce.service.models.aj ajVar, View view, int i2, int i3, boolean z2) {
        com.ss.android.ugc.aweme.commerce.service.models.aj ajVar2 = ajVar;
        View view2 = view;
        boolean z3 = z2;
        if (PatchProxy.isSupport(new Object[]{ajVar2, view2, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f37767a, false, 29401, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.aj.class, View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {ajVar2, view2, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f37767a, false, 29401, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.aj.class, View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        view2.setEnabled(z3);
        ajVar2.j = z3;
        DmtTextView dmtTextView = (DmtTextView) view2.findViewById(C0906R.id.d0d);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "itemView.text_apply_button");
        g.a aVar = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b;
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        dmtTextView.setText(aVar.a(context, i3, new Object[0]));
        g.a aVar2 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b;
        Context context2 = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "itemView.context");
        ((DmtTextView) view2.findViewById(C0906R.id.d0d)).setTextColor(aVar2.a(context2, i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        if (r2 == null) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(@org.jetbrains.annotations.Nullable android.view.View r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f37767a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 29392(0x72d0, float:4.1187E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f37767a
            r3 = 0
            r4 = 29392(0x72d0, float:4.1187E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r10)
            android.widget.LinearLayout r0 = r9.j()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.view.SkuPanelCouponFoldButton r0 = r9.c()
            r0.performClick()
            return
        L_0x0045:
            android.view.View r0 = r9.x()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r0)
            if (r0 != 0) goto L_0x0059
            android.view.View r0 = r9.y()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x007c
        L_0x0059:
            com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelAdapter$b r0 = r9.i
            if (r0 == 0) goto L_0x0062
            com.ss.android.ugc.aweme.commerce.service.models.ak r1 = r9.l
            r0.a(r1)
        L_0x0062:
            com.ss.android.ugc.aweme.commerce.sdk.b.a r0 = com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e
            android.content.Context r1 = r10.getContext()
            java.lang.String r2 = "v.context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.commerce.service.models.ak r2 = r9.l
            if (r2 == 0) goto L_0x0075
            java.lang.String r2 = r2.E
            if (r2 != 0) goto L_0x0077
        L_0x0075:
            java.lang.String r2 = ""
        L_0x0077:
            java.lang.String r3 = ""
            r0.a((android.content.Context) r1, (java.lang.String) r2, (java.lang.String) r3)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble.SkuPanelViewHolder.onClick(android.view.View):void");
    }

    private final void b(boolean z2) {
        float dip2Px;
        float dip2Px2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f37767a, false, 29387, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f37767a, false, 29387, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        Context context = view.getContext();
        ViewGroup.LayoutParams layoutParams = v().getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (z2) {
                dip2Px = UIUtils.dip2Px(context, 12.0f);
            } else {
                dip2Px = UIUtils.dip2Px(context, 14.0f);
            }
            marginLayoutParams.bottomMargin = (int) dip2Px;
            if (z2) {
                dip2Px2 = UIUtils.dip2Px(context, 12.0f);
            } else {
                dip2Px2 = UIUtils.dip2Px(context, 14.0f);
            }
            marginLayoutParams.topMargin = (int) dip2Px2;
            v().setLayoutParams(marginLayoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SkuPanelViewHolder(@NotNull ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.li, viewGroup, false));
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Context context = viewGroup.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "parent.context.resources");
        this.s = resources.getDisplayMetrics().widthPixels;
        this.t = LazyKt.lazy(new av(this));
        this.u = LazyKt.lazy(new n(this));
        this.v = LazyKt.lazy(new s(this));
        this.B = LazyKt.lazy(new r(this));
        this.C = LazyKt.lazy(new p(this));
        this.D = LazyKt.lazy(new o(this));
        this.f37770d = LazyKt.lazy(new l(this));
        this.E = LazyKt.lazy(new m(this));
        this.F = LazyKt.lazy(new f(this));
        this.G = LazyKt.lazy(new ad(this));
        this.H = LazyKt.lazy(new e(this));
        this.I = LazyKt.lazy(new al(this));
        this.J = LazyKt.lazy(new ac(this));
        this.K = LazyKt.lazy(new z(this));
        this.L = LazyKt.lazy(new y(this));
        this.M = LazyKt.lazy(new g(this));
        this.N = LazyKt.lazy(new d(this));
        this.O = LazyKt.lazy(new aa(this));
        this.P = LazyKt.lazy(new ab(this));
        this.Q = LazyKt.lazy(new b(this));
        this.R = LazyKt.lazy(new x(this));
        this.S = LazyKt.lazy(new ak(this));
        this.f37771e = LazyKt.lazy(new ai(this));
        this.T = LazyKt.lazy(new c(this));
        this.U = LazyKt.lazy(new at(this));
        this.V = LazyKt.lazy(new h(this));
        this.f37772f = LazyKt.lazy(new ah(this));
        this.g = LazyKt.lazy(new aj(this));
        this.W = LazyKt.lazy(new j(this));
        this.X = LazyKt.lazy(new k(this));
        this.Y = LazyKt.lazy(new au(this));
        this.Z = LazyKt.lazy(new u(this));
        this.aa = LazyKt.lazy(new t(this));
        this.ab = LazyKt.lazy(new v(this));
        this.j = new ArrayList();
        this.ac = new LinkedHashSet();
        com.ss.android.ugc.aweme.commerce.service.l.o.f38047b.b(h());
        com.ss.android.ugc.aweme.commerce.service.l.o.f38047b.b(r());
        com.ss.android.ugc.aweme.commerce.service.l.o.f38047b.b(w());
        com.ss.android.ugc.aweme.commerce.service.l.o.f38047b.b(u());
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        View inflate = LayoutInflater.from(view.getContext()).inflate(C0906R.layout.ln, a(), false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(item…ouponLinearLayout, false)");
        this.A = inflate;
        View findViewById = this.A.findViewById(C0906R.id.crt);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "specItemLayout.findViewB…(R.id.sku_list_container)");
        this.f37769c = (LinearLayout) findViewById;
        View findViewById2 = this.A.findViewById(C0906R.id.cn9);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "specItemLayout.findViewB…d<View>(R.id.select_plus)");
        this.w = findViewById2;
        View findViewById3 = this.A.findViewById(C0906R.id.cn6);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "specItemLayout.findViewB…<View>(R.id.select_minus)");
        this.x = findViewById3;
        View findViewById4 = this.A.findViewById(C0906R.id.cmy);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "specItemLayout.findViewB…tView>(R.id.select_count)");
        this.y = (TextView) findViewById4;
        View findViewById5 = this.A.findViewById(C0906R.id.d22);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "specItemLayout.findViewB…ew>(R.id.text_user_limit)");
        this.z = (TextView) findViewById5;
        a().addView(this.A);
        c().setOnButtonClickListener(this);
        j().setOnClickListener(this);
        ViewParent parent = a().getParent();
        if (parent instanceof NestedScrollView) {
            ((NestedScrollView) parent).setOnScrollChangeListener(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final View a(List<String> list, View view) {
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, view}, this, f37767a, false, 29394, new Class[]{List.class, View.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{list2, view}, this, f37767a, false, 29394, new Class[]{List.class, View.class}, View.class);
        }
        View inflate = LayoutInflater.from(view.getContext()).inflate(C0906R.layout.lm, a(), false);
        ReductionTextView reductionTextView = (ReductionTextView) inflate.findViewById(C0906R.id.ccs);
        reductionTextView.setTextSize(11.0f);
        g.a aVar = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b;
        Context context = reductionTextView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        reductionTextView.setTextColor(aVar.a(context, C0906R.color.fu));
        reductionTextView.setReductions(list2);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return inflate;
    }

    /* access modifiers changed from: package-private */
    public final List<View> b(List<com.ss.android.ugc.aweme.commerce.service.models.aj> list, View view) {
        g.a aVar;
        Context context;
        int i2;
        List<com.ss.android.ugc.aweme.commerce.service.models.aj> list2 = list;
        int i3 = 2;
        if (PatchProxy.isSupport(new Object[]{list2, view}, this, f37767a, false, 29395, new Class[]{List.class, View.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list2, view}, this, f37767a, false, 29395, new Class[]{List.class, View.class}, List.class);
        }
        List<View> arrayList = new ArrayList<>();
        int size = list.size();
        int i4 = 0;
        while (i4 < size) {
            View inflate = LayoutInflater.from(view.getContext()).inflate(C0906R.layout.ll, a(), false);
            com.ss.android.ugc.aweme.commerce.service.models.aj ajVar = list2.get(i4);
            if (inflate instanceof SkuCouponItemLayout) {
                SkuCouponItemLayout skuCouponItemLayout = (SkuCouponItemLayout) inflate;
                skuCouponItemLayout.setCouponMetaId(ajVar.f38181a);
                skuCouponItemLayout.setOnVisibleChangeListener(this);
            }
            int i5 = ajVar.k % 10;
            if (i5 == 1) {
                Intrinsics.checkExpressionValueIsNotNull(inflate, "viewItem");
                PriceView priceView = (PriceView) inflate.findViewById(C0906R.id.dtp);
                Intrinsics.checkExpressionValueIsNotNull(priceView, "viewItem.view_coupon_price");
                priceView.setVisibility(8);
                DmtTextView dmtTextView = (DmtTextView) inflate.findViewById(C0906R.id.d0n);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "viewItem.text_coupon_discount");
                dmtTextView.setText(ajVar.f38185e);
                DmtTextView dmtTextView2 = (DmtTextView) inflate.findViewById(C0906R.id.d0p);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "viewItem.text_coupon_zhe");
                g.a aVar2 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b;
                Context context2 = view.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "view.context");
                dmtTextView2.setText(aVar2.a(context2, C0906R.string.sp, new Object[0]));
            } else if (i5 == 3 || i5 == i3) {
                Intrinsics.checkExpressionValueIsNotNull(inflate, "viewItem");
                ((PriceView) inflate.findViewById(C0906R.id.dtp)).setYangBold(true);
                DmtTextView dmtTextView3 = (DmtTextView) inflate.findViewById(C0906R.id.d0n);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "viewItem.text_coupon_discount");
                dmtTextView3.setVisibility(8);
                DmtTextView dmtTextView4 = (DmtTextView) inflate.findViewById(C0906R.id.d0p);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView4, "viewItem.text_coupon_zhe");
                dmtTextView4.setVisibility(8);
                ((PriceView) inflate.findViewById(C0906R.id.dtp)).setPriceText(ajVar.f38184d);
            }
            Intrinsics.checkExpressionValueIsNotNull(inflate, "viewItem");
            DmtTextView dmtTextView5 = (DmtTextView) inflate.findViewById(C0906R.id.d0m);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView5, "viewItem.text_coupon_condition");
            dmtTextView5.setText(ajVar.f38183c);
            if (!TextUtils.isEmpty(ajVar.f38186f)) {
                DmtTextView dmtTextView6 = (DmtTextView) inflate.findViewById(C0906R.id.d0o);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView6, "viewItem.text_coupon_label");
                dmtTextView6.setVisibility(0);
                View findViewById = inflate.findViewById(C0906R.id.dum);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "viewItem.view_space_line");
                findViewById.setVisibility(0);
                DmtTextView dmtTextView7 = (DmtTextView) inflate.findViewById(C0906R.id.d0o);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView7, "viewItem.text_coupon_label");
                dmtTextView7.setText(ajVar.f38186f);
            } else {
                DmtTextView dmtTextView8 = (DmtTextView) inflate.findViewById(C0906R.id.d0o);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView8, "viewItem.text_coupon_label");
                dmtTextView8.setVisibility(8);
                View findViewById2 = inflate.findViewById(C0906R.id.dum);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "viewItem.view_space_line");
                findViewById2.setVisibility(8);
                DmtTextView dmtTextView9 = (DmtTextView) inflate.findViewById(C0906R.id.d0e);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView9, "viewItem.text_apply_date");
                DmtTextView dmtTextView10 = (DmtTextView) inflate.findViewById(C0906R.id.d0e);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView10, "viewItem.text_apply_date");
                ViewGroup.LayoutParams layoutParams = dmtTextView10.getLayoutParams();
                if (layoutParams != null) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    layoutParams2.setMargins(0, 6, 0, 0);
                    dmtTextView9.setLayoutParams(layoutParams2);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                }
            }
            DmtTextView dmtTextView11 = (DmtTextView) inflate.findViewById(C0906R.id.d0e);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView11, "viewItem.text_apply_date");
            dmtTextView11.setText(ajVar.i);
            if (ajVar.l || !ajVar.j) {
                DmtTextView dmtTextView12 = (DmtTextView) inflate.findViewById(C0906R.id.d0d);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView12, "viewItem.text_apply_button");
                dmtTextView12.setEnabled(false);
                DmtTextView dmtTextView13 = (DmtTextView) inflate.findViewById(C0906R.id.d0d);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView13, "viewItem.text_apply_button");
                if (ajVar.l) {
                    aVar = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b;
                    context = view.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
                    i2 = C0906R.string.a92;
                } else {
                    aVar = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b;
                    View view2 = this.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                    context = view2.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
                    i2 = C0906R.string.xk;
                }
                dmtTextView13.setText(aVar.a(context, i2, new Object[0]));
                Context context3 = view.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context3, "view.context");
                ((DmtTextView) inflate.findViewById(C0906R.id.d0d)).setTextColor(context3.getResources().getColor(C0906R.color.ky));
            } else {
                DmtTextView dmtTextView14 = (DmtTextView) inflate.findViewById(C0906R.id.d0d);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView14, "viewItem.text_apply_button");
                g.a aVar3 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b;
                Context context4 = view.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context4, "view.context");
                dmtTextView14.setText(aVar3.a(context4, C0906R.string.y_, new Object[0]));
                Context context5 = view.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context5, "view.context");
                ((DmtTextView) inflate.findViewById(C0906R.id.d0d)).setTextColor(context5.getResources().getColor(C0906R.color.f4489c));
                DmtTextView dmtTextView15 = (DmtTextView) inflate.findViewById(C0906R.id.d0d);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView15, "viewItem.text_apply_button");
                dmtTextView15.setEnabled(true);
                ((DmtTextView) inflate.findViewById(C0906R.id.d0d)).setOnClickListener(new q(this, ajVar, inflate));
            }
            arrayList.add(inflate);
            i4++;
            i3 = 2;
        }
        return arrayList;
    }

    public final void a(NestedScrollView nestedScrollView, int i2) {
        NestedScrollView nestedScrollView2 = nestedScrollView;
        if (PatchProxy.isSupport(new Object[]{nestedScrollView2, Integer.valueOf(i2)}, this, f37767a, false, 29397, new Class[]{NestedScrollView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nestedScrollView2, Integer.valueOf(i2)}, this, f37767a, false, 29397, new Class[]{NestedScrollView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        nestedScrollView2.post(new ag(nestedScrollView2, i2));
    }

    /* access modifiers changed from: package-private */
    public final void a(Context context, int i2, String str) {
        String str2;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i2), str}, this, f37767a, false, 29402, new Class[]{Context.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i2), str}, this, f37767a, false, 29402, new Class[]{Context.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = str;
        } else {
            str2 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(context2, i2, new Object[0]);
        }
        UIUtils.displayToast(context2, str2);
    }

    public final void onScrollChange(@NotNull NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
        NestedScrollView nestedScrollView2 = nestedScrollView;
        if (PatchProxy.isSupport(new Object[]{nestedScrollView2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f37767a, false, 29381, new Class[]{NestedScrollView.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nestedScrollView2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f37767a, false, 29381, new Class[]{NestedScrollView.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(nestedScrollView2, NotifyType.VIBRATE);
        com.ss.android.ugc.aweme.commerce.service.models.ak akVar = this.l;
        if (akVar != null) {
            akVar.N = i3;
        }
        int measuredHeight = nestedScrollView.getMeasuredHeight();
        View childAt = nestedScrollView2.getChildAt(0);
        if (childAt != null) {
            LinearLayout linearLayout = (LinearLayout) childAt;
            int childCount = linearLayout.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt2 = linearLayout.getChildAt(i6);
                if (childAt2 instanceof SkuCouponItemLayout) {
                    SkuCouponItemLayout skuCouponItemLayout = (SkuCouponItemLayout) childAt2;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(measuredHeight)}, skuCouponItemLayout, SkuCouponItemLayout.f37873a, false, 29462, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        SkuCouponItemLayout skuCouponItemLayout2 = skuCouponItemLayout;
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(measuredHeight)}, skuCouponItemLayout2, SkuCouponItemLayout.f37873a, false, 29462, new Class[]{Integer.TYPE}, Void.TYPE);
                    } else {
                        skuCouponItemLayout.a(measuredHeight);
                    }
                }
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
    }

    public final void a(Fragment fragment, LinearLayout linearLayout, com.ss.android.ugc.aweme.commerce.service.models.ak akVar, User user, SkuPanelAdapter skuPanelAdapter) {
        com.ss.android.ugc.aweme.commerce.service.models.ak akVar2 = akVar;
        if (PatchProxy.isSupport(new Object[]{fragment, linearLayout, akVar2, user, skuPanelAdapter}, this, f37767a, false, 29388, new Class[]{Fragment.class, LinearLayout.class, com.ss.android.ugc.aweme.commerce.service.models.ak.class, User.class, SkuPanelAdapter.class}, Void.TYPE)) {
            Object[] objArr = {fragment, linearLayout, akVar2, user, skuPanelAdapter};
            PatchProxy.accessDispatch(objArr, this, f37767a, false, 29388, new Class[]{Fragment.class, LinearLayout.class, com.ss.android.ugc.aweme.commerce.service.models.ak.class, User.class, SkuPanelAdapter.class}, Void.TYPE);
            return;
        }
        String str = akVar2.f38190d;
        String str2 = akVar2.f38191e;
        if (str == null || str2 == null || akVar2.O) {
            b(fragment, linearLayout, akVar, user, skuPanelAdapter);
            return;
        }
        com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c cVar = com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c.k;
        i iVar = new i(this, str, akVar, fragment, linearLayout, user, skuPanelAdapter);
        cVar.a(str, str2, iVar);
    }

    public final void b(Fragment fragment, LinearLayout linearLayout, com.ss.android.ugc.aweme.commerce.service.models.ak akVar, User user, SkuPanelAdapter skuPanelAdapter) {
        boolean z2;
        String str;
        boolean z3;
        boolean z4;
        String str2;
        int i2;
        int i3;
        Fragment fragment2 = fragment;
        LinearLayout linearLayout2 = linearLayout;
        com.ss.android.ugc.aweme.commerce.service.models.ak akVar2 = akVar;
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{fragment2, linearLayout2, akVar2, user2, skuPanelAdapter}, this, f37767a, false, 29389, new Class[]{Fragment.class, LinearLayout.class, com.ss.android.ugc.aweme.commerce.service.models.ak.class, User.class, SkuPanelAdapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2, linearLayout2, akVar2, user2, skuPanelAdapter}, this, f37767a, false, 29389, new Class[]{Fragment.class, LinearLayout.class, com.ss.android.ugc.aweme.commerce.service.models.ak.class, User.class, SkuPanelAdapter.class}, Void.TYPE);
            return;
        }
        if (!akVar2.M) {
            ViewParent parent = a().getParent();
            if (parent instanceof NestedScrollView) {
                a((NestedScrollView) parent, akVar2.N);
            }
        }
        t().setVisibility(8);
        s().setVisibility(8);
        if (this.o == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        b(z2);
        m().setMinLines(1);
        linearLayout.removeAllViews();
        linearLayout2.setTag(C0906R.id.crt, akVar2.f38190d);
        if (akVar2.f38189c == null && !TextUtils.isEmpty(akVar2.y)) {
            Object fromJson = new Gson().fromJson(akVar2.y, com.ss.android.ugc.aweme.commerce.service.models.y.class);
            Intrinsics.checkExpressionValueIsNotNull(fromJson, "Gson().fromJson(good.sku…ing, SkuInfo::class.java)");
            com.ss.android.ugc.aweme.commerce.service.l.d.a(akVar2, (com.ss.android.ugc.aweme.commerce.service.models.y) fromJson);
        }
        if (akVar2.z) {
            B().setVisibility(0);
        } else {
            B().setVisibility(8);
        }
        if (this.o == 2) {
            com.ss.android.ugc.aweme.commerce.service.models.s sVar = akVar2.w;
            if (sVar != null) {
                i2 = sVar.getSkuMinPrice();
            } else {
                i2 = 0;
            }
            com.ss.android.ugc.aweme.commerce.service.models.s sVar2 = akVar2.w;
            if (sVar2 != null) {
                i3 = sVar2.getSkuMaxPrice();
            } else {
                i3 = 0;
            }
            str = com.ss.android.ugc.aweme.commerce.service.l.d.a(i2, i3);
        } else {
            str = com.ss.android.ugc.aweme.commerce.service.l.d.a(akVar2.o, akVar2.p);
        }
        if (TextUtils.isEmpty(str)) {
            g.a aVar = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b;
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
            str = aVar.a(context, C0906R.string.yz, com.ss.android.ugc.aweme.commerce.service.l.d.a(akVar2.n));
        }
        k().setOnClickListener(new am(this, akVar2, fragment2));
        Boolean bool = akVar2.K;
        if (bool != null) {
            z3 = bool.booleanValue();
        } else {
            z3 = false;
        }
        com.ss.android.ugc.aweme.commerce.sdk.b.a aVar2 = com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e;
        RemoteImageView g2 = g();
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        Context context2 = view2.getContext();
        Context context3 = context2;
        Intrinsics.checkExpressionValueIsNotNull(context2, "itemView.context");
        PriceView o2 = o();
        TextView m2 = m();
        com.ss.android.ugc.aweme.commerce.service.models.ak akVar3 = akVar2;
        TextView n2 = n();
        InterceptTouchLinearLayout interceptTouchLinearLayout = (InterceptTouchLinearLayout) this.A.findViewById(C0906R.id.bhz);
        Intrinsics.checkExpressionValueIsNotNull(interceptTouchLinearLayout, "specItemLayout.ll_sku_list_container");
        Intrinsics.checkExpressionValueIsNotNull(str, "defaultPrice");
        this.h = aVar2.a(g2, context3, o2, m2, n2, interceptTouchLinearLayout, linearLayout, C(), this.x, this.w, this.y, this.z, akVar, str, z3, an.INSTANCE);
        com.ss.android.ugc.aweme.commerce.service.k.a aVar3 = this.h;
        if (aVar3 != null) {
            aVar3.a(new com.ss.android.ugc.aweme.commerce.service.i.a(2, fragment2, 1));
        }
        if (z3) {
            r().setBackgroundResource(2130838426);
        } else {
            r().setBackgroundResource(2130838420);
        }
        if (!z3 || !Intrinsics.areEqual((Object) akVar3.L, (Object) Boolean.TRUE)) {
            h().setBackgroundResource(2130838423);
            ViewGroup.LayoutParams layoutParams = h().getLayoutParams();
            if (layoutParams != null) {
                ((LinearLayout.LayoutParams) layoutParams).setMargins(0, 0, 0, 0);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        } else {
            h().setBackgroundResource(2130838427);
            ViewGroup.LayoutParams layoutParams2 = h().getLayoutParams();
            if (layoutParams2 != null) {
                ((LinearLayout.LayoutParams) layoutParams2).setMargins(1, 0, 0, 0);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
        View.OnClickListener arVar = new ar(this, z3, akVar3);
        h().setOnClickListener(arVar);
        r().setOnClickListener(new ao(this, z3, akVar3));
        if (akVar.a()) {
            h().setVisibility(8);
            r().setVisibility(8);
            i().setVisibility(8);
            p().setVisibility(0);
            w().setVisibility(8);
            u().setVisibility(8);
            TextView q2 = q();
            PromotionPreSale promotionPreSale = akVar3.u;
            if (promotionPreSale != null) {
                str2 = promotionPreSale.getButtonPrefix();
            } else {
                str2 = null;
            }
            q2.setText(str2);
            p().setOnClickListener(arVar);
        } else if (akVar.b()) {
            h().setVisibility(8);
            r().setVisibility(0);
            i().setVisibility(0);
            p().setVisibility(8);
            w().setVisibility(8);
            u().setVisibility(8);
            PromotionAppointment promotionAppointment = akVar3.v;
            if (promotionAppointment != null) {
                z4 = promotionAppointment.isAppointment();
            } else {
                z4 = false;
            }
            if (z4) {
                TextView i4 = i();
                View view3 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
                i4.setText(view3.getContext().getString(C0906R.string.fu));
            } else {
                TextView i5 = i();
                View view4 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
                i5.setText(view4.getContext().getString(C0906R.string.fw));
            }
            i().setOnClickListener(new ap(this, akVar3, user));
        } else if (this.o == 1) {
            h().setVisibility(8);
            r().setVisibility(8);
            i().setVisibility(8);
            p().setVisibility(8);
            w().setVisibility(0);
            u().setVisibility(0);
            w().setOnClickListener(arVar);
            u().setOnClickListener(new aq(this, akVar3, fragment2));
        } else {
            if (this.o == 2) {
                h().setVisibility(0);
                r().setVisibility(0);
                i().setVisibility(8);
                p().setVisibility(8);
                w().setVisibility(8);
                u().setVisibility(8);
                t().setVisibility(0);
                if (akVar3.p > 0) {
                    s().setVisibility(0);
                    s().setPriceText(com.ss.android.ugc.aweme.commerce.service.l.d.a(akVar3.p));
                    if (B().getVisibility() == 0 && B().getLineCount() > 1) {
                        B().setVisibility(8);
                    }
                } else {
                    s().setVisibility(8);
                }
            } else {
                h().setVisibility(0);
                r().setVisibility(0);
                i().setVisibility(8);
                p().setVisibility(8);
                w().setVisibility(8);
                u().setVisibility(8);
            }
        }
    }

    @SuppressLint({"TooManyMethodParam"})
    public final void a(@NotNull Fragment fragment, @Nullable com.ss.android.ugc.aweme.commerce.service.models.ak akVar, int i2, int i3, @Nullable User user, @NotNull SkuPanelAdapter skuPanelAdapter) {
        String str;
        boolean z2;
        String str2;
        Fragment fragment2 = fragment;
        com.ss.android.ugc.aweme.commerce.service.models.ak akVar2 = akVar;
        int i4 = i3;
        SkuPanelAdapter skuPanelAdapter2 = skuPanelAdapter;
        if (PatchProxy.isSupport(new Object[]{fragment2, akVar2, Integer.valueOf(i2), Integer.valueOf(i3), user, skuPanelAdapter2}, this, f37767a, false, 29383, new Class[]{Fragment.class, com.ss.android.ugc.aweme.commerce.service.models.ak.class, Integer.TYPE, Integer.TYPE, User.class, SkuPanelAdapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2, akVar2, Integer.valueOf(i2), Integer.valueOf(i3), user, skuPanelAdapter2}, this, f37767a, false, 29383, new Class[]{Fragment.class, com.ss.android.ugc.aweme.commerce.service.models.ak.class, Integer.TYPE, Integer.TYPE, User.class, SkuPanelAdapter.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fragment2, "fragment");
        Intrinsics.checkParameterIsNotNull(skuPanelAdapter2, "adapter");
        this.l = akVar2;
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (i4 == 1) {
                marginLayoutParams.width = -1;
                View view2 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                Context context = view2.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
                marginLayoutParams.rightMargin = context.getResources().getDimensionPixelOffset(C0906R.dimen.fo);
                View view3 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
                marginLayoutParams.bottomMargin = (int) UIUtils.dip2Px(view3.getContext(), 28.0f);
            } else {
                if (i2 == i4 - 1) {
                    View view4 = this.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
                    Context context2 = view4.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context2, "itemView.context");
                    marginLayoutParams.rightMargin = context2.getResources().getDimensionPixelOffset(C0906R.dimen.fo);
                } else {
                    marginLayoutParams.rightMargin = 0;
                }
                marginLayoutParams.width = (int) (((float) this.s) * 0.8f);
                View view5 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
                marginLayoutParams.bottomMargin = (int) UIUtils.dip2Px(view5.getContext(), 28.0f);
            }
            View view6 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
            view6.setLayoutParams(marginLayoutParams);
        }
        if (akVar2 == null) {
            z().setVisibility(8);
            A().setVisibility(0);
            return;
        }
        A().setVisibility(8);
        String str3 = akVar2.f38190d;
        String str4 = akVar2.f38191e;
        if (!akVar.c() || this.n != null) {
            str = str4;
            str2 = str3;
            z2 = false;
            if (!akVar.c()) {
                this.o = 0;
                this.n = null;
            }
        } else {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            com.ss.android.ugc.aweme.commerce.service.models.s sVar = akVar2.w;
            if (sVar == null) {
                Intrinsics.throwNpe();
            }
            long millis = timeUnit.toMillis(sVar.getBeginTime());
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            com.ss.android.ugc.aweme.commerce.service.models.s sVar2 = akVar2.w;
            if (sVar2 == null) {
                Intrinsics.throwNpe();
            }
            long millis2 = timeUnit2.toMillis(sVar2.getEndTime());
            this.m = str3 + '-' + str4;
            str = str4;
            str2 = str3;
            z2 = false;
            aw awVar = new aw(this, millis, millis2, str3, str4, akVar, fragment, user, skuPanelAdapter);
            this.n = awVar;
            com.ss.android.ugc.aweme.commerce.service.l.h d2 = com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.c.d();
            if (d2 != null) {
                d2.a(this.m, this.n);
            }
        }
        a(z2);
        int childCount = a().getChildCount();
        if (childCount > 1) {
            a().removeViewsInLayout(z2, childCount - 1);
        }
        c().setViewState(z2);
        String str5 = str;
        a.f37837c.a(str2, str5, new ax(this, str2, akVar2));
        if (akVar2.f38189c != null || !TextUtils.isEmpty(akVar2.y)) {
            a(fragment, this.f37769c, akVar, user, skuPanelAdapter);
        } else {
            a(str2, str5, akVar, fragment, user, skuPanelAdapter);
        }
        x().setVisibility(z2 ? 1 : 0);
        View.OnClickListener onClickListener = this;
        x().setOnClickListener(onClickListener);
        y().setOnClickListener(onClickListener);
    }
}
