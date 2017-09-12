package org.newretail.center.test.Impl;

import org.newretail.center.test.api.IAccountQueryService;

public class AccountQueryServiceImpl implements IAccountQueryService {

	public String findAccountNameById(Long id) {
		System.out.println("打印");
		return "admin";
	}
}
