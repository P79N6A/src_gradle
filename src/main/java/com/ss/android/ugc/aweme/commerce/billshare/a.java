package com.ss.android.ugc.aweme.commerce.billshare;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.commerce.service.models.h;
import java.util.HashMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/billshare/BillShareContract;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, d> f36732a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static long f36733b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static final C0462a f36734c = new C0462a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fJF\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/billshare/BillShareContract$Companion;", "", "()V", "lastClickTime", "", "records", "Ljava/util/HashMap;", "", "Lcom/ss/android/ugc/aweme/commerce/billshare/BillShareModel;", "clearBillShareModel", "", "act", "Landroid/app/Activity;", "getBillShareModel", "startBillShare", "fromAct", "promotion", "Lcom/ss/android/ugc/aweme/commerce/service/models/DetailPromotion;", "userInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "enterFrom", "enterMethod", "originItemId", "fromSchema", "", "wrapIntent", "Landroid/content/Intent;", "sessionId", "intent", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.billshare.a$a  reason: collision with other inner class name */
    public static final class C0462a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36735a;

        private C0462a() {
        }

        public /* synthetic */ C0462a(byte b2) {
            this();
        }

        public final void a(@NotNull Activity activity) {
            Activity activity2 = activity;
            if (PatchProxy.isSupport(new Object[]{activity2}, this, f36735a, false, 27985, new Class[]{Activity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2}, this, f36735a, false, 27985, new Class[]{Activity.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, "act");
            a.f36732a.remove(activity.getIntent().getStringExtra("KEY_HASH_CODE"));
        }

        private final Intent a(String str, Intent intent) {
            String str2 = str;
            Intent intent2 = intent;
            if (PatchProxy.isSupport(new Object[]{str2, intent2}, this, f36735a, false, 27986, new Class[]{String.class, Intent.class}, Intent.class)) {
                return (Intent) PatchProxy.accessDispatch(new Object[]{str2, intent2}, this, f36735a, false, 27986, new Class[]{String.class, Intent.class}, Intent.class);
            }
            intent2.putExtra("KEY_HASH_CODE", str2);
            return intent2;
        }

        @JvmStatic
        @SuppressLint({"TooManyMethodParam"})
        public final void a(@NotNull Activity activity, @NotNull h hVar, @NotNull CommerceUser commerceUser, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z) {
            Activity activity2 = activity;
            h hVar2 = hVar;
            CommerceUser commerceUser2 = commerceUser;
            if (PatchProxy.isSupport(new Object[]{activity2, hVar2, commerceUser2, str, str2, str3, Byte.valueOf(z ? (byte) 1 : 0)}, this, f36735a, false, 27983, new Class[]{Activity.class, h.class, CommerceUser.class, String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2, hVar2, commerceUser2, str, str2, str3, Byte.valueOf(z)}, this, f36735a, false, 27983, new Class[]{Activity.class, h.class, CommerceUser.class, String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, "fromAct");
            Intrinsics.checkParameterIsNotNull(hVar2, "promotion");
            Intrinsics.checkParameterIsNotNull(commerceUser2, "userInfo");
            if (SystemClock.elapsedRealtime() - a.f36733b >= 300) {
                a.f36733b = SystemClock.elapsedRealtime();
                com.ss.android.ugc.aweme.framework.core.a b2 = com.ss.android.ugc.aweme.framework.core.a.b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "AppTracker.get()");
                if (!(b2.a() instanceof BillShareActivity)) {
                    String uuid = UUID.randomUUID().toString();
                    Intrinsics.checkExpressionValueIsNotNull(uuid, "UUID.randomUUID().toString()");
                    d dVar = new d(hVar, str, str2, str3, z, uuid, commerceUser);
                    a.f36732a.put(uuid, dVar);
                    activity2.startActivity(a(uuid, new Intent(activity2, BillShareActivity.class)));
                }
            }
        }
    }
}
