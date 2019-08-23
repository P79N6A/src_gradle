package com.ss.android.ugc.aweme.share.invitefriends;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.share.c.g;
import com.ss.android.ugc.aweme.share.c.h;
import com.ss.android.ugc.aweme.share.c.i;
import com.ss.android.ugc.aweme.share.invitefriends.imagecode.InviteFriendWithImageTokenDialog;
import com.ss.android.ugc.aweme.share.invitefriends.textcode.InviteFriendsWithTextTokenDialog;
import com.ss.android.ugc.aweme.share.invitefriends.textcode.d;
import com.ss.android.ugc.aweme.u.ae;
import java.io.File;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65052a;

    public static void a(Activity activity, String str) {
        Activity activity2 = activity;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, str2}, null, f65052a, true, 73500, new Class[]{Activity.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, str2}, null, f65052a, true, 73500, new Class[]{Activity.class, String.class}, Void.TYPE);
            return;
        }
        if (AbTestManager.a().be().intValue() == 0) {
            if (PatchProxy.isSupport(new Object[]{activity2, str2}, null, f65052a, true, 73501, new Class[]{Activity.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2, str2}, null, f65052a, true, 73501, new Class[]{Activity.class, String.class}, Void.TYPE);
            } else {
                new com.ss.android.ugc.aweme.share.invitefriends.imagecode.b(activity2, str2).show();
            }
        } else {
            b(activity, str);
        }
    }

    public static void b(Activity activity, String str) {
        Activity activity2 = activity;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, str2}, null, f65052a, true, 73502, new Class[]{Activity.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, str2}, null, f65052a, true, 73502, new Class[]{Activity.class, String.class}, Void.TYPE);
            return;
        }
        new d(activity2, str2).show();
    }

    public static void a(int i, Activity activity, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), activity, str}, null, f65052a, true, 73497, new Class[]{Integer.TYPE, Activity.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), activity, str}, null, f65052a, true, 73497, new Class[]{Integer.TYPE, Activity.class, String.class}, Void.TYPE);
        } else if (AbTestManager.a().be().intValue() == 0) {
            c(i, activity, str);
        } else {
            b(i, activity, str);
        }
    }

    public static void b(int i, Activity activity, String str) {
        Activity activity2 = activity;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), activity2, str2}, null, f65052a, true, 73499, new Class[]{Integer.TYPE, Activity.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), activity2, str2}, null, f65052a, true, 73499, new Class[]{Integer.TYPE, Activity.class, String.class}, Void.TYPE);
            return;
        }
        InviteFriendsWithTextTokenDialog.a aVar = new InviteFriendsWithTextTokenDialog.a();
        aVar.f65179b = g.b(i);
        aVar.f65178a = i;
        aVar.f65180c = str2;
        new InviteFriendsWithTextTokenDialog(activity2, aVar).show();
    }

    private static void c(int i, Activity activity, String str) {
        final int i2 = i;
        final Activity activity2 = activity;
        final String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), activity2, str2}, null, f65052a, true, 73498, new Class[]{Integer.TYPE, Activity.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), activity2, str2}, null, f65052a, true, 73498, new Class[]{Integer.TYPE, Activity.class, String.class}, Void.TYPE);
            return;
        }
        final InviteFriendWithImageTokenDialog inviteFriendWithImageTokenDialog = new InviteFriendWithImageTokenDialog(activity2, i2, g.b(i), str2);
        inviteFriendWithImageTokenDialog.g = new InviteFriendWithImageTokenDialog.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65053a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f65053a, false, 73504, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f65053a, false, 73504, new Class[0], Void.TYPE);
                    return;
                }
                inviteFriendWithImageTokenDialog.dismiss();
                b.b(i2, activity2, str2);
            }

            public final void a(final File file) {
                if (PatchProxy.isSupport(new Object[]{file}, this, f65053a, false, 73503, new Class[]{File.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{file}, this, f65053a, false, 73503, new Class[]{File.class}, Void.TYPE);
                    return;
                }
                inviteFriendWithImageTokenDialog.dismiss();
                new ae().a(str2).b(i.a(i2)).c("shaped").e();
                new a.C0185a(activity2).b((int) C0906R.string.clh).a(activity2.getString(C0906R.string.b2u, new Object[]{g.b(i2)}), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f65058a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f65058a, false, 73505, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f65058a, false, 73505, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        new h(activity2).a(i2).b().b(file.getAbsolutePath()).c().a();
                    }
                }).a().b();
            }
        };
        inviteFriendWithImageTokenDialog.show();
    }
}
