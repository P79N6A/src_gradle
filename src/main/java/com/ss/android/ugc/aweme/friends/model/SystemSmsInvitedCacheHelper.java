package com.ss.android.ugc.aweme.friends.model;

import android.os.Build;
import android.util.ArraySet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashSet;
import java.util.Set;

public class SystemSmsInvitedCacheHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Set<Object> invitedContacts;

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            invitedContacts = new ArraySet();
        } else {
            invitedContacts = new HashSet();
        }
    }

    public static void clear() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 46654, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 46654, new Class[0], Void.TYPE);
        } else {
            invitedContacts.clear();
        }
    }

    public static void addInvitedContact(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 46653, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 46653, new Class[]{String.class}, Void.TYPE);
            return;
        }
        invitedContacts.add(str2);
    }

    public static boolean contains(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 46652, new Class[]{String.class}, Boolean.TYPE)) {
            return invitedContacts.contains(str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 46652, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }
}
