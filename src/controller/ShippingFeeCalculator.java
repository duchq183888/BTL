package controller;

import entity.order.Order;
/**
 * 
 * @author DUCHQ
 *
 */
public interface ShippingFeeCalculator {
	public int calculateShippingFee(Order order, int height, int length, int width) ;
}
