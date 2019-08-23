package com.ss.android.ugc.aweme.friends.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49459a;

    /* renamed from: b  reason: collision with root package name */
    private final FindFriendsFragment f49460b;

    h(FindFriendsFragment findFriendsFragment) {
        this.f49460b = findFriendsFragment;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f49459a, false, 47165, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f49459a, false, 47165, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        FindFriendsFragment findFriendsFragment = this.f49460b;
        if (i != 3) {
            return false;
        }
        findFriendsFragment.searchUser();
        return true;
    }
}
