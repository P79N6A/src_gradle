package com.ss.android.ugc.aweme.utils.permission;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.annotation.StringRes;
import android.support.v7.app.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.friends.ui.ContactsActivity;
import com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity;
import com.ss.android.ugc.aweme.utils.bi;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75931a;

    public interface a {
    }

    public static void a(@StringRes int i, @StringRes int i2, Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.string.bi3), Integer.valueOf(C0906R.string.bi2), activity2}, null, f75931a, true, 88776, new Class[]{Integer.TYPE, Integer.TYPE, Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.string.bi3), Integer.valueOf(C0906R.string.bi2), activity2}, null, f75931a, true, 88776, new Class[]{Integer.TYPE, Integer.TYPE, Activity.class}, Void.TYPE);
            return;
        }
        a(C0906R.string.bi3, C0906R.string.bi2, activity2, null);
    }

    private static void a(@StringRes int i, @StringRes int i2, Activity activity, a aVar) {
        final Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), activity2, null}, null, f75931a, true, 88777, new Class[]{Integer.TYPE, Integer.TYPE, Activity.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), activity2, null}, null, f75931a, true, 88777, new Class[]{Integer.TYPE, Integer.TYPE, Activity.class, a.class}, Void.TYPE);
            return;
        }
        AlertDialog create = new AlertDialog.Builder(activity2, C0906R.style.kx).setTitle(i).setMessage(i2).setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75935a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f75935a, false, 88779, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f75935a, false, 88779, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if ((activity2 instanceof ContactsActivity) || (activity2 instanceof InviteFriendsActivity)) {
                    activity2.finish();
                }
            }
        }).setPositiveButton((int) C0906R.string.a0v, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(null) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75932a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f75932a, false, 88778, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f75932a, false, 88778, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                bi.a(activity2);
            }
        }).create();
        try {
            create.setCancelable(false);
            create.setCanceledOnTouchOutside(false);
            create.show();
        } catch (Exception unused) {
        }
    }
}
