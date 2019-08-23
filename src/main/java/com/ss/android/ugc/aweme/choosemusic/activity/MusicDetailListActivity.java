package com.ss.android.ugc.aweme.choosemusic.activity;

import android.app.Activity;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;

public class MusicDetailListActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35754a;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f35754a, false, 26458, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35754a, false, 26458, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f35754a, false, 26459, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f35754a, false, 26459, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f35754a, false, 26457, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35754a, false, 26457, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicFragment} */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01ef, code lost:
        r4 = r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r20
            com.meituan.robust.ChangeQuickRedirect r4 = f35754a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 26455(0x6757, float:3.7071E-41)
            r3 = r19
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0032
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r20
            com.meituan.robust.ChangeQuickRedirect r12 = f35754a
            r13 = 0
            r14 = 26455(0x6757, float:3.7071E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0032:
            java.lang.String r2 = "com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity"
            java.lang.String r3 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r2, r3, r1)
            super.onCreate(r20)
            r0 = 2131689596(0x7f0f007c, float:1.9008212E38)
            r10 = r19
            r10.setContentView((int) r0)
            android.content.Intent r0 = r19.getIntent()
            if (r0 == 0) goto L_0x0210
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r2 = "cid"
            java.lang.String r0 = r0.getStringExtra(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r11 = 2
            if (r0 != 0) goto L_0x005d
            r0 = 2
            goto L_0x0067
        L_0x005d:
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r2 = "music_type"
            int r0 = r0.getIntExtra(r2, r1)
        L_0x0067:
            boolean r2 = com.ss.android.g.a.b()
            if (r2 == 0) goto L_0x0080
            com.gyf.barlibrary.ImmersionBar r2 = com.gyf.barlibrary.ImmersionBar.with((android.app.Activity) r19)
            r3 = 2131624773(0x7f0e0345, float:1.8876735E38)
            com.gyf.barlibrary.ImmersionBar r2 = r2.statusBarColor((int) r3)
            com.gyf.barlibrary.ImmersionBar r2 = r2.statusBarDarkFont(r1)
            r2.init()
            goto L_0x0092
        L_0x0080:
            com.gyf.barlibrary.ImmersionBar r2 = com.gyf.barlibrary.ImmersionBar.with((android.app.Activity) r19)
            r3 = 2131625849(0x7f0e0779, float:1.8878918E38)
            com.gyf.barlibrary.ImmersionBar r2 = r2.statusBarColor((int) r3)
            com.gyf.barlibrary.ImmersionBar r2 = r2.statusBarDarkFont(r1)
            r2.init()
        L_0x0092:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2[r9] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = f35754a
            r5 = 0
            r6 = 26456(0x6758, float:3.7073E-41)
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r19
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x00cb
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f35754a
            r5 = 0
            r6 = 26456(0x6758, float:3.7073E-41)
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r7[r9] = r0
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0210
        L_0x00cb:
            switch(r0) {
                case 1: goto L_0x00da;
                case 2: goto L_0x00d7;
                case 3: goto L_0x00d4;
                case 4: goto L_0x00d1;
                default: goto L_0x00ce;
            }
        L_0x00ce:
            java.lang.String r2 = ""
            goto L_0x00dc
        L_0x00d1:
            java.lang.String r2 = "tag_music_sheet"
            goto L_0x00dc
        L_0x00d4:
            java.lang.String r2 = "local_music_list"
            goto L_0x00dc
        L_0x00d7:
            java.lang.String r2 = "music_class_sheet"
            goto L_0x00dc
        L_0x00da:
            java.lang.String r2 = "hot_music_list"
        L_0x00dc:
            android.support.v4.app.FragmentManager r3 = r19.getSupportFragmentManager()
            android.support.v4.app.Fragment r4 = r3.findFragmentByTag(r2)
            if (r4 != 0) goto L_0x0203
            android.content.Intent r4 = r19.getIntent()
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r12[r9] = r5
            r12[r1] = r4
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.choosemusic.fragment.j.f35982a
            r15 = 1
            r16 = 26615(0x67f7, float:3.7296E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Integer.TYPE
            r5[r9] = r6
            java.lang.Class<android.content.Intent> r6 = android.content.Intent.class
            r5[r1] = r6
            java.lang.Class<android.support.v4.app.Fragment> r18 = android.support.v4.app.Fragment.class
            r17 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r5 == 0) goto L_0x0135
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12[r9] = r0
            r12[r1] = r4
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.choosemusic.fragment.j.f35982a
            r15 = 1
            r16 = 26615(0x67f7, float:3.7296E-41)
            java.lang.Class[] r0 = new java.lang.Class[r11]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r0[r9] = r4
            java.lang.Class<android.content.Intent> r4 = android.content.Intent.class
            r0[r1] = r4
            java.lang.Class<android.support.v4.app.Fragment> r18 = android.support.v4.app.Fragment.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
        L_0x0132:
            r4 = r0
            goto L_0x0203
        L_0x0135:
            switch(r0) {
                case 1: goto L_0x01f7;
                case 2: goto L_0x01f1;
                case 3: goto L_0x0199;
                case 4: goto L_0x0143;
                default: goto L_0x0138;
            }
        L_0x0138:
            java.lang.String r0 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE"
            int r0 = r4.getIntExtra(r0, r1)
            android.support.v4.app.Fragment r0 = com.ss.android.ugc.aweme.choosemusic.fragment.HotMusicListFragment.a(r0)
            goto L_0x0132
        L_0x0143:
            java.lang.String r0 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE"
            int r0 = r4.getIntExtra(r0, r1)
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r11[r9] = r4
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.choosemusic.fragment.MusicSheetFragment.f35938a
            r14 = 1
            r15 = 26617(0x67f9, float:3.7298E-41)
            java.lang.Class[] r4 = new java.lang.Class[r1]
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r9] = r5
            java.lang.Class<android.support.v4.app.Fragment> r17 = android.support.v4.app.Fragment.class
            r16 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r4 == 0) goto L_0x0186
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11[r9] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.choosemusic.fragment.MusicSheetFragment.f35938a
            r14 = 1
            r15 = 26617(0x67f9, float:3.7298E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r9] = r1
            java.lang.Class<android.support.v4.app.Fragment> r17 = android.support.v4.app.Fragment.class
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
            goto L_0x0132
        L_0x0186:
            com.ss.android.ugc.aweme.choosemusic.fragment.MusicSheetFragment r1 = new com.ss.android.ugc.aweme.choosemusic.fragment.MusicSheetFragment
            r1.<init>()
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r5 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE"
            r4.putInt(r5, r0)
            r1.setArguments(r4)
            goto L_0x01ef
        L_0x0199:
            java.lang.String r0 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE"
            int r0 = r4.getIntExtra(r0, r1)
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r11[r9] = r4
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicFragment.i
            r14 = 1
            r15 = 26595(0x67e3, float:3.7268E-41)
            java.lang.Class[] r4 = new java.lang.Class[r1]
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r9] = r5
            java.lang.Class<android.support.v4.app.Fragment> r17 = android.support.v4.app.Fragment.class
            r16 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r4 == 0) goto L_0x01dd
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11[r9] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicFragment.i
            r14 = 1
            r15 = 26595(0x67e3, float:3.7268E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r9] = r1
            java.lang.Class<android.support.v4.app.Fragment> r17 = android.support.v4.app.Fragment.class
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
            goto L_0x0132
        L_0x01dd:
            com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicFragment r1 = new com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicFragment
            r1.<init>()
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r5 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE"
            r4.putInt(r5, r0)
            r1.setArguments(r4)
        L_0x01ef:
            r4 = r1
            goto L_0x0203
        L_0x01f1:
            android.support.v4.app.Fragment r0 = com.ss.android.ugc.aweme.choosemusic.fragment.j.a(r4)
            goto L_0x0132
        L_0x01f7:
            java.lang.String r0 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE"
            int r0 = r4.getIntExtra(r0, r1)
            android.support.v4.app.Fragment r0 = com.ss.android.ugc.aweme.choosemusic.fragment.HotMusicListFragment.a(r0)
            goto L_0x0132
        L_0x0203:
            android.support.v4.app.FragmentTransaction r0 = r3.beginTransaction()
            r1 = 2131166894(0x7f0706ae, float:1.7948046E38)
            r0.replace(r1, r4, r2)
            r0.commitAllowingStateLoss()
        L_0x0210:
            java.lang.String r0 = "com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity.onCreate(android.os.Bundle):void");
    }
}
