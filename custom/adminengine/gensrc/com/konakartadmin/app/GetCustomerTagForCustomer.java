package com.konakartadmin.app;

import com.konakartadmin.appif.*;
import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - GetCustomerTagForCustomer - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class GetCustomerTagForCustomer
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public GetCustomerTagForCustomer(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public AdminCustomerTag getCustomerTagForCustomer(String sessionId, int customerId, String tagName) throws KKAdminException
     {
         return kkAdminEng.getCustomerTagForCustomer(sessionId, customerId, tagName);
     }
}
