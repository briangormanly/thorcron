package com.konakartadmin.app;

import com.konakartadmin.appif.*;
import com.konakart.app.*;
import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - CallPaymentModule - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class CallPaymentModule
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public CallPaymentModule(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public NameValue[] callPaymentModule(String sessionId, String moduleClassName, PaymentOptions options) throws KKAdminException
     {
         return kkAdminEng.callPaymentModule(sessionId, moduleClassName, options);
     }
}