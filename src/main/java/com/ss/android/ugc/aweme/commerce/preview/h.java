package com.ss.android.ugc.aweme.commerce.preview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.l.c;
import com.ss.android.ugc.aweme.commerce.service.models.n;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/PreviewContract;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, n> f37499a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static long f37500b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static String f37501c = "PreviewContract";

    /* renamed from: d  reason: collision with root package name */
    public static final a f37502d = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/PreviewContract$Companion;", "", "()V", "CLICK_GAP", "", "TAG", "", "lastClickTime", "", "records", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/ss/android/ugc/aweme/commerce/service/models/PreviewParams;", "clearPreviewModel", "", "act", "Landroid/app/Activity;", "getPreviewModel", "startPreview", "previewParams", "wrapIntent", "Landroid/content/Intent;", "sessionId", "intent", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37503a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final void a(@NotNull Activity activity) {
            Activity activity2 = activity;
            if (PatchProxy.isSupport(new Object[]{activity2}, this, f37503a, false, 28775, new Class[]{Activity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2}, this, f37503a, false, 28775, new Class[]{Activity.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, "act");
            String str = h.f37501c;
            StringBuilder sb = new StringBuilder("clearPreviewModel ；key is ");
            sb.append(activity.getIntent().getStringExtra("KEY_HASH_CODE"));
            sb.append(" and hashMap is ");
            sb.append(h.f37499a);
            sb.append(" and address is ");
            sb.append(System.identityHashCode(h.f37499a));
            sb.append(" and stackTrace is ");
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
            sb.append(Arrays.toString(currentThread.getStackTrace()));
            sb.append(" and pid is ");
            sb.append(Process.myPid());
            sb.append(" and tid is ");
            sb.append(Process.myTid());
            com.ss.android.ugc.aweme.framework.a.a.a(3, str, sb.toString());
            h.f37499a.remove(activity.getIntent().getStringExtra("KEY_HASH_CODE"));
        }

        @JvmStatic
        @SuppressLint({"TooManyMethodParam"})
        public final void a(@NotNull n nVar) {
            n nVar2 = nVar;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{nVar2}, this, f37503a, false, 28773, new Class[]{n.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{nVar2}, this, f37503a, false, 28773, new Class[]{n.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(nVar2, "previewParams");
            if (SystemClock.elapsedRealtime() - h.f37500b >= 300) {
                h.f37500b = SystemClock.elapsedRealtime();
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkExpressionValueIsNotNull(uuid, "UUID.randomUUID().toString()");
                Context context = nVar2.f38220b;
                Fragment fragment = nVar2.k;
                nVar2.f38220b = null;
                nVar2.k = null;
                h.f37499a.put(uuid, nVar2);
                String str = h.f37501c;
                StringBuilder sb = new StringBuilder("startPreview ；key is ");
                sb.append(uuid);
                sb.append(" and hashMap is ");
                sb.append(h.f37499a);
                sb.append(" and address is ");
                sb.append(System.identityHashCode(h.f37499a));
                sb.append(" and previewParams is ");
                sb.append(h.f37499a.get(uuid));
                sb.append(" and stackTrace is ");
                Thread currentThread = Thread.currentThread();
                Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
                sb.append(Arrays.toString(currentThread.getStackTrace()));
                sb.append(" and pid is ");
                sb.append(Process.myPid());
                sb.append("  and tid is ");
                sb.append(Process.myTid());
                com.ss.android.ugc.aweme.framework.a.a.a(3, str, sb.toString());
                if (fragment != null) {
                    try {
                        Intent a2 = h.f37502d.a(uuid, new Intent(context, PreviewActivity.class));
                        Integer num = nVar2.l;
                        if (num != null) {
                            i = num.intValue();
                        }
                        fragment.startActivityForResult(a2, i);
                    } catch (Throwable th) {
                        c.f37989a.a(th.toString());
                    }
                } else if (context != null) {
                    context.startActivity(a(uuid, new Intent(context, PreviewActivity.class)));
                }
            }
        }

        private final Intent a(String str, Intent intent) {
            String str2 = str;
            Intent intent2 = intent;
            if (PatchProxy.isSupport(new Object[]{str2, intent2}, this, f37503a, false, 28776, new Class[]{String.class, Intent.class}, Intent.class)) {
                return (Intent) PatchProxy.accessDispatch(new Object[]{str2, intent2}, this, f37503a, false, 28776, new Class[]{String.class, Intent.class}, Intent.class);
            }
            intent2.putExtra("KEY_HASH_CODE", str2);
            return intent2;
        }
    }
}
