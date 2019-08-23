package com.ss.android.ugc.aweme.story.shootvideo.brushsticker.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.story.shootvideo.brushsticker.a;

public class StoryBrushView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73417a;

    /* renamed from: b  reason: collision with root package name */
    private float f73418b;

    /* renamed from: c  reason: collision with root package name */
    private float f73419c;

    /* renamed from: d  reason: collision with root package name */
    private a.C0762a f73420d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f73421e;

    public void setStatusBarHeightDelta(boolean z) {
        this.f73421e = z;
    }

    public void setStoryBrushListener(a.C0762a aVar) {
        this.f73420d = aVar;
    }

    public StoryBrushView(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f73417a, false, 85192, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f73417a, false, 85192, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int action = motionEvent.getAction();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (this.f73421e && !fb.a()) {
            i = fc.c(getContext());
        }
        float f2 = y + ((float) i);
        switch (action) {
            case 0:
                this.f73418b = x;
                this.f73419c = f2;
                if (this.f73420d != null) {
                    this.f73420d.a(x, f2);
                    break;
                }
                break;
            case 1:
                if (this.f73420d != null) {
                    this.f73420d.b(x, f2);
                    break;
                }
                break;
            case 2:
                if (this.f73420d != null) {
                    this.f73420d.a(x, f2, x - this.f73418b, f2 - this.f73419c);
                }
                this.f73418b = x;
                this.f73419c = f2;
                break;
        }
        return true;
    }

    public StoryBrushView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
