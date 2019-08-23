package com.ss.android.ugc.aweme.story.comment.discretescrollview.transform;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class Pivot {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72170a;

    /* renamed from: b  reason: collision with root package name */
    public int f72171b;

    /* renamed from: c  reason: collision with root package name */
    private int f72172c;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Axis {
    }

    public enum a {
        LEFT {
            public static ChangeQuickRedirect changeQuickRedirect;

            public final Pivot create() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 82842, new Class[0], Pivot.class)) {
                    return new Pivot(0, 0);
                }
                return (Pivot) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 82842, new Class[0], Pivot.class);
            }
        },
        CENTER {
            public static ChangeQuickRedirect changeQuickRedirect;

            public final Pivot create() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 82843, new Class[0], Pivot.class)) {
                    return new Pivot(0, -1);
                }
                return (Pivot) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 82843, new Class[0], Pivot.class);
            }
        },
        RIGHT {
            public static ChangeQuickRedirect changeQuickRedirect;

            public final Pivot create() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 82844, new Class[0], Pivot.class)) {
                    return new Pivot(0, -2);
                }
                return (Pivot) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 82844, new Class[0], Pivot.class);
            }
        };
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public abstract Pivot create();
    }

    public enum b {
        TOP {
            public static ChangeQuickRedirect changeQuickRedirect;

            public final Pivot create() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 82847, new Class[0], Pivot.class)) {
                    return new Pivot(1, 0);
                }
                return (Pivot) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 82847, new Class[0], Pivot.class);
            }
        },
        CENTER {
            public static ChangeQuickRedirect changeQuickRedirect;

            public final Pivot create() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 82848, new Class[0], Pivot.class)) {
                    return new Pivot(1, -1);
                }
                return (Pivot) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 82848, new Class[0], Pivot.class);
            }
        },
        BOTTOM {
            public static ChangeQuickRedirect changeQuickRedirect;

            public final Pivot create() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 82849, new Class[0], Pivot.class)) {
                    return new Pivot(1, -2);
                }
                return (Pivot) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 82849, new Class[0], Pivot.class);
            }
        };
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public abstract Pivot create();
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f72170a, false, 82839, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f72170a, false, 82839, new Class[]{View.class}, Void.TYPE);
        } else if (this.f72171b == 0) {
            switch (this.f72172c) {
                case -2:
                    view.setPivotX((float) view.getWidth());
                    return;
                case -1:
                    view.setPivotX(((float) view.getWidth()) * 0.5f);
                    return;
                default:
                    view.setPivotX((float) this.f72172c);
                    return;
            }
        } else {
            if (this.f72171b == 1) {
                switch (this.f72172c) {
                    case -2:
                        view.setPivotY((float) view.getHeight());
                        return;
                    case -1:
                        view.setPivotY(((float) view.getHeight()) * 0.5f);
                        return;
                    default:
                        view.setPivotY((float) this.f72172c);
                        break;
                }
            }
        }
    }

    public Pivot(int i, int i2) {
        this.f72171b = i;
        this.f72172c = i2;
    }
}
