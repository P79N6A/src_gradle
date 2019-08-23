package com.ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.MainThread;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.crossplatform.params.base.CrossPlatformConstants;
import java.util.ArrayList;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40698a;

    /* renamed from: b  reason: collision with root package name */
    View f40699b;

    /* renamed from: c  reason: collision with root package name */
    View f40700c;

    /* renamed from: d  reason: collision with root package name */
    View f40701d;

    /* renamed from: e  reason: collision with root package name */
    List<Integer> f40702e;

    /* renamed from: f  reason: collision with root package name */
    Activity f40703f;
    f g;
    private PopupWindow h;
    private View.OnClickListener i = new i(this);

    /* access modifiers changed from: package-private */
    @MainThread
    public final PopupWindow a() {
        if (PatchProxy.isSupport(new Object[0], this, f40698a, false, 34185, new Class[0], PopupWindow.class)) {
            return (PopupWindow) PatchProxy.accessDispatch(new Object[0], this, f40698a, false, 34185, new Class[0], PopupWindow.class);
        }
        if (this.h == null) {
            View inflate = LayoutInflater.from(this.f40703f).inflate(C0906R.layout.gu, null, false);
            this.f40699b = inflate.findViewById(C0906R.id.cct);
            this.f40700c = inflate.findViewById(C0906R.id.zw);
            this.f40701d = inflate.findViewById(C0906R.id.bv5);
            this.f40699b.setOnClickListener(this.i);
            this.f40700c.setOnClickListener(this.i);
            this.f40701d.setOnClickListener(this.i);
            this.h = new PopupWindow(inflate, -2, -2, true);
            this.h.setTouchable(true);
            this.h.setAnimationStyle(C0906R.style.qn);
            this.h.setBackgroundDrawable(new ColorDrawable(0));
        }
        return this.h;
    }

    h(Activity activity, f fVar) {
        this.f40703f = activity;
        this.g = fVar;
        a();
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, int i2) {
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{str, 4}, this, f40698a, false, 34187, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, 4}, this, f40698a, false, 34187, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str)) {
            int i4 = -1;
            CrossPlatformConstants.a[] values = CrossPlatformConstants.a.values();
            int length = values.length;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                CrossPlatformConstants.a aVar = values[i3];
                if (TextUtils.equals(str, aVar.key)) {
                    i4 = aVar.id;
                    break;
                }
                i3++;
            }
            if (i4 > 0) {
                UIUtils.setViewVisibility(this.f40703f.findViewById(i4), 8);
                if (this.f40702e == null) {
                    this.f40702e = new ArrayList();
                }
                if (!this.f40702e.contains(Integer.valueOf(i4))) {
                    this.f40702e.add(Integer.valueOf(i4));
                }
            }
        }
    }
}
