package com.ss.android.ugc.aweme.widget.flowlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.R$styleable;
import com.ss.android.ugc.aweme.widget.flowlayout.a;
import java.util.HashSet;
import java.util.Set;

public class TagFlowLayout extends FlowLayout implements a.C0803a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f76921e;

    /* renamed from: f  reason: collision with root package name */
    int f76922f;
    Set<Integer> g;
    a h;
    c i;
    b j;
    private a k;

    public interface a {
    }

    public interface b {
    }

    public interface c {
        boolean a(View view, int i, FlowLayout flowLayout);
    }

    public a getAdapter() {
        return this.k;
    }

    public Set<Integer> getSelectedList() {
        if (!PatchProxy.isSupport(new Object[0], this, f76921e, false, 90135, new Class[0], Set.class)) {
            return new HashSet(this.g);
        }
        return (Set) PatchProxy.accessDispatch(new Object[0], this, f76921e, false, 90135, new Class[0], Set.class);
    }

    public Parcelable onSaveInstanceState() {
        if (PatchProxy.isSupport(new Object[0], this, f76921e, false, 90139, new Class[0], Parcelable.class)) {
            return (Parcelable) PatchProxy.accessDispatch(new Object[0], this, f76921e, false, 90139, new Class[0], Parcelable.class);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_default", super.onSaveInstanceState());
        StringBuilder sb = new StringBuilder();
        if (this.g.size() > 0) {
            for (Integer intValue : this.g) {
                sb.append(intValue.intValue());
                sb.append("|");
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        bundle.putString("key_choose_pos", sb.toString());
        return bundle;
    }

    public void setOnSelectListener(a aVar) {
        this.h = aVar;
    }

    public void setOnSelectStateChangeListener(b bVar) {
        this.j = bVar;
    }

    public void setOnTagClickListener(c cVar) {
        this.i = cVar;
    }

    public TagFlowLayout(Context context) {
        this(context, null);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (PatchProxy.isSupport(new Object[]{parcelable}, this, f76921e, false, 90140, new Class[]{Parcelable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcelable}, this, f76921e, false, 90140, new Class[]{Parcelable.class}, Void.TYPE);
        } else if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            String string = bundle.getString("key_choose_pos");
            if (!TextUtils.isEmpty(string)) {
                for (String parseInt : string.split("\\|")) {
                    int parseInt2 = Integer.parseInt(parseInt);
                    this.g.add(Integer.valueOf(parseInt2));
                    c cVar = (c) getChildAt(parseInt2);
                    if (cVar != null) {
                        a(parseInt2, cVar);
                    }
                }
            }
            super.onRestoreInstanceState(bundle.getParcelable("key_default"));
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    public void setMaxSelectCount(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f76921e, false, 90134, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f76921e, false, 90134, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.g.size() > i2) {
            this.g.clear();
        }
        this.f76922f = i2;
    }

    public void setAdapter(a aVar) {
        int i2;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f76921e, false, 90132, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f76921e, false, 90132, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.k = aVar2;
        this.k.g = this;
        this.g.clear();
        if (PatchProxy.isSupport(new Object[0], this, f76921e, false, 90133, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76921e, false, 90133, new Class[0], Void.TYPE);
            return;
        }
        removeAllViews();
        a aVar3 = this.k;
        HashSet<Integer> hashSet = this.k.h;
        int i3 = 0;
        while (true) {
            if (PatchProxy.isSupport(new Object[0], aVar3, a.f76923d, false, 90126, new Class[0], Integer.TYPE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], aVar3, a.f76923d, false, 90126, new Class[0], Integer.TYPE)).intValue();
            } else if (aVar3.f76924e == null) {
                i2 = 0;
            } else {
                i2 = aVar3.f76924e.size();
            }
            if (i3 < i2) {
                View a2 = aVar3.a(this, i3, aVar3.a(i3));
                c cVar = new c(getContext());
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3), cVar}, aVar3, a.f76923d, false, 90130, new Class[]{Integer.TYPE, c.class}, Void.TYPE)) {
                    a aVar4 = aVar3;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3), cVar}, aVar4, a.f76923d, false, 90130, new Class[]{Integer.TYPE, c.class}, Void.TYPE);
                } else {
                    aVar3.f76925f.append(i3, cVar);
                }
                cVar.setAllowSelect(true);
                a2.setDuplicateParentStateEnabled(true);
                if (a2.getLayoutParams() != null) {
                    cVar.setLayoutParams(a2.getLayoutParams());
                } else {
                    cVar.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                }
                a2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                cVar.addView(a2);
                addView(cVar);
                if (hashSet.contains(Integer.valueOf(i3))) {
                    a(i3, cVar);
                }
                aVar3.a(i3);
                a2.setClickable(false);
                cVar.setOnClickListener(new b(this, cVar, i3));
                i3++;
            } else {
                this.g.addAll(hashSet);
                return;
            }
        }
    }

    public TagFlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), cVar2}, this, f76921e, false, 90136, new Class[]{Integer.TYPE, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), cVar2}, this, f76921e, false, 90136, new Class[]{Integer.TYPE, c.class}, Void.TYPE);
            return;
        }
        cVar2.setChecked(true);
        cVar.getTagView();
    }

    /* access modifiers changed from: package-private */
    public void b(int i2, c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), cVar2}, this, f76921e, false, 90137, new Class[]{Integer.TYPE, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), cVar2}, this, f76921e, false, 90137, new Class[]{Integer.TYPE, c.class}, Void.TYPE);
            return;
        }
        cVar2.setChecked(false);
        cVar.getTagView();
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f76921e, false, 90131, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f76921e, false, 90131, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            c cVar = (c) getChildAt(i4);
            if (cVar.getVisibility() != 8 && cVar.getTagView().getVisibility() == 8) {
                cVar.setVisibility(8);
            }
        }
        super.onMeasure(i2, i3);
    }

    public TagFlowLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f76922f = -1;
        this.g = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TagFlowLayout);
        this.f76922f = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }
}
