package org.greenrobot.eventbus.util;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import org.greenrobot.eventbus.c;

public final class ErrorDialogManager {

    /* renamed from: a  reason: collision with root package name */
    public static b<?> f84155a;

    public static class SupportManagerFragment extends Fragment {

        /* renamed from: a  reason: collision with root package name */
        protected boolean f84156a;

        /* renamed from: b  reason: collision with root package name */
        protected Bundle f84157b;

        /* renamed from: c  reason: collision with root package name */
        private c f84158c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f84159d;

        /* renamed from: e  reason: collision with root package name */
        private Object f84160e;

        public void onPause() {
            this.f84158c.c(this);
            super.onPause();
        }

        public void onResume() {
            super.onResume();
            if (this.f84159d) {
                this.f84159d = false;
                return;
            }
            this.f84158c = ErrorDialogManager.f84155a.f84167a.a();
            this.f84158c.a((Object) this);
        }

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            this.f84158c = ErrorDialogManager.f84155a.f84167a.a();
            this.f84158c.a((Object) this);
            this.f84159d = true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0014  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0013 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onEventMainThread(org.greenrobot.eventbus.util.d r5) {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f84160e
                if (r5 == 0) goto L_0x0010
                java.lang.Object r1 = r5.f84171c
                if (r1 == 0) goto L_0x0010
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0010
                r0 = 0
                goto L_0x0011
            L_0x0010:
                r0 = 1
            L_0x0011:
                if (r0 != 0) goto L_0x0014
                return
            L_0x0014:
                android.support.v4.app.FragmentManager r0 = r4.getFragmentManager()
                r0.executePendingTransactions()
                java.lang.String r1 = "de.greenrobot.eventbus.error_dialog"
                android.support.v4.app.Fragment r1 = r0.findFragmentByTag(r1)
                android.support.v4.app.DialogFragment r1 = (android.support.v4.app.DialogFragment) r1
                if (r1 == 0) goto L_0x0028
                r1.dismiss()
            L_0x0028:
                org.greenrobot.eventbus.util.b<?> r1 = org.greenrobot.eventbus.util.ErrorDialogManager.f84155a
                boolean r2 = r4.f84156a
                android.os.Bundle r3 = r4.f84157b
                java.lang.Object r5 = r1.a(r5, r2, r3)
                android.support.v4.app.DialogFragment r5 = (android.support.v4.app.DialogFragment) r5
                if (r5 == 0) goto L_0x003b
                java.lang.String r1 = "de.greenrobot.eventbus.error_dialog"
                r5.show((android.support.v4.app.FragmentManager) r0, (java.lang.String) r1)
            L_0x003b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.eventbus.util.ErrorDialogManager.SupportManagerFragment.onEventMainThread(org.greenrobot.eventbus.util.d):void");
        }
    }
}
