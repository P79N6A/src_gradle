package com.ss.android.ugc.aweme.story.feed.view.ui.comment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class KeyboardAwareEditText extends DmtEditText {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72848a;

    /* renamed from: b  reason: collision with root package name */
    private a f72849b;

    public interface a {
        void a();
    }

    public KeyboardAwareEditText(Context context) {
        super(context);
    }

    public void setOnKeyBoardHideListener(a aVar) {
        this.f72849b = aVar;
    }

    public KeyboardAwareEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent}, this, f72848a, false, 84168, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent}, this, f72848a, false, 84168, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (i == 4 && this.f72849b != null) {
            this.f72849b.a();
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public KeyboardAwareEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
