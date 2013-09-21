package com.konakartadmin.app;

import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - RemoveAddressFromProduct - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class RemoveAddressFromProduct
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public RemoveAddressFromProduct(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public void removeAddressFromProduct(String sessionId, int addressId, int productId) throws KKAdminException
     {
         kkAdminEng.removeAddressFromProduct(sessionId, addressId, productId);
     }
}