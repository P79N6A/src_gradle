package com.ss.android.ugc.aweme.commercialize.loft.half;

import android.arch.lifecycle.Observer;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.fe.method.BroadcastMethod;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\nH\u0002J\u0006\u0010\u001c\u001a\u00020\rJ\b\u0010\u001d\u001a\u00020\rH\u0002J\b\u0010\u001e\u001a\u00020\rH\u0002J\b\u0010\u001f\u001a\u00020\rH\u0002J\b\u0010 \u001a\u00020\rH\u0002J\u0016\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nJ\b\u0010#\u001a\u00020\rH\u0014J\u0010\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020&H\u0007J0\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0007H\u0014J\u0018\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0007H\u0014J\u0016\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\nJ\u0006\u00102\u001a\u00020\u001aR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R4\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/half/LoftView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentState", "", "value", "Lkotlin/Function0;", "", "dismissListener", "getDismissListener", "()Lkotlin/jvm/functions/Function0;", "setDismissListener", "(Lkotlin/jvm/functions/Function0;)V", "itemId", "loftListAdapter", "Lcom/ss/android/ugc/aweme/commercialize/loft/half/LoftListAdapter;", "getFeEvent", "Lorg/json/JSONObject;", "showType", "isShow", "", "loftItemId", "hide", "initBack", "initBottomMask", "initMove", "initRecyclerView", "loadLoft", "url", "onDetachedFromWindow", "onJsBroacastReceiver", "broadCastEvent", "Lcom/ss/android/ugc/aweme/fe/method/BroadcastMethod$JsBroadCastEvent;", "onLayout", "changed", "l", "t", "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "show", "expand", "showing", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class LoftView extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2914a;

    /* renamed from: b  reason: collision with root package name */
    public LoftListAdapter f2915b;

    /* renamed from: c  reason: collision with root package name */
    public String f2916c;

    /* renamed from: d  reason: collision with root package name */
    private String f2917d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private Function0<Unit> f2918e;

    /* renamed from: f  reason: collision with root package name */
    private HashMap f2919f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39223a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LoftView f39224b;

        a(LoftView loftView) {
            this.f39224b = loftView;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f39223a, false, 31280, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f39223a, false, 31280, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f39224b.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39225a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LoftView f39226b;

        b(LoftView loftView) {
            this.f39226b = loftView;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f39225a, false, 31281, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f39225a, false, 31281, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f39226b.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Float;)V"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements Observer<Float> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39227a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LoftView f39228b;

        c(LoftView loftView) {
            this.f39228b = loftView;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Float f2 = (Float) obj;
            if (PatchProxy.isSupport(new Object[]{f2}, this, f39227a, false, 31282, new Class[]{Float.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{f2}, this, f39227a, false, 31282, new Class[]{Float.class}, Void.TYPE);
            } else if (f2 != null) {
                View a2 = this.f39228b.a((int) C0906R.id.mk);
                Intrinsics.checkExpressionValueIsNotNull(a2, "bottom_mask");
                Intrinsics.checkExpressionValueIsNotNull(f2, NotifyType.VIBRATE);
                a2.setAlpha(1.0f - f2.floatValue());
                View a3 = this.f39228b.a((int) C0906R.id.bka);
                Intrinsics.checkExpressionValueIsNotNull(a3, "loft_bg_mask");
                a3.setAlpha((f2.floatValue() + 0.1f) * 0.85f);
                FrameLayout frameLayout = (FrameLayout) this.f39228b.a((int) C0906R.id.d5b);
                Intrinsics.checkExpressionValueIsNotNull(frameLayout, "top_header");
                frameLayout.setAlpha(f2.floatValue());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39229a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LoftView f39230b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f39231c;

        public d(LoftView loftView, String str) {
            this.f39230b = loftView;
            this.f39231c = str;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f39229a, false, 31283, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39229a, false, 31283, new Class[0], Void.TYPE);
                return;
            }
            LoftView.a(this.f39230b).f39201c = this.f39231c;
            LoftView.a(this.f39230b).notifyDataSetChanged();
            this.f39230b.setTranslationY((float) this.f39230b.getHeight());
        }
    }

    @JvmOverloads
    public LoftView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public LoftView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f2914a, false, 31278, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f2914a, false, 31278, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f2919f == null) {
            this.f2919f = new HashMap();
        }
        View view = (View) this.f2919f.get(Integer.valueOf(i));
        if (view == null) {
            view = findViewById(i);
            this.f2919f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    @Nullable
    public final Function0<Unit> getDismissListener() {
        return this.f2918e;
    }

    public final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f2914a, false, 31273, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2914a, false, 31273, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (getTranslationY() == 0.0f) {
            z = true;
        }
        return z;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2914a, false, 31275, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2914a, false, 31275, new Class[0], Void.TYPE);
            return;
        }
        ((LoftMaskViewParent) a((int) C0906R.id.bkb)).setExpand(false);
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f2914a, false, 31268, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2914a, false, 31268, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        bg.d(this);
    }

    public static final /* synthetic */ LoftListAdapter a(LoftView loftView) {
        LoftListAdapter loftListAdapter = loftView.f2915b;
        if (loftListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loftListAdapter");
        }
        return loftListAdapter;
    }

    public final void setDismissListener(@Nullable Function0<Unit> function0) {
        if (PatchProxy.isSupport(new Object[]{function0}, this, f2914a, false, 31274, new Class[]{Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function0}, this, f2914a, false, 31274, new Class[]{Function0.class}, Void.TYPE);
            return;
        }
        this.f2918e = function0;
        ((LoftMaskViewParent) a((int) C0906R.id.bkb)).setDismissListener(function0);
    }

    @Subscribe(a = ThreadMode.MAIN)
    public final void onJsBroacastReceiver(@NotNull BroadcastMethod.a aVar) {
        BroadcastMethod.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f2914a, false, 31276, new Class[]{BroadcastMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f2914a, false, 31276, new Class[]{BroadcastMethod.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "broadCastEvent");
        try {
            String string = aVar2.f44432b.getString("eventName");
            if (string != null) {
                if (!Intrinsics.areEqual((Object) string, (Object) "second_floor_layout")) {
                    string = null;
                }
                if (string != null) {
                    if (!aVar2.f44432b.has("data")) {
                        string = null;
                    }
                    if (string != null) {
                        JSONObject jSONObject = aVar2.f44432b.getJSONObject("data");
                        if (jSONObject.has("width") && jSONObject.has("height") && jSONObject.has("loft_item_id") && !(!Intrinsics.areEqual((Object) this.f2916c, (Object) jSONObject.getString("loft_item_id")))) {
                            int a2 = u.a(jSONObject.getDouble("height"));
                            LoftListAdapter loftListAdapter = this.f2915b;
                            if (loftListAdapter == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("loftListAdapter");
                            }
                            loftListAdapter.f39202d = a2;
                            LoftListAdapter loftListAdapter2 = this.f2915b;
                            if (loftListAdapter2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("loftListAdapter");
                            }
                            loftListAdapter2.notifyDataSetChanged();
                            LoftMaskViewParent loftMaskViewParent = (LoftMaskViewParent) a((int) C0906R.id.bkb);
                            FrameLayout frameLayout = (FrameLayout) a((int) C0906R.id.d5b);
                            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "top_header");
                            View view = frameLayout;
                            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(a2)}, loftMaskViewParent, LoftMaskViewParent.f39204a, false, 31242, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(a2)}, loftMaskViewParent, LoftMaskViewParent.f39204a, false, 31242, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                            } else {
                                Intrinsics.checkParameterIsNotNull(view, "topView");
                                ViewParent parent = loftMaskViewParent.getParent();
                                if (parent != null) {
                                    if (a2 > ((ViewGroup) parent).getMeasuredHeight() - loftMaskViewParent.f39207d) {
                                        ViewGroup.LayoutParams layoutParams = loftMaskViewParent.getLayoutParams();
                                        if (layoutParams == null) {
                                            Intrinsics.throwNpe();
                                        }
                                        ViewParent parent2 = loftMaskViewParent.getParent();
                                        if (parent2 != null) {
                                            layoutParams.height = (((ViewGroup) parent2).getMeasuredHeight() - view.getMeasuredHeight()) + loftMaskViewParent.f39206c;
                                            loftMaskViewParent.setLayoutParams(layoutParams);
                                            View view2 = loftMaskViewParent.h;
                                            if (view2 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("bottomMask");
                                            }
                                            View view3 = loftMaskViewParent.h;
                                            if (view3 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("bottomMask");
                                            }
                                            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                                            if (layoutParams2 == null) {
                                                Intrinsics.throwNpe();
                                            }
                                            ViewParent parent3 = loftMaskViewParent.getParent();
                                            if (parent3 != null) {
                                                layoutParams2.height = (((ViewGroup) parent3).getMeasuredHeight() - loftMaskViewParent.f39207d) + loftMaskViewParent.f39206c;
                                                view2.setLayoutParams(layoutParams2);
                                            } else {
                                                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                                            }
                                        } else {
                                            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                                        }
                                    } else {
                                        ViewGroup.LayoutParams layoutParams3 = loftMaskViewParent.getLayoutParams();
                                        if (layoutParams3 == null) {
                                            Intrinsics.throwNpe();
                                        }
                                        layoutParams3.height = loftMaskViewParent.f39206c + a2;
                                        loftMaskViewParent.setLayoutParams(layoutParams3);
                                        View view4 = loftMaskViewParent.h;
                                        if (view4 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("bottomMask");
                                        }
                                        View view5 = loftMaskViewParent.h;
                                        if (view5 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("bottomMask");
                                        }
                                        ViewGroup.LayoutParams layoutParams4 = view5.getLayoutParams();
                                        if (layoutParams4 == null) {
                                            Intrinsics.throwNpe();
                                        }
                                        layoutParams4.height = a2 + loftMaskViewParent.f39206c;
                                        view4.setLayoutParams(layoutParams4);
                                    }
                                    loftMaskViewParent.f39208e = view.getMeasuredHeight();
                                    if (loftMaskViewParent.getVisibility() == 0) {
                                        if (loftMaskViewParent.f39209f) {
                                            loftMaskViewParent.setExpand(true);
                                        } else {
                                            loftMaskViewParent.setExpandHalf(true);
                                        }
                                    }
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                                }
                            }
                            if (a() && this.f2917d != null) {
                                LoftListAdapter loftListAdapter3 = this.f2915b;
                                if (loftListAdapter3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("loftListAdapter");
                                }
                                CrossPlatformWebView crossPlatformWebView = loftListAdapter3.f39200b;
                                if (crossPlatformWebView != null) {
                                    String str = this.f2917d;
                                    if (str == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    crossPlatformWebView.a("second_floor_show", a(str, a(), this.f2916c), "");
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f2914a, false, 31271, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f2914a, false, 31271, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        measureChildren(i, i2);
    }

    public final void a(boolean z, @NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str}, this, f2914a, false, 31272, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str}, this, f2914a, false, 31272, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "showType");
        setTranslationY(0.0f);
        this.f2917d = str;
        LoftListAdapter loftListAdapter = this.f2915b;
        if (loftListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loftListAdapter");
        }
        CrossPlatformWebView crossPlatformWebView = loftListAdapter.f39200b;
        if (crossPlatformWebView != null) {
            String str2 = this.f2917d;
            if (str2 == null) {
                Intrinsics.throwNpe();
            }
            crossPlatformWebView.a("second_floor_show", a(str2, a(), this.f2916c), "");
        }
        ((LoftMaskViewParent) a((int) C0906R.id.bkb)).a(z);
    }

    private final JSONObject a(String str, boolean z, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, Byte.valueOf(z ? (byte) 1 : 0), str4}, this, f2914a, false, 31277, new Class[]{String.class, Boolean.TYPE, String.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{str3, Byte.valueOf(z), str4}, this, f2914a, false, 31277, new Class[]{String.class, Boolean.TYPE, String.class}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("show_type", str3);
        jSONObject.put("loft_item_id", str4);
        jSONObject.put("is_show", z);
        return jSONObject;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LoftView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f2916c = "";
        bg.c(this);
        LayoutInflater.from(context).inflate(C0906R.layout.a5t, this, true);
        if (PatchProxy.isSupport(new Object[0], this, f2914a, false, 31269, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2914a, false, 31269, new Class[0], Void.TYPE);
        } else {
            RecyclerView recyclerView = (RecyclerView) a((int) C0906R.id.bq4);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "nested_list");
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            this.f2915b = new LoftListAdapter(context2);
            RecyclerView recyclerView2 = (RecyclerView) a((int) C0906R.id.bq4);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "nested_list");
            LoftListAdapter loftListAdapter = this.f2915b;
            if (loftListAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loftListAdapter");
            }
            recyclerView2.setAdapter(loftListAdapter);
        }
        if (PatchProxy.isSupport(new Object[0], this, f2914a, false, 31267, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2914a, false, 31267, new Class[0], Void.TYPE);
        } else {
            ((ImageView) a((int) C0906R.id.j3)).setOnClickListener(new a(this));
            a((int) C0906R.id.bka).setOnClickListener(new b(this));
        }
        if (PatchProxy.isSupport(new Object[0], this, f2914a, false, 31266, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2914a, false, 31266, new Class[0], Void.TYPE);
        } else {
            View a2 = a((int) C0906R.id.mk);
            Intrinsics.checkExpressionValueIsNotNull(a2, "bottom_mask");
            ((LoftMaskViewParent) a((int) C0906R.id.bkb)).setBottomMask(a2);
        }
        if (PatchProxy.isSupport(new Object[0], this, f2914a, false, 31265, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2914a, false, 31265, new Class[0], Void.TYPE);
            return;
        }
        ((LoftMaskViewParent) a((int) C0906R.id.bkb)).getTotalMoveRate().observeForever(new c(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoftView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f2914a, false, 31264, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f2914a, false, 31264, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "view");
            int id = childAt.getId();
            if (id == C0906R.id.bka) {
                childAt.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else if (id == C0906R.id.d5b) {
                childAt.layout(0, 0, getMeasuredWidth(), childAt.getMeasuredHeight());
            } else if (id == C0906R.id.mk) {
                childAt.layout(0, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() + childAt.getMeasuredHeight());
            } else if (id == C0906R.id.bkb) {
                childAt.layout(0, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() + childAt.getMeasuredHeight());
            }
        }
    }
}
