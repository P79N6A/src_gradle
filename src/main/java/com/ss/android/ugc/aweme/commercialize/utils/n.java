package com.ss.android.ugc.aweme.commercialize.utils;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.comment.ui.CommentInputFragment;
import com.ss.android.ugc.aweme.comment.ui.VideoCommentDialogFragment2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.a;
import com.ss.android.ugc.aweme.utils.c;
import java.util.List;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39802a;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0108, code lost:
        if (r3.equals(com.meizu.cloud.pushsdk.constants.PushConstants.EXTRA_APPLICATION_PENDING_INTENT) != false) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0123, code lost:
        if (android.text.TextUtils.isEmpty(r2.getConsultUrl()) == false) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012f, code lost:
        if (android.text.TextUtils.isEmpty(r2.getRedUrl()) == false) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0141, code lost:
        if (com.ss.android.ugc.aweme.commercialize.utils.c.q(r18) == null) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014d, code lost:
        if (android.text.TextUtils.isEmpty(r2.getPhoneNumber()) == false) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01bb, code lost:
        if (android.text.TextUtils.isEmpty(r5) != false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01bd, code lost:
        r0 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(com.ss.android.ugc.aweme.feed.model.Aweme r18, boolean r19) {
        /*
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            java.lang.Byte r3 = java.lang.Byte.valueOf(r9)
            r10 = 1
            r2[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = f39802a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r7[r10] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = 0
            r5 = 1
            r6 = 32383(0x7e7f, float:4.5378E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x004e
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r9] = r18
            java.lang.Byte r0 = java.lang.Byte.valueOf(r9)
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f39802a
            r14 = 1
            r15 = 32383(0x7e7f, float:4.5378E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x004e:
            if (r18 != 0) goto L_0x0051
            return r9
        L_0x0051:
            boolean r2 = r18.isAd()
            if (r2 == 0) goto L_0x01c3
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r9] = r18
            java.lang.Byte r2 = java.lang.Byte.valueOf(r9)
            r11[r10] = r2
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f39802a
            r14 = 1
            r15 = 32384(0x7e80, float:4.538E-41)
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r2[r9] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r2[r10] = r3
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x00a5
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r9] = r18
            java.lang.Byte r0 = java.lang.Byte.valueOf(r9)
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f39802a
            r14 = 1
            r15 = 32384(0x7e80, float:4.538E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x01c0
        L_0x00a5:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r18.getAwemeRawAd()
            if (r2 == 0) goto L_0x01bf
            boolean r3 = r2.isDisableUserprofileAdLabel()
            if (r3 != 0) goto L_0x01bf
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r18.getAwemeRawAd()
            java.lang.String r3 = r3.getType()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x01bf
            java.lang.String r4 = r2.getOpenUrl()
            java.lang.String r5 = r2.getWebUrl()
            r6 = -1
            int r7 = r3.hashCode()
            switch(r7) {
                case -1354573786: goto L_0x010b;
                case 96801: goto L_0x0102;
                case 117588: goto L_0x00f8;
                case 3083120: goto L_0x00ee;
                case 3148996: goto L_0x00e4;
                case 957829685: goto L_0x00da;
                case 1893962841: goto L_0x00d0;
                default: goto L_0x00cf;
            }
        L_0x00cf:
            goto L_0x0115
        L_0x00d0:
            java.lang.String r1 = "redpacket"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0115
            r1 = 5
            goto L_0x0116
        L_0x00da:
            java.lang.String r1 = "counsel"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0115
            r1 = 6
            goto L_0x0116
        L_0x00e4:
            java.lang.String r1 = "form"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0115
            r1 = 4
            goto L_0x0116
        L_0x00ee:
            java.lang.String r1 = "dial"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0115
            r1 = 3
            goto L_0x0116
        L_0x00f8:
            java.lang.String r1 = "web"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0115
            r1 = 0
            goto L_0x0116
        L_0x0102:
            java.lang.String r7 = "app"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x0115
            goto L_0x0116
        L_0x010b:
            java.lang.String r1 = "coupon"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0115
            r1 = 1
            goto L_0x0116
        L_0x0115:
            r1 = -1
        L_0x0116:
            switch(r1) {
                case 0: goto L_0x01b1;
                case 1: goto L_0x01b1;
                case 2: goto L_0x0151;
                case 3: goto L_0x0145;
                case 4: goto L_0x0133;
                case 5: goto L_0x0127;
                case 6: goto L_0x011b;
                default: goto L_0x0119;
            }
        L_0x0119:
            goto L_0x01bf
        L_0x011b:
            java.lang.String r0 = r2.getConsultUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01bf
            goto L_0x01bd
        L_0x0127:
            java.lang.String r0 = r2.getRedUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01bf
            goto L_0x01bd
        L_0x0133:
            java.lang.String r1 = r2.getFormUrl()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x01bd
            com.ss.android.ugc.aweme.feed.model.CardStruct r0 = com.ss.android.ugc.aweme.commercialize.utils.c.q(r18)
            if (r0 == 0) goto L_0x01bf
            goto L_0x01bd
        L_0x0145:
            java.lang.String r0 = r2.getPhoneNumber()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01bf
            goto L_0x01bd
        L_0x0151:
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r9] = r2
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f39802a
            r14 = 1
            r15 = 32385(0x7e81, float:4.5381E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AwemeRawAd> r1 = com.ss.android.ugc.aweme.feed.model.AwemeRawAd.class
            r0[r9] = r1
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x018a
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r9] = r2
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f39802a
            r14 = 1
            r15 = 32385(0x7e81, float:4.5381E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AwemeRawAd> r1 = com.ss.android.ugc.aweme.feed.model.AwemeRawAd.class
            r0[r9] = r1
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x01c0
        L_0x018a:
            java.lang.String r0 = r2.getOpenUrl()
            java.lang.String r1 = r2.getDownloadUrl()
            java.lang.String r2 = r2.getPackageName()
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.g.b(r0)
            if (r0 == 0) goto L_0x019d
            goto L_0x01bd
        L_0x019d:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 == 0) goto L_0x01aa
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x01bf
            goto L_0x01bd
        L_0x01aa:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x01bf
            goto L_0x01bd
        L_0x01b1:
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.g.b(r4)
            if (r0 != 0) goto L_0x01bd
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x01bf
        L_0x01bd:
            r0 = 1
            goto L_0x01c0
        L_0x01bf:
            r0 = 0
        L_0x01c0:
            if (r0 == 0) goto L_0x01c3
            return r10
        L_0x01c3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.n.a(com.ss.android.ugc.aweme.feed.model.Aweme, boolean):boolean");
    }

    public static int a(Context context) {
        Context context2 = context;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f39802a, true, 32394, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, null, f39802a, true, 32394, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }
        if (a.a().l) {
            i = a.a().b();
        }
        int a2 = v.a(context2, (int) C0906R.dimen.bj) - i;
        if (a.d()) {
            a2 += a.f61216b;
        }
        return a2;
    }

    public static boolean b(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39802a, true, 32397, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39802a, true, 32397, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || !aweme.isAd() || !c.H(aweme) || TextUtils.isEmpty(c.c(aweme))) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean a(FragmentManager fragmentManager) {
        if (PatchProxy.isSupport(new Object[]{fragmentManager}, null, f39802a, true, 32392, new Class[]{FragmentManager.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{fragmentManager}, null, f39802a, true, 32392, new Class[]{FragmentManager.class}, Boolean.TYPE)).booleanValue();
        } else if (fragmentManager == null) {
            return false;
        } else {
            List<Fragment> fragments = fragmentManager.getFragments();
            if (CollectionUtils.isEmpty(fragments)) {
                return false;
            }
            for (Fragment next : fragments) {
                if (next != null && !(next instanceof CommentInputFragment)) {
                    if (next instanceof DialogFragment) {
                        Dialog dialog = ((DialogFragment) next).getDialog();
                        if (dialog != null) {
                            return dialog.isShowing();
                        }
                    } else if (next instanceof VideoCommentDialogFragment2) {
                        return ((VideoCommentDialogFragment2) next).j();
                    }
                }
            }
            return false;
        }
    }

    public static boolean a(@NonNull Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39802a, true, 32390, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39802a, true, 32390, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme.getAwemeRawAd() == null) {
            return false;
        } else {
            String type = aweme.getAwemeRawAd().getType();
            int maskFormStyle = aweme.getAwemeRawAd().getMaskFormStyle();
            if (!TextUtils.equals(type, "form") || maskFormStyle != 1) {
                return false;
            }
            return true;
        }
    }

    public static String a(Context context, Aweme aweme, boolean z) {
        if (PatchProxy.isSupport(new Object[]{context, aweme, Byte.valueOf(z ? (byte) 1 : 0)}, null, f39802a, true, 32386, new Class[]{Context.class, Aweme.class, Boolean.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context, aweme, Byte.valueOf(z)}, null, f39802a, true, 32386, new Class[]{Context.class, Aweme.class, Boolean.TYPE}, String.class);
        } else if (context == null) {
            return "";
        } else {
            if (aweme == null) {
                return "";
            }
            if (!aweme.isAd()) {
                return "";
            }
            return b(context, aweme, z);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009b, code lost:
        if (r1.equals("form") != false) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String b(@android.support.annotation.NonNull android.content.Context r20, @android.support.annotation.NonNull com.ss.android.ugc.aweme.feed.model.Aweme r21, boolean r22) {
        /*
            r0 = r20
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r21
            java.lang.Byte r4 = java.lang.Byte.valueOf(r22)
            r12 = 2
            r3[r12] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = f39802a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r4 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r8[r11] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r8[r12] = r4
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r4 = 0
            r6 = 1
            r7 = 32388(0x7e84, float:4.5385E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x005a
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r10] = r0
            r13[r11] = r21
            java.lang.Byte r0 = java.lang.Byte.valueOf(r22)
            r13[r12] = r0
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f39802a
            r16 = 1
            r17 = 32388(0x7e84, float:4.5385E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r12] = r1
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x005a:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r21.getAwemeRawAd()
            if (r3 != 0) goto L_0x0063
            java.lang.String r0 = ""
            return r0
        L_0x0063:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r21.getAwemeRawAd()
            java.lang.String r1 = r1.getType()
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L_0x0074
            java.lang.String r0 = ""
            return r0
        L_0x0074:
            java.lang.String r3 = r3.getButtonText()
            r4 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1354573786: goto L_0x00bc;
                case 96801: goto L_0x00b2;
                case 117588: goto L_0x00a8;
                case 3083120: goto L_0x009e;
                case 3148996: goto L_0x0095;
                case 957829685: goto L_0x008b;
                case 1893962841: goto L_0x0081;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x00c6
        L_0x0081:
            java.lang.String r2 = "redpacket"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00c6
            r2 = 4
            goto L_0x00c7
        L_0x008b:
            java.lang.String r2 = "counsel"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00c6
            r2 = 5
            goto L_0x00c7
        L_0x0095:
            java.lang.String r5 = "form"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00c6
            goto L_0x00c7
        L_0x009e:
            java.lang.String r2 = "dial"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00c6
            r2 = 2
            goto L_0x00c7
        L_0x00a8:
            java.lang.String r2 = "web"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00c6
            r2 = 0
            goto L_0x00c7
        L_0x00b2:
            java.lang.String r2 = "app"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00c6
            r2 = 1
            goto L_0x00c7
        L_0x00bc:
            java.lang.String r2 = "coupon"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00c6
            r2 = 6
            goto L_0x00c7
        L_0x00c6:
            r2 = -1
        L_0x00c7:
            r1 = 2131558521(0x7f0d0079, float:1.874236E38)
            switch(r2) {
                case 0: goto L_0x012b;
                case 1: goto L_0x011f;
                case 2: goto L_0x0110;
                case 3: goto L_0x00fa;
                case 4: goto L_0x00eb;
                case 5: goto L_0x00df;
                case 6: goto L_0x00d0;
                default: goto L_0x00cd;
            }
        L_0x00cd:
            java.lang.String r0 = ""
            return r0
        L_0x00d0:
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L_0x00de
            r1 = 2131558502(0x7f0d0066, float:1.8742322E38)
            java.lang.String r0 = r0.getString(r1)
            return r0
        L_0x00de:
            return r3
        L_0x00df:
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 == 0) goto L_0x00ea
            java.lang.String r0 = r0.getString(r1)
            return r0
        L_0x00ea:
            return r3
        L_0x00eb:
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L_0x00f9
            r1 = 2131558518(0x7f0d0076, float:1.8742354E38)
            java.lang.String r0 = r0.getString(r1)
            return r0
        L_0x00f9:
            return r3
        L_0x00fa:
            if (r22 == 0) goto L_0x0101
            java.lang.String r0 = r0.getString(r1)
            return r0
        L_0x0101:
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L_0x010f
            r1 = 2131558505(0x7f0d0069, float:1.8742328E38)
            java.lang.String r0 = r0.getString(r1)
            return r0
        L_0x010f:
            return r3
        L_0x0110:
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L_0x011e
            r1 = 2131558517(0x7f0d0075, float:1.8742352E38)
            java.lang.String r0 = r0.getString(r1)
            return r0
        L_0x011e:
            return r3
        L_0x011f:
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 == 0) goto L_0x012a
            java.lang.String r0 = r0.getString(r1)
            return r0
        L_0x012a:
            return r3
        L_0x012b:
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 == 0) goto L_0x0136
            java.lang.String r0 = r0.getString(r1)
            return r0
        L_0x0136:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.n.b(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, boolean):java.lang.String");
    }

    public static void a(View view, int i, int i2, boolean z) {
        View view2 = view;
        int i3 = i;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, null, f39802a, true, 32395, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, null, f39802a, true, 32395, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (view2 != null) {
            int i5 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            if (z) {
                if (i5 < 0) {
                    c.a(view2, i5, i3, i4).start();
                }
            } else if (i5 >= 0) {
                c.a(view2, i5, i3, i4).start();
            }
        }
    }
}
