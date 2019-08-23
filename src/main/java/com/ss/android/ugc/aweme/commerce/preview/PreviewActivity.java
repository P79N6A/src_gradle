package com.ss.android.ugc.aweme.commerce.preview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.react.common.MapBuilder;
import com.google.gson.Gson;
import com.gyf.barlibrary.ImmersionBar;
import com.gyf.barlibrary.OSUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commerce.billshare.a;
import com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowsePresenter;
import com.ss.android.ugc.aweme.commerce.preview.PreviewHomeWatcherReceiver;
import com.ss.android.ugc.aweme.commerce.preview.activitybar.PreviewActivityBar;
import com.ss.android.ugc.aweme.commerce.preview.activitybar.a;
import com.ss.android.ugc.aweme.commerce.preview.activitybar.b;
import com.ss.android.ugc.aweme.commerce.preview.api.PreviewApi;
import com.ss.android.ugc.aweme.commerce.preview.api.a;
import com.ss.android.ugc.aweme.commerce.preview.api.a.b;
import com.ss.android.ugc.aweme.commerce.preview.dialog.FootprintFragment;
import com.ss.android.ugc.aweme.commerce.preview.dialog.FullReductionDialog;
import com.ss.android.ugc.aweme.commerce.preview.dialog.ServiceIntroDialog;
import com.ss.android.ugc.aweme.commerce.preview.f;
import com.ss.android.ugc.aweme.commerce.preview.footprint.b;
import com.ss.android.ugc.aweme.commerce.preview.footprint.c;
import com.ss.android.ugc.aweme.commerce.preview.m;
import com.ss.android.ugc.aweme.commerce.preview.pops.CouponSelectPopUp;
import com.ss.android.ugc.aweme.commerce.preview.refresh.PtrFrameLayout;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.commerce.service.l.g;
import com.ss.android.ugc.aweme.commerce.service.l.l;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.commerce.service.models.PromotionAppointment;
import com.ss.android.ugc.aweme.commerce.service.models.PromotionMarketFloor;
import com.ss.android.ugc.aweme.commerce.service.models.n;
import com.ss.android.ugc.aweme.commerce.service.widgets.CountDownLayout;
import com.ss.android.ugc.aweme.commerce.service.widgets.PriceView;
import com.ss.android.ugc.aweme.commerce.service.widgets.SnapshotAnimView;
import com.ss.android.ugc.aweme.commerce.service.widgets.SquareSlidesLayout;
import com.ss.android.ugc.aweme.commerce.widget.ObservableHorizontalScrollView;
import com.ss.android.ugc.aweme.commerce.widget.PreviewBottom;
import com.ss.android.ugc.aweme.commerce.widget.PreviewRelativeLayout;
import com.ss.android.ugc.aweme.commerce.widget.PreviewTitle;
import com.ss.android.ugc.aweme.commerce.widget.RoundSelectorBtn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.model.b;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.dr;
import com.ss.android.ugc.aweme.utils.dv;
import com.ss.android.ugc.aweme.utils.eb;
import com.ss.android.ugc.aweme.views.RoundedRelativeLayout;
import com.ss.android.ugc.aweme.widget.flowlayout.FlowLayout;
import com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 °\u00022\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002°\u0002B\u0005¢\u0006\u0002\u0010\u0004J\t\u0010\u0001\u001a\u00020[H\u0002J\t\u0010\u0001\u001a\u00020[H\u0002J\t\u0010\u0001\u001a\u00020[H\u0002J;\u0010\u0001\u001a\u00020[2\u0007\u0010\u0001\u001a\u00020\u00142\u0007\u0010\u0001\u001a\u00020`2\t\b\u0002\u0010 \u0001\u001a\u00020\u00162\u0013\u0010¡\u0001\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020[0YH\u0002J\t\u0010¢\u0001\u001a\u00020[H\u0002J\t\u0010£\u0001\u001a\u00020[H\u0002J\u0012\u0010¤\u0001\u001a\u00020\u001e2\u0007\u0010¥\u0001\u001a\u00020\u0003H\u0002J\t\u0010¦\u0001\u001a\u00020[H\u0002J\t\u0010§\u0001\u001a\u00020[H\u0002J\t\u0010¨\u0001\u001a\u00020[H\u0002J\t\u0010©\u0001\u001a\u00020[H\u0002J\u0012\u0010ª\u0001\u001a\u00020[2\u0007\u0010«\u0001\u001a\u00020\u0016H\u0002J\t\u0010¬\u0001\u001a\u00020\u0014H\u0002J\t\u0010­\u0001\u001a\u00020\u0014H\u0002J\t\u0010®\u0001\u001a\u00020[H\u0002J\t\u0010¯\u0001\u001a\u00020[H\u0002J\u0014\u0010°\u0001\u001a\u00020[2\t\b\u0002\u0010±\u0001\u001a\u00020\u0016H\u0002J9\u0010²\u0001\u001a\u00020[2\t\u0010³\u0001\u001a\u0004\u0018\u00010$2\t\u0010´\u0001\u001a\u0004\u0018\u00010$2\u0018\b\u0002\u0010µ\u0001\u001a\u0011\u0012\u0005\u0012\u00030¶\u0001\u0012\u0004\u0012\u00020[\u0018\u00010YH\u0002J\u001f\u0010·\u0001\u001a\u00020[2\t\u0010³\u0001\u001a\u0004\u0018\u00010$2\t\u0010´\u0001\u001a\u0004\u0018\u00010$H\u0002J\u001b\u0010¸\u0001\u001a\u00020[2\u0010\u0010µ\u0001\u001a\u000b\u0012\u0004\u0012\u00020[\u0018\u00010¹\u0001H\u0002J$\u0010º\u0001\u001a\u00020[2\u0007\u0010»\u0001\u001a\u00020\u001e2\u0010\u0010µ\u0001\u001a\u000b\u0012\u0004\u0012\u00020[\u0018\u00010¹\u0001H\u0002J\t\u0010¼\u0001\u001a\u00020[H\u0016J\f\u0010½\u0001\u001a\u0005\u0018\u00010¾\u0001H\u0002J\t\u0010¿\u0001\u001a\u00020[H\u0002J\t\u0010À\u0001\u001a\u00020[H\u0002J\u0007\u0010Á\u0001\u001a\u00020[J\u0012\u0010Â\u0001\u001a\u00020[2\u0007\u0010Ã\u0001\u001a\u000209H\u0002J\t\u0010Ä\u0001\u001a\u00020[H\u0002J\t\u0010Å\u0001\u001a\u00020[H\u0002J\u0007\u0010Æ\u0001\u001a\u00020[J\t\u0010Ç\u0001\u001a\u00020[H\u0002J\t\u0010È\u0001\u001a\u00020[H\u0002J\t\u0010É\u0001\u001a\u00020[H\u0002J\t\u0010Ê\u0001\u001a\u00020[H\u0002J\u0007\u0010Ë\u0001\u001a\u00020[J\t\u0010Ì\u0001\u001a\u00020[H\u0002J\t\u0010Í\u0001\u001a\u00020[H\u0002J\t\u0010Î\u0001\u001a\u00020\u0016H\u0002J\t\u0010Ï\u0001\u001a\u00020[H\u0002J\t\u0010Ð\u0001\u001a\u00020[H\u0002J\u0013\u0010Ñ\u0001\u001a\u00020[2\b\u0010Ò\u0001\u001a\u00030Ó\u0001H\u0002J\t\u0010Ô\u0001\u001a\u00020[H\u0002J\t\u0010Õ\u0001\u001a\u00020[H\u0002J\t\u0010Ö\u0001\u001a\u00020[H\u0002J0\u0010×\u0001\u001a\u00020[2\t\u0010Ø\u0001\u001a\u0004\u0018\u00010\u001e2\t\u0010Ù\u0001\u001a\u0004\u0018\u00010$2\t\u0010Ú\u0001\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0003\u0010Û\u0001J\t\u0010Ü\u0001\u001a\u00020[H\u0002J\u001b\u0010Ý\u0001\u001a\u00020[2\u0007\u0010Þ\u0001\u001a\u00020~2\u0007\u0010ß\u0001\u001a\u00020$H\u0002J\t\u0010à\u0001\u001a\u00020[H\u0002J\u0012\u0010á\u0001\u001a\u00020[2\u0007\u0010â\u0001\u001a\u00020\u001eH\u0002J\u001b\u0010ã\u0001\u001a\u00020[2\u0007\u0010\u0001\u001a\u00020`2\u0007\u0010 \u0001\u001a\u00020\u0016H\u0002J\t\u0010ä\u0001\u001a\u00020[H\u0016J\u0012\u0010å\u0001\u001a\u00020[2\u0007\u0010æ\u0001\u001a\u00020\u0014H\u0002J\t\u0010ç\u0001\u001a\u00020[H\u0002J\u0015\u0010è\u0001\u001a\u00020[2\n\u0010é\u0001\u001a\u0005\u0018\u00010ê\u0001H\u0014J\t\u0010ë\u0001\u001a\u00020[H\u0014J\u0013\u0010ì\u0001\u001a\u00020[2\b\u0010í\u0001\u001a\u00030î\u0001H\u0007J\u0013\u0010ì\u0001\u001a\u00020[2\b\u0010í\u0001\u001a\u00030ï\u0001H\u0007J#\u0010ð\u0001\u001a\u00020[2\u000f\u0010ñ\u0001\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001082\u0007\u0010ò\u0001\u001a\u00020\u0016H\u0016J#\u0010ó\u0001\u001a\u00020[2\u000f\u0010ñ\u0001\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001082\u0007\u0010ò\u0001\u001a\u00020\u0016H\u0016J \u0010\\\u001a\u00020[2\u0007\u0010Ã\u0001\u001a\u0002092\r\u0010ô\u0001\u001a\b\u0012\u0004\u0012\u0002090(H\u0002J\t\u0010õ\u0001\u001a\u00020[H\u0014J#\u0010ö\u0001\u001a\u00020[2\u000f\u0010ñ\u0001\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001082\u0007\u0010ò\u0001\u001a\u00020\u0016H\u0016J\t\u0010÷\u0001\u001a\u00020[H\u0014J\u0013\u0010ø\u0001\u001a\u00020[2\b\u0010é\u0001\u001a\u00030ê\u0001H\u0014J\t\u0010ù\u0001\u001a\u00020[H\u0002J\t\u0010ú\u0001\u001a\u00020[H\u0002J\u001b\u0010û\u0001\u001a\u00020[2\u0007\u0010ü\u0001\u001a\u00020\u001e2\u0007\u0010ý\u0001\u001a\u00020\u0016H\u0002J\u0012\u0010þ\u0001\u001a\u00020[2\u0007\u0010ÿ\u0001\u001a\u00020\u0016H\u0003J\u0012\u0010\u0002\u001a\u00020[2\u0007\u0010\u0002\u001a\u00020\u001eH\u0002J\t\u0010\u0002\u001a\u00020[H\u0002J\u001a\u0010\u0002\u001a\u00020[2\u000f\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010(H\u0002J\t\u0010\u0002\u001a\u00020[H\u0002J\u0013\u0010\u0002\u001a\u00020[2\b\u0010\u0002\u001a\u00030\u0002H\u0002J\t\u0010\u0002\u001a\u00020[H\u0002J\u0012\u0010\u0002\u001a\u00020[2\u0007\u0010\u0002\u001a\u00020\u0016H\u0002J\u0018\u0010\u0002\u001a\u00020[2\r\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030(H\u0002J\t\u0010\u0002\u001a\u00020[H\u0002J\u0012\u0010\u0002\u001a\u00020[2\u0007\u0010\u0002\u001a\u00020\u001eH\u0002J\u0012\u0010\u0002\u001a\u00020[2\u0007\u0010\u0002\u001a\u00020\u001eH\u0002J\u001b\u0010\u0002\u001a\u00020[2\u0007\u0010\u0002\u001a\u00020\u001e2\u0007\u0010\u0002\u001a\u00020\u001eH\u0002J\t\u0010\u0002\u001a\u00020[H\u0014J\t\u0010\u0002\u001a\u00020[H\u0016J\u0015\u0010\u0002\u001a\u00020[2\n\u0010\u0002\u001a\u0005\u0018\u00010\u0002H\u0016J\u001b\u0010\u0002\u001a\u00020[2\u0007\u0010\u0002\u001a\u00020$2\u0007\u0010\u0002\u001a\u00020\u0016H\u0002J\u0015\u0010\u0002\u001a\u00020[2\n\u0010\u0002\u001a\u0005\u0018\u00010\u0002H\u0016J\t\u0010\u0002\u001a\u00020[H\u0016J\u0015\u0010\u0002\u001a\u00020[2\n\u0010\u0002\u001a\u0005\u0018\u00010\u0002H\u0016J\t\u0010 \u0002\u001a\u00020[H\u0016J\t\u0010¡\u0002\u001a\u00020[H\u0016J\t\u0010¢\u0002\u001a\u00020[H\u0002J\"\u0010£\u0002\u001a\u00020[2\u0007\u0010Þ\u0001\u001a\u00020~2\u000e\u0010¤\u0002\u001a\t\u0012\u0005\u0012\u00030\u00010(H\u0002J\u0015\u0010¥\u0002\u001a\u00020[2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0002J\u0014\u0010¦\u0002\u001a\u00020[2\t\u0010§\u0002\u001a\u0004\u0018\u00010)H\u0002J\u0013\u0010¨\u0002\u001a\u00020[2\b\u0010©\u0002\u001a\u00030ª\u0002H\u0002J\u001c\u0010«\u0002\u001a\u00020[2\u0007\u0010¬\u0002\u001a\u00020y2\b\u0010©\u0002\u001a\u00030ª\u0002H\u0002J\t\u0010­\u0002\u001a\u00020[H\u0002J\u0012\u0010®\u0002\u001a\u00020[2\u0007\u0010¯\u0002\u001a\u00020\u001eH\u0002R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR#\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\r0\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b \u0010!R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010'\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020&X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X.¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020-X.¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020908X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020&X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020=X.¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u000209X.¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010@\u001a\u00020A8BX\u0002¢\u0006\f\n\u0004\bD\u0010\u000b\u001a\u0004\bB\u0010CR\u0010\u0010E\u001a\u0004\u0018\u00010FX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010G\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010H\u001a\b\u0012\u0004\u0012\u00020908X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010I\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010J\u001a\b\u0012\u0004\u0012\u00020L0KX.¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020NX.¢\u0006\u0002\n\u0000R\u0014\u0010O\u001a\b\u0012\u0004\u0012\u00020\u000308X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020&X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020RX.¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020UX.¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010X\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010Z\u0012\u0004\u0012\u00020[0YX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\\\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020[0YX\u0004¢\u0006\u0002\n\u0000R \u0010]\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002090(\u0012\u0004\u0012\u00020[0YX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020&X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010_\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020[0YX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010a\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010b\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010c\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010d\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010e\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010f\u001a\u0004\u0018\u00010gX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010h\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010i\u001a\u0004\u0018\u00010jX\u000e¢\u0006\u0002\n\u0000R#\u0010k\u001a\n \u0007*\u0004\u0018\u00010l0l8BX\u0002¢\u0006\f\n\u0004\bo\u0010\u000b\u001a\u0004\bm\u0010nR\u0010\u0010p\u001a\u0004\u0018\u00010qX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010r\u001a\u0004\u0018\u00010sX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010t\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\bw\u0010\u000b\u001a\u0004\bu\u0010vR\u000e\u0010x\u001a\u00020yX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010z\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010{\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010|\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020~0}X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u000b\u0012\u0005\u0012\u00030\u0001\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R \u0010\u0001\u001a\u00030\u00018BX\u0002¢\u0006\u000f\n\u0005\b\u0001\u0010\u000b\u001a\u0006\b\u0001\u0010\u0001R\u0010\u0010\u0001\u001a\u00030\u0001X.¢\u0006\u0002\n\u0000R\u000f\u0010\u0001\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0001\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0001\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0001\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u0015\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u000308X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0001\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0001\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0005\n\u0003\u0010\u0001¨\u0006±\u0002"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/PreviewActivity;", "Lcom/ss/android/ugc/aweme/base/activity/AmeSSActivity;", "Lcom/ss/android/ugc/aweme/common/presenter/IBaseListView;", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "()V", "activityIconRIV", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "kotlin.jvm.PlatformType", "getActivityIconRIV", "()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "activityIconRIV$delegate", "Lkotlin/Lazy;", "activityTitleTV", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "getActivityTitleTV", "()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "activityTitleTV$delegate", "adapter", "Lcom/ss/android/ugc/aweme/commerce/preview/PreviewVideoAdapter;", "appointTopView", "Landroid/view/View;", "backPressed", "", "getBackPressed", "()Z", "setBackPressed", "(Z)V", "bannerHeight", "", "commentCardPosition", "", "dP1145", "getDP1145", "()I", "dP1145$delegate", "defaultActivityPrice", "", "detaiInTime", "", "detailImages", "", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "detailPosition", "enterTime", "footerView", "Landroid/widget/FrameLayout;", "getUserForMicroApp", "Lcom/ss/android/ugc/aweme/profile/model/User;", "guessULikePosition", "hasDestroyed", "headerView", "isGuessLikeListenerEnable", "isManager", "isScrolling", "logDetailDuration", "mAllPromotions", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/DetailPromotion;", "mAwemeId", "mClickBottomStartTime", "mCollectionPresenter", "Lcom/ss/android/ugc/aweme/commerce/preview/PreviewCollectPresenter;", "mDisplayGood", "mEnterMethod", "mFootprintManager", "Lcom/ss/android/ugc/aweme/commerce/preview/footprint/FootprintManager;", "getMFootprintManager", "()Lcom/ss/android/ugc/aweme/commerce/preview/footprint/FootprintManager;", "mFootprintManager$delegate", "mImmersionBar", "Lcom/gyf/barlibrary/ImmersionBar;", "mOrderType", "mOtherPromotions", "mPlayId", "mPresenter", "Lcom/ss/android/ugc/aweme/common/presenter/BaseListPresenter;", "Lcom/ss/android/ugc/aweme/commerce/preview/PreviewFeedModel;", "mProductCommentAdapter", "Lcom/ss/android/ugc/aweme/commerce/preview/ProductCommentAdapter;", "mRelatedVideos", "mStartPreviewTime", "mUserInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "mVideoActive", "mVideoCommentAdapter", "Lcom/ss/android/ugc/aweme/commerce/preview/VideoCommentAdapter;", "mY", "needRefreshFromFeeds", "onFail", "Lkotlin/Function1;", "Lorg/json/JSONObject;", "", "onLoadPromotionSuccess", "onLoadPromotionsSuccess", "onResumeTime", "openPreview", "Lcom/ss/android/ugc/aweme/commerce/service/models/BaseDetailPromotion;", "orderMiniAppUrl", "orderUrl", "originFeedAwemeId", "originId", "originType", "preSaleHandler", "Landroid/os/Handler;", "preSaleTopView", "previewActivityBar", "Lcom/ss/android/ugc/aweme/commerce/preview/activitybar/PreviewActivityBar;", "previewBottom", "Lcom/ss/android/ugc/aweme/commerce/widget/PreviewBottom;", "getPreviewBottom", "()Lcom/ss/android/ugc/aweme/commerce/widget/PreviewBottom;", "previewBottom$delegate", "previewHomeWatcherReceiver", "Lcom/ss/android/ugc/aweme/commerce/preview/PreviewHomeWatcherReceiver;", "previewModel", "Lcom/ss/android/ugc/aweme/commerce/service/models/PreviewParams;", "productCommentView", "getProductCommentView", "()Landroid/view/View;", "productCommentView$delegate", "rect", "Landroid/graphics/Rect;", "referFrom", "secKillStarted", "shopDetails", "", "Lcom/ss/android/ugc/aweme/commerce/preview/ShopDetailVO;", "shopList", "Lcom/ss/android/ugc/aweme/commerce/service/models/SimpleDetailPromotion;", "shopRecommend", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopRecommend;", "skuInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/SkuInfo;", "skuPanelState", "Lcom/ss/android/ugc/aweme/commerce/service/models/SkuPanelState;", "smoothScroller", "Landroid/support/v7/widget/RecyclerView$SmoothScroller;", "getSmoothScroller", "()Landroid/support/v7/widget/RecyclerView$SmoothScroller;", "smoothScroller$delegate", "staggeredLayoutManager", "Landroid/support/v7/widget/StaggeredGridLayoutManager;", "syncFromFeeds", "threshold", "toNewPage", "videoCommentModel", "Lcom/ss/android/ugc/aweme/commerce/billshare/BillShareFeedModel;", "videoCommentTotal", "videoCommentsToShow", "videoPresenter", "Lcom/ss/android/ugc/aweme/commerce/floatvideo/FloatVideoBrowsePresenter;", "videoSharePosition", "wanted", "Ljava/lang/Boolean;", "addCart", "bindAdapter", "bindFloatVideo", "bindGoodItem", "goodItem", "good", "isFromStore", "onClick", "bindVideoComment", "bindViews", "calcIndex", "aweme", "calcOtherGoods", "calcPositions", "cancelPlay", "chooseOneVideoToPlay", "chooseSkuInfo", "forAddCartPurpose", "constructFootView", "constructHeadView", "dismissFootprintGuide", "enterAppMiniShop", "enterStore", "isStoreArea", "fetchDynamicInfo", "promotionId", "productId", "onOk", "Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionDynamicInfoResponse;", "fetchShopCommentList", "fetchSkuAndDetailImages", "Lkotlin/Function0;", "fetchSkuV2", "type", "finish", "getAdWebUrlData", "Lcom/ss/android/ugc/aweme/commercialize/utils/router/web/AdWebPage$AdWebUrlData;", "getShopDetails", "getShopRecommend", "go2BillShare", "handleClickOtherGoods", "promotion", "handleCouponClick", "handleOtherGoods", "handleOtherProductLogShow", "handleRoundSelectorBtn", "handleShopDetails", "handleShopLogShow", "handleSlidesLayoutAnimation", "handleStoreProductLogShow", "handleTitleAlphaAndState", "handleVideoComments", "hasDetails", "hideLoadingInternal", "initData", "initFootprint", "context", "Landroid/app/Activity;", "initHeadAndFooterView", "initPresenter", "initStatusView", "injectNodes", "postFee", "sendFrom", "serviceInfo", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "loadPromotions", "loadShopDetail", "shopDetailVO", "uid", "loadUserInfo", "loadVideos", "queryType", "logProductShow", "onBackPressed", "onClickCollection", "v", "onClickNormalBuy", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onEvent", "event", "Lcom/ss/android/ugc/aweme/feed/event/VideoEvent;", "Lcom/ss/android/ugc/aweme/im/service/model/ShareCompleteEvent;", "onLoadLatestResult", "list", "hasMore", "onLoadMoreResult", "promotions", "onPause", "onRefreshResult", "onResume", "onSaveInstanceState", "openCart", "performRealBind", "playSpecificHolder", "index", "force", "refreshContents", "forTheFirstTime", "refreshCountBadge", "newCount", "refreshRank", "refreshTags", "tags", "refreshVideoComments", "renderActivityNode", "promotionActivity", "Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionActivity;", "renderDisplayNode", "renderSaleOutBar", "saleOut", "replaceVideos", "videos", "resetGuessULikeAndOutBoxPos", "scrollToState", "state", "setPreviewPrice", "price", "minPrice", "maxPrice", "setStatusBarColor", "showLoadEmpty", "showLoadError", "e", "Ljava/lang/Exception;", "showLoadInternal", "message", "hideIndicator", "showLoadLatestError", "showLoadLatestLoading", "showLoadMoreError", "showLoadMoreLoading", "showLoading", "showSecondDivider", "showShop", "shopGoodsForShow", "showShopMiniApp", "startAddCartAnimAfterDownloadImage", "imageUrlModel", "startAddCartAnimFromBottomButton", "bitmap", "Landroid/graphics/Bitmap;", "startAddCartAnimFromSkuPanel", "imageRect", "syncCartCount", "updateCurrentTab", "tab", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PreviewActivity extends AmeSSActivity implements com.ss.android.ugc.aweme.common.f.c<Aweme> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2890a;
    public static final a aa = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f2891b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PreviewActivity.class), "dP1145", "getDP1145()I")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PreviewActivity.class), "smoothScroller", "getSmoothScroller()Landroid/support/v7/widget/RecyclerView$SmoothScroller;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PreviewActivity.class), "productCommentView", "getProductCommentView()Landroid/view/View;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PreviewActivity.class), "mFootprintManager", "getMFootprintManager()Lcom/ss/android/ugc/aweme/commerce/preview/footprint/FootprintManager;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PreviewActivity.class), "activityTitleTV", "getActivityTitleTV()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PreviewActivity.class), "activityIconRIV", "getActivityIconRIV()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PreviewActivity.class), "previewBottom", "getPreviewBottom()Lcom/ss/android/ugc/aweme/commerce/widget/PreviewBottom;"))};
    public ProductCommentAdapter A;
    public int B;
    public com.ss.android.ugc.aweme.commerce.billshare.b C;
    public com.ss.android.ugc.aweme.commerce.service.models.h D;
    public CommerceUser E;
    public String F = "";
    public com.ss.android.ugc.aweme.commerce.service.models.y G;
    public String H;
    public String I;
    public String J;
    public String K;
    public List<? extends UrlModel> L;
    public Boolean M = Boolean.FALSE;
    public String N = "";
    public int O;
    public int P;
    public boolean Q = true;
    public String R = "INVALID_ENTER_FROM";
    public boolean S;
    public String T;
    public long U;
    public boolean V = true;
    public User W;
    public com.ss.android.ugc.aweme.commerce.service.models.v X;
    final Function1<com.ss.android.ugc.aweme.commerce.service.models.c, Unit> Y = new aw(this);
    final Lazy Z = LazyKt.lazy(new c(this));
    private final Lazy aA = LazyKt.lazy(ao.INSTANCE);
    private final Lazy aB = LazyKt.lazy(new b(this));
    private final Lazy aC = LazyKt.lazy(new ax(this));
    private HashMap aD;
    private FrameLayout ab;
    private PreviewVideoAdapter ac;
    private View ad;
    private View ae;
    private final Lazy af = LazyKt.lazy(new bk(this));
    private ImmersionBar ag;
    private final Rect ah = new Rect();
    private boolean ai = true;
    private PreviewHomeWatcherReceiver aj;
    private boolean ak;
    private Handler al;
    private final Function1<List<com.ss.android.ugc.aweme.commerce.service.models.h>, Unit> am = new au(this);
    private final Function1<com.ss.android.ugc.aweme.commerce.service.models.h, Unit> an = new at(this);
    private final Lazy ao = LazyKt.lazy(new ay(this));
    private VideoCommentAdapter ap;
    private long aq;
    private String ar = "";
    private final List<com.ss.android.ugc.aweme.commerce.service.models.h> as = new ArrayList();
    private final List<com.ss.android.ugc.aweme.commerce.service.models.h> at = new ArrayList();
    private List<Aweme> au = new ArrayList();
    private boolean av;
    private String aw;
    private long ax;
    private final Map<String, l> ay = new LinkedHashMap();
    private List<com.ss.android.ugc.aweme.commerce.service.models.w> az;

    /* renamed from: c  reason: collision with root package name */
    public List<Aweme> f2892c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.common.f.b<i> f2893d;

    /* renamed from: e  reason: collision with root package name */
    public f f2894e;

    /* renamed from: f  reason: collision with root package name */
    public FloatVideoBrowsePresenter f2895f;
    public FrameLayout g;
    public StaggeredGridLayoutManager h;
    final Lazy i = LazyKt.lazy(new z(this));
    public int j;
    public int k;
    public int l;
    public int m;
    public float n;
    public boolean o = true;
    public boolean p;
    public com.ss.android.ugc.aweme.commerce.service.models.n q;
    public long r;
    public long s;
    public boolean t;
    public boolean u = true;
    public com.ss.android.ugc.aweme.commerce.service.models.aa v;
    public final Function1<JSONObject, Unit> w = new as(this);
    public PreviewActivityBar x;
    public String y;
    public boolean z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dXT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001dXT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001dXT¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u001dXT¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/PreviewActivity$Companion;", "", "()V", "BUTTON_TYPE_BUY", "", "BUTTON_TYPE_CART", "CLICK_ADD_TO_CART", "", "CLICK_PRODUCT", "POSITION_TAKEN", "REQUEST_CODE_OPEN_ORDER", "SCROLL_Y", "VALUE_100", "VALUE_1000", "VALUE_104", "", "VALUE_1145", "VALUE_116", "VALUE_12", "VALUE_120", "VALUE_14", "VALUE_148", "VALUE_155", "VALUE_16", "VALUE_1_POINT_5", "", "VALUE_2", "VALUE_20", "VALUE_200", "", "VALUE_3", "VALUE_40", "VALUE_500", "VALUE_64", "VALUE_70", "VALUE_8", "VALUE_800", "VALUE_8000", "VALUE_96", "VALUE_99999", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "success", "", "promotionDynamicInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionDynamicInfoResponse;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class aa extends Lambda implements Function2<Boolean, com.ss.android.ugc.aweme.commerce.service.models.p, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function1 $onOk;
        final /* synthetic */ PreviewActivity this$0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/PreviewActivity$fetchDynamicInfo$1$2$1", "Lcom/ss/android/ugc/aweme/commerce/preview/activitybar/SecKillLayout$SecKillStatusListener;", "onPreSecKill", "", "onSecKill", "onSecKillEnd", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        public static final class a implements b.C0470b {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f37134a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ aa f37135b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.commerce.service.models.p f37136c;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f37134a, false, 28685, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f37134a, false, 28685, new Class[0], Void.TYPE);
                    return;
                }
                if (!this.f37135b.this$0.w().getShowOriginalButton()) {
                    PreviewBottom w = this.f37135b.this$0.w();
                    w.setShowOriginalButton(true);
                    w.a();
                }
                this.f37135b.this$0.z = false;
                com.ss.android.ugc.aweme.commerce.service.models.ag agVar = this.f37136c.f38227b;
                if (agVar != null) {
                    com.ss.android.ugc.aweme.commerce.service.models.s seckillInfo = agVar.getSeckillInfo();
                    if (seckillInfo != null) {
                        this.f37135b.this$0.y = com.ss.android.ugc.aweme.commerce.service.l.d.a(seckillInfo.getSkuMinPrice(), seckillInfo.getSkuMaxPrice());
                    }
                }
            }

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, f37134a, false, 28686, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f37134a, false, 28686, new Class[0], Void.TYPE);
                    return;
                }
                LinearLayout linearLayout = (LinearLayout) this.f37135b.this$0.e((int) C0906R.id.c5t);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "priceLayout");
                linearLayout.setVisibility(8);
                DmtTextView dmtTextView = (DmtTextView) this.f37135b.this$0.e((int) C0906R.id.d3i);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "titleView");
                ViewGroup.LayoutParams layoutParams = dmtTextView.getLayoutParams();
                if (layoutParams != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) UIUtils.dip2Px(this.f37135b.this$0, 12.0f);
                    if (this.f37135b.this$0.w().getShowOriginalButton()) {
                        PreviewBottom w = this.f37135b.this$0.w();
                        w.setShowOriginalButton(false);
                        w.a();
                    }
                    this.f37135b.this$0.z = true;
                    com.ss.android.ugc.aweme.commerce.service.models.ag agVar = this.f37136c.f38227b;
                    if (agVar != null) {
                        com.ss.android.ugc.aweme.commerce.service.models.s seckillInfo = agVar.getSeckillInfo();
                        if (seckillInfo != null) {
                            this.f37135b.this$0.y = com.ss.android.ugc.aweme.commerce.service.l.d.a(seckillInfo.getSkuMinPrice(), seckillInfo.getSkuMaxPrice());
                            return;
                        }
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }

            public final void c() {
                if (PatchProxy.isSupport(new Object[0], this, f37134a, false, 28687, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f37134a, false, 28687, new Class[0], Void.TYPE);
                    return;
                }
                LinearLayout linearLayout = (LinearLayout) this.f37135b.this$0.e((int) C0906R.id.c5t);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "priceLayout");
                linearLayout.setVisibility(0);
                DmtTextView dmtTextView = (DmtTextView) this.f37135b.this$0.e((int) C0906R.id.d3i);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "titleView");
                ViewGroup.LayoutParams layoutParams = dmtTextView.getLayoutParams();
                if (layoutParams != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) UIUtils.dip2Px(this.f37135b.this$0, 0.0f);
                    if (this.f37135b.this$0.w().getShowOriginalButton()) {
                        PreviewBottom w = this.f37135b.this$0.w();
                        w.setShowOriginalButton(false);
                        w.a();
                    }
                    PreviewActivityBar previewActivityBar = this.f37135b.this$0.x;
                    if (previewActivityBar != null) {
                        previewActivityBar.setVisibility(8);
                    }
                    this.f37135b.this$0.z = false;
                    this.f37135b.this$0.y = null;
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }

            a(aa aaVar, com.ss.android.ugc.aweme.commerce.service.models.p pVar) {
                this.f37135b = aaVar;
                this.f37136c = pVar;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/PreviewActivity$fetchDynamicInfo$1$2$2", "Lcom/ss/android/ugc/aweme/commerce/preview/activitybar/AtmosphereLayout$AtmosphereListener;", "onAtmosphereEnd", "", "onAtmosphereStart", "promotionActivity", "Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionActivity;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        public static final class b implements a.C0469a {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f37137a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ aa f37138b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.commerce.service.models.p f37139c;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f37137a, false, 28689, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f37137a, false, 28689, new Class[0], Void.TYPE);
                    return;
                }
                if (PreviewActivity.c(this.f37138b.this$0).isTaobaoGood()) {
                    View findViewById = PreviewActivity.a(this.f37138b.this$0).findViewById(C0906R.id.bbr);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById, "headerView.line_below_post_send");
                    findViewById.setVisibility(8);
                }
                LinearLayout linearLayout = (LinearLayout) PreviewActivity.a(this.f37138b.this$0).findViewById(C0906R.id.ar);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "headerView.activityLayout");
                linearLayout.setVisibility(8);
                PreviewActivityBar previewActivityBar = this.f37138b.this$0.x;
                if (previewActivityBar != null) {
                    previewActivityBar.setVisibility(8);
                }
            }

            public final void a(@NotNull com.ss.android.ugc.aweme.commerce.service.models.o oVar) {
                Object value;
                com.ss.android.ugc.aweme.commerce.service.models.o oVar2 = oVar;
                if (PatchProxy.isSupport(new Object[]{oVar2}, this, f37137a, false, 28688, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.o.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{oVar2}, this, f37137a, false, 28688, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.o.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(oVar2, "promotionActivity");
                PreviewActivity previewActivity = this.f37138b.this$0;
                if (PatchProxy.isSupport(new Object[]{oVar2}, previewActivity, PreviewActivity.f2890a, false, 28569, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.o.class}, Void.TYPE)) {
                    PreviewActivity previewActivity2 = previewActivity;
                    PatchProxy.accessDispatch(new Object[]{oVar2}, previewActivity2, PreviewActivity.f2890a, false, 28569, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.o.class}, Void.TYPE);
                } else {
                    FrameLayout frameLayout = previewActivity.g;
                    if (frameLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    View findViewById = frameLayout.findViewById(C0906R.id.bbr);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById, "headerView.line_below_post_send");
                    findViewById.setVisibility(0);
                    FrameLayout frameLayout2 = previewActivity.g;
                    if (frameLayout2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    LinearLayout linearLayout = (LinearLayout) frameLayout2.findViewById(C0906R.id.ar);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout, "headerView.activityLayout");
                    linearLayout.setVisibility(0);
                    if (PatchProxy.isSupport(new Object[0], previewActivity, PreviewActivity.f2890a, false, 28632, new Class[0], DmtTextView.class)) {
                        value = PatchProxy.accessDispatch(new Object[0], previewActivity, PreviewActivity.f2890a, false, 28632, new Class[0], DmtTextView.class);
                    } else {
                        value = previewActivity.Z.getValue();
                    }
                    DmtTextView dmtTextView = (DmtTextView) value;
                    Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "activityTitleTV");
                    String text = oVar.getText();
                    if (text == null) {
                        text = "";
                    }
                    dmtTextView.setText(text);
                    if (TextUtils.isEmpty(oVar.getIcon())) {
                        RemoteImageView v = previewActivity.v();
                        Intrinsics.checkExpressionValueIsNotNull(v, "activityIconRIV");
                        v.setVisibility(8);
                    } else {
                        RemoteImageView v2 = previewActivity.v();
                        Intrinsics.checkExpressionValueIsNotNull(v2, "activityIconRIV");
                        v2.setVisibility(0);
                        RemoteImageView v3 = previewActivity.v();
                        String icon = oVar.getIcon();
                        if (icon == null) {
                            icon = "";
                        }
                        com.ss.android.ugc.aweme.base.c.a(v3, icon);
                    }
                }
                com.ss.android.ugc.aweme.commerce.service.logs.aq aqVar = new com.ss.android.ugc.aweme.commerce.service.logs.aq();
                aqVar.f38086f = PreviewActivity.c(this.f37138b.this$0).getPromotionId();
                aqVar.g = Long.valueOf(PreviewActivity.c(this.f37138b.this$0).getCommodityType());
                aqVar.h = PreviewActivity.b(this.f37138b.this$0).getUid();
                aqVar.i = oVar.getUrl();
                aqVar.b();
            }

            b(aa aaVar, com.ss.android.ugc.aweme.commerce.service.models.p pVar) {
                this.f37138b = aaVar;
                this.f37139c = pVar;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(PreviewActivity previewActivity, Function1 function1) {
            super(2);
            this.this$0 = previewActivity;
            this.$onOk = function1;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Boolean) obj).booleanValue(), (com.ss.android.ugc.aweme.commerce.service.models.p) obj2);
            return Unit.INSTANCE;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0115, code lost:
            if (r0.canBeShow() == true) goto L_0x0121;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x011f, code lost:
            if (r0.canBeShown() == true) goto L_0x0121;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0121, code lost:
            r0 = r7.this$0.x;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0125, code lost:
            if (r0 == null) goto L_0x012a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0127, code lost:
            r0.setVisibility(0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x012a, code lost:
            r0 = r7.this$0.x;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x012e, code lost:
            if (r0 == null) goto L_0x01bf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0130, code lost:
            r1 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.c(r7.this$0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0154, code lost:
            if (com.meituan.robust.PatchProxy.isSupport(new java.lang.Object[]{r1, r8}, r0, com.ss.android.ugc.aweme.commerce.preview.activitybar.PreviewActivityBar.f37286a, false, 28824, new java.lang.Class[]{com.ss.android.ugc.aweme.commerce.service.models.h.class, com.ss.android.ugc.aweme.commerce.service.models.p.class}, java.lang.Void.TYPE) == false) goto L_0x0175;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0156, code lost:
            com.meituan.robust.PatchProxy.accessDispatch(new java.lang.Object[]{r1, r8}, r0, com.ss.android.ugc.aweme.commerce.preview.activitybar.PreviewActivityBar.f37286a, false, 28824, new java.lang.Class[]{com.ss.android.ugc.aweme.commerce.service.models.h.class, com.ss.android.ugc.aweme.commerce.service.models.p.class}, java.lang.Void.TYPE);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0175, code lost:
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, "mDisplayGood");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, "promotion");
            r0.f37287b = r1;
            r2 = r8.f38227b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0183, code lost:
            if (r2 == null) goto L_0x01a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0185, code lost:
            r2 = r2.getSeckillInfo();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0189, code lost:
            if (r2 == null) goto L_0x01a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x018b, code lost:
            r3 = r0.f37288c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x018d, code lost:
            if (r3 == null) goto L_0x01a1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x018f, code lost:
            r0 = r1.getToutiao();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0193, code lost:
            if (r0 == null) goto L_0x0199;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0195, code lost:
            r10 = r0.getMaxPrice();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0199, code lost:
            r3.setMarketPrice(r10);
            r3.a(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x01a1, code lost:
            r0.a(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a6, code lost:
            r2 = r8.f38226a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a8, code lost:
            if (r2 == null) goto L_0x028d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x01aa, code lost:
            r3 = r0.f37289d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ac, code lost:
            if (r3 == null) goto L_0x01ba;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ae, code lost:
            r3.setPrice(r1.getPrice());
            r3.a(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ba, code lost:
            r0.a(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x01bf, code lost:
            r0 = (android.view.ViewStub) r7.this$0.findViewById(com.ss.android.ugc.aweme.C0906R.id.ax);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ca, code lost:
            if (r0 == null) goto L_0x026c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x01cc, code lost:
            r1 = r7.this$0;
            r0 = r0.inflate();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d2, code lost:
            if (r0 == null) goto L_0x0264;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d4, code lost:
            r1.x = (com.ss.android.ugc.aweme.commerce.preview.activitybar.PreviewActivityBar) r0;
            r0 = r7.this$0.x;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x01dc, code lost:
            if (r0 == null) goto L_0x01e8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x01de, code lost:
            r0.setSecKillStatusListener(new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.aa.a(r7, r8));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e8, code lost:
            r0 = r7.this$0.x;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ec, code lost:
            if (r0 == null) goto L_0x01f8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ee, code lost:
            r0.setAtmosphereListener(new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.aa.b(r7, r8));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f8, code lost:
            r0 = r7.this$0.x;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x01fc, code lost:
            if (r0 == null) goto L_0x028d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x01fe, code lost:
            r1 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.c(r7.this$0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x0222, code lost:
            if (com.meituan.robust.PatchProxy.isSupport(new java.lang.Object[]{r1, r8}, r0, com.ss.android.ugc.aweme.commerce.preview.activitybar.PreviewActivityBar.f37286a, false, 28821, new java.lang.Class[]{com.ss.android.ugc.aweme.commerce.service.models.h.class, com.ss.android.ugc.aweme.commerce.service.models.p.class}, java.lang.Void.TYPE) == false) goto L_0x0242;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x0224, code lost:
            com.meituan.robust.PatchProxy.accessDispatch(new java.lang.Object[]{r1, r8}, r0, com.ss.android.ugc.aweme.commerce.preview.activitybar.PreviewActivityBar.f37286a, false, 28821, new java.lang.Class[]{com.ss.android.ugc.aweme.commerce.service.models.h.class, com.ss.android.ugc.aweme.commerce.service.models.p.class}, java.lang.Void.TYPE);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x0242, code lost:
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, "mDisplayGood");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, "promotion");
            r0.f37287b = r1;
            r1 = r8.f38227b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x0250, code lost:
            if (r1 == null) goto L_0x025c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0252, code lost:
            r1 = r1.getSeckillInfo();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x0256, code lost:
            if (r1 == null) goto L_0x025c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x0258, code lost:
            r0.a(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x025c, code lost:
            r1 = r8.f38226a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x025e, code lost:
            if (r1 == null) goto L_0x026c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0260, code lost:
            r0.a(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x026b, code lost:
            throw new kotlin.TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce.preview.activitybar.PreviewActivityBar");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x026c, code lost:
            return;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x00b1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void invoke(boolean r20, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.commerce.service.models.p r21) {
            /*
                r19 = this;
                r7 = r19
                r8 = r21
                r9 = 2
                java.lang.Object[] r0 = new java.lang.Object[r9]
                java.lang.Byte r1 = java.lang.Byte.valueOf(r20)
                r10 = 0
                r0[r10] = r1
                r11 = 1
                r0[r11] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class r1 = java.lang.Boolean.TYPE
                r5[r10] = r1
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.p> r1 = com.ss.android.ugc.aweme.commerce.service.models.p.class
                r5[r11] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 28684(0x700c, float:4.0195E-41)
                r1 = r19
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x004b
                java.lang.Object[] r0 = new java.lang.Object[r9]
                java.lang.Byte r1 = java.lang.Byte.valueOf(r20)
                r0[r10] = r1
                r0[r11] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
                r3 = 0
                r4 = 28684(0x700c, float:4.0195E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class r1 = java.lang.Boolean.TYPE
                r5[r10] = r1
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.p> r1 = com.ss.android.ugc.aweme.commerce.service.models.p.class
                r5[r11] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r19
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x004b:
                java.lang.String r0 = "promotionDynamicInfo"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
                if (r20 == 0) goto L_0x028d
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.this$0
                com.ss.android.ugc.aweme.commerce.service.models.h r0 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.c((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r0)
                int r0 = r0.getStatus()
                int r1 = r8.f38228c
                if (r0 == r1) goto L_0x0079
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.this$0
                com.ss.android.ugc.aweme.commerce.service.models.h r0 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.c((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r0)
                int r1 = r8.f38228c
                r0.setStatus(r1)
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.this$0
                com.ss.android.ugc.aweme.commerce.widget.PreviewBottom r0 = r0.w()
                r0.a()
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.this$0
                r0.x()
            L_0x0079:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.this$0
                com.ss.android.ugc.aweme.commerce.service.models.h r0 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.c((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r0)
                com.ss.android.ugc.aweme.commerce.service.models.o r1 = r8.f38226a
                r0.setActivity(r1)
                com.ss.android.ugc.aweme.commerce.service.models.ag r0 = r8.f38227b
                r1 = 0
                if (r0 == 0) goto L_0x00dc
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r2 = r7.this$0
                com.ss.android.ugc.aweme.commerce.service.models.h r2 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.c((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r2)
                com.ss.android.ugc.aweme.commerce.service.models.r r2 = r2.getToutiao()
                if (r2 == 0) goto L_0x00a4
                com.ss.android.ugc.aweme.commerce.service.models.am r2 = r2.getVirtualPromotion()
                if (r2 == 0) goto L_0x00a4
                boolean r2 = r2.getAlreadyBuy()
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                goto L_0x00a5
            L_0x00a4:
                r2 = r1
            L_0x00a5:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r3 = r7.this$0
                com.ss.android.ugc.aweme.commerce.service.models.h r3 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.c((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r3)
                com.ss.android.ugc.aweme.commerce.service.models.r r3 = r3.getToutiao()
                if (r3 == 0) goto L_0x00b8
                com.ss.android.ugc.aweme.commerce.service.models.am r4 = r0.getVirtualPromotion()
                r3.setVirtualPromotion(r4)
            L_0x00b8:
                com.ss.android.ugc.aweme.commerce.service.models.am r0 = r0.getVirtualPromotion()
                if (r0 == 0) goto L_0x00dc
                boolean r3 = r0.isVirtualGoods()
                if (r3 == 0) goto L_0x00dc
                boolean r0 = r0.getAlreadyBuy()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
                r0 = r0 ^ r11
                if (r0 == 0) goto L_0x00dc
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.this$0
                com.ss.android.ugc.aweme.commerce.widget.PreviewBottom r0 = r0.w()
                r0.a()
            L_0x00dc:
                kotlin.jvm.functions.Function1 r0 = r7.$onOk
                if (r0 == 0) goto L_0x00e3
                r0.invoke(r8)
            L_0x00e3:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.this$0
                com.ss.android.ugc.aweme.commerce.service.models.h r0 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.c((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r0)
                boolean r0 = r0.isOnSale()
                if (r0 == 0) goto L_0x026d
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.this$0
                com.ss.android.ugc.aweme.commerce.service.models.h r0 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.c((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r0)
                boolean r0 = r0.isPreSaleGood()
                if (r0 != 0) goto L_0x026d
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.this$0
                com.ss.android.ugc.aweme.commerce.service.models.h r0 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.c((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r0)
                boolean r0 = r0.isAppointment()
                if (r0 != 0) goto L_0x026d
                com.ss.android.ugc.aweme.commerce.service.models.ag r0 = r8.f38227b
                if (r0 == 0) goto L_0x0117
                com.ss.android.ugc.aweme.commerce.service.models.s r0 = r0.getSeckillInfo()
                if (r0 == 0) goto L_0x0117
                boolean r0 = r0.canBeShow()
                if (r0 == r11) goto L_0x0121
            L_0x0117:
                com.ss.android.ugc.aweme.commerce.service.models.o r0 = r8.f38226a
                if (r0 == 0) goto L_0x026d
                boolean r0 = r0.canBeShown()
                if (r0 != r11) goto L_0x026d
            L_0x0121:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.this$0
                com.ss.android.ugc.aweme.commerce.preview.activitybar.PreviewActivityBar r0 = r0.x
                if (r0 == 0) goto L_0x012a
                r0.setVisibility(r10)
            L_0x012a:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.this$0
                com.ss.android.ugc.aweme.commerce.preview.activitybar.PreviewActivityBar r0 = r0.x
                if (r0 == 0) goto L_0x01bf
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r1 = r7.this$0
                com.ss.android.ugc.aweme.commerce.service.models.h r1 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.c((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r1)
                java.lang.Object[] r12 = new java.lang.Object[r9]
                r12[r10] = r1
                r12[r11] = r8
                com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.commerce.preview.activitybar.PreviewActivityBar.f37286a
                r15 = 0
                r16 = 28824(0x7098, float:4.0391E-41)
                java.lang.Class[] r2 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.h> r3 = com.ss.android.ugc.aweme.commerce.service.models.h.class
                r2[r10] = r3
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.p> r3 = com.ss.android.ugc.aweme.commerce.service.models.p.class
                r2[r11] = r3
                java.lang.Class r18 = java.lang.Void.TYPE
                r13 = r0
                r17 = r2
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
                if (r2 == 0) goto L_0x0175
                java.lang.Object[] r12 = new java.lang.Object[r9]
                r12[r10] = r1
                r12[r11] = r8
                com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.commerce.preview.activitybar.PreviewActivityBar.f37286a
                r15 = 0
                r16 = 28824(0x7098, float:4.0391E-41)
                java.lang.Class[] r1 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.h> r2 = com.ss.android.ugc.aweme.commerce.service.models.h.class
                r1[r10] = r2
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.p> r2 = com.ss.android.ugc.aweme.commerce.service.models.p.class
                r1[r11] = r2
                java.lang.Class r18 = java.lang.Void.TYPE
                r13 = r0
                r17 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                goto L_0x026c
            L_0x0175:
                java.lang.String r2 = "mDisplayGood"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
                java.lang.String r2 = "promotion"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r2)
                r0.f37287b = r1
                com.ss.android.ugc.aweme.commerce.service.models.ag r2 = r8.f38227b
                if (r2 == 0) goto L_0x01a6
                com.ss.android.ugc.aweme.commerce.service.models.s r2 = r2.getSeckillInfo()
                if (r2 == 0) goto L_0x01a6
                com.ss.android.ugc.aweme.commerce.preview.activitybar.b r3 = r0.f37288c
                if (r3 == 0) goto L_0x01a1
                com.ss.android.ugc.aweme.commerce.service.models.r r0 = r1.getToutiao()
                if (r0 == 0) goto L_0x0199
                int r10 = r0.getMaxPrice()
            L_0x0199:
                r3.setMarketPrice(r10)
                r3.a((com.ss.android.ugc.aweme.commerce.service.models.s) r2)
                goto L_0x028d
            L_0x01a1:
                r0.a((com.ss.android.ugc.aweme.commerce.service.models.s) r2)
                goto L_0x026c
            L_0x01a6:
                com.ss.android.ugc.aweme.commerce.service.models.o r2 = r8.f38226a
                if (r2 == 0) goto L_0x028d
                com.ss.android.ugc.aweme.commerce.preview.activitybar.a r3 = r0.f37289d
                if (r3 == 0) goto L_0x01ba
                int r0 = r1.getPrice()
                r3.setPrice(r0)
                r3.a((com.ss.android.ugc.aweme.commerce.service.models.o) r2)
                goto L_0x028d
            L_0x01ba:
                r0.a((com.ss.android.ugc.aweme.commerce.service.models.o) r2)
                goto L_0x026c
            L_0x01bf:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.this$0
                r1 = 2131165243(0x7f07003b, float:1.7944698E38)
                android.view.View r0 = r0.findViewById(r1)
                android.view.ViewStub r0 = (android.view.ViewStub) r0
                if (r0 == 0) goto L_0x026c
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r1 = r7.this$0
                android.view.View r0 = r0.inflate()
                if (r0 == 0) goto L_0x0264
                com.ss.android.ugc.aweme.commerce.preview.activitybar.PreviewActivityBar r0 = (com.ss.android.ugc.aweme.commerce.preview.activitybar.PreviewActivityBar) r0
                r1.x = r0
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.this$0
                com.ss.android.ugc.aweme.commerce.preview.activitybar.PreviewActivityBar r0 = r0.x
                if (r0 == 0) goto L_0x01e8
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$aa$a r1 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$aa$a
                r1.<init>(r7, r8)
                com.ss.android.ugc.aweme.commerce.preview.activitybar.b$b r1 = (com.ss.android.ugc.aweme.commerce.preview.activitybar.b.C0470b) r1
                r0.setSecKillStatusListener(r1)
            L_0x01e8:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.this$0
                com.ss.android.ugc.aweme.commerce.preview.activitybar.PreviewActivityBar r0 = r0.x
                if (r0 == 0) goto L_0x01f8
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$aa$b r1 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$aa$b
                r1.<init>(r7, r8)
                com.ss.android.ugc.aweme.commerce.preview.activitybar.a$a r1 = (com.ss.android.ugc.aweme.commerce.preview.activitybar.a.C0469a) r1
                r0.setAtmosphereListener(r1)
            L_0x01f8:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.this$0
                com.ss.android.ugc.aweme.commerce.preview.activitybar.PreviewActivityBar r0 = r0.x
                if (r0 == 0) goto L_0x028d
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r1 = r7.this$0
                com.ss.android.ugc.aweme.commerce.service.models.h r1 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.c((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r1)
                java.lang.Object[] r12 = new java.lang.Object[r9]
                r12[r10] = r1
                r12[r11] = r8
                com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.commerce.preview.activitybar.PreviewActivityBar.f37286a
                r15 = 0
                r16 = 28821(0x7095, float:4.0387E-41)
                java.lang.Class[] r2 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.h> r3 = com.ss.android.ugc.aweme.commerce.service.models.h.class
                r2[r10] = r3
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.p> r3 = com.ss.android.ugc.aweme.commerce.service.models.p.class
                r2[r11] = r3
                java.lang.Class r18 = java.lang.Void.TYPE
                r13 = r0
                r17 = r2
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
                if (r2 == 0) goto L_0x0242
                java.lang.Object[] r12 = new java.lang.Object[r9]
                r12[r10] = r1
                r12[r11] = r8
                com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.commerce.preview.activitybar.PreviewActivityBar.f37286a
                r15 = 0
                r16 = 28821(0x7095, float:4.0387E-41)
                java.lang.Class[] r1 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.h> r2 = com.ss.android.ugc.aweme.commerce.service.models.h.class
                r1[r10] = r2
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.p> r2 = com.ss.android.ugc.aweme.commerce.service.models.p.class
                r1[r11] = r2
                java.lang.Class r18 = java.lang.Void.TYPE
                r13 = r0
                r17 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                goto L_0x028d
            L_0x0242:
                java.lang.String r2 = "mDisplayGood"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
                java.lang.String r2 = "promotion"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r2)
                r0.f37287b = r1
                com.ss.android.ugc.aweme.commerce.service.models.ag r1 = r8.f38227b
                if (r1 == 0) goto L_0x025c
                com.ss.android.ugc.aweme.commerce.service.models.s r1 = r1.getSeckillInfo()
                if (r1 == 0) goto L_0x025c
                r0.a((com.ss.android.ugc.aweme.commerce.service.models.s) r1)
                goto L_0x028d
            L_0x025c:
                com.ss.android.ugc.aweme.commerce.service.models.o r1 = r8.f38226a
                if (r1 == 0) goto L_0x026c
                r0.a((com.ss.android.ugc.aweme.commerce.service.models.o) r1)
                goto L_0x028d
            L_0x0264:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce.preview.activitybar.PreviewActivityBar"
                r0.<init>(r1)
                throw r0
            L_0x026c:
                return
            L_0x026d:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.this$0
                com.ss.android.ugc.aweme.commerce.widget.PreviewBottom r0 = r0.w()
                boolean r0 = r0.getShowOriginalButton()
                if (r0 == 0) goto L_0x0285
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.this$0
                com.ss.android.ugc.aweme.commerce.widget.PreviewBottom r0 = r0.w()
                r0.setShowOriginalButton(r10)
                r0.a()
            L_0x0285:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.this$0
                r0.z = r10
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.this$0
                r0.y = r1
            L_0x028d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.aa.invoke(boolean, com.ss.android.ugc.aweme.commerce.service.models.p):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/PreviewCommentListResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class ab<TTaskResult, TContinuationResult> implements a.g<com.ss.android.ugc.aweme.commerce.preview.api.a.b, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37140a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37141b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/PreviewActivity$fetchShopCommentList$1$1$1", "Lcom/ss/android/ugc/aweme/widget/flowlayout/TagAdapter;", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/PreviewCommentListResponse$CommentTag;", "getView", "Landroid/view/View;", "parent", "Lcom/ss/android/ugc/aweme/widget/flowlayout/FlowLayout;", "position", "", "tag", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        public static final class a extends com.ss.android.ugc.aweme.widget.flowlayout.a<b.C0472b> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f37145a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f37146b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ab f37147c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List list, List list2, ab abVar) {
                super(list2);
                this.f37146b = list;
                this.f37147c = abVar;
            }

            public final /* synthetic */ View a(FlowLayout flowLayout, int i, Object obj) {
                String str;
                b.C0472b bVar = (b.C0472b) obj;
                if (PatchProxy.isSupport(new Object[]{flowLayout, Integer.valueOf(i), bVar}, this, f37145a, false, 28691, new Class[]{FlowLayout.class, Integer.TYPE, b.C0472b.class}, View.class)) {
                    return (View) PatchProxy.accessDispatch(new Object[]{flowLayout, Integer.valueOf(i), bVar}, this, f37145a, false, 28691, new Class[]{FlowLayout.class, Integer.TYPE, b.C0472b.class}, View.class);
                }
                View inflate = LayoutInflater.from(this.f37147c.f37141b).inflate(C0906R.layout.a27, (TagFlowLayout) PreviewActivity.a(this.f37147c.f37141b).findViewById(C0906R.id.ut), false);
                if (inflate != null) {
                    DmtTextView dmtTextView = (DmtTextView) inflate;
                    PreviewActivity previewActivity = this.f37147c.f37141b;
                    Object[] objArr = new Object[2];
                    Integer num = null;
                    if (bVar != null) {
                        str = bVar.f37337c;
                    } else {
                        str = null;
                    }
                    objArr[0] = str;
                    if (bVar != null) {
                        num = Integer.valueOf(bVar.f37336b);
                    }
                    objArr[1] = num;
                    dmtTextView.setText(previewActivity.getString(C0906R.string.xh, objArr));
                    dmtTextView.setIncludeFontPadding(false);
                    return dmtTextView;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtTextView");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "position", "", "<anonymous parameter 2>", "Lcom/ss/android/ugc/aweme/widget/flowlayout/FlowLayout;", "onTagClick", "com/ss/android/ugc/aweme/commerce/preview/PreviewActivity$fetchShopCommentList$1$1$2"}, k = 3, mv = {1, 1, 15})
        static final class b implements TagFlowLayout.c {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f37148a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f37149b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ab f37150c;

            b(List list, ab abVar) {
                this.f37149b = list;
                this.f37150c = abVar;
            }

            public final boolean a(View view, int i, FlowLayout flowLayout) {
                if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), flowLayout}, this, f37148a, false, 28692, new Class[]{View.class, Integer.TYPE, FlowLayout.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), flowLayout}, this, f37148a, false, 28692, new Class[]{View.class, Integer.TYPE, FlowLayout.class}, Boolean.TYPE)).booleanValue();
                }
                int i2 = i;
                String str = ((b.C0472b) this.f37149b.get(i)).f37338d;
                PreviewActivity previewActivity = this.f37150c.f37141b;
                if (previewActivity != null) {
                    com.ss.android.ugc.aweme.commerce.a.a(str, (Activity) previewActivity, (String) null, false, false, 28);
                    new com.ss.android.ugc.aweme.commerce.service.logs.i().a("select_word").b();
                    return true;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/PreviewActivity$fetchShopCommentList$1$4$1", "Lcom/ss/android/ugc/aweme/commerce/preview/OnItemClickListener;", "onClickItem", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        public static final class c implements d {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f37151a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ab f37152b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a.i f37153c;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f37151a, false, 28693, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f37151a, false, 28693, new Class[0], Void.TYPE);
                    return;
                }
                a.i iVar = this.f37153c;
                Intrinsics.checkExpressionValueIsNotNull(iVar, "task");
                String str = ((com.ss.android.ugc.aweme.commerce.preview.api.a.b) iVar.e()).f37329d;
                PreviewActivity previewActivity = this.f37152b.f37141b;
                if (previewActivity != null) {
                    com.ss.android.ugc.aweme.commerce.a.a(str, (Activity) previewActivity, (String) null, false, false, 28);
                    new com.ss.android.ugc.aweme.commerce.service.logs.i().a(PushConstants.CONTENT).b();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }

            c(ab abVar, a.i iVar) {
                this.f37152b = abVar;
                this.f37153c = iVar;
            }
        }

        ab(PreviewActivity previewActivity) {
            this.f37141b = previewActivity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x017d  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x014f A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(a.i r19) {
            /*
                r18 = this;
                r7 = r18
                r8 = r19
                r9 = 1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f37140a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r10] = r1
                java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
                r3 = 0
                r4 = 28690(0x7012, float:4.0203E-41)
                r1 = r18
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0039
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f37140a
                r3 = 0
                r4 = 28690(0x7012, float:4.0203E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r10] = r1
                java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
                r1 = r18
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                java.lang.Void r0 = (java.lang.Void) r0
                return r0
            L_0x0039:
                java.lang.String r0 = "task"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r0)
                boolean r0 = r19.d()
                r1 = 2131169117(0x7f070f5d, float:1.7952555E38)
                r2 = 8
                if (r0 != 0) goto L_0x0298
                java.lang.Object r0 = r19.e()
                com.ss.android.ugc.aweme.commerce.preview.api.a.b r0 = (com.ss.android.ugc.aweme.commerce.preview.api.a.b) r0
                int r0 = r0.statusCode
                if (r0 != 0) goto L_0x0298
                java.lang.Object r0 = r19.e()
                com.ss.android.ugc.aweme.commerce.preview.api.a.b r0 = (com.ss.android.ugc.aweme.commerce.preview.api.a.b) r0
                int r0 = r0.f37328c
                if (r0 <= 0) goto L_0x005f
                r0 = 1
                goto L_0x0060
            L_0x005f:
                r0 = 0
            L_0x0060:
                if (r0 == 0) goto L_0x0298
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37141b
                android.view.View r0 = r0.e((int) r1)
                com.ss.android.ugc.aweme.commerce.widget.PreviewTitle r0 = (com.ss.android.ugc.aweme.commerce.widget.PreviewTitle) r0
                r0.c(r9)
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37141b
                android.view.View r0 = r0.h()
                r0.setVisibility(r10)
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37141b
                android.widget.FrameLayout r0 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.a((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r0)
                android.view.View r0 = (android.view.View) r0
                r1 = 2131169161(0x7f070f89, float:1.7952644E38)
                android.view.View r0 = r0.findViewById(r1)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
                java.lang.String r1 = "headerView.productCommentCountTV"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r1 = r7.f37141b
                android.content.Context r1 = (android.content.Context) r1
                java.lang.Object r3 = r19.e()
                com.ss.android.ugc.aweme.commerce.preview.api.a.b r3 = (com.ss.android.ugc.aweme.commerce.preview.api.a.b) r3
                int r3 = r3.f37328c
                java.lang.String r1 = com.ss.android.ugc.aweme.commerce.service.l.d.a((android.content.Context) r1, (int) r3)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
                com.ss.android.ugc.aweme.commerce.service.logs.ap r0 = new com.ss.android.ugc.aweme.commerce.service.logs.ap
                r0.<init>()
                r0.b()
                java.lang.Object r0 = r19.e()
                com.ss.android.ugc.aweme.commerce.preview.api.a.b r0 = (com.ss.android.ugc.aweme.commerce.preview.api.a.b) r0
                java.util.List<com.ss.android.ugc.aweme.commerce.preview.api.a.b$b> r0 = r0.f37326a
                r1 = 2131165987(0x7f070323, float:1.7946207E38)
                if (r0 == 0) goto L_0x011f
                boolean r3 = r0.isEmpty()
                if (r3 == 0) goto L_0x00d3
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37141b
                android.widget.FrameLayout r0 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.a((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r0)
                android.view.View r0 = (android.view.View) r0
                android.view.View r0 = r0.findViewById(r1)
                com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout r0 = (com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout) r0
                java.lang.String r1 = "headerView.commentTagsView"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r0.setVisibility(r2)
                goto L_0x0135
            L_0x00d3:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r3 = r7.f37141b
                android.widget.FrameLayout r3 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.a((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r3)
                android.view.View r3 = (android.view.View) r3
                android.view.View r3 = r3.findViewById(r1)
                com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout r3 = (com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout) r3
                java.lang.String r4 = "headerView.commentTagsView"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                r3.setVisibility(r10)
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r3 = r7.f37141b
                android.widget.FrameLayout r3 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.a((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r3)
                android.view.View r3 = (android.view.View) r3
                android.view.View r3 = r3.findViewById(r1)
                com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout r3 = (com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout) r3
                java.lang.String r4 = "headerView.commentTagsView"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$ab$a r4 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$ab$a
                r4.<init>(r0, r0, r7)
                com.ss.android.ugc.aweme.widget.flowlayout.a r4 = (com.ss.android.ugc.aweme.widget.flowlayout.a) r4
                r3.setAdapter(r4)
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r3 = r7.f37141b
                android.widget.FrameLayout r3 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.a((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r3)
                android.view.View r3 = (android.view.View) r3
                android.view.View r1 = r3.findViewById(r1)
                com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout r1 = (com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout) r1
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$ab$b r3 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$ab$b
                r3.<init>(r0, r7)
                com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout$c r3 = (com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout.c) r3
                r1.setOnTagClickListener(r3)
                goto L_0x0135
            L_0x011f:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37141b
                android.widget.FrameLayout r0 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.a((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r0)
                android.view.View r0 = (android.view.View) r0
                android.view.View r0 = r0.findViewById(r1)
                com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout r0 = (com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout) r0
                java.lang.String r1 = "headerView.commentTagsView"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r0.setVisibility(r2)
            L_0x0135:
                java.lang.Object r0 = r19.e()
                com.ss.android.ugc.aweme.commerce.preview.api.a.b r0 = (com.ss.android.ugc.aweme.commerce.preview.api.a.b) r0
                java.util.List<com.ss.android.ugc.aweme.commerce.preview.api.a.b$a> r0 = r0.f37327b
                r1 = 2131169163(0x7f070f8b, float:1.7952648E38)
                if (r0 == 0) goto L_0x0261
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Collection r3 = (java.util.Collection) r3
                java.util.Iterator r0 = r0.iterator()
            L_0x014f:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L_0x0181
                java.lang.Object r4 = r0.next()
                r5 = r4
                com.ss.android.ugc.aweme.commerce.preview.api.a.b$a r5 = (com.ss.android.ugc.aweme.commerce.preview.api.a.b.a) r5
                java.lang.String r6 = r5.f37331b
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                boolean r6 = android.text.TextUtils.isEmpty(r6)
                if (r6 == 0) goto L_0x017a
                java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel> r5 = r5.f37334e
                if (r5 == 0) goto L_0x0174
                java.util.Collection r5 = (java.util.Collection) r5
                boolean r5 = r5.isEmpty()
                if (r5 != 0) goto L_0x0174
                r5 = 1
                goto L_0x0175
            L_0x0174:
                r5 = 0
            L_0x0175:
                if (r5 == 0) goto L_0x0178
                goto L_0x017a
            L_0x0178:
                r5 = 0
                goto L_0x017b
            L_0x017a:
                r5 = 1
            L_0x017b:
                if (r5 == 0) goto L_0x014f
                r3.add(r4)
                goto L_0x014f
            L_0x0181:
                java.util.List r3 = (java.util.List) r3
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                r0 = 3
                java.util.List r0 = kotlin.collections.CollectionsKt.take(r3, r0)
                if (r0 == 0) goto L_0x0261
                boolean r3 = r0.isEmpty()
                if (r3 == 0) goto L_0x01aa
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37141b
                android.widget.FrameLayout r0 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.a((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r0)
                android.view.View r0 = (android.view.View) r0
                android.view.View r0 = r0.findViewById(r1)
                android.support.v7.widget.RecyclerView r0 = (android.support.v7.widget.RecyclerView) r0
                java.lang.String r1 = "headerView.productCommentRV"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r0.setVisibility(r2)
                goto L_0x0277
            L_0x01aa:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r2 = r7.f37141b
                android.widget.FrameLayout r2 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.a((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r2)
                android.view.View r2 = (android.view.View) r2
                android.view.View r2 = r2.findViewById(r1)
                android.support.v7.widget.RecyclerView r2 = (android.support.v7.widget.RecyclerView) r2
                java.lang.String r3 = "headerView.productCommentRV"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                r2.setVisibility(r10)
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r2 = r7.f37141b
                android.widget.FrameLayout r2 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.a((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r2)
                android.view.View r2 = (android.view.View) r2
                android.view.View r2 = r2.findViewById(r1)
                android.support.v7.widget.RecyclerView r2 = (android.support.v7.widget.RecyclerView) r2
                java.lang.String r3 = "headerView.productCommentRV"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                com.ss.android.ugc.aweme.views.WrapLinearLayoutManager r3 = new com.ss.android.ugc.aweme.views.WrapLinearLayoutManager
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r4 = r7.f37141b
                android.content.Context r4 = (android.content.Context) r4
                r3.<init>(r4)
                android.support.v7.widget.RecyclerView$LayoutManager r3 = (android.support.v7.widget.RecyclerView.LayoutManager) r3
                r2.setLayoutManager(r3)
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r2 = r7.f37141b
                com.ss.android.ugc.aweme.commerce.preview.ProductCommentAdapter r3 = new com.ss.android.ugc.aweme.commerce.preview.ProductCommentAdapter
                r3.<init>()
                r2.A = r3
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r2 = r7.f37141b
                com.ss.android.ugc.aweme.commerce.preview.ProductCommentAdapter r2 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.d((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r2)
                r2.setShowFooter(r10)
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r2 = r7.f37141b
                com.ss.android.ugc.aweme.commerce.preview.ProductCommentAdapter r2 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.d((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r2)
                r2.setData(r0)
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37141b
                com.ss.android.ugc.aweme.commerce.preview.ProductCommentAdapter r0 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.d((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r0)
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$ab$c r2 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$ab$c
                r2.<init>(r7, r8)
                com.ss.android.ugc.aweme.commerce.preview.d r2 = (com.ss.android.ugc.aweme.commerce.preview.d) r2
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r2
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commerce.preview.ProductCommentAdapter.f37281a
                r14 = 0
                r15 = 28801(0x7081, float:4.0359E-41)
                java.lang.Class[] r3 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.commerce.preview.d> r4 = com.ss.android.ugc.aweme.commerce.preview.d.class
                r3[r10] = r4
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r3
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r3 == 0) goto L_0x023b
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r2
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commerce.preview.ProductCommentAdapter.f37281a
                r14 = 0
                r15 = 28801(0x7081, float:4.0359E-41)
                java.lang.Class[] r2 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.commerce.preview.d> r3 = com.ss.android.ugc.aweme.commerce.preview.d.class
                r2[r10] = r3
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r2
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x0242
            L_0x023b:
                java.lang.String r3 = "itemClickListener"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r3)
                r0.f37282b = r2
            L_0x0242:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37141b
                android.widget.FrameLayout r0 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.a((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r0)
                android.view.View r0 = (android.view.View) r0
                android.view.View r0 = r0.findViewById(r1)
                android.support.v7.widget.RecyclerView r0 = (android.support.v7.widget.RecyclerView) r0
                java.lang.String r1 = "headerView.productCommentRV"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r1 = r7.f37141b
                com.ss.android.ugc.aweme.commerce.preview.ProductCommentAdapter r1 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.d((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r1)
                android.support.v7.widget.RecyclerView$Adapter r1 = (android.support.v7.widget.RecyclerView.Adapter) r1
                r0.setAdapter(r1)
                goto L_0x0277
            L_0x0261:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37141b
                android.widget.FrameLayout r0 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.a((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r0)
                android.view.View r0 = (android.view.View) r0
                android.view.View r0 = r0.findViewById(r1)
                android.support.v7.widget.RecyclerView r0 = (android.support.v7.widget.RecyclerView) r0
                java.lang.String r1 = "headerView.productCommentRV"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r0.setVisibility(r2)
            L_0x0277:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37141b
                android.widget.FrameLayout r0 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.a((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r0)
                android.view.View r0 = (android.view.View) r0
                r1 = 2131169165(0x7f070f8d, float:1.7952652E38)
                android.view.View r0 = r0.findViewById(r1)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$ab$1 r1 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$ab$1
                r1.<init>(r7, r8)
                android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
                r0.setOnClickListener(r1)
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37141b
                r0.f()
                goto L_0x02ba
            L_0x0298:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37141b
                android.view.View r0 = r0.e((int) r1)
                com.ss.android.ugc.aweme.commerce.widget.PreviewTitle r0 = (com.ss.android.ugc.aweme.commerce.widget.PreviewTitle) r0
                boolean r0 = r0.getShowCommentCard()
                if (r0 == 0) goto L_0x02ba
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37141b
                android.view.View r0 = r0.e((int) r1)
                com.ss.android.ugc.aweme.commerce.widget.PreviewTitle r0 = (com.ss.android.ugc.aweme.commerce.widget.PreviewTitle) r0
                r0.c(r10)
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37141b
                android.view.View r0 = r0.h()
                r0.setVisibility(r2)
            L_0x02ba:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.ab.then(a.i):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/preview/pops/sku/ShopSkuResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class ac<TTaskResult, TContinuationResult> implements a.g<com.ss.android.ugc.aweme.commerce.preview.pops.a.d, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37154a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37155b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function0 f37156c;

        ac(PreviewActivity previewActivity, Function0 function0) {
            this.f37155b = previewActivity;
            this.f37156c = function0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:129:0x045e  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0130  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0155  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(a.i r19) {
            /*
                r18 = this;
                r7 = r18
                r8 = r19
                r9 = 1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f37154a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r10] = r1
                java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
                r3 = 0
                r4 = 28695(0x7017, float:4.021E-41)
                r1 = r18
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0039
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f37154a
                r3 = 0
                r4 = 28695(0x7017, float:4.021E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r10] = r1
                java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
                r1 = r18
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                java.lang.Void r0 = (java.lang.Void) r0
                return r0
            L_0x0039:
                java.lang.String r0 = "task"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r0)
                boolean r0 = r19.d()
                if (r0 != 0) goto L_0x0461
                java.lang.Object r0 = r19.e()
                com.ss.android.ugc.aweme.commerce.preview.pops.a.d r0 = (com.ss.android.ugc.aweme.commerce.preview.pops.a.d) r0
                int r0 = r0.statusCode
                if (r0 != 0) goto L_0x0461
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37155b
                com.google.gson.Gson r1 = new com.google.gson.Gson
                r1.<init>()
                java.lang.Object r2 = r19.e()
                com.ss.android.ugc.aweme.commerce.preview.pops.a.d r2 = (com.ss.android.ugc.aweme.commerce.preview.pops.a.d) r2
                java.lang.String r2 = r2.f37570a
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.y> r3 = com.ss.android.ugc.aweme.commerce.service.models.y.class
                java.lang.Object r1 = r1.fromJson((java.lang.String) r2, (java.lang.Class<T>) r3)
                com.ss.android.ugc.aweme.commerce.service.models.y r1 = (com.ss.android.ugc.aweme.commerce.service.models.y) r1
                r0.G = r1
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37155b
                java.lang.Object r1 = r19.e()
                com.ss.android.ugc.aweme.commerce.preview.pops.a.d r1 = (com.ss.android.ugc.aweme.commerce.preview.pops.a.d) r1
                java.lang.String r1 = r1.f37572c
                r0.H = r1
                java.lang.Object r0 = r19.e()
                com.ss.android.ugc.aweme.commerce.preview.pops.a.d r0 = (com.ss.android.ugc.aweme.commerce.preview.pops.a.d) r0
                java.lang.String r0 = r0.f37573d
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x008f
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37155b
                java.lang.Object r1 = r19.e()
                com.ss.android.ugc.aweme.commerce.preview.pops.a.d r1 = (com.ss.android.ugc.aweme.commerce.preview.pops.a.d) r1
                java.lang.String r1 = r1.f37573d
                r0.I = r1
            L_0x008f:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37155b
                java.lang.Object r1 = r19.e()
                com.ss.android.ugc.aweme.commerce.preview.pops.a.d r1 = (com.ss.android.ugc.aweme.commerce.preview.pops.a.d) r1
                java.lang.String r1 = r1.f37574e
                r0.J = r1
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37155b
                java.lang.Object r1 = r19.e()
                com.ss.android.ugc.aweme.commerce.preview.pops.a.d r1 = (com.ss.android.ugc.aweme.commerce.preview.pops.a.d) r1
                java.lang.String r1 = r1.f37575f
                r0.K = r1
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37155b
                com.ss.android.ugc.aweme.commerce.service.models.y r0 = r0.G
                if (r0 == 0) goto L_0x00b8
                java.util.List r0 = r0.getSpecificInfoList()
                if (r0 == 0) goto L_0x00b8
                int r0 = r0.size()
                goto L_0x00b9
            L_0x00b8:
                r0 = 0
            L_0x00b9:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r1 = r7.f37155b
                com.ss.android.ugc.aweme.commerce.service.models.aa r2 = new com.ss.android.ugc.aweme.commerce.service.models.aa
                r2.<init>(r0)
                r1.v = r2
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37155b
                com.ss.android.ugc.aweme.commerce.preview.footprint.c r0 = r0.u()
                java.lang.Object r1 = r19.e()
                com.ss.android.ugc.aweme.commerce.preview.pops.a.d r1 = (com.ss.android.ugc.aweme.commerce.preview.pops.a.d) r1
                java.lang.Boolean r1 = r1.k
                r0.f37475b = r1
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37155b
                java.lang.Object r1 = r19.e()
                com.ss.android.ugc.aweme.commerce.preview.pops.a.d r1 = (com.ss.android.ugc.aweme.commerce.preview.pops.a.d) r1
                java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel> r1 = r1.f37571b
                r0.L = r1
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37155b
                java.lang.Object r1 = r19.e()
                com.ss.android.ugc.aweme.commerce.preview.pops.a.d r1 = (com.ss.android.ugc.aweme.commerce.preview.pops.a.d) r1
                java.lang.Boolean r1 = r1.g
                r0.M = r1
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37155b
                java.lang.Object r1 = r19.e()
                com.ss.android.ugc.aweme.commerce.preview.pops.a.d r1 = (com.ss.android.ugc.aweme.commerce.preview.pops.a.d) r1
                int r1 = r1.i
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object r2 = r19.e()
                com.ss.android.ugc.aweme.commerce.preview.pops.a.d r2 = (com.ss.android.ugc.aweme.commerce.preview.pops.a.d) r2
                java.lang.String r2 = r2.j
                java.lang.Object r3 = r19.e()
                com.ss.android.ugc.aweme.commerce.preview.pops.a.d r3 = (com.ss.android.ugc.aweme.commerce.preview.pops.a.d) r3
                java.lang.String r3 = r3.h
                r4 = 3
                java.lang.Object[] r11 = new java.lang.Object[r4]
                r11[r10] = r1
                r11[r9] = r2
                r5 = 2
                r11[r5] = r3
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.f2890a
                r14 = 0
                r15 = 28558(0x6f8e, float:4.0018E-41)
                java.lang.Class[] r6 = new java.lang.Class[r4]
                java.lang.Class<java.lang.Integer> r8 = java.lang.Integer.class
                r6[r10] = r8
                java.lang.Class<java.lang.String> r8 = java.lang.String.class
                r6[r9] = r8
                java.lang.Class<java.lang.String> r8 = java.lang.String.class
                r6[r5] = r8
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r6
                boolean r6 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r6 == 0) goto L_0x0155
                java.lang.Object[] r11 = new java.lang.Object[r4]
                r11[r10] = r1
                r11[r9] = r2
                r11[r5] = r3
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.f2890a
                r14 = 0
                r15 = 28558(0x6f8e, float:4.0018E-41)
                java.lang.Class[] r1 = new java.lang.Class[r4]
                java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
                r1[r10] = r2
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r1[r9] = r2
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r1[r5] = r2
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x045a
            L_0x0155:
                com.ss.android.ugc.aweme.commerce.service.models.h r4 = r0.D
                if (r4 != 0) goto L_0x015e
                java.lang.String r5 = "mDisplayGood"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            L_0x015e:
                boolean r4 = r4.isThirdParty()
                r5 = 8
                if (r4 != 0) goto L_0x0388
                r4 = 4
                r6 = 2131170333(0x7f07141d, float:1.7955021E38)
                if (r1 == 0) goto L_0x01e4
                int r8 = r1.intValue()
                if (r8 >= 0) goto L_0x0173
                goto L_0x01e4
            L_0x0173:
                android.widget.FrameLayout r8 = r0.g
                if (r8 != 0) goto L_0x017c
                java.lang.String r11 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r11)
            L_0x017c:
                android.view.View r8 = (android.view.View) r8
                android.view.View r8 = r8.findViewById(r6)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r8
                java.lang.String r11 = "headerView.text_post_fee"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r11)
                r8.setVisibility(r10)
                int r8 = r1.intValue()
                if (r8 != 0) goto L_0x01b5
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x019b
                java.lang.String r8 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
            L_0x019b:
                android.view.View r1 = (android.view.View) r1
                android.view.View r1 = r1.findViewById(r6)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
                java.lang.String r6 = "headerView.text_post_fee"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r6)
                r6 = 2131559380(0x7f0d03d4, float:1.8744102E38)
                java.lang.String r6 = r0.getString(r6)
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                r1.setText(r6)
                goto L_0x01fd
            L_0x01b5:
                android.widget.FrameLayout r8 = r0.g
                if (r8 != 0) goto L_0x01be
                java.lang.String r11 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r11)
            L_0x01be:
                android.view.View r8 = (android.view.View) r8
                android.view.View r6 = r8.findViewById(r6)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r6
                java.lang.String r8 = "headerView.text_post_fee"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r8)
                r8 = 2131559394(0x7f0d03e2, float:1.874413E38)
                java.lang.Object[] r11 = new java.lang.Object[r9]
                int r1 = r1.intValue()
                java.lang.String r1 = com.ss.android.ugc.aweme.commerce.service.l.d.a((int) r1)
                r11[r10] = r1
                java.lang.String r1 = r0.getString(r8, r11)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r6.setText(r1)
                goto L_0x01fd
            L_0x01e4:
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x01ed
                java.lang.String r8 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
            L_0x01ed:
                android.view.View r1 = (android.view.View) r1
                android.view.View r1 = r1.findViewById(r6)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
                java.lang.String r6 = "headerView.text_post_fee"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r6)
                r1.setVisibility(r4)
            L_0x01fd:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r1 = android.text.TextUtils.isEmpty(r2)
                r6 = 2131170347(0x7f07142b, float:1.795505E38)
                if (r1 == 0) goto L_0x0222
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x0211
                java.lang.String r2 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            L_0x0211:
                android.view.View r1 = (android.view.View) r1
                android.view.View r1 = r1.findViewById(r6)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
                java.lang.String r2 = "headerView.text_send_from"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                r1.setVisibility(r4)
                goto L_0x0254
            L_0x0222:
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x022b
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x022b:
                android.view.View r1 = (android.view.View) r1
                android.view.View r1 = r1.findViewById(r6)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
                java.lang.String r4 = "headerView.text_send_from"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
                r1.setVisibility(r10)
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x0244
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x0244:
                android.view.View r1 = (android.view.View) r1
                android.view.View r1 = r1.findViewById(r6)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
                java.lang.String r4 = "headerView.text_send_from"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
                r1.setText(r2)
            L_0x0254:
                java.util.List r1 = com.ss.android.ugc.aweme.commerce.service.l.d.b((java.lang.String) r3)
                r2 = 2131167935(0x7f070abf, float:1.7950158E38)
                if (r1 == 0) goto L_0x036f
                boolean r3 = r1.isEmpty()
                if (r3 != 0) goto L_0x036f
                android.widget.FrameLayout r3 = r0.g
                if (r3 != 0) goto L_0x026c
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x026c:
                android.view.View r3 = (android.view.View) r3
                android.view.View r3 = r3.findViewById(r2)
                android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
                java.lang.String r4 = "headerView.layout_service_info"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                r3.setVisibility(r10)
                int r3 = r1.size()
                r4 = 0
            L_0x0281:
                if (r4 >= r3) goto L_0x0353
                switch(r4) {
                    case 0: goto L_0x0327;
                    case 1: goto L_0x02e5;
                    case 2: goto L_0x0288;
                    default: goto L_0x0286;
                }
            L_0x0286:
                goto L_0x034f
            L_0x0288:
                android.widget.FrameLayout r6 = r0.g
                if (r6 != 0) goto L_0x0291
                java.lang.String r8 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
            L_0x0291:
                android.view.View r6 = (android.view.View) r6
                r8 = 2131170349(0x7f07142d, float:1.7955054E38)
                android.view.View r6 = r6.findViewById(r8)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r6
                java.lang.String r11 = "headerView.text_service_info_three"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r11)
                r6.setVisibility(r10)
                android.widget.FrameLayout r6 = r0.g
                if (r6 != 0) goto L_0x02ad
                java.lang.String r11 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r11)
            L_0x02ad:
                android.view.View r6 = (android.view.View) r6
                android.view.View r6 = r6.findViewById(r8)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r6
                java.lang.String r11 = "headerView.text_service_info_three"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r11)
                java.lang.Object r11 = r1.get(r4)
                com.ss.android.ugc.aweme.commerce.service.models.j r11 = (com.ss.android.ugc.aweme.commerce.service.models.j) r11
                java.lang.String r11 = r11.getTitle()
                java.lang.CharSequence r11 = (java.lang.CharSequence) r11
                r6.setText(r11)
                android.widget.FrameLayout r6 = r0.g
                if (r6 != 0) goto L_0x02d2
                java.lang.String r11 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r11)
            L_0x02d2:
                android.view.View r6 = (android.view.View) r6
                android.view.View r6 = r6.findViewById(r8)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r6
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$ak r8 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$ak
                r8.<init>(r0)
                java.lang.Runnable r8 = (java.lang.Runnable) r8
                r6.post(r8)
                goto L_0x034f
            L_0x02e5:
                android.widget.FrameLayout r6 = r0.g
                if (r6 != 0) goto L_0x02ee
                java.lang.String r8 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
            L_0x02ee:
                android.view.View r6 = (android.view.View) r6
                r8 = 2131170350(0x7f07142e, float:1.7955056E38)
                android.view.View r6 = r6.findViewById(r8)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r6
                java.lang.String r11 = "headerView.text_service_info_two"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r11)
                r6.setVisibility(r10)
                android.widget.FrameLayout r6 = r0.g
                if (r6 != 0) goto L_0x030a
                java.lang.String r11 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r11)
            L_0x030a:
                android.view.View r6 = (android.view.View) r6
                android.view.View r6 = r6.findViewById(r8)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r6
                java.lang.String r8 = "headerView.text_service_info_two"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r8)
                java.lang.Object r8 = r1.get(r4)
                com.ss.android.ugc.aweme.commerce.service.models.j r8 = (com.ss.android.ugc.aweme.commerce.service.models.j) r8
                java.lang.String r8 = r8.getTitle()
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                r6.setText(r8)
                goto L_0x034f
            L_0x0327:
                android.widget.FrameLayout r6 = r0.g
                if (r6 != 0) goto L_0x0330
                java.lang.String r8 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
            L_0x0330:
                android.view.View r6 = (android.view.View) r6
                r8 = 2131170348(0x7f07142c, float:1.7955052E38)
                android.view.View r6 = r6.findViewById(r8)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r6
                java.lang.String r8 = "headerView.text_service_info_one"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r8)
                java.lang.Object r8 = r1.get(r4)
                com.ss.android.ugc.aweme.commerce.service.models.j r8 = (com.ss.android.ugc.aweme.commerce.service.models.j) r8
                java.lang.String r8 = r8.getTitle()
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                r6.setText(r8)
            L_0x034f:
                int r4 = r4 + 1
                goto L_0x0281
            L_0x0353:
                android.widget.FrameLayout r3 = r0.g
                if (r3 != 0) goto L_0x035c
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x035c:
                android.view.View r3 = (android.view.View) r3
                android.view.View r2 = r3.findViewById(r2)
                android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$al r3 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$al
                r3.<init>(r1)
                android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
                r2.setOnClickListener(r3)
                goto L_0x0388
            L_0x036f:
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x0378
                java.lang.String r3 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            L_0x0378:
                android.view.View r1 = (android.view.View) r1
                android.view.View r1 = r1.findViewById(r2)
                android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
                java.lang.String r2 = "headerView.layout_service_info"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                r1.setVisibility(r5)
            L_0x0388:
                java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel> r1 = r0.L
                r2 = 2131169117(0x7f070f5d, float:1.7952555E38)
                r3 = 2131166997(0x7f070715, float:1.7948255E38)
                if (r1 == 0) goto L_0x0415
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r1.iterator()
            L_0x0398:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L_0x03f2
                java.lang.Object r4 = r1.next()
                com.ss.android.ugc.aweme.base.model.UrlModel r4 = (com.ss.android.ugc.aweme.base.model.UrlModel) r4
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r5 = new com.ss.android.ugc.aweme.base.ui.RemoteImageView
                r6 = r0
                android.content.Context r6 = (android.content.Context) r6
                r5.<init>(r6)
                int r6 = r4.getWidth()
                r8 = 100
                if (r6 > 0) goto L_0x03b7
                r6 = 100
                goto L_0x03bb
            L_0x03b7:
                int r6 = r4.getWidth()
            L_0x03bb:
                int r11 = r4.getHeight()
                if (r11 > 0) goto L_0x03c2
                goto L_0x03c6
            L_0x03c2:
                int r8 = r4.getHeight()
            L_0x03c6:
                android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
                int r12 = com.ss.android.ugc.aweme.commerce.service.l.j.f38030a
                int r8 = r8 * r12
                int r8 = r8 / r6
                r11.<init>(r12, r8)
                android.view.ViewGroup$LayoutParams r11 = (android.view.ViewGroup.LayoutParams) r11
                r5.setLayoutParams(r11)
                com.ss.android.ugc.aweme.base.c.b(r5, r4)
                android.widget.FrameLayout r4 = r0.g
                if (r4 != 0) goto L_0x03e1
                java.lang.String r6 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
            L_0x03e1:
                android.view.View r4 = (android.view.View) r4
                r6 = 2131166996(0x7f070714, float:1.7948253E38)
                android.view.View r4 = r4.findViewById(r6)
                android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
                android.view.View r5 = (android.view.View) r5
                r4.addView(r5)
                goto L_0x0398
            L_0x03f2:
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x03fb
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x03fb:
                android.view.View r1 = (android.view.View) r1
                android.view.View r1 = r1.findViewById(r3)
                android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
                java.lang.String r3 = "headerView.goodDetailContainer"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                r1.setVisibility(r10)
                android.view.View r1 = r0.e((int) r2)
                com.ss.android.ugc.aweme.commerce.widget.PreviewTitle r1 = (com.ss.android.ugc.aweme.commerce.widget.PreviewTitle) r1
                r1.a((boolean) r9)
                goto L_0x0454
            L_0x0415:
                r1 = r0
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r1 = (com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r1
                android.widget.FrameLayout r4 = r1.g
                if (r4 != 0) goto L_0x0421
                java.lang.String r6 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
            L_0x0421:
                android.view.View r4 = (android.view.View) r4
                android.view.View r3 = r4.findViewById(r3)
                android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
                java.lang.String r4 = "headerView.goodDetailContainer"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                r3.setVisibility(r5)
                android.widget.FrameLayout r3 = r1.g
                if (r3 != 0) goto L_0x043a
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x043a:
                android.view.View r3 = (android.view.View) r3
                r4 = 2131169941(0x7f071295, float:1.7954226E38)
                android.view.View r3 = r3.findViewById(r4)
                java.lang.String r4 = "headerView.shopDivider"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                r3.setVisibility(r5)
                android.view.View r1 = r1.e((int) r2)
                com.ss.android.ugc.aweme.commerce.widget.PreviewTitle r1 = (com.ss.android.ugc.aweme.commerce.widget.PreviewTitle) r1
                r1.a((boolean) r10)
            L_0x0454:
                r0.y()
                r0.f()
            L_0x045a:
                kotlin.jvm.functions.Function0 r0 = r7.f37156c
                if (r0 == 0) goto L_0x0461
                r0.invoke()
            L_0x0461:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.ac.then(a.i):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/service/goods/api/SkuCheckResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class ad<TTaskResult, TContinuationResult> implements a.g<com.ss.android.ugc.aweme.commerce.service.g.a.c, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37157a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37158b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function0 f37159c;

        ad(PreviewActivity previewActivity, Function0 function0) {
            this.f37158b = previewActivity;
            this.f37159c = function0;
        }

        public final /* synthetic */ Object then(a.i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f37157a, false, 28696, new Class[]{a.i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f37157a, false, 28696, new Class[]{a.i.class}, Void.class);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar, "task");
            if (iVar.d() || iVar.e() == null || ((com.ss.android.ugc.aweme.commerce.service.g.a.c) iVar.e()).statusCode != 0) {
                UIUtils.displayToast((Context) this.f37158b, (int) C0906R.string.xn);
            } else {
                this.f37158b.G = (com.ss.android.ugc.aweme.commerce.service.models.y) new Gson().fromJson(((com.ss.android.ugc.aweme.commerce.service.g.a.c) iVar.e()).f37968a, com.ss.android.ugc.aweme.commerce.service.models.y.class);
                com.ss.android.ugc.aweme.commerce.service.models.y yVar = this.f37158b.G;
                if (yVar == null || yVar.getStatus() != 2) {
                    UIUtils.displayToast((Context) this.f37158b, (int) C0906R.string.wx);
                } else {
                    Function0 function0 = this.f37159c;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/PreviewRecommendResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class ae<TTaskResult, TContinuationResult> implements a.g<com.ss.android.ugc.aweme.commerce.preview.api.a.c, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37160a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37161b;

        ae(PreviewActivity previewActivity) {
            this.f37161b = previewActivity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:146:0x0392  */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x03a9  */
        /* JADX WARNING: Removed duplicated region for block: B:155:0x03b8  */
        /* JADX WARNING: Removed duplicated region for block: B:160:0x03c6  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00af  */
        /* JADX WARNING: Removed duplicated region for block: B:216:0x052c  */
        /* JADX WARNING: Removed duplicated region for block: B:219:0x0543  */
        /* JADX WARNING: Removed duplicated region for block: B:225:0x0552  */
        /* JADX WARNING: Removed duplicated region for block: B:230:0x0560  */
        /* JADX WARNING: Removed duplicated region for block: B:286:0x06c6  */
        /* JADX WARNING: Removed duplicated region for block: B:289:0x06db  */
        /* JADX WARNING: Removed duplicated region for block: B:295:0x06f9  */
        /* JADX WARNING: Removed duplicated region for block: B:298:0x070e  */
        /* JADX WARNING: Removed duplicated region for block: B:304:0x072b  */
        /* JADX WARNING: Removed duplicated region for block: B:307:0x0740  */
        /* JADX WARNING: Removed duplicated region for block: B:313:0x075d  */
        /* JADX WARNING: Removed duplicated region for block: B:316:0x0777  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x010f  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x011f  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x013e  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x016a  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x018f  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x01b4  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x01c6  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x01d5  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x01f1  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0208  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0217  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0238  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(a.i r19) {
            /*
                r18 = this;
                r7 = r18
                r8 = r19
                r9 = 1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f37160a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r10] = r1
                java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
                r3 = 0
                r4 = 28699(0x701b, float:4.0216E-41)
                r1 = r18
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0039
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f37160a
                r3 = 0
                r4 = 28699(0x701b, float:4.0216E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r10] = r1
                java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
                r1 = r18
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                java.lang.Void r0 = (java.lang.Void) r0
                return r0
            L_0x0039:
                java.lang.String r0 = "task"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r0)
                boolean r0 = r19.d()
                if (r0 != 0) goto L_0x0784
                java.lang.Object r0 = r19.e()
                com.ss.android.ugc.aweme.commerce.preview.api.a.c r0 = (com.ss.android.ugc.aweme.commerce.preview.api.a.c) r0
                int r0 = r0.statusCode
                if (r0 != 0) goto L_0x0784
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37161b
                com.google.gson.Gson r2 = new com.google.gson.Gson
                r2.<init>()
                java.lang.Object r3 = r19.e()
                com.ss.android.ugc.aweme.commerce.preview.api.a.c r3 = (com.ss.android.ugc.aweme.commerce.preview.api.a.c) r3
                java.lang.String r3 = r3.f37339a
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.v> r4 = com.ss.android.ugc.aweme.commerce.service.models.v.class
                java.lang.Object r2 = r2.fromJson((java.lang.String) r3, (java.lang.Class<T>) r4)
                com.ss.android.ugc.aweme.commerce.service.models.v r2 = (com.ss.android.ugc.aweme.commerce.service.models.v) r2
                r0.X = r2
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37161b
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r2 = r7.f37161b
                com.ss.android.ugc.aweme.commerce.service.models.v r2 = r2.X
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r2
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.f2890a
                r14 = 0
                r15 = 28624(0x6fd0, float:4.0111E-41)
                java.lang.Class[] r3 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.v> r4 = com.ss.android.ugc.aweme.commerce.service.models.v.class
                r3[r10] = r4
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r3
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r3 == 0) goto L_0x00a0
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r2
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.f2890a
                r14 = 0
                r15 = 28624(0x6fd0, float:4.0111E-41)
                java.lang.Class[] r2 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.v> r3 = com.ss.android.ugc.aweme.commerce.service.models.v.class
                r2[r10] = r3
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r2
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x0784
            L_0x00a0:
                if (r2 == 0) goto L_0x00ab
                java.util.List<com.ss.android.ugc.aweme.commerce.service.models.v$a> r3 = r2.f38235b
                if (r3 == 0) goto L_0x00ab
                int r3 = r3.size()
                goto L_0x00ac
            L_0x00ab:
                r3 = 0
            L_0x00ac:
                r4 = 3
                if (r3 < r4) goto L_0x0784
                android.widget.FrameLayout r3 = r0.g
                if (r3 != 0) goto L_0x00b8
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x00b8:
                android.view.View r3 = (android.view.View) r3
                r4 = 2131171333(0x7f071805, float:1.795705E38)
                android.view.View r3 = r3.findViewById(r4)
                java.lang.String r4 = "headerView.videoCommentDivider"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                r3.setVisibility(r10)
                android.widget.FrameLayout r3 = r0.g
                if (r3 != 0) goto L_0x00d2
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x00d2:
                android.view.View r3 = (android.view.View) r3
                r4 = 2131169939(0x7f071293, float:1.7954222E38)
                android.view.View r3 = r3.findViewById(r4)
                android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
                java.lang.String r4 = "headerView.shopContainer"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                r3.setVisibility(r10)
                android.widget.FrameLayout r3 = r0.g
                if (r3 != 0) goto L_0x00ee
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x00ee:
                android.view.View r3 = (android.view.View) r3
                r4 = 2131169943(0x7f071297, float:1.795423E38)
                android.view.View r3 = r3.findViewById(r4)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r3
                java.lang.String r4 = "headerView.shopTitle"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                if (r2 == 0) goto L_0x0107
                com.ss.android.ugc.aweme.commerce.service.models.v$b r4 = r2.f38234a
                if (r4 == 0) goto L_0x0107
                java.lang.String r4 = r4.f38241a
                goto L_0x0108
            L_0x0107:
                r4 = 0
            L_0x0108:
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r3.setText(r4)
                if (r2 == 0) goto L_0x0116
                com.ss.android.ugc.aweme.commerce.service.models.v$b r3 = r2.f38234a
                if (r3 == 0) goto L_0x0116
                java.lang.String r3 = r3.f38242b
                goto L_0x0117
            L_0x0116:
                r3 = 0
            L_0x0117:
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 == 0) goto L_0x013e
                android.widget.FrameLayout r3 = r0.g
                if (r3 != 0) goto L_0x0128
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x0128:
                android.view.View r3 = (android.view.View) r3
                r4 = 2131169940(0x7f071294, float:1.7954224E38)
                android.view.View r3 = r3.findViewById(r4)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r3
                java.lang.String r4 = "headerView.shopCount"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                r4 = 8
                r3.setVisibility(r4)
                goto L_0x0166
            L_0x013e:
                android.widget.FrameLayout r3 = r0.g
                if (r3 != 0) goto L_0x0147
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x0147:
                android.view.View r3 = (android.view.View) r3
                r4 = 2131169940(0x7f071294, float:1.7954224E38)
                android.view.View r3 = r3.findViewById(r4)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r3
                java.lang.String r4 = "headerView.shopCount"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                if (r2 == 0) goto L_0x0160
                com.ss.android.ugc.aweme.commerce.service.models.v$b r4 = r2.f38234a
                if (r4 == 0) goto L_0x0160
                java.lang.String r4 = r4.f38242b
                goto L_0x0161
            L_0x0160:
                r4 = 0
            L_0x0161:
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r3.setText(r4)
            L_0x0166:
                android.widget.FrameLayout r3 = r0.g
                if (r3 != 0) goto L_0x016f
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x016f:
                android.view.View r3 = (android.view.View) r3
                r4 = 2131170777(0x7f0715d9, float:1.7955922E38)
                android.view.View r3 = r3.findViewById(r4)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r3
                java.lang.String r4 = "headerView.tv_go_shop"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                r4 = 2131559344(0x7f0d03b0, float:1.874403E38)
                java.lang.String r4 = r0.getString(r4)
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r3.setText(r4)
                android.widget.FrameLayout r3 = r0.g
                if (r3 != 0) goto L_0x0194
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x0194:
                android.view.View r3 = (android.view.View) r3
                r4 = 2131171019(0x7f0716cb, float:1.7956413E38)
                android.view.View r3 = r3.findViewById(r4)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r3
                java.lang.String r4 = "headerView.tv_shop_recommend"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                r4 = 2131559404(0x7f0d03ec, float:1.8744151E38)
                java.lang.String r4 = r0.getString(r4)
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r3.setText(r4)
                android.widget.FrameLayout r3 = r0.g
                if (r3 != 0) goto L_0x01b9
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x01b9:
                android.view.View r3 = (android.view.View) r3
                r4 = 2131169942(0x7f071296, float:1.7954228E38)
                android.view.View r3 = r3.findViewById(r4)
                com.ss.android.ugc.aweme.base.ui.AvatarImageView r3 = (com.ss.android.ugc.aweme.base.ui.AvatarImageView) r3
                if (r2 == 0) goto L_0x01cd
                com.ss.android.ugc.aweme.commerce.service.models.v$b r4 = r2.f38234a
                if (r4 == 0) goto L_0x01cd
                java.lang.String r4 = r4.f38243c
                goto L_0x01ce
            L_0x01cd:
                r4 = 0
            L_0x01ce:
                com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r3, (java.lang.String) r4)
                android.widget.FrameLayout r3 = r0.g
                if (r3 != 0) goto L_0x01da
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x01da:
                android.view.View r3 = (android.view.View) r3
                r4 = 2131168218(0x7f070bda, float:1.7950732E38)
                android.view.View r3 = r3.findViewById(r4)
                android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
                java.lang.String r4 = "headerView.ll_mini_app_point"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                r3.setVisibility(r10)
                android.widget.FrameLayout r3 = r0.g
                if (r3 != 0) goto L_0x01f6
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x01f6:
                android.view.View r3 = (android.view.View) r3
                r4 = 2131170718(0x7f07159e, float:1.7955802E38)
                android.view.View r3 = r3.findViewById(r4)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r3
                java.lang.String r5 = "headerView.tv_customer_evaluate_point"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r5)
                if (r2 == 0) goto L_0x020f
                com.ss.android.ugc.aweme.commerce.service.models.v$b r5 = r2.f38234a
                if (r5 == 0) goto L_0x020f
                java.lang.String r5 = r5.f38244d
                goto L_0x0210
            L_0x020f:
                r5 = 0
            L_0x0210:
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                r3.setText(r5)
                if (r2 == 0) goto L_0x0222
                com.ss.android.ugc.aweme.commerce.service.models.v$b r3 = r2.f38234a
                if (r3 == 0) goto L_0x0222
                float r3 = r3.g
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                goto L_0x0223
            L_0x0222:
                r3 = 0
            L_0x0223:
                r5 = 2131624186(0x7f0e00fa, float:1.8875545E38)
                r6 = 2131559891(0x7f0d05d3, float:1.8745139E38)
                r8 = 2131624980(0x7f0e0414, float:1.8877155E38)
                r11 = 2131559890(0x7f0d05d2, float:1.8745137E38)
                r12 = 2131624172(0x7f0e00ec, float:1.8875516E38)
                r13 = 2131625038(0x7f0e044e, float:1.8877273E38)
                r14 = 0
                if (r3 == 0) goto L_0x038e
                com.ss.android.ugc.aweme.commerce.service.models.v$b r3 = r2.f38234a
                if (r3 == 0) goto L_0x0243
                float r3 = r3.g
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                goto L_0x0244
            L_0x0243:
                r3 = 0
            L_0x0244:
                if (r3 != 0) goto L_0x0249
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x0249:
                float r3 = r3.floatValue()
                r15 = 2131170717(0x7f07159d, float:1.79558E38)
                r1 = 2131169537(0x7f071101, float:1.7953407E38)
                int r3 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
                if (r3 <= 0) goto L_0x02ad
                android.widget.FrameLayout r3 = r0.g
                if (r3 != 0) goto L_0x0260
                java.lang.String r16 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r16)
            L_0x0260:
                android.view.View r3 = (android.view.View) r3
                android.view.View r3 = r3.findViewById(r1)
                com.ss.android.ugc.aweme.views.RoundedFrameLayout r3 = (com.ss.android.ugc.aweme.views.RoundedFrameLayout) r3
                com.ss.android.ugc.aweme.commerce.service.l.g$a r9 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                r10 = r0
                android.content.Context r10 = (android.content.Context) r10
                int r9 = r9.a(r10, r13)
                r3.setBackgroundColor(r9)
                android.widget.FrameLayout r3 = r0.g
                if (r3 != 0) goto L_0x027d
                java.lang.String r9 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r9)
            L_0x027d:
                android.view.View r3 = (android.view.View) r3
                android.view.View r3 = r3.findViewById(r15)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r3
                java.lang.String r9 = "headerView.tv_customer_evaluate_level"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r9)
                java.lang.String r9 = r0.getString(r11)
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                r3.setText(r9)
                android.widget.FrameLayout r3 = r0.g
                if (r3 != 0) goto L_0x029c
                java.lang.String r9 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r9)
            L_0x029c:
                android.view.View r3 = (android.view.View) r3
                android.view.View r3 = r3.findViewById(r4)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r3
                com.ss.android.ugc.aweme.commerce.service.l.g$a r9 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                int r9 = r9.a(r10, r13)
                r3.setTextColor(r9)
            L_0x02ad:
                com.ss.android.ugc.aweme.commerce.service.models.v$b r3 = r2.f38234a
                if (r3 == 0) goto L_0x02b8
                float r3 = r3.g
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                goto L_0x02b9
            L_0x02b8:
                r3 = 0
            L_0x02b9:
                if (r3 != 0) goto L_0x02be
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x02be:
                float r3 = r3.floatValue()
                int r3 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
                if (r3 != 0) goto L_0x031c
                android.widget.FrameLayout r3 = r0.g
                if (r3 != 0) goto L_0x02cf
                java.lang.String r9 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r9)
            L_0x02cf:
                android.view.View r3 = (android.view.View) r3
                android.view.View r3 = r3.findViewById(r1)
                com.ss.android.ugc.aweme.views.RoundedFrameLayout r3 = (com.ss.android.ugc.aweme.views.RoundedFrameLayout) r3
                com.ss.android.ugc.aweme.commerce.service.l.g$a r9 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                r10 = r0
                android.content.Context r10 = (android.content.Context) r10
                int r9 = r9.a(r10, r8)
                r3.setBackgroundColor(r9)
                android.widget.FrameLayout r3 = r0.g
                if (r3 != 0) goto L_0x02ec
                java.lang.String r9 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r9)
            L_0x02ec:
                android.view.View r3 = (android.view.View) r3
                android.view.View r3 = r3.findViewById(r15)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r3
                java.lang.String r9 = "headerView.tv_customer_evaluate_level"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r9)
                java.lang.String r9 = r0.getString(r6)
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                r3.setText(r9)
                android.widget.FrameLayout r3 = r0.g
                if (r3 != 0) goto L_0x030b
                java.lang.String r9 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r9)
            L_0x030b:
                android.view.View r3 = (android.view.View) r3
                android.view.View r3 = r3.findViewById(r4)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r3
                com.ss.android.ugc.aweme.commerce.service.l.g$a r9 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                int r9 = r9.a(r10, r5)
                r3.setTextColor(r9)
            L_0x031c:
                com.ss.android.ugc.aweme.commerce.service.models.v$b r3 = r2.f38234a
                if (r3 == 0) goto L_0x0327
                float r3 = r3.g
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                goto L_0x0328
            L_0x0327:
                r3 = 0
            L_0x0328:
                if (r3 != 0) goto L_0x032d
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x032d:
                float r3 = r3.floatValue()
                int r3 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
                if (r3 >= 0) goto L_0x038e
                android.widget.FrameLayout r3 = r0.g
                if (r3 != 0) goto L_0x033e
                java.lang.String r9 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r9)
            L_0x033e:
                android.view.View r3 = (android.view.View) r3
                android.view.View r1 = r3.findViewById(r1)
                com.ss.android.ugc.aweme.views.RoundedFrameLayout r1 = (com.ss.android.ugc.aweme.views.RoundedFrameLayout) r1
                com.ss.android.ugc.aweme.commerce.service.l.g$a r3 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                r9 = r0
                android.content.Context r9 = (android.content.Context) r9
                int r3 = r3.a(r9, r12)
                r1.setBackgroundColor(r3)
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x035b
                java.lang.String r3 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            L_0x035b:
                android.view.View r1 = (android.view.View) r1
                android.view.View r1 = r1.findViewById(r15)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
                java.lang.String r3 = "headerView.tv_customer_evaluate_level"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                r3 = 2131559889(0x7f0d05d1, float:1.8745135E38)
                java.lang.String r3 = r0.getString(r3)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r1.setText(r3)
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x037d
                java.lang.String r3 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            L_0x037d:
                android.view.View r1 = (android.view.View) r1
                android.view.View r1 = r1.findViewById(r4)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
                com.ss.android.ugc.aweme.commerce.service.l.g$a r3 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                int r3 = r3.a(r9, r12)
                r1.setTextColor(r3)
            L_0x038e:
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x0397
                java.lang.String r3 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            L_0x0397:
                android.view.View r1 = (android.view.View) r1
                r3 = 2131171009(0x7f0716c1, float:1.7956392E38)
                android.view.View r1 = r1.findViewById(r3)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
                java.lang.String r4 = "headerView.tv_service_attitude_point"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
                if (r2 == 0) goto L_0x03b0
                com.ss.android.ugc.aweme.commerce.service.models.v$b r4 = r2.f38234a
                if (r4 == 0) goto L_0x03b0
                java.lang.String r4 = r4.f38245e
                goto L_0x03b1
            L_0x03b0:
                r4 = 0
            L_0x03b1:
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r1.setText(r4)
                if (r2 == 0) goto L_0x03c3
                com.ss.android.ugc.aweme.commerce.service.models.v$b r1 = r2.f38234a
                if (r1 == 0) goto L_0x03c3
                float r1 = r1.h
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                goto L_0x03c4
            L_0x03c3:
                r1 = 0
            L_0x03c4:
                if (r1 == 0) goto L_0x0528
                com.ss.android.ugc.aweme.commerce.service.models.v$b r1 = r2.f38234a
                if (r1 == 0) goto L_0x03d1
                float r1 = r1.h
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                goto L_0x03d2
            L_0x03d1:
                r1 = 0
            L_0x03d2:
                if (r1 != 0) goto L_0x03d7
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x03d7:
                float r1 = r1.floatValue()
                int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
                if (r1 <= 0) goto L_0x043b
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x03e8
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x03e8:
                android.view.View r1 = (android.view.View) r1
                r4 = 2131169562(0x7f07111a, float:1.7953458E38)
                android.view.View r1 = r1.findViewById(r4)
                com.ss.android.ugc.aweme.views.RoundedFrameLayout r1 = (com.ss.android.ugc.aweme.views.RoundedFrameLayout) r1
                com.ss.android.ugc.aweme.commerce.service.l.g$a r4 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                r9 = r0
                android.content.Context r9 = (android.content.Context) r9
                int r4 = r4.a(r9, r13)
                r1.setBackgroundColor(r4)
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x0408
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x0408:
                android.view.View r1 = (android.view.View) r1
                r4 = 2131171008(0x7f0716c0, float:1.795639E38)
                android.view.View r1 = r1.findViewById(r4)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
                java.lang.String r4 = "headerView.tv_service_attitude_level"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
                java.lang.String r4 = r0.getString(r11)
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r1.setText(r4)
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x042a
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x042a:
                android.view.View r1 = (android.view.View) r1
                android.view.View r1 = r1.findViewById(r3)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
                com.ss.android.ugc.aweme.commerce.service.l.g$a r4 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                int r4 = r4.a(r9, r13)
                r1.setTextColor(r4)
            L_0x043b:
                com.ss.android.ugc.aweme.commerce.service.models.v$b r1 = r2.f38234a
                if (r1 == 0) goto L_0x0446
                float r1 = r1.h
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                goto L_0x0447
            L_0x0446:
                r1 = 0
            L_0x0447:
                if (r1 != 0) goto L_0x044c
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x044c:
                float r1 = r1.floatValue()
                int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
                if (r1 != 0) goto L_0x04b0
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x045d
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x045d:
                android.view.View r1 = (android.view.View) r1
                r4 = 2131169562(0x7f07111a, float:1.7953458E38)
                android.view.View r1 = r1.findViewById(r4)
                com.ss.android.ugc.aweme.views.RoundedFrameLayout r1 = (com.ss.android.ugc.aweme.views.RoundedFrameLayout) r1
                com.ss.android.ugc.aweme.commerce.service.l.g$a r4 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                r9 = r0
                android.content.Context r9 = (android.content.Context) r9
                int r4 = r4.a(r9, r8)
                r1.setBackgroundColor(r4)
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x047d
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x047d:
                android.view.View r1 = (android.view.View) r1
                r4 = 2131171008(0x7f0716c0, float:1.795639E38)
                android.view.View r1 = r1.findViewById(r4)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
                java.lang.String r4 = "headerView.tv_service_attitude_level"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
                java.lang.String r4 = r0.getString(r6)
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r1.setText(r4)
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x049f
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x049f:
                android.view.View r1 = (android.view.View) r1
                android.view.View r1 = r1.findViewById(r3)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
                com.ss.android.ugc.aweme.commerce.service.l.g$a r4 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                int r4 = r4.a(r9, r5)
                r1.setTextColor(r4)
            L_0x04b0:
                com.ss.android.ugc.aweme.commerce.service.models.v$b r1 = r2.f38234a
                if (r1 == 0) goto L_0x04bb
                float r1 = r1.h
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                goto L_0x04bc
            L_0x04bb:
                r1 = 0
            L_0x04bc:
                if (r1 != 0) goto L_0x04c1
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x04c1:
                float r1 = r1.floatValue()
                int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
                if (r1 >= 0) goto L_0x0528
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x04d2
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x04d2:
                android.view.View r1 = (android.view.View) r1
                r4 = 2131169562(0x7f07111a, float:1.7953458E38)
                android.view.View r1 = r1.findViewById(r4)
                com.ss.android.ugc.aweme.views.RoundedFrameLayout r1 = (com.ss.android.ugc.aweme.views.RoundedFrameLayout) r1
                com.ss.android.ugc.aweme.commerce.service.l.g$a r4 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                r9 = r0
                android.content.Context r9 = (android.content.Context) r9
                int r4 = r4.a(r9, r12)
                r1.setBackgroundColor(r4)
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x04f2
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x04f2:
                android.view.View r1 = (android.view.View) r1
                r4 = 2131171008(0x7f0716c0, float:1.795639E38)
                android.view.View r1 = r1.findViewById(r4)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
                java.lang.String r4 = "headerView.tv_service_attitude_level"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
                r4 = 2131559889(0x7f0d05d1, float:1.8745135E38)
                java.lang.String r4 = r0.getString(r4)
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r1.setText(r4)
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x0517
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x0517:
                android.view.View r1 = (android.view.View) r1
                android.view.View r1 = r1.findViewById(r3)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
                com.ss.android.ugc.aweme.commerce.service.l.g$a r3 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                int r3 = r3.a(r9, r12)
                r1.setTextColor(r3)
            L_0x0528:
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x0531
                java.lang.String r3 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            L_0x0531:
                android.view.View r1 = (android.view.View) r1
                r3 = 2131171006(0x7f0716be, float:1.7956386E38)
                android.view.View r1 = r1.findViewById(r3)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
                java.lang.String r4 = "headerView.tv_send_speed_point"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
                if (r2 == 0) goto L_0x054a
                com.ss.android.ugc.aweme.commerce.service.models.v$b r4 = r2.f38234a
                if (r4 == 0) goto L_0x054a
                java.lang.String r4 = r4.f38246f
                goto L_0x054b
            L_0x054a:
                r4 = 0
            L_0x054b:
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r1.setText(r4)
                if (r2 == 0) goto L_0x055d
                com.ss.android.ugc.aweme.commerce.service.models.v$b r1 = r2.f38234a
                if (r1 == 0) goto L_0x055d
                float r1 = r1.i
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                goto L_0x055e
            L_0x055d:
                r1 = 0
            L_0x055e:
                if (r1 == 0) goto L_0x06c2
                com.ss.android.ugc.aweme.commerce.service.models.v$b r1 = r2.f38234a
                if (r1 == 0) goto L_0x056b
                float r1 = r1.i
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                goto L_0x056c
            L_0x056b:
                r1 = 0
            L_0x056c:
                if (r1 != 0) goto L_0x0571
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x0571:
                float r1 = r1.floatValue()
                int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
                if (r1 <= 0) goto L_0x05d5
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x0582
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x0582:
                android.view.View r1 = (android.view.View) r1
                r4 = 2131169561(0x7f071119, float:1.7953456E38)
                android.view.View r1 = r1.findViewById(r4)
                com.ss.android.ugc.aweme.views.RoundedFrameLayout r1 = (com.ss.android.ugc.aweme.views.RoundedFrameLayout) r1
                com.ss.android.ugc.aweme.commerce.service.l.g$a r4 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                r9 = r0
                android.content.Context r9 = (android.content.Context) r9
                int r4 = r4.a(r9, r13)
                r1.setBackgroundColor(r4)
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x05a2
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x05a2:
                android.view.View r1 = (android.view.View) r1
                r4 = 2131171005(0x7f0716bd, float:1.7956384E38)
                android.view.View r1 = r1.findViewById(r4)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
                java.lang.String r4 = "headerView.tv_send_speed_level"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
                java.lang.String r4 = r0.getString(r11)
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r1.setText(r4)
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x05c4
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x05c4:
                android.view.View r1 = (android.view.View) r1
                android.view.View r1 = r1.findViewById(r3)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
                com.ss.android.ugc.aweme.commerce.service.l.g$a r4 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                int r4 = r4.a(r9, r13)
                r1.setTextColor(r4)
            L_0x05d5:
                com.ss.android.ugc.aweme.commerce.service.models.v$b r1 = r2.f38234a
                if (r1 == 0) goto L_0x05e0
                float r1 = r1.i
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                goto L_0x05e1
            L_0x05e0:
                r1 = 0
            L_0x05e1:
                if (r1 != 0) goto L_0x05e6
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x05e6:
                float r1 = r1.floatValue()
                int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
                if (r1 != 0) goto L_0x064a
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x05f7
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x05f7:
                android.view.View r1 = (android.view.View) r1
                r4 = 2131169561(0x7f071119, float:1.7953456E38)
                android.view.View r1 = r1.findViewById(r4)
                com.ss.android.ugc.aweme.views.RoundedFrameLayout r1 = (com.ss.android.ugc.aweme.views.RoundedFrameLayout) r1
                com.ss.android.ugc.aweme.commerce.service.l.g$a r4 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                r9 = r0
                android.content.Context r9 = (android.content.Context) r9
                int r4 = r4.a(r9, r8)
                r1.setBackgroundColor(r4)
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x0617
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x0617:
                android.view.View r1 = (android.view.View) r1
                r4 = 2131171005(0x7f0716bd, float:1.7956384E38)
                android.view.View r1 = r1.findViewById(r4)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
                java.lang.String r4 = "headerView.tv_send_speed_level"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
                java.lang.String r4 = r0.getString(r6)
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r1.setText(r4)
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x0639
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x0639:
                android.view.View r1 = (android.view.View) r1
                android.view.View r1 = r1.findViewById(r3)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
                com.ss.android.ugc.aweme.commerce.service.l.g$a r4 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                int r4 = r4.a(r9, r5)
                r1.setTextColor(r4)
            L_0x064a:
                com.ss.android.ugc.aweme.commerce.service.models.v$b r1 = r2.f38234a
                if (r1 == 0) goto L_0x0655
                float r1 = r1.i
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                goto L_0x0656
            L_0x0655:
                r1 = 0
            L_0x0656:
                if (r1 != 0) goto L_0x065b
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x065b:
                float r1 = r1.floatValue()
                int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
                if (r1 >= 0) goto L_0x06c2
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x066c
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x066c:
                android.view.View r1 = (android.view.View) r1
                r4 = 2131169561(0x7f071119, float:1.7953456E38)
                android.view.View r1 = r1.findViewById(r4)
                com.ss.android.ugc.aweme.views.RoundedFrameLayout r1 = (com.ss.android.ugc.aweme.views.RoundedFrameLayout) r1
                com.ss.android.ugc.aweme.commerce.service.l.g$a r4 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                r5 = r0
                android.content.Context r5 = (android.content.Context) r5
                int r4 = r4.a(r5, r12)
                r1.setBackgroundColor(r4)
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x068c
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x068c:
                android.view.View r1 = (android.view.View) r1
                r4 = 2131171005(0x7f0716bd, float:1.7956384E38)
                android.view.View r1 = r1.findViewById(r4)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
                java.lang.String r4 = "headerView.tv_send_speed_level"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
                r4 = 2131559889(0x7f0d05d1, float:1.8745135E38)
                java.lang.String r4 = r0.getString(r4)
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r1.setText(r4)
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x06b1
                java.lang.String r4 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x06b1:
                android.view.View r1 = (android.view.View) r1
                android.view.View r1 = r1.findViewById(r3)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
                com.ss.android.ugc.aweme.commerce.service.l.g$a r3 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
                int r3 = r3.a(r5, r12)
                r1.setTextColor(r3)
            L_0x06c2:
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x06cb
                java.lang.String r3 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            L_0x06cb:
                android.view.View r1 = (android.view.View) r1
                r3 = 2131169359(0x7f07104f, float:1.7953046E38)
                android.view.View r1 = r1.findViewById(r3)
                java.lang.String r3 = "headerView.recommendContainer1"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                if (r2 == 0) goto L_0x06e7
                java.util.List<com.ss.android.ugc.aweme.commerce.service.models.v$a> r3 = r2.f38235b
                if (r3 == 0) goto L_0x06e7
                r4 = 0
                java.lang.Object r3 = r3.get(r4)
                com.ss.android.ugc.aweme.commerce.service.models.v$a r3 = (com.ss.android.ugc.aweme.commerce.service.models.v.a) r3
                goto L_0x06e9
            L_0x06e7:
                r4 = 0
                r3 = 0
            L_0x06e9:
                com.ss.android.ugc.aweme.commerce.service.models.w r3 = com.ss.android.ugc.aweme.commerce.service.models.ah.a(r3)
                com.ss.android.ugc.aweme.commerce.service.models.c r3 = (com.ss.android.ugc.aweme.commerce.service.models.c) r3
                kotlin.jvm.functions.Function1<com.ss.android.ugc.aweme.commerce.service.models.c, kotlin.Unit> r5 = r0.Y
                r6 = 1
                r0.a(r1, r3, r6, r5)
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x06fe
                java.lang.String r3 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            L_0x06fe:
                android.view.View r1 = (android.view.View) r1
                r3 = 2131169360(0x7f071050, float:1.7953048E38)
                android.view.View r1 = r1.findViewById(r3)
                java.lang.String r3 = "headerView.recommendContainer2"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                if (r2 == 0) goto L_0x071a
                java.util.List<com.ss.android.ugc.aweme.commerce.service.models.v$a> r3 = r2.f38235b
                if (r3 == 0) goto L_0x071a
                r5 = 1
                java.lang.Object r3 = r3.get(r5)
                com.ss.android.ugc.aweme.commerce.service.models.v$a r3 = (com.ss.android.ugc.aweme.commerce.service.models.v.a) r3
                goto L_0x071c
            L_0x071a:
                r5 = 1
                r3 = 0
            L_0x071c:
                com.ss.android.ugc.aweme.commerce.service.models.w r3 = com.ss.android.ugc.aweme.commerce.service.models.ah.a(r3)
                com.ss.android.ugc.aweme.commerce.service.models.c r3 = (com.ss.android.ugc.aweme.commerce.service.models.c) r3
                kotlin.jvm.functions.Function1<com.ss.android.ugc.aweme.commerce.service.models.c, kotlin.Unit> r6 = r0.Y
                r0.a(r1, r3, r5, r6)
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x0730
                java.lang.String r3 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            L_0x0730:
                android.view.View r1 = (android.view.View) r1
                r3 = 2131169361(0x7f071051, float:1.795305E38)
                android.view.View r1 = r1.findViewById(r3)
                java.lang.String r3 = "headerView.recommendContainer3"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                if (r2 == 0) goto L_0x074c
                java.util.List<com.ss.android.ugc.aweme.commerce.service.models.v$a> r2 = r2.f38235b
                if (r2 == 0) goto L_0x074c
                r3 = 2
                java.lang.Object r2 = r2.get(r3)
                com.ss.android.ugc.aweme.commerce.service.models.v$a r2 = (com.ss.android.ugc.aweme.commerce.service.models.v.a) r2
                goto L_0x074d
            L_0x074c:
                r2 = 0
            L_0x074d:
                com.ss.android.ugc.aweme.commerce.service.models.w r2 = com.ss.android.ugc.aweme.commerce.service.models.ah.a(r2)
                com.ss.android.ugc.aweme.commerce.service.models.c r2 = (com.ss.android.ugc.aweme.commerce.service.models.c) r2
                kotlin.jvm.functions.Function1<com.ss.android.ugc.aweme.commerce.service.models.c, kotlin.Unit> r3 = r0.Y
                r5 = 1
                r0.a(r1, r2, r5, r3)
                android.widget.FrameLayout r1 = r0.g
                if (r1 != 0) goto L_0x0762
                java.lang.String r2 = "headerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            L_0x0762:
                android.view.View r1 = (android.view.View) r1
                r2 = 2131169941(0x7f071295, float:1.7954226E38)
                android.view.View r1 = r1.findViewById(r2)
                java.lang.String r2 = "headerView.shopDivider"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                boolean r2 = r0.j()
                if (r2 == 0) goto L_0x0777
                goto L_0x077b
            L_0x0777:
                r10 = 8
                r4 = 8
            L_0x077b:
                r1.setVisibility(r4)
                r0.f()
                r0.t()
            L_0x0784:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.ae.then(a.i):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "couponId", "", "isConfirm", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class af extends Lambda implements Function2<String, Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PreviewActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        af(PreviewActivity previewActivity) {
            super(2);
            this.this$0 = previewActivity;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((String) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str, boolean z) {
            if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 28700, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, changeQuickRedirect, false, 28700, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str, "couponId");
            if (z) {
                new com.ss.android.ugc.aweme.commerce.service.logs.m().e(str).a(PreviewActivity.c(this.this$0).getCommodityType()).a(this.this$0.F).b(PreviewActivity.c(this.this$0).getPromotionId()).c(PreviewActivity.b(this.this$0).getUid()).d("full_screen_card").b();
            } else {
                new com.ss.android.ugc.aweme.commerce.service.logs.as().e(str).a(PreviewActivity.c(this.this$0).getCommodityType()).a(this.this$0.F).b(PreviewActivity.c(this.this$0).getPromotionId()).c(PreviewActivity.b(this.this$0).getUid()).d("full_screen_card").b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/commerce/service/models/BaseDetailPromotion;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ag extends Lambda implements Function1<com.ss.android.ugc.aweme.commerce.service.models.c, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.commerce.service.models.h $good;
        final /* synthetic */ PreviewActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ag(PreviewActivity previewActivity, com.ss.android.ugc.aweme.commerce.service.models.h hVar) {
            super(1);
            this.this$0 = previewActivity;
            this.$good = hVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.ss.android.ugc.aweme.commerce.service.models.c) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.ss.android.ugc.aweme.commerce.service.models.c cVar) {
            com.ss.android.ugc.aweme.commerce.service.models.c cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{cVar2}, this, changeQuickRedirect, false, 28701, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar2}, this, changeQuickRedirect, false, 28701, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.c.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(cVar2, AdvanceSetting.NETWORK_TYPE);
            PreviewActivity previewActivity = this.this$0;
            com.ss.android.ugc.aweme.commerce.service.models.h hVar = this.$good;
            if (PatchProxy.isSupport(new Object[]{hVar}, previewActivity, PreviewActivity.f2890a, false, 28615, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.h.class}, Void.TYPE)) {
                PreviewActivity previewActivity2 = previewActivity;
                PatchProxy.accessDispatch(new Object[]{hVar}, previewActivity2, PreviewActivity.f2890a, false, 28615, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.h.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.commerce.service.models.n nVar = previewActivity.q;
            if (nVar != null) {
                com.ss.android.ugc.aweme.commerce.service.models.b bVar = nVar.f38222d;
                if (bVar != null) {
                    n.a aVar = com.ss.android.ugc.aweme.commerce.service.models.n.r;
                    Context context = previewActivity;
                    CommerceUser commerceUser = previewActivity.E;
                    if (commerceUser == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mUserInfo");
                    }
                    String str = bVar.f38194b;
                    String promotionId = hVar.getPromotionId();
                    if (promotionId == null) {
                        promotionId = "";
                    }
                    com.ss.android.ugc.aweme.commercialize.g.a(n.a.a(aVar, context, commerceUser, str, promotionId, bVar.f38196d, bVar.f38197e, hVar.getDetailUrl(), previewActivity.R, "click_related_product", null, null, "full_screen_card", null, SystemClock.uptimeMillis(), hVar.getPromotionSource(), null, null, previewActivity.T, null, 364544));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/CUserResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class ah<TTaskResult, TContinuationResult> implements a.g<com.ss.android.ugc.aweme.commerce.preview.api.a.a, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37162a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37163b;

        ah(PreviewActivity previewActivity) {
            this.f37163b = previewActivity;
        }

        public final /* synthetic */ Object then(a.i iVar) {
            String str;
            String str2;
            a.i iVar2;
            a.i iVar3 = iVar;
            if (PatchProxy.isSupport(new Object[]{iVar3}, this, f37162a, false, 28702, new Class[]{a.i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar3}, this, f37162a, false, 28702, new Class[]{a.i.class}, Void.class);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar3, "task");
            if (iVar.d() || iVar.e() == null || ((com.ss.android.ugc.aweme.commerce.preview.api.a.a) iVar.e()).f37321a == null || ((com.ss.android.ugc.aweme.commerce.preview.api.a.a) iVar.e()).statusCode != 0) {
                this.f37163b.s();
            } else {
                this.f37163b.W = ((com.ss.android.ugc.aweme.commerce.preview.api.a.a) iVar.e()).f37321a;
                IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
                User user = this.f37163b.W;
                if (user != null) {
                    str = user.getShopMicroApp();
                } else {
                    str = null;
                }
                iMiniAppService.preloadMiniApp(str);
                User user2 = this.f37163b.W;
                if (user2 != null) {
                    str2 = user2.getShopMicroApp();
                } else {
                    str2 = null;
                }
                if (TextUtils.isEmpty(str2)) {
                    this.f37163b.s();
                } else {
                    PreviewActivity previewActivity = this.f37163b;
                    if (PatchProxy.isSupport(new Object[0], previewActivity, PreviewActivity.f2890a, false, 28622, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], previewActivity, PreviewActivity.f2890a, false, 28622, new Class[0], Void.TYPE);
                    } else {
                        com.ss.android.ugc.aweme.commerce.preview.api.a aVar = com.ss.android.ugc.aweme.commerce.preview.api.a.f37316c;
                        com.ss.android.ugc.aweme.commerce.service.models.h hVar = previewActivity.D;
                        if (hVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
                        }
                        String promotionId = hVar.getPromotionId();
                        if (promotionId == null) {
                            Intrinsics.throwNpe();
                        }
                        com.ss.android.ugc.aweme.commerce.service.models.h hVar2 = previewActivity.D;
                        if (hVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
                        }
                        String productId = hVar2.getProductId();
                        if (productId == null) {
                            Intrinsics.throwNpe();
                        }
                        CommerceUser commerceUser = previewActivity.E;
                        if (commerceUser == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mUserInfo");
                        }
                        String uid = commerceUser.getUid();
                        if (PatchProxy.isSupport(new Object[]{promotionId, productId, uid}, aVar, com.ss.android.ugc.aweme.commerce.preview.api.a.f37314a, false, 28864, new Class[]{String.class, String.class, String.class}, a.i.class)) {
                            iVar2 = (a.i) PatchProxy.accessDispatch(new Object[]{promotionId, productId, uid}, aVar, com.ss.android.ugc.aweme.commerce.preview.api.a.f37314a, false, 28864, new Class[]{String.class, String.class, String.class}, a.i.class);
                        } else {
                            Intrinsics.checkParameterIsNotNull(promotionId, "promotionId");
                            Intrinsics.checkParameterIsNotNull(productId, "productId");
                            Intrinsics.checkParameterIsNotNull(uid, "authorId");
                            iVar2 = com.ss.android.ugc.aweme.commerce.preview.api.a.f37315b.getShopRecommend(promotionId, productId, uid, dr.a().a(uid));
                        }
                        iVar2.a((a.g<TResult, TContinuationResult>) new ae<TResult,TContinuationResult>(previewActivity), a.i.f1052b);
                    }
                    DmtTextView dmtTextView = (DmtTextView) this.f37163b.w().a((int) C0906R.id.djx);
                    Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "tv_store_shop");
                    dmtTextView.setText(this.f37163b.getString(C0906R.string.zi));
                }
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/PreviewActivity$initFootprint$1", "Lcom/ss/android/ugc/aweme/commerce/preview/refresh/PtrDefaultHandler;", "onRefreshBegin", "", "frame", "Lcom/ss/android/ugc/aweme/commerce/preview/refresh/PtrFrameLayout;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class ai extends com.ss.android.ugc.aweme.commerce.preview.refresh.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37164a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37165b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f37166c;

        public final void a(@Nullable PtrFrameLayout ptrFrameLayout) {
            if (PatchProxy.isSupport(new Object[]{ptrFrameLayout}, this, f37164a, false, 28703, new Class[]{PtrFrameLayout.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{ptrFrameLayout}, this, f37164a, false, 28703, new Class[]{PtrFrameLayout.class}, Void.TYPE);
            } else if (this.f37165b.D != null) {
                ((PtrFrameLayout) this.f37165b.e((int) C0906R.id.c8e)).a();
                this.f37165b.A();
                String str = this.f37165b.F;
                if (str == null || Intrinsics.areEqual((Object) str, (Object) "")) {
                    str = PushConstants.PUSH_TYPE_NOTIFY;
                }
                String str2 = str;
                String promotionId = PreviewActivity.c(this.f37165b).getPromotionId();
                if (promotionId != null && (!Intrinsics.areEqual((Object) promotionId, (Object) ""))) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    com.ss.android.ugc.aweme.commerce.preview.footprint.c u = this.f37165b.u();
                    Activity activity = this.f37166c;
                    if (activity != null) {
                        FragmentActivity fragmentActivity = (FragmentActivity) activity;
                        String uid = PreviewActivity.b(this.f37165b).getUid();
                        String str3 = this.f37165b.R;
                        if (PatchProxy.isSupport(new Object[]{fragmentActivity, promotionId, uid, str2, str3, new Long(uptimeMillis)}, u, com.ss.android.ugc.aweme.commerce.preview.footprint.c.f37474a, false, 28928, new Class[]{FragmentActivity.class, String.class, String.class, String.class, String.class, Long.TYPE}, Void.TYPE)) {
                            com.ss.android.ugc.aweme.commerce.preview.footprint.c cVar = u;
                            PatchProxy.accessDispatch(new Object[]{fragmentActivity, promotionId, uid, str2, str3, new Long(uptimeMillis)}, cVar, com.ss.android.ugc.aweme.commerce.preview.footprint.c.f37474a, false, 28928, new Class[]{FragmentActivity.class, String.class, String.class, String.class, String.class, Long.TYPE}, Void.TYPE);
                            return;
                        }
                        Intrinsics.checkParameterIsNotNull(fragmentActivity, "context");
                        Intrinsics.checkParameterIsNotNull(promotionId, "promotionId");
                        Intrinsics.checkParameterIsNotNull(uid, "authorId");
                        Intrinsics.checkParameterIsNotNull(str2, "awemeId");
                        Intrinsics.checkParameterIsNotNull(str3, "referFrom");
                        c.a aVar = new c.a(promotionId, uid, str2, fragmentActivity, str3, uptimeMillis);
                        com.ss.android.ugc.aweme.commerce.preview.footprint.b bVar = new com.ss.android.ugc.aweme.commerce.preview.footprint.b(fragmentActivity);
                        bVar.setMDepend(aVar);
                        if (PatchProxy.isSupport(new Object[0], bVar, com.ss.android.ugc.aweme.commerce.preview.footprint.b.f37446a, false, 28910, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], bVar, com.ss.android.ugc.aweme.commerce.preview.footprint.b.f37446a, false, 28910, new Class[0], Void.TYPE);
                        } else {
                            b.C0475b bVar2 = bVar.f37447b;
                            if (bVar2 != null) {
                                bVar2.a((b.a) new b.e(bVar));
                            }
                        }
                        FootprintFragment footprintFragment = new FootprintFragment();
                        View view = bVar;
                        if (PatchProxy.isSupport(new Object[]{view}, footprintFragment, FootprintFragment.f37357a, false, 28885, new Class[]{View.class}, FootprintFragment.class)) {
                            FootprintFragment footprintFragment2 = footprintFragment;
                            FootprintFragment footprintFragment3 = (FootprintFragment) PatchProxy.accessDispatch(new Object[]{view}, footprintFragment2, FootprintFragment.f37357a, false, 28885, new Class[]{View.class}, FootprintFragment.class);
                        } else {
                            Intrinsics.checkParameterIsNotNull(view, "contentView");
                            footprintFragment.f37360d = view;
                        }
                        try {
                            footprintFragment.showNow(fragmentActivity.getSupportFragmentManager(), FootprintFragment.class.getName());
                        } catch (Exception unused) {
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                }
            }
        }

        ai(PreviewActivity previewActivity, Activity activity) {
            this.f37165b = previewActivity;
            this.f37166c = activity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/PreviewActivity$initPresenter$1", "Lcom/ss/android/ugc/aweme/commerce/service/ICommerceService$Add2WillDialogListener;", "onDimiss", "", "onShow", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class aj implements ICommerceService.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37167a;

        aj(PreviewActivity previewActivity) {
            this.f37167a = previewActivity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class ak implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37168a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37169b;

        ak(PreviewActivity previewActivity) {
            this.f37169b = previewActivity;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f37168a, false, 28708, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37168a, false, 28708, new Class[0], Void.TYPE);
                return;
            }
            DmtTextView dmtTextView = (DmtTextView) PreviewActivity.a(this.f37169b).findViewById(C0906R.id.d1t);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "headerView.text_service_info_three");
            if (dmtTextView.getLineCount() > 1) {
                DmtTextView dmtTextView2 = (DmtTextView) PreviewActivity.a(this.f37169b).findViewById(C0906R.id.d1t);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "headerView.text_service_info_three");
                dmtTextView2.setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class al implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37170a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f37171b;

        al(List list) {
            this.f37171b = list;
        }

        public final void onClick(View view) {
            View view2;
            View view3 = view;
            if (PatchProxy.isSupport(new Object[]{view3}, this, f37170a, false, 28709, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view3}, this, f37170a, false, 28709, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Intrinsics.checkExpressionValueIsNotNull(view3, AdvanceSetting.NETWORK_TYPE);
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "it.context");
            ServiceIntroDialog serviceIntroDialog = new ServiceIntroDialog(context);
            List<com.ss.android.ugc.aweme.commerce.service.models.j> list = this.f37171b;
            if (PatchProxy.isSupport(new Object[]{list}, serviceIntroDialog, ServiceIntroDialog.f37377d, false, 28904, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, serviceIntroDialog, ServiceIntroDialog.f37377d, false, 28904, new Class[]{List.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(list, "serviceList");
                for (com.ss.android.ugc.aweme.commerce.service.models.j jVar : list) {
                    Context context2 = serviceIntroDialog.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context2, "getContext()");
                    if (PatchProxy.isSupport(new Object[]{context2, jVar}, serviceIntroDialog, ServiceIntroDialog.f37377d, false, 28906, new Class[]{Context.class, com.ss.android.ugc.aweme.commerce.service.models.j.class}, View.class)) {
                        ServiceIntroDialog serviceIntroDialog2 = serviceIntroDialog;
                        view2 = (View) PatchProxy.accessDispatch(new Object[]{context2, jVar}, serviceIntroDialog2, ServiceIntroDialog.f37377d, false, 28906, new Class[]{Context.class, com.ss.android.ugc.aweme.commerce.service.models.j.class}, View.class);
                    } else {
                        LinearLayout linearLayout = new LinearLayout(context2);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        int a2 = serviceIntroDialog.a(14);
                        int a3 = serviceIntroDialog.a(16);
                        linearLayout.setPadding(a3, a2, a3, a2);
                        linearLayout.setLayoutParams(layoutParams);
                        RemoteImageView remoteImageView = new RemoteImageView(context2);
                        int a4 = serviceIntroDialog.a(40);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(a4, a4);
                        remoteImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        remoteImageView.setLayoutParams(layoutParams2);
                        com.ss.android.ugc.aweme.base.c.a(remoteImageView, jVar.getIcon());
                        linearLayout.addView(remoteImageView);
                        LinearLayout linearLayout2 = new LinearLayout(context2);
                        linearLayout2.setOrientation(1);
                        linearLayout2.setPadding(serviceIntroDialog.a(12), 0, 0, 0);
                        linearLayout.addView(linearLayout2);
                        DmtTextView dmtTextView = new DmtTextView(context2);
                        dmtTextView.setTextColor(context2.getResources().getColor(C0906R.color.a76));
                        dmtTextView.setIncludeFontPadding(false);
                        dmtTextView.setMaxLines(1);
                        dmtTextView.setTextSize(14.0f);
                        dmtTextView.setText(jVar.getTitle());
                        DmtTextView dmtTextView2 = new DmtTextView(context2);
                        dmtTextView2.setTextColor(context2.getResources().getColor(C0906R.color.a6x));
                        dmtTextView.setIncludeFontPadding(false);
                        dmtTextView2.setTextSize(12.0f);
                        dmtTextView2.setText(jVar.getContent());
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams3.topMargin = serviceIntroDialog.a(4);
                        dmtTextView2.setLayoutParams(layoutParams3);
                        linearLayout2.addView(dmtTextView);
                        linearLayout2.addView(dmtTextView2);
                        view2 = linearLayout;
                    }
                    ViewGroup viewGroup = serviceIntroDialog.f37378e;
                    if (viewGroup == null) {
                        Intrinsics.throwNpe();
                    }
                    viewGroup.addView(view2);
                }
                View view4 = new View(serviceIntroDialog.getContext());
                view4.setLayoutParams(new LinearLayout.LayoutParams(-1, serviceIntroDialog.a(40)));
                ViewGroup viewGroup2 = serviceIntroDialog.f37378e;
                if (viewGroup2 == null) {
                    Intrinsics.throwNpe();
                }
                viewGroup2.addView(view4);
            }
            serviceIntroDialog.show();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "success", "", "shopPromotionListResponse", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopPromotionListResponse;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class am extends Lambda implements Function2<Boolean, com.ss.android.ugc.aweme.commerce.service.models.u, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ l $shopDetailVO;
        final /* synthetic */ PreviewActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        am(PreviewActivity previewActivity, l lVar) {
            super(2);
            this.this$0 = previewActivity;
            this.$shopDetailVO = lVar;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Boolean) obj).booleanValue(), (com.ss.android.ugc.aweme.commerce.service.models.u) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z, @Nullable com.ss.android.ugc.aweme.commerce.service.models.u uVar) {
            Collection collection;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), uVar}, this, changeQuickRedirect, false, 28710, new Class[]{Boolean.TYPE, com.ss.android.ugc.aweme.commerce.service.models.u.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), uVar}, this, changeQuickRedirect, false, 28710, new Class[]{Boolean.TYPE, com.ss.android.ugc.aweme.commerce.service.models.u.class}, Void.TYPE);
                return;
            }
            if (z) {
                this.$shopDetailVO.f37515d += 5;
                l lVar = this.$shopDetailVO;
                if (uVar == null) {
                    Intrinsics.throwNpe();
                }
                lVar.f37512a = uVar.f38231c;
                this.$shopDetailVO.f37513b = uVar.f38232d;
                List<com.ss.android.ugc.aweme.commerce.service.models.w> list = this.$shopDetailVO.f37514c;
                List<com.ss.android.ugc.aweme.commerce.service.models.w> list2 = uVar.f38229a;
                if (list2 != null) {
                    collection = list2;
                } else {
                    collection = new ArrayList();
                }
                list.addAll(collection);
                this.this$0.r();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/CUserResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class an<TTaskResult, TContinuationResult> implements a.g<com.ss.android.ugc.aweme.commerce.preview.api.a.a, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37172a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37173b;

        an(PreviewActivity previewActivity) {
            this.f37173b = previewActivity;
        }

        public final /* synthetic */ Object then(a.i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f37172a, false, 28711, new Class[]{a.i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f37172a, false, 28711, new Class[]{a.i.class}, Void.class);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar, "task");
            if (iVar.d() || iVar.e() == null || ((com.ss.android.ugc.aweme.commerce.preview.api.a.a) iVar.e()).f37321a == null || ((com.ss.android.ugc.aweme.commerce.preview.api.a.a) iVar.e()).statusCode != 0) {
                com.ss.android.ugc.aweme.commerce.service.l.c.f37989a.a("get user fail");
                this.f37173b.finish();
            } else {
                PreviewActivity previewActivity = this.f37173b;
                CommerceUser a2 = com.ss.android.ugc.aweme.commerce.service.l.d.a(((com.ss.android.ugc.aweme.commerce.preview.api.a.a) iVar.e()).f37321a);
                Intrinsics.checkExpressionValueIsNotNull(a2, "CommerceUtils.toCommerceUser(task.result.user)");
                previewActivity.E = a2;
                this.f37173b.g();
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/commerce/preview/footprint/FootprintManager;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ao extends Lambda implements Function0<com.ss.android.ugc.aweme.commerce.preview.footprint.c> {
        public static final ao INSTANCE = new ao();
        public static ChangeQuickRedirect changeQuickRedirect;

        ao() {
            super(0);
        }

        @NotNull
        public final com.ss.android.ugc.aweme.commerce.preview.footprint.c invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28712, new Class[0], com.ss.android.ugc.aweme.commerce.preview.footprint.c.class)) {
                return new com.ss.android.ugc.aweme.commerce.preview.footprint.c();
            }
            return (com.ss.android.ugc.aweme.commerce.preview.footprint.c) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28712, new Class[0], com.ss.android.ugc.aweme.commerce.preview.footprint.c.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ap extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PreviewActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ap(PreviewActivity previewActivity) {
            super(0);
            this.this$0 = previewActivity;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28713, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28713, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.a(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/PreviewActivity$onCreate$1", "Lcom/ss/android/ugc/aweme/commerce/widget/PreviewRelativeLayout$IPreviewClickListener;", "onClick", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class aq implements PreviewRelativeLayout.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37174a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37175b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f37174a, false, 28714, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37174a, false, 28714, new Class[0], Void.TYPE);
                return;
            }
            this.f37175b.A();
        }

        aq(PreviewActivity previewActivity) {
            this.f37175b = previewActivity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class ar implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37176a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37177b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f37178c;

        ar(PreviewActivity previewActivity, int i) {
            this.f37177b = previewActivity;
            this.f37178c = i;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f37176a, false, 28717, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37176a, false, 28717, new Class[0], Void.TYPE);
                return;
            }
            this.f37177b.a(this.f37178c + 1, true);
            this.f37177b.p = false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lorg/json/JSONObject;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class as extends Lambda implements Function1<JSONObject, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PreviewActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        as(PreviewActivity previewActivity) {
            super(1);
            this.this$0 = previewActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable JSONObject jSONObject) {
            if (PatchProxy.isSupport(new Object[]{jSONObject}, this, changeQuickRedirect, false, 28718, new Class[]{JSONObject.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jSONObject}, this, changeQuickRedirect, false, 28718, new Class[]{JSONObject.class}, Void.TYPE);
                return;
            }
            h.f37502d.a((Activity) this.this$0);
            this.this$0.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "promotion", "Lcom/ss/android/ugc/aweme/commerce/service/models/DetailPromotion;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class at extends Lambda implements Function1<com.ss.android.ugc.aweme.commerce.service.models.h, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PreviewActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        at(PreviewActivity previewActivity) {
            super(1);
            this.this$0 = previewActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.ss.android.ugc.aweme.commerce.service.models.h) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.ss.android.ugc.aweme.commerce.service.models.h hVar) {
            if (PatchProxy.isSupport(new Object[]{hVar}, this, changeQuickRedirect, false, 28719, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar}, this, changeQuickRedirect, false, 28719, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.h.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(hVar, "promotion");
            DmtStatusView dmtStatusView = (DmtStatusView) this.this$0.e((int) C0906R.id.cuz);
            Intrinsics.checkExpressionValueIsNotNull(dmtStatusView, "statusView");
            dmtStatusView.setVisibility(8);
            this.this$0.a(hVar, CollectionsKt.listOf(hVar));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "promotions", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/DetailPromotion;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class au extends Lambda implements Function1<List<? extends com.ss.android.ugc.aweme.commerce.service.models.h>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PreviewActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        au(PreviewActivity previewActivity) {
            super(1);
            this.this$0 = previewActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x0079 A[EDGE_INSN: B:31:0x0079->B:16:0x0079 ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void invoke(@org.jetbrains.annotations.NotNull java.util.List<com.ss.android.ugc.aweme.commerce.service.models.h> r10) {
            /*
                r9 = this;
                r7 = 1
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r8 = 0
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<java.util.List> r1 = java.util.List.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 28720(0x7030, float:4.0245E-41)
                r1 = r9
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0030
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
                r3 = 0
                r4 = 28720(0x7030, float:4.0245E-41)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<java.util.List> r1 = java.util.List.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0030:
                java.lang.String r0 = "promotions"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r9.this$0
                r1 = 2131170095(0x7f07132f, float:1.7954539E38)
                android.view.View r0 = r0.e((int) r1)
                com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = (com.bytedance.ies.dmt.ui.widget.DmtStatusView) r0
                java.lang.String r1 = "statusView"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r1 = 8
                r0.setVisibility(r1)
                r0 = r10
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
            L_0x0051:
                boolean r1 = r0.hasNext()
                r2 = 0
                if (r1 == 0) goto L_0x0078
                java.lang.Object r1 = r0.next()
                r3 = r1
                com.ss.android.ugc.aweme.commerce.service.models.h r3 = (com.ss.android.ugc.aweme.commerce.service.models.h) r3
                java.lang.String r3 = r3.getPromotionId()
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r4 = r9.this$0
                com.ss.android.ugc.aweme.commerce.service.models.n r4 = r4.q
                if (r4 == 0) goto L_0x0070
                com.ss.android.ugc.aweme.commerce.service.models.b r4 = r4.f38222d
                if (r4 == 0) goto L_0x0070
                java.lang.String r4 = r4.f38195c
                goto L_0x0071
            L_0x0070:
                r4 = r2
            L_0x0071:
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
                if (r3 == 0) goto L_0x0051
                goto L_0x0079
            L_0x0078:
                r1 = r2
            L_0x0079:
                com.ss.android.ugc.aweme.commerce.service.models.h r1 = (com.ss.android.ugc.aweme.commerce.service.models.h) r1
                if (r1 != 0) goto L_0x008c
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r9.this$0
                kotlin.jvm.functions.Function1<org.json.JSONObject, kotlin.Unit> r0 = r0.w
                r0.invoke(r2)
                com.ss.android.ugc.aweme.commerce.service.l.c$a r0 = com.ss.android.ugc.aweme.commerce.service.l.c.f37989a
                java.lang.String r1 = "promotion is null"
                r0.a((java.lang.String) r1)
                return
            L_0x008c:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r9.this$0
                com.ss.android.ugc.aweme.commerce.service.models.n r0 = r0.q
                if (r0 == 0) goto L_0x0098
                com.ss.android.ugc.aweme.commerce.service.models.b r0 = r0.f38222d
                if (r0 == 0) goto L_0x0098
                java.lang.String r2 = r0.f38196d
            L_0x0098:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 == 0) goto L_0x00a6
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r9.this$0
                r0.a((com.ss.android.ugc.aweme.commerce.service.models.h) r1, (java.util.List<com.ss.android.ugc.aweme.commerce.service.models.h>) r10)
                return
            L_0x00a6:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r9.this$0
                java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r1)
                r0.a((com.ss.android.ugc.aweme.commerce.service.models.h) r1, (java.util.List<com.ss.android.ugc.aweme.commerce.service.models.h>) r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.au.invoke(java.util.List):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/PreviewActivity$onResume$1", "Lcom/ss/android/ugc/aweme/commerce/preview/PreviewHomeWatcherReceiver$SwitchAppListener;", "onSwitchApp", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class av implements PreviewHomeWatcherReceiver.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37179a;

        public final void a() {
            this.f37179a.u = false;
        }

        av(PreviewActivity previewActivity) {
            this.f37179a = previewActivity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "good", "Lcom/ss/android/ugc/aweme/commerce/service/models/BaseDetailPromotion;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class aw extends Lambda implements Function1<com.ss.android.ugc.aweme.commerce.service.models.c, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PreviewActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aw(PreviewActivity previewActivity) {
            super(1);
            this.this$0 = previewActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.ss.android.ugc.aweme.commerce.service.models.c) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.ss.android.ugc.aweme.commerce.service.models.c cVar) {
            com.ss.android.ugc.aweme.commerce.service.models.c cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{cVar2}, this, changeQuickRedirect, false, 28723, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar2}, this, changeQuickRedirect, false, 28723, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.c.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(cVar2, "good");
            n.a aVar = com.ss.android.ugc.aweme.commerce.service.models.n.r;
            Context context = this.this$0;
            CommerceUser b2 = PreviewActivity.b(this.this$0);
            String promotionId = cVar.getPromotionId();
            if (promotionId == null) {
                promotionId = "";
            }
            String str = promotionId;
            String productId = cVar.getProductId();
            if (productId == null) {
                productId = "";
            }
            com.ss.android.ugc.aweme.commercialize.g.a(n.a.a(aVar, context, b2, str, productId, cVar.getDetailUrl(), this.this$0.R, "click_commodity_store_product", null, null, "commodity_page_store_card", null, null, SystemClock.uptimeMillis(), cVar.getPromotionSource(), null, this.this$0.T, null, null, 216064));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/commerce/widget/PreviewBottom;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ax extends Lambda implements Function0<PreviewBottom> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PreviewActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ax(PreviewActivity previewActivity) {
            super(0);
            this.this$0 = previewActivity;
        }

        public final PreviewBottom invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28724, new Class[0], PreviewBottom.class)) {
                return (PreviewBottom) this.this$0.findViewById(C0906R.id.c5g);
            }
            return (PreviewBottom) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28724, new Class[0], PreviewBottom.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ay extends Lambda implements Function0<View> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PreviewActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ay(PreviewActivity previewActivity) {
            super(0);
            this.this$0 = previewActivity;
        }

        public final View invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28725, new Class[0], View.class)) {
                return ((ViewStub) PreviewActivity.a(this.this$0).findViewById(C0906R.id.dvy)).inflate();
            }
            return (View) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28725, new Class[0], View.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class az extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PreviewActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        az(PreviewActivity previewActivity) {
            super(0);
            this.this$0 = previewActivity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00d0  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00ed  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x010b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void invoke() {
            /*
                r11 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 28726(0x7036, float:4.0254E-41)
                r2 = r11
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0023
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
                r5 = 0
                r6 = 28726(0x7036, float:4.0254E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r11
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x0023:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r1 = r11.this$0
                com.ss.android.ugc.aweme.commerce.preview.f r1 = r1.f2894e
                if (r1 != 0) goto L_0x002e
                java.lang.String r2 = "mCollectionPresenter"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            L_0x002e:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r2 = r11.this$0
                java.lang.Boolean r2 = r2.M
                if (r2 == 0) goto L_0x0039
                boolean r2 = r2.booleanValue()
                goto L_0x003a
            L_0x0039:
                r2 = 0
            L_0x003a:
                r1.a(r2)
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r1 = r11.this$0
                com.ss.android.ugc.aweme.commerce.service.models.y r1 = r1.G
                r2 = 1
                if (r1 == 0) goto L_0x008a
                java.util.Map r1 = r1.getSkuList()
                if (r1 == 0) goto L_0x008a
                java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
                r3.<init>()
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L_0x0057:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L_0x0080
                java.lang.Object r4 = r1.next()
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r5 = r4.getValue()
                com.ss.android.ugc.aweme.commerce.service.models.z r5 = (com.ss.android.ugc.aweme.commerce.service.models.z) r5
                int r5 = r5.getStockNum()
                if (r5 <= 0) goto L_0x0071
                r5 = 1
                goto L_0x0072
            L_0x0071:
                r5 = 0
            L_0x0072:
                if (r5 == 0) goto L_0x0057
                java.lang.Object r5 = r4.getKey()
                java.lang.Object r4 = r4.getValue()
                r3.put(r5, r4)
                goto L_0x0057
            L_0x0080:
                java.util.Map r3 = (java.util.Map) r3
                boolean r1 = r3.isEmpty()
                if (r1 != r2) goto L_0x008a
                r1 = 1
                goto L_0x008b
            L_0x008a:
                r1 = 0
            L_0x008b:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r3 = r11.this$0
                com.ss.android.ugc.aweme.commerce.widget.PreviewBottom r3 = r3.w()
                boolean r3 = r3.getSaleOut()
                if (r1 == r3) goto L_0x00ad
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r3 = r11.this$0
                com.ss.android.ugc.aweme.commerce.widget.PreviewBottom r3 = r3.w()
                r3.setSaleOut(r1)
                r3.a()
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r3 = r11.this$0
                r3.c((boolean) r1)
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r1 = r11.this$0
                r1.q()
            L_0x00ad:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r1 = r11.this$0
                com.ss.android.ugc.aweme.commerce.preview.footprint.c r1 = r1.u()
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r3 = r11.this$0
                r10 = r3
                android.content.Context r10 = (android.content.Context) r10
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r3[r0] = r10
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.commerce.preview.footprint.c.f37474a
                r6 = 0
                r7 = 28930(0x7102, float:4.054E-41)
                java.lang.Class[] r8 = new java.lang.Class[r2]
                java.lang.Class<android.content.Context> r4 = android.content.Context.class
                r8[r0] = r4
                java.lang.Class r9 = java.lang.Boolean.TYPE
                r4 = r1
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                if (r3 == 0) goto L_0x00ed
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r3[r0] = r10
                com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.commerce.preview.footprint.c.f37474a
                r6 = 0
                r7 = 28930(0x7102, float:4.054E-41)
                java.lang.Class[] r8 = new java.lang.Class[r2]
                java.lang.Class<android.content.Context> r2 = android.content.Context.class
                r8[r0] = r2
                java.lang.Class r9 = java.lang.Boolean.TYPE
                r4 = r1
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                goto L_0x0109
            L_0x00ed:
                java.lang.String r3 = "context"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r3)
                java.lang.Boolean r3 = r1.f37475b
                if (r3 == 0) goto L_0x0109
                java.lang.Boolean r3 = r1.f37475b
                java.lang.Boolean r4 = java.lang.Boolean.TRUE
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
                if (r3 == 0) goto L_0x0109
                boolean r3 = com.ss.android.ugc.aweme.commercialize.g.a((android.content.Context) r10)
                if (r3 == 0) goto L_0x0109
                r1.f37476c = r2
                r0 = 1
            L_0x0109:
                if (r0 == 0) goto L_0x0162
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r11.this$0
                r1 = 2131166868(0x7f070694, float:1.7947994E38)
                android.view.View r0 = r0.findViewById(r1)
                android.view.ViewStub r0 = (android.view.ViewStub) r0
                r0.inflate()
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r11.this$0
                r1 = 2131166867(0x7f070693, float:1.7947991E38)
                android.view.View r0 = r0.e((int) r1)
                android.widget.ImageButton r0 = (android.widget.ImageButton) r0
                java.lang.String r2 = "footprint_imageView"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
                r2 = 0
                r0.setAlpha(r2)
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r11.this$0
                android.view.View r0 = r0.e((int) r1)
                android.widget.ImageButton r0 = (android.widget.ImageButton) r0
                android.view.ViewPropertyAnimator r0 = r0.animate()
                r2 = 1065353216(0x3f800000, float:1.0)
                android.view.ViewPropertyAnimator r0 = r0.alpha(r2)
                r2 = 200(0xc8, double:9.9E-322)
                android.view.ViewPropertyAnimator r0 = r0.setDuration(r2)
                r2 = 800(0x320, double:3.953E-321)
                android.view.ViewPropertyAnimator r0 = r0.setStartDelay(r2)
                r0.start()
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r11.this$0
                android.view.View r0 = r0.e((int) r1)
                android.widget.ImageButton r0 = (android.widget.ImageButton) r0
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$az$1 r1 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$az$1
                r1.<init>(r11)
                java.lang.Runnable r1 = (java.lang.Runnable) r1
                r2 = 8000(0x1f40, double:3.9525E-320)
                r0.postDelayed(r1, r2)
            L_0x0162:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.az.invoke():void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<RemoteImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PreviewActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PreviewActivity previewActivity) {
            super(0);
            this.this$0 = previewActivity;
        }

        public final RemoteImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28649, new Class[0], RemoteImageView.class)) {
                return (RemoteImageView) PreviewActivity.a(this.this$0).findViewById(C0906R.id.aq);
            }
            return (RemoteImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28649, new Class[0], RemoteImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0016J\u001e\u0010\u0007\u001a\u00020\u00032\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\tH\u0016¨\u0006\f¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/PreviewActivity$refreshRank$1$1", "Lcom/ss/android/ugc/aweme/base/FrescoHelper$Callback;", "onFailure", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "dataSource", "Lcom/facebook/datasource/DataSource;", "Lcom/facebook/common/references/CloseableReference;", "Lcom/facebook/imagepipeline/image/CloseableImage;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class ba implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37182a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PromotionMarketFloor f37183b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37184c;

        public final void a(@Nullable Exception exc) {
            if (PatchProxy.isSupport(new Object[]{exc}, this, f37182a, false, 28728, new Class[]{Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{exc}, this, f37182a, false, 28728, new Class[]{Exception.class}, Void.TYPE);
                return;
            }
            RemoteImageView remoteImageView = (RemoteImageView) PreviewActivity.a(this.f37184c).findViewById(C0906R.id.b34);
            Intrinsics.checkExpressionValueIsNotNull(remoteImageView, "headerView.iv_market_icon");
            remoteImageView.setVisibility(8);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0046  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(@org.jetbrains.annotations.Nullable com.facebook.datasource.DataSource<com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage>> r10) {
            /*
                r9 = this;
                r7 = 1
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r8 = 0
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f37182a
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<com.facebook.datasource.DataSource> r1 = com.facebook.datasource.DataSource.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 28729(0x7039, float:4.0258E-41)
                r1 = r9
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0030
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f37182a
                r3 = 0
                r4 = 28729(0x7039, float:4.0258E-41)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<com.facebook.datasource.DataSource> r1 = com.facebook.datasource.DataSource.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0030:
                if (r10 == 0) goto L_0x0041
                java.lang.Object r0 = r10.getResult()
                com.facebook.common.references.CloseableReference r0 = (com.facebook.common.references.CloseableReference) r0
                if (r0 == 0) goto L_0x0041
                java.lang.Object r0 = r0.get()
                com.facebook.imagepipeline.image.CloseableImage r0 = (com.facebook.imagepipeline.image.CloseableImage) r0
                goto L_0x0042
            L_0x0041:
                r0 = 0
            L_0x0042:
                boolean r1 = r0 instanceof com.facebook.imagepipeline.image.CloseableStaticBitmap
                if (r1 == 0) goto L_0x00a4
                com.facebook.imagepipeline.image.CloseableStaticBitmap r0 = (com.facebook.imagepipeline.image.CloseableStaticBitmap) r0
                android.graphics.Bitmap r0 = r0.getUnderlyingBitmap()
                if (r0 == 0) goto L_0x00a4
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r1 = r9.f37184c
                android.widget.FrameLayout r1 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.a((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r1)
                android.view.View r1 = (android.view.View) r1
                r2 = 2131167660(0x7f0709ac, float:1.79496E38)
                android.view.View r1 = r1.findViewById(r2)
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1
                java.lang.String r3 = "headerView.iv_market_icon"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                r1.setVisibility(r8)
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r1 = r9.f37184c
                android.widget.FrameLayout r1 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.a((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r1)
                android.view.View r1 = (android.view.View) r1
                android.view.View r1 = r1.findViewById(r2)
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1
                java.lang.String r3 = "headerView.iv_market_icon"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                int r3 = r1.height
                int r4 = r0.getWidth()
                int r3 = r3 * r4
                int r0 = r0.getHeight()
                int r3 = r3 / r0
                r1.width = r3
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r9.f37184c
                android.widget.FrameLayout r0 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.a((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r0)
                android.view.View r0 = (android.view.View) r0
                android.view.View r0 = r0.findViewById(r2)
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0
                com.ss.android.ugc.aweme.commerce.service.models.PromotionMarketFloor r1 = r9.f37183b
                com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getIcon()
                com.ss.android.ugc.aweme.base.c.b(r0, r1)
            L_0x00a4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.ba.a(com.facebook.datasource.DataSource):void");
        }

        ba(PromotionMarketFloor promotionMarketFloor, PreviewActivity previewActivity) {
            this.f37183b = promotionMarketFloor;
            this.f37184c = previewActivity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/commerce/preview/PreviewActivity$refreshRank$1$2"}, k = 3, mv = {1, 1, 15})
    static final class bb implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37185a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PromotionMarketFloor f37186b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37187c;

        bb(PromotionMarketFloor promotionMarketFloor, PreviewActivity previewActivity) {
            this.f37186b = promotionMarketFloor;
            this.f37187c = previewActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37185a, false, 28730, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37185a, false, 28730, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (!TextUtils.isEmpty(this.f37186b.getTma_url())) {
                if (!NetworkUtils.isNetworkAvailable(PreviewActivity.a(this.f37187c).getContext())) {
                    UIUtils.displayToast((Context) this.f37187c, (int) C0906R.string.bgf);
                } else if (!((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).openMiniApp(this.f37187c, this.f37186b.getTma_url(), new b.a().b("commodity_page").a())) {
                    com.ss.android.ugc.aweme.commerce.a.f36661b.a(this.f37186b.getTma_url(), (Activity) this.f37187c, (Map<String, String>) null);
                }
            } else if (!TextUtils.isEmpty(this.f37186b.getUrl())) {
                if (NetworkUtils.isNetworkAvailable(PreviewActivity.a(this.f37187c).getContext())) {
                    com.ss.android.ugc.aweme.commerce.a.f36661b.a(this.f37186b.getUrl(), (Activity) this.f37187c, MapBuilder.of("entrance_location", "fullscreen_card"));
                    return;
                }
                UIUtils.displayToast((Context) this.f37187c, (int) C0906R.string.bgf);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/PreviewActivity$refreshTags$1", "Lcom/ss/android/ugc/aweme/widget/flowlayout/TagAdapter;", "", "getView", "Landroid/view/View;", "parent", "Lcom/ss/android/ugc/aweme/widget/flowlayout/FlowLayout;", "position", "", "t", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class bc extends com.ss.android.ugc.aweme.widget.flowlayout.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37188a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37189b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f37190c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bc(PreviewActivity previewActivity, List list, List list2) {
            super(list2);
            this.f37189b = previewActivity;
            this.f37190c = list;
        }

        public final /* synthetic */ View a(FlowLayout flowLayout, int i, Object obj) {
            String str = (String) obj;
            if (PatchProxy.isSupport(new Object[]{flowLayout, Integer.valueOf(i), str}, this, f37188a, false, 28731, new Class[]{FlowLayout.class, Integer.TYPE, String.class}, View.class)) {
                return (View) PatchProxy.accessDispatch(new Object[]{flowLayout, Integer.valueOf(i), str}, this, f37188a, false, 28731, new Class[]{FlowLayout.class, Integer.TYPE, String.class}, View.class);
            }
            View inflate = LayoutInflater.from(this.f37189b).inflate(C0906R.layout.a2r, (TagFlowLayout) PreviewActivity.a(this.f37189b).findViewById(C0906R.id.czo), false);
            if (inflate != null) {
                DmtTextView dmtTextView = (DmtTextView) inflate;
                dmtTextView.setText(str);
                dmtTextView.setIncludeFontPadding(false);
                return dmtTextView;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtTextView");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class bd extends Lambda implements Function1<List<? extends Aweme>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PreviewActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bd(PreviewActivity previewActivity) {
            super(1);
            this.this$0 = previewActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<? extends Aweme> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 28732, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 28732, new Class[]{List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(list, AdvanceSetting.NETWORK_TYPE);
            if (this.this$0.f2892c.isEmpty()) {
                this.this$0.f2892c.addAll(list);
                PreviewActivity previewActivity = this.this$0;
                com.ss.android.ugc.aweme.commerce.billshare.b bVar = this.this$0.C;
                if (bVar == null) {
                    Intrinsics.throwNpe();
                }
                previewActivity.B = bVar.f36749b;
                if (!this.this$0.S) {
                    this.this$0.b();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/commerce/preview/PreviewActivity$renderDisplayNode$3$1"}, k = 3, mv = {1, 1, 15})
    static final class be implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37191a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37192b;

        be(PreviewActivity previewActivity) {
            this.f37192b = previewActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37191a, false, 28733, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37191a, false, 28733, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (!com.ss.android.ugc.aweme.c.a.a.a(view, 500)) {
                IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
                if (a2.isLogin()) {
                    this.f37192b.z();
                    return;
                }
                com.ss.android.ugc.aweme.login.e.a((Activity) this.f37192b, "commodity_page", "click_coupon", (com.ss.android.ugc.aweme.base.component.f) new com.ss.android.ugc.aweme.base.component.f(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f37193a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ be f37194b;

                    {
                        this.f37194b = r1;
                    }

                    public final void a(Bundle bundle) {
                        if (PatchProxy.isSupport(new Object[]{null}, this, f37193a, false, 28735, new Class[]{Bundle.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{null}, this, f37193a, false, 28735, new Class[]{Bundle.class}, Void.TYPE);
                        }
                    }

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f37193a, false, 28734, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f37193a, false, 28734, new Class[0], Void.TYPE);
                            return;
                        }
                        this.f37194b.f37192b.z();
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/commerce/preview/PreviewActivity$renderDisplayNode$5$1"}, k = 3, mv = {1, 1, 15})
    static final class bf implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37195a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37196b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f37197c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f37198d;

        bf(PreviewActivity previewActivity, String str, List list) {
            this.f37196b = previewActivity;
            this.f37197c = str;
            this.f37198d = list;
        }

        public final void onClick(View view) {
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{view}, this, f37195a, false, 28736, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37195a, false, 28736, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            FullReductionDialog fullReductionDialog = new FullReductionDialog(this.f37196b, this.f37197c);
            List list = this.f37198d;
            if (PatchProxy.isSupport(new Object[]{list}, fullReductionDialog, FullReductionDialog.f37372d, false, 28898, new Class[]{List.class}, Void.TYPE)) {
                Object[] objArr = {list};
                FullReductionDialog fullReductionDialog2 = fullReductionDialog;
                ChangeQuickRedirect changeQuickRedirect = FullReductionDialog.f37372d;
                PatchProxy.accessDispatch(objArr, fullReductionDialog2, changeQuickRedirect, false, 28898, new Class[]{List.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(list, "info");
                StringBuilder sb = new StringBuilder();
                int size = list.size();
                for (Object next : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    String str = (String) next;
                    if (size - 1 == i) {
                        sb.append(str);
                    } else {
                        sb.append(str);
                        sb.append("；");
                    }
                    i = i2;
                }
                DmtTextView dmtTextView = (DmtTextView) fullReductionDialog.findViewById(C0906R.id.ddb);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "tv_info");
                dmtTextView.setText(sb.toString());
            }
            fullReductionDialog.show();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    static final class bg<T> implements com.ss.android.ugc.aweme.base.b.a.b<Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37199a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37200b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f37201c;

        bg(PreviewActivity previewActivity, Ref.ObjectRef objectRef) {
            this.f37200b = previewActivity;
            this.f37201c = objectRef;
        }

        public final /* synthetic */ void accept(Object obj) {
            final Bitmap bitmap = (Bitmap) obj;
            if (PatchProxy.isSupport(new Object[]{bitmap}, this, f37199a, false, 28737, new Class[]{Bitmap.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bitmap}, this, f37199a, false, 28737, new Class[]{Bitmap.class}, Void.TYPE);
                return;
            }
            this.f37200b.runOnUiThread(new Runnable(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f37202a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ bg f37203b;

                {
                    this.f37203b = r1;
                }

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f37202a, false, 28738, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f37202a, false, 28738, new Class[0], Void.TYPE);
                        return;
                    }
                    if (bitmap != null) {
                        int dip2Px = (int) UIUtils.dip2Px(this.f37203b.f37200b.getApplicationContext(), 14.0f);
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (((((float) dip2Px) * 1.0f) / ((float) bitmap.getHeight())) * ((float) bitmap.getWidth())), dip2Px, false);
                        SpannableString spannableString = new SpannableString(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                        Intrinsics.checkExpressionValueIsNotNull(createScaledBitmap, "resizeBitmap");
                        com.ss.android.ugc.aweme.commercialize.ad.a aVar = new com.ss.android.ugc.aweme.commercialize.ad.a(this.f37203b.f37200b, createScaledBitmap, -1);
                        aVar.f38470b = (int) UIUtils.dip2Px(this.f37203b.f37200b.getApplicationContext(), 3.0f);
                        e.a(spannableString, aVar, 0, 1, 17);
                        ((SpannableStringBuilder) this.f37203b.f37201c.element).append(spannableString);
                    }
                    SpannableString spannableString2 = new SpannableString(PreviewActivity.c(this.f37203b.f37200b).longTitle());
                    e.a(spannableString2, new ForegroundColorSpan(com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(this.f37203b.f37200b, C0906R.color.gq)), 0, spannableString2.length(), 17);
                    ((SpannableStringBuilder) this.f37203b.f37201c.element).append(spannableString2);
                    DmtTextView dmtTextView = (DmtTextView) PreviewActivity.a(this.f37203b.f37200b).findViewById(C0906R.id.d3i);
                    Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "headerView.titleView");
                    dmtTextView.setText((SpannableStringBuilder) this.f37203b.f37201c.element);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class bh implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37205a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37206b;

        bh(PreviewActivity previewActivity) {
            this.f37206b = previewActivity;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f37205a, false, 28740, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37205a, false, 28740, new Class[0], Void.TYPE);
                return;
            }
            LinearLayout linearLayout = (LinearLayout) PreviewActivity.a(this.f37206b).findViewById(C0906R.id.c5t);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "headerView.priceLayout");
            linearLayout.setVisibility(0);
            RelativeLayout relativeLayout = (RelativeLayout) PreviewActivity.a(this.f37206b).findViewById(C0906R.id.cg4);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "headerView.rl_pre_sale_top");
            relativeLayout.setVisibility(8);
            LinearLayout linearLayout2 = (LinearLayout) PreviewActivity.a(this.f37206b).findViewById(C0906R.id.a3l);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "headerView.delivery_container");
            linearLayout2.setVisibility(8);
            this.f37206b.a(PreviewActivity.c(this.f37206b).getPromotionId(), PreviewActivity.c(this.f37206b).getProductId(), (Function1<? super com.ss.android.ugc.aweme.commerce.service.models.p, Unit>) new Function1<com.ss.android.ugc.aweme.commerce.service.models.p, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ bh this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((com.ss.android.ugc.aweme.commerce.service.models.p) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull com.ss.android.ugc.aweme.commerce.service.models.p pVar) {
                    if (PatchProxy.isSupport(new Object[]{pVar}, this, changeQuickRedirect, false, 28741, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.p.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{pVar}, this, changeQuickRedirect, false, 28741, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.p.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(pVar, "promotionDynamicInfo");
                    com.ss.android.ugc.aweme.commerce.service.models.r toutiao = PreviewActivity.c(this.this$0.f37206b).getToutiao();
                    if (toutiao != null) {
                        toutiao.setPreSale(null);
                    }
                    this.this$0.f37206b.b(false);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class bi implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37207a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37208b;

        bi(PreviewActivity previewActivity) {
            this.f37208b = previewActivity;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f37207a, false, 28742, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37207a, false, 28742, new Class[0], Void.TYPE);
                return;
            }
            LinearLayout linearLayout = (LinearLayout) PreviewActivity.a(this.f37208b).findViewById(C0906R.id.c5t);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "headerView.priceLayout");
            linearLayout.setVisibility(0);
            RelativeLayout relativeLayout = (RelativeLayout) PreviewActivity.a(this.f37208b).findViewById(C0906R.id.cfb);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "headerView.rl_appoint_top");
            relativeLayout.setVisibility(8);
            this.f37208b.a(PreviewActivity.c(this.f37208b).getPromotionId(), PreviewActivity.c(this.f37208b).getProductId(), (Function1<? super com.ss.android.ugc.aweme.commerce.service.models.p, Unit>) new Function1<com.ss.android.ugc.aweme.commerce.service.models.p, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ bi this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((com.ss.android.ugc.aweme.commerce.service.models.p) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull com.ss.android.ugc.aweme.commerce.service.models.p pVar) {
                    if (PatchProxy.isSupport(new Object[]{pVar}, this, changeQuickRedirect, false, 28743, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.p.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{pVar}, this, changeQuickRedirect, false, 28743, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.p.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(pVar, "promotionDynamicInfo");
                    com.ss.android.ugc.aweme.commerce.service.models.r toutiao = PreviewActivity.c(this.this$0.f37208b).getToutiao();
                    if (toutiao != null) {
                        toutiao.setAppointment(null);
                    }
                    this.this$0.f37208b.b(false);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class bj implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37211a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37212b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f37213c;

        bj(PreviewActivity previewActivity, int i) {
            this.f37212b = previewActivity;
            this.f37213c = i;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f37211a, false, 28744, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37211a, false, 28744, new Class[0], Void.TYPE);
                return;
            }
            int i = this.f37213c;
            if (i == 0) {
                ((RecyclerView) this.f37212b.e((int) C0906R.id.cc5)).smoothScrollBy(0, -this.f37212b.O);
            } else if (i == PreviewTitle.a.b()) {
                ((RecyclerView) this.f37212b.e((int) C0906R.id.cc5)).smoothScrollBy(0, this.f37212b.k - this.f37212b.O);
            } else if (i == PreviewTitle.a.c()) {
                ((RecyclerView) this.f37212b.e((int) C0906R.id.cc5)).smoothScrollBy(0, this.f37212b.j - this.f37212b.O);
            } else if (i == PreviewTitle.a.a()) {
                ((RecyclerView) this.f37212b.e((int) C0906R.id.cc5)).smoothScrollBy(0, this.f37212b.l - this.f37212b.O);
            } else {
                if (i == PreviewTitle.a.d()) {
                    ((RecyclerView) this.f37212b.e((int) C0906R.id.cc5)).smoothScrollBy(0, this.f37212b.m - this.f37212b.O);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/ugc/aweme/commerce/preview/PreviewActivity$smoothScroller$2$1", "invoke", "()Lcom/ss/android/ugc/aweme/commerce/preview/PreviewActivity$smoothScroller$2$1;"}, k = 3, mv = {1, 1, 15})
    static final class bk extends Lambda implements Function0<PreviewActivity$smoothScroller$2$1> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PreviewActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bk(PreviewActivity previewActivity) {
            super(0);
            this.this$0 = previewActivity;
        }

        @NotNull
        public final PreviewActivity$smoothScroller$2$1 invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28745, new Class[0], PreviewActivity$smoothScroller$2$1.class)) {
                return new PreviewActivity$smoothScroller$2$1(this, this.this$0);
            }
            return (PreviewActivity$smoothScroller$2$1) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28745, new Class[0], PreviewActivity$smoothScroller$2$1.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    static final class bl<T> implements com.ss.android.ugc.aweme.base.b.a.b<Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37214a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37215b;

        bl(PreviewActivity previewActivity) {
            this.f37215b = previewActivity;
        }

        public final /* synthetic */ void accept(Object obj) {
            final Bitmap bitmap = (Bitmap) obj;
            if (PatchProxy.isSupport(new Object[]{bitmap}, this, f37214a, false, 28747, new Class[]{Bitmap.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bitmap}, this, f37214a, false, 28747, new Class[]{Bitmap.class}, Void.TYPE);
                return;
            }
            this.f37215b.runOnUiThread(new Runnable(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f37216a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ bl f37217b;

                {
                    this.f37217b = r1;
                }

                public final void run() {
                    boolean z;
                    if (PatchProxy.isSupport(new Object[0], this, f37216a, false, 28748, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f37216a, false, 28748, new Class[0], Void.TYPE);
                        return;
                    }
                    if (bitmap != null) {
                        PreviewActivity previewActivity = this.f37217b.f37215b;
                        Bitmap bitmap = bitmap;
                        if (PatchProxy.isSupport(new Object[]{bitmap}, previewActivity, PreviewActivity.f2890a, false, 28593, new Class[]{Bitmap.class}, Void.TYPE)) {
                            PreviewActivity previewActivity2 = previewActivity;
                            PatchProxy.accessDispatch(new Object[]{bitmap}, previewActivity2, PreviewActivity.f2890a, false, 28593, new Class[]{Bitmap.class}, Void.TYPE);
                            return;
                        }
                        Point cartCenterPoint = previewActivity.w().getCartCenterPoint();
                        if (cartCenterPoint != null) {
                            View[] cartView = ((PreviewTitle) previewActivity.e((int) C0906R.id.c5h)).getCartView();
                            if (cartView.length == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                Rect rect = new Rect();
                                int[] iArr = new int[2];
                                View view = cartView[0];
                                view.getLocationOnScreen(iArr);
                                rect.left = iArr[0];
                                rect.top = iArr[1];
                                rect.right = rect.left + view.getMeasuredWidth();
                                rect.bottom = rect.top + view.getMeasuredHeight();
                                Point point = new Point(rect.centerX(), rect.centerY());
                                SnapshotAnimView snapshotAnimView = new SnapshotAnimView(previewActivity);
                                snapshotAnimView.setImageBitmap(bitmap);
                                com.ss.android.ugc.aweme.commerce.service.l.d.a((Activity) previewActivity, (View) snapshotAnimView, cartCenterPoint, point, cartView);
                            }
                        }
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/preview/pops/sku/CartCountResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class bm<TTaskResult, TContinuationResult> implements a.g<com.ss.android.ugc.aweme.commerce.preview.pops.a.c, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37219a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37220b;

        bm(PreviewActivity previewActivity) {
            this.f37220b = previewActivity;
        }

        public final /* synthetic */ Object then(a.i iVar) {
            a.i iVar2 = iVar;
            if (PatchProxy.isSupport(new Object[]{iVar2}, this, f37219a, false, 28751, new Class[]{a.i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar2}, this, f37219a, false, 28751, new Class[]{a.i.class}, Void.class);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar2, "task");
            if (!iVar.d() && iVar.e() != null && ((com.ss.android.ugc.aweme.commerce.preview.pops.a.c) iVar.e()).statusCode == 0) {
                this.f37220b.b(((com.ss.android.ugc.aweme.commerce.preview.pops.a.c) iVar.e()).f37569a);
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<DmtTextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PreviewActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(PreviewActivity previewActivity) {
            super(0);
            this.this$0 = previewActivity;
        }

        public final DmtTextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28650, new Class[0], DmtTextView.class)) {
                return (DmtTextView) PreviewActivity.a(this.this$0).findViewById(C0906R.id.aw);
            }
            return (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28650, new Class[0], DmtTextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PreviewActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(PreviewActivity previewActivity) {
            super(0);
            this.this$0 = previewActivity;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28651, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28651, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.a(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "video", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "view", "Landroid/view/View;", "<anonymous parameter 2>", "", "clickImage", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function4<Aweme, View, String, Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PreviewActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(PreviewActivity previewActivity) {
            super(4);
            this.this$0 = previewActivity;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((Aweme) obj, (View) obj2, (String) obj3, ((Boolean) obj4).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Aweme aweme, @NotNull View view, @NotNull String str, boolean z) {
            String str2;
            Aweme aweme2 = aweme;
            View view2 = view;
            String str3 = str;
            if (PatchProxy.isSupport(new Object[]{aweme2, view2, str3, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 28652, new Class[]{Aweme.class, View.class, String.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme2, view2, str3, Byte.valueOf(z)}, this, changeQuickRedirect, false, 28652, new Class[]{Aweme.class, View.class, String.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(aweme2, "video");
            Intrinsics.checkParameterIsNotNull(view2, "view");
            Intrinsics.checkParameterIsNotNull(str3, "<anonymous parameter 2>");
            String promotionId = PreviewActivity.c(this.this$0).getPromotionId();
            String productId = PreviewActivity.c(this.this$0).getProductId();
            com.ss.android.ugc.aweme.feed.a a2 = com.ss.android.ugc.aweme.feed.a.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AwemeManager.inst()");
            com.ss.android.ugc.aweme.common.f.b<i> bVar = this.this$0.f2893d;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            }
            a2.f44610c = (com.ss.android.ugc.aweme.common.f.a) bVar.i();
            com.ss.android.ugc.aweme.ag.h.a().a((Activity) this.this$0, com.ss.android.ugc.aweme.ag.j.a("aweme://aweme/detail/" + aweme.getAid()).a("page_type", "commodity_page").a("promotion_id", promotionId).a("product_id", productId).a("refer", "commodity_page").a("video_from", "from_commerce_seed").a(), view2);
            com.ss.android.ugc.aweme.commerce.service.logs.ae a3 = new com.ss.android.ugc.aweme.commerce.service.logs.ae().a("commodity_page");
            if (z) {
                str2 = "group";
            } else {
                str2 = "text";
            }
            a3.c(str2).b(aweme.getAid()).b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "video", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function1<Aweme, Unit> {
        public static final f INSTANCE = new f();
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Aweme) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Aweme aweme) {
            Aweme aweme2 = aweme;
            if (PatchProxy.isSupport(new Object[]{aweme2}, this, changeQuickRedirect, false, 28653, new Class[]{Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme2}, this, changeQuickRedirect, false, 28653, new Class[]{Aweme.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(aweme2, "video");
            new com.ss.android.ugc.aweme.commerce.service.logs.e().a("commodity_page").b(aweme.getAid()).c(aweme.getRecallType()).b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function1<View, Boolean> {
        public static final g INSTANCE = new g();
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((View) obj));
        }

        public final boolean invoke(@NotNull View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, changeQuickRedirect, false, 28654, new Class[]{View.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2}, this, changeQuickRedirect, false, 28654, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(view2, "view");
            return view2 instanceof FrameLayout;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/PreviewActivity$bindFloatVideo$1$2", "Lcom/ss/android/ugc/aweme/commerce/floatvideo/FloatVideoBrowsePresenter$PlayVideoListener;", "onFirstResume", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class h implements FloatVideoBrowsePresenter.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37221a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37222b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f37223c;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f37221a, false, 28655, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37221a, false, 28655, new Class[0], Void.TYPE);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", SystemClock.uptimeMillis() - this.f37222b.s);
            com.ss.android.ugc.aweme.base.n.a("aweme_commerce_seeding_aweme_display_time", jSONObject, (JSONObject) null);
        }

        h(PreviewActivity previewActivity, Aweme aweme) {
            this.f37222b = previewActivity;
            this.f37223c = aweme;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37224a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37225b;

        i(PreviewActivity previewActivity) {
            this.f37225b = previewActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37224a, false, 28656, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37224a, false, 28656, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f37225b.k();
            new com.ss.android.ugc.aweme.commerce.service.logs.ag().b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37226a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37227b;

        j(PreviewActivity previewActivity) {
            this.f37227b = previewActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37226a, false, 28657, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37226a, false, 28657, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f37227b.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37228a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function1 f37229b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commerce.service.models.c f37230c;

        k(Function1 function1, com.ss.android.ugc.aweme.commerce.service.models.c cVar) {
            this.f37229b = function1;
            this.f37230c = cVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37228a, false, 28658, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37228a, false, 28658, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f37229b.invoke(this.f37230c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/PreviewActivity$bindVideoComment$1", "Lcom/ss/android/ugc/aweme/commerce/preview/OnClickListener;", "onClickItem", "", "view", "Landroid/view/View;", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "onClickMore", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class l implements c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37231a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37232b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f37231a, false, 28659, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37231a, false, 28659, new Class[0], Void.TYPE);
                return;
            }
            this.f37232b.i();
        }

        l(PreviewActivity previewActivity) {
            this.f37232b = previewActivity;
        }

        public final void a(@NotNull View view, @Nullable Aweme aweme) {
            if (PatchProxy.isSupport(new Object[]{view, aweme}, this, f37231a, false, 28660, new Class[]{View.class, Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, aweme}, this, f37231a, false, 28660, new Class[]{View.class, Aweme.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view, "view");
            if (aweme != null) {
                String promotionId = PreviewActivity.c(this.f37232b).getPromotionId();
                com.ss.android.ugc.aweme.feed.a a2 = com.ss.android.ugc.aweme.feed.a.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AwemeManager.inst()");
                a2.f44610c = this.f37232b.C;
                com.ss.android.ugc.aweme.ag.h.a().a((Activity) this.f37232b, com.ss.android.ugc.aweme.ag.j.a("aweme://aweme/detail/" + aweme.getAid()).a("page_type", "commodity_page").a("promotion_id", promotionId).a("refer", "unboxing_page").a("video_from", "from_commerce_bill_share").a(), view);
                this.f37232b.o = false;
                new com.ss.android.ugc.aweme.commerce.service.logs.ae().a("unboxing_page").c("group").b(aweme.getAid()).b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class m implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37233a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37234b;

        m(PreviewActivity previewActivity) {
            this.f37234b = previewActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37233a, false, 28661, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37233a, false, 28661, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f37234b.i();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37235a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37236b;

        n(PreviewActivity previewActivity) {
            this.f37236b = previewActivity;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f37235a, false, 28662, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37235a, false, 28662, new Class[0], Void.TYPE);
                return;
            }
            PreviewActivity previewActivity = this.f37236b;
            SquareSlidesLayout squareSlidesLayout = (SquareSlidesLayout) PreviewActivity.a(this.f37236b).findViewById(C0906R.id.ctr);
            Intrinsics.checkExpressionValueIsNotNull(squareSlidesLayout, "headerView.squareSlidesLayout");
            int height = squareSlidesLayout.getHeight();
            PreviewTitle previewTitle = (PreviewTitle) this.f37236b.e((int) C0906R.id.c5h);
            Intrinsics.checkExpressionValueIsNotNull(previewTitle, "previewTitle");
            previewActivity.n = (float) (height - previewTitle.getHeight());
            this.f37236b.P = UIUtils.getScreenHeight(this.f37236b) * 2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class o implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37237a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37238b;

        o(PreviewActivity previewActivity) {
            this.f37238b = previewActivity;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            if (PatchProxy.isSupport(new Object[]{view}, this, f37237a, false, 28665, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37237a, false, 28665, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.commerce.service.models.o activity = PreviewActivity.c(this.f37238b).getActivity();
            String str4 = null;
            if (activity != null) {
                str = activity.getTitle();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                str2 = null;
            } else {
                str2 = str;
            }
            com.ss.android.ugc.aweme.commerce.service.models.o activity2 = PreviewActivity.c(this.f37238b).getActivity();
            if (activity2 != null) {
                str3 = activity2.getUrl();
            } else {
                str3 = null;
            }
            PreviewActivity previewActivity = this.f37238b;
            if (previewActivity != null) {
                com.ss.android.ugc.aweme.commerce.a.a(str3, (Activity) previewActivity, str2, false, false, 8);
                com.ss.android.ugc.aweme.commerce.service.logs.j jVar = new com.ss.android.ugc.aweme.commerce.service.logs.j();
                jVar.f38136f = PreviewActivity.c(this.f37238b).getPromotionId();
                jVar.g = Long.valueOf(PreviewActivity.c(this.f37238b).getCommodityType());
                jVar.h = PreviewActivity.b(this.f37238b).getUid();
                com.ss.android.ugc.aweme.commerce.service.models.o activity3 = PreviewActivity.c(this.f37238b).getActivity();
                if (activity3 != null) {
                    str4 = activity3.getUrl();
                }
                jVar.i = str4;
                jVar.b();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/ss/android/ugc/aweme/commerce/widget/ObservableHorizontalScrollView;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "<anonymous parameter 3>", "<anonymous parameter 4>", "onScrollChanged"}, k = 3, mv = {1, 1, 15})
    static final class p implements ObservableHorizontalScrollView.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37239a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37240b;

        p(PreviewActivity previewActivity) {
            this.f37240b = previewActivity;
        }

        public final void a(ObservableHorizontalScrollView observableHorizontalScrollView, int i, int i2, int i3, int i4) {
            if (PatchProxy.isSupport(new Object[]{observableHorizontalScrollView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f37239a, false, 28666, new Class[]{ObservableHorizontalScrollView.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{observableHorizontalScrollView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f37239a, false, 28666, new Class[]{ObservableHorizontalScrollView.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f37240b.o();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/PreviewActivity$bindViews$5", "Lcom/ss/android/ugc/aweme/commerce/widget/RoundSelectorBtn$StateChangeListener;", "onStateChange", "", "isDown", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class q implements RoundSelectorBtn.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37241a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37242b;

        q(PreviewActivity previewActivity) {
            this.f37242b = previewActivity;
        }

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f37241a, false, 28667, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f37241a, false, 28667, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            this.f37242b.Q = false;
            if (z) {
                new com.ss.android.ugc.aweme.commerce.service.logs.ah().b();
                this.f37242b.c(PreviewTitle.a.c());
                return;
            }
            new com.ss.android.ugc.aweme.commerce.service.logs.a().b();
            this.f37242b.c(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/PreviewActivity$bindViews$6", "Lcom/ss/android/ugc/aweme/commerce/widget/PreviewTitle$OnItemClickListener;", "onBackClick", "", "onCartClick", "onShareClick", "onTabClick", "state", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class r implements PreviewTitle.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37243a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37244b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f37243a, false, 28668, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37243a, false, 28668, new Class[0], Void.TYPE);
                return;
            }
            this.f37244b.u = false;
            h.f37502d.a((Activity) this.f37244b);
            com.ss.android.ugc.aweme.commercialize.log.g.b((Context) this.f37244b, com.ss.android.ugc.aweme.commerce.a.a.a(this.f37244b.T), PreviewActivity.c(this.f37244b), SystemClock.uptimeMillis() - this.f37244b.r);
            this.f37244b.finish();
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f37243a, false, 28669, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37243a, false, 28669, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.commerce.service.models.r toutiao = PreviewActivity.c(this.f37244b).getToutiao();
            if (!(toutiao == null || toutiao.getCartUrl() == null)) {
                PreviewActivity previewActivity = this.f37244b;
                if (PatchProxy.isSupport(new Object[0], previewActivity, PreviewActivity.f2890a, false, 28595, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], previewActivity, PreviewActivity.f2890a, false, 28595, new Class[0], Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.commerce.service.models.h hVar = previewActivity.D;
                    if (hVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
                    }
                    com.ss.android.ugc.aweme.commerce.service.models.r toutiao2 = hVar.getToutiao();
                    if (toutiao2 != null) {
                        String cartUrl = toutiao2.getCartUrl();
                        if (cartUrl != null) {
                            com.ss.android.ugc.aweme.commercialize.utils.g.a((Context) previewActivity, cartUrl, "", false, (Map<String, String>) null, true, previewActivity.m());
                            com.ss.android.ugc.aweme.commerce.service.logs.h hVar2 = new com.ss.android.ugc.aweme.commerce.service.logs.h();
                            CommerceUser commerceUser = previewActivity.E;
                            if (commerceUser == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mUserInfo");
                            }
                            com.ss.android.ugc.aweme.commerce.service.logs.h a2 = hVar2.c(commerceUser.getUid()).a(previewActivity.F);
                            com.ss.android.ugc.aweme.commerce.service.models.h hVar3 = previewActivity.D;
                            if (hVar3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
                            }
                            com.ss.android.ugc.aweme.commerce.service.logs.h b2 = a2.b(hVar3.getPromotionId());
                            com.ss.android.ugc.aweme.commerce.service.models.h hVar4 = previewActivity.D;
                            if (hVar4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
                            }
                            b2.a(hVar4.getCommodityType()).b();
                        }
                    }
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: com.ss.android.ugc.aweme.base.model.UrlModel} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c() {
            /*
                r28 = this;
                r7 = r28
                r8 = 0
                java.lang.Object[] r0 = new java.lang.Object[r8]
                com.meituan.robust.ChangeQuickRedirect r2 = f37243a
                java.lang.Class[] r5 = new java.lang.Class[r8]
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 28670(0x6ffe, float:4.0175E-41)
                r1 = r28
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0027
                java.lang.Object[] r0 = new java.lang.Object[r8]
                com.meituan.robust.ChangeQuickRedirect r2 = f37243a
                r3 = 0
                r4 = 28670(0x6ffe, float:4.0175E-41)
                java.lang.Class[] r5 = new java.lang.Class[r8]
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r28
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0027:
                com.ss.android.ugc.aweme.commerce.service.logs.an r0 = new com.ss.android.ugc.aweme.commerce.service.logs.an
                r0.<init>()
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r1 = r7.f37244b
                java.lang.String r1 = r1.F
                r0.f38080f = r1
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r1 = r7.f37244b
                com.ss.android.ugc.aweme.commerce.service.models.h r1 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.c((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r1)
                java.lang.String r1 = r1.getPromotionId()
                r0.g = r1
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r1 = r7.f37244b
                com.ss.android.ugc.aweme.commerce.service.models.CommerceUser r1 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.b((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r1)
                java.lang.String r1 = r1.getUid()
                r0.h = r1
                java.lang.String r1 = "full_screen_card"
                r0.i = r1
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r1 = r7.f37244b
                com.ss.android.ugc.aweme.commerce.service.models.h r1 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.c((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r1)
                long r1 = r1.getCommodityType()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r0.j = r1
                r0.b()
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37244b
                android.app.Activity r0 = (android.app.Activity) r0
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r1 = r7.f37244b
                com.ss.android.ugc.aweme.commerce.service.models.h r9 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.c((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r1)
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r1 = r7.f37244b
                java.lang.String r5 = r1.F
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r1 = r7.f37244b
                com.ss.android.ugc.aweme.commerce.service.models.CommerceUser r1 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.b((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r1)
                java.lang.String r10 = r1.getUid()
                java.lang.String r1 = "unboxing_page"
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r2 = r7.f37244b
                java.lang.String r2 = r2.N
                r3 = 6
                java.lang.Object[] r11 = new java.lang.Object[r3]
                r11[r8] = r0
                r4 = 1
                r11[r4] = r9
                r6 = 2
                r11[r6] = r5
                r18 = 3
                r11[r18] = r10
                r19 = 4
                r11[r19] = r1
                r20 = 5
                r11[r20] = r2
                r12 = 0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commerce.preview.b.f37347a
                r14 = 1
                java.lang.Class[] r15 = new java.lang.Class[r3]
                java.lang.Class<android.app.Activity> r16 = android.app.Activity.class
                r15[r8] = r16
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.h> r16 = com.ss.android.ugc.aweme.commerce.service.models.h.class
                r15[r4] = r16
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r15[r6] = r16
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r15[r18] = r16
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r15[r19] = r16
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r15[r20] = r16
                java.lang.Class r17 = java.lang.Void.TYPE
                r16 = r15
                r15 = 28528(0x6f70, float:3.9976E-41)
                boolean r11 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r11 == 0) goto L_0x00fb
                java.lang.Object[] r11 = new java.lang.Object[r3]
                r11[r8] = r0
                r11[r4] = r9
                r11[r6] = r5
                r11[r18] = r10
                r11[r19] = r1
                r11[r20] = r2
                r22 = 0
                com.meituan.robust.ChangeQuickRedirect r23 = com.ss.android.ugc.aweme.commerce.preview.b.f37347a
                r24 = 1
                r25 = 28528(0x6f70, float:3.9976E-41)
                java.lang.Class[] r0 = new java.lang.Class[r3]
                java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
                r0[r8] = r1
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.h> r1 = com.ss.android.ugc.aweme.commerce.service.models.h.class
                r0[r4] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r6] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r18] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r19] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r20] = r1
                java.lang.Class r27 = java.lang.Void.TYPE
                r21 = r11
                r26 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r21, r22, r23, r24, r25, r26, r27)
                goto L_0x0238
            L_0x00fb:
                java.lang.String r3 = "context"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r3)
                if (r9 == 0) goto L_0x022c
                java.lang.String r3 = r9.getDetailUrl()
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 == 0) goto L_0x0110
                goto L_0x022c
            L_0x0110:
                java.lang.String r11 = r9.getDetailUrl()
                com.ss.android.ugc.aweme.share.ck r3 = new com.ss.android.ugc.aweme.share.ck
                r3.<init>()
                com.ss.android.ugc.aweme.share.ck$a r6 = new com.ss.android.ugc.aweme.share.ck$a
                r6.<init>()
                r3.h = r8
                r3.o = r4
                r3.j = r8
                r3.k = r8
                r3.l = r4
                r3.f64974c = r8
                r3.s = r8
                r3.i = r4
                if (r5 != 0) goto L_0x0133
                java.lang.String r12 = ""
                goto L_0x0134
            L_0x0133:
                r12 = r5
            L_0x0134:
                r6.f64978a = r12
                java.lang.String r12 = r9.getPromotionId()
                r6.f64979b = r12
                long r12 = r9.getPromotionSource()
                r6.g = r12
                if (r10 != 0) goto L_0x0147
                java.lang.String r12 = ""
                goto L_0x0148
            L_0x0147:
                r12 = r10
            L_0x0148:
                r6.f64980c = r12
                r6.f64981d = r4
                r6.f64982e = r1
                if (r2 != 0) goto L_0x0152
                java.lang.String r2 = ""
            L_0x0152:
                r6.f64983f = r2
                r3.v = r6
                com.ss.android.ugc.aweme.share.SimpleShareDialog r12 = new com.ss.android.ugc.aweme.share.SimpleShareDialog
                r12.<init>(r0, r3)
                com.ss.android.ugc.aweme.commerce.preview.b$b r13 = new com.ss.android.ugc.aweme.commerce.preview.b$b
                r1 = r13
                r2 = r10
                r3 = r9
                r4 = r0
                r6 = r11
                r1.<init>(r2, r3, r4, r5, r6)
                com.ss.android.ugc.aweme.framework.services.IShareService$IActionHandler r13 = (com.ss.android.ugc.aweme.framework.services.IShareService.IActionHandler) r13
                r12.setActionHandler(r13)
                com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r1 = new com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct
                r1.<init>()
                android.content.Context r0 = r0.getApplicationContext()
                r2 = 2131558447(0x7f0d002f, float:1.874221E38)
                java.lang.String r0 = r0.getString(r2)
                r1.appName = r0
                r1.url = r11
                java.lang.String r0 = "good"
                r1.itemType = r0
                java.lang.String r0 = r9.longTitle()
                r1.title = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.extraParams = r0
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r1.extraParams
                java.lang.String r2 = "user_id"
                r0.put(r2, r10)
                com.ss.android.ugc.aweme.utils.dr r0 = com.ss.android.ugc.aweme.utils.dr.a()
                java.lang.String r0 = r0.a(r10)
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x01b5
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r1.extraParams
                java.lang.String r2 = "sec_user_id"
                com.ss.android.ugc.aweme.utils.dr r3 = com.ss.android.ugc.aweme.utils.dr.a()
                java.lang.String r3 = r3.a(r10)
                r0.put(r2, r3)
            L_0x01b5:
                com.ss.android.ugc.aweme.commerce.service.models.PromotionVisitor r0 = r9.getVisitor()
                r2 = 0
                if (r0 == 0) goto L_0x01da
                r0.getCount()
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r1.extraParams
                java.lang.String r3 = "user_count"
                com.ss.android.ugc.aweme.commerce.service.models.PromotionVisitor r4 = r9.getVisitor()
                if (r4 == 0) goto L_0x01d2
                long r4 = r4.getCount()
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                goto L_0x01d3
            L_0x01d2:
                r4 = r2
            L_0x01d3:
                java.lang.String r4 = java.lang.String.valueOf(r4)
                r0.put(r3, r4)
            L_0x01da:
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r1.extraParams
                java.lang.String r3 = "promotion_id"
                java.lang.String r4 = r9.getPromotionId()
                r0.put(r3, r4)
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r1.extraParams
                java.lang.String r3 = "product_id"
                java.lang.String r4 = r9.getProductId()
                r0.put(r3, r4)
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r1.extraParams
                java.lang.String r3 = "commodity_id"
                java.lang.String r4 = r9.getPromotionId()
                r0.put(r3, r4)
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r1.extraParams
                java.lang.String r3 = "commodity_type"
                long r4 = r9.getCommodityType()
                java.lang.String r4 = java.lang.String.valueOf(r4)
                r0.put(r3, r4)
                java.util.List r0 = r9.preferredImages()
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = com.ss.android.ugc.aweme.base.utils.j.b(r0)
                if (r0 == 0) goto L_0x0225
                java.util.List r0 = r9.preferredImages()
                if (r0 == 0) goto L_0x0223
                java.lang.Object r0 = r0.get(r8)
                r2 = r0
                com.ss.android.ugc.aweme.base.model.UrlModel r2 = (com.ss.android.ugc.aweme.base.model.UrlModel) r2
            L_0x0223:
                r1.videoCover = r2
            L_0x0225:
                r12.updateShareStruct(r1)
                r12.show()
                goto L_0x0238
            L_0x022c:
                android.content.Context r0 = (android.content.Context) r0
                r1 = 2131559400(0x7f0d03e8, float:1.8744143E38)
                com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.a((android.content.Context) r0, (int) r1)
                r0.a()
            L_0x0238:
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r0 = r7.f37244b
                android.content.Context r0 = (android.content.Context) r0
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r1 = r7.f37244b
                java.lang.String r1 = r1.T
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = com.ss.android.ugc.aweme.commerce.a.a.a((java.lang.String) r1)
                com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r2 = r7.f37244b
                com.ss.android.ugc.aweme.commerce.service.models.h r2 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.c((com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r2)
                com.ss.android.ugc.aweme.commercialize.log.g.e((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (com.ss.android.ugc.aweme.commerce.service.models.h) r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.r.c():void");
        }

        r(PreviewActivity previewActivity) {
            this.f37244b = previewActivity;
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f37243a, false, 28671, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f37243a, false, 28671, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f37244b.c(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class s implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37245a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37246b;

        s(PreviewActivity previewActivity) {
            this.f37246b = previewActivity;
        }

        public final void onClick(View view) {
            String str;
            if (PatchProxy.isSupport(new Object[]{view}, this, f37245a, false, 28672, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37245a, false, 28672, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.commercialize.log.g.a((Context) this.f37246b, com.ss.android.ugc.aweme.commerce.a.a.a(this.f37246b.T), PreviewActivity.c(this.f37246b));
            User user = this.f37246b.W;
            if (user != null) {
                str = user.getShopMicroApp();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                PreviewActivity.a(this.f37246b, false, 1);
            } else {
                this.f37246b.n();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/PreviewActivity$bindViews$8", "Lcom/ss/android/ugc/aweme/commerce/widget/PreviewBottom$PreViewBottomListener;", "onAddCartClick", "", "onAppointChanged", "isAppointment", "", "onCollectionClick", "v", "Landroid/view/View;", "onNormalBuyClick", "onStoreClick", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class t implements PreviewBottom.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37249a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37250b;

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f37249a, false, 28675, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37249a, false, 28675, new Class[0], Void.TYPE);
                return;
            }
            this.f37250b.l();
        }

        public final void a() {
            String str;
            if (PatchProxy.isSupport(new Object[0], this, f37249a, false, 28673, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37249a, false, 28673, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.commercialize.log.g.a((Context) this.f37250b, com.ss.android.ugc.aweme.commerce.a.a.a(this.f37250b.T), PreviewActivity.c(this.f37250b));
            User user = this.f37250b.W;
            if (user != null) {
                str = user.getShopMicroApp();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                PreviewActivity.a(this.f37250b, false, 1);
            } else {
                this.f37250b.n();
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f37249a, false, 28674, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37249a, false, 28674, new Class[0], Void.TYPE);
                return;
            }
            PreviewActivity previewActivity = this.f37250b;
            if (PatchProxy.isSupport(new Object[0], previewActivity, PreviewActivity.f2890a, false, 28614, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], previewActivity, PreviewActivity.f2890a, false, 28614, new Class[0], Void.TYPE);
                return;
            }
            previewActivity.U = SystemClock.uptimeMillis();
            previewActivity.a(1, (Function0<Unit>) new ap<Unit>(previewActivity));
        }

        t(PreviewActivity previewActivity) {
            this.f37250b = previewActivity;
        }

        public final void a(@NotNull View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f37249a, false, 28676, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f37249a, false, 28676, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, NotifyType.VIBRATE);
            this.f37250b.onClickCollection(view2);
        }

        public final void a(boolean z) {
            int i;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f37249a, false, 28677, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f37249a, false, 28677, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.commerce.service.models.r toutiao = PreviewActivity.c(this.f37250b).getToutiao();
            if (toutiao != null) {
                PromotionAppointment appointment = toutiao.getAppointment();
                if (appointment != null) {
                    appointment.setAppointment(z);
                }
            }
            com.ss.android.ugc.aweme.commerce.service.models.r toutiao2 = PreviewActivity.c(this.f37250b).getToutiao();
            if (toutiao2 != null) {
                PromotionAppointment appointment2 = toutiao2.getAppointment();
                if (appointment2 != null) {
                    int appointmentNum = appointment2.getAppointmentNum();
                    if (z) {
                        i = appointmentNum + 1;
                    } else {
                        i = appointmentNum - 1;
                    }
                    com.ss.android.ugc.aweme.commerce.service.models.r toutiao3 = PreviewActivity.c(this.f37250b).getToutiao();
                    if (toutiao3 != null) {
                        PromotionAppointment appointment3 = toutiao3.getAppointment();
                        if (appointment3 != null) {
                            appointment3.setAppointmentNum(i);
                        }
                    }
                    if (i >= 0 && 99999 >= i) {
                        DmtTextView dmtTextView = (DmtTextView) PreviewActivity.a(this.f37250b).findViewById(C0906R.id.fo);
                        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "headerView.appoint_people_num");
                        g.a aVar = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b;
                        DmtTextView dmtTextView2 = (DmtTextView) PreviewActivity.a(this.f37250b).findViewById(C0906R.id.fo);
                        Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "headerView.appoint_people_num");
                        Context context = dmtTextView2.getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context, "headerView.appoint_people_num.context");
                        dmtTextView.setText(aVar.a(context, C0906R.string.fv, String.valueOf(i)));
                    } else {
                        DmtTextView dmtTextView3 = (DmtTextView) PreviewActivity.a(this.f37250b).findViewById(C0906R.id.fo);
                        Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "headerView.appoint_people_num");
                        g.a aVar2 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b;
                        DmtTextView dmtTextView4 = (DmtTextView) PreviewActivity.a(this.f37250b).findViewById(C0906R.id.fo);
                        Intrinsics.checkExpressionValueIsNotNull(dmtTextView4, "headerView.appoint_people_num");
                        Context context2 = dmtTextView4.getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context2, "headerView.appoint_people_num.context");
                        dmtTextView3.setText(aVar2.a(context2, C0906R.string.fv, "99999+"));
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class u implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37251a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37252b;

        u(PreviewActivity previewActivity) {
            this.f37252b = previewActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37251a, false, 28678, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37251a, false, 28678, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f37252b.i();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class v implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37253a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PreviewActivity f37254b;

        v(PreviewActivity previewActivity) {
            this.f37254b = previewActivity;
        }

        public final void run() {
            int i;
            int i2;
            LinearLayout linearLayout;
            String str;
            int i3;
            int i4 = 0;
            if (PatchProxy.isSupport(new Object[0], this, f37253a, false, 28679, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37253a, false, 28679, new Class[0], Void.TYPE);
                return;
            }
            PreviewActivity previewActivity = this.f37254b;
            int height = PreviewActivity.a(this.f37254b).getHeight();
            PreviewTitle previewTitle = (PreviewTitle) this.f37254b.e((int) C0906R.id.c5h);
            Intrinsics.checkExpressionValueIsNotNull(previewTitle, "previewTitle");
            int height2 = height - previewTitle.getHeight();
            LinearLayout linearLayout2 = (LinearLayout) PreviewActivity.a(this.f37254b).findViewById(C0906R.id.am2);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "headerView.guessULikeTitle");
            if (linearLayout2.getVisibility() == 0) {
                LinearLayout linearLayout3 = (LinearLayout) PreviewActivity.a(this.f37254b).findViewById(C0906R.id.am2);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "headerView.guessULikeTitle");
                i = linearLayout3.getHeight();
            } else {
                i = 0;
            }
            previewActivity.j = height2 - i;
            PreviewActivity previewActivity2 = this.f37254b;
            if (this.f37254b.j()) {
                int i5 = this.f37254b.j;
                LinearLayout linearLayout4 = (LinearLayout) PreviewActivity.a(this.f37254b).findViewById(C0906R.id.al5);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "headerView.goodDetailContainer");
                i2 = i5 - linearLayout4.getHeight();
            } else {
                i2 = this.f37254b.j;
            }
            previewActivity2.k = i2;
            PreviewActivity previewActivity3 = this.f37254b;
            int i6 = this.f37254b.k;
            LinearLayout linearLayout5 = (LinearLayout) PreviewActivity.a(this.f37254b).findViewById(C0906R.id.drd);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "headerView.videoCommentContainer");
            if (linearLayout5.getVisibility() == 0) {
                linearLayout = (LinearLayout) PreviewActivity.a(this.f37254b).findViewById(C0906R.id.drd);
                str = "headerView.videoCommentContainer";
            } else {
                linearLayout = (LinearLayout) PreviewActivity.a(this.f37254b).findViewById(C0906R.id.drg);
                str = "headerView.videoCommentGuideContainer";
            }
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, str);
            int height3 = i6 - linearLayout.getHeight();
            LinearLayout linearLayout6 = (LinearLayout) PreviewActivity.a(this.f37254b).findViewById(C0906R.id.cqr);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout6, "headerView.shopContainer");
            if (linearLayout6.getVisibility() == 0) {
                LinearLayout linearLayout7 = (LinearLayout) PreviewActivity.a(this.f37254b).findViewById(C0906R.id.cqr);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout7, "headerView.shopContainer");
                i3 = linearLayout7.getHeight();
            } else {
                i3 = 0;
            }
            previewActivity3.l = height3 - i3;
            PreviewActivity previewActivity4 = this.f37254b;
            int i7 = this.f37254b.l;
            LinearLayout linearLayout8 = (LinearLayout) PreviewActivity.a(this.f37254b).findViewById(C0906R.id.c6n);
            if (linearLayout8 != null && linearLayout8.getVisibility() == 0) {
                LinearLayout linearLayout9 = (LinearLayout) PreviewActivity.a(this.f37254b).findViewById(C0906R.id.c6n);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout9, "headerView.productCommentContainer");
                i4 = linearLayout9.getHeight();
            }
            previewActivity4.m = i7 - i4;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\n¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"<anonymous>", "", "latestCount", "", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "Landroid/graphics/Rect;", "<anonymous parameter 3>", "Landroid/graphics/Bitmap;", "invoke", "com/ss/android/ugc/aweme/commerce/preview/PreviewActivity$chooseSkuInfo$2$1"}, k = 3, mv = {1, 1, 15})
    static final class w extends Lambda implements Function4<Integer, String, Rect, Bitmap, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Ref.ObjectRef $comboKey$inlined;
        final /* synthetic */ UrlModel $defaultUrlModel$inlined;
        final /* synthetic */ com.ss.android.ugc.aweme.commerce.service.models.ak $uiSkuInfo$inlined;
        final /* synthetic */ PreviewActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(PreviewActivity previewActivity, com.ss.android.ugc.aweme.commerce.service.models.ak akVar, Ref.ObjectRef objectRef, UrlModel urlModel) {
            super(4);
            this.this$0 = previewActivity;
            this.$uiSkuInfo$inlined = akVar;
            this.$comboKey$inlined = objectRef;
            this.$defaultUrlModel$inlined = urlModel;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke(((Number) obj).intValue(), (String) obj2, (Rect) obj3, (Bitmap) obj4);
            return Unit.INSTANCE;
        }

        public final void invoke(int i, @Nullable String str, @Nullable Rect rect, @Nullable Bitmap bitmap) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, rect, bitmap}, this, changeQuickRedirect, false, 28680, new Class[]{Integer.TYPE, String.class, Rect.class, Bitmap.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, rect, bitmap}, this, changeQuickRedirect, false, 28680, new Class[]{Integer.TYPE, String.class, Rect.class, Bitmap.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.commerce.service.l.c.f37989a.a(SystemClock.uptimeMillis() - this.this$0.U);
            this.this$0.b(i);
            PreviewActivity previewActivity = this.this$0;
            UrlModel urlModel = this.$defaultUrlModel$inlined;
            if (PatchProxy.isSupport(new Object[]{urlModel}, previewActivity, PreviewActivity.f2890a, false, 28592, new Class[]{UrlModel.class}, Void.TYPE)) {
                PreviewActivity previewActivity2 = previewActivity;
                PatchProxy.accessDispatch(new Object[]{urlModel}, previewActivity2, PreviewActivity.f2890a, false, 28592, new Class[]{UrlModel.class}, Void.TYPE);
                return;
            }
            if (urlModel != null) {
                int dip2Px = (int) UIUtils.dip2Px(previewActivity.getApplicationContext(), 20.0f);
                com.ss.android.ugc.aweme.base.c.a(urlModel, dip2Px, dip2Px, (com.ss.android.ugc.aweme.base.b.a.b<Bitmap>) new bl<Bitmap>(previewActivity));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "latestCount", "", "<anonymous parameter 1>", "", "imageRect", "Landroid/graphics/Rect;", "bitmap", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class x extends Lambda implements Function4<Integer, String, Rect, Bitmap, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PreviewActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(PreviewActivity previewActivity) {
            super(4);
            this.this$0 = previewActivity;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke(((Number) obj).intValue(), (String) obj2, (Rect) obj3, (Bitmap) obj4);
            return Unit.INSTANCE;
        }

        public final void invoke(int i, @Nullable String str, @Nullable Rect rect, @Nullable Bitmap bitmap) {
            boolean z;
            Rect rect2 = rect;
            Bitmap bitmap2 = bitmap;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, rect2, bitmap2}, this, changeQuickRedirect, false, 28681, new Class[]{Integer.TYPE, String.class, Rect.class, Bitmap.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, rect2, bitmap2}, this, changeQuickRedirect, false, 28681, new Class[]{Integer.TYPE, String.class, Rect.class, Bitmap.class}, Void.TYPE);
                return;
            }
            this.this$0.b(i);
            if (!(bitmap2 == null || rect2 == null)) {
                PreviewActivity previewActivity = this.this$0;
                if (PatchProxy.isSupport(new Object[]{rect2, bitmap2}, previewActivity, PreviewActivity.f2890a, false, 28594, new Class[]{Rect.class, Bitmap.class}, Void.TYPE)) {
                    PreviewActivity previewActivity2 = previewActivity;
                    PatchProxy.accessDispatch(new Object[]{rect2, bitmap2}, previewActivity2, PreviewActivity.f2890a, false, 28594, new Class[]{Rect.class, Bitmap.class}, Void.TYPE);
                    return;
                }
                View[] cartView = ((PreviewTitle) previewActivity.e((int) C0906R.id.c5h)).getCartView();
                if (cartView.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Rect rect3 = new Rect();
                    int[] iArr = new int[2];
                    View view = cartView[0];
                    view.getLocationOnScreen(iArr);
                    rect3.left = iArr[0];
                    rect3.top = iArr[1];
                    rect3.right = rect3.left + view.getMeasuredWidth();
                    rect3.bottom = rect3.top + view.getMeasuredHeight();
                    SnapshotAnimView snapshotAnimView = new SnapshotAnimView(previewActivity);
                    snapshotAnimView.setImageBitmap(bitmap2);
                    com.ss.android.ugc.aweme.commerce.service.l.d.a((Activity) previewActivity, snapshotAnimView, rect2, rect3, cartView);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class y extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ boolean $forAddCartPurpose;
        final /* synthetic */ PreviewActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(PreviewActivity previewActivity, boolean z) {
            super(0);
            this.this$0 = previewActivity;
            this.$forAddCartPurpose = z;
        }

        public final void invoke() {
            String str;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28682, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28682, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.commerce.service.logs.x xVar = new com.ss.android.ugc.aweme.commerce.service.logs.x();
            xVar.h = PreviewActivity.b(this.this$0).getUid();
            xVar.f38164f = this.this$0.F;
            xVar.g = PreviewActivity.c(this.this$0).getPromotionId();
            xVar.i = PreviewActivity.c(this.this$0).getCommodityType();
            if (this.$forAddCartPurpose) {
                str = "click_add_to_cart";
            } else {
                str = "click_product";
            }
            if (PatchProxy.isSupport(new Object[]{str}, xVar, com.ss.android.ugc.aweme.commerce.service.logs.x.f38163a, false, 29724, new Class[]{String.class}, com.ss.android.ugc.aweme.commerce.service.logs.x.class)) {
                Object[] objArr = {str};
                com.ss.android.ugc.aweme.commerce.service.logs.x xVar2 = xVar;
                xVar = (com.ss.android.ugc.aweme.commerce.service.logs.x) PatchProxy.accessDispatch(objArr, xVar2, com.ss.android.ugc.aweme.commerce.service.logs.x.f38163a, false, 29724, new Class[]{String.class}, com.ss.android.ugc.aweme.commerce.service.logs.x.class);
            } else {
                Intrinsics.checkParameterIsNotNull(str, PushConstants.CLICK_TYPE);
                xVar.j = str;
            }
            xVar.b();
            com.ss.android.ugc.aweme.commercialize.log.g.d((Context) this.this$0, com.ss.android.ugc.aweme.commerce.a.a.a(this.this$0.T), PreviewActivity.c(this.this$0));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class z extends Lambda implements Function0<Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PreviewActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(PreviewActivity previewActivity) {
            super(0);
            this.this$0 = previewActivity;
        }

        public final int invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28683, new Class[0], Integer.TYPE)) {
                return (int) UIUtils.dip2Px(this.this$0, 114.5f);
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28683, new Class[0], Integer.TYPE)).intValue();
        }
    }

    private final RecyclerView.SmoothScroller C() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28561, new Class[0], RecyclerView.SmoothScroller.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28561, new Class[0], RecyclerView.SmoothScroller.class);
        } else {
            value = this.af.getValue();
        }
        return (RecyclerView.SmoothScroller) value;
    }

    public final void d(@Nullable Exception exc) {
    }

    public final View e(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2890a, false, 28646, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2890a, false, 28646, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.aD == null) {
            this.aD = new HashMap();
        }
        View view = (View) this.aD.get(Integer.valueOf(i2));
        if (view == null) {
            view = findViewById(i2);
            this.aD.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final View h() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28570, new Class[0], View.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28570, new Class[0], View.class);
        } else {
            value = this.ao.getValue();
        }
        return (View) value;
    }

    public final void onWindowFocusChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2890a, false, 28648, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f2890a, false, 28648, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.preview.PreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    public final com.ss.android.ugc.aweme.commerce.preview.footprint.c u() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28628, new Class[0], com.ss.android.ugc.aweme.commerce.preview.footprint.c.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28628, new Class[0], com.ss.android.ugc.aweme.commerce.preview.footprint.c.class);
        } else {
            value = this.aA.getValue();
        }
        return (com.ss.android.ugc.aweme.commerce.preview.footprint.c) value;
    }

    /* access modifiers changed from: package-private */
    public final RemoteImageView v() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28633, new Class[0], RemoteImageView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28633, new Class[0], RemoteImageView.class);
        } else {
            value = this.aB.getValue();
        }
        return (RemoteImageView) value;
    }

    public final PreviewBottom w() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28634, new Class[0], PreviewBottom.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28634, new Class[0], PreviewBottom.class);
        } else {
            value = this.aC.getValue();
        }
        return (PreviewBottom) value;
    }

    public final void z_() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0053, code lost:
        if (r0 == null) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r19, boolean r20) {
        /*
            r18 = this;
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r19
            java.lang.Byte r3 = java.lang.Byte.valueOf(r20)
            r10 = 1
            r2[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = f2890a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r7[r10] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 28551(0x6f87, float:4.0008E-41)
            r3 = r18
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0049
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r9] = r19
            java.lang.Byte r0 = java.lang.Byte.valueOf(r20)
            r11[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = f2890a
            r14 = 0
            r15 = 28551(0x6f87, float:4.0008E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r18
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x0049:
            if (r19 == 0) goto L_0x005a
            r0 = r19
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.toList(r0)
            if (r0 != 0) goto L_0x0056
            goto L_0x005a
        L_0x0056:
            r1 = r0
            r0 = r18
            goto L_0x005f
        L_0x005a:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0056
        L_0x005f:
            r0.a((java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>) r1)
            r18.B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.a(java.util.List, boolean):void");
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2890a, false, 28554, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2890a, false, 28554, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.commerce.service.models.h hVar = this.D;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
        }
        if (!Intrinsics.areEqual((Object) hVar.getHasGuessULike(), (Object) Boolean.FALSE)) {
            com.ss.android.ugc.aweme.commerce.service.models.h hVar2 = this.D;
            if (hVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
            }
            String promotionId = hVar2.getPromotionId();
            com.ss.android.ugc.aweme.commerce.service.models.h hVar3 = this.D;
            if (hVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
            }
            String productId = hVar3.getProductId();
            com.ss.android.ugc.aweme.common.f.b<i> bVar = this.f2893d;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            }
            bVar.a(Integer.valueOf(i2), this.F, promotionId, productId);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v77, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: com.ss.android.ugc.aweme.feed.model.Aweme} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.commerce.service.models.h r26, java.util.List<com.ss.android.ugc.aweme.commerce.service.models.h> r27) {
        /*
            r25 = this;
            r7 = r25
            r8 = r26
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            r12 = 1
            r0[r12] = r27
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.h> r1 = com.ss.android.ugc.aweme.commerce.service.models.h.class
            r5[r11] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 28564(0x6f94, float:4.0027E-41)
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0043
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r27
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28564(0x6f94, float:4.0027E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.h> r1 = com.ss.android.ugc.aweme.commerce.service.models.h.class
            r5[r11] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0043:
            r7.D = r8
            com.ss.android.ugc.aweme.commerce.service.models.h r0 = r7.D
            if (r0 != 0) goto L_0x004e
            java.lang.String r1 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x004e:
            com.ss.android.ugc.aweme.commerce.service.models.r r0 = r0.getToutiao()
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r0.getOrderUrl()
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            r7.H = r0
            com.ss.android.ugc.aweme.commerce.service.models.h r0 = r7.D
            if (r0 != 0) goto L_0x0065
            java.lang.String r1 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0065:
            com.ss.android.ugc.aweme.commerce.service.models.r r0 = r0.getToutiao()
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = r0.getOrderTmaUrl()
            goto L_0x0071
        L_0x0070:
            r0 = 0
        L_0x0071:
            r7.I = r0
            java.util.List<com.ss.android.ugc.aweme.commerce.service.models.h> r0 = r7.at
            r0.clear()
            java.util.List<com.ss.android.ugc.aweme.commerce.service.models.h> r0 = r7.at
            r1 = r27
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28579(0x6fa3, float:4.0048E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00a5
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28579(0x6fa3, float:4.0048E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00eb
        L_0x00a5:
            java.util.List<com.ss.android.ugc.aweme.commerce.service.models.h> r0 = r7.as
            r0.clear()
            java.util.List<com.ss.android.ugc.aweme.commerce.service.models.h> r0 = r7.as
            java.util.List<com.ss.android.ugc.aweme.commerce.service.models.h> r1 = r7.at
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        L_0x00bb:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00e4
            java.lang.Object r3 = r1.next()
            r4 = r3
            com.ss.android.ugc.aweme.commerce.service.models.h r4 = (com.ss.android.ugc.aweme.commerce.service.models.h) r4
            java.lang.String r4 = r4.getPromotionId()
            com.ss.android.ugc.aweme.commerce.service.models.h r5 = r7.D
            if (r5 != 0) goto L_0x00d5
            java.lang.String r6 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
        L_0x00d5:
            java.lang.String r5 = r5.getPromotionId()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            r4 = r4 ^ r12
            if (r4 == 0) goto L_0x00bb
            r2.add(r3)
            goto L_0x00bb
        L_0x00e4:
            java.util.List r2 = (java.util.List) r2
            java.util.Collection r2 = (java.util.Collection) r2
            r0.addAll(r2)
        L_0x00eb:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28572(0x6f9c, float:4.0038E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0110
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28572(0x6f9c, float:4.0038E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0883
        L_0x0110:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28557(0x6f8d, float:4.0017E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0135
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28557(0x6f8d, float:4.0017E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0261
        L_0x0135:
            com.ss.android.ugc.aweme.commerce.preview.j r0 = new com.ss.android.ugc.aweme.commerce.preview.j
            r0.<init>()
            com.ss.android.ugc.aweme.common.f.b r0 = (com.ss.android.ugc.aweme.common.f.b) r0
            r7.f2893d = r0
            com.ss.android.ugc.aweme.common.f.b<com.ss.android.ugc.aweme.commerce.preview.i> r0 = r7.f2893d
            if (r0 != 0) goto L_0x0147
            java.lang.String r1 = "mPresenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0147:
            r1 = r7
            com.ss.android.ugc.aweme.common.o r1 = (com.ss.android.ugc.aweme.common.o) r1
            r0.a(r1)
            com.ss.android.ugc.aweme.common.f.b<com.ss.android.ugc.aweme.commerce.preview.i> r0 = r7.f2893d
            if (r0 != 0) goto L_0x0156
            java.lang.String r1 = "mPresenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0156:
            com.ss.android.ugc.aweme.commerce.preview.i r1 = new com.ss.android.ugc.aweme.commerce.preview.i
            r1.<init>()
            com.ss.android.ugc.aweme.common.a r1 = (com.ss.android.ugc.aweme.common.a) r1
            r0.a(r1)
            com.ss.android.ugc.aweme.commerce.preview.f r0 = new com.ss.android.ugc.aweme.commerce.preview.f
            java.lang.String r15 = r7.F
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r7.D
            if (r1 != 0) goto L_0x016d
            java.lang.String r2 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x016d:
            com.ss.android.ugc.aweme.commerce.service.models.CommerceUser r2 = r7.E
            if (r2 != 0) goto L_0x0176
            java.lang.String r3 = "mUserInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0176:
            java.lang.String r17 = r2.getUid()
            java.lang.String r2 = r7.T
            long r3 = r7.r
            r14 = r0
            r16 = r1
            r18 = r2
            r19 = r3
            r14.<init>(r15, r16, r17, r18, r19)
            r7.f2894e = r0
            com.ss.android.ugc.aweme.commerce.preview.f r0 = r7.f2894e
            if (r0 != 0) goto L_0x0193
            java.lang.String r1 = "mCollectionPresenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0193:
            r1 = r7
            com.bytedance.ies.uikit.base.AbsActivity r1 = (com.bytedance.ies.uikit.base.AbsActivity) r1
            com.ss.android.ugc.aweme.commerce.widget.PreviewBottom r2 = r25.w()
            java.lang.String r3 = "previewBottom"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            r3 = 2131165962(0x7f07030a, float:1.7946156E38)
            android.view.View r2 = r2.a((int) r3)
            com.ss.android.ugc.aweme.music.ui.CheckableImageView r2 = (com.ss.android.ugc.aweme.music.ui.CheckableImageView) r2
            java.lang.Object[] r3 = new java.lang.Object[r10]
            r3[r11] = r1
            r3[r12] = r2
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.commerce.preview.f.f37383a
            r21 = 0
            r22 = 28753(0x7051, float:4.0292E-41)
            java.lang.Class[] r4 = new java.lang.Class[r10]
            java.lang.Class<com.bytedance.ies.uikit.base.AbsActivity> r5 = com.bytedance.ies.uikit.base.AbsActivity.class
            r4[r11] = r5
            java.lang.Class<com.ss.android.ugc.aweme.music.ui.CheckableImageView> r5 = com.ss.android.ugc.aweme.music.ui.CheckableImageView.class
            r4[r12] = r5
            java.lang.Class r24 = java.lang.Void.TYPE
            r18 = r3
            r19 = r0
            r23 = r4
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r18, r19, r20, r21, r22, r23, r24)
            if (r3 == 0) goto L_0x01ee
            java.lang.Object[] r3 = new java.lang.Object[r10]
            r3[r11] = r1
            r3[r12] = r2
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.commerce.preview.f.f37383a
            r21 = 0
            r22 = 28753(0x7051, float:4.0292E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class<com.bytedance.ies.uikit.base.AbsActivity> r2 = com.bytedance.ies.uikit.base.AbsActivity.class
            r1[r11] = r2
            java.lang.Class<com.ss.android.ugc.aweme.music.ui.CheckableImageView> r2 = com.ss.android.ugc.aweme.music.ui.CheckableImageView.class
            r1[r12] = r2
            java.lang.Class r24 = java.lang.Void.TYPE
            r18 = r3
            r19 = r0
            r23 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0200
        L_0x01ee:
            r0.f37385c = r1
            r0.f37386d = r2
            com.ss.android.ugc.aweme.music.ui.CheckableImageView r1 = r0.f37386d
            if (r1 == 0) goto L_0x0200
            com.ss.android.ugc.aweme.commerce.preview.f$b r2 = new com.ss.android.ugc.aweme.commerce.preview.f$b
            r2.<init>(r0)
            com.ss.android.ugc.aweme.music.ui.CheckableImageView$a r2 = (com.ss.android.ugc.aweme.music.ui.CheckableImageView.a) r2
            r1.setOnStateChangeListener(r2)
        L_0x0200:
            com.ss.android.ugc.aweme.commerce.preview.f r0 = r7.f2894e
            if (r0 != 0) goto L_0x0209
            java.lang.String r1 = "mCollectionPresenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0209:
            java.lang.Boolean r1 = r7.M
            if (r1 == 0) goto L_0x0212
            boolean r1 = r1.booleanValue()
            goto L_0x0213
        L_0x0212:
            r1 = 0
        L_0x0213:
            r0.a(r1)
            com.ss.android.ugc.aweme.commerce.preview.f r0 = r7.f2894e
            if (r0 != 0) goto L_0x021f
            java.lang.String r1 = "mCollectionPresenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x021f:
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$aj r1 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$aj
            r1.<init>(r7)
            com.ss.android.ugc.aweme.commerce.service.ICommerceService$a r1 = (com.ss.android.ugc.aweme.commerce.service.ICommerceService.a) r1
            java.lang.Object[] r14 = new java.lang.Object[r12]
            r14[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.commerce.preview.f.f37383a
            r17 = 0
            r18 = 28763(0x705b, float:4.0306E-41)
            java.lang.Class[] r2 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.ICommerceService$a> r3 = com.ss.android.ugc.aweme.commerce.service.ICommerceService.a.class
            r2[r11] = r3
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r0
            r19 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r2 == 0) goto L_0x025a
            java.lang.Object[] r14 = new java.lang.Object[r12]
            r14[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.commerce.preview.f.f37383a
            r17 = 0
            r18 = 28763(0x705b, float:4.0306E-41)
            java.lang.Class[] r1 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.ICommerceService$a> r2 = com.ss.android.ugc.aweme.commerce.service.ICommerceService.a.class
            r1[r11] = r2
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r0
            r19 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0261
        L_0x025a:
            java.lang.String r2 = "add2WillDialogListener"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
            r0.h = r1
        L_0x0261:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28584(0x6fa8, float:4.0055E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0286
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28584(0x6fa8, float:4.0055E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0822
        L_0x0286:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28607(0x6fbf, float:4.0087E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r9 = -1
            if (r0 == 0) goto L_0x02ac
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28607(0x6fbf, float:4.0087E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0391
        L_0x02ac:
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r14 = r7
            android.content.Context r14 = (android.content.Context) r14
            r0.<init>(r14)
            r7.g = r0
            android.widget.FrameLayout r0 = r7.g
            if (r0 != 0) goto L_0x02bf
            java.lang.String r1 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x02bf:
            android.support.v7.widget.RecyclerView$LayoutParams r1 = new android.support.v7.widget.RecyclerView$LayoutParams
            r15 = -2
            r1.<init>((int) r9, (int) r15)
            android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
            r0.setLayoutParams(r1)
            android.widget.FrameLayout r6 = r7.g
            if (r6 != 0) goto L_0x02d3
            java.lang.String r0 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L_0x02d3:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28609(0x6fc1, float:4.009E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<android.view.View> r16 = android.view.View.class
            r1 = r25
            r13 = r6
            r6 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02fd
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28609(0x6fc1, float:4.009E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r1 = r25
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.view.View r0 = (android.view.View) r0
            goto L_0x0318
        L_0x02fd:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r14)
            r1 = 2131690559(0x7f0f043f, float:1.9010165E38)
            android.widget.FrameLayout r2 = r7.g
            if (r2 != 0) goto L_0x030d
            java.lang.String r3 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x030d:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r0 = r0.inflate(r1, r2, r11)
            java.lang.String r1 = "LayoutInflater.from(this…eader, headerView, false)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
        L_0x0318:
            android.support.v7.widget.RecyclerView$LayoutParams r1 = new android.support.v7.widget.RecyclerView$LayoutParams
            r1.<init>((int) r9, (int) r15)
            android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
            r13.addView(r0, r1)
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r14)
            r7.ab = r0
            android.widget.FrameLayout r0 = r7.ab
            if (r0 != 0) goto L_0x0332
            java.lang.String r1 = "footerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0332:
            android.support.v7.widget.RecyclerView$LayoutParams r1 = new android.support.v7.widget.RecyclerView$LayoutParams
            r1.<init>((int) r9, (int) r15)
            android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
            r0.setLayoutParams(r1)
            android.widget.FrameLayout r13 = r7.ab
            if (r13 != 0) goto L_0x0345
            java.lang.String r0 = "footerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L_0x0345:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28608(0x6fc0, float:4.0088E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x036c
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28608(0x6fc0, float:4.0088E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r1 = r25
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.view.View r0 = (android.view.View) r0
            goto L_0x0387
        L_0x036c:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r14)
            r1 = 2131690558(0x7f0f043e, float:1.9010163E38)
            android.widget.FrameLayout r2 = r7.ab
            if (r2 != 0) goto L_0x037c
            java.lang.String r3 = "footerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x037c:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r0 = r0.inflate(r1, r2, r11)
            java.lang.String r1 = "LayoutInflater.from(this…ooter, footerView, false)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
        L_0x0387:
            android.support.v7.widget.RecyclerView$LayoutParams r1 = new android.support.v7.widget.RecyclerView$LayoutParams
            r1.<init>((int) r9, (int) r15)
            android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
            r13.addView(r0, r1)
        L_0x0391:
            android.widget.FrameLayout r0 = r7.g
            if (r0 != 0) goto L_0x039a
            java.lang.String r1 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x039a:
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$n r1 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$n
            r1.<init>(r7)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.post(r1)
            r13 = 2131169400(0x7f071078, float:1.795313E38)
            android.view.View r0 = r7.e((int) r13)
            android.support.v7.widget.RecyclerView r0 = (android.support.v7.widget.RecyclerView) r0
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$bindViews$2 r1 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$bindViews$2
            r1.<init>(r7)
            android.support.v7.widget.RecyclerView$OnScrollListener r1 = (android.support.v7.widget.RecyclerView.OnScrollListener) r1
            r0.addOnScrollListener(r1)
            android.widget.FrameLayout r0 = r7.g
            if (r0 != 0) goto L_0x03c0
            java.lang.String r1 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x03c0:
            android.view.View r0 = (android.view.View) r0
            r1 = 2131165238(0x7f070036, float:1.7944687E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$o r1 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$o
            r1.<init>(r7)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            android.widget.FrameLayout r0 = r7.g
            if (r0 != 0) goto L_0x03de
            java.lang.String r1 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x03de:
            android.view.View r0 = (android.view.View) r0
            r1 = 2131168753(0x7f070df1, float:1.7951817E38)
            android.view.View r0 = r0.findViewById(r1)
            com.ss.android.ugc.aweme.commerce.widget.ObservableHorizontalScrollView r0 = (com.ss.android.ugc.aweme.commerce.widget.ObservableHorizontalScrollView) r0
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$p r1 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$p
            r1.<init>(r7)
            com.ss.android.ugc.aweme.commerce.widget.ObservableHorizontalScrollView$a r1 = (com.ss.android.ugc.aweme.commerce.widget.ObservableHorizontalScrollView.a) r1
            r0.setScrollViewListener(r1)
            r0 = 2131167029(0x7f070735, float:1.794832E38)
            android.view.View r0 = r7.e((int) r0)
            com.ss.android.ugc.aweme.commerce.widget.RoundSelectorBtn r0 = (com.ss.android.ugc.aweme.commerce.widget.RoundSelectorBtn) r0
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$q r1 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$q
            r1.<init>(r7)
            com.ss.android.ugc.aweme.commerce.widget.RoundSelectorBtn$a r1 = (com.ss.android.ugc.aweme.commerce.widget.RoundSelectorBtn.a) r1
            r0.setOnStateChangeListener(r1)
            r0 = 2131169117(0x7f070f5d, float:1.7952555E38)
            android.view.View r0 = r7.e((int) r0)
            com.ss.android.ugc.aweme.commerce.widget.PreviewTitle r0 = (com.ss.android.ugc.aweme.commerce.widget.PreviewTitle) r0
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$r r1 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$r
            r1.<init>(r7)
            com.ss.android.ugc.aweme.commerce.widget.PreviewTitle$b r1 = (com.ss.android.ugc.aweme.commerce.widget.PreviewTitle.b) r1
            r0.setOnItemClickListener(r1)
            android.widget.FrameLayout r0 = r7.g
            if (r0 != 0) goto L_0x0422
            java.lang.String r1 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0422:
            android.view.View r0 = (android.view.View) r0
            r1 = 2131170134(0x7f071356, float:1.7954618E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$s r1 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$s
            r1.<init>(r7)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            com.ss.android.ugc.aweme.commerce.widget.PreviewBottom r0 = r25.w()
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$t r1 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$t
            r1.<init>(r7)
            com.ss.android.ugc.aweme.commerce.widget.PreviewBottom$b r1 = (com.ss.android.ugc.aweme.commerce.widget.PreviewBottom.b) r1
            r0.setListener(r1)
            android.widget.FrameLayout r0 = r7.g
            if (r0 != 0) goto L_0x044e
            java.lang.String r1 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x044e:
            android.view.View r0 = (android.view.View) r0
            r1 = 2131171334(0x7f071806, float:1.7957052E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$u r1 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$u
            r1.<init>(r7)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28610(0x6fc2, float:4.0091E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0488
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28610(0x6fc2, float:4.0091E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0520
        L_0x0488:
            com.ss.android.ugc.aweme.commerce.preview.PreviewVideoAdapter r0 = new com.ss.android.ugc.aweme.commerce.preview.PreviewVideoAdapter
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r7.au
            com.ss.android.ugc.aweme.commerce.service.models.CommerceUser r2 = r7.E
            if (r2 != 0) goto L_0x0495
            java.lang.String r3 = "mUserInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0495:
            java.lang.String r2 = r2.getUid()
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$e r3 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$e
            r3.<init>(r7)
            kotlin.jvm.functions.Function4 r3 = (kotlin.jvm.functions.Function4) r3
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$f r4 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.f.INSTANCE
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r0.<init>(r1, r2, r3, r4)
            r7.ac = r0
            android.support.v7.widget.StaggeredGridLayoutManager r0 = new android.support.v7.widget.StaggeredGridLayoutManager
            r0.<init>(r10, r12)
            r7.h = r0
            com.ss.android.ugc.aweme.commerce.service.stagger.SmartRecyclerAdapter r0 = new com.ss.android.ugc.aweme.commerce.service.stagger.SmartRecyclerAdapter
            com.ss.android.ugc.aweme.commerce.preview.PreviewVideoAdapter r1 = r7.ac
            if (r1 != 0) goto L_0x04bb
            java.lang.String r2 = "adapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x04bb:
            android.support.v7.widget.RecyclerView$Adapter r1 = (android.support.v7.widget.RecyclerView.Adapter) r1
            r0.<init>(r1)
            android.widget.FrameLayout r1 = r7.g
            if (r1 != 0) goto L_0x04c9
            java.lang.String r2 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x04c9:
            android.view.View r1 = (android.view.View) r1
            r0.a(r1)
            android.widget.FrameLayout r1 = r7.ab
            if (r1 != 0) goto L_0x04d7
            java.lang.String r2 = "footerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x04d7:
            android.view.View r1 = (android.view.View) r1
            r0.b(r1)
            android.view.View r1 = r7.e((int) r13)
            android.support.v7.widget.RecyclerView r1 = (android.support.v7.widget.RecyclerView) r1
            java.lang.String r2 = "recyclerView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.support.v7.widget.StaggeredGridLayoutManager r2 = r7.h
            if (r2 != 0) goto L_0x04f0
            java.lang.String r3 = "staggeredLayoutManager"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x04f0:
            android.support.v7.widget.RecyclerView$LayoutManager r2 = (android.support.v7.widget.RecyclerView.LayoutManager) r2
            r1.setLayoutManager(r2)
            android.view.View r1 = r7.e((int) r13)
            android.support.v7.widget.RecyclerView r1 = (android.support.v7.widget.RecyclerView) r1
            com.ss.android.ugc.aweme.commerce.service.widgets.NoneSymmetryDecoration r2 = new com.ss.android.ugc.aweme.commerce.service.widgets.NoneSymmetryDecoration
            r3 = r7
            android.content.Context r3 = (android.content.Context) r3
            r4 = 1090519040(0x41000000, float:8.0)
            r5 = 1073741824(0x40000000, float:2.0)
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$g r6 = com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.g.INSTANCE
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r2.<init>(r3, r4, r5, r6)
            android.support.v7.widget.RecyclerView$ItemDecoration r2 = (android.support.v7.widget.RecyclerView.ItemDecoration) r2
            r1.addItemDecoration(r2)
            android.view.View r1 = r7.e((int) r13)
            android.support.v7.widget.RecyclerView r1 = (android.support.v7.widget.RecyclerView) r1
            java.lang.String r2 = "recyclerView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.support.v7.widget.RecyclerView$Adapter r0 = (android.support.v7.widget.RecyclerView.Adapter) r0
            r1.setAdapter(r0)
        L_0x0520:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28573(0x6f9d, float:4.004E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0545
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28573(0x6f9d, float:4.004E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0665
        L_0x0545:
            android.widget.FrameLayout r0 = r7.g
            if (r0 != 0) goto L_0x054e
            java.lang.String r1 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x054e:
            android.view.View r0 = (android.view.View) r0
            r1 = 2131171335(0x7f071807, float:1.7957054E38)
            android.view.View r0 = r0.findViewById(r1)
            android.support.v7.widget.RecyclerView r0 = (android.support.v7.widget.RecyclerView) r0
            java.lang.String r2 = "headerView.videoCommentRV"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            com.ss.android.ugc.aweme.views.WrapLinearLayoutManager r2 = new com.ss.android.ugc.aweme.views.WrapLinearLayoutManager
            r3 = r7
            android.content.Context r3 = (android.content.Context) r3
            r2.<init>(r3, r11, r11)
            android.support.v7.widget.RecyclerView$LayoutManager r2 = (android.support.v7.widget.RecyclerView.LayoutManager) r2
            r0.setLayoutManager(r2)
            android.widget.FrameLayout r0 = r7.g
            if (r0 != 0) goto L_0x0574
            java.lang.String r2 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0574:
            android.view.View r0 = (android.view.View) r0
            android.view.View r0 = r0.findViewById(r1)
            android.support.v7.widget.RecyclerView r0 = (android.support.v7.widget.RecyclerView) r0
            com.ss.android.ugc.aweme.friends.adapter.DividerItemDecoration r2 = new com.ss.android.ugc.aweme.friends.adapter.DividerItemDecoration
            com.ss.android.ugc.aweme.commerce.service.l.g$a r4 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
            r5 = 2131624522(0x7f0e024a, float:1.8876226E38)
            int r4 = r4.a(r3, r5)
            r5 = 1086324736(0x40c00000, float:6.0)
            float r5 = com.bytedance.common.utility.UIUtils.dip2Px(r3, r5)
            int r5 = (int) r5
            r2.<init>(r4, r5, r11)
            android.support.v7.widget.RecyclerView$ItemDecoration r2 = (android.support.v7.widget.RecyclerView.ItemDecoration) r2
            r0.addItemDecoration(r2)
            android.widget.FrameLayout r0 = r7.g
            if (r0 != 0) goto L_0x059f
            java.lang.String r2 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x059f:
            android.view.View r0 = (android.view.View) r0
            android.view.View r0 = r0.findViewById(r1)
            android.support.v7.widget.RecyclerView r0 = (android.support.v7.widget.RecyclerView) r0
            com.ss.android.ugc.aweme.challenge.ui.OnAnimatedScrollListener r2 = new com.ss.android.ugc.aweme.challenge.ui.OnAnimatedScrollListener
            r2.<init>()
            android.support.v7.widget.RecyclerView$OnScrollListener r2 = (android.support.v7.widget.RecyclerView.OnScrollListener) r2
            r0.addOnScrollListener(r2)
            com.ss.android.ugc.aweme.commerce.preview.VideoCommentAdapter r0 = new com.ss.android.ugc.aweme.commerce.preview.VideoCommentAdapter
            r0.<init>()
            r7.ap = r0
            android.view.View r0 = new android.view.View
            r0.<init>(r3)
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r4 = 1092616192(0x41200000, float:10.0)
            float r3 = com.bytedance.common.utility.UIUtils.dip2Px(r3, r4)
            int r3 = (int) r3
            r2.<init>(r3, r9)
            r0.setLayoutParams(r2)
            com.ss.android.ugc.aweme.commerce.preview.VideoCommentAdapter r2 = r7.ap
            if (r2 != 0) goto L_0x05d5
            java.lang.String r3 = "mVideoCommentAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x05d5:
            r2.a(r0)
            com.ss.android.ugc.aweme.commerce.preview.VideoCommentAdapter r0 = r7.ap
            if (r0 != 0) goto L_0x05e1
            java.lang.String r2 = "mVideoCommentAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x05e1:
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$l r2 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$l
            r2.<init>(r7)
            com.ss.android.ugc.aweme.commerce.preview.c r2 = (com.ss.android.ugc.aweme.commerce.preview.c) r2
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.commerce.preview.VideoCommentAdapter.f37283f
            r16 = 0
            r17 = 28809(0x7089, float:4.037E-41)
            java.lang.Class[] r3 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.commerce.preview.c> r4 = com.ss.android.ugc.aweme.commerce.preview.c.class
            r3[r11] = r4
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r0
            r18 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r3 == 0) goto L_0x061c
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.commerce.preview.VideoCommentAdapter.f37283f
            r16 = 0
            r17 = 28809(0x7089, float:4.037E-41)
            java.lang.Class[] r2 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.commerce.preview.c> r3 = com.ss.android.ugc.aweme.commerce.preview.c.class
            r2[r11] = r3
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r0
            r18 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0623
        L_0x061c:
            java.lang.String r3 = "loadMoreClickListener"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r3)
            r0.g = r2
        L_0x0623:
            android.widget.FrameLayout r0 = r7.g
            if (r0 != 0) goto L_0x062c
            java.lang.String r2 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x062c:
            android.view.View r0 = (android.view.View) r0
            android.view.View r0 = r0.findViewById(r1)
            android.support.v7.widget.RecyclerView r0 = (android.support.v7.widget.RecyclerView) r0
            java.lang.String r1 = "headerView.videoCommentRV"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.commerce.preview.VideoCommentAdapter r1 = r7.ap
            if (r1 != 0) goto L_0x0642
            java.lang.String r2 = "mVideoCommentAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0642:
            android.support.v7.widget.RecyclerView$Adapter r1 = (android.support.v7.widget.RecyclerView.Adapter) r1
            r0.setAdapter(r1)
            android.widget.FrameLayout r0 = r7.g
            if (r0 != 0) goto L_0x0650
            java.lang.String r1 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0650:
            android.view.View r0 = (android.view.View) r0
            r1 = 2131171336(0x7f071808, float:1.7957056E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$m r1 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$m
            r1.<init>(r7)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
        L_0x0665:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28587(0x6fab, float:4.0059E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x068a
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28587(0x6fab, float:4.0059E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0822
        L_0x068a:
            java.lang.String r0 = r7.ar
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r0
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.commerce.a.a.f36665a
            r16 = 1
            r17 = 28011(0x6d6b, float:3.9252E-41)
            java.lang.Class[] r1 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r11] = r2
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r19 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r18 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r1 == 0) goto L_0x06c4
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r0
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.commerce.a.a.f36665a
            r16 = 1
            r17 = 28011(0x6d6b, float:3.9252E-41)
            java.lang.Class[] r0 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r19 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            r13 = r0
            com.ss.android.ugc.aweme.feed.model.Aweme r13 = (com.ss.android.ugc.aweme.feed.model.Aweme) r13
            goto L_0x06e7
        L_0x06c4:
            if (r0 == 0) goto L_0x06e6
            com.ss.android.ugc.aweme.feed.a r1 = com.ss.android.ugc.aweme.feed.a.a()
            com.ss.android.ugc.aweme.feed.model.Aweme r13 = r1.b((java.lang.String) r0)
            if (r13 == 0) goto L_0x06d1
            goto L_0x06e7
        L_0x06d1:
            com.ss.android.ugc.aweme.commercialize.feed.j r1 = com.ss.android.ugc.aweme.commercialize.feed.j.a()
            com.ss.android.ugc.aweme.feed.model.Aweme r13 = r1.a((java.lang.String) r0)
            if (r13 == 0) goto L_0x06dc
            goto L_0x06e7
        L_0x06dc:
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.commerce.a.a.f36666b
            java.lang.Object r0 = r1.get(r0)
            r13 = r0
            com.ss.android.ugc.aweme.feed.model.Aweme r13 = (com.ss.android.ugc.aweme.feed.model.Aweme) r13
            goto L_0x06e7
        L_0x06e6:
            r13 = 0
        L_0x06e7:
            r0 = 2131168759(0x7f070df7, float:1.7951829E38)
            if (r13 == 0) goto L_0x080a
            int r1 = r13.getAwemeType()
            if (r1 == r10) goto L_0x080a
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r2 = "SharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.app.an r1 = r1.getEnableFloatVideo()
            java.lang.String r2 = "SharePrefCache.inst().enableFloatVideo"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.Object r1 = r1.c()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x0714
            goto L_0x080a
        L_0x0714:
            com.ss.android.ugc.aweme.longvideo.b.e r1 = new com.ss.android.ugc.aweme.longvideo.b.e
            android.view.View r2 = r7.e((int) r0)
            com.ss.android.ugc.aweme.views.RoundedRelativeLayout r2 = (com.ss.android.ugc.aweme.views.RoundedRelativeLayout) r2
            java.lang.String r3 = "out_box"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            android.content.Context r2 = r2.getContext()
            r3 = 1116471296(0x428c0000, float:70.0)
            float r2 = com.bytedance.common.utility.UIUtils.dip2Px(r2, r3)
            int r2 = (int) r2
            android.view.View r3 = r7.e((int) r0)
            com.ss.android.ugc.aweme.views.RoundedRelativeLayout r3 = (com.ss.android.ugc.aweme.views.RoundedRelativeLayout) r3
            java.lang.String r4 = "out_box"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            android.content.Context r3 = r3.getContext()
            r4 = 1125842944(0x431b0000, float:155.0)
            float r3 = com.bytedance.common.utility.UIUtils.dip2Px(r3, r4)
            int r3 = (int) r3
            r1.<init>(r2, r3)
            com.ss.android.ugc.aweme.feed.model.Video r2 = r13.getVideo()
            if (r2 == 0) goto L_0x07a7
            com.ss.android.ugc.aweme.feed.model.Video r2 = r13.getVideo()
            java.lang.String r3 = "aweme.video"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            int r2 = r2.getWidth()
            if (r2 == 0) goto L_0x07a7
            com.ss.android.ugc.aweme.feed.model.Video r2 = r13.getVideo()
            java.lang.String r3 = "aweme.video"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            int r2 = r2.getHeight()
            com.ss.android.ugc.aweme.feed.model.Video r3 = r13.getVideo()
            java.lang.String r4 = "aweme.video"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            int r3 = r3.getWidth()
            int r2 = r2 / r3
            if (r2 > 0) goto L_0x07a7
            android.view.View r2 = r7.e((int) r0)
            com.ss.android.ugc.aweme.views.RoundedRelativeLayout r2 = (com.ss.android.ugc.aweme.views.RoundedRelativeLayout) r2
            java.lang.String r3 = "out_box"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            android.content.Context r2 = r2.getContext()
            r3 = 1120927744(0x42d00000, float:104.0)
            float r2 = com.bytedance.common.utility.UIUtils.dip2Px(r2, r3)
            int r2 = (int) r2
            r1.f53895a = r2
            android.view.View r2 = r7.e((int) r0)
            com.ss.android.ugc.aweme.views.RoundedRelativeLayout r2 = (com.ss.android.ugc.aweme.views.RoundedRelativeLayout) r2
            java.lang.String r3 = "out_box"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            android.content.Context r2 = r2.getContext()
            r3 = 1115684864(0x42800000, float:64.0)
            float r2 = com.bytedance.common.utility.UIUtils.dip2Px(r2, r3)
            int r2 = (int) r2
            r1.f53896b = r2
        L_0x07a7:
            com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowsePresenter r2 = new com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowsePresenter
            com.ss.android.ugc.aweme.video.o r15 = com.ss.android.ugc.aweme.video.o.b()
            r3 = 2131171393(0x7f071841, float:1.7957171E38)
            android.view.View r3 = r7.e((int) r3)
            r18 = r3
            com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView r18 = (com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView) r18
            android.view.View r3 = r7.e((int) r0)
            r19 = r3
            com.ss.android.ugc.aweme.views.RoundedRelativeLayout r19 = (com.ss.android.ugc.aweme.views.RoundedRelativeLayout) r19
            r20 = 2
            r21 = 0
            java.lang.String r22 = ""
            r23 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r24 = 1
            r14 = r2
            r16 = r13
            r17 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r7.f2895f = r2
            com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowsePresenter r1 = r7.f2895f
            if (r1 == 0) goto L_0x07e1
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$h r2 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$h
            r2.<init>(r7, r13)
            com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowsePresenter$a r2 = (com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowsePresenter.a) r2
            r1.i = r2
        L_0x07e1:
            com.ss.android.ugc.aweme.commerce.floatvideo.FloatVideoBrowsePresenter r1 = r7.f2895f
            if (r1 == 0) goto L_0x07e8
            r1.b()
        L_0x07e8:
            r1 = 2131166829(0x7f07066d, float:1.7947914E38)
            android.view.View r1 = r7.e((int) r1)
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$i r2 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$i
            r2.<init>(r7)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            android.view.View r0 = r7.e((int) r0)
            com.ss.android.ugc.aweme.views.RoundedRelativeLayout r0 = (com.ss.android.ugc.aweme.views.RoundedRelativeLayout) r0
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$j r1 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$j
            r1.<init>(r7)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            goto L_0x0822
        L_0x080a:
            android.view.View r0 = r7.e((int) r0)
            com.ss.android.ugc.aweme.views.RoundedRelativeLayout r0 = (com.ss.android.ugc.aweme.views.RoundedRelativeLayout) r0
            java.lang.String r1 = "out_box"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0946
            android.view.View r0 = (android.view.View) r0
            r1 = 8
            r0.setVisibility(r1)
        L_0x0822:
            r7.b((boolean) r12)
            com.ss.android.ugc.aweme.commerce.service.l.c$a r0 = com.ss.android.ugc.aweme.commerce.service.l.c.f37989a
            long r1 = android.os.SystemClock.uptimeMillis()
            long r3 = r7.r
            long r1 = r1 - r3
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r1)
            r13[r11] = r3
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.commerce.service.l.c.a.f37990a
            r16 = 0
            r17 = 29965(0x750d, float:4.199E-41)
            java.lang.Class[] r3 = new java.lang.Class[r12]
            java.lang.Class r4 = java.lang.Long.TYPE
            r3[r11] = r4
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r0
            r18 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r3 == 0) goto L_0x086c
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r1)
            r13[r11] = r3
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.commerce.service.l.c.a.f37990a
            r16 = 0
            r17 = 29965(0x750d, float:4.199E-41)
            java.lang.Class[] r1 = new java.lang.Class[r12]
            java.lang.Class r2 = java.lang.Long.TYPE
            r1[r11] = r2
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r0
            r18 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0880
        L_0x086c:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r3 = "duration"
            r0.put(r3, r1)
            java.lang.String r1 = "aweme_commerce_seeding_display_time"
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            com.ss.android.ugc.aweme.base.n.a((java.lang.String) r1, (org.json.JSONObject) r0, (org.json.JSONObject) r2)
        L_0x0880:
            r25.D()
        L_0x0883:
            java.lang.String r0 = r26.getPromotionId()
            java.lang.String r1 = r26.getProductId()
            r2 = 4
            r9 = 0
            r7.a((java.lang.String) r0, (java.lang.String) r1, (kotlin.jvm.functions.Function1<? super com.ss.android.ugc.aweme.commerce.service.models.p, kotlin.Unit>) null)
            java.lang.String r13 = r26.getPromotionId()
            java.lang.String r8 = r26.getProductId()
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r13
            r0[r12] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28571(0x6f9b, float:4.0036E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x08d4
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r13
            r0[r12] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28571(0x6f9b, float:4.0036E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0932
        L_0x08d4:
            com.ss.android.ugc.aweme.commerce.preview.api.a r0 = com.ss.android.ugc.aweme.commerce.preview.api.a.f37316c
            java.lang.Object[] r14 = new java.lang.Object[r10]
            r14[r11] = r13
            r14[r12] = r8
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.commerce.preview.api.a.f37314a
            r17 = 0
            r18 = 28866(0x70c2, float:4.045E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r11] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r12] = r2
            java.lang.Class<a.i> r20 = a.i.class
            r15 = r0
            r19 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r1 == 0) goto L_0x0918
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r1[r11] = r13
            r1[r12] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.commerce.preview.api.a.f37314a
            r13 = 0
            r14 = 28866(0x70c2, float:4.045E-41)
            java.lang.Class[] r15 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r15[r11] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r15[r12] = r3
            java.lang.Class<a.i> r16 = a.i.class
            r10 = r1
            r11 = r0
            r12 = r2
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            a.i r0 = (a.i) r0
            goto L_0x0926
        L_0x0918:
            com.ss.android.ugc.aweme.commerce.preview.api.PreviewApi r0 = com.ss.android.ugc.aweme.commerce.preview.api.a.f37315b
            if (r13 != 0) goto L_0x091e
            java.lang.String r13 = ""
        L_0x091e:
            if (r8 != 0) goto L_0x0922
            java.lang.String r8 = ""
        L_0x0922:
            a.i r0 = r0.getShopCommentList(r13, r8)
        L_0x0926:
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$ab r1 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$ab
            r1.<init>(r7)
            a.g r1 = (a.g) r1
            java.util.concurrent.Executor r2 = a.i.f1052b
            r0.a((a.g<TResult, TContinuationResult>) r1, (java.util.concurrent.Executor) r2)
        L_0x0932:
            java.lang.String r0 = "open_add_cart_dialog"
            com.ss.android.ugc.aweme.commerce.service.models.n r1 = r7.q
            if (r1 == 0) goto L_0x093b
            java.lang.String r13 = r1.p
            goto L_0x093c
        L_0x093b:
            r13 = r9
        L_0x093c:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r13)
            if (r0 == 0) goto L_0x0945
            r25.l()
        L_0x0945:
            return
        L_0x0946:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.view.View"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.a(com.ss.android.ugc.aweme.commerce.service.models.h, java.util.List):void");
    }

    public final void a(String str, String str2, Function1<? super com.ss.android.ugc.aweme.commerce.service.models.p, Unit> function1) {
        String str3 = str;
        String str4 = str2;
        Function1<? super com.ss.android.ugc.aweme.commerce.service.models.p, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{str3, str4, function12}, this, f2890a, false, 28568, new Class[]{String.class, String.class, Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, function12}, this, f2890a, false, 28568, new Class[]{String.class, String.class, Function1.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.commerce.preview.api.a aVar = com.ss.android.ugc.aweme.commerce.preview.api.a.f37316c;
        CommerceUser commerceUser = this.E;
        if (commerceUser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUserInfo");
        }
        String uid = commerceUser.getUid();
        dr a2 = dr.a();
        CommerceUser commerceUser2 = this.E;
        if (commerceUser2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUserInfo");
        }
        String a3 = a2.a(commerceUser2.getUid());
        Function2 aaVar = new aa(this, function12);
        if (PatchProxy.isSupport(new Object[]{str3, str4, 0, uid, a3, aaVar}, aVar, com.ss.android.ugc.aweme.commerce.preview.api.a.f37314a, false, 28854, new Class[]{String.class, String.class, Integer.TYPE, String.class, String.class, Function2.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, 0, uid, a3, aaVar}, aVar, com.ss.android.ugc.aweme.commerce.preview.api.a.f37314a, false, 28854, new Class[]{String.class, String.class, Integer.TYPE, String.class, String.class, Function2.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aaVar, "onResult");
        PreviewApi previewApi = com.ss.android.ugc.aweme.commerce.preview.api.a.f37315b;
        String str5 = str3 == null ? "" : str3;
        String str6 = str4 == null ? "" : str4;
        if (uid == null) {
            uid = "";
        }
        String str7 = uid;
        if (a3 == null) {
            a3 = "";
        }
        previewApi.shopSkuDynamicInfo(str5, str6, 0, str7, a3).a((a.g<TResult, TContinuationResult>) new a.b<TResult,TContinuationResult>(aaVar, str4, str3), a.i.f1052b);
    }

    public final void a(int i2, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2890a, false, 28586, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2)}, this, f2890a, false, 28586, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = ((RecyclerView) e((int) C0906R.id.cc5)).findViewHolderForAdapterPosition(i2);
        if (findViewHolderForAdapterPosition instanceof PreviewVideoHolderV2) {
            ((PreviewVideoHolderV2) findViewHolderForAdapterPosition).a(z2);
            k();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r26) {
        /*
            r25 = this;
            r7 = r25
            r8 = r26
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r26)
            r10 = 0
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 28590(0x6fae, float:4.0063E-41)
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003e
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r26)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28590(0x6fae, float:4.0063E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003e:
            com.ss.android.ugc.aweme.commerce.service.logs.at r0 = new com.ss.android.ugc.aweme.commerce.service.logs.at
            r0.<init>()
            com.ss.android.ugc.aweme.commerce.service.models.CommerceUser r1 = r7.E
            if (r1 != 0) goto L_0x004c
            java.lang.String r2 = "mUserInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x004c:
            java.lang.String r1 = r1.getUid()
            r0.h = r1
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r7.D
            if (r1 != 0) goto L_0x005b
            java.lang.String r2 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x005b:
            java.lang.String r1 = r1.getPromotionId()
            r0.g = r1
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r7.D
            if (r1 != 0) goto L_0x006a
            java.lang.String r2 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x006a:
            long r1 = r1.getCommodityType()
            r0.i = r1
            java.lang.String r1 = r7.F
            r0.f38092f = r1
            if (r8 == 0) goto L_0x0079
            java.lang.String r1 = "click_add_to_cart"
            goto L_0x007b
        L_0x0079:
            java.lang.String r1 = "click_product"
        L_0x007b:
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commerce.service.logs.at.f38091a
            r14 = 0
            r15 = 29762(0x7442, float:4.1705E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r10] = r3
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.logs.at> r17 = com.ss.android.ugc.aweme.commerce.service.logs.at.class
            r12 = r0
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x00b0
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commerce.service.logs.at.f38091a
            r14 = 0
            r15 = 29762(0x7442, float:4.1705E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r10] = r2
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.logs.at> r17 = com.ss.android.ugc.aweme.commerce.service.logs.at.class
            r12 = r0
            r16 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            com.ss.android.ugc.aweme.commerce.service.logs.at r0 = (com.ss.android.ugc.aweme.commerce.service.logs.at) r0
            goto L_0x00b7
        L_0x00b0:
            java.lang.String r2 = "clickType"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
            r0.j = r1
        L_0x00b7:
            r0.b()
            com.ss.android.ugc.aweme.commerce.service.models.y r0 = r7.G
            r1 = 0
            if (r0 == 0) goto L_0x00ce
            java.util.Map r0 = r0.getSkuList()
            if (r0 == 0) goto L_0x00ce
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x00cf
        L_0x00ce:
            r0 = r1
        L_0x00cf:
            if (r0 != 0) goto L_0x00d2
            goto L_0x00ea
        L_0x00d2:
            int r2 = r0.intValue()
            if (r2 != 0) goto L_0x00ea
            r0 = r7
            android.content.Context r0 = (android.content.Context) r0
            com.ss.android.ugc.aweme.commerce.service.l.g$a r1 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
            r2 = 2131561425(0x7f0d0bd1, float:1.874825E38)
            java.lang.Object[] r3 = new java.lang.Object[r10]
            java.lang.String r1 = r1.a(r0, r2, r3)
            com.ss.android.ugc.aweme.commerce.e.b.a(r0, r1)
            return
        L_0x00ea:
            if (r8 == 0) goto L_0x00fe
            java.lang.String r2 = r7.y
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00fe
            java.lang.String r2 = r7.y
            if (r2 != 0) goto L_0x0144
            kotlin.jvm.internal.Intrinsics.throwNpe()
            goto L_0x0144
        L_0x00fe:
            if (r8 != 0) goto L_0x0116
            boolean r2 = r7.z
            if (r2 == 0) goto L_0x0116
            java.lang.String r2 = r7.y
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0116
            java.lang.String r2 = r7.y
            if (r2 != 0) goto L_0x0144
            kotlin.jvm.internal.Intrinsics.throwNpe()
            goto L_0x0144
        L_0x0116:
            com.ss.android.ugc.aweme.commerce.service.models.h r2 = r7.D
            if (r2 != 0) goto L_0x011f
            java.lang.String r3 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x011f:
            com.ss.android.ugc.aweme.commerce.service.models.r r2 = r2.getToutiao()
            if (r2 == 0) goto L_0x012a
            int r2 = r2.getMinPrice()
            goto L_0x012b
        L_0x012a:
            r2 = 0
        L_0x012b:
            com.ss.android.ugc.aweme.commerce.service.models.h r3 = r7.D
            if (r3 != 0) goto L_0x0134
            java.lang.String r4 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x0134:
            com.ss.android.ugc.aweme.commerce.service.models.r r3 = r3.getToutiao()
            if (r3 == 0) goto L_0x013f
            int r3 = r3.getMaxPrice()
            goto L_0x0140
        L_0x013f:
            r3 = 0
        L_0x0140:
            java.lang.String r2 = com.ss.android.ugc.aweme.commerce.service.l.d.a((int) r2, (int) r3)
        L_0x0144:
            com.ss.android.ugc.aweme.commerce.service.models.h r3 = r7.D
            if (r3 != 0) goto L_0x014d
            java.lang.String r4 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x014d:
            boolean r3 = com.ss.android.ugc.aweme.commerce.service.l.d.a((com.ss.android.ugc.aweme.commerce.service.models.h) r3)
            com.ss.android.ugc.aweme.commerce.service.models.h r4 = r7.D
            if (r4 != 0) goto L_0x015a
            java.lang.String r5 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x015a:
            com.ss.android.ugc.aweme.commerce.service.models.CommerceUser r5 = r7.E
            if (r5 != 0) goto L_0x0163
            java.lang.String r6 = "mUserInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
        L_0x0163:
            java.lang.String r5 = r5.getUid()
            java.lang.String r6 = r7.F
            com.ss.android.ugc.aweme.commerce.service.models.ak r12 = com.ss.android.ugc.aweme.commerce.service.l.d.a(r4, r5, r6)
            com.ss.android.ugc.aweme.commerce.service.models.y r4 = r7.G
            com.ss.android.ugc.aweme.commerce.service.l.d.a((com.ss.android.ugc.aweme.commerce.service.models.ak) r12, (com.ss.android.ugc.aweme.commerce.service.models.y) r4)
            if (r0 != 0) goto L_0x0176
            goto L_0x01fe
        L_0x0176:
            int r0 = r0.intValue()
            if (r0 != r9) goto L_0x01fe
            if (r8 == 0) goto L_0x01fe
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r12.l
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            r2.element = r1
            com.ss.android.ugc.aweme.commerce.service.models.y r1 = r7.G
            if (r1 == 0) goto L_0x01ae
            java.util.Map r1 = r1.getSkuList()
            if (r1 == 0) goto L_0x01ae
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0199:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01ae
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r2.element = r3
            goto L_0x0199
        L_0x01ae:
            T r1 = r2.element
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x01fd
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r3 = "_"
            kotlin.text.Regex r4 = new kotlin.text.Regex
            r4.<init>((java.lang.String) r3)
            java.util.List r1 = r4.split(r1, r10)
            if (r1 == 0) goto L_0x01fd
            int r3 = r1.size()
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x01cf:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x01df
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            r3[r10] = r4
            int r10 = r10 + r9
            goto L_0x01cf
        L_0x01df:
            com.ss.android.ugc.aweme.commerce.preview.pops.b$a r11 = com.ss.android.ugc.aweme.commerce.preview.pops.b.j
            T r1 = r2.element
            r13 = r1
            java.lang.String r13 = (java.lang.String) r13
            r14 = 1
            r15 = r7
            android.content.Context r15 = (android.content.Context) r15
            r17 = 0
            r18 = 0
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$w r1 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$w
            r1.<init>(r7, r12, r2, r0)
            r19 = r1
            kotlin.jvm.functions.Function4 r19 = (kotlin.jvm.functions.Function4) r19
            r16 = r3
            r11.a(r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x01fd:
            return
        L_0x01fe:
            java.lang.String r0 = r7.H
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x020e
            if (r12 == 0) goto L_0x020e
            java.lang.String r0 = r7.H
            r12.q = r0
        L_0x020e:
            java.lang.String r0 = r7.I
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x021e
            if (r12 == 0) goto L_0x021e
            java.lang.String r0 = r7.I
            r12.r = r0
        L_0x021e:
            java.lang.String r0 = r7.J
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x022e
            if (r12 == 0) goto L_0x022e
            java.lang.String r0 = r7.J
            r12.k = r0
        L_0x022e:
            java.lang.String r0 = r7.K
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x023e
            if (r12 == 0) goto L_0x023e
            java.lang.String r0 = r7.K
            r12.i = r0
        L_0x023e:
            java.lang.String r0 = "commodity_page"
            r12.s = r0
            com.ss.android.ugc.aweme.commerce.preview.pops.SkuSelectPopUpDialogFragment$a r0 = com.ss.android.ugc.aweme.commerce.preview.pops.SkuSelectPopUpDialogFragment.m
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r26)
            java.lang.String r5 = "defaultPrice"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r5)
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$x r5 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$x
            r5.<init>(r7)
            kotlin.jvm.functions.Function4 r5 = (kotlin.jvm.functions.Function4) r5
            com.ss.android.ugc.aweme.commerce.service.models.aa r6 = r7.v
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$y r11 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$y
            r11.<init>(r7, r8)
            kotlin.jvm.functions.Function0 r11 = (kotlin.jvm.functions.Function0) r11
            r8 = 7
            java.lang.Object[] r13 = new java.lang.Object[r8]
            r13[r10] = r4
            r13[r9] = r2
            java.lang.Byte r14 = java.lang.Byte.valueOf(r3)
            r15 = 2
            r13[r15] = r14
            r20 = 3
            r13[r20] = r5
            r21 = 4
            r13[r21] = r1
            r22 = 5
            r13[r22] = r6
            r23 = 6
            r13[r23] = r11
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.commerce.preview.pops.SkuSelectPopUpDialogFragment.a.f37541a
            r17 = 0
            r18 = 29089(0x71a1, float:4.0762E-41)
            java.lang.Class[] r14 = new java.lang.Class[r8]
            java.lang.Class<java.lang.Boolean> r19 = java.lang.Boolean.class
            r14[r10] = r19
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r14[r9] = r19
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r14[r15] = r19
            java.lang.Class<kotlin.jvm.functions.Function4> r19 = kotlin.jvm.functions.Function4.class
            r14[r20] = r19
            java.lang.Class<kotlin.jvm.functions.Function2> r19 = kotlin.jvm.functions.Function2.class
            r14[r21] = r19
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.aa> r19 = com.ss.android.ugc.aweme.commerce.service.models.aa.class
            r14[r22] = r19
            java.lang.Class<kotlin.jvm.functions.Function0> r19 = kotlin.jvm.functions.Function0.class
            r14[r23] = r19
            java.lang.Class<com.ss.android.ugc.aweme.commerce.preview.pops.SkuSelectPopUpDialogFragment> r19 = com.ss.android.ugc.aweme.commerce.preview.pops.SkuSelectPopUpDialogFragment.class
            r24 = r14
            r14 = r0
            r1 = 2
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r24
            boolean r13 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r13 == 0) goto L_0x02f9
            java.lang.Object[] r13 = new java.lang.Object[r8]
            r13[r10] = r4
            r13[r9] = r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r3)
            r13[r1] = r2
            r13[r20] = r5
            r2 = 0
            r13[r21] = r2
            r13[r22] = r6
            r13[r23] = r11
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.commerce.preview.pops.SkuSelectPopUpDialogFragment.a.f37541a
            r16 = 0
            r17 = 29089(0x71a1, float:4.0762E-41)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            r2[r10] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r9] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r2[r1] = r3
            java.lang.Class<kotlin.jvm.functions.Function4> r1 = kotlin.jvm.functions.Function4.class
            r2[r20] = r1
            java.lang.Class<kotlin.jvm.functions.Function2> r1 = kotlin.jvm.functions.Function2.class
            r2[r21] = r1
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.aa> r1 = com.ss.android.ugc.aweme.commerce.service.models.aa.class
            r2[r22] = r1
            java.lang.Class<kotlin.jvm.functions.Function0> r1 = kotlin.jvm.functions.Function0.class
            r2[r23] = r1
            java.lang.Class<com.ss.android.ugc.aweme.commerce.preview.pops.SkuSelectPopUpDialogFragment> r19 = com.ss.android.ugc.aweme.commerce.preview.pops.SkuSelectPopUpDialogFragment.class
            r14 = r0
            r18 = r2
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            com.ss.android.ugc.aweme.commerce.preview.pops.SkuSelectPopUpDialogFragment r0 = (com.ss.android.ugc.aweme.commerce.preview.pops.SkuSelectPopUpDialogFragment) r0
            goto L_0x0378
        L_0x02f9:
            java.lang.String r0 = "defaultPrice"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            java.lang.String r0 = "addCartListener"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.ss.android.ugc.aweme.commerce.preview.pops.SkuSelectPopUpDialogFragment r8 = new com.ss.android.ugc.aweme.commerce.preview.pops.SkuSelectPopUpDialogFragment
            r8.<init>()
            java.lang.String r13 = "args_for_add_cart"
            if (r4 == 0) goto L_0x0316
            boolean r4 = r4.booleanValue()
            goto L_0x0317
        L_0x0316:
            r4 = 0
        L_0x0317:
            r0.putBoolean(r13, r4)
            java.lang.String r4 = "args_default_price"
            r0.putString(r4, r2)
            java.lang.String r2 = "args_buy_single_only"
            r0.putBoolean(r2, r3)
            r8.setArguments(r0)
            java.lang.Object[] r13 = new java.lang.Object[r1]
            r13[r10] = r5
            r0 = 0
            r13[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.commerce.preview.pops.SkuSelectPopUpDialogFragment.f37535a
            r16 = 0
            r17 = 29078(0x7196, float:4.0747E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<kotlin.jvm.functions.Function4> r2 = kotlin.jvm.functions.Function4.class
            r0[r10] = r2
            java.lang.Class<kotlin.jvm.functions.Function2> r2 = kotlin.jvm.functions.Function2.class
            r0[r9] = r2
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r8
            r18 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x0369
            java.lang.Object[] r13 = new java.lang.Object[r1]
            r13[r10] = r5
            r0 = 0
            r13[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.commerce.preview.pops.SkuSelectPopUpDialogFragment.f37535a
            r16 = 0
            r17 = 29078(0x7196, float:4.0747E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<kotlin.jvm.functions.Function4> r1 = kotlin.jvm.functions.Function4.class
            r0[r10] = r1
            java.lang.Class<kotlin.jvm.functions.Function2> r1 = kotlin.jvm.functions.Function2.class
            r0[r9] = r1
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r8
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0373
        L_0x0369:
            java.lang.String r0 = "addCartListener"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            r8.i = r5
            r0 = 0
            r8.j = r0
        L_0x0373:
            r8.f37540f = r6
            r8.k = r11
            r0 = r8
        L_0x0378:
            r0.f37537c = r12
            com.ss.android.ugc.aweme.commercialize.utils.a.a.a$a r1 = r25.m()
            r0.f37538d = r1
            android.support.v4.app.FragmentManager r1 = r25.getSupportFragmentManager()
            java.lang.Object[] r13 = new java.lang.Object[r9]
            r13[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.commerce.preview.pops.SkuSelectPopUpDialogFragment.f37535a
            r16 = 0
            r17 = 29083(0x719b, float:4.0754E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<android.support.v4.app.FragmentManager> r3 = android.support.v4.app.FragmentManager.class
            r2[r10] = r3
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r0
            r18 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x03b8
            java.lang.Object[] r13 = new java.lang.Object[r9]
            r13[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.commerce.preview.pops.SkuSelectPopUpDialogFragment.f37535a
            r16 = 0
            r17 = 29083(0x719b, float:4.0754E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<android.support.v4.app.FragmentManager> r2 = android.support.v4.app.FragmentManager.class
            r1[r10] = r2
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r0
            r18 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x03cf
        L_0x03b8:
            com.ss.android.ugc.aweme.commerce.service.models.ak r2 = r0.f37537c
            if (r2 == 0) goto L_0x03cf
            com.ss.android.ugc.aweme.commerce.service.models.ak r2 = r0.f37537c
            if (r2 == 0) goto L_0x03c8
            java.util.List<com.ss.android.ugc.aweme.commerce.service.models.ab> r2 = r2.f38187a
            if (r2 == 0) goto L_0x03c8
            int r10 = r2.size()
        L_0x03c8:
            if (r10 == 0) goto L_0x03cf
            java.lang.String r2 = "TAG_SKU_INFO"
            r0.show(r1, r2)
        L_0x03cf:
            long r1 = r7.U
            r0.l = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.a(boolean):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(View view, com.ss.android.ugc.aweme.commerce.service.models.c cVar, boolean z2, Function1<? super com.ss.android.ugc.aweme.commerce.service.models.c, Unit> function1) {
        View view2 = view;
        com.ss.android.ugc.aweme.commerce.service.models.c cVar2 = cVar;
        boolean z3 = z2;
        Function1<? super com.ss.android.ugc.aweme.commerce.service.models.c, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{view2, cVar2, Byte.valueOf(z2 ? (byte) 1 : 0), function12}, this, f2890a, false, 28626, new Class[]{View.class, com.ss.android.ugc.aweme.commerce.service.models.c.class, Boolean.TYPE, Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, cVar2, Byte.valueOf(z2), function12}, this, f2890a, false, 28626, new Class[]{View.class, com.ss.android.ugc.aweme.commerce.service.models.c.class, Boolean.TYPE, Function1.class}, Void.TYPE);
            return;
        }
        view2.setTag(C0906R.id.bvn, "");
        RemoteImageView remoteImageView = (RemoteImageView) view2.findViewById(C0906R.id.bvp);
        DmtTextView dmtTextView = (DmtTextView) view2.findViewById(C0906R.id.bvo);
        DmtTextView dmtTextView2 = (DmtTextView) view2.findViewById(C0906R.id.bvq);
        ImageView imageView = (ImageView) view2.findViewById(C0906R.id.b3p);
        l.a aVar = com.ss.android.ugc.aweme.commerce.service.l.l.f38039a;
        Intrinsics.checkExpressionValueIsNotNull(remoteImageView, "icon");
        aVar.a(remoteImageView, cVar.preferredImages());
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "des");
        dmtTextView.setText(cVar.longTitle());
        dmtTextView.setTextColor(com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(this, C0906R.color.h));
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "price");
        dmtTextView2.setText(com.ss.android.ugc.aweme.commerce.service.l.e.f38011b.a(cVar.getPrice()));
        if (cVar.isOnSale()) {
            Intrinsics.checkExpressionValueIsNotNull(imageView, "ivOffShelf");
            imageView.setVisibility(8);
        } else {
            Intrinsics.checkExpressionValueIsNotNull(imageView, "ivOffShelf");
            imageView.setVisibility(0);
        }
        view2.setOnClickListener(new k(function12, cVar2));
        if (!z3) {
            FrameLayout frameLayout = this.g;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            ((LinearLayout) frameLayout.findViewById(C0906R.id.bvl)).getHitRect(this.ah);
        } else {
            FrameLayout frameLayout2 = this.g;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            ((LinearLayout) frameLayout2.findViewById(C0906R.id.cqr)).getHitRect(this.ah);
        }
        if (view2.getLocalVisibleRect(this.ah)) {
            Object tag = view2.getTag(C0906R.id.bvn);
            if (!(tag instanceof String)) {
                tag = null;
            }
            if (!Intrinsics.areEqual((Object) "position_taken", (Object) (String) tag)) {
                a(cVar2, z3);
                view2.setTag(C0906R.id.bvn, "position_taken");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        if (r0 == null) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(kotlin.jvm.functions.Function0<kotlin.Unit> r17) {
        /*
            r16 = this;
            r7 = r16
            r8 = r17
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<kotlin.jvm.functions.Function0> r1 = kotlin.jvm.functions.Function0.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 28629(0x6fd5, float:4.0118E-41)
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28629(0x6fd5, float:4.0118E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<kotlin.jvm.functions.Function0> r1 = kotlin.jvm.functions.Function0.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            com.ss.android.ugc.aweme.commerce.preview.api.a r9 = com.ss.android.ugc.aweme.commerce.preview.api.a.f37316c
            com.ss.android.ugc.aweme.commerce.service.models.h r0 = r7.D
            if (r0 != 0) goto L_0x0041
            java.lang.String r1 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0041:
            java.lang.String r10 = r0.getPromotionId()
            if (r10 != 0) goto L_0x004a
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x004a:
            com.ss.android.ugc.aweme.commerce.service.models.h r0 = r7.D
            if (r0 != 0) goto L_0x0053
            java.lang.String r1 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0053:
            java.lang.String r11 = r0.getProductId()
            if (r11 != 0) goto L_0x005c
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x005c:
            java.lang.String r12 = r7.R
            java.lang.String r13 = r7.N
            com.ss.android.ugc.aweme.commerce.service.models.n r0 = r7.q
            if (r0 == 0) goto L_0x006c
            com.ss.android.ugc.aweme.commerce.service.models.b r0 = r0.f38222d
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = r0.f38194b
            if (r0 != 0) goto L_0x006e
        L_0x006c:
            java.lang.String r0 = ""
        L_0x006e:
            r14 = r0
            com.ss.android.ugc.aweme.commerce.service.models.CommerceUser r0 = r7.E
            if (r0 != 0) goto L_0x0078
            java.lang.String r1 = "mUserInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0078:
            java.lang.String r15 = r0.getUid()
            a.i r0 = r9.a((java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15)
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$ac r1 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$ac
            r1.<init>(r7, r8)
            a.g r1 = (a.g) r1
            java.util.concurrent.Executor r2 = a.i.f1052b
            r0.a((a.g<TResult, TContinuationResult>) r1, (java.util.concurrent.Executor) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.a(kotlin.jvm.functions.Function0):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, Function0<Unit> function0) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), function0}, this, f2890a, false, 28630, new Class[]{Integer.TYPE, Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), function0}, this, f2890a, false, 28630, new Class[]{Integer.TYPE, Function0.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.commerce.service.models.h hVar = this.D;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
        }
        String promotionId = hVar.getPromotionId();
        if (promotionId == null) {
            Intrinsics.throwNpe();
        }
        com.ss.android.ugc.aweme.commerce.service.models.h hVar2 = this.D;
        if (hVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
        }
        String productId = hVar2.getProductId();
        if (productId == null) {
            Intrinsics.throwNpe();
        }
        com.ss.android.ugc.aweme.commerce.preview.api.a.a(promotionId, productId, i2).a((a.g<TResult, TContinuationResult>) new ad<TResult,TContinuationResult>(this, function0), a.i.f1052b);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28559, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28559, new Class[0], Void.TYPE);
            return;
        }
        FrameLayout frameLayout = this.g;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        frameLayout.post(new v(this));
    }

    public final boolean j() {
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28583, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28583, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Collection collection = this.L;
        if (collection == null || collection.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return true;
        }
        return false;
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28589, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28589, new Class[0], Void.TYPE);
            return;
        }
        this.U = SystemClock.uptimeMillis();
        a(0, (Function0<Unit>) new d<Unit>(this));
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28545, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28545, new Class[0], Void.TYPE);
            return;
        }
        a(com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(this, C0906R.string.b75, new Object[0]), false);
    }

    public final void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28581, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28581, new Class[0], Void.TYPE);
            return;
        }
        this.u = false;
        h.f37502d.a((Activity) this);
        super.onBackPressed();
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28544, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28544, new Class[0], Void.TYPE);
            return;
        }
        a(com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(this, C0906R.string.b75, new Object[0]), false);
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28546, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28546, new Class[0], Void.TYPE);
            return;
        }
        a(com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(this, C0906R.string.b77, new Object[0]), true);
    }

    private final void B() {
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28553, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28553, new Class[0], Void.TYPE);
            return;
        }
        FrameLayout frameLayout = this.ab;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("footerView");
        }
        LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(C0906R.id.biz);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "footerView.loadingArea");
        linearLayout.setVisibility(4);
    }

    private final void D() {
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28577, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28577, new Class[0], Void.TYPE);
            return;
        }
        if (this.D != null) {
            com.ss.android.ugc.aweme.commerce.service.models.h hVar = this.D;
            if (hVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
            }
            if (!hVar.isThirdParty()) {
                com.ss.android.ugc.aweme.commerce.preview.api.a.f37316c.a().a((a.g<TResult, TContinuationResult>) new bm<TResult,TContinuationResult>(this), a.i.f1052b);
            }
        }
    }

    private final void E() {
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28616, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28616, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.commerce.billshare.b bVar = this.C;
        if (bVar != null) {
            bVar.f36752e = null;
        }
        this.C = new com.ss.android.ugc.aweme.commerce.billshare.b();
        com.ss.android.ugc.aweme.commerce.billshare.b bVar2 = this.C;
        if (bVar2 == null) {
            Intrinsics.throwNpe();
        }
        bVar2.f36752e = new bd(this);
        this.B = 0;
        this.f2892c.clear();
        com.ss.android.ugc.aweme.commerce.billshare.b bVar3 = this.C;
        if (bVar3 == null) {
            Intrinsics.throwNpe();
        }
        com.ss.android.ugc.aweme.commerce.service.models.h hVar = this.D;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
        }
        String promotionId = hVar.getPromotionId();
        if (promotionId == null) {
            Intrinsics.throwNpe();
        }
        bVar3.a(promotionId);
    }

    public final void A() {
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28643, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28643, new Class[0], Void.TYPE);
            return;
        }
        if (u().f37476c) {
            u().f37476c = false;
            ((ImageButton) e((int) C0906R.id.ahm)).animate().alpha(0.0f).setDuration(200).start();
        }
    }

    public final void finish() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28645, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28645, new Class[0], Void.TYPE);
            return;
        }
        if (this.D != null) {
            com.ss.android.ugc.aweme.commerce.service.models.h hVar = this.D;
            if (hVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
            }
            if (hVar.isAppointment()) {
                Intent intent = new Intent();
                com.ss.android.ugc.aweme.commerce.service.models.h hVar2 = this.D;
                if (hVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
                }
                com.ss.android.ugc.aweme.commerce.service.models.r toutiao = hVar2.getToutiao();
                if (toutiao != null) {
                    PromotionAppointment appointment = toutiao.getAppointment();
                    if (appointment != null) {
                        z2 = appointment.isAppointment();
                    }
                }
                intent.putExtra("key_appointment_status", z2);
                setResult(-1, intent);
            }
        }
        super.finish();
        if (isTaskRoot()) {
            com.ss.android.ugc.aweme.ag.h.a().a((Activity) this, "aweme://main");
        }
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28588, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28588, new Class[0], Void.TYPE);
            return;
        }
        FloatVideoBrowsePresenter floatVideoBrowsePresenter = this.f2895f;
        if (floatVideoBrowsePresenter != null) {
            floatVideoBrowsePresenter.c();
        }
        FloatVideoBrowsePresenter floatVideoBrowsePresenter2 = this.f2895f;
        if (floatVideoBrowsePresenter2 != null) {
            floatVideoBrowsePresenter2.a();
        }
        this.f2895f = null;
        this.ai = false;
        RoundedRelativeLayout roundedRelativeLayout = (RoundedRelativeLayout) e((int) C0906R.id.bvt);
        Intrinsics.checkExpressionValueIsNotNull(roundedRelativeLayout, "out_box");
        ViewParent parent = roundedRelativeLayout.getParent();
        if (parent != null) {
            ((View) parent).setVisibility(8);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.View");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.commercialize.utils.a.a.a.C0516a m() {
        /*
            r10 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f2890a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.utils.a.a.a$a> r7 = com.ss.android.ugc.aweme.commercialize.utils.a.a.a.C0516a.class
            r4 = 0
            r5 = 28591(0x6faf, float:4.0065E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f2890a
            r5 = 0
            r6 = 28591(0x6faf, float:4.0065E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.utils.a.a.a$a> r8 = com.ss.android.ugc.aweme.commercialize.utils.a.a.a.C0516a.class
            r3 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.commercialize.utils.a.a.a$a r0 = (com.ss.android.ugc.aweme.commercialize.utils.a.a.a.C0516a) r0
            return r0
        L_0x0026:
            java.lang.String r0 = r10.T
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = com.ss.android.ugc.aweme.commerce.a.a.a((java.lang.String) r0)
            boolean r1 = com.ss.android.ugc.aweme.commercialize.utils.c.u(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0077
            com.ss.android.ugc.aweme.commercialize.utils.a.a.a$a r1 = new com.ss.android.ugc.aweme.commercialize.utils.a.a.a$a
            if (r0 == 0) goto L_0x0043
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r0.getAwemeRawAd()
            if (r3 == 0) goto L_0x0043
            java.lang.Long r3 = r3.getCreativeId()
            r4 = r3
            goto L_0x0044
        L_0x0043:
            r4 = r2
        L_0x0044:
            if (r0 == 0) goto L_0x0052
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r0.getAwemeRawAd()
            if (r3 == 0) goto L_0x0052
            java.lang.String r3 = r3.getLogExtra()
            r5 = r3
            goto L_0x0053
        L_0x0052:
            r5 = r2
        L_0x0053:
            if (r0 == 0) goto L_0x0061
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r0.getAwemeRawAd()
            if (r3 == 0) goto L_0x0061
            java.lang.String r3 = r3.getDownloadUrl()
            r6 = r3
            goto L_0x0062
        L_0x0061:
            r6 = r2
        L_0x0062:
            if (r0 == 0) goto L_0x006e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x006e
            java.lang.String r2 = r0.getType()
        L_0x006e:
            r7 = r2
            r8 = 0
            r9 = 16
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r1
        L_0x0077:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.m():com.ss.android.ugc.aweme.commercialize.utils.a.a.a$a");
    }

    public final void n() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28597, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28597, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.miniapp_api.model.b a2 = new b.a().b("commodity_page").a();
        IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
        Context context = this;
        User user = this.W;
        String str2 = null;
        if (user != null) {
            str = user.getShopMicroApp();
        } else {
            str = null;
        }
        if (iMiniAppService.isMinAppAvailable(context, str)) {
            User user2 = this.W;
            if (user2 != null) {
                str2 = user2.getShopMicroApp();
            }
            iMiniAppService.openMiniApp(context, str2, a2);
            return;
        }
        User user3 = this.W;
        if (user3 != null) {
            str2 = user3.getShopMicroApp();
        }
        com.ss.android.ugc.aweme.commerce.a.a(str2, (Activity) this, (String) null, false, false, 28);
    }

    public final void r() {
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28620, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28620, new Class[0], Void.TYPE);
            return;
        }
        CommerceUser commerceUser = this.E;
        if (commerceUser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUserInfo");
        }
        com.ss.android.ugc.aweme.commerce.preview.api.a.a(commerceUser.getUid()).a((a.g<TResult, TContinuationResult>) new ah<TResult,TContinuationResult>(this), a.i.f1052b);
    }

    public final void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28582, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28582, new Class[0], Void.TYPE);
            return;
        }
        super.setStatusBarColor();
        if (!OSUtils.isEMUI3_0() && !OSUtils.isEMUI3_1()) {
            eb.a(getWindow());
            this.ag = ImmersionBar.with((Activity) this).statusBarDarkFont(true);
            ImmersionBar immersionBar = this.ag;
            if (immersionBar != null) {
                immersionBar.init();
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28556, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28556, new Class[0], Void.TYPE);
        } else if (!this.f2892c.isEmpty() && this.f2892c.size() >= 3) {
            List take = CollectionsKt.take(this.f2892c, 8);
            this.f2892c.clear();
            FrameLayout frameLayout = this.g;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(C0906R.id.drd);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "headerView.videoCommentContainer");
            linearLayout.setVisibility(0);
            FrameLayout frameLayout2 = this.g;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            LinearLayout linearLayout2 = (LinearLayout) frameLayout2.findViewById(C0906R.id.drg);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "headerView.videoCommentGuideContainer");
            linearLayout2.setVisibility(8);
            f();
            FrameLayout frameLayout3 = this.g;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            DmtTextView dmtTextView = (DmtTextView) frameLayout3.findViewById(C0906R.id.dre);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "headerView.videoCommentCountTV");
            dmtTextView.setText(com.ss.android.ugc.aweme.commerce.service.l.d.a((Context) this, this.B));
            VideoCommentAdapter videoCommentAdapter = this.ap;
            if (videoCommentAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVideoCommentAdapter");
            }
            videoCommentAdapter.setData(take);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f2890a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 28567(0x6f97, float:4.0031E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f2890a
            r5 = 0
            r6 = 28567(0x6f97, float:4.0031E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            com.ss.android.ugc.aweme.commerce.service.models.n r0 = r9.q
            r1 = 0
            if (r0 == 0) goto L_0x002b
            com.ss.android.ugc.aweme.commerce.service.models.b r0 = r0.f38222d
            goto L_0x002c
        L_0x002b:
            r0 = r1
        L_0x002c:
            if (r0 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.commerce.service.models.n r0 = r9.q
            if (r0 == 0) goto L_0x0038
            com.ss.android.ugc.aweme.commerce.service.models.b r0 = r0.f38222d
            if (r0 == 0) goto L_0x0038
            java.lang.String r1 = r0.f38194b
        L_0x0038:
            if (r1 != 0) goto L_0x003d
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x003d:
            r9.F = r1
            com.ss.android.ugc.aweme.commerce.promotion.a r0 = com.ss.android.ugc.aweme.commerce.promotion.a.f37668b
            java.lang.String r1 = r9.F
            com.ss.android.ugc.aweme.commerce.service.models.CommerceUser r2 = r9.E
            if (r2 != 0) goto L_0x004c
            java.lang.String r3 = "mUserInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x004c:
            java.lang.String r2 = r2.getUid()
            kotlin.jvm.functions.Function1<java.util.List<com.ss.android.ugc.aweme.commerce.service.models.h>, kotlin.Unit> r3 = r9.am
            kotlin.jvm.functions.Function1<org.json.JSONObject, kotlin.Unit> r4 = r9.w
            r0.a(r1, r2, r3, r4)
            return
        L_0x0058:
            com.ss.android.ugc.aweme.commerce.service.models.n r0 = r9.q
            if (r0 == 0) goto L_0x005f
            com.ss.android.ugc.aweme.commerce.service.models.l r0 = r0.f38223e
            goto L_0x0060
        L_0x005f:
            r0 = r1
        L_0x0060:
            if (r0 == 0) goto L_0x009f
            com.ss.android.ugc.aweme.commerce.service.models.n r0 = r9.q
            if (r0 == 0) goto L_0x006d
            com.ss.android.ugc.aweme.commerce.service.models.l r0 = r0.f38223e
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r0.f38212d
            goto L_0x006e
        L_0x006d:
            r0 = r1
        L_0x006e:
            r9.aw = r0
            com.ss.android.ugc.aweme.commerce.promotion.a r2 = com.ss.android.ugc.aweme.commerce.promotion.a.f37668b
            com.ss.android.ugc.aweme.commerce.service.models.n r0 = r9.q
            if (r0 == 0) goto L_0x007e
            com.ss.android.ugc.aweme.commerce.service.models.l r0 = r0.f38223e
            if (r0 == 0) goto L_0x007e
            java.lang.String r0 = r0.f38210b
            r3 = r0
            goto L_0x007f
        L_0x007e:
            r3 = r1
        L_0x007f:
            com.ss.android.ugc.aweme.commerce.service.models.n r0 = r9.q
            if (r0 == 0) goto L_0x0089
            com.ss.android.ugc.aweme.commerce.service.models.l r0 = r0.f38223e
            if (r0 == 0) goto L_0x0089
            java.lang.String r1 = r0.f38211c
        L_0x0089:
            r4 = r1
            com.ss.android.ugc.aweme.commerce.service.models.CommerceUser r0 = r9.E
            if (r0 != 0) goto L_0x0093
            java.lang.String r1 = "mUserInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0093:
            java.lang.String r5 = r0.getUid()
            kotlin.jvm.functions.Function1<com.ss.android.ugc.aweme.commerce.service.models.h, kotlin.Unit> r6 = r9.an
            kotlin.jvm.functions.Function1<org.json.JSONObject, kotlin.Unit> r7 = r9.w
            r2.a(r3, r4, r5, r6, r7)
            return
        L_0x009f:
            com.ss.android.ugc.aweme.commerce.service.l.c$a r0 = com.ss.android.ugc.aweme.commerce.service.l.c.f37989a
            java.lang.String r2 = "param is null "
            r0.a((java.lang.String) r2)
            kotlin.jvm.functions.Function1<org.json.JSONObject, kotlin.Unit> r0 = r9.w
            r0.invoke(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.g():void");
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28574, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28574, new Class[0], Void.TYPE);
            return;
        }
        List arrayList = new ArrayList();
        com.ss.android.ugc.aweme.commerce.service.models.h hVar = this.D;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
        }
        arrayList.add(hVar);
        arrayList.addAll(this.as);
        String str = this.F;
        n.a aVar = com.ss.android.ugc.aweme.commerce.service.models.n.r;
        com.ss.android.ugc.aweme.commerce.service.models.h hVar2 = this.D;
        if (hVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
        }
        if (aVar.a(hVar2.getOriginMediaId())) {
            com.ss.android.ugc.aweme.commerce.service.models.h hVar3 = this.D;
            if (hVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
            }
            str = hVar3.getOriginMediaId();
        }
        String str2 = str;
        a.C0462a aVar2 = com.ss.android.ugc.aweme.commerce.billshare.a.f36734c;
        Activity activity = this;
        com.ss.android.ugc.aweme.commerce.service.models.h hVar4 = this.D;
        if (hVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
        }
        CommerceUser commerceUser = this.E;
        if (commerceUser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUserInfo");
        }
        aVar2.a(activity, hVar4, commerceUser, "commodity_page", "click_full_screen_card", str2, false);
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28604, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28604, new Class[0], Void.TYPE);
            return;
        }
        FrameLayout frameLayout = this.g;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(C0906R.id.bvm);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "headerView.otherGoodsLayout");
        if (linearLayout.getVisibility() != 8) {
            FrameLayout frameLayout2 = this.g;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            ((LinearLayout) frameLayout2.findViewById(C0906R.id.bvl)).getHitRect(this.ah);
            FrameLayout frameLayout3 = this.g;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            LinearLayout linearLayout2 = (LinearLayout) frameLayout3.findViewById(C0906R.id.bvl);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "headerView.otherGoodsContainer");
            int childCount = linearLayout2.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                FrameLayout frameLayout4 = this.g;
                if (frameLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("headerView");
                }
                View childAt = ((LinearLayout) frameLayout4.findViewById(C0906R.id.bvl)).getChildAt(i2);
                if (childAt.getLocalVisibleRect(this.ah)) {
                    Object tag = childAt.getTag(C0906R.id.bvn);
                    if (!(tag instanceof String)) {
                        tag = null;
                    }
                    if (!Intrinsics.areEqual((Object) "position_taken", (Object) (String) tag)) {
                        a((com.ss.android.ugc.aweme.commerce.service.models.c) this.as.get(i2), false);
                        childAt.setTag(C0906R.id.bvn, "position_taken");
                    }
                }
            }
        }
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28605, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28605, new Class[0], Void.TYPE);
            return;
        }
        FrameLayout frameLayout = this.g;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(C0906R.id.cqr);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "headerView.shopContainer");
        if (linearLayout.getVisibility() != 8) {
            FrameLayout frameLayout2 = this.g;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            ((LinearLayout) frameLayout2.findViewById(C0906R.id.cqr)).getHitRect(this.ah);
            FrameLayout frameLayout3 = this.g;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            if (frameLayout3.findViewById(C0906R.id.cb1).getLocalVisibleRect(this.ah)) {
                FrameLayout frameLayout4 = this.g;
                if (frameLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("headerView");
                }
                Object tag = frameLayout4.findViewById(C0906R.id.cb1).getTag(C0906R.id.bvn);
                if (!(tag instanceof String)) {
                    tag = null;
                }
                if (!Intrinsics.areEqual((Object) "position_taken", (Object) (String) tag)) {
                    List<com.ss.android.ugc.aweme.commerce.service.models.w> list = this.az;
                    if (list != null) {
                        for (com.ss.android.ugc.aweme.commerce.service.models.w a2 : list) {
                            a((com.ss.android.ugc.aweme.commerce.service.models.c) a2, true);
                        }
                    }
                    FrameLayout frameLayout5 = this.g;
                    if (frameLayout5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    frameLayout5.findViewById(C0906R.id.cb1).setTag(C0906R.id.bvn, "position_taken");
                }
            }
        }
    }

    public final void t() {
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28625, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28625, new Class[0], Void.TYPE);
            return;
        }
        FrameLayout frameLayout = this.g;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(C0906R.id.cqr);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "headerView.shopContainer");
        if (linearLayout.getVisibility() != 8) {
            FrameLayout frameLayout2 = this.g;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            frameLayout2.getHitRect(this.ah);
            FrameLayout frameLayout3 = this.g;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            if (((LinearLayout) frameLayout3.findViewById(C0906R.id.cqr)).getLocalVisibleRect(this.ah)) {
                FrameLayout frameLayout4 = this.g;
                if (frameLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("headerView");
                }
                Object tag = ((LinearLayout) frameLayout4.findViewById(C0906R.id.cqr)).getTag(C0906R.id.bvn);
                if (!(tag instanceof String)) {
                    tag = null;
                }
                if (!Intrinsics.areEqual((Object) "position_taken", (Object) (String) tag)) {
                    com.ss.android.ugc.aweme.commerce.service.logs.aw awVar = new com.ss.android.ugc.aweme.commerce.service.logs.aw();
                    CommerceUser commerceUser = this.E;
                    if (commerceUser == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mUserInfo");
                    }
                    awVar.b(commerceUser.getUid()).a("commodity_page_product_detail").b();
                    FrameLayout frameLayout5 = this.g;
                    if (frameLayout5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    ((LinearLayout) frameLayout5.findViewById(C0906R.id.cqr)).setTag(C0906R.id.bvn, "position_taken");
                }
            }
        }
    }

    private final void F() {
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28631, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28631, new Class[0], Void.TYPE);
        } else if (this.as.isEmpty()) {
            FrameLayout frameLayout = this.g;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(C0906R.id.bvm);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "headerView.otherGoodsLayout");
            linearLayout.setVisibility(8);
        } else {
            FrameLayout frameLayout2 = this.g;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            LinearLayout linearLayout2 = (LinearLayout) frameLayout2.findViewById(C0906R.id.bvm);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "headerView.otherGoodsLayout");
            linearLayout2.setVisibility(0);
            FrameLayout frameLayout3 = this.g;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            LinearLayout linearLayout3 = (LinearLayout) frameLayout3.findViewById(C0906R.id.bvl);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "headerView.otherGoodsContainer");
            if (linearLayout3.getChildCount() != this.as.size()) {
                FrameLayout frameLayout4 = this.g;
                if (frameLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("headerView");
                }
                ((LinearLayout) frameLayout4.findViewById(C0906R.id.bvl)).removeAllViews();
                com.ss.android.ugc.aweme.framework.core.a b2 = com.ss.android.ugc.aweme.framework.core.a.b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "AppTracker.get()");
                int dip2Px = (int) UIUtils.dip2Px(b2.f3307e, 16.0f);
                com.ss.android.ugc.aweme.framework.core.a b3 = com.ss.android.ugc.aweme.framework.core.a.b();
                Intrinsics.checkExpressionValueIsNotNull(b3, "AppTracker.get()");
                int dip2Px2 = (int) UIUtils.dip2Px(b3.f3307e, 8.0f);
                com.ss.android.ugc.aweme.framework.core.a b4 = com.ss.android.ugc.aweme.framework.core.a.b();
                Intrinsics.checkExpressionValueIsNotNull(b4, "AppTracker.get()");
                int dip2Px3 = (int) UIUtils.dip2Px(b4.f3307e, 120.0f);
                int size = this.as.size();
                for (int i2 = 0; i2 < size; i2++) {
                    LayoutInflater from = LayoutInflater.from(this);
                    FrameLayout frameLayout5 = this.g;
                    if (frameLayout5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    View inflate = from.inflate(C0906R.layout.a2_, (LinearLayout) frameLayout5.findViewById(C0906R.id.bvl), false);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dip2Px3, -2);
                    if (i2 == 0) {
                        layoutParams.setMargins(dip2Px, 0, 0, 0);
                    } else if (i2 == this.as.size() - 1) {
                        layoutParams.setMargins(dip2Px2, 0, dip2Px, 0);
                    } else {
                        layoutParams.setMargins(dip2Px2, 0, 0, 0);
                    }
                    FrameLayout frameLayout6 = this.g;
                    if (frameLayout6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    ((LinearLayout) frameLayout6.findViewById(C0906R.id.bvl)).addView(inflate, layoutParams);
                }
            }
            FrameLayout frameLayout7 = this.g;
            if (frameLayout7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            ((ObservableHorizontalScrollView) frameLayout7.findViewById(C0906R.id.bvn)).scrollTo(0, 0);
            int i3 = 0;
            for (com.ss.android.ugc.aweme.commerce.service.models.h hVar : this.as) {
                FrameLayout frameLayout8 = this.g;
                if (frameLayout8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("headerView");
                }
                View childAt = ((LinearLayout) frameLayout8.findViewById(C0906R.id.bvl)).getChildAt(i3);
                Intrinsics.checkExpressionValueIsNotNull(childAt, "goodItem");
                a(childAt, hVar, false, new ag(this, hVar));
                i3++;
            }
        }
    }

    public final void onDestroy() {
        ViewParent viewParent;
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28644, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28644, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.ak = true;
        Handler handler = this.al;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        m.a aVar = m.f37518c;
        if (PatchProxy.isSupport(new Object[0], aVar, m.a.f37519a, false, 28808, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar, m.a.f37519a, false, 28808, new Class[0], Void.TYPE);
        } else {
            com.ss.android.ugc.aweme.commerce.floatvideo.h a2 = m.a.a();
            if (a2 != null) {
                viewParent = a2.getParent();
            } else {
                viewParent = null;
            }
            ViewGroup viewGroup = (ViewGroup) viewParent;
            if (viewGroup != null) {
                viewGroup.removeView(m.a.a());
            }
            com.ss.android.ugc.aweme.commerce.floatvideo.h a3 = m.a.a();
            if (a3 != null) {
                a3.e();
            }
            com.ss.android.ugc.aweme.commerce.floatvideo.h a4 = m.a.a();
            if (a4 != null) {
                a4.a();
            }
            m.a.a((com.ss.android.ugc.aweme.commerce.floatvideo.h) null);
        }
        ImmersionBar immersionBar = this.ag;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
        if (this.f2893d != null) {
            com.ss.android.ugc.aweme.common.f.b<i> bVar = this.f2893d;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            }
            bVar.k();
        }
        com.ss.android.ugc.aweme.utils.bg.d(this);
        if (this.ai) {
            FloatVideoBrowsePresenter floatVideoBrowsePresenter = this.f2895f;
            if (floatVideoBrowsePresenter != null) {
                floatVideoBrowsePresenter.a();
            }
            this.f2895f = null;
        }
        u().f37476c = false;
        ImageButton imageButton = (ImageButton) e((int) C0906R.id.ahm);
        if (imageButton != null) {
            imageButton.removeCallbacks(null);
        }
        PreviewActivityBar previewActivityBar = this.x;
        if (previewActivityBar != null) {
            if (PatchProxy.isSupport(new Object[0], previewActivityBar, PreviewActivityBar.f37286a, false, 28829, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], previewActivityBar, PreviewActivityBar.f37286a, false, 28829, new Class[0], Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.commerce.preview.activitybar.b bVar2 = previewActivityBar.f37288c;
                if (bVar2 != null) {
                    if (PatchProxy.isSupport(new Object[0], bVar2, com.ss.android.ugc.aweme.commerce.preview.activitybar.b.f37302a, false, 28840, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], bVar2, com.ss.android.ugc.aweme.commerce.preview.activitybar.b.f37302a, false, 28840, new Class[0], Void.TYPE);
                    } else {
                        CountDownLayout countDownLayout = (CountDownLayout) bVar2.a((int) C0906R.id.cm0);
                        if (countDownLayout != null) {
                            countDownLayout.c();
                        }
                    }
                }
                com.ss.android.ugc.aweme.commerce.preview.activitybar.a aVar2 = previewActivityBar.f37289d;
                if (aVar2 != null) {
                    if (PatchProxy.isSupport(new Object[0], aVar2, com.ss.android.ugc.aweme.commerce.preview.activitybar.a.f37298a, false, 28817, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], aVar2, com.ss.android.ugc.aweme.commerce.preview.activitybar.a.f37298a, false, 28817, new Class[0], Void.TYPE);
                    } else {
                        CountDownLayout countDownLayout2 = (CountDownLayout) aVar2.a((int) C0906R.id.ao);
                        if (countDownLayout2 != null) {
                            countDownLayout2.c();
                        }
                    }
                }
            }
        }
    }

    public final void onPause() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28576, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28576, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.ai) {
            FloatVideoBrowsePresenter floatVideoBrowsePresenter = this.f2895f;
            if (floatVideoBrowsePresenter != null) {
                floatVideoBrowsePresenter.c();
            }
        }
        PreviewHomeWatcherReceiver previewHomeWatcherReceiver = this.aj;
        if (previewHomeWatcherReceiver != null) {
            unregisterReceiver(previewHomeWatcherReceiver);
        }
        com.ss.android.ugc.aweme.commerce.service.logs.w wVar = new com.ss.android.ugc.aweme.commerce.service.logs.w();
        wVar.f38162f = String.valueOf(SystemClock.uptimeMillis() - this.aq);
        if (this.u) {
            str = "other";
        } else {
            str = "initiative";
        }
        wVar.g = str;
        wVar.b();
        if (this.ax != 0) {
            if (this.V) {
                com.ss.android.ugc.aweme.commerce.service.logs.v vVar = new com.ss.android.ugc.aweme.commerce.service.logs.v();
                vVar.f38160f = String.valueOf(SystemClock.uptimeMillis() - this.ax);
                vVar.b();
            }
            this.ax = 0;
        }
        PreviewActivityBar previewActivityBar = this.x;
        if (previewActivityBar != null) {
            if (PatchProxy.isSupport(new Object[0], previewActivityBar, PreviewActivityBar.f37286a, false, 28828, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], previewActivityBar, PreviewActivityBar.f37286a, false, 28828, new Class[0], Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.commerce.preview.activitybar.b bVar = previewActivityBar.f37288c;
                if (bVar != null) {
                    if (PatchProxy.isSupport(new Object[0], bVar, com.ss.android.ugc.aweme.commerce.preview.activitybar.b.f37302a, false, 28839, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], bVar, com.ss.android.ugc.aweme.commerce.preview.activitybar.b.f37302a, false, 28839, new Class[0], Void.TYPE);
                    } else {
                        CountDownLayout countDownLayout = (CountDownLayout) bVar.a((int) C0906R.id.cm0);
                        if (countDownLayout != null) {
                            countDownLayout.d();
                        }
                    }
                }
                com.ss.android.ugc.aweme.commerce.preview.activitybar.a aVar = previewActivityBar.f37289d;
                if (aVar != null) {
                    if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.commerce.preview.activitybar.a.f37298a, false, 28816, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.commerce.preview.activitybar.a.f37298a, false, 28816, new Class[0], Void.TYPE);
                    } else {
                        CountDownLayout countDownLayout2 = (CountDownLayout) aVar.a((int) C0906R.id.ao);
                        if (countDownLayout2 != null) {
                            countDownLayout2.d();
                        }
                    }
                }
            }
        }
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28575, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28575, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.preview.PreviewActivity", "onResume", true);
        super.onResume();
        this.aq = SystemClock.uptimeMillis();
        this.u = true;
        PreviewHomeWatcherReceiver previewHomeWatcherReceiver = this.aj;
        if (previewHomeWatcherReceiver != null) {
            previewHomeWatcherReceiver.f37257b = new av(this);
        }
        registerReceiver(this.aj, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        D();
        if (this.ai) {
            FloatVideoBrowsePresenter floatVideoBrowsePresenter = this.f2895f;
            if (floatVideoBrowsePresenter != null) {
                floatVideoBrowsePresenter.b();
            }
        }
        if (((PreviewTitle) e((int) C0906R.id.c5h)).getCurrentTab() == PreviewTitle.a.b()) {
            this.ax = SystemClock.uptimeMillis();
        }
        PreviewActivityBar previewActivityBar = this.x;
        if (previewActivityBar != null) {
            if (PatchProxy.isSupport(new Object[0], previewActivityBar, PreviewActivityBar.f37286a, false, 28827, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], previewActivityBar, PreviewActivityBar.f37286a, false, 28827, new Class[0], Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.commerce.preview.activitybar.b bVar = previewActivityBar.f37288c;
                if (bVar != null) {
                    if (PatchProxy.isSupport(new Object[0], bVar, com.ss.android.ugc.aweme.commerce.preview.activitybar.b.f37302a, false, 28838, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], bVar, com.ss.android.ugc.aweme.commerce.preview.activitybar.b.f37302a, false, 28838, new Class[0], Void.TYPE);
                    } else {
                        CountDownLayout countDownLayout = (CountDownLayout) bVar.a((int) C0906R.id.cm0);
                        if (countDownLayout != null) {
                            countDownLayout.e();
                        }
                    }
                }
                com.ss.android.ugc.aweme.commerce.preview.activitybar.a aVar = previewActivityBar.f37289d;
                if (aVar != null) {
                    if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.commerce.preview.activitybar.a.f37298a, false, 28815, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.commerce.preview.activitybar.a.f37298a, false, 28815, new Class[0], Void.TYPE);
                    } else {
                        CountDownLayout countDownLayout2 = (CountDownLayout) aVar.a((int) C0906R.id.ao);
                        if (countDownLayout2 != null) {
                            countDownLayout2.e();
                        }
                    }
                }
            }
        }
        if (this.D != null) {
            com.ss.android.ugc.aweme.commerce.service.models.h hVar = this.D;
            if (hVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
            }
            String promotionId = hVar.getPromotionId();
            com.ss.android.ugc.aweme.commerce.service.models.h hVar2 = this.D;
            if (hVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
            }
            a(promotionId, hVar2.getProductId(), (Function1<? super com.ss.android.ugc.aweme.commerce.service.models.p, Unit>) null);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.preview.PreviewActivity", "onResume", false);
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28619, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28619, new Class[0], Void.TYPE);
            return;
        }
        TextView textView = (TextView) e((int) C0906R.id.dif);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tv_sell_out");
        if (textView.getVisibility() == 0) {
            RoundSelectorBtn roundSelectorBtn = (RoundSelectorBtn) e((int) C0906R.id.am1);
            Intrinsics.checkExpressionValueIsNotNull(roundSelectorBtn, "guessULikeBtn");
            if (roundSelectorBtn.getVisibility() == 0) {
                RoundSelectorBtn roundSelectorBtn2 = (RoundSelectorBtn) e((int) C0906R.id.am1);
                Intrinsics.checkExpressionValueIsNotNull(roundSelectorBtn2, "guessULikeBtn");
                ViewGroup.LayoutParams layoutParams = roundSelectorBtn2.getLayoutParams();
                if (layoutParams != null) {
                    Context context = this;
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) UIUtils.dip2Px(context, 96.0f);
                    RoundedRelativeLayout roundedRelativeLayout = (RoundedRelativeLayout) e((int) C0906R.id.bvt);
                    Intrinsics.checkExpressionValueIsNotNull(roundedRelativeLayout, "out_box");
                    ViewGroup.LayoutParams layoutParams2 = roundedRelativeLayout.getLayoutParams();
                    if (layoutParams2 != null) {
                        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) UIUtils.dip2Px(context, 148.0f);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            RoundedRelativeLayout roundedRelativeLayout2 = (RoundedRelativeLayout) e((int) C0906R.id.bvt);
            Intrinsics.checkExpressionValueIsNotNull(roundedRelativeLayout2, "out_box");
            ViewGroup.LayoutParams layoutParams3 = roundedRelativeLayout2.getLayoutParams();
            if (layoutParams3 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = (int) UIUtils.dip2Px(this, 96.0f);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        RoundSelectorBtn roundSelectorBtn3 = (RoundSelectorBtn) e((int) C0906R.id.am1);
        Intrinsics.checkExpressionValueIsNotNull(roundSelectorBtn3, "guessULikeBtn");
        if (roundSelectorBtn3.getVisibility() == 0) {
            RoundSelectorBtn roundSelectorBtn4 = (RoundSelectorBtn) e((int) C0906R.id.am1);
            Intrinsics.checkExpressionValueIsNotNull(roundSelectorBtn4, "guessULikeBtn");
            ViewGroup.LayoutParams layoutParams4 = roundSelectorBtn4.getLayoutParams();
            if (layoutParams4 != null) {
                Context context2 = this;
                ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = (int) UIUtils.dip2Px(context2, 64.0f);
                RoundedRelativeLayout roundedRelativeLayout3 = (RoundedRelativeLayout) e((int) C0906R.id.bvt);
                Intrinsics.checkExpressionValueIsNotNull(roundedRelativeLayout3, "out_box");
                ViewGroup.LayoutParams layoutParams5 = roundedRelativeLayout3.getLayoutParams();
                if (layoutParams5 != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = (int) UIUtils.dip2Px(context2, 116.0f);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        RoundedRelativeLayout roundedRelativeLayout4 = (RoundedRelativeLayout) e((int) C0906R.id.bvt);
        Intrinsics.checkExpressionValueIsNotNull(roundedRelativeLayout4, "out_box");
        ViewGroup.LayoutParams layoutParams6 = roundedRelativeLayout4.getLayoutParams();
        if (layoutParams6 != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = (int) UIUtils.dip2Px(this, 64.0f);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void s() {
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28621, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28621, new Class[0], Void.TYPE);
            return;
        }
        CommerceUser commerceUser = this.E;
        if (commerceUser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUserInfo");
        }
        String uid = commerceUser.getUid();
        l lVar = this.ay.get(uid);
        if (lVar == null) {
            lVar = new l();
            this.ay.put(uid, lVar);
        }
        l lVar2 = lVar;
        Collection arrayList = new ArrayList();
        for (Object next : lVar2.f37514c) {
            String promotionId = ((com.ss.android.ugc.aweme.commerce.service.models.w) next).getPromotionId();
            com.ss.android.ugc.aweme.commerce.service.models.h hVar = this.D;
            if (hVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
            }
            if (!Intrinsics.areEqual((Object) promotionId, (Object) hVar.getPromotionId())) {
                arrayList.add(next);
            }
        }
        List list = (List) arrayList;
        if (list.size() >= 3) {
            a(lVar2, list.subList(0, 3));
            return;
        }
        if (lVar2.f37513b) {
            if (PatchProxy.isSupport(new Object[]{lVar2, uid}, this, f2890a, false, 28627, new Class[]{l.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{lVar2, uid}, this, f2890a, false, 28627, new Class[]{l.class, String.class}, Void.TYPE);
                return;
            }
            int i2 = lVar2.f37515d;
            Function2 amVar = new am(this, lVar2);
            if (PatchProxy.isSupport(new Object[]{5, Integer.valueOf(i2), uid, amVar}, null, com.ss.android.ugc.aweme.commerce.portfolio.api.a.f37050a, true, 28453, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Function2.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{5, Integer.valueOf(i2), uid, amVar}, null, com.ss.android.ugc.aweme.commerce.portfolio.api.a.f37050a, true, 28453, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Function2.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(uid, "uid");
            Intrinsics.checkParameterIsNotNull(amVar, "onResult");
            com.ss.android.ugc.aweme.commerce.portfolio.api.a.a(5, i2, uid, "", 0, null, null, amVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void y() {
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28639, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28639, new Class[0], Void.TYPE);
            return;
        }
        FrameLayout frameLayout = this.g;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(C0906R.id.a0n);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "headerView.couponContainer");
        if (linearLayout.getVisibility() != 0) {
            FrameLayout frameLayout2 = this.g;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            LinearLayout linearLayout2 = (LinearLayout) frameLayout2.findViewById(C0906R.id.blg);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "headerView.market_container");
            if (linearLayout2.getVisibility() != 0) {
                FrameLayout frameLayout3 = this.g;
                if (frameLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("headerView");
                }
                LinearLayout linearLayout3 = (LinearLayout) frameLayout3.findViewById(C0906R.id.a3l);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "headerView.delivery_container");
                if (linearLayout3.getVisibility() != 0) {
                    FrameLayout frameLayout4 = this.g;
                    if (frameLayout4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    RelativeLayout relativeLayout = (RelativeLayout) frameLayout4.findViewById(C0906R.id.b_j);
                    Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "headerView.layout_service_info");
                    if (relativeLayout.getVisibility() != 0) {
                        FrameLayout frameLayout5 = this.g;
                        if (frameLayout5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("headerView");
                        }
                        TagFlowLayout tagFlowLayout = (TagFlowLayout) frameLayout5.findViewById(C0906R.id.czo);
                        Intrinsics.checkExpressionValueIsNotNull(tagFlowLayout, "headerView.tagsView");
                        if (tagFlowLayout.getVisibility() != 0) {
                            FrameLayout frameLayout6 = this.g;
                            if (frameLayout6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("headerView");
                            }
                            LinearLayout linearLayout4 = (LinearLayout) frameLayout6.findViewById(C0906R.id.ar);
                            Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "headerView.activityLayout");
                            if (linearLayout4.getVisibility() != 0) {
                                FrameLayout frameLayout7 = this.g;
                                if (frameLayout7 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("headerView");
                                }
                                View findViewById = frameLayout7.findViewById(C0906R.id.cma);
                                Intrinsics.checkExpressionValueIsNotNull(findViewById, "headerView.secondDivider");
                                findViewById.setVisibility(8);
                                return;
                            }
                        }
                    }
                }
            }
        }
        FrameLayout frameLayout8 = this.g;
        if (frameLayout8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        View findViewById2 = frameLayout8.findViewById(C0906R.id.cma);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "headerView.secondDivider");
        findViewById2.setVisibility(0);
    }

    public final void z() {
        if (PatchProxy.isSupport(new Object[0], this, f2890a, false, 28640, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2890a, false, 28640, new Class[0], Void.TYPE);
            return;
        }
        CouponSelectPopUp.a aVar = CouponSelectPopUp.g;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
        com.ss.android.ugc.aweme.commerce.service.models.h hVar = this.D;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
        }
        String promotionId = hVar.getPromotionId();
        com.ss.android.ugc.aweme.commerce.service.models.h hVar2 = this.D;
        if (hVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
        }
        String productId = hVar2.getProductId();
        Function2<? super String, ? super Boolean, Unit> afVar = new af<>(this);
        if (PatchProxy.isSupport(new Object[]{supportFragmentManager, promotionId, productId, afVar}, aVar, CouponSelectPopUp.a.f37526a, false, 29015, new Class[]{FragmentManager.class, String.class, String.class, Function2.class}, Void.TYPE)) {
            Object[] objArr = {supportFragmentManager, promotionId, productId, afVar};
            CouponSelectPopUp.a aVar2 = aVar;
            PatchProxy.accessDispatch(objArr, aVar2, CouponSelectPopUp.a.f37526a, false, 29015, new Class[]{FragmentManager.class, String.class, String.class, Function2.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(supportFragmentManager, "fragmentManager");
            CouponSelectPopUp couponSelectPopUp = new CouponSelectPopUp();
            couponSelectPopUp.f37524e = afVar;
            Bundle bundle = new Bundle();
            bundle.putString("PROMOTION_ID", promotionId);
            bundle.putString("PRODUCT_ID", productId);
            couponSelectPopUp.setArguments(bundle);
            couponSelectPopUp.show(supportFragmentManager, "TAG_COUPON_SELECT_INFO");
        }
        com.ss.android.ugc.aweme.commerce.service.logs.k kVar = new com.ss.android.ugc.aweme.commerce.service.logs.k();
        CommerceUser commerceUser = this.E;
        if (commerceUser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUserInfo");
        }
        com.ss.android.ugc.aweme.commerce.service.logs.k d2 = kVar.c(commerceUser.getUid()).d("full_screen_card");
        com.ss.android.ugc.aweme.commerce.service.models.h hVar3 = this.D;
        if (hVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
        }
        com.ss.android.ugc.aweme.commerce.service.logs.k a2 = d2.a(hVar3.getCommodityType());
        com.ss.android.ugc.aweme.commerce.service.models.h hVar4 = this.D;
        if (hVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
        }
        a2.b(hVar4.getPromotionId()).a(this.F).b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:237:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0598  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x05b1  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x05bc  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x05d1  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x05ea  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x05f5  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x060a  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0615  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0625  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0630  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0640  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x0811  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x082a  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x0835  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x084a  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0863  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x086e  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x0883  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x088e  */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x08a8  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x08b7  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x08ea  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x091e  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0929  */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0939  */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x0944  */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x0954  */
    /* JADX WARNING: Removed duplicated region for block: B:560:0x0c3b  */
    /* JADX WARNING: Removed duplicated region for block: B:563:0x0c46  */
    /* JADX WARNING: Removed duplicated region for block: B:573:0x0c61  */
    /* JADX WARNING: Removed duplicated region for block: B:587:0x0d00  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x() {
        /*
            r14 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f2890a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 28637(0x6fdd, float:4.0129E-41)
            r2 = r14
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f2890a
            r5 = 0
            r6 = 28637(0x6fdd, float:4.0129E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r14.D
            if (r1 != 0) goto L_0x002c
            java.lang.String r2 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x002c:
            java.util.List r1 = r1.preferredImages()
            r2 = 2131170050(0x7f071302, float:1.7954447E38)
            r3 = 0
            r4 = 8
            r5 = 1
            if (r1 == 0) goto L_0x016e
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r5
            if (r1 != r5) goto L_0x016e
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x004b
            java.lang.String r6 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
        L_0x004b:
            android.view.View r1 = (android.view.View) r1
            android.view.View r1 = r1.findViewById(r2)
            com.ss.android.ugc.aweme.commerce.service.widgets.SquareSlidesLayout r1 = (com.ss.android.ugc.aweme.commerce.service.widgets.SquareSlidesLayout) r1
            com.ss.android.ugc.aweme.commerce.service.models.h r2 = r14.D
            if (r2 != 0) goto L_0x005c
            java.lang.String r6 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
        L_0x005c:
            java.util.List r2 = r2.preferredImages()
            if (r2 != 0) goto L_0x0065
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0065:
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r0] = r2
            com.meituan.robust.ChangeQuickRedirect r8 = com.ss.android.ugc.aweme.commerce.service.widgets.SquareSlidesLayout.f38300a
            r9 = 0
            r10 = 30101(0x7595, float:4.218E-41)
            java.lang.Class[] r11 = new java.lang.Class[r5]
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r11[r0] = r7
            java.lang.Class r12 = java.lang.Void.TYPE
            r7 = r1
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)
            if (r6 == 0) goto L_0x0094
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r0] = r2
            com.meituan.robust.ChangeQuickRedirect r8 = com.ss.android.ugc.aweme.commerce.service.widgets.SquareSlidesLayout.f38300a
            r9 = 0
            r10 = 30101(0x7595, float:4.218E-41)
            java.lang.Class[] r11 = new java.lang.Class[r5]
            java.lang.Class<java.util.List> r2 = java.util.List.class
            r11[r0] = r2
            java.lang.Class r12 = java.lang.Void.TYPE
            r7 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x01b6
        L_0x0094:
            java.lang.String r6 = "slides"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r6)
            r1.g = r5
            android.view.View r6 = r1.f38305f
            if (r6 != 0) goto L_0x00a4
            java.lang.String r7 = "mSellOutView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x00a4:
            r6.setVisibility(r4)
            com.ss.android.ugc.aweme.commerce.service.widgets.SquareSlidesLayout$PreviewAdapter r6 = new com.ss.android.ugc.aweme.commerce.service.widgets.SquareSlidesLayout$PreviewAdapter
            android.content.Context r7 = r1.getContext()
            java.lang.String r8 = "context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r8)
            r6.<init>(r7, r2)
            r1.f38301b = r6
            com.ss.android.ugc.aweme.commerce.service.widgets.SquareViewPager r6 = new com.ss.android.ugc.aweme.commerce.service.widgets.SquareViewPager
            android.content.Context r7 = r1.getContext()
            java.lang.String r8 = "context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r8)
            r6.<init>(r7)
            r1.f38304e = r6
            android.widget.RelativeLayout r6 = r1.f38303d
            if (r6 == 0) goto L_0x00ce
            r6.removeAllViews()
        L_0x00ce:
            android.widget.RelativeLayout r6 = r1.f38303d
            if (r6 == 0) goto L_0x00e8
            com.ss.android.ugc.aweme.commerce.service.widgets.SquareViewPager r7 = r1.f38304e
            if (r7 != 0) goto L_0x00db
            java.lang.String r8 = "mSquarePager"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x00db:
            android.view.View r7 = (android.view.View) r7
            android.view.ViewGroup$LayoutParams r8 = new android.view.ViewGroup$LayoutParams
            r9 = -1
            r10 = 100
            r8.<init>(r9, r10)
            r6.addView(r7, r8)
        L_0x00e8:
            com.ss.android.ugc.aweme.commerce.service.widgets.SquareViewPager r6 = r1.f38304e
            if (r6 != 0) goto L_0x00f1
            java.lang.String r7 = "mSquarePager"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x00f1:
            com.ss.android.ugc.aweme.commerce.service.widgets.SquareSlidesLayout$PreviewAdapter r7 = r1.f38301b
            android.support.v4.view.PagerAdapter r7 = (android.support.v4.view.PagerAdapter) r7
            r6.setAdapter(r7)
            com.ss.android.ugc.aweme.commerce.service.widgets.SquareViewPager r6 = r1.f38304e
            if (r6 != 0) goto L_0x0101
            java.lang.String r7 = "mSquarePager"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x0101:
            com.ss.android.ugc.aweme.commerce.service.widgets.SquareSlidesLayout$PreviewAdapter r7 = r1.f38301b
            if (r7 != 0) goto L_0x0108
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0108:
            int r7 = r7.a()
            int r7 = r7 * 100
            r6.setCurrentItem(r7)
            com.ss.android.ugc.aweme.commerce.service.widgets.SquareViewPager r6 = r1.f38304e
            if (r6 != 0) goto L_0x011a
            java.lang.String r7 = "mSquarePager"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x011a:
            r7 = r1
            android.support.v4.view.ViewPager$OnPageChangeListener r7 = (android.support.v4.view.ViewPager.OnPageChangeListener) r7
            r6.addOnPageChangeListener(r7)
            int r2 = r2.size()
            r6 = 2
            if (r2 >= r6) goto L_0x012f
            android.widget.TextView r2 = r1.f38302c
            if (r2 == 0) goto L_0x0136
            r2.setVisibility(r4)
            goto L_0x0136
        L_0x012f:
            android.widget.TextView r2 = r1.f38302c
            if (r2 == 0) goto L_0x0136
            r2.setVisibility(r0)
        L_0x0136:
            android.widget.TextView r2 = r1.f38302c
            if (r2 == 0) goto L_0x01b6
            java.util.Locale r7 = java.util.Locale.getDefault()
            java.lang.String r8 = "Locale.getDefault()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r8)
            java.lang.String r8 = "%d/%d"
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            r9[r0] = r10
            com.ss.android.ugc.aweme.commerce.service.widgets.SquareSlidesLayout$PreviewAdapter r1 = r1.f38301b
            if (r1 == 0) goto L_0x0158
            int r1 = r1.f38307b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0159
        L_0x0158:
            r1 = r3
        L_0x0159:
            r9[r5] = r1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r9, r6)
            java.lang.String r1 = java.lang.String.format(r7, r8, r1)
            java.lang.String r6 = "java.lang.String.format(locale, format, *args)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r6)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2.setText(r1)
            goto L_0x01b6
        L_0x016e:
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x0177
            java.lang.String r6 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
        L_0x0177:
            android.view.View r1 = (android.view.View) r1
            android.view.View r1 = r1.findViewById(r2)
            com.ss.android.ugc.aweme.commerce.service.widgets.SquareSlidesLayout r1 = (com.ss.android.ugc.aweme.commerce.service.widgets.SquareSlidesLayout) r1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r8 = com.ss.android.ugc.aweme.commerce.service.widgets.SquareSlidesLayout.f38300a
            r9 = 0
            r10 = 30102(0x7596, float:4.2182E-41)
            java.lang.Class[] r11 = new java.lang.Class[r0]
            java.lang.Class r12 = java.lang.Void.TYPE
            r7 = r1
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)
            if (r2 == 0) goto L_0x01a1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r8 = com.ss.android.ugc.aweme.commerce.service.widgets.SquareSlidesLayout.f38300a
            r9 = 0
            r10 = 30102(0x7596, float:4.2182E-41)
            java.lang.Class[] r11 = new java.lang.Class[r0]
            java.lang.Class r12 = java.lang.Void.TYPE
            r7 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x01b6
        L_0x01a1:
            r1.g = r0
            android.widget.RelativeLayout r2 = r1.f38303d
            if (r2 == 0) goto L_0x01aa
            r2.removeAllViews()
        L_0x01aa:
            android.view.View r1 = r1.f38305f
            if (r1 != 0) goto L_0x01b3
            java.lang.String r2 = "mSellOutView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x01b3:
            r1.setVisibility(r0)
        L_0x01b6:
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r14.D
            if (r1 != 0) goto L_0x01bf
            java.lang.String r2 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x01bf:
            java.util.List r1 = r1.preferredImages()
            if (r1 == 0) goto L_0x022e
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r5
            if (r1 != r5) goto L_0x022e
            r1 = 2131169117(0x7f070f5d, float:1.7952555E38)
            android.view.View r1 = r14.e((int) r1)
            com.ss.android.ugc.aweme.commerce.widget.PreviewTitle r1 = (com.ss.android.ugc.aweme.commerce.widget.PreviewTitle) r1
            com.ss.android.ugc.aweme.commerce.service.models.h r2 = r14.D
            if (r2 != 0) goto L_0x01e0
            java.lang.String r6 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
        L_0x01e0:
            java.util.List r2 = r2.preferredImages()
            if (r2 != 0) goto L_0x01e9
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x01e9:
            java.lang.Object r2 = r2.get(r0)
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = (com.ss.android.ugc.aweme.base.model.UrlModel) r2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r0] = r2
            com.meituan.robust.ChangeQuickRedirect r8 = com.ss.android.ugc.aweme.commerce.widget.PreviewTitle.f38376a
            r9 = 0
            r10 = 30213(0x7605, float:4.2337E-41)
            java.lang.Class[] r11 = new java.lang.Class[r5]
            java.lang.Class<com.ss.android.ugc.aweme.base.model.UrlModel> r7 = com.ss.android.ugc.aweme.base.model.UrlModel.class
            r11[r0] = r7
            java.lang.Class r12 = java.lang.Void.TYPE
            r7 = r1
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)
            if (r6 == 0) goto L_0x021d
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r0] = r2
            com.meituan.robust.ChangeQuickRedirect r8 = com.ss.android.ugc.aweme.commerce.widget.PreviewTitle.f38376a
            r9 = 0
            r10 = 30213(0x7605, float:4.2337E-41)
            java.lang.Class[] r11 = new java.lang.Class[r5]
            java.lang.Class<com.ss.android.ugc.aweme.base.model.UrlModel> r2 = com.ss.android.ugc.aweme.base.model.UrlModel.class
            r11[r0] = r2
            java.lang.Class r12 = java.lang.Void.TYPE
            r7 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x022e
        L_0x021d:
            java.lang.String r6 = "urlModel"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r6)
            r6 = 2131169988(0x7f0712c4, float:1.7954322E38)
            android.view.View r1 = r1.a((int) r6)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1
            com.ss.android.ugc.aweme.base.c.b(r1, r2)
        L_0x022e:
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r14.D
            if (r1 != 0) goto L_0x0237
            java.lang.String r2 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0237:
            boolean r1 = r1.isThirdParty()
            if (r1 == 0) goto L_0x0284
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r14.D
            if (r1 != 0) goto L_0x0246
            java.lang.String r2 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0246:
            int r1 = r1.getPrice()
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r6[r0] = r2
            com.meituan.robust.ChangeQuickRedirect r8 = f2890a
            r9 = 0
            r10 = 28635(0x6fdb, float:4.0126E-41)
            java.lang.Class[] r11 = new java.lang.Class[r5]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r11[r0] = r2
            java.lang.Class r12 = java.lang.Void.TYPE
            r7 = r14
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)
            if (r2 == 0) goto L_0x0280
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r8 = f2890a
            r9 = 0
            r10 = 28635(0x6fdb, float:4.0126E-41)
            java.lang.Class[] r11 = new java.lang.Class[r5]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r11[r0] = r1
            java.lang.Class r12 = java.lang.Void.TYPE
            r7 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x02b1
        L_0x0280:
            r14.a((int) r1, (int) r0)
            goto L_0x02b1
        L_0x0284:
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r14.D
            if (r1 != 0) goto L_0x028d
            java.lang.String r2 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x028d:
            com.ss.android.ugc.aweme.commerce.service.models.r r1 = r1.getToutiao()
            if (r1 == 0) goto L_0x0298
            int r1 = r1.getMinPrice()
            goto L_0x0299
        L_0x0298:
            r1 = 0
        L_0x0299:
            com.ss.android.ugc.aweme.commerce.service.models.h r2 = r14.D
            if (r2 != 0) goto L_0x02a2
            java.lang.String r6 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
        L_0x02a2:
            com.ss.android.ugc.aweme.commerce.service.models.r r2 = r2.getToutiao()
            if (r2 == 0) goto L_0x02ad
            int r2 = r2.getMaxPrice()
            goto L_0x02ae
        L_0x02ad:
            r2 = 0
        L_0x02ae:
            r14.a((int) r1, (int) r2)
        L_0x02b1:
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r14.D
            if (r1 != 0) goto L_0x02ba
            java.lang.String r2 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x02ba:
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getBrandIcon()
            if (r1 == 0) goto L_0x02e4
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>()
            r1.element = r2
            com.ss.android.ugc.aweme.commerce.service.models.h r2 = r14.D
            if (r2 != 0) goto L_0x02d5
            java.lang.String r6 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
        L_0x02d5:
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getBrandIcon()
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$bg r6 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$bg
            r6.<init>(r14, r1)
            com.ss.android.ugc.aweme.base.b.a.b r6 = (com.ss.android.ugc.aweme.base.b.a.b) r6
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.model.UrlModel) r2, (int) r0, (int) r0, (com.ss.android.ugc.aweme.base.b.a.b<android.graphics.Bitmap>) r6)
            goto L_0x0332
        L_0x02e4:
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x02ed
            java.lang.String r2 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x02ed:
            android.view.View r1 = (android.view.View) r1
            r2 = 2131170414(0x7f07146e, float:1.7955186E38)
            android.view.View r1 = r1.findViewById(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "headerView.titleView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.commerce.service.models.h r2 = r14.D
            if (r2 != 0) goto L_0x0306
            java.lang.String r6 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
        L_0x0306:
            java.lang.String r2 = r2.longTitle()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x0318
            java.lang.String r2 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0318:
            android.view.View r1 = (android.view.View) r1
            r2 = 2131170414(0x7f07146e, float:1.7955186E38)
            android.view.View r1 = r1.findViewById(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            com.ss.android.ugc.aweme.commerce.service.l.g$a r2 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
            r6 = r14
            android.content.Context r6 = (android.content.Context) r6
            r7 = 2131624219(0x7f0e011b, float:1.8875612E38)
            int r2 = r2.a(r6, r7)
            r1.setTextColor(r2)
        L_0x0332:
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r14.D
            if (r1 != 0) goto L_0x033b
            java.lang.String r2 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x033b:
            boolean r1 = r1.isThirdParty()
            r2 = 2131166203(0x7f0703fb, float:1.7946645E38)
            r6 = 2131168017(0x7f070b11, float:1.7950324E38)
            if (r1 == 0) goto L_0x03b0
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x0350
            java.lang.String r7 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x0350:
            android.view.View r1 = (android.view.View) r1
            r7 = 2131167911(0x7f070aa7, float:1.7950109E38)
            android.view.View r1 = r1.findViewById(r7)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            java.lang.String r7 = "headerView.layout_post_location"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
            r1.setVisibility(r4)
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x036c
            java.lang.String r7 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x036c:
            android.view.View r1 = (android.view.View) r1
            android.view.View r1 = r1.findViewById(r6)
            java.lang.String r7 = "headerView.line_below_post_send"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
            r1.setVisibility(r4)
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x0383
            java.lang.String r7 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x0383:
            android.view.View r1 = (android.view.View) r1
            android.view.View r1 = r1.findViewById(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            java.lang.String r7 = "headerView.couponContainer"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
            r1.setVisibility(r4)
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x039c
            java.lang.String r7 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x039c:
            android.view.View r1 = (android.view.View) r1
            r7 = 2131167935(0x7f070abf, float:1.7950158E38)
            android.view.View r1 = r1.findViewById(r7)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            java.lang.String r7 = "headerView.layout_service_info"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
            r1.setVisibility(r4)
            goto L_0x041d
        L_0x03b0:
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x03b9
            java.lang.String r7 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x03b9:
            android.view.View r1 = (android.view.View) r1
            r7 = 2131170346(0x7f07142a, float:1.7955048E38)
            android.view.View r1 = r1.findViewById(r7)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r7 = "headerView.text_sell_count"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
            r7 = 2131559395(0x7f0d03e3, float:1.8744133E38)
            java.lang.Object[] r8 = new java.lang.Object[r5]
            com.ss.android.ugc.aweme.commerce.service.models.h r9 = r14.D
            if (r9 != 0) goto L_0x03d7
            java.lang.String r10 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r10)
        L_0x03d7:
            int r9 = r9.getSales()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r8[r0] = r9
            java.lang.String r7 = r14.getString(r7, r8)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r1.setText(r7)
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x03f3
            java.lang.String r7 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x03f3:
            android.view.View r1 = (android.view.View) r1
            r7 = 2131167911(0x7f070aa7, float:1.7950109E38)
            android.view.View r1 = r1.findViewById(r7)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            java.lang.String r7 = "headerView.layout_post_location"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
            r1.setVisibility(r0)
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x040f
            java.lang.String r7 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x040f:
            android.view.View r1 = (android.view.View) r1
            android.view.View r1 = r1.findViewById(r6)
            java.lang.String r7 = "headerView.line_below_post_send"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
            r1.setVisibility(r0)
        L_0x041d:
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r14.D
            if (r1 != 0) goto L_0x0426
            java.lang.String r7 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x0426:
            boolean r1 = r1.isPreSaleGood()
            r7 = 2131169129(0x7f070f69, float:1.795258E38)
            r8 = 0
            if (r1 == 0) goto L_0x0673
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x043a
            java.lang.String r10 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r10)
        L_0x043a:
            android.view.View r1 = (android.view.View) r1
            android.view.View r1 = r1.findViewById(r7)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            java.lang.String r7 = "headerView.priceLayout"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
            r1.setVisibility(r4)
            android.view.View r1 = r14.ad
            if (r1 != 0) goto L_0x0469
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x0457
            java.lang.String r7 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x0457:
            android.view.View r1 = (android.view.View) r1
            r7 = 2131171499(0x7f0718ab, float:1.7957386E38)
            android.view.View r1 = r1.findViewById(r7)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            android.view.View r1 = r1.inflate()
            r14.ad = r1
            goto L_0x0470
        L_0x0469:
            android.view.View r1 = r14.ad
            if (r1 == 0) goto L_0x0470
            r1.setVisibility(r0)
        L_0x0470:
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r14.D
            if (r1 != 0) goto L_0x0479
            java.lang.String r7 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x0479:
            com.ss.android.ugc.aweme.commerce.service.models.r r1 = r1.getToutiao()
            if (r1 == 0) goto L_0x0484
            int r1 = r1.getMinPrice()
            goto L_0x0485
        L_0x0484:
            r1 = 0
        L_0x0485:
            com.ss.android.ugc.aweme.commerce.service.models.h r7 = r14.D
            if (r7 != 0) goto L_0x048e
            java.lang.String r10 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r10)
        L_0x048e:
            com.ss.android.ugc.aweme.commerce.service.models.r r7 = r7.getToutiao()
            if (r7 == 0) goto L_0x0499
            int r7 = r7.getMaxPrice()
            goto L_0x049a
        L_0x0499:
            r7 = 0
        L_0x049a:
            android.widget.FrameLayout r10 = r14.g
            if (r10 != 0) goto L_0x04a3
            java.lang.String r11 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r11)
        L_0x04a3:
            android.view.View r10 = (android.view.View) r10
            r11 = 2131169102(0x7f070f4e, float:1.7952525E38)
            android.view.View r10 = r10.findViewById(r11)
            com.ss.android.ugc.aweme.commerce.service.widgets.PriceView r10 = (com.ss.android.ugc.aweme.commerce.service.widgets.PriceView) r10
            java.lang.String r11 = com.ss.android.ugc.aweme.commerce.service.l.d.a((int) r1)
            r10.setPriceText(r11)
            r10 = 2131169101(0x7f070f4d, float:1.7952523E38)
            if (r7 <= 0) goto L_0x050a
            if (r7 <= r1) goto L_0x050a
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x04c5
            java.lang.String r11 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r11)
        L_0x04c5:
            android.view.View r1 = (android.view.View) r1
            r11 = 2131169103(0x7f070f4f, float:1.7952527E38)
            android.view.View r1 = r1.findViewById(r11)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r11 = "headerView.pre_sale_price_space"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r11)
            r1.setVisibility(r0)
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x04e1
            java.lang.String r11 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r11)
        L_0x04e1:
            android.view.View r1 = (android.view.View) r1
            android.view.View r1 = r1.findViewById(r10)
            com.ss.android.ugc.aweme.commerce.service.widgets.PriceView r1 = (com.ss.android.ugc.aweme.commerce.service.widgets.PriceView) r1
            java.lang.String r7 = com.ss.android.ugc.aweme.commerce.service.l.d.a((int) r7)
            r1.setPriceText(r7)
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x04f9
            java.lang.String r7 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x04f9:
            android.view.View r1 = (android.view.View) r1
            android.view.View r1 = r1.findViewById(r10)
            com.ss.android.ugc.aweme.commerce.service.widgets.PriceView r1 = (com.ss.android.ugc.aweme.commerce.service.widgets.PriceView) r1
            java.lang.String r7 = "headerView.pre_sale_max_price"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
            r1.setVisibility(r0)
            goto L_0x053f
        L_0x050a:
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x0513
            java.lang.String r7 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x0513:
            android.view.View r1 = (android.view.View) r1
            r7 = 2131169103(0x7f070f4f, float:1.7952527E38)
            android.view.View r1 = r1.findViewById(r7)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r7 = "headerView.pre_sale_price_space"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
            r1.setVisibility(r4)
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x052f
            java.lang.String r7 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x052f:
            android.view.View r1 = (android.view.View) r1
            android.view.View r1 = r1.findViewById(r10)
            com.ss.android.ugc.aweme.commerce.service.widgets.PriceView r1 = (com.ss.android.ugc.aweme.commerce.service.widgets.PriceView) r1
            java.lang.String r7 = "headerView.pre_sale_max_price"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
            r1.setVisibility(r4)
        L_0x053f:
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x0548
            java.lang.String r7 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x0548:
            android.view.View r1 = (android.view.View) r1
            r7 = 2131169100(0x7f070f4c, float:1.795252E38)
            android.view.View r1 = r1.findViewById(r7)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r7 = "headerView.pre_sale_end_time"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
            com.ss.android.ugc.aweme.commerce.service.models.h r7 = r14.D
            if (r7 != 0) goto L_0x0561
            java.lang.String r10 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r10)
        L_0x0561:
            com.ss.android.ugc.aweme.commerce.service.models.r r7 = r7.getToutiao()
            if (r7 == 0) goto L_0x0572
            com.ss.android.ugc.aweme.commerce.service.models.PromotionPreSale r7 = r7.getPreSale()
            if (r7 == 0) goto L_0x0572
            java.lang.String r7 = r7.getEndTimeText()
            goto L_0x0573
        L_0x0572:
            r7 = r3
        L_0x0573:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r1.setText(r7)
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x0581
            java.lang.String r7 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x0581:
            android.view.View r1 = (android.view.View) r1
            r7 = 2131166312(0x7f070468, float:1.7946866E38)
            android.view.View r1 = r1.findViewById(r7)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            java.lang.String r7 = "headerView.delivery_container"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
            r1.setVisibility(r0)
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x059d
            java.lang.String r7 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x059d:
            android.view.View r1 = (android.view.View) r1
            r7 = 2131169098(0x7f070f4a, float:1.7952516E38)
            android.view.View r1 = r1.findViewById(r7)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r7 = "headerView.pre_sale_delivery_info_prefix"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
            com.ss.android.ugc.aweme.commerce.service.models.h r7 = r14.D
            if (r7 != 0) goto L_0x05b6
            java.lang.String r10 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r10)
        L_0x05b6:
            com.ss.android.ugc.aweme.commerce.service.models.r r7 = r7.getToutiao()
            if (r7 == 0) goto L_0x05c7
            com.ss.android.ugc.aweme.commerce.service.models.PromotionPreSale r7 = r7.getPreSale()
            if (r7 == 0) goto L_0x05c7
            java.lang.String r7 = r7.getDeliveryInfoPrefix()
            goto L_0x05c8
        L_0x05c7:
            r7 = r3
        L_0x05c8:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r1.setText(r7)
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x05d6
            java.lang.String r7 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x05d6:
            android.view.View r1 = (android.view.View) r1
            r7 = 2131169097(0x7f070f49, float:1.7952514E38)
            android.view.View r1 = r1.findViewById(r7)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r7 = "headerView.pre_sale_delivery_info"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
            com.ss.android.ugc.aweme.commerce.service.models.h r7 = r14.D
            if (r7 != 0) goto L_0x05ef
            java.lang.String r10 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r10)
        L_0x05ef:
            com.ss.android.ugc.aweme.commerce.service.models.r r7 = r7.getToutiao()
            if (r7 == 0) goto L_0x0600
            com.ss.android.ugc.aweme.commerce.service.models.PromotionPreSale r7 = r7.getPreSale()
            if (r7 == 0) goto L_0x0600
            java.lang.String r7 = r7.getDeliveryInfo()
            goto L_0x0601
        L_0x0600:
            r7 = r3
        L_0x0601:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r1.setText(r7)
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r14.D
            if (r1 != 0) goto L_0x060f
            java.lang.String r7 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x060f:
            com.ss.android.ugc.aweme.commerce.service.models.r r1 = r1.getToutiao()
            if (r1 == 0) goto L_0x0620
            com.ss.android.ugc.aweme.commerce.service.models.PromotionPreSale r1 = r1.getPreSale()
            if (r1 == 0) goto L_0x0620
            long r10 = r1.getEndTime()
            goto L_0x0621
        L_0x0620:
            r10 = r8
        L_0x0621:
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r14.D
            if (r1 != 0) goto L_0x062a
            java.lang.String r7 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x062a:
            com.ss.android.ugc.aweme.commerce.service.models.r r1 = r1.getToutiao()
            if (r1 == 0) goto L_0x063b
            com.ss.android.ugc.aweme.commerce.service.models.PromotionPreSale r1 = r1.getPreSale()
            if (r1 == 0) goto L_0x063b
            long r12 = r1.getServerTime()
            goto L_0x063c
        L_0x063b:
            r12 = r8
        L_0x063c:
            boolean r1 = r14.ak
            if (r1 != 0) goto L_0x09d0
            long r10 = r10 - r12
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x09d0
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$bh r1 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$bh
            r1.<init>(r14)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            android.os.Handler r7 = r14.al
            if (r7 != 0) goto L_0x0658
            android.os.Handler r7 = new android.os.Handler
            r7.<init>()
            r14.al = r7
            goto L_0x065f
        L_0x0658:
            android.os.Handler r7 = r14.al
            if (r7 == 0) goto L_0x065f
            r7.removeCallbacksAndMessages(r3)
        L_0x065f:
            android.os.Handler r7 = r14.al
            if (r7 == 0) goto L_0x09d0
            r8 = 1
            long r10 = r10 + r8
            r8 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r8
            boolean r1 = r7.postDelayed(r1, r10)
            java.lang.Boolean.valueOf(r1)
            goto L_0x09d0
        L_0x0673:
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r14.D
            if (r1 != 0) goto L_0x067c
            java.lang.String r10 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r10)
        L_0x067c:
            boolean r1 = r1.isAppointment()
            if (r1 == 0) goto L_0x0986
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x068b
            java.lang.String r10 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r10)
        L_0x068b:
            android.view.View r1 = (android.view.View) r1
            android.view.View r1 = r1.findViewById(r7)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            java.lang.String r7 = "headerView.priceLayout"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
            r1.setVisibility(r4)
            android.view.View r1 = r14.ae
            if (r1 != 0) goto L_0x06ba
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x06a8
            java.lang.String r7 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x06a8:
            android.view.View r1 = (android.view.View) r1
            r7 = 2131171489(0x7f0718a1, float:1.7957366E38)
            android.view.View r1 = r1.findViewById(r7)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            android.view.View r1 = r1.inflate()
            r14.ae = r1
            goto L_0x06c1
        L_0x06ba:
            android.view.View r1 = r14.ae
            if (r1 == 0) goto L_0x06c1
            r1.setVisibility(r0)
        L_0x06c1:
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r14.D
            if (r1 != 0) goto L_0x06ca
            java.lang.String r7 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x06ca:
            com.ss.android.ugc.aweme.commerce.service.models.r r1 = r1.getToutiao()
            if (r1 == 0) goto L_0x06d5
            int r1 = r1.getMinPrice()
            goto L_0x06d6
        L_0x06d5:
            r1 = 0
        L_0x06d6:
            com.ss.android.ugc.aweme.commerce.service.models.h r7 = r14.D
            if (r7 != 0) goto L_0x06df
            java.lang.String r10 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r10)
        L_0x06df:
            com.ss.android.ugc.aweme.commerce.service.models.r r7 = r7.getToutiao()
            if (r7 == 0) goto L_0x06ea
            int r7 = r7.getMaxPrice()
            goto L_0x06eb
        L_0x06ea:
            r7 = 0
        L_0x06eb:
            android.widget.FrameLayout r10 = r14.g
            if (r10 != 0) goto L_0x06f4
            java.lang.String r11 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r11)
        L_0x06f4:
            android.view.View r10 = (android.view.View) r10
            r11 = 2131165429(0x7f0700f5, float:1.7945075E38)
            android.view.View r10 = r10.findViewById(r11)
            com.ss.android.ugc.aweme.commerce.service.widgets.PriceView r10 = (com.ss.android.ugc.aweme.commerce.service.widgets.PriceView) r10
            java.lang.String r11 = com.ss.android.ugc.aweme.commerce.service.l.d.a((int) r1)
            r10.setPriceText(r11)
            r10 = 2131165428(0x7f0700f4, float:1.7945073E38)
            if (r7 <= 0) goto L_0x075b
            if (r7 <= r1) goto L_0x075b
            android.widget.FrameLayout r11 = r14.g
            if (r11 != 0) goto L_0x0716
            java.lang.String r12 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r12)
        L_0x0716:
            android.view.View r11 = (android.view.View) r11
            r12 = 2131165431(0x7f0700f7, float:1.7945079E38)
            android.view.View r11 = r11.findViewById(r12)
            android.widget.TextView r11 = (android.widget.TextView) r11
            java.lang.String r12 = "headerView.appoint_price_space"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r12)
            r11.setVisibility(r0)
            android.widget.FrameLayout r11 = r14.g
            if (r11 != 0) goto L_0x0732
            java.lang.String r12 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r12)
        L_0x0732:
            android.view.View r11 = (android.view.View) r11
            android.view.View r11 = r11.findViewById(r10)
            com.ss.android.ugc.aweme.commerce.service.widgets.PriceView r11 = (com.ss.android.ugc.aweme.commerce.service.widgets.PriceView) r11
            java.lang.String r12 = com.ss.android.ugc.aweme.commerce.service.l.d.a((int) r7)
            r11.setPriceText(r12)
            android.widget.FrameLayout r11 = r14.g
            if (r11 != 0) goto L_0x074a
            java.lang.String r12 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r12)
        L_0x074a:
            android.view.View r11 = (android.view.View) r11
            android.view.View r10 = r11.findViewById(r10)
            com.ss.android.ugc.aweme.commerce.service.widgets.PriceView r10 = (com.ss.android.ugc.aweme.commerce.service.widgets.PriceView) r10
            java.lang.String r11 = "headerView.appoint_max_price"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r11)
            r10.setVisibility(r0)
            goto L_0x0790
        L_0x075b:
            android.widget.FrameLayout r11 = r14.g
            if (r11 != 0) goto L_0x0764
            java.lang.String r12 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r12)
        L_0x0764:
            android.view.View r11 = (android.view.View) r11
            r12 = 2131165431(0x7f0700f7, float:1.7945079E38)
            android.view.View r11 = r11.findViewById(r12)
            android.widget.TextView r11 = (android.widget.TextView) r11
            java.lang.String r12 = "headerView.appoint_price_space"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r12)
            r11.setVisibility(r4)
            android.widget.FrameLayout r11 = r14.g
            if (r11 != 0) goto L_0x0780
            java.lang.String r12 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r12)
        L_0x0780:
            android.view.View r11 = (android.view.View) r11
            android.view.View r10 = r11.findViewById(r10)
            com.ss.android.ugc.aweme.commerce.service.widgets.PriceView r10 = (com.ss.android.ugc.aweme.commerce.service.widgets.PriceView) r10
            java.lang.String r11 = "headerView.appoint_max_price"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r11)
            r10.setVisibility(r4)
        L_0x0790:
            com.ss.android.ugc.aweme.commerce.service.models.h r10 = r14.D
            if (r10 != 0) goto L_0x0799
            java.lang.String r11 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r11)
        L_0x0799:
            int r10 = r10.getMarketPrice()
            r11 = 2131165427(0x7f0700f3, float:1.794507E38)
            if (r10 <= 0) goto L_0x07f4
            com.ss.android.ugc.aweme.commerce.service.models.h r10 = r14.D
            if (r10 != 0) goto L_0x07ab
            java.lang.String r12 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r12)
        L_0x07ab:
            int r10 = r10.getMarketPrice()
            int r1 = java.lang.Math.max(r1, r7)
            if (r10 <= r1) goto L_0x07f4
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x07be
            java.lang.String r7 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x07be:
            android.view.View r1 = (android.view.View) r1
            android.view.View r1 = r1.findViewById(r11)
            com.ss.android.ugc.aweme.commerce.service.widgets.PriceView r1 = (com.ss.android.ugc.aweme.commerce.service.widgets.PriceView) r1
            java.lang.String r7 = "headerView.appoint_market_price"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
            r1.setVisibility(r0)
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x07d7
            java.lang.String r7 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x07d7:
            android.view.View r1 = (android.view.View) r1
            android.view.View r1 = r1.findViewById(r11)
            com.ss.android.ugc.aweme.commerce.service.widgets.PriceView r1 = (com.ss.android.ugc.aweme.commerce.service.widgets.PriceView) r1
            com.ss.android.ugc.aweme.commerce.service.models.h r7 = r14.D
            if (r7 != 0) goto L_0x07e8
            java.lang.String r10 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r10)
        L_0x07e8:
            int r7 = r7.getMarketPrice()
            java.lang.String r7 = com.ss.android.ugc.aweme.commerce.service.l.d.a((int) r7)
            r1.setPriceText(r7)
            goto L_0x080d
        L_0x07f4:
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x07fd
            java.lang.String r7 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x07fd:
            android.view.View r1 = (android.view.View) r1
            android.view.View r1 = r1.findViewById(r11)
            com.ss.android.ugc.aweme.commerce.service.widgets.PriceView r1 = (com.ss.android.ugc.aweme.commerce.service.widgets.PriceView) r1
            java.lang.String r7 = "headerView.appoint_market_price"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
            r1.setVisibility(r4)
        L_0x080d:
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x0816
            java.lang.String r7 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x0816:
            android.view.View r1 = (android.view.View) r1
            r7 = 2131170624(0x7f071540, float:1.7955612E38)
            android.view.View r1 = r1.findViewById(r7)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r7 = "headerView.tv_appoint_show_text"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
            com.ss.android.ugc.aweme.commerce.service.models.h r7 = r14.D
            if (r7 != 0) goto L_0x082f
            java.lang.String r10 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r10)
        L_0x082f:
            com.ss.android.ugc.aweme.commerce.service.models.r r7 = r7.getToutiao()
            if (r7 == 0) goto L_0x0840
            com.ss.android.ugc.aweme.commerce.service.models.PromotionAppointment r7 = r7.getAppointment()
            if (r7 == 0) goto L_0x0840
            java.lang.String r7 = r7.getShowText()
            goto L_0x0841
        L_0x0840:
            r7 = r3
        L_0x0841:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r1.setText(r7)
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x084f
            java.lang.String r7 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x084f:
            android.view.View r1 = (android.view.View) r1
            r7 = 2131165425(0x7f0700f1, float:1.7945067E38)
            android.view.View r1 = r1.findViewById(r7)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r7 = "headerView.appoint_end_time"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
            com.ss.android.ugc.aweme.commerce.service.models.h r7 = r14.D
            if (r7 != 0) goto L_0x0868
            java.lang.String r10 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r10)
        L_0x0868:
            com.ss.android.ugc.aweme.commerce.service.models.r r7 = r7.getToutiao()
            if (r7 == 0) goto L_0x0879
            com.ss.android.ugc.aweme.commerce.service.models.PromotionAppointment r7 = r7.getAppointment()
            if (r7 == 0) goto L_0x0879
            java.lang.String r7 = r7.getStartTimeText()
            goto L_0x087a
        L_0x0879:
            r7 = r3
        L_0x087a:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r1.setText(r7)
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r14.D
            if (r1 != 0) goto L_0x0888
            java.lang.String r7 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x0888:
            com.ss.android.ugc.aweme.commerce.service.models.r r1 = r1.getToutiao()
            if (r1 == 0) goto L_0x089d
            com.ss.android.ugc.aweme.commerce.service.models.PromotionAppointment r1 = r1.getAppointment()
            if (r1 == 0) goto L_0x089d
            int r1 = r1.getAppointmentNum()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x089e
        L_0x089d:
            r1 = r3
        L_0x089e:
            kotlin.ranges.IntRange r7 = new kotlin.ranges.IntRange
            r10 = 99999(0x1869f, float:1.40128E-40)
            r7.<init>(r0, r10)
            if (r1 == 0) goto L_0x08b4
            int r10 = r1.intValue()
            boolean r7 = r7.contains((int) r10)
            if (r7 == 0) goto L_0x08b4
            r7 = 1
            goto L_0x08b5
        L_0x08b4:
            r7 = 0
        L_0x08b5:
            if (r7 == 0) goto L_0x08ea
            android.widget.FrameLayout r7 = r14.g
            if (r7 != 0) goto L_0x08c0
            java.lang.String r10 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r10)
        L_0x08c0:
            android.view.View r7 = (android.view.View) r7
            r10 = 2131165430(0x7f0700f6, float:1.7945077E38)
            android.view.View r7 = r7.findViewById(r10)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r7
            java.lang.String r10 = "headerView.appoint_people_num"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r10)
            com.ss.android.ugc.aweme.commerce.service.l.g$a r10 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
            r11 = r14
            android.content.Context r11 = (android.content.Context) r11
            r12 = 2131558678(0x7f0d0116, float:1.8742679E38)
            java.lang.Object[] r13 = new java.lang.Object[r5]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r13[r0] = r1
            java.lang.String r1 = r10.a(r11, r12, r13)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r7.setText(r1)
            goto L_0x091a
        L_0x08ea:
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x08f3
            java.lang.String r7 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x08f3:
            android.view.View r1 = (android.view.View) r1
            r7 = 2131165430(0x7f0700f6, float:1.7945077E38)
            android.view.View r1 = r1.findViewById(r7)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r7 = "headerView.appoint_people_num"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
            com.ss.android.ugc.aweme.commerce.service.l.g$a r7 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
            r10 = r14
            android.content.Context r10 = (android.content.Context) r10
            r11 = 2131558678(0x7f0d0116, float:1.8742679E38)
            java.lang.Object[] r12 = new java.lang.Object[r5]
            java.lang.String r13 = "99999+"
            r12[r0] = r13
            java.lang.String r7 = r7.a(r10, r11, r12)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r1.setText(r7)
        L_0x091a:
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r14.D
            if (r1 != 0) goto L_0x0923
            java.lang.String r7 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x0923:
            com.ss.android.ugc.aweme.commerce.service.models.r r1 = r1.getToutiao()
            if (r1 == 0) goto L_0x0934
            com.ss.android.ugc.aweme.commerce.service.models.PromotionAppointment r1 = r1.getAppointment()
            if (r1 == 0) goto L_0x0934
            long r10 = r1.getStartTime()
            goto L_0x0935
        L_0x0934:
            r10 = r8
        L_0x0935:
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r14.D
            if (r1 != 0) goto L_0x093e
            java.lang.String r7 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x093e:
            com.ss.android.ugc.aweme.commerce.service.models.r r1 = r1.getToutiao()
            if (r1 == 0) goto L_0x094f
            com.ss.android.ugc.aweme.commerce.service.models.PromotionAppointment r1 = r1.getAppointment()
            if (r1 == 0) goto L_0x094f
            long r12 = r1.getServerTime()
            goto L_0x0950
        L_0x094f:
            r12 = r8
        L_0x0950:
            boolean r1 = r14.ak
            if (r1 != 0) goto L_0x09d0
            long r10 = r10 - r12
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x09d0
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$bi r1 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$bi
            r1.<init>(r14)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            android.os.Handler r7 = r14.al
            if (r7 != 0) goto L_0x096c
            android.os.Handler r7 = new android.os.Handler
            r7.<init>()
            r14.al = r7
            goto L_0x0973
        L_0x096c:
            android.os.Handler r7 = r14.al
            if (r7 == 0) goto L_0x0973
            r7.removeCallbacksAndMessages(r3)
        L_0x0973:
            android.os.Handler r7 = r14.al
            if (r7 == 0) goto L_0x09d0
            r8 = 1
            long r10 = r10 + r8
            r8 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r8
            boolean r1 = r7.postDelayed(r1, r10)
            java.lang.Boolean.valueOf(r1)
            goto L_0x09d0
        L_0x0986:
            android.os.Handler r1 = r14.al
            if (r1 == 0) goto L_0x098d
            r1.removeCallbacksAndMessages(r3)
        L_0x098d:
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x0996
            java.lang.String r8 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x0996:
            android.view.View r1 = (android.view.View) r1
            android.view.View r1 = r1.findViewById(r7)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            java.lang.String r7 = "headerView.priceLayout"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
            r1.setVisibility(r0)
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x09af
            java.lang.String r7 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x09af:
            android.view.View r1 = (android.view.View) r1
            r7 = 2131166312(0x7f070468, float:1.7946866E38)
            android.view.View r1 = r1.findViewById(r7)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            java.lang.String r7 = "headerView.delivery_container"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r7)
            r1.setVisibility(r4)
            android.view.View r1 = r14.ad
            if (r1 == 0) goto L_0x09c9
            r1.setVisibility(r4)
        L_0x09c9:
            android.view.View r1 = r14.ae
            if (r1 == 0) goto L_0x09d0
            r1.setVisibility(r4)
        L_0x09d0:
            java.lang.Object[] r7 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = f2890a
            r10 = 0
            r11 = 28638(0x6fde, float:4.013E-41)
            java.lang.Class[] r12 = new java.lang.Class[r0]
            java.lang.Class r13 = java.lang.Void.TYPE
            r8 = r14
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r7, r8, r9, r10, r11, r12, r13)
            if (r1 == 0) goto L_0x09f3
            java.lang.Object[] r7 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = f2890a
            r10 = 0
            r11 = 28638(0x6fde, float:4.013E-41)
            java.lang.Class[] r12 = new java.lang.Class[r0]
            java.lang.Class r13 = java.lang.Void.TYPE
            r8 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0b1c
        L_0x09f3:
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r14.D
            if (r1 != 0) goto L_0x09fc
            java.lang.String r7 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x09fc:
            java.util.List r1 = r1.getMarketFloors()
            if (r1 == 0) goto L_0x0a0e
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r5
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x0a0f
        L_0x0a0e:
            r1 = r3
        L_0x0a0f:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r7)
            r7 = 2131168376(0x7f070c78, float:1.7951052E38)
            if (r1 == 0) goto L_0x0b03
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x0a23
            java.lang.String r8 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x0a23:
            android.view.View r1 = (android.view.View) r1
            android.view.View r1 = r1.findViewById(r7)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            java.lang.String r8 = "headerView.market_container"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r8)
            r1.setVisibility(r0)
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x0a3c
            java.lang.String r8 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x0a3c:
            android.view.View r1 = (android.view.View) r1
            android.view.View r1 = r1.findViewById(r6)
            java.lang.String r6 = "headerView.line_below_post_send"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r6)
            r1.setVisibility(r0)
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r14.D
            if (r1 != 0) goto L_0x0a53
            java.lang.String r6 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
        L_0x0a53:
            java.util.List r1 = r1.getMarketFloors()
            if (r1 == 0) goto L_0x0b1c
            java.lang.Object r1 = r1.get(r0)
            com.ss.android.ugc.aweme.commerce.service.models.PromotionMarketFloor r1 = (com.ss.android.ugc.aweme.commerce.service.models.PromotionMarketFloor) r1
            android.widget.FrameLayout r6 = r14.g
            if (r6 != 0) goto L_0x0a68
            java.lang.String r8 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x0a68:
            android.view.View r6 = (android.view.View) r6
            r8 = 2131170852(0x7f071624, float:1.7956074E38)
            android.view.View r6 = r6.findViewById(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r6
            java.lang.String r8 = "headerView.tv_market_title"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r8)
            java.lang.String r8 = r1.getTitle()
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r6.setText(r8)
            android.widget.FrameLayout r6 = r14.g
            if (r6 != 0) goto L_0x0a8a
            java.lang.String r8 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x0a8a:
            android.view.View r6 = (android.view.View) r6
            r8 = 2131170851(0x7f071623, float:1.7956072E38)
            android.view.View r6 = r6.findViewById(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r6
            java.lang.String r8 = "headerView.tv_market_name"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r8)
            java.lang.String r8 = r1.getName()
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r6.setText(r8)
            com.ss.android.ugc.aweme.base.model.UrlModel r6 = r1.getIcon()
            if (r6 != 0) goto L_0x0ac6
            android.widget.FrameLayout r6 = r14.g
            if (r6 != 0) goto L_0x0ab2
            java.lang.String r8 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x0ab2:
            android.view.View r6 = (android.view.View) r6
            r8 = 2131167660(0x7f0709ac, float:1.79496E38)
            android.view.View r6 = r6.findViewById(r8)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r6 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r6
            java.lang.String r8 = "headerView.iv_market_icon"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r8)
            r6.setVisibility(r4)
            goto L_0x0ad4
        L_0x0ac6:
            com.ss.android.ugc.aweme.base.model.UrlModel r6 = r1.getIcon()
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$ba r8 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$ba
            r8.<init>(r1, r14)
            com.ss.android.ugc.aweme.base.c$a r8 = (com.ss.android.ugc.aweme.base.c.a) r8
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.model.UrlModel) r6, (com.ss.android.ugc.aweme.base.c.a) r8)
        L_0x0ad4:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r6 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService> r8 = com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService.class
            java.lang.Object r6 = r6.getService(r8)
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r6 = (com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService) r6
            java.lang.String r8 = r1.getTma_url()
            r6.preloadMiniApp(r8)
            android.widget.FrameLayout r6 = r14.g
            if (r6 != 0) goto L_0x0af0
            java.lang.String r8 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x0af0:
            android.view.View r6 = (android.view.View) r6
            android.view.View r6 = r6.findViewById(r7)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$bb r7 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$bb
            r7.<init>(r1, r14)
            android.view.View$OnClickListener r7 = (android.view.View.OnClickListener) r7
            r6.setOnClickListener(r7)
            goto L_0x0b1c
        L_0x0b03:
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x0b0c
            java.lang.String r6 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
        L_0x0b0c:
            android.view.View r1 = (android.view.View) r1
            android.view.View r1 = r1.findViewById(r7)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            java.lang.String r6 = "headerView.market_container"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r6)
            r1.setVisibility(r4)
        L_0x0b1c:
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r14.D
            if (r1 != 0) goto L_0x0b25
            java.lang.String r6 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
        L_0x0b25:
            java.util.List r1 = r1.getLabels()
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r8 = f2890a
            r9 = 0
            r10 = 28641(0x6fe1, float:4.0135E-41)
            java.lang.Class[] r11 = new java.lang.Class[r5]
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r11[r0] = r7
            java.lang.Class r12 = java.lang.Void.TYPE
            r7 = r14
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)
            if (r6 == 0) goto L_0x0b57
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = f2890a
            r10 = 0
            r11 = 28641(0x6fe1, float:4.0135E-41)
            java.lang.Class[] r12 = new java.lang.Class[r5]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r12[r0] = r1
            java.lang.Class r13 = java.lang.Void.TYPE
            r8 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0bb6
        L_0x0b57:
            r6 = 2131170269(0x7f0713dd, float:1.7954892E38)
            if (r1 == 0) goto L_0x0b9d
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L_0x0b63
            goto L_0x0b9d
        L_0x0b63:
            android.widget.FrameLayout r7 = r14.g
            if (r7 != 0) goto L_0x0b6c
            java.lang.String r8 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x0b6c:
            android.view.View r7 = (android.view.View) r7
            android.view.View r7 = r7.findViewById(r6)
            com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout r7 = (com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout) r7
            java.lang.String r8 = "headerView.tagsView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r8)
            r7.setVisibility(r0)
            android.widget.FrameLayout r7 = r14.g
            if (r7 != 0) goto L_0x0b85
            java.lang.String r8 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x0b85:
            android.view.View r7 = (android.view.View) r7
            android.view.View r6 = r7.findViewById(r6)
            com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout r6 = (com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout) r6
            java.lang.String r7 = "headerView.tagsView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r7)
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$bc r7 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$bc
            r7.<init>(r14, r1, r1)
            com.ss.android.ugc.aweme.widget.flowlayout.a r7 = (com.ss.android.ugc.aweme.widget.flowlayout.a) r7
            r6.setAdapter(r7)
            goto L_0x0bb6
        L_0x0b9d:
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x0ba6
            java.lang.String r7 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x0ba6:
            android.view.View r1 = (android.view.View) r1
            android.view.View r1 = r1.findViewById(r6)
            com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout r1 = (com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout) r1
            java.lang.String r6 = "headerView.tagsView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r6)
            r1.setVisibility(r4)
        L_0x0bb6:
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r14.D
            if (r1 != 0) goto L_0x0bbf
            java.lang.String r6 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
        L_0x0bbf:
            com.ss.android.ugc.aweme.commerce.service.models.r r1 = r1.getToutiao()
            if (r1 == 0) goto L_0x0bca
            java.util.List r1 = r1.getCouponRule()
            goto L_0x0bcb
        L_0x0bca:
            r1 = r3
        L_0x0bcb:
            if (r1 == 0) goto L_0x0c03
            android.widget.FrameLayout r6 = r14.g
            if (r6 != 0) goto L_0x0bd6
            java.lang.String r7 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x0bd6:
            android.view.View r6 = (android.view.View) r6
            r7 = 2131166204(0x7f0703fc, float:1.7946647E38)
            android.view.View r6 = r6.findViewById(r7)
            com.ss.android.ugc.aweme.commerce.widget.CouponGroupLayout r6 = (com.ss.android.ugc.aweme.commerce.widget.CouponGroupLayout) r6
            r6.a(r1)
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x0bed
            java.lang.String r6 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
        L_0x0bed:
            android.view.View r1 = (android.view.View) r1
            android.view.View r1 = r1.findViewById(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r0)
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$be r2 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$be
            r2.<init>(r14)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            goto L_0x0c1c
        L_0x0c03:
            android.widget.FrameLayout r1 = r14.g
            if (r1 != 0) goto L_0x0c0c
            java.lang.String r6 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
        L_0x0c0c:
            android.view.View r1 = (android.view.View) r1
            android.view.View r1 = r1.findViewById(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            java.lang.String r2 = "headerView.couponContainer"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r4)
        L_0x0c1c:
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r14.D
            if (r1 != 0) goto L_0x0c25
            java.lang.String r2 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0c25:
            com.ss.android.ugc.aweme.commerce.service.models.r r1 = r1.getToutiao()
            if (r1 == 0) goto L_0x0c36
            com.ss.android.ugc.aweme.commerce.service.models.af r1 = r1.getReductionInfo()
            if (r1 == 0) goto L_0x0c36
            java.util.List r1 = r1.getFullReduction()
            goto L_0x0c37
        L_0x0c36:
            r1 = r3
        L_0x0c37:
            com.ss.android.ugc.aweme.commerce.service.models.h r2 = r14.D
            if (r2 != 0) goto L_0x0c40
            java.lang.String r6 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
        L_0x0c40:
            com.ss.android.ugc.aweme.commerce.service.models.r r2 = r2.getToutiao()
            if (r2 == 0) goto L_0x0c50
            com.ss.android.ugc.aweme.commerce.service.models.af r2 = r2.getReductionInfo()
            if (r2 == 0) goto L_0x0c50
            java.lang.String r3 = r2.getUrl()
        L_0x0c50:
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L_0x0c5e
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0c5c
            goto L_0x0c5e
        L_0x0c5c:
            r2 = 0
            goto L_0x0c5f
        L_0x0c5e:
            r2 = 1
        L_0x0c5f:
            if (r2 != 0) goto L_0x0d00
            android.widget.FrameLayout r2 = r14.g
            if (r2 != 0) goto L_0x0c6a
            java.lang.String r4 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x0c6a:
            android.view.View r2 = (android.view.View) r2
            r4 = 2131166830(0x7f07066e, float:1.7947916E38)
            android.view.View r2 = r2.findViewById(r4)
            com.ss.android.ugc.aweme.widget.flowlayout.FlowLayout r2 = (com.ss.android.ugc.aweme.widget.flowlayout.FlowLayout) r2
            r2.setMaxLine(r5)
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0c7f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0cde
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            android.widget.FrameLayout r5 = r14.g
            if (r5 != 0) goto L_0x0c94
            java.lang.String r6 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
        L_0x0c94:
            android.view.View r5 = (android.view.View) r5
            r6 = 2131166830(0x7f07066e, float:1.7947916E38)
            android.view.View r5 = r5.findViewById(r6)
            com.ss.android.ugc.aweme.widget.flowlayout.FlowLayout r5 = (com.ss.android.ugc.aweme.widget.flowlayout.FlowLayout) r5
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = new com.bytedance.ies.dmt.ui.widget.DmtTextView
            r7 = r14
            android.content.Context r7 = (android.content.Context) r7
            r6.<init>(r7)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r6.setText(r4)
            r4 = 1095761920(0x41500000, float:13.0)
            r6.setTextSize(r4)
            android.view.ViewGroup$MarginLayoutParams r4 = new android.view.ViewGroup$MarginLayoutParams
            r7 = -2
            r8 = -2
            r4.<init>(r7, r8)
            android.content.Context r7 = r6.getContext()
            r8 = 1092616192(0x41200000, float:10.0)
            float r7 = com.bytedance.common.utility.UIUtils.dip2Px(r7, r8)
            int r7 = (int) r7
            r4.rightMargin = r7
            android.view.ViewGroup$LayoutParams r4 = (android.view.ViewGroup.LayoutParams) r4
            r6.setLayoutParams(r4)
            android.content.res.Resources r4 = r6.getResources()
            r7 = 2131624148(0x7f0e00d4, float:1.8875468E38)
            int r4 = r4.getColor(r7)
            r6.setTextColor(r4)
            android.view.View r6 = (android.view.View) r6
            r5.addView(r6)
            goto L_0x0c7f
        L_0x0cde:
            android.widget.FrameLayout r2 = r14.g
            if (r2 != 0) goto L_0x0ce7
            java.lang.String r4 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x0ce7:
            android.view.View r2 = (android.view.View) r2
            r4 = 2131166126(0x7f0703ae, float:1.7946489E38)
            android.view.View r2 = r2.findViewById(r4)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r2.setVisibility(r0)
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$bf r0 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$bf
            r0.<init>(r14, r3, r1)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r2.setOnClickListener(r0)
            goto L_0x0d1c
        L_0x0d00:
            android.widget.FrameLayout r0 = r14.g
            if (r0 != 0) goto L_0x0d09
            java.lang.String r1 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0d09:
            android.view.View r0 = (android.view.View) r0
            r1 = 2131166126(0x7f0703ae, float:1.7946489E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r1 = "headerView.container_promotion"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r4)
        L_0x0d1c:
            r14.y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.x():void");
    }

    public static final /* synthetic */ FrameLayout a(PreviewActivity previewActivity) {
        FrameLayout frameLayout = previewActivity.g;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        return frameLayout;
    }

    public static final /* synthetic */ CommerceUser b(PreviewActivity previewActivity) {
        CommerceUser commerceUser = previewActivity.E;
        if (commerceUser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUserInfo");
        }
        return commerceUser;
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.commerce.service.models.h c(PreviewActivity previewActivity) {
        com.ss.android.ugc.aweme.commerce.service.models.h hVar = previewActivity.D;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
        }
        return hVar;
    }

    public static final /* synthetic */ ProductCommentAdapter d(PreviewActivity previewActivity) {
        ProductCommentAdapter productCommentAdapter = previewActivity.A;
        if (productCommentAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mProductCommentAdapter");
        }
        return productCommentAdapter;
    }

    public static final /* synthetic */ StaggeredGridLayoutManager e(PreviewActivity previewActivity) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = previewActivity.h;
        if (staggeredGridLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("staggeredLayoutManager");
        }
        return staggeredGridLayoutManager;
    }

    public final void b(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f2890a, false, 28549, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f2890a, false, 28549, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        a(com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(this, C0906R.string.b76, new Object[0]), true);
    }

    public final void c(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f2890a, false, 28550, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f2890a, false, 28550, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        a(com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(this, C0906R.string.b76, new Object[0]), true);
    }

    @Subscribe
    public final void onEvent(@NotNull com.ss.android.ugc.aweme.im.service.model.g gVar) {
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f2890a, false, 28612, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, f2890a, false, 28612, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(gVar, "event");
        if (TextUtils.equals("good", gVar.itemType)) {
            dv.a(this, (RecyclerView) e((int) C0906R.id.cc5), gVar);
        }
    }

    public final void onSaveInstanceState(@NotNull Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f2890a, false, 28580, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f2890a, false, 28580, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bundle2, "savedInstanceState");
        bundle2.putInt("scroll_y", this.O);
        super.onSaveInstanceState(bundle);
    }

    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2890a, false, 28599, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2890a, false, 28599, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if ((((PreviewTitle) e((int) C0906R.id.c5h)).getCurrentTab() < PreviewTitle.a.b() && i2 > PreviewTitle.a.b()) || (((PreviewTitle) e((int) C0906R.id.c5h)).getCurrentTab() > PreviewTitle.a.b() && i2 < PreviewTitle.a.b())) {
            this.V = false;
        }
        if (this.O - this.j > this.P) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = this.h;
            if (staggeredGridLayoutManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("staggeredLayoutManager");
            }
            staggeredGridLayoutManager.scrollToPositionWithOffset(0, -this.P);
            this.O = this.P;
        }
        ((RecyclerView) e((int) C0906R.id.cc5)).post(new bj(this, i2));
    }

    /* access modifiers changed from: package-private */
    public final void d(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2890a, false, 28601, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2890a, false, 28601, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (((PreviewTitle) e((int) C0906R.id.c5h)).getCurrentTab() != PreviewTitle.a.b() && i2 == PreviewTitle.a.b()) {
            this.ax = SystemClock.uptimeMillis();
        }
        if (((PreviewTitle) e((int) C0906R.id.c5h)).getCurrentTab() == PreviewTitle.a.b() && i2 != PreviewTitle.a.b()) {
            if (this.V && this.ax != 0) {
                com.ss.android.ugc.aweme.commerce.service.logs.v vVar = new com.ss.android.ugc.aweme.commerce.service.logs.v();
                vVar.f38160f = String.valueOf(SystemClock.uptimeMillis() - this.ax);
                vVar.b();
            }
            this.ax = 0;
        }
        ((PreviewTitle) e((int) C0906R.id.c5h)).setTab(i2);
    }

    @Subscribe
    public final void onEvent(@NotNull com.ss.android.ugc.aweme.feed.f.ar arVar) {
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{arVar}, this, f2890a, false, 28611, new Class[]{com.ss.android.ugc.aweme.feed.f.ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar}, this, f2890a, false, 28611, new Class[]{com.ss.android.ugc.aweme.feed.f.ar.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(arVar, "event");
        if (arVar.f45292b == 21 && (arVar.f45293c instanceof Aweme) && this.o) {
            this.V = false;
            Object obj = arVar.f45293c;
            if (obj != null) {
                Aweme aweme = (Aweme) obj;
                if (!PatchProxy.isSupport(new Object[]{aweme}, this, f2890a, false, 28613, new Class[]{Aweme.class}, Integer.TYPE)) {
                    Iterator<Aweme> it2 = this.au.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            i2 = -1;
                            break;
                        } else if (TextUtils.equals(aweme.getAid(), it2.next().getAid())) {
                            i2 = i3;
                            break;
                        } else {
                            i3++;
                        }
                    }
                } else {
                    i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{aweme}, this, f2890a, false, 28613, new Class[]{Aweme.class}, Integer.TYPE)).intValue();
                }
                this.p = true;
                C().setTargetPosition(i2 + 1);
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.h;
                if (staggeredGridLayoutManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("staggeredLayoutManager");
                }
                staggeredGridLayoutManager.startSmoothScroll(C());
                ((RecyclerView) e((int) C0906R.id.cc5)).postDelayed(new ar(this, i2), 500);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            }
        }
        this.o = true;
    }

    public final void b(int i2) {
        String str;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2890a, false, 28578, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2890a, false, 28578, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        PreviewTitle previewTitle = (PreviewTitle) e((int) C0906R.id.c5h);
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, previewTitle, PreviewTitle.f38376a, false, 30217, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PreviewTitle previewTitle2 = previewTitle;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, previewTitle2, PreviewTitle.f38376a, false, 30217, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!previewTitle.f38381e) {
            if (i3 <= 0) {
                DmtTextView dmtTextView = (DmtTextView) previewTitle.a((int) C0906R.id.qw);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "cartMessageTV");
                dmtTextView.setVisibility(8);
                return;
            }
            DmtTextView dmtTextView2 = (DmtTextView) previewTitle.a((int) C0906R.id.qw);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "cartMessageTV");
            dmtTextView2.setVisibility(0);
            DmtTextView dmtTextView3 = (DmtTextView) previewTitle.a((int) C0906R.id.qw);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "cartMessageTV");
            if (i3 >= 0 && 100 >= i3) {
                str = String.valueOf(i2);
            } else {
                str = previewTitle.getResources().getString(C0906R.string.wi);
            }
            dmtTextView3.setText(str);
        }
    }

    public final void onClickCollection(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f2890a, false, 28598, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f2890a, false, 28598, new Class[]{View.class}, Void.TYPE);
            return;
        }
        f fVar = this.f2894e;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCollectionPresenter");
        }
        if (PatchProxy.isSupport(new Object[]{view2}, fVar, f.f37383a, false, 28755, new Class[]{View.class}, Void.TYPE)) {
            f fVar2 = fVar;
            PatchProxy.accessDispatch(new Object[]{view2}, fVar2, f.f37383a, false, 28755, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "anchorView");
        if (PatchProxy.isSupport(new Object[0], fVar, f.f37383a, false, 28758, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], fVar, f.f37383a, false, 28758, new Class[0], Void.TYPE);
        } else if (fVar.f37387e) {
            com.ss.android.ugc.aweme.commerce.service.logs.d dVar = new com.ss.android.ugc.aweme.commerce.service.logs.d();
            dVar.f38124f = fVar.j.getPromotionId();
            dVar.g = String.valueOf(fVar.j.getCommodityType());
            dVar.b();
        } else {
            com.ss.android.ugc.aweme.commercialize.log.g.a((Context) fVar.f37385c, com.ss.android.ugc.aweme.commerce.a.a.a(fVar.l), fVar.j, SystemClock.uptimeMillis() - fVar.m);
            com.ss.android.ugc.aweme.commerce.service.logs.t tVar = new com.ss.android.ugc.aweme.commerce.service.logs.t();
            tVar.f38156f = fVar.j.getPromotionId();
            tVar.g = String.valueOf(fVar.j.getCommodityType());
            tVar.b();
        }
        IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        if (!a2.isLogin()) {
            com.ss.android.ugc.aweme.login.e.a((Activity) fVar.f37385c, "commodity_page", "click_add_to_cart", (com.ss.android.ugc.aweme.base.component.f) new f.c(fVar));
            return;
        }
        fVar.f37388f = view2;
        fVar.b();
    }

    public final void c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2890a, false, 28618, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f2890a, false, 28618, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.commerce.service.models.h hVar = this.D;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
        }
        if (!hVar.isOnSale()) {
            TextView textView = (TextView) e((int) C0906R.id.dif);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tv_sell_out");
            textView.setVisibility(0);
            TextView textView2 = (TextView) e((int) C0906R.id.dif);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tv_sell_out");
            textView2.setText(com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(this, C0906R.string.yc, new Object[0]));
            return;
        }
        com.ss.android.ugc.aweme.commerce.service.models.h hVar2 = this.D;
        if (hVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
        }
        if (!hVar2.isThirdParty()) {
            com.ss.android.ugc.aweme.commerce.service.models.h hVar3 = this.D;
            if (hVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
            }
            if (!hVar3.isAppointment() && z2) {
                TextView textView3 = (TextView) e((int) C0906R.id.dif);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "tv_sell_out");
                textView3.setVisibility(0);
                TextView textView4 = (TextView) e((int) C0906R.id.dif);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "tv_sell_out");
                textView4.setText(com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(this, C0906R.string.yd, new Object[0]));
                return;
            }
        }
        TextView textView5 = (TextView) e((int) C0906R.id.dif);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "tv_sell_out");
        textView5.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x02df, code lost:
        if (r0 == null) goto L_0x02e1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r22) {
        /*
            r21 = this;
            r7 = r21
            r8 = r22
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 28562(0x6f92, float:4.0024E-41)
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28562(0x6f92, float:4.0024E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            java.lang.String r0 = "com.ss.android.ugc.aweme.commerce.preview.PreviewActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            super.onCreate(r22)
            r7.ak = r10
            long r0 = android.os.SystemClock.uptimeMillis()
            r7.s = r0
            com.ss.android.ugc.aweme.utils.bg.c(r21)
            com.ss.android.ugc.aweme.commerce.preview.PreviewHomeWatcherReceiver r0 = new com.ss.android.ugc.aweme.commerce.preview.PreviewHomeWatcherReceiver
            r0.<init>()
            r7.aj = r0
            r11 = 0
            if (r8 == 0) goto L_0x0060
            java.lang.String r0 = "scroll_y"
            int r0 = r8.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0061
        L_0x0060:
            r0 = r11
        L_0x0061:
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = "scroll_y"
            int r0 = r8.getInt(r0)
            r7.O = r0
        L_0x006b:
            r0 = 2131690556(0x7f0f043c, float:1.9010159E38)
            r7.setContentView((int) r0)
            r8 = r7
            android.app.Activity r8 = (android.app.Activity) r8
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28642(0x6fe2, float:4.0136E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r12 = 3
            if (r0 == 0) goto L_0x00a6
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28642(0x6fe2, float:4.0136E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x014c
        L_0x00a6:
            com.ss.android.ugc.aweme.commerce.preview.footprint.c r0 = r21.u()
            r1 = r8
            android.content.Context r1 = (android.content.Context) r1
            r2 = 2131169225(0x7f070fc9, float:1.7952774E38)
            android.view.View r2 = r7.e((int) r2)
            com.ss.android.ugc.aweme.commerce.preview.refresh.PtrFrameLayout r2 = (com.ss.android.ugc.aweme.commerce.preview.refresh.PtrFrameLayout) r2
            java.lang.String r3 = "ptrFrame"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$ai r3 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$ai
            r3.<init>(r7, r8)
            com.ss.android.ugc.aweme.commerce.preview.refresh.a r3 = (com.ss.android.ugc.aweme.commerce.preview.refresh.a) r3
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r10] = r1
            r13[r9] = r2
            r4 = 2
            r13[r4] = r3
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.commerce.preview.footprint.c.f37474a
            r16 = 0
            r17 = 28929(0x7101, float:4.0538E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r10] = r6
            java.lang.Class<com.ss.android.ugc.aweme.commerce.preview.refresh.PtrFrameLayout> r6 = com.ss.android.ugc.aweme.commerce.preview.refresh.PtrFrameLayout.class
            r5[r9] = r6
            java.lang.Class<com.ss.android.ugc.aweme.commerce.preview.refresh.a> r6 = com.ss.android.ugc.aweme.commerce.preview.refresh.a.class
            r5[r4] = r6
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r0
            r18 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r5 == 0) goto L_0x010f
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r10] = r1
            r13[r9] = r2
            r13[r4] = r3
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.commerce.preview.footprint.c.f37474a
            r16 = 0
            r17 = 28929(0x7101, float:4.0538E-41)
            java.lang.Class[] r1 = new java.lang.Class[r12]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r10] = r2
            java.lang.Class<com.ss.android.ugc.aweme.commerce.preview.refresh.PtrFrameLayout> r2 = com.ss.android.ugc.aweme.commerce.preview.refresh.PtrFrameLayout.class
            r1[r9] = r2
            java.lang.Class<com.ss.android.ugc.aweme.commerce.preview.refresh.a> r2 = com.ss.android.ugc.aweme.commerce.preview.refresh.a.class
            r1[r4] = r2
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r0
            r18 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x014c
        L_0x010f:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r0)
            java.lang.String r0 = "ptrFrame"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            java.lang.String r0 = "handler"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            com.ss.android.ugc.aweme.commerce.preview.refresh.a.a r3 = (com.ss.android.ugc.aweme.commerce.preview.refresh.a.a) r3
            r2.setPtrHandler(r3)
            com.ss.android.ugc.aweme.commerce.preview.refresh.b.a r0 = new com.ss.android.ugc.aweme.commerce.preview.refresh.b.a
            r0.<init>(r1)
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            r2.setHeaderView(r1)
            r2.setKeepHeaderWhenRefresh(r10)
            r1 = 1074161254(0x40066666, float:2.1)
            r2.setResistance(r1)
            r1 = 200(0xc8, float:2.8E-43)
            r2.setDurationToClose(r1)
            com.ss.android.ugc.aweme.commerce.preview.refresh.a.b r0 = (com.ss.android.ugc.aweme.commerce.preview.refresh.a.b) r0
            r2.a((com.ss.android.ugc.aweme.commerce.preview.refresh.a.b) r0)
            r2.setDurationToCloseHeader(r1)
            r2.f37605e = r9
            r0 = 1067702026(0x3fa3d70a, float:1.28)
            r2.setRatioOfHeaderHeightToRefresh(r0)
        L_0x014c:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28563(0x6f93, float:4.0025E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r13 = 2131170095(0x7f07132f, float:1.7954539E38)
            if (r0 == 0) goto L_0x0173
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28563(0x6f93, float:4.0025E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0183
        L_0x0173:
            r0 = r7
            android.content.Context r0 = (android.content.Context) r0
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r0 = com.bytedance.ies.dmt.ui.widget.DmtStatusView.a.a((android.content.Context) r0)
            android.view.View r1 = r7.e((int) r13)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = (com.bytedance.ies.dmt.ui.widget.DmtStatusView) r1
            r1.setBuilder(r0)
        L_0x0183:
            r0 = 2131166136(0x7f0703b8, float:1.7946509E38)
            android.view.View r0 = r7.e((int) r0)
            com.ss.android.ugc.aweme.commerce.widget.PreviewRelativeLayout r0 = (com.ss.android.ugc.aweme.commerce.widget.PreviewRelativeLayout) r0
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$aq r1 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$aq
            r1.<init>(r7)
            com.ss.android.ugc.aweme.commerce.widget.PreviewRelativeLayout$a r1 = (com.ss.android.ugc.aweme.commerce.widget.PreviewRelativeLayout.a) r1
            r0.setOnPreviewClickListener(r1)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28565(0x6f95, float:4.0028E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01bb
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28565(0x6f95, float:4.0028E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0300
        L_0x01bb:
            com.ss.android.ugc.aweme.commerce.preview.h$a r0 = com.ss.android.ugc.aweme.commerce.preview.h.f37502d
            java.lang.Object[] r14 = new java.lang.Object[r9]
            r14[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.commerce.preview.h.a.f37503a
            r17 = 0
            r18 = 28774(0x7066, float:4.0321E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            r1[r10] = r2
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.n> r20 = com.ss.android.ugc.aweme.commerce.service.models.n.class
            r15 = r0
            r19 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r1 == 0) goto L_0x01f4
            java.lang.Object[] r14 = new java.lang.Object[r9]
            r14[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.commerce.preview.h.a.f37503a
            r17 = 0
            r18 = 28774(0x7066, float:4.0321E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            r1[r10] = r2
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.n> r20 = com.ss.android.ugc.aweme.commerce.service.models.n.class
            r15 = r0
            r19 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            com.ss.android.ugc.aweme.commerce.service.models.n r0 = (com.ss.android.ugc.aweme.commerce.service.models.n) r0
            goto L_0x026c
        L_0x01f4:
            java.lang.String r0 = "act"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            android.content.Intent r0 = r8.getIntent()
            java.lang.String r1 = "KEY_HASH_CODE"
            java.lang.String r0 = r0.getStringExtra(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.commerce.service.models.n> r1 = com.ss.android.ugc.aweme.commerce.preview.h.f37499a
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r1.get(r0)
            com.ss.android.ugc.aweme.commerce.service.models.n r1 = (com.ss.android.ugc.aweme.commerce.service.models.n) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getPreviewModel; key is "
            r2.<init>(r3)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.append(r0)
            java.lang.String r0 = " and hashMap is "
            r2.append(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.commerce.service.models.n> r0 = com.ss.android.ugc.aweme.commerce.preview.h.f37499a
            r2.append(r0)
            java.lang.String r0 = " and address is "
            r2.append(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.commerce.service.models.n> r0 = com.ss.android.ugc.aweme.commerce.preview.h.f37499a
            int r0 = java.lang.System.identityHashCode(r0)
            r2.append(r0)
            java.lang.String r0 = " pressBack is "
            r2.append(r0)
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity r8 = (com.ss.android.ugc.aweme.commerce.preview.PreviewActivity) r8
            boolean r0 = r8.t
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.append(r0)
            java.lang.String r0 = " and pid is "
            r2.append(r0)
            int r0 = android.os.Process.myPid()
            r2.append(r0)
            java.lang.String r0 = " and tid is "
            r2.append(r0)
            int r0 = android.os.Process.myTid()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = com.ss.android.ugc.aweme.commerce.preview.h.f37501c
            com.ss.android.ugc.aweme.framework.a.a.a(r12, r2, r0)
            if (r1 != 0) goto L_0x026b
            com.ss.android.ugc.aweme.commerce.service.l.c$a r2 = com.ss.android.ugc.aweme.commerce.service.l.c.f37989a
            r2.a((java.lang.String) r0)
        L_0x026b:
            r0 = r1
        L_0x026c:
            if (r0 == 0) goto L_0x0271
            long r1 = r0.m
            goto L_0x0275
        L_0x0271:
            long r1 = android.os.SystemClock.uptimeMillis()
        L_0x0275:
            r7.r = r1
            if (r0 != 0) goto L_0x0280
            kotlin.jvm.functions.Function1<org.json.JSONObject, kotlin.Unit> r0 = r7.w
            r0.invoke(r11)
            goto L_0x0300
        L_0x0280:
            r7.q = r0
            java.lang.String r1 = r0.h
            r7.ar = r1
            java.lang.String r1 = r0.f38224f
            if (r1 != 0) goto L_0x028c
            java.lang.String r1 = "INVALID_ENTER_FROM"
        L_0x028c:
            r7.R = r1
            java.lang.String r1 = r0.g
            if (r1 != 0) goto L_0x0294
            java.lang.String r1 = "click_slide_card"
        L_0x0294:
            r7.N = r1
            java.lang.String r1 = r0.o
            r7.T = r1
            android.view.View r1 = r7.e((int) r13)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = (com.bytedance.ies.dmt.ui.widget.DmtStatusView) r1
            java.lang.String r2 = "statusView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r10)
            android.view.View r1 = r7.e((int) r13)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = (com.bytedance.ies.dmt.ui.widget.DmtStatusView) r1
            r1.d()
            com.ss.android.ugc.aweme.commerce.service.models.CommerceUser r1 = r0.f38221c
            if (r1 != 0) goto L_0x02f4
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28566(0x6f96, float:4.003E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02d9
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28566(0x6f96, float:4.003E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0300
        L_0x02d9:
            com.ss.android.ugc.aweme.commerce.service.models.n r0 = r7.q
            if (r0 == 0) goto L_0x02e1
            java.lang.String r0 = r0.q
            if (r0 != 0) goto L_0x02e3
        L_0x02e1:
            java.lang.String r0 = ""
        L_0x02e3:
            a.i r0 = com.ss.android.ugc.aweme.commerce.preview.api.a.a(r0)
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$an r1 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$an
            r1.<init>(r7)
            a.g r1 = (a.g) r1
            java.util.concurrent.Executor r2 = a.i.f1052b
            r0.a((a.g<TResult, TContinuationResult>) r1, (java.util.concurrent.Executor) r2)
            goto L_0x0300
        L_0x02f4:
            com.ss.android.ugc.aweme.commerce.service.models.CommerceUser r0 = r0.f38221c
            if (r0 != 0) goto L_0x02fb
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x02fb:
            r7.E = r0
            r21.g()
        L_0x0300:
            java.lang.String r0 = "com.ss.android.ugc.aweme.commerce.preview.PreviewActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    @android.annotation.SuppressLint({"notifyDataSetChanged"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(boolean r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 28617(0x6fc9, float:4.0101E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f2890a
            r3 = 0
            r4 = 28617(0x6fc9, float:4.0101E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            r0 = 2131169117(0x7f070f5d, float:1.7952555E38)
            android.view.View r1 = r9.e((int) r0)
            com.ss.android.ugc.aweme.commerce.widget.PreviewTitle r1 = (com.ss.android.ugc.aweme.commerce.widget.PreviewTitle) r1
            boolean r2 = r9.j()
            r1.a((boolean) r2)
            android.view.View r1 = r9.e((int) r0)
            com.ss.android.ugc.aweme.commerce.widget.PreviewTitle r1 = (com.ss.android.ugc.aweme.commerce.widget.PreviewTitle) r1
            com.ss.android.ugc.aweme.commerce.service.models.h r2 = r9.D
            if (r2 != 0) goto L_0x0057
            java.lang.String r3 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0057:
            boolean r2 = r2.isThirdParty()
            r1.d(r2)
            android.view.View r0 = r9.e((int) r0)
            com.ss.android.ugc.aweme.commerce.widget.PreviewTitle r0 = (com.ss.android.ugc.aweme.commerce.widget.PreviewTitle) r0
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r9.D
            if (r1 != 0) goto L_0x006d
            java.lang.String r2 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x006d:
            java.lang.Boolean r1 = r1.getHasGuessULike()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            r1 = r1 ^ r7
            r0.b((boolean) r1)
            android.widget.FrameLayout r0 = r9.g
            if (r0 != 0) goto L_0x0084
            java.lang.String r1 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0084:
            android.view.View r0 = (android.view.View) r0
            r1 = 2131169939(0x7f071293, float:1.7954222E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r1 = "headerView.shopContainer"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 8
            r0.setVisibility(r1)
            r9.r()
            android.widget.FrameLayout r0 = r9.g
            if (r0 != 0) goto L_0x00a5
            java.lang.String r2 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x00a5:
            android.view.View r0 = (android.view.View) r0
            r2 = 2131171334(0x7f071806, float:1.7957052E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r2 = "headerView.videoCommentGuideContainer"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            r0.setVisibility(r8)
            android.widget.FrameLayout r0 = r9.g
            if (r0 != 0) goto L_0x00c1
            java.lang.String r2 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x00c1:
            android.view.View r0 = (android.view.View) r0
            r2 = 2131171331(0x7f071803, float:1.7957046E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r2 = "headerView.videoCommentContainer"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            r0.setVisibility(r1)
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = new com.ss.android.ugc.aweme.commerce.service.logs.al
            r0.<init>()
            java.lang.String r2 = r9.F
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.d(r2)
            java.lang.String r2 = r9.N
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.e(r2)
            com.ss.android.ugc.aweme.commerce.service.models.h r2 = r9.D
            if (r2 != 0) goto L_0x00ee
            java.lang.String r3 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x00ee:
            int r2 = r2.getElasticType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.b((java.lang.Integer) r2)
            java.lang.String r2 = "full_screen_card"
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.b((java.lang.String) r2)
            com.ss.android.ugc.aweme.commerce.service.models.h r2 = r9.D
            if (r2 != 0) goto L_0x0109
            java.lang.String r3 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0109:
            java.lang.String r2 = r2.getPromotionId()
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.c((java.lang.String) r2)
            com.ss.android.ugc.aweme.commerce.service.models.h r2 = r9.D
            if (r2 != 0) goto L_0x011a
            java.lang.String r3 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x011a:
            long r2 = r2.getCommodityType()
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.a((java.lang.Integer) r2)
            java.lang.String r2 = r9.R
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.a((java.lang.String) r2)
            com.ss.android.ugc.aweme.commerce.service.models.h r2 = r9.D
            if (r2 != 0) goto L_0x0136
            java.lang.String r3 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0136:
            boolean r2 = r2.hasCoupon()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.b((java.lang.Boolean) r2)
            com.ss.android.ugc.aweme.commerce.service.models.h r2 = r9.D
            if (r2 != 0) goto L_0x014b
            java.lang.String r3 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x014b:
            com.ss.android.ugc.aweme.commerce.service.models.o r2 = r2.getActivity()
            if (r2 == 0) goto L_0x0159
            boolean r2 = r2.canBeShown()
            if (r2 != r7) goto L_0x0159
            r2 = 1
            goto L_0x015a
        L_0x0159:
            r2 = 0
        L_0x015a:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.c((java.lang.Boolean) r2)
            com.ss.android.ugc.aweme.commerce.service.models.h r2 = r9.D
            if (r2 != 0) goto L_0x016b
            java.lang.String r3 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x016b:
            boolean r2 = r2.isSelf()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.a((java.lang.Boolean) r2)
            com.ss.android.ugc.aweme.commerce.service.models.CommerceUser r2 = r9.E
            if (r2 != 0) goto L_0x0180
            java.lang.String r3 = "mUserInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0180:
            java.lang.String r2 = r2.getUid()
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.f(r2)
            r0.b()
            r9.x()
            android.widget.FrameLayout r0 = r9.g
            if (r0 != 0) goto L_0x0197
            java.lang.String r2 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0197:
            android.view.View r0 = (android.view.View) r0
            r2 = 2131166997(0x7f070715, float:1.7948255E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r2 = "headerView.goodDetailContainer"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            boolean r2 = r9.j()
            if (r2 == 0) goto L_0x01af
            r2 = 0
            goto L_0x01b1
        L_0x01af:
            r2 = 8
        L_0x01b1:
            r0.setVisibility(r2)
            android.widget.FrameLayout r0 = r9.g
            if (r0 != 0) goto L_0x01bd
            java.lang.String r2 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x01bd:
            android.view.View r0 = (android.view.View) r0
            r2 = 2131171333(0x7f071805, float:1.795705E38)
            android.view.View r0 = r0.findViewById(r2)
            java.lang.String r2 = "headerView.videoCommentDivider"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            boolean r2 = r9.j()
            if (r2 == 0) goto L_0x01d3
            r2 = 0
            goto L_0x01d5
        L_0x01d3:
            r2 = 8
        L_0x01d5:
            r0.setVisibility(r2)
            if (r10 == 0) goto L_0x02f5
            r9.a((int) r7)
            com.ss.android.ugc.aweme.commerce.service.logs.ab r0 = new com.ss.android.ugc.aweme.commerce.service.logs.ab
            r0.<init>()
            com.ss.android.ugc.aweme.commerce.service.models.CommerceUser r2 = r9.E
            if (r2 != 0) goto L_0x01eb
            java.lang.String r3 = "mUserInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x01eb:
            java.lang.String r2 = r2.getUid()
            com.ss.android.ugc.aweme.commerce.service.logs.ab r0 = r0.f(r2)
            com.ss.android.ugc.aweme.commerce.service.models.h r2 = r9.D
            if (r2 != 0) goto L_0x01fc
            java.lang.String r3 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x01fc:
            long r2 = r2.getCommodityType()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            com.ss.android.ugc.aweme.commerce.service.logs.ab r0 = r0.a((java.lang.Long) r2)
            com.ss.android.ugc.aweme.commerce.service.models.h r2 = r9.D
            if (r2 != 0) goto L_0x0211
            java.lang.String r3 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0211:
            boolean r2 = r2.isSelf()
            com.ss.android.ugc.aweme.commerce.service.logs.ab r0 = r0.b((boolean) r2)
            com.ss.android.ugc.aweme.commerce.service.models.h r2 = r9.D
            if (r2 != 0) goto L_0x0222
            java.lang.String r3 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0222:
            java.lang.String r2 = r2.getPromotionId()
            com.ss.android.ugc.aweme.commerce.service.logs.ab r0 = r0.b((java.lang.String) r2)
            java.lang.String r2 = r9.N
            int r3 = r2.hashCode()
            switch(r3) {
                case -2032820721: goto L_0x02c9;
                case -1743475325: goto L_0x02be;
                case -1576467622: goto L_0x02b3;
                case -1195363553: goto L_0x02a8;
                case -1113249803: goto L_0x029d;
                case -1042897765: goto L_0x0292;
                case -1008311216: goto L_0x0287;
                case -985715424: goto L_0x027c;
                case -762577321: goto L_0x0271;
                case 153863135: goto L_0x0265;
                case 433931546: goto L_0x0259;
                case 1243267108: goto L_0x024d;
                case 1705178010: goto L_0x0241;
                case 2089057309: goto L_0x0235;
                default: goto L_0x0233;
            }
        L_0x0233:
            goto L_0x02d4
        L_0x0235:
            java.lang.String r3 = "click_search_result"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02d4
            java.lang.String r2 = "search_result"
            goto L_0x02d6
        L_0x0241:
            java.lang.String r3 = "click_transform_card"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02d4
            java.lang.String r2 = "transform_card"
            goto L_0x02d6
        L_0x024d:
            java.lang.String r3 = "click_related_product"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02d4
            java.lang.String r2 = "full_screen_card"
            goto L_0x02d6
        L_0x0259:
            java.lang.String r3 = "click_store_product"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02d4
            java.lang.String r2 = "store_page"
            goto L_0x02d6
        L_0x0265:
            java.lang.String r3 = "click_video_tag"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02d4
            java.lang.String r2 = "video_cart_tag"
            goto L_0x02d6
        L_0x0271:
            java.lang.String r3 = "click_live_commerce"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02d4
            java.lang.String r2 = "live_slide_card"
            goto L_0x02d6
        L_0x027c:
            java.lang.String r3 = "click_shopping_cart"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02d4
            java.lang.String r2 = "shopping_cart"
            goto L_0x02d6
        L_0x0287:
            java.lang.String r3 = "click_message"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02d4
            java.lang.String r2 = "message"
            goto L_0x02d6
        L_0x0292:
            java.lang.String r3 = "click_track_card"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02d4
            java.lang.String r2 = "track_card"
            goto L_0x02d6
        L_0x029d:
            java.lang.String r3 = "click_slide_card"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02d4
            java.lang.String r2 = "slide_card"
            goto L_0x02d6
        L_0x02a8:
            java.lang.String r3 = "click_classification_result"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02d4
            java.lang.String r2 = "classification_result"
            goto L_0x02d6
        L_0x02b3:
            java.lang.String r3 = "click_collection_card"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02d4
            java.lang.String r2 = "collection_card"
            goto L_0x02d6
        L_0x02be:
            java.lang.String r3 = "click_comment_tag"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02d4
            java.lang.String r2 = "comment_cart_tag"
            goto L_0x02d6
        L_0x02c9:
            java.lang.String r3 = "click_pop_up_card"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02d4
            java.lang.String r2 = "pop_up_card"
            goto L_0x02d6
        L_0x02d4:
            java.lang.String r2 = "open_url"
        L_0x02d6:
            com.ss.android.ugc.aweme.commerce.service.logs.ab r0 = r0.a((java.lang.String) r2)
            java.lang.String r2 = r9.R
            com.ss.android.ugc.aweme.commerce.service.logs.ab r0 = r0.e(r2)
            java.lang.String r2 = r9.aw
            com.ss.android.ugc.aweme.commerce.service.logs.ab r0 = r0.g(r2)
            java.lang.String r2 = r9.F
            com.ss.android.ugc.aweme.commerce.service.logs.ab r0 = r0.c(r2)
            java.lang.String r2 = r9.N
            com.ss.android.ugc.aweme.commerce.service.logs.ab r0 = r0.d(r2)
            r0.b()
        L_0x02f5:
            com.ss.android.ugc.aweme.commerce.service.models.h r0 = r9.D
            if (r0 != 0) goto L_0x02fe
            java.lang.String r2 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x02fe:
            boolean r0 = r0.isOnSale()
            if (r0 != 0) goto L_0x030a
            r9.c((boolean) r8)
            r9.q()
        L_0x030a:
            com.ss.android.ugc.aweme.commerce.service.models.h r0 = r9.D
            if (r0 != 0) goto L_0x0313
            java.lang.String r2 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0313:
            java.lang.Boolean r0 = r0.getHasGuessULike()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            r0 = r0 ^ r7
            r2 = 2131167030(0x7f070736, float:1.7948322E38)
            r3 = 2131167029(0x7f070735, float:1.794832E38)
            if (r0 == 0) goto L_0x034e
            android.view.View r0 = r9.e((int) r3)
            com.ss.android.ugc.aweme.commerce.widget.RoundSelectorBtn r0 = (com.ss.android.ugc.aweme.commerce.widget.RoundSelectorBtn) r0
            java.lang.String r1 = "guessULikeBtn"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r8)
            android.widget.FrameLayout r0 = r9.g
            if (r0 != 0) goto L_0x033d
            java.lang.String r1 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x033d:
            android.view.View r0 = (android.view.View) r0
            android.view.View r0 = r0.findViewById(r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r1 = "headerView.guessULikeTitle"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r8)
            goto L_0x0378
        L_0x034e:
            android.view.View r0 = r9.e((int) r3)
            com.ss.android.ugc.aweme.commerce.widget.RoundSelectorBtn r0 = (com.ss.android.ugc.aweme.commerce.widget.RoundSelectorBtn) r0
            java.lang.String r3 = "guessULikeBtn"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            r0.setVisibility(r1)
            android.widget.FrameLayout r0 = r9.g
            if (r0 != 0) goto L_0x0365
            java.lang.String r3 = "headerView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0365:
            android.view.View r0 = (android.view.View) r0
            android.view.View r0 = r0.findViewById(r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r2 = "headerView.guessULikeTitle"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            r0.setVisibility(r1)
            r9.q()
        L_0x0378:
            com.ss.android.ugc.aweme.commerce.widget.PreviewBottom r0 = r9.w()
            java.lang.String r1 = r9.F
            r0.setAwemeId(r1)
            java.lang.String r1 = r9.T
            r0.setOriginFeedAwemeId(r1)
            com.ss.android.ugc.aweme.commerce.service.models.CommerceUser r1 = r9.E
            if (r1 != 0) goto L_0x038f
            java.lang.String r2 = "mUserInfo"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x038f:
            java.lang.String r1 = r1.getUid()
            r0.setUid(r1)
            java.lang.String r1 = r9.R
            r0.setReferFrom(r1)
            r1 = r9
            android.app.Activity r1 = (android.app.Activity) r1
            r0.setActivity(r1)
            com.ss.android.ugc.aweme.commerce.service.models.h r1 = r9.D
            if (r1 != 0) goto L_0x03aa
            java.lang.String r2 = "mDisplayGood"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x03aa:
            r0.setPromotion(r1)
            long r1 = r9.r
            r0.setStartPreviewTime(r1)
            r0.setSaleOut(r8)
            r0.a()
            com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$az r0 = new com.ss.android.ugc.aweme.commerce.preview.PreviewActivity$az
            r0.<init>(r9)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r9.a((kotlin.jvm.functions.Function0) r0)
            r9.F()
            r9.E()
            r9.f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.b(boolean):void");
    }

    private final void a(List<? extends Aweme> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f2890a, false, 28555, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f2890a, false, 28555, new Class[]{List.class}, Void.TYPE);
            return;
        }
        int size = this.au.size();
        this.au.clear();
        this.au.addAll(list);
        PreviewVideoAdapter previewVideoAdapter = this.ac;
        if (previewVideoAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        previewVideoAdapter.notifyItemRangeInserted(size + 1, list.size() - size);
    }

    private final void a(com.ss.android.ugc.aweme.commerce.service.models.c cVar, boolean z2) {
        String str;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{cVar, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2890a, false, 28606, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.c.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, Byte.valueOf(z2)}, this, f2890a, false, 28606, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.c.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.commerce.service.logs.al alVar = new com.ss.android.ugc.aweme.commerce.service.logs.al();
        com.ss.android.ugc.aweme.commerce.service.logs.al b2 = alVar.d(this.F).e(this.N).b(Integer.valueOf(cVar.getElasticType()));
        if (!z2) {
            str = "full_screen_card";
        } else {
            str = "commodity_page_store_card";
        }
        com.ss.android.ugc.aweme.commerce.service.logs.al b3 = b2.b(str).c(cVar.getPromotionId()).a(Integer.valueOf((int) cVar.getCommodityType())).a(this.R).b(Boolean.valueOf(cVar.hasCoupon()));
        CommerceUser commerceUser = this.E;
        if (commerceUser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUserInfo");
        }
        b3.f(commerceUser.getUid());
        if (cVar instanceof com.ss.android.ugc.aweme.commerce.service.models.h) {
            com.ss.android.ugc.aweme.commerce.service.models.h hVar = (com.ss.android.ugc.aweme.commerce.service.models.h) cVar;
            com.ss.android.ugc.aweme.commerce.service.models.o activity = hVar.getActivity();
            if (activity != null && activity.canBeShown()) {
                z3 = true;
            }
            alVar.c(Boolean.valueOf(z3)).a(Boolean.valueOf(hVar.isSelf()));
        }
        alVar.b();
    }

    private final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f2890a, false, 28636, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f2890a, false, 28636, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        FrameLayout frameLayout = this.g;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        ((PriceView) frameLayout.findViewById(C0906R.id.d14)).setPriceText(com.ss.android.ugc.aweme.commerce.service.l.d.a(i2));
        if (i3 <= 0 || i3 <= i2) {
            FrameLayout frameLayout2 = this.g;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            TextView textView = (TextView) frameLayout2.findViewById(C0906R.id.d1g);
            Intrinsics.checkExpressionValueIsNotNull(textView, "headerView.text_price_space");
            textView.setVisibility(8);
            FrameLayout frameLayout3 = this.g;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            PriceView priceView = (PriceView) frameLayout3.findViewById(C0906R.id.d13);
            Intrinsics.checkExpressionValueIsNotNull(priceView, "headerView.text_max_price");
            priceView.setVisibility(8);
        } else {
            FrameLayout frameLayout4 = this.g;
            if (frameLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            TextView textView2 = (TextView) frameLayout4.findViewById(C0906R.id.d1g);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "headerView.text_price_space");
            textView2.setVisibility(0);
            FrameLayout frameLayout5 = this.g;
            if (frameLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            ((PriceView) frameLayout5.findViewById(C0906R.id.d13)).setPriceText(com.ss.android.ugc.aweme.commerce.service.l.d.a(i3));
            FrameLayout frameLayout6 = this.g;
            if (frameLayout6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            PriceView priceView2 = (PriceView) frameLayout6.findViewById(C0906R.id.d13);
            Intrinsics.checkExpressionValueIsNotNull(priceView2, "headerView.text_max_price");
            priceView2.setVisibility(0);
        }
        com.ss.android.ugc.aweme.commerce.service.models.h hVar = this.D;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
        }
        if (hVar.getMarketPrice() > 0) {
            com.ss.android.ugc.aweme.commerce.service.models.h hVar2 = this.D;
            if (hVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
            }
            if (hVar2.getMarketPrice() > Math.max(i2, i3)) {
                FrameLayout frameLayout7 = this.g;
                if (frameLayout7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("headerView");
                }
                PriceView priceView3 = (PriceView) frameLayout7.findViewById(C0906R.id.d12);
                Intrinsics.checkExpressionValueIsNotNull(priceView3, "headerView.text_market_price");
                priceView3.setVisibility(0);
                FrameLayout frameLayout8 = this.g;
                if (frameLayout8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("headerView");
                }
                PriceView priceView4 = (PriceView) frameLayout8.findViewById(C0906R.id.d12);
                com.ss.android.ugc.aweme.commerce.service.models.h hVar3 = this.D;
                if (hVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDisplayGood");
                }
                priceView4.setPriceText(com.ss.android.ugc.aweme.commerce.service.l.d.a(hVar3.getMarketPrice()));
                return;
            }
        }
        FrameLayout frameLayout9 = this.g;
        if (frameLayout9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        PriceView priceView5 = (PriceView) frameLayout9.findViewById(C0906R.id.d12);
        Intrinsics.checkExpressionValueIsNotNull(priceView5, "headerView.text_market_price");
        priceView5.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0053, code lost:
        if (r0 == null) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(@org.jetbrains.annotations.Nullable java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r19, boolean r20) {
        /*
            r18 = this;
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r19
            java.lang.Byte r3 = java.lang.Byte.valueOf(r20)
            r10 = 1
            r2[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = f2890a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r7[r10] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 28548(0x6f84, float:4.0004E-41)
            r3 = r18
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0049
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r9] = r19
            java.lang.Byte r0 = java.lang.Byte.valueOf(r20)
            r11[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = f2890a
            r14 = 0
            r15 = 28548(0x6f84, float:4.0004E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r18
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x0049:
            if (r19 == 0) goto L_0x005a
            r0 = r19
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.toList(r0)
            if (r0 != 0) goto L_0x0056
            goto L_0x005a
        L_0x0056:
            r1 = r0
            r0 = r18
            goto L_0x005f
        L_0x005a:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0056
        L_0x005f:
            r0.a((java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>) r1)
            r18.B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.c(java.util.List, boolean):void");
    }

    private final void a(l lVar, List<com.ss.android.ugc.aweme.commerce.service.models.w> list) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{lVar, list}, this, f2890a, false, 28623, new Class[]{l.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lVar, list}, this, f2890a, false, 28623, new Class[]{l.class, List.class}, Void.TYPE);
            return;
        }
        this.az = list;
        FrameLayout frameLayout = this.g;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        View findViewById = frameLayout.findViewById(C0906R.id.drf);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "headerView.videoCommentDivider");
        findViewById.setVisibility(0);
        FrameLayout frameLayout2 = this.g;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        LinearLayout linearLayout = (LinearLayout) frameLayout2.findViewById(C0906R.id.cqr);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "headerView.shopContainer");
        linearLayout.setVisibility(0);
        FrameLayout frameLayout3 = this.g;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        DmtTextView dmtTextView = (DmtTextView) frameLayout3.findViewById(C0906R.id.cqv);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "headerView.shopTitle");
        CommerceUser commerceUser = this.E;
        if (commerceUser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUserInfo");
        }
        dmtTextView.setText(commerceUser.getNickname());
        FrameLayout frameLayout4 = this.g;
        if (frameLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        DmtTextView dmtTextView2 = (DmtTextView) frameLayout4.findViewById(C0906R.id.cqs);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "headerView.shopCount");
        dmtTextView2.setText(getString(C0906R.string.wp, new Object[]{Integer.valueOf(lVar.f37512a)}));
        FrameLayout frameLayout5 = this.g;
        if (frameLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        AvatarImageView avatarImageView = (AvatarImageView) frameLayout5.findViewById(C0906R.id.cqu);
        CommerceUser commerceUser2 = this.E;
        if (commerceUser2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUserInfo");
        }
        com.ss.android.ugc.aweme.base.c.b(avatarImageView, commerceUser2.getAvatarMedium());
        int i3 = 0;
        for (com.ss.android.ugc.aweme.commerce.service.models.w wVar : list) {
            switch (i3) {
                case 0:
                    FrameLayout frameLayout6 = this.g;
                    if (frameLayout6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    View findViewById2 = frameLayout6.findViewById(C0906R.id.cb1);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById2, "headerView.recommendContainer1");
                    a(findViewById2, wVar, true, this.Y);
                    break;
                case 1:
                    FrameLayout frameLayout7 = this.g;
                    if (frameLayout7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    View findViewById3 = frameLayout7.findViewById(C0906R.id.cb2);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById3, "headerView.recommendContainer2");
                    a(findViewById3, wVar, true, this.Y);
                    break;
                case 2:
                    FrameLayout frameLayout8 = this.g;
                    if (frameLayout8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    View findViewById4 = frameLayout8.findViewById(C0906R.id.cb3);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById4, "headerView.recommendContainer3");
                    a(findViewById4, wVar, true, this.Y);
                    break;
            }
            i3++;
        }
        FrameLayout frameLayout9 = this.g;
        if (frameLayout9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        View findViewById5 = frameLayout9.findViewById(C0906R.id.cqt);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "headerView.shopDivider");
        if (!j()) {
            i2 = 8;
        }
        findViewById5.setVisibility(i2);
        f();
        t();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0053, code lost:
        if (r0 == null) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(@org.jetbrains.annotations.Nullable java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r19, boolean r20) {
        /*
            r18 = this;
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r19
            java.lang.Byte r3 = java.lang.Byte.valueOf(r20)
            r10 = 1
            r2[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = f2890a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r7[r10] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 28547(0x6f83, float:4.0003E-41)
            r3 = r18
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0049
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r9] = r19
            java.lang.Byte r0 = java.lang.Byte.valueOf(r20)
            r11[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = f2890a
            r14 = 0
            r15 = 28547(0x6f83, float:4.0003E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r18
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x0049:
            if (r19 == 0) goto L_0x005a
            r0 = r19
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.toList(r0)
            if (r0 != 0) goto L_0x0056
            goto L_0x005a
        L_0x0056:
            r1 = r0
            r0 = r18
            goto L_0x005f
        L_0x005a:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0056
        L_0x005f:
            r0.a((java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>) r1)
            r18.B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.PreviewActivity.b(java.util.List, boolean):void");
    }

    private final void a(String str, boolean z2) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2890a, false, 28552, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z2)}, this, f2890a, false, 28552, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        FrameLayout frameLayout = this.ab;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("footerView");
        }
        LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(C0906R.id.biz);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "footerView.loadingArea");
        linearLayout.setVisibility(0);
        FrameLayout frameLayout2 = this.ab;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("footerView");
        }
        ProgressBar progressBar = (ProgressBar) frameLayout2.findViewById(C0906R.id.bj0);
        Intrinsics.checkExpressionValueIsNotNull(progressBar, "footerView.loadingIndicator");
        if (z2) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        progressBar.setVisibility(i2);
        FrameLayout frameLayout3 = this.ab;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("footerView");
        }
        DmtTextView dmtTextView = (DmtTextView) frameLayout3.findViewById(C0906R.id.bj2);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "footerView.loadingText");
        dmtTextView.setVisibility(0);
        FrameLayout frameLayout4 = this.ab;
        if (frameLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("footerView");
        }
        DmtTextView dmtTextView2 = (DmtTextView) frameLayout4.findViewById(C0906R.id.bj2);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "footerView.loadingText");
        dmtTextView2.setText(str);
    }

    static /* synthetic */ void a(PreviewActivity previewActivity, boolean z2, int i2) {
        PreviewActivity previewActivity2 = previewActivity;
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, previewActivity, f2890a, false, 28596, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PreviewActivity previewActivity3 = previewActivity;
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, previewActivity3, f2890a, false, 28596, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        Activity activity = previewActivity2;
        CommerceUser commerceUser = previewActivity2.E;
        if (commerceUser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUserInfo");
        }
        int verifyStatus = commerceUser.getVerifyStatus();
        CommerceUser commerceUser2 = previewActivity2.E;
        if (commerceUser2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUserInfo");
        }
        com.ss.android.ugc.aweme.commerce.service.models.m mVar = new com.ss.android.ugc.aweme.commerce.service.models.m(activity, verifyStatus, commerceUser2, previewActivity2.R, previewActivity2.av, previewActivity2.F);
        com.ss.android.ugc.aweme.commercialize.g.a(mVar, "all_promote_product", "full_screen_card", "click_full_screen_card");
    }
}
