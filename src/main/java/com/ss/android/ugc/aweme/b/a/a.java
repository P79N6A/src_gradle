package com.ss.android.ugc.aweme.b.a;

import android.os.Handler;
import com.bytedance.apm.a.c;
import com.bytedance.apm.b;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.global.config.settings.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\fH\u0002J\u001e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00062\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015J\u001a\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0007J\u0012\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0007J\b\u0010\u001a\u001a\u00020\u000fH\u0002J\u0006\u0010\u001b\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00060\bj\b\u0012\u0004\u0012\u00020\u0006`\tX\u000e¢\u0006\u0002\n\u0000R@\u0010\n\u001a4\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u000bj\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\bj\b\u0012\u0004\u0012\u00020\f`\t`\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/alog/api/ApiAlogManager;", "", "()V", "API_LOG_COUNT_LIMIT", "", "API_TAG", "", "mApiWhiteList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mLogMap", "Ljava/util/HashMap;", "Lcom/ss/android/ugc/aweme/alog/api/ApiLogModel;", "Lkotlin/collections/HashMap;", "addApiLog", "", "key", "log", "addHeadLog", "url", "header", "", "Lcom/bytedance/retrofit2/client/Header;", "addLog", "inApiList", "path", "initApiWhiteList", "uploadLog", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34455a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f34456b;

    /* renamed from: c  reason: collision with root package name */
    private static ArrayList<String> f34457c;

    /* renamed from: d  reason: collision with root package name */
    private static HashMap<String, ArrayList<b>> f34458d = new HashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.b.a.a$a  reason: collision with other inner class name */
    static final class C0444a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34459a;

        /* renamed from: b  reason: collision with root package name */
        public static final C0444a f34460b = new C0444a();

        C0444a() {
        }

        public final void run() {
            String str;
            if (PatchProxy.isSupport(new Object[0], this, f34459a, false, 21571, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34459a, false, 21571, new Class[0], Void.TYPE);
                return;
            }
            long currentTimeMillis = (System.currentTimeMillis() / 1000) - 10800;
            long currentTimeMillis2 = System.currentTimeMillis() / 1000;
            com.ss.android.agilelogger.a aVar = ALog.sConfig;
            if (aVar != null) {
                str = aVar.f27862d;
            } else {
                str = null;
            }
            b.a(str, currentTimeMillis, currentTimeMillis2, "Network", (c) AnonymousClass1.f34462b);
        }
    }

    private a() {
    }

    static {
        a aVar = new a();
        f34456b = aVar;
        f34457c = new ArrayList<>();
        if (PatchProxy.isSupport(new Object[0], aVar, f34455a, false, 21565, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar, f34455a, false, 21565, new Class[0], Void.TYPE);
            return;
        }
        List<String> list = null;
        try {
            com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
            list = b2.be();
        } catch (Exception unused) {
        }
        if (CollectionUtils.isEmpty(list)) {
            k a2 = k.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AwemeApplication.getApplication()");
            String[] stringArray = a2.getResources().getStringArray(C0906R.array.f4408c);
            Intrinsics.checkExpressionValueIsNotNull(stringArray, "AwemeApplication.getAppl…rray.api_alog_white_list)");
            CollectionsKt.addAll((Collection<? super T>) f34457c, (T[]) stringArray);
        } else if (list != null) {
            f34457c = list;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.String> /* = java.util.ArrayList<kotlin.String> */");
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f34455a, false, 21570, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34455a, false, 21570, new Class[0], Void.TYPE);
            return;
        }
        try {
            for (Map.Entry value : f34458d.entrySet()) {
                ArrayList<b> arrayList = (ArrayList) value.getValue();
                if (!CollectionUtils.isEmpty(arrayList)) {
                    for (b bVar : arrayList) {
                        ALog.d("Network", bVar.toString());
                    }
                }
            }
            f34458d.clear();
            new Handler().postDelayed(C0444a.f34460b, 60000);
        } catch (Exception unused) {
        }
    }
}
