package com.ss.android.ugc.aweme.base.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.RadioGroup;
import com.bytedance.ies.dmt.ui.widget.DmtRadioButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public class CanCancelRadioButton extends DmtRadioButton {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35066a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f35067b;

    /* renamed from: c  reason: collision with root package name */
    private List<a> f35068c;

    public interface a {
        boolean a(View view);
    }

    static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35071a;

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new b[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f35071a, false, 25392, new Class[]{Parcel.class}, b.class)) {
                    return new b(parcel2, (byte) 0);
                }
                return (b) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f35071a, false, 25392, new Class[]{Parcel.class}, b.class);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35069a;

        /* renamed from: b  reason: collision with root package name */
        boolean f35070b;

        b(Parcelable parcelable) {
            super(parcelable);
        }

        private b(Parcel parcel) {
            super(parcel);
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f35070b = z;
        }

        /* synthetic */ b(Parcel parcel, byte b2) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2, Integer.valueOf(i)}, this, f35069a, false, 25391, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel2, Integer.valueOf(i)}, this, f35069a, false, 25391, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.writeToParcel(parcel, i);
            parcel2.writeInt(this.f35070b ? 1 : 0);
        }
    }

    public Parcelable onSaveInstanceState() {
        if (PatchProxy.isSupport(new Object[0], this, f35066a, false, 25389, new Class[0], Parcelable.class)) {
            return (Parcelable) PatchProxy.accessDispatch(new Object[0], this, f35066a, false, 25389, new Class[0], Parcelable.class);
        }
        b bVar = new b(super.onSaveInstanceState());
        bVar.f35070b = this.f35067b;
        return bVar;
    }

    public void toggle() {
        if (PatchProxy.isSupport(new Object[0], this, f35066a, false, 25388, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35066a, false, 25388, new Class[0], Void.TYPE);
            return;
        }
        for (a a2 : this.f35068c) {
            if (!a2.a(this)) {
                return;
            }
        }
        if (this.f35067b) {
            setChecked(!isChecked());
            if (!isChecked()) {
                ((RadioGroup) getParent()).clearCheck();
            }
        }
    }

    public void setCanChecked(boolean z) {
        this.f35067b = z;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (PatchProxy.isSupport(new Object[]{parcelable}, this, f35066a, false, 25390, new Class[]{Parcelable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcelable}, this, f35066a, false, 25390, new Class[]{Parcelable.class}, Void.TYPE);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCanChecked(bVar.f35070b);
    }
}
