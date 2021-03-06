package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Shipping;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.delivery.send response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class DeliverySendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6872426962784238558L;

	/** 
	 * 只返回is_success
	 */
	@ApiField("shipping")
	private Shipping shipping;


	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}
	public Shipping getShipping( ) {
		return this.shipping;
	}
	


}
