package com.ss.android.ugc.aweme.effectplatform;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform;
import com.ss.android.ugc.aweme.port.internal.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bj\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u0001`\nJ&\u0010\u000b\u001a\u00020\f2\u001e\u0010\r\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bj\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u0001`\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/effectplatform/EffectPlatformFileHelper;", "", "()V", "keva", "Lcom/bytedance/keva/Keva;", "getKeva", "()Lcom/bytedance/keva/Keva;", "getUlikeBeautyDataList", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/effectplatform/UlikeBeautyPlatform$UlikeBeautyData;", "Lkotlin/collections/ArrayList;", "saveUlikeBeautyDataList", "", "dataList", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43809a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f43810c = new a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final Keva f43811b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/effectplatform/EffectPlatformFileHelper$Companion;", "", "()V", "KEVA_ULIKE_KEY", "", "KEVA_ULIKE_REPO", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/effectplatform/EffectPlatformFileHelper$getUlikeBeautyDataList$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/ss/android/ugc/aweme/effectplatform/UlikeBeautyPlatform$UlikeBeautyData;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends TypeToken<List<? extends UlikeBeautyPlatform.UlikeBeautyData>> {
        b() {
        }
    }

    public c() {
        Keva repo = Keva.getRepo("ulike_repo");
        Intrinsics.checkExpressionValueIsNotNull(repo, "Keva.getRepo(KEVA_ULIKE_REPO)");
        this.f43811b = repo;
    }

    @Nullable
    public final ArrayList<UlikeBeautyPlatform.UlikeBeautyData> a() {
        if (PatchProxy.isSupport(new Object[0], this, f43809a, false, 38942, new Class[0], ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[0], this, f43809a, false, 38942, new Class[0], ArrayList.class);
        }
        String string = this.f43811b.getString("ulike_download_config", "");
        if (TextUtils.isEmpty(string)) {
            m mVar = (m) com.ss.android.ugc.aweme.common.g.a.a(com.ss.android.ugc.aweme.port.in.a.f61119b, m.class);
            String b2 = mVar.b("");
            if (!TextUtils.isEmpty(b2)) {
                mVar.c("");
                this.f43811b.storeString("ulike_download_config", b2);
                string = b2;
            }
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return (ArrayList) com.ss.android.ugc.aweme.port.in.a.f61120c.fromJson(string, new b().getType());
    }
}
