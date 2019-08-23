package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.bytedance.android.live.core.widget.LiveEditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ActionEditText extends LiveEditText {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f18171d;

    public ActionEditText(Context context) {
        super(context);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        EditorInfo editorInfo2 = editorInfo;
        if (PatchProxy.isSupport(new Object[]{editorInfo2}, this, f18171d, false, 14262, new Class[]{EditorInfo.class}, InputConnection.class)) {
            return (InputConnection) PatchProxy.accessDispatch(new Object[]{editorInfo2}, this, f18171d, false, 14262, new Class[]{EditorInfo.class}, InputConnection.class);
        }
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        editorInfo2.imeOptions &= -1073741825;
        return onCreateInputConnection;
    }

    public ActionEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ActionEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
