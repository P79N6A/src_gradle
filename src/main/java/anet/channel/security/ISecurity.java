package anet.channel.security;

import android.content.Context;

public interface ISecurity {
    byte[] decrypt(Context context, String str, String str2, byte[] bArr);

    byte[] getBytes(Context context, String str);

    boolean isSecOff();

    boolean saveBytes(Context context, String str, byte[] bArr);

    String sign(Context context, String str, String str2, String str3);
}
