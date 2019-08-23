package com.ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.sdk.activity.IESBrowserFragment;
import com.ss.android.ugc.aweme.commercialize.EasterEggActivity;
import com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2;
import com.ss.android.ugc.aweme.commercialize.k;
import com.ss.android.ugc.aweme.commercialize.model.i;
import com.ss.android.ugc.aweme.commercialize.views.form.AdFormBrowserFragment;
import com.ss.android.ugc.aweme.commercialize.views.form.AdFormMaskFragment;
import com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialog;
import com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2;
import com.ss.android.ugc.aweme.commercialize.views.form.c;
import com.ss.android.ugc.aweme.commercialize.views.form.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.model.AwemeSettings;
import com.ss.android.ugc.aweme.ug.a.a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J$\u0010\u0019\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u0004H\u0007J2\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u0012\u0010\"\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010$H\u0007J\b\u0010%\u001a\u00020\u0014H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R$\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/AdWebContainerTest;", "", "()V", "CROSS_PLATFORM_CONTAINER", "", "IES_BROWSER_CONTAINER", "adWebContainer", "adWebContainer$annotations", "getAdWebContainer", "()I", "setAdWebContainer", "(I)V", "hideAdFormMaskLayer", "", "fragmentManager", "Landroid/support/v4/app/FragmentManager;", "containerLayout", "Landroid/view/ViewGroup;", "containerId", "needResumePlay", "", "launchBottomFormDialog", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "launchEasterEggActivity", "easterEggPageParams", "Lcom/ss/android/ugc/aweme/commercialize/EasterEggPageParams;", "requestCode", "showAdFormMaskLayer", "mAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "adFormMaskInternalListener", "Lcom/ss/android/ugc/aweme/commercialize/views/form/AdFormMaskInternalListener;", "updateSettings", "settings", "Lcom/ss/android/ugc/aweme/setting/model/AwemeSettings;", "useCrossPlatformContainer", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39810a;

    /* renamed from: b  reason: collision with root package name */
    public static final p f39811b = new p();

    /* renamed from: c  reason: collision with root package name */
    private static int f39812c;

    private p() {
    }

    @JvmStatic
    public static final boolean a() {
        if (f39812c == 1) {
            return true;
        }
        return false;
    }

    @JvmStatic
    public static final void a(@Nullable AwemeSettings awemeSettings) {
        if (awemeSettings != null) {
            f39812c = awemeSettings.adWebContainer;
        }
    }

    @JvmStatic
    @NotNull
    public static final Intent a(@Nullable Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f39810a, true, 32410, new Class[]{Context.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{context2}, null, f39810a, true, 32410, new Class[]{Context.class}, Intent.class);
        } else if (a()) {
            return new Intent(context2, BottomFormDialogV2.class);
        } else {
            return new Intent(context2, BottomFormDialog.class);
        }
    }

    @JvmStatic
    @JvmOverloads
    public static final void a(@Nullable Context context, @NotNull k kVar, int i) {
        Context context2 = context;
        k kVar2 = kVar;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{context2, kVar2, Integer.valueOf(i)}, null, f39810a, true, 32411, new Class[]{Context.class, k.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, kVar2, Integer.valueOf(i)}, null, f39810a, true, 32411, new Class[]{Context.class, k.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(kVar2, "easterEggPageParams");
        if (context2 != null && kVar.getEasterEggInfo() != null) {
            i easterEggInfo = kVar.getEasterEggInfo();
            Intrinsics.checkExpressionValueIsNotNull(easterEggInfo, "easterEggPageParams.easterEggInfo");
            if (!a.a(context2, easterEggInfo.getOpenUrl())) {
                if (a()) {
                    if (i2 == -1) {
                        EasterEggActivityV2.a aVar = EasterEggActivityV2.f38400e;
                        if (PatchProxy.isSupport(new Object[]{context2, kVar2}, aVar, EasterEggActivityV2.a.f38405a, false, 30301, new Class[]{Context.class, k.class}, Void.TYPE)) {
                            EasterEggActivityV2.a aVar2 = aVar;
                            PatchProxy.accessDispatch(new Object[]{context2, kVar2}, aVar2, EasterEggActivityV2.a.f38405a, false, 30301, new Class[]{Context.class, k.class}, Void.TYPE);
                        } else {
                            Intrinsics.checkParameterIsNotNull(context2, "context");
                            Intrinsics.checkParameterIsNotNull(kVar2, "pageParams");
                            Intent intent = new Intent(context2, EasterEggActivityV2.class);
                            intent.putExtra("pageParams", kVar2);
                            context2.startActivity(intent);
                        }
                    } else {
                        if (context2 instanceof Activity) {
                            EasterEggActivityV2.a aVar3 = EasterEggActivityV2.f38400e;
                            Activity activity = (Activity) context2;
                            if (PatchProxy.isSupport(new Object[]{activity, kVar2, Integer.valueOf(i)}, aVar3, EasterEggActivityV2.a.f38405a, false, 30302, new Class[]{Activity.class, k.class, Integer.TYPE}, Void.TYPE)) {
                                EasterEggActivityV2.a aVar4 = aVar3;
                                PatchProxy.accessDispatch(new Object[]{activity, kVar2, Integer.valueOf(i)}, aVar4, EasterEggActivityV2.a.f38405a, false, 30302, new Class[]{Activity.class, k.class, Integer.TYPE}, Void.TYPE);
                            } else {
                                Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
                                Intrinsics.checkParameterIsNotNull(kVar2, "pageParams");
                                Intent intent2 = new Intent(activity, EasterEggActivityV2.class);
                                intent2.putExtra("pageParams", kVar2);
                                activity.startActivityForResult(intent2, i2);
                            }
                        }
                    }
                } else if (i2 == -1) {
                    EasterEggActivity.a(context, kVar);
                } else if (context2 instanceof Activity) {
                    EasterEggActivity.a((Activity) context2, kVar2, i2);
                }
            }
        }
    }

    @JvmStatic
    public static final void a(@NotNull FragmentManager fragmentManager, @NotNull ViewGroup viewGroup, int i, boolean z) {
        FragmentManager fragmentManager2 = fragmentManager;
        ViewGroup viewGroup2 = viewGroup;
        int i2 = i;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{fragmentManager2, viewGroup2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, null, f39810a, true, 32409, new Class[]{FragmentManager.class, ViewGroup.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {fragmentManager2, viewGroup2, Integer.valueOf(i), Byte.valueOf(z)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39810a, true, 32409, new Class[]{FragmentManager.class, ViewGroup.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fragmentManager2, "fragmentManager");
        Intrinsics.checkParameterIsNotNull(viewGroup2, "containerLayout");
        if (a()) {
            AdFormMaskFragment.h.a(fragmentManager2, viewGroup2, i2, z2);
        } else {
            new d().a(fragmentManager2, viewGroup2, i2, z2);
        }
    }

    @JvmStatic
    public static final void a(@NotNull Aweme aweme, @Nullable c cVar, @NotNull FragmentManager fragmentManager, @NotNull ViewGroup viewGroup, int i) {
        Aweme aweme2 = aweme;
        c cVar2 = cVar;
        FragmentManager fragmentManager2 = fragmentManager;
        ViewGroup viewGroup2 = viewGroup;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{aweme2, cVar2, fragmentManager2, viewGroup2, Integer.valueOf(i)}, null, f39810a, true, 32408, new Class[]{Aweme.class, c.class, FragmentManager.class, ViewGroup.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {aweme2, cVar2, fragmentManager2, viewGroup2, Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39810a, true, 32408, new Class[]{Aweme.class, c.class, FragmentManager.class, ViewGroup.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aweme2, "mAweme");
        Intrinsics.checkParameterIsNotNull(fragmentManager2, "fragmentManager");
        Intrinsics.checkParameterIsNotNull(viewGroup2, "containerLayout");
        if (a()) {
            AdFormMaskFragment.a aVar = AdFormMaskFragment.h;
            Bundle K = c.K(aweme);
            Intrinsics.checkExpressionValueIsNotNull(K, "AdDataUtils.initAdMaskFormPageBundle(mAweme)");
            AdFormMaskFragment a2 = aVar.a(K);
            a2.f2962e = cVar2;
            AdFormMaskFragment.h.a(fragmentManager2, viewGroup2, i2, a2);
            return;
        }
        IESBrowserFragment a3 = new d().a(fragmentManager2, viewGroup2, i2, c.K(aweme));
        if (a3 != null) {
            ((AdFormBrowserFragment) a3).an = cVar2;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.views.form.AdFormBrowserFragment");
    }
}
