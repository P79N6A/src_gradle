package com.ss.android.ugc.aweme.discover.mob;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.adapter.s;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J&\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/mob/AladdinCardClick;", "", "()V", "clickStar", "", "cardPosition", "", "userId", "view", "Landroid/view/View;", "mobClick", "cardType", "tagId", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42646a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f42647b = new a();

    private a() {
    }

    @JvmStatic
    public static final void a(@NotNull String str, @Nullable String str2, @NotNull View view) {
        String str3;
        String str4 = str;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{str4, str2, view2}, null, f42646a, true, 36952, new Class[]{String.class, String.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str2, view2}, null, f42646a, true, 36952, new Class[]{String.class, String.class, View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str4, "cardPosition");
        Intrinsics.checkParameterIsNotNull(view2, "view");
        s a2 = h.f42664a.a(view2);
        d a3 = d.a().a("aladdin_card_type", AllStoryActivity.f73306b).a("card_position", str4).a("search_keyword", a2.a());
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        r.a("aladdin_card_click", (Map) a3.a("to_user_id", str3).a("log_pb", a2.b()).f34114b);
    }

    public final void a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull View view) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6, view2}, this, f42646a, false, 36951, new Class[]{String.class, String.class, String.class, View.class}, Void.TYPE)) {
            Object[] objArr = {str4, str5, str6, view2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f42646a, false, 36951, new Class[]{String.class, String.class, String.class, View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str4, "cardType");
        Intrinsics.checkParameterIsNotNull(str5, "cardPosition");
        Intrinsics.checkParameterIsNotNull(str6, "tagId");
        Intrinsics.checkParameterIsNotNull(view2, "view");
        s a2 = h.f42664a.a(view2);
        r.a("aladdin_card_click", (Map) d.a().a("aladdin_card_type", str4).a("card_position", str5).a("search_keyword", a2.a()).a("tag_id", str6).a("log_pb", a2.b()).f34114b);
    }
}
