package com.ss.android.ugc.aweme.im.sdk.detail.adapter;

import android.app.Activity;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.group.GroupMemberSelectActivity;
import com.ss.android.ugc.aweme.im.sdk.relations.RelationSelectActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¨\u0006\u0007"}, d2 = {"startSelectMemberList", "", "type", "", "conversationId", "", "requestCode", "im.base_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51425a;

    public static final void a(int i, String str, int i2) {
        int i3 = i;
        String str2 = str;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2)}, null, f51425a, true, 52048, new Class[]{Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2)}, null, f51425a, true, 52048, new Class[]{Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.core.a b2 = com.ss.android.ugc.aweme.framework.core.a.b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "AppTracker.get()");
        Activity a2 = b2.a();
        if (a2 != null) {
            if (i4 == 220) {
                Bundle bundle = new Bundle();
                bundle.putInt("key_member_list_type", i3);
                bundle.putString("session_id", str2);
                RelationSelectActivity.a(a2, bundle, i4);
                return;
            }
            if (i4 == 221) {
                GroupMemberSelectActivity.f51522b.a(a2, i3, str2, i4);
            }
        }
    }
}
