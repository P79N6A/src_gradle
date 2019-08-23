package com.ss.android.ugc.aweme.detail.d;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.video.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J4\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u0012J<\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004J\u0010\u0010\u0014\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/detail/jumper/DetailUtils;", "", "()V", "is2ColumnsOrNearby", "", "from", "", "isNeedScrollAnchorToCurrentAweme", "isTwoColumnsFollow", "isTwoColumnsRecommend", "scrollAnchorToCurrentAweme", "", "originalAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "videoType", "", "eventType", "playStartTime", "", "needScroll", "supportContinuePlay", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41171a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f41172b = new a();

    private a() {
    }

    private final boolean d(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f41171a, false, 34741, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f41171a, false, 34741, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        if (a2.v() == 0 || !TextUtils.equals("from_hot", str)) {
            return false;
        }
        return true;
    }

    private final boolean e(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f41171a, false, 34742, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f41171a, false, 34742, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        Integer G = a2.G();
        if (G != null && 2 == G.intValue() && TextUtils.equals(str, "from_follow_tab")) {
            return true;
        }
        return false;
    }

    public final boolean a(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f41171a, false, 34740, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f41171a, false, 34740, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        if (!d(str) && !e(str)) {
            CharSequence charSequence = str;
            if (TextUtils.equals("from_nearby", charSequence) || TextUtils.equals("from_search", charSequence) || TextUtils.equals("from_search_similar_aweme", charSequence) || b(str)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean b(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f41171a, false, 34743, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f41171a, false, 34743, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        CharSequence charSequence = str;
        if (TextUtils.equals("from_follow_page", charSequence) || TextUtils.equals("from_user_state_tab", charSequence) || TextUtils.equals("from_search_mix", charSequence) || TextUtils.equals("from_poi_detail", charSequence)) {
            return true;
        }
        return false;
    }

    private final boolean c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f41171a, false, 34739, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f41171a, false, 34739, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        if (!a(str)) {
            CharSequence charSequence = str;
            if (TextUtils.equals("from_poi_categorized", charSequence) || TextUtils.equals(com.ss.android.ugc.aweme.discover.jedi.a.f42507a, charSequence) || TextUtils.equals("from_no_request", charSequence) || TextUtils.equals("from_commerce_seed", charSequence) || TextUtils.equals("from_commerce_bill_share", charSequence) || TextUtils.equals("from_profile_self", charSequence) || TextUtils.equals("from_profile_other", charSequence)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void a(@Nullable Aweme aweme, @Nullable String str, int i, @Nullable String str2, long j, boolean z) {
        Aweme aweme2 = aweme;
        String str3 = str;
        String str4 = str2;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{aweme2, str3, Integer.valueOf(i), str4, new Long(j2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41171a, false, 34738, new Class[]{Aweme.class, String.class, Integer.TYPE, String.class, Long.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str3, Integer.valueOf(i), str4, new Long(j2), Byte.valueOf(z)}, this, f41171a, false, 34738, new Class[]{Aweme.class, String.class, Integer.TYPE, String.class, Long.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (aweme2 != null && c(str3)) {
            ar arVar = new ar(21, aweme2);
            arVar.f45295e = str3;
            arVar.h = i;
            arVar.k = z;
            if (b(str3)) {
                o b2 = o.b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "PlayerManager.inst()");
                arVar.i = b2.c();
                o b3 = o.b();
                Intrinsics.checkExpressionValueIsNotNull(b3, "PlayerManager.inst()");
                arVar.j = b3.a();
                arVar.f45296f = str4;
                arVar.g = j2;
            }
            bg.a(arVar);
        }
    }
}
