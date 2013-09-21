package com.konakartadmin.app;

import com.konakartadmin.appif.*;
import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - UpdateBooking - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class UpdateBooking
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public UpdateBooking(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public void updateBooking(String sessionId, AdminBooking booking, AdminBookableProductOptions options) throws KKAdminException
     {
         kkAdminEng.updateBooking(sessionId, booking, options);
     }
}
