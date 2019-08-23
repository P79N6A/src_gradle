package com.ttnet.org.chromium.net;

import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;

@JNINamespace("net::android")
public class AndroidKeyStore {
    @CalledByNative
    private static long getOpenSSLHandleForPrivateKey(PrivateKey privateKey) {
        Object openSSLKeyForPrivateKey = getOpenSSLKeyForPrivateKey(privateKey);
        if (openSSLKeyForPrivateKey == null) {
            return 0;
        }
        try {
            Method declaredMethod = openSSLKeyForPrivateKey.getClass().getDeclaredMethod("getPkeyContext", new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                long longValue = ((Number) declaredMethod.invoke(openSSLKeyForPrivateKey, new Object[0])).longValue();
                declaredMethod.setAccessible(false);
                if (longValue == 0) {
                    Log.e("AndroidKeyStore", "getPkeyContext() returned null", new Object[0]);
                }
                return longValue;
            } catch (Exception e2) {
                Log.e("AndroidKeyStore", "Exception while trying to retrieve system EVP_PKEY handle: " + e2, new Object[0]);
                return 0;
            } catch (Throwable th) {
                declaredMethod.setAccessible(false);
                throw th;
            }
        } catch (Exception e3) {
            Log.e("AndroidKeyStore", "No getPkeyContext() method on OpenSSLKey member:" + e3, new Object[0]);
            return 0;
        }
    }

    @CalledByNative
    private static Object getOpenSSLEngineForPrivateKey(PrivateKey privateKey) {
        try {
            Class<?> cls = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLEngine");
            Object openSSLKeyForPrivateKey = getOpenSSLKeyForPrivateKey(privateKey);
            if (openSSLKeyForPrivateKey == null) {
                return null;
            }
            try {
                Method declaredMethod = openSSLKeyForPrivateKey.getClass().getDeclaredMethod("getEngine", new Class[0]);
                try {
                    declaredMethod.setAccessible(true);
                    Object invoke = declaredMethod.invoke(openSSLKeyForPrivateKey, new Object[0]);
                    declaredMethod.setAccessible(false);
                    if (invoke == null) {
                        Log.e("AndroidKeyStore", "getEngine() returned null", new Object[0]);
                    }
                    if (cls.isInstance(invoke)) {
                        return invoke;
                    }
                    Log.e("AndroidKeyStore", "Engine is not an OpenSSLEngine instance, its class name is:" + invoke.getClass().getCanonicalName(), new Object[0]);
                    return null;
                } catch (Exception e2) {
                    Log.e("AndroidKeyStore", "Exception while trying to retrieve OpenSSLEngine object: " + e2, new Object[0]);
                    return null;
                } catch (Throwable th) {
                    declaredMethod.setAccessible(false);
                    throw th;
                }
            } catch (Exception e3) {
                Log.e("AndroidKeyStore", "No getEngine() method on OpenSSLKey member:" + e3, new Object[0]);
                return null;
            }
        } catch (Exception e4) {
            Log.e("AndroidKeyStore", "Cannot find system OpenSSLEngine class: " + e4, new Object[0]);
            return null;
        }
    }

    private static Object getOpenSSLKeyForPrivateKey(PrivateKey privateKey) {
        Method declaredMethod;
        if (privateKey == null) {
            Log.e("AndroidKeyStore", "privateKey == null", new Object[0]);
            return null;
        } else if (!(privateKey instanceof RSAPrivateKey)) {
            Log.e("AndroidKeyStore", "does not implement RSAPrivateKey", new Object[0]);
            return null;
        } else {
            try {
                Class<?> cls = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLRSAPrivateKey");
                if (!cls.isInstance(privateKey)) {
                    Log.e("AndroidKeyStore", "Private key is not an OpenSSLRSAPrivateKey instance, its class name is:" + privateKey.getClass().getCanonicalName(), new Object[0]);
                    return null;
                }
                try {
                    declaredMethod = cls.getDeclaredMethod("getOpenSSLKey", new Class[0]);
                    declaredMethod.setAccessible(true);
                    Object invoke = declaredMethod.invoke(privateKey, new Object[0]);
                    declaredMethod.setAccessible(false);
                    if (invoke != null) {
                        return invoke;
                    }
                    Log.e("AndroidKeyStore", "getOpenSSLKey() returned null", new Object[0]);
                    return null;
                } catch (Exception e2) {
                    Log.e("AndroidKeyStore", "Exception while trying to retrieve system EVP_PKEY handle: " + e2, new Object[0]);
                    return null;
                } catch (Throwable th) {
                    declaredMethod.setAccessible(false);
                    throw th;
                }
            } catch (Exception e3) {
                Log.e("AndroidKeyStore", "Cannot find system OpenSSLRSAPrivateKey class: " + e3, new Object[0]);
                return null;
            }
        }
    }

    @CalledByNative
    private static byte[] rawSignDigestWithPrivateKey(PrivateKey privateKey, byte[] bArr) {
        Signature signature;
        try {
            String algorithm = privateKey.getAlgorithm();
            if ("RSA".equalsIgnoreCase(algorithm)) {
                signature = Signature.getInstance("NONEwithRSA");
            } else {
                if ("EC".equalsIgnoreCase(algorithm)) {
                    signature = Signature.getInstance("NONEwithECDSA");
                }
                signature = null;
            }
        } catch (NoSuchAlgorithmException unused) {
        }
        if (signature == null) {
            Log.e("AndroidKeyStore", "Unsupported private key algorithm: " + privateKey.getAlgorithm(), new Object[0]);
            return null;
        }
        try {
            signature.initSign(privateKey);
            signature.update(bArr);
            return signature.sign();
        } catch (Exception e2) {
            Log.e("AndroidKeyStore", "Exception while signing message with " + privateKey.getAlgorithm() + " private key: " + e2, new Object[0]);
            return null;
        }
    }
}
