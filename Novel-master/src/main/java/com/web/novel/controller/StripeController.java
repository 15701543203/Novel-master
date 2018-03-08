package com.web.novel.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.model.Charge;

@Controller
@RequestMapping("/stripe")
@ResponseBody
public class StripeController {

	@RequestMapping(value="stripeCard.do",method=RequestMethod.POST)
	public void stripe(ServletRequest request){
		
		System.err.println("123");
		// 设置你的秘密密钥:记住要把它更改为你的秘密密钥
		// 看到你的钥匙:https://dashboard.stripe.com/account/apikeysn
		Stripe.apiKey = "sk_test_sYRhrDU2kXHqCvoETiFu0LUZ";

		
		// 令牌是使用Checkout或元素创建的！
		// 获取表单提交的支付令牌ID:
		String token = request.getParameter("stripeToken");
		System.out.println(token);
		// 负责用户的名片:
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("amount", 999);
		params.put("currency", "usd");
		params.put("description", "Example charge");
		params.put("source", token);

		try {
			Charge charge = Charge.create(params);
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidRequestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (APIConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CardException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (APIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
