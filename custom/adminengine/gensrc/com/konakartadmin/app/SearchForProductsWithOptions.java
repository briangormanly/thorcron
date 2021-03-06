package com.konakartadmin.app;

import com.konakartadmin.appif.*;
import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - SearchForProductsWithOptions - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class SearchForProductsWithOptions
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public SearchForProductsWithOptions(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public AdminProducts searchForProductsWithOptions(String sessionId, AdminDataDescriptor dataDesc, AdminProductSearch prodSearch, int languageId, AdminProductMgrOptions mgrOptions) throws KKAdminException
     {
         return kkAdminEng.searchForProductsWithOptions(sessionId, dataDesc, prodSearch, languageId, mgrOptions);
     }
}
