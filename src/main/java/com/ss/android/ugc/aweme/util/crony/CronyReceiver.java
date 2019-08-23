package com.ss.android.ugc.aweme.util.crony;

import android.content.BroadcastReceiver;
import com.meituan.robust.ChangeQuickRedirect;

public class CronyReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75420a;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0088, code lost:
        if (r0.equals("com.ss.android.ugc.aweme.util.crony.action_activity") != false) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0198  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r12, android.content.Intent r13) {
        /*
            r11 = this;
            r8 = 2
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r12
            r10 = 1
            r0[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f75420a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r5[r9] = r1
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 87826(0x15712, float:1.2307E-40)
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003f
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r12
            r0[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f75420a
            r3 = 0
            r4 = 87826(0x15712, float:1.2307E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r5[r9] = r1
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003f:
            java.lang.String r0 = r13.getAction()
            if (r0 != 0) goto L_0x0046
            return
        L_0x0046:
            java.lang.String r0 = r13.getAction()
            int r1 = r0.hashCode()
            r2 = -2002725875(0xffffffff88a0d40d, float:-9.679503E-34)
            r7 = -1
            if (r1 == r2) goto L_0x0082
            r2 = -290818900(0xffffffffeeaa74ac, float:-2.637675E28)
            if (r1 == r2) goto L_0x0078
            r2 = 100274856(0x5fa12a8, float:2.351674E-35)
            if (r1 == r2) goto L_0x006e
            r2 = 534977624(0x1fe31c58, float:9.618513E-20)
            if (r1 == r2) goto L_0x0064
            goto L_0x008b
        L_0x0064:
            java.lang.String r1 = "com.ss.android.ugc.aweme.util.crony.action_clipboard"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008b
            r8 = 0
            goto L_0x008c
        L_0x006e:
            java.lang.String r1 = "com.ss.android.ugc.aweme.util.crony.action_clipboard_put"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008b
            r8 = 1
            goto L_0x008c
        L_0x0078:
            java.lang.String r1 = "com.ss.android.ugc.aweme.util.crony.action_info"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008b
            r8 = 3
            goto L_0x008c
        L_0x0082:
            java.lang.String r1 = "com.ss.android.ugc.aweme.util.crony.action_activity"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008b
            goto L_0x008c
        L_0x008b:
            r8 = -1
        L_0x008c:
            switch(r8) {
                case 0: goto L_0x0198;
                case 1: goto L_0x0148;
                case 2: goto L_0x00f6;
                case 3: goto L_0x0091;
                default: goto L_0x008f;
            }
        L_0x008f:
            goto L_0x01ef
        L_0x0091:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f75420a
            r3 = 0
            r4 = 87830(0x15716, float:1.23076E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00c2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f75420a
            r3 = 0
            r4 = 87830(0x15716, float:1.23076E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01ef
        L_0x00c2:
            com.ss.android.ugc.aweme.util.crony.c r0 = com.ss.android.ugc.aweme.util.crony.a.f75424d
            if (r0 == 0) goto L_0x00ef
            java.lang.String r0 = "key"
            java.lang.String r0 = r13.getStringExtra(r0)
            java.lang.String r1 = "default"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00d6
            java.lang.String r0 = ""
        L_0x00d6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "\n1\n"
            r1.<init>(r2)
            com.ss.android.ugc.aweme.util.crony.c r2 = com.ss.android.ugc.aweme.util.crony.a.f75424d
            java.lang.String r0 = r2.a(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.setResultData(r0)
            goto L_0x01ef
        L_0x00ef:
            java.lang.String r0 = "\n2\n"
            r11.setResultData(r0)
            goto L_0x01ef
        L_0x00f6:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f75420a
            r3 = 0
            r4 = 87829(0x15715, float:1.23075E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x011b
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f75420a
            r3 = 0
            r4 = 87829(0x15715, float:1.23075E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01ef
        L_0x011b:
            android.app.Application r0 = com.ss.android.ugc.aweme.util.crony.a.f75422b
            java.lang.String r1 = "activity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.util.List r0 = r0.getRunningTasks(r10)
            java.lang.Object r0 = r0.get(r9)
            android.app.ActivityManager$RunningTaskInfo r0 = (android.app.ActivityManager.RunningTaskInfo) r0
            android.content.ComponentName r0 = r0.topActivity
            java.lang.String r0 = r0.getClassName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "\n1\n"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.setResultData(r0)
            goto L_0x01ef
        L_0x0148:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f75420a
            r3 = 0
            r4 = 87828(0x15714, float:1.23073E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0179
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f75420a
            r3 = 0
            r4 = 87828(0x15714, float:1.23073E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01ef
        L_0x0179:
            java.lang.String r0 = "content"
            java.lang.String r0 = r13.getStringExtra(r0)
            android.app.Application r1 = com.ss.android.ugc.aweme.util.crony.a.f75422b
            java.lang.String r2 = "clipboard"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1
            java.lang.String r2 = "Crony"
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r2, r0)
            r1.setPrimaryClip(r0)
            java.lang.String r0 = "\n1\n"
            r11.setResultData(r0)
            goto L_0x01ef
        L_0x0198:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f75420a
            r3 = 0
            r4 = 87827(0x15713, float:1.23072E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f75420a
            r3 = 0
            r4 = 87827(0x15713, float:1.23072E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01ef
        L_0x01bc:
            android.app.Application r0 = com.ss.android.ugc.aweme.util.crony.a.f75422b
            java.lang.String r1 = "clipboard"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0
            android.content.ClipData r0 = r0.getPrimaryClip()
            if (r0 == 0) goto L_0x01ea
            android.content.ClipData$Item r0 = r0.getItemAt(r9)
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "\n1\n"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.setResultData(r0)
            goto L_0x01ef
        L_0x01ea:
            java.lang.String r0 = "\n0\n"
            r11.setResultData(r0)
        L_0x01ef:
            r11.setResultCode(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.util.crony.CronyReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
