package com.ss.android.ugc.aweme.commerce.live;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.commercialize.ad.c;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.fe.method.BroadcastMethod;
import com.ss.android.ugc.aweme.fe.method.CloseHalfDialogBridge;
import com.ss.android.ugc.aweme.utils.bg;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 !2\u00020\u0001:\u0002 !B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u000eH\u0007J\u0012\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0017J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\"\u0010\u001a\u001a\u00020\u00002\u001a\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006J\u001c\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/live/HalfScreenRnBox;", "Landroid/support/v4/app/DialogFragment;", "()V", "halfParams", "Lcom/ss/android/ugc/aweme/commerce/live/HalfBoxParams;", "mNcb", "Lkotlin/Function2;", "", "", "", "business", "event", "Lcom/ss/android/ugc/aweme/fe/method/BroadcastMethod$JsBroadCastEvent;", "closeHalfDialog", "Lcom/ss/android/ugc/aweme/fe/method/CloseHalfDialogBridge$CloseHalfDialog;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onNext", "ncb", "show", "manager", "Landroid/support/v4/app/FragmentManager;", "tag", "BottomUpDialog", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class HalfScreenRnBox extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2879a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f2880c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public b f2881b;

    /* renamed from: d  reason: collision with root package name */
    private Function2<? super String, Object, Unit> f2882d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap f2883e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/live/HalfScreenRnBox$BottomUpDialog;", "Landroid/support/v7/app/AppCompatDialog;", "context", "Landroid/content/Context;", "theme", "", "(Landroid/content/Context;I)V", "show", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class BottomUpDialog extends AppCompatDialog {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36951a;

        public final void show() {
            if (PatchProxy.isSupport(new Object[0], this, f36951a, false, 28244, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f36951a, false, 28244, new Class[0], Void.TYPE);
            } else if (getWindow() != null) {
                Window window = getWindow();
                if (window == null) {
                    Intrinsics.throwNpe();
                }
                window.setBackgroundDrawable(new ColorDrawable(0));
                Window window2 = getWindow();
                if (window2 == null) {
                    Intrinsics.throwNpe();
                }
                WindowManager.LayoutParams attributes = window2.getAttributes();
                attributes.width = -1;
                attributes.height = -1;
                Window window3 = getWindow();
                if (window3 == null) {
                    Intrinsics.throwNpe();
                }
                window3.setAttributes(attributes);
                Window window4 = getWindow();
                if (window4 == null) {
                    Intrinsics.throwNpe();
                }
                window4.setWindowAnimations(C0906R.style.g3);
                Window window5 = getWindow();
                if (window5 == null) {
                    Intrinsics.throwNpe();
                }
                window5.setGravity(80);
                Window window6 = getWindow();
                if (window6 == null) {
                    Intrinsics.throwNpe();
                }
                window6.getDecorView().setPadding(0, 0, 0, 0);
                super.show();
            }
        }

        public BottomUpDialog(@Nullable Context context, int i) {
            super(context, 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/live/HalfScreenRnBox$Companion;", "", "()V", "KEY_HALF_PARAMS", "", "show", "", "manager", "Landroid/support/v4/app/FragmentManager;", "height", "", "url", "corner", "", "bgColor", "enableDrag", "", "ncb", "Lkotlin/Function2;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onGlobalLayout"}, k = 3, mv = {1, 1, 15})
    static final class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36952a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HalfScreenRnBox f36953b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f36954c;

        b(HalfScreenRnBox halfScreenRnBox, View view) {
            this.f36953b = halfScreenRnBox;
            this.f36954c = view;
        }

        public final void onGlobalLayout() {
            int i;
            if (PatchProxy.isSupport(new Object[0], this, f36952a, false, 28246, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f36952a, false, 28246, new Class[0], Void.TYPE);
                return;
            }
            b bVar = this.f36953b.f2881b;
            if (bVar != null) {
                i = bVar.getHalfHeight();
            } else {
                i = -1;
            }
            if (com.ss.android.ugc.aweme.app.a.a.a((Activity) this.f36953b.getActivity())) {
                i -= p.c();
            }
            View view = this.f36954c;
            Intrinsics.checkExpressionValueIsNotNull(view, "view");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = p.b(this.f36953b.getContext());
            layoutParams.height = i;
            this.f36954c.requestLayout();
        }
    }

    private View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.chb)}, this, f2879a, false, 28241, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.chb)}, this, f2879a, false, 28241, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f2883e == null) {
            this.f2883e = new HashMap();
        }
        View view = (View) this.f2883e.get(Integer.valueOf(C0906R.id.chb));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(C0906R.id.chb);
            this.f2883e.put(Integer.valueOf(C0906R.id.chb), view);
        }
        return view;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f2879a, false, 28242, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2879a, false, 28242, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2883e != null) {
            this.f2883e.clear();
        }
    }

    @SuppressLint({"useChinaStyleVersion"})
    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f2879a, false, 28236, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f2879a, false, 28236, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        setStyle(0, 0);
        super.onCreate(bundle);
    }

    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f2879a, false, 28235, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f2879a, false, 28235, new Class[]{Bundle.class}, Dialog.class);
        }
        Context context = getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        return new BottomUpDialog(context, 0);
    }

    @Subscribe(a = ThreadMode.MAIN)
    public final void closeHalfDialog(@NotNull CloseHalfDialogBridge.a aVar) {
        CloseHalfDialogBridge.a aVar2 = aVar;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f2879a, false, 28238, new Class[]{CloseHalfDialogBridge.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f2879a, false, 28238, new Class[]{CloseHalfDialogBridge.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "event");
        JsonElement parse = new JsonParser().parse(aVar2.f44434a.toString());
        Intrinsics.checkExpressionValueIsNotNull(parse, "JsonParser().parse(event.params.toString())");
        JsonElement jsonElement = parse.getAsJsonObject().get("reactId");
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            String asString = jsonElement.getAsString();
            CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) a(C0906R.id.chb);
            Intrinsics.checkExpressionValueIsNotNull(crossPlatformWebView, "rn_user_data");
            z = Intrinsics.areEqual((Object) asString, (Object) crossPlatformWebView.getReactId());
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (!valueOf.booleanValue()) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.booleanValue();
            dismissAllowingStateLoss();
        }
    }

    @Subscribe(a = ThreadMode.MAIN)
    public final void business(@NotNull BroadcastMethod.a aVar) {
        int i;
        boolean z;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f2879a, false, 28239, new Class[]{BroadcastMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f2879a, false, 28239, new Class[]{BroadcastMethod.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "event");
        JsonElement parse = new JsonParser().parse(aVar.f44432b.toString());
        Intrinsics.checkExpressionValueIsNotNull(parse, "JsonParser().parse(event.params.toString())");
        JsonObject asJsonObject = parse.getAsJsonObject();
        JsonElement jsonElement = asJsonObject.get("data");
        if (jsonElement == null || jsonElement.isJsonNull()) {
            z = false;
            i = 0;
        } else {
            JsonElement jsonElement2 = jsonElement.getAsJsonObject().get("selected_goods_num");
            if (jsonElement2 == null || jsonElement2.isJsonNull()) {
                i = 0;
            } else {
                i = jsonElement2.getAsInt();
            }
            JsonElement jsonElement3 = jsonElement.getAsJsonObject().get("reactId");
            if (jsonElement3 == null || jsonElement3.isJsonNull()) {
                z = false;
            } else {
                String asString = jsonElement3.getAsString();
                CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) a(C0906R.id.chb);
                Intrinsics.checkExpressionValueIsNotNull(crossPlatformWebView, "rn_user_data");
                z = Intrinsics.areEqual((Object) asString, (Object) crossPlatformWebView.getReactId());
            }
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (!valueOf.booleanValue()) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.booleanValue();
            JsonElement jsonElement4 = asJsonObject.get("eventName");
            if (jsonElement4 != null) {
                String asString2 = jsonElement4.getAsString();
                if (asString2 != null) {
                    if (!Intrinsics.areEqual((Object) asString2, (Object) "good_choose_done") && !Intrinsics.areEqual((Object) asString2, (Object) "good_choose_cancel")) {
                        z2 = false;
                    }
                    if (!z2) {
                        asString2 = null;
                    }
                    if (asString2 != null) {
                        int hashCode = asString2.hashCode();
                        if (hashCode != -2014133856) {
                            if (hashCode == 1222527016 && asString2.equals("good_choose_done")) {
                                Function2<? super String, Object, Unit> function2 = this.f2882d;
                                if (function2 != null) {
                                    function2.invoke("good_choose_done", Integer.valueOf(i));
                                }
                                dismissAllowingStateLoss();
                            }
                        } else if (asString2.equals("good_choose_cancel")) {
                            dismissAllowingStateLoss();
                        }
                    }
                }
            }
        }
    }

    public void show(@Nullable FragmentManager fragmentManager, @Nullable String str) {
        Fragment fragment;
        if (PatchProxy.isSupport(new Object[]{fragmentManager, str}, this, f2879a, false, 28240, new Class[]{FragmentManager.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager, str}, this, f2879a, false, 28240, new Class[]{FragmentManager.class, String.class}, Void.TYPE);
            return;
        }
        if (fragmentManager != null) {
            try {
                fragment = fragmentManager.findFragmentByTag(str);
            } catch (Exception unused) {
                return;
            }
        } else {
            fragment = null;
        }
        if (fragment != null) {
            fragmentManager.beginTransaction().remove(fragment).commit();
        } else {
            super.show(fragmentManager, str);
        }
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Serializable serializable;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f2879a, false, 28237, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f2879a, false, 28237, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        View inflate = layoutInflater2.inflate(C0906R.layout.iu, viewGroup2, false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("KEY_HALF_PARAMS");
        } else {
            serializable = null;
        }
        if (serializable != null) {
            this.f2881b = (b) serializable;
            b bVar = this.f2881b;
            if (bVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
                c cVar = new c(bVar.getBgColor(), bVar.getCorner(), bVar.getCorner(), 0.0f, 0.0f);
                inflate.setBackground(cVar);
                ((CrossPlatformWebView) inflate.findViewById(C0906R.id.chb)).a(17, 0, 0, 0, 0);
                ((CrossPlatformWebView) inflate.findViewById(C0906R.id.chb)).a(bVar.getUrl(), false, true);
            }
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            inflate.getViewTreeObserver().addOnGlobalLayoutListener(new b(this, inflate));
            bg.c(this);
            return inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce.live.HalfBoxParams");
    }
}
