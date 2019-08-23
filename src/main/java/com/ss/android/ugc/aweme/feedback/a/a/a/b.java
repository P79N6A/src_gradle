package com.ss.android.ugc.aweme.feedback.a.a.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feedback.a.a.b;
import com.ss.android.ugc.aweme.runtime.behavior.c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/feedback/runtime/behavior/strategy/DownloadStrategy;", "Lcom/ss/android/ugc/aweme/feedback/runtime/behavior/strategy/AbsBehaviorStrategy;", "()V", "isSupportType", "", "type", "", "loadResult", "uploadKey", "validTime", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47123a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f47124b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/feedback/runtime/behavior/strategy/DownloadStrategy$Companion;", "", "()V", "DOWNLOAD_ERROR", "", "DOWNLOAD_START", "WATER_MARK_ERROR", "WATER_MARK_START", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @NotNull
    public final String a() {
        return "abnor_download";
    }

    public final long b() {
        if (!PatchProxy.isSupport(new Object[0], this, f47123a, false, 43876, new Class[0], Long.TYPE)) {
            return TimeUnit.HOURS.toMillis(2);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f47123a, false, 43876, new Class[0], Long.TYPE)).longValue();
    }

    @NotNull
    public final String c() {
        if (PatchProxy.isSupport(new Object[0], this, f47123a, false, 43877, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f47123a, false, 43877, new Class[0], String.class);
        }
        long currentTimeMillis = System.currentTimeMillis() - b();
        List<c> a2 = b.a.a().a("download_start", currentTimeMillis);
        List<c> a3 = b.a.a().a("download_error", currentTimeMillis);
        List<c> a4 = b.a.a().a("water_mark_start", currentTimeMillis);
        List<c> a5 = b.a.a().a("water_mark_error", currentTimeMillis);
        StringBuilder sb = new StringBuilder();
        if (!a2.isEmpty()) {
            sb.append("下载次数: " + a2.size() + "次;");
        }
        if (!a3.isEmpty()) {
            sb.append("下载错误: " + a3.size() + "次(ErrorCode:");
            Iterator<c> it2 = a3.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next().f63687e + ',');
            }
            sb.append(");");
        }
        if (!a4.isEmpty()) {
            sb.append("水印次数: " + a4.size() + "次;");
        }
        if (!a5.isEmpty()) {
            sb.append("水印错误: " + a5.size() + "次;");
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "result.toString()");
        return sb2;
    }

    public final boolean a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f47123a, false, 43875, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f47123a, false, 43875, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "type");
        int hashCode = str.hashCode();
        if (hashCode == 974485393 ? !str2.equals("download_error") : hashCode == 987458027 ? !str2.equals("download_start") : hashCode == 1051818558 ? !str2.equals("water_mark_error") : hashCode != 1064791192 || !str2.equals("water_mark_start")) {
            return false;
        }
        return true;
    }
}
