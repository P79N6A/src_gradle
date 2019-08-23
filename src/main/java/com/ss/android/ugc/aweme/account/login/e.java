package com.ss.android.ugc.aweme.account.login;

import com.ss.android.ugc.aweme.account.login.model.LoginMethodName;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
public final /* synthetic */ class e {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f32215a;

    static {
        int[] iArr = new int[LoginMethodName.values().length];
        f32215a = iArr;
        iArr[LoginMethodName.PHONE_NUMBER_PASS.ordinal()] = 1;
        f32215a[LoginMethodName.PHONE_SMS.ordinal()] = 2;
        f32215a[LoginMethodName.THIRD_PARTY.ordinal()] = 3;
    }
}
