package dmt.av.video;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.property.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"parseSpeedSynthesisSettings", "", "Ldmt/av/video/SpeedSynthesisSetting;", "synthesisSettingsJson", "", "resolveSynthesisSettings", "uploadSpeedProbe", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f83002a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 1, 15})
    public static final class a<T> implements Comparator<T> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f83003a;

        public final int compare(T t, T t2) {
            if (!PatchProxy.isSupport(new Object[]{t, t2}, this, f83003a, false, 91960, new Class[]{Object.class, Object.class}, Integer.TYPE)) {
                return ComparisonsKt.compareValues(Integer.valueOf(((g) t).f82995a), Integer.valueOf(((g) t2).f82995a));
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{t, t2}, this, f83003a, false, 91960, new Class[]{Object.class, Object.class}, Integer.TYPE)).intValue();
        }
    }

    private static final List<g> a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f83002a, true, 91959, new Class[]{String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str2}, null, f83002a, true, 91959, new Class[]{String.class}, List.class);
        }
        List<g> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONArray(str2);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    int optInt = jSONObject.optInt("max_speed");
                    JSONObject optJSONObject = jSONObject.optJSONObject("setting");
                    if (optJSONObject != null) {
                        String jSONObject2 = optJSONObject.toString();
                        Intrinsics.checkExpressionValueIsNotNull(jSONObject2, "settings.toString()");
                        arrayList.add(new g(optInt, jSONObject2));
                    }
                }
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }

    @NotNull
    public static final String a(long j) {
        boolean z;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f83002a, true, 91958, new Class[]{Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f83002a, true, 91958, new Class[]{Long.TYPE}, String.class);
        }
        String e2 = com.ss.android.ugc.aweme.port.in.a.M.e(a.C0682a.VESynthesisSettingsByUploadSpeed);
        if (j2 > 0 && !TextUtils.isEmpty(e2)) {
            Intrinsics.checkExpressionValueIsNotNull(e2, "synthesisSettingsByUploadSpeed");
            Collection arrayList = new ArrayList();
            for (Object next : a(e2)) {
                if (((long) ((g) next).f82995a) > j2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            g gVar = (g) CollectionsKt.firstOrNull(CollectionsKt.sortedWith((List) arrayList, new a()));
            if (gVar != null) {
                return gVar.f82996b;
            }
        }
        String e3 = com.ss.android.ugc.aweme.port.in.a.M.e(a.C0682a.VESynthesisSettings);
        Intrinsics.checkExpressionValueIsNotNull(e3, "AVEnv.AB.getStringProper…erty.VESynthesisSettings)");
        return e3;
    }
}
