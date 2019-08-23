package com.ss.android.ugc.aweme.qrcode.v2;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63539a;

    public static int b(com.ss.android.ugc.aweme.qrcode.d dVar) {
        int i = dVar.type;
        if (i == 1) {
            return 2130838176;
        }
        if (i == 7) {
            return 2130838175;
        }
        if (i != 17) {
            return 2130838174;
        }
        return 2130838177;
    }

    public static String a(com.ss.android.ugc.aweme.qrcode.d dVar) {
        int i = dVar.type;
        if (!(i == 11 || i == 17 || i == 23)) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    break;
                default:
                    switch (i) {
                        case e.l:
                        case 8:
                        case 9:
                            break;
                        default:
                            return "";
                    }
            }
        }
        return dVar.title;
    }

    public static String a(Context context, com.ss.android.ugc.aweme.qrcode.d dVar) {
        Context context2 = context;
        com.ss.android.ugc.aweme.qrcode.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{context2, dVar2}, null, f63539a, true, 70550, new Class[]{Context.class, com.ss.android.ugc.aweme.qrcode.d.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2, dVar2}, null, f63539a, true, 70550, new Class[]{Context.class, com.ss.android.ugc.aweme.qrcode.d.class}, String.class);
        }
        int i = dVar2.type;
        if (i == 11) {
            return "";
        }
        if (i != 17) {
            if (i != 23) {
                switch (i) {
                    case 1:
                        return context2.getString(C0906R.string.dts, new Object[]{dVar2.describe});
                    case 2:
                        break;
                    case 3:
                        return context2.getString(C0906R.string.bfa, new Object[]{dVar2.describe});
                    case 4:
                        return dVar2.describe;
                    case 5:
                        return "";
                    default:
                        switch (i) {
                            case e.l:
                                return context2.getString(C0906R.string.jv, new Object[]{dVar2.describe});
                            case 8:
                                return "";
                            case 9:
                                return "";
                            default:
                                return "";
                        }
                }
            }
            return context2.getString(C0906R.string.b3x, new Object[]{dVar2.describe});
        }
        return context2.getString(C0906R.string.bfa, new Object[]{dVar2.describe});
    }

    public static String b(Context context, com.ss.android.ugc.aweme.qrcode.d dVar) {
        Context context2 = context;
        com.ss.android.ugc.aweme.qrcode.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{context2, dVar2}, null, f63539a, true, 70552, new Class[]{Context.class, com.ss.android.ugc.aweme.qrcode.d.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2, dVar2}, null, f63539a, true, 70552, new Class[]{Context.class, com.ss.android.ugc.aweme.qrcode.d.class}, String.class);
        }
        int i = dVar2.type;
        if (i == 11) {
            return "";
        }
        if (i == 17) {
            return context2.getString(C0906R.string.bum);
        }
        if (i != 23) {
            switch (i) {
                case 1:
                    return context2.getString(C0906R.string.bur);
                case 2:
                    break;
                case 3:
                    return context2.getString(C0906R.string.bui);
                case 4:
                    if (!dVar2.isEnterpriseUser) {
                        return context2.getString(C0906R.string.bup);
                    }
                    return context2.getString(C0906R.string.buf, new Object[]{dVar2.title});
                case 5:
                    return "";
                default:
                    switch (i) {
                        case e.l:
                            return context2.getString(C0906R.string.buk);
                        case 8:
                            return "";
                        case 9:
                            return "";
                        default:
                            return "";
                    }
            }
        }
        return context2.getString(C0906R.string.bud);
    }
}
