package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.common.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.property.e;
import java.util.ArrayList;
import java.util.Iterator;

public class PermissionSettingItem extends w implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70527a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<View.OnClickListener> f70528b;

    /* renamed from: c  reason: collision with root package name */
    private int f70529c;

    public int getPermission() {
        return this.f70529c;
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f70527a, false, 80269, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70527a, false, 80269, new Class[0], Void.TYPE);
        } else if (!a.a() || com.ss.android.ugc.aweme.port.in.a.x.e() == null || !com.ss.android.ugc.aweme.port.in.a.x.e().d()) {
            setSubtitle((int) C0906R.string.bsw);
        } else {
            setSubtitle((int) C0906R.string.bsx);
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f70527a, false, 80273, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f70527a, false, 80273, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (!CollectionUtils.isEmpty(this.f70528b)) {
            Iterator<View.OnClickListener> it2 = this.f70528b.iterator();
            while (it2.hasNext()) {
                it2.next().onClick(view);
            }
        }
    }

    public final void a(@Nullable View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f70527a, false, 80271, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f70527a, false, 80271, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        if (this.f70528b == null) {
            this.f70528b = new ArrayList<>();
        }
        this.f70528b.add(onClickListener);
    }

    public void setPermission(int i) {
        Drawable drawable;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70527a, false, 80268, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70527a, false, 80268, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f70529c = i2;
        if (i2 == 0) {
            a();
            Drawable drawable2 = ContextCompat.getDrawable(getContext(), 2130839238);
            ColorStateList valueOf = ColorStateList.valueOf(ContextCompat.getColor(getContext(), C0906R.color.a08));
            if (PatchProxy.isSupport(new Object[]{drawable2, valueOf}, null, w.f4038d, true, 80320, new Class[]{Drawable.class, ColorStateList.class}, Drawable.class)) {
                drawable = (Drawable) PatchProxy.accessDispatch(new Object[]{drawable2, valueOf}, null, w.f4038d, true, 80320, new Class[]{Drawable.class, ColorStateList.class}, Drawable.class);
            } else {
                drawable = DrawableCompat.wrap(drawable2);
                DrawableCompat.setTintList(drawable, valueOf);
            }
            setDrawableLeft(drawable);
        } else if (i2 == 1) {
            setSubtitle((int) C0906R.string.brc);
            setDrawableLeft(2130839239);
        } else {
            setSubtitle((int) C0906R.string.ai3);
            setDrawableLeft(2130839182);
        }
    }

    public PermissionSettingItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setDrawableLeft(ContextCompat.getDrawable(context, 2130839238));
        setTitle((int) C0906R.string.brg);
        a();
        this.g.setBackground(c.e(context));
        if (!com.ss.android.ugc.aweme.port.in.a.L.a(e.a.PrivateAvailable)) {
            setVisibility(8);
        }
        setOnClickListener(this);
    }
}
