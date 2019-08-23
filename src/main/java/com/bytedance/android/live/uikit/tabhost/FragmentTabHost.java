package com.bytedance.android.live.uikit.tabhost;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;

public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8683a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f8684b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<c> f8685c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private FrameLayout f8686d;

    /* renamed from: e  reason: collision with root package name */
    private Context f8687e;

    /* renamed from: f  reason: collision with root package name */
    private FragmentManager f8688f;
    private int g;
    private TabHost.OnTabChangeListener h;
    private c i;
    private boolean j;
    private a k;
    private boolean l = false;
    private boolean m = false;

    public interface a {
    }

    static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8691a;

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new b[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f8691a, false, 2382, new Class[]{Parcel.class}, b.class)) {
                    return new b(parcel2, (byte) 0);
                }
                return (b) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f8691a, false, 2382, new Class[]{Parcel.class}, b.class);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8689a;

        /* renamed from: b  reason: collision with root package name */
        String f8690b;

        public String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f8689a, false, 2381, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f8689a, false, 2381, new Class[0], String.class);
            }
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f8690b + "}";
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }

        private b(Parcel parcel) {
            super(parcel);
            this.f8690b = parcel.readString();
        }

        /* synthetic */ b(Parcel parcel, byte b2) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2, Integer.valueOf(i)}, this, f8689a, false, 2380, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel2, Integer.valueOf(i)}, this, f8689a, false, 2380, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.writeToParcel(parcel, i);
            parcel2.writeString(this.f8690b);
        }
    }

    static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f8692a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<?> f8693b;

        /* renamed from: c  reason: collision with root package name */
        public final Bundle f8694c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f8695d;
    }

    public boolean getDispatchWindowFocusChangedToAllTab() {
        return this.f8684b;
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    public Fragment getCurrentFragment() {
        if (this.i != null) {
            return this.i.f8695d;
        }
        return null;
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f8683a, false, 2374, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8683a, false, 2374, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.j = false;
    }

    public Parcelable onSaveInstanceState() {
        if (PatchProxy.isSupport(new Object[0], this, f8683a, false, 2375, new Class[0], Parcelable.class)) {
            return (Parcelable) PatchProxy.accessDispatch(new Object[0], this, f8683a, false, 2375, new Class[0], Parcelable.class);
        }
        b bVar = new b(super.onSaveInstanceState());
        bVar.f8690b = getCurrentTabTag();
        return bVar;
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f8683a, false, 2373, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8683a, false, 2373, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        FragmentTransaction fragmentTransaction = null;
        for (int i2 = 0; i2 < this.f8685c.size(); i2++) {
            c cVar = this.f8685c.get(i2);
            cVar.f8695d = this.f8688f.findFragmentByTag(cVar.f8692a);
            if (cVar.f8695d != null && !cVar.f8695d.isDetached()) {
                if (cVar.f8692a.equals(currentTabTag)) {
                    this.i = cVar;
                } else {
                    if (fragmentTransaction == null) {
                        fragmentTransaction = this.f8688f.beginTransaction();
                    }
                    fragmentTransaction.detach(cVar.f8695d);
                }
            }
        }
        this.j = true;
        FragmentTransaction a2 = a(currentTabTag, fragmentTransaction);
        if (a2 != null) {
            a2.commitAllowingStateLoss();
            this.f8688f.executePendingTransactions();
        }
    }

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f8683a, false, 2365, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8683a, false, 2365, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        Context context = getContext();
        if (context != null && findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f8686d = frameLayout2;
            this.f8686d.setId(this.g);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    public void setDispatchWindowFocusChangedToAllTab(boolean z) {
        this.f8684b = z;
    }

    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.h = onTabChangeListener;
    }

    public void setOnTabSwitchListener(a aVar) {
        this.k = aVar;
    }

    public void setHideWhenTabChanged(boolean z) {
        if (!this.m) {
            this.l = z;
        }
    }

    public FragmentTabHost(Context context) {
        super(context, null);
        a(context, (AttributeSet) null);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (PatchProxy.isSupport(new Object[]{parcelable}, this, f8683a, false, 2376, new Class[]{Parcelable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcelable}, this, f8683a, false, 2376, new Class[]{Parcelable.class}, Void.TYPE);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCurrentTabByTag(bVar.f8690b);
    }

    public void setSuperOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        if (PatchProxy.isSupport(new Object[]{onTabChangeListener}, this, f8683a, false, 2370, new Class[]{TabHost.OnTabChangeListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onTabChangeListener}, this, f8683a, false, 2370, new Class[]{TabHost.OnTabChangeListener.class}, Void.TYPE);
            return;
        }
        super.setOnTabChangedListener(onTabChangeListener);
    }

    public void dispatchWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f8683a, false, 2366, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f8683a, false, 2366, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f8684b) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).dispatchWindowFocusChanged(z);
            }
        } else {
            super.dispatchWindowFocusChanged(z);
        }
    }

    public void onTabChanged(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f8683a, false, 2377, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f8683a, false, 2377, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.j) {
            FragmentTransaction a2 = a(str, (FragmentTransaction) null);
            if (a2 != null) {
                a2.commitAllowingStateLoss();
            }
        }
        if (this.h != null) {
            this.h.onTabChanged(str);
        }
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (PatchProxy.isSupport(new Object[]{context, attributeSet}, this, f8683a, false, 2364, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, attributeSet}, this, f8683a, false, 2364, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.g = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    private FragmentTransaction a(String str, FragmentTransaction fragmentTransaction) {
        FragmentTransaction fragmentTransaction2;
        if (PatchProxy.isSupport(new Object[]{str, fragmentTransaction}, this, f8683a, false, 2378, new Class[]{String.class, FragmentTransaction.class}, FragmentTransaction.class)) {
            return (FragmentTransaction) PatchProxy.accessDispatch(new Object[]{str, fragmentTransaction}, this, f8683a, false, 2378, new Class[]{String.class, FragmentTransaction.class}, FragmentTransaction.class);
        }
        this.m = true;
        c cVar = null;
        for (int i2 = 0; i2 < this.f8685c.size(); i2++) {
            c cVar2 = this.f8685c.get(i2);
            if (cVar2.f8692a.equals(str)) {
                cVar = cVar2;
            }
        }
        if (cVar == null) {
            return null;
        }
        if (this.i != cVar) {
            if (fragmentTransaction == null) {
                fragmentTransaction2 = this.f8688f.beginTransaction();
            } else {
                fragmentTransaction2 = fragmentTransaction;
            }
            if (!(this.i == null || this.i.f8695d == null)) {
                if (this.l) {
                    fragmentTransaction2.hide(this.i.f8695d);
                } else {
                    fragmentTransaction2.detach(this.i.f8695d);
                }
            }
            if (cVar != null) {
                if (cVar.f8695d == null) {
                    cVar.f8695d = Fragment.instantiate(this.f8687e, cVar.f8693b.getName(), cVar.f8694c);
                    fragmentTransaction2.add(this.g, cVar.f8695d, cVar.f8692a);
                } else if (this.l) {
                    if (cVar.f8695d.isDetached()) {
                        fragmentTransaction2.attach(cVar.f8695d);
                    }
                    if (cVar.f8695d.isHidden()) {
                        fragmentTransaction2.show(cVar.f8695d);
                    }
                } else {
                    fragmentTransaction2.attach(cVar.f8695d);
                }
            }
            this.i = cVar;
        } else {
            fragmentTransaction2 = fragmentTransaction;
        }
        return fragmentTransaction2;
    }
}
