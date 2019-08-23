package com.ss.android.ugc.aweme.main.story.live.view;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.story.live.view.a;

public abstract class AbsLiveStoryItemView extends ConstraintLayout implements View.OnClickListener, a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f54986b;

    /* renamed from: a  reason: collision with root package name */
    private View f54987a;

    /* renamed from: c  reason: collision with root package name */
    protected String f54988c;

    /* renamed from: d  reason: collision with root package name */
    public String f54989d = "toplist_homepage_hot";
    @Keep
    protected a.C0633a mListener;

    public abstract View a(Context context, boolean z);

    public View getRootView() {
        return this.f54987a;
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f54986b, false, 58300, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54986b, false, 58300, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        if (this.mListener != null) {
            this.mListener.a();
        }
    }

    public void setListener(a.C0633a aVar) {
        this.mListener = aVar;
    }

    public void setRequestId(String str) {
        this.f54988c = str;
    }

    public AbsLiveStoryItemView(Context context, boolean z) {
        super(context);
        this.f54987a = a(context, z);
        setOnClickListener(this);
        setVisibility(8);
    }

    public void onVisibilityChanged(@NonNull View view, int i) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f54986b, false, 58299, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f54986b, false, 58299, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onVisibilityChanged(view, i);
        if (this.mListener != null) {
            this.mListener.a(i);
        }
    }
}
