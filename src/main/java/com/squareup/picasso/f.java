package com.squareup.picasso;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public final class f extends x {

    /* renamed from: a  reason: collision with root package name */
    private static final UriMatcher f27413a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f27414b;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f27413a = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f27413a.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f27413a.addURI("com.android.contacts", "contacts/#/photo", 2);
        f27413a.addURI("com.android.contacts", "contacts/#", 3);
        f27413a.addURI("com.android.contacts", "display_photo/#", 4);
    }

    f(Context context) {
        this.f27414b = context;
    }

    public final boolean a(v vVar) {
        Uri uri = vVar.f27464d;
        if (!PushConstants.CONTENT.equals(uri.getScheme()) || !ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) || f27413a.match(vVar.f27464d) == -1) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.squareup.picasso.x.a b(com.squareup.picasso.v r5) throws java.io.IOException {
        /*
            r4 = this;
            android.content.Context r0 = r4.f27414b
            android.content.ContentResolver r0 = r0.getContentResolver()
            android.net.Uri r5 = r5.f27464d
            android.content.UriMatcher r1 = f27413a
            int r1 = r1.match(r5)
            r2 = 0
            switch(r1) {
                case 1: goto L_0x002b;
                case 2: goto L_0x0026;
                case 3: goto L_0x0033;
                case 4: goto L_0x0026;
                default: goto L_0x0012;
            }
        L_0x0012:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid uri: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L_0x0026:
            java.io.InputStream r5 = r0.openInputStream(r5)
            goto L_0x0043
        L_0x002b:
            android.net.Uri r5 = android.provider.ContactsContract.Contacts.lookupContact(r0, r5)
            if (r5 != 0) goto L_0x0033
            r5 = r2
            goto L_0x0043
        L_0x0033:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 14
            if (r1 >= r3) goto L_0x003e
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r0, r5)
            goto L_0x0043
        L_0x003e:
            r1 = 1
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r0, r5, r1)
        L_0x0043:
            if (r5 == 0) goto L_0x004d
            com.squareup.picasso.x$a r0 = new com.squareup.picasso.x$a
            com.squareup.picasso.s$d r1 = com.squareup.picasso.s.d.DISK
            r0.<init>((java.io.InputStream) r5, (com.squareup.picasso.s.d) r1)
            return r0
        L_0x004d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.f.b(com.squareup.picasso.v):com.squareup.picasso.x$a");
    }
}
