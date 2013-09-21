package com.konakartadmin.app;

import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - SetProductQuantity - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class SetProductQuantity
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public SetProductQuantity(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public void setProductQuantity(String sessionId, String sku, int id, int quantity, int operation) throws KKAdminException
     {
         kkAdminEng.setProductQuantity(sessionId, sku, id, quantity, operation);
     }
}