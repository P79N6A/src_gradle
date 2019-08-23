package com.ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AbstractLoadingLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40312a;

    /* renamed from: b  reason: collision with root package name */
    protected View f40313b;

    /* renamed from: c  reason: collision with root package name */
    protected View f40314c;

    /* renamed from: d  reason: collision with root package name */
    protected View f40315d;

    /* renamed from: e  reason: collision with root package name */
    protected View f40316e;

    /* renamed from: f  reason: collision with root package name */
    protected int f40317f;
    private a g;

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public interface a {
    }

    public static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40320a;

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new b[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f40320a, false, 33566, new Class[]{Parcel.class}, b.class)) {
                    return new b(parcel2);
                }
                return (b) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f40320a, false, 33566, new Class[]{Parcel.class}, b.class);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40318a;

        /* renamed from: b  reason: collision with root package name */
        int f40319b;

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        public b(Parcel parcel) {
            super(parcel);
            this.f40319b = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2, Integer.valueOf(i)}, this, f40318a, false, 33565, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel2, Integer.valueOf(i)}, this, f40318a, false, 33565, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.writeToParcel(parcel, i);
            parcel2.writeInt(this.f40319b);
        }
    }

    @Nullable
    public View a(Context context, AttributeSet attributeSet, int i) {
        return null;
    }

    public void a(int i, int i2) {
    }

    @Nullable
    public View b(Context context, AttributeSet attributeSet, int i) {
        return null;
    }

    @Nullable
    public View c(Context context, AttributeSet attributeSet, int i) {
        return null;
    }

    public Parcelable onSaveInstanceState() {
        if (PatchProxy.isSupport(new Object[0], this, f40312a, false, 33563, new Class[0], Parcelable.class)) {
            return (Parcelable) PatchProxy.accessDispatch(new Object[0], this, f40312a, false, 33563, new Class[0], Parcelable.class);
        }
        b bVar = new b(super.onSaveInstanceState());
        bVar.f40319b = this.f40317f;
        return bVar;
    }

    public final void setListener(a aVar) {
        this.g = aVar;
    }

    public AbstractLoadingLayout(@NonNull Context context) {
        this(context, null);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (PatchProxy.isSupport(new Object[]{parcelable}, this, f40312a, false, 33564, new Class[]{Parcelable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcelable}, this, f40312a, false, 33564, new Class[]{Parcelable.class}, Void.TYPE);
        } else if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            b bVar = (b) parcelable;
            setState(bVar.f40319b);
            super.onRestoreInstanceState(bVar.getSuperState());
        }
    }

    public final void setState(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40312a, false, 33562, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40312a, false, 33562, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i == 0 || i == 1 || i == 3 || i == 2) {
            int i2 = this.f40317f;
            if (i2 != i) {
                this.f40317f = i;
                a(i2, i);
            }
        } else {
            throw new IllegalArgumentException("state must be one of STATE_OK, STATE_LOADING, STATE_EMPTY and STATE_ERROR.");
        }
    }

    public AbstractLoadingLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), layoutParams}, this, f40312a, false, 33559, new Class[]{View.class, Integer.TYPE, ViewGroup.LayoutParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), layoutParams}, this, f40312a, false, 33559, new Class[]{View.class, Integer.TYPE, ViewGroup.LayoutParams.class}, Void.TYPE);
        } else if (view2 == this.f40314c || view2 == this.f40315d || view2 == this.f40316e) {
            super.addView(view, i, layoutParams);
        } else if (getChildCount() <= 4) {
            super.addView(view, i, layoutParams);
            this.f40313b = view2;
        } else {
            throw new IllegalArgumentException("LoadingLayout can only contain one direct custom child.");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractLoadingLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        if (PatchProxy.isSupport(new Object[]{context, attributeSet, Integer.valueOf(i)}, this, f40312a, false, 33558, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, attributeSet, Integer.valueOf(i)}, this, f40312a, false, 33558, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, Void.TYPE);
        } else {
            this.f40314c = a(context, attributeSet, i);
            this.f40315d = b(context, attributeSet, i);
            this.f40316e = c(context, attributeSet, i);
            if (this.f40314c != null) {
                addView(this.f40314c);
            }
            if (this.f40315d != null) {
                addView(this.f40315d);
            }
            if (this.f40316e != null) {
                addView(this.f40316e);
            }
        }
        setState(0);
    }
}
