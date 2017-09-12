package org.newretail.center.test.Impl;

import org.newretail.center.test.api.IAccountQueryService;

public class AccountQueryServiceImpl implements IAccountQueryService {

	public String findAccountNameById(Long id) {
		return "admin";
	}
}
