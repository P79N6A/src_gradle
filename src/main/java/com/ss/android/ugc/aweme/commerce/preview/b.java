package com.ss.android.ugc.aweme.commerce.preview;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commerce.service.logs.an;
import com.ss.android.ugc.aweme.commerce.service.logs.ao;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.commerce.service.models.h;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.share.ah;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u001a@\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007¨\u0006\u000f"}, d2 = {"goodShopShare", "", "context", "Landroid/app/Activity;", "user", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "entranceLocation", "", "enterFrom", "enterMethod", "onShare", "good", "Lcom/ss/android/ugc/aweme/commerce/service/models/DetailPromotion;", "awemeId", "authorId", "main_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37347a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/CommerceShareUtilKt$goodShopShare$2", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$IActionHandler;", "checkStatus", "", "shareType", "", "doCopyAction", "onAction", "struct", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements IShareService.IActionHandler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37348a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommerceUser f37349b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f37350c;

        public final boolean checkStatus(@NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f37348a, false, 28530, new Class[]{String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f37348a, false, 28530, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str2, "shareType");
            return true;
        }

        public a(CommerceUser commerceUser, Activity activity) {
            this.f37349b = commerceUser;
            this.f37350c = activity;
        }

        public final boolean onAction(@NotNull IShareService.ShareStruct shareStruct, @NotNull String str) {
            if (PatchProxy.isSupport(new Object[]{shareStruct, str}, this, f37348a, false, 28531, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct, str}, this, f37348a, false, 28531, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(shareStruct, "struct");
            Intrinsics.checkParameterIsNotNull(str, "shareType");
            ao aoVar = new ao();
            aoVar.f38082f = this.f37349b.getUid();
            aoVar.g = str;
            aoVar.b();
            CharSequence charSequence = str;
            if (TextUtils.equals("copy", charSequence)) {
                if (PatchProxy.isSupport(new Object[0], this, f37348a, false, 28532, new Class[0], Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f37348a, false, 28532, new Class[0], Boolean.TYPE)).booleanValue();
                }
                Object systemService = this.f37350c.getSystemService("clipboard");
                if (systemService != null) {
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("", ""));
                    com.bytedance.ies.dmt.ui.d.a.a((Context) this.f37350c, (int) C0906R.string.xi).a();
                    return true;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ClipboardManager");
            } else if (TextUtils.equals("qr_code", charSequence)) {
                new com.ss.android.ugc.aweme.share.ao(this.f37350c, null, this.f37349b).show();
                return true;
            } else {
                new com.ss.android.ugc.aweme.share.ao(this.f37350c, str, this.f37349b).show();
                return true;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/CommerceShareUtilKt$onShare$1", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$IActionHandler;", "checkStatus", "", "shareType", "", "doCopyAction", "onAction", "struct", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.preview.b$b  reason: collision with other inner class name */
    public static final class C0473b implements IShareService.IActionHandler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37351a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37352b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f37353c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Activity f37354d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f37355e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f37356f;

        public final boolean checkStatus(@NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f37351a, false, 28533, new Class[]{String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f37351a, false, 28533, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str2, "shareType");
            return true;
        }

        public final boolean onAction(@NotNull IShareService.ShareStruct shareStruct, @NotNull String str) {
            if (PatchProxy.isSupport(new Object[]{shareStruct, str}, this, f37351a, false, 28534, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct, str}, this, f37351a, false, 28534, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(shareStruct, "struct");
            Intrinsics.checkParameterIsNotNull(str, "shareType");
            CharSequence charSequence = str;
            if (TextUtils.equals("report", charSequence)) {
                return true;
            }
            an anVar = new an();
            anVar.h = this.f37352b;
            anVar.g = this.f37353c.getPromotionId();
            anVar.j = String.valueOf(this.f37353c.getCommodityType());
            anVar.k = str;
            anVar.b();
            if (TextUtils.equals("copy", charSequence)) {
                if (PatchProxy.isSupport(new Object[0], this, f37351a, false, 28535, new Class[0], Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f37351a, false, 28535, new Class[0], Boolean.TYPE)).booleanValue();
                }
                Object systemService = this.f37354d.getSystemService("clipboard");
                if (systemService != null) {
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(this.f37356f, this.f37356f));
                    com.bytedance.ies.dmt.ui.d.a.a((Context) this.f37354d, (int) C0906R.string.xi).a();
                    return true;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ClipboardManager");
            } else if (TextUtils.equals("qr_code", charSequence)) {
                ah ahVar = new ah(this.f37354d, null, this.f37352b, this.f37355e, this.f37353c);
                ahVar.show();
                return true;
            } else {
                ah ahVar2 = new ah(this.f37354d, str, this.f37352b, this.f37355e, this.f37353c);
                ahVar2.show();
                return true;
            }
        }

        C0473b(String str, h hVar, Activity activity, String str2, String str3) {
            this.f37352b = str;
            this.f37353c = hVar;
            this.f37354d = activity;
            this.f37355e = str2;
            this.f37356f = str3;
        }
    }
}
