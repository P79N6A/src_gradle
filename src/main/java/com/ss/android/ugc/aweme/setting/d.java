package com.ss.android.ugc.aweme.setting;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.feed.am;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63932a = null;

    /* renamed from: b  reason: collision with root package name */
    public static int f63933b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static int f63934c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static int f63935d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static int f63936e = 3;

    public static boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f63932a, true, 72041, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f63932a, true, 72041, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (a.a() && ((Boolean) x.a().P().c()).booleanValue()) {
            z = true;
        }
        return z;
    }

    public static final boolean b(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f63932a, true, 72043, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f63932a, true, 72043, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getAuthor() == null) {
            return false;
        } else {
            if (aweme.getAuthor().getCommentSetting() == f63936e || aweme.getCommentSetting() == f63936e) {
                return true;
            }
            return false;
        }
    }

    public static boolean a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f63932a, true, 72042, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f63932a, true, 72042, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getAuthor() == null) {
            return true;
        } else {
            User author = aweme.getAuthor();
            int commentSetting = author.getCommentSetting();
            if (author.isMe()) {
                if (commentSetting == f63936e || aweme.getCommentSetting() == f63936e) {
                    return false;
                }
                return true;
            } else if (commentSetting == f63933b) {
                return true;
            } else {
                if (commentSetting == f63934c && am.c(aweme)) {
                    return true;
                }
                if (commentSetting != f63935d || !am.d(aweme)) {
                    return false;
                }
                return true;
            }
        }
    }

    public static void a(Context context, int i, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), str2}, null, f63932a, true, 72044, new Class[]{Context.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), str2}, null, f63932a, true, 72044, new Class[]{Context.class, Integer.TYPE, String.class}, Void.TYPE);
        } else if (context2 != null) {
            a.C0185a aVar = new a.C0185a(context2);
            aVar.a(i);
            aVar.b(str2);
            aVar.a((int) C0906R.string.p0, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            aVar.a().a().setCancelable(false);
        }
    }
}
