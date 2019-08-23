package com.ss.android.ugc.aweme.b.a;

import com.bytedance.retrofit2.client.Header;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J/\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\b\u0010\u001c\u001a\u00020\u0003H\u0016R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/alog/api/ApiLogModel;", "", "url", "", "response", "header", "", "Lcom/bytedance/retrofit2/client/Header;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getHeader", "()Ljava/util/List;", "setHeader", "(Ljava/util/List;)V", "getResponse", "()Ljava/lang/String;", "setResponse", "(Ljava/lang/String;)V", "getUrl", "setUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34463a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public String f34464b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public String f34465c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public List<Header> f34466d;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f34463a, false, 21578, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f34463a, false, 21578, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!Intrinsics.areEqual((Object) this.f34464b, (Object) bVar.f34464b) || !Intrinsics.areEqual((Object) this.f34465c, (Object) bVar.f34465c) || !Intrinsics.areEqual((Object) this.f34466d, (Object) bVar.f34466d)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f34463a, false, 21577, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f34463a, false, 21577, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.f34464b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f34465c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<Header> list = this.f34466d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f34463a, false, 21573, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f34463a, false, 21573, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder("URL:         ");
        sb.append(this.f34464b);
        sb.append("\r\n\r\nHEADERS:          ");
        List<Header> list = this.f34466d;
        if (list != null) {
            str = list.toString();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append("\r\n\r\nRESPONSE:         ");
        sb.append(this.f34465c);
        sb.append("\r\n\r\n");
        return sb.toString();
    }
}
