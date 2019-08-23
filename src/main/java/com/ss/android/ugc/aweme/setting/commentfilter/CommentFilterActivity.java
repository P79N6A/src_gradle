package com.ss.android.ugc.aweme.setting.commentfilter;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.setting.commentfilter.a.a;
import com.ss.android.ugc.aweme.setting.commentfilter.adapter.KeywordListAdapter;
import com.ss.android.ugc.aweme.setting.commentfilter.api.CommentFilterApi;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 52\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005:\u00015B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020\"H\u0002J\u0006\u0010#\u001a\u00020\"J\b\u0010$\u001a\u00020\"H\u0016J\b\u0010%\u001a\u00020\"H\u0016J\b\u0010&\u001a\u00020\"H\u0016J\u0012\u0010'\u001a\u00020\"2\b\u0010(\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010)\u001a\u00020\"2\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J\b\u0010,\u001a\u00020\"H\u0014J\u0012\u0010-\u001a\u00020\"2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020\"H\u0002J\u0012\u00101\u001a\u00020\"2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00104\u001a\u00020\"H\u0014R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/commentfilter/CommentFilterActivity;", "Lcom/ss/android/ugc/aweme/base/activity/AmeBaseActivity;", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/arch/widgets/base/KVData;", "Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/IPushSettingFetchView;", "Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/IPushSettingChangeView;", "()V", "mDataCenter", "Lcom/ss/android/ugc/aweme/arch/widgets/base/DataCenter;", "kotlin.jvm.PlatformType", "getMDataCenter", "()Lcom/ss/android/ugc/aweme/arch/widgets/base/DataCenter;", "mDataCenter$delegate", "Lkotlin/Lazy;", "mModel", "Lcom/ss/android/ugc/aweme/setting/commentfilter/model/CommentFilterModel;", "getMModel", "()Lcom/ss/android/ugc/aweme/setting/commentfilter/model/CommentFilterModel;", "mModel$delegate", "mPushSettingChangePresenter", "Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingChangePresenter;", "getMPushSettingChangePresenter", "()Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingChangePresenter;", "mPushSettingChangePresenter$delegate", "mPushSettingPresenter", "Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingFetchPresenter;", "getMPushSettingPresenter", "()Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingFetchPresenter;", "mPushSettingPresenter$delegate", "mTips", "", "getLayout", "", "initRecyclerView", "", "initView", "onBackPressed", "onChangeFailed", "onChangeSuccess", "onChanged", "t", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onFailed", "e", "Ljava/lang/Exception;", "onSettingItemChange", "onSuccess", "settings", "Lcom/ss/android/ugc/aweme/setting/serverpush/model/PushSettings;", "setStatusBarColor", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CommentFilterActivity extends AmeBaseActivity implements Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>, com.ss.android.ugc.aweme.setting.serverpush.b.a, com.ss.android.ugc.aweme.setting.serverpush.b.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63863a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f63864b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CommentFilterActivity.class), "mModel", "getMModel()Lcom/ss/android/ugc/aweme/setting/commentfilter/model/CommentFilterModel;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CommentFilterActivity.class), "mPushSettingPresenter", "getMPushSettingPresenter()Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingFetchPresenter;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CommentFilterActivity.class), "mPushSettingChangePresenter", "getMPushSettingChangePresenter()Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingChangePresenter;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CommentFilterActivity.class), "mDataCenter", "getMDataCenter()Lcom/ss/android/ugc/aweme/arch/widgets/base/DataCenter;"))};

    /* renamed from: d  reason: collision with root package name */
    public static final a f63865d = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    final Lazy f63866c = LazyKt.lazy(new f(this));

    /* renamed from: e  reason: collision with root package name */
    private String f63867e = "";
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f63868f = LazyKt.lazy(new g(this));
    private final Lazy g = LazyKt.lazy(new i(this));
    private final Lazy u = LazyKt.lazy(new h(this));
    private HashMap v;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/commentfilter/CommentFilterActivity$Companion;", "", "()V", "ANIM_DURATION", "", "ANIM_HEIGHT", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/view/MotionEvent;", "onTouch", "com/ss/android/ugc/aweme/setting/commentfilter/CommentFilterActivity$initRecyclerView$3$1"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63869a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentFilterActivity f63870b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AnimationSet f63871c;

        b(CommentFilterActivity commentFilterActivity, AnimationSet animationSet) {
            this.f63870b = commentFilterActivity;
            this.f63871c = animationSet;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f63869a, false, 72168, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f63869a, false, 72168, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            Object systemService = this.f63870b.getSystemService("input_method");
            if (systemService != null) {
                LinearLayout linearLayout = (LinearLayout) this.f63870b.a((int) C0906R.id.y9);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "container");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(linearLayout.getWindowToken(), 0);
                RecyclerView recyclerView = (RecyclerView) this.f63870b.a((int) C0906R.id.b74);
                Intrinsics.checkExpressionValueIsNotNull(recyclerView, "keywords_list");
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (!(adapter instanceof KeywordListAdapter)) {
                    adapter = null;
                }
                KeywordListAdapter keywordListAdapter = (KeywordListAdapter) adapter;
                if (keywordListAdapter != null) {
                    View view2 = keywordListAdapter.f63891e;
                    if (view2 != null) {
                        view2.clearFocus();
                    }
                }
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63872a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentFilterActivity f63873b;

        c(CommentFilterActivity commentFilterActivity) {
            this.f63873b = commentFilterActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f63872a, false, 72169, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f63872a, false, 72169, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f63873b.onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63874a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentFilterActivity f63875b;

        d(CommentFilterActivity commentFilterActivity) {
            this.f63875b = commentFilterActivity;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f63874a, false, 72170, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f63874a, false, 72170, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            RecyclerView recyclerView = (RecyclerView) this.f63875b.a((int) C0906R.id.b74);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "keywords_list");
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (!(adapter instanceof KeywordListAdapter)) {
                adapter = null;
            }
            KeywordListAdapter keywordListAdapter = (KeywordListAdapter) adapter;
            if (keywordListAdapter != null) {
                View view2 = keywordListAdapter.f63891e;
                if (view2 != null) {
                    view2.clearFocus();
                }
            }
            Object systemService = this.f63875b.getSystemService("input_method");
            if (systemService != null) {
                LinearLayout linearLayout = (LinearLayout) this.f63875b.a((int) C0906R.id.y9);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "container");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(linearLayout.getWindowToken(), 0);
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63876a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentFilterActivity f63877b;

        e(CommentFilterActivity commentFilterActivity) {
            this.f63877b = commentFilterActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f63876a, false, 72171, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f63876a, false, 72171, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            CommonItemView commonItemView = (CommonItemView) this.f63877b.a((int) C0906R.id.v9);
            Intrinsics.checkExpressionValueIsNotNull(commonItemView, "comment_filter_item");
            CommonItemView commonItemView2 = (CommonItemView) this.f63877b.a((int) C0906R.id.v9);
            Intrinsics.checkExpressionValueIsNotNull(commonItemView2, "comment_filter_item");
            commonItemView.setChecked(!commonItemView2.c());
            com.ss.android.ugc.aweme.setting.serverpush.b.d h = this.f63877b.h();
            int i = 2;
            Object[] objArr = new Object[2];
            objArr[0] = "comment_filter_status";
            CommonItemView commonItemView3 = (CommonItemView) this.f63877b.a((int) C0906R.id.v9);
            Intrinsics.checkExpressionValueIsNotNull(commonItemView3, "comment_filter_item");
            if (commonItemView3.c()) {
                i = 1;
            }
            objArr[1] = Integer.valueOf(i);
            h.a(objArr);
            this.f63877b.i();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/arch/widgets/base/DataCenter;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<DataCenter> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ CommentFilterActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(CommentFilterActivity commentFilterActivity) {
            super(0);
            this.this$0 = commentFilterActivity;
        }

        public final DataCenter invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 72172, new Class[0], DataCenter.class)) {
                return DataCenter.a(com.ss.android.ugc.aweme.arch.widgets.base.c.a((FragmentActivity) this.this$0), (LifecycleOwner) this.this$0).a("list_keywords", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this.this$0);
            }
            return (DataCenter) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 72172, new Class[0], DataCenter.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/setting/commentfilter/model/CommentFilterModel;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function0<com.ss.android.ugc.aweme.setting.commentfilter.a.a> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ CommentFilterActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(CommentFilterActivity commentFilterActivity) {
            super(0);
            this.this$0 = commentFilterActivity;
        }

        @NotNull
        public final com.ss.android.ugc.aweme.setting.commentfilter.a.a invoke() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 72173, new Class[0], com.ss.android.ugc.aweme.setting.commentfilter.a.a.class)) {
                return (com.ss.android.ugc.aweme.setting.commentfilter.a.a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 72173, new Class[0], com.ss.android.ugc.aweme.setting.commentfilter.a.a.class);
            }
            CommentFilterActivity commentFilterActivity = this.this$0;
            if (PatchProxy.isSupport(new Object[0], commentFilterActivity, CommentFilterActivity.f63863a, false, 72154, new Class[0], DataCenter.class)) {
                value = PatchProxy.accessDispatch(new Object[0], commentFilterActivity, CommentFilterActivity.f63863a, false, 72154, new Class[0], DataCenter.class);
            } else {
                value = commentFilterActivity.f63866c.getValue();
            }
            return new com.ss.android.ugc.aweme.setting.commentfilter.a.a((DataCenter) value);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingChangePresenter;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function0<com.ss.android.ugc.aweme.setting.serverpush.b.d> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ CommentFilterActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(CommentFilterActivity commentFilterActivity) {
            super(0);
            this.this$0 = commentFilterActivity;
        }

        @NotNull
        public final com.ss.android.ugc.aweme.setting.serverpush.b.d invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 72174, new Class[0], com.ss.android.ugc.aweme.setting.serverpush.b.d.class)) {
                return (com.ss.android.ugc.aweme.setting.serverpush.b.d) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 72174, new Class[0], com.ss.android.ugc.aweme.setting.serverpush.b.d.class);
            }
            com.ss.android.ugc.aweme.setting.serverpush.b.d dVar = new com.ss.android.ugc.aweme.setting.serverpush.b.d();
            dVar.a(this.this$0);
            return dVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingFetchPresenter;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function0<com.ss.android.ugc.aweme.setting.serverpush.b.e> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ CommentFilterActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(CommentFilterActivity commentFilterActivity) {
            super(0);
            this.this$0 = commentFilterActivity;
        }

        @NotNull
        public final com.ss.android.ugc.aweme.setting.serverpush.b.e invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 72175, new Class[0], com.ss.android.ugc.aweme.setting.serverpush.b.e.class)) {
                return (com.ss.android.ugc.aweme.setting.serverpush.b.e) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 72175, new Class[0], com.ss.android.ugc.aweme.setting.serverpush.b.e.class);
            }
            com.ss.android.ugc.aweme.setting.serverpush.b.e eVar = new com.ss.android.ugc.aweme.setting.serverpush.b.e();
            eVar.a(this.this$0);
            return eVar;
        }
    }

    @NotNull
    private com.ss.android.ugc.aweme.setting.commentfilter.a.a j() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f63863a, false, 72151, new Class[0], com.ss.android.ugc.aweme.setting.commentfilter.a.a.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f63863a, false, 72151, new Class[0], com.ss.android.ugc.aweme.setting.commentfilter.a.a.class);
        } else {
            value = this.f63868f.getValue();
        }
        return (com.ss.android.ugc.aweme.setting.commentfilter.a.a) value;
    }

    public final int a() {
        return C0906R.layout.at;
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f63863a, false, 72166, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f63863a, false, 72166, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.v == null) {
            this.v = new HashMap();
        }
        View view = (View) this.v.get(Integer.valueOf(i2));
        if (view == null) {
            view = findViewById(i2);
            this.v.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final void d_(@Nullable Exception exc) {
    }

    public final com.ss.android.ugc.aweme.setting.serverpush.b.d h() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f63863a, false, 72153, new Class[0], com.ss.android.ugc.aweme.setting.serverpush.b.d.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f63863a, false, 72153, new Class[0], com.ss.android.ugc.aweme.setting.serverpush.b.d.class);
        } else {
            value = this.u.getValue();
        }
        return (com.ss.android.ugc.aweme.setting.serverpush.b.d) value;
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f63863a, false, 72161, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63863a, false, 72161, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void X_() {
        if (PatchProxy.isSupport(new Object[0], this, f63863a, false, 72164, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63863a, false, 72164, new Class[0], Void.TYPE);
            return;
        }
        CommonItemView commonItemView = (CommonItemView) a((int) C0906R.id.v9);
        Intrinsics.checkExpressionValueIsNotNull(commonItemView, "comment_filter_item");
        CommonItemView commonItemView2 = (CommonItemView) a((int) C0906R.id.v9);
        Intrinsics.checkExpressionValueIsNotNull(commonItemView2, "comment_filter_item");
        commonItemView.setChecked(!commonItemView2.c());
        i();
        com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bki).a();
    }

    public final void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f63863a, false, 72160, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63863a, false, 72160, new Class[0], Void.TYPE);
        } else if (com.ss.android.g.a.c()) {
            ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.yx).init();
        } else {
            ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.w1).statusBarDarkFont(true).init();
        }
    }

    public final void c() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f63863a, false, 72163, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63863a, false, 72163, new Class[0], Void.TYPE);
            return;
        }
        IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        String curUserId = a2.getCurUserId();
        com.ss.android.ugc.aweme.fe.b.d a3 = com.ss.android.ugc.aweme.fe.b.d.a();
        a3.b("settings_times_" + curUserId, PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        a3.b("not_now_times_" + curUserId, PushConstants.PUSH_TYPE_UPLOAD_LOG);
        String str = "comment_filter_status_" + curUserId;
        CommonItemView commonItemView = (CommonItemView) a((int) C0906R.id.v9);
        Intrinsics.checkExpressionValueIsNotNull(commonItemView, "comment_filter_item");
        if (commonItemView.c()) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        a3.b(str, Integer.valueOf(i2));
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f63863a, false, 72158, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63863a, false, 72158, new Class[0], Void.TYPE);
            return;
        }
        CommonItemView commonItemView = (CommonItemView) a((int) C0906R.id.v9);
        Intrinsics.checkExpressionValueIsNotNull(commonItemView, "comment_filter_item");
        if (commonItemView.c()) {
            ((CommonItemView) a((int) C0906R.id.v9)).setDesc(this.f63867e);
        } else {
            ((CommonItemView) a((int) C0906R.id.v9)).setDesc(getString(C0906R.string.vb));
            Object systemService = getSystemService("input_method");
            if (systemService != null) {
                LinearLayout linearLayout = (LinearLayout) a((int) C0906R.id.y9);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "container");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(linearLayout.getWindowToken(), 0);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
        }
        k();
    }

    private final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f63863a, false, 72159, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63863a, false, 72159, new Class[0], Void.TYPE);
            return;
        }
        CommonItemView commonItemView = (CommonItemView) a((int) C0906R.id.v9);
        Intrinsics.checkExpressionValueIsNotNull(commonItemView, "comment_filter_item");
        if (commonItemView.c()) {
            AnimationSet animationSet = new AnimationSet(true);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300);
            animationSet.addAnimation(alphaAnimation);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (-u.a(48.0d)), 0.0f);
            translateAnimation.setDuration(300);
            animationSet.addAnimation(translateAnimation);
            RecyclerView recyclerView = (RecyclerView) a((int) C0906R.id.b74);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager == null) {
                layoutManager = new WrapLinearLayoutManager(this);
            }
            recyclerView.setLayoutManager(layoutManager);
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter == null) {
                LinearLayout linearLayout = (LinearLayout) a((int) C0906R.id.y9);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "container");
                adapter = new KeywordListAdapter(this, linearLayout);
            }
            recyclerView.setAdapter(adapter);
            recyclerView.setItemViewCacheSize(0);
            recyclerView.setVisibility(0);
            recyclerView.startAnimation(animationSet);
            recyclerView.setOnTouchListener(new b(this, animationSet));
            return;
        }
        AnimationSet animationSet2 = new AnimationSet(true);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(300);
        animationSet2.addAnimation(alphaAnimation2);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (-u.a(48.0d)));
        translateAnimation2.setDuration(300);
        animationSet2.addAnimation(translateAnimation2);
        RecyclerView recyclerView2 = (RecyclerView) a((int) C0906R.id.b74);
        recyclerView2.setVisibility(8);
        recyclerView2.startAnimation(animationSet2);
        RecyclerView.Adapter adapter2 = recyclerView2.getAdapter();
        if (!(adapter2 instanceof KeywordListAdapter)) {
            adapter2 = null;
        }
        KeywordListAdapter keywordListAdapter = (KeywordListAdapter) adapter2;
        if (keywordListAdapter != null) {
            keywordListAdapter.a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBackPressed() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f63863a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 72162(0x119e2, float:1.0112E-40)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f63863a
            r5 = 0
            r6 = 72162(0x119e2, float:1.0112E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            r1 = 2131166003(0x7f070333, float:1.794624E38)
            android.view.View r1 = r11.a((int) r1)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r1 = (com.bytedance.ies.dmt.ui.common.views.CommonItemView) r1
            java.lang.String r2 = "comment_filter_item"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            boolean r1 = r1.c()
            if (r1 == 0) goto L_0x0160
            r1 = 2131167808(0x7f070a40, float:1.79499E38)
            android.view.View r1 = r11.a((int) r1)
            android.support.v7.widget.RecyclerView r1 = (android.support.v7.widget.RecyclerView) r1
            java.lang.String r2 = "keywords_list"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.support.v7.widget.RecyclerView$Adapter r1 = r1.getAdapter()
            boolean r2 = r1 instanceof com.ss.android.ugc.aweme.setting.commentfilter.adapter.KeywordListAdapter
            r3 = 0
            if (r2 != 0) goto L_0x0051
            r1 = r3
        L_0x0051:
            com.ss.android.ugc.aweme.setting.commentfilter.adapter.KeywordListAdapter r1 = (com.ss.android.ugc.aweme.setting.commentfilter.adapter.KeywordListAdapter) r1
            r2 = 1
            if (r1 == 0) goto L_0x00d1
            java.util.List<java.lang.String> r1 = r1.f63888b
            if (r1 == 0) goto L_0x00d1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r1 = r1.iterator()
        L_0x0067:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0095
            java.lang.Object r5 = r1.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x008d
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.CharSequence r6 = kotlin.text.StringsKt.trimStart((java.lang.CharSequence) r6)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = ""
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            r6 = r6 ^ r2
            if (r6 == 0) goto L_0x0067
            r4.add(r5)
            goto L_0x0067
        L_0x008d:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
            r0.<init>(r1)
            throw r0
        L_0x0095:
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r4, r5)
            r1.<init>(r5)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r4 = r4.iterator()
        L_0x00aa:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00ce
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x00c6
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.CharSequence r5 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r5)
            java.lang.String r5 = r5.toString()
            r1.add(r5)
            goto L_0x00aa
        L_0x00c6:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
            r0.<init>(r1)
            throw r0
        L_0x00ce:
            java.util.List r1 = (java.util.List) r1
            goto L_0x00d2
        L_0x00d1:
            r1 = r3
        L_0x00d2:
            boolean r4 = r1 instanceof java.util.ArrayList
            if (r4 != 0) goto L_0x00d7
            r1 = r3
        L_0x00d7:
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 == 0) goto L_0x00ff
            int r3 = r1.size()
            if (r3 != 0) goto L_0x00ff
            com.ss.android.ugc.aweme.setting.serverpush.b.d r1 = r11.h()
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "comment_filter_status"
            r4[r0] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r4[r2] = r5
            r1.a((java.lang.Object[]) r4)
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r2 = "comment_filter_status"
            r1.putExtra(r2, r3)
            goto L_0x0160
        L_0x00ff:
            com.ss.android.ugc.aweme.setting.commentfilter.a.a r3 = r11.j()
            com.google.gson.Gson r4 = new com.google.gson.Gson
            r4.<init>()
            java.lang.String r1 = r4.toJson((java.lang.Object) r1)
            java.lang.String r4 = "Gson().toJson(list)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.setting.commentfilter.a.a.f63878a
            r7 = 0
            r8 = 72192(0x11a00, float:1.01163E-40)
            java.lang.Class[] r9 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r0] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = r3
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0141
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.setting.commentfilter.a.a.f63878a
            r7 = 0
            r8 = 72192(0x11a00, float:1.01163E-40)
            java.lang.Class[] r9 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r9[r0] = r1
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0157
        L_0x0141:
            java.lang.String r4 = "keywords"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r4)
            com.ss.android.ugc.aweme.setting.commentfilter.api.CommentFilterApi$API r3 = r3.a()
            a.i r1 = r3.setCommentFilterKeywords(r1)
            com.ss.android.ugc.aweme.setting.commentfilter.a.a$d r3 = com.ss.android.ugc.aweme.setting.commentfilter.a.a.d.f63886b
            a.g r3 = (a.g) r3
            java.util.concurrent.Executor r4 = a.i.f1052b
            r1.a((a.g<TResult, TContinuationResult>) r3, (java.util.concurrent.Executor) r4)
        L_0x0157:
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r3 = "comment_filter_status"
            r1.putExtra(r3, r2)
        L_0x0160:
            r1 = -1
            android.content.Intent r2 = r11.getIntent()
            r11.setResult(r1, r2)
            java.lang.String r1 = "input_method"
            java.lang.Object r1 = r11.getSystemService(r1)
            if (r1 == 0) goto L_0x018b
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            r2 = 2131166114(0x7f0703a2, float:1.7946464E38)
            android.view.View r2 = r11.a((int) r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            java.lang.String r3 = "container"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            android.os.IBinder r2 = r2.getWindowToken()
            r1.hideSoftInputFromWindow(r2, r0)
            super.onBackPressed()
            return
        L_0x018b:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity.onBackPressed():void");
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.setting.serverpush.a.c cVar) {
        com.ss.android.ugc.aweme.setting.serverpush.a.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f63863a, false, 72165, new Class[]{com.ss.android.ugc.aweme.setting.serverpush.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f63863a, false, 72165, new Class[]{com.ss.android.ugc.aweme.setting.serverpush.a.c.class}, Void.TYPE);
            return;
        }
        if (cVar2 == null || cVar2.A != 1) {
            CommonItemView commonItemView = (CommonItemView) a((int) C0906R.id.v9);
            Intrinsics.checkExpressionValueIsNotNull(commonItemView, "comment_filter_item");
            commonItemView.setChecked(false);
            i();
        } else {
            CommonItemView commonItemView2 = (CommonItemView) a((int) C0906R.id.v9);
            Intrinsics.checkExpressionValueIsNotNull(commonItemView2, "comment_filter_item");
            commonItemView2.setChecked(true);
            i();
            k();
            com.ss.android.ugc.aweme.setting.commentfilter.a.a j = j();
            if (PatchProxy.isSupport(new Object[0], j, com.ss.android.ugc.aweme.setting.commentfilter.a.a.f63878a, false, 72191, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], j, com.ss.android.ugc.aweme.setting.commentfilter.a.a.f63878a, false, 72191, new Class[0], Void.TYPE);
            } else {
                CommentFilterApi.API a2 = j.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "mApi");
                a2.getCommentFilterKeywords().a((a.g<TResult, TContinuationResult>) new a.b<TResult,TContinuationResult>(j), a.i.f1052b);
            }
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        List list;
        com.ss.android.ugc.aweme.arch.widgets.base.a aVar = (com.ss.android.ugc.aweme.arch.widgets.base.a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f63863a, false, 72155, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f63863a, false, 72155, new Class[]{com.ss.android.ugc.aweme.arch.widgets.base.a.class}, Void.TYPE);
            return;
        }
        KeywordListAdapter keywordListAdapter = null;
        if (aVar != null) {
            list = (List) aVar.a();
        } else {
            list = null;
        }
        if (!TypeIntrinsics.isMutableList(list)) {
            list = null;
        }
        if (list != null) {
            RecyclerView recyclerView = (RecyclerView) a((int) C0906R.id.b74);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "keywords_list");
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter instanceof KeywordListAdapter) {
                keywordListAdapter = adapter;
            }
            KeywordListAdapter keywordListAdapter2 = keywordListAdapter;
            if (keywordListAdapter2 != null) {
                List<String> list2 = keywordListAdapter2.f63888b;
                if (list2 != null) {
                    list2.addAll(1, list);
                }
            }
            RecyclerView recyclerView2 = (RecyclerView) a((int) C0906R.id.b74);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "keywords_list");
            RecyclerView.Adapter adapter2 = recyclerView2.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyItemRangeInserted(1, list.size());
            }
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        Object value;
        String str;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f63863a, false, 72156, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f63863a, false, 72156, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (PatchProxy.isSupport(new Object[0], this, f63863a, false, 72157, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63863a, false, 72157, new Class[0], Void.TYPE);
        } else {
            View findViewById = findViewById(C0906R.id.title);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById<TextView>(R.id.title)");
            ((TextView) findViewById).setText(getString(C0906R.string.v8));
            ((ImageView) findViewById(C0906R.id.ix)).setOnClickListener(new c(this));
            ((CommonItemView) a((int) C0906R.id.v9)).setDesc(getString(C0906R.string.vb));
            ((LinearLayout) a((int) C0906R.id.y9)).setOnTouchListener(new d(this));
            ((CommonItemView) a((int) C0906R.id.v9)).setOnClickListener(new e(this));
        }
        if (PatchProxy.isSupport(new Object[0], this, f63863a, false, 72152, new Class[0], com.ss.android.ugc.aweme.setting.serverpush.b.e.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f63863a, false, 72152, new Class[0], com.ss.android.ugc.aweme.setting.serverpush.b.e.class);
        } else {
            value = this.g.getValue();
        }
        ((com.ss.android.ugc.aweme.setting.serverpush.b.e) value).a(new Object[0]);
        StringBuilder sb = new StringBuilder();
        sb.append(getString(C0906R.string.va));
        sb.append("\n");
        try {
            com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = com.ss.android.ugc.aweme.global.config.settings.g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
            str = b2.aM();
        } catch (com.bytedance.ies.a unused) {
            str = "";
        }
        sb.append(str);
        String sb2 = sb.toString();
        if (sb2 != null) {
            this.f63867e = StringsKt.trim((CharSequence) sb2).toString();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }
}
