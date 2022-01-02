package controller;

import java.util.Random;

import entity.order.Order;

public class ShippingFeeNoWeightCalculator implements ShippingFeeCalculator{

	/**
	 * Charge shipping regardless of weight
	 * @author DUCHQ
	 * 
	 * 
	 */
	@Override
	public int calculateShippingFee(Order order, int height, int length, int width) {
		Random rand = new Random();
        int fees = (int)( ( (rand.nextFloat()*10)/100 ) * order.getAmount() );
        return fees;
	}

}
