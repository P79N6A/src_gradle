package com.ss.android.ugc.aweme.motion;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.motion.a;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002J\r\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0002\b\u000fJ1\u0010\u0010\u001a\u00020\u00112\"\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u00170\u0013H\u0000¢\u0006\u0002\b\u0018J\b\u0010\u0019\u001a\u00020\bH\u0002J\b\u0010\u001a\u001a\u00020\bH\u0002J\u0006\u0010\u001b\u001a\u00020\u0011J\b\u0010\u001c\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/motion/MotionHelper;", "", "()V", "MINUTE", "", "US", "", "isI18nMode", "", "isNewInstall", "startTime", "getEnterFrom", "page", "Lcom/ss/android/ugc/aweme/feed/Feed0VVManager$PAGE;", "handleGesture", "handleGesture$main_douyinCnRelease", "handleSend", "", "recordMap", "", "", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/motion/MotionHandler$Record;", "Lkotlin/collections/ArrayList;", "handleSend$main_douyinCnRelease", "inTime", "isTargetRegion", "markStart", "newInstall", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56125a = null;

    /* renamed from: b  reason: collision with root package name */
    static long f56126b = 0;

    /* renamed from: c  reason: collision with root package name */
    static boolean f56127c = false;

    /* renamed from: d  reason: collision with root package name */
    static volatile boolean f56128d = false;

    /* renamed from: e  reason: collision with root package name */
    static final String f56129e = f56129e;

    /* renamed from: f  reason: collision with root package name */
    public static final b f56130f = new b();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    static final class a<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f56131a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HashMap f56132b;

        a(HashMap hashMap) {
            this.f56132b = hashMap;
        }

        /* access modifiers changed from: private */
        @Nullable
        /* renamed from: a */
        public Void call() {
            if (PatchProxy.isSupport(new Object[0], this, f56131a, false, 59787, new Class[0], Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[0], this, f56131a, false, 59787, new Class[0], Void.class);
            }
            try {
                JSONArray jSONArray = new JSONArray();
                for (List<a.C0646a> list : this.f56132b.values()) {
                    if (list != null && !list.isEmpty()) {
                        JSONObject jSONObject = new JSONObject();
                        JSONArray jSONArray2 = new JSONArray();
                        for (a.C0646a aVar : list) {
                            if (aVar != null) {
                                if (aVar.f56120b == 0) {
                                    jSONObject.put("down", aVar.toString());
                                } else if (aVar.f56120b == 2) {
                                    jSONArray2.put(aVar.toString());
                                } else if (aVar.f56120b == 1) {
                                    jSONObject.put("up", aVar.toString());
                                }
                            }
                        }
                        if (jSONArray2.length() > 0) {
                            jSONObject.put("move", jSONArray2);
                        }
                        jSONArray.put(jSONObject);
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("move_info", jSONArray);
                jSONObject2.put("sys_extra_info", "");
                AppLogNewUtils.onEventV3("finger_gesture", jSONObject2);
            } catch (Exception unused) {
            }
            return null;
        }
    }

    private b() {
    }
}
