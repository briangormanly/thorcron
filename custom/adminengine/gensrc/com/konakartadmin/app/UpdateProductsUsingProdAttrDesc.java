package com.konakartadmin.app;

import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - UpdateProductsUsingProdAttrDesc - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class UpdateProductsUsingProdAttrDesc
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public UpdateProductsUsingProdAttrDesc(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public int updateProductsUsingProdAttrDesc(String sessionId, int attrDescId) throws KKAdminException
     {
         return kkAdminEng.updateProductsUsingProdAttrDesc(sessionId, attrDescId);
     }
}
