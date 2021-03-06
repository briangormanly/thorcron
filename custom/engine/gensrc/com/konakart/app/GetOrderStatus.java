package com.konakart.app;

/**
 *  The KonaKart Custom Engine - GetOrderStatus - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class GetOrderStatus
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public GetOrderStatus(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public int getOrderStatus(String sessionId, int orderId) throws KKException
     {
         return kkEng.getOrderStatus(sessionId, orderId);
     }
}
