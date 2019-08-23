package com.ss.android.ugc.aweme.commercialize.link;

import android.content.Context;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.commercialize.link.b;
import com.ss.android.ugc.aweme.commercialize.model.e;
import com.ss.android.ugc.aweme.profile.model.CommercePermissionStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.ui.w;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010$\u001a\u00020%H\u0014J\b\u0010&\u001a\u00020%H\u0014J\u0010\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0013H\u0016J\b\u0010)\u001a\u00020%H\u0002J\u001f\u0010*\u001a\u00020%2\u0014\b\u0004\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020%0,H\bR(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0013@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0013@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R$\u0010\u001c\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0013@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0018R$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u001e@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006."}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/link/LinkAuthPublishSettingItem;", "Lcom/ss/android/ugc/aweme/shortvideo/ui/PublishSettingItem;", "Lcom/ss/android/ugc/aweme/commercialize/link/LinkAuthBridge$SettingItem;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Lcom/ss/android/ugc/aweme/commercialize/model/CommerceDataContainer;", "commerceDataContainer", "getCommerceDataContainer", "()Lcom/ss/android/ugc/aweme/commercialize/model/CommerceDataContainer;", "setCommerceDataContainer", "(Lcom/ss/android/ugc/aweme/commercialize/model/CommerceDataContainer;)V", "", "hasGoods", "getHasGoods", "()Z", "setHasGoods", "(Z)V", "hasMicroApp", "getHasMicroApp", "setHasMicroApp", "isAuthEnabled", "setAuthEnabled", "", "linkData", "getLinkData", "()Ljava/lang/String;", "setLinkData", "(Ljava/lang/String;)V", "onAttachedToWindow", "", "onDetachedFromWindow", "setEnabled", "enabled", "setupEnable", "updateCommerceData", "f", "Lkotlin/Function1;", "Lcom/ss/android/ugc/aweme/commercialize/model/CommercePublishModel;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d extends w implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38968a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f38969b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private String f38970c = "";
    private boolean j;
    private boolean k;
    @Nullable
    private com.ss.android.ugc.aweme.commercialize.model.d l;

    @Nullable
    public final com.ss.android.ugc.aweme.commercialize.model.d getCommerceDataContainer() {
        return this.l;
    }

    public final boolean getHasGoods() {
        return this.k;
    }

    public final boolean getHasMicroApp() {
        return this.j;
    }

    @NotNull
    public final String getLinkData() {
        return this.f38970c;
    }

    private final void a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f38968a, false, 30881, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38968a, false, 30881, new Class[0], Void.TYPE);
            return;
        }
        if (!this.j && !this.k) {
            z = true;
        }
        setEnabled(z);
    }

    public final void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f38968a, false, 30882, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38968a, false, 30882, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        b.a((b.a) this);
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f38968a, false, 30883, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38968a, false, 30883, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        if (Intrinsics.areEqual((Object) b.f38964b, (Object) this)) {
            b.a((b.a) null);
        }
    }

    public d(@Nullable Context context) {
        super(context);
        setDrawableLeft(2130839225);
        setTitle((int) C0906R.string.bt5);
        setAuthEnabled(a.b());
        if (a.b()) {
            String json = new Gson().toJson((Object) MapsKt.mapOf(TuplesKt.to("commerce_ad_link", Boolean.TRUE)));
            Intrinsics.checkExpressionValueIsNotNull(json, "Gson().toJson(\n         …          )\n            )");
            setLinkData(json);
        }
    }

    public final void setCommerceDataContainer(@Nullable com.ss.android.ugc.aweme.commercialize.model.d dVar) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f38968a, false, 30878, new Class[]{com.ss.android.ugc.aweme.commercialize.model.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f38968a, false, 30878, new Class[]{com.ss.android.ugc.aweme.commercialize.model.d.class}, Void.TYPE);
            return;
        }
        this.l = dVar;
        if (dVar != null) {
            z = dVar.b();
        }
        setHasMicroApp(z);
    }

    public final void setAuthEnabled(boolean z) {
        int i;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f38968a, false, 30879, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f38968a, false, 30879, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f38969b = z;
        if (!this.f38969b || !isEnabled()) {
            z2 = false;
        }
        if (z2) {
            i = C0906R.string.b5p;
        } else {
            i = C0906R.string.b5o;
        }
        setSubtitle(i);
        com.ss.android.ugc.aweme.commercialize.model.d commerceDataContainer = getCommerceDataContainer();
        if (commerceDataContainer != null) {
            e b2 = e.b(commerceDataContainer.a());
            Intrinsics.checkExpressionValueIsNotNull(b2, "model");
            b2.f39375b = z;
            commerceDataContainer.a(e.a(b2));
        }
    }

    public final void setEnabled(boolean z) {
        float f2;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f38968a, false, 30884, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f38968a, false, 30884, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        setEnable(z);
        if (!this.f38969b || !z) {
            z2 = false;
        }
        setAuthEnabled(z2);
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.5f;
        }
        setAlpha(f2);
    }

    public final void setHasGoods(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f38968a, false, 30877, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f38968a, false, 30877, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.k = z;
        a();
    }

    public final void setHasMicroApp(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f38968a, false, 30876, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f38968a, false, 30876, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.j = z;
        a();
    }

    public final void setLinkData(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f38968a, false, 30875, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f38968a, false, 30875, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "value");
        this.f38970c = str;
        switch (b.a(str)) {
            case 1:
                setAuthEnabled(false);
                setVisibility(8);
                IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
                if (a2 != null) {
                    User curUser = a2.getCurUser();
                    if (curUser != null) {
                        CommercePermissionStruct commercePermission = curUser.getCommercePermission();
                        if (commercePermission != null) {
                            commercePermission.adLink = 11;
                            break;
                        }
                    }
                }
                break;
            case 2:
                setAuthEnabled(false);
                break;
            case 3:
                setAuthEnabled(true);
                break;
        }
        com.ss.android.ugc.aweme.commercialize.model.d commerceDataContainer = getCommerceDataContainer();
        if (commerceDataContainer != null) {
            e b2 = e.b(commerceDataContainer.a());
            Intrinsics.checkExpressionValueIsNotNull(b2, "model");
            b2.f39376c = b.b(str);
            commerceDataContainer.a(e.a(b2));
        }
    }
}
