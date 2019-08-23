package cn.com.chinatelecom.a.a.c;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static String f1693a = "RSA/ECB/PKCS1Padding";

    public static String a(String str, RSAPublicKey rSAPublicKey) throws Exception {
        return i.a(a(rSAPublicKey, str.getBytes()));
    }

    private static byte[] a(RSAPublicKey rSAPublicKey, byte[] bArr) throws Exception {
        if (rSAPublicKey != null) {
            try {
                Cipher instance = Cipher.getInstance(f1693a);
                instance.init(1, rSAPublicKey);
                return instance.doFinal(bArr);
            } catch (NoSuchAlgorithmException unused) {
                throw new Exception("无此加密算法");
            } catch (NoSuchPaddingException unused2) {
                return null;
            } catch (InvalidKeyException unused3) {
                throw new Exception("加密公钥非法,请检查");
            } catch (IllegalBlockSizeException unused4) {
                throw new Exception("明文长度非法");
            } catch (BadPaddingException unused5) {
                throw new Exception("明文数据已损坏");
            }
        } else {
            throw new Exception("加密公钥为空, 请设置");
        }
    }
}
