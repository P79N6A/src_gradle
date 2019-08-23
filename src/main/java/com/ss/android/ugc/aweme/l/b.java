package com.ss.android.ugc.aweme.l;

import android.util.Pair;
import com.bytedance.frameworks.baselib.network.http.util.UrlUtils;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016J.\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001a\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n\u0018\u00010\tH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/gecko/TtnetImpl;", "Lcom/bytedance/ies/geckoclient/network/INetwork;", "()V", "doGet", "", "url", "doPost", "json", "postParams", "", "Landroid/util/Pair;", "downloadFile", "", "savePath", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements com.bytedance.ies.geckoclient.d.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52928a;

    public final boolean b(@Nullable String str, @Nullable String str2) {
        String str3 = str2;
        if (PatchProxy.isSupport(new Object[]{str, str3}, this, f52928a, false, 47528, new Class[]{String.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, str3}, this, f52928a, false, 47528, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        File file = new File(str3);
        try {
            return RetrofitUtils.downloadFile(-1, str, file.getParent(), null, file.getName(), null, null, null, null, null, null);
        } catch (Exception unused) {
            return false;
        }
    }

    @NotNull
    public final String a(@Nullable String str, @Nullable String str2) {
        byte[] bArr;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f52928a, false, 47525, new Class[]{String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f52928a, false, 47525, new Class[]{String.class, String.class}, String.class);
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> parseUrl = UrlUtils.parseUrl(str3, linkedHashMap);
            if (parseUrl == null) {
                return "";
            }
            String str5 = (String) parseUrl.first;
            String str6 = (String) parseUrl.second;
            if (str4 != null) {
                Charset forName = Charset.forName("UTF-8");
                Intrinsics.checkExpressionValueIsNotNull(forName, "Charset.forName(charsetName)");
                if (str4 != null) {
                    bArr = str4.getBytes(forName);
                    Intrinsics.checkExpressionValueIsNotNull(bArr, "(this as java.lang.String).getBytes(charset)");
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                bArr = null;
            }
            Object body = ((INetworkApi) RetrofitUtils.createSsService(str5, INetworkApi.class)).postBody(-1, str6, linkedHashMap, new TypedByteArray("application/json", bArr, new String[0]), null).execute().body();
            Intrinsics.checkExpressionValueIsNotNull(body, "netWorkApi\n             …                  .body()");
            return (String) body;
        } catch (Exception unused) {
            return "";
        }
    }

    @NotNull
    public final String a(@Nullable String str, @Nullable List<Pair<String, String>> list) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, list}, this, f52928a, false, 47526, new Class[]{String.class, List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, list}, this, f52928a, false, 47526, new Class[]{String.class, List.class}, String.class);
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> parseUrl = UrlUtils.parseUrl(str2, linkedHashMap);
            if (parseUrl == null) {
                return "";
            }
            String str3 = (String) parseUrl.first;
            String str4 = (String) parseUrl.second;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Pair pair : list) {
                Object obj = pair.first;
                Intrinsics.checkExpressionValueIsNotNull(obj, "it.first");
                Object obj2 = pair.second;
                Intrinsics.checkExpressionValueIsNotNull(obj2, "it.second");
                linkedHashMap2.put(obj, obj2);
            }
            Object body = ((INetworkApi) RetrofitUtils.createSsService(str3, INetworkApi.class)).doPost(-1, str4, linkedHashMap, linkedHashMap2, null, null).execute().body();
            Intrinsics.checkExpressionValueIsNotNull(body, "netWorkApi\n             …                  .body()");
            return (String) body;
        } catch (Exception unused) {
            return "";
        }
    }
}
