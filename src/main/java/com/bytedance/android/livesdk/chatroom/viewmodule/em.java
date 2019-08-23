package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.viewmodule.TextMessageWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class em implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13228a;

    /* renamed from: b  reason: collision with root package name */
    private final TextMessageWidget f13229b;

    em(TextMessageWidget textMessageWidget) {
        this.f13229b = textMessageWidget;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f13228a, false, 7497, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f13228a, false, 7497, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        TextMessageWidget textMessageWidget = this.f13229b;
        if (motionEvent.getAction() == 1) {
            if (!textMessageWidget.f12801b.canScrollVertically(1)) {
                textMessageWidget.a(TextMessageWidget.a.NORMAL);
            } else {
                textMessageWidget.a(TextMessageWidget.a.FOCUS);
                int findLastVisibleItemPosition = textMessageWidget.f12802c.findLastVisibleItemPosition();
                if (findLastVisibleItemPosition > textMessageWidget.f12805f) {
                    textMessageWidget.b(textMessageWidget.f12804e - (findLastVisibleItemPosition - textMessageWidget.f12805f));
                    textMessageWidget.f12805f = findLastVisibleItemPosition;
                }
            }
        }
        return false;
    }
}
